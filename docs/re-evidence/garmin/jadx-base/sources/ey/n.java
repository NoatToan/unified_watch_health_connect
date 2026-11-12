package ey;

import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Ley/n;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Office365SettingDTO f67102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMCalendarActivity f67103b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67104a;

        static {
            int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f67104a = iArr;
        }
    }

    public n(GCMCalendarActivity gCMCalendarActivity) {
        this.f67103b = gCMCalendarActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        boolean z14;
        cVar.getClass();
        GCMCalendarActivity gCMCalendarActivity = this.f67103b;
        gCMCalendarActivity.f31079p--;
        if (a.f67104a[cVar.ordinal()] == 1) {
            Office365SettingDTO office365SettingDTO = this.f67102a;
            office365SettingDTO.getClass();
            z14 = office365SettingDTO.f43515e;
        } else {
            z14 = false;
        }
        gCMCalendarActivity.A = z14;
        if (gCMCalendarActivity.isFinishing()) {
            return;
        }
        gCMCalendarActivity.invalidateOptionsMenu();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        this.f67102a = (Office365SettingDTO) obj;
    }
}
