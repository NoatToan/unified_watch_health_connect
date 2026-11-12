package com.xiaomi.hm.health.bt.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
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
    public static final int VERSION_FLAG_NEW = 1;
    public static final int VERSION_NORMAL = 0;
    public static final int VIB_TYPE_ALARM = 1;
    public static final int VIB_TYPE_REMINDER = 0;
    private static final byte l = 0;
    private static final String m = "HMReminderInfo";
    private static final long serialVersionUID = 1;
    private int a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private Calendar g;
    private Calendar h;
    private int i;
    private String j;
    private String k;

    public class a implements Parcelable.Creator<HMReminderInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMReminderInfo createFromParcel(Parcel in) {
            return new HMReminderInfo(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HMReminderInfo[] newArray(int size) {
            return new HMReminderInfo[size];
        }
    }

    public HMReminderInfo() {
        this.a = 0;
        this.b = 0;
        this.c = 1;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = -1;
        this.j = null;
        this.k = null;
        this.d = true;
        this.c = 1;
    }

    public static ArrayList<HMReminderInfo> fromBytes(byte[] value) {
        int i;
        int i2;
        if (value == null || value.length == 0) {
            return new ArrayList<>();
        }
        if (value.length < 11) {
            return null;
        }
        ArrayList<HMReminderInfo> arrayList = new ArrayList<>();
        int i3 = 0;
        while (i3 < value.length) {
            HMReminderInfo hMReminderInfo = new HMReminderInfo();
            hMReminderInfo.setId(value[i3] & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY);
            int i4 = i3 + 1;
            hMReminderInfo.setFrom((value[i3] >> 6) & 3);
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((value[i5] & 255) << 8) | (value[i4] & 255);
            int i8 = i6 + 1;
            int i9 = i7 | ((value[i6] & 255) << 16);
            int i10 = i8 + 1;
            int i11 = i9 | ((value[i8] & 255) << 24);
            hMReminderInfo.setFlag((short) i11);
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = (value[i10] & 255) | ((value[i12] & 255) << 8);
            int i15 = i13 + 1;
            int i16 = value[i13] & 255;
            int i17 = i15 + 1;
            int i18 = value[i15] & 255;
            int i19 = i17 + 1;
            int i20 = value[i17] & 255;
            int i21 = i19 + 1;
            int i22 = value[i19] & 255;
            Calendar calendar = Calendar.getInstance();
            calendar.set(i14, i16 - 1, i18, i20, i22);
            hMReminderInfo.setStartTime(calendar);
            if ((i11 & 4) != 0) {
                int i23 = i21 + 1;
                int i24 = value[i21] & 255;
                int i25 = i23 + 1;
                int i26 = i24 | ((value[i23] & 255) << 8);
                int i27 = i25 + 1;
                int i28 = value[i25] & 255;
                int i29 = i27 + 1;
                int i30 = value[i27] & 255;
                int i31 = i29 + 1;
                int i32 = value[i29] & 255;
                i21 = i31 + 1;
                int i33 = value[i31] & 255;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(i26, i28, i30, i32, i33);
                hMReminderInfo.setStopTime(calendar2);
            }
            if ((i11 & 16) != 0) {
                hMReminderInfo.setIconId(value[i21] & 255);
                i21++;
            }
            if ((i11 & 8) != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    i = i21 + 1;
                    byte b = value[i21];
                    if (b == 0) {
                        break;
                    }
                    byteArrayOutputStream.write(b);
                    i21 = i;
                }
                String str = new String(byteArrayOutputStream.toByteArray());
                Debug.fi(m, "title: " + str);
                hMReminderInfo.j = str;
                byteArrayOutputStream.reset();
                while (true) {
                    i2 = i + 1;
                    byte b2 = value[i];
                    if (b2 == 0) {
                        break;
                    }
                    byteArrayOutputStream.write(b2);
                    i = i2;
                }
                String str2 = new String(byteArrayOutputStream.toByteArray());
                Debug.fi(m, "body: " + str2);
                hMReminderInfo.k = str2;
                i3 = i2;
            } else {
                i3 = i21 + 1 + 1;
            }
            arrayList.add(hMReminderInfo);
        }
        return arrayList;
    }

    public void addFlag(short flag) {
        this.c = flag | this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBytes() {
        return toBleBytes(1);
    }

    public int getFlag() {
        return this.c;
    }

    public int getFrom() {
        return this.a;
    }

    public int getIconId() {
        return this.i;
    }

    public int getId() {
        return this.b;
    }

    public String getRemindBody() {
        return this.k;
    }

    public String getRemindTitle() {
        return this.j;
    }

    public Calendar getStartTime() {
        return this.g;
    }

    public Calendar getStopTime() {
        return this.h;
    }

    public boolean isDelete() {
        return this.f;
    }

    public boolean isEnable() {
        return this.d;
    }

    public boolean isRepeat() {
        return this.e;
    }

    public void removeFlag(short flag) {
        this.c = (~flag) & this.c;
    }

    public void setDelete(boolean delete) {
        this.f = delete;
        if (delete) {
            this.c = 0;
        }
    }

    public void setEnable(boolean enable) {
        this.d = enable;
        if (enable) {
            this.c |= 1;
        } else {
            this.c &= -2;
        }
    }

    public void setFlag(short flag) {
        this.c = flag;
    }

    public void setFrom(int from) {
        this.a = from;
    }

    public void setIconId(int iconId) {
        this.i = iconId;
        if (iconId >= 0) {
            this.c |= 16;
        } else {
            this.c &= -17;
        }
    }

    public void setId(int id) {
        this.b = id;
    }

    public void setRemindBody(String remindBody) {
        this.k = remindBody;
    }

    public void setRemindStr(String title, String body) {
        this.j = title;
        this.k = body;
        if (TextUtils.isEmpty(title) && TextUtils.isEmpty(this.k)) {
            this.c &= -9;
        } else {
            this.c |= 8;
        }
    }

    public void setRemindTitle(String remindTitle) {
        this.j = remindTitle;
    }

    public void setRepeat(boolean repeat) {
        this.e = repeat;
        if (repeat) {
            this.c |= 2;
        } else {
            this.c &= -3;
        }
    }

    public void setStartTime(Calendar startTime) {
        this.g = startTime;
    }

    public void setStopTime(Calendar stopTime) {
        this.h = stopTime;
        if (stopTime != null) {
            this.c |= 4;
        } else {
            this.c &= -5;
        }
    }

    public void setVibrateType(int type) {
        int i = this.c & 32767;
        this.c = i;
        if (type == 1) {
            this.c = 32768 | i;
        }
    }

    public byte[] toBleBytes(int v) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((this.a << 6) | this.b);
            if (this.f) {
                this.c = 0;
            }
            if (v == 1) {
                byteArrayOutputStream.write(GattUtils.intToBytes(this.c));
            } else {
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.c));
            }
            if (this.f) {
                return byteArrayOutputStream.toByteArray();
            }
            Calendar calendar = this.g;
            if (calendar != null) {
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) calendar.get(1)));
                byteArrayOutputStream.write(this.g.get(2) + 1);
                byteArrayOutputStream.write(this.g.get(5));
                byteArrayOutputStream.write(this.g.get(11));
                byteArrayOutputStream.write(this.g.get(12));
            }
            Calendar calendar2 = this.h;
            if (calendar2 != null) {
                byteArrayOutputStream.write(GattUtils.shortToBytes((short) calendar2.get(1)));
                byteArrayOutputStream.write(this.h.get(2) + 1);
                byteArrayOutputStream.write(this.h.get(5));
                byteArrayOutputStream.write(this.h.get(11));
                byteArrayOutputStream.write(this.h.get(12));
            }
            int i = this.i;
            if (i >= 0) {
                byteArrayOutputStream.write(i);
            }
            if (!TextUtils.isEmpty(this.j)) {
                byteArrayOutputStream.write(this.j.getBytes());
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(this.k)) {
                byteArrayOutputStream.write(this.k.getBytes());
            }
            byteArrayOutputStream.write(0);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Debug.fi(m, "toBleBytes exception:" + e.getMessage());
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMReminderInfo{id=");
        sb.append(this.b);
        sb.append(", flag=");
        sb.append(this.c);
        sb.append(", enable=");
        sb.append(this.d);
        sb.append(", repeat=");
        sb.append(this.e);
        sb.append(", delete=");
        sb.append(this.f);
        sb.append(", startTime=");
        Calendar calendar = this.g;
        sb.append(calendar != null ? calendar.getTime() : "null");
        sb.append(", stopTime=");
        Calendar calendar2 = this.h;
        sb.append(calendar2 != null ? calendar2.getTime() : "null");
        sb.append(", iconId=");
        sb.append(this.i);
        sb.append(", remindTitle='");
        sb.append(this.j);
        sb.append('\'');
        sb.append(", remindBody='");
        sb.append(this.k);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        Calendar calendar = this.g;
        parcel.writeLong(calendar != null ? calendar.getTime().getTime() : -1L);
        Calendar calendar2 = this.h;
        parcel.writeLong(calendar2 != null ? calendar2.getTime().getTime() : -1L);
    }

    public void setFlag(int flag) {
        this.c = flag;
    }

    public HMReminderInfo(Parcel in) {
        this.a = 0;
        this.b = 0;
        this.c = 1;
        this.d = true;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = -1;
        this.j = null;
        this.k = null;
        this.a = in.readInt();
        this.b = in.readInt();
        this.c = in.readInt();
        this.d = in.readByte() != 0;
        this.e = in.readByte() != 0;
        this.f = in.readByte() != 0;
        this.i = in.readInt();
        this.j = in.readString();
        this.k = in.readString();
        long j = in.readLong();
        long j2 = in.readLong();
        if (j != -1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j));
            this.g = calendar;
        }
        if (j2 != -1) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date(j2));
            this.h = calendar2;
        }
    }
}
