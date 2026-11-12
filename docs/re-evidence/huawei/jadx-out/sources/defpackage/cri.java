package defpackage;

import android.content.Context;
import com.huawei.factory.MedalTypeAccessible;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.medal.model.TrackData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cri implements MedalTypeAccessible {
    @Override // com.huawei.factory.MedalTypeAccessible
    public void dealMedalGenerate(ArrayList<TrackData> arrayList) {
    }

    public void b(TrackData trackData) {
        Context context = BaseApplication.getContext();
        otl otlVarB = otl.b(context);
        if (crl.b(otlVarB, context) || trackData == null) {
            return;
        }
        double dA = paw.a((long) trackData.acquireDistance(), !pax.a(trackData.acquireType()));
        HashMap map = new HashMap(2);
        ArrayList arrayList = new ArrayList(8);
        List<osf> listD = otlVarB.d(9, map);
        ArrayList<String> arrayListL = otlVarB.l();
        if (listD == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_SingleStableMedalCalculate", "medalConfigInfos size ", Integer.valueOf(listD.size()));
        double d = 0.0d;
        String strAcquireMedalID = "";
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (pax.b(trackData.acquireType()).equals(medalConfigInfo.acquireMedalType())) {
                    if ("A3".equals(pax.b(trackData.acquireType()))) {
                        if (trackData.acquireTrackTime() <= oxi.d(medalConfigInfo.acquireTakeEffectTime())) {
                        }
                    }
                    String strAcquireMedalID2 = medalConfigInfo.acquireMedalID();
                    double dC = c(medalConfigInfo);
                    if (dA >= dC && !arrayListL.contains(strAcquireMedalID2)) {
                        LogUtil.a("PLGACHIEVE_SingleStableMedalCalculate", "medalIdTmp ", strAcquireMedalID2);
                        arrayList.add(medalConfigInfo);
                        if (dC > d) {
                            strAcquireMedalID = medalConfigInfo.acquireMedalID();
                            d = dC;
                        }
                    }
                }
            }
        }
        crl.a(context, arrayList, strAcquireMedalID);
    }

    private double c(MedalConfigInfo medalConfigInfo) {
        if (medalConfigInfo == null) {
            return 0.0d;
        }
        String strAcquireMedalID = medalConfigInfo.acquireMedalID();
        if ("3".equals(strAcquireMedalID)) {
            return 21.0975d;
        }
        if ("4".equals(strAcquireMedalID)) {
            return 42.195d;
        }
        return ((double) medalConfigInfo.acquireMedalLevel()) * 1.0d;
    }

    @Override // com.huawei.factory.MedalTypeAccessible
    public void dealMedalGenerate(final TrackData trackData) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cri.4
            @Override // java.lang.Runnable
            public void run() {
                cri.this.b(trackData);
            }
        });
    }
}
