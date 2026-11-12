package miuix.appcompat.app.floatingactivity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.i8h;
import defpackage.r3n;
import defpackage.ty9;
import defpackage.uy9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActivitySwitcher {
    public static FloatingActivitySwitcher e;
    public static final HashMap<String, ActivitySpec> f = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26335b;
    public WeakReference<View> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<ArrayList<AppCompatActivity>> f26334a = new SparseArray<>();
    public final ArrayList<AppCompatActivity> d = new ArrayList<>();

    public class a implements i8h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26339b;

        public a(AppCompatActivity appCompatActivity) {
            this.f26338a = appCompatActivity.getActivityIdentity();
            this.f26339b = appCompatActivity.getTaskId();
        }

        @Override // defpackage.i8h
        public void a() {
            Iterator it = FloatingActivitySwitcher.this.d.iterator();
            while (it.hasNext()) {
                ((AppCompatActivity) it.next()).realFinish();
            }
            FloatingActivitySwitcher.this.d.clear();
        }

        @Override // defpackage.i8h
        public void b() {
            FloatingActivitySwitcher.this.s(l());
        }

        @Override // defpackage.i8h
        public boolean c() {
            ArrayList arrayList;
            ActivitySpec activitySpec = (ActivitySpec) FloatingActivitySwitcher.f.get(l());
            if (activitySpec != null && (arrayList = (ArrayList) FloatingActivitySwitcher.this.f26334a.get(activitySpec.d)) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) arrayList.get(i);
                    if (!appCompatActivity.isFinishing()) {
                        return appCompatActivity.getActivityIdentity().equals(l());
                    }
                }
            }
            return false;
        }

        @Override // defpackage.i8h
        public void d(AppCompatActivity appCompatActivity) {
            FloatingActivitySwitcher.this.A(appCompatActivity);
        }

        @Override // defpackage.i8h
        public boolean e() {
            ArrayList arrayList;
            ActivitySpec activitySpec = (ActivitySpec) FloatingActivitySwitcher.f.get(l());
            if (activitySpec == null || (arrayList = (ArrayList) FloatingActivitySwitcher.this.f26334a.get(activitySpec.d)) == null) {
                return true;
            }
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (!((AppCompatActivity) it.next()).isFinishing()) {
                    i++;
                }
            }
            return i == 1;
        }

        @Override // defpackage.i8h
        public void f(AppCompatActivity appCompatActivity) {
            FloatingActivitySwitcher floatingActivitySwitcherO;
            AppCompatActivity appCompatActivityR;
            View viewD;
            if (appCompatActivity == null || (floatingActivitySwitcherO = FloatingActivitySwitcher.o()) == null || (appCompatActivityR = floatingActivitySwitcherO.r(appCompatActivity)) == null) {
                return;
            }
            int i = 0;
            do {
                viewD = r3n.d(appCompatActivityR, appCompatActivity);
                i++;
                if (viewD != null) {
                    break;
                }
            } while (i < 3);
            floatingActivitySwitcherO.E(viewD);
            j(appCompatActivityR);
        }

        @Override // defpackage.i8h
        public void g() {
            FloatingActivitySwitcher.this.s(l());
        }

        @Override // defpackage.i8h
        public boolean h() {
            ArrayList arrayList;
            ActivitySpec activitySpec = (ActivitySpec) FloatingActivitySwitcher.f.get(l());
            if (activitySpec == null || (arrayList = (ArrayList) FloatingActivitySwitcher.this.f26334a.get(activitySpec.d)) == null) {
                return true;
            }
            if (arrayList.size() > 1) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!((AppCompatActivity) it.next()).isFinishing()) {
                        i++;
                    }
                    if (i > 1) {
                        return false;
                    }
                }
            }
            AppCompatActivity appCompatActivity = arrayList.size() == 0 ? null : (AppCompatActivity) arrayList.get(0);
            if (appCompatActivity == null || appCompatActivity.isFinishing() || ((ActivitySpec) FloatingActivitySwitcher.f.get(appCompatActivity.getActivityIdentity())) == null) {
                return true;
            }
            return !activitySpec.e;
        }

        @Override // defpackage.i8h
        public void i() {
            FloatingActivitySwitcher.this.F(l());
        }

        public final void j(AppCompatActivity appCompatActivity) {
            View viewP;
            ViewGroup viewGroup;
            FloatingActivitySwitcher floatingActivitySwitcherO = FloatingActivitySwitcher.o();
            if (floatingActivitySwitcherO == null || (viewP = floatingActivitySwitcherO.p()) == null || (viewGroup = (ViewGroup) appCompatActivity.getFloatingBrightPanel().getParent()) == null) {
                return;
            }
            viewGroup.getOverlay().clear();
            viewGroup.getOverlay().add(viewP);
        }

        public final boolean k(int i) {
            return !FloatingActivitySwitcher.this.f26335b && (i == 1 || i == 2);
        }

        public String l() {
            return this.f26338a;
        }

        public int m() {
            return this.f26339b;
        }

        public final boolean n(int i) {
            ArrayList arrayList = (ArrayList) FloatingActivitySwitcher.this.f26334a.get(m());
            return (i == 4 || i == 3) && (arrayList != null && arrayList.size() > 1);
        }

        @Override // defpackage.h8h
        public boolean onFinish(int i) {
            if (k(i)) {
                return false;
            }
            if (n(i)) {
                FloatingActivitySwitcher.this.j(l());
            } else {
                FloatingActivitySwitcher.this.i(l());
            }
            return false;
        }
    }

    public static void B(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (o() == null || bundle == null) {
            return;
        }
        bundle.putParcelable("miuix_floating_activity_info_key", q(appCompatActivity));
    }

    public static FloatingActivitySwitcher o() {
        return e;
    }

    public static ActivitySpec q(AppCompatActivity appCompatActivity) {
        ActivitySpec activitySpec = f.get(appCompatActivity.getActivityIdentity());
        FloatingActivitySwitcher floatingActivitySwitcherO = o();
        if (activitySpec == null) {
            activitySpec = new ActivitySpec(appCompatActivity.getClass().getSimpleName(), floatingActivitySwitcherO == null ? 0 : floatingActivitySwitcherO.m(appCompatActivity), appCompatActivity.getActivityIdentity(), appCompatActivity.getTaskId(), false);
        }
        return activitySpec;
    }

    public static void w(AppCompatActivity appCompatActivity, Bundle bundle) {
        x(appCompatActivity, true, bundle);
    }

    public static void x(AppCompatActivity appCompatActivity, boolean z, Bundle bundle) {
        if (e == null) {
            FloatingActivitySwitcher floatingActivitySwitcher = new FloatingActivitySwitcher();
            e = floatingActivitySwitcher;
            floatingActivitySwitcher.f26335b = z;
        }
        e.u(appCompatActivity, bundle);
    }

    public void A(AppCompatActivity appCompatActivity) {
        ActivitySpec activitySpec = f.get(appCompatActivity.getActivityIdentity());
        if (activitySpec != null) {
            activitySpec.e = true;
        }
    }

    public final ActivitySpec C(AppCompatActivity appCompatActivity, Bundle bundle) {
        ActivitySpec activitySpec = (ActivitySpec) bundle.getParcelable("miuix_floating_activity_info_key");
        return activitySpec == null ? new ActivitySpec(appCompatActivity.getClass().getSimpleName(), 0, appCompatActivity.getActivityIdentity(), appCompatActivity.getTaskId(), false) : activitySpec;
    }

    public void D(String str, int i) {
        ArrayList<AppCompatActivity> arrayList = this.f26334a.get(i);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AppCompatActivity appCompatActivity = arrayList.get(size);
                if (appCompatActivity.getActivityIdentity().equals(str)) {
                    arrayList.remove(size);
                }
                this.d.remove(appCompatActivity);
            }
            if (arrayList.isEmpty()) {
                this.f26334a.remove(i);
            }
        }
        f.remove(str);
        if (this.f26334a.size() == 0) {
            h();
        }
    }

    public void E(View view) {
        this.c = new WeakReference<>(view);
    }

    public final void F(String str) {
        ActivitySpec activitySpec = f.get(str);
        if (activitySpec != null) {
            ArrayList<AppCompatActivity> arrayList = this.f26334a.get(activitySpec.d);
            int i = -1;
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2).getActivityIdentity().equals(str)) {
                        i = i2;
                    }
                }
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                arrayList.get(i3).showFloatingBrightPanel();
            }
        }
    }

    public final void G(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (!z(appCompatActivity)) {
            int taskId = appCompatActivity.getTaskId();
            ArrayList<AppCompatActivity> arrayList = this.f26334a.get(taskId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f26334a.put(taskId, arrayList);
            }
            if (bundle != null) {
                ActivitySpec activitySpecC = C(appCompatActivity, bundle);
                activitySpecC.f26336a = appCompatActivity.getClass().getSimpleName();
                activitySpecC.c = appCompatActivity.getActivityIdentity();
                v(arrayList, activitySpecC.f26337b, appCompatActivity);
                f.put(appCompatActivity.getActivityIdentity(), activitySpecC);
            } else {
                arrayList.add(appCompatActivity);
                FloatingActivitySwitcher floatingActivitySwitcherO = o();
                f.put(appCompatActivity.getActivityIdentity(), new ActivitySpec(appCompatActivity.getClass().getSimpleName(), floatingActivitySwitcherO == null ? 0 : floatingActivitySwitcherO.m(appCompatActivity), appCompatActivity.getActivityIdentity(), appCompatActivity.getTaskId(), false));
            }
        }
        ActivitySpec activitySpec = f.get(appCompatActivity.getActivityIdentity());
        if (activitySpec != null) {
            ty9.g(appCompatActivity, activitySpec.f26337b);
        }
        k(appCompatActivity);
        t(appCompatActivity);
    }

    public void h() {
        this.f26334a.clear();
        f.clear();
        this.c = null;
        e = null;
    }

    public void i(String str) {
        ArrayList<AppCompatActivity> arrayList;
        ActivitySpec activitySpec = f.get(str);
        if (activitySpec == null || (arrayList = this.f26334a.get(activitySpec.d)) == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AppCompatActivity appCompatActivity = arrayList.get(size);
            if (!appCompatActivity.getActivityIdentity().equals(str)) {
                appCompatActivity.hideFloatingBrightPanel();
                this.d.add(appCompatActivity);
                arrayList.remove(appCompatActivity);
                f.remove(appCompatActivity.getActivityIdentity());
            }
        }
    }

    public final void j(String str) {
        ArrayList<AppCompatActivity> arrayList;
        ActivitySpec activitySpec = f.get(str);
        if (activitySpec == null || (arrayList = this.f26334a.get(activitySpec.d)) == null || arrayList.size() <= 0) {
            return;
        }
        arrayList.get(arrayList.size() - 1).realFinish();
    }

    public final void k(AppCompatActivity appCompatActivity) {
        if (ty9.f()) {
            return;
        }
        if (appCompatActivity.isInFloatingWindowMode()) {
            ty9.a(appCompatActivity);
        } else {
            ty9.b(appCompatActivity);
        }
    }

    public AppCompatActivity l(String str, int i) {
        ArrayList<AppCompatActivity> arrayList = this.f26334a.get(i);
        if (arrayList == null) {
            return null;
        }
        for (AppCompatActivity appCompatActivity : arrayList) {
            if (appCompatActivity.getActivityIdentity().equals(str)) {
                return appCompatActivity;
            }
        }
        return null;
    }

    public int m(AppCompatActivity appCompatActivity) {
        ArrayList<AppCompatActivity> arrayList;
        if (appCompatActivity == null || (arrayList = this.f26334a.get(appCompatActivity.getTaskId())) == null) {
            return -1;
        }
        return arrayList.indexOf(appCompatActivity);
    }

    public ArrayList<AppCompatActivity> n(int i) {
        return this.f26334a.get(i);
    }

    public View p() {
        WeakReference<View> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public AppCompatActivity r(AppCompatActivity appCompatActivity) {
        if (appCompatActivity == null) {
            return null;
        }
        ArrayList<AppCompatActivity> arrayList = this.f26334a.get(appCompatActivity.getTaskId());
        int iIndexOf = arrayList != null ? arrayList.indexOf(appCompatActivity) : -1;
        if (iIndexOf <= 0) {
            return null;
        }
        int i = iIndexOf - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            AppCompatActivity appCompatActivity2 = arrayList.get(i);
            if (!appCompatActivity2.isFinishing()) {
                return appCompatActivity2;
            }
        }
        return null;
    }

    public final void s(String str) {
        ActivitySpec activitySpec = f.get(str);
        if (activitySpec != null) {
            ArrayList<AppCompatActivity> arrayList = this.f26334a.get(activitySpec.d);
            int i = -1;
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2).getActivityIdentity().equals(str)) {
                        i = i2;
                    }
                }
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                arrayList.get(i3).hideFloatingBrightPanel();
            }
        }
    }

    public final void t(AppCompatActivity appCompatActivity) {
        ArrayList<AppCompatActivity> arrayList = this.f26334a.get(appCompatActivity.getTaskId());
        if (arrayList == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (!arrayList.get(i).isFinishing()) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        while (true) {
            i++;
            if (i >= arrayList.size()) {
                return;
            } else {
                arrayList.get(i).hideFloatingDimBackground();
            }
        }
    }

    public final void u(AppCompatActivity appCompatActivity, Bundle bundle) {
        if (uy9.b(appCompatActivity) == 0) {
            return;
        }
        G(appCompatActivity, bundle);
        appCompatActivity.getLifecycle().addObserver(new SingleAppFloatingLifecycleObserver(appCompatActivity));
        appCompatActivity.setEnableSwipToDismiss(this.f26335b);
        appCompatActivity.setOnFloatingCallback(new a(appCompatActivity));
    }

    public final void v(ArrayList<AppCompatActivity> arrayList, int i, AppCompatActivity appCompatActivity) {
        int i2;
        ActivitySpec activitySpec;
        int size = arrayList.size();
        do {
            size--;
            i2 = 0;
            if (size >= 0) {
                activitySpec = f.get(arrayList.get(size).getActivityIdentity());
            }
            arrayList.add(i2, appCompatActivity);
        } while (i <= (activitySpec != null ? activitySpec.f26337b : 0));
        i2 = size + 1;
        arrayList.add(i2, appCompatActivity);
    }

    public boolean y(AppCompatActivity appCompatActivity) {
        ActivitySpec activitySpec = f.get(appCompatActivity.getActivityIdentity());
        return activitySpec != null && activitySpec.e;
    }

    public final boolean z(AppCompatActivity appCompatActivity) {
        return f.get(appCompatActivity.getActivityIdentity()) != null;
    }

    public static class ActivitySpec implements Parcelable {
        public static final Parcelable.Creator<ActivitySpec> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26337b;
        public String c;
        public int d;
        public boolean e;
        public boolean f = false;

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

        public ActivitySpec(String str, int i, String str2, int i2, boolean z) {
            this.f26336a = str;
            this.f26337b = i;
            this.c = str2;
            this.d = i2;
            this.e = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "{ activityClassName : " + this.f26336a + "; index : " + this.f26337b + "; identity : " + this.c + "; taskId : " + this.d + "; isOpenEnterAnimExecuted : " + this.e + "; }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f26336a);
            parcel.writeInt(this.f26337b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        }

        public ActivitySpec(Parcel parcel) {
            this.f26336a = "";
            this.f26337b = 0;
            this.d = 0;
            this.e = false;
            this.f26336a = parcel.readString();
            this.f26337b = parcel.readInt();
            this.c = parcel.readString();
            this.d = parcel.readInt();
            this.e = parcel.readByte() != 0;
        }
    }
}
