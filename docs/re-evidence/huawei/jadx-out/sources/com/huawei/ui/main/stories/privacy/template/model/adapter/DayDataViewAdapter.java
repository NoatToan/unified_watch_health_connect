package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.njy;
import defpackage.qrs;
import defpackage.wig;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DayDataViewAdapter extends RecyclerView.Adapter<a> {
    private static final String e = "DayDataViewAdapter";
    private OnItemClickListener d;
    private OnLongClickListener h;
    private int i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Boolean> f28679a = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28681c = 0;
    private int g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PrivacyDataModel> f28680b = new ArrayList(10);

    public interface OnItemClickListener {
        void onItemClickListener(int i);
    }

    public interface OnLongClickListener {
        void onLongClickListener(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_list_child_item, viewGroup, false);
        viewInflate.findViewById(R.id.privacy_item_rl).setPadding(0, 0, 0, 0);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.d(this.f28680b.get(i));
        if (LanguageUtil.ba(aVar.itemView.getContext())) {
            aVar.f28683c.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        aVar.h.setVisibility(i == this.f28680b.size() + (-1) ? 4 : 0);
        d(aVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28680b.size();
    }

    private void d(a aVar, final int i) {
        aVar.f28682b.setOnClickListener(new View.OnClickListener() { // from class: whg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(i, view);
            }
        });
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: whk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52045a.a(i, view);
            }
        });
        aVar.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: whl
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f52047b.d(i, view);
            }
        });
        if (this.i == 2) {
            aVar.f28683c.setVisibility(8);
            aVar.f28682b.setVisibility(0);
            aVar.f28682b.setChecked(this.f28679a.get(i).booleanValue());
        } else {
            aVar.f28683c.setVisibility(0);
            aVar.f28682b.setVisibility(8);
        }
    }

    public /* synthetic */ void b(int i, View view) {
        d(i);
    }

    public /* synthetic */ void a(int i, View view) {
        d(i);
    }

    public /* synthetic */ boolean d(int i, View view) {
        OnLongClickListener onLongClickListener = this.h;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClickListener(i);
        return true;
    }

    private void d(int i) {
        OnItemClickListener onItemClickListener = this.d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClickListener(i);
        }
    }

    public void a(List<PrivacyDataModel> list) {
        this.f28680b.clear();
        this.f28680b.addAll(list);
        this.f28681c = 0;
        this.g = this.f28680b.size();
        d();
        notifyDataSetChanged();
    }

    public PrivacyDataModel a(int i) {
        if (njy.e(this.f28680b, i)) {
            return new PrivacyDataModel();
        }
        return this.f28680b.get(i);
    }

    public void c(int i) {
        this.i = i;
        if (i == 1) {
            b(false);
        } else {
            notifyDataSetChanged();
        }
    }

    public void b(boolean z) {
        if (z) {
            this.f28681c = this.g;
        } else {
            this.f28681c = 0;
        }
        for (int i = 0; i < this.f28679a.size(); i++) {
            this.f28679a.set(i, Boolean.valueOf(z));
        }
        notifyDataSetChanged();
    }

    public void e(int i) {
        if (njy.e(this.f28679a, i)) {
            LogUtil.d(e, "switchCheckStatus mCheckList isOutOfBounds");
            return;
        }
        Boolean bool = this.f28679a.get(i);
        if (bool.booleanValue()) {
            this.f28681c--;
        } else {
            this.f28681c++;
        }
        this.f28679a.set(i, Boolean.valueOf(!bool.booleanValue()));
        notifyItemChanged(i);
    }

    public List<PrivacyDataModel> e() {
        ArrayList arrayList = new ArrayList(10);
        if (!njy.e(this.f28679a)) {
            for (int i = 0; i < this.f28679a.size(); i++) {
                if (this.f28679a.get(i).booleanValue()) {
                    arrayList.add(this.f28680b.get(i));
                }
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f28681c;
    }

    public int a() {
        return this.g;
    }

    public void e(OnItemClickListener onItemClickListener) {
        this.d = onItemClickListener;
    }

    public void a(OnLongClickListener onLongClickListener) {
        this.h = onLongClickListener;
    }

    public void d() {
        this.f28679a.clear();
        if (njy.e(this.f28680b)) {
            return;
        }
        for (int i = 0; i < this.f28680b.size(); i++) {
            this.f28679a.add(i, false);
        }
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected HealthCheckBox f28682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected ImageView f28683c;
        protected HealthTextView d;
        protected ImageView e;
        protected HealthTextView f;
        protected HealthDivider h;

        a(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.privacy_content_icon);
            this.f = (HealthTextView) view.findViewById(R.id.privacy_content_title);
            this.d = (HealthTextView) view.findViewById(R.id.privacy_time);
            this.h = (HealthDivider) view.findViewById(R.id.data_line);
            this.f28683c = (ImageView) view.findViewById(R.id.content_item_arrow);
            this.f28682b = (HealthCheckBox) view.findViewById(R.id.content_item_check);
        }

        protected void d(PrivacyDataModel privacyDataModel) {
            String string = privacyDataModel.getString("iconResource");
            if (TextUtils.isEmpty(string)) {
                this.e.setVisibility(8);
            } else {
                c(privacyDataModel);
                this.e.setVisibility(0);
                try {
                    this.e.setBackground(wig.e(Integer.parseInt(string)));
                } catch (NumberFormatException e) {
                    LogUtil.c(DayDataViewAdapter.e, e.getMessage());
                }
            }
            this.f.setText(privacyDataModel.getDataTitle());
            this.d.setText(privacyDataModel.getDataDesc());
            d();
        }

        private void c(PrivacyDataModel privacyDataModel) {
            String string = privacyDataModel.getString("iconResource");
            if (qrs.u() && !TextUtils.isEmpty(string) && privacyDataModel.getPageType() == 103) {
                this.itemView.findViewById(R.id.privacy_data_layout).setVisibility(8);
                this.itemView.findViewById(R.id.privacy_data_layout_large).setVisibility(0);
                this.e = (ImageView) this.itemView.findViewById(R.id.privacy_content_icon_large);
                this.f = (HealthTextView) this.itemView.findViewById(R.id.privacy_content_title_large);
                RelativeLayout relativeLayout = (RelativeLayout) this.itemView.findViewById(R.id.time_text_relativelayout);
                relativeLayout.setVisibility(0);
                this.itemView.findViewById(R.id.time_arrow_checkbox).setVisibility(8);
                this.d = (HealthTextView) relativeLayout.findViewById(R.id.privacy_time_large);
                this.f28683c = (ImageView) relativeLayout.findViewById(R.id.content_item_arrow_large);
                this.f28682b = (HealthCheckBox) relativeLayout.findViewById(R.id.content_item_check_large);
            }
        }

        private void d() {
            HealthTextView healthTextView = this.f;
            if (healthTextView == null) {
                return;
            }
            healthTextView.post(new Runnable() { // from class: com.huawei.ui.main.stories.privacy.template.model.adapter.DayDataViewAdapter.a.3
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f == null || a.this.h == null) {
                        return;
                    }
                    int left = a.this.f.getLeft();
                    ViewGroup.LayoutParams layoutParams = a.this.h.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(left);
                    }
                    a.this.h.setLayoutParams(layoutParams);
                }
            });
        }
    }
}
