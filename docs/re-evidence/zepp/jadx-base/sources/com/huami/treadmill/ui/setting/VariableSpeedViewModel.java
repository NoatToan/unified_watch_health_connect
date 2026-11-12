package com.huami.treadmill.ui.setting;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.alipay.sdk.m.k.b;
import kotlin.Metadata;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R.\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/treadmill/ui/setting/VariableSpeedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Triple;", "", b.o, "", "setSpeedArrays", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "_speedArrays", "Landroidx/lifecycle/LiveData;", "getSpeedArrays", "()Landroidx/lifecycle/LiveData;", "speedArrays", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class VariableSpeedViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Triple<Integer, Integer, Integer>> _speedArrays = new MutableLiveData<>();

    @NotNull
    public final LiveData<Triple<Integer, Integer, Integer>> getSpeedArrays() {
        return this._speedArrays;
    }

    public final void setSpeedArrays(@NotNull Triple<Integer, Integer, Integer> third) {
        this._speedArrays.setValue(third);
    }
}
