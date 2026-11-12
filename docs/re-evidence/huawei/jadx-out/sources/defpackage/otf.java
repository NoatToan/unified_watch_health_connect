package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.gltexture.util.FileUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class otf {
    public static Map<String, ouq> c(List<osf> list, List<osf> list2) {
        return c(list2, d(list));
    }

    private static Map<String, MedalLocation> d(List<osf> list) {
        HashMap map = new HashMap();
        if (!njy.e(list)) {
            for (osf osfVar : list) {
                if (osfVar instanceof MedalLocation) {
                    MedalLocation medalLocation = (MedalLocation) osfVar;
                    map.put(medalLocation.acquireMedalID(), medalLocation);
                }
            }
        }
        return map;
    }

    public static ArrayList<our> b(List<osf> list, List<osf> list2) {
        return b(list2, d(list));
    }

    private static ArrayList<our> b(List<osf> list, Map<String, MedalLocation> map) {
        ArrayList<our> arrayList = new ArrayList<>(8);
        if (!njy.e(list)) {
            for (osf osfVar : list) {
                if (osfVar instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                    String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                    if (!TextUtils.isEmpty(strAcquireMedalType) && (strAcquireMedalType.length() < 3 || pax.n(strAcquireMedalType))) {
                        if (map.containsKey(medalConfigInfo.acquireMedalID())) {
                            MedalLocation medalLocation = map.get(medalConfigInfo.acquireMedalID());
                            our ourVar = new our();
                            if (medalLocation != null && medalLocation.acquireGainedCount() > 0) {
                                ourVar.b(medalLocation.acquireMedalID());
                                ourVar.b(medalLocation.acquireGainedCount());
                                ourVar.e(medalLocation.acquireMedalGainedTime());
                                ourVar.b(medalLocation.acquireTimestamp());
                                ourVar.c(strAcquireMedalType);
                                arrayList.add(ourVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static Map<String, ouq> c(List<osf> list, Map<String, MedalLocation> map) {
        HashMap map2 = new HashMap();
        if (!njy.e(list)) {
            for (osf osfVar : list) {
                if (osfVar instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                    ouq.c cVarD = d(medalConfigInfo);
                    if (map.containsKey(medalConfigInfo.acquireMedalID())) {
                        MedalLocation medalLocation = map.get(medalConfigInfo.acquireMedalID());
                        cVarD.a(medalLocation.acquireMedalGainedTime()).a(medalLocation.acquireGainedCount()).b(medalLocation.acquireFirstTabPriority()).b(medalLocation.acquireFirstTabDesc()).f(medalLocation.acquireSecondTabPriority()).o(medalLocation.acquireSecondTabDesc()).g(medalLocation.acquireMedalWeight());
                    }
                    map2.put(medalConfigInfo.acquireMedalID(), cVarD.a());
                }
            }
        }
        return map2;
    }

    private static ouq.c d(MedalConfigInfo medalConfigInfo) {
        if (medalConfigInfo == null) {
            return null;
        }
        return new ouq.c(medalConfigInfo.acquireMedalID()).e(medalConfigInfo.acquireActionType()).c(medalConfigInfo.acquireEndTime()).g(medalConfigInfo.acquireStartTime()).j(medalConfigInfo.acquireGrayDescription()).f(medalConfigInfo.acquireLightDescription()).d(medalConfigInfo.acquireMedalLabel()).h(medalConfigInfo.acquireMessage()).n(medalConfigInfo.acquireTakeEffectTime()).i(medalConfigInfo.acquireMedalName()).h(medalConfigInfo.acquireMedalUnit()).m(medalConfigInfo.acquireMedalType()).a(medalConfigInfo.acquireTimestamp()).d(medalConfigInfo.acquireGrayPromotionName()).e(medalConfigInfo.acquireLightPromotionName()).c(medalConfigInfo.acquireGoal()).i(medalConfigInfo.acquireMedalLevel()).j(medalConfigInfo.acquireRepeatable()).m(medalConfigInfo.acquireEventStatus());
    }

    public static void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: otf.3
            @Override // java.lang.Runnable
            public void run() {
                otf.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        otl otlVarB = otl.b(BaseApplication.b());
        List<osf> listD = otlVarB.d(9, new HashMap(2));
        ArrayList<String> arrayListL = otlVarB.l();
        if (listD == null) {
            return;
        }
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (!TextUtils.isEmpty(medalConfigInfo.acquireMedalType())) {
                    String strAcquireMedalID = medalConfigInfo.acquireMedalID();
                    String strAcquireEndTime = medalConfigInfo.acquireEndTime();
                    if (!pax.d(strAcquireEndTime, arrayListL.contains(strAcquireMedalID) ? 1 : 0)) {
                        LogUtil.a("PLGACHIEVE_PLGACHIEVE_MedalConfigInteractor", "clearEventMedalGenerate medalId=", strAcquireMedalID, " type=", medalConfigInfo.acquireMedalType(), " name=", medalConfigInfo.acquireMedalName(), " endTime=", oul.d(BaseApplication.b(), oxi.d(strAcquireEndTime)));
                        File file = new File(pax.d(pax.e(strAcquireMedalID)));
                        boolean zExists = file.exists();
                        if (zExists) {
                            LogUtil.j("PLGACHIEVE_PLGACHIEVE_MedalConfigInteractor", "clearEventMedalGenerate isPngExists ", Boolean.valueOf(zExists));
                            FileUtil.e(file);
                        }
                        File file2 = new File(osz.c(strAcquireMedalID));
                        boolean zExists2 = file2.exists();
                        if (zExists2) {
                            LogUtil.j("PLGACHIEVE_PLGACHIEVE_MedalConfigInteractor", "clearEventMedalGenerate is3dExists ", Boolean.valueOf(zExists2));
                            FileUtil.e(file2);
                        }
                    }
                }
            }
        }
    }
}
