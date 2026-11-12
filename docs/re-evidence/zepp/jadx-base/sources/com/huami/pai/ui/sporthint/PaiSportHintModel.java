package com.huami.pai.ui.sporthint;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.pai.vo.PAIDataVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportHintModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult;", "paiProgressGoal", "", "setPaiGoal", "Lcom/huami/pai/vo/PAIDataVo;", "paiDataVo", "setPaiDataVo", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getMPaiGoalResult", "()Landroidx/lifecycle/MutableLiveData;", "mPaiGoalResult", "b", "getMPaiDataVo", "setMPaiDataVo", "(Landroidx/lifecycle/MutableLiveData;)V", "mPaiDataVo", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiSportHintModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PaiSportGoalResult> mPaiGoalResult = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<PAIDataVo> mPaiDataVo = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<PAIDataVo> getMPaiDataVo() {
        return this.mPaiDataVo;
    }

    @NotNull
    public final MutableLiveData<PaiSportGoalResult> getMPaiGoalResult() {
        return this.mPaiGoalResult;
    }

    public final void setMPaiDataVo(@NotNull MutableLiveData<PAIDataVo> mutableLiveData) {
        this.mPaiDataVo = mutableLiveData;
    }

    public final void setPaiDataVo(@NotNull PAIDataVo paiDataVo) {
        this.mPaiDataVo.postValue(paiDataVo);
    }

    public final void setPaiGoal(@NotNull PaiSportGoalResult paiProgressGoal) {
        this.mPaiGoalResult.postValue(paiProgressGoal);
    }
}
