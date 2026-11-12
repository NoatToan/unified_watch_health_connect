package vc2;

import java.util.concurrent.atomic.AtomicBoolean;
import o13.r;
import o53.b0;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvc2/i;", "", "Lo53/b0;", "coroutineScope", "", "checkStatusAtStartUp", "Lkotlin/Function0;", "Lnd2/b;", "statusUrlDelegate", "<init>", "(Lo53/b0;ZLe23/a;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f177111f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f177112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<nd2.b> f177113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f177114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f177115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f177116e;

    static {
        new a(null);
    }

    public i(b0 b0Var, boolean z14, e23.a<nd2.b> aVar) {
        b0Var.getClass();
        aVar.getClass();
        this.f177112a = b0Var;
        this.f177113b = aVar;
        this.f177114c = q2.a(new m(1, null, 2, null));
        this.f177115d = -1L;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f177116e = atomicBoolean;
        if (z14) {
            atomicBoolean.set(true);
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, x53.b.f189152a, null, new j(this, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i14, v13.c cVar) {
        k kVar;
        m mVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f177123d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f177123d = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f177121b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar.f177123d;
        if (i16 == 0) {
            r.b(obj);
            try {
                mVar = oc.b.D(this.f177113b.invoke());
            } catch (Exception unused) {
                mVar = new m(0, null, 2, null);
            }
            int i17 = mVar.f177128a;
            if ((i17 != 4 && i17 != 0) || i14 <= 0) {
                return mVar;
            }
            kVar.f177120a = i14;
            kVar.f177123d = 1;
            if (m0.b(5000L, kVar) != obj2) {
            }
        }
        if (i16 != 1) {
            if (i16 == 2) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = kVar.f177120a;
        r.b(obj);
        kVar.f177123d = 2;
        Object objA = a(i14 - 1, kVar);
        return objA == obj2 ? obj2 : objA;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lvc2/i$a;", "", "<init>", "()V", "", "SERVER_STATUS_UNKNOWN", "I", "SERVER_STATUS_GREEN", "SERVER_STATUS_YELLOW", "SERVER_STATUS_RED", "SERVER_STATUS_NOT_AVAILABLE", "HTTP_104", "", "STATUS_CHECK_TIME_THRESHOLD_IN_MILLIS", "J", "STATUS_CHECK_RETRY_TIME_THRESHOLD_IN_MILLIS", "STATUS_CHECK_RETRY_COUNT", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
