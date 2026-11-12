package sk0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Ljava/lang/String;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.BaseAddGearViewModel$savePhotos$3", f = "AddGearViewModel.kt", l = {289}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<String, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f159653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f159654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f159655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, String str, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f159654c = b0Var;
        this.f159655d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f159654c, this.f159655d, dVar);
        d0Var.f159653b = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(String str, t13.d<? super v2<? extends Unit>> dVar) {
        return ((d0) create(str, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.f159653b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159652a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        kk0.b bVar = this.f159654c.f159580a;
        this.f159653b = null;
        this.f159652a = 1;
        Object objI = bVar.i(this.f159655d, str, this);
        return objI == aVar ? aVar : objI;
    }
}
