package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.haibin.calendarview.CalendarView;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewLayoutTodoCalendarBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CalendarView calendarView;

    @NonNull
    public final View divider;

    @NonNull
    public final ImageView ivNext;

    @NonNull
    public final ImageView ivPrev;

    @NonNull
    public final LinearLayout llTitle;

    @NonNull
    public final ListTile timeTile;

    @NonNull
    public final TextView tvYearMonth;

    private ViewLayoutTodoCalendarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CalendarView calendarView, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.calendarView = calendarView;
        this.divider = view;
        this.ivNext = imageView;
        this.ivPrev = imageView2;
        this.llTitle = linearLayout;
        this.timeTile = listTile;
        this.tvYearMonth = textView;
    }

    @NonNull
    public static ViewLayoutTodoCalendarBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.calendarView;
        CalendarView calendarView = (CalendarView) ViewBindings.findChildViewById(view, i);
        if (calendarView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
            i = R.id.iv_next;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.iv_prev;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.ll_title;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.time_tile;
                        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile != null) {
                            i = R.id.tv_year_month;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new ViewLayoutTodoCalendarBinding((ConstraintLayout) view, calendarView, viewFindChildViewById, imageView, imageView2, linearLayout, listTile, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewLayoutTodoCalendarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewLayoutTodoCalendarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_layout_todo_calendar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
