package defpackage;

import android.view.MotionEvent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class xjp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xjp f39196b = new xjp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<a> f39197a = new CopyOnWriteArrayList<>();

    public interface a {
        void a(MotionEvent motionEvent);
    }

    public static xjp b() {
        return f39196b;
    }

    public void a(MotionEvent motionEvent) {
        Iterator<a> it = this.f39197a.iterator();
        while (it.hasNext()) {
            it.next().a(motionEvent);
        }
    }

    public void c(a aVar) {
        if (aVar != null) {
            this.f39197a.add(aVar);
        }
    }

    public void d(a aVar) {
        if (this.f39197a.contains(aVar)) {
            this.f39197a.remove(aVar);
        }
    }
}
