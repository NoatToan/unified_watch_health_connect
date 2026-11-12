package com.xiaomi.hm.health.device.assistant.smart.vo;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.assistant.viewmodel.adapter.CloudResourceApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayResourceMapper;", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi;", "", "", "appId", "cardId", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi$Item;", "loadTitleAndIcon", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/CardType;", "type", "loadTitle", "loadIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DisplayResourceMapper implements CloudResourceApi<Integer, Integer> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.COUNT_DOWN.ordinal()] = 1;
            iArr[CardType.ALARM_CLOCK.ordinal()] = 2;
            iArr[CardType.STOP_WATCH.ordinal()] = 3;
            iArr[CardType.WORLD_TIME.ordinal()] = 4;
            iArr[CardType.VOICE_RECORDER.ordinal()] = 5;
            iArr[CardType.WEATHER.ordinal()] = 6;
            iArr[CardType.MUSIC.ordinal()] = 7;
            iArr[CardType.SPORT.ordinal()] = 8;
            iArr[CardType.PAI.ordinal()] = 9;
            iArr[CardType.HEART_RATE.ordinal()] = 10;
            iArr[CardType.SLEEP.ordinal()] = 11;
            iArr[CardType.ACTIVITY_GOAL.ordinal()] = 12;
            iArr[CardType.SPO2.ordinal()] = 13;
            iArr[CardType.MENSTRUATION.ordinal()] = 14;
            iArr[CardType.TIGER_TRADE.ordinal()] = 15;
            iArr[CardType.FLIGHT_MANAGER.ordinal()] = 16;
            iArr[CardType.NETEASE_CLOUD_MUSIC.ordinal()] = 17;
            iArr[CardType.QUNAR.ordinal()] = 18;
            iArr[CardType.WEIBO.ordinal()] = 19;
            iArr[CardType.PAY.ordinal()] = 20;
            iArr[CardType.PHONE_LOG.ordinal()] = 21;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DrawableRes
    public final int loadIcon(@NotNull CardType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return R.drawable.app_sort_count_down_new;
            case 2:
                return R.drawable.app_sort_alarm_new;
            case 3:
                return R.drawable.app_sort_stop_watch_new;
            case 4:
                return R.drawable.app_sort_world_clock;
            case 5:
                return R.drawable.app_sort_voice_recorder_new;
            case 6:
                return R.drawable.app_sort_weather_new;
            case 7:
                return R.drawable.app_sort_music_new;
            case 8:
                return R.drawable.app_sort_sport_new;
            case 9:
                return R.drawable.app_sort_pai_new;
            case 10:
                return R.drawable.app_sort_hr_new;
            case 11:
                return R.drawable.app_sort_sleep2;
            case 12:
                return R.drawable.app_sort_activity_goal_new;
            case 13:
                return R.drawable.app_sort_spo2_new;
            case 14:
                return R.drawable.app_sort_menstruation_new;
            case 15:
                return R.drawable.app_sort_netease_music_new;
            case 16:
                return R.drawable.app_sort_netease_music_new;
            case 17:
                return R.drawable.app_sort_netease_music_new;
            case 18:
                return R.drawable.app_sort_quenaer_new;
            case 19:
                return R.drawable.app_sort_weibo_new;
            case 20:
                return R.drawable.card_pay;
            case 21:
                return R.drawable.app_sort_phone_new;
            default:
                return 0;
        }
    }

    @StringRes
    public final int loadTitle(@NotNull CardType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return R.string.setting_app_countdown;
            case 2:
                return R.string.setting_app_alarm;
            case 3:
                return R.string.setting_app_seconds;
            case 4:
                return R.string.app_sort_world_clock;
            case 5:
                return R.string.device_recorder;
            case 6:
                return R.string.weather;
            case 7:
                return R.string.app_sort_music;
            case 8:
                return R.string.sort_sport;
            case 9:
                return R.string.pai_name;
            case 10:
                return R.string.heart_rate;
            case 11:
                return R.string.status_sleep;
            case 12:
                return R.string.app_sort_activity_goal;
            case 13:
                return R.string.bo_ui_spo2_name;
            case 14:
                return R.string.app_sort_menstruation;
            case 15:
                return R.string.un_translate;
            case 16:
                return R.string.un_translate;
            case 17:
                return R.string.app_sort_netease_music;
            case 18:
                return R.string.as_smart_qunaer;
            case 19:
                return R.string.weibo;
            case 20:
                return R.string.card_pay;
            case 21:
                return R.string.app_sort_phone;
            default:
                return 0;
        }
    }

    @Override // com.xiaomi.hm.health.device.assistant.viewmodel.adapter.CloudResourceApi
    @NotNull
    public CloudResourceApi.Item<Integer, Integer> loadTitleAndIcon(@NotNull String appId, @NotNull String cardId) throws Exception {
        CardType cardTypeFindValueByInt = CardType.INSTANCE.findValueByInt(Integer.parseInt(cardId));
        if (cardTypeFindValueByInt != null) {
            return new CloudResourceApi.Item<>(Integer.valueOf(loadTitle(cardTypeFindValueByInt)), Integer.valueOf(loadIcon(cardTypeFindValueByInt)));
        }
        throw new Exception("card id error " + cardId);
    }
}
