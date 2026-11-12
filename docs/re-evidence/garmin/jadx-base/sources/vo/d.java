package vo;

import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        i0 i0Var = ((h) t7).f29460m;
        Long lValueOf = Long.valueOf(i0Var != null ? i0Var.f29492c : 0L);
        i0 i0Var2 = ((h) t14).f29460m;
        return r13.a.b(lValueOf, Long.valueOf(i0Var2 != null ? i0Var2.f29492c : 0L));
    }
}
