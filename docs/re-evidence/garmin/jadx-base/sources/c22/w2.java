package c22;

import android.content.SharedPreferences;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.util.SharedPreferenceChangeListenerFlowKt$sharedPreferenceChangeListenerFlow$1", f = "SharedPreferenceChangeListenerFlow.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class w2 extends v13.i implements e23.p<q53.t<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Object> f23308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.l f23309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(e23.a<Object> aVar, f12.l lVar, String str, t13.d<? super w2> dVar) {
        super(2, dVar);
        this.f23308c = aVar;
        this.f23309d = lVar;
        this.f23310e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w2 w2Var = new w2(this.f23308c, this.f23309d, this.f23310e, dVar);
        w2Var.f23307b = obj;
        return w2Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<Object> tVar, t13.d<? super Unit> dVar) {
        return ((w2) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        final q53.t tVar = (q53.t) this.f23307b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f23306a;
        if (i14 == 0) {
            o13.r.b(obj);
            final e23.a<Object> aVar2 = this.f23308c;
            tVar.i(aVar2.invoke());
            final String str = this.f23310e;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: c22.v2
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    if (p005kotlin.jvm.internal.s.g(str2, str)) {
                        tVar.i(aVar2.invoke());
                    }
                }
            };
            f12.l lVar = this.f23309d;
            lVar.u3(onSharedPreferenceChangeListener);
            bb0.d dVar = new bb0.d(17, lVar, onSharedPreferenceChangeListener);
            this.f23307b = null;
            this.f23306a = 1;
            if (q53.r.a(tVar, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
