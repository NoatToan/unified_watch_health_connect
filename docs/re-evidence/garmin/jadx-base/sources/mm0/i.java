package mm0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$deleteGroup$1", f = "GroupDetailViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f119532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, String str, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f119532b = eVar;
        this.f119533c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f119532b, this.f119533c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119531a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ym0.a aVar2 = this.f119532b.f119505a;
        this.f119531a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new ym0.i(aVar2, this.f119533c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
