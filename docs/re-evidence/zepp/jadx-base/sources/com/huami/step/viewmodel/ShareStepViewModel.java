package com.huami.step.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.step.model.TimeIndex;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huami/step/viewmodel/ShareStepViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/step/model/TimeIndex;", "a", "Landroidx/lifecycle/MutableLiveData;", "getShareClick", "()Landroidx/lifecycle/MutableLiveData;", "shareClick", "", "b", "getShareIconVisible", "shareIconVisible", "c", "getGetShareIconStatus", "getShareIconStatus", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class ShareStepViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeIndex> shareClick = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> shareIconVisible = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeIndex> getShareIconStatus = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<TimeIndex> getGetShareIconStatus() {
        return this.getShareIconStatus;
    }

    @NotNull
    public final MutableLiveData<TimeIndex> getShareClick() {
        return this.shareClick;
    }

    @NotNull
    public final MutableLiveData<Integer> getShareIconVisible() {
        return this.shareIconVisible;
    }
}
