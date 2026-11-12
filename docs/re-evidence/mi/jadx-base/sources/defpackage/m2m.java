package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.uimanager.IllegalViewOperationException;

/* JADX INFO: loaded from: classes4.dex */
public class m2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<oej> f25685a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f25686b = new SparseBooleanArray();
    public final tem c = new tem();

    public void a(oej oejVar) {
        this.c.a();
        this.f25685a.put(oejVar.getReactTag(), oejVar);
    }

    public void b(oej oejVar) {
        this.c.a();
        int reactTag = oejVar.getReactTag();
        this.f25685a.put(reactTag, oejVar);
        this.f25686b.put(reactTag, true);
    }

    public oej c(int i) {
        this.c.a();
        return this.f25685a.get(i);
    }

    public int d() {
        this.c.a();
        return this.f25686b.size();
    }

    public int e(int i) {
        this.c.a();
        return this.f25686b.keyAt(i);
    }

    public boolean f(int i) {
        this.c.a();
        return this.f25686b.get(i);
    }

    public void g(int i) {
        this.c.a();
        if (!this.f25686b.get(i)) {
            this.f25685a.remove(i);
            return;
        }
        throw new IllegalViewOperationException("Trying to remove root node " + i + " without using removeRootNode!");
    }

    public void h(int i) {
        this.c.a();
        if (i == -1) {
            return;
        }
        if (this.f25686b.get(i)) {
            this.f25685a.remove(i);
            this.f25686b.delete(i);
        } else {
            throw new IllegalViewOperationException("View with tag " + i + " is not registered as a root view");
        }
    }
}
