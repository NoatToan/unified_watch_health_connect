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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/MockControlCenterIdDescImpl;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "", "", "ids", "", "parse", "appId", "getDesc", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MockControlCenterIdDescImpl implements IdDescApi {

    @NotNull
    private static final HashMap<Integer, Integer> a;

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, Integer.valueOf(R.string.ctrl_center_flashlight));
        map.put(1, Integer.valueOf(R.string.ctrl_center_brightness));
        map.put(2, Integer.valueOf(R.string.ctrl_center_lock));
        map.put(3, Integer.valueOf(R.string.ctrl_center_dnd));
        map.put(4, Integer.valueOf(R.string.ctrl_center_sleep));
        map.put(5, Integer.valueOf(R.string.ctrl_center_find_phone));
        map.put(6, Integer.valueOf(R.string.ctrl_center_volume));
        map.put(7, Integer.valueOf(R.string.ctrl_center_battery));
        map.put(8, Integer.valueOf(R.string.ctrl_center_theatre));
        map.put(9, Integer.valueOf(R.string.ctrl_center_keep_bright));
        map.put(10, Integer.valueOf(R.string.ctrl_center_bluetooth));
        map.put(11, Integer.valueOf(R.string.ctrl_center_wifi));
        map.put(12, Integer.valueOf(R.string.ctrl_center_sim));
        map.put(13, Integer.valueOf(R.string.ctrl_center_calendar));
        map.put(14, Integer.valueOf(R.string.ctrl_center_alipay));
        map.put(15, Integer.valueOf(R.string.ctrl_center_weixin));
        map.put(16, Integer.valueOf(R.string.ctrl_center_music));
        map.put(17, Integer.valueOf(R.string.ctrl_center_card));
        map.put(18, Integer.valueOf(R.string.ctrl_center_alarm));
        map.put(19, Integer.valueOf(R.string.ctrl_center_settings));
        map.put(20, Integer.valueOf(R.string.ds_sound_buzzer_vibrate_strength));
        map.put(21, Integer.valueOf(R.string.ctrl_center_baroaltimeter));
        map.put(22, Integer.valueOf(R.string.setting_app_compass));
        map.put(23, Integer.valueOf(R.string.app_sort_countdown));
        map.put(24, Integer.valueOf(R.string.app_sort_stopwatch));
        a = map;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    @NotNull
    public String getDesc(@NotNull String appId) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(IntroduceShuffleFactoryKt.getString(a.get(Integer.valueOf(m.replace$default(appId, "^0[x|X]", "", false, 4, (Object) null), 16)).intValue()));
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
