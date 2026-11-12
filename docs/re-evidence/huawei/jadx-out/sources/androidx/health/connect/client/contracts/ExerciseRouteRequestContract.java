package androidx.health.connect.client.contracts;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.health.connect.client.permission.ExerciseRouteRequestAppContract;
import androidx.health.connect.client.permission.platform.ExerciseRouteRequestModuleContract;
import androidx.health.connect.client.records.ExerciseRoute;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/contracts/ExerciseRouteRequestContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroidx/health/connect/client/records/ExerciseRoute;", "<init>", "()V", "delegate", "createIntent", "Landroid/content/Intent;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "input", "parseResult", "resultCode", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExerciseRouteRequestContract extends ActivityResultContract<String, ExerciseRoute> {
    private final ActivityResultContract<String, ExerciseRoute> delegate;

    public ExerciseRouteRequestContract() {
        ExerciseRouteRequestAppContract exerciseRouteRequestAppContract;
        if (Build.VERSION.SDK_INT >= 34) {
            exerciseRouteRequestAppContract = new ExerciseRouteRequestModuleContract();
        } else {
            exerciseRouteRequestAppContract = new ExerciseRouteRequestAppContract();
        }
        this.delegate = exerciseRouteRequestAppContract;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, String input) {
        zcp.c(context, "");
        zcp.c(input, "");
        if (input.length() <= 0) {
            throw new IllegalArgumentException("Session identifier can't be empty".toString());
        }
        Intent intentCreateIntent = this.delegate.createIntent(context, input);
        zcp.b((Object) intentCreateIntent, "");
        return intentCreateIntent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public ExerciseRoute parseResult(int resultCode, Intent intent) {
        return this.delegate.parseResult(resultCode, intent);
    }
}
