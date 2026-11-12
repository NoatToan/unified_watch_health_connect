package xf1;

import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.SegmentsViewModel$removeFavorite$1", f = "SegmentsViewModel.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super v2<? extends String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f190703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f190703b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f190703b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends String>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190702a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        rt1.m mVar = (rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null);
        this.f190702a = 1;
        Object objR = mVar.r(this.f190703b, this);
        return objR == aVar ? aVar : objR;
    }
}
