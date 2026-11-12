package com.xiaomi.fitness.trail.viewmodel;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.trail.model.ChooseSportTypeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/trail/viewmodel/ChooseSportTypeViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/trail/model/ChooseSportTypeModel;", "<init>", "()V", "chooseSportTypeModel", "getChooseSportTypeModel", "()Lcom/xiaomi/fitness/trail/model/ChooseSportTypeModel;", "setChooseSportTypeModel", "(Lcom/xiaomi/fitness/trail/model/ChooseSportTypeModel;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChooseSportTypeViewModel extends BaseViewModel<ChooseSportTypeModel> {

    @NotNull
    private ChooseSportTypeModel chooseSportTypeModel = new ChooseSportTypeModel();

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    @NotNull
    public final ChooseSportTypeModel getChooseSportTypeModel() {
        return this.chooseSportTypeModel;
    }

    public final void setChooseSportTypeModel(@NotNull ChooseSportTypeModel chooseSportTypeModel) {
        Intrinsics.checkNotNullParameter(chooseSportTypeModel, "<set-?>");
        this.chooseSportTypeModel = chooseSportTypeModel;
    }
}
