package com.huami.ecg;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.algo.WaveFilterNative;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.ecg.core.util.EcgFileUtil;
import com.huami.ecg.core.util.ZipUtil;
import com.huami.ecg.core.web.EcgWebApi;
import com.huami.ecg.util.DeviceUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J*\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\"\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010 \u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/ecg/EcgDataProcesser;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "", "isSnapshot", "isEcg", "Lcom/huami/ecg/core/model/FilterRecord;", "b", "", "url", "Ljava/io/File;", "file", "", "a", "filePath", "isSnapShotFilter", GoogleApiAvailabilityLight.a, "Ljava/io/InputStream;", "input", "c", "ecgFilterRecord", "ppgFilterRecord", "getEcgFile", "Ljava/lang/String;", "TAG", "", LogUtil.I, "snapShotSize", "Ljava/lang/Object;", "mSyncObj", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgDataProcesser {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "EcgFileObservable";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int snapShotSize = 2500;
    public static final EcgDataProcesser INSTANCE = new EcgDataProcesser();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Object mSyncObj = new Object();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/ecg/EcgDataProcesser$getFilterRecord$1$2", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ EcgData b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, EcgData ecgData, boolean z, boolean z2) {
            super(0);
            this.a = context;
            this.b = ecgData;
            this.c = z;
            this.d = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "读取ecg原始文件失败,id:" + this.b.getTimestamp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ FileNotFoundException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FileNotFoundException fileNotFoundException) {
            super(0);
            this.a = fileNotFoundException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Ecg raw data 转换失败";
        }
    }

    private EcgDataProcesser() {
    }

    private final void a(Context context, String url, File file) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
        if (uRLConnection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (200 <= responseCode && 300 >= responseCode) {
            kotlin.io.c.writeBytes(file, ByteStreamsKt.readBytes(httpURLConnection.getInputStream()));
        }
    }

    private final FilterRecord b(Context context, EcgData ecg, boolean isSnapshot, boolean isEcg) {
        synchronized (mSyncObj) {
            try {
                EcgDataProcesser ecgDataProcesser = INSTANCE;
                File ecgFile = ecgDataProcesser.getEcgFile(context, ecg, isEcg);
                if (ecgFile != null) {
                    return ecgDataProcesser.d(ecg, ecgFile.getAbsolutePath(), isSnapshot);
                }
            } catch (Exception e) {
                HMLog.warn(TAG, e, new a(context, ecg, isEcg, isSnapshot));
            }
            return null;
        }
    }

    private final FilterRecord c(EcgData ecg, InputStream input, boolean isSnapShotFilter) {
        ArrayList arrayList;
        List<String> fileData = EcgFileUtil.INSTANCE.readFileData(input);
        if (fileData == null || fileData.isEmpty()) {
            return null;
        }
        try {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(fileData, 10));
            Iterator<T> it2 = fileData.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(Float.parseFloat((String) it2.next())));
            }
        } catch (Exception e) {
            HMLog.warn(TAG, e, c.a);
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (isSnapShotFilter) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((Number) obj).floatValue();
                if (i < 2500) {
                    arrayList2.add(obj);
                }
                i = i2;
            }
            arrayList = arrayList2;
        }
        return DeviceUtils.INSTANCE.isECGMiliFamily(ecg.getDeviceSource()) ? WaveFilterNative.INSTANCE.smoothHis(arrayList, true, ecg.getDeviceSource()) : WaveFilterNative.INSTANCE.smoothHisWithSignal(arrayList, ecg.getDeviceSource());
    }

    private final FilterRecord d(EcgData ecg, String filePath, boolean isSnapShotFilter) {
        try {
            return c(ecg, new FileInputStream(filePath), isSnapShotFilter);
        } catch (FileNotFoundException e) {
            HMLog.warn(TAG, e, new b(e));
            return null;
        }
    }

    @Nullable
    public final FilterRecord ecgFilterRecord(@NotNull EcgData ecgData, boolean z) {
        return b(EcgCore.INSTANCE.getContext(), ecgData, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    @Nullable
    public final File getEcgFile(@NotNull Context context, @NotNull EcgData ecg, boolean isEcg) {
        List<File> listUpZipFile;
        boolean z;
        File ecgFile = isEcg ? EcgFileUtil.INSTANCE.getEcgFile(context, ecg.getUserId(), ecg.getTimestamp()) : EcgFileUtil.INSTANCE.getPpgFile(context, ecg.getUserId(), ecg.getTimestamp());
        if (ecgFile.exists() && ecgFile.length() > 1024) {
            return ecgFile;
        }
        EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
        File ecgZipFile = ecgFileUtil.getEcgZipFile(context, ecg.getUserId(), ecg.getTimestamp());
        if (ecgZipFile.exists()) {
            ecgZipFile.delete();
        }
        ecgZipFile.createNewFile();
        String serverRawUri = ecg.getServerRawUri();
        Object obj = null;
        if ((serverRawUri == null || serverRawUri.length() == 0) && (serverRawUri = new EcgWebApi().getEcgRawUrl(ecg.getTimestamp(), ecg.getUserId(), ecg.getMeasureContentType())) == null) {
            return null;
        }
        a(context, serverRawUri, ecgZipFile);
        if (!ecgZipFile.exists() || ecgZipFile.length() < 1024 || (listUpZipFile = ZipUtil.upZipFile(ecgZipFile, ecgFileUtil.getEcgDir(context, ecg.getUserId()).getAbsolutePath())) == null) {
            return null;
        }
        for (Object obj2 : listUpZipFile) {
            File file = (File) obj2;
            if (file == null) {
                z = false;
            } else if (StringsKt__StringsKt.contains$default((CharSequence) file.getName(), (CharSequence) (isEcg ? EcgAnalyticsManagerKt.ECG : "ppg"), false, 2, (Object) null)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = obj2;
                break;
            }
        }
        return (File) obj;
    }

    @Nullable
    public final FilterRecord ppgFilterRecord(@NotNull EcgData ecgData, boolean z) {
        return b(EcgCore.INSTANCE.getContext(), ecgData, z, false);
    }
}
