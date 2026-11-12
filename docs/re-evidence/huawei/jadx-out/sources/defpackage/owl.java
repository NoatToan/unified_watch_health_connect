package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class owl {
    public static ozm b(String str, int i) {
        ozm ozmVar;
        ozm ozmVar2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() != 0) {
                    long j = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        long jE = osv.e("value", jSONObject);
                        long jE2 = osv.e("startTime", jSONObject);
                        if (oxi.a(i, jE2)) {
                            ozmVar = new ozm();
                            try {
                                int iA = osv.a("source", jSONObject);
                                if (jE > j) {
                                    ozmVar.c(jE);
                                    ozmVar.d(jE2);
                                    ozmVar.b(iA);
                                    j = jE;
                                }
                                ozmVar2 = ozmVar;
                            } catch (JSONException e) {
                                e = e;
                                LogUtil.e("PLGACHIEVE_AchieveAnnualPBDataHlr", "parseBestMotionByYear Exception:", e.getMessage());
                                return ozmVar;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                ozmVar = ozmVar2;
            }
        }
        return ozmVar2;
    }

    public static ozp c(String str, int i) {
        ozp ozpVar = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_AchieveAnnualPBDataHlr", "parseBestStep reportData is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ozp ozpVar2 = null;
            int i2 = 0;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    int iA = osv.a("value", jSONObject);
                    int iA2 = osv.a(ParsedFieldTag.RECORD_DAY, jSONObject);
                    if (oxi.e(i, iA2)) {
                        ozp ozpVar3 = new ozp();
                        if (iA > i2) {
                            try {
                                ozpVar3.d(iA);
                                ozpVar3.a(iA2);
                                i2 = iA;
                            } catch (JSONException e) {
                                e = e;
                                ozpVar = ozpVar3;
                                LogUtil.e("PLGACHIEVE_AchieveAnnualPBDataHlr", "parseBestStepByYear Exception:", e.getMessage());
                                return ozpVar;
                            }
                        }
                        ozpVar2 = ozpVar3;
                    }
                } catch (JSONException e2) {
                    e = e2;
                    ozpVar = ozpVar2;
                }
            }
            return ozpVar2;
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public static ArrayList<String> a(int i, List<osf> list) {
        long j;
        ArrayList<String> arrayList = new ArrayList<>(0);
        if (list == null) {
            return arrayList;
        }
        long jA = oxi.a(i, true);
        long jA2 = oxi.a(i, false);
        HashMap map = new HashMap(list.size());
        for (osf osfVar : list) {
            if (osfVar instanceof MedalLocation) {
                MedalLocation medalLocation = (MedalLocation) osfVar;
                if (medalLocation.acquireGainedCount() >= 1) {
                    try {
                        j = Long.parseLong(medalLocation.acquireMedalGainedTime());
                    } catch (NumberFormatException unused) {
                        LogUtil.e("PLGACHIEVE_AchieveAnnualPBDataHlr", "getData() NumberFormatException");
                        j = 0;
                    }
                    if (j >= jA && j <= jA2) {
                        map.put(medalLocation.acquireMedalID(), Long.valueOf(j));
                    }
                }
            }
        }
        return b(map);
    }

    private static ArrayList<String> b(Map<String, Long> map) {
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: owl.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                if (entry.getValue().longValue() - entry2.getValue().longValue() > 0) {
                    return -1;
                }
                if (entry.getValue().longValue() - entry2.getValue().longValue() != 0) {
                    return 1;
                }
                String key = entry.getKey();
                String key2 = entry2.getKey();
                int length = key.length();
                int length2 = key2.length();
                return length2 == length ? key2.compareTo(key) : length2 - length;
            }
        });
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList2;
    }
}
