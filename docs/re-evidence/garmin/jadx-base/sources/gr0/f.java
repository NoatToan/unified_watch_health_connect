package gr0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgr0/f;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lnr0/a;", "", "fetchSteps", "fetchFloors", "fetchIntensityMinutes", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ZZZLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.library.backgroundtaskmanagement.b<nr0.a> {
    public f(boolean z14, boolean z15, boolean z16, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new nr0.a());
        ArrayList arrayList = new ArrayList();
        if (z14) {
            arrayList.add(new d(this));
        }
        if (z15 || z16) {
            arrayList.add(new e(this));
        }
        c(arrayList);
    }
}
