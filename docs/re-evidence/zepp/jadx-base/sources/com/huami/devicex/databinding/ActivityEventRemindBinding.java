package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEventRemindBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout actionContainer;

    @NonNull
    public final TextView addEventTv;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final TextView doneEventTv;

    @NonNull
    public final TextView editEventTv;

    @NonNull
    public final TextView emptyTv;

    @NonNull
    public final RecyclerView eventList;

    @NonNull
    public final SmartRefreshLayout loadMoreLayout;

    @NonNull
    public final View maskView;

    @NonNull
    public final LinearLayout tipsContainer;

    @NonNull
    public final TextView vibrateTv;

    private ActivityEventRemindBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull RecyclerView recyclerView, @NonNull SmartRefreshLayout smartRefreshLayout, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull TextView textView5) {
        this.a = relativeLayout;
        this.actionContainer = frameLayout;
        this.addEventTv = textView;
        this.container = frameLayout2;
        this.doneEventTv = textView2;
        this.editEventTv = textView3;
        this.emptyTv = textView4;
        this.eventList = recyclerView;
        this.loadMoreLayout = smartRefreshLayout;
        this.maskView = view;
        this.tipsContainer = linearLayout;
        this.vibrateTv = textView5;
    }

    @NonNull
    public static ActivityEventRemindBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.action_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.add_event_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.done_event_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.edit_event_tv;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.empty_tv;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                i = R.id.event_list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.load_more_layout;
                                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.findChildViewById(view, i);
                                    if (smartRefreshLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                                        i = R.id.tips_container;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.vibrate_tv;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView5 != null) {
                                                return new ActivityEventRemindBinding((RelativeLayout) view, frameLayout, textView, frameLayout2, textView2, textView3, textView4, recyclerView, smartRefreshLayout, viewFindChildViewById, linearLayout, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEventRemindBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEventRemindBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_event_remind, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
