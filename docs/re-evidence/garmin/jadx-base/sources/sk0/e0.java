package sk0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "it", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Ljava/util/List;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$savePhotos$4", f = "AddGearViewModel.kt", l = {292}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<List<? extends String>, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f159660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f159661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f159662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b0 b0Var, String str, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f159661c = b0Var;
        this.f159662d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f159661c, this.f159662d, dVar);
        e0Var.f159660b = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends String> list, t13.d<? super v2<? extends Unit>> dVar) {
        return ((e0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f159660b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159659a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        kk0.b bVar = this.f159661c.f159580a;
        this.f159660b = null;
        this.f159659a = 1;
        Object objT = bVar.t(this.f159662d, list, this);
        return objT == aVar ? aVar : objT;
    }
}
