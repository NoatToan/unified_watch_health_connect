package androidx.health.connect.client.permission.platform;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.p004activity.result.contract.ActivityResultContract;
import defpackage.qg8;
import defpackage.sg8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(34)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/permission/platform/ExerciseRouteRequestModuleContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroidx/health/connect/client/records/ExerciseRoute;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ExerciseRouteRequestModuleContract extends ActivityResultContract<String, ExerciseRoute> {
    @Override // androidx.p004activity.result.contract.ActivityResultContract
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull String input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent("android.health.connect.action.REQUEST_EXERCISE_ROUTE");
        intent.putExtra("android.health.connect.extra.SESSION_ID", input);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.p004activity.result.contract.ActivityResultContract
    @Nullable
    public ExerciseRoute parseResult(int resultCode, @Nullable Intent intent) {
        android.health.connect.datatypes.ExerciseRoute exerciseRouteA = intent != null ? sg8.a(intent.getParcelableExtra("android.health.connect.extra.EXERCISE_ROUTE", qg8.a())) : null;
        if (exerciseRouteA == null) {
            Logger.debug("HealthConnectClient", "No route returned.");
            return null;
        }
        Logger.debug("HealthConnectClient", "Returned a route.");
        return RecordConvertersKt.toSdkExerciseRoute(exerciseRouteA);
    }
}
