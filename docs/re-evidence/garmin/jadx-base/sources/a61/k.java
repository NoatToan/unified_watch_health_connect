package a61;

import com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StrengthStatsActivity f1618a;

    public k(StrengthStatsActivity strengthStatsActivity) {
        this.f1618a = strengthStatsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        n71.g f136309a = ((StrengthStatsActivity.b) t7).f39820a.getF136309a();
        StrengthStatsActivity strengthStatsActivity = this.f1618a;
        return r13.a.b(n71.h.a(strengthStatsActivity, f136309a), n71.h.a(strengthStatsActivity, ((StrengthStatsActivity.b) t14).f39820a.getF136309a()));
    }
}
