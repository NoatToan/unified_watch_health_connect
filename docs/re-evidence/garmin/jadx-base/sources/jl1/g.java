package jl1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljl1/g;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lfl1/g;", "getFavoriteActivities", "Lcl1/a;", "preferences", "Ldl1/a;", "repository", "Lfl1/f;", "getDeviceWheelchairAvailability", "Lxs/i;", "saveFavoriteActivities", "<init>", "(JLfl1/g;Lcl1/a;Ldl1/a;Lfl1/f;Lxs/i;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f99517i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f99518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl1.g f99519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl1.a f99520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dl1.a f99521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fl1.f f99522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xs.i f99523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f99524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f99525h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.edit.SelectFavouriteActivitiesViewModel$saveSelectionsImpl$2", f = "SelectFavouriteActivitiesViewModel.kt", l = {122, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f99526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f99527b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ xs.h f99529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f99530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xs.h hVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f99529d = hVar;
            this.f99530e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = g.this.new b(this.f99529d, this.f99530e, dVar);
            bVar.f99527b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            if (r14 == r1) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            b bVar;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            b0 b0Var = (b0) this.f99527b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f99526a;
            g gVar = g.this;
            if (i14 == 0) {
                r.b(obj);
                xs.i iVar = gVar.f99523f;
                long j8 = gVar.f99518a;
                i53.c<zf2.d> cVar = ((d) gVar.f99524g.getValue()).f99482e;
                this.f99527b = b0Var;
                this.f99526a = 1;
                bVar = this;
                obj = iVar.a(j8, cVar, this.f99529d, bVar);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                bVar = this;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                a2 a2Var = a2.ACTIVITY_RECORDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SelectFavouriteActivitiesViewModel", "Record Activity onboarding completed successfully");
                p2 p2Var = gVar.f99524g;
                do {
                    value4 = p2Var.getValue();
                } while (!p2Var.b(value4, d.a((d) value4, false, false, jl1.c.d.f99477a, null, null, null, null, 122)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                a2 a2Var2 = a2.ACTIVITY_RECORDING;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to save record activity onboarding completed status: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "SelectFavouriteActivitiesViewModel", strD);
                p2 p2Var2 = gVar.f99524g;
                do {
                    value3 = p2Var2.getValue();
                } while (!p2Var2.b(value3, d.a((d) value3, false, false, jl1.c.b.f99475a, null, null, null, null, 122)));
            }
            return Unit.INSTANCE;
            xs.h hVar = (xs.h) obj;
            if (hVar != null) {
                p2 p2Var3 = gVar.f99524g;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, d.a((d) value2, false, false, new jl1.c.a(hVar), null, null, null, null, 122)));
                return Unit.INSTANCE;
            }
            if (bVar.f99530e) {
                bVar.f99527b = b0Var;
                bVar.f99526a = 2;
                int i15 = g.f99517i;
                gVar.getClass();
                x53.c cVar2 = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new i(gVar, null), this);
            } else {
                p2 p2Var4 = gVar.f99524g;
                do {
                    value = p2Var4.getValue();
                } while (!p2Var4.b(value, d.a((d) value, false, false, jl1.c.d.f99477a, null, null, null, null, 122)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljl1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.edit.SelectFavouriteActivitiesViewModel$uiState$1", f = "SelectFavouriteActivitiesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<j<? super d>, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super d> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            g gVar = g.this;
            long j8 = gVar.f99518a;
            p2 p2Var = gVar.f99524g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, d.a((d) value, true, false, null, null, null, null, null, 126)));
            ge1.b.T(v1.a(gVar), null, null, new h(gVar, j8, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public g(long j8, fl1.g gVar, cl1.a aVar, dl1.a aVar2, fl1.f fVar, xs.i iVar) {
        gVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        fVar.getClass();
        iVar.getClass();
        this.f99518a = j8;
        this.f99519b = gVar;
        this.f99520c = aVar;
        this.f99521d = aVar2;
        this.f99522e = fVar;
        this.f99523f = iVar;
        p2 p2VarA = q2.a(new d(false, false, null, null, null, null, null, 127, null));
        this.f99524g = p2VarA;
        v vVar = new v(new c(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f99525h = s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
    }

    public static i53.d x4(i53.d dVar, i53.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(dVar.size()));
        for (Map.Entry entry : dVar.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!cVar.contains((zf2.d) obj)) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        return i53.a.g(linkedHashMap);
    }

    public final void A4(boolean z14, xs.h hVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f99524g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, d.a((d) value, true, false, null, null, null, null, null, 126)));
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new b(hVar, z14, null), 2);
    }

    public final void y4(int i14, int i15) {
        Object value;
        p2 p2Var = this.f99524g;
        ArrayList arrayListD1 = h0.d1(((d) p2Var.getValue()).f99482e);
        if (i14 < 0 || i14 >= arrayListD1.size() || i15 < 0 || i15 > arrayListD1.size() || i14 == i15) {
            return;
        }
        zf2.d dVar = (zf2.d) arrayListD1.remove(i14);
        if (i15 >= arrayListD1.size()) {
            arrayListD1.add(dVar);
        } else {
            arrayListD1.add(i15, dVar);
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, d.a((d) value, false, false, null, null, i53.a.e(arrayListD1), null, null, 111)));
    }

    public final void z4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f99524g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, d.a((d) value, false, false, jl1.c.C1911c.f99476a, null, null, null, null, 123)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljl1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
