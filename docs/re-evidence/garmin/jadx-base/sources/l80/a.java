package l80;

import al2.k;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import bm2.d;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.device.sharing.management.dtos.SharedDeviceInfo;
import com.google.common.collect.ImmutableList;
import java.util.Map;
import java.util.Set;
import p90.e;
import rs2.t;
import s80.i;
import v13.c;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    void A(long j8);

    void B(int i14);

    PendingIntent C(long j8);

    Object D(long j8, i.c cVar);

    void E();

    void F(d dVar);

    void G();

    void H(long j8);

    void I(d dVar, byte[] bArr);

    Comparable J(c cVar);

    al2.a K(long j8);

    ImmutableList L();

    void M(SharedDeviceInfo sharedDeviceInfo);

    bm2.c N(String str);

    Object O(c cVar);

    Object P(long j8, ed0.a.b.C1350a c1350a);

    void Q();

    Object a(Set set, c cVar);

    void b(long j8, boolean z14);

    Object c(long j8, c cVar);

    void d(Context context, long j8, String str);

    Map<String, k> e();

    boolean f(String str);

    void g();

    int h(d dVar);

    void i(Context context, long j8, String str);

    boolean j(long j8);

    void k(long j8);

    boolean l();

    com.garmin.android.apps.connectmobile.devices.setup.wizard.c m(l lVar);

    boolean n(int i14, long j8);

    void o(Activity activity, l lVar);

    void p(String str, boolean z14);

    void q(Activity activity);

    void r(long j8);

    Object s(boolean z14, c cVar);

    void t(long j8);

    void u(e.c cVar);

    Object v(boolean z14, c cVar);

    void w(long j8, t tVar);

    Object x(long j8, c cVar);

    k y(String str);

    Intent z(Activity activity, long j8);
}
