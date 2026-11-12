package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardWatchfaceBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RecyclerView rlWatchFace;

    @NonNull
    public final TypefaceTextView tvMore;

    @NonNull
    public final TypefaceTextView tvTitle;

    private PlayCardWatchfaceBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView rlWatchFace, @NonNull TypefaceTextView tvMore, @NonNull TypefaceTextView tvTitle) {
        this.a = rootView;
        this.rlWatchFace = rlWatchFace;
        this.tvMore = tvMore;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static PlayCardWatchfaceBinding bind(@NonNull View rootView) {
        int i = R.id.rl_watch_face;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rl_watch_face);
        if (recyclerView != null) {
            i = R.id.tv_more;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_more);
            if (typefaceTextView != null) {
                i = R.id.tv_title;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (typefaceTextView2 != null) {
                    return new PlayCardWatchfaceBinding((ConstraintLayout) rootView, recyclerView, typefaceTextView, typefaceTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardWatchfaceBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardWatchfaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_watchface, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
