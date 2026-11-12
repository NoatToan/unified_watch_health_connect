package com.xiaomi.fitness.sport.interfaces;

import android.os.Bundle;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/interfaces/ILifecycle;", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "onSaveInstanceState", "outState", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ILifecycle {
    void onCreate(@Nullable Bundle savedInstanceState);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(@NotNull Bundle outState);

    void onStart();

    void onStop();
}
