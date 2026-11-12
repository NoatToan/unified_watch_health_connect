package com.xiaomi.hm.health.play;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.smalltool.model.Tool;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/play/PlayToolsManager;", "", "", "Lcom/xiaomi/hm/health/play/PlayTool;", "a", "Ljava/util/List;", "getIntelligenceToolList", "()Ljava/util/List;", "intelligenceToolList", "b", "getHealthToolList", "healthToolList", "c", "getSportToolList", "sportToolList", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayToolsManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<PlayTool> intelligenceToolList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<PlayTool> healthToolList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<PlayTool> sportToolList;

    public PlayToolsManager() {
        Tool tool = Tool.EDIT_CARD;
        this.intelligenceToolList = CollectionsKt__CollectionsKt.listOf((Object[]) new PlayTool[]{new PlayTool(Tool.WATCHFACE_SETTING, Integer.valueOf(R.string.wf_home_tab_name_1), Integer.valueOf(R.drawable.play_icon_watch_face), 0, R.string.navi_func_watchface_setting_brief_desc, false, true, false, 168, null), new PlayTool(Tool.APP_ALERT, Integer.valueOf(R.string.app_notification_alert), Integer.valueOf(R.drawable.play_icon_notify), 0, 0, false, false, false, 248, null), new PlayTool(Tool.FIND_DEVICE, Integer.valueOf(R.string.small_tool_item_find_device), Integer.valueOf(R.drawable.play_icon_find_device), R.string.play_tool_find_sub_title, R.string.play_tool_find_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.ALARM, Integer.valueOf(R.string.small_tool_item_alarm), Integer.valueOf(R.drawable.play_icon_alarm_clock), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.REMINDER, Integer.valueOf(R.string.small_tool_item_reminder), Integer.valueOf(R.drawable.play_icon_reminder), 0, R.string.play_tool_not_event_reminder, false, true, false, 168, null), new PlayTool(Tool.CUSTOM_VIBRATE, Integer.valueOf(R.string.tool_custom_vibrate), Integer.valueOf(R.drawable.play_icon_vibration), R.string.play_tool_vibrate_sub_title, R.string.play_tool_vibrate_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.ASSISTANT, Integer.valueOf(R.string.small_tool_item_assistant), Integer.valueOf(R.drawable.play_icon_assistant), 0, R.string.play_tool_assistant_subtitle, false, true, false, 168, null), new PlayTool(Tool.WIDGET_MANAGER, Integer.valueOf(R.string.tool_manager_little_part), Integer.valueOf(R.drawable.play_icon_widget), R.string.play_tool_widget_sub_title, R.string.play_tool_widget_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.SPORT_HELP, Integer.valueOf(R.string.tool_sport_help), Integer.valueOf(R.drawable.play_icon_sport_assist), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.BAND_APPS_SETTING, Integer.valueOf(R.string.setting_peyto_apps_title_device), Integer.valueOf(R.drawable.play_icon_device_setting), R.string.play_tool_setting_sub_title, R.string.play_tool_setting_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.NFC_WALLET, Integer.valueOf(R.string.small_tool_item_nfc_wallet), Integer.valueOf(R.drawable.play_icon_nfc), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.SHORTCUTS_SETTING, Integer.valueOf(R.string.setting_shotcut_apps_title), Integer.valueOf(R.drawable.play_icon_shortcut), R.string.play_tool_shortcut_sub_title, R.string.play_tool_shortcut_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.WORLD_CLOCK, Integer.valueOf(R.string.app_sort_world_clock), Integer.valueOf(R.drawable.play_icon_world_clock), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.XIMALAYA, Integer.valueOf(R.string.small_tool_item_ximalaya), Integer.valueOf(R.drawable.play_icon_ximalaya), R.string.play_tool_ximalaya_sub_title, R.string.play_tool_ximalaya_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.CALL_ALERT, Integer.valueOf(R.string.incoming_call_alert), Integer.valueOf(R.drawable.play_icon_call_alert), 0, 0, false, false, false, 248, null), new PlayTool(Tool.UNLOCK_SCRENN, Integer.valueOf(R.string.unlock_screen), Integer.valueOf(R.drawable.play_icon_screen_unlock), R.string.play_tool_unlock_sub_title, R.string.play_tool_unlock_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.OFFLINE_VOICE_COMD, Integer.valueOf(R.string.offline_voice_cmd_new), Integer.valueOf(R.drawable.play_icon_offline_voice), R.string.play_tool_voice_sub_title, R.string.play_tool_voice_sub_long_title, false, false, false, 224, null), new PlayTool(Tool.TODO_LIST, Integer.valueOf(R.string.device_todo), Integer.valueOf(R.drawable.play_icon_todo), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(tool, null, null, 0, 0, false, true, false, 190, null)});
        this.healthToolList = CollectionsKt__CollectionsKt.listOf((Object[]) new PlayTool[]{new PlayTool(Tool.SNORE_MONITOR, Integer.valueOf(R.string.small_tool_item_snore_monitor), Integer.valueOf(R.drawable.ic_tool_snore_monitor_24), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.TRAINING_BREATHE, Integer.valueOf(R.string.app_sort_breath_train), Integer.valueOf(R.drawable.ic_tool_breathe_training_24), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.SPORT_WALK, Integer.valueOf(R.string.small_tool_item_sport_walk), Integer.valueOf(R.drawable.ic_play_icon_walk_24), R.string.play_tool_walk_go, R.string.play_tool_walk_no_data, false, true, false, 160, null), new PlayTool(Tool.SPORT_RUN, Integer.valueOf(R.string.small_tool_item_sport_run), Integer.valueOf(R.drawable.ic_play_icon_run_24), R.string.play_tool_run_go, R.string.play_tool_run_no_data, false, true, false, 160, null), new PlayTool(Tool.SPORT_BIKE, Integer.valueOf(R.string.small_tool_item_sport_bike), Integer.valueOf(R.drawable.ic_play_icon_bike_24), R.string.play_tool_bike_go, R.string.play_tool_bike_no_data, false, true, false, 160, null), new PlayTool(Tool.TARGET_SETTING, Integer.valueOf(R.string.small_tool_item_target_setting), Integer.valueOf(R.drawable.ic_tool_target_setting_24), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(Tool.FRIENT, Integer.valueOf(R.string.mine_item_friends), Integer.valueOf(R.drawable.ic_tool_friends_24), 0, 0, false, true, false, DataTypeSource.SPORT_TYPE_BOULDERING, null), new PlayTool(tool, null, null, 0, 0, false, true, false, 190, null)});
        this.sportToolList = CollectionsKt__CollectionsKt.listOf((Object[]) new PlayTool[]{new PlayTool(Tool.EXERCISE_PLAN, null, null, 0, 0, false, true, false, 190, null), new PlayTool(Tool.ATTEND_COURSE, null, null, 0, 0, false, true, false, 190, null)});
    }

    @NotNull
    public final List<PlayTool> getHealthToolList() {
        return this.healthToolList;
    }

    @NotNull
    public final List<PlayTool> getIntelligenceToolList() {
        return this.intelligenceToolList;
    }

    @NotNull
    public final List<PlayTool> getSportToolList() {
        return this.sportToolList;
    }
}
