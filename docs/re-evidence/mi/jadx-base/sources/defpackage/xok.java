package defpackage;

import android.provider.Settings;
import com.permissionx.guolindev.request.BaseTask;
import com.permissionx.guolindev.request.PermissionBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class xok extends BaseTask {
    public xok(PermissionBuilder permissionBuilder) {
        super(permissionBuilder);
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void request() {
        if (!this.pb.shouldRequestSystemAlertWindowPermission()) {
            finish();
            return;
        }
        if (this.pb.getTargetSdkVersion() < 23) {
            this.pb.grantedPermissions.add("android.permission.SYSTEM_ALERT_WINDOW");
            this.pb.specialPermissions.remove("android.permission.SYSTEM_ALERT_WINDOW");
            finish();
        } else {
            if (Settings.canDrawOverlays(this.pb.activity)) {
                finish();
                return;
            }
            this.pb.getClass();
            this.pb.getClass();
            finish();
        }
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void requestAgain(List<String> list) {
        this.pb.requestSystemAlertWindowPermissionNow(this);
    }
}
