package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ExerciseHeaderSyncBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final View dividerSync;

    @NonNull
    public final ImageView syncBtn;

    @NonNull
    public final LinearLayout syncFailContainer;

    @NonNull
    public final TextView syncFailDesc;

    @NonNull
    public final ImageView syncStateIndicator;

    @NonNull
    public final TextView unSyncCount;

    private ExerciseHeaderSyncBinding(@NonNull View rootView, @NonNull View dividerSync, @NonNull ImageView syncBtn, @NonNull LinearLayout syncFailContainer, @NonNull TextView syncFailDesc, @NonNull ImageView syncStateIndicator, @NonNull TextView unSyncCount) {
        this.a = rootView;
        this.dividerSync = dividerSync;
        this.syncBtn = syncBtn;
        this.syncFailContainer = syncFailContainer;
        this.syncFailDesc = syncFailDesc;
        this.syncStateIndicator = syncStateIndicator;
        this.unSyncCount = unSyncCount;
    }

    @NonNull
    public static ExerciseHeaderSyncBinding bind(@NonNull View rootView) {
        int i = R.id.divider_sync;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_sync);
        if (viewFindChildViewById != null) {
            i = R.id.syncBtn;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.syncBtn);
            if (imageView != null) {
                i = R.id.syncFailContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.syncFailContainer);
                if (linearLayout != null) {
                    i = R.id.syncFailDesc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.syncFailDesc);
                    if (textView != null) {
                        i = R.id.syncStateIndicator;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.syncStateIndicator);
                        if (imageView2 != null) {
                            i = R.id.unSyncCount;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unSyncCount);
                            if (textView2 != null) {
                                return new ExerciseHeaderSyncBinding(rootView, viewFindChildViewById, imageView, linearLayout, textView, imageView2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ExerciseHeaderSyncBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.exercise_header_sync, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
