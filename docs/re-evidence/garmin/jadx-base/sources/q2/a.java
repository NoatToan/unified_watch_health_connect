package q2;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f142147b;

    public /* synthetic */ a(d dVar, int i14) {
        this.f142146a = i14;
        this.f142147b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f142146a) {
            case 0:
                e23.a aVar = (e23.a) obj;
                View view2 = this.f142147b.f142154a;
                Handler handler = view2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = view2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new com.garmin.android.music.c(aVar, 8));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ActionMode actionMode = this.f142147b.f142161h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.INSTANCE;
            case 2:
                ActionMode actionMode2 = this.f142147b.f142161h;
                if (actionMode2 != null) {
                    v.f142196a.getClass();
                    w.f142197a.getClass();
                    actionMode2.invalidateContentRect();
                }
                return Unit.INSTANCE;
            default:
                d dVar = this.f142147b;
                f4.v vVar = dVar.f142158e;
                vVar.getClass();
                f4.f.a aVar2 = f4.f.f68735e;
                dh1.a aVar3 = vVar.f68816d;
                aVar2.getClass();
                vVar.f68820h = f4.f.a.d(aVar3);
                return new f(dVar);
        }
    }
}
