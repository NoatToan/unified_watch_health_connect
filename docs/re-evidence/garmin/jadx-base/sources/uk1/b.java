package uk1;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luk1/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.b<List<? extends PowerZonesDTO>> {
    public b(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, j0.f134944a);
        b(new a(this));
    }
}
