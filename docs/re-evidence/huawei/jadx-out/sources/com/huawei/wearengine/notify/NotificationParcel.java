package com.huawei.wearengine.notify;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.yka;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class NotificationParcel implements Parcelable {
    public static final Parcelable.Creator<NotificationParcel> CREATOR = new Parcelable.Creator<NotificationParcel>() { // from class: com.huawei.wearengine.notify.NotificationParcel.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NotificationParcel createFromParcel(Parcel parcel) {
            return new NotificationParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NotificationParcel[] newArray(int i) {
            if (i > 65535 || i < 0) {
                return new NotificationParcel[0];
            }
            return new NotificationParcel[i];
        }
    };
    private HashMap<Integer, String> mButtonContents;
    private String mExtendJson;
    private String mPackageName;
    private int mRingtoneId;
    private int mTemplateId;
    private String mText;
    private String mTitle;
    private int mVibration;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NotificationParcel(yka ykaVar) {
        this.mRingtoneId = -1;
        this.mExtendJson = "";
        if (ykaVar == null) {
            return;
        }
        this.mTemplateId = ykaVar.e();
        this.mPackageName = ykaVar.b();
        this.mTitle = ykaVar.f();
        this.mText = ykaVar.d();
        this.mButtonContents = ykaVar.a();
    }

    protected NotificationParcel(Parcel parcel) {
        this.mRingtoneId = -1;
        this.mExtendJson = "";
        if (parcel == null) {
            return;
        }
        this.mTemplateId = parcel.readInt();
        this.mPackageName = parcel.readString();
        this.mTitle = parcel.readString();
        this.mText = parcel.readString();
        this.mButtonContents = parcel.readHashMap(HashMap.class.getClassLoader());
        this.mVibration = parcel.readInt();
        this.mRingtoneId = parcel.readInt();
        this.mExtendJson = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.mTemplateId);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mText);
        parcel.writeMap(this.mButtonContents);
        parcel.writeInt(this.mVibration);
        parcel.writeInt(this.mRingtoneId);
        parcel.writeString(this.mExtendJson);
    }

    public void readFromParcel(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        this.mTemplateId = parcel.readInt();
        this.mPackageName = parcel.readString();
        this.mTitle = parcel.readString();
        this.mText = parcel.readString();
        this.mButtonContents = parcel.readHashMap(HashMap.class.getClassLoader());
        this.mVibration = parcel.readInt();
        this.mRingtoneId = parcel.readInt();
        this.mExtendJson = parcel.readString();
    }

    public int getTemplateId() {
        return this.mTemplateId;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getText() {
        return this.mText;
    }

    public HashMap<Integer, String> getButtonContents() {
        return this.mButtonContents;
    }

    public int getVibration() {
        return this.mVibration;
    }

    public int getRingtoneId() {
        return this.mRingtoneId;
    }
}
