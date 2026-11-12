package hx0;

import androidx.lifecycle.y0;
import okhttp3.Response;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$updateDailyNotes$1", f = "MenstrualCycleDetailsViewModel.kt", l = {362}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww0.b f86019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f86020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(LocalDate localDate, ww0.b bVar, s sVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f86018b = localDate;
        this.f86019c = bVar;
        this.f86020d = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f86018b, this.f86019c, this.f86020d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86017a;
        s sVar = this.f86020d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                LocalDate localDate = this.f86018b;
                ww0.b bVar = this.f86019c;
                this.f86017a = 1;
                obj = aVar2.A(localDate, bVar, this);
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
            y0<cx0.a<ww0.b>> y0Var = sVar.f86150n;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            y0Var.j(new cx0.a<>(t7, null, new Integer(response.code()), response.isSuccessful()));
        } catch (Exception e4) {
            sVar.f86150n.j(new cx0.a<>(null, e4, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
