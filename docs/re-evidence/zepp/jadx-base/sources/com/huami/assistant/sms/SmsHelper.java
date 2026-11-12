package com.huami.assistant.sms;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsParser;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SmsHelper {
    private static final String a = "SmsHelper";
    private static final String b = "content://sms/inbox";
    private static String[] c = {"_id", IntegrityManager.INTEGRITY_TYPE_ADDRESS, NotificationCompat.MessagingStyle.Message.KEY_PERSON, "body", "date", "type"};

    private static Sms a(Cursor cur) {
        return generateSms(cur.getLong(cur.getColumnIndex("date")), cur.getString(cur.getColumnIndex("body")));
    }

    public static Sms generateSms(long date, String body) {
        if (TextUtils.isEmpty(body)) {
            return null;
        }
        Sms sms = SmsParser.parse(body);
        if (sms != null) {
            sms.date = date;
        }
        return sms;
    }

    public static Sms generateSmsByNotification(long when, String title, String body) {
        if (TextUtils.isEmpty(body)) {
            return null;
        }
        Sms notification = SmsParser.parseNotification(title, body);
        if (notification != null) {
            notification.date = when;
        }
        return notification;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[PHI: r9
      0x0068: PHI (r9v6 android.database.Cursor) = (r9v5 android.database.Cursor), (r9v9 android.database.Cursor) binds: [B:26:0x0066, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @NonNull
    public static List<Sms> syncPhoneSms(Context context, long startTimeMills, long endTimeMills) {
        ArrayList arrayList = new ArrayList();
        if (!AndroidPermissions.checkGranted(context, "android.permission.READ_SMS")) {
            return arrayList;
        }
        String[] strArr = {String.valueOf(startTimeMills), String.valueOf(endTimeMills)};
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(b), c, "date >=? and date<=?", strArr, "date desc");
                if (cursorQuery != null && cursorQuery.getCount() != 0) {
                    while (cursorQuery.moveToNext()) {
                        Sms smsA = a(cursorQuery);
                        if (smsA != null && !UpdatesManager.getManager().isSmsExist(smsA.date)) {
                            arrayList.add(smsA);
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            Log.d(a, "sync new sms:" + arrayList, new Object[0]);
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
