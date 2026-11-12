package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.PersonalDataCallback;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.otl;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class wsg {
    public static void a(Context context, int i) {
        if (context == null) {
            LogUtil.j("UIME_AchieveInteractors", "dispatchClickEvent context null");
            return;
        }
        LogUtil.a("UIME_AchieveInteractors", "dispatchClickEvent key=", Integer.valueOf(i));
        b(context, i);
        if (i == 1) {
            oru.a(context).i(context);
            return;
        }
        if (i == 2) {
            d(context);
            oru.a(context).h(context);
            return;
        }
        if (i == 3) {
            oru.a(context).c(context);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            oru.a(context).g(context);
        } else {
            oru.a(context).j(context);
            LogUtil.j("UIME_AchieveInteractors", "showAchieveReport isOversea.");
            osa.b(context, "generateAchieveTime", "");
            owj.b(context).j(context);
        }
    }

    private static void b(Context context, int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        if (i == 1) {
            lmf.d().c(context, AnalyticsValue.HEALTH_MINE_MY_RANK_2040005.value(), map, 0);
            return;
        }
        if (i == 2) {
            lmf.d().c(context, AnalyticsValue.HEALTH_MINE_MY_MEDAL_2040012.value(), map, 0);
            return;
        }
        if (i == 3) {
            lmf.d().c(context, AnalyticsValue.HEALTH_MINE_MY_KAKA_2040011.value(), map, 0);
        } else if (i == 4) {
            lmf.d().c(context, AnalyticsValue.HEALTH_MINE_MY_REPORT_2040010.value(), map, 0);
        } else {
            if (i != 5) {
                return;
            }
            lmf.d().c(context, AnalyticsValue.HEALTH_MINE_ACHIEVE_REPORT_2040062.value(), map, 0);
        }
    }

    private static void d(Context context) {
        if (!Utils.h()) {
            LogUtil.j("UIME_AchieveInteractors", "doMedalPageStartEvent return");
            return;
        }
        String strE = osa.e(context, "_medalPngStatusDownloadDoing");
        if (TextUtils.isEmpty(strE) || "done".equals(strE)) {
            otl.b(context).y();
        }
        if (Utils.o()) {
            LogUtil.j("UIME_AchieveInteractors", "showAchieveMedal isOversea.");
            osa.b(context, "generateAchieveMedalTime", "");
        }
        otl.b(context).j();
        owj.b(context).j(context);
    }

    public static void b(final Context context) {
        if (context == null) {
            LogUtil.j("UIME_AchieveInteractors", "judgeWechatIsBind context null");
        } else if (otu.b(context).f()) {
            LogUtil.j("UIME_AchieveInteractors", "judgeWechatIsBind return");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wsg.1
                @Override // java.lang.Runnable
                public void run() {
                    if ("true".equals(wss.d(context).c(context))) {
                        LogUtil.a("UIME_AchieveInteractors", "judgeWechatIsBind done");
                        otu.b(context).e();
                    }
                }
            });
        }
    }

    public static void a(Handler handler) {
        final Context context = BaseApplication.getContext();
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.interactors.AchieveInteractors$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                otl.b(context).g();
            }
        });
        b(handler);
        owj.b(context).e(context);
        owj.b(context).d(context);
        owj.b(context).a(context);
    }

    public static void b(Handler handler) {
        e(handler);
        c(handler);
    }

    private static void e(final Handler handler) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wsg.2
            @Override // java.lang.Runnable
            public void run() {
                oru oruVarA = oru.a(BaseApplication.getContext());
                PersonalData personalDataE = oruVarA.e(BaseApplication.getContext());
                d dVar = new d(personalDataE, null);
                if (personalDataE != null) {
                    osa.b(BaseApplication.getContext(), "_personalCenterStatus", "[" + personalDataE.getSumKakaNum() + "," + personalDataE.getPersonalLevel() + "]");
                }
                Handler handler2 = handler;
                if (handler2 != null) {
                    handler.sendMessage(handler2.obtainMessage(80, dVar));
                } else {
                    LogUtil.j("UIME_AchieveInteractors", "doRefreshPersonalDataFromSQL innerHandler null");
                }
                oruVarA.b(new PersonalDataCallback() { // from class: wsg.2.4
                    @Override // com.huawei.pluginachievement.impl.PersonalDataCallback
                    public void onPersonalDataChange(PersonalData personalData) {
                        LogUtil.a("UIME_AchieveInteractors", "getPersonalData() back.");
                        d dVar2 = new d(personalData, null);
                        wsg.d(wsp.d(personalData));
                        if (handler != null) {
                            handler.sendMessage(handler.obtainMessage(80, dVar2));
                        } else {
                            LogUtil.j("UIME_AchieveInteractors", "cloud innerHandler null");
                        }
                    }
                }, BaseApplication.getContext());
                wsg.c(BaseApplication.getContext(), handler, oruVarA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("value", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.KAKA_STATISTIC_1100089.value(), map, 0);
    }

    private static void c(final Handler handler) {
        if (handler == null) {
            LogUtil.j("UIME_AchieveInteractors", "doRefreshPersonalDataFromSQL handler null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wsg.4
                @Override // java.lang.Runnable
                public void run() {
                    oru oruVarA = oru.a(BaseApplication.getContext());
                    String strE = osa.e(BaseApplication.getContext(), "_medalGainStatus");
                    if (!TextUtils.isEmpty(strE) && handler != null) {
                        handler.sendMessage(handler.obtainMessage(80, new d(null, wsg.a(strE))));
                    }
                    ArrayList<String> arrayListB = oruVarA.b(BaseApplication.getContext());
                    if (arrayListB != null) {
                        osa.b(BaseApplication.getContext(), "_medalGainStatus", arrayListB.toString());
                    }
                    if (handler != null) {
                        handler.sendMessage(handler.obtainMessage(80, new d(null, arrayListB)));
                        return;
                    }
                    LogUtil.j("UIME_AchieveInteractors", "refreshMedalLayout innerHandler null");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<String> a(String str) {
        String[] strArrSplit;
        ArrayList<String> arrayList = new ArrayList<>(10);
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.replace("[", "").replace("]", "").replace(" ", "").split(",")) != null && strArrSplit.length != 0) {
            Collections.addAll(arrayList, strArrSplit);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, final Handler handler, oru oruVar) {
        if (VersionControlUtil.isSupportOperationAccount()) {
            String strE = osa.e(context, "kakaLastCheckInTime");
            if (TextUtils.isEmpty(strE)) {
                oruVar.e(new IBaseResponseCallback() { // from class: wsg.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("UIME_AchieveInteractors", "getKakaCheckStatus == ", obj);
                        Handler handler2 = handler;
                        if (handler2 != null) {
                            handler.sendMessage(handler2.obtainMessage(81, obj));
                        } else {
                            LogUtil.j("UIME_AchieveInteractors", "cloud innerHandler null");
                        }
                    }
                });
            } else if (handler != null) {
                handler.sendMessage(handler.obtainMessage(81, Boolean.valueOf(osb.a(strE))));
            }
        }
    }

    public static boolean a(final Context context) {
        if (context == null || CommonUtil.o(context) != 1 || !TextUtils.isEmpty(osa.e(context, "_medalTextureDownload"))) {
            return true;
        }
        LogUtil.d("UIME_AchieveInteractors", "init downloadTexture!");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.userprofile.interactors.AchieveInteractors$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                otl.b(context).w();
            }
        });
        return false;
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<String> f52402c;
        private PersonalData d;

        public d(PersonalData personalData, ArrayList<String> arrayList) {
            this.d = personalData;
            this.f52402c = arrayList;
        }

        public PersonalData e() {
            return this.d;
        }

        public ArrayList<String> b() {
            return this.f52402c;
        }
    }
}
