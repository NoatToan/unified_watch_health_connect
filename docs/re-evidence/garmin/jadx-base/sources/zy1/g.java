package zy1;

import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fg0.k;
import fg0.t;
import fg0.z;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.s;
import zf0.q;
import zf0.v;
import zf0.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$getUpcomingEvents$1", f = "EventDashBoardViewModel.kt", l = {158, 158, SyslogConstants.LOG_LOCAL4, 161, 162, 242, 254, 259, 277}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f207493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f207494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f207495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ww1.g f207496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f207497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f207498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f207499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f207500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f207501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Double f207502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f207503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f207504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f207505m;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$getUpcomingEvents$1$pastEvents$1", f = "EventDashBoardViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends k>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f207506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f207507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f207508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f207509d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, String str, String str2, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f207507b = dVar;
            this.f207508c = str;
            this.f207509d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f207507b, this.f207508c, this.f207509d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends k>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f207506a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            zf0.d dVar = this.f207507b.f204384a;
            String str = this.f207509d;
            str.getClass();
            String str2 = gg0.b.SORT_DESC.f77115a;
            Integer num = new Integer(100);
            this.f207506a = 1;
            dVar.getClass();
            Object objJ = f0.J(dVar, new x(dVar, this.f207508c, str, str2, num, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfg0/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$getUpcomingEvents$1$primaryEvent$1", f = "EventDashBoardViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends z>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f207510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f207511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f207511b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f207511b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends z>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f207510a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            zf0.d dVar = this.f207511b.f204384a;
            this.f207510a = 1;
            dVar.getClass();
            Object objJ = f0.J(dVar, new q(dVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$getUpcomingEvents$1$upcomingEvents$1", f = "EventDashBoardViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends List<? extends k>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f207512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f207513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f207514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f207515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d dVar, String str, String str2, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f207513b = dVar;
            this.f207514c = str;
            this.f207515d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f207513b, this.f207514c, this.f207515d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends k>>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f207512a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            zf0.d dVar = this.f207513b.f204384a;
            String str = this.f207514c;
            str.getClass();
            String str2 = this.f207515d;
            str2.getClass();
            this.f207512a = 1;
            dVar.getClass();
            Object objJ = f0.J(dVar, new v(dVar, str, str2, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f207505m = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f207505m, dVar);
        gVar.f207504l = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0324  */
    /* JADX WARN: Code duplicated, block: B:106:0x032b  */
    /* JADX WARN: Code duplicated, block: B:107:0x032f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0332  */
    /* JADX WARN: Code duplicated, block: B:124:0x037c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0392 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0394  */
    /* JADX WARN: Code duplicated, block: B:141:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:146:0x0412  */
    /* JADX WARN: Code duplicated, block: B:148:0x0416  */
    /* JADX WARN: Code duplicated, block: B:150:0x041a  */
    /* JADX WARN: Code duplicated, block: B:22:0x012e A[PHI: r3 r8 r9 r10
      0x012e: PHI (r3v9 o53.i0) = (r3v7 o53.i0), (r3v11 o53.i0) binds: [B:20:0x012a, B:13:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r8v8 o53.i0) = (r8v6 o53.i0), (r8v9 o53.i0) binds: [B:20:0x012a, B:13:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r9v5 o53.i0) = (r9v3 o53.i0), (r9v7 o53.i0) binds: [B:20:0x012a, B:13:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r10v9 java.lang.Object) = (r10v7 java.lang.Object), (r10v15 java.lang.Object) binds: [B:20:0x012a, B:13:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0132  */
    /* JADX WARN: Code duplicated, block: B:25:0x0137  */
    /* JADX WARN: Code duplicated, block: B:29:0x014c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0167  */
    /* JADX WARN: Code duplicated, block: B:37:0x0187 A[PHI: r1 r3 r4 r8
      0x0187: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v22 java.lang.Object) binds: [B:35:0x0183, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r3v17 com.garmin.android.apps.connectmobile.v2) = (r3v15 com.garmin.android.apps.connectmobile.v2), (r3v30 com.garmin.android.apps.connectmobile.v2) binds: [B:35:0x0183, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r4v9 ww1.g) = (r4v7 ww1.g), (r4v11 ww1.g) binds: [B:35:0x0183, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r8v17 com.garmin.android.apps.connectmobile.v2) = (r8v14 com.garmin.android.apps.connectmobile.v2), (r8v27 com.garmin.android.apps.connectmobile.v2) binds: [B:35:0x0183, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0191  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0203  */
    /* JADX WARN: Code duplicated, block: B:56:0x0207  */
    /* JADX WARN: Code duplicated, block: B:59:0x021e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0227  */
    /* JADX WARN: Code duplicated, block: B:62:0x022b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:66:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x02f3 A[DONT_INVERT, PHI: r4 r8 r16
      0x02f3: PHI (r4v12 ww1.g) = (r4v9 ww1.g), (r4v14 ww1.g) binds: [B:94:0x02f1, B:91:0x02eb] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r8v28 java.util.List) = (r8v22 java.util.List), (r8v30 java.util.List) binds: [B:94:0x02f1, B:91:0x02eb] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r16v4 java.util.List) = (r16v2 java.util.List), (r16v6 java.util.List) binds: [B:94:0x02f1, B:91:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0303  */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e0, code lost:
    
        if (r3 == r2) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0 i0VarJ;
        Object objA;
        i0 i0Var;
        i0 i0Var2;
        Object objX;
        g3 g3Var;
        ww1.g gVar;
        Object objAwait;
        i0 i0Var3;
        ww1.g gVar2;
        v2 v2Var;
        Object objAwait2;
        ww1.g gVar3;
        v2 v2Var2;
        v2 v2Var3;
        Object objAwait3;
        v2 v2Var4;
        boolean z14;
        z zVar;
        List list;
        List list2;
        List list3;
        List list4;
        k kVar;
        Object objX4;
        List list5;
        Object objI4;
        List list6;
        k kVar2;
        List list7;
        t tVar;
        Double d14;
        k kVar3;
        List list8;
        Double d15;
        ww1.g gVar4;
        Object objL4;
        k kVar4;
        List list9;
        ww1.g gVar5;
        k kVar5;
        Object objL5;
        ww1.g gVar6;
        k kVar6;
        bz1.b bVar;
        b0 b0Var = (b0) this.f207504l;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207503k;
        d dVar = this.f207505m;
        switch (i14) {
            case 0:
                r.b(obj);
                int i15 = d.Q0;
                dVar.Z4().j(g3.a.c(g3.f35298f));
                LocalDate localDateNow = LocalDate.now();
                String string = localDateNow.toString("yyyy-MM-dd");
                String string2 = localDateNow.plusYears(1).toString("yyyy-MM-dd");
                String string3 = LocalDate.parse("1995-01-01").toString();
                string3.getClass();
                String string4 = localDateNow.minusDays(1).toString("yyyy-MM-dd");
                j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(dVar, null), 3);
                j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(dVar, string, string2, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new a(dVar, string3, string4, null), 3);
                ou1.a aVar2 = new ou1.a(dVar.D4(), dVar.E4(), dVar.f204384a);
                this.f207504l = b0Var;
                this.f207493a = j0VarJ;
                this.f207494b = j0VarJ2;
                this.f207495c = i0VarJ;
                this.f207503k = 1;
                objA = aVar2.a(this);
                if (objA != aVar) {
                    i0Var = j0VarJ;
                    i0Var2 = j0VarJ2;
                    this.f207504l = b0Var;
                    this.f207493a = i0Var;
                    this.f207494b = i0Var2;
                    this.f207495c = i0VarJ;
                    this.f207503k = 2;
                    objX = s.x((r53.i) objA, this);
                    if (objX != aVar) {
                        g3Var = (g3) objX;
                        if (g3Var != null) {
                            gVar = (ww1.g) g3Var.f35301b;
                        } else {
                            gVar = null;
                        }
                        this.f207504l = b0Var;
                        this.f207493a = null;
                        this.f207494b = i0Var2;
                        this.f207495c = i0VarJ;
                        this.f207496d = gVar;
                        this.f207503k = 3;
                        objAwait = i0Var.await(this);
                        if (objAwait != aVar) {
                            i0Var3 = i0VarJ;
                            gVar2 = gVar;
                            v2Var = (v2) objAwait;
                            this.f207504l = b0Var;
                            this.f207493a = null;
                            this.f207494b = null;
                            this.f207495c = i0Var3;
                            this.f207496d = gVar2;
                            this.f207497e = v2Var;
                            this.f207503k = 4;
                            objAwait2 = i0Var2.await(this);
                            if (objAwait2 != aVar) {
                                gVar3 = gVar2;
                                v2Var2 = v2Var;
                                v2Var3 = (v2) objAwait2;
                                this.f207504l = b0Var;
                                this.f207493a = null;
                                this.f207494b = null;
                                this.f207495c = null;
                                this.f207496d = gVar3;
                                this.f207497e = v2Var2;
                                this.f207498f = v2Var3;
                                this.f207503k = 5;
                                objAwait3 = i0Var3.await(this);
                                if (objAwait3 != aVar) {
                                    v2Var4 = (v2) objAwait3;
                                    z14 = v2Var2 instanceof v2.a;
                                    if (z14) {
                                        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                                        i2.a aVar3 = i2.f36769a;
                                        a2 a2Var = a2.GENERAL;
                                        aVar3.getClass();
                                        i2.a.f(a2Var, "EventDashBoardViewModel", strD);
                                    } else if (v2Var3 instanceof v2.a) {
                                        String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error while fetching Upcoming events ");
                                        i2.a aVar4 = i2.f36769a;
                                        a2 a2Var2 = a2.GENERAL;
                                        aVar4.getClass();
                                        i2.a.f(a2Var2, "EventDashBoardViewModel", strD2);
                                    } else if (v2Var4 instanceof v2.a) {
                                        String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error while fetching Past Events ");
                                        i2.a aVar5 = i2.f36769a;
                                        a2 a2Var3 = a2.GENERAL;
                                        aVar5.getClass();
                                        i2.a.f(a2Var3, "EventDashBoardViewModel", strD3);
                                    }
                                    if (v2Var2 instanceof v2.b) {
                                        zVar = (z) ((v2.b) v2Var2).f47386a;
                                    } else {
                                        if (z14) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                                        i2.a aVar6 = i2.f36769a;
                                        a2 a2Var4 = a2.GENERAL;
                                        aVar6.getClass();
                                        i2.a.f(a2Var4, "EventDashBoardViewModel", strD4);
                                        zVar = null;
                                    }
                                    if (v2Var3 instanceof v2.b) {
                                        list = (List) ((v2.b) v2Var3).f47386a;
                                    } else {
                                        if (v2Var3 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD5 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                                        i2.a aVar7 = i2.f36769a;
                                        a2 a2Var5 = a2.GENERAL;
                                        aVar7.getClass();
                                        i2.a.f(a2Var5, "EventDashBoardViewModel", strD5);
                                        list = null;
                                    }
                                    if (v2Var4 instanceof v2.b) {
                                        list2 = (List) ((v2.b) v2Var4).f47386a;
                                    } else {
                                        if (v2Var4 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        String strD6 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                                        i2.a aVar8 = i2.f36769a;
                                        a2 a2Var6 = a2.GENERAL;
                                        aVar8.getClass();
                                        i2.a.f(a2Var6, "EventDashBoardViewModel", strD6);
                                        list2 = null;
                                    }
                                    if ((list != null || list.isEmpty()) && zVar == null && (list2 == null || list2.isEmpty())) {
                                        int i16 = d.Q0;
                                        y0<g3<bz1.b>> y0VarZ4 = dVar.Z4();
                                        g3.a aVar9 = g3.f35298f;
                                        bz1.b bVar2 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                                        aVar9.getClass();
                                        y0VarZ4.j(g3.a.d(bVar2));
                                    } else if ((list == null || list.isEmpty()) && zVar == null && list2 != null && !list2.isEmpty()) {
                                        int i17 = d.Q0;
                                        y0<g3<bz1.b>> y0VarZ5 = dVar.Z4();
                                        g3.a aVar10 = g3.f35298f;
                                        bz1.b bVar3 = new bz1.b(zy1.c.ONLY_PAST_EVENTS, null, null, list2, null, null, 54, null);
                                        aVar10.getClass();
                                        y0VarZ5.j(g3.a.d(bVar3));
                                    } else {
                                        list3 = list2;
                                        if (zVar != null) {
                                            Long id3 = zVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                            if (id3 != null) {
                                                Long l14 = new Long(id3.longValue());
                                                String shareableEventUuid = zVar.getShareableEventUuid();
                                                this.f207504l = null;
                                                this.f207493a = null;
                                                this.f207494b = null;
                                                this.f207495c = null;
                                                this.f207496d = gVar3;
                                                this.f207497e = null;
                                                this.f207498f = null;
                                                this.f207499g = list;
                                                this.f207500h = list3;
                                                this.f207501i = null;
                                                this.f207503k = 6;
                                                objX4 = d.X4(dVar, l14, shareableEventUuid, this);
                                                break;
                                            } else {
                                                kVar = null;
                                                list4 = list3;
                                                if (kVar == null) {
                                                    if (list == null && list.size() == 1) {
                                                        kVar = (k) h0.b0(list);
                                                    } else {
                                                        kVar = null;
                                                    }
                                                }
                                                list5 = list4;
                                                this.f207504l = null;
                                                this.f207493a = null;
                                                this.f207494b = null;
                                                this.f207495c = null;
                                                this.f207496d = gVar3;
                                                this.f207497e = null;
                                                this.f207498f = null;
                                                this.f207499g = list;
                                                this.f207500h = list5;
                                                this.f207501i = kVar;
                                                this.f207503k = 7;
                                                objI4 = dVar.I4(kVar, this);
                                                if (objI4 != aVar) {
                                                    list6 = list5;
                                                    kVar2 = kVar;
                                                    list7 = list;
                                                    tVar = (t) objI4;
                                                    if (tVar != null) {
                                                        d14 = tVar.f71347a;
                                                    } else {
                                                        d14 = null;
                                                    }
                                                    if (list7 == null && list7.size() == 1 && (list6 == null || list6.isEmpty())) {
                                                        if (kVar2 != null) {
                                                            this.f207504l = null;
                                                            this.f207493a = null;
                                                            this.f207494b = null;
                                                            this.f207495c = null;
                                                            this.f207496d = gVar3;
                                                            this.f207497e = null;
                                                            this.f207498f = null;
                                                            this.f207499g = null;
                                                            this.f207500h = null;
                                                            this.f207501i = kVar2;
                                                            this.f207502j = d14;
                                                            this.f207503k = 8;
                                                            objL5 = dVar.L4(kVar2, this);
                                                            if (objL5 != aVar) {
                                                                gVar6 = gVar3;
                                                                kVar6 = kVar2;
                                                                ((Boolean) objL5).getClass();
                                                                kVar5 = kVar6;
                                                                gVar5 = gVar6;
                                                            }
                                                        } else {
                                                            gVar5 = gVar3;
                                                            kVar5 = kVar2;
                                                        }
                                                        Double d16 = d14;
                                                        int i18 = d.Q0;
                                                        y0<g3<bz1.b>> y0VarZ6 = dVar.Z4();
                                                        g3.a aVar11 = g3.f35298f;
                                                        bVar = kVar5 != null ? new bz1.b(zy1.c.ONE_EVENT, kVar5, null, null, d16, gVar5) : null;
                                                        aVar11.getClass();
                                                        y0VarZ6.j(g3.a.d(bVar));
                                                    } else if (list7 == null && list7.size() == 1 && list6 != null && (!list6.isEmpty())) {
                                                        if (kVar2 != null) {
                                                            this.f207504l = null;
                                                            this.f207493a = null;
                                                            this.f207494b = null;
                                                            this.f207495c = null;
                                                            this.f207496d = gVar3;
                                                            this.f207497e = null;
                                                            this.f207498f = null;
                                                            this.f207499g = null;
                                                            this.f207500h = list6;
                                                            this.f207501i = kVar2;
                                                            this.f207502j = d14;
                                                            this.f207503k = 9;
                                                            objL4 = dVar.L4(kVar2, this);
                                                            if (objL4 != aVar) {
                                                                kVar4 = kVar2;
                                                                list9 = list6;
                                                                ((Boolean) objL4).getClass();
                                                                kVar3 = kVar4;
                                                                list8 = list9;
                                                                gVar4 = gVar3;
                                                                d15 = d14;
                                                            }
                                                        } else {
                                                            kVar3 = kVar2;
                                                            list8 = list6;
                                                            d15 = d14;
                                                            gVar4 = gVar3;
                                                        }
                                                        int i19 = d.Q0;
                                                        y0<g3<bz1.b>> y0VarZ7 = dVar.Z4();
                                                        g3.a aVar12 = g3.f35298f;
                                                        bVar = kVar3 != null ? new bz1.b(zy1.c.ONE_EVENT_PAST_EVENTS, kVar3, null, list8, d15, gVar4) : null;
                                                        aVar12.getClass();
                                                        y0VarZ7.j(g3.a.d(bVar));
                                                    } else {
                                                        int i24 = d.Q0;
                                                        y0<g3<bz1.b>> y0VarZ8 = dVar.Z4();
                                                        g3.a aVar13 = g3.f35298f;
                                                        bz1.b bVar4 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                                                        aVar13.getClass();
                                                        y0VarZ8.j(g3.a.d(bVar4));
                                                    }
                                                }
                                            }
                                        } else {
                                            list4 = list3;
                                            if (list == null) {
                                                kVar = null;
                                            } else {
                                                kVar = null;
                                            }
                                            list5 = list4;
                                            this.f207504l = null;
                                            this.f207493a = null;
                                            this.f207494b = null;
                                            this.f207495c = null;
                                            this.f207496d = gVar3;
                                            this.f207497e = null;
                                            this.f207498f = null;
                                            this.f207499g = list;
                                            this.f207500h = list5;
                                            this.f207501i = kVar;
                                            this.f207503k = 7;
                                            objI4 = dVar.I4(kVar, this);
                                            if (objI4 != aVar) {
                                                list6 = list5;
                                                kVar2 = kVar;
                                                list7 = list;
                                                tVar = (t) objI4;
                                                if (tVar != null) {
                                                    d14 = tVar.f71347a;
                                                } else {
                                                    d14 = null;
                                                }
                                                if (list7 == null) {
                                                    if (list7 == null) {
                                                    }
                                                    int i25 = d.Q0;
                                                    y0<g3<bz1.b>> y0VarZ9 = dVar.Z4();
                                                    g3.a aVar14 = g3.f35298f;
                                                    bz1.b bVar5 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                                                    aVar14.getClass();
                                                    y0VarZ9.j(g3.a.d(bVar5));
                                                } else {
                                                    if (list7 == null) {
                                                    }
                                                    int i26 = d.Q0;
                                                    y0<g3<bz1.b>> y0VarZ10 = dVar.Z4();
                                                    g3.a aVar15 = g3.f35298f;
                                                    bz1.b bVar6 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                                                    aVar15.getClass();
                                                    y0VarZ10.j(g3.a.d(bVar6));
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                i0VarJ = this.f207495c;
                i0Var2 = this.f207494b;
                i0Var = this.f207493a;
                r.b(obj);
                objA = obj;
                this.f207504l = b0Var;
                this.f207493a = i0Var;
                this.f207494b = i0Var2;
                this.f207495c = i0VarJ;
                this.f207503k = 2;
                objX = s.x((r53.i) objA, this);
                if (objX != aVar) {
                    g3Var = (g3) objX;
                    if (g3Var != null) {
                        gVar = (ww1.g) g3Var.f35301b;
                    } else {
                        gVar = null;
                    }
                    this.f207504l = b0Var;
                    this.f207493a = null;
                    this.f207494b = i0Var2;
                    this.f207495c = i0VarJ;
                    this.f207496d = gVar;
                    this.f207503k = 3;
                    objAwait = i0Var.await(this);
                    if (objAwait != aVar) {
                        i0Var3 = i0VarJ;
                        gVar2 = gVar;
                        v2Var = (v2) objAwait;
                        this.f207504l = b0Var;
                        this.f207493a = null;
                        this.f207494b = null;
                        this.f207495c = i0Var3;
                        this.f207496d = gVar2;
                        this.f207497e = v2Var;
                        this.f207503k = 4;
                        objAwait2 = i0Var2.await(this);
                        if (objAwait2 != aVar) {
                            gVar3 = gVar2;
                            v2Var2 = v2Var;
                            v2Var3 = (v2) objAwait2;
                            this.f207504l = b0Var;
                            this.f207493a = null;
                            this.f207494b = null;
                            this.f207495c = null;
                            this.f207496d = gVar3;
                            this.f207497e = v2Var2;
                            this.f207498f = v2Var3;
                            this.f207503k = 5;
                            objAwait3 = i0Var3.await(this);
                            if (objAwait3 != aVar) {
                                v2Var4 = (v2) objAwait3;
                                z14 = v2Var2 instanceof v2.a;
                                if (z14) {
                                    String strD7 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                                    i2.a aVar16 = i2.f36769a;
                                    a2 a2Var7 = a2.GENERAL;
                                    aVar16.getClass();
                                    i2.a.f(a2Var7, "EventDashBoardViewModel", strD7);
                                } else if (v2Var3 instanceof v2.a) {
                                    String strD8 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error while fetching Upcoming events ");
                                    i2.a aVar17 = i2.f36769a;
                                    a2 a2Var8 = a2.GENERAL;
                                    aVar17.getClass();
                                    i2.a.f(a2Var8, "EventDashBoardViewModel", strD8);
                                } else if (v2Var4 instanceof v2.a) {
                                    String strD9 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error while fetching Past Events ");
                                    i2.a aVar18 = i2.f36769a;
                                    a2 a2Var9 = a2.GENERAL;
                                    aVar18.getClass();
                                    i2.a.f(a2Var9, "EventDashBoardViewModel", strD9);
                                }
                                if (v2Var2 instanceof v2.b) {
                                    zVar = (z) ((v2.b) v2Var2).f47386a;
                                } else {
                                    if (z14) {
                                        u0.r();
                                        return null;
                                    }
                                    String strD10 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                                    i2.a aVar19 = i2.f36769a;
                                    a2 a2Var10 = a2.GENERAL;
                                    aVar19.getClass();
                                    i2.a.f(a2Var10, "EventDashBoardViewModel", strD10);
                                    zVar = null;
                                }
                                if (v2Var3 instanceof v2.b) {
                                    list = (List) ((v2.b) v2Var3).f47386a;
                                } else {
                                    if (v2Var3 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    String strD11 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                                    i2.a aVar20 = i2.f36769a;
                                    a2 a2Var11 = a2.GENERAL;
                                    aVar20.getClass();
                                    i2.a.f(a2Var11, "EventDashBoardViewModel", strD11);
                                    list = null;
                                }
                                if (v2Var4 instanceof v2.b) {
                                    list2 = (List) ((v2.b) v2Var4).f47386a;
                                } else {
                                    if (v2Var4 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    String strD12 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                                    i2.a aVar21 = i2.f36769a;
                                    a2 a2Var12 = a2.GENERAL;
                                    aVar21.getClass();
                                    i2.a.f(a2Var12, "EventDashBoardViewModel", strD12);
                                    list2 = null;
                                }
                                if (list != null) {
                                    int i110 = d.Q0;
                                    y0<g3<bz1.b>> y0VarZ11 = dVar.Z4();
                                    g3.a aVar22 = g3.f35298f;
                                    bz1.b bVar7 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                                    aVar22.getClass();
                                    y0VarZ11.j(g3.a.d(bVar7));
                                } else {
                                    int i111 = d.Q0;
                                    y0<g3<bz1.b>> y0VarZ12 = dVar.Z4();
                                    g3.a aVar23 = g3.f35298f;
                                    bz1.b bVar8 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                                    aVar23.getClass();
                                    y0VarZ12.j(g3.a.d(bVar8));
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                i0VarJ = this.f207495c;
                i0Var2 = this.f207494b;
                i0Var = this.f207493a;
                r.b(obj);
                objX = obj;
                g3Var = (g3) objX;
                if (g3Var != null) {
                    gVar = (ww1.g) g3Var.f35301b;
                } else {
                    gVar = null;
                }
                this.f207504l = b0Var;
                this.f207493a = null;
                this.f207494b = i0Var2;
                this.f207495c = i0VarJ;
                this.f207496d = gVar;
                this.f207503k = 3;
                objAwait = i0Var.await(this);
                if (objAwait != aVar) {
                    i0Var3 = i0VarJ;
                    gVar2 = gVar;
                    v2Var = (v2) objAwait;
                    this.f207504l = b0Var;
                    this.f207493a = null;
                    this.f207494b = null;
                    this.f207495c = i0Var3;
                    this.f207496d = gVar2;
                    this.f207497e = v2Var;
                    this.f207503k = 4;
                    objAwait2 = i0Var2.await(this);
                    if (objAwait2 != aVar) {
                        gVar3 = gVar2;
                        v2Var2 = v2Var;
                        v2Var3 = (v2) objAwait2;
                        this.f207504l = b0Var;
                        this.f207493a = null;
                        this.f207494b = null;
                        this.f207495c = null;
                        this.f207496d = gVar3;
                        this.f207497e = v2Var2;
                        this.f207498f = v2Var3;
                        this.f207503k = 5;
                        objAwait3 = i0Var3.await(this);
                        if (objAwait3 != aVar) {
                            v2Var4 = (v2) objAwait3;
                            z14 = v2Var2 instanceof v2.a;
                            if (z14) {
                                String strD13 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                                i2.a aVar110 = i2.f36769a;
                                a2 a2Var13 = a2.GENERAL;
                                aVar110.getClass();
                                i2.a.f(a2Var13, "EventDashBoardViewModel", strD13);
                            } else if (v2Var3 instanceof v2.a) {
                                String strD14 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error while fetching Upcoming events ");
                                i2.a aVar111 = i2.f36769a;
                                a2 a2Var14 = a2.GENERAL;
                                aVar111.getClass();
                                i2.a.f(a2Var14, "EventDashBoardViewModel", strD14);
                            } else if (v2Var4 instanceof v2.a) {
                                String strD15 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error while fetching Past Events ");
                                i2.a aVar112 = i2.f36769a;
                                a2 a2Var15 = a2.GENERAL;
                                aVar112.getClass();
                                i2.a.f(a2Var15, "EventDashBoardViewModel", strD15);
                            }
                            if (v2Var2 instanceof v2.b) {
                                zVar = (z) ((v2.b) v2Var2).f47386a;
                            } else {
                                if (z14) {
                                    u0.r();
                                    return null;
                                }
                                String strD16 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                                i2.a aVar113 = i2.f36769a;
                                a2 a2Var16 = a2.GENERAL;
                                aVar113.getClass();
                                i2.a.f(a2Var16, "EventDashBoardViewModel", strD16);
                                zVar = null;
                            }
                            if (v2Var3 instanceof v2.b) {
                                list = (List) ((v2.b) v2Var3).f47386a;
                            } else {
                                if (v2Var3 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                String strD17 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                                i2.a aVar24 = i2.f36769a;
                                a2 a2Var17 = a2.GENERAL;
                                aVar24.getClass();
                                i2.a.f(a2Var17, "EventDashBoardViewModel", strD17);
                                list = null;
                            }
                            if (v2Var4 instanceof v2.b) {
                                list2 = (List) ((v2.b) v2Var4).f47386a;
                            } else {
                                if (v2Var4 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                String strD18 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                                i2.a aVar25 = i2.f36769a;
                                a2 a2Var18 = a2.GENERAL;
                                aVar25.getClass();
                                i2.a.f(a2Var18, "EventDashBoardViewModel", strD18);
                                list2 = null;
                            }
                            if (list != null) {
                                int i112 = d.Q0;
                                y0<g3<bz1.b>> y0VarZ13 = dVar.Z4();
                                g3.a aVar26 = g3.f35298f;
                                bz1.b bVar9 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                                aVar26.getClass();
                                y0VarZ13.j(g3.a.d(bVar9));
                            } else {
                                int i113 = d.Q0;
                                y0<g3<bz1.b>> y0VarZ14 = dVar.Z4();
                                g3.a aVar27 = g3.f35298f;
                                bz1.b bVar10 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                                aVar27.getClass();
                                y0VarZ14.j(g3.a.d(bVar10));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 3:
                gVar2 = this.f207496d;
                i0 i0Var4 = this.f207495c;
                i0Var2 = this.f207494b;
                r.b(obj);
                i0Var3 = i0Var4;
                objAwait = obj;
                v2Var = (v2) objAwait;
                this.f207504l = b0Var;
                this.f207493a = null;
                this.f207494b = null;
                this.f207495c = i0Var3;
                this.f207496d = gVar2;
                this.f207497e = v2Var;
                this.f207503k = 4;
                objAwait2 = i0Var2.await(this);
                if (objAwait2 != aVar) {
                    gVar3 = gVar2;
                    v2Var2 = v2Var;
                    v2Var3 = (v2) objAwait2;
                    this.f207504l = b0Var;
                    this.f207493a = null;
                    this.f207494b = null;
                    this.f207495c = null;
                    this.f207496d = gVar3;
                    this.f207497e = v2Var2;
                    this.f207498f = v2Var3;
                    this.f207503k = 5;
                    objAwait3 = i0Var3.await(this);
                    if (objAwait3 != aVar) {
                        v2Var4 = (v2) objAwait3;
                        z14 = v2Var2 instanceof v2.a;
                        if (z14) {
                            String strD19 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                            i2.a aVar114 = i2.f36769a;
                            a2 a2Var19 = a2.GENERAL;
                            aVar114.getClass();
                            i2.a.f(a2Var19, "EventDashBoardViewModel", strD19);
                        } else if (v2Var3 instanceof v2.a) {
                            String strD110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error while fetching Upcoming events ");
                            i2.a aVar115 = i2.f36769a;
                            a2 a2Var110 = a2.GENERAL;
                            aVar115.getClass();
                            i2.a.f(a2Var110, "EventDashBoardViewModel", strD110);
                        } else if (v2Var4 instanceof v2.a) {
                            String strD111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error while fetching Past Events ");
                            i2.a aVar116 = i2.f36769a;
                            a2 a2Var111 = a2.GENERAL;
                            aVar116.getClass();
                            i2.a.f(a2Var111, "EventDashBoardViewModel", strD111);
                        }
                        if (v2Var2 instanceof v2.b) {
                            zVar = (z) ((v2.b) v2Var2).f47386a;
                        } else {
                            if (z14) {
                                u0.r();
                                return null;
                            }
                            String strD112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                            i2.a aVar117 = i2.f36769a;
                            a2 a2Var112 = a2.GENERAL;
                            aVar117.getClass();
                            i2.a.f(a2Var112, "EventDashBoardViewModel", strD112);
                            zVar = null;
                        }
                        if (v2Var3 instanceof v2.b) {
                            list = (List) ((v2.b) v2Var3).f47386a;
                        } else {
                            if (v2Var3 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String strD113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                            i2.a aVar28 = i2.f36769a;
                            a2 a2Var113 = a2.GENERAL;
                            aVar28.getClass();
                            i2.a.f(a2Var113, "EventDashBoardViewModel", strD113);
                            list = null;
                        }
                        if (v2Var4 instanceof v2.b) {
                            list2 = (List) ((v2.b) v2Var4).f47386a;
                        } else {
                            if (v2Var4 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            String strD114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                            i2.a aVar29 = i2.f36769a;
                            a2 a2Var114 = a2.GENERAL;
                            aVar29.getClass();
                            i2.a.f(a2Var114, "EventDashBoardViewModel", strD114);
                            list2 = null;
                        }
                        if (list != null) {
                            int i114 = d.Q0;
                            y0<g3<bz1.b>> y0VarZ15 = dVar.Z4();
                            g3.a aVar210 = g3.f35298f;
                            bz1.b bVar11 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                            aVar210.getClass();
                            y0VarZ15.j(g3.a.d(bVar11));
                        } else {
                            int i115 = d.Q0;
                            y0<g3<bz1.b>> y0VarZ16 = dVar.Z4();
                            g3.a aVar211 = g3.f35298f;
                            bz1.b bVar12 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                            aVar211.getClass();
                            y0VarZ16.j(g3.a.d(bVar12));
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 4:
                v2Var2 = this.f207497e;
                gVar3 = this.f207496d;
                i0 i0Var5 = this.f207495c;
                r.b(obj);
                i0Var3 = i0Var5;
                objAwait2 = obj;
                v2Var3 = (v2) objAwait2;
                this.f207504l = b0Var;
                this.f207493a = null;
                this.f207494b = null;
                this.f207495c = null;
                this.f207496d = gVar3;
                this.f207497e = v2Var2;
                this.f207498f = v2Var3;
                this.f207503k = 5;
                objAwait3 = i0Var3.await(this);
                if (objAwait3 != aVar) {
                    v2Var4 = (v2) objAwait3;
                    z14 = v2Var2 instanceof v2.a;
                    if (z14) {
                        String strD115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                        i2.a aVar118 = i2.f36769a;
                        a2 a2Var115 = a2.GENERAL;
                        aVar118.getClass();
                        i2.a.f(a2Var115, "EventDashBoardViewModel", strD115);
                    } else if (v2Var3 instanceof v2.a) {
                        String strD116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error while fetching Upcoming events ");
                        i2.a aVar119 = i2.f36769a;
                        a2 a2Var116 = a2.GENERAL;
                        aVar119.getClass();
                        i2.a.f(a2Var116, "EventDashBoardViewModel", strD116);
                    } else if (v2Var4 instanceof v2.a) {
                        String strD117 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error while fetching Past Events ");
                        i2.a aVar1110 = i2.f36769a;
                        a2 a2Var117 = a2.GENERAL;
                        aVar1110.getClass();
                        i2.a.f(a2Var117, "EventDashBoardViewModel", strD117);
                    }
                    if (v2Var2 instanceof v2.b) {
                        zVar = (z) ((v2.b) v2Var2).f47386a;
                    } else {
                        if (z14) {
                            u0.r();
                            return null;
                        }
                        String strD118 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                        i2.a aVar1111 = i2.f36769a;
                        a2 a2Var118 = a2.GENERAL;
                        aVar1111.getClass();
                        i2.a.f(a2Var118, "EventDashBoardViewModel", strD118);
                        zVar = null;
                    }
                    if (v2Var3 instanceof v2.b) {
                        list = (List) ((v2.b) v2Var3).f47386a;
                    } else {
                        if (v2Var3 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD119 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                        i2.a aVar212 = i2.f36769a;
                        a2 a2Var119 = a2.GENERAL;
                        aVar212.getClass();
                        i2.a.f(a2Var119, "EventDashBoardViewModel", strD119);
                        list = null;
                    }
                    if (v2Var4 instanceof v2.b) {
                        list2 = (List) ((v2.b) v2Var4).f47386a;
                    } else {
                        if (v2Var4 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD1110 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                        i2.a aVar213 = i2.f36769a;
                        a2 a2Var1110 = a2.GENERAL;
                        aVar213.getClass();
                        i2.a.f(a2Var1110, "EventDashBoardViewModel", strD1110);
                        list2 = null;
                    }
                    if (list != null) {
                        int i116 = d.Q0;
                        y0<g3<bz1.b>> y0VarZ17 = dVar.Z4();
                        g3.a aVar214 = g3.f35298f;
                        bz1.b bVar13 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                        aVar214.getClass();
                        y0VarZ17.j(g3.a.d(bVar13));
                    } else {
                        int i117 = d.Q0;
                        y0<g3<bz1.b>> y0VarZ18 = dVar.Z4();
                        g3.a aVar215 = g3.f35298f;
                        bz1.b bVar14 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                        aVar215.getClass();
                        y0VarZ18.j(g3.a.d(bVar14));
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 5:
                v2 v2Var5 = this.f207498f;
                v2Var2 = this.f207497e;
                gVar3 = this.f207496d;
                r.b(obj);
                v2Var3 = v2Var5;
                objAwait3 = obj;
                v2Var4 = (v2) objAwait3;
                z14 = v2Var2 instanceof v2.a;
                if (z14) {
                    String strD1111 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                    i2.a aVar1112 = i2.f36769a;
                    a2 a2Var1111 = a2.GENERAL;
                    aVar1112.getClass();
                    i2.a.f(a2Var1111, "EventDashBoardViewModel", strD1111);
                } else if (v2Var3 instanceof v2.a) {
                    String strD1112 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error while fetching Upcoming events ");
                    i2.a aVar1113 = i2.f36769a;
                    a2 a2Var1112 = a2.GENERAL;
                    aVar1113.getClass();
                    i2.a.f(a2Var1112, "EventDashBoardViewModel", strD1112);
                } else if (v2Var4 instanceof v2.a) {
                    String strD1113 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error while fetching Past Events ");
                    i2.a aVar1114 = i2.f36769a;
                    a2 a2Var1113 = a2.GENERAL;
                    aVar1114.getClass();
                    i2.a.f(a2Var1113, "EventDashBoardViewModel", strD1113);
                }
                if (v2Var2 instanceof v2.b) {
                    zVar = (z) ((v2.b) v2Var2).f47386a;
                } else {
                    if (z14) {
                        u0.r();
                        return null;
                    }
                    String strD1114 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error fetching Primary Events details ");
                    i2.a aVar1115 = i2.f36769a;
                    a2 a2Var1114 = a2.GENERAL;
                    aVar1115.getClass();
                    i2.a.f(a2Var1114, "EventDashBoardViewModel", strD1114);
                    zVar = null;
                }
                if (v2Var3 instanceof v2.b) {
                    list = (List) ((v2.b) v2Var3).f47386a;
                } else {
                    if (v2Var3 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD1115 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                    i2.a aVar216 = i2.f36769a;
                    a2 a2Var1115 = a2.GENERAL;
                    aVar216.getClass();
                    i2.a.f(a2Var1115, "EventDashBoardViewModel", strD1115);
                    list = null;
                }
                if (v2Var4 instanceof v2.b) {
                    list2 = (List) ((v2.b) v2Var4).f47386a;
                } else {
                    if (v2Var4 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD1116 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                    i2.a aVar217 = i2.f36769a;
                    a2 a2Var1116 = a2.GENERAL;
                    aVar217.getClass();
                    i2.a.f(a2Var1116, "EventDashBoardViewModel", strD1116);
                    list2 = null;
                }
                if (list != null) {
                    int i118 = d.Q0;
                    y0<g3<bz1.b>> y0VarZ19 = dVar.Z4();
                    g3.a aVar218 = g3.f35298f;
                    bz1.b bVar15 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                    aVar218.getClass();
                    y0VarZ19.j(g3.a.d(bVar15));
                } else {
                    int i119 = d.Q0;
                    y0<g3<bz1.b>> y0VarZ110 = dVar.Z4();
                    g3.a aVar219 = g3.f35298f;
                    bz1.b bVar16 = new bz1.b(zy1.c.NO_EVENTS, null, null, null, null, null, 62, null);
                    aVar219.getClass();
                    y0VarZ110.j(g3.a.d(bVar16));
                }
                return Unit.INSTANCE;
            case 6:
                list3 = this.f207500h;
                List list10 = this.f207499g;
                gVar3 = this.f207496d;
                r.b(obj);
                list = list10;
                objX4 = obj;
                kVar = (k) objX4;
                list4 = list3;
                if (kVar == null) {
                    if (list == null) {
                        kVar = null;
                    } else {
                        kVar = null;
                    }
                }
                list5 = list4;
                this.f207504l = null;
                this.f207493a = null;
                this.f207494b = null;
                this.f207495c = null;
                this.f207496d = gVar3;
                this.f207497e = null;
                this.f207498f = null;
                this.f207499g = list;
                this.f207500h = list5;
                this.f207501i = kVar;
                this.f207503k = 7;
                objI4 = dVar.I4(kVar, this);
                if (objI4 != aVar) {
                    list6 = list5;
                    kVar2 = kVar;
                    list7 = list;
                    tVar = (t) objI4;
                    if (tVar != null) {
                        d14 = tVar.f71347a;
                    } else {
                        d14 = null;
                    }
                    if (list7 == null) {
                        if (list7 == null) {
                        }
                        int i27 = d.Q0;
                        y0<g3<bz1.b>> y0VarZ111 = dVar.Z4();
                        g3.a aVar120 = g3.f35298f;
                        bz1.b bVar17 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                        aVar120.getClass();
                        y0VarZ111.j(g3.a.d(bVar17));
                        break;
                    } else {
                        if (list7 == null) {
                        }
                        int i28 = d.Q0;
                        y0<g3<bz1.b>> y0VarZ112 = dVar.Z4();
                        g3.a aVar121 = g3.f35298f;
                        bz1.b bVar18 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                        aVar121.getClass();
                        y0VarZ112.j(g3.a.d(bVar18));
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 7:
                k kVar7 = this.f207501i;
                List list11 = this.f207500h;
                List list12 = this.f207499g;
                ww1.g gVar7 = this.f207496d;
                r.b(obj);
                objI4 = obj;
                kVar2 = kVar7;
                list6 = list11;
                list7 = list12;
                gVar3 = gVar7;
                tVar = (t) objI4;
                if (tVar != null) {
                    d14 = tVar.f71347a;
                } else {
                    d14 = null;
                }
                if (list7 == null) {
                    if (list7 == null) {
                    }
                    int i29 = d.Q0;
                    y0<g3<bz1.b>> y0VarZ113 = dVar.Z4();
                    g3.a aVar122 = g3.f35298f;
                    bz1.b bVar19 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                    aVar122.getClass();
                    y0VarZ113.j(g3.a.d(bVar19));
                    break;
                } else {
                    if (list7 == null) {
                    }
                    int i210 = d.Q0;
                    y0<g3<bz1.b>> y0VarZ114 = dVar.Z4();
                    g3.a aVar123 = g3.f35298f;
                    bz1.b bVar110 = new bz1.b(zy1.c.ALL, kVar2, list7, list6, d14, gVar3);
                    aVar123.getClass();
                    y0VarZ114.j(g3.a.d(bVar110));
                    break;
                }
                return Unit.INSTANCE;
            case 8:
                Double d17 = this.f207502j;
                kVar6 = this.f207501i;
                gVar6 = this.f207496d;
                r.b(obj);
                d14 = d17;
                objL5 = obj;
                ((Boolean) objL5).getClass();
                kVar5 = kVar6;
                gVar5 = gVar6;
                Double d18 = d14;
                int i120 = d.Q0;
                y0<g3<bz1.b>> y0VarZ20 = dVar.Z4();
                g3.a aVar124 = g3.f35298f;
                if (kVar5 != null) {
                }
                aVar124.getClass();
                y0VarZ20.j(g3.a.d(bVar));
                return Unit.INSTANCE;
            case 9:
                Double d19 = this.f207502j;
                kVar4 = this.f207501i;
                list9 = this.f207500h;
                gVar3 = this.f207496d;
                r.b(obj);
                d14 = d19;
                objL4 = obj;
                ((Boolean) objL4).getClass();
                kVar3 = kVar4;
                list8 = list9;
                gVar4 = gVar3;
                d15 = d14;
                int i121 = d.Q0;
                y0<g3<bz1.b>> y0VarZ21 = dVar.Z4();
                g3.a aVar125 = g3.f35298f;
                if (kVar3 != null) {
                }
                aVar125.getClass();
                y0VarZ21.j(g3.a.d(bVar));
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
