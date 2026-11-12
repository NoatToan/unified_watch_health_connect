package androidx.health.connect.client.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.proto.u0;
import androidx.p004activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J,\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/health/connect/client/permission/HealthPermissionsRequestAppContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "providerPackageName", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class HealthPermissionsRequestAppContract extends ActivityResultContract<Set<? extends String>, Set<? extends String>> {

    @NotNull
    private final String providerPackageName;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthPermissionsRequestAppContract() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.p004activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ Intent createIntent(Context context, Set<? extends String> set) {
        return createIntent2(context, (Set<String>) set);
    }

    @Nullable
    /* JADX INFO: renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
    public ActivityResultContract.SynchronousResult<Set<String>> getSynchronousResult2(@NotNull Context context, @NotNull Set<String> input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    public /* synthetic */ HealthPermissionsRequestAppContract(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "com.google.android.apps.healthdata" : str);
    }

    @NotNull
    /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
    public Intent createIntent2(@NotNull Context context, @NotNull Set<String> input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        ArrayList<? extends Parcelable> arrayList = (ArrayList) SequencesKt___SequencesKt.toCollection(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(input), new Function1<String, Permission>() { // from class: androidx.health.connect.client.permission.HealthPermissionsRequestAppContract$createIntent$protoPermissionList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Permission invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0VarBuild = u0.V().A(it).build();
                Intrinsics.checkNotNullExpressionValue(u0VarBuild, "newBuilder().setPermission(it).build()");
                return new Permission(u0VarBuild);
            }
        }), new ArrayList());
        Logger.debug("HealthConnectClient", "Requesting " + input.size() + " permissions.");
        Intent intent = new Intent("androidx.health.ACTION_REQUEST_PERMISSIONS");
        intent.putParcelableArrayListExtra("requested_permissions_string", arrayList);
        if (this.providerPackageName.length() > 0) {
            intent.setPackage(this.providerPackageName);
        }
        return intent;
    }

    @Override // androidx.p004activity.result.contract.ActivityResultContract
    public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Set<? extends String>> getSynchronousResult(Context context, Set<? extends String> set) {
        return getSynchronousResult2(context, (Set<String>) set);
    }

    @Override // androidx.p004activity.result.contract.ActivityResultContract
    @NotNull
    public Set<? extends String> parseResult(int resultCode, @Nullable Intent intent) {
        Set<? extends String> setEmptySet;
        ArrayList parcelableArrayListExtra;
        Sequence sequenceAsSequence;
        Sequence map;
        if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("granted_permissions_string")) == null || (sequenceAsSequence = CollectionsKt___CollectionsKt.asSequence(parcelableArrayListExtra)) == null || (map = SequencesKt___SequencesKt.map(sequenceAsSequence, new Function1<Permission, String>() { // from class: androidx.health.connect.client.permission.HealthPermissionsRequestAppContract$parseResult$grantedPermissions$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String invoke2(Permission permission) {
                return permission.getProto().U();
            }
        })) == null || (setEmptySet = SequencesKt___SequencesKt.toSet(map)) == null) {
            setEmptySet = SetsKt__SetsKt.emptySet();
        }
        Logger.debug("HealthConnectClient", "Granted " + setEmptySet.size() + " permissions.");
        return setEmptySet;
    }

    public HealthPermissionsRequestAppContract(@NotNull String providerPackageName) {
        Intrinsics.checkNotNullParameter(providerPackageName, "providerPackageName");
        this.providerPackageName = providerPackageName;
    }
}
