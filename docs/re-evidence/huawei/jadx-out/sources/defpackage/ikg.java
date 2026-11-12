package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.servicesapi.R;
import com.huawei.health.threeCircle.remind.model.DeviceEventData;
import com.huawei.health.threeCircle.remind.model.OnRemindHandle;
import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.health.threeCircle.remind.receiver.SportRemindReceiver;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.threecircle.ActiveTipStringUtils;
import com.huawei.threecircle.api.ThreeCircleApi;
import com.huawei.threecircle.manager.WheelChairStateManager;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ikg implements OnRemindHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f37736a = {"LotIntensity_Run", "LotIntensity_Walk"};
    private static final String[] d = {"LotCalorie_Run", "LotCalorie_Walk"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f37737b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37738c;
    private Bundle e;
    private int f;
    private int g;
    private a i;
    private List<Integer> j;

    private ThreeCircleRemindData b(ThreeCircleRemindData threeCircleRemindData, ThreeCircleRemindData threeCircleRemindData2, ThreeCircleRemindData threeCircleRemindData3) {
        if (threeCircleRemindData != null) {
            return threeCircleRemindData;
        }
        return threeCircleRemindData2 != null ? threeCircleRemindData2 : threeCircleRemindData3;
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Map<String, Integer> map, ikp ikpVar) {
        if (ikpVar.a()) {
            b();
        }
        if (!SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
            LogUtil.a("TC_TodayTgtHdlr", "data is not sync finish.");
            return;
        }
        Bundle bundle = this.e;
        if (bundle != null) {
            e(bundle, map, ikpVar);
        } else {
            a(map, ikpVar);
        }
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void onTrigger(Bundle bundle, Map<String, Integer> map, ikp ikpVar) {
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.e;
        if (bundle2 == null || !bundle2.toString().equals(bundle.toString())) {
            this.e = bundle;
            if (!SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
                LogUtil.a("TC_TodayTgtHdlr", "data is not sync finish.");
                return;
            }
            if (this.i == null) {
                this.i = new a(this);
                HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(Collections.singletonList(103), this.i);
            }
            if (ikpVar.a()) {
                b();
            }
            e(bundle, map, ikpVar);
        }
    }

    private void b() {
        SharedPreferenceManager.c("threeCircleSp", "intensityType", "");
        SharedPreferenceManager.c("threeCircleSp", "activeHourType", "");
        SharedPreferenceManager.c("threeCircleSp", "caloriesType", "");
    }

    private void e(Bundle bundle, final Map<String, Integer> map, final ikp ikpVar) {
        final int i = bundle.getInt("activeHourType");
        final int i2 = bundle.getInt("intensityType");
        final int i3 = bundle.getInt("caloriesType");
        if (this.f37738c == 0 || this.g == 0 || this.f == 0) {
            c(new IBaseResponseCallback() { // from class: ikj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i4, Object obj) {
                    this.f37740a.b(i, i2, i3, ikpVar, map, i4, obj);
                }
            });
        } else {
            b(i, i2, i3, ikpVar, map);
        }
    }

    /* synthetic */ void b(int i, int i2, int i3, ikp ikpVar, Map map, int i4, Object obj) {
        b(i, i2, i3, ikpVar, map);
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void registerAlarm() {
        long timeInMillis = ikx.c(Calendar.getInstance().get(11) >= 16 ? 1 : 0, 16, 17).getTimeInMillis();
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) SportRemindReceiver.class);
        intent.putExtra("remindType", new String[]{"TodayAchievement"});
        try {
            if (Build.VERSION.SDK_INT > 30 && CommonUtil.bg()) {
                xjk.c(101010, intent, 335544320, 0, timeInMillis);
            } else {
                xjk.d(101010, intent, 335544320, 0, timeInMillis);
            }
            SharedPerferenceUtils.c(BaseApplication.b(), DateFormatUtil.a(System.currentTimeMillis()));
        } catch (IllegalStateException e) {
            SharedPerferenceUtils.c(BaseApplication.b(), -1);
            ReleaseLogUtil.a("TC_TodayTgtHdlr", "registerAlarm：", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public boolean isActiveTrigger() {
        return ikx.d(16, 17);
    }

    @Override // com.huawei.health.threeCircle.remind.model.OnRemindHandle
    public void destroy() {
        if (njy.b(this.j)) {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.j, new HiUnSubscribeListener() { // from class: iki
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("TC_TodayTgtHdlr", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
            this.i = null;
        }
    }

    private void a(final Map<String, Integer> map, final ikp ikpVar) {
        if (ikpVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        qhb.c().c(lsl.r(jCurrentTimeMillis), lsl.c(jCurrentTimeMillis), new ResponseCallback() { // from class: ikh
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37739a.e(ikpVar, map, i, (List) obj);
            }
        });
    }

    /* synthetic */ void e(final ikp ikpVar, final Map map, int i, List list) {
        if (njy.e(list)) {
            LogUtil.e("TC_TodayTgtHdlr", "can not get today three circle data.");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData == null) {
            LogUtil.e("TC_TodayTgtHdlr", "get today three circle data is null.");
            return;
        }
        final int i2 = hiHealthData.getInt("durationUserValue");
        final int i3 = hiHealthData.getInt("activeUserValue");
        final int i4 = hiHealthData.getInt("calorieUserValue");
        ReleaseLogUtil.d("R_TC_TodayTgtHdlr", "intensity:", Integer.valueOf(i2), " intensityGoal:", Integer.valueOf(this.g), "activeHours:", Integer.valueOf(i3), " activeGoal:", Integer.valueOf(this.f37738c), "calories:", Integer.valueOf(i4), " caloriesGoal:", Integer.valueOf(this.f));
        if (this.f37738c == 0 || this.g == 0 || this.f == 0) {
            c(new IBaseResponseCallback() { // from class: ikf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i5, Object obj) {
                    this.e.c(i3, i2, i4, ikpVar, map, i5, obj);
                }
            });
        } else {
            b(i3, i2, i4, ikpVar, map);
        }
    }

    /* synthetic */ void c(int i, int i2, int i3, ikp ikpVar, Map map, int i4, Object obj) {
        b(i, i2, i3, ikpVar, map);
    }

    private ThreeCircleRemindData c(ThreeCircleRemindData threeCircleRemindData, ThreeCircleRemindData threeCircleRemindData2) {
        if (threeCircleRemindData != null && "OverGoal".equals(threeCircleRemindData.getRemindType())) {
            return threeCircleRemindData;
        }
        if (threeCircleRemindData2 == null || !"OverGoal".equals(threeCircleRemindData2.getRemindType())) {
            return null;
        }
        return threeCircleRemindData2;
    }

    private ThreeCircleRemindData e(boolean z, boolean z2, boolean z3, Map<String, Integer> map) {
        if (c("DoneAll") > 0 || !z || !z2 || !z3) {
            return null;
        }
        Integer num = map.get("TodayAchievement");
        a("DoneAll", 1);
        return new ThreeCircleRemindData.d().a("TodayAchievement").d("DoneAll").e(d("TodayAchievement", "DoneAll", 1, "DoneAll")).a(num != null ? 4 + num.intValue() : 4).e(System.currentTimeMillis()).c();
    }

    private ThreeCircleRemindData c(int i, int i2, boolean z, String str, Map<String, Integer> map) {
        if (i2 <= 0) {
            return null;
        }
        if (!z) {
            return e(i, i2, str, map);
        }
        return a(i, i2, str, map);
    }

    private ThreeCircleRemindData a(int i, int i2, String str, Map<String, Integer> map) {
        int i3;
        int iC = c(str);
        if (("activeHourType".equals(str) && iC > 0) || (i3 = i / i2) <= iC) {
            return null;
        }
        a(str, i3);
        ThreeCircleRemindData.d dVar = new ThreeCircleRemindData.d();
        if (i3 == 1 || "activeHourType".equals(str)) {
            ReleaseLogUtil.d("TC_TodayTgtHdlr", "has achieve .", str);
            dVar.a("TodayAchievement");
            String strA = a(str);
            dVar.d(strA);
            dVar.e(d("TodayAchievement", strA, i3, str));
            dVar.a(d("TodayAchievement", str, map));
        } else if (i3 <= 4) {
            ReleaseLogUtil.d("TC_TodayTgtHdlr", "has over goal .", str, " multiples:", Integer.valueOf(i3));
            dVar.a("OverGoal");
            String strA2 = a(i3);
            dVar.d(strA2);
            dVar.a(d("OverGoal", str, map));
            dVar.e(d("OverGoal", strA2, i3, str));
            dVar.e(d(str, i3));
        } else {
            ReleaseLogUtil.e("R_TC_TodayTgtHdlr", "multiples is too high.", Integer.valueOf(i3), str);
            return null;
        }
        return dVar.c();
    }

    private ThreeCircleRemindData e(int i, int i2, String str, Map<String, Integer> map) {
        int iC = c("LagEncourage");
        if (!e() || iC != 0) {
            return null;
        }
        ThreeCircleRemindData.d dVar = new ThreeCircleRemindData.d();
        String strB = b(str);
        dVar.a("LagEncourage").d(strB).a(d("LagEncourage", str, map)).e(d("LagEncourage", strB, i2 - i, str));
        a("LagEncourage", 1);
        return dVar.c();
    }

    private String b(String str) {
        if ("intensityType".equals(str)) {
            String[] strArr = f37736a;
            return strArr[new SecureRandom().nextInt(strArr.length)];
        }
        if ("caloriesType".equals(str)) {
            String[] strArr2 = d;
            return strArr2[new SecureRandom().nextInt(strArr2.length)];
        }
        LogUtil.a("TC_TodayTgtHdlr", "getRandomSubRemindType is not intensity or calories");
        return "LotActiveHour";
    }

    private String d(String str, String str2, int i, String str3) {
        ThreeCircleApi threeCircleApi = (ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class);
        String strD = d(str2);
        ReleaseLogUtil.d("R_TC_TodayTgtHdlr", "tempRemindType:", strD);
        qhl qhlVarQueryRules = threeCircleApi.queryRules(str, strD);
        if (qhlVarQueryRules == null) {
            return "";
        }
        HashMap map = new HashMap();
        Context contextB = BaseApplication.b();
        for (String str4 : qhlVarQueryRules.b()) {
            if (ParsedFieldTag.GOAL.equals(str4)) {
                if ("caloriesType".equals(str3)) {
                    map.put(str4, contextB.getString(R.string.IDS_active_caloric));
                }
                if ("intensityType".equals(str3)) {
                    map.put(str4, contextB.getString(R.string.IDS_active_workout));
                }
            }
            if ("reachGoalRate".equals(str4)) {
                map.put(str4, UnitUtil.e(i * 100, 2, 0));
            }
            if ("remainHour".equals(str4)) {
                map.put(str4, contextB.getResources().getQuantityString(R.plurals.IDS_single_circle_active_target_desc, i, UnitUtil.e(i, 1, 0)));
            }
            if ("remainMinute".equals(str4)) {
                i = b(str2, i);
                if (i >= 3) {
                    map.put(str4, contextB.getResources().getQuantityString(R.plurals.IDS_single_circle_intensity_target_desc, i, UnitUtil.e(i, 1, 0)));
                } else {
                    LogUtil.a("TC_TodayTgtHdlr", "multiples less than 3, multiples is ", Integer.valueOf(i));
                }
            }
        }
        LogUtil.a("TC_TodayTgtHdlr", "paramMap:", map.toString());
        return threeCircleApi.getPromptMessage(qhlVarQueryRules, map);
    }

    private String d(String str) {
        boolean zD = WheelChairStateManager.a().d();
        ReleaseLogUtil.d("R_TC_TodayTgtHdlr", "dealWheelRemindType:", str, "isSwitch:", Boolean.valueOf(zD));
        if ("LotActiveHour".equals(str)) {
            return zD ? "LotActiveHourWheel" : str;
        }
        return ("DoneActiveH".equals(str) && zD) ? "DoneActiveHWC" : str;
    }

    private int b(String str, int i) {
        if ("LotCalorie_Run".equals(str)) {
            return ActiveTipStringUtils.a(i, 258);
        }
        if ("LotCalorie_Walk".equals(str)) {
            return ActiveTipStringUtils.a(i, 257);
        }
        LogUtil.a("TC_TodayTgtHdlr", "do not need change, subRemindType is ", str);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    private DeviceEventData d(String str, int i) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        int i2 = 0;
        if (iHashCode != -647116275) {
            if (iHashCode != 1686952800) {
                if (iHashCode == 1847125092 && str.equals("activeHourType")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("caloriesType")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("intensityType")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            i2 = 3;
        } else if (b2 == 1) {
            i2 = 2;
        } else if (b2 == 2) {
            i2 = 4;
        }
        return new DeviceEventData.c().h(2).e(System.currentTimeMillis() / 1000).g(i2).b(i).a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private String a(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -647116275) {
            if (iHashCode != 1686952800) {
                if (iHashCode == 1847125092 && str.equals("activeHourType")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("caloriesType")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("intensityType")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "DoneIntensity";
        }
        if (b2 == 1) {
            return "DoneCalorie";
        }
        if (b2 == 2) {
            return "DoneActiveH";
        }
        return "";
    }

    private String a(int i) {
        if (i == 2) {
            return "Double";
        }
        if (i == 3) {
            return "Thrice";
        }
        if (i == 4) {
            return "Fourtimes";
        }
        return "";
    }

    private int d(String str, String str2, Map<String, Integer> map) {
        Integer num = map != null ? map.get(str) : null;
        int iIntValue = num == null ? 0 : num.intValue();
        if ("activeHourType".equals(str2)) {
            return iIntValue + 3;
        }
        return "intensityType".equals(str2) ? iIntValue + 2 : iIntValue + 1;
    }

    private boolean e() {
        Calendar calendar = Calendar.getInstance();
        int i = (calendar.get(11) * 100) + calendar.get(12);
        return i >= 1600 && i <= 1700;
    }

    private int c(String str) {
        String str2 = this.f37737b.get(str);
        if (str2 == null) {
            String strB = SharedPreferenceManager.b("threeCircleSp", str, "");
            if (strB == null) {
                this.f37737b.put(str, "");
            } else {
                this.f37737b.put(str, strB);
            }
            str2 = this.f37737b.get(str);
        }
        LogUtil.d("R_TC_TodayTgtHdlr", "cacheValue:", str2, " dataType:", str);
        if (str2 != null && str2.length() == 9) {
            String strSubstring = str2.substring(0, 8);
            int iE = CommonUtil.e(str2.substring(8), 0);
            if (strSubstring.equals(Integer.toString(DateFormatUtil.a(System.currentTimeMillis())))) {
                return iE;
            }
        }
        return 0;
    }

    private void a(String str, int i) {
        String str2;
        ReleaseLogUtil.d("R_TC_TodayTgtHdlr", "dateType", str, "state:", Integer.valueOf(i));
        if ("activeHourType".equals(str) && i > 0) {
            str2 = DateFormatUtil.a(System.currentTimeMillis()) + Integer.toString(1);
        } else {
            str2 = DateFormatUtil.a(System.currentTimeMillis()) + Integer.toString(i);
        }
        SharedPreferenceManager.c("threeCircleSp", str, str2);
        this.f37737b.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("900200009");
        arrayList.add("900200008");
        arrayList.add("900200007");
        qgm.a(arrayList, new IBaseResponseCallback() { // from class: ikn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f37745b.a(iBaseResponseCallback, i, obj);
            }
        });
    }

    /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (!(obj instanceof HashMap)) {
            LogUtil.j("TC_TodayTgtHdlr", "getActiveGoals objData is not instanceof HashMap");
            return;
        }
        HashMap map = (HashMap) obj;
        this.g = qgm.d(map, "900200008", 25);
        this.f37738c = qgm.d(map, "900200009", 12);
        int iD = qgm.d(map, "900200007", 270000);
        this.f = iD;
        ReleaseLogUtil.d("R_TC_TodayTgtHdlr", "getActiveGoals intensityValue is ", Integer.valueOf(this.g), " standValue is ", Integer.valueOf(this.f37738c), " calories goal:", Integer.valueOf(iD));
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, obj);
        }
    }

    private void b(int i, int i2, int i3, ikp ikpVar, Map<String, Integer> map) {
        LogUtil.a("TC_TodayTgtHdlr", "checkIsAchieveGoal activeHour:", Integer.valueOf(i), "intensity:", Integer.valueOf(i2), "calories:", Integer.valueOf(i3));
        int i4 = this.f37738c;
        boolean z = i >= i4;
        ThreeCircleRemindData threeCircleRemindDataC = c(i, i4, z, "activeHourType", map);
        int i5 = this.g;
        boolean z2 = i2 >= i5;
        ThreeCircleRemindData threeCircleRemindDataC2 = c(i2, i5, z2, "intensityType", map);
        int i6 = this.f;
        boolean z3 = i3 >= i6;
        ThreeCircleRemindData threeCircleRemindDataC3 = c(i3, i6, z3, "caloriesType", map);
        ThreeCircleRemindData threeCircleRemindDataC4 = c(threeCircleRemindDataC2, threeCircleRemindDataC3);
        if (threeCircleRemindDataC4 != null) {
            ikpVar.onResponse(0, threeCircleRemindDataC4);
            return;
        }
        ThreeCircleRemindData threeCircleRemindDataE = e(z2, z, z3, map);
        if (threeCircleRemindDataE != null) {
            ikpVar.onResponse(0, threeCircleRemindDataE);
            return;
        }
        ThreeCircleRemindData threeCircleRemindDataB = b(threeCircleRemindDataC, threeCircleRemindDataC2, threeCircleRemindDataC3);
        if (threeCircleRemindDataB != null) {
            ikpVar.onResponse(0, threeCircleRemindDataB);
        }
    }

    static class a implements HiSubscribeListener {
        private WeakReference<ikg> e;

        a(ikg ikgVar) {
            this.e = new WeakReference<>(ikgVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (list != null && this.e.get() != null) {
                this.e.get().j = list;
                LogUtil.a("TC_TodayTgtHdlr", "onResult:", Integer.valueOf(list.size()));
            } else {
                LogUtil.j("TC_TodayTgtHdlr", "onResult list null.");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ikg ikgVar = this.e.get();
            if (ikgVar != null && i == 103) {
                LogUtil.a("TC_TodayTgtHdlr", "onChange changeKey.", str);
                if ("900200007".equals(str) || "900200008".equals(str) || "900200009".equals(str)) {
                    ikgVar.c((IBaseResponseCallback) null);
                }
            }
        }
    }
}
