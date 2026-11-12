package defpackage;

import android.os.Build;
import android.os.Environment;
import com.permissionx.guolindev.request.BaseTask;
import com.permissionx.guolindev.request.PermissionBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class qok extends BaseTask {
    public qok(PermissionBuilder permissionBuilder) {
        super(permissionBuilder);
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void request() {
        if (!this.pb.shouldRequestManageExternalStoragePermission() || Build.VERSION.SDK_INT < 30) {
            finish();
        } else {
            if (Environment.isExternalStorageManager()) {
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
        this.pb.requestManageExternalStoragePermissionNow(this);
    }
}
