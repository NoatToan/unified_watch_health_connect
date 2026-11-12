package com.huawei.health.suggestion.data;

import com.huawei.basefitnessadvice.callback.UiCallback;
import defpackage.hcz;
import defpackage.hda;
import defpackage.hdc;
import defpackage.hde;
import defpackage.hdh;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public interface DietDataApi {
    void getCustomFoods(int i, int i2, Set<String> set, UiCallback<JSONObject> uiCallback);

    void getDietSummaryCloud(double d, double d2, int i, int i2, UiCallback<JSONObject> uiCallback);

    void getFoodRecommendArea(UiCallback<hda> uiCallback);

    void getFoodRecommendDetail(String str, String str2, hcz hczVar, UiCallback<hdh> uiCallback);

    void getReplaceList(String str, int i, List<String> list, UiCallback<List<hdc>> uiCallback);

    void saveReplaceFood(hde hdeVar, UiCallback<String> uiCallback);
}
