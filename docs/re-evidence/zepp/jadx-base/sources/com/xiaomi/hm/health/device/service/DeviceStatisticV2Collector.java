package com.xiaomi.hm.health.device.service;

import android.os.ConditionVariable;
import androidx.annotation.WorkerThread;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.Base64;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0014\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/service/DeviceStatisticV2Collector;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "syncStatisticData", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Ljava/util/Calendar;", "time", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "e", "rawData", "Lcom/xiaomi/hm/health/device/service/DeviceStatisticV2Collector$StatisticInfoV2;", "c", "parsedData", "b", "data", "", "a", GoogleApiAvailabilityLight.a, "", "handleSyncedData", "", "supportStatisticV2", "Ljava/lang/String;", "TAG", "RECORD_ID", "<init>", "()V", "StatisticInfoV2", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceStatisticV2Collector {

    @NotNull
    public static final DeviceStatisticV2Collector INSTANCE = new DeviceStatisticV2Collector();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "StatisticV2Syncer";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String RECORD_ID = "FIRMWARE_SPECIAL_EVENT_ID";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/service/DeviceStatisticV2Collector$StatisticInfoV2;", "", "", "component1", "component2", "", "component3", "magic", SessionDescription.p, "protobuf", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMagic", "()I", "b", "getLength", "c", "[B", "getProtobuf", "()[B", "<init>", "(II[B)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class StatisticInfoV2 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int magic;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int length;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final byte[] protobuf;

        public StatisticInfoV2(int i, int i2, @NotNull byte[] bArr) {
            this.magic = i;
            this.length = i2;
            this.protobuf = bArr;
        }

        public static /* synthetic */ StatisticInfoV2 copy$default(StatisticInfoV2 statisticInfoV2, int i, int i2, byte[] bArr, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = statisticInfoV2.magic;
            }
            if ((i3 & 2) != 0) {
                i2 = statisticInfoV2.length;
            }
            if ((i3 & 4) != 0) {
                bArr = statisticInfoV2.protobuf;
            }
            return statisticInfoV2.copy(i, i2, bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMagic() {
            return this.magic;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final byte[] getProtobuf() {
            return this.protobuf;
        }

        @NotNull
        public final StatisticInfoV2 copy(int magic, int length, @NotNull byte[] protobuf) {
            return new StatisticInfoV2(magic, length, protobuf);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatisticInfoV2)) {
                return false;
            }
            StatisticInfoV2 statisticInfoV2 = (StatisticInfoV2) other;
            return this.magic == statisticInfoV2.magic && this.length == statisticInfoV2.length && Intrinsics.areEqual(this.protobuf, statisticInfoV2.protobuf);
        }

        public final int getLength() {
            return this.length;
        }

        public final int getMagic() {
            return this.magic;
        }

        @NotNull
        public final byte[] getProtobuf() {
            return this.protobuf;
        }

        public int hashCode() {
            return (((this.magic * 31) + this.length) * 31) + Arrays.hashCode(this.protobuf);
        }

        @NotNull
        public String toString() {
            return "StatisticInfoV2(magic=" + this.magic + ", length=" + this.length + ", protobuf=" + Arrays.toString(this.protobuf) + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ InterruptedException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterruptedException interruptedException) {
            super(0);
            this.a = interruptedException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sleep failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HmGdspRawData> a;
        public final /* synthetic */ List<StatisticInfoV2> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<HmGdspRawData> list, List<StatisticInfoV2> list2) {
            super(0);
            this.a = list;
            this.b = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync statistic data finish and data size: " + this.a.size() + "; parsed data size: " + this.b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "raw data: " + GattUtils.bytesToHexString(this.a);
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
            return "parse data failed as index out of bounds before parsing magic";
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
            return "parse data failed as index out of bounds after parsing magic";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse data failed as index out of bounds after parsing protobuf length";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse a protobuf data: {magic: " + this.a + ", protobufLength: " + this.b + com.alipay.sdk.m.u.i.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "putToStatisticLib {FIRMWARE_SPECIAL_EVENT_ID: " + this.a + com.alipay.sdk.m.u.i.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device sync start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start sync statistic data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device do not have feature";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device not support";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceStatisticV2Collector exception: " + this.a;
        }
    }

    private DeviceStatisticV2Collector() {
    }

    private final String a(StatisticInfoV2 data) {
        return Base64.encodeToString(data.getProtobuf(), 2);
    }

    private final void b(List<StatisticInfoV2> parsedData) {
        for (StatisticInfoV2 statisticInfoV2 : parsedData) {
            if (parsedData.indexOf(statisticInfoV2) != 0) {
                try {
                    Thread.sleep(2L);
                } catch (InterruptedException e2) {
                    HMLog.info(TAG, new a(e2));
                }
            }
            DeviceStatisticV2Collector deviceStatisticV2Collector = INSTANCE;
            deviceStatisticV2Collector.d(deviceStatisticV2Collector.a(statisticInfoV2));
        }
    }

    private final List<StatisticInfoV2> c(HmGdspRawData rawData) {
        byte[] rawData2 = rawData.getRawData();
        HMLog.info(TAG, new c(rawData2));
        ArrayList arrayList = new ArrayList();
        int length = rawData2.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            }
            int i3 = i2 + 2;
            if (i3 > length) {
                HMLog.info(TAG, d.a);
                break;
            }
            int iBytesToInt = GattUtils.bytesToInt(rawData2, i2, 2);
            int i4 = i3 + 2;
            if (i4 > length) {
                HMLog.info(TAG, e.a);
                break;
            }
            int iBytesToInt2 = GattUtils.bytesToInt(rawData2, i3, 2);
            int i5 = i4 + iBytesToInt2;
            if (i5 > length) {
                HMLog.info(TAG, f.a);
                break;
            }
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(rawData2, i4, i5);
            HMLog.info(TAG, new g(iBytesToInt, iBytesToInt2));
            arrayList.add(new StatisticInfoV2(iBytesToInt, iBytesToInt2, bArrCopyOfRange));
            i2 = i5;
        }
        if (!z) {
            arrayList.clear();
        }
        return arrayList;
    }

    private final void d(String data) {
        HMLog.info(TAG, new h(data));
        Analytics.recordEvent(new CountEventBuilder(RECORD_ID).setValue(data).setIdentified(StatEvent.isUserIdentified().booleanValue()).setAnonymous(!StatEvent.isUserIdentified().booleanValue()));
    }

    private final List<HmGdspRawData> e(HMMiLiProDevice device, Calendar time) {
        final ConditionVariable conditionVariable = new ConditionVariable(false);
        final ArrayList arrayList = new ArrayList();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        HMLog.info(TAG, i.a);
        device.startSyncRawData(time, 44, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.device.service.DeviceStatisticV2Collector$syncData$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ HmGdspRawData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(HmGdspRawData hmGdspRawData) {
                    super(0);
                    this.a = hmGdspRawData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HmGdspRawData hmGdspRawData = this.a;
                    return "sync data being invalid: " + (hmGdspRawData == null ? null : hmGdspRawData.getRawData());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HmGdspRawData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HmGdspRawData hmGdspRawData) {
                    super(0);
                    this.a = hmGdspRawData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "sync data length: " + this.a.getRawData().length;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "device sync finish, result: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                booleanRef.element = result;
                HMLog.info("StatisticV2Syncer", new c(result));
                conditionVariable.open();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData data) {
                super.onData(data);
                if ((data == null ? null : data.getRawData()) != null) {
                    if (!(data.getRawData().length == 0)) {
                        HMLog.info("StatisticV2Syncer", new b(data));
                        arrayList.add(data);
                        return;
                    }
                }
                HMLog.info("StatisticV2Syncer", new a(data));
            }
        });
        conditionVariable.block();
        if (!booleanRef.element) {
            arrayList.clear();
        }
        return arrayList;
    }

    @JvmStatic
    @WorkerThread
    public static final void syncStatisticData(@NotNull HMBaseDevice device) {
        DeviceStatisticV2Collector deviceStatisticV2Collector = INSTANCE;
        HMLog.info(TAG, j.a);
        if (!deviceStatisticV2Collector.supportStatisticV2(device)) {
            HMLog.info(TAG, k.a);
            return;
        }
        if (!(device instanceof HMMiLiProDevice)) {
            HMLog.info(TAG, l.a);
            return;
        }
        try {
            deviceStatisticV2Collector.handleSyncedData(deviceStatisticV2Collector.e((HMMiLiProDevice) device, Calendar.getInstance()));
        } catch (Exception e2) {
            HMLog.info(TAG, new m(e2));
        }
    }

    public final int handleSyncedData(@NotNull List<HmGdspRawData> data) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(arrayList, INSTANCE.c((HmGdspRawData) it2.next()));
        }
        b(arrayList);
        HMLog.info(TAG, new b(data, arrayList));
        return arrayList.size();
    }

    public final boolean supportStatisticV2(@NotNull HMBaseDevice device) {
        return device.getDeviceInfo().getDeviceFeature().hasSw(40);
    }
}
