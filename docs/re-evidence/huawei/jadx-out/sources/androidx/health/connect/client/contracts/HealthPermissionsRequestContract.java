package androidx.health.connect.client.contracts;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.permission.HealthPermissionsRequestAppContract;
import androidx.health.connect.client.permission.platform.HealthPermissionsRequestModuleContract;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zes;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R&\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/health/connect/client/contracts/HealthPermissionsRequestContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "providerPackageName", "<init>", "(Ljava/lang/String;)V", "delegate", "createIntent", "Landroid/content/Intent;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "input", "parseResult", "resultCode", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthPermissionsRequestContract extends ActivityResultContract<Set<? extends String>, Set<? extends String>> {
    private final ActivityResultContract<Set<String>, Set<String>> delegate;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        return createIntent2(context, (Set<String>) set);
    }

    public /* synthetic */ HealthPermissionsRequestContract(String str, int i, zcm zcmVar) {
        this((i & 1) != 0 ? "com.google.android.apps.healthdata" : str);
    }

    public HealthPermissionsRequestContract(String str) {
        HealthPermissionsRequestAppContract healthPermissionsRequestAppContract;
        zcp.c(str, "");
        if (Build.VERSION.SDK_INT >= 34) {
            healthPermissionsRequestAppContract = new HealthPermissionsRequestModuleContract();
        } else {
            healthPermissionsRequestAppContract = new HealthPermissionsRequestAppContract(str);
        }
        this.delegate = healthPermissionsRequestAppContract;
    }

    /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
    public Intent createIntent2(Context context, Set<String> input) {
        zcp.c(context, "");
        zcp.c(input, "");
        Set<String> set = input;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (!zes.e((String) it.next(), HealthPermission.PERMISSION_PREFIX, false, 2, (Object) null)) {
                    throw new IllegalArgumentException("Unsupported health connect permission".toString());
                }
            }
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("At least one permission is required!".toString());
        }
        Intent intentCreateIntent = this.delegate.createIntent(context, input);
        zcp.b((Object) intentCreateIntent, "");
        return intentCreateIntent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Set<? extends String> parseResult(int resultCode, Intent intent) {
        Set<String> result = this.delegate.parseResult(resultCode, intent);
        zcp.b((Object) result, "");
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthPermissionsRequestContract() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
