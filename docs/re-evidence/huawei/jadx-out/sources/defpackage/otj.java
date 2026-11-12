package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class otj {
    public static void a(Context context, double d, otl otlVar, String str) {
        LogUtil.a("PLGACHIEVE_AchieveContinuousStableMedalService", "Enter dealMedalGenerate");
        if (oue.a(otlVar, context)) {
            LogUtil.j("PLGACHIEVE_AchieveContinuousStableMedalService", "dealMedalGenerate isEmptyContextAndService!");
            return;
        }
        if (TextUtils.isEmpty(osa.e(context, "personal"))) {
            LogUtil.j("PLGACHIEVE_AchieveContinuousStableMedalService", "dealMedalGenerate flag is null");
            return;
        }
        HashMap map = new HashMap(2);
        ArrayList arrayList = new ArrayList(8);
        List<osf> listD = otlVar.d(9, map);
        ArrayList<String> arrayListL = otlVar.l();
        if (njy.e(listD)) {
            LogUtil.j("PLGACHIEVE_AchieveContinuousStableMedalService", "medalConfigInfos isEmpty!");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveContinuousStableMedalService", "medalConfigInfos size ", Integer.valueOf(listD.size()), "lightUpMedalList  ", arrayListL.toString(), "value ", Double.valueOf(d));
        int i = 0;
        String strAcquireMedalID = "";
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (str.equals(medalConfigInfo.acquireMedalType())) {
                    String strAcquireMedalID2 = medalConfigInfo.acquireMedalID();
                    int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
                    if (d >= iAcquireMedalLevel && !arrayListL.contains(strAcquireMedalID2)) {
                        LogUtil.a("PLGACHIEVE_AchieveContinuousStableMedalService", "medalIdTmp ", strAcquireMedalID2);
                        arrayList.add(medalConfigInfo);
                        if (iAcquireMedalLevel > i) {
                            strAcquireMedalID = medalConfigInfo.acquireMedalID();
                            i = iAcquireMedalLevel;
                        }
                    }
                }
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveContinuousStableMedalService", "dealStableMedal MedalList  ", Integer.valueOf(arrayList.size()));
        oue.b(context, (ArrayList<MedalConfigInfo>) arrayList, strAcquireMedalID);
    }
}
