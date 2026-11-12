package defpackage;

import android.os.Build;
import com.permissionx.guolindev.request.BaseTask;
import com.permissionx.guolindev.request.PermissionBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ank extends BaseTask {
    public ank(PermissionBuilder permissionBuilder) {
        super(permissionBuilder);
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void request() {
        if (this.pb.shouldRequestBackgroundLocationPermission()) {
            if (Build.VERSION.SDK_INT < 29) {
                this.pb.specialPermissions.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.pb.permissionsWontRequest.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            if (psh.c(this.pb.activity, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                finish();
                return;
            }
            boolean zC = psh.c(this.pb.activity, "android.permission.ACCESS_FINE_LOCATION");
            boolean zC2 = psh.c(this.pb.activity, "android.permission.ACCESS_COARSE_LOCATION");
            if (zC || zC2) {
                this.pb.getClass();
                this.pb.getClass();
                requestAgain(null);
                return;
            }
        }
        finish();
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void requestAgain(List<String> list) {
        this.pb.requestAccessBackgroundLocationNow(this);
    }
}
