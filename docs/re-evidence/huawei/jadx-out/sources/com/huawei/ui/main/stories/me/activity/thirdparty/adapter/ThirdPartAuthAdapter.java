package com.huawei.ui.main.stories.me.activity.thirdparty.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.vvr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ThirdPartAuthAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, Integer> f28515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28517c;
    private List<vvr> d;
    private List<Boolean> e;
    private String f;
    private SetSwitchButtonChanged g = null;

    public interface SetSwitchButtonChanged {
        void switchButtonChanged(boolean z, List<vvr> list);
    }

    public ThirdPartAuthAdapter(List<vvr> list, String str, String str2, List<Boolean> list2) {
        this.d = list;
        this.f28516b = str2;
        this.f = str;
        this.e = list2;
        c();
    }

    private void c() {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        this.f28515a = map;
        map.put(101001, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_profile_basic_information));
        this.f28515a.put(101002, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_profile_basic_feature));
        this.f28515a.put(101201, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_device_information));
        this.f28515a.put(101003, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_realtime_sport_data));
        this.f28515a.put(101202, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_device_data));
        this.f28515a.put(101204, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_device_advanced_control));
        this.f28515a.put(30005, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_track));
        this.f28515a.put(30006, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_track));
        this.f28515a.put(30007, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_track));
        this.f28515a.put(10008, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_stat_heart_rate));
        this.f28515a.put(50001, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_heart_rate));
        this.f28515a.put(10006, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_weight));
        this.f28515a.put(10007, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_sleep));
        this.f28515a.put(44000, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_sleep));
        this.f28515a.put(31001, Integer.valueOf(R.string.IDS_permission_desc_heart_health));
        this.f28515a.put(101000, Integer.valueOf(R.string.IDS_hw_show_main_permission_app_sync_sub));
        this.f28515a.put(10010, Integer.valueOf(R.string.IDS_hw_show_main_permission_sub_content_user_menstruation));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (njy.e(this.d, i)) {
            LogUtil.d("ThirdPartAuthAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        vvr vvrVar = this.d.get(i);
        LogUtil.d("ThirdPartAuthAdapter", "onBindViewHolder position = ", Integer.valueOf(i), ", and data = ", vvrVar.toString());
        if (viewHolder instanceof IconViewHolder) {
            LogUtil.d("ThirdPartAuthAdapter", "onBindViewHolder IconViewHolder ");
            ((IconViewHolder) viewHolder).f28523a.setVisibility(0);
            b(viewHolder, vvrVar);
        } else if (viewHolder instanceof e) {
            c(viewHolder, vvrVar);
        } else {
            b((ContentViewHolder) viewHolder, i, vvrVar);
        }
    }

    private void b(RecyclerView.ViewHolder viewHolder, vvr vvrVar) {
        IconViewHolder iconViewHolder = (IconViewHolder) viewHolder;
        iconViewHolder.f28525c.setText(this.f28516b);
        iconViewHolder.e.setText(this.f28517c.getString(R.string.IDS_third_part_auth_head_note, this.f28516b));
        iconViewHolder.d.setImageDrawable(vvrVar.b());
        if (vvrVar.h() && vvrVar.a() != null) {
            iconViewHolder.f28524b.setText(this.f28517c.getString(R.string.IDS_third_part_auth_date, vvrVar.a()));
        } else {
            iconViewHolder.f28524b.setVisibility(8);
        }
    }

    private void c(RecyclerView.ViewHolder viewHolder, vvr vvrVar) {
        e eVar = (e) viewHolder;
        if ("TYPE_TWO".equals(this.f) && !vvrVar.j()) {
            eVar.f28526b.setVisibility(8);
        } else {
            LogUtil.e("ThirdPartAuthAdapter", "unrecognized bottomType");
        }
    }

    private void b(ContentViewHolder contentViewHolder, final int i, vvr vvrVar) {
        LogUtil.a("ThirdPartAuthAdapter", "HiHealthUserPermission Visibility= ", Boolean.valueOf(vvrVar.j()));
        if (vvrVar.j()) {
            c(vvrVar, contentViewHolder);
        } else if (vvrVar.e() == 4) {
            contentViewHolder.d.setVisibility(8);
            contentViewHolder.f28520a.setVisibility(8);
        } else {
            contentViewHolder.e.setVisibility(8);
        }
        contentViewHolder.f28521b.setText(vvrVar.c());
        d(contentViewHolder.h, vvrVar.d());
        contentViewHolder.f28522c.setOnCheckedChangeListener(null);
        contentViewHolder.f28522c.setChecked(vvrVar.i());
        if (vvrVar.e() == 3) {
            contentViewHolder.f28522c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAuthAdapter$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f28518b.a(compoundButton, z);
                }
            });
        } else if (vvrVar.e() == 1 || vvrVar.e() == 4) {
            contentViewHolder.f28522c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAuthAdapter$$ExternalSyntheticLambda1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.d.e(i, compoundButton, z);
                }
            });
        } else {
            LogUtil.a("ThirdPartAuthAdapter", "buildContentViewHolder other condition");
        }
    }

    /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        d(z);
        this.g.switchButtonChanged(a(), this.d);
    }

    /* synthetic */ void e(int i, CompoundButton compoundButton, boolean z) {
        c(i, z);
        this.g.switchButtonChanged(a(), this.d);
    }

    public boolean a() {
        if (this.d == null) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!this.e.get(i).equals(Boolean.valueOf(this.d.get(i).i()))) {
                return true;
            }
        }
        return false;
    }

    private void c(vvr vvrVar, ContentViewHolder contentViewHolder) {
        if (vvrVar.g() == 2) {
            contentViewHolder.d.setVisibility(0);
            contentViewHolder.f28520a.setVisibility(8);
        } else if (vvrVar.e() == 1) {
            e(contentViewHolder.e, vvrVar.g());
        } else if (vvrVar.e() == 4) {
            e(contentViewHolder.f28520a, vvrVar.g());
            contentViewHolder.d.setVisibility(0);
        } else {
            LogUtil.a("ThirdPartAuthAdapter", "handleFirstContentItem unexpected ViewType");
        }
    }

    private void e(HealthSubHeader healthSubHeader, int i) {
        if (healthSubHeader == null) {
            LogUtil.e("ThirdPartAuthAdapter", "setTitleText null header");
            return;
        }
        healthSubHeader.setVisibility(0);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        if (i == 0) {
            healthSubHeader.setHeadTitleText(this.f28517c.getString(R.string.IDS_hw_show_main_permission_app_read, this.f28516b));
        } else if (i != 1) {
            LogUtil.j("ThirdPartAuthAdapter", "handleFirstContentItem unexpected operationType");
        } else {
            healthSubHeader.setHeadTitleText(this.f28517c.getString(R.string.IDS_hw_show_main_permission_app_write, this.f28516b));
        }
    }

    private void d(HealthTextView healthTextView, int i) {
        if (healthTextView != null && this.f28515a.containsKey(Integer.valueOf(i))) {
            healthTextView.setText(this.f28515a.get(Integer.valueOf(i)).intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            LogUtil.a("ThirdPartAuthAdapter", "onCreateViewHolder parent is null");
            return null;
        }
        if (this.f28517c == null) {
            this.f28517c = viewGroup.getContext();
        }
        if (i == 0) {
            return new IconViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_auth_icon, viewGroup, false));
        }
        if (i == 1) {
            return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_auth_item, viewGroup, false));
        }
        if (i == 2) {
            return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_auth_bottom, viewGroup, false));
        }
        if (i == 3) {
            return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_auth_all_item, viewGroup, false));
        }
        if (i != 4) {
            LogUtil.a("ThirdPartAuthAdapter", "viewType default branch");
            return null;
        }
        return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_third_part_auth_with_sub_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<vvr> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.d, i)) {
            LogUtil.d("ThirdPartAuthAdapter", "getItemViewType isOutOfBounds");
            return -1;
        }
        return this.d.get(i).e();
    }

    public static class ContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthSubHeader f28520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthCheckBox f28522c;
        View d;
        HealthSubHeader e;
        HealthTextView h;

        public ContentViewHolder(View view) {
            super(view);
            this.d = view.findViewById(R.id.third_party_auth_splitter_only);
            this.e = (HealthSubHeader) view.findViewById(R.id.third_party_auth_header_view);
            this.f28520a = (HealthSubHeader) view.findViewById(R.id.third_party_auth_header_view1);
            this.f28522c = (HealthCheckBox) view.findViewById(R.id.csb_switch_button);
            this.f28521b = (HealthTextView) view.findViewById(R.id.htv_item_name);
            this.h = (HealthTextView) view.findViewById(R.id.htv_item_sub_name);
        }
    }

    public static class IconViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f28523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f28525c;
        ImageView d;
        HealthTextView e;

        public IconViewHolder(View view) {
            super(view);
            this.f28523a = (RelativeLayout) view.findViewById(R.id.third_party_auth_icon);
            this.d = (ImageView) view.findViewById(R.id.iv_third_party_auth_app_icon);
            this.f28525c = (HealthTextView) view.findViewById(R.id.third_party_auth_app_name);
            this.f28524b = (HealthTextView) view.findViewById(R.id.third_party_auth_app_date);
            this.e = (HealthTextView) view.findViewById(R.id.third_party_head_note);
        }
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28526b;

        e(View view) {
            super(view);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_show_about_rights);
            this.f28526b = healthTextView;
            healthTextView.setText(view.getContext().getResources().getString(R.string.IDS_hw_show_main_permission_delete_tips));
        }
    }

    private void d(boolean z) {
        if (njy.e(this.d)) {
            return;
        }
        for (vvr vvrVar : this.d) {
            if (vvrVar == null) {
                return;
            } else {
                vvrVar.a(z);
            }
        }
        notifyDataSetChanged();
    }

    private void c(int i, boolean z) {
        if (njy.e(this.d) || njy.e(this.d, i) || this.d.get(i) == null) {
            return;
        }
        this.d.get(i).a(z);
        if (!z) {
            e();
        } else {
            Iterator<vvr> it = this.d.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (!it.hasNext()) {
                    z2 = z3;
                    break;
                }
                vvr next = it.next();
                if (next != null) {
                    if (!next.i() && (next.e() == 1 || next.e() == 4)) {
                        break;
                    } else {
                        z3 = true;
                    }
                } else {
                    return;
                }
            }
            if (z2) {
                a(z2);
            }
        }
        notifyDataSetChanged();
    }

    private void e() {
        for (vvr vvrVar : this.d) {
            if (vvrVar != null && (vvrVar.e() == 3 || vvrVar.e() == 0 || vvrVar.c() == null)) {
                if (vvrVar.i()) {
                    vvrVar.a(false);
                }
            }
        }
    }

    private void a(boolean z) {
        for (vvr vvrVar : this.d) {
            if (vvrVar != null && (vvrVar.e() == 3 || vvrVar.e() == 0 || vvrVar.c() == null)) {
                vvrVar.a(z);
            }
        }
    }

    public void c(SetSwitchButtonChanged setSwitchButtonChanged) {
        this.g = setSwitchButtonChanged;
    }
}
