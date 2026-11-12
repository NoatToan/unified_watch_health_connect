package com.huami.bloodpressure_ui.analyse;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodpressure_ui/analyse/AnalyseViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/huami/bloodpressure_ui/analyse/AnalyseItemEntity;", "list", "", "setList", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "_currentList", "b", "getCurrentList", "()Landroidx/lifecycle/MutableLiveData;", "currentList", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<AnalyseItemEntity>> _currentList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<AnalyseItemEntity>> currentList;

    public AnalyseViewModel() {
        MutableLiveData<List<AnalyseItemEntity>> mutableLiveData = new MutableLiveData<>();
        this._currentList = mutableLiveData;
        this.currentList = mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<List<AnalyseItemEntity>> getCurrentList() {
        return this.currentList;
    }

    public final void setList(@NotNull List<AnalyseItemEntity> list) {
        this._currentList.postValue(list);
    }
}
