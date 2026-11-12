package com.xiaomi.fitness.sync.net;

import android.os.Build;
import android.util.DisplayMetrics;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.common.utils.ByteUtilKt;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sync.model.StockHostResp;
import com.xiaomi.fitness.sync.net.StockHostRequest;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.i1j;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bJ\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sync/net/StockHostRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sync/net/StockHostService;", "<init>", "()V", "getStockHost", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sync/model/StockHostResp;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getStockParams", "Ljava/util/HashMap;", "", "md5", "string", "byteArrayToHex", "byteArray", "", "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStockHostRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockHostRequest.kt\ncom/xiaomi/fitness/sync/net/StockHostRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,90:1\n89#2,5:91\n*S KotlinDebug\n*F\n+ 1 StockHostRequest.kt\ncom/xiaomi/fitness/sync/net/StockHostRequest\n*L\n42#1:91,5\n*E\n"})
public final class StockHostRequest extends BaseRequest<StockHostService> {

    @NotNull
    private static final String GUEST_SALT = "SVAHDTUCDDQKQSZVKZET";

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.net.StockHostRequest$getStockHost$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sync/model/StockHostResp;", "service", "Lcom/xiaomi/fitness/sync/net/StockHostService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.net.StockHostRequest$getStockHost$2", f = "StockHostRequest.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<StockHostService, Continuation<? super StockHostResp>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = StockHostRequest.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StockHostService stockHostService, Continuation<? super StockHostResp> continuation) {
            return ((AnonymousClass2) create(stockHostService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StockHostService stockHostService = (StockHostService) this.L$0;
                HashMap<String, String> stockParams = StockHostRequest.this.getStockParams();
                this.label = 1;
                obj = stockHostService.getStockHost(stockParams, this);
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

    private final String byteArrayToHex(byte[] byteArray) {
        char[] cArr = new char[byteArray.length * 2];
        int i = 0;
        for (byte b2 : byteArray) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b2 >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[ByteUtilKt.and(b2, 15)];
        }
        return new String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getStockHost$default(StockHostRequest stockHostRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: ego
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return StockHostRequest.getStockHost$lambda$0((ApiException) obj2);
                }
            };
        }
        stockHostRequest.getStockHost(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStockHost$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
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
        map.put("appName", ApplicationExtKt.getApplication().getString(i1j.c));
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

    public final void getStockHost(@NotNull Function1<? super StockHostResp, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(null)).error(error).success(success);
    }
}
