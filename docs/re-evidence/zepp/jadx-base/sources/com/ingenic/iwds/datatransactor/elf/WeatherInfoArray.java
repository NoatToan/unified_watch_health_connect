package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class WeatherInfoArray implements Parcelable {
    public static final Parcelable.Creator<WeatherInfoArray> CREATOR = new Parcelable.Creator<WeatherInfoArray>() { // from class: com.ingenic.iwds.datatransactor.elf.WeatherInfoArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherInfoArray createFromParcel(Parcel parcel) {
            return new WeatherInfoArray((WeatherInfo[]) parcel.createTypedArray(WeatherInfo.CREATOR));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherInfoArray[] newArray(int i) {
            return new WeatherInfoArray[i];
        }
    };
    public WeatherInfo[] data;

    public static class WeatherInfo implements Parcelable {
        public static final Parcelable.Creator<WeatherInfo> CREATOR = new Parcelable.Creator<WeatherInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.WeatherInfoArray.WeatherInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WeatherInfo createFromParcel(Parcel parcel) {
                WeatherInfo weatherInfo = new WeatherInfo();
                weatherInfo.city = parcel.readString();
                weatherInfo.weather = parcel.readString();
                weatherInfo.weatherCode = parcel.readString();
                weatherInfo.date = parcel.readString();
                weatherInfo.dayOfWeek = parcel.readString();
                weatherInfo.updateTime = parcel.readString();
                weatherInfo.tempUnit = parcel.readString();
                weatherInfo.currentTemp = parcel.readInt();
                weatherInfo.minimumTemp = parcel.readInt();
                weatherInfo.maximumTemp = parcel.readInt();
                weatherInfo.dayIndex = parcel.readInt();
                return weatherInfo;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WeatherInfo[] newArray(int i) {
                return new WeatherInfo[i];
            }
        };
        public String city;
        public String date;
        public String dayOfWeek;
        public String tempUnit;
        public String updateTime;
        public String weather;
        public String weatherCode;
        public int currentTemp = -1;
        public int minimumTemp = -1;
        public int maximumTemp = -1;
        public int dayIndex = -1;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "WeatherInfo [city=" + this.city + ", weather=" + this.weather + ", weatherCode=" + this.weatherCode + ", date=" + this.date + ", dayOfWeek=" + this.dayOfWeek + ", updateTime=" + this.updateTime + ", tempUnit=" + this.tempUnit + ", currentTemp=" + this.currentTemp + ", minimumTemp=" + this.minimumTemp + ", maximumTemp=" + this.maximumTemp + ", dayIndex=" + this.dayIndex + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.city);
            parcel.writeString(this.weather);
            parcel.writeString(this.weatherCode);
            parcel.writeString(this.date);
            parcel.writeString(this.dayOfWeek);
            parcel.writeString(this.updateTime);
            parcel.writeString(this.tempUnit);
            parcel.writeInt(this.currentTemp);
            parcel.writeInt(this.minimumTemp);
            parcel.writeInt(this.maximumTemp);
            parcel.writeInt(this.dayIndex);
        }
    }

    public WeatherInfoArray(WeatherInfo[] weatherInfoArr) {
        IwdsAssert.dieIf(this, weatherInfoArr == null || weatherInfoArr.length <= 0, "Weather array is null or length <= 0.");
        this.data = weatherInfoArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        int length = this.data.length;
        String str = "WeatherInfoArray []:\n";
        for (int i = 0; i < length; i++) {
            str = str + "data[" + i + "]:" + this.data[i].toString() + "\n";
        }
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.data, i);
    }
}
