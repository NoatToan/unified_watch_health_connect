package sz0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsz0/a0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lvz0/d;", "notificationApi", "Lte0/d;", "fetchViewableAccountsUseCase", "Lf12/l;", "userSettings", "<init>", "(Lvz0/d;Lte0/d;Lf12/l;)V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f161325d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vz0.d f161326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.d f161327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.l f161328c;

    public a0(vz0.d dVar, te0.d dVar2, f12.l lVar) {
        dVar.getClass();
        dVar2.getClass();
        lVar.getClass();
        this.f161326a = dVar;
        this.f161327b = dVar2;
        this.f161328c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(int i14, String str, v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i15 = c0Var.f161362e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c0Var.f161362e = i15 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objJ = c0Var.f161360c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = c0Var.f161362e;
        Object obj = null;
        if (i16 == 0) {
            o13.r.b(objJ);
            d0 d0Var = new d0(this, i14, str, null);
            c0Var.f161358a = i14;
            c0Var.f161362e = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, d0Var, c0Var);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = c0Var.f161359b;
            o13.r.b(objJ);
            return bVar;
        }
        i14 = c0Var.f161358a;
        o13.r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var;
            List<uz0.g> listB = ((uz0.h) bVar2.f47386a).b();
            if (listB != null) {
                for (Object obj2 : listB) {
                    uz0.g gVar = (uz0.g) obj2;
                    if (gVar.getType() == uz0.k.AUTHORIZED_VIEWER_REMOVED && p005kotlin.jvm.internal.s.g(gVar.getViewed(), Boolean.FALSE)) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (uz0.g) obj;
            }
            if (obj != null && this.f161328c.X3()) {
                c0Var.f161359b = bVar2;
                c0Var.f161358a = i14;
                c0Var.f161362e = 2;
                if (this.f161327b.a(c0Var) == aVar) {
                    return aVar;
                }
            }
        }
        return v2Var;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsz0/a0$a;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a0 a() {
            vz0.d dVar = (vz0.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, vz0.d.class, new c83.h.a[0], null, null, null, 120);
            te0.d dVar2 = (te0.d) KoinJavaComponent.get$default(te0.d.class, null, null, 6, null);
            f12.l.f68084a.getClass();
            return new a0(dVar, dVar2, f12.l.a.a());
        }

        private a() {
        }
    }
}
