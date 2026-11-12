package com.xiaomi.hm.health.bt.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.t5t;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMReminderInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<HMReminderInfo> CREATOR = new a();
    public static final short FLAG_DAY = 4064;
    public static final short FLAG_DELETE = 0;
    public static final short FLAG_ENABLE = 1;
    public static final short FLAG_FRIDAY = 512;
    public static final short FLAG_ICON = 16;
    public static final short FLAG_LOOP = 16352;
    public static final short FLAG_MONDAY = 32;
    public static final short FLAG_MONTH = 4096;
    public static final short FLAG_REPEAT = 2;
    public static final short FLAG_SATURDAY = 1024;
    public static final short FLAG_STOP_TIME = 4;
    public static final short FLAG_STRING = 8;
    public static final short FLAG_SUNDAY = 2048;
    public static final short FLAG_THURSDAY = 256;
    public static final short FLAG_TUESDAY = 64;
    public static final short FLAG_WEDNESDAY = 128;
    public static final short FLAG_YEAR = 8192;
    private static final byte STR_END = 0;
    private static final String TAG = "HMReminderInfo";
    public static final int VERSION_FLAG_NEW = 1;
    public static final int VERSION_NORMAL = 0;
    public static final int VIB_TYPE_ALARM = 1;
    public static final int VIB_TYPE_REMINDER = 0;
    private static final long serialVersionUID = 1;
    private boolean delete;
    private boolean enable;
    private int flag;
    private int from;
    private int iconId;
    private int id;
    private String remindBody;
    private String remindTitle;
    private boolean repeat;
    private Calendar startTime;
    private Calendar stopTime;

    public class a implements Parcelable.Creator<HMReminderInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMReminderInfo createFromParcel(Parcel parcel) {
            return new HMReminderInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMReminderInfo[] newArray(int i) {
            return new HMReminderInfo[i];
        }
    }

    public HMReminderInfo() {
        this.from = 0;
        this.id = 0;
        this.repeat = false;
        this.delete = false;
        this.startTime = null;
        this.stopTime = null;
        this.iconId = -1;
        this.remindTitle = null;
        this.remindBody = null;
        this.enable = true;
        this.flag = 1;
    }

    public static ArrayList<HMReminderInfo> fromBytes(byte[] bArr) {
        int i;
        int i2;
        if (bArr == null || bArr.length == 0) {
            return new ArrayList<>();
        }
        if (bArr.length < 11) {
            return null;
        }
        ArrayList<HMReminderInfo> arrayList = new ArrayList<>();
        int i3 = 0;
        while (i3 < bArr.length) {
            HMReminderInfo hMReminderInfo = new HMReminderInfo();
            hMReminderInfo.setId(bArr[i3] & 63);
            hMReminderInfo.setFrom((bArr[i3] >> 6) & 3);
            int i4 = (bArr[i3 + 1] & 255) | ((bArr[i3 + 2] & 255) << 8) | ((bArr[i3 + 3] & 255) << 16) | ((bArr[i3 + 4] & 255) << 24);
            hMReminderInfo.setFlag((short) i4);
            int i5 = (bArr[i3 + 5] & 255) | ((bArr[i3 + 6] & 255) << 8);
            int i6 = bArr[i3 + 7] & 255;
            int i7 = bArr[i3 + 8] & 255;
            int i8 = bArr[i3 + 9] & 255;
            int i9 = i3 + 11;
            int i10 = bArr[i3 + 10] & 255;
            Calendar calendar = Calendar.getInstance();
            calendar.set(i5, i6 - 1, i7, i8, i10);
            hMReminderInfo.setStartTime(calendar);
            if ((i4 & 4) != 0) {
                int i11 = (bArr[i9] & 255) | ((bArr[i3 + 12] & 255) << 8);
                int i12 = bArr[i3 + 13] & 255;
                int i13 = bArr[i3 + 14] & 255;
                int i14 = bArr[i3 + 15] & 255;
                i9 = i3 + 17;
                int i15 = bArr[i3 + 16] & 255;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(i11, i12, i13, i14, i15);
                hMReminderInfo.setStopTime(calendar2);
            }
            if ((i4 & 16) != 0) {
                hMReminderInfo.setIconId(bArr[i9] & 255);
                i9++;
            }
            if ((i4 & 8) != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    i = i9 + 1;
                    byte b2 = bArr[i9];
                    if (b2 == 0) {
                        break;
                    }
                    byteArrayOutputStream.write(b2);
                    i9 = i;
                }
                String str = new String(byteArrayOutputStream.toByteArray());
                t5t.d(TAG, "title: " + str);
                hMReminderInfo.remindTitle = str;
                byteArrayOutputStream.reset();
                while (true) {
                    i2 = i + 1;
                    byte b3 = bArr[i];
                    if (b3 == 0) {
                        break;
                    }
                    byteArrayOutputStream.write(b3);
                    i = i2;
                }
                String str2 = new String(byteArrayOutputStream.toByteArray());
                t5t.d(TAG, "body: " + str2);
                hMReminderInfo.remindBody = str2;
                i3 = i2;
            } else {
                i3 = i9 + 2;
            }
            arrayList.add(hMReminderInfo);
        }
        return arrayList;
    }

    public void addFlag(short s) {
        this.flag = s | this.flag;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBytes() {
        return toBleBytes(1);
    }

    public int getFlag() {
        return this.flag;
    }

    public int getFrom() {
        return this.from;
    }

    public int getIconId() {
        return this.iconId;
    }

    public int getId() {
        return this.id;
    }

    public String getRemindBody() {
        return this.remindBody;
    }

    public String getRemindTitle() {
        return this.remindTitle;
    }

    public Calendar getStartTime() {
        return this.startTime;
    }

    public Calendar getStopTime() {
        return this.stopTime;
    }

    public boolean isDelete() {
        return this.delete;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isRepeat() {
        return this.repeat;
    }

    public void removeFlag(short s) {
        this.flag = (~s) & this.flag;
    }

    public void setDelete(boolean z) {
        this.delete = z;
        if (z) {
            this.flag = 0;
        }
    }

    public void setEnable(boolean z) {
        this.enable = z;
        if (z) {
            this.flag |= 1;
        } else {
            this.flag &= -2;
        }
    }

    public void setFlag(short s) {
        this.flag = s;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public void setIconId(int i) {
        this.iconId = i;
        if (i >= 0) {
            this.flag |= 16;
        } else {
            this.flag &= -17;
        }
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setRemindBody(String str) {
        this.remindBody = str;
    }

    public void setRemindStr(String str, String str2) {
        this.remindTitle = str;
        this.remindBody = str2;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.remindBody)) {
            this.flag &= -9;
        } else {
            this.flag |= 8;
        }
    }

    public void setRemindTitle(String str) {
        this.remindTitle = str;
    }

    public void setRepeat(boolean z) {
        this.repeat = z;
        if (z) {
            this.flag |= 2;
        } else {
            this.flag &= -3;
        }
    }

    public void setStartTime(Calendar calendar) {
        this.startTime = calendar;
    }

    public void setStopTime(Calendar calendar) {
        this.stopTime = calendar;
        if (calendar != null) {
            this.flag |= 4;
        } else {
            this.flag &= -5;
        }
    }

    public void setVibrateType(int i) {
        int i2 = this.flag & 32767;
        this.flag = i2;
        if (i == 1) {
            this.flag = 32768 | i2;
        }
    }

    public byte[] toBleBytes(int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((this.from << 6) | this.id);
            if (this.delete) {
                this.flag = 0;
            }
            if (i == 1) {
                byteArrayOutputStream.write(tet.p(this.flag));
            } else {
                byteArrayOutputStream.write(tet.s((short) this.flag));
            }
            if (this.delete) {
                return byteArrayOutputStream.toByteArray();
            }
            Calendar calendar = this.startTime;
            if (calendar != null) {
                byteArrayOutputStream.write(tet.s((short) calendar.get(1)));
                byteArrayOutputStream.write(this.startTime.get(2) + 1);
                byteArrayOutputStream.write(this.startTime.get(5));
                byteArrayOutputStream.write(this.startTime.get(11));
                byteArrayOutputStream.write(this.startTime.get(12));
            }
            Calendar calendar2 = this.stopTime;
            if (calendar2 != null) {
                byteArrayOutputStream.write(tet.s((short) calendar2.get(1)));
                byteArrayOutputStream.write(this.stopTime.get(2) + 1);
                byteArrayOutputStream.write(this.stopTime.get(5));
                byteArrayOutputStream.write(this.stopTime.get(11));
                byteArrayOutputStream.write(this.stopTime.get(12));
            }
            int i2 = this.iconId;
            if (i2 >= 0) {
                byteArrayOutputStream.write(i2);
            }
            if (!TextUtils.isEmpty(this.remindTitle)) {
                byteArrayOutputStream.write(this.remindTitle.getBytes());
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(this.remindBody)) {
                byteArrayOutputStream.write(this.remindBody.getBytes());
            }
            byteArrayOutputStream.write(0);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t5t.d(TAG, "toBleBytes exception:" + e.getMessage());
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMReminderInfo{id=");
        sb.append(this.id);
        sb.append(", flag=");
        sb.append(this.flag);
        sb.append(", enable=");
        sb.append(this.enable);
        sb.append(", repeat=");
        sb.append(this.repeat);
        sb.append(", delete=");
        sb.append(this.delete);
        sb.append(", startTime=");
        Calendar calendar = this.startTime;
        Object time = AbstractJsonLexerKt.NULL;
        sb.append(calendar != null ? calendar.getTime() : AbstractJsonLexerKt.NULL);
        sb.append(", stopTime=");
        Calendar calendar2 = this.stopTime;
        if (calendar2 != null) {
            time = calendar2.getTime();
        }
        sb.append(time);
        sb.append(", iconId=");
        sb.append(this.iconId);
        sb.append(", remindTitle='");
        sb.append(this.remindTitle);
        sb.append('\'');
        sb.append(", remindBody='");
        sb.append(this.remindBody);
        sb.append('\'');
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.from);
        parcel.writeInt(this.id);
        parcel.writeInt(this.flag);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.repeat ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.delete ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.iconId);
        parcel.writeString(this.remindTitle);
        parcel.writeString(this.remindBody);
        Calendar calendar = this.startTime;
        parcel.writeLong(calendar != null ? calendar.getTime().getTime() : -1L);
        Calendar calendar2 = this.stopTime;
        parcel.writeLong(calendar2 != null ? calendar2.getTime().getTime() : -1L);
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public HMReminderInfo(Parcel parcel) {
        this.from = 0;
        this.id = 0;
        this.flag = 1;
        this.enable = true;
        this.repeat = false;
        this.delete = false;
        this.startTime = null;
        this.stopTime = null;
        this.iconId = -1;
        this.remindTitle = null;
        this.remindBody = null;
        this.from = parcel.readInt();
        this.id = parcel.readInt();
        this.flag = parcel.readInt();
        this.enable = parcel.readByte() != 0;
        this.repeat = parcel.readByte() != 0;
        this.delete = parcel.readByte() != 0;
        this.iconId = parcel.readInt();
        this.remindTitle = parcel.readString();
        this.remindBody = parcel.readString();
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        if (j != -1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j));
            this.startTime = calendar;
        }
        if (j2 != -1) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date(j2));
            this.stopTime = calendar2;
        }
    }
}
