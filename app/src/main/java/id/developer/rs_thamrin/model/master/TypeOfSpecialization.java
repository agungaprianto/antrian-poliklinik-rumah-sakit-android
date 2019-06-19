package id.developer.rs_thamrin.model.master;

import android.os.Parcel;
import android.os.Parcelable;

public class TypeOfSpecialization implements Parcelable {
    private String code;
    private String name;

    public TypeOfSpecialization() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Creator<TypeOfSpecialization> getCREATOR() {
        return CREATOR;
    }

    protected TypeOfSpecialization(Parcel in) {
        code = in.readString();
        name = in.readString();
    }

    public static final Creator<TypeOfSpecialization> CREATOR = new Creator<TypeOfSpecialization>() {
        @Override
        public TypeOfSpecialization createFromParcel(Parcel in) {
            return new TypeOfSpecialization(in);
        }

        @Override
        public TypeOfSpecialization[] newArray(int size) {
            return new TypeOfSpecialization[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(code);
        dest.writeString(name);
    }
}
