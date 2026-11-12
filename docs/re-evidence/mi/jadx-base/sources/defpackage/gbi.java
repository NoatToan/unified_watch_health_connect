package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class gbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContentResolver f18809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f18810b;
    public AssetManager c;
    public final v63 d;
    public final n3d e;
    public final kci f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final bg8 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n3i f18811k;
    public final z53 l;
    public final z53 m;
    public final gpf<c93, PooledByteBuffer> n;
    public final gpf<c93, u14> o;
    public final f93 p;
    public final f0i q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18812r;
    public final int s;
    public boolean t;
    public final x14 u;
    public final int v;

    public gbi(Context context, v63 v63Var, n3d n3dVar, kci kciVar, boolean z, boolean z2, boolean z3, bg8 bg8Var, n3i n3iVar, gpf<c93, u14> gpfVar, gpf<c93, PooledByteBuffer> gpfVar2, z53 z53Var, z53 z53Var2, f93 f93Var, f0i f0iVar, int i, int i2, boolean z4, int i3, x14 x14Var) {
        this.f18809a = context.getApplicationContext().getContentResolver();
        this.f18810b = context.getApplicationContext().getResources();
        this.c = context.getApplicationContext().getAssets();
        this.d = v63Var;
        this.e = n3dVar;
        this.f = kciVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = bg8Var;
        this.f18811k = n3iVar;
        this.o = gpfVar;
        this.n = gpfVar2;
        this.l = z53Var;
        this.m = z53Var2;
        this.p = f93Var;
        this.q = f0iVar;
        this.f18812r = i;
        this.s = i2;
        this.t = z4;
        this.v = i3;
        this.u = x14Var;
    }

    public static <T> zqo<T> A(dbi<T> dbiVar) {
        return new zqo<>(dbiVar);
    }

    public static bt0 a(dbi<o98> dbiVar) {
        return new bt0(dbiVar);
    }

    public static j53 g(dbi<o98> dbiVar, dbi<o98> dbiVar2) {
        return new j53(dbiVar, dbiVar2);
    }

    public <T> sdp<T> B(dbi<T> dbiVar) {
        return new sdp<>(5, this.j.a(), dbiVar);
    }

    public ydp C(zdp<o98>[] zdpVarArr) {
        return new ydp(zdpVarArr);
    }

    public jcr D(dbi<o98> dbiVar) {
        return new jcr(this.j.b(), this.f18811k, dbiVar);
    }

    public <T> rcp<T> b(dbi<T> dbiVar, scp scpVar) {
        return new rcp<>(dbiVar, scpVar);
    }

    public wp2 c(dbi<w14<u14>> dbiVar) {
        return new wp2(this.o, this.p, dbiVar);
    }

    public yp2 d(dbi<w14<u14>> dbiVar) {
        return new yp2(this.p, dbiVar);
    }

    public zp2 e(dbi<w14<u14>> dbiVar) {
        return new zp2(this.o, this.p, dbiVar);
    }

    public fq2 f(dbi<w14<u14>> dbiVar) {
        return new fq2(dbiVar, this.f18812r, this.s, this.t);
    }

    public il5 h() {
        return new il5(this.f18811k);
    }

    public ds5 i(dbi<o98> dbiVar) {
        return new ds5(this.d, this.j.e(), this.e, this.f, this.g, this.h, this.i, dbiVar, this.v, this.u);
    }

    public iy6 j(dbi<o98> dbiVar) {
        return new iy6(this.l, this.m, this.p, dbiVar);
    }

    public ly6 k(dbi<o98> dbiVar) {
        return new ly6(this.l, this.m, this.p, dbiVar);
    }

    public m98 l(dbi<o98> dbiVar) {
        return new m98(this.p, dbiVar);
    }

    public q98 m(dbi<o98> dbiVar) {
        return new q98(this.n, this.p, dbiVar);
    }

    public uie n() {
        return new uie(this.j.c(), this.f18811k, this.c);
    }

    public bje o() {
        return new bje(this.j.c(), this.f18811k, this.f18809a);
    }

    public cje p() {
        return new cje(this.j.c(), this.f18811k, this.f18809a);
    }

    public zje q() {
        return new zje(this.j.c(), this.f18811k, this.f18809a);
    }

    public bke r() {
        return new bke(this.j.c(), this.f18811k);
    }

    public cke s() {
        return new cke(this.j.c(), this.f18811k, this.f18810b);
    }

    public sne t() {
        return new sne(this.j.c(), this.f18809a);
    }

    public dkg u(ekg ekgVar) {
        return new dkg(this.f18811k, this.d, ekgVar);
    }

    public glh v(dbi<o98> dbiVar) {
        return new glh(this.l, this.p, this.f18811k, this.d, dbiVar);
    }

    public a5i w(dbi<w14<u14>> dbiVar) {
        return new a5i(this.o, this.p, dbiVar);
    }

    public c5i x(dbi<w14<u14>> dbiVar) {
        return new c5i(dbiVar, this.q, this.j.b());
    }

    public sfi y() {
        return new sfi(this.j.c(), this.f18811k, this.f18809a);
    }

    public wpk z(dbi<o98> dbiVar, boolean z, y5d y5dVar) {
        return new wpk(this.j.b(), this.f18811k, dbiVar, z, y5dVar);
    }
}
