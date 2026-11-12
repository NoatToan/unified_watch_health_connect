package hw;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fr1.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhw/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lfr1/h;", "", "shouldExecuteCompatibilityTask", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ZLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.library.backgroundtaskmanagement.b<h> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f85929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f85930m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        aVar.getClass();
        this.f85929l = z14;
        this.f85930m = new h();
        b(new a(this));
    }
}
