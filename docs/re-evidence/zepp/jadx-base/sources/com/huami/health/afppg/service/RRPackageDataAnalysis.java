package com.huami.health.afppg.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.loc.z;
import defpackage.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J&\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u001e\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001e¨\u0006,"}, d2 = {"Lcom/huami/health/afppg/service/RRPackageDataAnalysis;", "", "", HTTP.CONTENT_RANGE_BYTES, "", "index", "Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "a", "dataLength", "dataCheck", "", "e", "type", "", "g", "headerIntValue", "h", SessionDescription.p, "count", GoogleApiAvailabilityLight.a, "c", "", "b", "data", "i", "f", "analysisForRRPkgData", "", "Ljava/lang/String;", "TAG", LogUtil.I, "HEADER_LEN", "HEADER_LEN_EXCLUDE_CHECK", "DATA_ORDER_INDEX", "DATA_LEN_INDEX", "DATA_CHECK_INDEX", "HEADER_CHECK_INDEX", "HEADER_FLAG", "HEADER_INFO_COUNT", z.j, "HEADER_RR_PKG_TYPE", "<init>", "()V", "RRSingleData", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class RRPackageDataAnalysis {

    @NotNull
    public static final RRPackageDataAnalysis INSTANCE = new RRPackageDataAnalysis();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "RRPackageDataAnalysis";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int HEADER_LEN = 12;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int HEADER_LEN_EXCLUDE_CHECK = 10;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int DATA_ORDER_INDEX = 2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int DATA_LEN_INDEX = 3;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int DATA_CHECK_INDEX = 4;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int HEADER_CHECK_INDEX = 5;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int HEADER_FLAG = 21930;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int HEADER_INFO_COUNT = 6;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final int HEADER_RR_PKG_TYPE = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("rr analysis error:", this.a);
        }
    }

    private RRPackageDataAnalysis() {
    }

    private final RRSingleData a(byte[] bytes, int index) {
        RRSingleData rRSingleData = new RRSingleData(0L, null, null, null, null, null, null, null, null, 0, 1023, null);
        rRSingleData.setTimestamp(b(bytes, index, 32));
        List<Integer> listD = d(bytes, index + 4, 16, 2);
        int iIntValue = listD.get(0).intValue();
        rRSingleData.setIntervalCnt(Integer.valueOf(iIntValue));
        rRSingleData.setPosPksCnt(listD.get(1));
        rRSingleData.setSignalQuality(d(bytes, index + 8, 8, 1).get(0));
        rRSingleData.setAfResult(Integer.valueOf(bytes[index + 9]));
        List<Integer> listD2 = d(bytes, index + 10, 8, 2);
        rRSingleData.setVersion(listD2.get(0));
        rRSingleData.setReserve(listD2.get(1));
        rRSingleData.setIntervalData(c(bytes, index + 12, 16, iIntValue));
        return rRSingleData;
    }

    private final long b(byte[] bytes, int index, int length) {
        int i = length / 8;
        if (index + i > bytes.length || length % 8 != 0 || length > 64) {
            throw new IllegalArgumentException();
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j |= (long) ((bytes[index + i2] & 255) << (i2 * 8));
        }
        return j;
    }

    private final List<Integer> c(byte[] bytes, int index, int length, int count) {
        int i = length / 8;
        if ((count * i) + index > bytes.length || length % 8 != 0) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i - 1) {
                i4 |= (bytes[((i2 * i) + index) + i3] & 255) << (i3 * 8);
                i3++;
            }
            arrayList.add(Integer.valueOf((bytes[((i2 * i) + index) + i3] << (i3 * 8)) | i4));
        }
        return arrayList;
    }

    private final List<Integer> d(byte[] bytes, int index, int length, int count) {
        int i = length / 8;
        if ((count * i) + index > bytes.length || length % 8 != 0) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                i3 |= (bytes[((i2 * i) + index) + i4] & 255) << (i4 * 8);
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    private final void e(byte[] bytes, int index, int dataLength, int dataCheck) {
        byte[] bArr = new byte[dataLength];
        ArraysKt___ArraysJvmKt.copyInto(bytes, bArr, 0, index, dataLength + index);
        if (dataCheck != f(bArr)) {
            throw new IllegalArgumentException();
        }
    }

    private final int f(byte[] data) {
        int length = data.length;
        int i = 0;
        int i2 = 0;
        while (length > 1) {
            int i3 = i2 + 1;
            i += (data[i2] & 255) | ((data[i3] & 255) << 8);
            length -= 2;
            i2 = i3 + 1;
        }
        if (length == 1) {
            i += data[data.length - 1];
        }
        while (true) {
            int i4 = i >> 16;
            if (i4 == 0) {
                return (~i) & 65535;
            }
            i = i4 + (65535 & i);
        }
    }

    private final List<Integer> g(byte[] bytes, int index, int type) {
        List<Integer> listD = d(bytes, index, 16, 6);
        i(listD, type);
        h(bytes, index, listD);
        return listD;
    }

    private final void h(byte[] bytes, int index, List<Integer> headerIntValue) {
        byte[] bArr = new byte[10];
        ArraysKt___ArraysJvmKt.copyInto(bytes, bArr, 0, index, index + 10);
        if (headerIntValue.get(5).intValue() != f(bArr)) {
            throw new IllegalArgumentException();
        }
    }

    private final void i(List<Integer> data, int type) {
        if (data.get(0).intValue() != HEADER_FLAG || data.get(1).intValue() != type) {
            throw new IllegalArgumentException("error RR header flag");
        }
    }

    @NotNull
    public final List<RRSingleData> analysisForRRPkgData(@NotNull byte[] bytes) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bytes.length) {
            try {
                List<Integer> listG = g(bytes, i, 4);
                int iIntValue = listG.get(3).intValue();
                int i2 = i + 12;
                e(bytes, i2, iIntValue, listG.get(4).intValue());
                RRSingleData rRSingleDataA = a(bytes, i2);
                rRSingleDataA.setIndex(listG.get(2).intValue());
                arrayList.add(rRSingleDataA);
                i = i2 + iIntValue;
            } catch (Exception e) {
                HMLog.info(TAG, new a(e));
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u008a\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010,R$\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010,R$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010)\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010,R$\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010,R$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b7\u0010\b\"\u0004\b8\u0010,R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010)\u001a\u0004\b:\u0010\b\"\u0004\b;\u0010,R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "", "", "toString", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "timestamp", "intervalCnt", "posPksCnt", "signalQuality", "afResult", "version", "reserve", "intervalData", "data", "index", "copy", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;I)Lcom/huami/health/afppg/service/RRPackageDataAnalysis$RRSingleData;", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "b", "Ljava/lang/Integer;", "getIntervalCnt", "setIntervalCnt", "(Ljava/lang/Integer;)V", "c", "getPosPksCnt", "setPosPksCnt", GoogleApiAvailabilityLight.a, "getSignalQuality", "setSignalQuality", "e", "getAfResult", "setAfResult", "f", "getVersion", "setVersion", "g", "getReserve", "setReserve", "h", "Ljava/util/List;", "getIntervalData", "()Ljava/util/List;", "setIntervalData", "(Ljava/util/List;)V", "i", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", z.j, LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;I)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class RRSingleData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long timestamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private Integer intervalCnt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private Integer posPksCnt;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        private Integer signalQuality;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        private Integer afResult;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @Nullable
        private Integer version;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        private Integer reserve;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private List<Integer> intervalData;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        private final String data;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private int index;

        public RRSingleData() {
            this(0L, null, null, null, null, null, null, null, null, 0, 1023, null);
        }

        public RRSingleData(long j, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable List<Integer> list, @Nullable String str, int i) {
            this.timestamp = j;
            this.intervalCnt = num;
            this.posPksCnt = num2;
            this.signalQuality = num3;
            this.afResult = num4;
            this.version = num5;
            this.reserve = num6;
            this.intervalData = list;
            this.data = str;
            this.index = i;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getIntervalCnt() {
            return this.intervalCnt;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getPosPksCnt() {
            return this.posPksCnt;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getSignalQuality() {
            return this.signalQuality;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getAfResult() {
            return this.afResult;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getVersion() {
            return this.version;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getReserve() {
            return this.reserve;
        }

        @Nullable
        public final List<Integer> component8() {
            return this.intervalData;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getData() {
            return this.data;
        }

        @NotNull
        public final RRSingleData copy(long timestamp, @Nullable Integer intervalCnt, @Nullable Integer posPksCnt, @Nullable Integer signalQuality, @Nullable Integer afResult, @Nullable Integer version, @Nullable Integer reserve, @Nullable List<Integer> intervalData, @Nullable String data, int index) {
            return new RRSingleData(timestamp, intervalCnt, posPksCnt, signalQuality, afResult, version, reserve, intervalData, data, index);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RRSingleData)) {
                return false;
            }
            RRSingleData rRSingleData = (RRSingleData) other;
            return this.timestamp == rRSingleData.timestamp && Intrinsics.areEqual(this.intervalCnt, rRSingleData.intervalCnt) && Intrinsics.areEqual(this.posPksCnt, rRSingleData.posPksCnt) && Intrinsics.areEqual(this.signalQuality, rRSingleData.signalQuality) && Intrinsics.areEqual(this.afResult, rRSingleData.afResult) && Intrinsics.areEqual(this.version, rRSingleData.version) && Intrinsics.areEqual(this.reserve, rRSingleData.reserve) && Intrinsics.areEqual(this.intervalData, rRSingleData.intervalData) && Intrinsics.areEqual(this.data, rRSingleData.data) && this.index == rRSingleData.index;
        }

        @Nullable
        public final Integer getAfResult() {
            return this.afResult;
        }

        @Nullable
        public final String getData() {
            return this.data;
        }

        public final int getIndex() {
            return this.index;
        }

        @Nullable
        public final Integer getIntervalCnt() {
            return this.intervalCnt;
        }

        @Nullable
        public final List<Integer> getIntervalData() {
            return this.intervalData;
        }

        @Nullable
        public final Integer getPosPksCnt() {
            return this.posPksCnt;
        }

        @Nullable
        public final Integer getReserve() {
            return this.reserve;
        }

        @Nullable
        public final Integer getSignalQuality() {
            return this.signalQuality;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @Nullable
        public final Integer getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iA = b.a(this.timestamp) * 31;
            Integer num = this.intervalCnt;
            int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.posPksCnt;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.signalQuality;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.afResult;
            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.version;
            int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.reserve;
            int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
            List<Integer> list = this.intervalData;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.data;
            return ((iHashCode7 + (str != null ? str.hashCode() : 0)) * 31) + this.index;
        }

        public final void setAfResult(@Nullable Integer num) {
            this.afResult = num;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final void setIntervalCnt(@Nullable Integer num) {
            this.intervalCnt = num;
        }

        public final void setIntervalData(@Nullable List<Integer> list) {
            this.intervalData = list;
        }

        public final void setPosPksCnt(@Nullable Integer num) {
            this.posPksCnt = num;
        }

        public final void setReserve(@Nullable Integer num) {
            this.reserve = num;
        }

        public final void setSignalQuality(@Nullable Integer num) {
            this.signalQuality = num;
        }

        public final void setTimestamp(long j) {
            this.timestamp = j;
        }

        public final void setVersion(@Nullable Integer num) {
            this.version = num;
        }

        @NotNull
        public String toString() {
            return "RRSingleData{timestamp=" + this.timestamp + ", intervalCnt=" + this.intervalCnt + ", posPksCnt=" + this.posPksCnt + ", signalQuality=" + this.signalQuality + ", afResult=" + this.afResult + ", version=" + this.version + ", reserve=" + this.reserve + '}';
        }

        public /* synthetic */ RRSingleData(long j, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : num4, (i2 & 32) != 0 ? null : num5, (i2 & 64) != 0 ? null : num6, (i2 & 128) != 0 ? null : list, (i2 & 256) == 0 ? str : null, (i2 & 512) != 0 ? 0 : i);
        }
    }
}
