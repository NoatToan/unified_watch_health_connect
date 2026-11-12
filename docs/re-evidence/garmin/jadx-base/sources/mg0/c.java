package mg0;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.c) t7).getLegIndex()), Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.c) t14).getLegIndex()));
    }
}
