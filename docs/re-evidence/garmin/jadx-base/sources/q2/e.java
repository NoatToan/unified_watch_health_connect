package q2;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {181}, m = "invokeSuspend", v = 1)
public final class e extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f142170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2.e f142171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, s2.e eVar, t13.d<? super e> dVar2) {
        super(1, dVar2);
        this.f142170b = dVar;
        this.f142171c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f142170b, this.f142171c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        n nVarInvoke;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142169a;
        d dVar = this.f142170b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                d.b bVar = new d.b();
                dVar.getClass();
                View view2 = dVar.f142154a;
                s2.e eVar = this.f142171c;
                n aVar2 = new d.a(bVar, new b(dVar, eVar, 0), new b(dVar, eVar, 1), view2);
                e23.l<n, n> lVar = dVar.f142155b;
                if (lVar != null && (nVarInvoke = lVar.invoke(aVar2)) != null) {
                    aVar2 = nVarInvoke;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = view2.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    fh2.a aVar3 = dVar.f142162i;
                    if (aVar3 == null) {
                        aVar3 = new fh2.a(dVar, 22, aVar2, bVar);
                        dVar.f142162i = aVar3;
                    }
                    view2.post(aVar3);
                } else {
                    v.f142196a.getClass();
                    w wVar = w.f142197a;
                    k kVar = new k(aVar2);
                    wVar.getClass();
                    ActionMode actionModeStartActionMode = view2.startActionMode(kVar, 1);
                    if (actionModeStartActionMode == null) {
                        return Unit.INSTANCE;
                    }
                    dVar.f142161h = actionModeStartActionMode;
                }
                this.f142169a = 1;
                Object objG = bVar.f142168a.g(this);
                if (objG != aVar) {
                    objG = Unit.INSTANCE;
                }
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            f4.v vVar = dVar.f142158e;
            View view3 = dVar.f142154a;
            vVar.a();
            Looper looperMyLooper2 = Looper.myLooper();
            Handler handler2 = view3.getHandler();
            if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                Runnable gVar = dVar.f142163j;
                if (gVar == null) {
                    gVar = new po.g(dVar, 3);
                    dVar.f142163j = gVar;
                }
                view3.post(gVar);
            } else {
                ActionMode actionMode = dVar.f142161h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            fh2.a aVar4 = dVar.f142162i;
            if (aVar4 != null) {
                view3.removeCallbacks(aVar4);
            }
            dVar.f142161h = null;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            f4.v vVar2 = dVar.f142158e;
            View view4 = dVar.f142154a;
            vVar2.a();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = view4.getHandler();
            if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                Runnable gVar2 = dVar.f142163j;
                if (gVar2 == null) {
                    gVar2 = new po.g(dVar, 3);
                    dVar.f142163j = gVar2;
                }
                view4.post(gVar2);
            } else {
                ActionMode actionMode2 = dVar.f142161h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            fh2.a aVar5 = dVar.f142162i;
            if (aVar5 != null) {
                view4.removeCallbacks(aVar5);
            }
            dVar.f142161h = null;
            throw th3;
        }
    }
}
