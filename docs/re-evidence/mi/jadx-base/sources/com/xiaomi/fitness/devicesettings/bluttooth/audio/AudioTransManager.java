package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.DeleteResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.GetUploadUrl;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.TransResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequestExtKt;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.wzi;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\f*\u0001\u001e\u0018\u0000 =2\u00020\u0001:\u0002<=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jr\u0010 \u001a\u00020\u00142j\u0010!\u001af\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00140\u000bJ\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0016J\u0016\u0010%\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010'\u001a\u00020\u0014J\u0016\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002J\u0006\u00100\u001a\u00020\u0014J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u0007H\u0002J\"\u00104\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u00107\u001a\u00020\u0007J\u0012\u00108\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u00010\u0007J\u001c\u00109\u001a\u0004\u0018\u00010\u00072\b\u0010:\u001a\u0004\u0018\u0001022\b\u0010;\u001a\u0004\u0018\u00010\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e¢\u0006\u0002\n\u0000Re\u0010\n\u001aY\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager;", "", "<init>", "()V", "downLoadMap", "Ljava/util/HashMap;", "", "", "removeObjNameList", "", "mCallBack", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "status", "time", "objName", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "", "isHandlerStarted", "", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "mHandler$delegate", "Lkotlin/Lazy;", "mRunnable", "com/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager$mRunnable$1", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager$mRunnable$1;", "addCallBack", "callBack", "contentList", "removeCallBack", "canAddData", "addData", "startHandler", "stopHandler", "postTransTask", "item", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "format", "isInValidMsg", "getUploadUrl", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "getTransResult", "removeTransResult", "readAudioFile", "", "fileName", "uploadFile", "url", "method", "data", "downLoadUrl", "encryptUrlSafe", "dataArray", "key", "Singleton", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioTransManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTransManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1#2:355\n1863#3,2:356\n1863#3,2:358\n*S KotlinDebug\n*F\n+ 1 AudioTransManager.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager\n*L\n161#1:356,2\n241#1:358,2\n*E\n"})
public final class AudioTransManager {

    @NotNull
    private static final String CipherMode = "AES/CBC/PKCS5Padding";
    private static final int LIST_MAX_SIZE = 20;
    private static final long QUERY_TIME_INTERVAL = 5000;
    public static final int STATUS_FAILED = 3;
    public static final int STATUS_NO_TRANS = 4;
    public static final int STATUS_START = 5;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_TRANSING = 2;

    @NotNull
    private static final String TAG = "AudioTransManager";
    private boolean isHandlerStarted;

    @Nullable
    private Function4<? super Integer, ? super Long, ? super String, ? super List<AsrResultItem>, Unit> mCallBack;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AudioTransManager instance = Singleton.INSTANCE.getHolder();

    @NotNull
    private HashMap<Long, String> downLoadMap = new HashMap<>(20);

    @NotNull
    private List<String> removeObjNameList = new ArrayList();

