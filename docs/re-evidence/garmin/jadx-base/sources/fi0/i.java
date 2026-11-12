package fi0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import ei0.q0;
import java.util.List;
import java.util.Map;
import lc.u0;
import li0.d0;
import li0.e0;
import li0.l0;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;
import r53.z1;
import yc.h3;
import yc.i3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB1\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lfi0/i;", "Lyc/h3;", "", "Lli0/d0;", "Lr53/z1;", "", "Lli0/l0;", "stateMap", "Lei0/d;", "followRepo", "", "pageSize", "<init>", "(Lr53/z1;Lei0/d;I)V", "a", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends h3<String, d0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1<Map<String, l0>> f71686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei0.d f71687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71688d;

    static {
        new a(null);
    }

    public i(z1<Map<String, l0>> z1Var, ei0.d dVar, int i14) {
        z1Var.getClass();
        dVar.getClass();
        this.f71686b = z1Var;
        this.f71687c = dVar;
        this.f71688d = i14;
    }

    @Override // yc.h3
    public final String c(i3<String, d0> i3Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yc.h3
    public final Object e(h3.a aVar, v13.c cVar) {
        j jVar;
        String str;
        hi0.h hVar;
        List<d0> list;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f71694f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f71694f = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objU4 = jVar.f71692d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f71694f;
        if (i15 == 0) {
            o13.r.b(objU4);
            str = (String) aVar.a();
            hi0.i iVar = new hi0.i(new Integer(this.f71688d), str);
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            jVar.f71689a = str;
            jVar.f71694f = 1;
            objU4 = this.f71687c.u4(iVar, listC, jVar);
            if (objU4 != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            str = jVar.f71689a;
            o13.r.b(objU4);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = jVar.f71691c;
            hVar = jVar.f71690b;
            o13.r.b(objU4);
        }
        if (list == null) {
            list = j0.f134944a;
        }
        return new h3.b.c(list, null, hVar.getNextCursor());
        v2 v2Var = (v2) objU4;
        if (v2Var instanceof v2.b) {
            hi0.h hVar2 = (hi0.h) ((v2.b) v2Var).f47386a;
            List<d0> listC2 = q0.c(hVar2);
            jVar.f71689a = null;
            jVar.f71690b = hVar2;
            jVar.f71691c = listC2;
            jVar.f71694f = 2;
            if (e0.c(listC2, this.f71686b, jVar) != aVar2) {
                hVar = hVar2;
                list = listC2;
                if (list == null) {
                    list = j0.f134944a;
                }
                return new h3.b.c(list, null, hVar.getNextCursor());
            }
            return aVar2;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        Exception exc = ((v2.a) v2Var).f47383a;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "MySuggestedPagingSource", "Loading failed on cursor=[" + str + "], exception=[" + exc + "]");
        return new h3.b.a(exc);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfi0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
