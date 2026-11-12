package miuix.appcompat.app.floatingactivity.multiapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ghi;
import defpackage.i8h;
import defpackage.mpf;
import defpackage.r3n;
import defpackage.ty9;
import defpackage.uy9;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.app.floatingactivity.FloatingActivitySwitcher;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiAppFloatingActivitySwitcher {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static MultiAppFloatingActivitySwitcher f26347k;
    public static String[] l;
    public miuix.appcompat.app.floatingactivity.multiapp.a d;
    public long e;
    public long f;
    public long g;
    public WeakReference<View> h;
    public boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f26348a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<ArrayList<ActivitySpec>> f26349b = new SparseArray<>();
    public boolean c = true;
    public final ServiceConnection j = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (MultiAppFloatingActivitySwitcher.f26347k != null) {
                MultiAppFloatingActivitySwitcher.f26347k.b0(miuix.appcompat.app.floatingactivity.multiapp.a.AbstractBinderC1023a.s2(iBinder));
                MultiAppFloatingActivitySwitcher.this.s();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (MultiAppFloatingActivitySwitcher.f26347k != null) {
                MultiAppFloatingActivitySwitcher.f26347k.g0();
                MultiAppFloatingActivitySwitcher.this.t();
                MultiAppFloatingActivitySwitcher.this.x();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivitySpec f26353a;

        public b(ActivitySpec activitySpec) {
            this.f26353a = activitySpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf = String.valueOf(this.f26353a.c.hashCode());
            Bundle bundle = new Bundle();
            bundle.putInt("key_task_id", this.f26353a.h);
            bundle.putString("execute_slide", strValueOf);
            MultiAppFloatingActivitySwitcher.this.U(10, bundle);
        }
    }

    public class c implements i8h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26356b;

        public c(AppCompatActivity appCompatActivity) {
            this.f26355a = appCompatActivity.getActivityIdentity();
            this.f26356b = appCompatActivity.getTaskId();
        }

        private boolean j(int i) {
            return !MultiAppFloatingActivitySwitcher.this.c && (i == 1 || i == 2);
        }

        @Override // defpackage.i8h
        public void a() {
            MultiAppFloatingActivitySwitcher.this.T(11);
        }

        @Override // defpackage.i8h
        public void b() {
            MultiAppFloatingActivitySwitcher.this.T(1);
        }

        @Override // defpackage.i8h
        public boolean c() {
            ArrayList arrayList = (ArrayList) MultiAppFloatingActivitySwitcher.this.f26349b.get(l());
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ActivitySpec activitySpec = (ActivitySpec) arrayList.get(i);
                    AppCompatActivity appCompatActivity = activitySpec.g;
                    if (appCompatActivity != null && activitySpec.f26350a == 0) {
                        return appCompatActivity.getActivityIdentity().equals(k());
                    }
                }
            }
            return false;
        }

        @Override // defpackage.i8h
        public void d(AppCompatActivity appCompatActivity) {
            MultiAppFloatingActivitySwitcher.this.R(appCompatActivity.getTaskId(), appCompatActivity.getActivityIdentity());
        }

        @Override // defpackage.i8h
        public boolean e() {
            return m() == 1;
        }

        @Override // defpackage.i8h
        public void f(AppCompatActivity appCompatActivity) {
            if (appCompatActivity != null) {
                try {
                    MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
                    if (multiAppFloatingActivitySwitcherC != null) {
                        multiAppFloatingActivitySwitcherC.a0(r3n.f(appCompatActivity.getFloatingBrightPanel()), appCompatActivity.getTaskId(), appCompatActivity.getActivityIdentity());
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override // defpackage.i8h
        public void g() {
            MultiAppFloatingActivitySwitcher.this.T(5);
        }

        @Override // defpackage.i8h
        public boolean h() {
            ArrayList arrayList = (ArrayList) MultiAppFloatingActivitySwitcher.this.f26349b.get(l());
            if (arrayList == null) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ActivitySpec activitySpec = (ActivitySpec) arrayList.get(i);
                if (activitySpec.f26350a == 0) {
                    return !activitySpec.j;
                }
            }
            return false;
        }

        @Override // defpackage.i8h
        public void i() {
            MultiAppFloatingActivitySwitcher.this.T(2);
        }

        public String k() {
            return this.f26355a;
        }

        public int l() {
            return this.f26356b;
        }

        public int m() {
            return Math.max(MultiAppFloatingActivitySwitcher.this.E(l()), MultiAppFloatingActivitySwitcher.this.A(l()));
        }

        @Override // defpackage.h8h
        public boolean onFinish(int i) {
            if (!j(i) && MultiAppFloatingActivitySwitcher.this.d0(i, l())) {
                MultiAppFloatingActivitySwitcher.this.T(5);
            }
            return false;
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<AppCompatActivity> f26357a;

        public d(AppCompatActivity appCompatActivity) {
            this.f26357a = null;
            this.f26357a = new WeakReference<>(appCompatActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatActivity appCompatActivity = this.f26357a.get();
            if (appCompatActivity != null) {
                appCompatActivity.executeOpenExitAnimation();
            }
        }
    }

    public class e extends miuix.appcompat.app.floatingactivity.multiapp.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26359b;

        public e(AppCompatActivity appCompatActivity) {
            this.f26358a = appCompatActivity.getActivityIdentity();
            this.f26359b = appCompatActivity.getTaskId();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // miuix.appcompat.app.floatingactivity.multiapp.b
        public Bundle P2(int i, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            if (i == 1) {
                MultiAppFloatingActivitySwitcher.f26347k.F();
            } else if (i == 2) {
                MultiAppFloatingActivitySwitcher.f26347k.V();
            } else if (i == 3) {
                MultiAppFloatingActivitySwitcher.f26347k.v();
                AppCompatActivity appCompatActivityH4 = h4();
                if (appCompatActivityH4 != null) {
                    MultiAppFloatingActivitySwitcher.f26347k.h0(appCompatActivityH4);
                }
            } else if (i != 5) {
                switch (i) {
                    case 8:
                        AppCompatActivity appCompatActivityH5 = h4();
                        if (bundle != null && appCompatActivityH5 != null) {
                            View floatingBrightPanel = appCompatActivityH5.getFloatingBrightPanel();
                            MultiAppFloatingActivitySwitcher.this.c0(r3n.e(floatingBrightPanel, mpf.a(bundle)));
                            if (MultiAppFloatingActivitySwitcher.this.h != null && MultiAppFloatingActivitySwitcher.this.h.get() != null) {
                                ((ViewGroup) floatingBrightPanel.getParent()).getOverlay().add((View) MultiAppFloatingActivitySwitcher.this.h.get());
                            }
                        }
                        break;
                    case 9:
                        AppCompatActivity appCompatActivityH6 = h4();
                        bundle2.putBoolean("check_finishing", appCompatActivityH6 != null && appCompatActivityH6.isFinishing());
                        break;
                    case 10:
                        AppCompatActivity appCompatActivityH7 = h4();
                        if (appCompatActivityH7 != null) {
                            MultiAppFloatingActivitySwitcher.this.f26348a.postDelayed(new d(appCompatActivityH7), 160L);
                        }
                        break;
                    case 11:
                        MultiAppFloatingActivitySwitcher.f26347k.w();
                        break;
                }
            } else {
                MultiAppFloatingActivitySwitcher.f26347k.F();
            }
            return bundle2;
        }

        public final AppCompatActivity h4() {
            MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
            if (multiAppFloatingActivitySwitcherC != null) {
                return multiAppFloatingActivitySwitcherC.y(q5(), p5());
            }
            return null;
        }

        public String p5() {
            return this.f26358a;
        }

        public int q5() {
            return this.f26359b;
        }

        public void r5(AppCompatActivity appCompatActivity) {
            this.f26358a = appCompatActivity.getActivityIdentity();
            this.f26359b = appCompatActivity.getTaskId();
        }
    }

    public static MultiAppFloatingActivitySwitcher C() {
        return f26347k;
    }

    public static void I(AppCompatActivity appCompatActivity, Intent intent, Bundle bundle) {
        if (!O(intent)) {
            FloatingActivitySwitcher.w(appCompatActivity, bundle);
            return;
        }
        if (f26347k == null) {
            f26347k = new MultiAppFloatingActivitySwitcher();
            if (l == null) {
                l = appCompatActivity.getResources().getStringArray(ghi.f19003a);
            }
            f26347k.q(appCompatActivity, intent);
        }
        f26347k.H(appCompatActivity, intent, bundle);
    }

    public static boolean O(Intent intent) {
        return (TextUtils.isEmpty(intent.getStringExtra("floating_service_pkg")) || TextUtils.isEmpty(intent.getStringExtra("floating_service_path"))) ? false : true;
    }

    public static void W(int i, String str, Bundle bundle) {
        ActivitySpec activitySpecZ;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = C();
        if (multiAppFloatingActivitySwitcherC == null || (activitySpecZ = multiAppFloatingActivitySwitcherC.z(i, str)) == null) {
            return;
        }
        bundle.putParcelable("floating_switcher_saved_key", activitySpecZ);
    }

    public int A(int i) {
        ArrayList<ActivitySpec> arrayList = this.f26349b.get(i);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public String B(Object obj, int i) {
        return obj.hashCode() + ":" + i;
    }

    public View D() {
        WeakReference<View> weakReference = this.h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int E(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_task_id", i);
        Bundle bundleU = U(6, bundle);
        int i2 = bundleU != null ? bundleU.getInt(String.valueOf(6)) : 0;
        ArrayList<ActivitySpec> arrayList = this.f26349b.get(i);
        if (arrayList != null) {
            Iterator<ActivitySpec> it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = it.next().f26350a;
                if (i3 + 1 > i2) {
                    i2 = i3 + 1;
                }
            }
        }
        return i2;
    }

    public final void F() {
        final AppCompatActivity appCompatActivity;
        if (N(this.f)) {
            return;
        }
        this.f = System.currentTimeMillis();
        for (int i = 0; i < this.f26349b.size(); i++) {
            for (ActivitySpec activitySpec : this.f26349b.valueAt(i)) {
                if (!activitySpec.f26351b && (appCompatActivity = activitySpec.g) != null) {
                    appCompatActivity.runOnUiThread(new Runnable() { // from class: s9g
                        @Override // java.lang.Runnable
                        public final void run() {
                            appCompatActivity.hideFloatingBrightPanel();
                        }
                    });
                }
            }
        }
    }

    public final void G(int i) {
        ArrayList<ActivitySpec> arrayList = this.f26349b.get(i);
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                int i3 = arrayList.get(i2).f26350a;
                AppCompatActivity appCompatActivity = arrayList.get(i2).g;
                if (appCompatActivity != null && i3 != 0) {
                    appCompatActivity.hideFloatingDimBackground();
                }
            }
        }
    }

    public final void H(AppCompatActivity appCompatActivity, Intent intent, Bundle bundle) {
        if (uy9.b(appCompatActivity) == 0) {
            return;
        }
        e0(appCompatActivity, intent, bundle);
        Y(appCompatActivity);
        appCompatActivity.getLifecycle().addObserver(new MultiAppFloatingLifecycleObserver(appCompatActivity));
        appCompatActivity.setEnableSwipToDismiss(this.c);
        appCompatActivity.setOnFloatingCallback(new c(appCompatActivity));
    }

    public final void J(ActivitySpec activitySpec) {
        miuix.appcompat.app.floatingactivity.multiapp.a aVar;
        if (activitySpec == null || (aVar = this.d) == null) {
            return;
        }
        try {
            e eVar = activitySpec.c;
            aVar.J3(eVar, B(eVar, activitySpec.h));
            j0(B(activitySpec.c, activitySpec.h), activitySpec.f26350a);
            if (!activitySpec.e) {
                activitySpec.e = true;
                activitySpec.d = activitySpec.f26350a;
            }
            Iterator<Runnable> it = activitySpec.f.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            activitySpec.f.clear();
        } catch (RemoteException unused) {
        }
    }

    public boolean K(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_request_identity", String.valueOf(activitySpecZ.c.hashCode()));
        bundle.putInt("key_task_id", i);
        Bundle bundleU = U(9, bundle);
        return bundleU != null && bundleU.getBoolean("check_finishing");
    }

    public boolean L(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ != null) {
            return activitySpecZ.j;
        }
        return false;
    }

    public final boolean M(AppCompatActivity appCompatActivity) {
        return (appCompatActivity == null || z(appCompatActivity.getTaskId(), appCompatActivity.getActivityIdentity()) == null) ? false : true;
    }

    public final boolean N(long j) {
        return System.currentTimeMillis() - j <= 100;
    }

    public final boolean P(String str) {
        for (String str2 : l) {
            if (str2.equals(str)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Package is not allowed:");
        sb.append(str);
        sb.append(". Please contact the MIUIX developer!");
        return false;
    }

    public boolean Q() {
        return this.d != null;
    }

    public void R(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ != null) {
            activitySpecZ.j = true;
        }
    }

    public void S(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ == null) {
            return;
        }
        b bVar = new b(activitySpecZ);
        if (Q()) {
            bVar.run();
        } else {
            activitySpecZ.f.add(bVar);
        }
    }

    public final Bundle T(int i) {
        return U(i, null);
    }

    public final Bundle U(int i, Bundle bundle) {
        miuix.appcompat.app.floatingactivity.multiapp.a aVar = this.d;
        if (aVar == null) {
            return null;
        }
        try {
            return aVar.R4(i, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void V() {
        final AppCompatActivity appCompatActivity;
        if (N(this.g)) {
            return;
        }
        this.g = System.currentTimeMillis();
        for (int i = 0; i < this.f26349b.size(); i++) {
            for (ActivitySpec activitySpec : this.f26349b.valueAt(i)) {
                if (!activitySpec.f26351b && (appCompatActivity = activitySpec.g) != null) {
                    appCompatActivity.runOnUiThread(new Runnable() { // from class: t9g
                        @Override // java.lang.Runnable
                        public final void run() {
                            appCompatActivity.showFloatingBrightPanel();
                        }
                    });
                }
            }
        }
    }

    public void X(int i, String str, Runnable runnable) {
        if (L(i, str)) {
            return;
        }
        if (A(i) > 1 || E(i) > 1) {
            R(i, str);
        }
        if (Q()) {
            runnable.run();
            return;
        }
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ != null) {
            activitySpecZ.f.add(runnable);
        }
    }

    public final void Y(AppCompatActivity appCompatActivity) {
        ActivitySpec activitySpecZ = z(appCompatActivity.getTaskId(), appCompatActivity.getActivityIdentity());
        if (activitySpecZ != null && activitySpecZ.c == null) {
            activitySpecZ.c = new e(appCompatActivity);
        } else if (activitySpecZ != null) {
            activitySpecZ.c.r5(appCompatActivity);
        }
        J(activitySpecZ);
    }

    public void Z(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ == null || activitySpecZ.g == null) {
            return;
        }
        f0(i, str);
        ArrayList<ActivitySpec> arrayList = this.f26349b.get(i);
        if (arrayList != null) {
            arrayList.remove(activitySpecZ);
            if (arrayList.isEmpty()) {
                this.f26349b.remove(i);
            }
        }
        if (this.f26349b.size() == 0) {
            h0(activitySpecZ.g);
            t();
        }
    }

    public void a0(Bitmap bitmap, int i, String str) throws Exception {
        ActivitySpec activitySpecZ;
        if (bitmap == null || (activitySpecZ = z(i, str)) == null) {
            return;
        }
        int byteCount = bitmap.getByteCount();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteCount);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        mpf.c(this.d, byteBufferAllocate.array(), byteCount, bitmap.getWidth(), bitmap.getHeight(), String.valueOf(activitySpecZ.c.hashCode()), i);
    }

    public final void b0(miuix.appcompat.app.floatingactivity.multiapp.a aVar) {
        this.d = aVar;
        this.i = true;
    }

    public void c0(View view) {
        this.h = new WeakReference<>(view);
    }

    public final boolean d0(int i, int i2) {
        return !(i == 4 || i == 3) || E(i2) <= 1;
    }

    public final void e0(AppCompatActivity appCompatActivity, Intent intent, Bundle bundle) {
        if (!M(appCompatActivity)) {
            ActivitySpec activitySpec = bundle != null ? (ActivitySpec) bundle.getParcelable("floating_switcher_saved_key") : null;
            int i = 0;
            if (activitySpec == null) {
                activitySpec = new ActivitySpec(true);
                if (intent == null) {
                    intent = appCompatActivity.getIntent();
                }
                activitySpec.f26350a = intent.getIntExtra("service_page_index", 0);
            }
            activitySpec.g = appCompatActivity;
            activitySpec.h = appCompatActivity.getTaskId();
            activitySpec.i = appCompatActivity.getActivityIdentity();
            ArrayList<ActivitySpec> arrayList = this.f26349b.get(activitySpec.h);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f26349b.put(activitySpec.h, arrayList);
            }
            int i2 = activitySpec.f26350a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (i2 > arrayList.get(size).f26350a) {
                    i = size + 1;
                    break;
                }
            }
            arrayList.add(i, activitySpec);
            ty9.g(appCompatActivity, activitySpec.f26350a);
        }
        G(appCompatActivity.getTaskId());
    }

    public final void f0(int i, String str) {
        if (this.d != null) {
            try {
                ActivitySpec activitySpecZ = z(i, str);
                if (activitySpecZ != null) {
                    miuix.appcompat.app.floatingactivity.multiapp.a aVar = this.d;
                    e eVar = activitySpecZ.c;
                    aVar.I2(eVar, String.valueOf(eVar.hashCode()));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public final void g0() {
        for (int i = 0; i < this.f26349b.size(); i++) {
            for (ActivitySpec activitySpec : this.f26349b.valueAt(i)) {
                f0(activitySpec.h, activitySpec.i);
            }
        }
    }

    public final void h0(Context context) {
        if (this.i) {
            this.i = false;
            context.getApplicationContext().unbindService(this.j);
        }
    }

    public void i0(int i, String str, boolean z) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ != null) {
            activitySpecZ.f26351b = z;
        }
    }

    public final void j0(String str, int i) {
        miuix.appcompat.app.floatingactivity.multiapp.a aVar = this.d;
        if (aVar != null) {
            try {
                aVar.i3(str, i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void q(Context context, Intent intent) {
        Intent intent2 = new Intent();
        String stringExtra = intent.getStringExtra("floating_service_pkg");
        if (P(stringExtra)) {
            intent2.setPackage(stringExtra);
            String stringExtra2 = intent.getStringExtra("floating_service_path");
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            intent2.setComponent(new ComponentName(stringExtra, stringExtra2));
            context.getApplicationContext().bindService(intent2, this.j, 1);
        }
    }

    public void r(int i, String str) {
        ActivitySpec activitySpecZ;
        AppCompatActivity appCompatActivity;
        ArrayList<ActivitySpec> arrayList = this.f26349b.get(i);
        if (((arrayList == null || arrayList.size() <= 1) && E(i) <= 1) || (activitySpecZ = z(i, str)) == null || activitySpecZ.d <= 0 || (appCompatActivity = activitySpecZ.g) == null) {
            return;
        }
        appCompatActivity.hideFloatingDimBackground();
    }

    public final void s() {
        for (int i = 0; i < this.f26349b.size(); i++) {
            for (ActivitySpec activitySpec : this.f26349b.valueAt(i)) {
                if (!activitySpec.e) {
                    J(activitySpec);
                    r(activitySpec.h, activitySpec.i);
                }
            }
        }
    }

    public void t() {
        this.f26349b.clear();
        this.h = null;
    }

    public void u(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ != null) {
            activitySpecZ.f.clear();
        }
    }

    public final void v() {
        if (N(this.e)) {
            return;
        }
        this.e = System.currentTimeMillis();
        for (int i = 0; i < this.f26349b.size(); i++) {
            ArrayList<ActivitySpec> arrayListValueAt = this.f26349b.valueAt(i);
            for (int size = arrayListValueAt.size() - 1; size >= 0; size--) {
                AppCompatActivity appCompatActivity = arrayListValueAt.get(size).g;
                int i2 = arrayListValueAt.get(size).f26350a;
                int iE = E(arrayListValueAt.get(size).h);
                if (appCompatActivity != null && i2 != iE - 1) {
                    appCompatActivity.realFinish();
                }
            }
        }
    }

    public final void w() {
        if (N(this.e)) {
            return;
        }
        this.e = System.currentTimeMillis();
        for (int i = 0; i < this.f26349b.size(); i++) {
            ArrayList<ActivitySpec> arrayListValueAt = this.f26349b.valueAt(i);
            for (int size = arrayListValueAt.size() - 1; size >= 0; size--) {
                AppCompatActivity appCompatActivity = arrayListValueAt.get(size).g;
                int i2 = arrayListValueAt.get(size).f26350a;
                int iE = E(arrayListValueAt.get(size).h);
                if (appCompatActivity != null && i2 != iE - 1) {
                    appCompatActivity.realFinish();
                }
            }
        }
    }

    public void x() {
        if (this.f26349b.size() == 0) {
            f26347k = null;
        }
    }

    public AppCompatActivity y(int i, String str) {
        ActivitySpec activitySpecZ = z(i, str);
        if (activitySpecZ != null) {
            return activitySpecZ.g;
        }
        return null;
    }

    public final ActivitySpec z(int i, String str) {
        ArrayList<ActivitySpec> arrayList = this.f26349b.get(i);
        if (arrayList == null) {
            return null;
        }
        for (ActivitySpec activitySpec : arrayList) {
            if (TextUtils.equals(activitySpec.i, str)) {
                return activitySpec;
            }
        }
        return null;
    }

    public static class ActivitySpec implements Parcelable {
        public static final Parcelable.Creator<ActivitySpec> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26351b;
        public e c;
        public int d;
        public boolean e;
        public List<Runnable> f;
        public AppCompatActivity g;
        public int h;
        public String i;
        public boolean j;

        public class a implements Parcelable.Creator<ActivitySpec> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ActivitySpec createFromParcel(Parcel parcel) {
                return new ActivitySpec(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ActivitySpec[] newArray(int i) {
                return new ActivitySpec[i];
            }
        }

        public ActivitySpec(boolean z) {
            this.f26350a = -1;
            this.e = false;
            this.j = false;
            this.f26351b = z;
            this.f = new LinkedList();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "{ index : " + this.f26350a + "; taskId : " + this.h + "; taskId : " + this.h + "; identity : " + this.i + "; serviceNotifyIndex : " + this.d + "; register : " + this.e + "; isOpenEnterAnimExecuted : " + this.j + "; }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f26350a);
            parcel.writeInt(this.h);
            parcel.writeString(this.i);
            parcel.writeByte(this.f26351b ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.d);
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        }

        public ActivitySpec(Parcel parcel) {
            this.f26350a = -1;
            this.e = false;
            this.j = false;
            this.f26350a = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readString();
            this.f26351b = parcel.readByte() != 0;
            this.d = parcel.readInt();
            this.e = parcel.readByte() != 0;
            this.j = parcel.readByte() != 0;
            this.f = new LinkedList();
        }
    }
}
