package com.xiaomi.fitness.route.track.utils;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.route.export.track.FdsResult;
import com.xiaomi.fitness.route.track.server.TrackRepository;
import defpackage.x0j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/TrackFDSUploader;", "", "<init>", "()V", "BASE64_FLAG", "", "upload", "Lcom/xiaomi/fitness/route/export/track/FdsResult;", "url", "", "file", "Ljava/io/File;", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "byteArray", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadRoute", "toByteArray", "inputStream", "Ljava/io/InputStream;", "downloadFromUrl", "genDataIdKeyBytes", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "getRequest", "Lokhttp3/Call;", "uploadRequest", "method", "readFile", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackFDSUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackFDSUploader.kt\ncom/xiaomi/fitness/route/track/utils/TrackFDSUploader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
public final class TrackFDSUploader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = TrackRepository.TAG;

    @NotNull
    private static final TrackFDSUploader instance = new TrackFDSUploader();
    private final int BASE64_FLAG = 11;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/TrackFDSUploader$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/route/track/utils/TrackFDSUploader;", "getInstance", "()Lcom/xiaomi/fitness/route/track/utils/TrackFDSUploader;", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrackFDSUploader getInstance() {
            return TrackFDSUploader.instance;
        }
    }

    private TrackFDSUploader() {
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

    private final Call getRequest(String url) {
        return new OkHttpClient().newCall(new Request.Builder().url(url).get().build());
    }

    private final byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int i = inputStream.read(bArr, 0, 16384);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Call uploadRequest(String url, String method, File file) {
        return new OkHttpClient().newCall(new Request.Builder().url(url).method(method, new MultipartBody.Builder(null, 1, 0 == true ? 1 : 0).setType(MultipartBody.FORM).addFormDataPart("file", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("application/gpx+xml"))).build()).build());
    }

    @Nullable
    public final byte[] downloadFromUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Response responseExecute = getRequest(url).execute();
            FitnessLogUtils.i(TAG, "download code = " + responseExecute.code() + ", msg = " + responseExecute.message());
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody != null) {
                return responseBodyBody.bytes();
            }
            return null;
        } catch (IOException e) {
            FitnessLogUtils.e(TAG, "download failed", e);
            return null;
        }
    }

    @Nullable
    public final byte[] downloadRoute(@NotNull String url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        Response responseExecute = getRequest(url).execute();
        FitnessLogUtils.i(TAG, "download code = " + responseExecute.code() + ", msg = " + AppUtil.getApp().getString(x0j.common_network_error_retry_later));
        try {
            ResponseBody responseBodyBody = responseExecute.body();
            InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
            Intrinsics.checkNotNull(inputStreamByteStream);
            return toByteArray(inputStreamByteStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final byte[] readFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            FitnessLogUtils.w(TAG, "file not exist");
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                randomAccessFile.readFully(bArr);
                CloseableKt.closeFinally(randomAccessFile, null);
                return bArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(randomAccessFile, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            FitnessLogUtils.e(TAG, "readFitnessFile", e);
            return null;
        }
    }

    @Nullable
    public final Object upload(@NotNull String str, @NotNull File file, @NotNull Continuation<? super FdsResult> continuation) {
        byte[] file2 = readFile(file);
        if (file2 != null && file2.length == 0) {
            FitnessLogUtils.i(TAG, "upload track fds , the track file is empty");
            return new FdsResult(false);
        }
        byte[] file3 = readFile(file);
        Intrinsics.checkNotNull(file3);
        try {
            Response responseExecute = uploadRequest(str, "PUT", file3).execute();
            try {
                FitnessLogUtils.i(TAG, "upload code: " + responseExecute.code() + ", msg: " + responseExecute.message());
                FdsResult fdsResult = new FdsResult(responseExecute.isSuccessful());
                CloseableKt.closeFinally(responseExecute, null);
                return fdsResult;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(TAG, "upload failed", e);
            return new FdsResult(false);
        }
    }

    @Nullable
    public final Object upload(@NotNull String str, @NotNull byte[] bArr, @NotNull Continuation<? super FdsResult> continuation) throws Exception {
        try {
            Response responseExecute = uploadRequest(str, "PUT", bArr).execute();
            try {
                FitnessLogUtils.i(TAG, "upload code: " + responseExecute.code() + ", msg: " + responseExecute.message());
                FdsResult fdsResult = new FdsResult(responseExecute.isSuccessful());
                CloseableKt.closeFinally(responseExecute, null);
                return fdsResult;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(TAG, "upload failed", e);
            throw e;
        }
    }

    private final Call uploadRequest(String url, String method, byte[] byteArray) {
        return new OkHttpClient().newCall(new Request.Builder().url(url).method(method, RequestBody.Companion.create$default(RequestBody.INSTANCE, byteArray, (MediaType) null, 0, 0, 6, (Object) null)).build());
    }
}
