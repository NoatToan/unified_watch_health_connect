package com.xiaomi.hm.health.opensdk.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class HMReminder implements Parcelable {
    public static final Parcelable.Creator<HMReminder> CREATOR = new a();
    public static final int OP_CLOSE = 0;
    public static final int OP_DELETE = 2;
    public static final int OP_OPEN = 1;
    public static final int VIB_TYPE_ALARM = 1;
    public static final int VIB_TYPE_REMINDER = 0;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;

    public class a implements Parcelable.Creator<HMReminder> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMReminder createFromParcel(Parcel source) {
            return new HMReminder(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HMReminder[] newArray(int size) {
            return new HMReminder[size];
        }
    }

    public HMReminder() {
        this.a = -1;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBody() {
        return this.g;
    }

    public int getId() {
        return this.a;
    }

    public String getLoop() {
        return this.c;
    }

    public int getOp() {
        return this.b;
    }

    public String getStartDate() {
        return this.d;
    }

    public String getStopDate() {
        return this.e;
    }

    public String getTitle() {
        return this.f;
    }

    public int getVibrateType() {
        return this.h;
    }

    public void setBody(String body) {
        this.g = body;
    }

    public void setId(int id) {
        this.a = id;
    }

    public void setLoop(String loop) {
        this.c = loop;
    }

    public void setOp(int op) {
        this.b = op;
    }

    public void setStartDate(String startDate) {
        this.d = startDate;
    }

    public void setStopDate(String stopDate) {
        this.e = stopDate;
    }

    public void setTitle(String title) {
        this.f = title;
    }

    public void setVibrateType(int vibrateType) {
        this.h = vibrateType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.a);
        dest.writeInt(this.b);
        dest.writeString(this.c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeInt(this.h);
    }

    public HMReminder(Parcel in) {
        this.a = -1;
        this.b = 1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.a = in.readInt();
        this.b = in.readInt();
        this.c = in.readString();
        this.d = in.readString();
        this.e = in.readString();
        this.f = in.readString();
        this.g = in.readString();
        this.h = in.readInt();
    }
}
