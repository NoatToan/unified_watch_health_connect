package s2;

import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
public final class c extends i implements l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f155999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f156000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, b.a aVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f155999b = bVar;
        this.f156000c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f155999b, this.f156000c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b.a aVar = this.f156000c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155998a;
        b bVar = this.f155999b;
        try {
            if (i14 == 0) {
                r.b(obj);
                bVar.f155995c.setValue(aVar);
                this.f155998a = 1;
                Object objG = aVar.f155997b.g(this);
                if (objG != aVar2) {
                    objG = Unit.INSTANCE;
                }
                if (objG == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            bVar.f155995c.setValue(null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            bVar.f155995c.setValue(null);
            throw th3;
        }
    }
}
