package com.huawei.featureuserprofile.route.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.route.adapter.RouteTypeAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RouteTypeAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LayoutInflater f5642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f5643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnItemClickListener f5644c;
    private int e;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public RouteTypeAdapter(Context context, List<String> list) {
        this.f5643b = list;
        this.f5642a = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.f5642a.inflate(R.layout.route_list_item_single_choice, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        List<String> list;
        if (aVar == null || (list = this.f5643b) == null) {
            LogUtil.j("Track_RouteTypeAdapter", "onBindViewHolder holder null or mRouteTypeList null");
            return;
        }
        aVar.c(this.f5643b.get(i), i == this.e, i != list.size() - 1);
        aVar.d(this.f5644c, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f5643b;
        if (list == null) {
            LogUtil.j("Track_RouteTypeAdapter", "mRouteTypeList null");
            return 0;
        }
        return list.size();
    }

    public void e(int i) {
        notifyItemChanged(this.e);
        notifyItemChanged(i);
        this.e = i;
    }

    public void b(OnItemClickListener onItemClickListener) {
        this.f5644c = onItemClickListener;
    }

    public static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f5645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f5646b;
        private final HealthDivider d;
        private final HealthRadioButton e;

        a(View view) {
            super(view);
            this.f5646b = view;
            this.f5645a = (HealthTextView) view.findViewById(R.id.htv_item_text);
            this.e = (HealthRadioButton) view.findViewById(R.id.hcb_item_radio_button);
            this.d = (HealthDivider) view.findViewById(R.id.divide_line);
        }

        public void c(String str, boolean z, boolean z2) {
            if (str == null) {
                LogUtil.j("Track_RouteTypeAdapter", "onBindDataForView distanceEntity null");
                return;
            }
            this.f5645a.setText(str);
            this.e.setChecked(z);
            if (z2) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
        }

        public void d(final OnItemClickListener onItemClickListener, final int i) {
            this.f5646b.setOnClickListener(new View.OnClickListener() { // from class: cxn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RouteTypeAdapter.a.c(onItemClickListener, i, view);
                }
            });
        }

        public static /* synthetic */ void c(OnItemClickListener onItemClickListener, int i, View view) {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(i);
            }
        }
    }
}
