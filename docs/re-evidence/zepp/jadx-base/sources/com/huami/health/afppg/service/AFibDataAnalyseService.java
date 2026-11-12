package com.huami.health.afppg.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.DeviceConfig;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import com.huami.tools.log.HMLog;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.LongRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0002J,\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0014\u001a\u00020\u0013R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/service/AFibDataAnalyseService;", "", "Lcom/huami/health/afppg/model/DeviceConfig;", "config", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "frag", "Lkotlin/ranges/LongRange;", "timeRange", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "a", "", "type", "", "c", "aFibData", "", "b", "fragments", "", "syncTimestamp", "create", "", "Ljava/lang/String;", "TAG", LogUtil.I, "DATA_LEN", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class AFibDataAnalyseService {

    @NotNull
    public static final AFibDataAnalyseService INSTANCE = new AFibDataAnalyseService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "af_ppg_AFibDataNative";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int DATA_LEN = 5;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ LongRange a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LongRange longRange) {
            super(0);
            this.a = longRange;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "create timeRange " + this.a.getFirst() + StringUtil.SPACE + this.a.getLast();
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
            return "AFib is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ IOException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IOException iOException) {
            super(0);
            this.a = iOException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("AFib io exception", this.a.getMessage());
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
            return "createAFib continue";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createAFib data's timestamp not in range";
        }
    }

    private AFibDataAnalyseService() {
    }

    private final List<AFibData> a(DeviceConfig config, AFPPGDataFragment frag, LongRange timeRange) throws IOException {
        ArrayList arrayList = new ArrayList();
        int size = frag.getData().size();
        int i = size / 5;
        long[] jArr = new long[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        long timestamp = 0;
        while (i2 < size) {
            int i4 = i2 + 5;
            if (i4 > size) {
                break;
            }
            byte bByteValue = frag.getData().get(i2 + 4).byteValue();
            jArr[i3] = PPGExtensionsKt.byteToLong(new byte[]{frag.getData().get(i2).byteValue(), frag.getData().get(i2 + 1).byteValue(), frag.getData().get(i2 + 2).byteValue(), frag.getData().get(i2 + 3).byteValue()}, 0, 4);
            iArr[i3] = bByteValue;
            if (!c(bByteValue)) {
                i3++;
                HMLog.info(TAG, d.a);
            } else if (timeRange.contains(jArr[i3])) {
                AFibData aFibData = new AFibData(null, 0L, 0, 0, 0L, 0, null, null, null, null, null, null, null, 8191, null);
                aFibData.setTimestamp(jArr[i3]);
                aFibData.setDeviceSource(config.getDeviceSource());
                aFibData.setType(String.valueOf(frag.getType()));
                aFibData.setValue(iArr[i3]);
                aFibData.setTimeZone(TimeZone.getDefault().getID());
                aFibData.setDate(PPGExtensionsKt.toYMDHMS(aFibData.getTimestamp(), TimeZone.getTimeZone(aFibData.getTimeZone())));
                if (timestamp == 0) {
                    timestamp = aFibData.getTimestamp();
                }
                aFibData.setGroupTime(timestamp);
                aFibData.setUserId(config.getUserId());
                b(config, aFibData);
                arrayList.add(aFibData);
                i3++;
            } else {
                i3++;
                HMLog.info(TAG, e.a);
            }
            i2 = i4;
        }
        return arrayList;
    }

    private final void b(DeviceConfig config, AFibData aFibData) {
        aFibData.setDeviceSource(config.getDeviceSource());
        aFibData.setAppName(config.getAppName());
        aFibData.setFwVer(config.getFwVer());
        aFibData.setSn(config.getSn());
        aFibData.setDeviceId(config.getDeviceId());
    }

    private final boolean c(int type) {
        return type == 0 || type == 1 || type == 2 || type == 3 || type == 8 || type == 100 || type == 101;
    }

    @Nullable
    public final List<AFibData> create(@NotNull DeviceConfig config, @NotNull List<AFPPGDataFragment> fragments, long syncTimestamp) {
        ArrayList arrayList = new ArrayList();
        LongRange longRange = new LongRange(syncTimestamp, (System.currentTimeMillis() / 1000) + 1);
        HMLog.info$default(null, new a(longRange), 1, null);
        for (AFPPGDataFragment aFPPGDataFragment : fragments) {
            if (aFPPGDataFragment.getData().isEmpty()) {
                HMLog.info(TAG, b.a);
            } else {
                try {
                    List<AFibData> listA = a(config, aFPPGDataFragment, longRange);
                    if (listA != null) {
                        arrayList.addAll(listA);
                    }
                } catch (IOException e2) {
                    HMLog.info(TAG, new c(e2));
                    return null;
                }
            }
        }
        return arrayList;
    }
}
