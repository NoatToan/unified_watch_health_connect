package v;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.v2;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public final h1 B;
    public final r1 C;
    public final e0.a D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f173691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f173692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f173693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y.e f173694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f173695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f173696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f173697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f173698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f173699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f173700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f173701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f173702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.camera.core.impl.r f173703w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g1 f173705y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f173681a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f173682b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f173683c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f173684d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f173685e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f173686f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f173687g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f173688h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f173689i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f173690j = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f173704x = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y.t f173706z = new y.t();
    public final y.p A = new y.p();

    @AutoValue
    public static abstract class a {
        public abstract List<Size> a();

        public abstract List<Size> b();

        public abstract int c();

        public abstract int d();

        public abstract int e();
    }

    public enum b {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    @AutoValue
    public static abstract class c {
        public abstract int a();

        public abstract int b();

        public abstract Range<Integer> c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean j();
    }

    public b2(Context context, String str, androidx.camera.camera2.internal.compat.q qVar, f fVar, e0.a aVar) throws CameraUnavailableException {
        List listSingletonList;
        long[] jArr;
        int[] iArr;
        boolean z14;
        this.f173696p = false;
        this.f173697q = false;
        this.f173700t = false;
        this.f173701u = false;
        str.getClass();
        this.f173691k = str;
        fVar.getClass();
        this.f173692l = fVar;
        this.f173694n = new y.e();
        this.f173705y = g1.b(context);
        try {
            androidx.camera.camera2.internal.compat.h hVarB = qVar.b(str);
            this.f173693m = hVarB;
            Integer num = (Integer) hVarB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f173695o = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) hVarB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i14 : iArr2) {
                    if (i14 == 3) {
                        this.f173696p = true;
                    } else if (i14 == 6) {
                        this.f173697q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i14 == 16) {
                        this.f173700t = true;
                    } else if (i14 == 1) {
                        this.f173701u = true;
                    }
                }
            }
            h1 h1Var = new h1(this.f173693m);
            this.B = h1Var;
            this.C = new r1(this.f173693m);
            ArrayList arrayList = this.f173681a;
            int i15 = this.f173695o;
            boolean z15 = this.f173696p;
            boolean z16 = this.f173697q;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            androidx.camera.core.impl.s2 s2Var = new androidx.camera.core.impl.s2();
            t2.d dVar = t2.d.PRIV;
            t2.b bVar = t2.b.f5777m;
            androidx.camera.core.impl.s2 s2VarC = e0.c(dVar, bVar, s2Var, arrayList3, s2Var);
            t2.d dVar2 = t2.d.JPEG;
            androidx.camera.core.impl.s2 s2VarC2 = e0.c(dVar2, bVar, s2VarC, arrayList3, s2VarC);
            t2.d dVar3 = t2.d.YUV;
            androidx.camera.core.impl.s2 s2VarC3 = e0.c(dVar3, bVar, s2VarC2, arrayList3, s2VarC2);
            t2.b bVar2 = t2.b.f5770f;
            e0.m(dVar, bVar2, s2VarC3, dVar2, bVar);
            androidx.camera.core.impl.s2 s2VarD = e0.d(arrayList3, s2VarC3);
            e0.m(dVar3, bVar2, s2VarD, dVar2, bVar);
            androidx.camera.core.impl.s2 s2VarD2 = e0.d(arrayList3, s2VarD);
            e0.m(dVar, bVar2, s2VarD2, dVar, bVar2);
            androidx.camera.core.impl.s2 s2VarD3 = e0.d(arrayList3, s2VarD2);
            e0.m(dVar, bVar2, s2VarD3, dVar3, bVar2);
            androidx.camera.core.impl.s2 s2VarD4 = e0.d(arrayList3, s2VarD3);
            e0.m(dVar, bVar2, s2VarD4, dVar3, bVar2);
            s2VarD4.a(t2.a(dVar2, bVar));
            arrayList3.add(s2VarD4);
            arrayList2.addAll(arrayList3);
            if (i15 == 0 || i15 == 4 || i15 == 1 || i15 == 3) {
                ArrayList arrayList4 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var2 = new androidx.camera.core.impl.s2();
                s2Var2.a(t2.a(dVar, bVar2));
                t2.b bVar3 = t2.b.f5776l;
                androidx.camera.core.impl.s2 s2VarC4 = e0.c(dVar, bVar3, s2Var2, arrayList4, s2Var2);
                e0.m(dVar, bVar2, s2VarC4, dVar3, bVar3);
                androidx.camera.core.impl.s2 s2VarD5 = e0.d(arrayList4, s2VarC4);
                e0.m(dVar3, bVar2, s2VarD5, dVar3, bVar3);
                androidx.camera.core.impl.s2 s2VarD6 = e0.d(arrayList4, s2VarD5);
                e0.m(dVar, bVar2, s2VarD6, dVar, bVar3);
                androidx.camera.core.impl.s2 s2VarC5 = e0.c(dVar2, bVar3, s2VarD6, arrayList4, s2VarD6);
                e0.m(dVar, bVar2, s2VarC5, dVar3, bVar3);
                androidx.camera.core.impl.s2 s2VarC6 = e0.c(dVar2, bVar3, s2VarC5, arrayList4, s2VarC5);
                e0.m(dVar3, bVar2, s2VarC6, dVar3, bVar2);
                s2VarC6.a(t2.a(dVar2, bVar));
                arrayList4.add(s2VarC6);
                arrayList2.addAll(arrayList4);
            }
            if (i15 == 1 || i15 == 3) {
                ArrayList arrayList5 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var3 = new androidx.camera.core.impl.s2();
                e0.m(dVar, bVar2, s2Var3, dVar, bVar);
                androidx.camera.core.impl.s2 s2VarD7 = e0.d(arrayList5, s2Var3);
                e0.m(dVar, bVar2, s2VarD7, dVar3, bVar);
                androidx.camera.core.impl.s2 s2VarD8 = e0.d(arrayList5, s2VarD7);
                e0.m(dVar3, bVar2, s2VarD8, dVar3, bVar);
                androidx.camera.core.impl.s2 s2VarD9 = e0.d(arrayList5, s2VarD8);
                e0.m(dVar, bVar2, s2VarD9, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC7 = e0.c(dVar2, bVar, s2VarD9, arrayList5, s2VarD9);
                t2.b bVar4 = t2.b.f5767c;
                e0.m(dVar3, bVar4, s2VarC7, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC8 = e0.c(dVar3, bVar, s2VarC7, arrayList5, s2VarC7);
                e0.m(dVar3, bVar4, s2VarC8, dVar3, bVar2);
                s2VarC8.a(t2.a(dVar3, bVar));
                arrayList5.add(s2VarC8);
                arrayList2.addAll(arrayList5);
            }
            if (z15) {
                ArrayList arrayList6 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var4 = new androidx.camera.core.impl.s2();
                t2.d dVar4 = t2.d.RAW;
                androidx.camera.core.impl.s2 s2VarC9 = e0.c(dVar4, bVar, s2Var4, arrayList6, s2Var4);
                e0.m(dVar, bVar2, s2VarC9, dVar4, bVar);
                androidx.camera.core.impl.s2 s2VarD10 = e0.d(arrayList6, s2VarC9);
                e0.m(dVar3, bVar2, s2VarD10, dVar4, bVar);
                androidx.camera.core.impl.s2 s2VarD11 = e0.d(arrayList6, s2VarD10);
                e0.m(dVar, bVar2, s2VarD11, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC10 = e0.c(dVar4, bVar, s2VarD11, arrayList6, s2VarD11);
                e0.m(dVar, bVar2, s2VarC10, dVar3, bVar2);
                androidx.camera.core.impl.s2 s2VarC11 = e0.c(dVar4, bVar, s2VarC10, arrayList6, s2VarC10);
                e0.m(dVar3, bVar2, s2VarC11, dVar3, bVar2);
                androidx.camera.core.impl.s2 s2VarC12 = e0.c(dVar4, bVar, s2VarC11, arrayList6, s2VarC11);
                e0.m(dVar, bVar2, s2VarC12, dVar2, bVar);
                androidx.camera.core.impl.s2 s2VarC13 = e0.c(dVar4, bVar, s2VarC12, arrayList6, s2VarC12);
                e0.m(dVar3, bVar2, s2VarC13, dVar2, bVar);
                s2VarC13.a(t2.a(dVar4, bVar));
                arrayList6.add(s2VarC13);
                arrayList2.addAll(arrayList6);
            }
            if (z16 && i15 == 0) {
                ArrayList arrayList7 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var5 = new androidx.camera.core.impl.s2();
                e0.m(dVar, bVar2, s2Var5, dVar, bVar);
                androidx.camera.core.impl.s2 s2VarD12 = e0.d(arrayList7, s2Var5);
                e0.m(dVar, bVar2, s2VarD12, dVar3, bVar);
                androidx.camera.core.impl.s2 s2VarD13 = e0.d(arrayList7, s2VarD12);
                e0.m(dVar3, bVar2, s2VarD13, dVar3, bVar);
                arrayList7.add(s2VarD13);
                arrayList2.addAll(arrayList7);
            }
            if (i15 == 3) {
                ArrayList arrayList8 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var6 = new androidx.camera.core.impl.s2();
                s2Var6.a(t2.a(dVar, bVar2));
                t2.b bVar5 = t2.b.f5767c;
                e0.m(dVar, bVar5, s2Var6, dVar3, bVar);
                t2.d dVar5 = t2.d.RAW;
                androidx.camera.core.impl.s2 s2VarC14 = e0.c(dVar5, bVar, s2Var6, arrayList8, s2Var6);
                e0.m(dVar, bVar2, s2VarC14, dVar, bVar5);
                e0.m(dVar2, bVar, s2VarC14, dVar5, bVar);
                arrayList8.add(s2VarC14);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            y.e eVar = this.f173694n;
            String str2 = this.f173691k;
            if (eVar.f192942a == null) {
                listSingletonList = new ArrayList();
            } else {
                androidx.camera.core.impl.s2 s2Var7 = ExtraSupportedSurfaceCombinationsQuirk.f5381a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (str2.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f5381a);
                        listSingletonList = arrayList9;
                    }
                } else {
                    listSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f5383c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.f()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f5382b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(listSingletonList);
            if (this.f173700t) {
                ArrayList arrayList10 = this.f173682b;
                ArrayList arrayList11 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var8 = new androidx.camera.core.impl.s2();
                t2.b bVar6 = t2.b.f5780p;
                e0.m(dVar3, bVar6, s2Var8, dVar, bVar2);
                t2.b bVar7 = t2.b.f5776l;
                androidx.camera.core.impl.s2 s2VarC15 = e0.c(dVar, bVar7, s2Var8, arrayList11, s2Var8);
                e0.m(dVar2, bVar6, s2VarC15, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC16 = e0.c(dVar, bVar7, s2VarC15, arrayList11, s2VarC15);
                t2.d dVar6 = t2.d.RAW;
                e0.m(dVar6, bVar6, s2VarC16, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC17 = e0.c(dVar, bVar7, s2VarC16, arrayList11, s2VarC16);
                e0.m(dVar3, bVar6, s2VarC17, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC18 = e0.c(dVar2, bVar, s2VarC17, arrayList11, s2VarC17);
                e0.m(dVar2, bVar6, s2VarC18, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC19 = e0.c(dVar2, bVar, s2VarC18, arrayList11, s2VarC18);
                e0.m(dVar6, bVar6, s2VarC19, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC20 = e0.c(dVar2, bVar, s2VarC19, arrayList11, s2VarC19);
                e0.m(dVar3, bVar6, s2VarC20, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC21 = e0.c(dVar3, bVar, s2VarC20, arrayList11, s2VarC20);
                e0.m(dVar2, bVar6, s2VarC21, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC22 = e0.c(dVar3, bVar, s2VarC21, arrayList11, s2VarC21);
                e0.m(dVar6, bVar6, s2VarC22, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC23 = e0.c(dVar3, bVar, s2VarC22, arrayList11, s2VarC22);
                e0.m(dVar3, bVar6, s2VarC23, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC24 = e0.c(dVar6, bVar, s2VarC23, arrayList11, s2VarC23);
                e0.m(dVar2, bVar6, s2VarC24, dVar, bVar2);
                androidx.camera.core.impl.s2 s2VarC25 = e0.c(dVar6, bVar, s2VarC24, arrayList11, s2VarC24);
                e0.m(dVar6, bVar6, s2VarC25, dVar, bVar2);
                s2VarC25.a(t2.a(dVar6, bVar));
                arrayList11.add(s2VarC25);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f173698r = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.f173683c;
                ArrayList arrayList13 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var9 = new androidx.camera.core.impl.s2();
                t2.b bVar8 = t2.b.f5773i;
                androidx.camera.core.impl.s2 s2VarC26 = e0.c(dVar3, bVar8, s2Var9, arrayList13, s2Var9);
                androidx.camera.core.impl.s2 s2VarC27 = e0.c(dVar, bVar8, s2VarC26, arrayList13, s2VarC26);
                androidx.camera.core.impl.s2 s2VarC28 = e0.c(dVar2, bVar8, s2VarC27, arrayList13, s2VarC27);
                t2.b bVar9 = t2.b.f5769e;
                e0.m(dVar3, bVar9, s2VarC28, dVar2, bVar8);
                androidx.camera.core.impl.s2 s2VarD14 = e0.d(arrayList13, s2VarC28);
                e0.m(dVar, bVar9, s2VarD14, dVar2, bVar8);
                androidx.camera.core.impl.s2 s2VarD15 = e0.d(arrayList13, s2VarD14);
                e0.m(dVar3, bVar9, s2VarD15, dVar3, bVar8);
                androidx.camera.core.impl.s2 s2VarD16 = e0.d(arrayList13, s2VarD15);
                e0.m(dVar3, bVar9, s2VarD16, dVar, bVar8);
                androidx.camera.core.impl.s2 s2VarD17 = e0.d(arrayList13, s2VarD16);
                e0.m(dVar, bVar9, s2VarD17, dVar3, bVar8);
                androidx.camera.core.impl.s2 s2VarD18 = e0.d(arrayList13, s2VarD17);
                e0.m(dVar, bVar9, s2VarD18, dVar, bVar8);
                arrayList13.add(s2VarD18);
                arrayList12.addAll(arrayList13);
            }
            if (h1Var.f173833c) {
                ArrayList arrayList14 = this.f173688h;
                ArrayList arrayList15 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var10 = new androidx.camera.core.impl.s2();
                androidx.camera.core.impl.s2 s2VarC29 = e0.c(dVar, bVar, s2Var10, arrayList15, s2Var10);
                androidx.camera.core.impl.s2 s2VarC30 = e0.c(dVar3, bVar, s2VarC29, arrayList15, s2VarC29);
                e0.m(dVar, bVar2, s2VarC30, dVar2, bVar);
                androidx.camera.core.impl.s2 s2VarD19 = e0.d(arrayList15, s2VarC30);
                e0.m(dVar, bVar2, s2VarD19, dVar3, bVar);
                androidx.camera.core.impl.s2 s2VarD20 = e0.d(arrayList15, s2VarD19);
                e0.m(dVar3, bVar2, s2VarD20, dVar3, bVar);
                androidx.camera.core.impl.s2 s2VarD21 = e0.d(arrayList15, s2VarD20);
                s2VarD21.a(t2.a(dVar, bVar2));
                t2.b bVar10 = t2.b.f5776l;
                androidx.camera.core.impl.s2 s2VarC31 = e0.c(dVar, bVar10, s2VarD21, arrayList15, s2VarD21);
                e0.m(dVar, bVar2, s2VarC31, dVar, bVar10);
                androidx.camera.core.impl.s2 s2VarC32 = e0.c(dVar3, bVar10, s2VarC31, arrayList15, s2VarC31);
                e0.m(dVar, bVar2, s2VarC32, dVar, bVar10);
                s2VarC32.a(t2.a(dVar2, bVar10));
                arrayList15.add(s2VarC32);
                arrayList14.addAll(arrayList15);
            }
            androidx.camera.camera2.internal.compat.h hVar = this.f173693m;
            a2 a2Var = a2.f173668a;
            hVar.getClass();
            int i16 = Build.VERSION.SDK_INT;
            boolean z17 = (i16 < 33 || (jArr = (long[]) hVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.f173699s = z17;
            if (z17 && i16 >= 33) {
                ArrayList arrayList16 = this.f173690j;
                ArrayList arrayList17 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var11 = new androidx.camera.core.impl.s2();
                t2.b bVar11 = t2.b.f5773i;
                androidx.camera.core.impl.r2 r2Var = androidx.camera.core.impl.r2.PREVIEW_VIDEO_STILL;
                t2.f5758e.getClass();
                s2Var11.a(t2.a.a(dVar, bVar11, r2Var));
                androidx.camera.core.impl.s2 s2VarD22 = e0.d(arrayList17, s2Var11);
                s2VarD22.a(t2.a.a(dVar3, bVar11, r2Var));
                arrayList17.add(s2VarD22);
                androidx.camera.core.impl.s2 s2Var12 = new androidx.camera.core.impl.s2();
                t2.b bVar12 = t2.b.f5776l;
                androidx.camera.core.impl.r2 r2Var2 = androidx.camera.core.impl.r2.VIDEO_RECORD;
                s2Var12.a(t2.a.a(dVar, bVar12, r2Var2));
                arrayList17.add(s2Var12);
                androidx.camera.core.impl.s2 s2Var13 = new androidx.camera.core.impl.s2();
                s2Var13.a(t2.a.a(dVar3, bVar12, r2Var2));
                arrayList17.add(s2Var13);
                androidx.camera.core.impl.s2 s2Var14 = new androidx.camera.core.impl.s2();
                androidx.camera.core.impl.r2 r2Var3 = androidx.camera.core.impl.r2.STILL_CAPTURE;
                s2Var14.a(t2.a.a(dVar2, bVar, r2Var3));
                arrayList17.add(s2Var14);
                androidx.camera.core.impl.s2 s2Var15 = new androidx.camera.core.impl.s2();
                s2Var15.a(t2.a.a(dVar3, bVar, r2Var3));
                arrayList17.add(s2Var15);
                androidx.camera.core.impl.s2 s2Var16 = new androidx.camera.core.impl.s2();
                androidx.camera.core.impl.r2 r2Var4 = androidx.camera.core.impl.r2.PREVIEW;
                s2Var16.a(t2.a.a(dVar, bVar2, r2Var4));
                s2Var16.a(t2.a.a(dVar2, bVar, r2Var3));
                androidx.camera.core.impl.s2 s2VarD23 = e0.d(arrayList17, s2Var16);
                s2VarD23.a(t2.a.a(dVar, bVar2, r2Var4));
                s2VarD23.a(t2.a.a(dVar3, bVar, r2Var3));
                androidx.camera.core.impl.s2 s2VarD24 = e0.d(arrayList17, s2VarD23);
                s2VarD24.a(t2.a.a(dVar, bVar2, r2Var4));
                s2VarD24.a(t2.a.a(dVar, bVar12, r2Var2));
                androidx.camera.core.impl.s2 s2VarD25 = e0.d(arrayList17, s2VarD24);
                s2VarD25.a(t2.a.a(dVar, bVar2, r2Var4));
                s2VarD25.a(t2.a.a(dVar3, bVar12, r2Var2));
                androidx.camera.core.impl.s2 s2VarD26 = e0.d(arrayList17, s2VarD25);
                s2VarD26.a(t2.a.a(dVar, bVar2, r2Var4));
                s2VarD26.a(t2.a.a(dVar3, bVar2, r2Var4));
                androidx.camera.core.impl.s2 s2VarD27 = e0.d(arrayList17, s2VarD26);
                s2VarD27.a(t2.a.a(dVar, bVar2, r2Var4));
                s2VarD27.a(t2.a.a(dVar, bVar12, r2Var2));
                s2VarD27.a(t2.a.a(dVar2, bVar12, r2Var3));
                arrayList17.add(s2VarD27);
                androidx.camera.core.impl.s2 s2Var17 = new androidx.camera.core.impl.s2();
                s2Var17.a(t2.a.a(dVar, bVar2, r2Var4));
                s2Var17.a(t2.a.a(dVar3, bVar12, r2Var2));
                s2Var17.a(t2.a.a(dVar2, bVar12, r2Var3));
                arrayList17.add(s2Var17);
                androidx.camera.core.impl.s2 s2Var18 = new androidx.camera.core.impl.s2();
                s2Var18.a(t2.a.a(dVar, bVar2, r2Var4));
                s2Var18.a(t2.a.a(dVar3, bVar2, r2Var4));
                s2Var18.a(t2.a.a(dVar2, bVar, r2Var3));
                arrayList17.add(s2Var18);
                arrayList16.addAll(arrayList17);
            }
            androidx.camera.camera2.internal.compat.h hVar2 = this.f173693m;
            if (i16 < 33 || (iArr = (int[]) hVar2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z14 = false;
                break;
            }
            int length = iArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z14 = false;
                    break;
                } else {
                    if (iArr[i17] == 2) {
                        z14 = true;
                        break;
                    }
                    i17++;
                }
            }
            this.f173702v = z14;
            if (z14 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList18 = this.f173684d;
                ArrayList arrayList19 = new ArrayList();
                androidx.camera.core.impl.s2 s2Var19 = new androidx.camera.core.impl.s2();
                t2.d dVar7 = t2.d.PRIV;
                t2.b bVar13 = t2.b.f5773i;
                androidx.camera.core.impl.s2 s2VarC33 = e0.c(dVar7, bVar13, s2Var19, arrayList19, s2Var19);
                t2.d dVar8 = t2.d.YUV;
                androidx.camera.core.impl.s2 s2VarC34 = e0.c(dVar8, bVar13, s2VarC33, arrayList19, s2VarC33);
                s2VarC34.a(t2.a(dVar7, bVar13));
                t2.d dVar9 = t2.d.JPEG;
                t2.b bVar14 = t2.b.f5777m;
                androidx.camera.core.impl.s2 s2VarC35 = e0.c(dVar9, bVar14, s2VarC34, arrayList19, s2VarC34);
                e0.m(dVar8, bVar13, s2VarC35, dVar9, bVar14);
                androidx.camera.core.impl.s2 s2VarD28 = e0.d(arrayList19, s2VarC35);
                e0.m(dVar7, bVar13, s2VarD28, dVar8, bVar14);
                androidx.camera.core.impl.s2 s2VarD29 = e0.d(arrayList19, s2VarD28);
                e0.m(dVar8, bVar13, s2VarD29, dVar8, bVar14);
                androidx.camera.core.impl.s2 s2VarD30 = e0.d(arrayList19, s2VarD29);
                t2.b bVar15 = t2.b.f5770f;
                e0.m(dVar7, bVar15, s2VarD30, dVar7, bVar13);
                androidx.camera.core.impl.s2 s2VarD31 = e0.d(arrayList19, s2VarD30);
                e0.m(dVar8, bVar15, s2VarD31, dVar7, bVar13);
                androidx.camera.core.impl.s2 s2VarD32 = e0.d(arrayList19, s2VarD31);
                e0.m(dVar7, bVar15, s2VarD32, dVar8, bVar13);
                androidx.camera.core.impl.s2 s2VarD33 = e0.d(arrayList19, s2VarD32);
                e0.m(dVar8, bVar15, s2VarD33, dVar8, bVar13);
                arrayList19.add(s2VarD33);
                arrayList18.addAll(arrayList19);
            }
            c();
            this.D = aVar;
        } catch (CameraAccessExceptionCompat e4) {
            throw v0.a(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    public static Range d(Range range, int i14, Range[] rangeArr) {
        Range range2 = androidx.camera.core.impl.q2.f5715a;
        if (range2.equals(range) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i14)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i14)));
        int i15 = 0;
        for (Range range4 : rangeArr) {
            Objects.requireNonNull(range4);
            if (i14 >= ((Integer) range4.getLower()).intValue()) {
                if (range2.equals(androidx.camera.core.impl.q2.f5715a)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int i16 = i(range4.intersect(range3));
                    if (i15 == 0) {
                        i15 = i16;
                    } else {
                        if (i16 >= i15) {
                            double dI = i(range2.intersect(range3));
                            double dI2 = i(range4.intersect(range3));
                            double dI3 = dI2 / ((double) i(range4));
                            double dI4 = dI / ((double) i(range2));
                            if (dI2 > dI) {
                                if (dI3 >= 0.5d || dI3 >= dI4) {
                                    range2 = range4;
                                }
                            } else if (dI2 == dI) {
                                if (dI3 > dI4 || (dI3 == dI4 && ((Integer) range4.getLower()).intValue() > ((Integer) range2.getLower()).intValue())) {
                                    range2 = range4;
                                }
                            } else if (dI4 < 0.5d && dI3 > dI4) {
                                range2 = range4;
                            }
                            i15 = i(range3.intersect(range2));
                        }
                        range4 = range2;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i15 != 0 || (h(range4, range3) >= h(range2, range3) && (h(range4, range3) != h(range2, range3) || (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && i(range4) >= i(range2))))) {
                    }
                }
                range2 = range4;
            }
        }
        return range2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    public static Size f(StreamConfigurationMap streamConfigurationMap, int i14, boolean z14, Rational rational) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        try {
            outputSizes = i14 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i14);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            outputSizes = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : outputSizes) {
                Rational rational2 = j0.a.f95902a;
                if (j0.a.a(size, rational, q0.c.f141973c)) {
                    arrayList.add(size);
                }
            }
            if (arrayList.isEmpty()) {
                outputSizes = null;
            } else {
                outputSizes = (Size[]) arrayList.toArray(new Size[0]);
            }
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        j0.e eVar = new j0.e();
        Size size2 = (Size) Collections.max(Arrays.asList(outputSizes), eVar);
        Size size3 = q0.c.f141971a;
        if (z14 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i14)) != null && highResolutionOutputSizes.length > 0) {
            size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size2, size3), eVar);
    }

    public static int h(Range<Integer> range, Range<Integer> range2) {
        k7.h.f((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int i(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z14) {
        Range<Integer> range3 = androidx.camera.core.impl.q2.f5715a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z14) {
            k7.h.f(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean a(e eVar, List list, Map map, List list2, List list3) {
        List list4;
        Size size;
        e0.d dVar;
        boolean z14 = eVar.f173768d;
        boolean z15 = eVar.f173772h;
        int i14 = eVar.f173765a;
        HashMap map2 = this.f173687g;
        if (map2.containsKey(eVar)) {
            list4 = (List) map2.get(eVar);
        } else {
            ArrayList arrayList = new ArrayList();
            if (z15) {
                ArrayList arrayList2 = this.f173686f;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    t2.d dVar2 = t2.d.PRIV;
                    t2.b bVar = t2.b.f5772h;
                    arrayList3.add(new androidx.camera.core.impl.s2(t2.a(dVar2, bVar)));
                    t2.b bVar2 = t2.b.f5769e;
                    arrayList3.add(new androidx.camera.core.impl.s2(t2.a(dVar2, bVar2)));
                    t2.b bVar3 = t2.b.f5779o;
                    arrayList3.addAll(p1.a(bVar, bVar3));
                    t2.b bVar4 = t2.b.f5775k;
                    arrayList3.addAll(p1.a(bVar, bVar4));
                    arrayList3.addAll(p1.a(bVar, t2.b.f5774j));
                    arrayList3.addAll(p1.a(bVar, bVar));
                    arrayList3.addAll(p1.a(bVar2, bVar3));
                    arrayList3.addAll(p1.a(bVar2, bVar4));
                    arrayList3.addAll(p1.a(bVar2, bVar));
                    t2.b bVar5 = t2.b.f5768d;
                    t2.b bVar6 = t2.b.f5778n;
                    arrayList3.addAll(p1.a(bVar5, bVar6));
                    arrayList3.addAll(p1.a(t2.b.f5771g, bVar6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            } else if (eVar.f173769e) {
                ArrayList arrayList4 = this.f173689i;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    androidx.camera.core.impl.s2 s2Var = new androidx.camera.core.impl.s2();
                    t2.d dVar3 = t2.d.JPEG_R;
                    t2.b bVar7 = t2.b.f5777m;
                    androidx.camera.core.impl.s2 s2VarC = e0.c(dVar3, bVar7, s2Var, arrayList5, s2Var);
                    e0.m(t2.d.PRIV, t2.b.f5770f, s2VarC, dVar3, bVar7);
                    arrayList5.add(s2VarC);
                    arrayList4.addAll(arrayList5);
                }
                if (i14 == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else if (eVar.f173770f) {
                ArrayList arrayList6 = this.f173685e;
                if (arrayList6.isEmpty()) {
                    r1 r1Var = this.C;
                    if (((Boolean) r1Var.f174002b.getValue()).booleanValue()) {
                        arrayList6.clear();
                        Size size2 = (Size) r1Var.f174003c.getValue();
                        if (size2 != null) {
                            androidx.camera.core.impl.r rVarL = l(34);
                            ArrayList arrayList7 = new ArrayList();
                            t2.f5758e.getClass();
                            rVarL.getClass();
                            t2 t2VarB = t2.a.b(34, size2, rVarL, 0, t2.c.CAPTURE_SESSION_TABLES, t2.f5759f);
                            androidx.camera.core.impl.s2 s2Var2 = new androidx.camera.core.impl.s2();
                            s2Var2.a(t2VarB);
                            arrayList7.add(s2Var2);
                            androidx.camera.core.impl.s2 s2Var3 = new androidx.camera.core.impl.s2();
                            s2Var3.a(t2VarB);
                            s2Var3.a(t2VarB);
                            arrayList7.add(s2Var3);
                            arrayList6.addAll(arrayList7);
                        }
                    }
                }
                arrayList.addAll(arrayList6);
            } else {
                int i15 = eVar.f173767c;
                if (i15 == 8) {
                    if (i14 != 1) {
                        ArrayList arrayList8 = this.f173681a;
                        if (i14 != 2) {
                            if (z14) {
                                arrayList8 = this.f173684d;
                            }
                            arrayList.addAll(arrayList8);
                        } else {
                            arrayList.addAll(this.f173682b);
                            arrayList.addAll(arrayList8);
                        }
                    } else {
                        list4 = this.f173683c;
                    }
                    map2.put(eVar, list4);
                } else if (i15 == 10 && i14 == 0) {
                    arrayList.addAll(this.f173688h);
                }
            }
            list4 = arrayList;
            map2.put(eVar, list4);
        }
        Iterator it = list4.iterator();
        int i16 = 0;
        boolean z16 = false;
        while (it.hasNext()) {
            z16 = ((androidx.camera.core.impl.s2) it.next()).c(list) != null;
            if (z16) {
                break;
            }
        }
        if (!z16 || !z15) {
            return z16;
        }
        Range<Integer> range = eVar.f173773i;
        androidx.camera.core.impl.l2.h hVar = new androidx.camera.core.impl.l2.h();
        while (i16 < list.size()) {
            t2 t2Var = (t2) list.get(i16);
            androidx.camera.core.impl.r rVarL2 = l(t2Var.f5766d);
            int i17 = t2Var.f5766d;
            rVarL2.getClass();
            Map<Integer, Size> map3 = rVarL2.f5721f;
            t2.b bVar8 = t2Var.f5764b;
            switch (t2.e.f5794a[bVar8.ordinal()]) {
                case 1:
                    size = rVarL2.f5718c;
                    break;
                case 2:
                    size = rVarL2.f5720e;
                    break;
                case 3:
                    size = rVarL2.d().get(Integer.valueOf(i17));
                    break;
                case 4:
                    size = map3.get(Integer.valueOf(i17));
                    break;
                case 5:
                    size = map3.get(Integer.valueOf(i17));
                    break;
                case 6:
                    size = rVarL2.i().get(Integer.valueOf(i17));
                    break;
                case 7:
                    vb.h.z("Not supported config size");
                    return false;
                default:
                    size = bVar8.f5784b;
                    break;
            }
            size.getClass();
            b3 b3Var = (b3) list2.get(((Integer) list3.get(i16)).intValue());
            b0.b0 b0Var = (b0.b0) map.get(t2Var);
            Objects.requireNonNull(b0Var);
            e0.a.f61817a.getClass();
            b3Var.getClass();
            e0.b bVar9 = new e0.b(size, b3Var.z());
            e0.d.f61822b.getClass();
            int i18 = e0.d.a.C1310a.f61830a[b3Var.y().ordinal()];
            boolean z17 = z14;
            if (i18 == 1) {
                dVar = e0.d.IMAGE_CAPTURE;
            } else if (i18 == 2) {
                dVar = e0.d.PREVIEW;
            } else if (i18 != 3) {
                dVar = i18 != 4 ? e0.d.UNDEFINED : e0.d.STREAM_SHARING;
            } else {
                dVar = e0.d.VIDEO_CAPTURE;
            }
            Class<?> cls = dVar.f61829a;
            if (cls != null) {
                bVar9.f5476j = cls;
            }
            androidx.camera.core.impl.l2.b bVarD = androidx.camera.core.impl.l2.b.d(b3Var, size);
            androidx.camera.core.impl.v0.a aVar = bVarD.f5612b;
            bVarD.b(bVar9, b0Var, -1);
            Range<Integer> range2 = androidx.camera.core.impl.q2.f5715a.equals(range) ? f0.c.f67632e : range;
            aVar.getClass();
            aVar.f5822b.X(androidx.camera.core.impl.v0.f5812k, range2);
            if (z17) {
                aVar.getClass();
                aVar.f5822b.X(b3.F, 2);
            }
            hVar.a(bVarD.c());
            boolean zC = hVar.c();
            StringBuilder sb3 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb3.append(b3Var);
            sb3.append(" with ");
            sb3.append(t2Var);
            sb3.append(" due to [");
            e0.o(!hVar.f5627m ? "Template is not set" : hVar.f5626l.toString(), "]; surfaceConfigList = ", ", featureSettings = ", sb3, list);
            sb3.append(eVar);
            sb3.append(", newUseCaseConfigs = ");
            sb3.append(list2);
            k7.h.f(zC, sb3.toString());
            i16++;
            z14 = z17;
        }
        androidx.camera.core.impl.l2 l2VarB = hVar.b();
        boolean zA = this.D.a(l2VarB);
        Iterator<DeferrableSurface> it3 = l2VarB.b().iterator();
        while (it3.hasNext()) {
            it3.next().a();
        }
        return zA;
    }

    public final e b(int i14, boolean z14, HashMap map, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Range range, boolean z24) {
        int i15;
        Range range2;
        Range range3;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i15 = 8;
                break;
            }
            if (((b0.b0) it.next()).f13861b == 10) {
                i15 = 10;
                break;
            }
        }
        String str = "CONCURRENT_CAMERA";
        String str2 = this.f173691k;
        if (i14 != 0 && z16) {
            if (i14 != 1) {
                str = i14 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(e0.g("Camera device id is ", str2, ". Ultra HDR is not currently supported in ", str, " camera mode."));
        }
        if (i14 != 0 && i15 == 10) {
            if (i14 != 1) {
                str = i14 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(e0.g("Camera device id is ", str2, ". 10 bit dynamic range is not currently supported in ", str, " camera mode."));
        }
        if (i14 != 0 && z18) {
            if (i14 != 1) {
                str = i14 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(e0.g("Camera device id is ", str2, ". Feature combination query is not currently supported in ", str, " camera mode."));
        }
        if (z17 && z18) {
            vb.h.s("High-speed session is not supported with feature combination");
            return null;
        }
        if (z17 && !((Boolean) this.C.f174002b.getValue()).booleanValue()) {
            vb.h.s("High-speed session is not supported on this device.");
            return null;
        }
        if (z18) {
            range2 = range;
            if (range2 == androidx.camera.core.impl.q2.f5715a && z19) {
                range3 = f0.c.f67632e;
            }
            return new e(i14, z14, i15, z15, z16, z17, z18, z19, range3, z24);
        }
        range2 = range;
        range3 = range2;
        return new e(i14, z14, i15, z15, z16, z17, z18, z19, range3, z24);
    }

    public final void c() {
        Size[] outputSizes;
        Size size;
        Size size2;
        CamcorderProfile camcorderProfileB;
        Size sizeE = this.f173705y.e();
        Size size3 = null;
        try {
            int i14 = Integer.parseInt(this.f173691k);
            f fVar = this.f173692l;
            int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
            int i15 = 0;
            while (true) {
                if (i15 >= 8) {
                    size = null;
                    break;
                }
                int i16 = iArr[i15];
                if (fVar.a(i14, i16) && (camcorderProfileB = fVar.b(i14, i16)) != null) {
                    size = new Size(camcorderProfileB.videoFrameWidth, camcorderProfileB.videoFrameHeight);
                    break;
                }
                i15++;
            }
            if (size != null) {
                size2 = size;
            } else {
                try {
                    outputSizes = this.f173693m.c().f5413a.f5417a.getOutputSizes(MediaRecorder.class);
                } catch (Throwable unused) {
                    outputSizes = null;
                }
                if (outputSizes != null) {
                    Arrays.sort(outputSizes, new j0.e(true));
                    for (Size size4 : outputSizes) {
                        int width = size4.getWidth();
                        Size size5 = q0.c.f141976f;
                        if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                            size3 = size4;
                            break;
                        }
                    }
                }
                if (size3 != null) {
                    size2 = size3;
                } else {
                    size = q0.c.f141974d;
                    size2 = size;
                }
            }
        } catch (NumberFormatException unused2) {
        }
        this.f173703w = new androidx.camera.core.impl.r(q0.c.f141973c, new HashMap(), sizeE, new HashMap(), size2, new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final int e(int i14, Size size, boolean z14) {
        long outputMinFrameDuration;
        k7.h.f(!z14 || i14 == 34, null);
        if (!z14) {
            androidx.camera.camera2.internal.compat.v vVarC = this.f173693m.c();
            Objects.requireNonNull(vVarC);
            try {
                outputMinFrameDuration = vVarC.f5413a.f5417a.getOutputMinFrameDuration(i14, size);
            } catch (RuntimeException unused) {
                Objects.toString(size);
                outputMinFrameDuration = 0;
            }
            if (outputMinFrameDuration > 0) {
                return (int) (1.0E9d / outputMinFrameDuration);
            }
            if (!this.f173701u) {
                return Integer.MAX_VALUE;
            }
            Objects.toString(size);
            return 0;
        }
        r1 r1Var = this.C;
        r1Var.getClass();
        size.getClass();
        List<Range<Integer>> listC = r1Var.c(size);
        List<Range<Integer>> list = listC.isEmpty() ? null : listC;
        if (list == null) {
            size.toString();
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return 0;
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        num.getClass();
        return num.intValue();
    }

    public final List g(e eVar, List list, HashMap map, HashMap map2) {
        List list2;
        a2 a2Var = a2.f173668a;
        if (eVar.f173765a != 0 || eVar.f173767c != 8 || eVar.f173770f) {
            return null;
        }
        Iterator it = this.f173690j.iterator();
        while (it.hasNext()) {
            List<t2> listC = ((androidx.camera.core.impl.s2) it.next()).c(list);
            if (listC != null) {
                a2 a2Var2 = a2.f173668a;
                int size = listC.size();
                boolean z14 = false;
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        z14 = true;
                        break;
                    }
                    long j8 = listC.get(i14).f5765c.f5738a;
                    if (map.containsKey(Integer.valueOf(i14))) {
                        androidx.camera.core.impl.e eVar2 = (androidx.camera.core.impl.e) map.get(Integer.valueOf(i14));
                        eVar2.getClass();
                        c3.b bVar = eVar2.a().size() == 1 ? eVar2.a().get(0) : c3.b.STREAM_SHARING;
                        bVar.getClass();
                        List<c3.b> listA = eVar2.a();
                        listA.getClass();
                        a2Var2.getClass();
                        if (!a2.b(bVar, j8, listA)) {
                            break;
                        }
                        i14++;
                    } else {
                        if (!map2.containsKey(Integer.valueOf(i14))) {
                            vb.h.q("SurfaceConfig does not map to any use case");
                            return null;
                        }
                        Object obj = map2.get(Integer.valueOf(i14));
                        obj.getClass();
                        b3 b3Var = (b3) obj;
                        c3.b bVarY = b3Var.y();
                        bVarY.getClass();
                        if (b3Var.y() == c3.b.STREAM_SHARING) {
                            list2 = (List) ((v0.f) b3Var).e(v0.f.O);
                            list2.getClass();
                        } else {
                            list2 = p13.j0.f134944a;
                        }
                        a2Var2.getClass();
                        if (!a2.b(bVarY, j8, list2)) {
                            break;
                        }
                        i14++;
                    }
                }
                o13.e0 e0Var = new o13.e0(new ug2.h(15, this, listC));
                if (z14 && ((Boolean) e0Var.getValue()).booleanValue()) {
                    return listC;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public final v2 j(int i14, ArrayList arrayList, HashMap map, boolean z14, boolean z15, boolean z16) {
        boolean z17;
        Map map2;
        boolean z18;
        int i15;
        int i16;
        b bVar;
        Iterator it;
        b0.b0 b0Var;
        h1 h1Var;
        b0.b0 b0VarC;
        b0.b0 b0VarA;
        g1 g1Var = this.f173705y;
        g1Var.f173814b = g1Var.a();
        if (this.f173703w == null) {
            c();
        } else {
            Size sizeE = this.f173705y.e();
            androidx.camera.core.impl.r rVar = this.f173703w;
            this.f173703w = new androidx.camera.core.impl.r(rVar.f5716a, rVar.f5717b, sizeE, rVar.f5719d, rVar.f5720e, rVar.f5721f, rVar.f5722g, rVar.f5723h, rVar.f5724i);
        }
        Set setKeySet = map.keySet();
        r1.f173999e.getClass();
        setKeySet.getClass();
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((androidx.camera.core.impl.e) it3.next()).e()));
        }
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(p13.y.r(set, 10));
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((b3) it4.next()).getSessionType()));
        }
        ArrayList arrayListC0 = p13.h0.C0(arrayList2, arrayList3);
        if (arrayListC0.isEmpty()) {
            z17 = false;
            break;
        }
        Iterator it5 = arrayListC0.iterator();
        while (true) {
            if (!it5.hasNext()) {
                z17 = false;
                break;
            }
            if (((Number) it5.next()).intValue() == 1) {
                z17 = true;
                break;
            }
        }
        if (z17 && !arrayListC0.isEmpty()) {
            Iterator it6 = arrayListC0.iterator();
            while (it6.hasNext()) {
                if (((Number) it6.next()).intValue() != 1) {
                    vb.h.s("All sessionTypes should be high-speed when any of them is high-speed");
                    return null;
                }
            }
        }
        if (z17) {
            r1 r1Var = this.C;
            r1Var.getClass();
            List listA = r1.a(p13.h0.b1(map.values()));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listA) {
                if (((List) r1Var.f174004d.getValue()).contains((Size) obj)) {
                    arrayList4.add(obj);
                }
            }
            Map linkedHashMap = new LinkedHashMap(p13.t0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list) {
                    if (arrayList4.contains((Size) obj2)) {
                        arrayList5.add(obj2);
                    }
                }
                linkedHashMap.put(key, arrayList5);
            }
            map2 = linkedHashMap;
        } else {
            map2 = map;
        }
        ArrayList<b3> arrayList6 = new ArrayList(map2.keySet());
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            int iW = ((b3) it7.next()).w();
            if (!arrayList8.contains(Integer.valueOf(iW))) {
                arrayList8.add(Integer.valueOf(iW));
            }
        }
        Collections.sort(arrayList8);
        Collections.reverse(arrayList8);
        Iterator it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Integer) it8.next()).intValue();
            for (b3 b3Var : arrayList6) {
                if (iIntValue == b3Var.w()) {
                    arrayList7.add(Integer.valueOf(arrayList6.indexOf(b3Var)));
                }
            }
        }
        h1 h1Var2 = this.B;
        w.d dVar = h1Var2.f173832b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(((androidx.camera.core.impl.e) it9.next()).b());
        }
        Set<b0.b0> setA = dVar.f180963a.a();
        HashSet hashSet = new HashSet(setA);
        Iterator it10 = linkedHashSet.iterator();
        while (it10.hasNext()) {
            h1.d(hashSet, (b0.b0) it10.next(), dVar);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it11 = arrayList7.iterator();
        while (it11.hasNext()) {
            b3 b3Var2 = (b3) arrayList6.get(((Integer) it11.next()).intValue());
            b0.b0 b0VarO = b3Var2.o();
            boolean z19 = z17;
            if (b0VarO.equals(b0.b0.f13853c)) {
                arrayList11.add(b3Var2);
            } else {
                int i17 = b0VarO.f13860a;
                int i18 = b0VarO.f13861b;
                if (i17 == 2 || ((i17 != 0 && i18 == 0) || (i17 == 0 && i18 != 0))) {
                    arrayList10.add(b3Var2);
                } else {
                    arrayList9.add(b3Var2);
                }
            }
            z17 = z19;
        }
        boolean z24 = z17;
        HashMap map3 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList12 = new ArrayList();
        arrayList12.addAll(arrayList9);
        arrayList12.addAll(arrayList10);
        arrayList12.addAll(arrayList11);
        Iterator it12 = arrayList12.iterator();
        while (it12.hasNext()) {
            b3 b3Var3 = (b3) it12.next();
            b0.b0 b0VarO2 = b3Var3.o();
            b3Var3.J();
            if (!b0VarO2.b()) {
                int i19 = b0VarO2.f13860a;
                it = it12;
                int i24 = b0VarO2.f13861b;
                if (i19 == 1 && i24 == 0) {
                    b0VarC = b0.b0.f13854d;
                    if (hashSet.contains(b0VarC)) {
                        h1Var = h1Var2;
                        b0Var = b0VarC;
                    } else {
                        h1Var = h1Var2;
                        b0Var = null;
                    }
                } else {
                    b0.b0 b0VarC2 = h1.c(b0VarO2, linkedHashSet, hashSet);
                    if (b0VarC2 != null) {
                        b0VarO2.toString();
                        b0VarC2.toString();
                    } else {
                        b0VarC2 = h1.c(b0VarO2, linkedHashSet2, hashSet);
                        if (b0VarC2 != null) {
                            b0VarO2.toString();
                            b0VarC2.toString();
                        } else {
                            b0VarC2 = b0.b0.f13854d;
                            if (h1.b(b0VarO2, b0VarC2, hashSet)) {
                                b0VarO2.toString();
                                Objects.toString(b0VarC2);
                            } else {
                                if (i19 == 2 && (i24 == 10 || i24 == 0)) {
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    if (Build.VERSION.SDK_INT >= 33 && (b0VarA = h1.a.a(h1Var2.f173831a)) != null) {
                                        linkedHashSet3.add(b0VarA);
                                    }
                                    linkedHashSet3.add(b0.b0.f13855e);
                                    b0VarC = h1.c(b0VarO2, linkedHashSet3, hashSet);
                                    if (b0VarC != null) {
                                        b0VarO2.toString();
                                        b0VarC.toString();
                                        h1Var = h1Var2;
                                        b0Var = b0VarC;
                                    }
                                }
                                Iterator it13 = hashSet.iterator();
                                while (true) {
                                    if (it13.hasNext()) {
                                        b0Var = (b0.b0) it13.next();
                                        h1Var = h1Var2;
                                        k7.h.f(b0Var.b(), "Candidate dynamic range must be fully specified.");
                                        if (!b0Var.equals(b0.b0.f13854d) && h1.a(b0VarO2, b0Var)) {
                                            b0VarO2.toString();
                                            b0Var.toString();
                                        } else {
                                            h1Var2 = h1Var;
                                        }
                                    } else {
                                        h1Var = h1Var2;
                                        b0Var = null;
                                    }
                                }
                            }
                        }
                    }
                    h1Var = h1Var2;
                    b0Var = b0VarC2;
                }
            } else if (hashSet.contains(b0VarO2)) {
                h1Var = h1Var2;
                it = it12;
                b0Var = b0VarO2;
            } else {
                h1Var = h1Var2;
                it = it12;
                b0Var = null;
            }
            if (b0Var == null) {
                String strJ = b3Var3.J();
                String strJoin = TextUtils.join("\n  ", setA);
                String strJoin2 = TextUtils.join("\n  ", hashSet);
                StringBuilder sb3 = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb3.append(strJ);
                sb3.append("\nRequested dynamic range:\n  ");
                sb3.append(b0VarO2);
                sb3.append("\nSupported dynamic ranges:\n  ");
                vb.h.s(e0.h(sb3, strJoin, "\nConstrained set of concurrent dynamic ranges:\n  ", strJoin2));
                return null;
            }
            h1.d(hashSet, b0Var, dVar);
            map3.put(b3Var3, b0Var);
            if (!linkedHashSet.contains(b0Var)) {
                linkedHashSet2.add(b0Var);
            }
            it12 = it;
            h1Var2 = h1Var;
        }
        map3.toString();
        Iterator it14 = arrayList.iterator();
        while (true) {
            if (!it14.hasNext()) {
                Iterator it15 = map2.keySet().iterator();
                while (true) {
                    if (!it15.hasNext()) {
                        z18 = false;
                        break;
                    }
                    if (((b3) it15.next()).z() == 4101) {
                    }
                }
            } else if (((androidx.camera.core.impl.e) it14.next()).c() == 4101) {
            }
            z18 = true;
            break;
        }
        Iterator it16 = arrayList.iterator();
        Boolean boolValueOf = null;
        while (it16.hasNext()) {
            boolean zI = ((androidx.camera.core.impl.e) it16.next()).i();
            if (boolValueOf != null && boolValueOf.booleanValue() != zI) {
                vb.h.z("All isStrictFpsRequired should be the same");
                return null;
            }
            boolValueOf = Boolean.valueOf(zI);
        }
        Iterator it17 = arrayList6.iterator();
        while (it17.hasNext()) {
            boolean zV = ((b3) it17.next()).v();
            if (boolValueOf != null && boolValueOf.booleanValue() != zV) {
                vb.h.z("All isStrictFpsRequired should be the same");
                return null;
            }
            boolValueOf = Boolean.valueOf(zV);
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        Range rangeM = androidx.camera.core.impl.q2.f5715a;
        Iterator it18 = arrayList.iterator();
        while (it18.hasNext()) {
            rangeM = m(((androidx.camera.core.impl.e) it18.next()).h(), rangeM, zBooleanValue);
        }
        Iterator it19 = arrayList7.iterator();
        Range rangeM2 = rangeM;
        while (it19.hasNext()) {
            Range<Integer> rangeM3 = ((b3) arrayList6.get(((Integer) it19.next()).intValue())).M(androidx.camera.core.impl.q2.f5715a);
            Objects.requireNonNull(rangeM3);
            rangeM2 = m(rangeM3, rangeM2, zBooleanValue);
        }
        if (z14 && !this.f173702v && z16) {
            vb.h.s("Preview stabilization is not supported by the camera.");
            return null;
        }
        e eVarB = b(i14, z15, map3, z14, z18, z24, z16, false, rangeM2, zBooleanValue);
        Collection collectionValues = map3.values();
        if (z16) {
            ?? Contains = collectionValues.contains(b0.b0.f13855e);
            if (rangeM2 != null && ((Integer) rangeM2.getUpper()).intValue() == 60) {
                i15 = Contains;
                i15 = Contains;
                i15 = Contains + 1;
            }
            if (z14) {
                i15++;
            }
            if (z18) {
                i15++;
            }
            i16 = 1;
            bVar = i15 > 1 ? b.WITH_FEATURE_COMBO : i15 == 1 ? b.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : b.WITHOUT_FEATURE_COMBO;
        } else {
            bVar = b.WITHOUT_FEATURE_COMBO;
            i16 = 1;
        }
        Objects.toString(bVar);
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == i16) {
            return n(b(eVarB.f173765a, eVarB.f173766b, map3, eVarB.f173768d, eVarB.f173769e, eVarB.f173770f, eVarB.f173771g, true, eVarB.f173773i, eVarB.f173774j), arrayList, map2, arrayList6, arrayList7, map3);
        }
        if (iOrdinal != 2) {
            return n(eVarB, arrayList, map2, arrayList6, arrayList7, map3);
        }
        Map map4 = map2;
        try {
            return n(eVarB, arrayList, map4, arrayList6, arrayList7, map3);
        } catch (IllegalArgumentException unused) {
            return n(b(eVarB.f173765a, eVarB.f173766b, map3, eVarB.f173768d, eVarB.f173769e, eVarB.f173770f, eVarB.f173771g, true, eVarB.f173773i, eVarB.f173774j), arrayList, map4, arrayList6, arrayList7, map3);
        }
    }

    public final Pair k(e eVar, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i14, HashMap map, HashMap map2) {
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.e eVar2 = (androidx.camera.core.impl.e) it.next();
            arrayList4.add(eVar2.g());
            map.put(Integer.valueOf(arrayList4.size() - 1), eVar2);
        }
        int iMin = i14;
        for (int i15 = 0; i15 < list.size(); i15++) {
            Size size = (Size) list.get(i15);
            b3 b3Var = (b3) arrayList2.get(((Integer) arrayList3.get(i15)).intValue());
            int iZ = b3Var.z();
            androidx.camera.core.impl.r2 r2VarX = b3Var.x();
            t2.c cVar = eVar.f173772h ? t2.c.FEATURE_COMBINATION_TABLE : t2.c.CAPTURE_SESSION_TABLES;
            androidx.camera.core.impl.r rVarL = l(iZ);
            int i16 = eVar.f173765a;
            t2.f5758e.getClass();
            arrayList4.add(t2.a.b(iZ, size, rVarL, i16, cVar, r2VarX));
            map2.put(Integer.valueOf(arrayList4.size() - 1), b3Var);
            iMin = Math.min(iMin, e(b3Var.z(), size, eVar.f173770f));
        }
        return new Pair(arrayList4, Integer.valueOf(iMin));
    }

    public final androidx.camera.core.impl.r l(int i14) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i14);
        ArrayList arrayList = this.f173704x;
        if (!arrayList.contains(numValueOf)) {
            p(this.f173703w.f5717b, q0.c.f141975e, i14);
            p(this.f173703w.f5719d, q0.c.f141977g, i14);
            o(this.f173703w.f5721f, i14, null);
            o(this.f173703w.f5722g, i14, j0.a.f95902a);
            o(this.f173703w.f5723h, i14, j0.a.f95904c);
            Map<Integer, Size> map = this.f173703w.f5724i;
            if (Build.VERSION.SDK_INT >= 31 && this.f173700t && (streamConfigurationMap = (StreamConfigurationMap) this.f173693m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map.put(Integer.valueOf(i14), f(streamConfigurationMap, i14, true, null));
            }
            arrayList.add(Integer.valueOf(i14));
        }
        return this.f173703w;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x0574 A[PHI: r15 r17 r19
      0x0574: PHI (r15v17 int) = (r15v16 int), (r15v16 int), (r15v20 int), (r15v21 int) binds: [B:188:0x0549, B:190:0x0555, B:196:0x0562, B:199:0x056f] A[DONT_GENERATE, DONT_INLINE]
      0x0574: PHI (r17v3 int) = (r17v1 int), (r17v1 int), (r17v1 int), (r17v4 int) binds: [B:188:0x0549, B:190:0x0555, B:196:0x0562, B:199:0x056f] A[DONT_GENERATE, DONT_INLINE]
      0x0574: PHI (r19v2 ??) = (r19v1 ??), (r19v1 ??), (r19v4 ??), (r19v5 ??) binds: [B:188:0x0549, B:190:0x0555, B:196:0x0562, B:199:0x056f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x0576 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x059d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0764  */
    /* JADX WARN: Code duplicated, block: B:306:0x0827  */
    /* JADX WARN: Code duplicated, block: B:312:0x0840  */
    /* JADX WARN: Code duplicated, block: B:319:0x085a  */
    /* JADX WARN: Code duplicated, block: B:323:0x086a  */
    /* JADX WARN: Code duplicated, block: B:326:0x0874  */
    /* JADX WARN: Code duplicated, block: B:332:0x0894  */
    /* JADX WARN: Code duplicated, block: B:338:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:343:0x0900  */
    /* JADX WARN: Code duplicated, block: B:345:0x0918  */
    /* JADX WARN: Code duplicated, block: B:347:0x0939  */
    /* JADX WARN: Code duplicated, block: B:349:0x0943  */
    /* JADX WARN: Code duplicated, block: B:351:0x094f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0979  */
    /* JADX WARN: Code duplicated, block: B:411:0x0990 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0986 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x083c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0854 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0837 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0851 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0864 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x088a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x08af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x08e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x08bf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r41v2, types: [androidx.camera.core.impl.v2] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.List] */
    public final v2 n(e eVar, ArrayList arrayList, Map map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2) {
        int i14;
        ?? arrayList4;
        int i15;
        int i16;
        HashMap map3;
        HashMap map4;
        ?? r14;
        HashMap map5;
        HashMap map6;
        String str;
        ?? r25;
        HashMap map7;
        HashMap map8;
        ArrayList<b3> arrayList5;
        Range<Integer> range;
        int i17;
        ?? r34;
        ?? r35;
        b2 b2Var;
        HashMap map9;
        int i18;
        int i19;
        Iterator it;
        Iterator it3;
        androidx.camera.core.impl.q2 q2Var;
        u.a aVarA;
        androidx.camera.core.impl.e eVar2;
        u.a aVarA2;
        androidx.camera.core.impl.h hVar;
        long jLongValue;
        a2 a2Var;
        int size;
        int i24;
        ?? r26;
        long j8;
        HashMap map10;
        HashMap map11;
        b3 b3Var;
        androidx.camera.core.impl.q2 q2Var2;
        u.a aVarA3;
        androidx.camera.core.impl.e eVar3;
        u.a aVarA4;
        Size sizeF;
        b2 b2Var2 = this;
        e eVar4 = eVar;
        Map map12 = map;
        HashMap map13 = map2;
        Objects.toString(eVar4);
        String str2 = "No supported surface combination is found for camera device - Id : ";
        if (eVar4.f173772h) {
            i14 = 1;
        } else {
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList6.add(((androidx.camera.core.impl.e) it4.next()).g());
            }
            j0.e eVar5 = new j0.e();
            for (b3 b3Var2 : map12.keySet()) {
                List list = (List) map12.get(b3Var2);
                k7.h.b((list == null || list.isEmpty()) ? false : true, "No available output size is found for " + b3Var2 + ".");
                Size size2 = (Size) Collections.min(list, eVar5);
                int iZ = b3Var2.z();
                androidx.camera.core.impl.r rVarL = b2Var2.l(iZ);
                int i25 = eVar4.f173765a;
                t2.c cVar = t2.c.CAPTURE_SESSION_TABLES;
                androidx.camera.core.impl.r2 r2VarX = b3Var2.x();
                t2.f5758e.getClass();
                arrayList6.add(t2.a.b(iZ, size2, rVarL, i25, cVar, r2VarX));
            }
            i14 = 1;
            Map map14 = Collections.EMPTY_MAP;
            List list2 = Collections.EMPTY_LIST;
            if (!b2Var2.a(eVar4, arrayList6, map14, list2, list2)) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + b2Var2.f173691k + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList + ". New configs: " + arrayList2 + ". GroupableFeature settings: " + eVar4);
            }
        }
        HashMap map15 = new HashMap();
        Iterator it5 = map12.keySet().iterator();
        Map map16 = map12;
        while (it5.hasNext()) {
            b3 b3Var3 = (b3) it5.next();
            ArrayList arrayList7 = new ArrayList();
            HashMap map17 = new HashMap();
            List<Size> list3 = (List) map16.get(b3Var3);
            Objects.requireNonNull(list3);
            for (Size size3 : list3) {
                int iZ2 = b3Var3.z();
                androidx.camera.core.impl.r2 r2VarX2 = b3Var3.x();
                Range<Integer> range2 = eVar4.f173773i;
                androidx.camera.core.impl.r rVarL2 = b2Var2.l(iZ2);
                int i26 = eVar4.f173765a;
                Iterator it6 = it5;
                t2.c cVar2 = eVar4.f173772h ? t2.c.FEATURE_COMBINATION_TABLE : t2.c.CAPTURE_SESSION_TABLES;
                t2.f5758e.getClass();
                t2.b bVar = t2.a.b(iZ2, size3, rVarL2, i26, cVar2, r2VarX2).f5764b;
                Range<Integer> range3 = androidx.camera.core.impl.q2.f5715a;
                int iE = range3.equals(range2) ? Integer.MAX_VALUE : b2Var2.e(iZ2, size3, eVar4.f173770f);
                if (!eVar4.f173771g || (bVar != t2.b.f5781q && (range3.equals(range2) || iE >= ((Integer) range2.getUpper()).intValue()))) {
                    Set hashSet = (Set) map17.get(bVar);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map17.put(bVar, hashSet);
                    }
                    if (!hashSet.contains(Integer.valueOf(iE))) {
                        arrayList7.add(size3);
                        hashSet.add(Integer.valueOf(iE));
                    }
                }
                it5 = it6;
            }
            map15.put(b3Var3, arrayList7);
            map16 = map;
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (true) {
            Rational rational = null;
            if (!it7.hasNext()) {
                if (eVar4.f173770f) {
                    b2Var2.C.getClass();
                    if (arrayList8.isEmpty()) {
                        arrayList4 = p13.j0.f134944a;
                    } else {
                        List<Size> listA = r1.a(arrayList8);
                        ArrayList arrayList9 = new ArrayList(p13.y.r(listA, 10));
                        for (Size size4 : listA) {
                            int size5 = arrayList8.size();
                            ArrayList arrayList10 = new ArrayList(size5);
                            for (int i27 = 0; i27 < size5; i27++) {
                                arrayList10.add(size4);
                            }
                            arrayList9.add(arrayList10);
                        }
                        arrayList4 = arrayList9;
                    }
                } else {
                    Iterator it8 = arrayList8.iterator();
                    int size6 = i14;
                    while (it8.hasNext()) {
                        size6 *= ((List) it8.next()).size();
                    }
                    if (size6 == 0) {
                        vb.h.s("Failed to find supported resolutions.");
                        return null;
                    }
                    arrayList4 = new ArrayList();
                    for (int i28 = 0; i28 < size6; i28++) {
                        arrayList4.add(new ArrayList());
                    }
                    int size7 = size6 / ((List) arrayList8.get(0)).size();
                    int i29 = size6;
                    for (int i30 = 0; i30 < arrayList8.size(); i30++) {
                        List list4 = (List) arrayList8.get(i30);
                        for (int i34 = 0; i34 < size6; i34++) {
                            ((List) arrayList4.get(i34)).add((Size) list4.get((i34 % i29) / size7));
                        }
                        if (i30 < arrayList8.size() - 1) {
                            i29 = size7;
                            size7 /= ((List) arrayList8.get(i30 + 1)).size();
                        }
                    }
                }
                ?? r15 = arrayList4;
                HashMap map18 = new HashMap();
                HashMap map19 = new HashMap();
                HashMap map20 = new HashMap();
                HashMap map21 = new HashMap();
                a2 a2Var2 = a2.f173668a;
                Iterator it9 = arrayList.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        i15 = 0;
                        Iterator it10 = arrayList2.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                i16 = 0;
                                break;
                            }
                            b3 b3Var4 = (b3) it10.next();
                            c3.b bVarY = b3Var4.y();
                            bVarY.getClass();
                            a2Var2.getClass();
                            if (a2.c(b3Var4, bVarY)) {
                            }
                        }
                    } else {
                        androidx.camera.core.impl.e eVar6 = (androidx.camera.core.impl.e) it9.next();
                        List<c3.b> listA2 = eVar6.a();
                        listA2.getClass();
                        i15 = 0;
                        c3.b bVar2 = listA2.get(0);
                        androidx.camera.core.impl.x0 x0VarD = eVar6.d();
                        x0VarD.getClass();
                        bVar2.getClass();
                        a2Var2.getClass();
                        if (a2.c(x0VarD, bVar2)) {
                        }
                    }
                    i16 = i14;
                    break;
                }
                boolean z14 = eVar4.f173770f;
                Iterator it11 = arrayList.iterator();
                int iMin = Integer.MAX_VALUE;
                while (it11.hasNext()) {
                    androidx.camera.core.impl.e eVar7 = (androidx.camera.core.impl.e) it11.next();
                    iMin = Math.min(iMin, b2Var2.e(eVar7.c(), eVar7.f(), z14));
                    rational = rational;
                }
                ?? r44 = rational;
                if (b2Var2.f173699s && i16 == 0) {
                    Iterator it12 = r15.iterator();
                    ?? G = r44;
                    while (true) {
                        if (!it12.hasNext()) {
                            map3 = map20;
                            map4 = map21;
                            break;
                        }
                        map3 = map20;
                        map4 = map21;
                        G = b2Var2.g(eVar4, (List) b2Var2.k(eVar4, arrayList, (List) it12.next(), arrayList2, arrayList3, iMin, map20, map21).first, map3, map4);
                        if (G != 0) {
                            break;
                        }
                        map3.clear();
                        map4.clear();
                        map20 = map3;
                        map21 = map4;
                        G = G;
                    }
                    Objects.toString(G);
                    r14 = G;
                } else {
                    map3 = map20;
                    map4 = map21;
                    r14 = r44;
                }
                Range<Integer> range4 = eVar4.f173773i;
                Iterator it13 = r15.iterator();
                ?? r19 = r44;
                ?? r24 = r19;
                int i35 = i15;
                int i36 = i35;
                int i37 = Integer.MAX_VALUE;
                int i38 = Integer.MAX_VALUE;
                b2 b2Var3 = b2Var2;
                ?? r16 = r14;
                ?? r110 = r19;
                while (true) {
                    if (!it13.hasNext()) {
                        map5 = map3;
                        map6 = map4;
                        str = str2;
                        r25 = r16;
                        map7 = map18;
                        map8 = map19;
                        arrayList5 = arrayList2;
                        range = range4;
                        i17 = i38;
                        r34 = r110;
                        r35 = r24;
                        b2Var = b2Var3;
                        break;
                    }
                    List list5 = (List) it13.next();
                    int i39 = i38;
                    HashMap map22 = new HashMap();
                    HashMap map23 = new HashMap();
                    Iterator it14 = it13;
                    map5 = map3;
                    map6 = map4;
                    ?? r27 = r16;
                    int i44 = i37;
                    str = str2;
                    range = range4;
                    Pair pairK = b2Var3.k(eVar4, arrayList, list5, arrayList2, arrayList3, iMin, map22, map23);
                    int i45 = iMin;
                    List list6 = (List) pairK.first;
                    int iIntValue = ((Integer) pairK.second).intValue();
                    int i46 = (androidx.camera.core.impl.q2.f5715a.equals(range) || iIntValue >= i45 || iIntValue >= ((Integer) range.getUpper()).intValue()) ? i14 : 0;
                    HashMap map24 = new HashMap();
                    int i47 = 0;
                    while (i47 < list6.size()) {
                        t2 t2Var = (t2) list6.get(i47);
                        b0.b0 b0VarB = b0.b0.f13853c;
                        int i48 = i45;
                        if (map22.containsKey(Integer.valueOf(i47))) {
                            androidx.camera.core.impl.e eVar8 = (androidx.camera.core.impl.e) map22.get(Integer.valueOf(i47));
                            Objects.requireNonNull(eVar8);
                            b0VarB = eVar8.b();
                        } else if (map23.containsKey(Integer.valueOf(i47))) {
                            b3 b3Var5 = (b3) map23.get(Integer.valueOf(i47));
                            Objects.requireNonNull(b3Var5);
                            b0VarB = (b0.b0) map13.get(b3Var5);
                        }
                        map24.put(t2Var, b0VarB);
                        i47++;
                        i45 = i48;
                    }
                    int i49 = i45;
                    map7 = map18;
                    map8 = map19;
                    ck0.j jVar = new ck0.j(this, eVar, list6, map24, arrayList2, arrayList3, 16);
                    b2 b2Var4 = this;
                    eVar4 = eVar;
                    arrayList5 = arrayList2;
                    o13.e0 e0Var = new o13.e0(jVar);
                    if (i35 == 0 && ((Boolean) e0Var.getValue()).booleanValue()) {
                        if (i44 == Integer.MAX_VALUE || i44 < iIntValue) {
                            r110 = r110;
                            i44 = iIntValue;
                            r110 = list5;
                        }
                        if (i46 == 0) {
                            if (r27 == 0) {
                                i38 = i39;
                            } else {
                                i38 = i39;
                            }
                            range4 = range;
                            i37 = i44;
                            it13 = it14;
                            str2 = str;
                            map3 = map5;
                            map4 = map6;
                            r16 = r27;
                            iMin = i49;
                            map18 = map7;
                            map19 = map8;
                            b2Var3 = b2Var4;
                            r110 = r110;
                            r24 = r24;
                        } else {
                            if (i36 != 0) {
                                i37 = iIntValue;
                                i17 = i39;
                                r35 = r24;
                                r34 = list5;
                                b2Var = b2Var4;
                                r25 = r27;
                                break;
                            }
                            i44 = iIntValue;
                            i35 = i14;
                            r110 = list5;
                            if (r27 == 0) {
                                i38 = i39;
                            } else {
                                i38 = i39;
                            }
                            range4 = range;
                            i37 = i44;
                            it13 = it14;
                            str2 = str;
                            map3 = map5;
                            map4 = map6;
                            r16 = r27;
                            iMin = i49;
                            map18 = map7;
                            map19 = map8;
                            b2Var3 = b2Var4;
                            r110 = r110;
                            r24 = r24;
                        }
                    } else {
                        if (r27 == 0 && i36 == 0 && b2Var4.g(eVar4, list6, map22, map23) != null) {
                            if (i39 != Integer.MAX_VALUE && i39 >= iIntValue) {
                                i38 = i39;
                            } else {
                                i38 = iIntValue;
                                r24 = list5;
                            }
                            if (i46 == 0) {
                                r24 = r24;
                                continue;
                            } else {
                                if (i35 != 0) {
                                    i17 = iIntValue;
                                    i37 = i44;
                                    r34 = r110;
                                    r35 = list5;
                                    b2Var = b2Var4;
                                    r25 = r27;
                                    break;
                                }
                                i38 = iIntValue;
                                i36 = i14;
                                r24 = list5;
                            }
                        } else {
                            i38 = i39;
                        }
                        range4 = range;
                        i37 = i44;
                        it13 = it14;
                        str2 = str;
                        map3 = map5;
                        map4 = map6;
                        r16 = r27;
                        iMin = i49;
                        map18 = map7;
                        map19 = map8;
                        b2Var3 = b2Var4;
                        r110 = r110;
                        r24 = r24;
                    }
                }
                d dVar = (!eVar4.f173771g || androidx.camera.core.impl.q2.f5715a.equals(range) || (i37 != Integer.MAX_VALUE && i37 >= ((Integer) range.getUpper()).intValue())) ? new d(r34, r35, i37, i17, Integer.MAX_VALUE) : new d(null, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                dVar.toString();
                List<Size> list7 = dVar.f173755a;
                int i54 = dVar.f173757c;
                List<Size> list8 = dVar.f173756b;
                int i55 = dVar.f173758d;
                int i56 = dVar.f173759e;
                if (list7 == null) {
                    throw new IllegalArgumentException(str + b2Var.f173691k + " and Hardware level: " + b2Var.f173695o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + " New configs: " + arrayList5);
                }
                Range<Integer> rangeD = androidx.camera.core.impl.q2.f5715a;
                boolean zEquals = rangeD.equals(eVar4.f173773i);
                boolean z15 = eVar4.f173770f;
                if (!zEquals) {
                    Range<Integer>[] rangeArrB = z15 ? b2Var.C.b(list7) : (Range[]) b2Var.f173693m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    Range<Integer> rangeD2 = d(eVar4.f173773i, i54, rangeArrB);
                    if (eVar4.f173771g || eVar4.f173774j) {
                        k7.h.b(rangeD2.equals(eVar4.f173773i), "Target FPS range " + eVar4.f173773i + " is not supported. Max FPS supported by the calculated best combination: " + i54 + ". Calculated best FPS range for device: " + rangeD2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrB));
                    }
                    rangeD = rangeD2;
                } else if (z15) {
                    rangeD = d(r1.f174000f, i54, b2Var.C.b(list7));
                }
                for (b3 b3Var6 : arrayList5) {
                    androidx.camera.core.impl.q.b bVarA = androidx.camera.core.impl.q2.a(list7.get(arrayList3.indexOf(Integer.valueOf(arrayList5.indexOf(b3Var6)))));
                    bVarA.f5708d = Integer.valueOf(eVar4.f173770f ? 1 : 0);
                    b0.b0 b0Var = (b0.b0) map13.get(b3Var6);
                    b0Var.getClass();
                    bVarA.f5707c = b0Var;
                    b3Var6.getClass();
                    androidx.camera.core.impl.w1 w1VarU = androidx.camera.core.impl.w1.U();
                    androidx.camera.core.impl.h hVar2 = u.a.P;
                    if (b3Var6.b(hVar2)) {
                        w1VarU.X(hVar2, b3Var6.e(hVar2));
                    }
                    androidx.camera.core.impl.h hVar3 = b3.C;
                    if (b3Var6.b(hVar3)) {
                        w1VarU.X(hVar3, b3Var6.e(hVar3));
                    }
                    androidx.camera.core.impl.h hVar4 = androidx.camera.core.impl.l1.O;
                    if (b3Var6.b(hVar4)) {
                        w1VarU.X(hVar4, b3Var6.e(hVar4));
                    }
                    androidx.camera.core.impl.h hVar5 = androidx.camera.core.impl.m1.f5632h;
                    if (b3Var6.b(hVar5)) {
                        w1VarU.X(hVar5, b3Var6.e(hVar5));
                    }
                    bVarA.f5710f = new u.a(w1VarU);
                    bVarA.f5711g = Boolean.valueOf(eVar4.f173766b);
                    if (!androidx.camera.core.impl.q2.f5715a.equals(rangeD)) {
                        bVarA.f5709e = rangeD;
                    }
                    map8.put(b3Var6, bVarA.a());
                    map13 = map2;
                }
                HashMap map25 = map8;
                if (r25 == 0 || i54 != i55 || list7.size() != list8.size()) {
                    map9 = map7;
                    break;
                }
                int i57 = 0;
                while (true) {
                    if (i57 >= list7.size()) {
                        androidx.camera.camera2.internal.compat.h hVar6 = b2Var.f173693m;
                        a2 a2Var3 = a2.f173668a;
                        hVar6.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            ArrayList<b3> arrayList11 = new ArrayList(map25.keySet());
                            Iterator it15 = arrayList.iterator();
                            while (it15.hasNext()) {
                                ((androidx.camera.core.impl.e) it15.next()).d().getClass();
                            }
                            Iterator it16 = arrayList11.iterator();
                            while (it16.hasNext()) {
                                Object obj = map25.get((b3) it16.next());
                                obj.getClass();
                                ((androidx.camera.core.impl.q2) obj).d().getClass();
                            }
                            long[] jArr = (long[]) hVar6.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                            if (jArr != null && jArr.length != 0) {
                                HashSet hashSet2 = new HashSet();
                                for (long j14 : jArr) {
                                    hashSet2.add(Long.valueOf(j14));
                                }
                                a2Var3.getClass();
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator it17 = arrayList.iterator();
                                if (it17.hasNext()) {
                                    androidx.camera.core.impl.e eVar9 = (androidx.camera.core.impl.e) it17.next();
                                    androidx.camera.core.impl.x0 x0VarD2 = eVar9.d();
                                    x0VarD2.getClass();
                                    androidx.camera.core.impl.h hVar7 = u.a.P;
                                    if (x0VarD2.b(hVar7)) {
                                        androidx.camera.core.impl.x0 x0VarD3 = eVar9.d();
                                        x0VarD3.getClass();
                                        Object objE = x0VarD3.e(hVar7);
                                        objE.getClass();
                                        if (((Number) objE).longValue() != 0) {
                                            i19 = i14;
                                            i18 = 0;
                                        }
                                        for (b3 b3Var7 : arrayList11) {
                                            hVar = u.a.P;
                                            if (!b3Var7.b(hVar)) {
                                                Object objE2 = b3Var7.e(hVar);
                                                objE2.getClass();
                                                jLongValue = ((Number) objE2).longValue();
                                                if (jLongValue == 0) {
                                                    if (i18 == 0) {
                                                        vb.h.s("Either all use cases must have non-default stream use case assigned or none should have it");
                                                        return r44;
                                                    }
                                                    linkedHashSet.add(Long.valueOf(jLongValue));
                                                    i19 = i14;
                                                } else if (i19 != 0) {
                                                    vb.h.s("Either all use cases must have non-default stream use case assigned or none should have it");
                                                    return r44;
                                                }
                                            } else if (i19 != 0) {
                                                vb.h.s("Either all use cases must have non-default stream use case assigned or none should have it");
                                                return r44;
                                            }
                                            i18 = i14;
                                        }
                                        if (i18 == 0) {
                                            map9 = map7;
                                            a2Var = a2.f173668a;
                                            size = r25.size();
                                            i24 = 0;
                                            r26 = r25;
                                            while (i24 < size) {
                                                ?? r17 = r26;
                                                j8 = ((t2) r17.get(i24)).f5765c.f5738a;
                                                map10 = map5;
                                                if (map10.containsKey(Integer.valueOf(i24))) {
                                                    eVar3 = (androidx.camera.core.impl.e) map10.get(Integer.valueOf(i24));
                                                    eVar3.getClass();
                                                    androidx.camera.core.impl.x0 x0VarD4 = eVar3.d();
                                                    x0VarD4.getClass();
                                                    Long lValueOf = Long.valueOf(j8);
                                                    a2Var.getClass();
                                                    aVarA4 = a2.a(x0VarD4, lValueOf);
                                                    if (aVarA4 != null) {
                                                        map9.put(eVar3, eVar3.j(aVarA4));
                                                    }
                                                    map11 = map6;
                                                } else {
                                                    map11 = map6;
                                                    if (map11.containsKey(Integer.valueOf(i24))) {
                                                        vb.h.q("SurfaceConfig does not map to any use case");
                                                        return r44;
                                                    }
                                                    Object obj2 = map11.get(Integer.valueOf(i24));
                                                    obj2.getClass();
                                                    b3Var = (b3) obj2;
                                                    q2Var2 = (androidx.camera.core.impl.q2) map25.get(b3Var);
                                                    q2Var2.getClass();
                                                    androidx.camera.core.impl.x0 x0VarD5 = q2Var2.d();
                                                    x0VarD5.getClass();
                                                    Long lValueOf2 = Long.valueOf(j8);
                                                    a2Var.getClass();
                                                    aVarA3 = a2.a(x0VarD5, lValueOf2);
                                                    if (aVarA3 != null) {
                                                        androidx.camera.core.impl.q.b bVarI = q2Var2.i();
                                                        bVarI.f5710f = aVarA3;
                                                        map25.put(b3Var, bVarI.a());
                                                    }
                                                }
                                                i24++;
                                                r26 = r17;
                                                map5 = map10;
                                                map6 = map11;
                                            }
                                            break;
                                            break;
                                        }
                                        it = linkedHashSet.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                it3 = arrayList.iterator();
                                                while (it3.hasNext()) {
                                                    eVar2 = (androidx.camera.core.impl.e) it3.next();
                                                    androidx.camera.core.impl.x0 x0VarD6 = eVar2.d();
                                                    x0VarD6.getClass();
                                                    aVarA2 = a2.a(x0VarD6, (Long) x0VarD6.e(u.a.P));
                                                    if (aVarA2 != null) {
                                                        map7.put(eVar2, eVar2.j(aVarA2));
                                                    }
                                                }
                                                map9 = map7;
                                                for (b3 b3Var8 : arrayList11) {
                                                    q2Var = (androidx.camera.core.impl.q2) map25.get(b3Var8);
                                                    q2Var.getClass();
                                                    androidx.camera.core.impl.x0 x0VarD7 = q2Var.d();
                                                    x0VarD7.getClass();
                                                    aVarA = a2.a(x0VarD7, (Long) x0VarD7.e(u.a.P));
                                                    if (aVarA != null) {
                                                        androidx.camera.core.impl.q.b bVarI2 = q2Var.i();
                                                        bVarI2.f5710f = aVarA;
                                                        map25.put(b3Var8, bVarI2.a());
                                                    }
                                                }
                                                break;
                                            }
                                        } while (hashSet2.contains(Long.valueOf(((Number) it.next()).longValue())));
                                        map9 = map7;
                                        a2Var = a2.f173668a;
                                        size = r25.size();
                                        i24 = 0;
                                        r26 = r25;
                                        while (i24 < size) {
                                            ?? r18 = r26;
                                            j8 = ((t2) r18.get(i24)).f5765c.f5738a;
                                            map10 = map5;
                                            if (map10.containsKey(Integer.valueOf(i24))) {
                                                eVar3 = (androidx.camera.core.impl.e) map10.get(Integer.valueOf(i24));
                                                eVar3.getClass();
                                                androidx.camera.core.impl.x0 x0VarD8 = eVar3.d();
                                                x0VarD8.getClass();
                                                Long lValueOf3 = Long.valueOf(j8);
                                                a2Var.getClass();
                                                aVarA4 = a2.a(x0VarD8, lValueOf3);
                                                if (aVarA4 != null) {
                                                    map9.put(eVar3, eVar3.j(aVarA4));
                                                }
                                                map11 = map6;
                                            } else {
                                                map11 = map6;
                                                if (map11.containsKey(Integer.valueOf(i24))) {
                                                    vb.h.q("SurfaceConfig does not map to any use case");
                                                    return r44;
                                                }
                                                Object obj3 = map11.get(Integer.valueOf(i24));
                                                obj3.getClass();
                                                b3Var = (b3) obj3;
                                                q2Var2 = (androidx.camera.core.impl.q2) map25.get(b3Var);
                                                q2Var2.getClass();
                                                androidx.camera.core.impl.x0 x0VarD9 = q2Var2.d();
                                                x0VarD9.getClass();
                                                Long lValueOf4 = Long.valueOf(j8);
                                                a2Var.getClass();
                                                aVarA3 = a2.a(x0VarD9, lValueOf4);
                                                if (aVarA3 != null) {
                                                    androidx.camera.core.impl.q.b bVarI3 = q2Var2.i();
                                                    bVarI3.f5710f = aVarA3;
                                                    map25.put(b3Var, bVarI3.a());
                                                }
                                            }
                                            i24++;
                                            r26 = r18;
                                            map5 = map10;
                                            map6 = map11;
                                        }
                                        break;
                                        break;
                                    }
                                    i18 = i14;
                                } else {
                                    i18 = 0;
                                }
                                i19 = 0;
                                while (r5.hasNext()) {
                                    hVar = u.a.P;
                                    if (!b3Var7.b(hVar)) {
                                        Object objE3 = b3Var7.e(hVar);
                                        objE3.getClass();
                                        jLongValue = ((Number) objE3).longValue();
                                        if (jLongValue == 0) {
                                            if (i18 == 0) {
                                                vb.h.s("Either all use cases must have non-default stream use case assigned or none should have it");
                                                return r44;
                                            }
                                            linkedHashSet.add(Long.valueOf(jLongValue));
                                            i19 = i14;
                                        } else if (i19 != 0) {
                                            vb.h.s("Either all use cases must have non-default stream use case assigned or none should have it");
                                            return r44;
                                        }
                                    } else if (i19 != 0) {
                                        vb.h.s("Either all use cases must have non-default stream use case assigned or none should have it");
                                        return r44;
                                    }
                                    i18 = i14;
                                }
                                if (i18 == 0) {
                                    map9 = map7;
                                    a2Var = a2.f173668a;
                                    size = r25.size();
                                    i24 = 0;
                                    r26 = r25;
                                    while (i24 < size) {
                                        ?? r111 = r26;
                                        j8 = ((t2) r111.get(i24)).f5765c.f5738a;
                                        map10 = map5;
                                        if (map10.containsKey(Integer.valueOf(i24))) {
                                            eVar3 = (androidx.camera.core.impl.e) map10.get(Integer.valueOf(i24));
                                            eVar3.getClass();
                                            androidx.camera.core.impl.x0 x0VarD10 = eVar3.d();
                                            x0VarD10.getClass();
                                            Long lValueOf5 = Long.valueOf(j8);
                                            a2Var.getClass();
                                            aVarA4 = a2.a(x0VarD10, lValueOf5);
                                            if (aVarA4 != null) {
                                                map9.put(eVar3, eVar3.j(aVarA4));
                                            }
                                            map11 = map6;
                                        } else {
                                            map11 = map6;
                                            if (map11.containsKey(Integer.valueOf(i24))) {
                                                vb.h.q("SurfaceConfig does not map to any use case");
                                                return r44;
                                            }
                                            Object obj4 = map11.get(Integer.valueOf(i24));
                                            obj4.getClass();
                                            b3Var = (b3) obj4;
                                            q2Var2 = (androidx.camera.core.impl.q2) map25.get(b3Var);
                                            q2Var2.getClass();
                                            androidx.camera.core.impl.x0 x0VarD11 = q2Var2.d();
                                            x0VarD11.getClass();
                                            Long lValueOf6 = Long.valueOf(j8);
                                            a2Var.getClass();
                                            aVarA3 = a2.a(x0VarD11, lValueOf6);
                                            if (aVarA3 != null) {
                                                androidx.camera.core.impl.q.b bVarI4 = q2Var2.i();
                                                bVarI4.f5710f = aVarA3;
                                                map25.put(b3Var, bVarI4.a());
                                            }
                                        }
                                        i24++;
                                        r26 = r111;
                                        map5 = map10;
                                        map6 = map11;
                                    }
                                    break;
                                    break;
                                }
                                it = linkedHashSet.iterator();
                                do {
                                    if (it.hasNext()) {
                                        it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            eVar2 = (androidx.camera.core.impl.e) it3.next();
                                            androidx.camera.core.impl.x0 x0VarD12 = eVar2.d();
                                            x0VarD12.getClass();
                                            aVarA2 = a2.a(x0VarD12, (Long) x0VarD12.e(u.a.P));
                                            if (aVarA2 != null) {
                                                map7.put(eVar2, eVar2.j(aVarA2));
                                            }
                                        }
                                        map9 = map7;
                                        while (r1.hasNext()) {
                                            q2Var = (androidx.camera.core.impl.q2) map25.get(b3Var8);
                                            q2Var.getClass();
                                            androidx.camera.core.impl.x0 x0VarD13 = q2Var.d();
                                            x0VarD13.getClass();
                                            aVarA = a2.a(x0VarD13, (Long) x0VarD13.e(u.a.P));
                                            if (aVarA != null) {
                                                androidx.camera.core.impl.q.b bVarI5 = q2Var.i();
                                                bVarI5.f5710f = aVarA;
                                                map25.put(b3Var8, bVarI5.a());
                                            }
                                        }
                                        break;
                                        break;
                                    }
                                } while (hashSet2.contains(Long.valueOf(((Number) it.next()).longValue())));
                                map9 = map7;
                                a2Var = a2.f173668a;
                                size = r25.size();
                                i24 = 0;
                                r26 = r25;
                                while (i24 < size) {
                                    ?? r112 = r26;
                                    j8 = ((t2) r112.get(i24)).f5765c.f5738a;
                                    map10 = map5;
                                    if (map10.containsKey(Integer.valueOf(i24))) {
                                        eVar3 = (androidx.camera.core.impl.e) map10.get(Integer.valueOf(i24));
                                        eVar3.getClass();
                                        androidx.camera.core.impl.x0 x0VarD14 = eVar3.d();
                                        x0VarD14.getClass();
                                        Long lValueOf7 = Long.valueOf(j8);
                                        a2Var.getClass();
                                        aVarA4 = a2.a(x0VarD14, lValueOf7);
                                        if (aVarA4 != null) {
                                            map9.put(eVar3, eVar3.j(aVarA4));
                                        }
                                        map11 = map6;
                                    } else {
                                        map11 = map6;
                                        if (map11.containsKey(Integer.valueOf(i24))) {
                                            vb.h.q("SurfaceConfig does not map to any use case");
                                            return r44;
                                        }
                                        Object obj5 = map11.get(Integer.valueOf(i24));
                                        obj5.getClass();
                                        b3Var = (b3) obj5;
                                        q2Var2 = (androidx.camera.core.impl.q2) map25.get(b3Var);
                                        q2Var2.getClass();
                                        androidx.camera.core.impl.x0 x0VarD15 = q2Var2.d();
                                        x0VarD15.getClass();
                                        Long lValueOf8 = Long.valueOf(j8);
                                        a2Var.getClass();
                                        aVarA3 = a2.a(x0VarD15, lValueOf8);
                                        if (aVarA3 != null) {
                                            androidx.camera.core.impl.q.b bVarI6 = q2Var2.i();
                                            bVarI6.f5710f = aVarA3;
                                            map25.put(b3Var, bVarI6.a());
                                        }
                                    }
                                    i24++;
                                    r26 = r112;
                                    map5 = map10;
                                    map6 = map11;
                                }
                                break;
                                break;
                            }
                            map9 = map7;
                            a2Var = a2.f173668a;
                            size = r25.size();
                            i24 = 0;
                            r26 = r25;
                            while (i24 < size) {
                                ?? r113 = r26;
                                j8 = ((t2) r113.get(i24)).f5765c.f5738a;
                                map10 = map5;
                                if (map10.containsKey(Integer.valueOf(i24))) {
                                    eVar3 = (androidx.camera.core.impl.e) map10.get(Integer.valueOf(i24));
                                    eVar3.getClass();
                                    androidx.camera.core.impl.x0 x0VarD16 = eVar3.d();
                                    x0VarD16.getClass();
                                    Long lValueOf9 = Long.valueOf(j8);
                                    a2Var.getClass();
                                    aVarA4 = a2.a(x0VarD16, lValueOf9);
                                    if (aVarA4 != null) {
                                        map9.put(eVar3, eVar3.j(aVarA4));
                                    }
                                    map11 = map6;
                                } else {
                                    map11 = map6;
                                    if (map11.containsKey(Integer.valueOf(i24))) {
                                        vb.h.q("SurfaceConfig does not map to any use case");
                                        return r44;
                                    }
                                    Object obj6 = map11.get(Integer.valueOf(i24));
                                    obj6.getClass();
                                    b3Var = (b3) obj6;
                                    q2Var2 = (androidx.camera.core.impl.q2) map25.get(b3Var);
                                    q2Var2.getClass();
                                    androidx.camera.core.impl.x0 x0VarD17 = q2Var2.d();
                                    x0VarD17.getClass();
                                    Long lValueOf10 = Long.valueOf(j8);
                                    a2Var.getClass();
                                    aVarA3 = a2.a(x0VarD17, lValueOf10);
                                    if (aVarA3 != null) {
                                        androidx.camera.core.impl.q.b bVarI7 = q2Var2.i();
                                        bVarI7.f5710f = aVarA3;
                                        map25.put(b3Var, bVarI7.a());
                                    }
                                }
                                i24++;
                                r26 = r113;
                                map5 = map10;
                                map6 = map11;
                            }
                            break;
                            break;
                        }
                        map9 = map7;
                        a2Var = a2.f173668a;
                        size = r25.size();
                        i24 = 0;
                        r26 = r25;
                        while (i24 < size) {
                            ?? r114 = r26;
                            j8 = ((t2) r114.get(i24)).f5765c.f5738a;
                            map10 = map5;
                            if (map10.containsKey(Integer.valueOf(i24))) {
                                eVar3 = (androidx.camera.core.impl.e) map10.get(Integer.valueOf(i24));
                                eVar3.getClass();
                                androidx.camera.core.impl.x0 x0VarD18 = eVar3.d();
                                x0VarD18.getClass();
                                Long lValueOf11 = Long.valueOf(j8);
                                a2Var.getClass();
                                aVarA4 = a2.a(x0VarD18, lValueOf11);
                                if (aVarA4 != null) {
                                    map9.put(eVar3, eVar3.j(aVarA4));
                                }
                                map11 = map6;
                            } else {
                                map11 = map6;
                                if (map11.containsKey(Integer.valueOf(i24))) {
                                    vb.h.q("SurfaceConfig does not map to any use case");
                                    return r44;
                                }
                                Object obj7 = map11.get(Integer.valueOf(i24));
                                obj7.getClass();
                                b3Var = (b3) obj7;
                                q2Var2 = (androidx.camera.core.impl.q2) map25.get(b3Var);
                                q2Var2.getClass();
                                androidx.camera.core.impl.x0 x0VarD19 = q2Var2.d();
                                x0VarD19.getClass();
                                Long lValueOf12 = Long.valueOf(j8);
                                a2Var.getClass();
                                aVarA3 = a2.a(x0VarD19, lValueOf12);
                                if (aVarA3 != null) {
                                    androidx.camera.core.impl.q.b bVarI8 = q2Var2.i();
                                    bVarI8.f5710f = aVarA3;
                                    map25.put(b3Var, bVarI8.a());
                                }
                            }
                            i24++;
                            r26 = r114;
                            map5 = map10;
                            map6 = map11;
                        }
                        break;
                    }
                    if (!list7.get(i57).equals(list8.get(i57))) {
                        map9 = map7;
                        break;
                    }
                    i57++;
                }
                return new v2(map25, map9, i56);
            }
            b3 b3Var9 = (b3) arrayList2.get(((Integer) it7.next()).intValue());
            List<Size> list9 = (List) map15.get(b3Var9);
            if (list9 == null) {
                list9 = Collections.EMPTY_LIST;
            }
            int iZ3 = b3Var9.z();
            y.t tVar = b2Var2.f173706z;
            androidx.camera.camera2.internal.compat.h hVar8 = b2Var2.f173693m;
            tVar.getClass();
            int i58 = (((Nexus4AndroidLTargetAspectRatioQuirk) x.c.f188202a.b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) x.a.a(hVar8).b(AspectRatioLegacyApi21Quirk.class)) == null) ? 3 : 2;
            if (i58 == 2) {
                Size size8 = b2Var2.l(256).d().get(256);
                if (size8 != null) {
                    rational = new Rational(size8.getWidth(), size8.getHeight());
                }
            } else if (i58 != 3) {
                vb.h.q(am.j.h(i58, "Undefined targetAspectRatio: "));
                return null;
            }
            if (rational != null) {
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                for (Size size9 : list9) {
                    Rational rational2 = j0.a.f95902a;
                    if (j0.a.a(size9, rational, q0.c.f141973c)) {
                        arrayList12.add(size9);
                    } else {
                        arrayList13.add(size9);
                    }
                }
                arrayList13.addAll(0, arrayList12);
                list9 = arrayList13;
            }
            y.p pVar = b2Var2.A;
            t2.f5758e.getClass();
            t2.d dVar2 = (t2.d) t2.f5762i.get(Integer.valueOf(iZ3));
            if (dVar2 == null) {
                dVar2 = t2.d.PRIV;
            }
            if (pVar.f192958a != null && (sizeF = ExtraCroppingQuirk.f(dVar2)) != null) {
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(sizeF);
                for (Size size10 : list9) {
                    if (!size10.equals(sizeF)) {
                        arrayList14.add(size10);
                    }
                }
                list9 = arrayList14;
            }
            arrayList8.add(list9);
        }
    }

    public final void o(Map<Integer, Size> map, int i14, Rational rational) {
        Size sizeF = f(this.f173693m.c().f5413a.f5417a, i14, true, rational);
        if (sizeF != null) {
            map.put(Integer.valueOf(i14), sizeF);
        }
    }

    public final void p(Map<Integer, Size> map, Size size, int i14) {
        if (this.f173698r) {
            Size sizeF = f(this.f173693m.c().f5413a.f5417a, i14, false, null);
            Integer numValueOf = Integer.valueOf(i14);
            if (sizeF != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeF), new j0.e());
            }
            map.put(numValueOf, size);
        }
    }
}
