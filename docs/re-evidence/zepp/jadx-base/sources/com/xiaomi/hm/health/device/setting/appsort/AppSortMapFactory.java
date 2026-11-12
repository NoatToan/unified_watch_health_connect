package com.xiaomi.hm.health.device.setting.appsort;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\u00020\u000f8\u0004@\u0004X\u0084D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010%\u001a\u0004\u0018\u00010 8\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010,\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/AppSortMapFactory;", "", "Lorg/json/JSONObject;", "propertyJson", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/model/HMDisplaySetting;", "a", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", "createDisplaySettingFromJson", "createDisplayDefault", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "", "createItemNames", "createDrawables", "createColors", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Ljava/lang/Integer;", "getDefaultVersion", "()Ljava/lang/Integer;", "defaultVersion", "c", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "getMigrator", "()Lcom/xiaomi/hm/health/device/setting/appsort/AppItemMigrator;", "migrator", "", "Lcom/xiaomi/hm/health/device/setting/appsort/PageItem;", "e", "Ljava/util/List;", "getDefaultItems", "()Ljava/util/List;", "defaultItems", "", "f", "Z", "useDefault", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class AppSortMapFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Integer defaultVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final AppItemMigrator migrator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final List<PageItem> defaultItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag = "AppSortMapFactory";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean useDefault = true;

    public AppSortMapFactory(@NotNull HMDeviceSource hMDeviceSource) {
        this.source = hMDeviceSource;
    }

    private final HMDisplaySetting a(JSONObject propertyJson, HMDeviceSource source) {
        return HMAppSortDataManager.fromJsonArray(-1, propertyJson.optJSONArray(String.valueOf(source.getValue())), source);
    }

    @NotNull
    public Map<Integer, Integer> createColors(@NotNull Context context) {
        HashMap map = new HashMap();
        List<PageItem> defaultItems = getDefaultItems();
        if (defaultItems != null) {
            for (PageItem pageItem : defaultItems) {
                Integer colorId = pageItem.getColorId();
                if (colorId != null) {
                    map.put(Integer.valueOf(pageItem.getType()), Integer.valueOf(colorId.intValue()));
                }
            }
        }
        return map;
    }

    @NotNull
    public SortableAppItems createDisplayDefault() {
        SparseArray sparseArray = new SparseArray();
        List<PageItem> defaultItems = getDefaultItems();
        if (defaultItems != null) {
            for (PageItem pageItem : defaultItems) {
                sparseArray.put(pageItem.getType(), new com.xiaomi.hm.health.bt.model.appsort.AppItem(pageItem.getParent(), pageItem.getType(), defaultItems.indexOf(pageItem), pageItem.getEnable()));
            }
        }
        return new SortAppSetting(this.source, sparseArray);
    }

    @NotNull
    public SortableAppItems createDisplaySettingFromJson(@NotNull JSONObject propertyJson) {
        HMDisplaySetting hMDisplaySettingA = a(propertyJson, this.source);
        if (hMDisplaySettingA != null) {
            return hMDisplaySettingA;
        }
        this.useDefault = true;
        return createDisplayDefault();
    }

    @NotNull
    public Map<Integer, Integer> createDrawables(@NotNull Context context) {
        HashMap map = new HashMap();
        map.put(33, Integer.valueOf(R.drawable.app_sort_activity_goal_new));
        int i = R.drawable.app_sort_pai_new;
        map.put(25, Integer.valueOf(i));
        map.put(2, Integer.valueOf(R.drawable.app_sort_hr_new));
        map.put(3, Integer.valueOf(R.drawable.app_sort_sport_new));
        map.put(20, Integer.valueOf(R.drawable.app_sort_sport_record_new));
        map.put(35, Integer.valueOf(R.drawable.app_sort_sleep_new));
        map.put(28, Integer.valueOf(R.drawable.app_sort_pressure_new));
        map.put(36, Integer.valueOf(R.drawable.app_sort_spo2_new));
        map.put(29, Integer.valueOf(R.drawable.app_sort_menstruation_new));
        map.put(4, Integer.valueOf(R.drawable.app_sort_weather_new));
        map.put(11, Integer.valueOf(R.drawable.app_sort_music_new));
        map.put(9, Integer.valueOf(R.drawable.app_sort_alarm_new));
        map.put(37, Integer.valueOf(R.drawable.app_sort_phone_new));
        int i2 = R.drawable.app_sort_schedule_new;
        map.put(21, Integer.valueOf(i2));
        map.put(38, Integer.valueOf(i2));
        map.put(39, Integer.valueOf(R.drawable.app_sort_gallery_new));
        map.put(16, Integer.valueOf(R.drawable.app_sort_nfc_new));
        map.put(40, Integer.valueOf(R.drawable.app_sort_utils_new));
        map.put(19, Integer.valueOf(R.drawable.app_sort_settings_new));
        map.put(34, Integer.valueOf(R.drawable.app_sort_ecg_new));
        map.put(51, Integer.valueOf(R.drawable.app_sort_breath_exersise_new));
        int i3 = R.drawable.app_sort_netease_music_new;
        map.put(41, Integer.valueOf(i3));
        map.put(42, Integer.valueOf(i3));
        map.put(43, Integer.valueOf(i3));
        map.put(6, Integer.valueOf(R.drawable.app_sort_notification));
        map.put(30, Integer.valueOf(R.drawable.app_sort_sport_status));
        map.put(64, Integer.valueOf(R.drawable.app_sort_body_temperature));
        map.put(22, Integer.valueOf(R.drawable.app_sort_compass));
        map.put(65, Integer.valueOf(R.drawable.app_sort_barometer_altimeter));
        map.put(12, Integer.valueOf(R.drawable.app_sort_timer));
        map.put(13, Integer.valueOf(R.drawable.app_sort_countdown));
        map.put(14, Integer.valueOf(R.drawable.app_sort_find_phone));
        map.put(17, Integer.valueOf(R.drawable.app_sort_alipay));
        map.put(44, Integer.valueOf(R.drawable.app_sort_quenaer_new));
        map.put(45, Integer.valueOf(R.drawable.app_sort_weibo_new));
        map.put(46, Integer.valueOf(R.drawable.app_sort_ximalaya_new));
        map.put(47, Integer.valueOf(i3));
        map.put(58, Integer.valueOf(i));
        map.put(59, Integer.valueOf(i));
        map.put(61, Integer.valueOf(i));
        map.put(60, Integer.valueOf(R.drawable.app_sort_text_message));
        map.put(49, Integer.valueOf(R.drawable.app_sort_wechat_pay));
        List<PageItem> defaultItems = getDefaultItems();
        if (defaultItems != null) {
            for (PageItem pageItem : defaultItems) {
                Integer drawableId = pageItem.getDrawableId();
                if (drawableId != null) {
                    map.put(Integer.valueOf(pageItem.getType()), Integer.valueOf(drawableId.intValue()));
                }
            }
        }
        return map;
    }

    @NotNull
    public Map<Integer, String> createItemNames(@NotNull Context context) {
        HashMap map = new HashMap();
        map.put(1, context.getString(R.string.setting_app_status));
        map.put(33, context.getString(R.string.app_sort_activity_goal));
        map.put(25, context.getString(R.string.pai_name));
        map.put(2, context.getString(R.string.setting_app_hr));
        map.put(3, context.getString(R.string.setting_app_activities));
        map.put(20, context.getString(R.string.setting_app_sport_record));
        map.put(35, context.getString(R.string.app_sort_sleep));
        map.put(28, context.getString(R.string.app_sort_pressure));
        map.put(36, context.getString(R.string.bo_ui_spo2_name));
        map.put(29, context.getString(R.string.app_sort_menstruation));
        map.put(4, context.getString(R.string.setting_app_weather));
        map.put(11, context.getString(R.string.app_sort_music));
        map.put(9, context.getString(R.string.setting_app_alarm));
        map.put(37, context.getString(R.string.app_sort_phone));
        int i = R.string.app_sort_schedule;
        map.put(38, context.getString(i));
        map.put(21, context.getString(i));
        map.put(39, context.getString(R.string.app_sort_gallery));
        map.put(16, context.getString(R.string.app_sort_card_bag));
        map.put(40, context.getString(R.string.app_sort_tools));
        map.put(19, context.getString(R.string.setting_app_moreset));
        map.put(51, context.getString(R.string.sls_breathe_training));
        map.put(41, context.getString(R.string.app_sort_netease_music));
        int i2 = R.string.un_translate;
        map.put(42, context.getString(i2));
        map.put(43, context.getString(i2));
        map.put(44, context.getString(R.string.as_smart_qunaer));
        map.put(45, context.getString(R.string.weibo));
        map.put(46, context.getString(R.string.ximalaya));
        map.put(6, context.getString(R.string.setting_app_notification));
        map.put(47, context.getString(i2));
        map.put(34, context.getString(R.string.app_sort_ecg));
        map.put(7, context.getString(R.string.mine_more));
        map.put(30, context.getString(R.string.widget_sport_state));
        map.put(64, context.getString(R.string.data_item_temperature));
        map.put(48, context.getString(R.string.app_sort_xingzuo));
        map.put(49, context.getString(R.string.app_sort_wechat_pay));
        map.put(50, context.getString(R.string.app_sort_yeelight));
        map.put(17, context.getString(R.string.bind_alipay));
        map.put(32, context.getString(R.string.app_sort_calendar));
        map.put(13, context.getString(R.string.app_sort_countdown));
        map.put(12, context.getString(R.string.app_sort_stopwatch));
        map.put(26, context.getString(R.string.app_sort_world_clock));
        map.put(22, context.getString(R.string.setting_app_compass));
        map.put(10, context.getString(R.string.app_sort_photograph));
        map.put(14, context.getString(R.string.widget_find_phone));
        map.put(65, context.getString(R.string.app_sort_barometer_altimeter));
        int i3 = R.string.app_sort_alexa;
        map.put(57, context.getString(i3));
        map.put(56, context.getString(R.string.app_sort_tomato_timer));
        map.put(55, context.getString(R.string.app_sort_calculator));
        map.put(54, context.getString(R.string.app_sort_consume));
        map.put(53, context.getString(R.string.app_sort_distance));
        map.put(52, context.getString(R.string.app_sort_walk_count));
        map.put(58, context.getString(R.string.app_sort_voltage));
        map.put(59, context.getString(R.string.health_data_temperature));
        map.put(60, context.getString(R.string.app_sort_text_message));
        map.put(61, context.getString(R.string.small_tool_item_watchface_setting));
        map.put(62, context.getString(R.string.device_todo));
        map.put(63, context.getString(R.string.mili_setting_mijia_authorize));
        map.put(66, context.getString(R.string.device_recorder));
        map.put(67, context.getString(R.string.app_sort_blood_pressure));
        map.put(68, context.getString(R.string.screen_edit_sun_moon));
        map.put(257, context.getString(R.string.app_sort_offline_voice));
        map.put(258, context.getString(R.string.ctrl_center_flashlight));
        map.put(255, context.getString(R.string.setting_app_band_dialplate));
        map.put(254, context.getString(R.string.app_sort_hi_board));
        map.put(Integer.valueOf(PageType.PAGE_SHORTCUT), context.getString(R.string.setting_shotcut_apps_title));
        map.put(256, context.getString(i3));
        map.put(252, context.getString(R.string.ds_sport_setting));
        List<PageItem> defaultItems = getDefaultItems();
        if (defaultItems != null) {
            for (PageItem pageItem : defaultItems) {
                Integer nameId = pageItem.getNameId();
                if (nameId != null) {
                    map.put(Integer.valueOf(pageItem.getType()), context.getString(nameId.intValue()));
                    Unit unit = Unit.INSTANCE;
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        return map;
    }

    @Nullable
    public List<PageItem> getDefaultItems() {
        return this.defaultItems;
    }

    @Nullable
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    @Nullable
    public AppItemMigrator getMigrator() {
        return this.migrator;
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }
}
