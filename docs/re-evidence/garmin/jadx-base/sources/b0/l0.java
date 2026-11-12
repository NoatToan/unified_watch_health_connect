package b0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.r2;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends i1 {
    public static final c C = new c();
    public l2.c A;
    public final a B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference<Integer> f14016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rational f14019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m0.h f14020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l2.b f14021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h0.y f14022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h0.p0 f14023z;

    public class a implements h0.x {
        public a() {
        }

        public final void a() {
            l0 l0Var = l0.this;
            synchronized (l0Var.f14016s) {
                try {
                    Integer andSet = l0Var.f14016s.getAndSet(null);
                    if (andSet == null) {
                        return;
                    }
                    if (andSet.intValue() != l0Var.H()) {
                        l0Var.L();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.camera.core.impl.l1 f14026a;

        static {
            r2 r2Var = r2.STILL_CAPTURE;
            u0.c.a aVar = new u0.c.a();
            aVar.f167328a = u0.a.f167321c;
            aVar.f167329b = u0.d.f167332c;
            u0.c cVarA = aVar.a();
            b0 b0Var = b0.f13854d;
            b bVar = new b();
            androidx.camera.core.impl.h hVar = b3.f5512y;
            w1 w1Var = bVar.f14025a;
            w1Var.X(hVar, 4);
            w1Var.X(b3.I, r2Var);
            w1Var.X(n1.f5643k, 0);
            w1Var.X(n1.f5651s, cVarA);
            w1Var.X(androidx.camera.core.impl.l1.S, 0);
            w1Var.X(m1.f5634j, b0Var);
            f14026a = new androidx.camera.core.impl.l1(a2.T(w1Var));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f14027a;

        public d(r rVar) {
            this.f14027a = rVar;
        }
    }

    public static final class e {
        public final String toString() {
            return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
        }
    }

    public static abstract class f {
        public void a() {
        }

        public void b(androidx.camera.core.e eVar) {
        }

        public void c(ImageCaptureException imageCaptureException) {
        }
    }

    public interface g {
        void a();

        void b();
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f14028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ContentResolver f14029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f14030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ContentValues f14031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final OutputStream f14032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f14033f;

        public h(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, e eVar) {
            this.f14028a = file;
            this.f14029b = contentResolver;
            this.f14030c = uri;
            this.f14031d = contentValues;
            this.f14032e = outputStream;
            this.f14033f = eVar == null ? new e() : eVar;
        }

        public final String toString() {
            return "OutputFileOptions{mFile=" + this.f14028a + ", mContentResolver=" + this.f14029b + ", mSaveCollection=" + this.f14030c + ", mContentValues=" + this.f14031d + ", mOutputStream=" + this.f14032e + ", mMetadata=" + this.f14033f + StringSubstitutor.DEFAULT_VAR_END;
        }
    }

    public interface j {
        void a(long j8, k kVar);

        void clear();
    }

    public interface k {
        void a();
    }

    static {
        new p0.b();
    }

    public l0(androidx.camera.core.impl.l1 l1Var) {
        super(l1Var);
        p005kotlin.jvm.internal.j jVar = null;
        this.f14016s = new AtomicReference<>(null);
        this.f14018u = -1;
        this.f14019v = null;
        this.B = new a();
        androidx.camera.core.impl.l1 l1Var2 = (androidx.camera.core.impl.l1) this.f13969h;
        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.l1.O;
        if (l1Var2.b(hVar)) {
            this.f14015r = ((Integer) l1Var2.e(hVar)).intValue();
        } else {
            this.f14015r = 1;
        }
        this.f14017t = ((Integer) l1Var2.f(androidx.camera.core.impl.l1.V, 0)).intValue();
        j jVar2 = (j) l1Var2.f(androidx.camera.core.impl.l1.X, null);
        m0.h.f115497e.getClass();
        this.f14020w = new m0.h(jVar2, jVar);
    }

    public static boolean I(int i14, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i14))) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(int i14, Map map) {
        return map.containsKey(Integer.valueOf(i14)) && !((List) map.get(Integer.valueOf(i14))).isEmpty();
    }

    public final void F(boolean z14) {
        h0.p0 p0Var;
        j0.u.a();
        l2.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
            this.A = null;
        }
        h0.y yVar = this.f14022y;
        if (yVar != null) {
            yVar.a();
            this.f14022y = null;
        }
        if (!z14 && (p0Var = this.f14023z) != null) {
            p0Var.a();
            this.f14023z = null;
        }
        d().c();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0058  */
    public final l2.b G(String str, androidx.camera.core.impl.l1 l1Var, q2 q2Var) {
        HashSet hashSet;
        int i14;
        boolean zContains;
        boolean zContains2;
        h0.f fVar;
        p1 p1Var;
        h0.f fVar2;
        j0.u.a();
        String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, q2Var);
        Size sizeF = q2Var.f();
        androidx.camera.core.impl.l0 l0VarC = c();
        Objects.requireNonNull(l0VarC);
        boolean z14 = !l0VarC.j();
        CameraCharacteristics cameraCharacteristics = null;
        if (this.f14022y != null) {
            k7.h.f(z14, null);
            this.f14022y.a();
        }
        r rVar = new d(c().b()).f14027a;
        if (rVar instanceof androidx.camera.core.impl.c) {
            androidx.camera.core.impl.e0 e0Var = ((androidx.camera.core.impl.c) rVar).f5517d;
            e0Var.getClass();
            androidx.camera.core.impl.x0 x0VarA = ((c3) e0Var.f(androidx.camera.core.impl.e0.f5531a, c3.f5519a)).a(c3.b.IMAGE_CAPTURE, 1);
            if (x0VarA != null) {
                androidx.camera.core.impl.h hVar = n1.f5650r;
                a2 a2Var = (a2) x0VarA;
                if (a2Var.N.containsKey(hVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) a2Var.e(hVar)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                } else {
                    hashSet = null;
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        if (hashSet != null) {
            i14 = 2;
        } else {
            hashSet = new HashSet();
            hashSet.add(0);
            boolean z15 = rVar instanceof androidx.camera.core.impl.k0;
            if (z15) {
                i14 = 2;
                zContains = ((androidx.camera.core.impl.k0) rVar).s().contains(4101);
            } else {
                i14 = 2;
                zContains = false;
            }
            if (zContains) {
                hashSet.add(1);
            }
            if (z15) {
                androidx.camera.core.impl.k0 k0Var = (androidx.camera.core.impl.k0) rVar;
                if (k0Var.k().contains(3)) {
                    zContains2 = k0Var.s().contains(32);
                } else {
                    zContains2 = false;
                }
            } else {
                zContains2 = false;
            }
            if (zContains2) {
                hashSet.add(Integer.valueOf(i14));
                hashSet.add(3);
            }
        }
        b3<?> b3Var = this.f13969h;
        androidx.camera.core.impl.h hVar2 = androidx.camera.core.impl.l1.S;
        Integer num = (Integer) b3Var.f(hVar2, 0);
        num.getClass();
        boolean zContains3 = hashSet.contains(num);
        StringBuilder sb3 = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.f13969h.f(hVar2, 0);
        num2.getClass();
        sb3.append(num2.intValue());
        sb3.append(") is not supported by current configuration. Supported output formats: ");
        sb3.append(hashSet);
        k7.h.b(zContains3, sb3.toString());
        if (((Boolean) this.f13969h.f(androidx.camera.core.impl.l1.Z, Boolean.FALSE)).booleanValue()) {
            l1Var.z();
            if (c().h().t() == null) {
                fVar2 = null;
            } else {
                Map map = Collections.EMPTY_MAP;
                ArrayList arrayList = new ArrayList();
                if (J(35, map)) {
                    arrayList.add(35);
                }
                if (J(256, map)) {
                    arrayList.add(256);
                }
                if (J(4101, map)) {
                    arrayList.add(4101);
                }
                int iA = !arrayList.isEmpty() ? ((androidx.camera.core.impl.e0.a) c().h().f(androidx.camera.core.impl.e0.f5535e, androidx.camera.core.impl.e0.f5537g)).a(arrayList) : 0;
                if (iA == 0) {
                    fVar2 = null;
                } else {
                    List list = (List) map.get(Integer.valueOf(iA));
                    u0.c cVar = (u0.c) this.f13969h.f(androidx.camera.core.impl.l1.Y, null);
                    if (cVar != null) {
                        Collections.sort(list, new j0.e(true));
                        androidx.camera.core.impl.l0 l0VarC2 = c();
                        Rect rectT = l0VarC2.c().t();
                        androidx.camera.core.impl.k0 k0VarC = l0VarC2.c();
                        ArrayList arrayListE = m0.k.e(cVar, list, null, l(), new Rational(rectT.width(), rectT.height()), k0VarC.h(), k0VarC.b());
                        if (arrayListE.isEmpty()) {
                            vb.h.s("The postview ResolutionSelector cannot select a valid size for the postview.");
                            return null;
                        }
                        fVar2 = new h0.f((Size) arrayListE.get(0), iA);
                    } else {
                        fVar2 = new h0.f((Size) Collections.max(list, new j0.e()), iA);
                    }
                }
            }
            fVar = fVar2;
        } else {
            fVar = null;
        }
        if (c() != null) {
            try {
                Object objI = c().c().i();
                if (objI instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objI;
                }
            } catch (Exception unused) {
            }
        }
        int i15 = i14;
        this.f14022y = new h0.y(l1Var, sizeF, cameraCharacteristics, this.f13976o, z14, fVar);
        if (this.f14023z == null) {
            this.f14023z = this.f13969h.i().a(this.B);
        }
        this.f14023z.c(this.f14022y);
        h0.y yVar = this.f14022y;
        l2.b bVarD = l2.b.d(yVar.f80586a, q2Var.f());
        LinkedHashSet linkedHashSet = bVarD.f5611a;
        h0.b bVar = yVar.f80590e;
        p1 p1Var2 = bVar.f80567c;
        Objects.requireNonNull(p1Var2);
        b0 b0Var = b0.f13854d;
        androidx.camera.core.impl.o.b bVarA = l2.f.a(p1Var2);
        if (b0Var == null) {
            j20.x.l("Null dynamicRange");
            return null;
        }
        bVarA.f5663e = b0Var;
        linkedHashSet.add(bVarA.a());
        if (bVar.f80451h.size() > 1 && (p1Var = bVar.f80568d) != null) {
            androidx.camera.core.impl.o.b bVarA2 = l2.f.a(p1Var);
            if (b0Var == null) {
                j20.x.l("Null dynamicRange");
                return null;
            }
            bVarA2.f5663e = b0Var;
            linkedHashSet.add(bVarA2.a());
        }
        p1 p1Var3 = bVar.f80569e;
        if (p1Var3 != null) {
            bVarD.f5619i = l2.f.a(p1Var3).a();
        }
        bVarD.f5618h = q2Var.g();
        if (this.f14015r == i15 && !q2Var.h()) {
            d().n(bVarD);
        }
        if (q2Var.d() != null) {
            bVarD.a(q2Var.d());
        }
        l2.c cVar2 = this.A;
        if (cVar2 != null) {
            cVar2.b();
        }
        l2.c cVar3 = new l2.c(new m2(this, 1));
        this.A = cVar3;
        bVarD.f5616f = cVar3;
        return bVarD;
    }

    public final int H() {
        int iIntValue;
        synchronized (this.f14016s) {
            iIntValue = this.f14018u;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((androidx.camera.core.impl.l1) this.f13969h).f(androidx.camera.core.impl.l1.P, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void K(Executor executor, w11.h hVar) {
        int i14;
        int iRound;
        int i15;
        int i16;
        int i17;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            k0.b.d().execute(new a8.d(this, 9, executor, hVar));
            return;
        }
        j0.u.a();
        if (H() == 3 && this.f14020w.f115498a == null) {
            vb.h.s("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        androidx.camera.core.impl.l0 l0VarC = c();
        Rect rect = null;
        if (l0VarC == null || !this.f13962a) {
            new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
            hVar.f181227c.invoke();
            return;
        }
        boolean z14 = this.f13969h.Q() != 0;
        if (z14) {
            vb.h.s("Simultaneous capture RAW and JPEG needs two output file options");
            return;
        }
        h0.p0 p0Var = this.f14023z;
        Objects.requireNonNull(p0Var);
        Rect rect2 = this.f13972k;
        q2 q2Var = this.f13970i;
        Size sizeF = q2Var != null ? q2Var.f() : null;
        Objects.requireNonNull(sizeF);
        if (rect2 != null) {
            i14 = 2;
        } else {
            Rational rational = this.f14019v;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                i14 = 2;
                rect2 = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
            } else {
                androidx.camera.core.impl.l0 l0VarC2 = c();
                Objects.requireNonNull(l0VarC2);
                int iH = h(l0VarC2, false);
                Rational rational2 = new Rational(this.f14019v.getDenominator(), this.f14019v.getNumerator());
                if (!j0.v.d(iH)) {
                    rational2 = this.f14019v;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    i14 = 2;
                } else {
                    int width = sizeF.getWidth();
                    int height = sizeF.getHeight();
                    float f14 = width;
                    float f15 = height;
                    float f16 = f14 / f15;
                    int numerator = rational2.getNumerator();
                    i14 = 2;
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f16) {
                        int iRound2 = Math.round((f14 / numerator) * denominator);
                        i17 = (height - iRound2) / 2;
                        i16 = iRound2;
                        iRound = width;
                        i15 = 0;
                    } else {
                        iRound = Math.round((f15 / denominator) * numerator);
                        i15 = (width - iRound) / 2;
                        i16 = height;
                        i17 = 0;
                    }
                    rect = new Rect(i15, i17, iRound + i15, i16 + i17);
                }
                Objects.requireNonNull(rect);
                rect2 = rect;
            }
        }
        Matrix matrix = this.f13973l;
        int iH2 = h(l0VarC, false);
        androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) this.f13969h;
        androidx.camera.core.impl.h hVar2 = androidx.camera.core.impl.l1.W;
        if (l1Var.b(hVar2)) {
            iIntValue = ((Integer) l1Var.e(hVar2)).intValue();
        } else {
            int i18 = this.f14015r;
            if (i18 == 0) {
                iIntValue = 100;
            } else {
                if (i18 != 1 && i18 != i14) {
                    vb.h.z(v.e0.f(i18, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        h0.j jVar = new h0.j(executor, hVar, null, null, null, rect2, matrix, iH2, iIntValue, this.f14015r, z14, Collections.unmodifiableList(this.f14021x.f5615e));
        if (z14) {
            Boolean bool = Boolean.FALSE;
            HashMap map = jVar.f80582b;
            map.put(32, bool);
            map.put(256, bool);
        }
        p0Var.b(jVar);
    }

    public final void L() {
        synchronized (this.f14016s) {
            try {
                if (this.f14016s.get() != null) {
                    return;
                }
                d().m(H());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.i1
    public final b3<?> f(boolean z14, c3 c3Var) {
        C.getClass();
        androidx.camera.core.impl.l1 l1Var = c.f14026a;
        androidx.camera.core.impl.x0 x0VarA = c3Var.a(l1Var.y(), this.f14015r);
        if (z14) {
            x0VarA = androidx.camera.core.impl.x0.P(x0VarA, l1Var);
        }
        if (x0VarA == null) {
            return null;
        }
        return new androidx.camera.core.impl.l1(a2.T(b.g(x0VarA).f14025a));
    }

    @Override // b0.i1
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // b0.i1
    public final b3.b<?, ?, ?> m(androidx.camera.core.impl.x0 x0Var) {
        return b.g(x0Var);
    }

    @Override // b0.i1
    public final void s() {
        k7.h.e(c(), "Attached camera cannot be null");
        if (H() == 3) {
            androidx.camera.core.impl.l0 l0VarC = c();
            if ((l0VarC != null ? l0VarC.b().b() : -1) == 0) {
                return;
            }
            vb.h.s("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // b0.i1
    public final void t() {
        L();
        d().k(this.f14020w);
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    @Override // b0.i1
    public final b3<?> u(androidx.camera.core.impl.k0 k0Var, b3.b<?, ?, ?> bVar) {
        boolean z14;
        HashSet<d0.a> hashSet = this.f13968g;
        if (hashSet != null) {
            int i14 = 0;
            for (d0.a aVar : hashSet) {
                if (aVar instanceof f0.d) {
                    i14 = ((f0.d) aVar).f67636b;
                }
            }
            ((w1) bVar.d()).X(androidx.camera.core.impl.l1.S, Integer.valueOf(i14));
        }
        if (k0Var.j().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.x0 x0VarD = bVar.d();
            androidx.camera.core.impl.h hVar = androidx.camera.core.impl.l1.U;
            Boolean bool2 = Boolean.TRUE;
            if (!bool.equals(((a2) x0VarD).f(hVar, bool2))) {
                ((w1) bVar.d()).X(hVar, bool2);
            }
        }
        androidx.camera.core.impl.x0 x0VarD2 = bVar.d();
        Boolean bool3 = Boolean.TRUE;
        androidx.camera.core.impl.h hVar2 = androidx.camera.core.impl.l1.U;
        Boolean bool4 = Boolean.FALSE;
        a2 a2Var = (a2) x0VarD2;
        if (bool3.equals(a2Var.f(hVar2, bool4))) {
            z14 = !((c() == null || c().h().t() == null) ? false : true);
            Integer num = (Integer) a2Var.f(androidx.camera.core.impl.l1.R, null);
            if (num != null && num.intValue() != 256) {
                z14 = false;
            }
            if (!z14) {
                ((w1) x0VarD2).X(hVar2, bool4);
            }
        } else {
            z14 = false;
        }
        Integer num2 = (Integer) ((a2) bVar.d()).f(androidx.camera.core.impl.l1.R, null);
        if (num2 != null) {
            k7.h.b(c() == null || c().h().t() == null || num2.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            ((w1) bVar.d()).X(m1.f5632h, Integer.valueOf(z14 ? 35 : num2.intValue()));
        } else {
            androidx.camera.core.impl.x0 x0VarD3 = bVar.d();
            androidx.camera.core.impl.h hVar3 = androidx.camera.core.impl.l1.S;
            if (Objects.equals(((a2) x0VarD3).f(hVar3, null), 2)) {
                ((w1) bVar.d()).X(m1.f5632h, 32);
            } else if (Objects.equals(((a2) bVar.d()).f(hVar3, null), 3)) {
                ((w1) bVar.d()).X(m1.f5632h, 32);
                ((w1) bVar.d()).X(m1.f5633i, 256);
            } else if (Objects.equals(((a2) bVar.d()).f(hVar3, null), 1)) {
                ((w1) bVar.d()).X(m1.f5632h, 4101);
                ((w1) bVar.d()).X(m1.f5634j, b0.f13853c);
            } else if (z14) {
                ((w1) bVar.d()).X(m1.f5632h, 35);
            } else {
                List list = (List) ((a2) bVar.d()).f(n1.f5650r, null);
                if (list == null) {
                    ((w1) bVar.d()).X(m1.f5632h, 256);
                } else if (I(256, list)) {
                    ((w1) bVar.d()).X(m1.f5632h, 256);
                } else if (I(35, list)) {
                    ((w1) bVar.d()).X(m1.f5632h, 35);
                }
            }
        }
        return bVar.b();
    }

    @Override // b0.i1
    public final void w() {
        m0.h hVar = this.f14020w;
        hVar.c();
        hVar.b();
        h0.p0 p0Var = this.f14023z;
        if (p0Var != null) {
            p0Var.a();
        }
    }

    @Override // b0.i1
    public final q2 x(androidx.camera.core.impl.x0 x0Var) {
        this.f14021x.f5612b.c(x0Var);
        Object[] objArr = {this.f14021x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        androidx.camera.core.impl.q.b bVarI = this.f13970i.i();
        bVarI.f5710f = x0Var;
        return bVarI.a();
    }

    @Override // b0.i1
    public final q2 y(q2 q2Var, q2 q2Var2) {
        Objects.toString(q2Var);
        Objects.toString(q2Var2);
        l2.b bVarG = G(e(), (androidx.camera.core.impl.l1) this.f13969h, q2Var);
        this.f14021x = bVarG;
        Object[] objArr = {bVarG.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        this.f13965d = i1.b.ACTIVE;
        r();
        return q2Var;
    }

    @Override // b0.i1
    public final void z() {
        m0.h hVar = this.f14020w;
        hVar.c();
        hVar.b();
        h0.p0 p0Var = this.f14023z;
        if (p0Var != null) {
            p0Var.a();
        }
        F(false);
        d().k(null);
    }

    public static class i {
        public i(Uri uri) {
            this(uri, 256);
        }

        public i(Uri uri, int i14) {
        }
    }

    public static final class b implements b3.b<l0, androidx.camera.core.impl.l1, b>, n1.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f14025a;

        private b(w1 w1Var) {
            this.f14025a = w1Var;
            androidx.camera.core.impl.h hVar = m0.m.L;
            Class cls = (Class) w1Var.f(hVar, null);
            if (cls != null && !cls.equals(l0.class)) {
                c22.t.i("Invalid target class configuration for ", this, ": ", cls);
                throw null;
            }
            w1Var.X(b3.E, c3.b.IMAGE_CAPTURE);
            w1Var.X(hVar, l0.class);
            androidx.camera.core.impl.h hVar2 = m0.m.K;
            if (w1Var.f(hVar2, null) == null) {
                w1Var.X(hVar2, l0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        public static b g(androidx.camera.core.impl.x0 x0Var) {
            return new b(w1.V(x0Var));
        }

        @Override // androidx.camera.core.impl.n1.a
        @Deprecated
        public final b a(Size size) {
            this.f14025a.X(n1.f5647o, size);
            return this;
        }

        @Override // androidx.camera.core.impl.b3.b
        public final b3 b() {
            return new androidx.camera.core.impl.l1(a2.T(this.f14025a));
        }

        @Override // androidx.camera.core.impl.n1.a
        public final b c(int i14) {
            this.f14025a.X(n1.f5644l, Integer.valueOf(i14));
            return this;
        }

        @Override // b0.c0
        public final v1 d() {
            return this.f14025a;
        }

        @Override // androidx.camera.core.impl.n1.a
        public final b e(u0.c cVar) {
            this.f14025a.X(n1.f5651s, cVar);
            return this;
        }

        public final l0 f() {
            androidx.camera.core.impl.h hVar = androidx.camera.core.impl.l1.R;
            w1 w1Var = this.f14025a;
            Integer num = (Integer) w1Var.f(hVar, null);
            if (num != null) {
                w1Var.X(m1.f5632h, num);
            } else {
                c cVar = l0.C;
                androidx.camera.core.impl.h hVar2 = androidx.camera.core.impl.l1.S;
                if (Objects.equals(w1Var.f(hVar2, null), 2)) {
                    w1Var.X(m1.f5632h, 32);
                } else if (Objects.equals(w1Var.f(hVar2, null), 3)) {
                    w1Var.X(m1.f5632h, 32);
                    w1Var.X(m1.f5633i, 256);
                } else if (Objects.equals(w1Var.f(hVar2, null), 1)) {
                    w1Var.X(m1.f5632h, 4101);
                    w1Var.X(m1.f5634j, b0.f13853c);
                } else {
                    w1Var.X(m1.f5632h, 256);
                }
            }
            androidx.camera.core.impl.l1 l1Var = new androidx.camera.core.impl.l1(a2.T(w1Var));
            n1.s(l1Var);
            l0 l0Var = new l0(l1Var);
            Size size = (Size) w1Var.f(n1.f5647o, null);
            if (size != null) {
                l0Var.f14019v = new Rational(size.getWidth(), size.getHeight());
            }
            k7.h.e((Executor) w1Var.f(m0.f.J, k0.b.c()), "The IO executor can't be null");
            androidx.camera.core.impl.h hVar3 = androidx.camera.core.impl.l1.P;
            if (w1Var.N.containsKey(hVar3)) {
                Integer num2 = (Integer) w1Var.e(hVar3);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    vb.h.s(androidx.room.a0.g(num2, "The flash mode is not allowed to set: "));
                    return null;
                }
                if (num2.intValue() == 3 && w1Var.f(androidx.camera.core.impl.l1.X, null) == null) {
                    vb.h.s("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            }
            return l0Var;
        }

        public b() {
            this(w1.U());
        }
    }
}
