package com.huami.algo;

import android.util.Pair;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.jhmsignal.JhmSignal;
import com.huami.algo.jhmsignal.SmoothResult;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.ecg.util.NormalizedTools;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\f\u001a\u0004\u0018\u00010\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bJ&\u0010\u000f\u001a\u0004\u0018\u00010\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bJ4\u0010\u0014\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0006J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/algo/WaveFilterNative;", "", "", "", "a", "data", "", "isAdvance", "", "deviceSource", "Lcom/huami/ecg/core/model/FilterRecord;", "smoothHis", "smoothJhmHis", "", "rawModel", "smoothWithModel", "srcRawData", "Landroid/util/Pair;", "coff", "isLeft", "buildEnrolledWithHand", "smoothHisWithSignal", "", "Ljava/lang/String;", "TAG", "b", "Z", "RPEAKS", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class WaveFilterNative {
    public static final WaveFilterNative INSTANCE = new WaveFilterNative();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "Ecg-WaveFilter";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final boolean RPEAKS = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "buildEnrolled:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ List b;
        public final /* synthetic */ float[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, List list, float[] fArr) {
            super(0);
            this.a = j;
            this.b = list;
            this.c = fArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "buildEnrolled span:" + (System.currentTimeMillis() - this.a) + "," + this.b.size() + ",smoothModel:" + this.c.length;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int[] d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ HealthCare f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, List list, int i, int[] iArr, int[] iArr2, HealthCare healthCare, float f, float f2) {
            super(0);
            this.a = j;
            this.b = list;
            this.c = i;
            this.d = iArr;
            this.e = iArr2;
            this.f = healthCare;
            this.g = f;
            this.h = f2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "smoothHis span:" + this.a + "," + this.b.size() + ",noise:" + this.c + ",rpek:" + this.d.length + ",pos:" + this.e.length + ",qua:" + this.f.getQuality() + ",hr:" + this.g + ",hrv:" + this.h;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ JhmSignal f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, List list, int i, Ref.ObjectRef objectRef, int[] iArr, JhmSignal jhmSignal, float f, float f2) {
            super(0);
            this.a = j;
            this.b = list;
            this.c = i;
            this.d = objectRef;
            this.e = iArr;
            this.f = jhmSignal;
            this.g = f;
            this.h = f2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("smoothHis span:");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b.size());
            sb.append(",noise:");
            sb.append(this.c);
            sb.append(",rpek:");
            int[] iArr = (int[]) this.d.element;
            sb.append(Integer.valueOf(iArr != null ? iArr.length : -1));
            sb.append(",pos:");
            sb.append(this.e.length);
            sb.append(",qua:");
            sb.append(this.f.getQuality());
            sb.append(",hr:");
            sb.append(this.g);
            sb.append(",hrv:");
            sb.append(this.h);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;
        public final /* synthetic */ SmoothResult d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ JhmSignal f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, List list, int i, SmoothResult smoothResult, int[] iArr, JhmSignal jhmSignal, float f, float f2) {
            super(0);
            this.a = j;
            this.b = list;
            this.c = i;
            this.d = smoothResult;
            this.e = iArr;
            this.f = jhmSignal;
            this.g = f;
            this.h = f2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("smoothHis span:");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b.size());
            sb.append(",noise:");
            sb.append(this.c);
            sb.append(",rpek:");
            SmoothResult smoothResult = this.d;
            sb.append(smoothResult != null ? smoothResult.getRPeaksPosition() : null);
            sb.append(",pos:");
            sb.append(this.e.length);
            sb.append(",qua:");
            sb.append(this.f.getQuality());
            sb.append(",hr:");
            sb.append(this.g);
            sb.append(",hrv:");
            sb.append(this.h);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ float[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int[] d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ float[] f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, float[] fArr, int i, int[] iArr, int[] iArr2, float[] fArr2) {
            super(0);
            this.a = j;
            this.b = fArr;
            this.c = i;
            this.d = iArr;
            this.e = iArr2;
            this.f = fArr2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("smoothMod sp:");
            sb.append(this.a);
            sb.append(",");
            sb.append(this.b.length);
            sb.append(",nos:");
            sb.append(this.c);
            sb.append(",rpk:");
            sb.append(this.d.length);
            sb.append(",pos:");
            sb.append(this.e.length);
            sb.append(",Mod:");
            float[] fArr = this.f;
            sb.append(fArr != null ? Integer.valueOf(fArr.length) : null);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ float[] a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int[] c;
        public final /* synthetic */ int[] d;
        public final /* synthetic */ float[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float[] fArr, int i, int[] iArr, int[] iArr2, float[] fArr2) {
            super(0);
            this.a = fArr;
            this.b = i;
            this.c = iArr;
            this.d = iArr2;
            this.e = fArr2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("smoothMod:");
            sb.append(this.a.length);
            sb.append(",nos:");
            sb.append(this.b);
            sb.append(",rpk:");
            int[] iArr = this.c;
            sb.append(iArr != null ? Integer.valueOf(iArr.length) : null);
            sb.append(",pos:");
            sb.append(this.d.length);
            sb.append(",Mod:");
            float[] fArr = this.e;
            sb.append(fArr != null ? Integer.valueOf(fArr.length) : null);
            return sb.toString();
        }
    }

    private WaveFilterNative() {
    }

    private final List<Float> a(@NotNull List<Float> list) {
        return list.size() == 15250 ? list.subList(0, 15000) : list;
    }

    @Nullable
    public final float[] buildEnrolledWithHand(@NotNull List<Float> srcRawData, @Nullable Pair<Integer, Integer> coff, boolean isLeft) {
        float[] fArrBuildEnrolledModel;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMLog.info(TAG, new a(jCurrentTimeMillis));
        HealthCare healthCare = HealthNative.INSTANCE.getHealthCare(250);
        healthCare.initFilter(true);
        if (coff == null) {
            float[] fArr = new float[srcRawData.size()];
            int size = srcRawData.size();
            for (int i = 0; i < size; i++) {
                fArr[i] = srcRawData.get(i).floatValue();
            }
            fArrBuildEnrolledModel = healthCare.buildEnrolledModel(fArr, isLeft);
        } else {
            fArrBuildEnrolledModel = healthCare.buildEnrolledModel(NormalizedTools.INSTANCE.normalizedUvFData(coff, srcRawData, false), isLeft);
        }
        HMLog.info(TAG, new b(jCurrentTimeMillis, srcRawData, fArrBuildEnrolledModel));
        healthCare.deinitFilter();
        healthCare.dispose();
        return fArrBuildEnrolledModel;
    }

    @Nullable
    public final FilterRecord smoothHis(@NotNull List<Float> data, boolean isAdvance, int deviceSource) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HealthCare healthCare = HealthNative.INSTANCE.getHealthCare(250);
        healthCare.initFilter(isAdvance);
        float[] floatArray = CollectionsKt___CollectionsKt.toFloatArray(data);
        float[] fArrSmoothHis = healthCare.smoothHis(floatArray);
        int noisePercent = healthCare.getNoisePercent();
        int[] noisePosition = healthCare.getNoisePosition();
        if (noisePosition == null) {
            noisePosition = new int[0];
        }
        int[] iArr = noisePosition;
        float averageHR = healthCare.getAverageHR();
        float hRVRmssd = healthCare.getHRVRmssd();
        healthCare.deinitFilter();
        int[] rPeaksWithSmooth = healthCare.getRPeaksWithSmooth(floatArray);
        if (rPeaksWithSmooth == null) {
            rPeaksWithSmooth = new int[0];
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 2000) {
            HMLog.info(TAG, new c(jCurrentTimeMillis2, data, noisePercent, rPeaksWithSmooth, iArr, healthCare, averageHR, hRVRmssd));
        }
        healthCare.deinitFilter();
        healthCare.dispose();
        if (fArrSmoothHis == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fArrSmoothHis.length);
        for (float f2 : fArrSmoothHis) {
            arrayList.add(Float.valueOf(f2 / 1000));
        }
        ArrayList arrayList2 = new ArrayList(data.size());
        Iterator<Float> it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(it2.next().floatValue() / 1000));
        }
        return new FilterRecord(arrayList, arrayList2, iArr, rPeaksWithSmooth, noisePercent, averageHR, hRVRmssd, deviceSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, int[]] */
    @Nullable
    public final synchronized FilterRecord smoothHisWithSignal(@NotNull List<Float> data, int deviceSource) {
        int[] rPeaksPosition;
        long jCurrentTimeMillis = System.currentTimeMillis();
        JhmSignal jhmInstance = HealthNative.INSTANCE.getJhmInstance();
        jhmInstance.initFilter();
        SmoothResult smoothResultSmoothHisWithRPeaks = jhmInstance.smoothHisWithRPeaks(CollectionsKt___CollectionsKt.toFloatArray(data));
        int noisePercent = jhmInstance.getNoisePercent();
        int[] noisePosition = jhmInstance.getNoisePosition();
        if (noisePosition == null) {
            noisePosition = new int[0];
        }
        int[] iArr = noisePosition;
        float averageHR = jhmInstance.getAverageHR();
        float hRVRmssd = jhmInstance.getHRVRmssd();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new int[0];
        jhmInstance.deinitFilter();
        objectRef.element = (smoothResultSmoothHisWithRPeaks == null || (rPeaksPosition = smoothResultSmoothHisWithRPeaks.getRPeaksPosition()) == null) ? new int[0] : rPeaksPosition;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 2000) {
            HMLog.info(TAG, new d(jCurrentTimeMillis2, data, noisePercent, objectRef, iArr, jhmInstance, averageHR, hRVRmssd));
        }
        jhmInstance.deinitFilter();
        if (smoothResultSmoothHisWithRPeaks == null) {
            return null;
        }
        float[] smoothedData = smoothResultSmoothHisWithRPeaks.getSmoothedData();
        ArrayList arrayList = new ArrayList(smoothedData.length);
        for (float f2 : smoothedData) {
            arrayList.add(Float.valueOf(f2 / 1000));
        }
        List<Float> listA = a(arrayList);
        float[] fArrSmoothForDoctor = jhmInstance.smoothForDoctor(CollectionsKt___CollectionsKt.toFloatArray(data));
        ArrayList arrayList2 = new ArrayList(fArrSmoothForDoctor.length);
        for (float f3 : fArrSmoothForDoctor) {
            arrayList2.add(Float.valueOf(f3 / 1000));
        }
        List<Float> listA2 = a(arrayList2);
        int[] iArr2 = (int[]) objectRef.element;
        if (iArr2 == null) {
            Intrinsics.throwNpe();
        }
        return new FilterRecord(listA, listA2, iArr, iArr2, noisePercent, averageHR, hRVRmssd, deviceSource);
    }

    @Nullable
    public final FilterRecord smoothJhmHis(@NotNull List<Float> data, int deviceSource) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JhmSignal jhmInstance = HealthNative.INSTANCE.getJhmInstance();
        jhmInstance.initFilter();
        float[] floatArray = CollectionsKt___CollectionsKt.toFloatArray(data);
        SmoothResult smoothResultSmoothHisWithRPeaks = jhmInstance.smoothHisWithRPeaks(floatArray);
        int noisePercent = jhmInstance.getNoisePercent();
        int[] noisePosition = jhmInstance.getNoisePosition();
        float averageHR = jhmInstance.getAverageHR();
        float hRVRmssd = jhmInstance.getHRVRmssd();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 2000) {
            HMLog.info(TAG, new e(jCurrentTimeMillis2, data, noisePercent, smoothResultSmoothHisWithRPeaks, noisePosition, jhmInstance, averageHR, hRVRmssd));
        }
        jhmInstance.deinitFilter();
        if (smoothResultSmoothHisWithRPeaks == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(smoothResultSmoothHisWithRPeaks.getSmoothedData().length);
        for (float f2 : smoothResultSmoothHisWithRPeaks.getSmoothedData()) {
            arrayList.add(Float.valueOf(f2 / 1000));
        }
        ArrayList arrayList2 = new ArrayList(data.size());
        for (float f3 : jhmInstance.smoothForDoctor(floatArray)) {
            arrayList2.add(Float.valueOf(f3 / 1000));
        }
        return new FilterRecord(arrayList, arrayList2, noisePosition, smoothResultSmoothHisWithRPeaks.getRPeaksPosition(), noisePercent, averageHR, hRVRmssd, deviceSource);
    }

    @Nullable
    public final FilterRecord smoothWithModel(@NotNull List<Float> data, @NotNull float[] rawModel, int deviceSource) {
        HealthCare healthCare = HealthNative.INSTANCE.getHealthCare(250);
        healthCare.initFilter(true);
        float[] floatArray = CollectionsKt___CollectionsKt.toFloatArray(data);
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[] fArrSmoothWithModel = healthCare.smoothWithModel(floatArray, rawModel);
        int noisePercent = healthCare.getNoisePercent();
        int[] noisePosition = healthCare.getNoisePosition();
        float averageHR = healthCare.getAverageHR();
        float hRVRmssd = healthCare.getHRVRmssd();
        healthCare.deinitFilter();
        int[] rPeaksWithSmooth = healthCare.getRPeaksWithSmooth(floatArray);
        if (rPeaksWithSmooth == null || rPeaksWithSmooth.length != floatArray.length) {
            HMLog.info(TAG, new g(floatArray, noisePercent, rPeaksWithSmooth, noisePosition, fArrSmoothWithModel));
        }
        int[] iArr = rPeaksWithSmooth != null ? rPeaksWithSmooth : new int[0];
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 2000) {
            HMLog.info(TAG, new f(jCurrentTimeMillis2, floatArray, noisePercent, iArr, noisePosition, fArrSmoothWithModel));
        }
        healthCare.deinitFilter();
        healthCare.dispose();
        if (fArrSmoothWithModel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fArrSmoothWithModel.length);
        for (float f2 : fArrSmoothWithModel) {
            arrayList.add(Float.valueOf(f2 / 1000));
        }
        ArrayList arrayList2 = new ArrayList(data.size());
        Iterator<Float> it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(it2.next().floatValue() / 1000));
        }
        return new FilterRecord(arrayList, arrayList2, noisePosition, iArr, noisePercent, averageHR, hRVRmssd, deviceSource);
    }
}
