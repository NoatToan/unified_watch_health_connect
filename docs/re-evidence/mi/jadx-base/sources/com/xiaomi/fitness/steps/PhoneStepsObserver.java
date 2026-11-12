package com.xiaomi.fitness.steps;

import android.database.ContentObserver;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/steps/PhoneStepsObserver;", "Landroid/database/ContentObserver;", "<init>", "()V", "mObserver", "Lkotlin/Function0;", "", "onChange", "selfChange", "", "setObserver", "observer", "steps_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneStepsObserver extends ContentObserver {

    @Nullable
    private Function0<Unit> mObserver;

    public PhoneStepsObserver() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
        Logger.w("MiuiStepProvider", "onChange: StepProvider receive steps");
        Function0<Unit> function0 = this.mObserver;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setObserver(@NotNull Function0<Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mObserver = observer;
    }
}
