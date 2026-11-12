package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.template.data.PageDataObserver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class wpq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wpq f52324b = new wpq();
    private final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52325c = false;
    private final ConcurrentHashMap<Integer, Vector<PageDataObserver>> d = new ConcurrentHashMap<>();

    private wpq() {
    }

    public static wpq a() {
        return f52324b;
    }

    public void d(int i, PageDataObserver pageDataObserver) {
        synchronized (this) {
            try {
                if (pageDataObserver == null) {
                    LogUtil.e("PageDataObservable", "addObserver : observer is null");
                    return;
                }
                Vector<PageDataObserver> vector = this.d.get(Integer.valueOf(i));
                if (vector == null) {
                    vector = new Vector<>();
                    this.d.putIfAbsent(Integer.valueOf(i), vector);
                }
                if (!vector.contains(pageDataObserver)) {
                    vector.addElement(pageDataObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(PageDataObserver pageDataObserver) {
        synchronized (this) {
            Iterator<Map.Entry<Integer, Vector<PageDataObserver>>> it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Vector<PageDataObserver> value = it.next().getValue();
                if (value != null) {
                    value.removeElement(pageDataObserver);
                }
                if (njy.e(value)) {
                    it.remove();
                }
            }
        }
    }

    public void a(int i, List<dlo> list) {
        synchronized (this.e) {
            if (d()) {
                Vector<PageDataObserver> vector = this.d.get(Integer.valueOf(i));
                if (vector == null) {
                    return;
                }
                List listAsList = Arrays.asList(vector.toArray());
                c();
                for (int size = listAsList.size() - 1; size >= 0; size--) {
                    if (listAsList.get(size) instanceof PageDataObserver) {
                        ((PageDataObserver) listAsList.get(size)).update(this, list);
                    }
                }
            }
        }
    }

    protected void b() {
        synchronized (this) {
            this.f52325c = true;
        }
    }

    public boolean d() {
        boolean z;
        synchronized (this) {
            z = this.f52325c;
        }
        return z;
    }

    protected void c() {
        synchronized (this) {
            this.f52325c = false;
        }
    }
}
