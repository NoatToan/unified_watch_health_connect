package com.huami.device.core.agps.impl.store;

import android.text.TextUtils;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMFileDownloadResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.ZipUtil;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.m;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0004R\u001d\u0010\u0019\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u00020\u00048D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010 \u001a\u00020\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/device/core/agps/impl/store/SonyAGPSFirmwareStore;", "Lcom/huami/device/core/agps/impl/upgrade/AGPSFirmwareStore;", "Ljava/io/File;", "file", "", "urlSuf", "", "a", "", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "b", "getAGPSFirmwares", "getTempDir", "url", "", "", "params", "fetchDownloadUrl", "supportGns", "supportSonyLle", "supportV5", "getAGPS", "Lkotlin/Lazy;", "c", "()Ljava/lang/String;", "timeFmtStr", "getTempPath", "tempPath", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "getFeature", "()Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "<init>", "(Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public class SonyAGPSFirmwareStore implements AGPSFirmwareStore {
    public static final int SWF_GPS_SONY_LLE = 22;
    private static final String d = "Agps-FirmwareStore";
    private static final String e = "LLE";
    private static final String f = "apps/com.xiaomi.hm.health/fileTypes/AGPS/files?days=7";
    private static final String g = "apps/com.xiaomi.hm.health/fileTypes/AGPS_ALM/files";
    private static final String h = "apps/com.xiaomi.hm.health/fileTypes/AGPSZIP/files";
    private static final String i = "apps/com.xiaomi.hm.health/fileTypes/LLE/files";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy timeFmtStr = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempPath = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Feature feature;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(AgpsUpgradeBuilder.INSTANCE.getContext$agps_impl_release().getFilesDir().getAbsolutePath());
            String str = File.separator;
            sb.append(str);
            sb.append("agps");
            sb.append(str);
            sb.append(SonyAGPSFirmwareStore.this.c());
            sb.append(str);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            Calendar calendar = Calendar.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append(calendar.get(1));
            sb.append('-');
            sb.append(calendar.get(6));
            sb.append('-');
            sb.append(calendar.get(11));
            sb.append('-');
            sb.append(calendar.get(12));
            sb.append('-');
            sb.append(calendar.get(13));
            return sb.toString();
        }
    }

    public SonyAGPSFirmwareStore(@NotNull Feature feature) {
        this.feature = feature;
    }

    private final boolean a(File file, String urlSuf) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        String url = HMServerDef.getUrl(urlSuf);
        AgpsUpgradeBuilder.INSTANCE.getOnMessage$agps_impl_release().invoke("server url: " + url, 0);
        String strFetchDownloadUrl = fetchDownloadUrl(url, systemParams);
        if (strFetchDownloadUrl.length() == 0) {
            return false;
        }
        HMWebUtil.doSeparateRequest(strFetchDownloadUrl, (Map<String, String>) null, file, Support.RequestSupport.GET, false, true, new IHMFileDownloadResponseHandler() { // from class: com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore$downloadAGPS$1
            @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item, @NotNull File file2) {
                HMLog.i("Agps-FirmwareStore", "onFailure", new Object[0]);
            }

            @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item, @NotNull File file2) {
                HMLog.i("Agps-FirmwareStore", "onSuccess:" + Long.valueOf(file2.length()), new Object[0]);
            }
        }, new HMHttpConfig[0]);
        boolean z = file != null && file.length() > 0;
        HMLog.i(d, "downloadCep result:" + z, new Object[0]);
        return z;
    }

    private final List<HMFirmwareInfo> b() {
        HMFirmwareType hMFirmwareType;
        File file = new File(getTempPath() + "/agps_data.zip");
        if (!a(file, i)) {
            return null;
        }
        File file2 = new File(getTempPath() + "/lleFiles");
        file2.mkdirs();
        List<File> listUnzip = ZipUtil.unzip(file, file2);
        ArrayList arrayList = new ArrayList();
        if (ArraysUtil.isEmpty(listUnzip)) {
            return arrayList;
        }
        for (File file3 : listUnzip) {
            HMFirmwareType hMFirmwareType2 = HMFirmwareType.FIRMWARE_QUERY;
            if (file3 == null) {
                Intrinsics.throwNpe();
            }
            if (Intrinsics.areEqual("lle_bds.lle", file3.getName())) {
                hMFirmwareType = HMFirmwareType.FIRMWARE_GPS_SONY_LLE_BEIDOU;
            } else if (Intrinsics.areEqual("lle_gps.lle", file3.getName())) {
                hMFirmwareType = HMFirmwareType.FIRMWARE_GPS_SONY_LLE_GPS;
            } else if (Intrinsics.areEqual("lle_glo.lle", file3.getName())) {
                hMFirmwareType = HMFirmwareType.FIRMWARE_GPS_SONY_LLE_GLONASS;
            } else if (Intrinsics.areEqual("lle_gal.lle", file3.getName())) {
                hMFirmwareType = HMFirmwareType.FIRMWARE_GPS_SONY_LLE_GALILEO;
            } else {
                hMFirmwareType = Intrinsics.areEqual("lle_qzss.lle", file3.getName()) ? HMFirmwareType.FIRMWARE_GPS_SONY_LLE_QZSS : hMFirmwareType2;
            }
            if (hMFirmwareType != hMFirmwareType2) {
                arrayList.add(new HMFirmwareInfo(file3.getAbsolutePath(), hMFirmwareType));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return (String) this.timeFmtStr.getValue();
    }

    @NotNull
    public String fetchDownloadUrl(@NotNull String url, @NotNull Map<String, Object> params) {
        final StringBuilder sb = new StringBuilder();
        HMWebUtil.doRequest(url, params, Support.RequestSupport.GET, true, new IHMSimpleHttpResponseHandler() { // from class: com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore.fetchDownloadUrl.1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                HMLog.i(SonyAGPSFirmwareStore.d, "onFailure:" + item, new Object[0]);
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@NotNull WebResponse response, @NotNull HMHttpResponseData item) {
                HMLog.i(SonyAGPSFirmwareStore.d, "onSuccess:" + item, new Object[0]);
                try {
                    JSONArray jSONArray = new JSONArray(new String(item.getResponseBody(), Charsets.UTF_8));
                    if (jSONArray.length() == 0) {
                        return;
                    }
                    String string = jSONArray.getJSONObject(0).getString("fileUrl");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    sb.append(string);
                } catch (Exception unused) {
                    HMLog.e(SonyAGPSFirmwareStore.d, "error of fetch file url.", new Object[0]);
                }
            }
        });
        HMLog.i(d, "download url:" + ((Object) sb), new Object[0]);
        AgpsUpgradeBuilder.INSTANCE.getOnMessage$agps_impl_release().invoke("download url -> " + ((Object) sb), 0);
        return sb.toString();
    }

    @NotNull
    public final List<HMFirmwareInfo> getAGPS(boolean supportGns, boolean supportSonyLle, boolean supportV5) {
        ArrayList arrayList = new ArrayList();
        AgpsUpgradeBuilder agpsUpgradeBuilder = AgpsUpgradeBuilder.INSTANCE;
        int i2 = 0;
        agpsUpgradeBuilder.getOnMessage$agps_impl_release().invoke("supportGns: " + supportGns + ", supportSonyLle: " + supportSonyLle + ", supportV5: " + supportV5, 0);
        File file = new File(getTempPath());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(getTempPath() + "agps.zip" + System.currentTimeMillis());
        File file3 = new File(getTempPath() + "gln.zip" + System.currentTimeMillis());
        agpsUpgradeBuilder.getOnMessage$agps_impl_release().invoke("download -> " + file2, 0);
        boolean zA = a(file2, g);
        agpsUpgradeBuilder.getOnMessage$agps_impl_release().invoke("download -> apps/com.xiaomi.hm.health/fileTypes/AGPS_ALM/files", 0);
        boolean z = (zA && (supportGns ^ true)) || a(file3, h);
        agpsUpgradeBuilder.getOnMessage$agps_impl_release().invoke("download -> apps/com.xiaomi.hm.health/fileTypes/AGPSZIP/files", 0);
        if (!z) {
            return arrayList;
        }
        for (File file4 : AGPSFirmwareHelperKt.unzip(file2, getTempPath() + "/zipFiles")) {
            String name = file4.getName();
            HMLog.i(d, "file:" + file4.getPath() + ",name:" + name, new Object[0]);
            if (Intrinsics.areEqual(name, "cep_pak.bin") && !supportSonyLle) {
                arrayList.add(new HMFirmwareInfo(file4.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_CEP));
            } else if (Intrinsics.areEqual(name, "gps_alm.bin")) {
                arrayList.add(new HMFirmwareInfo(file4.getAbsolutePath(), HMFirmwareType.FIRMWARE_GPS_ALM));
            }
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator<T>() { // from class: com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore$getAGPS$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((HMFirmwareInfo) t2).getFwType().getValue() & 255), Integer.valueOf(((HMFirmwareInfo) t).getFwType().getValue() & 255));
                }
            });
        }
        if (supportGns && file3.exists()) {
            for (File file5 : AGPSFirmwareHelperKt.unzip(file3, getTempPath() + "/glsFiles")) {
                String name2 = file5.getName();
                HMLog.i(d, "file:" + file5.getPath() + ",name:" + name2, new Object[0]);
                if (Intrinsics.areEqual(name2, "gln_alm.bin")) {
                    arrayList.add(new HMFirmwareInfo(file5.getAbsolutePath(), HMFirmwareType.FIRMWARE_GNS_ALM));
                } else if (m.startsWith$default(name2, "cep_s_", false, 2, null)) {
                    AGPSFirmwareHelperKt.deleteFile(file5);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (supportSonyLle) {
            List<HMFirmwareInfo> listB = b();
            HMLog.i(d, "Sony LLE File[" + listB + JsonLexerKt.END_LIST, new Object[0]);
            if (listB != null && (!listB.isEmpty())) {
                arrayList2.addAll(listB);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (supportV5) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            AgpsUpgradeBuilder.INSTANCE.getOnMessage$agps_impl_release().invoke("--------- dump --------", 0);
            for (Object obj : arrayList4) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                AgpsUpgradeBuilder.INSTANCE.getOnMessage$agps_impl_release().invoke(i2 + " : " + ((HMFirmwareInfo) obj).getFwType(), 0);
                i2 = i3;
            }
            arrayList3.add(AGPSFirmwareHelperKt.encoderFirmwares(HMFirmwareType.FIRMWARE_AGPS_BATCH, arrayList4));
        } else {
            arrayList3.addAll(arrayList);
            if (!arrayList2.isEmpty()) {
                arrayList3.add(AGPSFirmwareHelperKt.encoderFirmwares(HMFirmwareType.FIRMWARE_BATCH, arrayList2));
            }
        }
        AgpsUpgradeBuilder.INSTANCE.getOnMessage$agps_impl_release().invoke("use DFU V5: " + supportV5, 0);
        return arrayList3;
    }

    @Override // com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore
    @NotNull
    public List<HMFirmwareInfo> getAGPSFirmwares() {
        return getAGPS(this.feature.hasSw(8), this.feature.hasSw(22), this.feature.hasBase(3));
    }

    @NotNull
    public final Feature getFeature() {
        return this.feature;
    }

    @Override // com.huami.device.core.agps.impl.upgrade.AGPSFirmwareStore
    @NotNull
    public String getTempDir() {
        return getTempPath();
    }

    @NotNull
    public final String getTempPath() {
        return (String) this.tempPath.getValue();
    }
}
