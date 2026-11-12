package nf0;

import androidx.fragment.app.Fragment;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.EcgFragmentExtensionsKt$showNoInternetDialog$1", f = "EcgFragmentExtensions.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0 f125771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f125772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var, Fragment fragment, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125771a = o0Var;
            this.f125772b = fragment;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125771a, this.f125772b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f125771a.show(this.f125772b.getChildFragmentManager(), (String) null);
            return Unit.INSTANCE;
        }
    }

    public static final void a(Fragment fragment, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        fragment.getClass();
        o0.a aVar3 = o0.f149771c;
        String string = fragment.getString(R.string.common_network_reachability_error);
        String string2 = fragment.getString(R.string.msg_setup_no_internet_connection);
        q1 q1Var = new q1(aVar, 11);
        q1 q1Var2 = new q1(aVar2, 12);
        aVar3.getClass();
        f0.w(fragment).b(new a(o0.a.a(string, string2, R.string.lbl_retry, q1Var, R.string.lbl_exit_setup_capitalized, q1Var2), fragment, null));
    }
}
