package com.huami.assistant.sms;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.ui.v2.repo.SettingRepo;
import com.huami.assistant.updates.NotificationObservable;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class SmsObserver extends ContentObserver {
    private static final String b = "SMS-Observer";
    private static final String c = "content://sms";
    private Context a;

    private SmsObserver(Context context) {
        super(null);
        this.a = context;
    }

    public static ContentObserver registerObserver(@NonNull Context context) {
        if (!AndroidPermissions.checkGranted(context, "android.permission.READ_SMS")) {
            return null;
        }
        if (!SettingRepo.INSTANCE.loadAutoDetect() && AssistantModule.isBleDevice()) {
            return null;
        }
        Log.d(b, "Register SmsObserver!!", new Object[0]);
        SmsObserver smsObserver = new SmsObserver(context.getApplicationContext());
        context.getContentResolver().registerContentObserver(Uri.parse(c), true, smsObserver);
        return smsObserver;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) throws Throwable {
        Log.d(b, "OnChange, selfChange : " + selfChange, new Object[0]);
        Sms smsA = a.a(this.a);
        if (smsA != null) {
            NotificationObservable.onNext(NotificationData.fromSMS(smsA.date, smsA.content));
        }
    }
}
