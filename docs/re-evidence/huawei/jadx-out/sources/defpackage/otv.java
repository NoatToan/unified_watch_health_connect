package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.AchieveMessage;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class otv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, Integer> f44756a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f44757b = new Object();

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    private static void e() {
        byte b2;
        HashMap<String, Integer> map = f44756a;
        if (map == null || map.isEmpty()) {
            List<String> listE = pax.e();
            f44756a = new HashMap<>(listE.size());
            for (String str : listE) {
                str.hashCode();
                int iHashCode = str.hashCode();
                if (iHashCode != 2102) {
                    if (iHashCode != 64993) {
                        if (iHashCode != 2131) {
                            if (iHashCode == 2132 && str.equals("C7")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("C6")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("B10")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("B8")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    f44756a.put(str, 1);
                } else if (b2 == 1) {
                    f44756a.put(str, 3);
                } else if (b2 == 2) {
                    f44756a.put(str, 0);
                } else if (b2 == 3) {
                    f44756a.put(str, 2);
                } else {
                    f44756a.put(str, 4);
                }
            }
            f44756a.put("C6_50", 5);
        }
    }

    private static int c(String str) {
        e();
        Integer num = f44756a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void e(String str, AchieveMessage achieveMessage) {
        osa.b(BaseApplication.b(), str, achieveMessage == null ? "" : HiJsonUtil.d(achieveMessage));
    }

    private static boolean e(AchieveMessage achieveMessage) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptThreeCircleMedal");
        if (achieveMessage == null || !pax.n(achieveMessage.acquireMedalType())) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptThreeCircleMedal: not the three circle medal");
            return false;
        }
        b(achieveMessage.acquireMedalId());
        String strAcquireMedalType = achieveMessage.acquireMedalType();
        if ("D1".equals(strAcquireMedalType) || "D2".equals(strAcquireMedalType)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptThreeCircleMedal: xxx% medal -> no save");
            return true;
        }
        synchronized (d) {
            d(achieveMessage);
        }
        return true;
    }

    private static void a(AchieveMessage achieveMessage) {
        if (TextUtils.isEmpty(achieveMessage.getGainTime()) || "0".equals(achieveMessage.getGainTime()) || Constants.NULL.equals(achieveMessage.getGainTime())) {
            achieveMessage.setGainTime(String.valueOf(System.currentTimeMillis()));
        }
        if (!"C6".equals(achieveMessage.acquireMedalType()) || achieveMessage.acquireMedalLevel() < 50) {
            return;
        }
        achieveMessage.saveMedalType("C6_50");
    }

    private static void d(AchieveMessage achieveMessage) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: medalId -> " + achieveMessage.acquireMedalId());
        a(achieveMessage);
        AchieveMessage achieveMessage2 = (AchieveMessage) HiJsonUtil.d(osa.e(BaseApplication.b(), "three_circle_medal_dialog_intercept_message"), AchieveMessage.class);
        if (achieveMessage2 == null) {
            e("three_circle_medal_dialog_intercept_message", achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: oldMedalMessage is null -> save");
            return;
        }
        long jF = qrs.f(achieveMessage.getGainTime());
        long jF2 = qrs.f(achieveMessage2.getGainTime());
        if (!qrk.b(jF, jF2)) {
            if (jF > jF2) {
                e("three_circle_medal_dialog_intercept_message", achieveMessage);
                LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: !isSameDay -> save");
                return;
            } else {
                LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: !isSameDay -> no save");
                return;
            }
        }
        int iC = c(achieveMessage.acquireMedalType());
        int iC2 = c(achieveMessage2.acquireMedalType());
        if (iC < iC2) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: medalPriority -> no save");
            return;
        }
        if (iC > iC2) {
            e("three_circle_medal_dialog_intercept_message", achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: medalPriority -> save");
            return;
        }
        int iAcquireMedalLevel = achieveMessage.acquireMedalLevel();
        int iAcquireMedalLevel2 = achieveMessage2.acquireMedalLevel();
        if (iAcquireMedalLevel < iAcquireMedalLevel2) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: medalLevel -> no save");
            return;
        }
        if (iAcquireMedalLevel > iAcquireMedalLevel2) {
            e("three_circle_medal_dialog_intercept_message", achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: medalLevel -> save");
        } else if (jF >= jF2) {
            e("three_circle_medal_dialog_intercept_message", achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveThreeCircleMedalMessage: medalGainTime -> save");
        }
    }

    public static void c() {
        synchronized (d) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "showThreeCircleMedal");
            Context contextB = BaseApplication.b();
            String strE = osa.e(contextB, "three_circle_medal_dialog_intercept_message");
            if (TextUtils.isEmpty(strE)) {
                LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "showThreeCircleMedal: medalMessageJson is empty");
                return;
            }
            e("three_circle_medal_dialog_intercept_message", (AchieveMessage) null);
            AchieveMessage achieveMessage = (AchieveMessage) HiJsonUtil.d(strE, AchieveMessage.class);
            if (achieveMessage == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "showThreeCircleMedal: medalMessage is null");
            } else {
                if (!qrk.b(System.currentTimeMillis(), qrs.f(achieveMessage.getGainTime()))) {
                    LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "showThreeCircleMedal: !isSameDay");
                    return;
                }
                if ("C6_50".equals(achieveMessage.acquireMedalType())) {
                    achieveMessage.saveMedalType("C6");
                }
                e(contextB, achieveMessage);
            }
        }
    }

    private static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "removeMedalCacheMessage: medalId is empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "removeMedalCacheMessage: medalMessageSpKey is empty");
            return;
        }
        String strE = osa.e(BaseApplication.b(), str2);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        AchieveMessage achieveMessage = (AchieveMessage) HiJsonUtil.d(strE, AchieveMessage.class);
        if (achieveMessage == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "removeMedalCacheMessage: medalMessage is null");
        } else if (TextUtils.equals(achieveMessage.acquireMedalId(), str)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "removeMedalCacheMessage: remove -> " + str);
            e(str2, (AchieveMessage) null);
        }
    }

    public static void d(String str) {
        synchronized (d) {
            b(str, "three_circle_medal_dialog_intercept_message");
        }
        synchronized (f44757b) {
            for (AchieveMedalDialogScenario achieveMedalDialogScenario : AchieveMedalDialogScenario.values()) {
                b(str, achieveMedalDialogScenario.name());
            }
        }
    }

    private static void b(String str) {
        HashMap map = new HashMap(1);
        map.put("medalID", str);
        osf osfVarB = otl.b(BaseApplication.b()).b(9, map);
        if (osfVarB instanceof MedalConfigInfo) {
            MessageObject messageObjectE = otl.b(BaseApplication.b()).e((MedalConfigInfo) osfVarB);
            if (oru.a(BaseApplication.b()).getAdapter() != null) {
                LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "generateMessage: generate Medal Message");
                messageObjectE.setType(MessageConstant.ACQUIRE_MEDAL_TYPE);
                oru.a(BaseApplication.b()).getAdapter().generateMessage(messageObjectE);
            }
        }
    }

    public static boolean c(AchieveMessage achieveMessage) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptMedal");
        if (achieveMessage == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptMedal: medalMessage is null");
            return false;
        }
        if (e(achieveMessage)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptMedal: interceptThreeCircleMedal -> true");
            return true;
        }
        String strAcquireMedalType = achieveMessage.acquireMedalType();
        AchieveMedalDialogScenario medalDialogScenario = AchieveMedalDialogScenario.getMedalDialogScenario(strAcquireMedalType);
        if (medalDialogScenario == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptMedal: medalDialogScenario is null -> " + strAcquireMedalType);
            return false;
        }
        b(achieveMessage.acquireMedalId());
        if (e(strAcquireMedalType, medalDialogScenario) == 0) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "interceptMedal: priority is 0, no save -> " + strAcquireMedalType);
            return true;
        }
        synchronized (f44757b) {
            e(achieveMessage, medalDialogScenario);
        }
        return true;
    }

    private static void e(AchieveMessage achieveMessage, AchieveMedalDialogScenario achieveMedalDialogScenario) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: medalId -> " + achieveMessage.acquireMedalId());
        a(achieveMessage);
        String strName = achieveMedalDialogScenario.name();
        AchieveMessage achieveMessage2 = (AchieveMessage) HiJsonUtil.d(osa.e(BaseApplication.b(), strName), AchieveMessage.class);
        if (achieveMessage2 == null) {
            e(strName, achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: oldMedalMessage is null -> save");
            return;
        }
        long jF = qrs.f(achieveMessage.getGainTime());
        long jF2 = qrs.f(achieveMessage2.getGainTime());
        if (!qrk.b(jF, jF2)) {
            if (jF > jF2) {
                e(strName, achieveMessage);
                LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: !isSameDay -> save");
                return;
            } else {
                LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: !isSameDay -> no save");
                return;
            }
        }
        int iE = e(achieveMessage.acquireMedalType(), achieveMedalDialogScenario);
        int iE2 = e(achieveMessage2.acquireMedalType(), achieveMedalDialogScenario);
        if (iE < iE2) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: medalPriority -> no save");
            return;
        }
        if (iE > iE2) {
            e(strName, achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: medalPriority -> save");
            return;
        }
        int iAcquireMedalLevel = achieveMessage.acquireMedalLevel();
        int iAcquireMedalLevel2 = achieveMessage2.acquireMedalLevel();
        if (iAcquireMedalLevel < iAcquireMedalLevel2) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: medalLevel -> no save");
            return;
        }
        if (iAcquireMedalLevel > iAcquireMedalLevel2) {
            e(strName, achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: medalLevel -> save");
        } else if (jF >= jF2) {
            e(strName, achieveMessage);
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "saveMedalMessage: medalGainTime -> save");
        }
    }

    public static boolean b(AchieveMedalDialogScenario achieveMedalDialogScenario) {
        synchronized (f44757b) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "showMedalDialog");
            if (achieveMedalDialogScenario == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "showMedalDialog: medalDialogScenario is null");
                return false;
            }
            Context contextB = BaseApplication.b();
            String strName = achieveMedalDialogScenario.name();
            String strE = osa.e(contextB, strName);
            if (TextUtils.isEmpty(strE)) {
                LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "showMedalDialog: medalMessageJson is empty");
                return false;
            }
            e(strName, (AchieveMessage) null);
            AchieveMessage achieveMessage = (AchieveMessage) HiJsonUtil.d(strE, AchieveMessage.class);
            if (achieveMessage == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "showMedalDialog: medalMessage is null");
                return false;
            }
            if (!qrk.b(System.currentTimeMillis(), qrs.f(achieveMessage.getGainTime()))) {
                LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "showMedalDialog: !isSameDay");
                return false;
            }
            e(contextB, achieveMessage);
            return true;
        }
    }

    private static int e(String str, AchieveMedalDialogScenario achieveMedalDialogScenario) {
        HashMap<String, Integer> map;
        Integer num = 0;
        if (!TextUtils.isEmpty(str) && achieveMedalDialogScenario != null && (map = achieveMedalDialogScenario.medalPriority) != null) {
            num = map.get(str);
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static void e(Context context, AchieveMessage achieveMessage) {
        if (context == null || achieveMessage == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDialogInterceptor", "startMedalDialogActivity: context or medalMessage is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalDialogInterceptor", "startMedalDialogActivity: " + achieveMessage.acquireMedalId());
        try {
            Intent intent = new Intent();
            intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_MEDAL_MESSAGE_DIALOG);
            intent.putExtra("message", achieveMessage);
            intent.putExtra("isMedalDialogInterceptorJump", true);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalDialogInterceptor", "startMedalDialogActivity: activityNotFoundException");
        }
    }
}
