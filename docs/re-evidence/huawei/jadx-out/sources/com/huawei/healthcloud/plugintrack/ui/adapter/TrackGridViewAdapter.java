package com.huawei.healthcloud.plugintrack.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class TrackGridViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<TrackMainFragmentShowType, b> f11002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnItemClickListener f11003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<b> f11004c;
    private boolean d;
    private Context e;

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public TrackGridViewAdapter(Context context, List<b> list) {
        this.e = context;
        this.f11004c = list;
        this.f11002a = a(list);
    }

    public TrackGridViewAdapter(Context context, List<b> list, boolean z) {
        this(context, list);
        this.d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<b> list = this.f11004c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.e).inflate(R.layout.track_data_item_with_icon_layout, (ViewGroup) null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        if (this.e == null) {
            LogUtil.e("TrackGridViewAdapter", "onBindViewHolder: mContext is null");
            return;
        }
        ImageView imageView = viewHolder.d;
        HealthTextView healthTextView = viewHolder.f11006c;
        c(this.f11004c.get(i), imageView);
        if (healthTextView != null) {
            healthTextView.setText(this.f11004c.get(i).b());
            if (this.d) {
                healthTextView.setTextColor(this.e.getResources().getColor(R.color.textColorSecondaryInverse));
            }
            if (qrs.af(this.e)) {
                healthTextView.setMaxLines(2);
            } else {
                healthTextView.setMaxLines(3);
            }
            if (!LanguageUtil.l(BaseApplication.getContext())) {
                healthTextView.setTextSize(1, 9.0f);
            }
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.adapter.TrackGridViewAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TrackGridViewAdapter.this.f11003b != null) {
                    TrackGridViewAdapter.this.f11003b.onItemClick(view, viewHolder.getBindingAdapterPosition());
                }
            }
        });
    }

    public b b(int i) {
        if (njy.e(this.f11004c, i)) {
            return null;
        }
        return this.f11004c.get(i);
    }

    private void c(b bVar, ImageView imageView) {
        Drawable drawableC;
        if (bVar == null || imageView == null) {
            return;
        }
        Resources resources = BaseApplication.getContext().getResources();
        if (bVar.d()) {
            drawableC = resources.getDrawable(bVar.e());
        } else {
            drawableC = qqf.c(resources.getDrawable(bVar.a()), resources.getColor(this.d ? R.color.healthTintColorPrimaryDark : R.color.healthTintColorPrimary));
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            BitmapDrawable bitmapDrawableE = qqz.e(BaseApplication.getContext(), drawableC);
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        imageView.setImageDrawable(drawableC);
    }

    public void e() {
        if (njy.e(this.f11004c)) {
            return;
        }
        for (b bVar : this.f11004c) {
            if (bVar != null) {
                bVar.c(false);
            }
        }
    }

    private Map<TrackMainFragmentShowType, b> a(List<b> list) {
        if (njy.e(list)) {
            return null;
        }
        HashMap map = new HashMap(list.size());
        for (b bVar : list) {
            if (bVar != null) {
                map.put(bVar.f11007a, bVar);
            }
        }
        return map;
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.f11003b = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f11006c;
        private ImageView d;

        ViewHolder(View view) {
            super(view);
            this.d = (ImageView) view.findViewById(R.id.icon);
            this.f11006c = (HealthTextView) view.findViewById(R.id.text);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TrackMainFragmentShowType f11007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11008b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11009c;
        private int d;
        private int e;

        public b(int i, int i2, int i3, TrackMainFragmentShowType trackMainFragmentShowType) {
            this.e = i;
            this.d = i2;
            this.f11009c = i3;
            this.f11007a = trackMainFragmentShowType;
        }

        public int a() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public int b() {
            return this.f11009c;
        }

        public void c(boolean z) {
            this.f11008b = z;
        }

        public boolean d() {
            return this.f11008b;
        }

        public TrackMainFragmentShowType c() {
            return this.f11007a;
        }
    }
}
