package com.xiaomi.hm.health.device;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/PasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/device/PasswordStage;", "passwordStage", "", "setPasswordStatus", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getStageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "stageLiveData", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PasswordViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PasswordStage> stageLiveData;

    public PasswordViewModel() {
        MutableLiveData<PasswordStage> mutableLiveData = new MutableLiveData<>();
        this.stageLiveData = mutableLiveData;
        mutableLiveData.setValue(PasswordStage.ENTER);
    }

    @NotNull
    public final MutableLiveData<PasswordStage> getStageLiveData() {
        return this.stageLiveData;
    }

    public final void setPasswordStatus(@NotNull PasswordStage passwordStage) {
        this.stageLiveData.setValue(passwordStage);
    }
}
