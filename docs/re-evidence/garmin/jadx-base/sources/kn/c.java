package kn;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        return r13.a.b(gl1.d.i((ActivityListItemDTO) t7), gl1.d.i((ActivityListItemDTO) t14));
    }
}
