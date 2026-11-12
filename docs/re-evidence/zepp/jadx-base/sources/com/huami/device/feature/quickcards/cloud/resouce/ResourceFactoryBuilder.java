package com.huami.device.feature.quickcards.cloud.resouce;

import com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.NetworkApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean;
import com.huami.device.feature.quickcards.cloud.resouce.api.bean.ResponseBean;
import com.huami.device.feature.quickcards.cloud.resouce.impl.AppSortImpl;
import com.huami.device.feature.quickcards.cloud.resouce.impl.NetworkImpl;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardRequestBean;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardResourceImpl;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardResponse;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickScreenImpl;
import com.huami.device.feature.quickcards.cloud.resouce.impl.bean.ResponseItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bJ\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bJ\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/ResourceFactoryBuilder;", "", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "b", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "a", "", "deviceLang", "setDeviceLanguage", "info", "setAppInfo", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/RequestBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/ResponseBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/bean/ResponseItem;", "buildAppSortFactory", "buildQuickScreenApi", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardRequestBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponse;", "buildQuickCardApi", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "Ljava/lang/String;", "getDeviceLang$quick_card_api_release", "()Ljava/lang/String;", "setDeviceLang$quick_card_api_release", "(Ljava/lang/String;)V", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class ResourceFactoryBuilder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static CloudResourceApi.AppInfo info;

    @NotNull
    public static final ResourceFactoryBuilder INSTANCE = new ResourceFactoryBuilder();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String deviceLang = "";

    private ResourceFactoryBuilder() {
    }

    private final NetworkApi a() {
        return new NetworkImpl(b());
    }

    private final CloudResourceApi.AppInfo b() throws Exception {
        CloudResourceApi.AppInfo appInfo = info;
        if (appInfo != null) {
            return appInfo;
        }
        throw new Exception("info can not be null property");
    }

    @NotNull
    public final CloudResourceApi<RequestBean, ResponseBean<ResponseItem>> buildAppSortFactory() throws Exception {
        return new AppSortImpl(a());
    }

    @NotNull
    public final CloudResourceApi<QuickCardRequestBean, QuickCardResponse> buildQuickCardApi() throws Exception {
        return new QuickCardResourceImpl(a());
    }

    @NotNull
    public final CloudResourceApi<RequestBean, ResponseBean<ResponseItem>> buildQuickScreenApi() throws Exception {
        return new QuickScreenImpl(a());
    }

    @NotNull
    public final String getDeviceLang$quick_card_api_release() {
        return deviceLang;
    }

    @NotNull
    public final ResourceFactoryBuilder setAppInfo(@NotNull CloudResourceApi.AppInfo info2) {
        info = info2;
        return this;
    }

    public final void setDeviceLang$quick_card_api_release(@NotNull String str) {
        deviceLang = str;
    }

    @NotNull
    public final ResourceFactoryBuilder setDeviceLanguage(@NotNull String deviceLang2) {
        deviceLang = deviceLang2;
        return this;
    }
}
