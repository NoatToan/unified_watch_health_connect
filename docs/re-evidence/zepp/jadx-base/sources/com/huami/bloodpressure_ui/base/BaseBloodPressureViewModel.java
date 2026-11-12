package com.huami.bloodpressure_ui.base;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureDateData;
import com.huami.bloodpressure_ui.chart.BloodPressureStatus;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u001e\u0010\r\u001a\n \n*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R,\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00180\u000e8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R)\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00180\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R(\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u000e8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013¨\u0006)"}, d2 = {"Lcom/huami/bloodpressure_ui/base/BaseBloodPressureViewModel;", "Landroidx/lifecycle/ViewModel;", "", "timeStamp", "", "loadData", "", "tag", "msg", "logWithTag", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "b", "Landroidx/lifecycle/MutableLiveData;", "get_headStatus", "()Landroidx/lifecycle/MutableLiveData;", "_headStatus", "c", "getHeadStatus", "headStatus", "", "", GoogleApiAvailabilityLight.a, "get_analyseList", "_analyseList", "e", "getAnalyseList", "analyseList", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "f", "get_bigDataChartList", "_bigDataChartList", "g", "getBigDataChartList", "bigDataChartList", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseBloodPressureViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = BaseBloodPressureViewModel.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureStatus> _headStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureStatus> headStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Integer>> _analyseList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Integer>> analyseList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<BloodPressureDateData>> _bigDataChartList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<BloodPressureDateData>> bigDataChartList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    public BaseBloodPressureViewModel() {
        MutableLiveData<BloodPressureStatus> mutableLiveData = new MutableLiveData<>();
        this._headStatus = mutableLiveData;
        this.headStatus = mutableLiveData;
        MutableLiveData<List<Integer>> mutableLiveData2 = new MutableLiveData<>();
        this._analyseList = mutableLiveData2;
        this.analyseList = mutableLiveData2;
        MutableLiveData<List<BloodPressureDateData>> mutableLiveData3 = new MutableLiveData<>();
        this._bigDataChartList = mutableLiveData3;
        this.bigDataChartList = mutableLiveData3;
    }

    public static /* synthetic */ void logWithTag$default(BaseBloodPressureViewModel baseBloodPressureViewModel, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWithTag");
        }
        if ((i & 1) != 0) {
            str = baseBloodPressureViewModel.TAG;
        }
        baseBloodPressureViewModel.logWithTag(str, str2);
    }

    @NotNull
    public final MutableLiveData<List<Integer>> getAnalyseList() {
        return this.analyseList;
    }

    @NotNull
    public final MutableLiveData<List<BloodPressureDateData>> getBigDataChartList() {
        return this.bigDataChartList;
    }

    @NotNull
    public final MutableLiveData<BloodPressureStatus> getHeadStatus() {
        return this.headStatus;
    }

    @NotNull
    public final MutableLiveData<List<Integer>> get_analyseList() {
        return this._analyseList;
    }

    @NotNull
    public final MutableLiveData<List<BloodPressureDateData>> get_bigDataChartList() {
        return this._bigDataChartList;
    }

    @NotNull
    public final MutableLiveData<BloodPressureStatus> get_headStatus() {
        return this._headStatus;
    }

    public abstract void loadData(long timeStamp);

    public final void logWithTag(@NotNull String tag, @NotNull String msg) {
        HMLog.debug(tag, new a(msg));
    }
}
