package pk2;

import android.os.SystemClock;
import o53.c2;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$scheduleDownloadQueueCheck$2", f = "AgentQueueHelper.kt", l = {130, 132, 141}, m = "invokeSuspend")
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f138490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f138491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f138492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f138493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f138494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b bVar, long j8, e23.a<Unit> aVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f138492c = bVar;
        this.f138493d = j8;
        this.f138494e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f138492c, this.f138493d, this.f138494e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r15.P(r14) == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        long j8;
        Long l14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138491b;
        long j14 = this.f138493d;
        b bVar = this.f138492c;
        if (i14 == 0) {
            o13.r.b(obj);
            bVar.f138360c.a();
            jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f138490a = jElapsedRealtime;
            this.f138491b = 1;
            if (m0.b(((long) 1000) * j14, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            jElapsedRealtime = this.f138490a;
            o13.r.b(obj);
        } else if (i14 == 2) {
            j8 = this.f138490a;
            o13.r.b(obj);
            l14 = bVar.f138368k;
            if (l14 == null && l14.longValue() > j8) {
                wr.g.v("Skipping scheduled download queue check since one occurred within last ", j14, "s", bVar.f138362e);
                return Unit.INSTANCE;
            }
            c2 c2VarK = bVar.k(ok2.y.c.a(ok2.y.f132805h, null, null, ok2.y.d.BLOCKED, ok2.y.d.FORCED, 19));
            this.f138491b = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f138494e.invoke();
        return Unit.INSTANCE;
        this.f138490a = jElapsedRealtime;
        this.f138491b = 2;
        if (bVar.f(this) != aVar) {
            j8 = jElapsedRealtime;
            l14 = bVar.f138368k;
            if (l14 == null) {
            }
            c2 c2VarK2 = bVar.k(ok2.y.c.a(ok2.y.f132805h, null, null, ok2.y.d.BLOCKED, ok2.y.d.FORCED, 19));
            this.f138491b = 3;
        }
        return aVar;
    }
}
