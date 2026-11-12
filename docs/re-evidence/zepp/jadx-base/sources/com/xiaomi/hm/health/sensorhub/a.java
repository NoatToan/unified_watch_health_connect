package com.xiaomi.hm.health.sensorhub;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
class a {
    private static final String b = "SensorHubReader";
    private static final String[] c = {"_id", b.b, b.c, b.d, b.e};
    private ContentResolver a;

    public a(ContentResolver cr) {
        this.a = cr;
    }

    private static boolean a() {
        try {
            return Class.forName("com.xiaomi.joyose.JoyoseManager").getMethod("getAllSteps", String[].class, String.class, String[].class, String.class) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean b(ContentResolver cr) {
        try {
            Cursor cursorQuery = cr.query(b.i, c, null, null, null);
            if (cursorQuery != null) {
                cursorQuery.close();
                return true;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return false;
        } catch (Exception e) {
            HMLog.i(b, "checkValid has Exception:" + e.getMessage(), new Object[0]);
            return false;
        }
    }

    public static boolean c(ContentResolver cr) {
        return MiuiAPI.isMiuiMemberSpace(BraceletApp.getContext()) ? a() : b(cr);
    }

    private Step d(Cursor cursor) {
        return new Step(cursor.getInt(cursor.getColumnIndex("_id")), cursor.getLong(cursor.getColumnIndex(b.b)), cursor.getLong(cursor.getColumnIndex(b.c)), cursor.getInt(cursor.getColumnIndex(b.d)), cursor.getInt(cursor.getColumnIndex(b.e)));
    }

    private LinkedList<Step> f(String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        LinkedList<Step> linkedList = new LinkedList<>();
        try {
            Method method = Class.forName("com.xiaomi.joyose.JoyoseManager").getMethod("getAllSteps", String[].class, String.class, String[].class, String.class);
            if (method != null) {
                Iterator it2 = ((List) method.invoke(null, projection, selection, selectionArgs, sortOrder)).iterator();
                while (it2.hasNext()) {
                    Step stepH = h(it2.next());
                    if (stepH != null) {
                        linkedList.add(stepH);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return linkedList;
    }

    private LinkedList<Step> g(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        LinkedList<Step> linkedList = new LinkedList<>();
        Cursor cursorQuery = this.a.query(uri, projection, selection, selectionArgs, sortOrder);
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            do {
                linkedList.add(d(cursorQuery));
            } while (cursorQuery.moveToNext());
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return linkedList;
    }

    private Step h(Object item) {
        try {
            Class<?> cls = Class.forName("com.xiaomi.joyose.Step");
            Field field = cls.getField("id");
            field.setAccessible(true);
            Integer num = (Integer) field.get(item);
            Field field2 = cls.getField("mBeginTime");
            field2.setAccessible(true);
            Long l = (Long) field2.get(item);
            Field field3 = cls.getField("mEndTime");
            field3.setAccessible(true);
            Long l2 = (Long) field3.get(item);
            Field field4 = cls.getField("mMode");
            field4.setAccessible(true);
            Integer num2 = (Integer) field4.get(item);
            Field field5 = cls.getField("mSteps");
            field5.setAccessible(true);
            return new Step(num.intValue(), l.longValue(), l2.longValue(), num2.intValue(), ((Integer) field5.get(item)).intValue());
        } catch (Exception e) {
            HMLog.i(b, "exception:" + e.toString(), new Object[0]);
            return null;
        }
    }

    public LinkedList<Step> e(long startTimestamp, long stopTimestamp) {
        HMLog.d(b, "start time:" + new Date(startTimestamp) + ",ts:" + startTimestamp, new Object[0]);
        HMLog.d(b, "stop time:" + new Date(stopTimestamp) + ",ts:" + stopTimestamp, new Object[0]);
        String[] strArr = {String.valueOf(startTimestamp), String.valueOf(stopTimestamp)};
        return MiuiAPI.isMiuiMemberSpace(BraceletApp.getContext()) ? f(c, "_begin_time>=? AND _end_time<=?", strArr, b.f) : g(b.i, c, "_begin_time>=? AND _end_time<=?", strArr, b.f);
    }
}
