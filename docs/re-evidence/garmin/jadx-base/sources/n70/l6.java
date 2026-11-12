package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln70/l6;", "", "Lpc0/j;", "devicesRepo", "<init>", "(Lpc0/j;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f124393b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.j f124394a;

    static {
        new a(null);
        pc0.j.a aVar = pc0.j.f137223i;
    }

    public /* synthetic */ l6(pc0.j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? pc0.j.a.a(pc0.j.f137223i) : jVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(l6 l6Var, v13.c cVar) throws Throwable {
        m6 m6Var;
        l6Var.getClass();
        if (cVar instanceof m6) {
            m6Var = (m6) cVar;
            int i14 = m6Var.f124415c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m6Var.f124415c = i14 - Integer.MIN_VALUE;
            } else {
                m6Var = new m6(l6Var, cVar);
            }
        } else {
            m6Var = new m6(l6Var, cVar);
        }
        Object objE0 = m6Var.f124413a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m6Var.f124415c;
        if (i15 == 0) {
            o13.r.b(objE0);
            pc0.j jVar = l6Var.f124394a;
            m6Var.f124415c = 1;
            jVar.getClass();
            x53.c cVar2 = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new pc0.b0(jVar, null), m6Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        com.garmin.android.apps.connectmobile.devices.model.u uVar = (com.garmin.android.apps.connectmobile.devices.model.u) objE0;
        sd2.f fVar = uVar.f34316a;
        int i16 = uVar.f34318c;
        int i17 = uVar.f34317b;
        if (fVar == null || !(i16 == 1 || i17 == 1)) {
            return new com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c(null, null);
        }
        long unitID = fVar.getUnitID();
        String productNumber = fVar.getProductNumber();
        productNumber.getClass();
        com.garmin.android.apps.connectmobile.devices.a.f33827a.getClass();
        return new com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c(new Long(unitID), com.garmin.android.apps.connectmobile.devices.a.C0573a.a(productNumber));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/l6$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public l6(pc0.j jVar) {
        jVar.getClass();
        this.f124394a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l6() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
