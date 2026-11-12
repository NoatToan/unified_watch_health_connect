package com.huami.health.afppg.service;

import android.content.Context;
import android.text.TextUtils;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.AFPPGDataType;
import com.huami.health.afppg.model.DeviceConfig;
import com.huami.health.afppg.utils.DeviceSupportKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ_\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0013\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rR\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/health/afppg/service/AFHandleService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/health/afppg/model/DeviceConfig;", "config", "", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "fragments", "Ljava/util/Calendar;", "diagSyncTime", "Lcom/huami/health/afppg/service/ISaveHandledData;", "saveHandledData", "Lkotlin/Function1;", "Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "Lkotlin/ParameterName;", "name", "pkgs", "", "logRRIndex", "inputAFData", "", "a", "Ljava/lang/String;", "TAG", "", "b", "J", "TIME_UNIT_MILLI", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class AFHandleService {

    @NotNull
    public static final AFHandleService INSTANCE = new AFHandleService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "af_ppg_AFHandler";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long TIME_UNIT_MILLI = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceConfig deviceConfig) {
            super(0);
            this.a = deviceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "inputAFData failed: userId empty, " + this.a + ".userId";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "has AF DATA";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AFibData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<AFibData> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "create AFib, first time:" + ((AFibData) CollectionsKt.first((List) this.a)).getTimestamp() + ",last time:" + ((AFibData) CollectionsKt.last((List) this.a)).getTimestamp() + ",size:" + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ AFibData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AFibData aFibData) {
            super(0);
            this.a = aFibData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "list aFibData type = " + this.a.getType() + " - timestamp = " + this.a.getTimestamp();
        }
    }

    private AFHandleService() {
    }

    public final void inputAFData(@NotNull Context context, @NotNull DeviceConfig config, @NotNull List<AFPPGDataFragment> fragments, @Nullable Calendar diagSyncTime, @NotNull ISaveHandledData saveHandledData, @NotNull Function1<? super List<RRPackageDataAnalysis.RRSingleData>, Unit> logRRIndex) {
        if (TextUtils.isEmpty(config.getUserId())) {
            HMLog.info(TAG, new a(config));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (AFPPGDataFragment aFPPGDataFragment : fragments) {
            AFPPGDataType aFPPGDataTypeFromType = AFPPGDataType.INSTANCE.fromType(aFPPGDataFragment.getType());
            if (aFPPGDataTypeFromType == AFPPGDataType.DIAGNOSIS) {
                HMLog.info(TAG, b.a);
                arrayList.add(aFPPGDataFragment);
            } else if (aFPPGDataTypeFromType == AFPPGDataType.HL_HR) {
                arrayList3.add(aFPPGDataFragment);
            } else if (aFPPGDataTypeFromType.isNotAFData()) {
                arrayList2.add(aFPPGDataFragment);
            }
        }
        HashMap map = new HashMap();
        boolean z = true;
        if (!arrayList.isEmpty()) {
            List<AFibData> listCreate = AFibDataAnalyseService.INSTANCE.create(config, arrayList, diagSyncTime == null ? 0L : diagSyncTime.getTimeInMillis());
            if (listCreate != null && !listCreate.isEmpty()) {
                z = false;
            }
            if (!z) {
                saveHandledData.onHandleAFibFinished(listCreate);
                HMLog.info(TAG, new c(listCreate));
            }
            if (listCreate != null) {
                for (AFibData aFibData : listCreate) {
                    map.put(Long.valueOf(aFibData.getTimestamp()), Integer.valueOf(aFibData.getValue()));
                    HMLog.info(TAG, new d(aFibData));
                }
            }
        }
        List<RRPeak> listCreate2 = RRDataAnalyseService.INSTANCE.create(context, config, arrayList2, map, logRRIndex);
        if (listCreate2 != null) {
            saveHandledData.onHandleRRFinished(listCreate2);
        }
        if (DeviceSupportKt.supportHLHR(config.getDeviceSource())) {
            List<HREventData> listCreateHLHRData = HighLowHrAnalysisService.INSTANCE.createHLHRData(config, arrayList3);
            if (listCreateHLHRData.isEmpty()) {
                return;
            }
            saveHandledData.onHandleHRFinished(listCreateHLHRData);
        }
    }
}
