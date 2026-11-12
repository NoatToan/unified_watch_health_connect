package com.huawei.pluginachievement.ui.level;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.LevelInfoDesc;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.njy;
import defpackage.pbn;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class LevelHorizontalRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Pair<Integer, Integer> f22235a = BaseActivity.getSafeRegionWidth();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22236b;
    private List<LevelInfoDesc> e;

    public LevelHorizontalRecyclerViewAdapter(Context context, List<LevelInfoDesc> list) {
        this.e = list;
        this.f22236b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f22236b).inflate(R.layout.level_horizontal_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        b(viewHolder.itemView, i, getItemCount());
        if (njy.e(this.e, i)) {
            return;
        }
        viewHolder.f22237a.setImageResource(this.e.get(i).getBadgeImage());
    }

    private void b(View view, int i, int i2) {
        int iB = pbn.b(view.getContext());
        view.setPadding(iB - ((Integer) this.f22235a.first).intValue(), 0, iB - ((Integer) this.f22235a.second).intValue(), 0);
        int iA = iB + (pbn.a(view.getContext()) / 2);
        int i3 = i == 0 ? iA : 0;
        int i4 = i == i2 + (-1) ? iA : 0;
        if (LanguageUtil.ba(view.getContext())) {
            b(view, i4, 0, i3, 0);
        } else {
            b(view, i3, 0, i4, 0);
        }
    }

    private void b(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f22237a;

        public ViewHolder(View view) {
            super(view);
            this.f22237a = (ImageView) view.findViewById(R.id.iv_big);
        }
    }
}
