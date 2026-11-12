package com.huami.phone_call.sms.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.phone_call.sms.R;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class ItemCallReplyMsgWithMenuBinding implements ViewBinding {

    @NonNull
    private final SwipeMenuLayout a;

    @NonNull
    public final ItemSmsBinding smContentView;

    @NonNull
    public final ItemSmsMenuBinding smMenuView;

    private ItemCallReplyMsgWithMenuBinding(@NonNull SwipeMenuLayout swipeMenuLayout, @NonNull ItemSmsBinding itemSmsBinding, @NonNull ItemSmsMenuBinding itemSmsMenuBinding) {
        this.a = swipeMenuLayout;
        this.smContentView = itemSmsBinding;
        this.smMenuView = itemSmsMenuBinding;
    }

    @NonNull
    public static ItemCallReplyMsgWithMenuBinding bind(@NonNull View view) {
        int i = R.id.smContentView;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            ItemSmsBinding itemSmsBindingBind = ItemSmsBinding.bind(viewFindChildViewById);
            int i2 = R.id.smMenuView;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new ItemCallReplyMsgWithMenuBinding((SwipeMenuLayout) view, itemSmsBindingBind, ItemSmsMenuBinding.bind(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemCallReplyMsgWithMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemCallReplyMsgWithMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_call_reply_msg_with_menu, viewGroup, false);
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
