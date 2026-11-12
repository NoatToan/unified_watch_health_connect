package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/LocalSportTypeDescImpl;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeDescApi;", "", "id", "", "getDesc", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocalSportTypeDescImpl implements SportTypeDescApi {
    public static final int SPORT_TYPE_ROWING_MACHINE = 23;
    public static final int SPORT_TYPE_SWIM_POOL = 6;
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final int f = 7;
    private static final int g = 8;
    private static final int h = 9;
    private static final int i = 10;
    private static final int j = 11;
    private static final int k = 12;
    private static final int l = 15;
    private static final int m = 17;
    private static final int n = 21;
    private static final int o = 60;
    private static final int p = 127;
    private static final int q = 42;
    private static final int r = 43;
    private static final int s = 46;
    private static final int t = 105;
    private static final int u = 40;

    @NotNull
    private static final HashMap<Integer, String> v;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, IntroduceShuffleFactoryKt.getString(R.string.sport_type_outdoor_running));
        map.put(2, IntroduceShuffleFactoryKt.getString(R.string.sport_type_treadmill));
        map.put(3, IntroduceShuffleFactoryKt.getString(R.string.sport_type_walking));
        map.put(4, IntroduceShuffleFactoryKt.getString(R.string.sport_type_riding));
        map.put(5, IntroduceShuffleFactoryKt.getString(R.string.sport_type_exercise));
        map.put(6, IntroduceShuffleFactoryKt.getString(R.string.sport_type_swim_pool));
        map.put(7, IntroduceShuffleFactoryKt.getString(R.string.sport_type_open_water_swim));
        map.put(8, IntroduceShuffleFactoryKt.getString(R.string.sport_type_indoor_ride));
        map.put(9, IntroduceShuffleFactoryKt.getString(R.string.sport_type_elliptical_machine));
        map.put(10, IntroduceShuffleFactoryKt.getString(R.string.sport_type_mountaineering));
        map.put(11, IntroduceShuffleFactoryKt.getString(R.string.sport_type_trail_running));
        map.put(12, IntroduceShuffleFactoryKt.getString(R.string.sport_type_skiing));
        map.put(15, IntroduceShuffleFactoryKt.getString(R.string.sport_type_outdoor_hiking));
        map.put(17, IntroduceShuffleFactoryKt.getString(R.string.sport_type_tennis));
        map.put(21, IntroduceShuffleFactoryKt.getString(R.string.sport_type_skipping_rope));
        map.put(23, IntroduceShuffleFactoryKt.getString(R.string.sport_type_rowing_machine));
        map.put(60, IntroduceShuffleFactoryKt.getString(R.string.sport_type_yoga));
        map.put(127, IntroduceShuffleFactoryKt.getString(R.string.sport_type_orienteering_skiing));
        map.put(42, IntroduceShuffleFactoryKt.getString(R.string.sport_type_snowboarding_single));
        map.put(43, IntroduceShuffleFactoryKt.getString(R.string.sport_type_alpine_skiing));
        map.put(46, IntroduceShuffleFactoryKt.getString(R.string.sport_type_cross_country_skiing));
        map.put(105, IntroduceShuffleFactoryKt.getString(R.string.sport_type_snowboarding_double));
        map.put(40, IntroduceShuffleFactoryKt.getString(R.string.sport_type_indoor_walking));
        v = map;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeDescApi
    @NotNull
    public String getDesc(int id) {
        String str = v.get(Integer.valueOf(id));
        return str == null ? String.valueOf(id) : str;
    }
}
