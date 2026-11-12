package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc53/l;", "Landroid/view/View;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend", v = 1)
public final class b1 extends v13.h implements e23.p<c53.l<? super View>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(View view2, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f6406c = view2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b1 b1Var = new b1(this.f6406c, dVar);
        b1Var.f6405b = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(c53.l<? super View> lVar, t13.d<? super Unit> dVar) {
        return ((b1) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c53.l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f6404a;
        View view2 = this.f6406c;
        if (i14 == 0) {
            o13.r.b(obj);
            lVar = (c53.l) this.f6405b;
            this.f6405b = lVar;
            this.f6404a = 1;
            if (lVar.a(view2, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            lVar = (c53.l) this.f6405b;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (view2 instanceof ViewGroup) {
            a1 a1Var = new a1((ViewGroup) view2);
            this.f6405b = null;
            this.f6404a = 2;
            lVar.getClass();
            Object objB = lVar.b(a1Var.iterator(), this);
            if (objB != aVar) {
                objB = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
