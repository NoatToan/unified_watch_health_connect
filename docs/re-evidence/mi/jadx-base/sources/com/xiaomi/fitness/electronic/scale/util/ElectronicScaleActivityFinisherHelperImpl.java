package com.xiaomi.fitness.electronic.scale.util;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ElectronicScaleActivityFinisherHelperImpl;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleActivityFinishHelper;", "<init>", "()V", "TAG", "", "activities", "Ljava/util/Stack;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "add", "", LifecycleConstantKt.TYPE_ACTIVITY, "remove", "finish", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleActivityFinisherHelperImpl implements ElectronicScaleActivityFinishHelper {

    @NotNull
    private final String TAG = "ElectronicScaleActivityFinisherHelperImpl";

    @NotNull
    private final Stack<WeakReference<Activity>> activities = new Stack<>();

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper
    public void add(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activities.push(new WeakReference<>(activity));
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper
    public void finish() {
        Iterator<WeakReference<Activity>> it = this.activities.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity != null) {
                activity.finish();
            }
        }
        this.activities.clear();
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper
    public void remove(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<WeakReference<Activity>> it = this.activities.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        WeakReference<Activity> weakReference = null;
        while (it.hasNext()) {
            WeakReference<Activity> next = it.next();
            if (Intrinsics.areEqual(activity, next.get())) {
                weakReference = next;
            }
        }
        this.activities.remove(weakReference);
    }
}
