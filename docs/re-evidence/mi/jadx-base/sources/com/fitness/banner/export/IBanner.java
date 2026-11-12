package com.fitness.banner.export;

import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.v2.BannerTimeConfig;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.fitness.net.response.ApiException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 :2\u00020\u0001:\u0001:JW\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052(\u0010\u0006\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00030\nj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\u00072\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nj\u0002`\fH&¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0010J@\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0013H&J \u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\"H¦@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H&JW\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020)2(\u0010\u0006\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b\u0012\u0004\u0012\u00020\u00030\nj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b`\u00072\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\nj\u0002`\fH&¢\u0006\u0002\u0010+J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\b2\u0006\u0010\u0004\u001a\u00020)H¦@¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010%\u001a\u00020*H&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010%\u001a\u00020*2\u0006\u0010'\u001a\u00020\"H&J,\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000102012\u0006\u0010%\u001a\u00020*H&J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\u0015H&J-\u00106\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00152\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0002\u00109¨\u0006;"}, d2 = {"Lcom/fitness/banner/export/IBanner;", "", "getBannerListAsyncV2", "", "requestParam", "Lcom/fitness/banner/export/BannerRequestParamV2;", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lcom/fitness/banner/export/BannerRequestParamV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBannerListV2", "(Lcom/fitness/banner/export/BannerRequestParamV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBannerV2Click", "jumpLinkUrl", "", "linkType", "", "mainTitle", "contentSource", "exposeSource", "source", "getCityId", "", "longitude", "", "latitude", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrRequestCityIdIfNeed", DatabaseConstants.TABLE_CACHE, "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTrackBannerV2ClickOrExpose", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "clickType", "getBannerListAsyncV1", "Lcom/fitness/banner/export/BannerRequestParam;", "Lcom/fitness/banner/export/BannerItem;", "(Lcom/fitness/banner/export/BannerRequestParam;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBannerListV1", "(Lcom/fitness/banner/export/BannerRequestParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBannerV1Click", "onTrackBannerV1ClickOrExpose", "getBannerV1ExposeEventAndParams", "Lkotlin/Pair;", "", "getBannerTimeConfig", "Lcom/fitness/banner/export/v2/BannerTimeConfig;", "bannerId", "updateBannerTimeConfig", "clickTime", "closeTime", "(ILjava/lang/Long;Ljava/lang/Long;)V", "Companion", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBanner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fitness/banner/export/IBanner$Companion;", "", "<init>", "()V", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onBannerV2Click$default(IBanner iBanner, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBannerV2Click");
            }
            iBanner.onBannerV2Click(str, i, str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
        }

        public static /* synthetic */ void updateBannerTimeConfig$default(IBanner iBanner, int i, Long l, Long l2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBannerTimeConfig");
            }
            if ((i2 & 2) != 0) {
                l = null;
            }
            if ((i2 & 4) != 0) {
                l2 = null;
            }
            iBanner.updateBannerTimeConfig(i, l, l2);
        }
    }

    void getBannerListAsyncV1(@NotNull BannerRequestParam requestParam, @NotNull Function1<? super List<BannerItem>, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);

    void getBannerListAsyncV2(@NotNull BannerRequestParamV2 requestParam, @NotNull Function1<? super List<BannerItemV2>, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail);

    @Nullable
    Object getBannerListV1(@NotNull BannerRequestParam bannerRequestParam, @NotNull Continuation<? super List<BannerItem>> continuation);

    @Nullable
    Object getBannerListV2(@NotNull BannerRequestParamV2 bannerRequestParamV2, @NotNull Continuation<? super List<BannerItemV2>> continuation);

    @Nullable
    BannerTimeConfig getBannerTimeConfig(int bannerId);

    @NotNull
    Pair<String, Map<String, Object>> getBannerV1ExposeEventAndParams(@NotNull BannerItem bannerItem);

    @Nullable
    Object getCityId(float f, float f2, @NotNull Continuation<? super Long> continuation);

    @Nullable
    Object getOrRequestCityIdIfNeed(boolean z, @NotNull Continuation<? super Long> continuation);

    void onBannerV1Click(@NotNull BannerItem bannerItem);

    void onBannerV2Click(@NotNull String jumpLinkUrl, int linkType, @Nullable String mainTitle, @NotNull String contentSource, @NotNull String exposeSource, @NotNull String source);

    void onTrackBannerV1ClickOrExpose(@NotNull BannerItem bannerItem, boolean clickType);

    void onTrackBannerV2ClickOrExpose(@NotNull BannerItemDetail bannerItem, boolean clickType);

    void updateBannerTimeConfig(int bannerId, @Nullable Long clickTime, @Nullable Long closeTime);
}