    /* JADX INFO: renamed from: mHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tp1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AudioTransManager.mHandler_delegate$lambda$0();
        }
    });

    @NotNull
    private final AudioTransManager$mRunnable$1 mRunnable = new Runnable() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioTransManager$mRunnable$1
        @Override // java.lang.Runnable
        public void run() {
            if (this.this$0.downLoadMap.isEmpty()) {
                this.this$0.stopHandler();
            } else {
                this.this$0.getTransResult();
                this.this$0.getMHandler().postDelayed(this, 5000L);
            }
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager$Companion;", "", "<init>", "()V", "TAG", "", "CipherMode", "LIST_MAX_SIZE", "", "QUERY_TIME_INTERVAL", "", "STATUS_SUCCESS", "STATUS_TRANSING", "STATUS_FAILED", "STATUS_NO_TRANS", "STATUS_START", "instance", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager;", "getInstance", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AudioTransManager getInstance() {
            return AudioTransManager.instance;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager$Singleton;", "", "<init>", "()V", "holder", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager;", "getHolder", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioTransManager;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Singleton {

        @NotNull
        public static final Singleton INSTANCE = new Singleton();

        @NotNull
        private static final AudioTransManager holder = new AudioTransManager();

        private Singleton() {
        }

        @NotNull
        public final AudioTransManager getHolder() {
            return holder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getTransResult() {
        if (NetworkExtKt.isNetworkAvailable()) {
            DeviceSettingsRequest deviceSettingsRequest = DeviceSettingsRequestExtKt.getDeviceSettingsRequest();
            Collection<String> collectionValues = this.downLoadMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            deviceSettingsRequest.getTransResult(CollectionsKt___CollectionsKt.toList(collectionValues), new Function1() { // from class: up1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AudioTransManager.getTransResult$lambda$5(this.f35986a, (TransResultList) obj);
                }
            }, new Function1() { // from class: vp1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AudioTransManager.getTransResult$lambda$6((ApiException) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r9v8, types: [T, java.lang.CharSequence, java.lang.String] */
    public static final Unit getTransResult$lambda$5(AudioTransManager this$0, TransResultList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getTransResult:" + it);
        if (it.getResultList().isEmpty()) {
            return Unit.INSTANCE;
        }
        for (GetUploadUrl getUploadUrl : it.getResultList()) {
            String url = getUploadUrl.getUrl();
            if (url != null && url.length() != 0) {
                String name = getUploadUrl.getName();
                List listSplit$default = name != null ? StringsKt__StringsKt.split$default((CharSequence) name, new String[]{"."}, false, 0, 6, (Object) null) : null;
                if (listSplit$default != null && listSplit$default.size() >= 1) {
                    Intrinsics.checkNotNull(listSplit$default);
                    if (((CharSequence) listSplit$default.get(0)).length() != 0) {
                        Ref.LongRef longRef = new Ref.LongRef();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = "";
                        for (Map.Entry<Long, String> entry : this$0.downLoadMap.entrySet()) {
                            long jLongValue = entry.getKey().longValue();
                            String value = entry.getValue();
                            if (StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) listSplit$default.get(0), false, 2, (Object) null)) {
                                longRef.element = jLongValue;
                                objectRef.element = value;
                            }
                        }
                        Logger.i(TAG, "downLoadMap find key:" + longRef.element + ",name:" + objectRef.element);
                        if (longRef.element != 0 && ((CharSequence) objectRef.element).length() != 0) {
                            this$0.downLoadMap.remove(Long.valueOf(longRef.element));
                            AnyExtKt.io$default(null, new AudioTransManager$getTransResult$1$1$1(this$0, url, longRef, objectRef, null), 1, null);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTransResult$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "getTransResult Exception:" + it);
        return Unit.INSTANCE;
    }

    private final boolean isInValidMsg(GetUploadUrl getUploadUrl) {
        String name;
        String secretKey;
        String url = getUploadUrl.getUrl();
        return url == null || url.length() == 0 || (name = getUploadUrl.getName()) == null || name.length() == 0 || (secretKey = getUploadUrl.getSecretKey()) == null || secretKey.length() == 0 || getUploadUrl.getExpiresTime() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postTransTask$lambda$1(AudioTransManager this$0, AudioRecordEntity item, String format, GetUploadUrl getUploadUrl) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(format, "$format");
        Intrinsics.checkNotNullParameter(getUploadUrl, "getUploadUrl");
        Logger.i(TAG, "getUploadUrl result:" + getUploadUrl);
        if (this$0.isInValidMsg(getUploadUrl)) {
            return Unit.INSTANCE;
        }
        AnyExtKt.io$default(null, new AudioTransManager$postTransTask$1$1(this$0, item, format, getUploadUrl, getUploadUrl.getName(), null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postTransTask$lambda$2(AudioTransManager this$0, AudioRecordEntity item, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "getUploadUrl Exception:" + it);
        Function4<? super Integer, ? super Long, ? super String, ? super List<AsrResultItem>, Unit> function4 = this$0.mCallBack;
        if (function4 != null) {
            function4.invoke(3, Long.valueOf(item.getTimestamp()), null, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x009e A[Catch: IOException -> 0x009a, TRY_LEAVE, TryCatch #1 {IOException -> 0x009a, blocks: (B:28:0x0096, B:32:0x009e), top: B:45:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[Catch: IOException -> 0x00c0, TRY_LEAVE, TryCatch #6 {IOException -> 0x00c0, blocks: (B:36:0x00bc, B:40:0x00c4), top: B:50:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final byte[] readAudioFile(String fileName) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileInputStream fileInputStream;
        Logger.i(TAG, "readAudioFile fileName:" + fileName);
        File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir("/recorder"), fileName);
        if (file.exists() && file.isFile()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        try {
                            byte[] bArr = new byte[bufferedInputStream.available()];
                            bufferedInputStream.read(bArr);
                            try {
                                fileInputStream.close();
                                bufferedInputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                                Logger.e(TAG, "readAudioFile close IOException:" + Unit.INSTANCE);
                            }
                            return bArr;
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            Logger.e(TAG, "readAudioFile exception:" + Unit.INSTANCE);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                    Logger.e(TAG, "readAudioFile close IOException:" + Unit.INSTANCE);
                                }
                            } else if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                Logger.e(TAG, "readAudioFile close IOException:" + Unit.INSTANCE);
                                throw th;
                            }
                        } else if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    bufferedInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } else if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileInputStream = null;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                bufferedInputStream = null;
                th = th4;
                fileInputStream = null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeTransResult$lambda$8(AudioTransManager this$0, DeleteResultList deleteResultList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deleteResultList, "deleteResultList");
        for (DeleteResult deleteResult : deleteResultList.getResultList()) {
            Logger.i(TAG, "deleteAudio result:" + deleteResult);
            if (deleteResult.getSuccess()) {
                this$0.removeObjNameList.remove(deleteResult.getName());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeTransResult$lambda$9(ApiException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Logger.e(TAG, "deleteAudio Exception:" + exception);
        return Unit.INSTANCE;
    }

    public final void addCallBack(@NotNull Function4<? super Integer, ? super Long, ? super String, ? super List<AsrResultItem>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.mCallBack = callBack;
    }

    public final void addData(long time, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.downLoadMap.containsValue(name)) {
            return;
        }
        this.downLoadMap.put(Long.valueOf(time), name);
    }

    public final boolean canAddData() {
        return this.downLoadMap.size() < 20;
    }

    @Nullable
    public final String downLoadUrl(@Nullable String url) {
        if (url == null) {
            return null;
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        Request requestBuild = new Request.Builder().url(url).get().build();
        okHttpClient.newCall(requestBuild);
        try {
            ResponseBody responseBodyBody = okHttpClient.newCall(requestBuild).execute().body();
            if (responseBodyBody != null) {
                return responseBodyBody.string();
            }
        } catch (IOException e) {
            Logger.e(TAG, "download failed", e);
        }
        return null;
    }

    @Nullable
    public final String encryptUrlSafe(@Nullable byte[] dataArray, @Nullable String key) {
        if (key == null || dataArray == null || dataArray.length == 0) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(key, 8);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        String strDecodeToString = StringsKt__StringsJVMKt.decodeToString(bArrDecode);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bytes = strDecodeToString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            cipher.init(1, new SecretKeySpec(bytes, "AES"), new IvParameterSpec(bytes));
            return Base64.encodeToString(cipher.doFinal(dataArray), 10);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "encryptUrlSafe error " + e.getMessage());
            return null;
        }
    }

    @NotNull
    public final Handler getMHandler() {
        return (Handler) this.mHandler.getValue();
    }

    public final void postTransTask(@NotNull final AudioRecordEntity item, @NotNull final String format) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(format, "format");
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastUtil.INSTANCE.showToast(wzi.common_no_network);
            return;
        }
        Logger.i(TAG, "postTransTask file:" + UtilsKt.simpleRecordFileName(item.getTitle()));
        Function4<? super Integer, ? super Long, ? super String, ? super List<AsrResultItem>, Unit> function4 = this.mCallBack;
        if (function4 != null) {
            function4.invoke(5, Long.valueOf(item.getTimestamp()), null, null);
        }
        DeviceSettingsRequestExtKt.getDeviceSettingsRequest().getUploadUrl(format, new Function1() { // from class: pp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransManager.postTransTask$lambda$1(this.f30597a, item, format, (GetUploadUrl) obj);
            }
        }, new Function1() { // from class: qp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransManager.postTransTask$lambda$2(this.f31706a, item, (ApiException) obj);
            }
        });
    }

