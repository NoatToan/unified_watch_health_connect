package lc0;

import o13.q;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Llc0/k;", "", "Ll80/a;", "deviceDelegate", "Lbc0/b;", "batteryStatusObserver", "Llm2/i;", "pairingServerDelegate", "<init>", "(Ll80/a;Lbc0/b;Llm2/i;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f111948d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.a f111949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc0.b f111950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2.i f111951c;

    static {
        new a(null);
    }

    public k(l80.a aVar, bc0.b bVar, lm2.i iVar) {
        aVar.getClass();
        bVar.getClass();
        iVar.getClass();
        this.f111949a = aVar;
        this.f111950b = bVar;
        this.f111951c = iVar;
    }

    public final im2.l a(long j8, boolean z14, e23.l lVar, e23.l lVar2) {
        this.f111949a.t(j8);
        this.f111950b.b(j8);
        return ((im2.c) this.f111951c).l(j8, z14, new l(lVar, lVar2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j8, v13.c cVar, boolean z14) throws Throwable {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f111956c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f111956c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objP = mVar.f111954a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f111956c;
        if (i15 == 0) {
            r.b(objP);
            mVar.f111956c = 1;
            o53.k kVar = new o53.k(u13.f.b(mVar), 1);
            kVar.q();
            this.f111949a.t(j8);
            ((im2.c) this.f111951c).l(j8, z14, new n(kVar));
            objP = kVar.p();
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objP);
        }
        return ((q) objP).f128597a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc0/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(l80.a aVar, bc0.b bVar, lm2.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, bVar, (i14 & 4) != 0 ? lm2.h.f() : iVar);
    }
}
