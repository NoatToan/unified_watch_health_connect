package com.huawei.health.marketing.request;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import defpackage.njy;
import health.compact.a.GRSManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class RecommendResourceReq implements IRequest {
    private static final String ITEM_KEY = "itemNum=";
    private static final String PARAMS_CONNECTOR_SYMBOL = "&";
    private static final String PARAMS_KEY = "scenarioIds=";
    private static final String RECOMMENDRESOURCE_PATH = "/positionservice/v1/recommendresources?";
    private static final String TAG = "RecommendResourceReq";

    @SerializedName("itemNum")
    private int itemNum;

    @SerializedName("scenarioIds")
    private List<String> scenarioIds;

    public int getItemNum() {
        return this.itemNum;
    }

    public void setItemNum(int i) {
        this.itemNum = i;
    }

    public List<String> getScenarioIds() {
        return this.scenarioIds;
    }

    public void setScenarioIds(List<String> list) {
        this.scenarioIds = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        String str = GRSManager.c(BaseApplication.getContext()).getUrl("marketingUrl") + RECOMMENDRESOURCE_PATH;
        if (!njy.e(this.scenarioIds)) {
            StringBuilder sb = new StringBuilder(str);
            List<String> listRemoveEmptyString = removeEmptyString(this.scenarioIds);
            this.scenarioIds = listRemoveEmptyString;
            if (!njy.e(listRemoveEmptyString)) {
                for (String str2 : this.scenarioIds) {
                    if (this.scenarioIds.indexOf(str2) != 0) {
                        sb.append("&");
                    }
                    sb.append(PARAMS_KEY);
                    sb.append(str2);
                }
                sb.append("&itemNum=");
                sb.append(this.itemNum);
                LogUtil.a(TAG, "getUrl ", sb.toString());
                return sb.toString();
            }
        }
        return str;
    }

    private List<String> removeEmptyString(List<String> list) {
        if (njy.e(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "RecommendResourceReq{scenarioIds=" + this.scenarioIds + '}';
    }
}
