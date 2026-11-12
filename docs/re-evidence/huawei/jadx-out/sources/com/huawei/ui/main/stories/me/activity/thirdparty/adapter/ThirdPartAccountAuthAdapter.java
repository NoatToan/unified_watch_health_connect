package com.huawei.ui.main.stories.me.activity.thirdparty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qqf;
import defpackage.vvq;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ThirdPartAccountAuthAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<vvq> f28506c;
    private List<Boolean> d;
    private CheckButtonClickListener e = null;

    public interface CheckButtonClickListener {
        void onCheckButtonClick(int i, boolean z, List<vvq> list);
    }

    public ThirdPartAccountAuthAdapter(List<vvq> list, String str, List<Boolean> list2) {
        this.f28506c = list;
        this.f28504a = str;
        this.d = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (njy.e(this.f28506c, i)) {
            LogUtil.d("ThirdPartAccountAuthAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        vvq vvqVar = this.f28506c.get(i);
        LogUtil.d("ThirdPartAccountAuthAdapter", "onBindViewHolder position = ", Integer.valueOf(i), ", and data = ", vvqVar.toString());
        if (viewHolder instanceof IconViewHolder) {
            b((IconViewHolder) viewHolder, vvqVar);
        } else if (viewHolder instanceof ContentViewHolder) {
            d((ContentViewHolder) viewHolder, i, vvqVar);
        } else {
            LogUtil.d("ThirdPartAccountAuthAdapter", "holder isOutOfBounds");
        }
    }

    private void b(IconViewHolder iconViewHolder, vvq vvqVar) {
        iconViewHolder.d.setText(this.f28504a);
        iconViewHolder.f28514c.setText(this.f28505b.getString(R.string.IDS_third_part_auth_head_note, this.f28504a));
        iconViewHolder.f28512a.setText(this.f28505b.getString(R.string.IDS_third_part_auth_date, vvqVar.c()));
        qqf.e(vvqVar.b(), RequestOptions.bitmapTransform(new RoundedCorners((int) this.f28505b.getResources().getDimension(R.dimen.defaultCornerRadiusM))), iconViewHolder.f28513b);
    }

    private void d(ContentViewHolder contentViewHolder, final int i, vvq vvqVar) {
        if (vvqVar.i()) {
            contentViewHolder.e.setVisibility(0);
            a(contentViewHolder.f28510a, vvqVar.f());
        } else if (vvqVar.e() == 1) {
            contentViewHolder.e.setVisibility(8);
            contentViewHolder.f28510a.setVisibility(8);
        } else {
            LogUtil.a("ThirdPartAccountAuthAdapter", "buildContentViewHolder other condition");
        }
        contentViewHolder.d.setText(vvqVar.a());
        contentViewHolder.f28511b.setOnCheckedChangeListener(null);
        contentViewHolder.f28511b.setChecked(vvqVar.g());
        if (vvqVar.e() == 3) {
            contentViewHolder.f28511b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAccountAuthAdapter$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f28507a.e(i, compoundButton, z);
                }
            });
        } else if (vvqVar.e() == 1) {
            contentViewHolder.f28511b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAccountAuthAdapter$$ExternalSyntheticLambda1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f28509b.c(i, compoundButton, z);
                }
            });
        } else {
            LogUtil.a("ThirdPartAccountAuthAdapter", "buildContentViewHolder other condition");
        }
    }

    /* synthetic */ void e(int i, CompoundButton compoundButton, boolean z) {
        c(z);
        this.e.onCheckButtonClick(i, d(), this.f28506c);
    }

    /* synthetic */ void c(int i, CompoundButton compoundButton, boolean z) {
        e(i, z);
        this.e.onCheckButtonClick(i, d(), this.f28506c);
    }

    private void a(HealthSubHeader healthSubHeader, int i) {
        if (healthSubHeader == null) {
            LogUtil.e("ThirdPartAccountAuthAdapter", "setTitleText null header");
            return;
        }
        healthSubHeader.setVisibility(0);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        if (i == 0) {
            healthSubHeader.setHeadTitleText(this.f28505b.getString(R.string.IDS_hw_show_main_permission_app_read, this.f28504a));
        } else if (i != 1) {
            LogUtil.j("ThirdPartAccountAuthAdapter", "handleFirstContentItem unexpected operationType");
        } else {
            healthSubHeader.setHeadTitleText(this.f28505b.getString(R.string.IDS_hw_show_main_permission_app_write, this.f28504a));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f28505b == null) {
            this.f28505b = viewGroup.getContext();
        }
        if (i == 0) {
            return new IconViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_account_auth_icon, viewGroup, false));
        }
        if (i == 1) {
            return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_account_auth_dot_item, viewGroup, false));
        }
        if (i == 3) {
            return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_account_auth_item, viewGroup, false));
        }
        LogUtil.a("ThirdPartAccountAuthAdapter", "viewType default branch");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<vvq> list = this.f28506c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f28506c, i)) {
            LogUtil.d("ThirdPartAccountAuthAdapter", "getItemViewType isOutOfBounds");
            return -1;
        }
        return this.f28506c.get(i).e();
    }

    public static class IconViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f28512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f28513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f28514c;
        HealthTextView d;

        public IconViewHolder(View view) {
            super(view);
            this.f28513b = (ImageView) view.findViewById(R.id.iv_third_party_account_auth_app_icon);
            this.d = (HealthTextView) view.findViewById(R.id.third_party_account_auth_app_name);
            this.f28512a = (HealthTextView) view.findViewById(R.id.third_party_account_auth_app_date);
            this.f28514c = (HealthTextView) view.findViewById(R.id.third_party_account_head_note);
        }
    }

    public static class ContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthSubHeader f28510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthCheckBox f28511b;
        HealthTextView d;
        View e;

        public ContentViewHolder(View view) {
            super(view);
            this.e = view.findViewById(R.id.third_party_account_auth_splitter_only);
            this.f28510a = (HealthSubHeader) view.findViewById(R.id.third_party_auth_header_view);
            this.f28511b = (HealthCheckBox) view.findViewById(R.id.csb_switch_button);
            this.d = (HealthTextView) view.findViewById(R.id.htv_item_name);
        }
    }

    public boolean d() {
        if (this.f28506c == null) {
            return false;
        }
        for (int i = 0; i < this.f28506c.size(); i++) {
            if (!this.d.get(i).equals(Boolean.valueOf(this.f28506c.get(i).g()))) {
                return true;
            }
        }
        return false;
    }

    private void c(boolean z) {
        if (njy.e(this.f28506c)) {
            return;
        }
        for (vvq vvqVar : this.f28506c) {
            if (vvqVar != null) {
                vvqVar.d(z);
            }
        }
        notifyDataSetChanged();
    }

    private void e(int i, boolean z) {
        if (njy.e(this.f28506c) || njy.e(this.f28506c, i) || this.f28506c.get(i) == null) {
            return;
        }
        this.f28506c.get(i).d(z);
        if (!z) {
            b();
        } else {
            boolean z2 = false;
            for (vvq vvqVar : this.f28506c) {
                if (vvqVar != null) {
                    if (vvqVar.g() || (vvqVar.e() != 1 && vvqVar.e() != 4)) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                b(true);
            }
        }
        notifyDataSetChanged();
    }

    private void b() {
        for (vvq vvqVar : this.f28506c) {
            if (vvqVar != null && (vvqVar.e() == 3 || vvqVar.e() == 0)) {
                if (vvqVar.g()) {
                    vvqVar.d(false);
                }
            }
        }
    }

    private void b(boolean z) {
        for (vvq vvqVar : this.f28506c) {
            if (vvqVar != null && (vvqVar.e() == 3 || vvqVar.e() == 0)) {
                vvqVar.d(z);
            }
        }
    }

    public void d(CheckButtonClickListener checkButtonClickListener) {
        this.e = checkButtonClickListener;
    }
}
