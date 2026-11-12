package defpackage;

import com.huawei.ui.homehealth.device.featureaction.FeatureType;
import com.huawei.ui.homehealth.device.featureaction.featurestrategy.FeatureStrategy;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rpq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<FeatureType, String> f47565c;

    static {
        HashMap map = new HashMap();
        f47565c = map;
        map.put(FeatureType.WATCH_FACE, rtf.class.getName());
        map.put(FeatureType.MUSIC_MENU, rrz.class.getName());
        map.put(FeatureType.DEVICE_GUIDE, rqq.class.getName());
        map.put(FeatureType.WALLET, rtd.class.getName());
        map.put(FeatureType.APP_MARKET, rpw.class.getName());
        map.put(FeatureType.PLAY_MACHINE, rsn.class.getName());
        map.put(FeatureType.MUSIC_LIST, rrv.class.getName());
        map.put(FeatureType.ALL_DEVICE, rpn.class.getName());
        map.put(FeatureType.WEATHER, rtg.class.getName());
        map.put(FeatureType.CONTACT, rqi.class.getName());
        map.put(FeatureType.CALENDAR, rqe.class.getName());
        map.put(FeatureType.QUICK_REPLY, rsp.class.getName());
        map.put(FeatureType.SATCOM_CARD, rsr.class.getName());
        map.put(FeatureType.FIND_DEVICE, rrd.class.getName());
        map.put(FeatureType.MY_WATCH_FACE, rsa.class.getName());
        map.put(FeatureType.TODO_LIST, rsx.class.getName());
        map.put(FeatureType.NOTIFICATION_SETTING, rse.class.getName());
        map.put(FeatureType.DEVICE_SETTING, rqp.class.getName());
        map.put(FeatureType.ALARM, rpr.class.getName());
        map.put(FeatureType.OFFLINE_MAP, rsj.class.getName());
        map.put(FeatureType.SLEEP_SELECTOR, rsw.class.getName());
        map.put(FeatureType.REMINDER_SETTING, rst.class.getName());
        map.put(FeatureType.CONTINUE_HEART_RATE, rql.class.getName());
        map.put(FeatureType.CYCLE_CALENDAR, rqj.class.getName());
        map.put(FeatureType.GOLF, rrs.class.getName());
        map.put(FeatureType.CAMERA, rqg.class.getName());
        map.put(FeatureType.E_SIM, rqy.class.getName());
        map.put(FeatureType.WECHAT_DEVICE, rth.class.getName());
        map.put(FeatureType.WATCH_FACE_DETAIL, rsz.class.getName());
        map.put(FeatureType.DEVICE_DETAIL, rqk.class.getName());
        map.put(FeatureType.PRESS_MONITOR, rsm.class.getName());
        map.put(FeatureType.BLOOD_PRESSURE_SETTING, rqd.class.getName());
        map.put(FeatureType.CYCLE_BLOOD_OXYGEN, rqh.class.getName());
        map.put(FeatureType.TEMPERATURE_MONITOR, rsv.class.getName());
        map.put(FeatureType.WEIGHT_MEASURE, rtn.class.getName());
        map.put(FeatureType.KEEP_ALIVE, rru.class.getName());
        map.put(FeatureType.CONTACT_MANAGE, rqc.class.getName());
        map.put(FeatureType.EARPHONE, rqv.class.getName());
        map.put(FeatureType.EMOTION_MONITOR, rqw.class.getName());
        map.put(FeatureType.HIGHLAND_BLOOD_OXYGEN, rrr.class.getName());
        map.put(FeatureType.VASCULAR_ELASTICITY, rta.class.getName());
        map.put(FeatureType.RESEARCH, rsq.class.getName());
        map.put(FeatureType.INTELLIGENT_HOME, rrt.class.getName());
        map.put(FeatureType.EXCLUSIVE_GUARD, rqz.class.getName());
        map.put(FeatureType.SLEEP_BREATHE, rsu.class.getName());
        map.put(FeatureType.ARRHYTHMIA, rpy.class.getName());
        map.put(FeatureType.FIND_HEADPHONE, rrb.class.getName());
        map.put(FeatureType.CMMCC_AI, rqf.class.getName());
        map.put(FeatureType.ECG_ANALYSIS, rqs.class.getName());
        map.put(FeatureType.ECG, rqt.class.getName());
        map.put(FeatureType.BENEFIT, rpx.class.getName());
        map.put(FeatureType.MACA_DETAIL, rrx.class.getName());
        map.put(FeatureType.SERVICE_SUPPORT, rss.class.getName());
        map.put(FeatureType.FEEDBACK, rqx.class.getName());
        map.put(FeatureType.LOG_UPLOAD, rrw.class.getName());
        map.put(FeatureType.OUTDOOR_ADVENTURE, rsl.class.getName());
    }

    public static FeatureStrategy c(FeatureType featureType) {
        try {
            return (FeatureStrategy) Class.forName(f47565c.get(featureType)).newInstance();
        } catch (ClassNotFoundException unused) {
            LogUtil.d("FeatureStrategyFactory", "StrategyFactory ClassNotFoundException");
            return null;
        } catch (IllegalAccessException unused2) {
            LogUtil.d("FeatureStrategyFactory", "StrategyFactory IllegalAccessException");
            return null;
        } catch (InstantiationException unused3) {
            LogUtil.d("FeatureStrategyFactory", "StrategyFactory InstantiationException");
            return null;
        }
    }
}
