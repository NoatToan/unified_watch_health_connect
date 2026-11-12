package ug0;

import androidx.lifecycle.u1;
import c22.a0;
import java.util.LinkedHashMap;
import o13.r;
import o53.c2;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lug0/q;", "Landroidx/lifecycle/u1;", "Lre0/o;", "managedAccountsRepository", "Lte0/e;", "generateAuthorizedUri", "La22/i;", "userProfileRepo", "Lc22/a0;", "dispatchProvider", "<init>", "(Lre0/o;Lte0/e;La22/i;Lc22/a0;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re0.o f170627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.e f170628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22.i f170629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f170630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f170631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f170632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f170633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f170634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z53.b f170635i;

    public q(re0.o oVar, te0.e eVar, a22.i iVar, a0 a0Var) {
        oVar.getClass();
        eVar.getClass();
        iVar.getClass();
        a0Var.getClass();
        this.f170627a = oVar;
        this.f170628b = eVar;
        this.f170629c = iVar;
        this.f170630d = a0Var;
        this.f170631e = q2.a(new a(null, false, null, 7, null));
        this.f170632f = q2.a(null);
        this.f170634h = new LinkedHashMap();
        this.f170635i = z53.c.a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0095  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00bc -> B:23:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x011a -> B:31:0x011e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object x4(ug0.q r17, ue0.k r18, v13.c r19) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.q.x4(ug0.q, ue0.k, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y4(Long l14, v13.c cVar) {
        n nVar;
        z53.b bVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f170603e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f170603e = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f170601c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f170603e;
        if (i15 == 0) {
            r.b(obj);
            nVar.f170599a = l14;
            bVar = this.f170635i;
            nVar.f170600b = bVar;
            nVar.f170603e = 1;
            if (bVar.c(nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = nVar.f170600b;
            Long l15 = nVar.f170599a;
            r.b(obj);
            bVar = bVar2;
            l14 = l15;
        }
        try {
            return this.f170634h.get(l14 != null ? new Integer((int) l14.longValue()) : null);
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(re0.o oVar, te0.e eVar, a22.i iVar, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            a22.i.f537b.getClass();
            iVar = a22.i.a.a();
        }
        this(oVar, eVar, iVar, (i14 & 8) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
