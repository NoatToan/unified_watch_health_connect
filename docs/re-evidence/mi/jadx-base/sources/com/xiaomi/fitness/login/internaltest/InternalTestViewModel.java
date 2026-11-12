package com.xiaomi.fitness.login.internaltest;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.login.internaltest.InternalTestViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/login/internaltest/InternalTestViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "resultLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "resultLiveData$delegate", "Lkotlin/Lazy;", "checkWhiteList", "", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalTestViewModel extends BaseViewModel<BaseModel> {

    /* JADX INFO: renamed from: resultLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kfd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InternalTestViewModel.resultLiveData_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData resultLiveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    public final void checkWhiteList() {
    }

    @NotNull
    public final MutableLiveData<Boolean> getResultLiveData() {
        return (MutableLiveData) this.resultLiveData.getValue();
    }
}
