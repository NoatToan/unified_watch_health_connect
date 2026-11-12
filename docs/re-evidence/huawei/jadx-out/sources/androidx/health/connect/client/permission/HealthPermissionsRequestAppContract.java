package androidx.health.connect.client.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.PermissionProto;
import androidx.health.platform.client.service.HealthDataServiceConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.yzp;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zdz;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/permission/HealthPermissionsRequestAppContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "providerPackageName", "<init>", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "input", "parseResult", "resultCode", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthPermissionsRequestAppContract extends ActivityResultContract<Set<? extends String>, Set<? extends String>> {
    private final String providerPackageName;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        return createIntent2(context, (Set<String>) set);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Set<? extends String>> getSynchronousResult(Context context, Set<? extends String> set) {
        return getSynchronousResult2(context, (Set<String>) set);
    }

    public /* synthetic */ HealthPermissionsRequestAppContract(String str, int i, zcm zcmVar) {
        this((i & 1) != 0 ? "com.google.android.apps.healthdata" : str);
    }

    public HealthPermissionsRequestAppContract(String str) {
        zcp.c(str, "");
        this.providerPackageName = str;
    }

    /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
    public Intent createIntent2(Context context, Set<String> input) {
        zcp.c(context, "");
        zcp.c(input, "");
        ArrayList<? extends Parcelable> arrayList = (ArrayList) zdz.b(zdz.d(yzp.a((Iterable) input), new Function1<String, Permission>() { // from class: androidx.health.connect.client.permission.HealthPermissionsRequestAppContract$createIntent$protoPermissionList$1
            @Override // kotlin.jvm.functions.Function1
            public final Permission invoke(String str) {
                zcp.c(str, "");
                PermissionProto.Permission permissionBuild = PermissionProto.Permission.newBuilder().setPermission(str).build();
                zcp.b((Object) permissionBuild, "");
                return new Permission(permissionBuild);
            }
        }), new ArrayList());
        Logger.debug("HealthConnectClient", "Requesting " + input.size() + " permissions.");
        Intent intent = new Intent(HealthDataServiceConstants.ACTION_REQUEST_PERMISSIONS);
        intent.putParcelableArrayListExtra(HealthDataServiceConstants.KEY_REQUESTED_PERMISSIONS_STRING, arrayList);
        if (this.providerPackageName.length() > 0) {
            intent.setPackage(this.providerPackageName);
        }
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Set<? extends String> parseResult(int resultCode, Intent intent) {
        Set<? extends String> setD;
        ArrayList parcelableArrayListExtra;
        Sequence sequenceA;
        Sequence sequenceD;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra(HealthDataServiceConstants.KEY_GRANTED_PERMISSIONS_STRING)) == null || (sequenceA = yzp.a((Iterable) parcelableArrayListExtra)) == null || (sequenceD = zdz.d(sequenceA, new Function1<Permission, String>() { // from class: androidx.health.connect.client.permission.HealthPermissionsRequestAppContract$parseResult$grantedPermissions$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(Permission permission) {
                return permission.getProto().getPermission();
            }
        })) == null || (setD = zdz.f(sequenceD)) == null) {
            setD = zaj.d();
        }
        Logger.debug("HealthConnectClient", "Granted " + setD.size() + " permissions.");
        return setD;
    }

    /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
    public ActivityResultContract.SynchronousResult<Set<String>> getSynchronousResult2(Context context, Set<String> input) {
        zcp.c(context, "");
        zcp.c(input, "");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthPermissionsRequestAppContract() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
