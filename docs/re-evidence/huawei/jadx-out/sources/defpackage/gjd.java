package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gjd implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("extendMap")
    private Map<String, String> f35264b = CustomWebView$$ExternalSyntheticBackport0.m(new Map.Entry[]{new AbstractMap.SimpleEntry("supportMemeber", "true")});

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("scenarioIds")
    private List<String> f35265c;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.al();
    }

    public gjd(List<String> list) {
        this.f35265c = list;
    }
}
