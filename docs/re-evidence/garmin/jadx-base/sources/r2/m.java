package r2;

import com.google.mlkit.common.MlKitException;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 208, 208}, m = "invokeSuspend", v = 1)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f149452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f149454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.f f149455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, s2.f fVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f149454c = nVar;
        this.f149455d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f149454c, this.f149455d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r8.invoke(r7) == r0) goto L37;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th3;
        e23.l<? super t13.d<? super Unit>, ? extends Object> lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f149453b;
        n nVar = this.f149454c;
        try {
            if (i14 == 0) {
                r.b(obj);
                e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2 = nVar.f149457d;
                if (lVar2 != null) {
                    this.f149453b = 1;
                    if (lVar2.invoke(this) == aVar) {
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
                lVar = nVar.f149458e;
                if (lVar != null) {
                    this.f149453b = 3;
                }
            } else {
                if (i14 != 3) {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th3 = this.f149452a;
                    r.b(obj);
                    throw th3;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            s2.f fVar = this.f149455d;
            this.f149453b = 2;
            if (fVar.a(nVar, this) != aVar) {
                lVar = nVar.f149458e;
                if (lVar != null) {
                    this.f149453b = 3;
                }
                return Unit.INSTANCE;
            }
        } catch (Throwable th4) {
            e23.l<? super t13.d<? super Unit>, ? extends Object> lVar3 = nVar.f149458e;
            if (lVar3 == null) {
                throw th4;
            }
            this.f149452a = th4;
            this.f149453b = 4;
            if (lVar3.invoke(this) != aVar) {
                th3 = th4;
            }
            return aVar;
        }
        return aVar;
    }
}
