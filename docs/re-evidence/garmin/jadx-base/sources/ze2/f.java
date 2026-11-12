package ze2;

import android.content.Intent;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$sendResultToCaller$2", f = "AbstractMFAFlowActivity.kt", l = {}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f204284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.android.library.mobileauth.ui.mfa.a aVar, int i14, Intent intent, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f204282a = aVar;
        this.f204283b = i14;
        this.f204284c = intent;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f204282a, this.f204283b, this.f204284c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        int i14 = this.f204283b;
        Intent intent = this.f204284c;
        com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = this.f204282a;
        aVar2.setResult(i14, intent);
        aVar2.finish();
        return Unit.INSTANCE;
    }
}
