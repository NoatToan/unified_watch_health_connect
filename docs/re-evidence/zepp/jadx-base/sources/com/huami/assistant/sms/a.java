package com.huami.assistant.sms;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.assistant.sms.bean.Sms;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
class a {
    private static final String a = "SMS-Manager";
    private static final String b = "content://sms/inbox";
    private static final String[] c = {"_id", IntegrityManager.INTEGRITY_TYPE_ADDRESS, NotificationCompat.MessagingStyle.Message.KEY_PERSON, "body", "date", "type"};

    public static Sms a(Context context) throws Throwable {
        Sms sms;
        Cursor cursor = null;
        sms = null;
        Sms sms2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = context.getContentResolver().query(Uri.parse(b), c, "date >=? and date <= ?", new String[]{String.valueOf(DateDay.today().dayStartMills()), String.valueOf(DateDay.today().dayEndMills())}, "date DESC");
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("body"));
                                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("date"));
                                sms = new Sms();
                                try {
                                    sms.date = j;
                                    sms.content = string;
                                    sms2 = sms;
                                } catch (Exception e) {
                                    e = e;
                                    cursor = cursorQuery;
                                    Log.e(a, "QueryLatestSmsErr", e, new Object[0]);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return sms;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sms = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery == null) {
                    return sms2;
                }
                cursorQuery.close();
                return sms2;
            } catch (Exception e3) {
                e = e3;
                sms = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
