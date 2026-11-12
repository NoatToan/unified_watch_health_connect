package com.huawei.ui.device.views.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class MenuListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, ImageView> f25009a = new HashMap<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f25010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MusicMenu> f25011c;
    private ViewHolder d;
    private OnItemClickListener e;
    private View f;

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    public MenuListAdapter(Context context, List<MusicMenu> list) {
        this.f25011c = new ArrayList(16);
        this.f25010b = LayoutInflater.from(context);
        this.f25011c = list;
    }

    public List<MusicMenu> d() {
        return this.f25011c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<MusicMenu> list = this.f25011c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f = this.f25010b.inflate(R.layout.menu_item_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(this.f);
        this.d = viewHolder;
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        List<MusicMenu> list = this.f25011c;
        if (list == null || list.isEmpty() || i < 0 || i >= this.f25011c.size()) {
            return;
        }
        viewHolder.a(this.f25011c.get(i), i);
    }

    public void a(int i) {
        for (int i2 = 0; i2 < this.f25009a.size(); i2++) {
            if (i2 == i) {
                this.f25009a.get("" + i2).setImageResource(R.drawable.btn_health_list_radio_sel);
            } else {
                this.f25009a.get("" + i2).setImageResource(R.drawable.btn_health_list_radio_nor);
            }
        }
    }

    public void e(OnItemClickListener onItemClickListener) {
        this.e = onItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f25012a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f25014c;
        private HealthTextView e;

        public ViewHolder(View view) {
            super(view);
            this.e = (HealthTextView) MenuListAdapter.this.f.findViewById(R.id.item_menu_name);
            this.f25014c = MenuListAdapter.this.f.findViewById(R.id.item_menu_line);
            this.f25012a = (ImageView) MenuListAdapter.this.f.findViewById(R.id.radio_picture);
        }

        public void a(MusicMenu musicMenu, final int i) {
            if (musicMenu == null) {
                return;
            }
            this.e.setText(musicMenu.getMenuName());
            MenuListAdapter.this.f25009a.put("" + i, this.f25012a);
            if (i == MenuListAdapter.this.f25011c.size() - 1) {
                this.f25014c.setVisibility(8);
            } else {
                this.f25014c.setVisibility(0);
            }
            MenuListAdapter.this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.music.MenuListAdapter.ViewHolder.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (MenuListAdapter.this.e != null) {
                        MenuListAdapter.this.e.onItemClick(MenuListAdapter.this.f, i);
                    }
                }
            });
        }
    }
}
