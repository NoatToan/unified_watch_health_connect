package com.xiaomi.fitness.util;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/util/MineOneTrack;", "", "<init>", "()V", "trackPersonalCenter", "", "trackPersonalMedal", "trackActivities", "trackMyCourse", "trackMyOrder", "trackMyFamily", "trackLittleHabits", "trackCompetition", "trackSportsWeekly", "trackMedal", "trackOnlineConsultation", "trackSettingsAppSetClick", "trackSettingsDataManagerClick", "trackSettingsAuthorizationManagementClick", "trackSettingsSystemPermissionsClick", "trackSettingsFeedbackClick", "trackSettingsUpdateClick", "trackSettingsAboutClick", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineOneTrack {

    @NotNull
    public static final MineOneTrack INSTANCE = new MineOneTrack();

    private MineOneTrack() {
    }

    public final void trackActivities() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_my_activities")));
    }

    public final void trackCompetition() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_competition")));
    }

    public final void trackLittleHabits() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_little_habits")));
    }

    public final void trackMedal() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_medal")));
    }

    public final void trackMyCourse() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_my_course")));
    }

    public final void trackMyFamily() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_my_family")));
    }

    public final void trackMyOrder() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_my_order")));
    }

    public final void trackOnlineConsultation() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_online_consultation")));
    }

    public final void trackPersonalCenter() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_personal_center")));
    }

    public final void trackPersonalMedal() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_center_medal")));
    }

    public final void trackSettingsAboutClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_about")));
    }

    public final void trackSettingsAppSetClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_app_set_up")));
    }

    public final void trackSettingsAuthorizationManagementClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_device_authorization_management")));
    }

    public final void trackSettingsDataManagerClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_tripartite_data_management")));
    }

    public final void trackSettingsFeedbackClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_help_and_feedback")));
    }

    public final void trackSettingsSystemPermissionsClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_system_permissions")));
    }

    public final void trackSettingsUpdateClick() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36276"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_update")));
    }

    public final void trackSportsWeekly() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_sports_weekly")));
    }
}
