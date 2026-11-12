package com.huami.watch.notification.data;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huami.watch.notification.NotificationHandler;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationData implements Parcelable {
    public static final String EXTRA_HUAMI_ACTION_ICON = "huami.action.icon";
    public static final String EXTRA_HUAMI_SMALL_ICON = "huami.icon";
    public static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
    public static final int STYLE_BIG_PICTURE = 3;
    public static final int STYLE_BIG_TEXT = 2;
    public static final int STYLE_INBOX = 1;
    public static final String TAG = "Noti-Data";
    private NotificationHandler.Handler a;
    public ActionData[] actions;
    private boolean b;
    public String contentInfo;
    public int flags;
    public String iOSPkg;
    public byte[] iOSUid;
    public boolean isIOS;
    public boolean isLocal;
    public boolean isSMS;
    public NotificationKeyData key;
    public Bitmap largeIcon;
    public Notification originalNotification;
    public int priority;
    public Bitmap smallIcon;
    public long smsDate;
    public String smsText;
    public StyleData style;
    public String text;
    public String title;
    public WearableExtrasData wearableExtras;
    public long when;
    public static final boolean DEBUG = Config.isDebug();
    public static final Parcelable.Creator<NotificationData> CREATOR = new a();

    public static class RemoteInputKitkat {
        public String[] choices;
        public String label;
        public String resultKey;
    }

    public static class StyleData implements Parcelable {
        public static final Parcelable.Creator<StyleData> CREATOR = new a();
        public String bigContentTitle;
        public Bitmap bigPicture;
        public String bigText;
        public int style;
        public String styleName;
        public String summaryText;
        public String[] textLines;

        public class a implements Parcelable.Creator<StyleData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public StyleData createFromParcel(Parcel parcel) {
                return new StyleData(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public StyleData[] newArray(int i) {
                return new StyleData[i];
            }
        }

        public /* synthetic */ StyleData(Parcel parcel, a aVar) {
            this(parcel);
        }

        public static StyleData from(String str, Bundle bundle) {
            StyleData styleData = new StyleData();
            boolean z = NotificationData.DEBUG;
            if (z) {
                Log.d(NotificationData.TAG, "Template : " + str, new Object[0]);
            }
            String[] strArrSplit = str.split("\\$");
            if (strArrSplit.length > 0) {
                styleData.styleName = strArrSplit[strArrSplit.length - 1];
                if (z) {
                    Log.d(NotificationData.TAG, "StyleName : " + styleData.styleName, new Object[0]);
                }
                if (Notification.InboxStyle.class.getName().equals(str)) {
                    styleData.style = 1;
                    styleData.textLines = Utils.toStringArray(bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
                } else if (Notification.BigTextStyle.class.getName().equals(str)) {
                    styleData.style = 2;
                    styleData.bigText = Utils.toString(bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT));
                } else if (Notification.BigPictureStyle.class.getName().equals(str)) {
                    styleData.style = 3;
                }
                styleData.bigContentTitle = Utils.toString(bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG));
                styleData.summaryText = Utils.toString(bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT));
            }
            return styleData;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.style);
            parcel.writeString(this.styleName);
            parcel.writeStringArray(this.textLines);
            parcel.writeString(this.bigContentTitle);
            parcel.writeString(this.bigText);
            parcel.writeString(this.summaryText);
            Utils.writeBmp(parcel, this.bigPicture);
        }

        private StyleData() {
        }

        private StyleData(Parcel parcel) {
            this.style = parcel.readInt();
            this.styleName = parcel.readString();
            this.textLines = parcel.createStringArray();
            this.bigContentTitle = parcel.readString();
            this.bigText = parcel.readString();
            this.summaryText = parcel.readString();
            this.bigPicture = Utils.readBmp(parcel);
            if (NotificationData.DEBUG) {
                Log.d(NotificationData.TAG, "Read Style : " + this.style, new Object[0]);
                Log.d(NotificationData.TAG, "Read StyleName : " + this.styleName, new Object[0]);
            }
        }
    }

    public static class WearableExtrasData implements Parcelable {
        public static final Parcelable.Creator<WearableExtrasData> CREATOR = new a();
        public static final String KEY_ACTIONS = "actions";
        public static final String KEY_PAGES = "pages";
        private static final String a = "Noti-Data.WExtras";
        private static final String b = "flags";
        private static final String c = "displayIntent";
        private static final String d = "background";
        private static final String e = "contentIcon";
        private static final String f = "contentIconGravity";
        private static final String g = "contentActionIndex";
        private static final String h = "customSizePreset";
        private static final String i = "customContentHeight";
        private static final String j = "gravity";
        private static final String k = "hintScreenTimeout";
        public ActionData[] actions;
        public Bitmap background;
        public NotificationData[] pages;

        public class a implements Parcelable.Creator<WearableExtrasData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public WearableExtrasData createFromParcel(Parcel parcel) {
                return new WearableExtrasData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public WearableExtrasData[] newArray(int i) {
                return new WearableExtrasData[i];
            }
        }

        private WearableExtrasData() {
        }

        public static WearableExtrasData from(Context context, NotificationData notificationData, Bundle bundle) {
            WearableExtrasData wearableExtrasData = new WearableExtrasData();
            boolean z = NotificationData.DEBUG;
            if (z && wearableExtrasData.background != null) {
                Log.d(a, "Background : " + wearableExtrasData.background, new Object[0]);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_PAGES);
            if (parcelableArray != null && parcelableArray.length > 0) {
                if (z) {
                    Log.d(a, "Pages : " + parcelableArray.length, new Object[0]);
                }
                wearableExtrasData.pages = new NotificationData[parcelableArray.length];
                for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                    if (NotificationData.DEBUG) {
                        Log.d(a, "Page : " + parcelableArray[i2], new Object[0]);
                    }
                    wearableExtrasData.pages[i2] = NotificationData.from(context, notificationData.key, (Notification) parcelableArray[i2], notificationData.isLocal);
                }
            }
            if (Build.VERSION.SDK_INT >= 20) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_ACTIONS);
                if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
                    if (NotificationData.DEBUG) {
                        Log.d(a, "Actions : " + parcelableArrayList.size(), new Object[0]);
                    }
                    wearableExtrasData.actions = new ActionData[parcelableArrayList.size()];
                    for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                        wearableExtrasData.actions[i3] = ActionData.from(context, notificationData, (Notification.Action) parcelableArrayList.get(i3), i3, true);
                    }
                }
            } else {
                boolean z2 = NotificationData.DEBUG;
                if (z2) {
                    Log.d(a, "Wearable extras for 4.4!!", new Object[0]);
                }
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(KEY_ACTIONS);
                if (parcelableArrayList2 != null && parcelableArrayList2.size() > 0) {
                    if (z2) {
                        Log.d(a, "Actions : " + parcelableArrayList2.size(), new Object[0]);
                    }
                    wearableExtrasData.actions = new ActionData[parcelableArrayList2.size()];
                    for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                        Bundle bundle2 = (Bundle) parcelableArrayList2.get(i4);
                        int i5 = bundle2.getInt("icon");
                        String string = bundle2.getString("title");
                        Parcelable[] parcelableArray2 = bundle2.getParcelableArray("remoteInputs");
                        if (parcelableArray2 == null || parcelableArray2.length <= 0) {
                            wearableExtrasData.actions[i4] = ActionData.from(context, notificationData, i5, string, null, null, null, i4, true);
                        } else {
                            RemoteInputKitkat[] remoteInputKitkatArr = new RemoteInputKitkat[parcelableArray2.length];
                            for (int i6 = 0; i6 < parcelableArray2.length; i6++) {
                                Bundle bundle3 = (Bundle) parcelableArray2[i6];
                                RemoteInputKitkat remoteInputKitkat = new RemoteInputKitkat();
                                remoteInputKitkatArr[i6] = remoteInputKitkat;
                                remoteInputKitkat.resultKey = bundle3.getString("resultKey");
                                remoteInputKitkat.label = bundle3.getString("label");
                                remoteInputKitkat.choices = bundle3.getStringArray("choices");
                            }
                            wearableExtrasData.actions[i4] = ActionData.from(context, notificationData, i5, string, null, remoteInputKitkatArr, null, i4, true);
                        }
                    }
                }
            }
            return wearableExtrasData;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            Utils.writeBmp(parcel, this.background);
            parcel.writeParcelableArray(this.pages, 0);
            parcel.writeParcelableArray(this.actions, 0);
        }

        public WearableExtrasData(Parcel parcel) {
            this.background = Utils.readBmp(parcel);
            this.pages = (NotificationData[]) Utils.readParcelableArray(parcel, NotificationData[].class);
            this.actions = (ActionData[]) Utils.readParcelableArray(parcel, ActionData[].class);
            if (NotificationData.DEBUG) {
                if (this.background != null) {
                    Log.d(a, "Read Background : " + this.background, new Object[0]);
                }
                NotificationData[] notificationDataArr = this.pages;
                if (notificationDataArr != null && notificationDataArr.length > 0) {
                    Log.d(a, "Read Pages : " + Arrays.toString(this.pages), new Object[0]);
                }
                ActionData[] actionDataArr = this.actions;
                if (actionDataArr == null || actionDataArr.length <= 0) {
                    return;
                }
                Log.d(a, "Read Action : " + Arrays.toString(this.actions), new Object[0]);
            }
        }
    }

    public class a implements Parcelable.Creator<NotificationData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationData createFromParcel(Parcel parcel) {
            return new NotificationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NotificationData[] newArray(int i) {
            return new NotificationData[i];
        }
    }

    private NotificationData() {
        this.b = true;
    }

    private static void a(ActionData[] actionDataArr, NotificationData notificationData, boolean z) {
        if (actionDataArr == null || actionDataArr.length <= 0) {
            return;
        }
        int i = 0;
        for (ActionData actionData : actionDataArr) {
            actionData.a = notificationData;
            actionData.b = i;
            actionData.c = z;
            RemoteInputData[] remoteInputDataArr = actionData.remoteInputs;
            if (remoteInputDataArr != null && remoteInputDataArr.length > 0) {
                for (RemoteInputData remoteInputData : remoteInputDataArr) {
                    remoteInputData.a = actionData;
                }
            }
            i++;
        }
    }

    public static NotificationData empty() {
        return new NotificationData();
    }

    public static NotificationData from(Context context, NotificationKeyData notificationKeyData, Notification notification, boolean z) {
        Notification.Action[] actionArr;
        NotificationData notificationData = new NotificationData();
        notificationData.isLocal = z;
        notificationData.originalNotification = notification;
        notificationData.key = notificationKeyData;
        Bundle extras = NotificationCompat.getExtras(notification);
        if (DEBUG) {
            Log.d(TAG, notification + "\nExtras : " + extras, new Object[0]);
        }
        notificationData.title = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_TITLE));
        String string = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_TEXT));
        notificationData.text = string;
        if (TextUtils.isEmpty(string)) {
            Log.w(TAG, "Extra Text is Empty!!", new Object[0]);
            notificationData.text = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT));
        }
        if (TextUtils.isEmpty(notificationData.text)) {
            Log.w(TAG, "Extra Big Text is Empty!!", new Object[0]);
            notificationData.text = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT));
        }
        if (TextUtils.isEmpty(notificationData.text)) {
            Log.w(TAG, "Extra Summary Text is Empty!!", new Object[0]);
            notificationData.text = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_SUB_TEXT));
        }
        if (TextUtils.isEmpty(notificationData.text)) {
            Log.w(TAG, "Extra Sub Text is Empty!!", new Object[0]);
            notificationData.text = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_INFO_TEXT));
        }
        if (TextUtils.isEmpty(notificationData.text)) {
            Log.w(TAG, "Extra Info Text is Empty!!", new Object[0]);
        }
        CharSequence[] charSequenceArray = extras.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES);
        if (charSequenceArray != null && charSequenceArray.length > 0) {
            Log.d(TAG, "Extra TextLines, Size : " + charSequenceArray.length, new Object[0]);
            if (notificationData.text == null) {
                notificationData.text = "";
            }
            StringBuilder sb = new StringBuilder(notificationData.text);
            for (CharSequence charSequence : charSequenceArray) {
                if (!TextUtils.isEmpty(charSequence)) {
                    sb.append("\r\n");
                    sb.append(charSequence);
                }
            }
            notificationData.text = sb.toString();
        }
        notificationData.contentInfo = Utils.toString(extras.getCharSequence(NotificationCompat.EXTRA_INFO_TEXT));
        if (z) {
            Utils.BitmapExtender bitmapExtenderRetrieveBitmap = Utils.retrieveBitmap(context, notificationKeyData.pkg, extras.getInt(NotificationCompat.EXTRA_SMALL_ICON));
            if (bitmapExtenderRetrieveBitmap != null) {
                notificationData.smallIcon = bitmapExtenderRetrieveBitmap.bitmap;
                notificationData.b = bitmapExtenderRetrieveBitmap.canRecycle;
            }
        } else if (MiPushSupport.isFromMiPush(notificationKeyData.pkg)) {
            Utils.BitmapExtender bitmapExtenderRetrieveAppIcon = MiPushSupport.retrieveAppIcon(context, notification);
            if (bitmapExtenderRetrieveAppIcon != null) {
                notificationData.smallIcon = bitmapExtenderRetrieveAppIcon.bitmap;
                notificationData.b = true;
            }
        } else {
            Utils.BitmapExtender bitmapExtenderRetrieveAppIcon2 = Utils.retrieveAppIcon(context, notificationKeyData.pkg);
            if (bitmapExtenderRetrieveAppIcon2 != null) {
                notificationData.smallIcon = bitmapExtenderRetrieveAppIcon2.bitmap;
                notificationData.b = bitmapExtenderRetrieveAppIcon2.canRecycle;
            }
        }
        boolean z2 = DEBUG;
        String string2 = extras.getString(NotificationCompat.EXTRA_TEMPLATE);
        if (!TextUtils.isEmpty(string2)) {
            notificationData.style = StyleData.from(string2, extras);
        }
        if (Build.VERSION.SDK_INT >= 19 && (actionArr = notification.actions) != null && actionArr.length > 0) {
            int length = actionArr.length;
            if (z2) {
                Log.d(TAG, "Actions : " + length, new Object[0]);
            }
            notificationData.actions = new ActionData[length];
            for (int i = 0; i < length; i++) {
                Notification.Action action = actionArr[i];
                if (DEBUG) {
                    Log.d(TAG, "Action : " + action, new Object[0]);
                }
                notificationData.actions[i] = ActionData.from(context, notificationData, action, i, false);
            }
        }
        Bundle bundle = extras.getBundle(EXTRA_WEARABLE_EXTENSIONS);
        if (bundle != null && bundle.size() > 0) {
            notificationData.wearableExtras = WearableExtrasData.from(context, notificationData, bundle);
        }
        notificationData.priority = notification.priority;
        notificationData.flags = notification.flags;
        notificationData.when = notification.when;
        return notificationData;
    }

    public static NotificationData fromIOS(String str, byte[] bArr, String str2, String str3, long j) {
        NotificationData notificationData = new NotificationData();
        notificationData.iOSPkg = str;
        notificationData.iOSUid = bArr;
        notificationData.title = str2;
        notificationData.text = str3;
        notificationData.when = j;
        notificationData.isIOS = true;
        notificationData.smallIcon = BitmapFactory.decodeFile("/sdcard/.ble/icon/" + str + ".png");
        notificationData.b = true;
        return notificationData;
    }

    public static NotificationData fromSMS(long j, String str) {
        NotificationData notificationData = new NotificationData();
        notificationData.isSMS = true;
        notificationData.smsDate = j;
        notificationData.smsText = str;
        return notificationData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getSmallIconBitmapRecycled() {
        return this.b;
    }

    public NotificationHandler.Handler handler() {
        if (this.a == null) {
            if (this.isIOS) {
                this.a = NotificationHandler.prepareIOSHandler(this.iOSPkg, this.iOSUid);
            } else {
                this.a = NotificationHandler.prepareHandler(this.key, this, this.isLocal);
            }
        }
        return this.a;
    }

    public void recycleBitmap() {
        Bitmap bitmap;
        Log.d(TAG, "NotificationData recycle bitmap : " + this.b, new Object[0]);
        if (!this.b || (bitmap = this.smallIcon) == null) {
            return;
        }
        bitmap.recycle();
        this.b = true;
    }

    public void setSmallIconBitmapRecycled(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utils.writeBmp(parcel, this.smallIcon);
        Utils.writeBmp(parcel, this.largeIcon);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.contentInfo);
        parcel.writeParcelable(this.style, 0);
        parcel.writeParcelableArray(this.actions, 0);
        parcel.writeParcelable(this.wearableExtras, 0);
        parcel.writeInt(this.priority);
        parcel.writeInt(this.flags);
        parcel.writeLong(this.when);
        parcel.writeParcelable(this.isLocal ? this.originalNotification : null, 0);
        parcel.writeString(this.iOSPkg);
        parcel.writeByteArray(this.iOSUid);
        parcel.writeInt(this.isIOS ? 1 : 0);
    }

    public static class ActionData implements Parcelable {
        public static final Parcelable.Creator<ActionData> CREATOR = new a();
        private static final String f = "Noti-Data.Action";
        public NotificationData a;
        public int b;
        public boolean c;
        private NotificationHandler.Handler d;
        private boolean e;
        public Bitmap icon;
        public Notification.Action originalAction;
        public RemoteInputData[] remoteInputs;
        public String title;

        public class a implements Parcelable.Creator<ActionData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ActionData createFromParcel(Parcel parcel) {
                return new ActionData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ActionData[] newArray(int i) {
                return new ActionData[i];
            }
        }

        private ActionData() {
            this.e = true;
        }

        @TargetApi(19)
        public static ActionData from(Context context, NotificationData notificationData, Notification.Action action, int i, boolean z) {
            return Build.VERSION.SDK_INT >= 20 ? from(context, notificationData, action.icon, Utils.toString(action.title), action.getRemoteInputs(), null, action, i, z) : from(context, notificationData, action.icon, Utils.toString(action.title), null, null, action, i, z);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean getIconBitmapRecycled() {
            return this.e;
        }

        public NotificationHandler.Handler handler() {
            if (this.d == null) {
                NotificationData notificationData = this.a;
                this.d = NotificationHandler.prepareActionHandler(notificationData != null ? notificationData.key : null, this, this.b, this.c, notificationData != null && notificationData.isLocal);
            }
            return this.d;
        }

        public void recycleBitmap() {
            Bitmap bitmap;
            Log.d(f, "ActionData recycle bitmap : " + this.e, new Object[0]);
            if (!this.e || (bitmap = this.icon) == null) {
                return;
            }
            bitmap.recycle();
            this.e = true;
        }

        public void setIconBitmapRecycled(boolean z) {
            this.e = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Utils.writeBmp(parcel, this.icon);
            parcel.writeString(this.title);
            parcel.writeParcelableArray(this.remoteInputs, 0);
        }

        public ActionData(Parcel parcel) {
            this.e = true;
            this.e = true;
            this.icon = Utils.readBmp(parcel);
            this.title = parcel.readString();
            this.remoteInputs = (RemoteInputData[]) Utils.readParcelableArray(parcel, RemoteInputData[].class);
        }

        public static ActionData from(Context context, NotificationData notificationData, int i, String str, RemoteInput[] remoteInputArr, RemoteInputKitkat[] remoteInputKitkatArr, Notification.Action action, int i2, boolean z) {
            Utils.BitmapExtender bitmapExtenderRetrieveBitmap;
            ActionData actionData = new ActionData();
            actionData.originalAction = action;
            actionData.a = notificationData;
            actionData.b = i2;
            actionData.c = z;
            if (notificationData.isLocal && (bitmapExtenderRetrieveBitmap = Utils.retrieveBitmap(context, notificationData.key.pkg, i)) != null) {
                actionData.icon = bitmapExtenderRetrieveBitmap.bitmap;
                actionData.e = bitmapExtenderRetrieveBitmap.canRecycle;
            }
            actionData.title = str;
            int i3 = 0;
            if (Build.VERSION.SDK_INT >= 20) {
                if (remoteInputArr != null && remoteInputArr.length > 0) {
                    actionData.remoteInputs = new RemoteInputData[remoteInputArr.length];
                    while (i3 < remoteInputArr.length) {
                        actionData.remoteInputs[i3] = RemoteInputData.from(actionData, remoteInputArr[i3]);
                        i3++;
                    }
                }
            } else if (remoteInputKitkatArr != null && remoteInputKitkatArr.length > 0) {
                actionData.remoteInputs = new RemoteInputData[remoteInputKitkatArr.length];
                while (i3 < remoteInputKitkatArr.length) {
                    RemoteInputKitkat remoteInputKitkat = remoteInputKitkatArr[i3];
                    actionData.remoteInputs[i3] = RemoteInputData.from(actionData, remoteInputKitkat.resultKey, remoteInputKitkat.label, remoteInputKitkat.choices);
                    i3++;
                }
            }
            return actionData;
        }
    }

    public NotificationData(Parcel parcel) {
        this.b = true;
        this.b = true;
        this.smallIcon = Utils.readBmp(parcel);
        this.largeIcon = Utils.readBmp(parcel);
        this.title = parcel.readString();
        this.text = parcel.readString();
        this.contentInfo = parcel.readString();
        boolean z = DEBUG;
        this.style = (StyleData) parcel.readParcelable(StyleData.class.getClassLoader());
        ActionData[] actionDataArr = (ActionData[]) Utils.readParcelableArray(parcel, ActionData[].class);
        this.actions = actionDataArr;
        a(actionDataArr, this, false);
        WearableExtrasData wearableExtrasData = (WearableExtrasData) parcel.readParcelable(WearableExtrasData.class.getClassLoader());
        this.wearableExtras = wearableExtrasData;
        if (wearableExtrasData != null) {
            a(wearableExtrasData.actions, this, true);
        }
        this.priority = parcel.readInt();
        this.flags = parcel.readInt();
        this.when = parcel.readLong();
        if (z) {
            Log.d(TAG, "Read When : " + this.when, new Object[0]);
        }
        this.originalNotification = (Notification) parcel.readParcelable(Notification.class.getClassLoader());
        this.iOSPkg = parcel.readString();
        this.iOSUid = parcel.createByteArray();
        this.isIOS = parcel.readInt() != 0;
    }
}
