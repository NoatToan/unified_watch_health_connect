package com.huami.device.feature.quickcards.cloud.resouce.impl;

import com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.NetworkApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean;
import com.huami.device.feature.quickcards.cloud.resouce.api.bean.ResponseBean;
import com.huami.device.feature.quickcards.cloud.resouce.impl.bean.ResponseItem;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00142\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\b\u0015B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\b\u001a\u00060\u0007R\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u00020\tH&J'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/NormalResourceImpl;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/RequestBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/ResponseBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/bean/ResponseItem;", "", "jsonString", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/NormalResourceImpl$NormalResponseItem;", "a", "", "loadType", "request", "source", "queryData", "(Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/RequestBean;Ljava/lang/Integer;)Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/ResponseBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "networkApi", "<init>", "(Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;)V", "b", "NormalResponseItem", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public abstract class NormalResourceImpl implements CloudResourceApi<RequestBean, ResponseBean<ResponseItem>> {

    @Deprecated
    @NotNull
    public static final String TAG = "CloudResourceApi";

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NetworkApi networkApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/NormalResourceImpl$NormalResponseItem;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/ResponseBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/bean/ResponseItem;", "", "loadItems", "a", "Ljava/lang/Iterable;", "items", "<init>", "(Lcom/huami/device/feature/quickcards/cloud/resouce/impl/NormalResourceImpl;Ljava/lang/Iterable;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public final class NormalResponseItem extends ResponseBean<ResponseItem> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Iterable<ResponseItem> items;

        public NormalResponseItem(Iterable<ResponseItem> iterable) {
            this.items = iterable;
        }

        @Override // com.huami.device.feature.quickcards.cloud.resouce.api.bean.ResponseBean
        @NotNull
        public Iterable<ResponseItem> loadItems() {
            return this.items;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/device/feature/quickcards/cloud/resouce/impl/NormalResourceImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<ResponseItem> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList<ResponseItem> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "response item [" + this.a.size() + "] \n --> " + this.a;
        }
    }

    public NormalResourceImpl(@NotNull NetworkApi networkApi) {
        this.networkApi = networkApi;
    }

    private final NormalResponseItem a(String jsonString) throws Exception {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(jsonString);
            int i = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new ResponseItem(jSONObject.getString("id"), jSONObject.getString("name"), jSONObject.getString("icon")));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            HMLog.info(TAG, new b(arrayList));
            return new NormalResponseItem(arrayList);
        } catch (JSONException e) {
            throw new Exception("error for serialize json objects", e);
        }
    }

    public abstract int loadType();

    @Override // com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi
    @NotNull
    public ResponseBean<ResponseItem> queryData(@NotNull RequestBean request, @Nullable Integer source) {
        return a(this.networkApi.request(loadType(), request.requestIds(), null, source));
    }
}
