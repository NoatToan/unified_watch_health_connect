package oo;

import am.n;
import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Loo/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f133050p = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f133055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0 f133056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qs.g f133057g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f133059i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f133061k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f133063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f133064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f133065o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj1.b f133051a = mj1.b.a.a(mj1.b.f119081b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f133052b = m.b(new oe0.e(10));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f133053c = m.b(new oe0.e(11));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<fg0.k> f133054d = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f133058h = m.b(new oe0.e(12));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f133060j = m.b(new oe0.e(13));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f133062l = m.b(new oe0.e(14));

    static {
        new a(null);
    }

    public b() {
        final int i14 = 0;
        this.f133059i = m.b(new e23.a(this) { // from class: oo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f133049b;

            {
                this.f133049b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                b bVar = this.f133049b;
                switch (i15) {
                    case 0:
                        int i16 = b.f133050p;
                        return (y0) bVar.f133058h.getValue();
                    case 1:
                        int i17 = b.f133050p;
                        return bVar.z4();
                    default:
                        int i18 = b.f133050p;
                        return (y0) bVar.f133062l.getValue();
                }
            }
        });
        final int i15 = 1;
        this.f133061k = m.b(new e23.a(this) { // from class: oo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f133049b;

            {
                this.f133049b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                b bVar = this.f133049b;
                switch (i16) {
                    case 0:
                        int i17 = b.f133050p;
                        return (y0) bVar.f133058h.getValue();
                    case 1:
                        int i18 = b.f133050p;
                        return bVar.z4();
                    default:
                        int i19 = b.f133050p;
                        return (y0) bVar.f133062l.getValue();
                }
            }
        });
        final int i16 = 2;
        this.f133063m = m.b(new e23.a(this) { // from class: oo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f133049b;

            {
                this.f133049b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                b bVar = this.f133049b;
                switch (i17) {
                    case 0:
                        int i18 = b.f133050p;
                        return (y0) bVar.f133058h.getValue();
                    case 1:
                        int i19 = b.f133050p;
                        return bVar.z4();
                    default:
                        int i110 = b.f133050p;
                        return (y0) bVar.f133062l.getValue();
                }
            }
        });
        t tVarB = m.b(new oe0.e(15));
        this.f133064n = tVarB;
        this.f133065o = (y0) tVarB.getValue();
        ((y0) tVarB.getValue()).m("ActivitiesEventTypeFragment");
    }

    public static final ps.d x4(b bVar, fg0.k kVar) {
        fg0.d customGoal;
        bVar.getClass();
        ps.f fVar = new ps.f(s.g(kVar.getRace(), Boolean.TRUE) ? ps.e.RACE.f139802a : ps.e.SPECIAL_EVENT.f139802a);
        ps.c cVar = new ps.c(kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), null, null, null, null, null, 62, null);
        cVar.a(kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
        cVar.b(kVar.getShareableEventUuid());
        fg0.d completionTarget = kVar.getCompletionTarget();
        if (completionTarget != null) {
            gg0.h unitType = completionTarget.getUnitType();
            cVar.c(unitType != null ? unitType.f77161a : null);
            cVar.d(completionTarget.getUnitType() == gg0.h.DISTANCE ? completionTarget.b() : completionTarget.g());
        }
        fg0.j eventCustomization = kVar.getEventCustomization();
        if (eventCustomization != null && (customGoal = eventCustomization.getCustomGoal()) != null) {
            gg0.h unitType2 = customGoal.getUnitType();
            cVar.e(unitType2 != null ? unitType2.f77161a : null);
            cVar.f(customGoal.getUnitType() == gg0.h.DISTANCE ? customGoal.b() : customGoal.g());
        }
        ps.d dVar = new ps.d(null, null, 3, null);
        dVar.b(fVar);
        dVar.c(new ps.l(cVar));
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(b bVar, long j8, ps.d dVar, v13.c cVar) {
        h hVar;
        bVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f133094c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f133094c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar, cVar);
            }
        } else {
            hVar = new h(bVar, cVar);
        }
        Object objJ = hVar.f133092a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f133094c;
        boolean z14 = true;
        if (i15 == 0) {
            r.b(objJ);
            am.m mVar = (am.m) bVar.f133053c.getValue();
            hVar.f133094c = 1;
            mVar.getClass();
            objJ = f0.J(mVar, new n(mVar, j8, dVar, null), hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strG = a0.g(((v2.a) v2Var).f47384b, "onSaveActivity: problem in deleting the existing activity id ");
            y.f136664a.getClass();
            y.a.c("ActivitiesEditViewModel", strG);
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    public final void A4(fg0.k kVar) {
        fg0.j eventCustomization;
        if (kVar != null && (eventCustomization = kVar.getEventCustomization()) != null) {
            eventCustomization.D(Long.valueOf(this.f133055e));
        }
        ((y0) this.f133058h.getValue()).m(kVar);
    }

    public final y0<ln.a> z4() {
        return (y0) this.f133060j.getValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loo/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_ACTIVITY_DAYS_PLUS_MINUS", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
