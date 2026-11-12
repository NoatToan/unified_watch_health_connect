package fb1;

import androidx.lifecycle.y0;
import okhttp3.Response;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.BabyMovementLoggingViewModel$postBabyMovement$1", f = "BabyMovementLoggingViewModel.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f70255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww0.b f70256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f70257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LocalDate localDate, ww0.b bVar, l lVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f70255b = localDate;
        this.f70256c = bVar;
        this.f70257d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f70255b, this.f70256c, this.f70257d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70254a;
        l lVar = this.f70257d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                LocalDate localDate = this.f70255b;
                ww0.b bVar2 = this.f70256c;
                this.f70254a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.m(localDate, bVar2, this);
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
            c83.a0 a0Var = (c83.a0) obj;
            y0<cx0.a<ww0.b>> y0Var = lVar.f70260a;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            y0Var.j(new cx0.a<>(t7, null, new Integer(response.code()), response.isSuccessful()));
        } catch (Exception e4) {
            lVar.f70260a.j(new cx0.a<>(null, e4, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
