package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemTodoWithMenuBinding implements ViewBinding {

    @NonNull
    private final SwipeMenuLayout a;

    @NonNull
    public final ItemTodoBinding smContentView;

    @NonNull
    public final ItemMenuEditDeleteBinding smMenuView;

    private ItemTodoWithMenuBinding(@NonNull SwipeMenuLayout swipeMenuLayout, @NonNull ItemTodoBinding itemTodoBinding, @NonNull ItemMenuEditDeleteBinding itemMenuEditDeleteBinding) {
        this.a = swipeMenuLayout;
        this.smContentView = itemTodoBinding;
        this.smMenuView = itemMenuEditDeleteBinding;
    }

    @NonNull
    public static ItemTodoWithMenuBinding bind(@NonNull View view) {
        int i = R.id.smContentView;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            ItemTodoBinding itemTodoBindingBind = ItemTodoBinding.bind(viewFindChildViewById);
            int i2 = R.id.smMenuView;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new ItemTodoWithMenuBinding((SwipeMenuLayout) view, itemTodoBindingBind, ItemMenuEditDeleteBinding.bind(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemTodoWithMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemTodoWithMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_todo_with_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeMenuLayout getRoot() {
        return this.a;
    }
}
