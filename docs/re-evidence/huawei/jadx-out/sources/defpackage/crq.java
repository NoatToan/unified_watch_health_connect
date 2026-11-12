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
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class crq implements MedalTypeAccessible {
    @Override // com.huawei.factory.MedalTypeAccessible
    public void dealMedalGenerate(TrackData trackData) {
    }

    public static void d(ArrayList<TrackData> arrayList) {
        Context context = BaseApplication.getContext();
        otl otlVarB = otl.b(context);
        if (crl.b(otlVarB, context)) {
            return;
        }
        int iC = c(c(arrayList));
        LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", "medalLevel:", Integer.valueOf(iC));
        if (iC == 0) {
            return;
        }
        HashMap map = new HashMap(2);
        ArrayList arrayList2 = new ArrayList(8);
        List<osf> listD = otlVarB.d(9, map);
        ArrayList<String> arrayListL = otlVarB.l();
        if (listD == null) {
            return;
        }
        double d = 0.0d;
        String strAcquireMedalID = "";
        for (osf osfVar : listD) {
            if (!(osfVar instanceof MedalConfigInfo)) {
                return;
            }
            MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
            if ("A4".equals(medalConfigInfo.acquireMedalType())) {
                String strAcquireMedalID2 = medalConfigInfo.acquireMedalID();
                double d2 = iC;
                if (d2 >= ((double) medalConfigInfo.acquireMedalLevel()) * 1.0d && !arrayListL.contains(strAcquireMedalID2)) {
                    arrayList2.add(medalConfigInfo);
                    if (d2 > d) {
                        strAcquireMedalID = medalConfigInfo.acquireMedalID();
                        d = d2;
                    }
                }
            }
        }
        if (arrayList2.size() == 0 || "".equals(strAcquireMedalID)) {
            return;
        }
        LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", "medalId:", strAcquireMedalID);
        crl.a(context, arrayList2, strAcquireMedalID);
    }

    private static int c(Map<String, ArrayList<TrackData>> map) {
        int i = 0;
        for (Map.Entry<String, ArrayList<TrackData>> entry : map.entrySet()) {
            ArrayList<TrackData> value = entry.getValue();
            LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", "trackDataMap key:", entry.getKey());
            if (value.size() != 0) {
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                for (TrackData trackData : value) {
                    double dC = paw.c((long) trackData.acquireDistance());
                    LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", "trackDataMap value:", Long.valueOf(trackData.acquireTrackTime()));
                    if (pax.a(trackData.acquireType()) && dC > d) {
                        LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", " runMaxDistance ", Double.valueOf(dC));
                        d = dC;
                    }
                    if (pax.e(trackData.acquireType()) && dC > d2) {
                        LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", " bikeMaxDistance ", Double.valueOf(dC));
                        d2 = dC;
                    }
                    if (pax.c(trackData.acquireType()) && dC > d3) {
                        LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", " swimMaxDistance ", Double.valueOf(dC));
                        d3 = dC;
                    }
                }
                if (d >= 10.0d && d2 >= 40.0d && d3 >= 1.5d) {
                    return 2;
                }
                if (d < 5.0d || d2 < 20.0d || d3 < 0.75d) {
                    LogUtil.a("PLGACHIEVE_TriathlonStableMedalCalculate", "No achieve triathlon!");
                } else {
                    i = 1;
                }
            }
        }
        return i;
    }

    private static Map<String, ArrayList<TrackData>> c(ArrayList<TrackData> arrayList) {
        HashMap map = new HashMap(8);
        for (TrackData trackData : arrayList) {
            String strB = crl.b(trackData.acquireTrackTime());
            if (map.containsKey(strB)) {
                ((ArrayList) map.get(strB)).add(trackData);
            } else {
                ArrayList arrayList2 = new ArrayList(8);
                arrayList2.add(trackData);
                map.put(strB, arrayList2);
            }
        }
        return map;
    }

    @Override // com.huawei.factory.MedalTypeAccessible
    public void dealMedalGenerate(final ArrayList<TrackData> arrayList) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: crq.1
            @Override // java.lang.Runnable
            public void run() {
                crq.d(arrayList);
            }
        });
    }
}
