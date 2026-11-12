package ga0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import ca0.i0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISimpleSetup;
import e23.p;
import h90.g;
import i90.o;
import j90.e;
import j90.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;
import y80.w;
import z80.f;
import z80.h;
import zb0.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lga0/a;", "Landroidx/lifecycle/u1;", "Lq90/c;", "pairedDevice", "Lz80/h;", "dndEnabled", "Ly80/w;", "deviceSettingsRepository", "Lh90/c;", "convertDeviceCustomizationWizardStepUseCase", "Lh90/d;", "filter", "Li90/o;", "sportProfileSetupUseCase", "Li90/a;", "delegate", "<init>", "(Lq90/c;Lz80/h;Ly80/w;Lh90/c;Lh90/d;Li90/o;Li90/a;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f76591o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.c f76592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f76593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h90.c f76594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h90.d f76595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f76596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i90.a f76597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f76598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f76599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f76600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f76601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<? extends e> f76602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f76603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f76604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f76605n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76606a;

        static {
            int[] iArr = new int[j90.c.values().length];
            try {
                iArr[j90.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j90.c.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76606a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.DeviceCustomizationViewModel$initializedData$1", f = "DeviceCustomizationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<j<? super Boolean>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f76591o;
            a aVar2 = a.this;
            aVar2.getClass();
            ge1.b.T(v1.a(aVar2), null, null, new d(aVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new C1539a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(q90.c cVar, h hVar, w wVar, h90.c cVar2, h90.d dVar, o oVar, i90.a aVar) {
        cVar.getClass();
        hVar.getClass();
        wVar.getClass();
        cVar2.getClass();
        dVar.getClass();
        oVar.getClass();
        aVar.getClass();
        this.f76592a = cVar;
        this.f76593b = wVar;
        this.f76594c = cVar2;
        this.f76595d = dVar;
        this.f76596e = oVar;
        this.f76597f = aVar;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA = q2.a(bool);
        this.f76598g = p2VarA;
        Object objB = null;
        this.f76599h = s.K(new v(new c(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), bool);
        p2 p2VarA2 = q2.a(bool);
        this.f76600i = p2VarA2;
        this.f76601j = s.d(p2VarA2);
        this.f76602k = j0.f134944a;
        f fVar = cVar.f143497e;
        this.f76603l = fVar;
        if (fVar != null) {
            if (hVar instanceof h.a) {
                objB = Boolean.valueOf(((h.a) hVar).f203057b);
            } else if (!hVar.equals(h.c.f203058b)) {
                u0.r();
                throw null;
            }
            objB = f.b(fVar, null, null, null, null, null, null, objB, 191);
        }
        p2 p2VarA3 = q2.a(objB);
        this.f76604m = p2VarA3;
        this.f76605n = s.d(p2VarA3);
    }

    public static void y4(Object obj, String str) {
        Throwable thB = q.b(obj);
        if (thB != null) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strJ = a0.j("Failed to send ", str, ": ", thB.getMessage());
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceCustomizationViewModel", strJ);
        }
    }

    public final void A4(j90.o oVar) {
        p2 p2Var;
        Object value;
        f fVar;
        oVar.getClass();
        do {
            p2Var = this.f76604m;
            value = p2Var.getValue();
            fVar = (f) value;
        } while (!p2Var.b(value, fVar != null ? f.b(fVar, null, null, null, oVar.f97854a, null, null, null, 247) : null));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[PHI: r12
      0x0058: PHI (r12v13 la0.a) = (r12v7 la0.a), (r12v19 la0.a) binds: [B:56:0x00ce, B:28:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb A[PHI: r12
      0x00bb: PHI (r12v7 la0.a) = (r12v0 la0.a), (r12v0 la0.a), (r12v10 la0.a) binds: [B:37:0x0071, B:39:0x0079, B:52:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151 A[PHI: r1
      0x0151: PHI (r1v18 la0.a) = (r1v12 la0.a), (r1v19 la0.a) binds: [B:76:0x0124, B:86:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:92:0x016d  */
    public final Object x4(la0.a aVar, v13.c cVar) {
        ga0.c cVar2;
        Throwable th3;
        la0.a aVar2;
        a aVar3;
        GDISimpleSetup.FeatureType featureType;
        Object bVar;
        la0.a aVar4;
        long j8;
        Throwable th4;
        a aVar5;
        GDISimpleSetup.FeatureType featureType2;
        Object bVar2;
        ArrayList arrayList;
        Throwable th5;
        a aVar6;
        Object bVar3;
        Throwable th6;
        a aVar7;
        List<GDISimpleSetup.SensorType> list;
        Object bVar4;
        if (cVar instanceof ga0.c) {
            cVar2 = (ga0.c) cVar;
            int i14 = cVar2.f76616f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f76616f = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new ga0.c(this, cVar);
            }
        } else {
            cVar2 = new ga0.c(this, cVar);
        }
        ga0.c cVar3 = cVar2;
        Object obj = cVar3.f76614d;
        u13.a aVar8 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f76616f;
        q90.c cVar4 = this.f76592a;
        o oVar = this.f76596e;
        switch (i15) {
            case 0:
                r.b(obj);
                if (aVar.f111608a) {
                    long j14 = aVar.f111610c;
                    if (j14 > 0) {
                        long j15 = cVar4.f143493a;
                        cVar3.f76611a = aVar;
                        cVar3.f76616f = 1;
                        if (this.f76597f.d(j15, j14, cVar3) != aVar8) {
                            try {
                                int i16 = q.f128596b;
                                featureType = GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION;
                                cVar3.f76611a = aVar;
                                cVar3.f76612b = this;
                                cVar3.f76616f = 2;
                                if (oVar.c(featureType, cVar3) != aVar8) {
                                    aVar2 = aVar;
                                    aVar3 = this;
                                    bVar = Unit.INSTANCE;
                                    int i17 = q.f128596b;
                                    aVar3.getClass();
                                    y4(bVar, "activity profile restore notification");
                                    aVar = aVar2;
                                    if (aVar.f111609b) {
                                        j8 = cVar4.f143493a;
                                        cVar3.f76611a = aVar;
                                        cVar3.f76612b = null;
                                        cVar3.f76616f = 3;
                                        if (this.f76597f.b(j8, cVar3) != aVar8) {
                                            aVar4 = aVar;
                                            try {
                                                int i18 = q.f128596b;
                                                featureType2 = GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR;
                                                cVar3.f76611a = aVar4;
                                                cVar3.f76612b = this;
                                                cVar3.f76616f = 4;
                                                if (oVar.c(featureType2, cVar3) != aVar8) {
                                                    aVar5 = this;
                                                    bVar2 = Unit.INSTANCE;
                                                    int i19 = q.f128596b;
                                                    aVar5.getClass();
                                                    y4(bVar2, "sensor restore notification");
                                                    List<n> list2 = aVar4.f111612e;
                                                    arrayList = new ArrayList();
                                                    for (Object obj2 : list2) {
                                                        if (((n) obj2).f97843d) {
                                                            arrayList.add(obj2);
                                                        }
                                                    }
                                                    if (!arrayList.isEmpty()) {
                                                        if (!aVar4.f111611d.isEmpty()) {
                                                            int i24 = q.f128596b;
                                                            list = aVar4.f111611d;
                                                            cVar3.f76611a = null;
                                                            cVar3.f76612b = null;
                                                            cVar3.f76613c = this;
                                                            cVar3.f76616f = 6;
                                                            if (oVar.e(list, cVar3) != aVar8) {
                                                                aVar7 = this;
                                                                bVar4 = Unit.INSTANCE;
                                                                int i25 = q.f128596b;
                                                                aVar7.getClass();
                                                                y4(bVar4, "selected sensors notification");
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    try {
                                                        int i26 = q.f128596b;
                                                        cVar3.f76611a = aVar4;
                                                        cVar3.f76612b = null;
                                                        cVar3.f76613c = this;
                                                        cVar3.f76616f = 5;
                                                        if (oVar.d(arrayList, cVar3) != aVar8) {
                                                            aVar6 = this;
                                                            bVar3 = Unit.INSTANCE;
                                                            int i27 = q.f128596b;
                                                            aVar6.getClass();
                                                            y4(bVar3, "selected sports notification");
                                                            if (!aVar4.f111611d.isEmpty()) {
                                                                try {
                                                                    int i28 = q.f128596b;
                                                                    list = aVar4.f111611d;
                                                                    cVar3.f76611a = null;
                                                                    cVar3.f76612b = null;
                                                                    cVar3.f76613c = this;
                                                                    cVar3.f76616f = 6;
                                                                    if (oVar.e(list, cVar3) != aVar8) {
                                                                        aVar7 = this;
                                                                        bVar4 = Unit.INSTANCE;
                                                                        int i29 = q.f128596b;
                                                                        aVar7.getClass();
                                                                        y4(bVar4, "selected sensors notification");
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th6 = th7;
                                                                    aVar7 = this;
                                                                    int i30 = q.f128596b;
                                                                    bVar4 = new q.b(th6);
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th5 = th8;
                                                        aVar6 = this;
                                                        int i34 = q.f128596b;
                                                        bVar3 = new q.b(th5);
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th4 = th9;
                                                aVar5 = this;
                                                int i35 = q.f128596b;
                                                bVar2 = new q.b(th4);
                                            }
                                        }
                                    } else {
                                        aVar4 = aVar;
                                        List<n> list3 = aVar4.f111612e;
                                        arrayList = new ArrayList();
                                        while (r12.hasNext()) {
                                            if (((n) obj2).f97843d) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            if (!aVar4.f111611d.isEmpty()) {
                                                int i210 = q.f128596b;
                                                list = aVar4.f111611d;
                                                cVar3.f76611a = null;
                                                cVar3.f76612b = null;
                                                cVar3.f76613c = this;
                                                cVar3.f76616f = 6;
                                                if (oVar.e(list, cVar3) != aVar8) {
                                                    aVar7 = this;
                                                    bVar4 = Unit.INSTANCE;
                                                    int i211 = q.f128596b;
                                                    aVar7.getClass();
                                                    y4(bVar4, "selected sensors notification");
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        int i212 = q.f128596b;
                                        cVar3.f76611a = aVar4;
                                        cVar3.f76612b = null;
                                        cVar3.f76613c = this;
                                        cVar3.f76616f = 5;
                                        if (oVar.d(arrayList, cVar3) != aVar8) {
                                            aVar6 = this;
                                            bVar3 = Unit.INSTANCE;
                                            int i213 = q.f128596b;
                                            aVar6.getClass();
                                            y4(bVar3, "selected sports notification");
                                            if (!aVar4.f111611d.isEmpty()) {
                                                int i214 = q.f128596b;
                                                list = aVar4.f111611d;
                                                cVar3.f76611a = null;
                                                cVar3.f76612b = null;
                                                cVar3.f76613c = this;
                                                cVar3.f76616f = 6;
                                                if (oVar.e(list, cVar3) != aVar8) {
                                                    aVar7 = this;
                                                    bVar4 = Unit.INSTANCE;
                                                    int i215 = q.f128596b;
                                                    aVar7.getClass();
                                                    y4(bVar4, "selected sensors notification");
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            } catch (Throwable th10) {
                                th3 = th10;
                                aVar2 = aVar;
                                aVar3 = this;
                                int i36 = q.f128596b;
                                bVar = new q.b(th3);
                            }
                        }
                    } else if (aVar.f111609b) {
                        j8 = cVar4.f143493a;
                        cVar3.f76611a = aVar;
                        cVar3.f76612b = null;
                        cVar3.f76616f = 3;
                        if (this.f76597f.b(j8, cVar3) != aVar8) {
                            aVar4 = aVar;
                            int i110 = q.f128596b;
                            featureType2 = GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR;
                            cVar3.f76611a = aVar4;
                            cVar3.f76612b = this;
                            cVar3.f76616f = 4;
                            if (oVar.c(featureType2, cVar3) != aVar8) {
                                aVar5 = this;
                                bVar2 = Unit.INSTANCE;
                                int i111 = q.f128596b;
                                aVar5.getClass();
                                y4(bVar2, "sensor restore notification");
                                List<n> list4 = aVar4.f111612e;
                                arrayList = new ArrayList();
                                while (r12.hasNext()) {
                                    if (((n) obj2).f97843d) {
                                        arrayList.add(obj2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (!aVar4.f111611d.isEmpty()) {
                                        int i216 = q.f128596b;
                                        list = aVar4.f111611d;
                                        cVar3.f76611a = null;
                                        cVar3.f76612b = null;
                                        cVar3.f76613c = this;
                                        cVar3.f76616f = 6;
                                        if (oVar.e(list, cVar3) != aVar8) {
                                            aVar7 = this;
                                            bVar4 = Unit.INSTANCE;
                                            int i217 = q.f128596b;
                                            aVar7.getClass();
                                            y4(bVar4, "selected sensors notification");
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                int i218 = q.f128596b;
                                cVar3.f76611a = aVar4;
                                cVar3.f76612b = null;
                                cVar3.f76613c = this;
                                cVar3.f76616f = 5;
                                if (oVar.d(arrayList, cVar3) != aVar8) {
                                    aVar6 = this;
                                    bVar3 = Unit.INSTANCE;
                                    int i219 = q.f128596b;
                                    aVar6.getClass();
                                    y4(bVar3, "selected sports notification");
                                    if (!aVar4.f111611d.isEmpty()) {
                                        int i2110 = q.f128596b;
                                        list = aVar4.f111611d;
                                        cVar3.f76611a = null;
                                        cVar3.f76612b = null;
                                        cVar3.f76613c = this;
                                        cVar3.f76616f = 6;
                                        if (oVar.e(list, cVar3) != aVar8) {
                                            aVar7 = this;
                                            bVar4 = Unit.INSTANCE;
                                            int i2111 = q.f128596b;
                                            aVar7.getClass();
                                            y4(bVar4, "selected sensors notification");
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        aVar4 = aVar;
                        List<n> list5 = aVar4.f111612e;
                        arrayList = new ArrayList();
                        while (r12.hasNext()) {
                            if (((n) obj2).f97843d) {
                                arrayList.add(obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            if (!aVar4.f111611d.isEmpty()) {
                                int i2112 = q.f128596b;
                                list = aVar4.f111611d;
                                cVar3.f76611a = null;
                                cVar3.f76612b = null;
                                cVar3.f76613c = this;
                                cVar3.f76616f = 6;
                                if (oVar.e(list, cVar3) != aVar8) {
                                    aVar7 = this;
                                    bVar4 = Unit.INSTANCE;
                                    int i2113 = q.f128596b;
                                    aVar7.getClass();
                                    y4(bVar4, "selected sensors notification");
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        int i2114 = q.f128596b;
                        cVar3.f76611a = aVar4;
                        cVar3.f76612b = null;
                        cVar3.f76613c = this;
                        cVar3.f76616f = 5;
                        if (oVar.d(arrayList, cVar3) != aVar8) {
                            aVar6 = this;
                            bVar3 = Unit.INSTANCE;
                            int i2115 = q.f128596b;
                            aVar6.getClass();
                            y4(bVar3, "selected sports notification");
                            if (!aVar4.f111611d.isEmpty()) {
                                int i2116 = q.f128596b;
                                list = aVar4.f111611d;
                                cVar3.f76611a = null;
                                cVar3.f76612b = null;
                                cVar3.f76613c = this;
                                cVar3.f76616f = 6;
                                if (oVar.e(list, cVar3) != aVar8) {
                                    aVar7 = this;
                                    bVar4 = Unit.INSTANCE;
                                    int i2117 = q.f128596b;
                                    aVar7.getClass();
                                    y4(bVar4, "selected sensors notification");
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else if (aVar.f111609b) {
                    j8 = cVar4.f143493a;
                    cVar3.f76611a = aVar;
                    cVar3.f76612b = null;
                    cVar3.f76616f = 3;
                    if (this.f76597f.b(j8, cVar3) != aVar8) {
                        aVar4 = aVar;
                        int i112 = q.f128596b;
                        featureType2 = GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR;
                        cVar3.f76611a = aVar4;
                        cVar3.f76612b = this;
                        cVar3.f76616f = 4;
                        if (oVar.c(featureType2, cVar3) != aVar8) {
                            aVar5 = this;
                            bVar2 = Unit.INSTANCE;
                            int i113 = q.f128596b;
                            aVar5.getClass();
                            y4(bVar2, "sensor restore notification");
                            List<n> list6 = aVar4.f111612e;
                            arrayList = new ArrayList();
                            while (r12.hasNext()) {
                                if (((n) obj2).f97843d) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                if (!aVar4.f111611d.isEmpty()) {
                                    int i2118 = q.f128596b;
                                    list = aVar4.f111611d;
                                    cVar3.f76611a = null;
                                    cVar3.f76612b = null;
                                    cVar3.f76613c = this;
                                    cVar3.f76616f = 6;
                                    if (oVar.e(list, cVar3) != aVar8) {
                                        aVar7 = this;
                                        bVar4 = Unit.INSTANCE;
                                        int i2119 = q.f128596b;
                                        aVar7.getClass();
                                        y4(bVar4, "selected sensors notification");
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            int i21110 = q.f128596b;
                            cVar3.f76611a = aVar4;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 5;
                            if (oVar.d(arrayList, cVar3) != aVar8) {
                                aVar6 = this;
                                bVar3 = Unit.INSTANCE;
                                int i21111 = q.f128596b;
                                aVar6.getClass();
                                y4(bVar3, "selected sports notification");
                                if (!aVar4.f111611d.isEmpty()) {
                                    int i21112 = q.f128596b;
                                    list = aVar4.f111611d;
                                    cVar3.f76611a = null;
                                    cVar3.f76612b = null;
                                    cVar3.f76613c = this;
                                    cVar3.f76616f = 6;
                                    if (oVar.e(list, cVar3) != aVar8) {
                                        aVar7 = this;
                                        bVar4 = Unit.INSTANCE;
                                        int i21113 = q.f128596b;
                                        aVar7.getClass();
                                        y4(bVar4, "selected sensors notification");
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    aVar4 = aVar;
                    List<n> list7 = aVar4.f111612e;
                    arrayList = new ArrayList();
                    while (r12.hasNext()) {
                        if (((n) obj2).f97843d) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (!aVar4.f111611d.isEmpty()) {
                            int i21114 = q.f128596b;
                            list = aVar4.f111611d;
                            cVar3.f76611a = null;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 6;
                            if (oVar.e(list, cVar3) != aVar8) {
                                aVar7 = this;
                                bVar4 = Unit.INSTANCE;
                                int i21115 = q.f128596b;
                                aVar7.getClass();
                                y4(bVar4, "selected sensors notification");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i21116 = q.f128596b;
                    cVar3.f76611a = aVar4;
                    cVar3.f76612b = null;
                    cVar3.f76613c = this;
                    cVar3.f76616f = 5;
                    if (oVar.d(arrayList, cVar3) != aVar8) {
                        aVar6 = this;
                        bVar3 = Unit.INSTANCE;
                        int i21117 = q.f128596b;
                        aVar6.getClass();
                        y4(bVar3, "selected sports notification");
                        if (!aVar4.f111611d.isEmpty()) {
                            int i21118 = q.f128596b;
                            list = aVar4.f111611d;
                            cVar3.f76611a = null;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 6;
                            if (oVar.e(list, cVar3) != aVar8) {
                                aVar7 = this;
                                bVar4 = Unit.INSTANCE;
                                int i21119 = q.f128596b;
                                aVar7.getClass();
                                y4(bVar4, "selected sensors notification");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar8;
            case 1:
                aVar = cVar3.f76611a;
                r.b(obj);
                int i114 = q.f128596b;
                featureType = GDISimpleSetup.FeatureType.ACTIVITY_PROFILE_MIGRATION;
                cVar3.f76611a = aVar;
                cVar3.f76612b = this;
                cVar3.f76616f = 2;
                if (oVar.c(featureType, cVar3) != aVar8) {
                    aVar2 = aVar;
                    aVar3 = this;
                    bVar = Unit.INSTANCE;
                    int i115 = q.f128596b;
                    aVar3.getClass();
                    y4(bVar, "activity profile restore notification");
                    aVar = aVar2;
                    if (aVar.f111609b) {
                        j8 = cVar4.f143493a;
                        cVar3.f76611a = aVar;
                        cVar3.f76612b = null;
                        cVar3.f76616f = 3;
                        if (this.f76597f.b(j8, cVar3) != aVar8) {
                            aVar4 = aVar;
                            int i116 = q.f128596b;
                            featureType2 = GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR;
                            cVar3.f76611a = aVar4;
                            cVar3.f76612b = this;
                            cVar3.f76616f = 4;
                            if (oVar.c(featureType2, cVar3) != aVar8) {
                                aVar5 = this;
                                bVar2 = Unit.INSTANCE;
                                int i117 = q.f128596b;
                                aVar5.getClass();
                                y4(bVar2, "sensor restore notification");
                                List<n> list8 = aVar4.f111612e;
                                arrayList = new ArrayList();
                                while (r12.hasNext()) {
                                    if (((n) obj2).f97843d) {
                                        arrayList.add(obj2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (!aVar4.f111611d.isEmpty()) {
                                        int i211110 = q.f128596b;
                                        list = aVar4.f111611d;
                                        cVar3.f76611a = null;
                                        cVar3.f76612b = null;
                                        cVar3.f76613c = this;
                                        cVar3.f76616f = 6;
                                        if (oVar.e(list, cVar3) != aVar8) {
                                            aVar7 = this;
                                            bVar4 = Unit.INSTANCE;
                                            int i211111 = q.f128596b;
                                            aVar7.getClass();
                                            y4(bVar4, "selected sensors notification");
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                int i211112 = q.f128596b;
                                cVar3.f76611a = aVar4;
                                cVar3.f76612b = null;
                                cVar3.f76613c = this;
                                cVar3.f76616f = 5;
                                if (oVar.d(arrayList, cVar3) != aVar8) {
                                    aVar6 = this;
                                    bVar3 = Unit.INSTANCE;
                                    int i211113 = q.f128596b;
                                    aVar6.getClass();
                                    y4(bVar3, "selected sports notification");
                                    if (!aVar4.f111611d.isEmpty()) {
                                        int i211114 = q.f128596b;
                                        list = aVar4.f111611d;
                                        cVar3.f76611a = null;
                                        cVar3.f76612b = null;
                                        cVar3.f76613c = this;
                                        cVar3.f76616f = 6;
                                        if (oVar.e(list, cVar3) != aVar8) {
                                            aVar7 = this;
                                            bVar4 = Unit.INSTANCE;
                                            int i211115 = q.f128596b;
                                            aVar7.getClass();
                                            y4(bVar4, "selected sensors notification");
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        aVar4 = aVar;
                        List<n> list9 = aVar4.f111612e;
                        arrayList = new ArrayList();
                        while (r12.hasNext()) {
                            if (((n) obj2).f97843d) {
                                arrayList.add(obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            if (!aVar4.f111611d.isEmpty()) {
                                int i211116 = q.f128596b;
                                list = aVar4.f111611d;
                                cVar3.f76611a = null;
                                cVar3.f76612b = null;
                                cVar3.f76613c = this;
                                cVar3.f76616f = 6;
                                if (oVar.e(list, cVar3) != aVar8) {
                                    aVar7 = this;
                                    bVar4 = Unit.INSTANCE;
                                    int i211117 = q.f128596b;
                                    aVar7.getClass();
                                    y4(bVar4, "selected sensors notification");
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        int i211118 = q.f128596b;
                        cVar3.f76611a = aVar4;
                        cVar3.f76612b = null;
                        cVar3.f76613c = this;
                        cVar3.f76616f = 5;
                        if (oVar.d(arrayList, cVar3) != aVar8) {
                            aVar6 = this;
                            bVar3 = Unit.INSTANCE;
                            int i211119 = q.f128596b;
                            aVar6.getClass();
                            y4(bVar3, "selected sports notification");
                            if (!aVar4.f111611d.isEmpty()) {
                                int i2111110 = q.f128596b;
                                list = aVar4.f111611d;
                                cVar3.f76611a = null;
                                cVar3.f76612b = null;
                                cVar3.f76613c = this;
                                cVar3.f76616f = 6;
                                if (oVar.e(list, cVar3) != aVar8) {
                                    aVar7 = this;
                                    bVar4 = Unit.INSTANCE;
                                    int i2111111 = q.f128596b;
                                    aVar7.getClass();
                                    y4(bVar4, "selected sensors notification");
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar8;
            case 2:
                aVar3 = cVar3.f76612b;
                aVar2 = cVar3.f76611a;
                try {
                    r.b(obj);
                    bVar = Unit.INSTANCE;
                    int i118 = q.f128596b;
                    break;
                } catch (Throwable th11) {
                    th3 = th11;
                    int i37 = q.f128596b;
                    bVar = new q.b(th3);
                }
                aVar3.getClass();
                y4(bVar, "activity profile restore notification");
                aVar = aVar2;
                if (aVar.f111609b) {
                    j8 = cVar4.f143493a;
                    cVar3.f76611a = aVar;
                    cVar3.f76612b = null;
                    cVar3.f76616f = 3;
                    if (this.f76597f.b(j8, cVar3) != aVar8) {
                        aVar4 = aVar;
                        int i119 = q.f128596b;
                        featureType2 = GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR;
                        cVar3.f76611a = aVar4;
                        cVar3.f76612b = this;
                        cVar3.f76616f = 4;
                        if (oVar.c(featureType2, cVar3) != aVar8) {
                            aVar5 = this;
                            bVar2 = Unit.INSTANCE;
                            int i1110 = q.f128596b;
                            aVar5.getClass();
                            y4(bVar2, "sensor restore notification");
                            List<n> list10 = aVar4.f111612e;
                            arrayList = new ArrayList();
                            while (r12.hasNext()) {
                                if (((n) obj2).f97843d) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                if (!aVar4.f111611d.isEmpty()) {
                                    int i2111112 = q.f128596b;
                                    list = aVar4.f111611d;
                                    cVar3.f76611a = null;
                                    cVar3.f76612b = null;
                                    cVar3.f76613c = this;
                                    cVar3.f76616f = 6;
                                    if (oVar.e(list, cVar3) != aVar8) {
                                        aVar7 = this;
                                        bVar4 = Unit.INSTANCE;
                                        int i2111113 = q.f128596b;
                                        aVar7.getClass();
                                        y4(bVar4, "selected sensors notification");
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            int i2111114 = q.f128596b;
                            cVar3.f76611a = aVar4;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 5;
                            if (oVar.d(arrayList, cVar3) != aVar8) {
                                aVar6 = this;
                                bVar3 = Unit.INSTANCE;
                                int i2111115 = q.f128596b;
                                aVar6.getClass();
                                y4(bVar3, "selected sports notification");
                                if (!aVar4.f111611d.isEmpty()) {
                                    int i2111116 = q.f128596b;
                                    list = aVar4.f111611d;
                                    cVar3.f76611a = null;
                                    cVar3.f76612b = null;
                                    cVar3.f76613c = this;
                                    cVar3.f76616f = 6;
                                    if (oVar.e(list, cVar3) != aVar8) {
                                        aVar7 = this;
                                        bVar4 = Unit.INSTANCE;
                                        int i2111117 = q.f128596b;
                                        aVar7.getClass();
                                        y4(bVar4, "selected sensors notification");
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    aVar4 = aVar;
                    List<n> list11 = aVar4.f111612e;
                    arrayList = new ArrayList();
                    while (r12.hasNext()) {
                        if (((n) obj2).f97843d) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (!aVar4.f111611d.isEmpty()) {
                            int i2111118 = q.f128596b;
                            list = aVar4.f111611d;
                            cVar3.f76611a = null;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 6;
                            if (oVar.e(list, cVar3) != aVar8) {
                                aVar7 = this;
                                bVar4 = Unit.INSTANCE;
                                int i2111119 = q.f128596b;
                                aVar7.getClass();
                                y4(bVar4, "selected sensors notification");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i21111110 = q.f128596b;
                    cVar3.f76611a = aVar4;
                    cVar3.f76612b = null;
                    cVar3.f76613c = this;
                    cVar3.f76616f = 5;
                    if (oVar.d(arrayList, cVar3) != aVar8) {
                        aVar6 = this;
                        bVar3 = Unit.INSTANCE;
                        int i21111111 = q.f128596b;
                        aVar6.getClass();
                        y4(bVar3, "selected sports notification");
                        if (!aVar4.f111611d.isEmpty()) {
                            int i21111112 = q.f128596b;
                            list = aVar4.f111611d;
                            cVar3.f76611a = null;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 6;
                            if (oVar.e(list, cVar3) != aVar8) {
                                aVar7 = this;
                                bVar4 = Unit.INSTANCE;
                                int i21111113 = q.f128596b;
                                aVar7.getClass();
                                y4(bVar4, "selected sensors notification");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar8;
            case 3:
                aVar = cVar3.f76611a;
                r.b(obj);
                aVar4 = aVar;
                int i1111 = q.f128596b;
                featureType2 = GDISimpleSetup.FeatureType.SENSOR_PRE_PAIR;
                cVar3.f76611a = aVar4;
                cVar3.f76612b = this;
                cVar3.f76616f = 4;
                if (oVar.c(featureType2, cVar3) != aVar8) {
                    aVar5 = this;
                    bVar2 = Unit.INSTANCE;
                    int i1112 = q.f128596b;
                    aVar5.getClass();
                    y4(bVar2, "sensor restore notification");
                    List<n> list12 = aVar4.f111612e;
                    arrayList = new ArrayList();
                    while (r12.hasNext()) {
                        if (((n) obj2).f97843d) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (!aVar4.f111611d.isEmpty()) {
                            int i21111114 = q.f128596b;
                            list = aVar4.f111611d;
                            cVar3.f76611a = null;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 6;
                            if (oVar.e(list, cVar3) != aVar8) {
                                aVar7 = this;
                                bVar4 = Unit.INSTANCE;
                                int i21111115 = q.f128596b;
                                aVar7.getClass();
                                y4(bVar4, "selected sensors notification");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i21111116 = q.f128596b;
                    cVar3.f76611a = aVar4;
                    cVar3.f76612b = null;
                    cVar3.f76613c = this;
                    cVar3.f76616f = 5;
                    if (oVar.d(arrayList, cVar3) != aVar8) {
                        aVar6 = this;
                        bVar3 = Unit.INSTANCE;
                        int i21111117 = q.f128596b;
                        aVar6.getClass();
                        y4(bVar3, "selected sports notification");
                        if (!aVar4.f111611d.isEmpty()) {
                            int i21111118 = q.f128596b;
                            list = aVar4.f111611d;
                            cVar3.f76611a = null;
                            cVar3.f76612b = null;
                            cVar3.f76613c = this;
                            cVar3.f76616f = 6;
                            if (oVar.e(list, cVar3) != aVar8) {
                                aVar7 = this;
                                bVar4 = Unit.INSTANCE;
                                int i21111119 = q.f128596b;
                                aVar7.getClass();
                                y4(bVar4, "selected sensors notification");
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar8;
            case 4:
                aVar5 = cVar3.f76612b;
                aVar4 = cVar3.f76611a;
                try {
                    r.b(obj);
                    bVar2 = Unit.INSTANCE;
                    int i1113 = q.f128596b;
                    break;
                } catch (Throwable th12) {
                    th4 = th12;
                    int i38 = q.f128596b;
                    bVar2 = new q.b(th4);
                }
                aVar5.getClass();
                y4(bVar2, "sensor restore notification");
                List<n> list13 = aVar4.f111612e;
                arrayList = new ArrayList();
                while (r12.hasNext()) {
                    if (((n) obj2).f97843d) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (!aVar4.f111611d.isEmpty()) {
                        int i211111110 = q.f128596b;
                        list = aVar4.f111611d;
                        cVar3.f76611a = null;
                        cVar3.f76612b = null;
                        cVar3.f76613c = this;
                        cVar3.f76616f = 6;
                        if (oVar.e(list, cVar3) != aVar8) {
                            aVar7 = this;
                            bVar4 = Unit.INSTANCE;
                            int i211111111 = q.f128596b;
                            aVar7.getClass();
                            y4(bVar4, "selected sensors notification");
                        }
                    }
                    return Unit.INSTANCE;
                }
                int i211111112 = q.f128596b;
                cVar3.f76611a = aVar4;
                cVar3.f76612b = null;
                cVar3.f76613c = this;
                cVar3.f76616f = 5;
                if (oVar.d(arrayList, cVar3) != aVar8) {
                    aVar6 = this;
                    bVar3 = Unit.INSTANCE;
                    int i211111113 = q.f128596b;
                    aVar6.getClass();
                    y4(bVar3, "selected sports notification");
                    if (!aVar4.f111611d.isEmpty()) {
                        int i211111114 = q.f128596b;
                        list = aVar4.f111611d;
                        cVar3.f76611a = null;
                        cVar3.f76612b = null;
                        cVar3.f76613c = this;
                        cVar3.f76616f = 6;
                        if (oVar.e(list, cVar3) != aVar8) {
                            aVar7 = this;
                            bVar4 = Unit.INSTANCE;
                            int i211111115 = q.f128596b;
                            aVar7.getClass();
                            y4(bVar4, "selected sensors notification");
                        }
                    }
                    return Unit.INSTANCE;
                }
                return aVar8;
            case 5:
                aVar6 = cVar3.f76613c;
                aVar4 = cVar3.f76611a;
                try {
                    r.b(obj);
                    bVar3 = Unit.INSTANCE;
                    int i211111116 = q.f128596b;
                    break;
                } catch (Throwable th13) {
                    th5 = th13;
                    int i39 = q.f128596b;
                    bVar3 = new q.b(th5);
                }
                aVar6.getClass();
                y4(bVar3, "selected sports notification");
                if (!aVar4.f111611d.isEmpty()) {
                    int i211111117 = q.f128596b;
                    list = aVar4.f111611d;
                    cVar3.f76611a = null;
                    cVar3.f76612b = null;
                    cVar3.f76613c = this;
                    cVar3.f76616f = 6;
                    if (oVar.e(list, cVar3) != aVar8) {
                        aVar7 = this;
                        bVar4 = Unit.INSTANCE;
                        int i211111118 = q.f128596b;
                        aVar7.getClass();
                        y4(bVar4, "selected sensors notification");
                    }
                    return aVar8;
                }
                return Unit.INSTANCE;
            case 6:
                aVar7 = cVar3.f76613c;
                try {
                    r.b(obj);
                    bVar4 = Unit.INSTANCE;
                    int i211111119 = q.f128596b;
                    break;
                } catch (Throwable th14) {
                    th6 = th14;
                    int i310 = q.f128596b;
                    bVar4 = new q.b(th6);
                }
                aVar7.getClass();
                y4(bVar4, "selected sensors notification");
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.ArrayList] */
    public final i0 z4(e eVar) {
        o13.p pVar;
        Object oVar;
        h90.e eVar2;
        ?? arrayList;
        Iterator it = h0.U(this.f76602k, eVar != null ? this.f76602k.indexOf(eVar) + 1 : 0).iterator();
        if (it.hasNext()) {
            e eVar3 = (e) it.next();
            q90.c cVar = this.f76592a;
            String str = cVar.f143495c.f111521f;
            f fVar = this.f76603l;
            if (fVar == null) {
                fVar = new f((List) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 255, (p005kotlin.jvm.internal.j) null);
            }
            yl2.b bVar = cVar.f143495c.f111530o;
            g gVar = this.f76594c.f82522a;
            eVar3.getClass();
            str.getClass();
            bVar.getClass();
            List<com.garmin.android.apps.connectmobile.devices.model.w> list = fVar.f203043a;
            switch (h90.c.b.f82523a[eVar3.ordinal()]) {
                case 1:
                    int i14 = g.a.f82529a[bVar.ordinal()];
                    if (i14 == 1) {
                        eVar2 = new h90.e(2131232135, R.drawable.gcm3_vivosmart_front_vertical);
                    } else if (i14 == 2) {
                        eVar2 = new h90.e(2131232139, 2131232140);
                    } else if (i14 != 3) {
                        eVar2 = i14 != 4 ? new h90.e(2131231969, 2131231969) : new h90.e(2131233626, 2131233627);
                    } else {
                        eVar2 = new h90.e(2131232187, 2131232188);
                    }
                    oVar = new i0.o(eVar2);
                    break;
                case 2:
                    if (list == null || list.isEmpty()) {
                        arrayList = j0.f134944a;
                    } else {
                        arrayList = new ArrayList();
                        for (com.garmin.android.apps.connectmobile.devices.model.w wVar : list) {
                            w13.c cVar2 = s0.f203655g;
                            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                            while (bVarN.hasNext()) {
                                s0 s0Var = (s0) bVarN.next();
                                if (wVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == s0Var.f203656a.f20535a) {
                                    arrayList.add(s0Var);
                                }
                            }
                        }
                    }
                    int iIndexOf = arrayList.indexOf(s0.GCMDeviceLanguageEnglish);
                    if (iIndexOf > 0) {
                        Collections.swap(arrayList, 0, iIndexOf);
                    }
                    Iterable iterable = (Iterable) arrayList;
                    ArrayList arrayList2 = new ArrayList(y.r(iterable, 10));
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Integer.valueOf(((s0) it3.next()).f203656a.f20535a));
                    }
                    oVar = new i0.p(str, arrayList2);
                    break;
                case 3:
                    oVar = i0.x.INSTANCE;
                    break;
                case 4:
                    oVar = i0.w.INSTANCE;
                    break;
                case 5:
                    oVar = new i0.i(new h90.b(R.drawable.va3_orientation_left_button_left_bic, R.drawable.va3_orientation_left_button_right_bic, R.drawable.va3_orientation_right_button_left_bic, R.drawable.va3_orientation_right_button_right_bic));
                    break;
                case 6:
                    oVar = i0.h.INSTANCE;
                    break;
                case 7:
                    int i15 = g.a.f82529a[bVar.ordinal()];
                    h90.a aVar = (i15 == 5 || i15 != 6) ? new h90.a(p13.w.c(j90.a.WALKING), R.string.activity_options_bic_description, 10, 1, p13.w.c(String.valueOf(10))) : new h90.a(j0.f134944a, R.string.activity_options_bic_description_unlimited, Integer.MAX_VALUE, 1, (List) null, 16, (p005kotlin.jvm.internal.j) null);
                    oVar = new i0.a(aVar);
                    break;
                case 8:
                    oVar = i0.t.INSTANCE;
                    break;
                case 9:
                    oVar = i0.b.INSTANCE;
                    break;
                default:
                    u0.r();
                    return null;
            }
            a2 a2Var = a2.DEVICE_SETUP;
            String strJ = a0.j("Step: ", eVar3.f97808a, " for ", str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ConvertDeviceCustomizationUseCase", strJ);
            pVar = new o13.p(eVar3, oVar);
        } else {
            pVar = null;
        }
        if (pVar == null) {
            pVar = new o13.p(null, new i0.n(null));
        }
        i0 i0Var = (i0) pVar.f128595b;
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "DeviceCustomizationViewModel", "Navigating to next customization step: " + eVar + ", screen: " + i0Var);
        return i0Var;
    }

    /* JADX INFO: renamed from: ga0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lga0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1539a {
        public /* synthetic */ C1539a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1539a() {
        }
    }
}
