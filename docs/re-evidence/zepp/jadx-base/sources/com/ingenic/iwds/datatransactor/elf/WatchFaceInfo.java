package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class WatchFaceInfo implements Parcelable {
    public static final Parcelable.Creator<WatchFaceInfo> CREATOR = new Parcelable.Creator<WatchFaceInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceInfo createFromParcel(Parcel parcel) {
            WatchFaceInfo watchFaceInfo = new WatchFaceInfo();
            watchFaceInfo.name = parcel.readString();
            watchFaceInfo.background = (Background) parcel.readParcelable(Background.class.getClassLoader());
            watchFaceInfo.digitalWatchFace = (DigitalStyleWatchFace) parcel.readParcelable(DigitalStyleWatchFace.class.getClassLoader());
            watchFaceInfo.analogWatchFace = (AnalogStyleWatchFace) parcel.readParcelable(AnalogStyleWatchFace.class.getClassLoader());
            return watchFaceInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceInfo[] newArray(int i) {
            return new WatchFaceInfo[i];
        }
    };
    public AnalogStyleWatchFace analogWatchFace;
    public Background background;
    public DigitalStyleWatchFace digitalWatchFace;
    public String name;

    public static class AnalogStyleWatchFace implements Parcelable {
        public static final Parcelable.Creator<AnalogStyleWatchFace> CREATOR = new Parcelable.Creator<AnalogStyleWatchFace>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.AnalogStyleWatchFace.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AnalogStyleWatchFace createFromParcel(Parcel parcel) {
                AnalogStyleWatchFace analogStyleWatchFace = new AnalogStyleWatchFace();
                analogStyleWatchFace.updateInterval = parcel.readInt();
                analogStyleWatchFace.hourPointer = (Picture) parcel.readParcelable(Picture.class.getClassLoader());
                analogStyleWatchFace.minutePointer = (Picture) parcel.readParcelable(Picture.class.getClassLoader());
                analogStyleWatchFace.secondPointer = (Picture) parcel.readParcelable(Picture.class.getClassLoader());
                analogStyleWatchFace.month = (InnerWatchFace) parcel.readParcelable(InnerWatchFace.class.getClassLoader());
                analogStyleWatchFace.week = (InnerWatchFace) parcel.readParcelable(InnerWatchFace.class.getClassLoader());
                analogStyleWatchFace.ampm = (InnerWatchFace) parcel.readParcelable(InnerWatchFace.class.getClassLoader());
                analogStyleWatchFace.dateDisplayProfile = (TypefaceProfile) parcel.readParcelable(TypefaceProfile.class.getClassLoader());
                return analogStyleWatchFace;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AnalogStyleWatchFace[] newArray(int i) {
                return new AnalogStyleWatchFace[i];
            }
        };
        public InnerWatchFace ampm;
        public TypefaceProfile dateDisplayProfile;
        public Picture hourPointer;
        public Picture minutePointer;
        public InnerWatchFace month;
        public Picture secondPointer;
        public int updateInterval = 1000;
        public InnerWatchFace week;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "AnalogStyleWatchFace [updateInterval=" + this.updateInterval + ", hourPointer=" + this.hourPointer + ", minutePointer=" + this.minutePointer + ", secondPointer=" + this.secondPointer + ", month=" + this.month + ", week=" + this.week + ", ampm=" + this.ampm + ", dateDisplayProfile=" + this.dateDisplayProfile + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.updateInterval);
            parcel.writeParcelable(this.hourPointer, i);
            parcel.writeParcelable(this.minutePointer, i);
            parcel.writeParcelable(this.secondPointer, i);
            parcel.writeParcelable(this.month, i);
            parcel.writeParcelable(this.week, i);
            parcel.writeParcelable(this.ampm, i);
            parcel.writeParcelable(this.dateDisplayProfile, i);
        }
    }

    public static class Background implements Parcelable {
        public static final Parcelable.Creator<Background> CREATOR = new Parcelable.Creator<Background>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.Background.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Background createFromParcel(Parcel parcel) {
                Background background = new Background();
                background.color = parcel.readInt();
                background.picture = (Picture) parcel.readParcelable(Picture.class.getClassLoader());
                return background;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Background[] newArray(int i) {
                return new Background[i];
            }
        };
        public int color = -1;
        public Picture picture;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Background [color=" + this.color + ", picture=" + this.picture + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.color);
            parcel.writeParcelable(this.picture, i);
        }
    }

    public static class DigitalStyleWatchFace implements Parcelable {
        public static final Parcelable.Creator<DigitalStyleWatchFace> CREATOR = new Parcelable.Creator<DigitalStyleWatchFace>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.DigitalStyleWatchFace.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DigitalStyleWatchFace createFromParcel(Parcel parcel) {
                DigitalStyleWatchFace digitalStyleWatchFace = new DigitalStyleWatchFace();
                digitalStyleWatchFace.hourDisplayProfile = (TextDisplayProfile) parcel.readParcelable(TextDisplayProfile.class.getClassLoader());
                digitalStyleWatchFace.minuteDisplayProfile = (TextDisplayProfile) parcel.readParcelable(TextDisplayProfile.class.getClassLoader());
                digitalStyleWatchFace.separatorDisplayProfile = (TextDisplayProfile) parcel.readParcelable(TextDisplayProfile.class.getClassLoader());
                digitalStyleWatchFace.traditionalChineseCalenderDisplayProfile = (TextDisplayProfile) parcel.readParcelable(TextDisplayProfile.class.getClassLoader());
                digitalStyleWatchFace.dateDateDisplayProfile = (TextDisplayProfile) parcel.readParcelable(TextDisplayProfile.class.getClassLoader());
                return digitalStyleWatchFace;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public DigitalStyleWatchFace[] newArray(int i) {
                return new DigitalStyleWatchFace[i];
            }
        };
        public TextDisplayProfile dateDateDisplayProfile;
        public TextDisplayProfile hourDisplayProfile;
        public TextDisplayProfile minuteDisplayProfile;
        public TextDisplayProfile separatorDisplayProfile;
        public TextDisplayProfile traditionalChineseCalenderDisplayProfile;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "DigitalStyleWatchFace [hourDisplayProfile=" + this.hourDisplayProfile + ", minuteDisplayProfile=" + this.minuteDisplayProfile + ", separatorDisplayProfile=" + this.separatorDisplayProfile + ", traditionalChineseCalenderDisplayProfile=" + this.traditionalChineseCalenderDisplayProfile + ", dataDateDisplayProfile=" + this.dateDateDisplayProfile + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.hourDisplayProfile, i);
            parcel.writeParcelable(this.minuteDisplayProfile, i);
            parcel.writeParcelable(this.separatorDisplayProfile, i);
            parcel.writeParcelable(this.traditionalChineseCalenderDisplayProfile, i);
            parcel.writeParcelable(this.dateDateDisplayProfile, i);
        }
    }

    public static class InnerWatchFace implements Parcelable {
        public static final Parcelable.Creator<InnerWatchFace> CREATOR = new Parcelable.Creator<InnerWatchFace>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.InnerWatchFace.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InnerWatchFace createFromParcel(Parcel parcel) {
                InnerWatchFace innerWatchFace = new InnerWatchFace();
                innerWatchFace.background = (Background) parcel.readParcelable(Background.class.getClassLoader());
                innerWatchFace.pointer = (Picture) parcel.readParcelable(Picture.class.getClassLoader());
                innerWatchFace.posX = parcel.readInt();
                innerWatchFace.posY = parcel.readInt();
                innerWatchFace.fontDisplayProfile = (TypefaceProfile) parcel.readParcelable(TypefaceProfile.class.getClassLoader());
                return innerWatchFace;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public InnerWatchFace[] newArray(int i) {
                return new InnerWatchFace[i];
            }
        };
        public Background background;
        public TypefaceProfile fontDisplayProfile;
        public Picture pointer;
        public int posX;
        public int posY;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "InnerWatchFace [background=" + this.background + ", pointer=" + this.pointer + ", posX=" + this.posX + ", posY=" + this.posY + ", textDisplayProfile=" + this.fontDisplayProfile + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.background, i);
            parcel.writeParcelable(this.pointer, i);
            parcel.writeInt(this.posX);
            parcel.writeInt(this.posY);
            parcel.writeParcelable(this.fontDisplayProfile, i);
        }
    }

    public static class Picture implements Parcelable {
        public static final Parcelable.Creator<Picture> CREATOR = new Parcelable.Creator<Picture>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.Picture.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Picture createFromParcel(Parcel parcel) {
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new Picture(bArr, parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Picture[] newArray(int i) {
                return new Picture[i];
            }
        };
        private byte[] m_data;
        private int m_height;
        private int m_width;

        public Picture(byte[] bArr, int i, int i2) {
            IwdsAssert.dieIf(this, bArr == null || bArr.length == 0, "Data is null or empty.");
            IwdsAssert.dieIf(this, i <= 0 || i2 <= 0, "Width <= 0 or Heigth <= 0.");
            this.m_data = bArr;
            this.m_width = i;
            this.m_height = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public byte[] getData() {
            return this.m_data;
        }

        public int getHeight() {
            return this.m_height;
        }

        public int getWidth() {
            return this.m_width;
        }

        public String toString() {
            return "Picture [m_data=" + Arrays.toString(this.m_data) + ", m_width=" + this.m_width + ", m_height=" + this.m_height + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.m_data.length);
            parcel.writeByteArray(this.m_data);
            parcel.writeInt(this.m_width);
            parcel.writeInt(this.m_height);
        }
    }

    public static class TextDisplayProfile implements Parcelable {
        public static final Parcelable.Creator<TextDisplayProfile> CREATOR = new Parcelable.Creator<TextDisplayProfile>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.TextDisplayProfile.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TextDisplayProfile createFromParcel(Parcel parcel) {
                TextDisplayProfile textDisplayProfile = new TextDisplayProfile();
                textDisplayProfile.posX = parcel.readInt();
                textDisplayProfile.posY = parcel.readInt();
                textDisplayProfile.typefaceProfile = (TypefaceProfile) parcel.readParcelable(TypefaceProfile.class.getClassLoader());
                return textDisplayProfile;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TextDisplayProfile[] newArray(int i) {
                return new TextDisplayProfile[i];
            }
        };
        public int posX;
        public int posY;
        public TypefaceProfile typefaceProfile;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "TextDisplayProfile [posX=" + this.posX + ", posY=" + this.posY + ", typefaceProfile=" + this.typefaceProfile + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.posX);
            parcel.writeInt(this.posY);
            parcel.writeParcelable(this.typefaceProfile, i);
        }
    }

    public static class TypefaceProfile implements Parcelable {
        public static final Parcelable.Creator<TypefaceProfile> CREATOR = new Parcelable.Creator<TypefaceProfile>() { // from class: com.ingenic.iwds.datatransactor.elf.WatchFaceInfo.TypefaceProfile.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TypefaceProfile createFromParcel(Parcel parcel) {
                TypefaceProfile typefaceProfile = new TypefaceProfile();
                typefaceProfile.typefaceName = parcel.readString();
                typefaceProfile.color = parcel.readInt();
                typefaceProfile.size = parcel.readFloat();
                typefaceProfile.background = (Background) parcel.readParcelable(Background.class.getClassLoader());
                return typefaceProfile;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TypefaceProfile[] newArray(int i) {
                return new TypefaceProfile[i];
            }
        };
        public Background background;
        public int color;
        public float size;
        public String typefaceName;
        public int unit;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "TypefaceProfile [typefaceName=" + this.typefaceName + ", color=" + this.color + ", unit=" + this.unit + ", size=" + this.size + ", background=" + this.background + "]";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.typefaceName);
            parcel.writeInt(this.color);
            parcel.writeInt(this.unit);
            parcel.writeFloat(this.size);
            parcel.writeParcelable(this.background, i);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.background, i);
        parcel.writeParcelable(this.digitalWatchFace, i);
        parcel.writeParcelable(this.analogWatchFace, i);
    }
}
