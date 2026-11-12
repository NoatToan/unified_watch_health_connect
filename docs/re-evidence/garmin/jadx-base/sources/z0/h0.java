package z0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.r2;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.z1;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import b0.g1;
import b0.i1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import z0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class h0<T extends n0> extends i1 {
    public static final c G = new c();
    public int A;
    public boolean B;
    public d C;
    public l2.c D;
    public final Map<u, List<Size>> E;
    public final a F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DeferrableSurface f200630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r0.o f200631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e0 f200632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l2.b f200633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.concurrent.futures.b.d f200634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g1 f200635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n0.a f200636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0.r f200637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Rect f200638z;

    public class a implements z1.a<e0> {
        public a() {
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void a(e0 e0Var) {
            e0 e0Var2 = e0Var;
            if (e0Var2 == null) {
                vb.h.s("StreamInfo can't be null");
                return;
            }
            h0 h0Var = h0.this;
            if (h0Var.f200636x == n0.a.INACTIVE) {
                return;
            }
            Objects.toString(h0Var.f200632t);
            e0Var2.toString();
            e0 e0Var3 = h0Var.f200632t;
            h0Var.f200632t = e0Var2;
            q2 q2Var = h0Var.f13970i;
            q2Var.getClass();
            int iA = e0Var3.a();
            int iA2 = e0Var2.a();
            Set<Integer> set = e0.f200613b;
            if ((!set.contains(Integer.valueOf(iA)) && !set.contains(Integer.valueOf(iA2)) && iA != iA2) || (h0Var.B && e0Var3.b() != null && e0Var2.b() == null)) {
                h0Var.N();
                return;
            }
            if ((e0Var3.a() != -1 && e0Var2.a() == -1) || (e0Var3.a() == -1 && e0Var2.a() != -1)) {
                h0Var.H(h0Var.f200633u, e0Var2, q2Var);
                Object[] objArr = {h0Var.f200633u.c()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                h0Var.E(Collections.unmodifiableList(arrayList));
                h0Var.q();
                return;
            }
            if (e0Var3.c() != e0Var2.c()) {
                h0Var.H(h0Var.f200633u, e0Var2, q2Var);
                Object[] objArr2 = {h0Var.f200633u.c()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                h0Var.E(Collections.unmodifiableList(arrayList2));
                Iterator it = h0Var.f13963b.iterator();
                while (it.hasNext()) {
                    ((i1.c) it.next()).l(h0Var);
                }
            }
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void onError(Throwable th3) {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a1.a<?> f200641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Range<Integer> f200642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Range<Integer> f200643c;

        static {
            r2 r2Var = r2.VIDEO_RECORD;
            k0 k0Var = new k0();
            f200642b = new Range<>(30, 30);
            f200643c = new Range<>(120, 120);
            b0.b0 b0Var = b0.b0.f13854d;
            b bVar = new b(k0Var);
            androidx.camera.core.impl.h hVar = b3.f5512y;
            w1 w1Var = bVar.f200640a;
            w1Var.X(hVar, 5);
            w1Var.X(b3.I, r2Var);
            w1Var.X(a1.a.P, g1.h0.f74714c);
            w1Var.X(m1.f5634j, b0Var);
            f200641a = new a1.a<>(a2.T(w1Var));
        }
    }

    public static class d implements z1.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CameraControlInternal f200644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f200645b = false;

        public d(CameraControlInternal cameraControlInternal) {
            this.f200644a = cameraControlInternal;
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void a(Boolean bool) {
            k7.h.f(j0.u.b(), "SourceStreamRequirementObserver can be updated from main thread only");
            boolean zEquals = Boolean.TRUE.equals(bool);
            if (this.f200645b == zEquals) {
                return;
            }
            this.f200645b = zEquals;
            CameraControlInternal cameraControlInternal = this.f200644a;
            if (cameraControlInternal != null) {
                if (zEquals) {
                    cameraControlInternal.h();
                } else {
                    cameraControlInternal.f();
                }
            }
        }

        @Override // androidx.camera.core.impl.z1.a
        public final void onError(Throwable th3) {
        }
    }

    public h0(a1.a<T> aVar) {
        super(aVar);
        this.f200632t = e0.f200612a;
        this.f200633u = new l2.b();
        this.f200634v = null;
        this.f200636x = n0.a.INACTIVE;
        this.B = false;
        this.E = Collections.EMPTY_MAP;
        this.F = new a();
    }

    public static void F(HashSet hashSet, int i14, int i15, Size size, g1.f0 f0Var) {
        if (i14 > size.getWidth() || i15 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i14, ((Integer) f0Var.e(i14).clamp(Integer.valueOf(i15))).intValue()));
        } catch (IllegalArgumentException unused) {
        }
        try {
            hashSet.add(new Size(((Integer) f0Var.a(i15).clamp(Integer.valueOf(i14))).intValue(), i15));
        } catch (IllegalArgumentException unused2) {
        }
    }

    public static int G(boolean z14, int i14, int i15, Range<Integer> range) {
        int i16 = i14 % i15;
        if (i16 != 0) {
            i14 = z14 ? i14 - i16 : i14 + (i15 - i16);
        }
        return ((Integer) range.clamp(Integer.valueOf(i14))).intValue();
    }

    public static g1.f0 O(g1.f0.a aVar, b1.i iVar, q qVar, b0.b0 b0Var) {
        g1.f0 f0VarFind = aVar.find(f1.d.c(qVar, b0Var, iVar).f67779a);
        if (f0VarFind == null) {
            return null;
        }
        return i1.e.k(f0VarFind, iVar != null ? iVar.f().j() : null);
    }

    @Override // b0.i1
    public final void C(Rect rect) {
        this.f13972k = rect;
        P();
    }

    public final void H(l2.b bVar, e0 e0Var, q2 q2Var) {
        DeferrableSurface deferrableSurface;
        boolean z14 = e0Var.a() == -1;
        boolean z15 = e0Var.c() == e0.a.ACTIVE;
        if (z14 && z15) {
            vb.h.z("Unexpected stream state, stream is error but active");
            return;
        }
        bVar.f5611a.clear();
        bVar.f5612b.f5821a.clear();
        b0.b0 b0VarB = q2Var.b();
        if (!z14 && (deferrableSurface = this.f200630r) != null) {
            if (z15) {
                bVar.b(deferrableSurface, b0VarB, -1);
            } else {
                androidx.camera.core.impl.o.b bVarA = l2.f.a(deferrableSurface);
                if (b0VarB == null) {
                    j20.x.l("Null dynamicRange");
                    return;
                } else {
                    bVarA.f5663e = b0VarB;
                    bVar.f5611a.add(bVarA.a());
                }
            }
        }
        androidx.concurrent.futures.b.d dVar = this.f200634v;
        if (dVar != null) {
            dVar.cancel(false);
        }
        androidx.concurrent.futures.b.d dVarA = androidx.concurrent.futures.b.a(new xj1.b(11, this, bVar));
        this.f200634v = dVarA;
        l0.j.a(dVarA, new j0(this, dVarA, z15), k0.b.d());
    }

    public final void I() {
        j0.u.a();
        l2.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
            this.D = null;
        }
        DeferrableSurface deferrableSurface = this.f200630r;
        if (deferrableSurface != null) {
            deferrableSurface.a();
            this.f200630r = null;
        }
        r0.r rVar = this.f200637y;
        if (rVar != null) {
            rVar.b();
            this.f200637y = null;
        }
        r0.o oVar = this.f200631s;
        if (oVar != null) {
            oVar.c();
            this.f200631s = null;
        }
        this.f200638z = null;
        this.f200635w = null;
        this.f200632t = e0.f200612a;
        this.A = 0;
        this.B = false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    public final l2.b J(a1.a<T> aVar, q2 q2Var) {
        q qVar;
        androidx.camera.core.impl.l0 l0Var;
        int i14;
        Rect rectJ;
        Size size;
        r0.r rVar;
        a1.a<T> aVar2;
        j0.u.a();
        androidx.camera.core.impl.l0 l0VarC = c();
        l0VarC.getClass();
        Size sizeF = q2Var.f();
        g0 g0Var = new g0(this, 0);
        Range<Integer> rangeC = q2Var.c();
        if (Objects.equals(rangeC, q2.f5715a)) {
            rangeC = q2Var.g() == 1 ? c.f200643c : c.f200642b;
        }
        Range<Integer> range = rangeC;
        ListenableFuture<q> listenableFutureB = L().e().b();
        if (listenableFutureB.isDone()) {
            try {
                qVar = listenableFutureB.get();
            } catch (InterruptedException | ExecutionException e4) {
                yc.l2.p(e4);
                return null;
            }
        } else {
            qVar = null;
        }
        q qVar2 = qVar;
        Objects.requireNonNull(qVar2);
        int iG = q2Var.g();
        f0 f0VarC = L().c(l0VarC.b(), iG);
        b0.b0 b0VarB = q2Var.b();
        b1.i iVarB = f0VarC.b(sizeF, b0VarB);
        g1.f0.a aVar3 = (g1.f0.a) aVar.e(a1.a.P);
        Objects.requireNonNull(aVar3);
        g1.f0 f0VarO = O(aVar3, iVarB, qVar2, b0VarB);
        this.A = K(l0VarC);
        Rect rect = this.f13972k;
        if (rect == null) {
            rect = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
        }
        if (f0VarO == null || f0VarO.b(rect.width(), rect.height())) {
            l0Var = l0VarC;
            i14 = 0;
        } else {
            String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", j0.v.h(rect), Integer.valueOf(f0VarO.j()), Integer.valueOf(f0VarO.i()), f0VarO.f(), f0VarO.g());
            g1.f0 a0Var = (!(f0VarO.f().contains(Integer.valueOf(rect.width())) && f0VarO.g().contains(Integer.valueOf(rect.height()))) && f0VarO.h() && f0VarO.g().contains(Integer.valueOf(rect.width())) && f0VarO.f().contains(Integer.valueOf(rect.height()))) ? new g1.a0(f0VarO) : f0VarO;
            int iJ = a0Var.j();
            int i15 = a0Var.i();
            Range<Integer> rangeF = a0Var.f();
            Range<Integer> rangeG = a0Var.g();
            l0Var = l0VarC;
            int iG2 = G(true, rect.width(), iJ, rangeF);
            int iG3 = G(false, rect.width(), iJ, rangeF);
            int iG4 = G(true, rect.height(), i15, rangeG);
            int iG5 = G(false, rect.height(), i15, rangeG);
            HashSet hashSet = new HashSet();
            F(hashSet, iG2, iG4, sizeF, a0Var);
            F(hashSet, iG2, iG5, sizeF, a0Var);
            F(hashSet, iG3, iG4, sizeF, a0Var);
            F(hashSet, iG3, iG5, sizeF, a0Var);
            if (hashSet.isEmpty()) {
                i14 = 0;
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                arrayList.toString();
                Collections.sort(arrayList, new ww0.d(rect, 4));
                arrayList.toString();
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    i14 = 0;
                } else {
                    k7.h.f(width % 2 == 0 && height % 2 == 0 && width <= sizeF.getWidth() && height <= sizeF.getHeight(), null);
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        int iMax = Math.max(0, rect.centerX() - (width / 2));
                        rect2.left = iMax;
                        int i16 = iMax + width;
                        rect2.right = i16;
                        if (i16 > sizeF.getWidth()) {
                            int width2 = sizeF.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != rect.height()) {
                        i14 = 0;
                        int iMax2 = Math.max(0, rect.centerY() - (height / 2));
                        rect2.top = iMax2;
                        int i17 = iMax2 + height;
                        rect2.bottom = i17;
                        if (i17 > sizeF.getHeight()) {
                            int height2 = sizeF.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    } else {
                        i14 = 0;
                    }
                    j0.v.h(rect);
                    j0.v.h(rect2);
                    rect = rect2;
                }
            }
        }
        int i18 = this.A;
        if (this.f200632t.b() != null) {
            g1.g gVarB = this.f200632t.b();
            gVarB.getClass();
            rectJ = j0.v.j(j0.v.i(j0.v.g(gVarB.a()), i18));
        } else {
            rectJ = rect;
        }
        this.f200638z = rectJ;
        if (this.f200632t.b() == null || rectJ.equals(rect)) {
            size = sizeF;
        } else {
            float fHeight = rectJ.height() / rect.height();
            size = new Size((int) Math.ceil(sizeF.getWidth() * fHeight), (int) Math.ceil(sizeF.getHeight() * fHeight));
        }
        if (this.f200632t.b() != null) {
            this.B = true;
        }
        Rect rect3 = this.f200638z;
        int i19 = this.A;
        androidx.camera.core.impl.l0 l0Var2 = l0Var;
        boolean zM = M(l0Var2, aVar, iG, rect3, sizeF, b0VarB);
        if (((SizeCannotEncodeVideoQuirk) e1.a.f61851a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            Size sizeI = j0.v.i(j0.v.g(rect3), zM ? i19 : i14);
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeI)) {
                int i24 = f0VarO != null ? f0VarO.i() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == sizeI.getHeight()) {
                    rect4.left += i24;
                    rect4.right -= i24;
                } else {
                    rect4.top += i24;
                    rect4.bottom -= i24;
                }
                rect3 = rect4;
            }
        }
        this.f200638z = rect3;
        if (M(l0Var2, aVar, iG, rect3, sizeF, b0VarB)) {
            androidx.camera.core.impl.l0 l0VarC2 = c();
            Objects.requireNonNull(l0VarC2);
            b0.l lVar = this.f13976o;
            rVar = new r0.r(l0VarC2, lVar != null ? new r0.s(lVar) : new r0.e(b0VarB));
        } else {
            rVar = null;
        }
        this.f200637y = rVar;
        boolean z14 = (l0Var2.j() && this.f200637y == null) ? i14 : 1;
        x2 x2VarN = (this.f200637y == null && l0Var2.j()) ? x2.UPTIME : l0Var2.c().n();
        Objects.toString(l0Var2.c().n());
        Objects.toString(x2VarN);
        androidx.camera.core.impl.q.b bVarI = q2Var.i();
        bVarI.c(size);
        bVarI.b(range);
        androidx.camera.core.impl.q qVarA = bVarI.a();
        k7.h.f(this.f200631s == null ? 1 : i14, null);
        r0.o oVar = new r0.o(2, 34, qVarA, this.f13973l, l0Var2.j(), this.f200638z, this.A, ((n1) this.f13969h).q(), (l0Var2.j() && o(l0Var2)) ? 1 : i14);
        this.f200631s = oVar;
        oVar.a(g0Var);
        r0.r rVar2 = this.f200637y;
        r0.o oVar2 = this.f200631s;
        if (rVar2 != null) {
            int i25 = oVar2.f148748f;
            int i26 = oVar2.f148743a;
            Rect rect5 = oVar2.f148746d;
            t0.b bVar = new t0.b(UUID.randomUUID(), i25, i26, rect5, j0.v.i(j0.v.g(rect5), oVar2.f148751i), oVar2.f148751i, oVar2.f148747e, false);
            r0.o oVar3 = this.f200637y.c(new r0.c(this.f200631s, Collections.singletonList(bVar))).get(bVar);
            Objects.requireNonNull(oVar3);
            aVar2 = aVar;
            oVar3.a(new androidx.media3.exoplayer.n0(this, oVar3, l0Var2, aVar2, x2VarN, z14, 2));
            this.f200635w = oVar3.d(l0Var2, true);
            r0.o oVar4 = this.f200631s;
            oVar4.getClass();
            j0.u.a();
            oVar4.b();
            k7.h.f(!oVar4.f148752j, "Consumer can only be linked once.");
            oVar4.f148752j = true;
            r0.o.a aVar4 = oVar4.f148754l;
            this.f200630r = aVar4;
            l0.j.f(aVar4.f5471e).addListener(new vg1.d(25, this, aVar4), k0.b.d());
        } else {
            aVar2 = aVar;
            g1 g1VarD = oVar2.d(l0Var2, true);
            this.f200635w = g1VarD;
            this.f200630r = g1VarD.f13917m;
        }
        n0 n0Var = (n0) aVar2.e(a1.a.O);
        Objects.requireNonNull(n0Var);
        n0Var.b(this.f200635w, x2VarN, z14);
        P();
        this.f200630r.f5476j = MediaCodec.class;
        l2.b bVarD = l2.b.d(aVar2, q2Var.f());
        bVarD.f5618h = iG;
        a(bVarD, q2Var);
        int iL = aVar2.l();
        if (iL != 0) {
            v0.a aVar5 = bVarD.f5612b;
            aVar5.getClass();
            if (iL != 0) {
                aVar5.f5822b.X(b3.G, Integer.valueOf(iL));
            }
        }
        l2.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
        }
        l2.c cVar2 = new l2.c(new m2(this, 4));
        this.D = cVar2;
        bVarD.f5616f = cVar2;
        if (q2Var.d() != null) {
            bVarD.a(q2Var.d());
        }
        return bVarD;
    }

    public final int K(androidx.camera.core.impl.l0 l0Var) {
        boolean zO = o(l0Var);
        int iH = h(l0Var, zO);
        if (this.f200632t.b() == null) {
            return iH;
        }
        g1.g gVarB = this.f200632t.b();
        Objects.requireNonNull(gVarB);
        int iB = gVarB.b();
        if (zO != gVarB.f()) {
            iB = -iB;
        }
        return j0.v.l(iH - iB);
    }

    public final T L() {
        T t7 = (T) ((a1.a) this.f13969h).e(a1.a.O);
        Objects.requireNonNull(t7);
        return t7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    public final boolean M(androidx.camera.core.impl.l0 l0Var, a1.a<?> aVar, int i14, Rect rect, Size size, b0.b0 b0Var) {
        if (i14 == 1) {
            return false;
        }
        if (this.f13976o == null) {
            if (l0Var.j()) {
                Boolean bool = (Boolean) aVar.f(a1.a.Q, Boolean.FALSE);
                Objects.requireNonNull(bool);
                if (!bool.booleanValue()) {
                    if (l0Var.j() || (!SurfaceProcessingQuirk.d(e1.a.f61851a) && !SurfaceProcessingQuirk.d(l0Var.c().j()))) {
                        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) e1.a.f61851a.b(HdrRepeatingRequestFailureQuirk.class);
                        if (!l0Var.j() && hdrRepeatingRequestFailureQuirk != null) {
                            boolean z14 = b0Var != b0.b0.f13854d;
                            if (!"samsung".equalsIgnoreCase(Build.BRAND) || !"pa3q".equalsIgnoreCase(Build.DEVICE) || !z14) {
                                if (size.getWidth() == rect.width()) {
                                    if (l0Var.j()) {
                                    }
                                }
                            }
                        } else if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
                            return (!l0Var.j() && o(l0Var)) || this.f200632t.b() != null;
                        }
                    }
                }
            } else if (l0Var.j()) {
                HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk2 = (HdrRepeatingRequestFailureQuirk) e1.a.f61851a.b(HdrRepeatingRequestFailureQuirk.class);
                if (!l0Var.j()) {
                    if (size.getWidth() == rect.width()) {
                        if (l0Var.j()) {
                        }
                    }
                } else if (size.getWidth() == rect.width()) {
                    if (l0Var.j()) {
                    }
                }
            } else {
                HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk3 = (HdrRepeatingRequestFailureQuirk) e1.a.f61851a.b(HdrRepeatingRequestFailureQuirk.class);
                if (!l0Var.j()) {
                    if (size.getWidth() == rect.width()) {
                        if (l0Var.j()) {
                        }
                    }
                } else if (size.getWidth() == rect.width()) {
                    if (l0Var.j()) {
                    }
                }
            }
        }
        return true;
    }

    public final void N() {
        if (c() == null) {
            return;
        }
        I();
        a1.a<T> aVar = (a1.a) this.f13969h;
        q2 q2Var = this.f13970i;
        q2Var.getClass();
        l2.b bVarJ = J(aVar, q2Var);
        this.f200633u = bVarJ;
        H(bVarJ, this.f200632t, this.f13970i);
        Object[] objArr = {this.f200633u.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
    }

    public final void P() {
        androidx.camera.core.impl.l0 l0VarC = c();
        r0.o oVar = this.f200631s;
        if (l0VarC == null || oVar == null) {
            return;
        }
        int iK = K(l0VarC);
        this.A = iK;
        j0.u.c(new com.mapbox.maps.d(oVar, iK, ((n1) this.f13969h).q(), 4));
    }

    @Override // b0.i1
    public final b3<?> f(boolean z14, c3 c3Var) {
        G.getClass();
        a1.a<?> aVar = c.f200641a;
        x0 x0VarA = c3Var.a(aVar.y(), 1);
        if (z14) {
            x0VarA = x0.P(x0VarA, aVar);
        }
        if (x0VarA == null) {
            return null;
        }
        return new a1.a(a2.T(b.f(x0VarA).f200640a));
    }

    @Override // b0.i1
    public final Set<b0.b0> j(androidx.camera.core.impl.k0 k0Var) {
        return L().c(k0Var, 0).a();
    }

    @Override // b0.i1
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // b0.i1
    public final b3.b<?, ?, ?> m(x0 x0Var) {
        return b.f(x0Var);
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    @Override // b0.i1
    public final b3<?> u(androidx.camera.core.impl.k0 k0Var, b3.b<?, ?, ?> bVar) {
        q qVar;
        x xVar;
        ArrayList<u> arrayList;
        LinkedHashMap linkedHashMap;
        b1.i iVarB;
        g1.f0 f0VarO;
        HashMap map;
        b0.b0 b0Var;
        ListenableFuture<q> listenableFutureB = L().e().b();
        if (listenableFutureB.isDone()) {
            try {
                qVar = listenableFutureB.get();
            } catch (InterruptedException | ExecutionException e4) {
                yc.l2.p(e4);
                return null;
            }
        } else {
            qVar = null;
        }
        q qVar2 = qVar;
        if (qVar2 == null) {
            vb.h.s("MediaSpec can't be null");
            return null;
        }
        x xVarE = qVar2.d().e();
        a1.a aVar = (a1.a) bVar.b();
        if (aVar.b(n1.f5652t)) {
            k7.h.b(xVarE == p0.f200705b, "Custom ordered resolutions and QualitySelector can't both be set");
        } else {
            b0.b0 b0VarO = aVar.o();
            int sessionType = aVar.getSessionType();
            Range<Integer> rangeM = aVar.M(q2.f5715a);
            Objects.requireNonNull(rangeM);
            f0 f0VarC = L().c(k0Var, sessionType);
            b0VarO.toString();
            rangeM.toString();
            ArrayList arrayListD = f0VarC.d(b0VarO);
            Objects.toString(arrayListD);
            if (arrayListD.isEmpty() && sessionType == 1) {
                vb.h.s("No supported quality on the device for high-speed capture.");
                return null;
            }
            if (!arrayListD.isEmpty()) {
                xVarE.getClass();
                if (arrayListD.isEmpty()) {
                    arrayList = new ArrayList();
                    xVar = xVarE;
                } else {
                    arrayListD.toString();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (u uVar : xVarE.f200721a) {
                        if (uVar == u.f200713f) {
                            linkedHashSet.addAll(arrayListD);
                            break;
                        }
                        if (uVar == u.f200712e) {
                            ArrayList arrayList2 = new ArrayList(arrayListD);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (arrayListD.contains(uVar)) {
                            linkedHashSet.add(uVar);
                        } else {
                            Objects.toString(uVar);
                        }
                    }
                    n nVar = xVarE.f200722b;
                    if (arrayListD.isEmpty() || linkedHashSet.containsAll(arrayListD)) {
                        xVar = xVarE;
                    } else {
                        Objects.toString(nVar);
                        if (nVar == n.f200695a) {
                            xVar = xVarE;
                        } else {
                            k7.h.f(nVar instanceof n.b, "Currently only support type RuleStrategy");
                            n.b bVar2 = (n.b) nVar;
                            ArrayList arrayList3 = new ArrayList(u.f200716i);
                            u uVarA = bVar2.a() == u.f200713f ? (u) arrayList3.get(0) : bVar2.a() == u.f200712e ? (u) am.j.f(1, arrayList3) : bVar2.a();
                            int iIndexOf = arrayList3.indexOf(uVarA);
                            xVar = xVarE;
                            k7.h.f(iIndexOf != -1, null);
                            ArrayList arrayList4 = new ArrayList();
                            int i14 = iIndexOf - 1;
                            while (i14 >= 0) {
                                u uVar2 = uVarA;
                                u uVar3 = (u) arrayList3.get(i14);
                                if (arrayListD.contains(uVar3)) {
                                    arrayList4.add(uVar3);
                                }
                                i14--;
                                uVarA = uVar2;
                            }
                            u uVar4 = uVarA;
                            ArrayList arrayList5 = new ArrayList();
                            while (true) {
                                iIndexOf++;
                                if (iIndexOf >= arrayList3.size()) {
                                    break;
                                }
                                u uVar5 = (u) arrayList3.get(iIndexOf);
                                if (arrayListD.contains(uVar5)) {
                                    arrayList5.add(uVar5);
                                }
                            }
                            arrayList3.toString();
                            Objects.toString(uVar4);
                            arrayList4.toString();
                            arrayList5.toString();
                            int iB = bVar2.b();
                            if (iB != 0) {
                                if (iB == 1) {
                                    linkedHashSet.addAll(arrayList4);
                                    linkedHashSet.addAll(arrayList5);
                                } else if (iB == 2) {
                                    linkedHashSet.addAll(arrayList4);
                                } else if (iB == 3) {
                                    linkedHashSet.addAll(arrayList5);
                                    linkedHashSet.addAll(arrayList4);
                                } else {
                                    if (iB != 4) {
                                        com.nimbusds.jose.shaded.gson.internal.a.y(nVar, "Unhandled fallback strategy: ");
                                        return null;
                                    }
                                    linkedHashSet.addAll(arrayList5);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                arrayList.toString();
                xVar.toString();
                if (arrayList.isEmpty()) {
                    vb.h.s("Unable to find selected quality");
                    return null;
                }
                g1.f0.a aVar2 = (g1.f0.a) aVar.e(a1.a.P);
                Objects.requireNonNull(aVar2);
                int iB2 = qVar2.d().b();
                HashMap map2 = new HashMap();
                for (u uVar6 : f0VarC.d(b0VarO)) {
                    b1.i iVarC = f0VarC.c(uVar6, b0VarO);
                    Objects.requireNonNull(iVarC);
                    map2.put(uVar6, iVarC.f().j());
                }
                w wVar = new w(sessionType == 1 ? q2.f5715a.equals(rangeM) ? k0Var.p() : k0Var.d(rangeM) : k0Var.getSupportedResolutions(this.f13969h.z()), map2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (u uVar7 : arrayList) {
                    List list = (List) wVar.f200720a.get(new h(uVar7, iB2));
                    linkedHashMap2.put(uVar7, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry.getValue());
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            Size size = (Size) it3.next();
                            if (!map2.containsValue(size) && (iVarB = f0VarC.b(size, b0VarO)) != null) {
                                if (b0VarO.b()) {
                                    f0VarO = O(aVar2, iVarB, qVar2, b0VarO);
                                } else {
                                    int i15 = Integer.MIN_VALUE;
                                    g1.f0 f0Var = null;
                                    for (f1.c cVar : ((b1.a) iVarB).f14185d) {
                                        Iterator it4 = it;
                                        if (h1.b.a(cVar, b0VarO)) {
                                            int iF = cVar.f();
                                            map = map2;
                                            HashMap map3 = h1.b.f80736d;
                                            b0Var = b0VarO;
                                            k7.h.a(map3.containsKey(Integer.valueOf(iF)));
                                            Integer num = (Integer) map3.get(Integer.valueOf(iF));
                                            Objects.requireNonNull(num);
                                            int iIntValue = num.intValue();
                                            int iA = cVar.a();
                                            HashMap map4 = h1.b.f80735c;
                                            k7.h.a(map4.containsKey(Integer.valueOf(iA)));
                                            Integer num2 = (Integer) map4.get(Integer.valueOf(iA));
                                            Objects.requireNonNull(num2);
                                            g1.f0 f0VarO2 = O(aVar2, iVarB, qVar2, new b0.b0(iIntValue, num2.intValue()));
                                            if (f0VarO2 != null) {
                                                int iIntValue2 = ((Integer) f0VarO2.f().getUpper()).intValue();
                                                int iIntValue3 = ((Integer) f0VarO2.g().getUpper()).intValue();
                                                Size size2 = q0.c.f141971a;
                                                int i16 = iIntValue2 * iIntValue3;
                                                if (i16 > i15) {
                                                    f0Var = f0VarO2;
                                                    i15 = i16;
                                                }
                                            }
                                        } else {
                                            map = map2;
                                            b0Var = b0VarO;
                                        }
                                        it = it4;
                                        map2 = map;
                                        b0VarO = b0Var;
                                    }
                                    f0VarO = f0Var;
                                }
                                Iterator it5 = it;
                                HashMap map5 = map2;
                                b0.b0 b0Var2 = b0VarO;
                                if (f0VarO != null && !f0VarO.b(size.getWidth(), size.getHeight())) {
                                    it3.remove();
                                }
                                it = it5;
                                map2 = map5;
                                b0VarO = b0Var2;
                            }
                        }
                        Iterator it6 = it;
                        HashMap map6 = map2;
                        b0.b0 b0Var3 = b0VarO;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap3.put((u) entry.getKey(), arrayList6);
                        }
                        it = it6;
                        map2 = map6;
                        b0VarO = b0Var3;
                    }
                    linkedHashMap = linkedHashMap3;
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it7 = linkedHashMap.values().iterator();
                while (it7.hasNext()) {
                    arrayList7.addAll((List) it7.next());
                }
                arrayList7.toString();
                ((w1) bVar.d()).X(n1.f5652t, arrayList7);
            }
        }
        return bVar.b();
    }

    @Override // b0.i1
    public final void v() {
        this.f13962a = true;
        e();
        q2 q2Var = this.f13970i;
        if (q2Var == null || this.f200635w != null) {
            return;
        }
        z1<e0> z1VarF = L().f();
        e0 e0Var = e0.f200612a;
        ListenableFuture<e0> listenableFutureB = z1VarF.b();
        if (listenableFutureB.isDone()) {
            try {
                e0Var = listenableFutureB.get();
            } catch (InterruptedException | ExecutionException e4) {
                yc.l2.p(e4);
                return;
            }
        }
        this.f200632t = e0Var;
        l2.b bVarJ = J((a1.a) this.f13969h, q2Var);
        this.f200633u = bVarJ;
        H(bVarJ, this.f200632t, q2Var);
        Object[] objArr = {this.f200633u.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        this.f13965d = i1.b.ACTIVE;
        r();
        L().f().d(k0.b.d(), this.F);
        d dVar = this.C;
        if (dVar != null) {
            k7.h.f(j0.u.b(), "SourceStreamRequirementObserver can be closed from main thread only");
            CameraControlInternal cameraControlInternal = dVar.f200644a;
            if (cameraControlInternal != null) {
                if (dVar.f200645b) {
                    dVar.f200645b = false;
                    cameraControlInternal.f();
                }
                dVar.f200644a = null;
            }
        }
        this.C = new d(d());
        L().g().d(k0.b.d(), this.C);
        n0.a aVar = n0.a.ACTIVE_NON_STREAMING;
        if (aVar != this.f200636x) {
            this.f200636x = aVar;
            L().d(aVar);
        }
    }

    @Override // b0.i1
    public final void w() {
        k7.h.f(j0.u.b(), "VideoCapture can only be detached on the main thread.");
        if (this.C != null) {
            L().g().c(this.C);
            d dVar = this.C;
            dVar.getClass();
            k7.h.f(j0.u.b(), "SourceStreamRequirementObserver can be closed from main thread only");
            CameraControlInternal cameraControlInternal = dVar.f200644a;
            if (cameraControlInternal != null) {
                if (dVar.f200645b) {
                    dVar.f200645b = false;
                    cameraControlInternal.f();
                }
                dVar.f200644a = null;
            }
            this.C = null;
        }
        n0.a aVar = n0.a.INACTIVE;
        if (aVar != this.f200636x) {
            this.f200636x = aVar;
            L().d(aVar);
        }
        L().f().c(this.F);
        androidx.concurrent.futures.b.d dVar2 = this.f200634v;
        if (dVar2 != null) {
            dVar2.cancel(false);
        }
        I();
    }

    @Override // b0.i1
    public final q2 x(x0 x0Var) {
        this.f200633u.f5612b.c(x0Var);
        Object[] objArr = {this.f200633u.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q2 q2Var = this.f13970i;
        Objects.requireNonNull(q2Var);
        androidx.camera.core.impl.q.b bVarI = q2Var.i();
        bVarI.f5710f = x0Var;
        return bVarI.a();
    }

    @Override // b0.i1
    public final q2 y(q2 q2Var, q2 q2Var2) {
        Objects.toString(q2Var);
        Objects.toString(q2Var2);
        ArrayList arrayListP = ((a1.a) this.f13969h).p();
        if (arrayListP != null && !arrayListP.contains(q2Var.f())) {
            Objects.toString(q2Var.f());
            arrayListP.toString();
        }
        return q2Var;
    }

    public static final class b<T extends n0> implements b3.b<h0<T>, a1.a<T>, b<T>>, n1.a<b<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f200640a;

        private b(w1 w1Var) {
            this.f200640a = w1Var;
            if (!w1Var.N.containsKey(a1.a.O)) {
                vb.h.s("VideoOutput is required");
                throw null;
            }
            androidx.camera.core.impl.h hVar = m0.m.L;
            Class cls = (Class) w1Var.f(hVar, null);
            if (cls != null && !cls.equals(h0.class)) {
                c22.t.i("Invalid target class configuration for ", this, ": ", cls);
                throw null;
            }
            w1Var.X(b3.E, c3.b.VIDEO_CAPTURE);
            w1Var.X(hVar, h0.class);
            androidx.camera.core.impl.h hVar2 = m0.m.K;
            if (w1Var.f(hVar2, null) == null) {
                w1Var.X(hVar2, h0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        public static b<? extends n0> f(x0 x0Var) {
            return new b<>(w1.V(x0Var));
        }

        @Override // androidx.camera.core.impl.n1.a
        public final Object a(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.b3.b
        public final b3 b() {
            return new a1.a(a2.T(this.f200640a));
        }

        @Override // androidx.camera.core.impl.n1.a
        public final Object c(int i14) {
            this.f200640a.X(n1.f5644l, Integer.valueOf(i14));
            return this;
        }

        @Override // b0.c0
        public final v1 d() {
            return this.f200640a;
        }

        @Override // androidx.camera.core.impl.n1.a
        public final Object e(u0.c cVar) {
            this.f200640a.X(n1.f5651s, cVar);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(T t7) {
            w1 w1VarU = w1.U();
            w1VarU.X(a1.a.O, t7);
            this(w1VarU);
        }
    }
}
