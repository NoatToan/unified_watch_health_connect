package j50;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f97052a;

    public d(Comparator comparator) {
        this.f97052a = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        String str = ((com.garmin.android.apps.connectmobile.courses.model.d) t7).courseName;
        if (str == null) {
            str = "";
        }
        String str2 = ((com.garmin.android.apps.connectmobile.courses.model.d) t14).courseName;
        return this.f97052a.compare(str, str2 != null ? str2 : "");
    }
}
