package com.huami.watch.notification.data;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.notification.NotificationHandler;
import com.huami.watch.util.Config;

/* JADX INFO: loaded from: classes16.dex */
public class RemoteInputData implements Parcelable {
    public static final String TAG = "Noti-RemoteInput-Data";
    public NotificationData.ActionData a;
    private NotificationHandler.Handler b;
    public String[] choices;
    public String label;
    public String resultKey;
    public static final boolean DEBUG = Config.isDebug();
    public static final Parcelable.Creator<RemoteInputData> CREATOR = new a();

    public class a implements Parcelable.Creator<RemoteInputData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteInputData createFromParcel(Parcel parcel) {
            return new RemoteInputData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteInputData[] newArray(int i) {
            return new RemoteInputData[i];
        }
    }

    private RemoteInputData() {
    }

    @TargetApi(20)
    public static RemoteInputData from(NotificationData.ActionData actionData, RemoteInput remoteInput) {
        return from(actionData, remoteInput.getResultKey(), Utils.toString(remoteInput.getLabel()), Utils.toStringArray(remoteInput.getChoices()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NotificationHandler.Handler handler() {
        if (this.b == null) {
            NotificationData.ActionData actionData = this.a;
            NotificationData notificationData = actionData.a;
            this.b = NotificationHandler.prepareRemoteInputHandler(notificationData.key, actionData, actionData.b, this, actionData.c, notificationData.isLocal);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resultKey);
        parcel.writeString(this.label);
        parcel.writeStringArray(this.choices);
    }

    public RemoteInputData(Parcel parcel) {
        this.resultKey = parcel.readString();
        this.label = parcel.readString();
        this.choices = parcel.createStringArray();
    }

    public static RemoteInputData from(NotificationData.ActionData actionData, String str, String str2, String[] strArr) {
        RemoteInputData remoteInputData = new RemoteInputData();
        remoteInputData.a = actionData;
        remoteInputData.resultKey = str;
        remoteInputData.label = str2;
        remoteInputData.choices = strArr;
        return remoteInputData;
    }
}
