package com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.rcx;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class MenuDragListAdapter extends RecyclerView.Adapter<SlideViewHolder> implements ItemTouchHelperAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RefreshUiCallback f25062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<Integer> f25063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25064c;
    private final LayoutInflater e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public MenuDragListAdapter(Context context, List<Integer> list, RefreshUiCallback refreshUiCallback) {
        this.f25062a = null;
        this.f25064c = context;
        this.f25063b = list;
        this.e = LayoutInflater.from(context);
        this.f25062a = refreshUiCallback;
    }

    public void c(List<Integer> list) {
        this.f25063b = list;
    }

    public static class SlideViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RelativeLayout f25067c;
        private HealthTextView d;

        public SlideViewHolder(View view) {
            super(view);
            this.d = (HealthTextView) view.findViewById(R.id.itemText);
            this.f25067c = (RelativeLayout) view.findViewById(R.id.item_menu_close);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SlideViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SlideViewHolder(this.e.inflate(R.layout.activity_one_level_menu_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SlideViewHolder slideViewHolder, final int i) {
        slideViewHolder.d.setText(rcx.c().a(this.f25064c, this.f25063b.get(i).intValue()));
        slideViewHolder.f25067c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview.MenuDragListAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MenuDragListAdapter.this.f25063b != null && i >= 0 && MenuDragListAdapter.this.f25063b.size() > i) {
                    MenuDragListAdapter.this.f25063b.remove(i);
                }
                MenuDragListAdapter.this.notifyDataSetChanged();
                MenuDragListAdapter.this.f25062a.refreshUi();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25063b.size();
    }

    @Override // com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview.ItemTouchHelperAdapter
    public void onItemMove(int i, int i2) {
        List<Integer> list = this.f25063b;
        if (list == null) {
            LogUtil.j("MenuDragListAdapter", "onItemMove mDataList is null");
            return;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("MenuDragListAdapter", "onItemMove fromPosition IndexOutOfBoundsException");
        } else if (i2 < 0 || i2 >= this.f25063b.size()) {
            LogUtil.j("MenuDragListAdapter", "onItemMove toPosition IndexOutOfBoundsException");
        } else {
            Collections.swap(this.f25063b, i, i2);
            notifyItemMoved(i, i2);
        }
    }
}
