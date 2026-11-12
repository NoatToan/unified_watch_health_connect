package com.huami.health.afppg.service;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.AFPPGDataType;
import com.huami.health.afppg.model.DeviceConfig;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103Je\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00072'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bH\u0002J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002JF\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001c\u001a\u00020\u00072\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001dj\b\u0012\u0004\u0012\u00020\u0007`\u001e2\u0006\u0010!\u001a\u00020 H\u0002J6\u0010'\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$H\u0002J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0007H\u0002J,\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00072\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$H\u0002Ji\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$2'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\r0\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bR\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010.R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u00100¨\u00064"}, d2 = {"Lcom/huami/health/afppg/service/RRDataAnalyseService;", "", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "frag", "", "", "totalRRDatas", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "rrData", "totalBrokenRRDatas", "brokenRRData", "Lkotlin/Function1;", "", "Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "Lkotlin/ParameterName;", "name", "pkgs", "", "logRRIndex", GoogleApiAvailabilityLight.a, "", "type", "source", "", "userId", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "rrdata", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "items", "Lcom/huami/health/afppg/model/DeviceConfig;", "config", "", "f", "", "", "afTimeResultMap", "a", "rrPeak", "b", "genTime", "e", "fragments", "create", "Ljava/lang/String;", "TAG", LogUtil.I, "ONE_K", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class RRDataAnalyseService {

    @NotNull
    public static final RRDataAnalyseService INSTANCE = new RRDataAnalyseService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "af_ppg_RRNative";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int ONE_K = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ AFPPGDataFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AFPPGDataFragment aFPPGDataFragment) {
            super(0);
            this.a = aFPPGDataFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RR " + this.a.getType() + " is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("RR io exception", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ AFPPGDataFragment a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AFPPGDataFragment aFPPGDataFragment, long j) {
            super(0);
            this.a = aFPPGDataFragment;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save " + this.a.getType() + ", failed: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error should not in this case ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ AFPPGDataFragment a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AFPPGDataFragment aFPPGDataFragment, long j) {
            super(0);
            this.a = aFPPGDataFragment;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error " + this.a.getType() + ",  " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ RRPeak a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RRPeak rRPeak) {
            super(0);
            this.a = rRPeak;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "generatedTime:" + this.a.getGeneratedTime() + ",dataType:" + this.a.getDataType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ AFPPGDataFragment a;
        public final /* synthetic */ List<RRPackageDataAnalysis.RRSingleData> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AFPPGDataFragment aFPPGDataFragment, List<RRPackageDataAnalysis.RRSingleData> list) {
            super(0);
            this.a = aFPPGDataFragment;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "RR frag data size:" + this.a.getData().size() + ", analysisPkgs size: " + this.b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ AFPPGDataFragment a;
        public final /* synthetic */ RRPeak b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AFPPGDataFragment aFPPGDataFragment, RRPeak rRPeak) {
            super(0);
            this.a = aFPPGDataFragment;
            this.b = rRPeak;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "rr package data broken with data size :" + this.a.getData().size() + ",time: " + this.b.getGeneratedTime() + " !";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ RRPeak a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RRPeak rRPeak) {
            super(0);
            this.a = rRPeak;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save " + AFPPGDataType.RR + " failed " + this.a.getGeneratedTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("saveRRData failed: ", this.a.getMessage());
        }
    }

    private RRDataAnalyseService() {
    }

    private final RRPeak a(Context context, DeviceConfig config, AFPPGDataFragment frag, Map<Long, Integer> afTimeResultMap) throws IOException {
        String str;
        RRPeak rRPeak = new RRPeak(0, null, null, null, null, 0, 0L, 0L, 0L, 0, null, null, false, null, 0, null, null, 131071, null);
        rRPeak.setDeviceSource(config.getDeviceSource());
        rRPeak.setGeneratedTime(RRPeak.INSTANCE.setTime(frag.getTimestamp()));
        rRPeak.setDataType(frag.getType());
        rRPeak.setUserId(config.getUserId());
        rRPeak.setLength(frag.getData().size());
        rRPeak.setTimeZone(TimeZone.getDefault().getID());
        rRPeak.setDate(PPGExtensionsKt.toYMDHMS(rRPeak.getGeneratedTime(), TimeZone.getTimeZone(rRPeak.getTimeZone())));
        b(config, rRPeak);
        long timeInMillis = frag.getTimestamp().getTimeInMillis() / ((long) 1000);
        int type = frag.getType();
        AFPPGDataType aFPPGDataType = AFPPGDataType.HR_PG;
        if ((type == aFPPGDataType.getValue() || type == AFPPGDataType.AF_ACC.getValue()) || type == AFPPGDataType.AF_PPG.getValue()) {
            File fileSaveRawData = RRFileService.INSTANCE.saveRawData(context, frag.getType(), config.getUserId(), timeInMillis, frag.getData());
            if (fileSaveRawData == null) {
                HMLog.info(TAG, new c(frag, timeInMillis));
                return null;
            }
            rRPeak.setRawLocalPath(fileSaveRawData.getAbsolutePath());
            if (frag.getType() != aFPPGDataType.getValue()) {
                e(timeInMillis, rRPeak, afTimeResultMap);
            }
            str = TAG;
        } else {
            str = TAG;
            if (type != AFPPGDataType.RR.getValue()) {
                HMLog.info(str, new e(frag, timeInMillis));
                return null;
            }
            HMLog.info(str, d.a);
        }
        HMLog.info(str, new f(rRPeak));
        return rRPeak;
    }

    private final void b(DeviceConfig config, RRPeak rrPeak) {
        rrPeak.setDeviceSource(config.getDeviceSource());
        rrPeak.setFwVer(config.getFwVer());
        rrPeak.setSn(config.getSn());
        rrPeak.setDeviceId(config.getDeviceId());
    }

    private final RRPeak c(int type, int source, String userId) {
        RRPeak rRPeak = new RRPeak(0, null, null, null, null, 0, 0L, 0L, 0L, 0, null, null, false, null, 0, null, null, 131071, null);
        rRPeak.setDataType(type);
        rRPeak.setDeviceSource(source);
        rRPeak.setUserId(userId);
        return rRPeak;
    }

    private final void d(AFPPGDataFragment frag, List<Byte> totalRRDatas, RRPeak rrData, List<Byte> totalBrokenRRDatas, RRPeak brokenRRData, Function1<? super List<RRPackageDataAnalysis.RRSingleData>, Unit> logRRIndex) {
        List<RRPackageDataAnalysis.RRSingleData> listAnalysisForRRPkgData = RRPackageDataAnalysis.INSTANCE.analysisForRRPkgData(CollectionsKt___CollectionsKt.toByteArray(frag.getData()));
        HMLog.info(TAG, new g(frag, listAnalysisForRRPkgData));
        if (!(!listAnalysisForRRPkgData.isEmpty())) {
            brokenRRData.setGeneratedTime(RRPeak.INSTANCE.setTime(frag.getTimestamp()));
            brokenRRData.setDate(PPGExtensionsKt.toYMDHMS(brokenRRData.getGeneratedTime(), TimeZone.getTimeZone(brokenRRData.getTimeZone())));
            HMLog.info(TAG, new h(frag, rrData));
            totalBrokenRRDatas.addAll(frag.getData());
            return;
        }
        totalRRDatas.addAll(frag.getData());
        if (rrData.getGeneratedTime() <= 0) {
            rrData.setGeneratedTime(((RRPackageDataAnalysis.RRSingleData) CollectionsKt.first((List) listAnalysisForRRPkgData)).getTimestamp());
        }
        rrData.setLastRrPackageTime(((RRPackageDataAnalysis.RRSingleData) CollectionsKt.last((List) listAnalysisForRRPkgData)).getTimestamp());
        rrData.setDate(PPGExtensionsKt.toYMDHMS(rrData.getGeneratedTime(), TimeZone.getTimeZone(rrData.getTimeZone())));
        rrData.setRrRecordSize(rrData.getRrRecordSize() + listAnalysisForRRPkgData.size());
        logRRIndex.invoke(listAnalysisForRRPkgData);
    }

    private final void e(long genTime, RRPeak rrPeak, Map<Long, Integer> afTimeResultMap) {
        Integer num = afTimeResultMap.get(Long.valueOf(genTime));
        rrPeak.setAfResult(num == null ? -1 : num.intValue());
    }

    private final boolean f(Context context, List<Byte> totalRRDatas, RRPeak rrdata, ArrayList<RRPeak> items, DeviceConfig config) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            if (!(!totalRRDatas.isEmpty())) {
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.error$default(TAG, null, null, new j(thM3848exceptionOrNullimpl), 6, null);
                }
                return false;
            }
            rrdata.setLength(totalRRDatas.size());
            INSTANCE.b(config, rrdata);
            File fileSaveRawData = RRFileService.INSTANCE.saveRawData(context, AFPPGDataType.RR.getValue(), config.getUserId(), rrdata.getGeneratedTime(), totalRRDatas);
            if (fileSaveRawData == null) {
                HMLog.info(TAG, new i(rrdata));
                return false;
            }
            rrdata.setRawLocalPath(fileSaveRawData.getAbsolutePath());
            items.add(rrdata);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Nullable
    public final List<RRPeak> create(@NotNull Context context, @NotNull DeviceConfig config, @NotNull List<AFPPGDataFragment> fragments, @NotNull Map<Long, Integer> afTimeResultMap, @NotNull Function1<? super List<RRPackageDataAnalysis.RRSingleData>, Unit> logRRIndex) {
        PPGFilePathService.INSTANCE.initDir(context);
        ArrayList<RRPeak> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AFPPGDataType aFPPGDataType = AFPPGDataType.RR;
        RRPeak rRPeakC = c(aFPPGDataType.getValue(), config.getDeviceSource(), config.getUserId());
        RRPeak rRPeakC2 = c(aFPPGDataType.getValue() * (-1), config.getDeviceSource(), config.getUserId());
        for (AFPPGDataFragment aFPPGDataFragment : fragments) {
            if (aFPPGDataFragment.getData().isEmpty()) {
                HMLog.info(TAG, new a(aFPPGDataFragment));
            } else if (aFPPGDataFragment.getType() == AFPPGDataType.RR.getValue()) {
                d(aFPPGDataFragment, arrayList2, rRPeakC, arrayList3, rRPeakC2, logRRIndex);
            } else {
                try {
                    RRPeak rRPeakA = a(context, config, aFPPGDataFragment, afTimeResultMap);
                    if (rRPeakA != null) {
                        arrayList.add(rRPeakA);
                    }
                } catch (IOException e2) {
                    HMLog.info(TAG, new b(e2));
                    return null;
                }
            }
        }
        f(context, arrayList2, rRPeakC, arrayList, config);
        f(context, arrayList3, rRPeakC2, arrayList, config);
        return arrayList;
    }
}
