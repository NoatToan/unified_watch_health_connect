package y10;

import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppDetailsViewModel$retrieveNetworks$1", f = "ConnectIQAppDetailsViewModel.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f193814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<gn2.c.d> f193815c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgn2/c$d;", "<anonymous>", "(Lo53/b0;)Lgn2/c$d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppDetailsViewModel$retrieveNetworks$1$networksResult$1", f = "ConnectIQAppDetailsViewModel.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super gn2.c.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f193818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f193818c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f193818c, dVar);
            aVar.f193817b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super gn2.c.d> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f193817b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193816a;
            long j8 = this.f193818c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    gn2.c cVar = (gn2.c) zb0.k.b(gn2.c.class, j8);
                    if (cVar == null) {
                        return null;
                    }
                    this.f193817b = b0Var;
                    this.f193816a = 1;
                    obj = cVar.p(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (gn2.c.d) obj;
            } catch (Exception e4) {
                a2 a2Var = a2.DEVICES;
                String strN = wr.g.n("retrieveNetworks FAILED deviceId[", j8, "] ", e4);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "ConnectIQAppDetailsViewModel", strN);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j8, y0<gn2.c.d> y0Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f193814b = j8;
        this.f193815c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f193814b, this.f193815c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193813a;
        long j8 = this.f193814b;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(j8, null);
            this.f193813a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        gn2.c.d dVar = (gn2.c.d) obj;
        if (dVar != null) {
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).b(j8, !dVar.f78108c.isEmpty());
        }
        this.f193815c.j(dVar);
        return Unit.INSTANCE;
    }
}
