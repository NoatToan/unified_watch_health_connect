package p008y1;

import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend", v = 1)
public final class b3 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f193109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f193110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(a3 a3Var, long j8, d<? super b3> dVar) {
        super(2, dVar);
        this.f193109b = a3Var;
        this.f193110c = j8;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b3(this.f193109b, this.f193110c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193108a;
        if (i14 == 0) {
            r.b(obj);
            h3 h3Var = this.f193109b.C;
            this.f193108a = 1;
            if (h3Var.d(this.f193110c, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
