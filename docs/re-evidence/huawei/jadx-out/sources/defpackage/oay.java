package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.medal.model.TrackData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes40.dex */
public class oay {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44023c = new Object();

    public static void e(ArrayList<TrackData> arrayList) {
        if (njy.e(arrayList)) {
            return;
        }
        synchronized (f44023c) {
            LogUtil.a("AchieveMedalDataMgr", "enter dealAchieveTrackData():");
            crh crhVar = new crh();
            crhVar.e("A4").dealMedalGenerate(arrayList);
            for (TrackData trackData : arrayList) {
                if (trackData == null) {
                    LogUtil.j("AchieveMedalDataMgr", "enter dealAchieveTrackData(): data is null");
                } else {
                    crhVar.e(pax.b(trackData.acquireType())).dealMedalGenerate(trackData);
                }
            }
        }
    }
}
