package com.xiaomi.hm.health.device.setting.appsort.repo.iddesc;

import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/MockScreenEditIdDescImpl;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "", "", "ids", "", "parse", "appId", "getDesc", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MockScreenEditIdDescImpl implements IdDescApi {

    @NotNull
    private static final HashMap<Integer, String> a;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, IntroduceShuffleFactoryKt.getString(R.string.app_sort_activity_goal));
        map.put(1, IntroduceShuffleFactoryKt.getString(R.string.heart_rate));
        map.put(2, IntroduceShuffleFactoryKt.getString(R.string.weather));
        map.put(3, IntroduceShuffleFactoryKt.getString(R.string.pai));
        map.put(4, IntroduceShuffleFactoryKt.getString(R.string.app_sort_music));
        map.put(5, IntroduceShuffleFactoryKt.getString(R.string.status_sleep));
        map.put(6, IntroduceShuffleFactoryKt.getString(R.string.ctrl_center_alipay));
        int i = R.string.un_translate;
        map.put(7, IntroduceShuffleFactoryKt.getString(i));
        map.put(8, IntroduceShuffleFactoryKt.getString(R.string.ctrl_center_weixin));
        map.put(9, IntroduceShuffleFactoryKt.getString(R.string.ctrl_center_card));
        map.put(10, IntroduceShuffleFactoryKt.getString(R.string.sport));
        map.put(11, IntroduceShuffleFactoryKt.getString(R.string.setting_app_sport_record));
        map.put(12, IntroduceShuffleFactoryKt.getString(R.string.widget_sport_state));
        map.put(13, IntroduceShuffleFactoryKt.getString(R.string.screen_edit_sport_lesson));
        map.put(14, IntroduceShuffleFactoryKt.getString(R.string.screen_edit_measure_widget));
        map.put(15, IntroduceShuffleFactoryKt.getString(R.string.app_sort_pressure));
        map.put(16, IntroduceShuffleFactoryKt.getString(R.string.app_sort_ecg));
        map.put(17, IntroduceShuffleFactoryKt.getString(R.string.setting_app_women_health));
        map.put(18, IntroduceShuffleFactoryKt.getString(R.string.app_sort_breath_train));
        map.put(19, IntroduceShuffleFactoryKt.getString(R.string.setting_app_spo2));
        map.put(20, IntroduceShuffleFactoryKt.getString(R.string.health_data_temperature));
        map.put(21, IntroduceShuffleFactoryKt.getString(R.string.data_item_temperature));
        map.put(22, IntroduceShuffleFactoryKt.getString(R.string.widget_alarm));
        map.put(23, IntroduceShuffleFactoryKt.getString(R.string.ctrl_center_calendar));
        map.put(24, IntroduceShuffleFactoryKt.getString(R.string.app_sort_schedule));
        map.put(25, IntroduceShuffleFactoryKt.getString(R.string.device_todo));
        map.put(26, IntroduceShuffleFactoryKt.getString(R.string.app_sort_world_clock));
        map.put(27, IntroduceShuffleFactoryKt.getString(R.string.widget_compass));
        map.put(28, IntroduceShuffleFactoryKt.getString(R.string.app_sort_barometer_altimeter));
        map.put(29, IntroduceShuffleFactoryKt.getString(R.string.screen_edit_sun_moon));
        map.put(30, IntroduceShuffleFactoryKt.getString(R.string.device_recorder));
        map.put(31, IntroduceShuffleFactoryKt.getString(i));
        a = map;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    @NotNull
    public String getDesc(@NotNull String appId) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(a.get(Integer.valueOf(m.replace$default(appId, "^0[x|X]", "", false, 4, (Object) null), 16)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        String str = (String) objM3845constructorimpl;
        return str == null ? appId : str;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    public boolean parse(@NotNull List<String> ids) {
        return true;
    }
}
