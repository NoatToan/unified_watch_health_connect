package nj2;

import androidx.lifecycle.y0;
import d53.w;
import java.util.List;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$findAddress$1", f = "CustomerManagementViewModel.kt", l = {584, 585}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f126309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f126310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, String str, String str2, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f126308c = aVar;
        this.f126309d = str;
        this.f126310e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f126308c, this.f126309d, this.f126310e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126307b;
        a aVar2 = this.f126308c;
        String str = this.f126309d;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y0Var = this.f126306a;
                    o13.r.b(obj);
                }
                y0Var.m(obj);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            aVar2.G4().debug("findAddress: text = " + str);
            if (str.length() > 0 && w.i0(str).toString().length() > 0) {
                this.f126307b = 1;
                if (m0.b(1000L, this) == aVar) {
                }
                return aVar;
            }
            return Unit.INSTANCE;
            y0<List<fj2.f>> y0Var2 = aVar2.f126271y;
            dj2.a aVar3 = aVar2.f126249a;
            String str2 = aVar2.f126256h;
            str2.getClass();
            String str3 = this.f126310e;
            this.f126306a = y0Var2;
            this.f126307b = 2;
            Object objG = aVar3.g(str, str2, str3, this);
            if (objG != aVar) {
                y0Var = y0Var2;
                obj = objG;
                y0Var.m(obj);
                return Unit.INSTANCE;
            }
            return aVar;
        } catch (Exception e4) {
            int i15 = a.A;
            aVar2.I4(e4);
        }
    }
}
