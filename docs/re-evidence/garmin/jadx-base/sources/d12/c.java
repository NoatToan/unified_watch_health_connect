package d12;

import am.j;
import com.garmin.android.apps.connectmobile.y;
import com.garmin.android.apps.connectmobile.z;
import f12.l;
import o13.q;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ld12/c;", "Ld12/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b {
    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (sf1.c.a(r0) == r1) goto L37;
     */
    @Override // d12.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e12.e eVar, v13.c cVar) {
        d dVar;
        Object bVar;
        Object bVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f57093c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f57093c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f57091a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f57093c;
        try {
            try {
                if (i15 == 0) {
                    r.b(obj);
                    l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                    lVar.H0(true);
                    if (!eVar.Q0()) {
                        lVar.v4(false);
                    }
                    z.f49770a.getClass();
                    z.f49775f.j(new y(null, 1, null));
                    int i16 = q.f128596b;
                    dVar.f57093c = 1;
                    if (hf0.d.a(dVar) == aVar) {
                    }
                    return aVar;
                }
                if (i15 == 1) {
                    r.b(obj);
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar = Unit.INSTANCE;
                int i17 = q.f128596b;
                Throwable thB = q.b(bVar);
                if (thB != null) {
                    String strP = j.p("updateUserPreferenceGhsAccountCreated FAILED ", thB);
                    p92.y.f136664a.getClass();
                    p92.y.a.c("UsageIndicatorsListener", strP);
                }
                return Unit.INSTANCE;
                bVar2 = Unit.INSTANCE;
                int i18 = q.f128596b;
            } catch (Throwable th3) {
                int i19 = q.f128596b;
                bVar2 = new q.b(th3);
            }
            Throwable thB2 = q.b(bVar2);
            if (thB2 != null) {
                String strP2 = j.p("updateUserPreferenceGhsEcgEnabled FAILED ", thB2);
                p92.y.f136664a.getClass();
                p92.y.a.c("UsageIndicatorsListener", strP2);
            }
            dVar.f57093c = 2;
        } catch (Throwable th4) {
            int i24 = q.f128596b;
            bVar = new q.b(th4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld12/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
