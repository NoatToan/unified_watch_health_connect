package com.huawei.ui.main.stories.devicecapacity;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.HiAppInfo;
import defpackage.njy;
import defpackage.trl;
import defpackage.tro;
import defpackage.trp;
import defpackage.trv;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes43.dex */
public class AuthAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AuthActivity.AuthChangeListener f26397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiAppInfo f26398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<trl> f26399c;
    private AllAuthViewHolder d;
    private tro e;
    private Context f;
    private Map<String, Boolean> g = new ConcurrentHashMap();
    private List<trp> h;
    private List<Boolean> i;
    private String j;
    private String k;
    private boolean n;

    public interface OnClickCallback {
        void onClickCallback(String str, boolean z);
    }

    public AuthAdapter(Context context) {
        this.f = context;
    }

    public static class IconViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f26406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f26407b;
        HealthTextView e;

        public IconViewHolder(View view) {
            super(view);
            this.f26406a = (ImageView) view.findViewById(R.id.wear_engine_third_party_auth_app_icon_id);
            this.f26407b = (HealthTextView) view.findViewById(R.id.wear_engine_third_party_auth_app_name_id);
            this.e = (HealthTextView) view.findViewById(R.id.wear_engine_third_party_auth_describe_id);
        }
    }

    public static class AllAuthViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RelativeLayout f26404b;
        HealthCheckBox d;

        public AllAuthViewHolder(View view) {
            super(view);
            this.d = (HealthCheckBox) view.findViewById(R.id.wear_engine_capability_all_auth_switch_id);
            this.f26404b = (RelativeLayout) view.findViewById(R.id.wear_engine_capability_all_auth_id);
        }
    }

    public static class ContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f26405b;
        HealthRecycleView e;

        public ContentViewHolder(View view) {
            super(view);
            HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.wear_engine_content_recycler_view_id);
            this.e = healthRecycleView;
            healthRecycleView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            this.e.b(false);
            this.e.e(false);
            this.f26405b = view.findViewById(R.id.wear_engine_content_dividing_line);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new IconViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wear_engine_third_part_auth_top_icon_layout, viewGroup, false));
        }
        if (i == 1) {
            return new AllAuthViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wear_engine_third_part_auth_capability_all_layout, viewGroup, false));
        }
        return new ContentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wear_engine_third_part_auth_content_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            LogUtil.e("AuthAdapter", "viewHolder == null");
            return;
        }
        if (viewHolder instanceof IconViewHolder) {
            b((IconViewHolder) viewHolder);
            return;
        }
        if ((viewHolder instanceof AllAuthViewHolder) && i < this.f26399c.size()) {
            this.d = (AllAuthViewHolder) viewHolder;
            b(this.f26399c.get(i));
            return;
        }
        if (!(viewHolder instanceof ContentViewHolder)) {
            LogUtil.j("AuthAdapter", "invalid viewHolder");
            return;
        }
        ContentViewHolder contentViewHolder = (ContentViewHolder) viewHolder;
        List<trp> listD = this.f26399c.get(i).d();
        this.h = listD;
        if (listD != null && listD.size() <= 1) {
            this.d.f26404b.setVisibility(8);
            contentViewHolder.f26405b.setVisibility(8);
        }
        List<trp> list = this.h;
        if (list != null) {
            d(list);
        }
        a(contentViewHolder);
    }

    private void b(IconViewHolder iconViewHolder) {
        iconViewHolder.f26406a.setImageBitmap(trv.b(this.f26398b.getByteDraw()));
        iconViewHolder.f26407b.setText(this.f26398b.getAppName());
        if ("health_app".equals(this.j)) {
            iconViewHolder.e.setText(String.format(Locale.ROOT, this.f.getResources().getString(R.string.IDS_permission_wear_engine_describe_from_health), this.f26398b.getAppName()));
        } else if (this.n) {
            iconViewHolder.e.setText(String.format(Locale.ROOT, this.f.getResources().getString(R.string.IDS_wear_engine_third_describe), this.f26398b.getAppName()));
        } else {
            iconViewHolder.e.setText(String.format(Locale.ROOT, this.f.getResources().getString(R.string.IDS_wear_third_desc), this.f26398b.getAppName()));
        }
    }

    private void b(final trl trlVar) {
        this.d.d.setChecked(trlVar.a());
        this.d.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (compoundButton.isPressed()) {
                    LogUtil.d("AuthAdapter", "onCheckedChanged onClick");
                    AuthAdapter.this.c(trlVar, z);
                }
            }
        });
    }

    private void d(List<trp> list) {
        for (trp trpVar : list) {
            this.g.put(trpVar.b(), Boolean.valueOf(trpVar.d()));
        }
    }

    private void a(ContentViewHolder contentViewHolder) {
        AuthCapabilityAdapter authCapabilityAdapter = new AuthCapabilityAdapter(this.f, this.f26398b, this.h, new OnClickCallback() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthAdapter.4
            @Override // com.huawei.ui.main.stories.devicecapacity.AuthAdapter.OnClickCallback
            public void onClickCallback(String str, boolean z) {
                AuthAdapter.this.g.put(str, Boolean.valueOf(z));
                LogUtil.d("AuthAdapter", "OnClickCallback mAuthStatusMap:" + AuthAdapter.this.g.toString());
                AuthAdapter.this.e(str, z);
                if (!AuthAdapter.this.b()) {
                    AuthAdapter.this.c(false);
                } else {
                    AuthAdapter.this.c(true);
                }
                AuthAdapter.this.e();
                boolean zD = AuthAdapter.this.d();
                if (AuthAdapter.this.f26397a != null) {
                    AuthAdapter.this.f26397a.updateAuth(zD);
                }
            }
        }, this.e);
        authCapabilityAdapter.a(this.k);
        authCapabilityAdapter.b(this.n);
        contentViewHolder.e.setAdapter(authCapabilityAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, boolean z) {
        for (trp trpVar : this.h) {
            if (trpVar.b().equals(str)) {
                trpVar.c(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        for (trl trlVar : this.f26399c) {
            if (trlVar.c() == 1) {
                trlVar.c(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        Iterator<Boolean> it = this.g.values().iterator();
        while (it.hasNext()) {
            if (!it.next().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<trl> list = this.f26399c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f26399c, i)) {
            LogUtil.e("AuthAdapter", "getItemViewType isOutOfBounds");
            return -1;
        }
        return this.f26399c.get(i).c();
    }

    public void e(List<trl> list) {
        this.f26399c = list;
        e();
    }

    public void c(HiAppInfo hiAppInfo) {
        this.f26398b = hiAppInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(trl trlVar, boolean z) {
        LogUtil.d("AuthAdapter", "updateCapabilityStatus isChecked:" + z);
        if (this.h == null) {
            return;
        }
        trlVar.c(z);
        for (trp trpVar : this.h) {
            trpVar.c(z);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(trv.d(this.f26398b.getAppUid(), this.f26398b.getUserId(), this.f26398b.getAppId()));
            stringBuffer.append("_");
            stringBuffer.append(trpVar.b());
            AuthInfo authInfoE = this.e.e(stringBuffer.toString());
            if (authInfoE == null) {
                return;
            }
            if (z) {
                authInfoE.setOpenStatus(1);
            } else {
                authInfoE.setOpenStatus(0);
            }
            LogUtil.d("AuthAdapter", "updateCapabilityStatus putAuthInfoToMap key:" + stringBuffer.toString());
            LogUtil.d("AuthAdapter", "updateCapabilityStatus putAuthInfoToMap authInfo:" + authInfoE.toString());
            this.e.a(stringBuffer.toString(), authInfoE);
            if (this.f26397a != null) {
                this.f26397a.updateAuth(d());
            }
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        new Handler().post(new Runnable() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                AuthAdapter.this.notifyDataSetChanged();
            }
        });
    }

    public void c(String str) {
        this.j = str;
    }

    public void b(AuthActivity.AuthChangeListener authChangeListener) {
        this.f26397a = authChangeListener;
    }

    public void d(tro troVar) {
        this.e = troVar;
    }

    public void d(String str) {
        this.k = str;
    }

    public void c(List<Boolean> list) {
        this.i = list;
    }

    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        List<Boolean> list;
        if (this.h == null || (list = this.i) == null) {
            LogUtil.j("AuthAdapter", "mAuthList or mConfirmCheck is null");
            return false;
        }
        if (list.size() != this.h.size()) {
            LogUtil.j("AuthAdapter", "mAuthList and mConfirmCheck length is not equal");
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (this.i.get(i) != null && this.i.get(i).booleanValue() != this.h.get(i).d()) {
                return true;
            }
        }
        return false;
    }
}
