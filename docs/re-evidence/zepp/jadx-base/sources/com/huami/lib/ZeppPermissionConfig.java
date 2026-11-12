package com.huami.lib;

import android.content.Context;
import android.os.Build;
import com.huami.permission.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.utils.easypermission.manager.AppPermission;
import com.huami.utils.easypermission.manager.IPermissionConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/lib/ZeppPermissionConfig;", "Lcom/huami/utils/easypermission/manager/IPermissionConfig;", "", "Lcom/huami/utils/easypermission/manager/AppPermission;", "getAppPermissions", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class ZeppPermissionConfig implements IPermissionConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public ZeppPermissionConfig(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.huami.utils.easypermission.manager.IPermissionConfig
    @NotNull
    public List<AppPermission> getAppPermissions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_title_storage), this.context.getString(R.string.permission_item_desc_storage), "", "android.permission.WRITE_EXTERNAL_STORAGE"));
        arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_title_location), this.context.getString(R.string.permission_item_location_desc_new), "", "android.permission.ACCESS_COARSE_LOCATION"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_title_recognition), this.context.getString(R.string.permission_item_desc_recognition), "", "android.permission.ACTIVITY_RECOGNITION"));
        }
        arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_title_camera), this.context.getString(R.string.permission_item_desc_camera), "", "android.permission.CAMERA"));
        arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_title_read_call_log), this.context.getString(R.string.permission_item_desc_read_call_log), "", "android.permission.READ_CALL_LOG"));
        arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_read_contacts), this.context.getString(R.string.permission_item_desc_read_contacts), "", "android.permission.READ_CONTACTS"));
        arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_title_read_phone_state), this.context.getString(R.string.permission_item_desc_read_phone_state), "", "android.permission.READ_PHONE_STATE"));
        if (i >= 31) {
            arrayList.add(new AppPermission(this.context.getString(R.string.permission_item_tiitle_bluetooth), this.context.getString(R.string.permission_item_desc_bluetooth), "", "android.permission.BLUETOOTH_CONNECT"));
        }
        return arrayList;
    }
}
