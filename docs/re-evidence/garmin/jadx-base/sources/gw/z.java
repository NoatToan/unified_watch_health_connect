package gw;

import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgw/z;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "office365SettingDTO", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends com.garmin.android.library.backgroundtaskmanagement.b<Office365SettingDTO> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Office365SettingDTO f79556l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Office365SettingDTO office365SettingDTO, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        office365SettingDTO.getClass();
        this.f79556l = office365SettingDTO;
        b(new y(this));
    }
}
