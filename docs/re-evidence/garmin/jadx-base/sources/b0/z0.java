package b0;

import android.util.Range;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.q2;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u001d\b\u0016\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0012\"\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb0/z0;", "", "", "Lb0/i1;", "useCases", "Lb0/k1;", "viewPort", "Lb0/l;", "effects", "Landroid/util/Range;", "", "frameRateRange", "", "Ld0/a;", "requiredFeatureGroup", "preferredFeatureGroup", "<init>", "(Ljava/util/List;Lb0/k1;Ljava/util/List;Landroid/util/Range;Ljava/util/Set;Ljava/util/List;)V", "", "([Lb0/i1;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f14124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l> f14125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range<Integer> f14126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<d0.a> f14127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d0.a> f14128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<i1> f14129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f14130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0.d f14131h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14132a;

        static {
            int[] iArr = new int[f0.b.values().length];
            try {
                iArr[f0.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14132a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(List<? extends i1> list, k1 k1Var, List<? extends l> list2, Range<Integer> range, Set<? extends d0.a> set, List<? extends d0.a> list3) {
        boolean z14;
        Object next;
        String str;
        String str2;
        String str3;
        boolean zG;
        list.getClass();
        list2.getClass();
        range.getClass();
        set.getClass();
        list3.getClass();
        this.f14124a = k1Var;
        this.f14125b = list2;
        this.f14126c = range;
        this.f14127d = set;
        this.f14128e = list3;
        List<i1> listB1 = p13.h0.b1(p13.h0.f1(list));
        this.f14129f = listB1;
        this.f14130g = new y0(0);
        k0.d dVarD = k0.b.d();
        dVarD.getClass();
        this.f14131h = dVarD;
        if (!range.equals(q2.f5715a)) {
            Iterator<i1> it = listB1.iterator();
            while (it.hasNext()) {
                if (it.next().f13967f.S()) {
                    vb.h.s("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List<d0.a> list4 = this.f14128e;
        Set<d0.a> set2 = this.f14127d;
        if (set2.isEmpty() && list4.isEmpty()) {
            return;
        }
        Set<d0.a> set3 = set2;
        ArrayList arrayList = new ArrayList(p13.y.r(set3, 10));
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            arrayList.add(((d0.a) it3.next()).getF67635d());
        }
        for (f0.b bVar : p13.h0.b1(p13.h0.f1(arrayList))) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set3) {
                if (((d0.a) obj).getF67635d() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                vb.h.x(androidx.room.a0.k("requiredFeatures has conflicting feature values: ", arrayList2));
                throw null;
            }
        }
        if (p13.h0.T(list4).size() != list4.size()) {
            o2.c.h(41, "Duplicate values in preferredFeatures(", list4);
            throw null;
        }
        LinkedHashSet linkedHashSetH0 = p13.h0.h0(set3, list4);
        if (!linkedHashSetH0.isEmpty()) {
            vb.h.y(linkedHashSetH0, "requiredFeatures and preferredFeatures have duplicate values: ");
            throw null;
        }
        for (i1 i1Var : this.f14129f) {
            e0.d.f61822b.getClass();
            if (e0.d.a.a(i1Var) == e0.d.UNDEFINED) {
                kg.f.l(i1Var, " is not supported with feature group");
                throw null;
            }
            String str4 = i1Var instanceof w0 ? "Preview" : i1Var instanceof l0 ? "ImageCapture" : i1Var instanceof g0 ? "ImageAnalysis" : CameraUseCaseAdapter.A(i1Var) ? "VideoCapture" : "UseCase";
            Iterator<T> it4 = f0.b.f67631f.iterator();
            do {
                z14 = false;
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                e0.d.f61822b.getClass();
                int i14 = e0.d.a.C1310a.f61831b[((f0.b) next).ordinal()];
                if (i14 == 1) {
                    zG = i1Var.f13967f.G();
                } else if (i14 == 2) {
                    zG = i1Var.f13967f.S();
                } else if (i14 == 3) {
                    zG = i1Var.f13967f.b(b3.F) || i1Var.f13967f.b(b3.G);
                } else {
                    if (i14 != 4) {
                        lc.u0.r();
                        throw null;
                    }
                    zG = i1Var.f13967f.b(androidx.camera.core.impl.l1.S);
                }
            } while (!zG);
            f0.b bVar2 = (f0.b) next;
            if (bVar2 == null) {
                z14 = true;
            }
            if (!z14) {
                StringBuilder sb3 = new StringBuilder("A ");
                bVar2.getClass();
                sb3.append(bVar2.name());
                sb3.append(" value is set to ");
                sb3.append(str4);
                sb3.append(" despite using feature groups. Do not use APIs like ");
                sb3.append(str4);
                sb3.append(".Builder.");
                int[] iArr = a.f14132a;
                int i15 = iArr[bVar2.ordinal()];
                if (i15 == 1) {
                    str = "setDynamicRange";
                } else if (i15 == 2) {
                    str = "setTargetFrameRateRange";
                } else if (i15 == 3) {
                    str = CameraUseCaseAdapter.A(i1Var) ? "setVideoStabilizationEnabled" : "setPreviewStabilizationEnabled";
                } else {
                    if (i15 != 4) {
                        lc.u0.r();
                        throw null;
                    }
                    str = "setOutputFormat";
                }
                sb3.append(str);
                sb3.append(" while using feature groups. If ");
                int i16 = iArr[bVar2.ordinal()];
                if (i16 == 1) {
                    str2 = "HDR";
                } else if (i16 == 2) {
                    str2 = "60 FPS";
                } else if (i16 == 3) {
                    str2 = "stabilization";
                } else {
                    if (i16 != 4) {
                        lc.u0.r();
                        throw null;
                    }
                    str2 = "JPEG_R output format";
                }
                sb3.append(str2);
                sb3.append(" is required, instead set ");
                int i17 = iArr[bVar2.ordinal()];
                if (i17 == 1) {
                    str3 = "GroupableFeature.HDR_HLG10";
                } else if (i17 == 2) {
                    str3 = "GroupableFeature.FPS_60";
                } else if (i17 == 3) {
                    str3 = "GroupableFeature.PREVIEW_STABILIZATION";
                } else {
                    if (i17 != 4) {
                        lc.u0.r();
                        throw null;
                    }
                    str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
                }
                vb.h.x(am.j.o(str3, " as either a required or preferred feature.", sb3));
                throw null;
            }
        }
        if (this.f14125b.isEmpty()) {
            return;
        }
        vb.h.s("Effects aren't supported with feature group yet");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(List<? extends i1> list, k1 k1Var) {
        this(list, k1Var, null, null, null, null, 60, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(List<? extends i1> list, k1 k1Var, List<? extends l> list2) {
        this(list, k1Var, list2, null, null, null, 56, null);
        list.getClass();
        list2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(List<? extends i1> list, k1 k1Var, List<? extends l> list2, Range<Integer> range) {
        this(list, k1Var, list2, range, null, null, 48, null);
        list.getClass();
        list2.getClass();
        range.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(List<? extends i1> list, k1 k1Var, List<? extends l> list2, Range<Integer> range, Set<? extends d0.a> set) {
        this(list, k1Var, list2, range, set, null, 32, null);
        list.getClass();
        list2.getClass();
        range.getClass();
        set.getClass();
    }

    public z0(List list, k1 k1Var, List list2, Range range, Set set, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : k1Var, (i14 & 4) != 0 ? p13.j0.f134944a : list2, (i14 & 8) != 0 ? q2.f5715a : range, (i14 & 16) != 0 ? p13.l0.f134950a : set, (i14 & 32) != 0 ? p13.j0.f134944a : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(List<? extends i1> list) {
        this(list, null, null, null, null, null, 62, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(i1... i1VarArr) {
        this(p13.u.i0(i1VarArr), null, null, null, null, null, 62, null);
        i1VarArr.getClass();
    }
}
