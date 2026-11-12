package w61;

import android.annotation.SuppressLint;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lc.u0;
import o53.s0;
import org.joda.time.DateTime;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lw61/x;", "Landroidx/lifecycle/u1;", "Liw/e;", "personalPrefsRepo", "Lpc0/j;", "devicesRepo", "Lx61/k;", "mapper", "Lcom/garmin/android/apps/connectmobile/performance/model/a;", "cachedLastUsedDevice", "", "cachedDevicesList", "", "overridePreferredDevice", "Leu1/b;", "getATPStatusUseCase", "<init>", "(Liw/e;Lpc0/j;Lx61/k;Lcom/garmin/android/apps/connectmobile/performance/model/a;Ljava/util/Set;ZLeu1/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"LogNotTimber", "ktlint:standard:property-naming"})
public final class x extends u1 {
    public static final /* synthetic */ int O0 = 0;
    public final y0<f<c61.d>> A;
    public final y0<f<Unit>> B;
    public final y0<f<o13.p<Long, String>>> C;
    public final y0<f<o13.p<com.garmin.android.apps.connectmobile.performance.model.a, Set<com.garmin.android.apps.connectmobile.performance.model.a>>>> D;
    public final y0<f<o13.p<String, String>>> E;
    public final o13.t F;
    public final y0 H0;
    public final o13.t I;
    public final fj1.b I0;
    public gj1.f J0;
    public final y0<Boolean> K0;
    public final y0 L0;
    public boolean M0;
    public boolean N0;
    public final o13.t P;
    public fu1.w T;
    public final y0<o13.p<Boolean, DateTime>> X;
    public final y0 Y;
    public final s61.a Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw.e f183265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc0.j f183266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x61.k f183267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f183268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eu1.b f183269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k12.d f183270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f183271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> f183272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c> f183273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w0<fw.m<x61.p>> f183274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<Boolean> f183275k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final y0<Boolean> f183276k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public UserSettingsDTO f183277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f183278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f183279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.j f183280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j f183281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0<fw.m<com.garmin.android.apps.connectmobile.performance.model.a>> f183282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0<fw.m<com.garmin.android.apps.connectmobile.performance.model.a>> f183283r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w0 f183284t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f183285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f183286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<f<com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c>> f183287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0<f<o13.u<com.garmin.android.apps.connectmobile.performance.model.a, Set<com.garmin.android.apps.connectmobile.performance.model.a>, String>>> f183288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0<f<o13.p<com.garmin.android.apps.connectmobile.performance.model.a, Set<com.garmin.android.apps.connectmobile.performance.model.a>>>> f183289z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183290a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f183290a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getIsAcuteChronicDevice$1", f = "TrainingStatusViewModel.kt", l = {280}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183291a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f183293c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/devices/model/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$getIsAcuteChronicDevice$1$result$1", f = "TrainingStatusViewModel.kt", l = {280}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.devices.model.m>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f183294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f183295b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f183296c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar, String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f183295b = xVar;
                this.f183296c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f183295b, this.f183296c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends com.garmin.android.apps.connectmobile.devices.model.m>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f183294a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                k12.d dVar = this.f183295b.f183270f;
                this.f183294a = 1;
                Object objC = dVar.c(this.f183296c, this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f183293c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x.this.new c(this.f183293c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183291a;
            x xVar = x.this;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(xVar, this.f183293c, null);
                this.f183291a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Boolean acuteChronicWorkloadRatioCapable = ((com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a).getAcuteChronicWorkloadRatioCapable();
                xVar.M0 = acuteChronicWorkloadRatioCapable != null ? acuteChronicWorkloadRatioCapable.booleanValue() : false;
                xVar.f183276k0.j(Boolean.FALSE);
                xVar.N0 = false;
                xVar.K0.m(Boolean.TRUE);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                xVar.M0 = false;
                xVar.f183276k0.j(Boolean.FALSE);
                xVar.N0 = false;
                xVar.K0.m(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f183297a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f183297a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f183297a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f183297a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$saveTrainingStatusPauseDate$1$1", f = "TrainingStatusViewModel.kt", l = {1045}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UserSettingsDTO f183299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f183300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x61.p f183301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x f183302e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$saveTrainingStatusPauseDate$1$1$1", f = "TrainingStatusViewModel.kt", l = {1047, 1050}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f183303a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserSettingsDTO f183304b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ JSONObject f183305c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x61.p f183306d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x f183307e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, x61.p pVar, x xVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f183304b = userSettingsDTO;
                this.f183305c = jSONObject;
                this.f183306d = pVar;
                this.f183307e = xVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f183304b, this.f183305c, this.f183306d, this.f183307e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
            
                if (w61.x.x4(r6, r3, r8) == r0) goto L21;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f183303a;
                x61.p pVar = this.f183306d;
                x xVar = this.f183307e;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        o53.r<UserSettingsDTO> rVarK = new gw.g0(null, this.f183304b, this.f183305c).k();
                        this.f183303a = 1;
                        if (((o53.s) rVarK).C(this) == aVar) {
                        }
                        return aVar;
                    }
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    xVar.f183274j.j(fw.m.a.g(fw.m.f73767e, pVar, 1));
                    xVar.f183275k.j(Boolean.valueOf(pVar.f189269c));
                    x.z4(xVar, pVar.f189269c);
                    return Unit.INSTANCE;
                    if (pVar != null) {
                        pVar.f189269c = !pVar.f189269c;
                        this.f183303a = 2;
                    }
                } catch (Throwable th3) {
                    w0<fw.m<x61.p>> w0Var = xVar.f183274j;
                    fw.m.f73767e.getClass();
                    w0Var.j(fw.m.a.a(null, th3));
                    xVar.f183275k.j(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, x61.p pVar, x xVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f183299b = userSettingsDTO;
            this.f183300c = jSONObject;
            this.f183301d = pVar;
            this.f183302e = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f183299b, this.f183300c, this.f183301d, this.f183302e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183298a;
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f183299b, this.f183300c, this.f183301d, this.f183302e, null);
                this.f183298a = 1;
                if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public x(iw.e eVar, pc0.j jVar, x61.k kVar, com.garmin.android.apps.connectmobile.performance.model.a aVar, Set<com.garmin.android.apps.connectmobile.performance.model.a> set, boolean z14, eu1.b bVar) {
        eVar.getClass();
        jVar.getClass();
        kVar.getClass();
        bVar.getClass();
        this.f183265a = eVar;
        this.f183266b = jVar;
        this.f183267c = kVar;
        this.f183268d = z14;
        this.f183269e = bVar;
        this.f183270f = k12.d.a.a(k12.d.f102315g);
        this.f183271g = androidx.lifecycle.m.a(null, new b0(aVar, this, null), 3);
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var = new y0<>();
        this.f183272h = y0Var;
        this.f183273i = new y0<>();
        w0<fw.m<x61.p>> w0Var = new w0<>();
        this.f183274j = w0Var;
        this.f183275k = new y0<>();
        String strB = c22.j0.b(new DateTime().withTimeAtStartOfDay(), "yyyy-MM-dd", null);
        strB = strB == null ? "" : strB;
        this.f183279n = strB;
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new g0(this, strB, null), 3);
        this.f183280o = jVarA;
        this.f183281p = jVarA;
        int i14 = 0;
        this.f183282q = i.a(this.f183271g, jVarA, null, new w(this, i14));
        w0 w0VarA = i.a(this.f183271g, this.f183280o, null, new w(this, i14));
        this.f183283r = w0VarA;
        w0Var.n(w0VarA, new d(new v(this, 1)));
        this.f183284t = w0Var;
        this.f183285v = new LinkedHashMap();
        this.f183286w = new LinkedHashMap();
        this.f183287x = new y0<>();
        this.f183288y = new y0<>();
        this.f183289z = new y0<>();
        this.A = new y0<>();
        this.B = new y0<>();
        this.C = new y0<>();
        this.D = new y0<>();
        this.E = new y0<>();
        this.F = o13.m.b(new w11.b(27));
        this.I = o13.m.b(new vc0.v(this, 26));
        this.P = o13.m.b(new w11.b(28));
        y0<o13.p<Boolean, DateTime>> y0Var2 = new y0<>();
        this.X = y0Var2;
        this.Y = y0Var2;
        this.Z = s61.a.C2979a.a(s61.a.f157622b);
        y0<Boolean> y0Var3 = new y0<>();
        this.f183276k0 = y0Var3;
        this.H0 = y0Var3;
        this.I0 = fj1.b.a.a(fj1.b.f71828c);
        y0<Boolean> y0Var4 = new y0<>();
        this.K0 = y0Var4;
        this.L0 = y0Var4;
        y0Var.m(set == null ? new LinkedHashSet<>() : set);
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new d0(this, aVar, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(x xVar, x61.p pVar, v13.c cVar) {
        y yVar;
        x61.p pVar2;
        x xVar2;
        boolean z14;
        xw1.d dVar;
        xVar.getClass();
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f183312e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f183312e = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(xVar, cVar);
            }
        } else {
            yVar = new y(xVar, cVar);
        }
        Object objG4 = yVar.f183310c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f183312e;
        if (i15 == 0) {
            o13.r.b(objG4);
            if (pVar == null || !pVar.f189269c) {
                f12.l.f68084a.getClass();
                f12.l.a.a().N2(true);
            } else {
                yVar.f183308a = pVar;
                yVar.f183309b = xVar;
                yVar.f183312e = 1;
                objG4 = xVar.G4(yVar);
                if (objG4 == aVar) {
                    return aVar;
                }
                pVar2 = pVar;
                xVar2 = xVar;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xVar2 = yVar.f183309b;
        pVar2 = yVar.f183308a;
        o13.r.b(objG4);
        xVar2.T = (fu1.w) objG4;
        f12.l.f68084a.getClass();
        if (f12.l.a.a().m0()) {
            fu1.w wVar = xVar.T;
            z14 = (wVar == null || (dVar = wVar.f73566c) == null) ? false : dVar.Z();
        }
        pVar2.f189270d = z14;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y4(x xVar, v13.c cVar) {
        c0 c0Var;
        Object objE4;
        xVar.getClass();
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f183162c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f183162c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(xVar, cVar);
            }
        } else {
            c0Var = new c0(xVar, cVar);
        }
        Object objJ = c0Var.f183160a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f183162c;
        if (i15 == 0) {
            o13.r.b(objJ);
            iw.e eVar = xVar.f183265a;
            c0Var.f183162c = 1;
            eVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(eVar, new iw.h(eVar, null), c0Var);
            if (objJ != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            fw.m.a aVar = fw.m.f73767e;
            Throwable th3 = new Throwable(((v2.a) v2Var).f47383a.toString());
            aVar.getClass();
            return fw.m.a.a(null, th3);
        }
        String str = ((TrainingStatusDeviceDTO) ((v2.b) v2Var).f47386a).f39908a;
        if (!g22.n.d(str)) {
            return fw.m.a.g(fw.m.f73767e, null, 3);
        }
        String strN = fb1.c.n("Current DeviceId is: ", str);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "TrainingStatusViewModel", strN);
        Long lJ = d53.t.j(str);
        long jLongValue = lJ != null ? lJ.longValue() : -1L;
        c0Var.f183162c = 2;
        com.garmin.android.apps.connectmobile.performance.model.a aVar3 = new com.garmin.android.apps.connectmobile.performance.model.a();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(jLongValue, null);
        if (fVarI != null) {
            i2.a.b(a2Var, "TrainingStatusViewModel", "Found deviceId in cache, returning it");
            aVar3.f39917a = String.valueOf(jLongValue);
            aVar3.f39919c = zb0.t.d(fVarI);
            aVar3.f39918b = w2.a0.i(fVarI);
            objE4 = fw.m.a.g(fw.m.f73767e, aVar3, 1);
        } else {
            i2.a.b(a2Var, "TrainingStatusViewModel", "We didn't have the  deviceId in cache, calling device info");
            objE4 = xVar.E4(jLongValue, c0Var);
        }
        return objE4 == obj ? obj : objE4;
    }

    public static final void z4(x xVar, boolean z14) {
        ArrayList arrayList;
        String strA;
        y0<f<o13.p<String, String>>> y0Var = xVar.E;
        x61.k kVar = xVar.f183267c;
        if (!z14) {
            l22.b bVar = kVar.f189261b;
            y0Var.j(new f<>(new o13.p(bVar.getString(R.string.training_status_resumed), bVar.getString(R.string.training_status_resumed_desc))));
            return;
        }
        ArrayList arrayList2 = xVar.f183278m;
        o13.p pVar = null;
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                sd2.f fVar = (sd2.f) obj;
                if (fVar.c3() && fVar.p2()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            l22.b bVar2 = kVar.f189261b;
            if (arrayList.size() >= 3) {
                strA = bVar2.a(R.string.gcm_training_status_paused_many_devices_desc, bVar2.a(R.string.common_conjunct_3, String.valueOf(((sd2.f) arrayList.get(0)).getDisplayName()), String.valueOf(((sd2.f) arrayList.get(1)).getDisplayName()), String.valueOf(((sd2.f) arrayList.get(2)).getDisplayName())));
            } else if (arrayList.size() == 2) {
                strA = bVar2.a(R.string.gcm_training_status_paused_many_devices_desc, bVar2.a(R.string.common_conjunct_2, String.valueOf(((sd2.f) arrayList.get(0)).getDisplayName()), String.valueOf(((sd2.f) arrayList.get(1)).getDisplayName())));
            } else {
                strA = arrayList.size() == 1 ? bVar2.a(R.string.gcm_training_status_paused_single_device_desc, String.valueOf(((sd2.f) arrayList.get(0)).getDisplayName())) : null;
            }
            if (strA != null) {
                pVar = new o13.p(bVar2.getString(R.string.gcm_training_status_paused_label), strA);
            }
        }
        if (pVar != null) {
            y0Var.j(new f<>(pVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object A4(String str, boolean z14, v13.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f183316d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f183316d = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.f183314b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f183316d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (z14) {
                zVar.f183313a = str;
                zVar.f183316d = 1;
                if (J4(str, zVar) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zVar.f183313a;
            o13.r.b(obj);
        }
        y0 y0Var = new y0();
        Long l14 = new Long(-1L);
        fw.p pVar = fw.p.SUCCESS;
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setD = this.f183272h.d();
        Object obj3 = null;
        if (setD != null) {
            for (Object obj4 : setD) {
                if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.performance.model.a) obj4).f39917a, str)) {
                    obj3 = obj4;
                    break;
                }
            }
            obj3 = (com.garmin.android.apps.connectmobile.performance.model.a) obj3;
        }
        y0Var.m(new fw.m(l14, pVar, obj3, null, 8, null));
        this.f183271g = y0Var;
        this.f183282q.m(y0Var.d());
        this.f183283r.m(y0Var.d());
        B4(str);
        return Unit.INSTANCE;
    }

    public final void B4(String str) {
        ge1.b.T(v1.a(this), null, null, new c(str, null), 3);
    }

    public final String C4() {
        gj1.d primaryTrainingDeviceDTO;
        Long deviceId;
        gj1.e primaryTrainingDevices;
        List<gj1.b> listB;
        Object next;
        gj1.f fVar = this.J0;
        if (fVar != null && (primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO()) != null && (deviceId = primaryTrainingDeviceDTO.getDeviceId()) != null) {
            long jLongValue = deviceId.longValue();
            gj1.f fVar2 = this.J0;
            if (fVar2 != null && (primaryTrainingDevices = fVar2.getPrimaryTrainingDevices()) != null && (listB = primaryTrainingDevices.b()) != null) {
                Iterator<T> it = listB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Long deviceId2 = ((gj1.b) next).getDeviceId();
                    if (deviceId2 != null && deviceId2.longValue() == jLongValue) {
                        break;
                    }
                }
                gj1.b bVar = (gj1.b) next;
                if (bVar != null) {
                    return bVar.getDisplayName();
                }
            }
        }
        return null;
    }

    public final String D4() {
        gj1.d primaryTrainingDeviceDTO;
        Long deviceId;
        List<gj1.a> listF;
        gj1.a aVarT;
        gj1.f fVar = this.J0;
        if (fVar != null && (primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO()) != null && (deviceId = primaryTrainingDeviceDTO.getDeviceId()) != null) {
            long jLongValue = deviceId.longValue();
            gj1.f fVar2 = this.J0;
            if (fVar2 != null && (listF = fVar2.f()) != null && (aVarT = gl.b.t(Long.valueOf(jLongValue), listF)) != null) {
                return aVarT.getDisplayName();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object E4(long j8, v13.c cVar) {
        e0 e0Var;
        com.garmin.android.apps.connectmobile.performance.model.a aVar;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f183176e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f183176e = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.f183174c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f183176e;
        if (i15 == 0) {
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.performance.model.a aVar3 = new com.garmin.android.apps.connectmobile.performance.model.a();
            e0Var.f183173b = aVar3;
            e0Var.f183172a = j8;
            e0Var.f183176e = 1;
            pc0.j jVar = this.f183266b;
            jVar.getClass();
            Object objC = jVar.C(new pc0.s(jVar, j8, null), e0Var);
            if (objC == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj = objC;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = e0Var.f183172a;
            aVar = e0Var.f183173b;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            DeviceAppInfoDTO deviceAppInfoDTO = (DeviceAppInfoDTO) ((v2.b) v2Var).f47386a;
            if (deviceAppInfoDTO != null) {
                aVar.f39917a = String.valueOf(j8);
                aVar.f39919c = deviceAppInfoDTO.f33855c;
                aVar.f39918b = deviceAppInfoDTO.f33854b;
            }
            return fw.m.a.g(fw.m.f73767e, aVar, 1);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        fw.m.a aVar4 = fw.m.f73767e;
        Throwable th3 = new Throwable(((v2.a) v2Var).f47383a.toString());
        aVar4.getClass();
        return fw.m.a.a(null, th3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    public final androidx.lifecycle.s0<fw.m<TrainingStatusReportDTO>> F4(int i14, DateTime dateTime, DateTime dateTime2, boolean z14) {
        androidx.lifecycle.s0<fw.m<TrainingStatusReportDTO>> s0VarA;
        if (dateTime == null || dateTime2 == null) {
            return new y0();
        }
        o13.p pVar = new o13.p(dateTime, dateTime2);
        LinkedHashMap linkedHashMap = this.f183285v;
        androidx.lifecycle.s0<fw.m<TrainingStatusReportDTO>> s0Var = (androidx.lifecycle.s0) linkedHashMap.get(pVar);
        if (s0Var != null && !z14) {
            return s0Var;
        }
        String strB = c22.j0.b(dateTime, "yyyy-MM-dd", null);
        String str = strB == null ? "" : strB;
        String strB2 = c22.j0.b(dateTime2, "yyyy-MM-dd", null);
        String str2 = strB2 == null ? "" : strB2;
        if (i14 == 5) {
            s0VarA = androidx.lifecycle.m.a(null, new j0(1, this, str, str2, null), 3);
        } else if (i14 == 9) {
            s0VarA = androidx.lifecycle.m.a(null, new j0(2, this, str, str2, null), 3);
        } else if (i14 != 10) {
            s0VarA = new y0<>();
        } else {
            s0VarA = androidx.lifecycle.m.a(null, new j0(1, this, str, str2, null), 3);
        }
        linkedHashMap.put(pVar, s0VarA);
        return s0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object G4(v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f183181c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f183181c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objE = f0Var.f183179a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f183181c;
        if (i15 == 0) {
            o13.r.b(objE);
            f0Var.f183181c = 1;
            eu1.b bVar = this.f183269e;
            bVar.getClass();
            objE = o53.c0.e(new eu1.a(bVar, null), f0Var);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        v2 v2Var = (v2) objE;
        if (v2Var instanceof v2.b) {
            return (fu1.w) ((v2.b) v2Var).f47386a;
        }
        return null;
    }

    public final w0 H4(int i14, DateTime dateTime, DateTime dateTime2, boolean z14) {
        if (z14) {
            this.f183271g = androidx.lifecycle.m.a(null, new i0(this, null), 3);
        }
        return i.a(this.f183282q, F4(i14, dateTime, dateTime2, z14), null, new me1.d(this, dateTime, dateTime2, i14));
    }

    public final void I4(String str) {
        boolean z14 = bo1.a.a().c().e() || bo1.a.a().c().S();
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var = this.f183272h;
        y0<fw.m<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var2 = this.f183282q;
        if (z14) {
            fw.m<com.garmin.android.apps.connectmobile.performance.model.a> mVarD = y0Var2.d();
            com.garmin.android.apps.connectmobile.performance.model.a aVar = mVarD != null ? mVarD.f73770c : null;
            Set<com.garmin.android.apps.connectmobile.performance.model.a> setD = y0Var.d();
            this.f183288y.m(new f<>(new o13.u(aVar, setD != null ? p13.h0.f1(setD) : null, str)));
            return;
        }
        fw.m<com.garmin.android.apps.connectmobile.performance.model.a> mVarD2 = y0Var2.d();
        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = mVarD2 != null ? mVarD2.f73770c : null;
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setD2 = y0Var.d();
        this.f183289z.m(new f<>(new o13.p(aVar2, setD2 != null ? p13.h0.f1(setD2) : null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J4(String str, v13.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f183240c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f183240c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objJ = o0Var.f183238a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f183240c;
        if (i15 == 0) {
            o13.r.b(objJ);
            TrainingStatusDeviceDTO trainingStatusDeviceDTO = new TrainingStatusDeviceDTO(str);
            o0Var.f183240c = 1;
            iw.e eVar = this.f183265a;
            eVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(eVar, new iw.i(eVar, trainingStatusDeviceDTO, null), o0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return fw.m.a.g(fw.m.f73767e, null, 3);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        fw.m.a aVar2 = fw.m.f73767e;
        Throwable th3 = new Throwable(((v2.a) v2Var).f47383a.toString());
        aVar2.getClass();
        return fw.m.a.a(null, th3);
    }

    public final void K4(String str) {
        wi1.j jVar;
        w0<fw.m<x61.p>> w0Var = this.f183274j;
        fw.m<x61.p> mVarD = w0Var.d();
        x61.p pVar = mVarD != null ? mVarD.f73770c : null;
        w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
        UserSettingsDTO userSettingsDTO = this.f183277l;
        if (userSettingsDTO != null) {
            UserSettingsDTO userSettingsDTOC = userSettingsDTO.C();
            UserSettingsDTO userSettingsDTO2 = this.f183277l;
            if (userSettingsDTO2 != null && (jVar = userSettingsDTO2.f43524b) != null) {
                jVar.f185557v = str;
            }
            userSettingsDTO2.getClass();
            JSONObject jSONObjectB = t3.b(userSettingsDTO2.t1(), userSettingsDTOC.t1());
            wi1.j jVar2 = userSettingsDTOC.f43524b;
            if (jVar2 != null) {
                jVar2.f185557v = str;
            }
            ge1.b.T(v1.a(this), null, null, new e(userSettingsDTOC, jSONObjectB, pVar, this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Collection] */
    public final void L4(DateTime dateTime, DateTime dateTime2) {
        fw.m mVar;
        TrainingStatusReportDTO trainingStatusReportDTO;
        ?? r14;
        com.garmin.android.apps.connectmobile.performance.model.a[] aVarArr;
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var = this.f183272h;
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setD = y0Var.d();
        if (setD == null) {
            setD = p13.l0.f134950a;
        }
        Set<com.garmin.android.apps.connectmobile.performance.model.a> setF1 = p13.h0.f1(setD);
        androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) this.f183285v.get(new o13.p(dateTime, dateTime2));
        Collection<? extends com.garmin.android.apps.connectmobile.performance.model.a> collectionC = (s0Var == null || (mVar = (fw.m) s0Var.d()) == null || (trainingStatusReportDTO = (TrainingStatusReportDTO) mVar.f73770c) == null || (r14 = trainingStatusReportDTO.f39911b) == 0 || (aVarArr = (com.garmin.android.apps.connectmobile.performance.model.a[]) r14.toArray(new com.garmin.android.apps.connectmobile.performance.model.a[0])) == null) ? null : p13.u.C(aVarArr);
        if (collectionC == null) {
            collectionC = p13.j0.f134944a;
        }
        setF1.addAll(collectionC);
        y0Var.m(setF1);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw61/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ x(iw.e eVar, pc0.j jVar, x61.k kVar, com.garmin.android.apps.connectmobile.performance.model.a aVar, Set set, boolean z14, eu1.b bVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(eVar, jVar, kVar, (i14 & 8) != 0 ? null : aVar, (i14 & 16) != 0 ? new LinkedHashSet() : set, (i14 & 32) != 0 ? false : z14, bVar);
    }
}
