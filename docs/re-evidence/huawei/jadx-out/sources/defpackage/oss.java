package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class oss {
    public static ArrayList<String> a(List<osf> list, ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        ArrayList<String> arrayList3 = new ArrayList(0);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalDownRule", "findFirstMedalLevelIdList medalConfigInfoList is empty.");
            return arrayList2;
        }
        for (osf osfVar : list) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (medalConfigInfo.acquireMedalType().length() < 3) {
                    String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                    if (!arrayList3.contains(strAcquireMedalType)) {
                        arrayList3.add(strAcquireMedalType);
                    }
                }
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalDownRule", "findFirstMedalLevelIdList typeList ", arrayList3.toString());
        for (String str : arrayList3) {
            String str2 = "";
            int i = 0;
            for (osf osfVar2 : list) {
                if (osfVar2 instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo2 = (MedalConfigInfo) osfVar2;
                    if (medalConfigInfo2.acquireMedalType().equals(str) && !arrayList.contains(medalConfigInfo2.acquireMedalID()) && medalConfigInfo2.acquireMedalType().length() < 3) {
                        String strAcquireMedalID = medalConfigInfo2.acquireMedalID();
                        int iAcquireMedalLevel = medalConfigInfo2.acquireMedalLevel();
                        if (i == 0 || i >= iAcquireMedalLevel) {
                            i = iAcquireMedalLevel;
                            str2 = strAcquireMedalID;
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
            }
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalDownRule", "findFirstMedalLevelIdList list ", arrayList2.toString());
        return arrayList2;
    }
}
