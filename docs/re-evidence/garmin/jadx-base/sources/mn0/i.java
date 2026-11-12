package mn0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lmn0/i;", "", "Lkn0/a;", "repository", "Lf12/l;", "userSettings", "<init>", "(Lkn0/a;Lf12/l;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kn0.a f119734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f119735b;

    static {
        new a(null);
    }

    public i(kn0.a aVar, f12.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f119734a = aVar;
        this.f119735b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(b63.o oVar, v13.c cVar) {
        j jVar;
        boolean zY;
        Object objA;
        i iVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f119741f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f119741f = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f119739d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f119741f;
        if (i15 == 0) {
            r.b(obj);
            zY = this.f119735b.y();
            jVar.f119736a = oVar;
            jVar.f119737b = this;
            jVar.f119738c = zY;
            jVar.f119741f = 1;
            objA = this.f119734a.a(oVar, jVar);
            if (objA == aVar) {
                return aVar;
            }
            iVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z14 = jVar.f119738c;
            iVar = jVar.f119737b;
            b63.o oVar2 = jVar.f119736a;
            r.b(obj);
            zY = z14;
            oVar = oVar2;
            objA = obj;
        }
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            iVar.getClass();
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        v2.b bVar = (v2.b) v2Var;
        Headers headers = bVar.f47389d;
        HttpUrl httpUrl = bVar.f47388c;
        int i16 = bVar.f47387b;
        try {
            if (i16 == 204) {
                return new v2.b(on0.a.a(oVar, zY), i16, httpUrl, headers);
            }
            in0.c cVarD = on0.a.d((in0.d) bVar.f47386a, zY);
            if (cVarD != null) {
                return new v2.b(cVarD, i16, httpUrl, headers);
            }
            throw new IllegalArgumentException("Mapping failed: missing required field");
        } catch (IllegalArgumentException e4) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.g(a2Var, "GetHealthStatusDetailsUseCase", e4);
            return new v2.a(e4, null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmn0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