    public final void removeCallBack() {
        this.mCallBack = null;
    }

    public final void removeTransResult() {
        if (this.removeObjNameList.isEmpty()) {
            return;
        }
        DeviceSettingsRequestExtKt.getDeviceSettingsRequest().deleteAudio(this.removeObjNameList, new Function1() { // from class: rp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransManager.removeTransResult$lambda$8(this.f32763a, (DeleteResultList) obj);
            }
        }, new Function1() { // from class: sp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioTransManager.removeTransResult$lambda$9((ApiException) obj);
            }
        });
    }

    public final void startHandler() {
        if (this.downLoadMap.isEmpty() || this.isHandlerStarted) {
            return;
        }
        this.isHandlerStarted = true;
        getMHandler().post(this.mRunnable);
    }

    public final void stopHandler() {
        if (this.isHandlerStarted) {
            this.isHandlerStarted = false;
            getMHandler().removeCallbacks(this.mRunnable);
        }
    }

    public final boolean uploadFile(@Nullable String url, @Nullable String method, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (url == null) {
            return false;
        }
        if (method == null) {
            method = "PUT";
        }
        try {
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(url).method(method, RequestBody.Companion.create$default(RequestBody.INSTANCE, data, (MediaType) null, 1, (Object) null)).build()).execute();
            try {
                Logger.i(TAG, "upload code: " + responseExecute.code() + ", msg: " + responseExecute.message());
                boolean zIsSuccessful = responseExecute.isSuccessful();
                CloseableKt.closeFinally(responseExecute, null);
                return zIsSuccessful;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Logger.e(TAG, "upload failed", e);
            return false;
        }
    }
}
