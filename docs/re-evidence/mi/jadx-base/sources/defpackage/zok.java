package defpackage;

import android.provider.Settings;
import com.permissionx.guolindev.request.BaseTask;
import com.permissionx.guolindev.request.PermissionBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class zok extends BaseTask {
    public zok(PermissionBuilder permissionBuilder) {
        super(permissionBuilder);
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void request() {
        if (!this.pb.shouldRequestWriteSettingsPermission()) {
            finish();
            return;
        }
        if (this.pb.getTargetSdkVersion() < 23) {
            this.pb.grantedPermissions.add("android.permission.WRITE_SETTINGS");
            this.pb.specialPermissions.remove("android.permission.WRITE_SETTINGS");
            finish();
        } else {
            if (Settings.System.canWrite(this.pb.activity)) {
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
        this.pb.requestWriteSettingsPermissionNow(this);
    }
}
