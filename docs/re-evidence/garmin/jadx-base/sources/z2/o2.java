package z2;

import kotlin.q3;
import kotlin.s3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2", f = "TextFieldSelectionManager.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class o2 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f201735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(h2 h2Var, t13.d<? super o2> dVar) {
        super(1, dVar);
        this.f201735a = h2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o2(this.f201735a, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((o2) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        h2 h2Var = this.f201735a;
        h2Var.getClass();
        if (u1.g0.f167495b) {
            z14 = h2Var.C;
        } else {
            q3 q3Var = h2Var.f201614k;
            z14 = (q3Var != null ? q3Var.getF91379d() : null) == s3.Shown;
        }
        h2Var.j(z14);
        return Unit.INSTANCE;
    }
}
