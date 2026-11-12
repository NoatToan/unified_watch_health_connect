package com.huami.ad.utils;

import android.text.TextUtils;
import com.huami.ad.entity.LaunchAd;
import com.huami.ad.repo.LaunchRepo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.LaunchEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchEntityProbabilityUtils {
    private static final String a = "LaunchEntityProbabilityUtils";

    private static int a(List<LaunchAd> list) {
        int probability = 0;
        for (int i = 0; i < list.size(); i++) {
            probability += list.get(i).getProbability();
        }
        HMLog.d(a, "totalProbality is " + probability, new Object[0]);
        return probability;
    }

    private static HashMap<LaunchRepo.Range, LaunchAd> b(List<LaunchAd> list) {
        HashMap<LaunchRepo.Range, LaunchAd> map = new HashMap<>();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            int probability = list.get(i).getProbability() + i2;
            map.put(new LaunchRepo.Range(i2, probability), list.get(i));
            i++;
            i2 = probability;
        }
        return map;
    }

    public static int getProbability(LaunchEntity launchEntity) {
        String extensions = launchEntity.getExtensions();
        if (TextUtils.isEmpty(extensions)) {
            return 0;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(extensions).optJSONObject("assets");
            if (jSONObjectOptJSONObject != null) {
                return Integer.parseInt(jSONObjectOptJSONObject.optString("text"));
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static LaunchAd pickRandomEntity(List<LaunchAd> list) {
        int iA = a(list);
        HashMap<LaunchRepo.Range, LaunchAd> mapB = b(list);
        String str = a;
        HMLog.d(str, "map " + mapB.isEmpty(), new Object[0]);
        Random random = new Random(System.currentTimeMillis());
        if (iA < 100) {
            iA = 100;
        }
        int iNextInt = random.nextInt(iA);
        HMLog.d(str, "random count " + iNextInt, new Object[0]);
        Iterator<Map.Entry<LaunchRepo.Range, LaunchAd>> it2 = mapB.entrySet().iterator();
        while (it2.hasNext()) {
            LaunchRepo.Range key = it2.next().getKey();
            if (key.inRange(iNextInt)) {
                return mapB.get(key);
            }
        }
        return null;
    }
}
