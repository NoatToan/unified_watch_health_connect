package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<Integer> f5601j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f5602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<CameraDevice.StateCallback> f5604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<CameraCaptureSession.StateCallback> f5605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<s> f5606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0 f5608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InputConfiguration f5610i;

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f5616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InputConfiguration f5617g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f f5619i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f5611a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0.a f5612b = new v0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f5613c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f5614d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f5615e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5618h = 0;
    }

    public static class b extends a {
        public static b d(b3<?> b3Var, Size size) {
            e eVarO = b3Var.O();
            if (eVarO == null) {
                androidx.room.a0.s(b3Var.j(b3Var.toString()), "Implementation is missing option unpacker for ");
                return null;
            }
            b bVar = new b();
            eVarO.a(size, b3Var, bVar);
            return bVar;
        }

        public final void a(x0 x0Var) {
            this.f5612b.c(x0Var);
        }

        public final void b(DeferrableSurface deferrableSurface, b0.b0 b0Var, int i14) {
            o.b bVarA = f.a(deferrableSurface);
            if (b0Var == null) {
                j20.x.l("Null dynamicRange");
                return;
            }
            bVarA.f5663e = b0Var;
            bVarA.f5661c = Integer.valueOf(i14);
            this.f5611a.add(bVarA.a());
            this.f5612b.d(deferrableSurface);
        }

        public final l2 c() {
            return new l2(new ArrayList(this.f5611a), new ArrayList(this.f5613c), new ArrayList(this.f5614d), new ArrayList(this.f5615e), this.f5612b.e(), this.f5616f, this.f5617g, this.f5618h, this.f5619i);
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f5620a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f5621b;

        public c(d dVar) {
            this.f5621b = dVar;
        }

        @Override // androidx.camera.core.impl.l2.d
        public final void a(l2 l2Var, g gVar) {
            if (this.f5620a.get()) {
                return;
            }
            this.f5621b.a(l2Var, gVar);
        }

        public final void b() {
            this.f5620a.set(true);
        }
    }

    public interface d {
        void a(l2 l2Var, g gVar);
    }

    public interface e {
        void a(Size size, b3<?> b3Var, b bVar);
    }

    @AutoValue
    public static abstract class f {

        @AutoValue.Builder
        public static abstract class a {
        }

        public static o.b a(DeferrableSurface deferrableSurface) {
            o.b bVar = new o.b();
            if (deferrableSurface == null) {
                j20.x.l("Null surface");
                return null;
            }
            bVar.f5659a = deferrableSurface;
            List<DeferrableSurface> list = Collections.EMPTY_LIST;
            if (list == null) {
                j20.x.l("Null sharedSurfaces");
                return null;
            }
            bVar.f5660b = list;
            bVar.f5661c = -1;
            bVar.f5662d = -1;
            b0.b0 b0Var = b0.b0.f13854d;
            if (b0Var != null) {
                bVar.f5663e = b0Var;
                return bVar;
            }
            j20.x.l("Null dynamicRange");
            return null;
        }

        public abstract b0.b0 b();

        public abstract int c();

        public abstract String d();

        public abstract List<DeferrableSurface> e();

        public abstract DeferrableSurface f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        /* JADX INFO: Fake field, exist only in values array */
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p0.f f5624j = new p0.f();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f5625k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final StringBuilder f5626l = new StringBuilder();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f5627m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ArrayList f5628n = new ArrayList();

        public final void a(l2 l2Var) {
            Map<String, Object> map;
            v0 v0Var = l2Var.f5608g;
            int i14 = v0Var.f5815c;
            v0.a aVar = this.f5612b;
            if (i14 != -1) {
                this.f5627m = true;
                int i15 = aVar.f5823c;
                List<Integer> list = l2.f5601j;
                if (list.indexOf(Integer.valueOf(i14)) < list.indexOf(Integer.valueOf(i15))) {
                    i14 = i15;
                }
                aVar.f5823c = i14;
            }
            Range<Integer> rangeA = v0Var.a();
            Range<Integer> range = q2.f5715a;
            boolean zEquals = rangeA.equals(range);
            StringBuilder sb3 = this.f5626l;
            if (!zEquals) {
                if (aVar.g().equals(range)) {
                    aVar.f5822b.X(v0.f5812k, rangeA);
                } else if (!aVar.g().equals(rangeA)) {
                    this.f5625k = false;
                    sb3.append("Different ExpectedFrameRateRange values; current = " + aVar.g() + ", new = " + rangeA);
                }
            }
            int iC = v0Var.c();
            if (iC != 0) {
                aVar.getClass();
                if (iC != 0) {
                    aVar.f5822b.X(b3.F, Integer.valueOf(iC));
                }
            }
            int iD = v0Var.d();
            if (iD != 0) {
                aVar.getClass();
                if (iD != 0) {
                    aVar.f5822b.X(b3.G, Integer.valueOf(iD));
                }
            }
            w2 w2Var = v0Var.f5819g;
            y1 y1Var = aVar.f5827g;
            HashSet hashSet = aVar.f5821a;
            Map<String, Object> map2 = y1Var.f5841a;
            if (map2 != null && (map = w2Var.f5841a) != null) {
                map2.putAll(map);
            }
            this.f5613c.addAll(l2Var.f5604c);
            this.f5614d.addAll(l2Var.f5605d);
            aVar.a(v0Var.f5817e);
            this.f5615e.addAll(l2Var.f5606e);
            d dVar = l2Var.f5607f;
            if (dVar != null) {
                this.f5628n.add(dVar);
            }
            InputConfiguration inputConfiguration = l2Var.f5610i;
            if (inputConfiguration != null) {
                this.f5617g = inputConfiguration;
            }
            List<f> list2 = l2Var.f5602a;
            LinkedHashSet<f> linkedHashSet = this.f5611a;
            linkedHashSet.addAll(list2);
            hashSet.addAll(Collections.unmodifiableList(v0Var.f5813a));
            ArrayList arrayList = new ArrayList();
            for (f fVar : linkedHashSet) {
                arrayList.add(fVar.f());
                Iterator<DeferrableSurface> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            if (!arrayList.containsAll(hashSet)) {
                this.f5625k = false;
                sb3.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            int i16 = l2Var.f5609h;
            int i17 = this.f5618h;
            if (i16 != i17 && i16 != 0 && i17 != 0) {
                this.f5625k = false;
                sb3.append("Invalid configuration due to that two non-default session types are set");
            } else if (i16 != 0) {
                this.f5618h = i16;
            }
            f fVar2 = l2Var.f5603b;
            if (fVar2 != null) {
                f fVar3 = this.f5619i;
                if (fVar3 == fVar2 || fVar3 == null) {
                    this.f5619i = fVar2;
                } else {
                    this.f5625k = false;
                    sb3.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            aVar.c(v0Var.f5814b);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008a  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00aa A[EDGE_INSN: B:38:0x00aa->B:39:0x00c6 BREAK  A[LOOP:0: B:16:0x003f->B:48:?]] */
        public final l2 b() {
            Range<Integer> rangeG;
            if (!this.f5625k) {
                vb.h.s("Unsupported session configuration combination");
                return null;
            }
            ArrayList arrayList = new ArrayList(this.f5611a);
            p0.f fVar = this.f5624j;
            if (fVar.f134648a) {
                Collections.sort(arrayList, new a61.c(fVar, 14));
            }
            int i14 = this.f5618h;
            v0.a aVar = this.f5612b;
            if (i14 == 1) {
                new m0.d();
                aVar.getClass();
                if (arrayList.size() == 2 && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        DeferrableSurface deferrableSurfaceF = ((f) it.next()).f();
                        deferrableSurfaceF.getClass();
                        if (p005kotlin.jvm.internal.s.g(deferrableSurfaceF.f5476j, MediaCodec.class)) {
                            HashSet hashSet = aVar.f5821a;
                            hashSet.getClass();
                            if (!hashSet.isEmpty()) {
                                Iterator it3 = hashSet.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        rangeG = aVar.g();
                                        if (rangeG != null) {
                                            break;
                                        }
                                        if (((Number) rangeG.getUpper()).intValue() >= 120) {
                                            rangeG = null;
                                        } else {
                                            rangeG = null;
                                        }
                                        if (rangeG != null) {
                                            break;
                                        }
                                        Range range = new Range(30, rangeG.getUpper());
                                        rangeG.toString();
                                        range.toString();
                                        aVar.f5822b.X(v0.f5812k, range);
                                        break;
                                    }
                                    DeferrableSurface deferrableSurface = (DeferrableSurface) it3.next();
                                    deferrableSurface.getClass();
                                    if (p005kotlin.jvm.internal.s.g(deferrableSurface.f5476j, MediaCodec.class)) {
                                        break;
                                    }
                                }
                            } else {
                                rangeG = aVar.g();
                                if (rangeG != null) {
                                    break;
                                }
                                if (((Number) rangeG.getUpper()).intValue() >= 120 || !p005kotlin.jvm.internal.s.g(rangeG.getLower(), rangeG.getUpper())) {
                                    rangeG = null;
                                }
                                if (rangeG != null) {
                                    break;
                                }
                                Range range2 = new Range(30, rangeG.getUpper());
                                rangeG.toString();
                                range2.toString();
                                aVar.f5822b.X(v0.f5812k, range2);
                                break;
                            }
                        }
                    }
                }
            }
            return new l2(arrayList, new ArrayList(this.f5613c), new ArrayList(this.f5614d), new ArrayList(this.f5615e), aVar.e(), this.f5628n.isEmpty() ? null : new m2(this, 0), this.f5617g, this.f5618h, this.f5619i);
        }

        public final boolean c() {
            return this.f5627m && this.f5625k;
        }
    }

    public l2(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<s> list4, v0 v0Var, d dVar, InputConfiguration inputConfiguration, int i14, f fVar) {
        this.f5602a = list;
        this.f5604c = Collections.unmodifiableList(list2);
        this.f5605d = Collections.unmodifiableList(list3);
        this.f5606e = Collections.unmodifiableList(list4);
        this.f5607f = dVar;
        this.f5608g = v0Var;
        this.f5610i = inputConfiguration;
        this.f5609h = i14;
        this.f5603b = fVar;
    }

    public static l2 a() {
        return new l2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new v0.a().e(), null, null, 0, null);
    }

    public final List<DeferrableSurface> b() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f5602a) {
            arrayList.add(fVar.f());
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
