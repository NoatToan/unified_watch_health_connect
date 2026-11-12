package d80;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<E> extends androidx.loader.content.a<List<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<E> f58250a;

    public a(Context context) {
        super(context);
        this.f58250a = null;
    }

    public abstract ArrayList a();

    @Override // androidx.loader.content.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void deliverResult(List<E> list) {
        if (isReset()) {
            if (list == null || list.size() <= 0) {
                return;
            }
            list.clear();
            return;
        }
        List<E> list2 = this.f58250a;
        this.f58250a = list;
        if (isStarted()) {
            super.deliverResult(list);
        }
        if (list2 == null || list2 == list || list2.size() <= 0 || list2.size() <= 0) {
            return;
        }
        list2.clear();
    }

    @Override // androidx.loader.content.a
    public final Object loadInBackground() {
        return a();
    }

    @Override // androidx.loader.content.a
    public final void onCanceled(Object obj) {
        List list = (List) obj;
        if (list == null || list.size() <= 0 || list.size() <= 0) {
            return;
        }
        list.clear();
    }

    @Override // androidx.loader.content.b
    public final void onReset() {
        super.onReset();
        cancelLoad();
        this.f58250a = null;
    }

    @Override // androidx.loader.content.b
    public final void onStartLoading() {
        List<E> list;
        List<E> list2 = this.f58250a;
        if (list2 != null) {
            deliverResult(list2);
        }
        if (takeContentChanged() || (list = this.f58250a) == null || list.size() == 0) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.b
    public final void onStopLoading() {
        cancelLoad();
    }
}
