package un1;

import android.content.Context;
import android.database.DataSetObservable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f172056b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<T> f172055a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSetObservable f172057c = new DataSetObservable();

    public f(Context context) {
        this.f172056b = context;
    }

    public final void a(T t7) {
        this.f172055a.add(t7);
        this.f172057c.notifyChanged();
    }
}
