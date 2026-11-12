package defpackage;

import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.wearengine.auth.AuthCallback;
import com.huawei.wearengine.auth.AuthListener;
import com.huawei.wearengine.auth.Permission;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes46.dex */
public class yhy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile yhy f53350c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yhz f53351a = yhz.e();

    private yhy() {
    }

    public static yhy c() {
        if (f53350c == null) {
            synchronized (yhy.class) {
                if (f53350c == null) {
                    f53350c = new yhy();
                }
            }
        }
        return f53350c;
    }

    public Task<Void> d(final AuthCallback authCallback, final Permission... permissionArr) {
        final AuthListener.Stub stub = new AuthListener.Stub() { // from class: yhy.1
            @Override // com.huawei.wearengine.auth.AuthListener
            public void onOk(Permission[] permissionArr2) {
                authCallback.onOk(permissionArr2);
            }

            @Override // com.huawei.wearengine.auth.AuthListener
            public void onCancel() {
                authCallback.onCancel();
            }
        };
        return Tasks.callInBackground(new Callable<Void>() { // from class: yhy.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                yir.d(authCallback, "AuthCallback can not be null!");
                yir.d(permissionArr, "Permissions can not be null!");
                if (permissionArr.length <= 6) {
                    int iC = yhy.this.f53351a.c(stub, permissionArr);
                    if (iC == 0) {
                        return null;
                    }
                    throw new yib(iC);
                }
                throw new yib(5);
            }
        });
    }

    public Task<Boolean> b(final Permission permission) {
        return Tasks.callInBackground(new Callable<Boolean>() { // from class: yhy.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                yir.d(permission, "Permission can not be null!");
                return Boolean.valueOf(yhy.this.f53351a.a(permission));
            }
        });
    }
}
