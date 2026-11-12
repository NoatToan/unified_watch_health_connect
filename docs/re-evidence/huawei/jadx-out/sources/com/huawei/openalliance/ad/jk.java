package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;

/* JADX INFO: loaded from: classes12.dex */
public class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19357a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static jk f19358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19359c;
    private fb d;

    public boolean a(int i, String str) {
        if (TextUtils.isEmpty(str) || this.f19359c <= 0) {
            return false;
        }
        EventMonitorRecord eventMonitorRecordA = this.d.a(str);
        if (eventMonitorRecordA != null) {
            this.d.a(eventMonitorRecordA.a(), System.currentTimeMillis());
            return true;
        }
        EventMonitorRecord eventMonitorRecord = new EventMonitorRecord();
        eventMonitorRecord.a(System.currentTimeMillis());
        eventMonitorRecord.a(i);
        eventMonitorRecord.a(str);
        this.d.a(eventMonitorRecord, this.f19359c);
        return false;
    }

    private static jk b(Context context) {
        jk jkVar;
        synchronized (f19357a) {
            if (f19358b == null) {
                f19358b = new jk(context);
            }
            f19358b.f19359c = fp.b(context).bP() * 100;
            jkVar = f19358b;
        }
        return jkVar;
    }

    public static jk a(Context context) {
        return b(context);
    }

    public jk(Context context) {
        this.d = fb.a(context);
    }
}
