package com.garmin.android.apps.connectmobile.shareableevents;

import androidx.lifecycle.n;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c22.j0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import e23.p;
import g22.k;
import java.security.InvalidParameterException;
import java.util.List;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import u62.z;
import v13.e;
import v13.i;
import zx.f;
import zx.g;
import zx.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004B!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000bB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/shareableevents/a;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/n;", "<init>", "()V", "", "eventId", "Lzx/f;", "calendarRepository", "Ld60/b;", "courseRepository", "(JLzx/f;Ld60/b;)V", "", "eventUuid", "(Ljava/lang/String;Lzx/f;Ld60/b;)V", "(Lzx/f;Ld60/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f44225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f44226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d60.b f44227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f44228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f44229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f44230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f44231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f44232i;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.shareableevents.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/shareableevents/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC0830a {
        DELETE_EVENT,
        PACE_PRO_CREATION
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.shareableevents.ShareableEventViewModel$getEvent$1", f = "ShareableEventViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44236a;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            if (r13 == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        
            if (r13 == r0) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44236a;
            a aVar3 = a.this;
            if (i14 == 0) {
                r.b(obj);
                Long l14 = aVar3.f44225b;
                String str = aVar3.f44224a;
                f fVar = aVar3.f44226c;
                if ((l14 != null ? l14.longValue() : 0L) > 0) {
                    if (fVar == null) {
                        s.m("calendarRepository");
                        throw null;
                    }
                    Long l15 = aVar3.f44225b;
                    long jLongValue = l15 != null ? l15.longValue() : 0L;
                    this.f44236a = 1;
                    obj = f0.J(fVar, new g(fVar, jLongValue, null), this);
                } else if (str == null || str.length() <= 0) {
                    aVar = new v2.a(new InvalidParameterException("Invalid Event ID or Event UUID"), null, null, 6, null);
                } else {
                    if (fVar == null) {
                        s.m("calendarRepository");
                        throw null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    this.f44236a = 2;
                    obj = f0.J(fVar, new h(fVar, str, null), this);
                }
                return aVar2;
            }
            if (i14 == 1) {
                r.b(obj);
                aVar = (v2) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                aVar = (v2) obj;
            }
            if (aVar instanceof v2.b) {
                y0<g3<dy.a>> y0VarY4 = aVar3.y4();
                g3.a aVar4 = g3.f35298f;
                T t7 = ((v2.b) aVar).f47386a;
                z.h(aVar4, t7, y0VarY4);
                Long courseId = ((dy.a) t7).getCourseId();
                if (courseId != null) {
                    ge1.b.T(v1.a(aVar3), null, null, new ol1.e(aVar3, courseId.longValue(), null), 3);
                    ge1.b.T(v1.a(aVar3), null, null, new ol1.f(null), 3);
                }
            } else {
                if (!(aVar instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                aVar3.y4().j(g3.a.a(g3.f35298f, ((v2.a) aVar).f47383a.toString(), null, null, null, 14));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44238a;

        public c(l lVar) {
            lVar.getClass();
            this.f44238a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44238a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44238a.invoke(obj);
        }
    }

    private a() {
        this.f44228e = m.b(new oe0.e(6));
        this.f44229f = m.b(new oe0.e(7));
        this.f44230g = m.b(new oe0.e(8));
        this.f44231h = m.b(new oe0.e(9));
        this.f44232i = -1L;
    }

    public final void A4() {
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }

    public final Boolean B4() {
        dy.a aVar;
        String date;
        g3<dy.a> g3VarD = y4().d();
        if (g3VarD == null || (aVar = g3VarD.f35301b) == null || (date = aVar.getDate()) == null) {
            return null;
        }
        return Boolean.valueOf(k.c(j0.K(date, "yyyy-MM-dd")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g3 x4(y0 y0Var, y0 y0Var2, y0 y0Var3) {
        g3 g3Var;
        dy.a aVar;
        List list;
        com.garmin.android.library.mapsdkadapter.i.b bVarH;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        g3 g3Var2 = (g3) y0Var.d();
        fw.p pVar = g3Var2 != null ? g3Var2.f35300a : null;
        fw.p pVar2 = fw.p.LOADING;
        if (pVar != pVar2) {
            g3 g3Var3 = (g3) y0Var2.d();
            if ((g3Var3 != null ? g3Var3.f35300a : null) != pVar2) {
                g3 g3Var4 = (g3) y0Var3.d();
                if ((g3Var4 != null ? g3Var4.f35300a : null) != pVar2) {
                    g3 g3Var5 = (g3) y0Var.d();
                    if ((g3Var5 != null ? g3Var5.f35300a : null) != fw.p.SUCCESS || (g3Var = (g3) y0Var.d()) == null || (aVar = (dy.a) g3Var.f35301b) == null) {
                        return g3.a.a(g3.f35298f, null, null, null, null, 15);
                    }
                    String eventImageURL = aVar.getEventImageURL();
                    String eventName = aVar.getEventName();
                    g3 g3Var6 = (g3) y0Var2.d();
                    Double dValueOf = (g3Var6 == null || (eVar3 = (com.garmin.android.apps.connectmobile.courses.model.e) g3Var6.f35301b) == null) ? null : Double.valueOf(eVar3.q());
                    String eventType = aVar.getEventType();
                    String date = aVar.getDate();
                    String eventTime = aVar.getEventTime();
                    String str = aVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION java.lang.String();
                    Long courseId = aVar.getCourseId();
                    String courseName = aVar.getCourseName();
                    String url = aVar.getUrl();
                    String note = aVar.getNote();
                    Boolean shareable = aVar.getShareable();
                    Boolean subscribed = aVar.getSubscribed();
                    Boolean eventOrganizer = aVar.getEventOrganizer();
                    Boolean boolB4 = B4();
                    g3 g3Var7 = (g3) y0Var2.d();
                    if (g3Var7 == null || (eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) g3Var7.f35301b) == null || (list = eVar2.geoPoints) == null) {
                        list = p13.j0.f134944a;
                    }
                    List list2 = list;
                    g3 g3Var8 = (g3) y0Var2.d();
                    if (g3Var8 == null || (eVar = (com.garmin.android.apps.connectmobile.courses.model.e) g3Var8.f35301b) == null || (bVarH = eVar.h()) == null) {
                        bVarH = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                    }
                    com.garmin.android.library.mapsdkadapter.i.b bVar = bVarH;
                    g3 g3Var9 = (g3) y0Var3.d();
                    ol1.c cVar = new ol1.c(eventImageURL, eventName, dValueOf, eventType, date, eventTime, str, courseId, courseName, url, note, shareable, subscribed, eventOrganizer, boolB4, list2, bVar, g3Var9 != null ? (List) g3Var9.f35301b : null);
                    g3.f35298f.getClass();
                    return g3.a.d(cVar);
                }
            }
        }
        g3.f35298f.getClass();
        return g3.a.b(null);
    }

    public final y0<g3<dy.a>> y4() {
        return (y0) this.f44228e.getValue();
    }

    public final y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> z4() {
        return (y0) this.f44229f.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(long j8, f fVar, d60.b bVar) {
        this();
        fVar.getClass();
        bVar.getClass();
        this.f44225b = Long.valueOf(j8);
        this.f44226c = fVar;
        this.f44227d = bVar;
        A4();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, f fVar, d60.b bVar) {
        this();
        str.getClass();
        fVar.getClass();
        bVar.getClass();
        this.f44224a = str;
        this.f44226c = fVar;
        this.f44227d = bVar;
        A4();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar, d60.b bVar) {
        this();
        fVar.getClass();
        bVar.getClass();
        this.f44226c = fVar;
        this.f44227d = bVar;
        A4();
    }
}
