package pc0;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpc0/o0;", "Lpc0/n0;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f137273b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f137274a;

    static {
        new a(null);
    }

    public o0(f12.l lVar) {
        lVar.getClass();
        this.f137274a = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001a  */
    public static final boolean p(o0 o0Var) {
        boolean zR;
        boolean zIsEmpty = o0Var.q().isEmpty();
        long jD3 = o0Var.f137274a.D3(-1L, "key_inreach_banner_dismissed_at");
        if (jD3 < 0) {
            zR = false;
        } else {
            ArrayList arrayListQ = o0Var.q();
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListQ, 10));
            Iterator it = arrayListQ.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((com.garmin.android.apps.connectmobile.devices.model.v) it.next()).f34321c));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) obj).longValue() > 0) {
                    arrayList2.add(obj);
                }
            }
            Long l14 = (Long) p13.h0.t0(arrayList2);
            if (l14 != null) {
                long jLongValue = l14.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((jCurrentTimeMillis - jLongValue) / 86400000 < 30) {
                    zR = r(jD3, jCurrentTimeMillis);
                } else if (jCurrentTimeMillis - jD3 < CoreConstants.MILLIS_IN_ONE_WEEK) {
                    zR = true;
                } else {
                    zR = false;
                }
            } else {
                zR = false;
            }
        }
        Long l15 = o0Var.l();
        boolean z14 = (zR || zIsEmpty || !(l15 != null ? o0Var.m(l15.longValue()) : false)) ? false : true;
        a2 a2Var = a2.DASHBOARD;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("shouldShowFinishInReachSetupBanner -> ", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "InReachSubscriptionSharedPreferences", strH);
        return z14;
    }

    public static boolean r(long j8, long j14) {
        b63.z.INSTANCE.getClass();
        b63.z zVarA = b63.z.Companion.a();
        e53.j.f63112c.getClass();
        return b63.b.e(e53.j.a.a(j8), zVarA).b().equals(b63.b.e(e53.j.a.a(j14), zVarA).b());
    }

    @Override // pc0.n0
    public final Long a(long j8) {
        Object next;
        Iterator it = q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.garmin.android.apps.connectmobile.devices.model.v) next).f34319a != j8);
        com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) next;
        long j14 = vVar != null ? vVar.f34321c : -1L;
        if (j14 > 0) {
            return Long.valueOf(j14);
        }
        return null;
    }

    @Override // pc0.n0
    public final void b(long j8) {
        ArrayList arrayListQ = q();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ) {
            if (((com.garmin.android.apps.connectmobile.devices.model.v) obj).f34319a != j8) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            s(arrayList);
            return;
        }
        f12.l lVar = this.f137274a;
        lVar.E4("key_inreach_devices");
        lVar.E4("key_inreach_last_api_check_date");
        lVar.E4("key_inreach_has_emergency_contacts");
        lVar.E4("key_inreach_banner_dismissed_at");
    }

    @Override // pc0.n0
    public final void c() {
        this.f137274a.h2(System.currentTimeMillis(), "key_inreach_banner_dismissed_at");
    }

    @Override // pc0.n0
    public final String d(long j8) {
        Object next;
        Iterator it = q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.garmin.android.apps.connectmobile.devices.model.v) next).f34319a != j8);
        com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) next;
        if (vVar != null) {
            return vVar.f34320b;
        }
        return null;
    }

    @Override // pc0.n0
    public final void e(long j8, String str) {
        str.getClass();
        t(j8, new o60.b(str, 5));
    }

    @Override // pc0.n0
    public final boolean f() {
        long jD3 = this.f137274a.D3(-1L, "key_inreach_last_api_check_date");
        Long lValueOf = jD3 > 0 ? Long.valueOf(jD3) : null;
        if (lValueOf != null) {
            return r(lValueOf.longValue(), System.currentTimeMillis());
        }
        return false;
    }

    @Override // pc0.n0
    public final void g(long j8, boolean z14) {
        Object next;
        ArrayList arrayList = new ArrayList(q());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.garmin.android.apps.connectmobile.devices.model.v) next).f34319a != j8);
        com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) next;
        if (vVar == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.devices.model.v vVarA = com.garmin.android.apps.connectmobile.devices.model.v.a(vVar, null, 0L, z14, 7);
        p13.d0.A(arrayList, new j82.d(j8, 17), true);
        arrayList.add(vVarA);
        s(arrayList);
    }

    @Override // pc0.n0
    public final void h(boolean z14) {
        this.f137274a.O2("key_inreach_has_emergency_contacts", z14);
    }

    @Override // pc0.n0
    public final Set<Long> i() {
        ArrayList arrayListQ = q();
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListQ, 10));
        Iterator it = arrayListQ.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((com.garmin.android.apps.connectmobile.devices.model.v) it.next()).f34319a));
        }
        return p13.h0.g1(arrayList);
    }

    @Override // pc0.n0
    public final void j(long j8) {
        this.f137274a.h2(j8, "key_inreach_last_api_check_date");
    }

    @Override // pc0.n0
    public final r53.b k() {
        return r53.s.f(new p0(this, null));
    }

    @Override // pc0.n0
    public final Long l() {
        Object next;
        Iterator it = q().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j8 = ((com.garmin.android.apps.connectmobile.devices.model.v) next).f34321c;
                do {
                    Object next2 = it.next();
                    long j14 = ((com.garmin.android.apps.connectmobile.devices.model.v) next2).f34321c;
                    if (j8 > j14) {
                        next = next2;
                        j8 = j14;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) next;
        if (vVar != null) {
            return Long.valueOf(vVar.f34319a);
        }
        return null;
    }

    @Override // pc0.n0
    public final boolean m(long j8) {
        Object next;
        Iterator it = q().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.garmin.android.apps.connectmobile.devices.model.v) next).f34319a != j8);
        com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) next;
        if (vVar != null) {
            return vVar.f34322d;
        }
        return false;
    }

    @Override // pc0.n0
    public final boolean n() {
        return this.f137274a.W2("key_inreach_has_emergency_contacts", false);
    }

    @Override // pc0.n0
    public final void o(long j8, long j14) {
        t(j8, new j82.d(j14, 16));
    }

    public final ArrayList q() {
        Object bVar;
        Set<String> setL1 = this.f137274a.L1("key_inreach_devices");
        ArrayList arrayList = new ArrayList();
        for (String str : setL1) {
            try {
                int i14 = o13.q.f128596b;
                n63.b.a aVar = n63.b.f123892d;
                aVar.getClass();
                bVar = (com.garmin.android.apps.connectmobile.devices.model.v) aVar.c(com.garmin.android.apps.connectmobile.devices.model.v.INSTANCE.serializer(), str);
            } catch (Throwable th3) {
                int i15 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
            }
            if (bVar instanceof o13.q.b) {
                bVar = null;
            }
            com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) bVar;
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    public final void s(ArrayList arrayList) {
        int iA = t0.a(p13.y.r(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : arrayList) {
            linkedHashMap.put(Long.valueOf(((com.garmin.android.apps.connectmobile.devices.model.v) obj).f34319a), obj);
        }
        Collection<com.garmin.android.apps.connectmobile.devices.model.v> collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList(p13.y.r(collectionValues, 10));
        for (com.garmin.android.apps.connectmobile.devices.model.v vVar : collectionValues) {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            arrayList2.add(aVar.b(com.garmin.android.apps.connectmobile.devices.model.v.INSTANCE.serializer(), vVar));
        }
        this.f137274a.X1("key_inreach_devices", p13.h0.g1(arrayList2));
    }

    public final void t(long j8, e23.l<? super com.garmin.android.apps.connectmobile.devices.model.v, com.garmin.android.apps.connectmobile.devices.model.v> lVar) {
        Object next;
        long j14;
        ArrayList arrayList = new ArrayList(q());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.garmin.android.apps.connectmobile.devices.model.v) next).f34319a != j8);
        com.garmin.android.apps.connectmobile.devices.model.v vVar = (com.garmin.android.apps.connectmobile.devices.model.v) next;
        if (vVar == null) {
            j14 = j8;
            vVar = new com.garmin.android.apps.connectmobile.devices.model.v(j14, (String) null, 0L, false, 14, (p005kotlin.jvm.internal.j) null);
        } else {
            j14 = j8;
        }
        com.garmin.android.apps.connectmobile.devices.model.v vVarInvoke = lVar.invoke(vVar);
        p13.d0.A(arrayList, new j82.d(j14, 18), true);
        arrayList.add(vVarInvoke);
        s(arrayList);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpc0/o0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "INREACH_DEVICES", "INREACH_LAST_API_CHECK_DATE", "INREACH_HAS_EMERGENCY_CONTACTS", "INREACH_BANNER_DISMISSED_AT", "", "MILLIS_PER_DAY", "J", "", "DASHBOARD_INREACH_BANNER_SUPPRESSION_DURATION_DAYS", "I", "DASHBOARD_INREACH_BANNER_WEEKLY_SUPPRESSION_DURATION_DAYS", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
