package com.xiaomi.fitness.sync.net;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.gson.Gson;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.model.LocationByNameResp;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.PressureItems;
import com.xiaomi.fitness.sync.export.model.PressureResp;
import com.xiaomi.fitness.sync.export.model.StockModel;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.fitness.sync.model.AgpsRes;
import com.xiaomi.fitness.sync.model.StockHostResp;
import com.xiaomi.fitness.sync.model.StockTokenRes;
import com.xiaomi.fitness.sync.net.SyncRequest;
import com.xiaomi.fitness.sync.net.agps.AgpsRequest;
import com.xiaomi.fitness.sync.net.agps.AgpsRequestModel;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.be1;
import defpackage.bua;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o4h;
import defpackage.o5h;
import defpackage.ofl;
import defpackage.r72;
import defpackage.u92;
import defpackage.ua1;
import defpackage.ugc;
import defpackage.v4h;
import defpackage.v84;
import defpackage.w5h;
import defpackage.z5h;
import java.io.File;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\r\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\bo\u0010\u001fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0003¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020'\"\u0004\b\u0000\u0010%2\u0006\u0010&\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010/J'\u00105\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J-\u0010;\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f09H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0\"H\u0007¢\u0006\u0004\b=\u0010$J+\u0010A\u001a\u00020\u00052\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020@09¢\u0006\u0004\bA\u0010BJ1\u0010F\u001a\u00020\u00052\u0006\u0010>\u001a\u00020-2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0C2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020E09¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000H\"\u0004\b\u0000\u0010%¢\u0006\u0004\bI\u0010JJ;\u0010O\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020-2\u0006\u0010N\u001a\u00020*2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f09¢\u0006\u0004\bO\u0010PJ8\u0010S\u001a\u00020\u00052\b\u0010Q\u001a\u0004\u0018\u00010\u000f2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\f\u0010:\u001a\b\u0012\u0004\u0012\u00020R09H\u0086@¢\u0006\u0004\bS\u0010TJ5\u0010S\u001a\u00020\u00052\u0006\u00102\u001a\u0002002\u0006\u00101\u001a\u0002002\b\u0010Q\u001a\u0004\u0018\u0001032\f\u0010:\u001a\b\u0012\u0004\u0012\u00020R09¢\u0006\u0004\bS\u0010UJ\r\u0010V\u001a\u00020\u0005¢\u0006\u0004\bV\u0010\u001fJ%\u0010X\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u000f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020W09¢\u0006\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010]\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010[R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010[R\u0014\u0010g\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010[R\u0014\u0010h\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010[R\u0014\u0010i\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010[R\u0014\u0010j\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010bR\u0018\u0010k\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lcom/xiaomi/fitness/sync/net/SyncRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sync/net/SyncApiService;", "Ljz6;", PluginDeviceInfo.FICONOFF, "", "add", "(Ljz6;)V", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockHost;", "getLocaleStockHost", "()Lcom/xiaomi/fitness/sync/export/model/StockModel$StockHost;", "stockHost", "saveLocaleStockHost", "(Lcom/xiaomi/fitness/sync/export/model/StockModel$StockHost;)V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getStockParams", "()Ljava/util/HashMap;", "string", "md5", "(Ljava/lang/String;)Ljava/lang/String;", "", "byteArray", "byteArrayToHex", "([B)Ljava/lang/String;", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockToken;", "token", "saveLocaleStockToken", "(Lcom/xiaomi/fitness/sync/export/model/StockModel$StockToken;)V", "removeLocaleStockToken", "()V", "getLocaleStockToken", "()Lcom/xiaomi/fitness/sync/export/model/StockModel$StockToken;", "Lo4h;", "getStockToken", "()Lo4h;", "T", "data", "Lokhttp3/RequestBody;", "getJsonReqBody", "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "", "code", "error", "", "isStockRequestExpired", "(ILjava/lang/String;)Z", "", "longitude", "latitude", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "localLocationKey", "isFarAway", "(DDLcom/xiaomi/fitness/sync/export/model/LocationKey;)Z", "url", "file", "Lbe1;", b.I, "downloadApgsFile", "(Ljava/lang/String;Ljava/lang/String;Lbe1;)V", "getStockHost", "needRetry", "suggest", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "requestStockSuggest", "(ZLjava/lang/String;Lbe1;)V", "", "symbols", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockInfo;", "requestStockInfo", "(ZLjava/util/List;Lbe1;)V", "Lw5h;", "io2Main", "()Lw5h;", "source", "type", "online", "days", "performAgpsRequest", "(Ljava/lang/String;IZILbe1;)V", "locationKey", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;", "performWeatherRequest", "(Ljava/lang/String;DDLbe1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(DDLcom/xiaomi/fitness/sync/export/model/LocationKey;Lbe1;)V", "destroy", "Lcom/xiaomi/fitness/sync/export/model/LocationByNameResp;", "getCityNameByLocation", "(Ljava/lang/String;Lbe1;)V", "AGPS_ONLINE_URL", "Ljava/lang/String;", "AGPS_OFFLINE_URL", "HOST_STOCK", "Lna4;", "mComposite", "Lna4;", "sWeatherDelayTime", "I", "", "HEX_DIGITS", "[C", "GUEST_SALT", "STOCK_GUEST_OAUTH_API", "STOCK_SUGGEST_API", "STOCK_INFO_API", "STOCK_CODE_TOKEN_EXPIRED", "mStockHost", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockHost;", "mStockToken", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockToken;", "<init>", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSyncRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncRequest.kt\ncom/xiaomi/fitness/sync/net/SyncRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,601:1\n89#2,5:602\n89#2,5:607\n89#2,5:612\n89#2,5:617\n89#2,5:622\n89#2,5:627\n*S KotlinDebug\n*F\n+ 1 SyncRequest.kt\ncom/xiaomi/fitness/sync/net/SyncRequest\n*L\n434#1:602,5\n592#1:607,5\n141#1:612,5\n201#1:617,5\n232#1:622,5\n284#1:627,5\n*E\n"})
public final class SyncRequest extends BaseRequest<SyncApiService> {

    @NotNull
    public static final String AGPS_OFFLINE_URL = "https://api.70mai.com.cn/ublox/getOfflineData?start=0&days=";

    @NotNull
    public static final String AGPS_ONLINE_URL = "https://api.70mai.com.cn/ublox/getOnlineData";

    @NotNull
    private static final String GUEST_SALT = "SVAHDTUCDDQKQSZVKZET";

    @NotNull
    private static final String HOST_STOCK = "https://cg.play-analytics.com";
    private static final int STOCK_CODE_TOKEN_EXPIRED = 10503;

    @NotNull
    private static final String STOCK_GUEST_OAUTH_API = "/api/v1/auth/guest/signin";

    @NotNull
    private static final String STOCK_INFO_API = "/stock_info/brief/all";

    @NotNull
    private static final String STOCK_SUGGEST_API = "/suggest/v11";

    @Nullable
    private static StockModel.StockHost mStockHost = null;

    @Nullable
    private static StockModel.StockToken mStockToken = null;
    public static final int sWeatherDelayTime = 3600000;

    @NotNull
    public static final SyncRequest INSTANCE = new SyncRequest();

    @NotNull
    private static final na4 mComposite = new na4();

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.net.SyncRequest$getCityNameByLocation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sync/export/model/LocationByNameResp;", "it", "Lcom/xiaomi/fitness/sync/net/SyncApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.net.SyncRequest$getCityNameByLocation$1", f = "SyncRequest.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32311 extends SuspendLambda implements Function2<SyncApiService, Continuation<? super LocationByNameResp>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32311(String str, Continuation<? super C32311> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C32311 c32311 = new C32311(this.$data, continuation);
            c32311.L$0 = obj;
            return c32311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SyncApiService syncApiService, Continuation<? super LocationByNameResp> continuation) {
            return ((C32311) create(syncApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SyncApiService syncApiService = (SyncApiService) this.L$0;
                String str = Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();
                String str2 = this.$data;
                this.label = 1;
                obj = syncApiService.getCityNameByLocation(str2, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.net.SyncRequest$performWeatherRequest$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp;", "it", "Lcom/xiaomi/fitness/sync/net/SyncApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.net.SyncRequest$performWeatherRequest$2", f = "SyncRequest.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SyncApiService, Continuation<? super WeatherResp>, Object> {
        final /* synthetic */ String $data;
        final /* synthetic */ String $locale;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$locale = str;
            this.$data = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$locale, this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SyncApiService syncApiService, Continuation<? super WeatherResp> continuation) {
            return ((AnonymousClass2) create(syncApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SyncApiService syncApiService = (SyncApiService) this.L$0;
                String str = this.$locale;
                String str2 = this.$data;
                this.label = 1;
                obj = syncApiService.getWeather(str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.net.SyncRequest$performWeatherRequest$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.net.SyncRequest$performWeatherRequest$5", f = "SyncRequest.kt", i = {0, 0, 0, 0, 1}, l = {524, 534}, m = "invokeSuspend", n = {"$this$scopeNet", "pressureLocation", "lon", "lat", "weatherResp"}, s = {"L$0", "L$1", "D$0", "D$1", "L$0"})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $data;
        final /* synthetic */ double $latitude;
        final /* synthetic */ String $locale;
        final /* synthetic */ LocationKey $locationKey;
        final /* synthetic */ double $longitude;
        final /* synthetic */ be1<WeatherResp.Weather> $response;
        double D$0;
        double D$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(double d, double d2, LocationKey locationKey, String str, String str2, be1<WeatherResp.Weather> be1Var, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$longitude = d;
            this.$latitude = d2;
            this.$locationKey = locationKey;
            this.$locale = str;
            this.$data = str2;
            this.$response = be1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$longitude, this.$latitude, this.$locationKey, this.$locale, this.$data, this.$response, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0161  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            double d;
            Object objAwait;
            CoroutineScope coroutineScope;
            String str;
            double d2;
            LocationKey locationKey;
            WeatherResp weatherResp;
            PressureResp pressureResp;
            Object objAwait2;
            LocationKey locationKey2;
            PressureResp pressureResp2;
            be1<WeatherResp.Weather> be1Var;
            WeatherResp.Weather weather;
            String str2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                double d3 = this.$longitude;
                double d4 = this.$latitude;
                if (d3 == 0.0d && d4 == 0.0d && (locationKey = this.$locationKey) != null) {
                    d3 = locationKey.longitude;
                    d4 = locationKey.latitude;
                }
                double d5 = d4;
                double d6 = d3;
                String json = new Gson().toJson(MapsKt__MapsKt.mapOf(TuplesKt.to("longitude", Boxing.boxDouble(d6)), TuplesKt.to("latitude", Boxing.boxDouble(d5))));
                d = d5;
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new SyncRequest$performWeatherRequest$5$weatherRequest$1(this.$locale, this.$data, null), 3, null);
                this.L$0 = coroutineScope2;
                this.L$1 = json;
                this.D$0 = d6;
                this.D$1 = d;
                this.label = 1;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                str = json;
                d2 = d6;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    WeatherResp weatherResp2 = (WeatherResp) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objAwait2 = obj;
                        weatherResp = weatherResp2;
                        pressureResp = null;
                        pressureResp2 = (PressureResp) objAwait2;
                    } catch (Exception e) {
                        e = e;
                        weatherResp = weatherResp2;
                        pressureResp = null;
                        Logger.e("Wearable.weather", "Exception " + e);
                        pressureResp2 = pressureResp;
                    }
                    be1Var = this.$response;
                    LocationKey locationKey3 = this.$locationKey;
                    if (weatherResp.code == 0 || (weather = weatherResp.result) == null || TextUtils.isEmpty(weather.pubTime)) {
                        Logger.i("Wearable.weather", "getWeatherFromNet success, but code:" + weatherResp.code + "  result:  " + weatherResp.result);
                        be1Var.onFailure();
                        return Unit.INSTANCE;
                    }
                    WeatherResp.Weather result = weatherResp.result;
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    String str3 = result.location_name;
                    if (str3 == null || str3.length() == 0) {
                        if (locationKey3 == null || (str2 = locationKey3.locationName) == null) {
                            str2 = "";
                        }
                        result.location_name = str2;
                    }
                    Logger.i("Wearable.weather", "getWeatherFromNet success result:" + result);
                    Logger.i("Wearable.weather", "getWeatherPressure oldPressure:" + result.pressure.value);
                    if (pressureResp2 != null) {
                        Logger.i("Wearable.weather", "getWeatherPressure pressure success " + pressureResp2);
                        if (pressureResp2.getCode() == 0) {
                            List<PressureItems> pressures = pressureResp2.getResult().getPressures();
                            if (pressures.size() > 0) {
                                result.pressure.value = String.valueOf(pressures.get(0).getSeaLevelPressure());
                                result.pressure.unit = "hPa";
                            }
                        }
                    }
                    be1Var.onResponse(result);
                    return Unit.INSTANCE;
                }
                double d7 = this.D$1;
                d2 = this.D$0;
                str = (String) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                d = d7;
                coroutineScope = coroutineScope3;
                objAwait = obj;
            }
            weatherResp = (WeatherResp) objAwait;
            LocationKey locationKey4 = this.$locationKey;
            Logger.i("Wearable.weather", "是否请求新源：longitude = " + d2 + " latitude = " + d + " locationkey is Null = " + (locationKey4 == null) + ", isUserAutoLocation = " + (locationKey4 != null && locationKey4.isUserAutoLocation));
            Deferred deferredAsync$default2 = (d2 == 0.0d || d == 0.0d || ((locationKey2 = this.$locationKey) != null && !locationKey2.isUserAutoLocation)) ? null : BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SyncRequest$performWeatherRequest$5$pressureRequest$1(str, null), 3, null);
            if (deferredAsync$default2 == null) {
                pressureResp = null;
                pressureResp2 = pressureResp;
                be1Var = this.$response;
                LocationKey locationKey5 = this.$locationKey;
                if (weatherResp.code == 0) {
                }
                Logger.i("Wearable.weather", "getWeatherFromNet success, but code:" + weatherResp.code + "  result:  " + weatherResp.result);
                be1Var.onFailure();
                return Unit.INSTANCE;
            }
            try {
                this.L$0 = weatherResp;
                pressureResp = null;
                try {
                    this.L$1 = null;
                    this.label = 2;
                    objAwait2 = deferredAsync$default2.await(this);
                    if (objAwait2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pressureResp2 = (PressureResp) objAwait2;
                } catch (Exception e2) {
                    e = e2;
                    Logger.e("Wearable.weather", "Exception " + e);
                    pressureResp2 = pressureResp;
                }
            } catch (Exception e3) {
                e = e3;
                pressureResp = null;
                Logger.e("Wearable.weather", "Exception " + e);
                pressureResp2 = pressureResp;
            }
            be1Var = this.$response;
            LocationKey locationKey6 = this.$locationKey;
            if (weatherResp.code == 0) {
            }
            Logger.i("Wearable.weather", "getWeatherFromNet success, but code:" + weatherResp.code + "  result:  " + weatherResp.result);
            be1Var.onFailure();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SyncRequest() {
    }

    private final void add(jz6 d) {
        mComposite.a(d);
    }

    private final String byteArrayToHex(byte[] byteArray) {
        char[] cArr = new char[byteArray.length * 2];
        int i = 0;
        for (byte b2 : byteArray) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b2 >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    private final void downloadApgsFile(final String url, final String file, final be1<String> response) {
        jz6 jz6VarK = ugc.k(url, file, new ugc.a() { // from class: com.xiaomi.fitness.sync.net.SyncRequest.downloadApgsFile.1
            @Override // ugc.a
            public void onComplete() {
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.d(tag, "Agps downloadApgsFile onComplete: ");
                response.onResponse(file);
            }

            @Override // ugc.a
            public void onError(String errorMsg) {
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.e(tag, "Agps downloadApgsFile onError: " + errorMsg + "; url = " + url);
                response.onFailure();
            }

            @Override // ugc.a
            public /* bridge */ /* synthetic */ void onProgress(int i) {
                super.onProgress(i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarK, "downloadFile(...)");
        add(jz6VarK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCityNameByLocation$lambda$28(be1 response, ApiException it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(it, "it");
        response.onFailure();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCityNameByLocation$lambda$29(be1 response, LocationByNameResp it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(it, "it");
        response.onResponse(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> RequestBody getJsonReqBody(T data) {
        String json = getMGson().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.d(tag, "jsonReqBody = " + json);
        return RequestBody.INSTANCE.create(json, MediaType.INSTANCE.parse("application/json"));
    }

    private final StockModel.StockHost getLocaleStockHost() {
        if (mStockHost == null) {
            String localStockHost = SyncPreference.INSTANCE.getLocalStockHost();
            if (localStockHost == null) {
                localStockHost = "";
            }
            if (!TextUtils.isEmpty(localStockHost)) {
                Object objFromJson = getMGson().fromJson(localStockHost, (Class<Object>) StockModel.StockHost.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                StockModel.StockHost stockHost = (StockModel.StockHost) objFromJson;
                if (!TextUtils.isEmpty(stockHost.hqlist) && !TextUtils.isEmpty(stockHost.oauth)) {
                    mStockHost = stockHost;
                }
            }
        }
        return mStockHost;
    }

    private final StockModel.StockToken getLocaleStockToken() {
        if (mStockToken == null) {
            String localStockToken = SyncPreference.INSTANCE.getLocalStockToken();
            if (localStockToken == null) {
                localStockToken = "";
            }
            if (!TextUtils.isEmpty(localStockToken)) {
                Object objFromJson = getMGson().fromJson(localStockToken, (Class<Object>) StockModel.StockToken.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                StockModel.StockToken stockToken = (StockModel.StockToken) objFromJson;
                if (!TextUtils.isEmpty(stockToken.access_token)) {
                    mStockToken = stockToken;
                }
            }
        }
        return mStockToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStockHost$lambda$2(final v4h emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        SyncRequest syncRequest = INSTANCE;
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), syncRequest.getMService(), new SyncRequest$getStockHost$1$1(null)).error(new Function1() { // from class: huo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getStockHost$lambda$2$lambda$0(emitter, (ApiException) obj);
            }
        }).success(new Function1() { // from class: iuo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getStockHost$lambda$2$lambda$1(emitter, (StockHostResp) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStockHost$lambda$2$lambda$0(v4h emitter, ApiException it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it, "it");
        emitter.onError(new Throwable(it.getMessage()));
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStockHost$lambda$2$lambda$1(v4h emitter, StockHostResp resp) {
        ArrayList<StockModel.StockHost> arrayList;
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(resp, "resp");
        if (resp.ret != 0 || (arrayList = resp.items) == null || arrayList.isEmpty() || TextUtils.isEmpty(resp.items.get(0).hqlist) || TextUtils.isEmpty(resp.items.get(0).oauth)) {
            String tag = SyncEngine.INSTANCE.getTAG();
            Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
            Logger.i(tag, "getStockHost " + resp);
            emitter.onError(new Throwable("get Stock Host null"));
        } else {
            StockModel.StockHost stockHost = resp.items.get(0);
            Intrinsics.checkNotNullExpressionValue(stockHost, "get(...)");
            StockModel.StockHost stockHost2 = stockHost;
            String tag2 = SyncEngine.INSTANCE.getTAG();
            Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
            Logger.i(tag2, "getStockHost " + stockHost2);
            INSTANCE.saveLocaleStockHost(stockHost2);
            emitter.onNext(stockHost2);
        }
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashMap<String, String> getStockParams() {
        DisplayMetrics displayMetrics = ApplicationExtKt.getApplication().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        HashMap<String, String> map = new HashMap<>();
        String strValueOf = String.valueOf(System.currentTimeMillis() / ((long) 1000));
        DeviceUtil deviceUtil = DeviceUtil.INSTANCE;
        String strMd5 = md5("miwatch-" + deviceUtil.getDeviceID(ApplicationExtKt.getApplication()) + "|" + strValueOf + "|SVAHDTUCDDQKQSZVKZET");
        map.put("device", Build.MODEL);
        String deviceID = deviceUtil.getDeviceID(ApplicationExtKt.getApplication());
        StringBuilder sb = new StringBuilder();
        sb.append("miwatch-");
        sb.append(deviceID);
        map.put("deviceId", sb.toString());
        map.put("osVer", Build.VERSION.RELEASE);
        map.put(m.m, AppVersionUtil.INSTANCE.getAppVersionName());
        map.put("appName", "小米穿戴");
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.d(tag, "stock params appName" + ((Object) map.get("appName")));
        map.put("platform", "rtos");
        map.put(TSMAuthContants.PARAM_LANGUAGE, "zh_CN");
        int i = displayMetrics.widthPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        map.put("screenW", sb2.toString());
        int i2 = displayMetrics.heightPixels;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i2);
        map.put("screenH", sb3.toString());
        map.put("timestamp", strValueOf);
        map.put(MiTsmConstants.KEY_SIGNATURE, strMd5);
        return map;
    }

    @SuppressLint({"CheckResult"})
    private final o4h<StockModel.StockToken> getStockToken() {
        StockModel.StockToken localeStockToken = getLocaleStockToken();
        if (localeStockToken != null) {
            o4h<StockModel.StockToken> o4hVarE = o4h.E(localeStockToken);
            Intrinsics.checkNotNull(o4hVarE);
            return o4hVarE;
        }
        o4h<StockModel.StockHost> stockHost = getStockHost();
        final Function1 function1 = new Function1() { // from class: uto
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getStockToken$lambda$6((StockModel.StockHost) obj);
            }
        };
        o4h o4hVarR = stockHost.r(new bua() { // from class: vto
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return SyncRequest.getStockToken$lambda$7(function1, obj);
            }
        });
        Intrinsics.checkNotNull(o4hVarR);
        return o4hVarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h getStockToken$lambda$6(StockModel.StockHost stockHost) {
        final String str = (stockHost != null ? stockHost.getOauthHost() : null) + STOCK_GUEST_OAUTH_API;
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.i(tag, "getStockHost:" + stockHost + "  stockTokenUrl:" + str);
        return o4h.f(new j5h() { // from class: kuo
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                SyncRequest.getStockToken$lambda$6$lambda$5(str, v4hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStockToken$lambda$6$lambda$5(String url, final v4h emitter) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        SyncRequest syncRequest = INSTANCE;
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), syncRequest.getMService(), new SyncRequest$getStockToken$1$1$1(url, null)).error(new Function1() { // from class: yto
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getStockToken$lambda$6$lambda$5$lambda$3(emitter, (ApiException) obj);
            }
        }).success(new Function1() { // from class: zto
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getStockToken$lambda$6$lambda$5$lambda$4(emitter, (StockTokenRes) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStockToken$lambda$6$lambda$5$lambda$3(v4h emitter, ApiException it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it, "it");
        emitter.onError(new Throwable(it.getMessage()));
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStockToken$lambda$6$lambda$5$lambda$4(v4h emitter, StockTokenRes res) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(res, "res");
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.d(tag, "getStockToken:" + res);
        if (!res.is_succ || TextUtils.isEmpty(res.data.access_token)) {
            emitter.onNext(new StockModel.StockToken());
        } else {
            SyncRequest syncRequest = INSTANCE;
            StockModel.StockToken data = res.data;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            syncRequest.saveLocaleStockToken(data);
            emitter.onNext(res.data);
        }
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h getStockToken$lambda$7(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h io2Main$lambda$22(o4h upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return upstream.S(ofl.c()).H(ua1.c());
    }

    private final boolean isFarAway(double longitude, double latitude, LocationKey localLocationKey) {
        return v84.a(longitude, latitude, localLocationKey.longitude, localLocationKey.latitude) > 500.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStockRequestExpired(int code, String error) {
        return code == STOCK_CODE_TOKEN_EXPIRED || 401 == code || 403 == code || Intrinsics.areEqual("invalid_token", error) || code == 22222 || code == 22223;
    }

    private final String md5(String string) {
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = string.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = MessageDigest.getInstance(Coder.KEY_MD5).digest(bytes);
            Intrinsics.checkNotNull(bArrDigest);
            return byteArrayToHex(bArrDigest);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performAgpsRequest$lambda$23(be1 response, String file, AgpsRes.Result it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(it, "it");
        if (TextUtils.isEmpty(it.agps_fds_url)) {
            String tag = SyncEngine.INSTANCE.getTAG();
            Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
            Logger.e(tag, "performAgpsRequest: res = " + it.toString());
            response.onFailure();
            return Unit.INSTANCE;
        }
        String tag2 = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
        Logger.i(tag2, "AGPS URL : " + it.agps_fds_url);
        SyncRequest syncRequest = INSTANCE;
        String agps_fds_url = it.agps_fds_url;
        Intrinsics.checkNotNullExpressionValue(agps_fds_url, "agps_fds_url");
        syncRequest.downloadApgsFile(agps_fds_url, file, response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performAgpsRequest$lambda$24(be1 response, ApiException it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(it, "it");
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.e(tag, "performAgpsRequest: res error " + it);
        response.onFailure();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performWeatherRequest$lambda$25(be1 response, ApiException it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("Wearable.weather", "throwable:" + it, it);
        response.onFailure();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performWeatherRequest$lambda$26(be1 response, WeatherResp resp) {
        WeatherResp.Weather weather;
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(resp, "resp");
        if (resp.code == 0 && (weather = resp.result) != null && !TextUtils.isEmpty(weather.pubTime)) {
            WeatherResp.Weather result = resp.result;
            Intrinsics.checkNotNullExpressionValue(result, "result");
            response.onResponse(result);
            return Unit.INSTANCE;
        }
        Logger.i("Wearable.weather", "getWeatherFromNet success, but code:" + resp.code + "  result:  " + resp.result);
        response.onFailure();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performWeatherRequest$lambda$27(be1 response, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("Wearable.weather", "throwable:" + it, it);
        response.onFailure();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLocaleStockToken() {
        mStockToken = null;
        SyncPreference.INSTANCE.setLocalStockToken("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockInfo$lambda$20(final List symbols, final be1 response, StockModel.StockHost stockHost) {
        Intrinsics.checkNotNullParameter(symbols, "$symbols");
        Intrinsics.checkNotNullParameter(response, "$response");
        final String str = (stockHost != null ? stockHost.getHost() : null) + STOCK_INFO_API;
        o4h<StockModel.StockToken> stockToken = INSTANCE.getStockToken();
        final Function1 function1 = new Function1() { // from class: sto
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockInfo$lambda$20$lambda$18(str, symbols, response, (StockModel.StockToken) obj);
            }
        };
        return stockToken.r(new bua() { // from class: tto
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return SyncRequest.requestStockInfo$lambda$20$lambda$19(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockInfo$lambda$20$lambda$18(final String url, final List symbols, final be1 response, final StockModel.StockToken stockToken) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(symbols, "$symbols");
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(stockToken, "stockToken");
        return o4h.f(new j5h() { // from class: juo
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                SyncRequest.requestStockInfo$lambda$20$lambda$18$lambda$17(url, stockToken, symbols, response, v4hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStockInfo$lambda$20$lambda$18$lambda$17(String url, StockModel.StockToken stockToken, List symbols, final be1 response, final v4h emitter) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(stockToken, "$stockToken");
        Intrinsics.checkNotNullParameter(symbols, "$symbols");
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        SyncRequest syncRequest = INSTANCE;
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), syncRequest.getMService(), new SyncRequest$requestStockInfo$observable$1$1$1$1(url, stockToken, symbols, null)).error(new Function1() { // from class: fuo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockInfo$lambda$20$lambda$18$lambda$17$lambda$15(emitter, response, (ApiException) obj);
            }
        }).success(new Function1() { // from class: guo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockInfo$lambda$20$lambda$18$lambda$17$lambda$16(emitter, response, (StockModel.StockInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestStockInfo$lambda$20$lambda$18$lambda$17$lambda$15(v4h emitter, be1 response, ApiException it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(it, "it");
        if (emitter.isDisposed()) {
            response.onFailure();
            return Unit.INSTANCE;
        }
        emitter.onError(new Throwable(it.getMessage()));
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestStockInfo$lambda$20$lambda$18$lambda$17$lambda$16(v4h emitter, be1 response, StockModel.StockInfo it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(it, "it");
        if (emitter.isDisposed()) {
            response.onFailure();
            return Unit.INSTANCE;
        }
        emitter.onNext(it);
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockInfo$lambda$20$lambda$19(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockInfo$lambda$21(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockSuggest$lambda$13(String suggest, StockModel.StockHost stockHost) {
        Intrinsics.checkNotNullParameter(suggest, "$suggest");
        Intrinsics.checkNotNullParameter(stockHost, "stockHost");
        final String str = stockHost.getHost() + "/suggest/v11/" + suggest;
        o4h<StockModel.StockToken> stockToken = INSTANCE.getStockToken();
        final Function1 function1 = new Function1() { // from class: duo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockSuggest$lambda$13$lambda$11(str, (StockModel.StockToken) obj);
            }
        };
        return stockToken.r(new bua() { // from class: euo
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return SyncRequest.requestStockSuggest$lambda$13$lambda$12(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockSuggest$lambda$13$lambda$11(final String url, final StockModel.StockToken stockToken) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(stockToken, "stockToken");
        return o4h.f(new j5h() { // from class: ouo
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                SyncRequest.requestStockSuggest$lambda$13$lambda$11$lambda$10(url, stockToken, v4hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStockSuggest$lambda$13$lambda$11$lambda$10(String url, StockModel.StockToken stockToken, final v4h emitter) {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(stockToken, "$stockToken");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        SyncRequest syncRequest = INSTANCE;
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), syncRequest.getMService(), new SyncRequest$requestStockSuggest$observable$1$1$1$1(url, stockToken, null)).error(new Function1() { // from class: muo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockSuggest$lambda$13$lambda$11$lambda$10$lambda$8(emitter, (ApiException) obj);
            }
        }).success(new Function1() { // from class: nuo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockSuggest$lambda$13$lambda$11$lambda$10$lambda$9(emitter, (StockModel.StockSuggestResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestStockSuggest$lambda$13$lambda$11$lambda$10$lambda$8(v4h emitter, ApiException it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it, "it");
        emitter.onError(new Throwable(it.getMessage()));
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestStockSuggest$lambda$13$lambda$11$lambda$10$lambda$9(v4h emitter, StockModel.StockSuggestResult it) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it, "it");
        emitter.onNext(it);
        emitter.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockSuggest$lambda$13$lambda$12(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h requestStockSuggest$lambda$14(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    private final void saveLocaleStockHost(StockModel.StockHost stockHost) {
        mStockHost = stockHost;
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        String json = getMGson().toJson(stockHost);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        syncPreference.setLocalStockHost(json);
    }

    private final void saveLocaleStockToken(StockModel.StockToken token) {
        mStockToken = token;
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        String json = getMGson().toJson(token);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        syncPreference.setLocalStockToken(json);
    }

    public final void destroy() {
        mComposite.d();
    }

    public final void getCityNameByLocation(@Nullable String data, @NotNull final be1<LocationByNameResp> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C32311(data, null)).error(new Function1() { // from class: ruo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getCityNameByLocation$lambda$28(response, (ApiException) obj);
            }
        }).success(new Function1() { // from class: suo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.getCityNameByLocation$lambda$29(response, (LocationByNameResp) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final o4h<StockModel.StockHost> getStockHost() {
        StockModel.StockHost localeStockHost = getLocaleStockHost();
        if (localeStockHost == null) {
            o4h<StockModel.StockHost> o4hVarF = o4h.f(new j5h() { // from class: wto
                @Override // defpackage.j5h
                public final void subscribe(v4h v4hVar) {
                    SyncRequest.getStockHost$lambda$2(v4hVar);
                }
            });
            Intrinsics.checkNotNull(o4hVarF);
            return o4hVarF;
        }
        o4h<StockModel.StockHost> o4hVarE = o4h.E(localeStockHost);
        Intrinsics.checkNotNull(o4hVarE);
        return o4hVarE;
    }

    @NotNull
    public final <T> w5h<T, T> io2Main() {
        return new w5h() { // from class: luo
            @Override // defpackage.w5h
            public final o5h a(o4h o4hVar) {
                return SyncRequest.io2Main$lambda$22(o4hVar);
            }
        };
    }

    public final void performAgpsRequest(@NotNull String source, int type, boolean online, int days, @NotNull final be1<String> response) {
        String str;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(response, "response");
        final String str2 = r72.d() + File.separator + source + type + (online ? "_online" : "_offline");
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.i(tag, "file:" + str2 + " , type : " + type);
        if (!Intrinsics.areEqual("ublox", source)) {
            new AgpsRequest().getAgpsUrl(new AgpsRequestModel(source, days, type, null, 8, null), online, new Function1() { // from class: qto
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SyncRequest.performAgpsRequest$lambda$23(response, str2, (AgpsRes.Result) obj);
                }
            }, new Function1() { // from class: buo
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SyncRequest.performAgpsRequest$lambda$24(response, (ApiException) obj);
                }
            });
            return;
        }
        if (online) {
            str = AGPS_ONLINE_URL;
        } else {
            str = AGPS_OFFLINE_URL + days;
        }
        downloadApgsFile(str, str2, response);
    }

    public final void performWeatherRequest(double latitude, double longitude, @Nullable LocationKey locationKey, @NotNull final be1<WeatherResp.Weather> response) {
        Request.GetWeather getWeatherCreate;
        String firmwareVersion;
        String model;
        String str;
        Intrinsics.checkNotNullParameter(response, "response");
        if (locationKey != null && (str = locationKey.locationKey) != null && str.length() != 0) {
            isFarAway(longitude, latitude, locationKey);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String str2 = (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) ? "" : model;
        String str3 = (wearableDeviceModel == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) == null) ? "" : firmwareVersion;
        String str4 = locationKey != null ? locationKey.locationKey : null;
        if (str4 == null || str4.length() == 0 || longitude == 0.0d || latitude == 0.0d) {
            String str5 = locationKey != null ? locationKey.locationKey : null;
            if (str5 != null && str5.length() != 0) {
                Logger.i("Wearable.weather", "getWeatherFromNet use locationKey");
                getWeatherCreate = Request.GetWeather.INSTANCE.create(locationKey != null ? locationKey.locationKey : null, null, null, str2, str3);
            } else if (longitude == 0.0d || latitude == 0.0d) {
                Logger.i("Wearable.weather", "getWeatherFromNet no request");
                getWeatherCreate = null;
            } else {
                Logger.i("Wearable.weather", "getWeatherFromNet use latitude longitude ");
                getWeatherCreate = Request.GetWeather.INSTANCE.create(null, Double.valueOf(longitude), Double.valueOf(latitude), str2, str3);
            }
        } else {
            Logger.i("Wearable.weather", "getWeatherFromNet use locationKey latitude longitude");
            getWeatherCreate = Request.GetWeather.INSTANCE.create(locationKey != null ? locationKey.locationKey : null, Double.valueOf(longitude), Double.valueOf(latitude), str2, str3);
        }
        if (getWeatherCreate == null) {
            response.onFailure();
            return;
        }
        String json = getMGson().toJson(getWeatherCreate);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        ScopeExtKt.scopeNet$default(null, new AnonymousClass5(longitude, latitude, locationKey, Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry(), json, response, null), 1, null).m503catch(new Function2() { // from class: xto
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SyncRequest.performWeatherRequest$lambda$27(response, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void requestStockInfo(final boolean needRetry, @NotNull final List<String> symbols, @NotNull final be1<StockModel.StockInfo> response) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        Intrinsics.checkNotNullParameter(response, "response");
        o4h<StockModel.StockHost> stockHost = getStockHost();
        final Function1 function1 = new Function1() { // from class: auo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockInfo$lambda$20(symbols, response, (StockModel.StockHost) obj);
            }
        };
        o4h<R> o4hVarR = stockHost.r(new bua() { // from class: cuo
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return SyncRequest.requestStockInfo$lambda$21(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarR, "flatMap(...)");
        z5h z5hVarT = o4hVarR.c(io2Main()).T(new u92<StockModel.StockInfo>() { // from class: com.xiaomi.fitness.sync.net.SyncRequest.requestStockInfo.1
            @Override // defpackage.u92
            public void onFail(int code, String msg) {
                boolean z;
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.i(tag, "requestStockInfo onFail:code = " + code + " msg = " + msg);
                SyncRequest syncRequest = SyncRequest.INSTANCE;
                if (msg == null) {
                    msg = "";
                }
                if (syncRequest.isStockRequestExpired(code, msg)) {
                    syncRequest.removeLocaleStockToken();
                    z = true;
                } else {
                    z = false;
                }
                if (needRetry && z) {
                    syncRequest.requestStockInfo(false, symbols, response);
                } else {
                    response.onFailure();
                }
            }

            @Override // defpackage.u92
            public void onSuccess(StockModel.StockInfo stockInfo) {
                Intrinsics.checkNotNullParameter(stockInfo, "stockInfo");
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.i(tag, "requestStockInfo onSuccess:" + stockInfo);
                response.onResponse(stockInfo);
            }
        });
        Intrinsics.checkNotNullExpressionValue(z5hVarT, "subscribeWith(...)");
        add((jz6) z5hVarT);
    }

    public final void requestStockSuggest(final boolean needRetry, @NotNull final String suggest, @NotNull final be1<StockModel.StockSuggestResult> response) {
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        Intrinsics.checkNotNullParameter(response, "response");
        o4h<StockModel.StockHost> stockHost = getStockHost();
        final Function1 function1 = new Function1() { // from class: tuo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.requestStockSuggest$lambda$13(suggest, (StockModel.StockHost) obj);
            }
        };
        o4h<R> o4hVarR = stockHost.r(new bua() { // from class: rto
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return SyncRequest.requestStockSuggest$lambda$14(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarR, "flatMap(...)");
        z5h z5hVarT = o4hVarR.c(io2Main()).T(new u92<StockModel.StockSuggestResult>() { // from class: com.xiaomi.fitness.sync.net.SyncRequest.requestStockSuggest.1
            @Override // defpackage.u92
            public void onFail(int code, String msg) {
                boolean z;
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.i(tag, "requestStockSuggest onFail:code = " + code + " msg = " + msg);
                SyncRequest syncRequest = SyncRequest.INSTANCE;
                Intrinsics.checkNotNull(msg);
                if (syncRequest.isStockRequestExpired(code, msg)) {
                    syncRequest.removeLocaleStockToken();
                    z = true;
                } else {
                    z = false;
                }
                if (needRetry && z) {
                    syncRequest.requestStockSuggest(false, suggest, response);
                } else {
                    response.onFailure();
                }
            }

            @Override // defpackage.u92
            public void onSuccess(StockModel.StockSuggestResult stockSuggestResult) {
                Intrinsics.checkNotNullParameter(stockSuggestResult, "stockSuggestResult");
                response.onResponse(stockSuggestResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(z5hVarT, "subscribeWith(...)");
        add((jz6) z5hVarT);
    }

    @Nullable
    public final Object performWeatherRequest(@Nullable String str, double d, double d2, @NotNull final be1<WeatherResp.Weather> be1Var, @NotNull Continuation<? super Unit> continuation) {
        String str2;
        String firmwareVersion;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            String model = DeviceModelExtKt.getModel(wearableDeviceModel);
            firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
            str2 = model;
        } else {
            str2 = null;
            firmwareVersion = null;
        }
        String json = getMGson().toJson(Request.GetWeather.INSTANCE.create(str, Boxing.boxDouble(d), Boxing.boxDouble(d2), str2, firmwareVersion));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        String str3 = Locale.getDefault().getLanguage() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Locale.getDefault().getCountry();
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), INSTANCE.getMService(), new AnonymousClass2(str3, json, null)).error(new Function1() { // from class: puo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.performWeatherRequest$lambda$25(be1Var, (ApiException) obj);
            }
        }).success(new Function1() { // from class: quo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SyncRequest.performWeatherRequest$lambda$26(be1Var, (WeatherResp) obj);
            }
        });
        return Unit.INSTANCE;
    }
}
