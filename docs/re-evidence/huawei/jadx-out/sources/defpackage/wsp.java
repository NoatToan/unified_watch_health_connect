package defpackage;

import android.content.Context;
import com.google.gson.JsonParseException;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.ui.main.R;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class wsp {
    public static int e(PersonalData personalData) {
        return personalData.getPersonalLevel();
    }

    public static String a(PersonalData personalData) {
        return personalData.getPersonalLevelDesc();
    }

    public static int d(PersonalData personalData) {
        return personalData.getSumKakaNum();
    }

    public static String a(HiUserInfo hiUserInfo) {
        return hiUserInfo.getName();
    }

    public static String b(HiUserInfo hiUserInfo) {
        return hiUserInfo.getHeadImgUrl();
    }

    public static String e(UserInfomation userInfomation) {
        return userInfomation.getName();
    }

    public static String c(UserInfomation userInfomation) {
        return userInfomation.getPicPath();
    }

    public static String a(UserInfomation userInfomation) {
        return userInfomation.getPortraitUrl();
    }

    public static boolean b() {
        ReleaseLogUtil.d("R_PersonalCentetUtil", "isBlockedBetaSubmission");
        try {
            wsi wsiVar = (wsi) lls.a(BaseApplication.getContext().getAssets().open("beta_submission_blocklist.json"), wsi.class);
            ReleaseLogUtil.d("R_PersonalCentetUtil", "isBlockedBetaSubmission betaSubmissionConfigBean = ", wsiVar.toString());
            if (wsiVar.b()) {
                ReleaseLogUtil.d("R_PersonalCentetUtil", "isBlockedBetaSubmission isMediaEvaluationSwitch");
                return true;
            }
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
            ReleaseLogUtil.d("R_PersonalCentetUtil", "isBlockedBetaSubmission countryCode = ", accountInfo, ", ifAllowLogin = ", Boolean.valueOf(Utils.h()), ", isNoLogin = ", Boolean.valueOf(h()));
            return !Utils.h() || h() || wsiVar.c().contains(accountInfo);
        } catch (JsonParseException unused) {
            ReleaseLogUtil.a("R_PersonalCentetUtil", "JsonParseException failed");
            ReleaseLogUtil.a("R_PersonalCentetUtil", "isBlockedBetaSubmission default true");
            return true;
        } catch (IOException e) {
            ReleaseLogUtil.a("R_PersonalCentetUtil", "loadBetaBlockListConfig failed, ", LogAnonymous.b(e));
            ReleaseLogUtil.a("R_PersonalCentetUtil", "isBlockedBetaSubmission default true");
            return true;
        }
    }

    private static boolean h() {
        return Utils.h() && !Utils.f();
    }

    public static boolean f() {
        if (!CommonUtil.ap() || b()) {
            return false;
        }
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        if (LoginInit.getInstance(contextB).getIsLogined()) {
            if (LoginInit.getInstance(contextB).isKoreaCountry()) {
                ReleaseLogUtil.d("R_PersonalCentetUtil", "isOverseaBetaAgreementVersion isKoreaCountry");
                return true;
            }
            int iJ = CommonUtil.j(LoginInit.getInstance(contextB).getAccountInfo(1009));
            return iJ == 7 || iJ == 5;
        }
        String accountInfo = LoginInit.getInstance(contextB).getAccountInfo(1010);
        return CommonUtil.b(R.array.eu_country_code, accountInfo) || CommonUtil.b(R.array.aala_country_code, accountInfo);
    }

    public static boolean g() {
        return d() || f();
    }

    public static boolean d() {
        return CommonUtil.ap() && CommonUtil.v(BaseApplication.getContext()) && !Utils.o();
    }

    public static boolean c() {
        if (d() && a()) {
            return true;
        }
        return f() && j();
    }

    public static boolean j() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_oversea_beta_user_agree");
        LogUtil.a("PersonalCentetUtil", "isNotAgreeOverseaBetaPrivacy betaAgree:", strE);
        return !"1".equals(strE);
    }

    public static boolean a() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_beta_user_agree");
        LogUtil.a("PersonalCentetUtil", "isNotAgreeBetaVersion betaVersionAgree:", strE);
        return !"1".equals(strE);
    }

    public static void e() {
        if (f()) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "health_oversea_beta_user_agree", "0", new StorageParams());
        }
    }
}
