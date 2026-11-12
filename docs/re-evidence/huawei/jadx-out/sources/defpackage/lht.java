package defpackage;

import android.content.Context;
import android.content.Intent;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBase;
import com.huawei.hwcloudmodel.model.userprofile.GetUserProfileReq;
import com.huawei.hwcloudmodel.model.userprofile.GetUserProfileRsp;
import com.huawei.hwcloudmodel.model.userprofile.SetUserProfileReq;
import com.huawei.hwcloudmodel.model.userprofile.UserBasicInfo;
import com.huawei.hwcloudmodel.model.userprofile.UserGoalsInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lht implements HiSyncBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f40170b = new ArrayList<>(2);
    private static ArrayList<Integer> d = new ArrayList<>(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lqo f40171a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40172c;
    private int e;
    private List<Integer> g;
    private lgz h;
    private kxq j;

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByTime(long j, long j2) throws lif {
    }

    static {
        f40170b.add("custom.start_weight_base");
        f40170b.add("custom.weight_goal_daily_diff");
        d.add(5);
    }

    public lht(Context context, int i) {
        LogUtil.d("HiH_HiSyncUserData", "HiSyncUserData create");
        this.f40172c = context.getApplicationContext();
        this.e = i;
        g();
    }

    private void g() {
        this.j = kxq.c();
        this.h = new lgz();
        this.f40171a = lqo.b(this.f40172c);
        this.g = new ArrayList(10);
    }

    private HiUserInfo j() {
        HiUserInfo hiUserInfoA = this.j.a(this.e, 0);
        if (hiUserInfoA == null) {
            LogUtil.j("HiH_HiSyncUserData", "uploadUserBasic no userInfo get");
        }
        return hiUserInfoA;
    }

    private List<HiGoalInfo> e() {
        return kxa.e().c(this.e, 0);
    }

    private void b(List<UserGoalsInfo> list) throws Throwable {
        List<HiGoalInfo> listC = this.h.c(list);
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("HiH_HiSyncUserData", "saveUserGoalsToDB no userGoalsInfos can change to hiGoalInfos");
            return;
        }
        for (HiGoalInfo hiGoalInfo : listC) {
            hiGoalInfo.setOwnerId(this.e);
            kxa.e().b(hiGoalInfo, 1);
        }
        liz.a().a(101, "HiSyncUserData", new kym(this.f40172c.getPackageName()));
    }

    private void a(UserBasicInfo userBasicInfo) {
        HiUserInfo hiUserInfoD = this.h.d(userBasicInfo);
        if (hiUserInfoD == null) {
            LogUtil.j("HiH_HiSyncUserData", "saveUserInfoToDB no userBasicInfo can change to hiUserInfo");
            return;
        }
        if (this.j.a(hiUserInfoD, this.e, 1) > 0) {
            HiBroadcastUtil.b(this.f40172c, PrebakedEffectId.RT_JUMP, 2);
            HiBroadcastUtil.b(this.f40172c, 5);
            liz.a().a(100, "HiSyncUserData", new kym(this.f40172c.getPackageName()));
        }
        LogUtil.a("HiH_HiSyncUserData", "saveUserInfoToDB setIfUserFirstSync false");
        lgp.f().a(Integer.toString(this.e), false);
    }

    private void d(Map<String, String> map) {
        List<HiUserPreference> listE = this.h.e(map);
        if (listE == null || listE.isEmpty()) {
            return;
        }
        for (HiUserPreference hiUserPreference : listE) {
            hiUserPreference.setUserId(this.e);
            String key = hiUserPreference.getKey();
            HiUserPreference hiUserPreferenceB = kxs.c(this.f40172c).b(this.e, key);
            if (hiUserPreferenceB == null || hiUserPreferenceB.getSyncStatus() != 0) {
                boolean zB = kxs.c(this.f40172c).b(hiUserPreference);
                if ("custom.wear_common_setting".equals(key)) {
                    LogUtil.a("HiH_HiSyncUserData", "cloud wear setting is ", hiUserPreference, ", isChange=", Boolean.valueOf(zB), ", custom list size=", Integer.valueOf(listE.size()));
                }
            }
        }
        HiBroadcastUtil.b(this.f40172c, 7);
        liz.a().a(102, "HiSyncUserData", new kym(this.f40172c.getPackageName()));
    }

    private List<HiUserPreference> d() {
        return kxs.c(this.f40172c).b(this.e, 0);
    }

    private void a() throws Throwable {
        boolean zD = lgp.f().d(String.valueOf(this.e));
        if (!lgp.l() && !liq.h()) {
            LogUtil.j("HiH_HiSyncUserData", "downLoadUserData() userPrivacy switch is closed ,can not download right now!");
            if (lgp.a()) {
                return;
            }
            e(zD);
            return;
        }
        c();
        GetUserProfileReq getUserProfileReq = new GetUserProfileReq();
        getUserProfileReq.setProfileType(this.g);
        GetUserProfileRsp getUserProfileRspE = this.f40171a.e(getUserProfileReq);
        if (getUserProfileRspE == null) {
            LogUtil.j("HiH_HiSyncUserData", "downLoadUserData rsp is null");
            e(zD);
            return;
        }
        Integer resultCode = getUserProfileRspE.getResultCode();
        int iIntValue = resultCode.intValue();
        if (iIntValue == 0) {
            lgp.f().c(String.valueOf(this.e), false);
            a(getUserProfileRspE.getBasic());
            b(getUserProfileRspE.getGoals());
            d(getUserProfileRspE.getCustomDefine());
            return;
        }
        LogUtil.e("HiH_HiSyncUserData", "downLoadUserData fail. error code is ", resultCode);
        e(zD);
        if (iIntValue == 30001) {
            lgp.f().a(Integer.toString(this.e), false);
        }
    }

    private void e(boolean z) throws Throwable {
        GetUserProfileReq getUserProfileReq = new GetUserProfileReq();
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(99);
        arrayList.add(2);
        getUserProfileReq.setProfileType(arrayList);
        GetUserProfileRsp getUserProfileRspE = this.f40171a.e(getUserProfileReq);
        try {
            if (!lih.e(getUserProfileRspE, false)) {
                LogUtil.j("HiH_HiSyncUserData", "downloadHealthSettingInfo rsp is fail");
                return;
            }
            lgp.f().c(String.valueOf(this.e), false);
            d(getUserProfileRspE.getCustomDefine());
            b(getUserProfileRspE.getGoals());
        } catch (lif e) {
            ReleaseLogUtil.e("HiH_HiSyncUserData", "downloadHealthSettingInfo rsp is error, e= ", e.getMessage());
            if (getUserProfileRspE != null && 30007 == getUserProfileRspE.getResultCode().intValue() && z) {
                lgp.f().c(String.valueOf(this.e), false);
            }
        }
    }

    private void h() throws lif {
        boolean z;
        SetUserProfileReq setUserProfileReq = new SetUserProfileReq();
        HiUserInfo hiUserInfoJ = j();
        UserBasicInfo userBasicInfoA = this.h.a(hiUserInfoJ);
        boolean z2 = true;
        if (userBasicInfoA != null) {
            setUserProfileReq.setBasic(userBasicInfoA);
            z = true;
        } else {
            z = false;
        }
        List<HiGoalInfo> listE = e();
        List<UserGoalsInfo> listD = this.h.d(listE);
        if (listD == null || listD.isEmpty()) {
            z2 = z;
        } else {
            setUserProfileReq.setGoals(listD);
        }
        List<HiUserPreference> listD2 = d();
        Map<String, String> mapE = this.h.e(listD2);
        if (mapE != null && !mapE.isEmpty()) {
            setUserProfileReq.setCustomDefine(mapE);
        } else if (!z2) {
            LogUtil.j("HiH_HiSyncUserData", "uploadUserData nothing to pushData");
            return;
        }
        if (!lih.e(this.f40171a.d(setUserProfileReq), false)) {
            LogUtil.j("HiH_HiSyncUserData", "uploadUserData rsp error");
            return;
        }
        if (userBasicInfoA != null) {
            d(hiUserInfoJ);
            if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
                LogUtil.a("HiH_HiSyncUserData", "setwifiuserinfo by HiSyncUserData");
                Intent intent = new Intent();
                intent.setAction("com.huawei.health.action.ACTION_WIFI_USERINFO_ACTION");
                intent.setPackage(this.f40172c.getPackageName());
                this.f40172c.sendBroadcast(intent, LocalBroadcast.f36595c);
            }
        }
        if (listD != null && !listD.isEmpty()) {
            d(listE);
        }
        if (mapE == null || mapE.isEmpty()) {
            return;
        }
        c(listD2);
    }

    private void d(HiUserInfo hiUserInfo) {
        this.j.a(hiUserInfo, this.e, 1);
    }

    private void d(List<HiGoalInfo> list) {
        for (HiGoalInfo hiGoalInfo : list) {
            if (hiGoalInfo != null) {
                kxa.e().d(this.e, hiGoalInfo.getGoalType(), 1);
            }
        }
    }

    private void c(List<HiUserPreference> list) {
        for (HiUserPreference hiUserPreference : list) {
            HiUserPreference hiUserPreferenceB = kxs.c(this.f40172c).b(hiUserPreference.getUserId(), hiUserPreference.getKey());
            if (hiUserPreferenceB != null && hiUserPreferenceB.getModifiedTime() == hiUserPreference.getModifiedTime()) {
                kxs.c(this.f40172c).a(hiUserPreference, 1);
            }
        }
    }

    private void c() {
        this.g.add(1);
        this.g.add(2);
        this.g.add(99);
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pullDataByVersion() throws Throwable {
        LogUtil.a("HiH_HiSyncUserData", "downLoad() begin !");
        a();
        LogUtil.a("HiH_HiSyncUserData", "downLoad() end !");
    }

    @Override // com.huawei.hihealthservice.sync.syncdata.HiSyncBase
    public void pushData() throws lif {
        LogUtil.a("HiH_HiSyncUserData", "upLoad() begin !");
        if (!lgp.l()) {
            LogUtil.j("HiH_HiSyncUserData", "pushData() userPrivacy switch is closed ,can not pushData right now ,push end!");
            if (!lgp.a() && !lgp.f().d(Integer.toString(this.e))) {
                f();
                return;
            } else {
                i();
                return;
            }
        }
        if (!lgp.f().e(Integer.toString(this.e))) {
            h();
        } else {
            LogUtil.d("HiH_HiSyncUserData", "first user sync do not upload userData, who is ", Integer.valueOf(this.e));
            if (!lgp.f().d(Integer.toString(this.e))) {
                f();
            }
        }
        LogUtil.a("HiH_HiSyncUserData", "upLoad() end !");
    }

    private void i() {
        boolean z;
        SetUserProfileReq setUserProfileReq = new SetUserProfileReq();
        List<HiUserPreference> listD = d();
        if (!HiCommonUtil.b(listD)) {
            Iterator<HiUserPreference> it = listD.iterator();
            while (it.hasNext()) {
                if (!f40170b.contains(it.next().getKey())) {
                    it.remove();
                }
            }
        }
        Map<String, String> mapE = this.h.e(listD);
        if (mapE == null || mapE.isEmpty()) {
            z = false;
        } else {
            setUserProfileReq.setCustomDefine(mapE);
            z = true;
        }
        List<HiGoalInfo> listE = e();
        if (!HiCommonUtil.b(listE)) {
            Iterator<HiGoalInfo> it2 = listE.iterator();
            while (it2.hasNext()) {
                if (!d.contains(Integer.valueOf(it2.next().getGoalType()))) {
                    it2.remove();
                }
            }
        }
        List<UserGoalsInfo> listD2 = this.h.d(listE);
        if (listD2 != null && !listD2.isEmpty()) {
            setUserProfileReq.setGoals(listD2);
        } else if (!z) {
            LogUtil.j("HiH_HiSyncUserData", "uploadWhiteCustom nothing to pushData");
            return;
        }
        try {
            if (!lih.e(this.f40171a.d(setUserProfileReq), false)) {
                LogUtil.j("HiH_HiSyncUserData", "uploadWhiteCustom rsp fail");
                return;
            }
            if (mapE != null && !mapE.isEmpty()) {
                c(listD);
            }
            if (listD2 == null || listD2.isEmpty()) {
                return;
            }
            d(listE);
        } catch (lif e) {
            ReleaseLogUtil.e("HiH_HiSyncUserData", "uploadWhiteCustom rsp error e=", e.getMessage());
        }
    }

    private void f() {
        boolean z;
        SetUserProfileReq setUserProfileReq = new SetUserProfileReq();
        List<HiUserPreference> listD = d();
        Map<String, String> mapE = this.h.e(listD);
        if (mapE == null || mapE.isEmpty()) {
            z = false;
        } else {
            setUserProfileReq.setCustomDefine(mapE);
            z = true;
        }
        List<HiGoalInfo> listE = e();
        List<UserGoalsInfo> listD2 = this.h.d(listE);
        if (listD2 != null && !listD2.isEmpty()) {
            setUserProfileReq.setGoals(listD2);
        } else if (!z) {
            LogUtil.j("HiH_HiSyncUserData", "uploadHealthSettingInfo nothing to pushData");
            return;
        }
        try {
            if (!lih.e(this.f40171a.d(setUserProfileReq), false)) {
                LogUtil.j("HiH_HiSyncUserData", "uploadHealthSettingInfo rsp fail");
                return;
            }
            if (mapE != null && !mapE.isEmpty()) {
                c(listD);
            }
            if (listD2 == null || listD2.isEmpty()) {
                return;
            }
            d(listE);
        } catch (lif e) {
            ReleaseLogUtil.e("HiH_HiSyncUserData", "uploadHealthSettingInfo rsp error e=", e.getMessage());
        }
    }

    public String toString() {
        return "--HiSyncUserData{}";
    }

    public boolean c(HiUserInfo hiUserInfo) throws lif {
        LogUtil.a("HiH_HiSyncUserData", "start upLoadBasicInfoOnly");
        if (!lgp.l()) {
            LogUtil.j("HiH_HiSyncUserData", "upLoadBasicInfoOnly() userPrivacy switch is closed ,can not pushData right now ,push end!");
            return false;
        }
        UserBasicInfo userBasicInfoA = this.h.a(hiUserInfo);
        if (userBasicInfoA == null) {
            return false;
        }
        SetUserProfileReq setUserProfileReq = new SetUserProfileReq();
        setUserProfileReq.setBasic(userBasicInfoA);
        if (lih.e(this.f40171a.d(setUserProfileReq), false)) {
            HiBroadcastUtil.b(this.f40172c, 10005, 2);
            d(hiUserInfo);
            return true;
        }
        HiBroadcastUtil.b(this.f40172c, 10005, 3);
        return false;
    }

    public boolean b() throws lif {
        LogUtil.a("HiH_HiSyncUserData", "start downLoadBasicInfoOnly");
        GetUserProfileReq getUserProfileReq = new GetUserProfileReq();
        this.g.add(1);
        getUserProfileReq.setProfileType(this.g);
        GetUserProfileRsp getUserProfileRspE = this.f40171a.e(getUserProfileReq);
        if (lih.e(getUserProfileRspE, false)) {
            a(getUserProfileRspE.getBasic());
            return true;
        }
        HiBroadcastUtil.b(this.f40172c, PrebakedEffectId.RT_JUMP, 3);
        return false;
    }
}
