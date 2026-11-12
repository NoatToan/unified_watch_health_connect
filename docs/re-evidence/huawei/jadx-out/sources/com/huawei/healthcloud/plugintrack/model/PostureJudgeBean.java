package com.huawei.healthcloud.plugintrack.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class PostureJudgeBean implements Serializable {
    private static final String GOOD = "good";
    private static final int MAX_VALUE = 50000;
    private static final int MIN_VALUE = 0;
    private static final String NORMAL = "normal";
    private static final String PERFECT = "perfect";
    private static final String POOR = "poor";
    private static final String SUBOPTIMAL = "suboptimal";
    private static final String TAG = "Track_PostureJudgeBean";
    private static final long serialVersionUID = 2324322170929969061L;

    @SerializedName("paceList")
    private List<a> mPaceJudgeList;

    @SerializedName("type")
    private String mType;

    public String getType() {
        return this.mType;
    }

    public List<a> getPaceList() {
        return this.mPaceJudgeList;
    }

    public static class a implements Serializable {
        private static final long serialVersionUID = -101120795072465394L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("judgeDataList")
        Map<String, List<Float>> f10491b = new HashMap();

        @SerializedName("pace")
        List<Integer> d;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Map<String, List<Float>> map = this.f10491b;
            if (map == null) {
                LogUtil.e(PostureJudgeBean.TAG, "map is null");
                return "";
            }
            for (Map.Entry<String, List<Float>> entry : map.entrySet()) {
                if (entry == null || entry.getValue() == null) {
                    return "";
                }
                sb.append("Key = ");
                sb.append(entry.getKey());
                sb.append(", Value = ");
                sb.append(entry.getValue().size());
            }
            return "PaceJudge{pace=" + this.d + ", list=" + ((Object) sb) + '}';
        }

        public int d() {
            List<Integer> list = this.d;
            if (list == null || list.size() != 2 || this.d.get(0) == null) {
                return 0;
            }
            return this.d.get(0).intValue();
        }

        public List<Float> a() {
            ArrayList arrayList = new ArrayList();
            Map<String, List<Float>> map = this.f10491b;
            if (map == null) {
                LogUtil.a(PostureJudgeBean.TAG, "getJudgeList,map is null");
                return arrayList;
            }
            int i = 0;
            for (Map.Entry<String, List<Float>> entry : map.entrySet()) {
                if (entry != null && !njy.e(entry.getValue(), 1)) {
                    if (PostureJudgeBean.PERFECT.equals(entry.getKey()) && entry.getValue().get(0).floatValue() == 0.0f) {
                        i = 1;
                    }
                    Float f = entry.getValue().get(i);
                    float fFloatValue = f.floatValue();
                    if (Math.abs(fFloatValue - 50000.0f) >= 1.0E-7d && Math.abs(fFloatValue - 0.0f) >= 1.0E-7d) {
                        arrayList.add(f);
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<a> list = this.mPaceJudgeList;
        if (list == null) {
            return "";
        }
        for (a aVar : list) {
            if (aVar != null) {
                sb.append(aVar.toString());
            }
        }
        return "Judge{type='" + this.mType + "', list=" + ((Object) sb) + '}';
    }
}
