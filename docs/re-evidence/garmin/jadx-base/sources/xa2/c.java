package xa2;

import android.app.Dialog;
import androidx.fragment.app.m;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.views.ReportsDownloadingFragment$showExitWarning$1", f = "ReportsDownloadingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f189840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dialog f189841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Dialog dialog, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f189840a = aVar;
        this.f189841b = dialog;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f189840a, this.f189841b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        a aVar2 = this.f189840a;
        aVar2.f189834d = true;
        a.f189830i.getClass();
        if (aVar2.getActivity() != null) {
            m activity = aVar2.getActivity();
            activity.getClass();
            if (((ya2.a) activity).O9()) {
                this.f189841b.show();
            }
        }
        return Unit.INSTANCE;
    }
}
