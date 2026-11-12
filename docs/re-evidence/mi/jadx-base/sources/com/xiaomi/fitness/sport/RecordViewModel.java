package com.xiaomi.fitness.sport;

import android.os.Bundle;
import coil.request.Disposable;
import com.xiaomi.fitness.baseui.AbsViewModel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/RecordViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "reqRecordTask", "Lcoil/request/Disposable;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "onCleared", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordViewModel extends AbsViewModel {

    @Nullable
    private Disposable reqRecordTask;

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.reqRecordTask;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
