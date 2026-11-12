package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentSearchCommunityBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final EditText etSearch;

    @NonNull
    public final RecyclerView recyclerview;

    @NonNull
    public final View searchView;

    @NonNull
    public final View searchView1;

    @NonNull
    public final TextView tvCommunityCount;

    @NonNull
    public final TextView tvSearch;

    private FragmentSearchCommunityBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.etSearch = editText;
        this.recyclerview = recyclerView;
        this.searchView = view;
        this.searchView1 = view2;
        this.tvCommunityCount = textView;
        this.tvSearch = textView2;
    }

    @NonNull
    public static FragmentSearchCommunityBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.et_search;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.recyclerview;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.search_view))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.search_view_1))) != null) {
                i = R.id.tv_community_count;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_search;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new FragmentSearchCommunityBinding((LinearLayout) view, editText, recyclerView, viewFindChildViewById, viewFindChildViewById2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSearchCommunityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSearchCommunityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_search_community, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
