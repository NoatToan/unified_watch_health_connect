package com.huawei.openalliance.ad.utils;

import android.app.AlertDialog;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.AgendaBean;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.views.PPSWebView;
import com.huawei.operation.utils.Constants;
import com.huawei.wearengine.sensor.DataResult;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes12.dex */
public class az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f20445a = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f20446b = {"android.permission.READ_CALENDAR"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f20447c;
    private static String[] d;
    private Context e;
    private ContentRecord f;
    private PPSWebView g;
    private com.huawei.openalliance.ad.analysis.i h;
    private String i;
    private AgendaBean j;
    private String k;
    private String l;
    private boolean m = false;

    @JavascriptInterface
    public void cancel(String str, String str2) {
        if (dg.b(str)) {
            hw.c("IPPSAppointJs", "cancel failed, title is empty.");
            a(str2, 1, R.string.hiad_calender_cancel_failed);
            this.h.c(this.f, 1);
            return;
        }
        if (hw.a()) {
            hw.a("IPPSAppointJs", "cancel title= %s", str);
        }
        if (dg.b(str2)) {
            hw.c("IPPSAppointJs", "cancel, recall funcName is empty.");
        }
        this.l = str2;
        this.k = str;
        e();
    }

    public void b(boolean z, boolean z2) {
        if (z) {
            b(this.k);
            return;
        }
        hw.c("IPPSAppointJs", "cancel failed, not allowed permissions");
        if (z2) {
            a(this.l, 5, R.string.hiad_calender_cancel_failed);
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.az.10
                @Override // java.lang.Runnable
                public void run() {
                    az azVar = az.this;
                    if (azVar.a(azVar.l)) {
                        az.this.g.getWebView().loadUrl(Constants.JAVA_SCRIPT + az.this.l + "(5)");
                    }
                }
            });
        }
        this.h.c(this.f, 5);
    }

    @JavascriptInterface
    public void appoint(String str, String str2) {
        hw.b("IPPSAppointJs", "call appoint from js");
        if (dg.b(str)) {
            hw.c("IPPSAppointJs", "appoint failed: missing required parameters");
            a(str2, 1, R.string.hiad_calender_appoint_failed);
            this.h.a(this.f, 1);
            return;
        }
        if (hw.a()) {
            hw.a("IPPSAppointJs", "appoint info= %s", str);
        }
        if (dg.b(str2)) {
            hw.c("IPPSAppointJs", "appoint, recall funcName is empty.");
        }
        AgendaBean agendaBean = (AgendaBean) bk.b(str, AgendaBean.class, new Class[0]);
        if (agendaBean == null) {
            hw.c("IPPSAppointJs", "appoint failed: missing required parameters");
            a(str2, 1, R.string.hiad_calender_appoint_failed);
            this.h.a(this.f, 1);
            return;
        }
        if (b(agendaBean) || a(agendaBean)) {
            hw.c("IPPSAppointJs", "appoint failed: missing required parameters");
            a(str2, 1, R.string.hiad_calender_appoint_failed);
            this.h.a(this.f, 1);
        } else if (agendaBean.c() < System.currentTimeMillis()) {
            hw.c("IPPSAppointJs", "appoint failed: date start time before now");
            a(str2, 2, R.string.hiad_calender_appoint_failed);
            this.h.a(this.f, 2);
        } else {
            if (agendaBean.e() != 1 && agendaBean.e() != 0) {
                agendaBean.a(0);
            }
            this.j = agendaBean;
            this.i = str2;
            g();
        }
    }

    public boolean a() {
        if (!this.m) {
            return false;
        }
        Cursor cursorL = l();
        if (cursorL != null) {
            try {
                if (cursorL.getCount() > 0) {
                    if (cursorL == null) {
                        return true;
                    }
                    cursorL.close();
                    return true;
                }
            } catch (Throwable th) {
                if (cursorL != null) {
                    cursorL.close();
                }
                throw th;
            }
        }
        if (cursorL != null) {
            cursorL.close();
        }
        return false;
    }

    public void a(boolean z, boolean z2) {
        if (!z) {
            hw.c("IPPSAppointJs", "appoint failed: not allowed permissions");
            if (z2) {
                a(this.i, 5, R.string.hiad_calender_appoint_failed);
            } else {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.az.9
                    @Override // java.lang.Runnable
                    public void run() {
                        az azVar = az.this;
                        if (azVar.a(azVar.i)) {
                            az.this.g.getWebView().loadUrl(Constants.JAVA_SCRIPT + az.this.i + "(5)");
                        }
                    }
                });
            }
            this.h.a(this.f, 5);
            return;
        }
        if (!a()) {
            a(this.j, this.i);
            return;
        }
        hw.c("IPPSAppointJs", "appoint failed: already appointed");
        a(this.i, 3, R.string.hiad_calender_already_appoint);
        this.h.a(this.f, 3);
    }

    public void a(AgendaBean agendaBean, String str) {
        String strF;
        int iK = k();
        if (iK < 0) {
            hw.c("IPPSAppointJs", "appoint failed: get calendar account error");
            a(this.i, 6, R.string.hiad_calender_appoint_failed);
            this.h.a(this.f, 6);
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", agendaBean.a());
            contentValues.put("description", agendaBean.h());
            contentValues.put("eventLocation", agendaBean.b());
            contentValues.put("calendar_id", Integer.valueOf(iK));
            if (agendaBean.e() == 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(agendaBean.c());
                contentValues.put("dtstart", Long.valueOf(calendar.getTime().getTime()));
                calendar.setTimeInMillis(agendaBean.d());
                contentValues.put("dtend", Long.valueOf(calendar.getTime().getTime()));
                strF = agendaBean.f();
            } else {
                long jA = a(new Date(agendaBean.c()));
                long jA2 = a(new Date(agendaBean.d()));
                if (jA == jA2 || agendaBean.d() >= jA2) {
                    hw.a("IPPSAppointJs", "add one day");
                    jA2 += 86400000;
                }
                contentValues.put("dtstart", Long.valueOf(jA));
                contentValues.put("dtend", Long.valueOf(jA2));
                strF = DataResult.UTC;
            }
            contentValues.put("eventTimezone", strF);
            contentValues.put("allDay", Integer.valueOf(agendaBean.e()));
            contentValues.put("hasAlarm", (Integer) 1);
            contentValues.put("guestsCanModify", (Integer) 1);
            Uri uri = Uri.parse("content://com.android.calendar/events");
            if (!as.b(this.e, uri)) {
                hw.c("IPPSAppointJs", "provider uri invalid.");
                a(this.i, 9, R.string.hiad_calender_appoint_failed);
                this.h.a(this.f, 9);
                return;
            }
            Uri uriInsert = this.e.getContentResolver().insert(uri, contentValues);
            if (uriInsert == null) {
                hw.c("IPPSAppointJs", "appoint failed: insert error");
                a(this.i, 7, R.string.hiad_calender_appoint_failed);
                this.h.a(this.f, 7);
                return;
            }
            hw.b("IPPSAppointJs", "appoint success");
            a(this.i, 0, R.string.hiad_calender_appoint_success);
            this.h.g(this.f);
            if (agendaBean.g() == null || agendaBean.g().intValue() < 0) {
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(HeaderType.EVENT_ID, Long.valueOf(ContentUris.parseId(uriInsert)));
            contentValues2.put("minutes", agendaBean.g());
            contentValues2.put("method", (Integer) 1);
            Uri uri2 = Uri.parse("content://com.android.calendar/reminders");
            if (!as.b(this.e, uri2)) {
                hw.c("IPPSAppointJs", "provider uri invalid.");
            } else if (this.e.getContentResolver().insert(uri2, contentValues2) == null) {
                hw.c("IPPSAppointJs", "add reminds error");
            }
        } catch (Throwable th) {
            hw.c("IPPSAppointJs", "addCalendarEvent error: " + th.getClass().getSimpleName());
            a(this.i, 7, R.string.hiad_calender_appoint_failed);
            this.h.a(this.f, 7);
        }
    }

    private Cursor l() {
        try {
            Uri uri = Uri.parse("content://com.android.calendar/events");
            if (!as.b(this.e, uri)) {
                hw.c("IPPSAppointJs", "provider uri invalid.");
                return null;
            }
            if (this.j.e() == 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.j.c());
                long time = calendar.getTime().getTime();
                calendar.setTimeInMillis(this.j.d());
                return this.e.getContentResolver().query(uri, null, "title=? and dtstart=? and dtend=?", new String[]{this.j.a(), String.valueOf(time), String.valueOf(calendar.getTime().getTime())}, null);
            }
            long jA = a(new Date(this.j.c()));
            long jA2 = a(new Date(this.j.d()));
            if (jA == jA2 || this.j.d() >= jA2) {
                hw.a("IPPSAppointJs", "add one day");
                jA2 += 86400000;
            }
            hw.c("IPPSAppointJs", "startTime = %s   endTime= %s", Long.valueOf(jA), Long.valueOf(jA2));
            return this.e.getContentResolver().query(uri, null, "title=? and dtstart=? and dtend=?", new String[]{this.j.a(), String.valueOf(jA), String.valueOf(jA2)}, null);
        } catch (Throwable th) {
            hw.c("IPPSAppointJs", "query failed: error= " + th.getClass().getSimpleName());
            return null;
        }
    }

    private int k() {
        if (!this.m) {
            return 1;
        }
        int i = i();
        if (i >= 0) {
            return i;
        }
        if (j() >= 0) {
            return i();
        }
        return -1;
    }

    private long j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", "pps");
            contentValues.put("account_type", "com.android.huawei");
            contentValues.put("account_name", "pps");
            contentValues.put("calendar_displayName", "PPS账户");
            contentValues.put("calendar_color", (Integer) (-16776961));
            contentValues.put("visible", (Integer) 1);
            contentValues.put("calendar_access_level", (Integer) 700);
            contentValues.put("ownerAccount", "pps");
            contentValues.put("sync_events", (Integer) 1);
            contentValues.put("calendar_timezone", timeZone.getID());
            contentValues.put("canOrganizerRespond", (Integer) 0);
            Uri uriBuild = Uri.parse("content://com.android.calendar/calendars").buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_type", "com.android.huawei").appendQueryParameter("account_name", "pps").build();
            if (!as.b(this.e, uriBuild)) {
                hw.c("IPPSAppointJs", "provider uri invalid.");
                return -1L;
            }
            Uri uriInsert = this.e.getContentResolver().insert(uriBuild, contentValues);
            if (uriInsert == null) {
                return -1L;
            }
            return ContentUris.parseId(uriInsert);
        } catch (Throwable th) {
            hw.c("IPPSAppointJs", "addCalendarAccount error: " + th.getClass().getSimpleName());
            return -1L;
        }
    }

    private int i() {
        Cursor cursorQuery = this.e.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        if (cursorQuery == null) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return -1;
        }
        try {
            if (cursorQuery.getCount() <= 0) {
                return -1;
            }
            cursorQuery.moveToFirst();
            return cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!a()) {
            a(this.j, this.i);
            return;
        }
        hw.c("IPPSAppointJs", "appoint failed: already appointed");
        a(this.i, 3, R.string.hiad_calender_already_appoint);
        this.h.a(this.f, 3);
    }

    private void g() {
        if (!cj.a(this.e, d)) {
            hw.b("IPPSAppointJs", "handleAppointPermission, no calendar permissions");
            Toast.makeText(this.e, R.string.hiad_no_calendar_permission_msg, 0).show();
            this.h.a(this.f, 10);
        } else if (a(this.f)) {
            h();
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.az.8
                @Override // java.lang.Runnable
                public void run() {
                    az.this.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new AlertDialog.Builder(this.e).setTitle(R.string.hiad_calender_dialog).setMessage(R.string.hiad_calender_appoint_dialog_message).setNegativeButton(R.string.hiad_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.utils.az.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                hw.c("IPPSAppointJs", "appoint failed: not allowed");
                az azVar = az.this;
                azVar.a(azVar.i, 4, R.string.hiad_calender_appoint_failed);
                az.this.h.a(az.this.f, 4);
            }
        }).setPositiveButton(R.string.hiad_calender_add, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.utils.az.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                az.this.h();
            }
        }).setCancelable(false).create().show();
    }

    private void e() {
        if (!cj.a(this.e, d)) {
            hw.b("IPPSAppointJs", "handleCancelPermission, no calendar permissions");
            Toast.makeText(this.e, R.string.hiad_no_calendar_permission_msg, 0).show();
            this.h.c(this.f, 10);
        } else if (a(this.f)) {
            b(this.k);
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.az.5
                @Override // java.lang.Runnable
                public void run() {
                    az.this.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        new AlertDialog.Builder(this.e).setTitle(R.string.hiad_calender_dialog).setMessage(R.string.hiad_calender_cancel_dialog_message).setNegativeButton(R.string.hiad_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.utils.az.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                hw.c("IPPSAppointJs", "cancel failed: not allowed");
                az azVar = az.this;
                azVar.a(azVar.l, 4, R.string.hiad_calender_cancel_failed);
                az.this.h.c(az.this.f, 4);
            }
        }).setPositiveButton(R.string.hiad_calender_delete, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.utils.az.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                az azVar = az.this;
                azVar.b(azVar.k);
            }
        }).setCancelable(false).create().show();
    }

    private void c() {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.az.1
            @Override // java.lang.Runnable
            public void run() {
                az azVar = az.this;
                azVar.m = cj.b(azVar.e, "android.permission.READ_CALENDAR");
                if (az.this.m) {
                    String[] unused = az.d = az.f20445a;
                }
            }
        });
    }

    private boolean b(AgendaBean agendaBean) {
        return dg.b(agendaBean.a()) || dg.b(agendaBean.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            Uri uri = Uri.parse("content://com.android.calendar/events");
            if (!as.b(this.e, uri)) {
                hw.c("IPPSAppointJs", "provider uri invalid.");
                a(this.l, 9, R.string.hiad_calender_cancel_failed);
                this.h.c(this.f, 9);
            } else if (this.e.getContentResolver().delete(uri, "title=?", new String[]{str}) == -1) {
                hw.c("IPPSAppointJs", "cancel failed: delete error");
                a(this.l, 7, R.string.hiad_calender_cancel_failed);
                this.h.c(this.f, 7);
            } else {
                hw.b("IPPSAppointJs", "cancel success");
                a(this.l, 0, R.string.hiad_calender_cancel_success);
                this.h.b(this.f, 0);
            }
        } catch (Throwable th) {
            hw.c("IPPSAppointJs", "cancel failed: delete error= " + th.getClass().getSimpleName());
            a(this.l, 7, R.string.hiad_calender_cancel_failed);
            this.h.c(this.f, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (dg.b(str)) {
            return false;
        }
        return str.matches("^[0-9a-zA-Z_]+$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return "2".equals(contentRecord.af()) || "1".equals(contentRecord.af());
    }

    private boolean a(AgendaBean agendaBean) {
        return agendaBean.c() <= 0 || agendaBean.d() <= 0 || agendaBean.c() > agendaBean.d() || dg.b(agendaBean.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final int i, final int i2) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.az.2
            @Override // java.lang.Runnable
            public void run() {
                if (az.this.a(str)) {
                    az.this.g.getWebView().loadUrl(Constants.JAVA_SCRIPT + str + Constants.LEFT_BRACKET_ONLY + i + Constants.RIGHT_BRACKET_ONLY);
                }
                az azVar = az.this;
                if (azVar.a(azVar.f)) {
                    return;
                }
                Toast.makeText(az.this.e.getApplicationContext(), i2, 0).show();
            }
        });
    }

    private long a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    public az(Context context, ContentRecord contentRecord, PPSWebView pPSWebView) {
        hw.b("IPPSAppointJs", "IPPSAppointJs init");
        this.e = context;
        this.f = contentRecord;
        this.g = pPSWebView;
        this.h = new com.huawei.openalliance.ad.analysis.i(context);
        c();
    }

    static {
        String[] strArr = {"android.permission.WRITE_CALENDAR"};
        f20447c = strArr;
        d = strArr;
    }
}
