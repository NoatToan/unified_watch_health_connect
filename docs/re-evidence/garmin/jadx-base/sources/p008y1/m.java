package p008y1;

import com.google.android.gms.wallet.WalletConstants;
import e23.l;
import e23.p;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ly1/a;", "Ly1/w0;", "it", "", "<anonymous>", "(Ly1/a;Ly1/w0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend", v = 1)
public final class m extends i implements q<a, w0<Object>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ a f193413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<l<? super e0.b, Unit>, d<? super Unit>, Object> f193414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<Object> f193415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(p<? super l<? super e0.b, Unit>, ? super d<? super Unit>, ? extends Object> pVar, p<Object> pVar2, d<? super m> dVar) {
        super(3, dVar);
        this.f193414c = pVar;
        this.f193415d = pVar2;
    }

    @Override // e23.q
    public final Object invoke(a aVar, w0<Object> w0Var, d<? super Unit> dVar) {
        m mVar = new m(this.f193414c, this.f193415d, dVar);
        mVar.f193413b = aVar;
        return mVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193412a;
        if (i14 == 0) {
            r.b(obj);
            l lVar = new l(this.f193415d, this.f193413b, 1);
            this.f193412a = 1;
            if (this.f193414c.invoke(lVar, this) == aVar) {
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
