package ii1;

import o13.q;
import o13.r;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lii1/g;", "", "Lgi1/a;", "deviceLocationPreferences", "Lo53/z;", "dispatcher", "<init>", "(Lgi1/a;Lo53/z;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi1.a f93775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f93776b;

    static {
        new a(null);
    }

    public g(gi1.a aVar, z zVar) {
        aVar.getClass();
        zVar.getClass();
        this.f93775a = aVar;
        this.f93776b = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, fi1.b bVar, v13.c cVar) throws Throwable {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f93779c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f93779c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objE0 = hVar.f93777a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f93779c;
        if (i15 == 0) {
            r.b(objE0);
            i iVar = new i(j8, this, bVar, null);
            hVar.f93779c = 1;
            objE0 = ge1.b.e0(this.f93776b, iVar, hVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return ((q) objE0).f128597a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lii1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(gi1.a aVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(aVar, zVar);
    }
}
