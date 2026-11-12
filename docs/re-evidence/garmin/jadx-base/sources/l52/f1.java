package l52;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.i0) t7).getDisplayOrder()), Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.i0) t14).getDisplayOrder()));
    }
}
