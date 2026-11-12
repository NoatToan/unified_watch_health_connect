package defpackage;

import com.permissionx.guolindev.request.BaseTask;
import com.permissionx.guolindev.request.PermissionBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class tok extends BaseTask {
    public tok(PermissionBuilder permissionBuilder) {
        super(permissionBuilder);
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void request() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.pb.normalPermissions) {
            if (psh.c(this.pb.activity, str)) {
                this.pb.grantedPermissions.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            finish();
            return;
        }
        PermissionBuilder permissionBuilder = this.pb;
        if (permissionBuilder.explainReasonBeforeRequest) {
            permissionBuilder.getClass();
            this.pb.getClass();
        }
        PermissionBuilder permissionBuilder2 = this.pb;
        permissionBuilder2.requestNow(permissionBuilder2.normalPermissions, this);
    }

    @Override // com.permissionx.guolindev.request.BaseTask, defpackage.bt3
    public void requestAgain(List<String> list) {
        HashSet hashSet = new HashSet(this.pb.grantedPermissions);
        hashSet.addAll(list);
        this.pb.requestNow(hashSet, this);
    }
}
