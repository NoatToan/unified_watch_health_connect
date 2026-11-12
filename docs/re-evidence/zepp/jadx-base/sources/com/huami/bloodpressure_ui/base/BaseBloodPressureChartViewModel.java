package com.huami.bloodpressure_ui.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_ui.chart.BloodPressureStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rR\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R$\u0010 \u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\"\u0010*\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/huami/bloodpressure_ui/base/BaseBloodPressureChartViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "bloodPressureStatus", "", "setStatus", "it", "setChartList", "(Ljava/lang/Object;)V", "", "currentTimeStamp", "setTimeStamp", "", "offset", "setOffset", "getChartOffset", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "get_currentStatus", "()Landroidx/lifecycle/MutableLiveData;", "_currentStatus", "b", "getCurrentStatus", "currentStatus", "c", "Ljava/lang/Long;", "get_currentTimeStamp", "()Ljava/lang/Long;", "set_currentTimeStamp", "(Ljava/lang/Long;)V", "_currentTimeStamp", GoogleApiAvailabilityLight.a, "get_currentChartList", "_currentChartList", "e", "F", "get_offset", "()F", "set_offset", "(F)V", "_offset", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseBloodPressureChartViewModel<T> extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureStatus> _currentStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BloodPressureStatus> currentStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Long _currentTimeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<T> _currentChartList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float _offset;

    public BaseBloodPressureChartViewModel() {
        MutableLiveData<BloodPressureStatus> mutableLiveData = new MutableLiveData<>();
        this._currentStatus = mutableLiveData;
        this.currentStatus = mutableLiveData;
        this._currentChartList = new MutableLiveData<>();
        this._offset = 3.0f;
    }

    /* JADX INFO: renamed from: getChartOffset, reason: from getter */
    public final float get_offset() {
        return this._offset;
    }

    @NotNull
    public final MutableLiveData<BloodPressureStatus> getCurrentStatus() {
        return this.currentStatus;
    }

    @NotNull
    public final MutableLiveData<T> get_currentChartList() {
        return this._currentChartList;
    }

    @NotNull
    public final MutableLiveData<BloodPressureStatus> get_currentStatus() {
        return this._currentStatus;
    }

    @Nullable
    public final Long get_currentTimeStamp() {
        return this._currentTimeStamp;
    }

    public final float get_offset() {
        return this._offset;
    }

    public final void setChartList(T it2) {
        this._currentChartList.postValue(it2);
    }

    public final void setOffset(float offset) {
        this._offset = offset;
    }

    public final void setStatus(@NotNull BloodPressureStatus bloodPressureStatus) {
        this._currentStatus.postValue(bloodPressureStatus);
    }

    public final void setTimeStamp(long currentTimeStamp) {
        this._currentTimeStamp = Long.valueOf(currentTimeStamp);
    }

    public final void set_currentTimeStamp(@Nullable Long l) {
        this._currentTimeStamp = l;
    }

    public final void set_offset(float f) {
        this._offset = f;
    }
}
