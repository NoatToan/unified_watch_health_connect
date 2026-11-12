package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7163c;

    public /* synthetic */ d(int i14, Object obj, Object obj2) {
        this.f7161a = i14;
        this.f7162b = obj;
        this.f7163c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f7161a;
        Object obj = this.f7163c;
        Object obj2 = this.f7162b;
        switch (i14) {
            case 0:
                q0.d dVar = (q0.d) obj;
                int i15 = e.f7171h;
                dVar.getClass();
                ((e) obj2).a(dVar);
                break;
            default:
                e.g gVar = (e.g) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                gVar.getClass();
                viewGroup.getClass();
                Iterator<T> it = gVar.f7190c.iterator();
                while (it.hasNext()) {
                    q0.d dVar2 = ((e.h) it.next()).f7189a;
                    View view2 = dVar2.f7335c.getView();
                    if (view2 != null) {
                        dVar2.f7333a.a(view2, viewGroup);
                    }
                }
                break;
        }
    }
}
