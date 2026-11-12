package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.x2;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements androidx.camera.core.impl.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f174095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.e f174096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f174097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f174098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0.s<Integer> f174099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0.s<b0.l1> f174100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0.s<b0.u> f174101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f174102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.camera.core.impl.i2 f174103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f174104k;

    public w(String str, androidx.camera.camera2.internal.compat.q qVar, m0.j jVar) {
        this.f174097d = new Object();
        this.f174099f = null;
        this.f174100g = null;
        this.f174102i = null;
        str.getClass();
        this.f174094a = str;
        androidx.camera.camera2.internal.compat.h hVarB = qVar.b(str);
        this.f174095b = hVarB;
        this.f174096c = new a0.e(this);
        androidx.camera.core.impl.i2 i2VarA = x.a.a(hVarB);
        this.f174103j = i2VarA;
        this.f174104k = new i0(str, i2VarA);
        this.f174101h = new j0.s<>(new b0.d(b0.u.b.CLOSED, null));
    }

    @Override // androidx.camera.core.impl.k0
    public final Set<b0.b0> a() {
        return w.d.a(this.f174095b).f180963a.a();
    }

    @Override // b0.r
    public final int b() {
        Integer num = (Integer) this.f174095b.a(CameraCharacteristics.LENS_FACING);
        k7.h.b(num != null, "Unable to get the lens facing of the camera.");
        return t1.a(num.intValue());
    }

    @Override // androidx.camera.core.impl.k0
    public final void c(androidx.camera.core.impl.s sVar) {
        synchronized (this.f174097d) {
            try {
                l lVar = this.f174098e;
                if (lVar != null) {
                    lVar.f173879c.execute(new r0.h(17, lVar, sVar));
                    return;
                }
                ArrayList arrayList = this.f174102i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == sVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> d(Range<Integer> range) {
        Size[] highSpeedVideoSizesFor;
        try {
            highSpeedVideoSizesFor = this.f174095b.c().f5413a.f5417a.getHighSpeedVideoSizesFor(range);
        } catch (IllegalArgumentException unused) {
            Objects.toString(range);
            highSpeedVideoSizesFor = null;
        }
        return highSpeedVideoSizesFor != null ? Arrays.asList(highSpeedVideoSizesFor) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.k0
    public final boolean e() {
        int[] iArr = (int[]) this.f174095b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i14 : iArr) {
                if (i14 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.k0
    public final androidx.camera.core.impl.e1 f() {
        return this.f174104k;
    }

    @Override // b0.r
    public final androidx.lifecycle.s0<b0.l1> g() {
        synchronized (this.f174097d) {
            try {
                l lVar = this.f174098e;
                j0.s<b0.l1> sVar = this.f174100g;
                if (lVar != null) {
                    if (sVar != null) {
                        return sVar;
                    }
                    return lVar.f173885i.f173973d;
                }
                if (sVar == null) {
                    o2.b bVarA = o2.a(this.f174095b);
                    p2 p2Var = new p2(bVarA.c(), bVarA.b());
                    p2Var.f(1.0f);
                    this.f174100g = new j0.s<>(m0.e.e(p2Var));
                }
                return this.f174100g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.r
    public final androidx.lifecycle.s0<b0.u> getCameraState() {
        return this.f174101h;
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> getSupportedResolutions(int i14) {
        Size[] sizeArrA = this.f174095b.c().a(i14);
        return sizeArrA != null ? Arrays.asList(sizeArrA) : Collections.EMPTY_LIST;
    }

    @Override // b0.r
    public final int h() {
        return r(0);
    }

    @Override // androidx.camera.core.impl.k0
    public final Object i() {
        return this.f174095b.f5350b.f5348a;
    }

    @Override // androidx.camera.core.impl.k0
    public final androidx.camera.core.impl.i2 j() {
        return this.f174103j;
    }

    @Override // androidx.camera.core.impl.k0
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f174095b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i14 : iArr) {
                hashSet.add(Integer.valueOf(i14));
            }
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.k0
    public final void l(Executor executor, j1.h hVar) {
        synchronized (this.f174097d) {
            try {
                l lVar = this.f174098e;
                if (lVar != null) {
                    lVar.f173879c.execute(new uj2.b(lVar, 2, executor, hVar));
                    return;
                }
                if (this.f174102i == null) {
                    this.f174102i = new ArrayList();
                }
                this.f174102i.add(new Pair(hVar, executor));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.r
    public final androidx.lifecycle.s0<Integer> m() {
        synchronized (this.f174097d) {
            try {
                l lVar = this.f174098e;
                j0.s<Integer> sVar = this.f174099f;
                if (lVar == null) {
                    if (sVar == null) {
                        this.f174099f = new j0.s<>(0);
                    }
                    return this.f174099f;
                }
                if (sVar != null) {
                    return sVar;
                }
                return lVar.f173886j.f173870b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.k0
    public final x2 n() {
        Integer num = (Integer) this.f174095b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? x2.UPTIME : x2.REALTIME;
    }

    @Override // b0.r
    public final String o() {
        Integer num = (Integer) this.f174095b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> p() {
        Size[] highSpeedVideoSizes = this.f174095b.c().f5413a.f5417a.getHighSpeedVideoSizes();
        return highSpeedVideoSizes != null ? Arrays.asList(highSpeedVideoSizes) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.k0
    public final String q() {
        return this.f174094a;
    }

    @Override // b0.r
    public final int r(int i14) {
        Integer num = (Integer) this.f174095b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return j0.c.a(j0.c.b(i14), num.intValue(), 1 == b());
    }

    @Override // androidx.camera.core.impl.k0
    public final Set<Integer> s() {
        int[] outputFormats;
        androidx.camera.camera2.internal.compat.w wVar = this.f174095b.c().f5413a;
        wVar.getClass();
        try {
            outputFormats = wVar.f5417a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException unused) {
            outputFormats = null;
        }
        int[] iArr = outputFormats != null ? (int[]) outputFormats.clone() : null;
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i14 : iArr) {
            hashSet.add(Integer.valueOf(i14));
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.k0
    public final Rect t() {
        Rect rect = (Rect) this.f174095b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.k0
    public final List<Size> v(int i14) {
        androidx.camera.camera2.internal.compat.v vVarC = this.f174095b.c();
        HashMap map = vVarC.f5416d;
        Size[] sizeArr = null;
        if (!map.containsKey(Integer.valueOf(i14))) {
            Size[] highResolutionOutputSizes = vVarC.f5413a.f5417a.getHighResolutionOutputSizes(i14);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = vVarC.f5414b.a(highResolutionOutputSizes, i14);
            }
            map.put(Integer.valueOf(i14), highResolutionOutputSizes);
            if (highResolutionOutputSizes != null) {
                sizeArr = (Size[]) highResolutionOutputSizes.clone();
            }
        } else if (((Size[]) map.get(Integer.valueOf(i14))) != null) {
            sizeArr = (Size[]) ((Size[]) map.get(Integer.valueOf(i14))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.k0
    public final boolean x() {
        int[] iArr = (int[]) this.f174095b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i14 : iArr) {
                if (i14 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void y(l lVar) {
        synchronized (this.f174097d) {
            try {
                this.f174098e = lVar;
                j0.s<b0.l1> sVar = this.f174100g;
                if (sVar != null) {
                    sVar.q(lVar.f173885i.f173973d);
                }
                j0.s<Integer> sVar2 = this.f174099f;
                if (sVar2 != null) {
                    sVar2.q(this.f174098e.f173886j.f173870b);
                }
                ArrayList<Pair> arrayList = this.f174102i;
                if (arrayList != null) {
                    for (Pair pair : arrayList) {
                        l lVar2 = this.f174098e;
                        lVar2.f173879c.execute(new uj2.b(lVar2, 2, (Executor) pair.second, (androidx.camera.core.impl.s) pair.first));
                    }
                    this.f174102i = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ((Integer) this.f174095b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
    }

    public w(String str, androidx.camera.camera2.internal.compat.q qVar) {
        this(str, qVar, m0.j.f115504a);
    }
}
