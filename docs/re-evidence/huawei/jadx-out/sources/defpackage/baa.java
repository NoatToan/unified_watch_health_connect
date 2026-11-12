package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.android.appbundle.remote.OnBinderDiedListener;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class baa implements OnBinderDiedListener {
    static final azq e = new azq("SplitInstallService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final azj<SplitInstallServiceProxy> f872c;

    baa(Context context) {
        this(context, context.getPackageName());
    }

    private baa(Context context, String str) {
        this.f870a = context;
        this.f871b = str;
        Intent intent = new Intent("com.huawei.android.appbundle.splitinstall.BIND_SPLIT_INSTALL_SERVICE");
        intent.setPackage(str);
        azj<SplitInstallServiceProxy> azjVar = new azj<>(context.getApplicationContext(), e, "SplitInstallService", intent, bad.f877b);
        this.f872c = azjVar;
        azjVar.e(this);
    }

    Task<Integer> d(List<String> list) {
        e.d("startInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f872c.c(new bai(this, taskCompletionSource, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    Task<Void> b(List<String> list) {
        e.d("deferredInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f872c.c(new azt(this, taskCompletionSource, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    Task<Void> c(List<String> list) {
        e.d("deferredUninstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f872c.c(new azv(this, taskCompletionSource, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    Task<InstallSessionState> b(int i) {
        e.d("getSessionState(%d)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f872c.c(new azu(this, taskCompletionSource, i, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    Task<List<InstallSessionState>> d() {
        e.d("getSessionStates", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f872c.c(new azw(this, taskCompletionSource, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    Task<Void> d(int i) {
        e.d("cancelInstall(%d)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f872c.c(new azo(this, taskCompletionSource, i, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    static List<Bundle> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10010);
        return bundle;
    }

    @Override // com.huawei.android.appbundle.remote.OnBinderDiedListener
    public void onBinderDied() {
        e.d("onBinderDied", new Object[0]);
        Intent intent = new Intent();
        intent.setPackage(this.f871b);
        intent.setAction("com.huawei.android.appbundle.splitinstall.receiver.SplitInstallUpdateIntentService");
        intent.putExtra("session_state", e());
        intent.addFlags(1073741824);
        intent.addFlags(2097152);
        this.f870a.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    private Bundle e() {
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", -1);
        bundle.putInt("status", 6);
        bundle.putInt("error_code", -9);
        bundle.putStringArrayList("module_names", arrayList);
        bundle.putStringArrayList("download_module_names", arrayList);
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return bundle;
    }
}
