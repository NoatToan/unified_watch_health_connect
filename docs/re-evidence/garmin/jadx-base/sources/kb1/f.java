package kb1;

import c83.a0;
import db1.m;
import e23.p;
import o13.r;
import o53.b0;
import okhttp3.Response;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.PregnancyHistoryViewModel$putPregnancySettings$1", f = "PregnancyHistoryViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f103829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f103830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f103831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, LocalDate localDate, e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f103829b = mVar;
        this.f103830c = localDate;
        this.f103831d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f103829b, this.f103830c, this.f103831d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m mVar = this.f103829b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103828a;
        e eVar = this.f103831d;
        try {
            if (i14 == 0) {
                r.b(obj);
                tb1.e.f163745a.getClass();
                mVar.A(tb1.e.a.c());
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                String string = this.f103830c.toString();
                string.getClass();
                this.f103828a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.q(string, mVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a0 a0Var = (a0) obj;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            m mVar2 = (m) t7;
            if (mVar2 != null) {
                e.x4(eVar, mVar2);
            }
            eVar.f103822b.j(new cx0.a<>(null, null, new Integer(response.code()), response.isSuccessful()));
        } catch (Throwable th3) {
            eVar.f103822b.j(new cx0.a<>(null, th3, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
