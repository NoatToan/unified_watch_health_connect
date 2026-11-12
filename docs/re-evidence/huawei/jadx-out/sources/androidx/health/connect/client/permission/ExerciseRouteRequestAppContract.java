package androidx.health.connect.client.permission;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.health.platform.client.service.HealthDataServiceConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/permission/ExerciseRouteRequestAppContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroidx/health/connect/client/records/ExerciseRoute;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "input", "parseResult", "resultCode", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseRouteRequestAppContract extends ActivityResultContract<String, ExerciseRoute> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, String input) {
        zcp.c(context, "");
        zcp.c(input, "");
        Intent intent = new Intent(HealthDataServiceConstants.ACTION_REQUEST_ROUTE);
        intent.putExtra(HealthDataServiceConstants.EXTRA_SESSION_ID, input);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public ExerciseRoute parseResult(int resultCode, Intent intent) {
        androidx.health.platform.client.exerciseroute.ExerciseRoute exerciseRoute = intent != null ? (androidx.health.platform.client.exerciseroute.ExerciseRoute) intent.getParcelableExtra(HealthDataServiceConstants.EXTRA_EXERCISE_ROUTE) : null;
        if (exerciseRoute == null) {
            Logger.debug("HealthConnectClient", "No route returned.");
            return null;
        }
        Logger.debug("HealthConnectClient", "Returned a route.");
        return ProtoToRecordConvertersKt.toExerciseRouteData(exerciseRoute);
    }
}
