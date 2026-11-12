package i3;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend")
public final class de extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b<Float, s1.n> f87884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f87885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f87886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f87887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(s1.b<Float, s1.n> bVar, boolean z14, s1.k<Float> kVar, e23.a<Unit> aVar, t13.d<? super de> dVar) {
        super(2, dVar);
        this.f87884b = bVar;
        this.f87885c = z14;
        this.f87886d = kVar;
        this.f87887e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new de(this.f87884b, this.f87885c, this.f87886d, this.f87887e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((de) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        de deVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87883a;
        if (i14 == 0) {
            o13.r.b(obj);
            Float f14 = new Float(this.f87885c ? 1.0f : 0.0f);
            this.f87883a = 1;
            deVar = this;
            if (s1.b.c(this.f87884b, f14, this.f87886d, null, deVar, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            deVar = this;
        }
        deVar.f87887e.invoke();
        return Unit.INSTANCE;
    }
}
