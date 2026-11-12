package com.huawei.health.suggestion.ui.run.holder;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.ui.commonui.divider.HealthDivider;

/* JADX INFO: loaded from: classes9.dex */
public class RadioViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f10004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDivider f10005c;
    private CheckedTextView e;

    public interface OnItemClickListener {
        void onItemClick(int i);
    }

    public RadioViewHolder(View view) {
        super(view);
        this.f10004b = view;
        this.e = (CheckedTextView) view.findViewById(R.id.choiceRadio);
        this.f10005c = (HealthDivider) view.findViewById(R.id.divide_line);
    }

    public void c(String str, boolean z, boolean z2) {
        this.e.setChecked(z);
        this.e.setText(str);
        if (z2) {
            this.f10005c.setVisibility(0);
        } else {
            this.f10005c.setVisibility(8);
        }
    }

    public void c(final OnItemClickListener onItemClickListener, final int i) {
        this.f10004b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.holder.RadioViewHolder.5
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
