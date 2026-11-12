package com.huami.pai.ui.history;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.pai.vo.PAIDataVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R!\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/pai/ui/history/PAIHistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "", "dateStr", "Lcom/huami/pai/vo/PAIDataVo;", "data", "", "setSelectData", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getCurrentSelectData", "()Landroidx/lifecycle/MutableLiveData;", "currentSelectData", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PAIHistoryViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PAIDataVo> currentSelectData = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<PAIDataVo> getCurrentSelectData() {
        return this.currentSelectData;
    }

    public final void setSelectData(@NotNull String dateStr, @Nullable PAIDataVo data) {
        this.currentSelectData.postValue(data == null ? new PAIDataVo(dateStr, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0L, 0, 0, 0L, 0, null, null, null, null, null, false, 2147483646, null) : data);
    }
}
