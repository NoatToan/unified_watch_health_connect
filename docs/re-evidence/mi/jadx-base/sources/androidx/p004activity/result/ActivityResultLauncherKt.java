package androidx.p004activity.result;

import defpackage.hn0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "Lhn0;", "options", "", "launch", "(Landroidx/activity/result/ActivityResultLauncher;Lhn0;)V", "launchUnit", "activity-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class ActivityResultLauncherKt {
    public static final void launch(@NotNull ActivityResultLauncher<Void> activityResultLauncher, @Nullable hn0 hn0Var) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<this>");
        activityResultLauncher.launch(null, hn0Var);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, hn0 hn0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            hn0Var = null;
        }
        launch(activityResultLauncher, hn0Var);
    }

    @JvmName(name = "launchUnit")
    public static final void launchUnit(@NotNull ActivityResultLauncher<Unit> activityResultLauncher, @Nullable hn0 hn0Var) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "<this>");
        activityResultLauncher.launch(Unit.INSTANCE, hn0Var);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, hn0 hn0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            hn0Var = null;
        }
        launchUnit(activityResultLauncher, hn0Var);
    }
}
