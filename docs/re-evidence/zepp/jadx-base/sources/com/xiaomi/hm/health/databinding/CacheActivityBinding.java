package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class CacheActivityBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile trainingCacheItem;

    private CacheActivityBinding(@NonNull LinearLayout rootView, @NonNull ListTile trainingCacheItem) {
        this.a = rootView;
        this.trainingCacheItem = trainingCacheItem;
    }

    @NonNull
    public static CacheActivityBinding bind(@NonNull View rootView) {
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.training_cache_item);
        if (listTile != null) {
            return new CacheActivityBinding((LinearLayout) rootView, listTile);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.training_cache_item)));
    }

    @NonNull
    public static CacheActivityBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static CacheActivityBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.cache_activity, parent, false);
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
