package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentKeepAliveChangeSystemBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView keepAliveFragmentCancel;

    @NonNull
    public final ListView keepAliveFragmentList;

    @NonNull
    public final TextView tvTitle;

    private FragmentKeepAliveChangeSystemBinding(@NonNull LinearLayout rootView, @NonNull TextView keepAliveFragmentCancel, @NonNull ListView keepAliveFragmentList, @NonNull TextView tvTitle) {
        this.a = rootView;
        this.keepAliveFragmentCancel = keepAliveFragmentCancel;
        this.keepAliveFragmentList = keepAliveFragmentList;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static FragmentKeepAliveChangeSystemBinding bind(@NonNull View rootView) {
        int i = R.id.keep_alive_fragment_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_fragment_cancel);
        if (textView != null) {
            i = R.id.keep_alive_fragment_list;
            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.keep_alive_fragment_list);
            if (listView != null) {
                i = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (textView2 != null) {
                    return new FragmentKeepAliveChangeSystemBinding((LinearLayout) rootView, textView, listView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentKeepAliveChangeSystemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentKeepAliveChangeSystemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_keep_alive_change_system, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
