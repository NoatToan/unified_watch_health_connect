package com.huami.utils.easypermission.manager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Size;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.huami.utils.easypermission.R;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J%\u0010\u000b\u001a\u00020\u00062\u0014\b\u0001\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J/\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0015R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001d¨\u0006)"}, d2 = {"Lcom/huami/utils/easypermission/manager/PermissionManagerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/utils/easypermission/EasyPermissions$PermissionCallbacks;", "", "g", "f", "", PointCategory.PERMISSION, GoogleApiAvailabilityLight.a, "", "permissions", "e", "([Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "", "perms", "onPermissionsDenied", "onPermissionsGranted", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "Lcom/huami/utils/easypermission/manager/PermissionEntry;", "a", "Ljava/util/List;", "permissionList", "Lcom/huami/utils/easypermission/manager/PermissionManagerAdapter;", "b", "Lcom/huami/utils/easypermission/manager/PermissionManagerAdapter;", "permissionAdapter", "", "Lcom/huami/utils/easypermission/manager/AppPermission;", "c", "appPermissions", "<init>", "()V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionManagerActivity extends AppCompatActivity implements EasyPermissions.PermissionCallbacks {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private PermissionManagerAdapter permissionAdapter;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<PermissionEntry> permissionList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<AppPermission> appPermissions = CollectionsKt__CollectionsKt.emptyList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ AppPermission b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AppPermission appPermission) {
            super(0);
            this.b = appPermission;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PermissionManagerActivity.this.d(this.b.getPermission());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String permission) {
        EasyPermissions.directRequestPermissions(this, 123, permission);
    }

    private final String e(@Size(min = 1) String... permissions) {
        return EasyPermissions.hasPermissions(this, (String[]) Arrays.copyOf(permissions, permissions.length)) ? getString(R.string.easypermission_authorized) : getString(R.string.easypermission_unauthorized);
    }

    private final void f() {
        IPermissionConfig mConfig = PermissionConfigManager.INSTANCE.getMConfig();
        if (mConfig != null) {
            this.appPermissions = mConfig.getAppPermissions();
        }
        List<PermissionEntry> list = this.permissionList;
        List<AppPermission> list2 = this.appPermissions;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AppPermission appPermission : list2) {
            arrayList.add(new PermissionEntry(appPermission.getTitle(), appPermission.getDesc(), e(appPermission.getPermission()), new a(appPermission)));
        }
        list.addAll(arrayList);
    }

    private final void g() {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, getPackageName(), null));
        data.addFlags(536870912);
        startActivityForResult(data, PermissionDialogFragmentCompat.APP_SETTINGS_RC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(PermissionManagerActivity permissionManagerActivity, View view) {
        permissionManagerActivity.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easypermission_activity_permission_manager);
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: xs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionManagerActivity.h(this.a, view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        PermissionManagerAdapter permissionManagerAdapter = new PermissionManagerAdapter(this.permissionList);
        this.permissionAdapter = permissionManagerAdapter;
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(permissionManagerAdapter);
        recyclerView.addItemDecoration(new SpaceItemDecoration(recyclerView.getResources().getDimensionPixelSize(R.dimen.easypermission_item_space)));
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsDenied(int requestCode, @NotNull List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            g();
        }
    }

    @Override // com.huami.utils.easypermission.EasyPermissions.PermissionCallbacks
    public void onPermissionsGranted(int requestCode, @NotNull List<String> perms) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    @SuppressLint({"NotifyDataSetChanged"})
    public void onResume() {
        super.onResume();
        this.permissionList.clear();
        f();
        PermissionManagerAdapter permissionManagerAdapter = this.permissionAdapter;
        Objects.requireNonNull(permissionManagerAdapter);
        permissionManagerAdapter.notifyDataSetChanged();
    }
}
