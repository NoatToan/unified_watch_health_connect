package androidx.health.connect.client.permission.platform;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J,\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/health/connect/client/permission/platform/HealthPermissionsRequestModuleContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "<init>", "()V", "requestPermissions", "Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "createIntent", "Landroid/content/Intent;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "input", "parseResult", "resultCode", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthPermissionsRequestModuleContract extends ActivityResultContract<Set<? extends String>, Set<? extends String>> {
    private final ActivityResultContracts.RequestMultiplePermissions requestPermissions = new ActivityResultContracts.RequestMultiplePermissions();

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        return createIntent2(context, (Set<String>) set);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Set<? extends String>> getSynchronousResult(Context context, Set<? extends String> set) {
        return getSynchronousResult2(context, (Set<String>) set);
    }

    /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
    public Intent createIntent2(Context context, Set<String> input) {
        zcp.c(context, "");
        zcp.c(input, "");
        Intent intentCreateIntent = this.requestPermissions.createIntent(context, (String[]) input.toArray(new String[0]));
        zcp.b((Object) intentCreateIntent, "");
        return intentCreateIntent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Set<? extends String> parseResult(int resultCode, Intent intent) {
        Map<String, Boolean> result = this.requestPermissions.parseResult(resultCode, intent);
        zcp.b((Object) result, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : result.entrySet()) {
            Boolean value = entry.getValue();
            zcp.e(value);
            if (value.booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
    public ActivityResultContract.SynchronousResult<Set<String>> getSynchronousResult2(Context context, Set<String> input) {
        zcp.c(context, "");
        zcp.c(input, "");
        ActivityResultContract.SynchronousResult<Map<String, Boolean>> synchronousResult = this.requestPermissions.getSynchronousResult(context, (String[]) input.toArray(new String[0]));
        if (synchronousResult == null) {
            return null;
        }
        Map<String, Boolean> value = synchronousResult.getValue();
        zcp.b((Object) value, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : value.entrySet()) {
            Boolean value2 = entry.getValue();
            zcp.e(value2);
            if (value2.booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new ActivityResultContract.SynchronousResult<>(linkedHashMap.keySet());
    }
}
