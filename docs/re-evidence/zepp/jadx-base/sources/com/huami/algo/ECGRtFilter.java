package com.huami.algo;

import android.util.Pair;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.jhmsignal.JhmSignal;
import com.huami.ecg.sync.health.model.UserProfile;
import com.huami.ecg.util.DeviceUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B-\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0013\u0010 \u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\"\u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006("}, d2 = {"Lcom/huami/algo/ECGRtFilter;", "", "", "checkNoise", "finish", "", "", "ecgRawData", "doNormalize", "getRtFilters", "Lcom/huami/algo/healthcare/HealthCare;", "a", "Lcom/huami/algo/healthcare/HealthCare;", "healthCare", "Lcom/huami/algo/jhmsignal/JhmSignal;", "b", "Lcom/huami/algo/jhmsignal/JhmSignal;", "mJmFilter", "", "c", LogUtil.I, "currentHr", GoogleApiAvailabilityLight.a, "solution", "Landroid/util/Pair;", "e", "Landroid/util/Pair;", "mCoeffAB", "f", "source", "getCurrentHR", "()I", "currentHR", "getAverageHR", "averageHR", "Lcom/huami/ecg/sync/health/model/UserProfile;", Scopes.PROFILE, "<init>", "(Lcom/huami/ecg/sync/health/model/UserProfile;Landroid/util/Pair;I)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class ECGRtFilter {
    private static final int g = 0;
    private static final int h = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HealthCare healthCare;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JhmSignal mJmFilter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int currentHr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int solution;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Pair<Integer, Integer> mCoeffAB;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Unit a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Unit unit) {
            super(0);
            this.a = unit;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "jhm initFilter:" + this.a;
        }
    }

    public ECGRtFilter(@Nullable UserProfile userProfile, @NotNull Pair<Integer, Integer> pair, int i) {
        this.mCoeffAB = pair;
        this.source = i;
        HealthNative healthNative = HealthNative.INSTANCE;
        HealthCare healthCare = healthNative.getHealthCare(250);
        this.healthCare = healthCare;
        JhmSignal jhmInstance = healthNative.getJhmInstance();
        this.mJmFilter = jhmInstance;
        this.solution = 1;
        boolean zIsJHSSeries = DeviceUtils.INSTANCE.isJHSSeries(i);
        this.solution = zIsJHSSeries ? 1 : 0;
        if (!zIsJHSSeries) {
            healthCare.initFilter(true);
        } else if (zIsJHSSeries) {
            jhmInstance.initFilter();
            HMLog.debug("jhmsignal", new a(Unit.INSTANCE));
        }
        HMLog.d("rt", "Coeff A:" + ((Integer) pair.first) + ",B:" + ((Integer) pair.second), new Object[0]);
    }

    public final boolean finish(boolean checkNoise) {
        int i = this.solution;
        if (i == 0) {
            this.healthCare.deinitFilter();
        } else if (i == 1) {
            this.mJmFilter.deinitFilter();
        }
        return true;
    }

    public final int getAverageHR() {
        int i = this.solution;
        if (i == 0) {
            this.currentHr = this.healthCare.getAverageHR();
            return 0;
        }
        if (i != 1) {
            return 0;
        }
        this.mJmFilter.getAverageHR();
        return 0;
    }

    public final int getCurrentHR() {
        int i = this.solution;
        if (i == 0) {
            this.currentHr = this.healthCare.getHR();
        } else if (i == 1) {
            this.currentHr = this.mJmFilter.getAverageHR();
        }
        return this.currentHr;
    }

    @NotNull
    public final List<Float> getRtFilters(@Nullable List<Float> ecgRawData, boolean doNormalize) {
        if (ecgRawData == null || ecgRawData.isEmpty()) {
            return new ArrayList();
        }
        int i = this.solution;
        if (i != 0) {
            return i != 1 ? ecgRawData : HealthCompatNative.INSTANCE.getJhmFilters$ecg_core_release(this.mJmFilter, ecgRawData, this.mCoeffAB);
        }
        return HealthCompatNative.INSTANCE.getEcgFilters$ecg_core_release(this.healthCare, ecgRawData, this.mCoeffAB, doNormalize);
    }
}
