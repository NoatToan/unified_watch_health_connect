package vn2;

import android.content.Context;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0003R\u001c\u0010\t\u001a\u00020\u00048'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lvn2/i1;", "Lsy2/c;", "Lvn2/j1;", "", "Lpn2/t;", "o", "()Lpn2/t;", "I0", "(Lpn2/t;)V", "currentUserInfo", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface i1 extends sy2.c<j1> {
    @uy2.k
    void I0(pn2.t tVar);

    @uy2.r(providerClass = xn2.l0.class)
    /* synthetic */ q03.r K(Context context);

    @Override // sy2.c
    @uy2.k
    /* synthetic */ void a(j1 j1Var);

    /* synthetic */ Object b();

    @uy2.o0(description = "Daily maintenance", providerClass = yn2.f.class)
    @uy2.k(description = "Not in maintenance")
    @uy2.k0(description = "10M before daily maintenance", providerClass = yn2.e.class)
    @uy2.l0(description = "Monthly maintenance", providerClass = yn2.h.class)
    @uy2.m0(description = "10M before monthly maintenance", providerClass = yn2.g.class)
    /* synthetic */ q03.b e(tn2.f0.a aVar);

    @uy2.b0(1)
    /* synthetic */ long getDeviceUnitId();

    @uy2.i(description = "No user info")
    @uy2.r(description = "Has user info", providerClass = xn2.x.class)
    /* synthetic */ q03.i getUserInfo();

    @uy2.r(providerClass = xn2.x.class)
    pn2.t o();

    @uy2.j0(description = "Failed to update", exceptionClass = Exception.class)
    @uy2.k(description = "Succeeded to update")
    /* synthetic */ q03.b x(String str, String str2, DateTime dateTime, pn2.u uVar, String str3);
}
