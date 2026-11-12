package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
public final class WfFragmentWatchfacesManagerBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final FragmentContainerView collect;

    @NonNull
    public final FragmentContainerView empty;

    @NonNull
    public final FragmentContainerView error;

    @NonNull
    public final FragmentContainerView header;

    @NonNull
    public final FragmentContainerView history;

    @NonNull
    public final FragmentContainerView local;

    @NonNull
    public final FragmentContainerView myWatch;

    private WfFragmentWatchfacesManagerBinding(@NonNull NestedScrollView rootView, @NonNull FragmentContainerView collect, @NonNull FragmentContainerView empty, @NonNull FragmentContainerView error, @NonNull FragmentContainerView header, @NonNull FragmentContainerView history, @NonNull FragmentContainerView local, @NonNull FragmentContainerView myWatch) {
        this.a = rootView;
        this.collect = collect;
        this.empty = empty;
        this.error = error;
        this.header = header;
        this.history = history;
        this.local = local;
        this.myWatch = myWatch;
    }

    @NonNull
    public static WfFragmentWatchfacesManagerBinding bind(@NonNull View rootView) {
        int i = R.id.collect;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
        if (fragmentContainerView != null) {
            i = R.id.empty;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
            if (fragmentContainerView2 != null) {
                i = R.id.error;
                FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                if (fragmentContainerView3 != null) {
                    i = R.id.header;
                    FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                    if (fragmentContainerView4 != null) {
                        i = R.id.history;
                        FragmentContainerView fragmentContainerView5 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                        if (fragmentContainerView5 != null) {
                            i = R.id.local;
                            FragmentContainerView fragmentContainerView6 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                            if (fragmentContainerView6 != null) {
                                i = R.id.my_watch;
                                FragmentContainerView fragmentContainerView7 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                                if (fragmentContainerView7 != null) {
                                    return new WfFragmentWatchfacesManagerBinding((NestedScrollView) rootView, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5, fragmentContainerView6, fragmentContainerView7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfFragmentWatchfacesManagerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfFragmentWatchfacesManagerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_fragment_watchfaces_manager, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.a;
    }
}
