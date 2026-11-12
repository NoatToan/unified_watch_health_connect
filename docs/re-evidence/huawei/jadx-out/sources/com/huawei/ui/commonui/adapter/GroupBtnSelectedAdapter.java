package com.huawei.ui.commonui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.button.HealthButton;
import defpackage.lrd;
import defpackage.njy;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class GroupBtnSelectedAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f23272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f23273c;
    private int d;
    private Drawable e;
    private int f;
    private Context g;
    private OnItemClickListener i;
    private boolean[] j;

    public interface OnItemClickListener {
        void onItemClick(View view, HealthButton healthButton, int i);
    }

    public GroupBtnSelectedAdapter(Context context, String[] strArr, boolean[] zArr) {
        this(context, strArr, zArr, R.layout.item_train_date_select);
    }

    public GroupBtnSelectedAdapter(Context context, String[] strArr, boolean[] zArr, int i) {
        this.g = context;
        a(strArr);
        a(zArr);
        this.f = i;
        b();
    }

    private void a(String[] strArr) {
        if (strArr == null) {
            return;
        }
        this.f23272b = strArr;
    }

    private void a(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        this.j = zArr;
    }

    private void b() {
        this.e = this.g.getResources().getDrawable(R.drawable.blood_pressure_plan_selected_bg);
        this.d = this.g.getResources().getColor(R.color.textColorPrimaryInverse);
        this.f23273c = this.g.getResources().getDrawable(R.drawable.train_date_unselect_bg);
        this.f23271a = this.g.getResources().getColor(R.color.textColorPrimary);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.g).inflate(this.f, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        if (njy.e(this.f23272b, i)) {
            LogUtil.j("Suggestion_GroupBtnSelectedAdapter", "onBindViewHolder position out of bounds.");
            return;
        }
        viewHolder.e.setText(this.f23272b[i]);
        d(viewHolder.itemView, viewHolder.e, i);
        viewHolder.e.setOnClickListener(new View.OnClickListener() { // from class: qiz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46292c.c(viewHolder, i, view);
            }
        });
    }

    public /* synthetic */ void c(ViewHolder viewHolder, int i, View view) {
        this.i.onItemClick(viewHolder.itemView, viewHolder.e, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        String[] strArr = this.f23272b;
        if (strArr == null || strArr.length <= 0) {
            return 0;
        }
        return strArr.length;
    }

    public void d(View view, HealthButton healthButton, int i) {
        if (healthButton == null) {
            ReleaseLogUtil.d("Suggestion_GroupBtnSelectedAdapter", "changeSelectStatus button is null");
            return;
        }
        boolean[] zArr = this.j;
        if (zArr == null || i < 0 || i >= zArr.length) {
            ReleaseLogUtil.d("Suggestion_GroupBtnSelectedAdapter", "changeSelectStatus mIsSelectedArrays ", zArr, " position ", Integer.valueOf(i));
            return;
        }
        if (zArr[i]) {
            healthButton.setBackground(this.e);
            healthButton.setTextColor(this.d);
        } else {
            healthButton.setBackground(this.f23273c);
            healthButton.setTextColor(this.f23271a);
        }
        if (njy.e(this.f23272b, i)) {
            ReleaseLogUtil.d("Suggestion_GroupBtnSelectedAdapter", "changeSelectStatus position ", Integer.valueOf(i), " mBtnNames ", this.f23272b);
        } else {
            lrd.c(view, this.f23272b[i], this.j[i], (Class<?>) CheckBox.class);
        }
    }

    public void c(Drawable drawable, int i) {
        this.f23273c = drawable;
        this.f23271a = i;
    }

    public void d(Drawable drawable, int i) {
        this.e = drawable;
        this.d = i;
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.i = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private HealthButton e;

        public ViewHolder(View view) {
            super(view);
            this.e = (HealthButton) view.findViewById(R.id.btn_text);
        }
    }
}
