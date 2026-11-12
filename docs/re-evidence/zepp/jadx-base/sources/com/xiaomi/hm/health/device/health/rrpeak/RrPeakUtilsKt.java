package com.xiaomi.hm.health.device.health.rrpeak;

import androidx.collection.LongSparseArray;
import androidx.collection.LongSparseArrayKt;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002\u001a\b\u0010\b\u001a\u00020\u0006H\u0002\u001a\b\u0010\t\u001a\u00020\u0006H\u0002\u001a6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f\u001a&\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u001a \u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002\u001a&\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002\u001a(\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0002\"\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010 \"\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010 \"\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010 \"\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006%"}, d2 = {"", "source", "", "deviceId", "sn", "fwVer", "Ljava/io/File;", "c", "b", GoogleApiAvailabilityLight.a, "", "timestamp", "", "data", "", "saveRrPeakToFile", "clearRrData", "", "Lcom/xiaomi/hm/health/device/health/rrpeak/RrUploadInfo;", "getRrUploadInfo", "Lkotlin/Pair;", "a", "time", "userId", "Landroidx/collection/LongSparseArray;", "files", "f", "", "isAcc", HTTP.CONTENT_RANGE_BYTES, "zipAccPpgData", "e", "Ljava/lang/String;", "RR_PEAK_FILE_DIR", "RR_PEAK_FILE_SUFFIX", "RR_PEAK_FILE_SEP", "TAG", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class RrPeakUtilsKt {

    @NotNull
    private static final String a = "rrpeak";

    @NotNull
    private static final String b = "rrpeak";

    @NotNull
    private static final String c = "_";

    @NotNull
    private static final String d = "RrPeakUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "build start time and end time fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete rrpeak file:" + this.a + "  result:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete rrpeak file:" + this.a + " error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Rrpeak file:" + this.a.getName() + ", size=" + this.a.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "add rrpeak file:" + this.a.getName() + ", size=" + this.a.length();
        }
    }

    private static final Pair<Long, Long> a(List<? extends File> list) {
        Long timestamp;
        Long timestamp2;
        Iterator<T> it2 = list.iterator();
        Long lValueOf = null;
        Long lValueOf2 = null;
        while (it2.hasNext()) {
            List<RRSingleData> listAnalysisForRRPkgData = RRPackageDataAnalysisUtils.analysisForRRPkgData(kotlin.io.c.readBytes((File) it2.next()));
            if (listAnalysisForRRPkgData != null) {
                RRSingleData rRSingleData = (RRSingleData) CollectionsKt.firstOrNull((List) listAnalysisForRRPkgData);
                if (rRSingleData != null && (timestamp2 = rRSingleData.getTimestamp()) != null) {
                    long jLongValue = timestamp2.longValue();
                    if (lValueOf == null || jLongValue < lValueOf.longValue()) {
                        lValueOf = Long.valueOf(jLongValue);
                    }
                }
                RRSingleData rRSingleData2 = (RRSingleData) CollectionsKt.lastOrNull((List) listAnalysisForRRPkgData);
                if (rRSingleData2 != null && (timestamp = rRSingleData2.getTimestamp()) != null) {
                    long jLongValue2 = timestamp.longValue();
                    if (lValueOf2 == null) {
                        lValueOf2 = Long.valueOf(jLongValue2);
                    } else if (jLongValue2 > lValueOf2.longValue()) {
                        lValueOf2 = Long.valueOf(jLongValue2);
                    }
                }
            }
        }
        if (lValueOf != null && lValueOf2 != null) {
            return new Pair<>(lValueOf, lValueOf2);
        }
        HMLog.info(d, a.a);
        return null;
    }

    private static final File b() {
        File file = new File(DeviceXFunctionsKt.getContext().getFilesDir(), RRPeak.TABLE_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static final File c(int i, String str, String str2, String str3) {
        File file = new File(b(), String.valueOf(i));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str2);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(file3, str3);
        if (!file4.exists()) {
            file4.mkdirs();
        }
        return file4;
    }

    public static final void clearRrData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        File[] fileArrListFiles = c(i, str, str2, str3).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            try {
                HMLog.info(d, new b(name, file.delete()));
            } catch (Exception e2) {
                HMLog.error(d, "", e2, new c(name));
            }
        }
    }

    private static final File d() {
        File file = new File(DeviceXFunctionsKt.getContext().getCacheDir(), RRPeak.TABLE_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static final byte[] e(String str) {
        try {
            return kotlin.io.c.readBytes(new File(str));
        } catch (Exception e2) {
            HMLog.e(d, "read data fail", e2);
            return null;
        }
    }

    private static final File f(long j, String str, LongSparseArray<File> longSparseArray) {
        File file = new File(d(), System.currentTimeMillis() + "_rrpeak.zip");
        try {
            file.createNewFile();
            File file2 = new File(d(), str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j + "-rr.txt");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            Iterator itValueIterator = LongSparseArrayKt.valueIterator(longSparseArray);
            while (itValueIterator.hasNext()) {
                kotlin.io.c.appendBytes(file2, kotlin.io.c.readBytes((File) itValueIterator.next()));
            }
            ZipUtil.zipFiles(CollectionsKt__CollectionsKt.mutableListOf(file2), file);
            file2.delete();
        } catch (Exception e2) {
            HMLog.e(d, "zip data fail", e2);
        }
        return file;
    }

    @NotNull
    public static final List<RrUploadInfo> getRrUploadInfo() {
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        String str;
        long j;
        Iterator it8;
        Iterator it9;
        Iterator it10;
        long j2;
        Iterator it11;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = b().listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList2 = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory() && l.toIntOrNull(file.getName()) != null) {
                    arrayList2.add(file);
                }
            }
            Iterator it12 = arrayList2.iterator();
            while (it12.hasNext()) {
                File file2 = (File) it12.next();
                int i = Integer.parseInt(file2.getName());
                File[] fileArrListFiles2 = file2.listFiles();
                if (fileArrListFiles2 == null) {
                    it2 = it12;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (File file3 : fileArrListFiles2) {
                        if (file3.isDirectory()) {
                            arrayList3.add(file3);
                        }
                    }
                    Iterator it13 = arrayList3.iterator();
                    while (it13.hasNext()) {
                        File file4 = (File) it13.next();
                        String name = file4.getName();
                        File[] fileArrListFiles3 = file4.listFiles();
                        if (fileArrListFiles3 == null) {
                            it3 = it12;
                            it4 = it13;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            for (File file5 : fileArrListFiles3) {
                                if (file5.isDirectory()) {
                                    arrayList4.add(file5);
                                }
                            }
                            Iterator it14 = arrayList4.iterator();
                            while (it14.hasNext()) {
                                File file6 = (File) it14.next();
                                String name2 = file6.getName();
                                File[] fileArrListFiles4 = file6.listFiles();
                                if (fileArrListFiles4 == null) {
                                    it5 = it12;
                                    it6 = it13;
                                    it7 = it14;
                                    str = name;
                                } else {
                                    ArrayList<File> arrayList5 = new ArrayList();
                                    for (File file7 : fileArrListFiles4) {
                                        if (file7.isDirectory()) {
                                            arrayList5.add(file7);
                                        }
                                    }
                                    for (File file8 : arrayList5) {
                                        String name3 = file8.getName();
                                        String userid = HMPersonInfo.getInstance().getUserInfo().getUserid();
                                        LongSparseArray longSparseArray = new LongSparseArray();
                                        File[] fileArrListFiles5 = file8.listFiles();
                                        if (fileArrListFiles5 == null) {
                                            it8 = it12;
                                            it9 = it13;
                                            it10 = it14;
                                            j2 = 0;
                                            j = 0;
                                        } else {
                                            int length = fileArrListFiles5.length;
                                            int i2 = 0;
                                            long j3 = 0;
                                            j = 0;
                                            while (i2 < length) {
                                                File file9 = fileArrListFiles5[i2];
                                                HMLog.info(d, new d(file9));
                                                Iterator it15 = it12;
                                                Iterator it16 = it13;
                                                if (Intrinsics.areEqual((String) StringsKt__StringsKt.split$default((CharSequence) file9.getName(), new String[]{"_"}, false, 0, 6, (Object) null).get(0), userid)) {
                                                    HMLog.info(d, new e(file9));
                                                    it11 = it14;
                                                    long j4 = Long.parseLong((String) StringsKt__StringsKt.split$default((CharSequence) file9.getName(), new String[]{"_"}, false, 0, 6, (Object) null).get(1)) / ((long) 1000);
                                                    longSparseArray.put(j4, file9);
                                                    if (j3 == 0 || j4 < j3) {
                                                        j3 = j4;
                                                    }
                                                    if (j == 0 || j4 > j) {
                                                        j = j4;
                                                    }
                                                } else {
                                                    it11 = it14;
                                                    file9.delete();
                                                }
                                                i2++;
                                                it14 = it11;
                                                it13 = it16;
                                                it12 = it15;
                                            }
                                            it8 = it12;
                                            it9 = it13;
                                            it10 = it14;
                                            Unit unit = Unit.INSTANCE;
                                            j2 = j3;
                                        }
                                        File fileF = f(j2, HMPersonInfo.getInstance().getUserInfo().getUserid(), longSparseArray);
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put(SessionDescription.p, Long.valueOf(fileF.length()));
                                        linkedHashMap.put("lastRrPackageTime", Long.valueOf(j));
                                        linkedHashMap.put("fwVer", name3);
                                        linkedHashMap.put("sn", name2);
                                        linkedHashMap.put("deviceId", name);
                                        linkedHashMap.put("deviceSource", Integer.valueOf(i));
                                        arrayList.add(new RrUploadInfo(j2 * ((long) 1000), linkedHashMap, i, name, name2, name3, kotlin.io.c.readBytes(fileF)));
                                        fileF.delete();
                                        it14 = it10;
                                        name = name;
                                        name2 = name2;
                                        it13 = it9;
                                        it12 = it8;
                                    }
                                    it5 = it12;
                                    it6 = it13;
                                    it7 = it14;
                                    str = name;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                it14 = it7;
                                name = str;
                                it13 = it6;
                                it12 = it5;
                            }
                            it3 = it12;
                            it4 = it13;
                            Unit unit3 = Unit.INSTANCE;
                        }
                        it13 = it4;
                        it12 = it3;
                    }
                    it2 = it12;
                    Unit unit4 = Unit.INSTANCE;
                }
                it12 = it2;
            }
            Unit unit5 = Unit.INSTANCE;
        }
        return arrayList;
    }

    public static final void saveRrPeakToFile(long j, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull byte[] bArr) {
        if (str.length() == 0) {
            return;
        }
        if (str2.length() == 0) {
            return;
        }
        if (str3.length() == 0) {
            return;
        }
        try {
            File file = new File(c(i, str, str2, str3), HMPersonInfo.getInstance().getUserInfo().getUserid() + "_" + j + "_rrpeak");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            kotlin.io.c.writeBytes(file, bArr);
        } catch (Exception e2) {
            HMLog.e(d, "save rrpeak file fail", e2);
        }
    }

    @Nullable
    public static final byte[] zipAccPpgData(long j, @NotNull String str, boolean z, @NotNull byte[] bArr) {
        try {
            File file = new File(FileUtils.getAtrialRawDataDir(DeviceXFunctionsKt.getContext()));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, System.currentTimeMillis() + "-accppg.zip");
            File file3 = new File(file, str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (z ? "acc" : "ppg") + ".txt");
            kotlin.io.c.writeBytes(file3, bArr);
            ZipUtil.zipFiles(CollectionsKt__CollectionsKt.mutableListOf(file3), file2);
            file3.delete();
            byte[] bytes = kotlin.io.c.readBytes(file2);
            file2.delete();
            return bytes;
        } catch (Exception e2) {
            HMLog.e(d, "zip acc ppg data error", e2);
            return null;
        }
    }
}
