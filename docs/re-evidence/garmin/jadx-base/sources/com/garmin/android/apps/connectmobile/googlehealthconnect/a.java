package com.garmin.android.apps.connectmobile.googlehealthconnect;

import android.content.Context;
import android.content.Intent;
import java.util.Set;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    Context c();

    boolean d();

    Object e(DateTime dateTime, v13.c cVar);

    boolean f();

    Object g(long j8, long j14, long j15, v13.c cVar);

    Set<String> getPermissions();

    m8.a h();

    boolean i();

    Object j(long j8, v13.c cVar);

    void k(b.c cVar, boolean z14);

    Intent l();

    void m(DateTime dateTime);

    Object n(v13.c cVar);
}
