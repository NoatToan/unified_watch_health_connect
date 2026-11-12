package fd0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfd0/d;", "", "", "actionbarTitleResourceID", "", "notConnectedCompatibleDisableAllItems", "groupByCompatible", "<init>", "(Ljava/lang/String;IIZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    LIVETRACK(R.string.title_live_track, false, false),
    LIVE_EVENT_SHARING(R.string.live_event_sharing_title, false, false),
    WORKOUTS(R.string.lbl_send_to_device, false, true),
    COURSES(R.string.concept_courses, true, true),
    SEGMENTS(R.string.card_segments_title, true, false),
    CALENDARS(R.string.startup_select_your_device, true, false),
    PACEPRO(R.string.pacepro_title, true, true),
    POWER_GUIDE(R.string.power_guide_title, true, true),
    ACTIVITY_TO_COURSE(R.string.lbl_send_to_device, true, true),
    GROUP_RIDE(R.string.lbl_send_to_device, true, true),
    TRAILS(R.string.lbl_send_to_device, true, true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f70469c;

    d(int i14, boolean z14, boolean z15) {
        this.f70467a = i14;
        this.f70468b = z14;
        this.f70469c = z15;
    }
}
