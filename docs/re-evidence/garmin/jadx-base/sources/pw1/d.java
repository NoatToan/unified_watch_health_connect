package pw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import fg0.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import org.joda.time.DateTime;
import ov1.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zf0.a0;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpw1/d;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends j0 {
    public static final /* synthetic */ int H0 = 0;
    public final uw1.b I;
    public final kv1.b P;
    public k T;
    public final t X;
    public final t Y;
    public final t Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final y0 f141717k0;

    static {
        new a(null);
    }

    public d() {
        uw1.b.f172999a.getClass();
        this.I = new uw1.b();
        this.P = kv1.b.a.a(kv1.b.f106719e);
        this.X = m.b(new pk0.m(19));
        this.Y = m.b(new u(this, 23));
        this.Z = m.b(new pk0.m(20));
        this.f141717k0 = a5();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0100, code lost:
    
        if (r0 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        if (r0 == r2) goto L59;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X4(d dVar, boolean z14, boolean z15, k kVar, v13.c cVar) {
        f fVar;
        fg0.j jVar;
        Object objI;
        v2.a aVar;
        zf0.d dVar2 = dVar.f204384a;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f141727c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f141727c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar, cVar);
            }
        } else {
            fVar = new f(dVar, cVar);
        }
        Object objJ = fVar.f141725a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f141727c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objJ);
                return objJ;
            }
            if (i15 == 2) {
                r.b(objJ);
                v2 v2Var = (v2) objJ;
                if (v2Var != null) {
                    return v2Var;
                }
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "ITPDashboardViewModel", "Failed to unsubscribe to event. Sharable event ID is null.");
                return new v2.a(new Exception("Sharable event ID is null"), null, null, 6, null);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
            v2 v2Var2 = (v2) objJ;
            if (v2Var2 != null) {
                return v2Var2;
            }
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "ITPDashboardViewModel", "Failed to delete to event. Event ID is null.");
            return new v2.a(new Exception("Event ID is null"), null, null, 6, null);
        }
        r.b(objJ);
        if (!z14) {
            if (z15) {
                String shareableEventUuid = kVar.getShareableEventUuid();
                if (shareableEventUuid != null) {
                    fVar.f141727c = 2;
                    dVar2.getClass();
                    objJ = f0.J(dVar2, new a0(dVar2, shareableEventUuid, null), fVar);
                }
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var3, "ITPDashboardViewModel", "Failed to unsubscribe to event. Sharable event ID is null.");
                return new v2.a(new Exception("Sharable event ID is null"), null, null, 6, null);
            }
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            if (l14 != null) {
                long jLongValue = l14.longValue();
                fVar.f141727c = 3;
                dVar2.getClass();
                objJ = f0.J(dVar2, new zf0.i(dVar2, jLongValue, null), fVar);
            }
            i2.a aVar6 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var4, "ITPDashboardViewModel", "Failed to delete to event. Event ID is null.");
            return new v2.a(new Exception("Event ID is null"), null, null, 6, null);
        }
        fg0.j eventCustomization = kVar.getEventCustomization();
        if (eventCustomization != null) {
            jVar = fg0.j.b(eventCustomization, null, null, null, null, null, null, 7999);
        } else {
            jVar = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        kVar.E0(jVar);
        fVar.f141727c = 1;
        if (s.g(kVar.getEventOrganizer(), Boolean.TRUE)) {
            Long l15 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            objI = l15 != null ? dVar2.h(l15.longValue(), kVar, fVar) : new v2.a(new IllegalStateException("Event Id null."), null, null, 6, null);
        } else {
            fg0.j eventCustomization2 = kVar.getEventCustomization();
            if (eventCustomization2 == null) {
                aVar = new v2.a(new IllegalStateException("Event customization null"), null, null, 6, null);
            } else {
                String shareableEventUuid2 = kVar.getShareableEventUuid();
                if (shareableEventUuid2 == null) {
                    aVar = new v2.a(new IllegalStateException("Shareable Event ID null"), null, null, 6, null);
                } else {
                    objI = dVar2.i(shareableEventUuid2, eventCustomization2, fVar);
                }
            }
            objI = aVar;
        }
        if (objI != aVar2) {
            return objI;
        }
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Serializable Y4(d dVar, tw1.m mVar, v13.c cVar) {
        g gVar;
        String string;
        ArrayList arrayList;
        dVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f141731d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f141731d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar, cVar);
            }
        } else {
            gVar = new g(dVar, cVar);
        }
        g gVar2 = gVar;
        Object objA = gVar2.f141729b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar2.f141731d;
        if (i15 == 0) {
            r.b(objA);
            hg0.b bVarB4 = dVar.B4();
            String strValueOf = String.valueOf(mVar.getStartDate());
            DateTime dateTimeO = mVar.o();
            if (dateTimeO != null) {
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                string = ((DateTime) r13.b.e(dateTimeO, dateTimeNow)).toString();
                if (string == null) {
                    string = DateTime.now().toString();
                    string.getClass();
                }
            } else {
                string = DateTime.now().toString();
                string.getClass();
            }
            String str = string;
            gVar2.f141728a = mVar;
            gVar2.f141731d = 1;
            objA = hg0.b.a(bVarB4, null, null, strValueOf, str, 365, gVar2);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mVar = gVar2.f141728a;
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving list of activities: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "ITPDashboardViewModel", strD);
            return p13.j0.f134944a;
        }
        ArrayList arrayListY = mVar.y();
        if (arrayListY != null) {
            arrayList = new ArrayList();
            Iterator it = arrayListY.iterator();
            while (it.hasNext()) {
                Long associatedActivityId = ((tw1.j) it.next()).getAssociatedActivityId();
                if (associatedActivityId != null) {
                    arrayList.add(associatedActivityId);
                }
            }
        } else {
            arrayList = null;
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj;
            if (arrayList != null && arrayList.contains(new Long(activityListItemDTO.f29250b))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final y0<g3<sw1.a>> Z4() {
        return (y0) this.X.getValue();
    }

    public final y0<g3<Unit>> a5() {
        return (y0) this.Z.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpw1/d$a;", "", "<init>", "()V", "", "INVALID_PLAN_SUBTYPE_ERROR", "Ljava/lang/String;", "TAG", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
