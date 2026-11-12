package com.xiaomi.hm.health.device.assistant.viewmodel.adapter;

import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.feature.quickcards.cloud.resouce.ResourceFactoryBuilder;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardId;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardRequestBean;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardResponseItem;
import com.xiaomi.hm.health.device.agps.MifitAppInfoFactory;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/QuickCardsCloudResourceImpl;", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi;", "", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/BatchCloudResourceApi;", "appId", "cardId", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi$Item;", "loadTitleAndIcon", "", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardId;", "ids", "", "source", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponseItem;", "loadData", "(Ljava/lang/Iterable;Ljava/lang/Integer;)Ljava/lang/Iterable;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "a", "Lkotlin/Lazy;", "()Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "info", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class QuickCardsCloudResourceImpl implements CloudResourceApi<String, String>, BatchCloudResourceApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy info = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi.AppInfo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi.AppInfo invoke() {
            AppInfo appInfoCreateInfo = new MifitAppInfoFactory().createInfo();
            String host = appInfoCreateInfo.getHost();
            String token = appInfoCreateInfo.getToken();
            String appName = appInfoCreateInfo.getAppName();
            String userId = appInfoCreateInfo.getUserId();
            if (userId == null) {
                userId = "";
            }
            return new com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi.AppInfo(host, appName, userId, Locale.getDefault().toString(), token);
        }
    }

    private final com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi.AppInfo a() {
        return (com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi.AppInfo) this.info.getValue();
    }

    @Override // com.xiaomi.hm.health.device.assistant.viewmodel.adapter.BatchCloudResourceApi
    @NotNull
    public Iterable<QuickCardResponseItem> loadData(@NotNull Iterable<QuickCardId> ids, @Nullable Integer source) {
        return ResourceFactoryBuilder.INSTANCE.setAppInfo(a()).buildQuickCardApi().queryData(new QuickCardRequestBean(CollectionsKt___CollectionsKt.toList(ids)), source).loadItems();
    }

    @Override // com.xiaomi.hm.health.device.assistant.viewmodel.adapter.CloudResourceApi
    @NotNull
    public CloudResourceApi.Item<String, String> loadTitleAndIcon(@NotNull String appId, @NotNull String cardId) throws Exception {
        throw new Exception("can not access this method.");
    }
}
