package com.huami.device.feature.quickcards.cloud.resouce.impl;

import com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.NetworkApi;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J!\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResourceImpl;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardRequestBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponse;", "", "jsonString", "b", "id", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardId;", "a", "request", "", "source", "queryData", "(Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardRequestBean;Ljava/lang/Integer;)Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponse;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "networkApi", "<init>", "(Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class QuickCardResourceImpl implements CloudResourceApi<QuickCardRequestBean, QuickCardResponse> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NetworkApi networkApi;

    public QuickCardResourceImpl(@NotNull NetworkApi networkApi) {
        this.networkApi = networkApi;
    }

    private final QuickCardId a(String id) throws Exception {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) id, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
        if (listSplit$default.size() >= 2) {
            return new QuickCardId((String) listSplit$default.get(0), (String) listSplit$default.get(1));
        }
        throw new Exception("id can not parser for ");
    }

    private final QuickCardResponse b(String jsonString) throws Exception {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (jsonString == null || jsonString.length() == 0) {
            throw new Exception("response data is null or empty.");
        }
        JSONArray jSONArray = new JSONArray(jsonString);
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                QuickCardId quickCardIdA = a(jSONObject.getString("id"));
                arrayList.add(new QuickCardResponseItem(quickCardIdA.getAppId(), quickCardIdA.getCardId(), jSONObject.getString("name"), jSONObject.getString("icon")));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return new QuickCardResponse(arrayList);
    }

    @Override // com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi
    @NotNull
    public QuickCardResponse queryData(@NotNull QuickCardRequestBean request, @Nullable Integer source) {
        return b(this.networkApi.request(3, request.requestIds(), null, source));
    }
}
