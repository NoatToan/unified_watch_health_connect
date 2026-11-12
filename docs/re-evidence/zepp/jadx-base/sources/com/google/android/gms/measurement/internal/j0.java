package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class j0 {
    private long A;
    private long B;

    @Nullable
    private String C;
    private boolean D;
    private long E;
    private long F;
    private final zzfv a;
    private final String b;

    @Nullable
    private String c;

    @Nullable
    private String d;

    @Nullable
    private String e;

    @Nullable
    private String f;
    private long g;
    private long h;
    private long i;

    @Nullable
    private String j;
    private long k;

    @Nullable
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;

    @Nullable
    private String r;

    @Nullable
    private Boolean s;
    private long t;

    @Nullable
    private List<String> u;

    @Nullable
    private String v;
    private long w;
    private long x;
    private long y;
    private long z;

    @WorkerThread
    public j0(zzfv zzfvVar, String str) {
        Preconditions.checkNotNull(zzfvVar);
        Preconditions.checkNotEmpty(str);
        this.a = zzfvVar;
        this.b = str;
        zzfvVar.zzaz().zzg();
    }

    @WorkerThread
    public final long A() {
        this.a.zzaz().zzg();
        return this.p;
    }

    @WorkerThread
    public final void B(@Nullable String str) {
        this.a.zzaz().zzg();
        this.D |= !zzkz.B(this.C, str);
        this.C = str;
    }

    @WorkerThread
    public final void C(long j) {
        this.a.zzaz().zzg();
        this.D |= this.i != j;
        this.i = j;
    }

    @WorkerThread
    public final void D(long j) {
        Preconditions.checkArgument(j >= 0);
        this.a.zzaz().zzg();
        this.D = (this.g != j) | this.D;
        this.g = j;
    }

    @WorkerThread
    public final void E(long j) {
        this.a.zzaz().zzg();
        this.D |= this.h != j;
        this.h = j;
    }

    @WorkerThread
    public final void F(boolean z) {
        this.a.zzaz().zzg();
        this.D |= this.o != z;
        this.o = z;
    }

    @WorkerThread
    public final void G(@Nullable Boolean bool) {
        boolean zEquals;
        this.a.zzaz().zzg();
        boolean z = this.D;
        Boolean bool2 = this.s;
        int i = zzkz.zza;
        if (bool2 == null && bool == null) {
            zEquals = true;
        } else {
            zEquals = bool2 == null ? false : bool2.equals(bool);
        }
        this.D = z | (!zEquals);
        this.s = bool;
    }

    @WorkerThread
    public final void H(@Nullable String str) {
        this.a.zzaz().zzg();
        this.D |= !zzkz.B(this.e, str);
        this.e = str;
    }

    @WorkerThread
    public final void I(@Nullable List<String> list) {
        this.a.zzaz().zzg();
        List<String> list2 = this.u;
        int i = zzkz.zza;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.D = true;
        this.u = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    public final boolean J() {
        this.a.zzaz().zzg();
        return this.q;
    }

    @WorkerThread
    public final boolean K() {
        this.a.zzaz().zzg();
        return this.o;
    }

    @WorkerThread
    public final boolean L() {
        this.a.zzaz().zzg();
        return this.D;
    }

    @WorkerThread
    public final long M() {
        this.a.zzaz().zzg();
        return this.k;
    }

    @WorkerThread
    public final long N() {
        this.a.zzaz().zzg();
        return this.E;
    }

    @WorkerThread
    public final long O() {
        this.a.zzaz().zzg();
        return this.z;
    }

    @WorkerThread
    public final long P() {
        this.a.zzaz().zzg();
        return this.A;
    }

    @WorkerThread
    public final long Q() {
        this.a.zzaz().zzg();
        return this.y;
    }

    @WorkerThread
    public final long R() {
        this.a.zzaz().zzg();
        return this.x;
    }

    @WorkerThread
    public final long S() {
        this.a.zzaz().zzg();
        return this.B;
    }

    @WorkerThread
    public final long T() {
        this.a.zzaz().zzg();
        return this.w;
    }

    @WorkerThread
    public final long U() {
        this.a.zzaz().zzg();
        return this.n;
    }

    @WorkerThread
    public final long V() {
        this.a.zzaz().zzg();
        return this.t;
    }

    @WorkerThread
    public final long W() {
        this.a.zzaz().zzg();
        return this.F;
    }

    @WorkerThread
    public final long X() {
        this.a.zzaz().zzg();
        return this.m;
    }

    @WorkerThread
    public final long Y() {
        this.a.zzaz().zzg();
        return this.i;
    }

    @WorkerThread
    public final long Z() {
        this.a.zzaz().zzg();
        return this.g;
    }

    @Nullable
    @WorkerThread
    public final String a() {
        this.a.zzaz().zzg();
        return this.C;
    }

    @WorkerThread
    public final long a0() {
        this.a.zzaz().zzg();
        return this.h;
    }

    @Nullable
    @WorkerThread
    public final String b() {
        this.a.zzaz().zzg();
        return this.e;
    }

    @Nullable
    @WorkerThread
    public final Boolean b0() {
        this.a.zzaz().zzg();
        return this.s;
    }

    @Nullable
    @WorkerThread
    public final List<String> c() {
        this.a.zzaz().zzg();
        return this.u;
    }

    @Nullable
    @WorkerThread
    public final String c0() {
        this.a.zzaz().zzg();
        return this.r;
    }

    @WorkerThread
    public final void d() {
        this.a.zzaz().zzg();
        this.D = false;
    }

    @Nullable
    @WorkerThread
    public final String d0() {
        this.a.zzaz().zzg();
        String str = this.C;
        B(null);
        return str;
    }

    @WorkerThread
    public final void e() {
        this.a.zzaz().zzg();
        long j = this.g + 1;
        if (j > ParserMinimalBase.MAX_INT_L) {
            this.a.zzay().zzk().zzb("Bundle index overflow. appId", zzel.zzn(this.b));
            j = 0;
        }
        this.D = true;
        this.g = j;
    }

    @WorkerThread
    public final String e0() {
        this.a.zzaz().zzg();
        return this.b;
    }

    @WorkerThread
    public final void f(@Nullable String str) {
        this.a.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ zzkz.B(this.r, str);
        this.r = str;
    }

    @Nullable
    @WorkerThread
    public final String f0() {
        this.a.zzaz().zzg();
        return this.c;
    }

    @WorkerThread
    public final void g(boolean z) {
        this.a.zzaz().zzg();
        this.D |= this.q != z;
        this.q = z;
    }

    @Nullable
    @WorkerThread
    public final String g0() {
        this.a.zzaz().zzg();
        return this.l;
    }

    @WorkerThread
    public final void h(long j) {
        this.a.zzaz().zzg();
        this.D |= this.p != j;
        this.p = j;
    }

    @Nullable
    @WorkerThread
    public final String h0() {
        this.a.zzaz().zzg();
        return this.j;
    }

    @WorkerThread
    public final void i(@Nullable String str) {
        this.a.zzaz().zzg();
        this.D |= !zzkz.B(this.c, str);
        this.c = str;
    }

    @Nullable
    @WorkerThread
    public final String i0() {
        this.a.zzaz().zzg();
        return this.f;
    }

    @WorkerThread
    public final void j(@Nullable String str) {
        this.a.zzaz().zzg();
        this.D |= !zzkz.B(this.l, str);
        this.l = str;
    }

    @Nullable
    @WorkerThread
    public final String j0() {
        this.a.zzaz().zzg();
        return this.v;
    }

    @WorkerThread
    public final void k(@Nullable String str) {
        this.a.zzaz().zzg();
        this.D |= !zzkz.B(this.j, str);
        this.j = str;
    }

    @Nullable
    @WorkerThread
    public final String k0() {
        this.a.zzaz().zzg();
        return this.d;
    }

    @WorkerThread
    public final void l(long j) {
        this.a.zzaz().zzg();
        this.D |= this.k != j;
        this.k = j;
    }

    @WorkerThread
    public final void m(long j) {
        this.a.zzaz().zzg();
        this.D |= this.E != j;
        this.E = j;
    }

    @WorkerThread
    public final void n(long j) {
        this.a.zzaz().zzg();
        this.D |= this.z != j;
        this.z = j;
    }

    @WorkerThread
    public final void o(long j) {
        this.a.zzaz().zzg();
        this.D |= this.A != j;
        this.A = j;
    }

    @WorkerThread
    public final void p(long j) {
        this.a.zzaz().zzg();
        this.D |= this.y != j;
        this.y = j;
    }

    @WorkerThread
    public final void q(long j) {
        this.a.zzaz().zzg();
        this.D |= this.x != j;
        this.x = j;
    }

    @WorkerThread
    public final void r(long j) {
        this.a.zzaz().zzg();
        this.D |= this.B != j;
        this.B = j;
    }

    @WorkerThread
    public final void s(long j) {
        this.a.zzaz().zzg();
        this.D |= this.w != j;
        this.w = j;
    }

    @WorkerThread
    public final void t(long j) {
        this.a.zzaz().zzg();
        this.D |= this.n != j;
        this.n = j;
    }

    @WorkerThread
    public final void u(long j) {
        this.a.zzaz().zzg();
        this.D |= this.t != j;
        this.t = j;
    }

    @WorkerThread
    public final void v(long j) {
        this.a.zzaz().zzg();
        this.D |= this.F != j;
        this.F = j;
    }

    @WorkerThread
    public final void w(@Nullable String str) {
        this.a.zzaz().zzg();
        this.D |= !zzkz.B(this.f, str);
        this.f = str;
    }

    @WorkerThread
    public final void x(@Nullable String str) {
        this.a.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ zzkz.B(this.v, str);
        this.v = str;
    }

    @WorkerThread
    public final void y(@Nullable String str) {
        this.a.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ zzkz.B(this.d, str);
        this.d = str;
    }

    @WorkerThread
    public final void z(long j) {
        this.a.zzaz().zzg();
        this.D |= this.m != j;
        this.m = j;
    }
}
