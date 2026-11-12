package com.fitness.banner.export;

import android.location.Location;
import android.net.Uri;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.city.CityHelper;
import com.fitness.banner.city.CityPreference;
import com.fitness.banner.data.BannerPreference;
import com.fitness.banner.export.compare.BannerRequest;
import com.fitness.banner.export.compare.BannerResponseResultV1;
import com.fitness.banner.export.compare.BannerResponseResultV2;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.v2.BannerTimeConfig;
import com.fitness.banner.net.CityInfoResponseResult;
import com.fitness.banner.net.CityRequest;
import com.miui.tsmclient.database.DatabaseConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.YRNPushHandlerExtKt;
import defpackage.fgl;
import defpackage.w1j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2(\u0010\f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\t0\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e`\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u0012H\u0016¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0016J:\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J \u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0002\u0010%J\u0018\u0010&\u001a\u0004\u0018\u00010!2\u0006\u0010'\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0016JW\u0010.\u001a\u00020\t2\u0006\u0010\n\u001a\u00020/2(\u0010\f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u000e\u0012\u0004\u0012\u00020\t0\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u000e`\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u0012H\u0016¢\u0006\u0002\u00101J\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002000\u000e2\u0006\u0010\n\u001a\u00020/H\u0096@¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\t2\u0006\u0010+\u001a\u000200H\u0016J\u0018\u00105\u001a\u00020\t2\u0006\u0010+\u001a\u0002002\u0006\u0010-\u001a\u00020(H\u0016J,\u00106\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010908072\u0006\u0010+\u001a\u000200H\u0016J\u0012\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020\u001bH\u0016J)\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010!2\b\u0010?\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010@R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/fitness/banner/export/BannerImpl;", "Lcom/fitness/banner/export/IBanner;", "bannerRequest", "Lcom/fitness/banner/export/compare/BannerRequest;", "cityRequest", "Lcom/fitness/banner/net/CityRequest;", "<init>", "(Lcom/fitness/banner/export/compare/BannerRequest;Lcom/fitness/banner/net/CityRequest;)V", "getBannerListAsyncV2", "", "requestParam", "Lcom/fitness/banner/export/BannerRequestParamV2;", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lcom/fitness/banner/export/BannerRequestParamV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBannerListV2", "(Lcom/fitness/banner/export/BannerRequestParamV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBannerV2Click", "jumpLinkUrl", "", "linkType", "", "mainTitle", "contentSource", "exposeSource", "source", "getCityId", "", "longitude", "", "latitude", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrRequestCityIdIfNeed", DatabaseConstants.TABLE_CACHE, "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTrackBannerV2ClickOrExpose", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "clickType", "getBannerListAsyncV1", "Lcom/fitness/banner/export/BannerRequestParam;", "Lcom/fitness/banner/export/BannerItem;", "(Lcom/fitness/banner/export/BannerRequestParam;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getBannerListV1", "(Lcom/fitness/banner/export/BannerRequestParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBannerV1Click", "onTrackBannerV1ClickOrExpose", "getBannerV1ExposeEventAndParams", "Lkotlin/Pair;", "", "", "getBannerTimeConfig", "Lcom/fitness/banner/export/v2/BannerTimeConfig;", "bannerId", "updateBannerTimeConfig", "clickTime", "closeTime", "(ILjava/lang/Long;Ljava/lang/Long;)V", "Companion", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerImpl implements IBanner {

    @NotNull
    public static final String TAG = "BannerImpl";

    @NotNull
    private final BannerRequest bannerRequest;

    @NotNull
    private final CityRequest cityRequest;

    /* JADX INFO: renamed from: com.fitness.banner.export.BannerImpl$getBannerListV1$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.BannerImpl", f = "BannerImpl.kt", i = {0}, l = {SportReportBaseParser.ReportType.divingCNS}, m = "getBannerListV1", n = {"requestParam"}, s = {"L$0"})
    public static final class C13431 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13431(Continuation<? super C13431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerImpl.this.getBannerListV1(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fitness.banner.export.BannerImpl$getBannerListV2$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.BannerImpl", f = "BannerImpl.kt", i = {0}, l = {65}, m = "getBannerListV2", n = {"requestParam"}, s = {"L$0"})
    public static final class C13441 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13441(Continuation<? super C13441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerImpl.this.getBannerListV2(null, this);
        }
    }

    /* JADX INFO: renamed from: com.fitness.banner.export.BannerImpl$getCityId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.BannerImpl", f = "BannerImpl.kt", i = {0, 0}, l = {125}, m = "getCityId", n = {"longitude", "latitude"}, s = {"F$0", "F$1"})
    public static final class C13451 extends ContinuationImpl {
        float F$0;
        float F$1;
        int label;
        /* synthetic */ Object result;

        public C13451(Continuation<? super C13451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerImpl.this.getCityId(0.0f, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: com.fitness.banner.export.BannerImpl$getOrRequestCityIdIfNeed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.export.BannerImpl", f = "BannerImpl.kt", i = {0}, l = {152}, m = "getOrRequestCityIdIfNeed", n = {DatabaseConstants.TABLE_CACHE}, s = {"Z$0"})
    public static final class C13461 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C13461(Continuation<? super C13461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BannerImpl.this.getOrRequestCityIdIfNeed(false, this);
        }
    }

    public BannerImpl(@NotNull BannerRequest bannerRequest, @NotNull CityRequest cityRequest) {
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(cityRequest, "cityRequest");
        this.bannerRequest = bannerRequest;
        this.cityRequest = cityRequest;
    }

    @Override // com.fitness.banner.export.IBanner
    public void getBannerListAsyncV1(@NotNull final BannerRequestParam requestParam, @NotNull final Function1<? super List<BannerItem>, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        this.bannerRequest.getBannerAsyncV1(requestParam, new Function1<BannerResponseResultV1, Unit>() { // from class: com.fitness.banner.export.BannerImpl.getBannerListAsyncV1.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(BannerResponseResultV1 bannerResponseResultV1) {
                invoke2(bannerResponseResultV1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(BannerResponseResultV1 p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Logger.i(BannerImpl.TAG, "getBannerList request:" + requestParam + ",result:" + p1);
                Function1<List<BannerItem>, Unit> function1 = onSuccess;
                List<BannerItem> bannerList = p1.getBannerList();
                if (bannerList == null) {
                    bannerList = CollectionsKt__CollectionsKt.emptyList();
                }
                function1.invoke2(bannerList);
            }
        }, new Function1<ApiException, Unit>() { // from class: com.fitness.banner.export.BannerImpl.getBannerListAsyncV1.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Logger.e(BannerImpl.TAG, "getBannerList error request:" + requestParam + ",error " + p1);
                onFail.invoke2(p1);
            }
        });
    }

    @Override // com.fitness.banner.export.IBanner
    public void getBannerListAsyncV2(@NotNull final BannerRequestParamV2 requestParam, @NotNull final Function1<? super List<BannerItemV2>, Unit> onSuccess, @NotNull final Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        this.bannerRequest.getBannerAsyncV2(requestParam, new Function1<BannerResponseResultV2, Unit>() { // from class: com.fitness.banner.export.BannerImpl.getBannerListAsyncV2.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(BannerResponseResultV2 bannerResponseResultV2) {
                invoke2(bannerResponseResultV2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(BannerResponseResultV2 p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Logger.i(BannerImpl.TAG, "getBannerV2List async request:" + requestParam + ",result:" + p1);
                Function1<List<BannerItemV2>, Unit> function1 = onSuccess;
                List<BannerItemV2> bannerList = p1.getBannerList();
                if (bannerList == null) {
                    bannerList = CollectionsKt__CollectionsKt.emptyList();
                }
                function1.invoke2(bannerList);
            }
        }, new Function1<ApiException, Unit>() { // from class: com.fitness.banner.export.BannerImpl.getBannerListAsyncV2.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Logger.e(BannerImpl.TAG, "getBannerV2List async error request:" + requestParam + ",error " + p1);
                onFail.invoke2(p1);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fitness.banner.export.IBanner
    @Nullable
    public Object getBannerListV1(@NotNull BannerRequestParam bannerRequestParam, @NotNull Continuation<? super List<BannerItem>> continuation) {
        C13431 c13431;
        if (continuation instanceof C13431) {
            c13431 = (C13431) continuation;
            int i = c13431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13431.label = i - Integer.MIN_VALUE;
            } else {
                c13431 = new C13431(continuation);
            }
        } else {
            c13431 = new C13431(continuation);
        }
        Object bannerResponseV1 = c13431.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13431.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(bannerResponseV1);
                BannerRequest bannerRequest = this.bannerRequest;
                c13431.L$0 = bannerRequestParam;
                c13431.label = 1;
                bannerResponseV1 = bannerRequest.getBannerResponseV1(bannerRequestParam, c13431);
                if (bannerResponseV1 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bannerRequestParam = (BannerRequestParam) c13431.L$0;
                ResultKt.throwOnFailure(bannerResponseV1);
            }
            BannerResponseResultV1 bannerResponseResultV1 = (BannerResponseResultV1) bannerResponseV1;
            Logger.i(TAG, "getBannerList request:" + bannerRequestParam + ",result:" + bannerResponseResultV1);
            List<BannerItem> bannerList = bannerResponseResultV1.getBannerList();
            return bannerList == null ? CollectionsKt__CollectionsKt.emptyList() : bannerList;
        } catch (Exception e) {
            Logger.i(TAG, "getBannerList request:" + bannerRequestParam + ",error " + e);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fitness.banner.export.IBanner
    @Nullable
    public Object getBannerListV2(@NotNull BannerRequestParamV2 bannerRequestParamV2, @NotNull Continuation<? super List<BannerItemV2>> continuation) {
        C13441 c13441;
        if (continuation instanceof C13441) {
            c13441 = (C13441) continuation;
            int i = c13441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13441.label = i - Integer.MIN_VALUE;
            } else {
                c13441 = new C13441(continuation);
            }
        } else {
            c13441 = new C13441(continuation);
        }
        Object bannerResponseV2 = c13441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13441.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(bannerResponseV2);
                BannerRequest bannerRequest = this.bannerRequest;
                c13441.L$0 = bannerRequestParamV2;
                c13441.label = 1;
                bannerResponseV2 = bannerRequest.getBannerResponseV2(bannerRequestParamV2, c13441);
                if (bannerResponseV2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bannerRequestParamV2 = (BannerRequestParamV2) c13441.L$0;
                ResultKt.throwOnFailure(bannerResponseV2);
            }
            BannerResponseResultV2 bannerResponseResultV2 = (BannerResponseResultV2) bannerResponseV2;
            Logger.i(TAG, "getBannerV2List sync request:" + bannerRequestParamV2 + ",result:" + bannerResponseResultV2);
            List<BannerItemV2> bannerList = bannerResponseResultV2.getBannerList();
            return bannerList == null ? CollectionsKt__CollectionsKt.emptyList() : bannerList;
        } catch (Exception e) {
            Logger.i(TAG, "getBannerV2List sync request:" + bannerRequestParamV2 + ",error " + e);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Override // com.fitness.banner.export.IBanner
    @Nullable
    public BannerTimeConfig getBannerTimeConfig(int bannerId) {
        return BannerPreference.INSTANCE.getBannerTimeConfig(bannerId);
    }

    @Override // com.fitness.banner.export.IBanner
    @NotNull
    public Pair<String, Map<String, Object>> getBannerV1ExposeEventAndParams(@NotNull BannerItem bannerItem) {
        String model;
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("name", "ad_expose");
        pairArr[1] = TuplesKt.to("tip", "56.63.1.1.27295");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "none";
        }
        pairArr[2] = TuplesKt.to("device_model", model);
        pairArr[3] = TuplesKt.to("asset_id", Integer.valueOf(bannerItem.getId()));
        pairArr[4] = TuplesKt.to(OneTrack.Param.ASSET_NAME, bannerItem.getMainTitle());
        pairArr[5] = TuplesKt.to("url", bannerItem.getJumpSource());
        pairArr[6] = TuplesKt.to(OneTrackExtKt.KEY_BUSINESS, bannerItem.getBusiness());
        pairArr[7] = TuplesKt.to("group", Integer.valueOf(bannerItem.getGroupId()));
        pairArr[8] = TuplesKt.to("exp_id", bannerItem.getExpGroupId());
        return new Pair<>("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fitness.banner.export.IBanner
    @Nullable
    public Object getCityId(float f, float f2, @NotNull Continuation<? super Long> continuation) {
        C13451 c13451;
        if (continuation instanceof C13451) {
            c13451 = (C13451) continuation;
            int i = c13451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13451.label = i - Integer.MIN_VALUE;
            } else {
                c13451 = new C13451(continuation);
            }
        } else {
            c13451 = new C13451(continuation);
        }
        Object cityInfoSync = c13451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13451.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(cityInfoSync);
                CityRequest cityRequest = this.cityRequest;
                c13451.F$0 = f;
                c13451.F$1 = f2;
                c13451.label = 1;
                cityInfoSync = cityRequest.getCityInfoSync(f, f2, c13451);
                if (cityInfoSync == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f2 = c13451.F$1;
                f = c13451.F$0;
                ResultKt.throwOnFailure(cityInfoSync);
            }
            CityInfoResponseResult cityInfoResponseResult = (CityInfoResponseResult) cityInfoSync;
            Logger.i(TAG, "getCityId sync request request " + f + " " + f2 + ";result:" + cityInfoResponseResult);
            if (cityInfoResponseResult.getCityId() > 0) {
                return Boxing.boxLong(cityInfoResponseResult.getCityId());
            }
            return null;
        } catch (Exception e) {
            Logger.i(TAG, "getCityId ,error " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fitness.banner.export.IBanner
    @Nullable
    public Object getOrRequestCityIdIfNeed(boolean z, @NotNull Continuation<? super Long> continuation) {
        C13461 c13461;
        if (continuation instanceof C13461) {
            c13461 = (C13461) continuation;
            int i = c13461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13461.label = i - Integer.MIN_VALUE;
            } else {
                c13461 = new C13461(continuation);
            }
        } else {
            c13461 = new C13461(continuation);
        }
        Object cityId = c13461.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13461.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(cityId);
                TimeUtils timeUtils = TimeUtils.INSTANCE;
                long jCurrentTimeMillis = System.currentTimeMillis();
                CityPreference cityPreference = CityPreference.INSTANCE;
                if (timeUtils.isSameDay(jCurrentTimeMillis, cityPreference.getCityIdUpdateTimeSecond() * ((long) 1000)) && z) {
                    return Boxing.boxLong(cityPreference.getCityId());
                }
                Location lastKnownLocation = CityHelper.INSTANCE.getLastKnownLocation();
                if (lastKnownLocation == null) {
                    return null;
                }
                float longitude = (float) lastKnownLocation.getLongitude();
                float latitude = (float) lastKnownLocation.getLatitude();
                c13461.Z$0 = z;
                c13461.label = 1;
                cityId = getCityId(longitude, latitude, c13461);
                if (cityId == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c13461.Z$0;
                ResultKt.throwOnFailure(cityId);
            }
            Long l = (Long) cityId;
            if (l != null && l.longValue() > 0) {
                CityPreference.INSTANCE.updateCityId(l.longValue());
                return l;
            }
            long cityId2 = CityPreference.INSTANCE.getCityId();
            if (cityId2 <= 0 || !z) {
                return null;
            }
            return Boxing.boxLong(cityId2);
        } catch (Exception e) {
            Logger.i(TAG, "getOrRequestCityIdIfNeed ,error " + e);
            return null;
        }
    }

    @Override // com.fitness.banner.export.IBanner
    public void onBannerV1Click(@NotNull BannerItem bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        String jumpSource = bannerItem.getJumpSource();
        Uri uri = Uri.parse(StringsKt__StringsJVMKt.replace$default(jumpSource, "miwear://", "mihealth://", false, 4, (Object) null));
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual("http", scheme) || Intrinsics.areEqual(Constants.URI_SCHEME, scheme)) {
            WebViewUtilKt.startWebView$default(jumpSource, bannerItem.getMainTitle(), false, false, null, true, Boolean.TRUE, false, 156, null);
        } else {
            fgl.a(ApplicationExtKt.getApplication(), uri);
        }
        onTrackBannerV1ClickOrExpose(bannerItem, true);
    }

    @Override // com.fitness.banner.export.IBanner
    public void onBannerV2Click(@NotNull String jumpLinkUrl, int linkType, @Nullable String mainTitle, @NotNull String contentSource, @NotNull String exposeSource, @NotNull String source) {
        Intrinsics.checkNotNullParameter(jumpLinkUrl, "jumpLinkUrl");
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Intrinsics.checkNotNullParameter(exposeSource, "exposeSource");
        Intrinsics.checkNotNullParameter(source, "source");
        if (linkType == 0) {
            Logger.i(TAG, "onBannerV2Click return cause linkType == 0");
            return;
        }
        Logger.i(TAG, "linkType == " + linkType + ",jumpLinkUrl:" + jumpLinkUrl + ",source:" + source);
        if (linkType == 4) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), w1j.f37448a);
                return;
            } else {
                FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).gotoFaceDetail(DeviceModelExtKt.getModel(wearableDeviceModel), jumpLinkUrl, source, 0, contentSource, exposeSource);
                return;
            }
        }
        if (linkType == 5) {
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), w1j.f37448a);
                return;
            } else {
                FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).gotoFaceTabList(ApplicationExtKt.getApplication(), jumpLinkUrl, source, exposeSource);
                return;
            }
        }
        if (linkType == 7) {
            YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).handlePushRNPage(jumpLinkUrl, source);
            return;
        }
        Uri uri = Uri.parse(StringsKt__StringsJVMKt.replace$default(jumpLinkUrl, "miwear://", "mihealth://", false, 4, (Object) null));
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual("http", scheme) || Intrinsics.areEqual(Constants.URI_SCHEME, scheme)) {
            WebViewUtilKt.startWebView$default(jumpLinkUrl, mainTitle, false, false, null, true, Boolean.TRUE, false, 156, null);
        } else {
            fgl.a(ApplicationExtKt.getApplication(), uri);
        }
    }

    @Override // com.fitness.banner.export.IBanner
    public void onTrackBannerV1ClickOrExpose(@NotNull BannerItem bannerItem, boolean clickType) {
        String model;
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "none";
        }
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        String str = clickType ? "click_v3" : "expose_v3";
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to("name", clickType ? "ad_click" : "ad_expose");
        pairArr[1] = TuplesKt.to("tip", clickType ? "56.63.1.1.27296" : "56.63.1.1.27295");
        pairArr[2] = TuplesKt.to("device_model", model);
        pairArr[3] = TuplesKt.to("asset_id", Integer.valueOf(bannerItem.getId()));
        pairArr[4] = TuplesKt.to(OneTrack.Param.ASSET_NAME, bannerItem.getMainTitle());
        pairArr[5] = TuplesKt.to("url", bannerItem.getJumpSource());
        pairArr[6] = TuplesKt.to(OneTrackExtKt.KEY_BUSINESS, bannerItem.getBusiness());
        pairArr[7] = TuplesKt.to("group", Integer.valueOf(bannerItem.getGroupId()));
        pairArr[8] = TuplesKt.to("exp_id", bannerItem.getExpGroupId());
        oneTrackExtKt.reportData(str, MapsKt__MapsKt.mapOf(pairArr));
    }

    @Override // com.fitness.banner.export.IBanner
    public void onTrackBannerV2ClickOrExpose(@NotNull BannerItemDetail bannerItem, boolean clickType) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
    }

    @Override // com.fitness.banner.export.IBanner
    public void updateBannerTimeConfig(int bannerId, @Nullable Long clickTime, @Nullable Long closeTime) {
        BannerPreference.INSTANCE.updateBannerTimeConfig(bannerId, clickTime, closeTime);
    }
}
