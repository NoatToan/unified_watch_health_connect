package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class j8s implements vgt {
    public static final pbt g = new pbt("AssetPackServiceImpl");
    public static final Intent h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihs f22540b;
    public final xns c;
    public fht d;
    public fht e;
    public final AtomicBoolean f = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r10v2, types: [h4s] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h4s] */
    public j8s(Context context, ihs ihsVar, xns xnsVar) {
        this.f22539a = context.getPackageName();
        this.f22540b = ihsVar;
        this.c = xnsVar;
        if (t5s.b(context)) {
            Context contextA = i5s.a(context);
            pbt pbtVar = g;
            Intent intent = h;
            this.d = new fht(contextA, pbtVar, "AssetPackService", intent, new Object() { // from class: h4s
            }, null);
            this.e = new fht(i5s.a(context), pbtVar, "AssetPackService-keepAlive", intent, new Object() { // from class: h4s
            }, null);
        }
        g.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 20202);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static Bundle h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(OneTrack.Param.SESSION_ID, i);
        return bundle;
    }

    public static Task i() {
        g.b("onError(%d)", -11);
        return Tasks.forException(new AssetPackException(-11));
    }

    public static /* bridge */ /* synthetic */ Bundle k(int i, String str, String str2, int i2) {
        Bundle bundleX = x(i, str);
        bundleX.putString("slice_id", str2);
        bundleX.putInt("chunk_number", i2);
        return bundleX;
    }

    public static /* bridge */ /* synthetic */ Bundle n(Map map) {
        Bundle bundleG = g();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleG.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleG;
    }

    public static /* bridge */ /* synthetic */ ArrayList t(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List u(j8s j8sVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = vk1.a((Bundle) it.next(), j8sVar.f22540b, j8sVar.c).c().values().iterator().next();
            if (next == null) {
                g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (rbs.a(next.h())) {
                arrayList.add(next.g());
            }
        }
        return arrayList;
    }

    public static Bundle x(int i, String str) {
        Bundle bundleH = h(i);
        bundleH.putString("module_name", str);
        return bundleH;
    }

    @Override // defpackage.vgt
    public final void a(int i) {
        if (this.d == null) {
            throw new ugs("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.d("notifySessionFailed", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.s(new s5s(this, taskCompletionSource, i, taskCompletionSource), taskCompletionSource);
    }

    @Override // defpackage.vgt
    public final void b(int i, String str) {
        j(i, str, 10);
    }

    @Override // defpackage.vgt
    public final Task c(int i, String str, String str2, int i2) {
        if (this.d == null) {
            return i();
        }
        g.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.s(new x5s(this, taskCompletionSource, i, str, str2, i2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.vgt
    public final Task d(Map map) {
        if (this.d == null) {
            return i();
        }
        g.d("syncPacks", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.s(new t4s(this, taskCompletionSource, map, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.vgt
    public final void e(List list) {
        if (this.d == null) {
            return;
        }
        g.d("cancelDownloads(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.s(new q4s(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
    }

    @Override // defpackage.vgt
    public final synchronized void f() {
        if (this.e == null) {
            g.e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        pbt pbtVar = g;
        pbtVar.d("keepAlive", new Object[0]);
        if (!this.f.compareAndSet(false, true)) {
            pbtVar.d("Service is already kept alive.", new Object[0]);
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.e.s(new b6s(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        }
    }

    public final void j(int i, String str, int i2) {
        if (this.d == null) {
            throw new ugs("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.d("notifyModuleCompleted", new Object[0]);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.s(new n5s(this, taskCompletionSource, i, str, taskCompletionSource, i2), taskCompletionSource);
    }

    @Override // defpackage.vgt
    public final void f(int i, String str, String str2, int i2) {
        if (this.d != null) {
            g.d("notifyChunkTransferred", new Object[0]);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.d.s(new h5s(this, taskCompletionSource, i, str, str2, i2, taskCompletionSource), taskCompletionSource);
            return;
        }
        throw new ugs("The Play Store app is not installed or is an unofficial version.", i);
    }
}
