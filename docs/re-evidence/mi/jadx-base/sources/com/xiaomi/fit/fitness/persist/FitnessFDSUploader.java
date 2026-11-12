package com.xiaomi.fit.fitness.persist;

import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.DataResult;
import com.xiaomi.fit.fitness.persist.FitnessFDSUploader;
import com.xiaomi.fit.fitness.persist.server.FitnessFDSRequest;
import com.xiaomi.fit.fitness.persist.server.data.FDSItem;
import com.xiaomi.fit.fitness.persist.server.data.FDSResultValue;
import com.xiaomi.fit.fitness.persist.utils.AESCoder;
import com.xiaomi.fit.fitness.persist.utils.HashCoder;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J \u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/persist/FitnessFDSUploader;", "", "<init>", "()V", "TAG", "", "BASE64_FLAG", "", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "uploadToFDS", "Lcom/xiaomi/fit/fitness/export/data/DataResult;", "sid", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "data", "", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFromFDS", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upload", "value", "Lcom/xiaomi/fit/fitness/persist/server/data/FDSResultValue;", "download", "downloadRoute", "url", "downloadFromUrl", "genFdsUrlItem", "Lcom/xiaomi/fit/fitness/persist/server/data/FDSItem;", "genDataIdKeyBytes", "getRequest", "Lokhttp3/Call;", "uploadRequest", "method", "body", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessFDSUploader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final FitnessFDSUploader instance = new FitnessFDSUploader();

    @NotNull
    private final String TAG = "FitnessFDSUploader";
    private final int BASE64_FLAG = 11;

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessFDSUploader.mFitnessRequest_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/FitnessFDSUploader$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/FitnessFDSUploader;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/FitnessFDSUploader;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessFDSUploader getInstance() {
            return FitnessFDSUploader.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.FitnessFDSUploader$downloadFromFDS$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.FitnessFDSUploader", f = "FitnessFDSUploader.kt", i = {0, 0}, l = {51}, m = "downloadFromFDS", n = {"this", "item"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSUploader.this.downloadFromFDS(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.FitnessFDSUploader$uploadToFDS$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.FitnessFDSUploader", f = "FitnessFDSUploader.kt", i = {0, 0, 0, 0}, l = {33}, m = "uploadToFDS", n = {"this", "dataId", "data", "item"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C15961 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C15961(Continuation<? super C15961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSUploader.this.uploadToFDS(null, null, null, this);
        }
    }

    private FitnessFDSUploader() {
    }

    private final byte[] download(FDSResultValue value) throws Exception {
        if (TextUtils.isEmpty(value.getObjectKey())) {
            FitnessLogUtils.i(this.TAG, "download objectKey is null");
            throw new Exception("download objectKey is null");
        }
        String strDownloadFromUrl = downloadFromUrl(value.getUrl());
        if (strDownloadFromUrl == null || TextUtils.isEmpty(strDownloadFromUrl)) {
            FitnessLogUtils.i(this.TAG, "blockingDownloadOnline: failed");
            throw new Exception("blockingDownloadOnline: failed");
        }
        String objectKey = value.getObjectKey();
        Intrinsics.checkNotNull(objectKey);
        byte[] bArrDecrypt = new AESCoder(objectKey).decrypt(strDownloadFromUrl);
        if (bArrDecrypt == null) {
            FitnessLogUtils.w(this.TAG, "download: aes decrypt failed");
            throw new Exception("download: aes decrypt failed");
        }
        FitnessLogUtils.d(this.TAG, value.getObjectName() + " download data size: " + bArrDecrypt.length);
        return bArrDecrypt;
    }

    private final byte[] genDataIdKeyBytes(FitnessDataId dataId) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt((int) dataId.getTimeStamp());
        byteBufferOrder.put((byte) dataId.getTzIn15Min());
        byteBufferOrder.put(dataId.genDataTypeByte());
        byte[] bArrArray = byteBufferOrder.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    private final FDSItem genFdsUrlItem(String sid, FitnessDataId dataId) {
        return new FDSItem(dataId.getTimeStamp(), Base64.encodeToString(genDataIdKeyBytes(dataId), this.BASE64_FLAG) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + HashCoder.INSTANCE.hash4SHA1(sid, this.BASE64_FLAG));
    }

    private final FitnessFDSRequest getMFitnessRequest() {
        return (FitnessFDSRequest) this.mFitnessRequest.getValue();
    }

    private final Call getRequest(String url) {
        return new OkHttpClient().newCall(new Request.Builder().url(url).get().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessFDSRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessFDSRequest();
    }

    private final DataResult upload(FDSResultValue value, byte[] data) throws IOException {
        FitnessLogUtils.i(this.TAG, value.getObjectName() + " upload raw data size: " + data.length);
        if (value.getObjectKey() == null) {
            FitnessLogUtils.w(this.TAG, "upload, objectKey should not be null");
            return new DataResult(false, 1, "upload, objectKey should not be null");
        }
        String strEncryptToString = new AESCoder(value.getObjectKey()).encryptToString(data);
        if (strEncryptToString == null) {
            FitnessLogUtils.w(this.TAG, "upload, aes code failed");
            return new DataResult(false, 1, "upload, aes code failed");
        }
        try {
            Response responseExecute = uploadRequest(value.getUrl(), value.getMethod(), strEncryptToString).execute();
            try {
                FitnessLogUtils.i(this.TAG, "upload code: " + responseExecute.code() + ", msg: " + responseExecute.message());
                DataResult dataResult = new DataResult(responseExecute.isSuccessful());
                CloseableKt.closeFinally(responseExecute, null);
                return dataResult;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            FitnessLogUtils.INSTANCE.w(this.TAG, "upload failed", e);
            throw e;
        }
    }

    private final Call uploadRequest(String url, String method, String body) {
        OkHttpClient okHttpClient = new OkHttpClient();
        String json = new Gson().toJson(body);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        Intrinsics.checkNotNull(json);
        return okHttpClient.newCall(new Request.Builder().url(url).method(method, companion.create(json, (MediaType) null)).build());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: Exception -> 0x0032, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002e, B:23:0x005a, B:25:0x0068, B:27:0x0083), top: B:35:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #1 {Exception -> 0x0032, blocks: (B:12:0x002e, B:23:0x005a, B:25:0x0068, B:27:0x0083), top: B:35:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0068, please report this as an issue */
    @Nullable
    public final Object downloadFromFDS(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull Continuation<? super byte[]> continuation) {
        AnonymousClass1 anonymousClass1;
        FitnessFDSUploader fitnessFDSUploader;
        FDSItem fDSItem;
        FDSResultValue fDSResultValue;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object fDSDownloadUrl = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fDSItem = (FDSItem) anonymousClass1.L$1;
            fitnessFDSUploader = (FitnessFDSUploader) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(fDSDownloadUrl);
                fDSResultValue = (FDSResultValue) ((Map) fDSDownloadUrl).get(fDSItem.toServerKey());
                if (fDSResultValue == null) {
                    FitnessLogUtils.i(fitnessFDSUploader.TAG, "getFDSDownloadUrl success");
                    return fitnessFDSUploader.download(fDSResultValue);
                }
                FitnessLogUtils.i(fitnessFDSUploader.TAG, "getFDSDownloadUrl: failed, no value of " + fDSItem.toServerKey());
                return null;
            } catch (Exception e) {
                e = e;
                FitnessLogUtils.INSTANCE.w(fitnessFDSUploader.TAG, "downloadFromFDS", e);
                return null;
            }
        }
        ResultKt.throwOnFailure(fDSDownloadUrl);
        try {
            FDSItem fDSItemGenFdsUrlItem = genFdsUrlItem(str, fitnessDataId);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = fDSItemGenFdsUrlItem;
            anonymousClass1.label = 1;
            fDSDownloadUrl = getMFitnessRequest().getFDSDownloadUrl(str, new FDSItem[]{fDSItemGenFdsUrlItem}, anonymousClass1);
            if (fDSDownloadUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
            fDSItem = fDSItemGenFdsUrlItem;
            fitnessFDSUploader = this;
            fDSResultValue = (FDSResultValue) ((Map) fDSDownloadUrl).get(fDSItem.toServerKey());
            if (fDSResultValue == null) {
                FitnessLogUtils.i(fitnessFDSUploader.TAG, "getFDSDownloadUrl success");
                return fitnessFDSUploader.download(fDSResultValue);
            }
            FitnessLogUtils.i(fitnessFDSUploader.TAG, "getFDSDownloadUrl: failed, no value of " + fDSItem.toServerKey());
            return null;
        } catch (Exception e2) {
            e = e2;
            fitnessFDSUploader = this;
            FitnessLogUtils.INSTANCE.w(fitnessFDSUploader.TAG, "downloadFromFDS", e);
            return null;
        }
    }

    @Nullable
    public final String downloadFromUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Response responseExecute = getRequest(url).execute();
            FitnessLogUtils.i(this.TAG, "download code = " + responseExecute.code() + ", msg = " + responseExecute.message());
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody != null) {
                return responseBodyBody.string();
            }
            return null;
        } catch (IOException e) {
            FitnessLogUtils.e(this.TAG, "download failed", e);
            return null;
        }
    }

    @Nullable
    public final byte[] downloadRoute(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Response responseExecute = getRequest(url).execute();
            FitnessLogUtils.i(this.TAG, "download code = " + responseExecute.code() + ", msg = " + responseExecute.message());
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody != null) {
                return responseBodyBody.bytes();
            }
            return null;
        } catch (IOException e) {
            FitnessLogUtils.e(this.TAG, "download failed", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0037, B:23:0x0069, B:25:0x0077, B:27:0x0097), top: B:33:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0037, B:23:0x0069, B:25:0x0077, B:27:0x0097), top: B:33:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0077, please report this as an issue */
    @Nullable
    public final Object uploadToFDS(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull byte[] bArr, @NotNull Continuation<? super DataResult> continuation) {
        C15961 c15961;
        FitnessFDSUploader fitnessFDSUploader;
        FDSItem fDSItem;
        FDSResultValue fDSResultValue;
        if (continuation instanceof C15961) {
            c15961 = (C15961) continuation;
            int i = c15961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15961.label = i - Integer.MIN_VALUE;
            } else {
                c15961 = new C15961(continuation);
            }
        } else {
            c15961 = new C15961(continuation);
        }
        Object obj = c15961.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c15961.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fDSItem = (FDSItem) c15961.L$3;
            bArr = (byte[]) c15961.L$2;
            fitnessDataId = (FitnessDataId) c15961.L$1;
            fitnessFDSUploader = (FitnessFDSUploader) c15961.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                fDSResultValue = (FDSResultValue) ((Map) obj).get(fDSItem.toServerKey());
                if (fDSResultValue == null) {
                    FitnessLogUtils.i(fitnessFDSUploader.TAG, "getFDSUploadUrl success");
                    return fitnessFDSUploader.upload(fDSResultValue, bArr);
                }
                String str2 = "getFDSUploadUrl: failed, no value of " + fDSItem.toServerKey();
                FitnessLogUtils.i(fitnessFDSUploader.TAG, str2);
                return new DataResult(false, 1, str2);
            } catch (Exception e) {
                e = e;
                FitnessLogUtils.INSTANCE.w(fitnessFDSUploader.TAG, "uploadToFDS(" + fitnessDataId + ")", e);
                return new DataResult(false, 1, e.toString());
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            FDSItem fDSItemGenFdsUrlItem = genFdsUrlItem(str, fitnessDataId);
            c15961.L$0 = this;
            c15961.L$1 = fitnessDataId;
            c15961.L$2 = bArr;
            c15961.L$3 = fDSItemGenFdsUrlItem;
            c15961.label = 1;
            Object fDSUploadUrl = getMFitnessRequest().getFDSUploadUrl(str, new FDSItem[]{fDSItemGenFdsUrlItem}, c15961);
            if (fDSUploadUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessFDSUploader = this;
            obj = fDSUploadUrl;
            fDSItem = fDSItemGenFdsUrlItem;
            fDSResultValue = (FDSResultValue) ((Map) obj).get(fDSItem.toServerKey());
            if (fDSResultValue == null) {
                FitnessLogUtils.i(fitnessFDSUploader.TAG, "getFDSUploadUrl success");
                return fitnessFDSUploader.upload(fDSResultValue, bArr);
            }
            String str3 = "getFDSUploadUrl: failed, no value of " + fDSItem.toServerKey();
            FitnessLogUtils.i(fitnessFDSUploader.TAG, str3);
            return new DataResult(false, 1, str3);
        } catch (Exception e2) {
            e = e2;
            fitnessFDSUploader = this;
            FitnessLogUtils.INSTANCE.w(fitnessFDSUploader.TAG, "uploadToFDS(" + fitnessDataId + ")", e);
            return new DataResult(false, 1, e.toString());
        }
    }
}
