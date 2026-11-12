package androidx.p004activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.p004activity.result.contract.ActivityResultContract;
import defpackage.hn0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f1386a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, String> f1387b = new HashMap();
    public final Map<String, Integer> c = new HashMap();
    public final Map<String, d> d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();
    public final transient Map<String, c<?>> f = new HashMap();
    public final Map<String, Object> g = new HashMap();
    public final Bundle h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract f1391b;

        public a(String str, ActivityResultContract activityResultContract) {
            this.f1390a = str;
            this.f1391b = activityResultContract;
        }

        @Override // androidx.p004activity.result.ActivityResultLauncher
        public ActivityResultContract<I, ?> getContract() {
            return this.f1391b;
        }

        @Override // androidx.p004activity.result.ActivityResultLauncher
        public void launch(I i, hn0 hn0Var) throws Exception {
            Integer num = ActivityResultRegistry.this.c.get(this.f1390a);
            if (num != null) {
                ActivityResultRegistry.this.e.add(this.f1390a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1391b, i, hn0Var);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.e.remove(this.f1390a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1391b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.p004activity.result.ActivityResultLauncher
        public void unregister() {
            ActivityResultRegistry.this.l(this.f1390a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class b<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract f1393b;

        public b(String str, ActivityResultContract activityResultContract) {
            this.f1392a = str;
            this.f1393b = activityResultContract;
        }

        @Override // androidx.p004activity.result.ActivityResultLauncher
        public ActivityResultContract<I, ?> getContract() {
            return this.f1393b;
        }

        @Override // androidx.p004activity.result.ActivityResultLauncher
        public void launch(I i, hn0 hn0Var) throws Exception {
            Integer num = ActivityResultRegistry.this.c.get(this.f1392a);
            if (num != null) {
                ActivityResultRegistry.this.e.add(this.f1392a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1393b, i, hn0Var);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.e.remove(this.f1392a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1393b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.p004activity.result.ActivityResultLauncher
        public void unregister() {
            ActivityResultRegistry.this.l(this.f1392a);
        }
    }

    public static class c<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityResultCallback<O> f1394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityResultContract<?, O> f1395b;

        public c(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.f1394a = activityResultCallback;
            this.f1395b = activityResultContract;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f1396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<LifecycleEventObserver> f1397b = new ArrayList<>();

        public d(Lifecycle lifecycle) {
            this.f1396a = lifecycle;
        }

        public void a(LifecycleEventObserver lifecycleEventObserver) {
            this.f1396a.addObserver(lifecycleEventObserver);
            this.f1397b.add(lifecycleEventObserver);
        }

        public void b() {
            Iterator<LifecycleEventObserver> it = this.f1397b.iterator();
            while (it.hasNext()) {
                this.f1396a.removeObserver(it.next());
            }
            this.f1397b.clear();
        }
    }

    public final void a(int i, String str) {
        this.f1387b.put(Integer.valueOf(i), str);
        this.c.put(str, Integer.valueOf(i));
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = this.f1387b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d(str, i2, intent, this.f.get(str));
        return true;
    }

    public final <O> boolean c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.f1387b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f.get(str);
        if (cVar == null || (activityResultCallback = cVar.f1394a) == null) {
            this.h.remove(str);
            this.g.put(str, o);
            return true;
        }
        if (!this.e.remove(str)) {
            return true;
        }
        activityResultCallback.a(o);
        return true;
    }

    public final <O> void d(String str, int i, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f1394a == null || !this.e.contains(str)) {
            this.g.remove(str);
            this.h.putParcelable(str, new ActivityResult(i, intent));
        } else {
            cVar.f1394a.a(cVar.f1395b.parseResult(i, intent));
            this.e.remove(str);
        }
    }

    public final int e() {
        int iNextInt = this.f1386a.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.f1387b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iNextInt = this.f1386a.nextInt(2147418112);
        }
    }

    public abstract <I, O> void f(int i, ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i2, hn0 hn0Var);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f1386a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.c.containsKey(str)) {
                Integer numRemove = this.c.remove(str);
                if (!this.h.containsKey(str)) {
                    this.f1387b.remove(numRemove);
                }
            }
            a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f1386a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> i(String str, ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        k(str);
        this.f.put(str, new c<>(activityResultCallback, activityResultContract));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            activityResultCallback.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.h.getParcelable(str);
        if (activityResult != null) {
            this.h.remove(str);
            activityResultCallback.a(activityResultContract.parseResult(activityResult.c(), activityResult.a()));
        }
        return new b(str, activityResultContract);
    }

    public final <I, O> ActivityResultLauncher<I> j(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> activityResultContract, final ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = this.d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f.put(str, new c<>(activityResultCallback, activityResultContract));
                if (ActivityResultRegistry.this.g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.g.get(str);
                    ActivityResultRegistry.this.g.remove(str);
                    activityResultCallback.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.h.remove(str);
                    activityResultCallback.a(activityResultContract.parseResult(activityResult.c(), activityResult.a()));
                }
            }
        });
        this.d.put(str, dVar);
        return new a(str, activityResultContract);
    }

    public final void k(String str) {
        if (this.c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final void l(String str) {
        Integer numRemove;
        if (!this.e.contains(str) && (numRemove = this.c.remove(str)) != null) {
            this.f1387b.remove(numRemove);
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.h.getParcelable(str));
            this.h.remove(str);
        }
        d dVar = this.d.get(str);
        if (dVar != null) {
            dVar.b();
            this.d.remove(str);
        }
    }
}
