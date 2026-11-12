package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alipay.sdk.m.u.i;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class SupportRequestManagerFragment extends Fragment {
    private static final String g = "SupportRMFragment";
    private final com.bumptech.glide.manager.a a;
    private final RequestManagerTreeNode b;
    private final Set<SupportRequestManagerFragment> c;

    @Nullable
    private SupportRequestManagerFragment d;

    @Nullable
    private RequestManager e;

    @Nullable
    private Fragment f;

    public class a implements RequestManagerTreeNode {
        public a() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @NonNull
        public Set<RequestManager> getDescendants() {
            Set<SupportRequestManagerFragment> setB = SupportRequestManagerFragment.this.b();
            HashSet hashSet = new HashSet(setB.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setB) {
                if (supportRequestManagerFragment.getRequestManager() != null) {
                    hashSet.add(supportRequestManagerFragment.getRequestManager());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + i.d;
        }
    }

    public SupportRequestManagerFragment() {
        this(new com.bumptech.glide.manager.a());
    }

    private void a(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.c.add(supportRequestManagerFragment);
    }

    @Nullable
    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f;
    }

    private boolean e(@NonNull Fragment fragment) {
        Fragment fragmentD = d();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentD)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void f(@NonNull FragmentActivity fragmentActivity) {
        i();
        SupportRequestManagerFragment supportRequestManagerFragmentL = Glide.get(fragmentActivity).getRequestManagerRetriever().l(fragmentActivity);
        this.d = supportRequestManagerFragmentL;
        if (equals(supportRequestManagerFragmentL)) {
            return;
        }
        this.d.a(this);
    }

    private void g(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.c.remove(supportRequestManagerFragment);
    }

    private void i() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.d;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.g(this);
            this.d = null;
        }
    }

    @NonNull
    public Set<SupportRequestManagerFragment> b() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.d;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.c);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.d.b()) {
            if (e(supportRequestManagerFragment2.d())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    public com.bumptech.glide.manager.a c() {
        return this.a;
    }

    @Nullable
    public RequestManager getRequestManager() {
        return this.e;
    }

    @NonNull
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return this.b;
    }

    public void h(@Nullable Fragment fragment) {
        this.f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        f(fragment.getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            f(getActivity());
        } catch (IllegalStateException e) {
            if (Log.isLoggable(g, 5)) {
                Log.w(g, "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.a();
        i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f = null;
        i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.c();
    }

    public void setRequestManager(@Nullable RequestManager requestManager) {
        this.e = requestManager;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + i.d;
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public SupportRequestManagerFragment(@NonNull com.bumptech.glide.manager.a aVar) {
        this.b = new a();
        this.c = new HashSet();
        this.a = aVar;
    }
}
