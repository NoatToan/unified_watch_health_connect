package ho2;

import android.content.Context;
import androidx.lifecycle.y0;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import zn2.q3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainViewModel$checkAvailableSpace$1", f = "PushProvMainViewModel.kt", l = {170}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f84853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zq2.g f84855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f84856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zq2.g gVar, m mVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f84855c = gVar;
        this.f84856d = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f84855c, this.f84856d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f84854b;
        if (i15 == 0) {
            r.b(obj);
            q3 q3Var = new q3();
            GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar.getClass();
            List<fs2.a> listH = GarminPayCoreDatabase.b.a(contextC).e().h();
            zq2.g gVar = this.f84855c;
            m mVar = this.f84856d;
            if (listH == null || !listH.isEmpty()) {
                i14 = 0;
                for (fs2.a aVar2 : listH) {
                    if (aVar2.f73431f == mVar.f84872c && aVar2.f73428c == gVar.f206687h && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            } else {
                i14 = 0;
            }
            int i16 = i14 == 0 ? gVar.f206688i : gVar.f206689j;
            y0<q3.a> y0Var2 = mVar.f84876g;
            if (y0Var2 == null) {
                s.m("isSpaceAvailable");
                throw null;
            }
            long j8 = mVar.f84872c;
            this.f84853a = y0Var2;
            this.f84854b = 1;
            obj = q3Var.a(j8, i16, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f84853a;
            r.b(obj);
        }
        y0Var.j(obj);
        return Unit.INSTANCE;
    }
}
