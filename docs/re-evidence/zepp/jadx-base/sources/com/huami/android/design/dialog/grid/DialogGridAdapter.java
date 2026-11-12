package com.huami.android.design.dialog.grid;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.R;

/* JADX INFO: loaded from: classes4.dex */
public class DialogGridAdapter extends RecyclerView.Adapter<VH> {
    private final int[] a;
    private String[] b;

    public static class VH extends RecyclerView.ViewHolder {
        private final ImageView a;
        private TextView b;

        public VH(@NonNull View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.dialog_grid_icon);
            this.b = (TextView) view.findViewById(R.id.dialog_grid_desc);
        }
    }

    public DialogGridAdapter(int[] iArr) {
        this.a = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull VH vh, int i) {
        int[] iArr = this.a;
        if (iArr != null && iArr[i] != -1) {
            vh.a.setImageResource(this.a[i]);
        }
        String[] strArr = this.b;
        if (strArr == null || TextUtils.isEmpty(strArr[i])) {
            return;
        }
        vh.b.setText(this.b[i]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new VH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialog_grid_item, viewGroup, false));
    }
}
