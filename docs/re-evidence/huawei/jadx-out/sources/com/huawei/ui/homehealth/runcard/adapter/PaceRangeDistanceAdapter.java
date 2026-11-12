package com.huawei.ui.homehealth.runcard.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.homehealth.R;
import defpackage.ddz;

/* JADX INFO: loaded from: classes17.dex */
public class PaceRangeDistanceAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f25841a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnItemClickListener f25842c;
    private SparseArray<ddz> d;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public PaceRangeDistanceAdapter(Context context, SparseArray<ddz> sparseArray) {
        this.d = sparseArray;
        this.f25841a = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(this.f25841a.inflate(R.layout.custom_list_item_single_choice, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        SparseArray<ddz> sparseArray;
        if (cVar == null || (sparseArray = this.d) == null) {
            LogUtil.j("Track_PaceRangeDistanceAdapter", "onBindViewHolder holder null or mDistanceList null");
            return;
        }
        boolean z = i != sparseArray.size() - 1;
        int iKeyAt = this.d.keyAt(i);
        cVar.b(this.d.get(iKeyAt), z);
        cVar.d(this.f25842c, iKeyAt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        SparseArray<ddz> sparseArray = this.d;
        if (sparseArray == null) {
            LogUtil.j("Track_PaceRangeDistanceAdapter", "mDistanceList null");
            return 0;
        }
        return sparseArray.size();
    }

    public void c(OnItemClickListener onItemClickListener) {
        this.f25842c = onItemClickListener;
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDivider f25843a;
        private View d;
        private CheckedTextView e;

        c(View view) {
            super(view);
            this.d = view;
            this.e = (CheckedTextView) view.findViewById(R.id.text1);
            this.f25843a = (HealthDivider) view.findViewById(R.id.divide_line);
        }

        public void b(ddz ddzVar, boolean z) {
            if (ddzVar == null) {
                LogUtil.j("Track_PaceRangeDistanceAdapter", "onBindDataForView distanceEntity null");
                return;
            }
            this.e.setChecked(ddzVar.j());
            this.e.setText(ddzVar.c());
            if (z) {
                this.f25843a.setVisibility(0);
            } else {
                this.f25843a.setVisibility(8);
            }
        }

        public void d(final OnItemClickListener onItemClickListener, final int i) {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.adapter.PaceRangeDistanceAdapter.c.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    OnItemClickListener onItemClickListener2 = onItemClickListener;
                    if (onItemClickListener2 != null) {
                        onItemClickListener2.onItemClick(i);
                    }
                }
            });
        }
    }
}
