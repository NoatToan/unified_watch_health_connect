package p90;

import android.content.SharedPreferences;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.CheckCtkdDualPairFailureUseCase$isCtkdDualPairFailure$2$connected$1", f = "CheckCtkdDualPairFailureUseCase.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f136547b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f136548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f136549b;

        public a(k kVar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            this.f136548a = kVar;
            this.f136549b = onSharedPreferenceChangeListener;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f136548a.f136540b.r(this.f136549b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f136550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.j<Unit> f136551b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(k kVar, o53.j<? super Unit> jVar) {
            this.f136550a = kVar;
            this.f136551b = jVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str != null) {
                this.f136550a.f136540b.getClass();
                if (str.equalsIgnoreCase("keyCtkdRegisterConnect")) {
                    int i14 = o13.q.f128596b;
                    this.f136551b.resumeWith(Unit.INSTANCE);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f136547b = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f136547b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136546a;
        if (i14 == 0) {
            r.b(obj);
            this.f136546a = 1;
            o53.k kVar = new o53.k(u13.f.b(this), 1);
            kVar.q();
            k kVar2 = this.f136547b;
            b bVar = new b(kVar2, kVar);
            kVar2.f136540b.g(bVar);
            kVar.r(new a(kVar2, bVar));
            if (kVar.p() == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
