package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import defpackage.mfe;
import defpackage.rok;
import defpackage.sok;
import defpackage.ulq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Lifecycle, rok> f6995a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.b.InterfaceC0141b f6996b;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.a$a, reason: collision with other inner class name */
    public class C0140a implements mfe {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f6997a;

        public C0140a(Lifecycle lifecycle) {
            this.f6997a = lifecycle;
        }

        @Override // defpackage.mfe
        public void onDestroy() {
            a.this.f6995a.remove(this.f6997a);
        }

        @Override // defpackage.mfe
        public void onStart() {
        }

        @Override // defpackage.mfe
        public void onStop() {
        }
    }

    public final class b implements sok {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentManager f6999a;

        public b(FragmentManager fragmentManager) {
            this.f6999a = fragmentManager;
        }

        @Override // defpackage.sok
        public Set<rok> a() {
            HashSet hashSet = new HashSet();
            b(this.f6999a, hashSet);
            return hashSet;
        }

        public final void b(FragmentManager fragmentManager, Set<rok> set) {
            List<Fragment> listY0 = fragmentManager.y0();
            int size = listY0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = listY0.get(i);
                b(fragment.getChildFragmentManager(), set);
                rok rokVarA = a.this.a(fragment.getLifecycle());
                if (rokVarA != null) {
                    set.add(rokVarA);
                }
            }
        }
    }

    public a(com.bumptech.glide.manager.b.InterfaceC0141b interfaceC0141b) {
        this.f6996b = interfaceC0141b;
    }

    public rok a(Lifecycle lifecycle) {
        ulq.b();
        return this.f6995a.get(lifecycle);
    }

    public rok b(Context context, com.bumptech.glide.a aVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        ulq.b();
        rok rokVarA = a(lifecycle);
        if (rokVarA != null) {
            return rokVarA;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        rok rokVarA2 = this.f6996b.a(aVar, lifecycleLifecycle, new b(fragmentManager), context);
        this.f6995a.put(lifecycle, rokVarA2);
        lifecycleLifecycle.a(new C0140a(lifecycle));
        if (z) {
            rokVarA2.onStart();
        }
        return rokVarA2;
    }
}
