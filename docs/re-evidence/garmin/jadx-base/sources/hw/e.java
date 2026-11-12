package hw;

import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fr1.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhw/e;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lfr1/h;", "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "stravaStatusDTO", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends com.garmin.android.library.backgroundtaskmanagement.b<h> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StravaStatusDTO f85935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StravaStatusDTO stravaStatusDTO, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        stravaStatusDTO.getClass();
        aVar.getClass();
        this.f85935l = stravaStatusDTO;
        b(new d(this));
    }
}
