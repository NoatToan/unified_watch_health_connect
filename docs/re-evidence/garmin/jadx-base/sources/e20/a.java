package e20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v13.i;
import vb.h;
import z10.h3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Le20/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "La20/a;", "consentAPI", "<init>", "(La20/a;)V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1315a f62587b = new C1315a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a20.a f62588a;

    public a(a20.a aVar) {
        aVar.getClass();
        this.f62588a = aVar;
    }

    public final Object a(String str, v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(this, str, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f62598d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f62598d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f62596b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f62598d;
        if (i15 == 0) {
            r.b(objJ);
            d dVar = new d(this, str, null);
            cVar2.f62595a = str;
            cVar2.f62598d = 1;
            objJ = f0.J(this, dVar, cVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cVar2.f62595a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return v2Var;
        }
        v2.b bVar = (v2.b) v2Var;
        d20.d dVar2 = (d20.d) bVar.f47386a;
        h3.f201031a.getClass();
        return v2.b.a(bVar, d20.d.o(dVar2, h3.b(str)));
    }

    public final Object c(d20.e eVar, i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new e(this, eVar, null), iVar);
    }

    /* JADX INFO: renamed from: e20.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le20/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1315a {
        public /* synthetic */ C1315a(j jVar) {
            this();
        }

        public static a a(C1315a c1315a) {
            a20.a aVar = (a20.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a20.a.class, new c83.h.a[0], null, null, null, 120);
            c1315a.getClass();
            aVar.getClass();
            return new a(aVar);
        }

        private C1315a() {
        }
    }
}
