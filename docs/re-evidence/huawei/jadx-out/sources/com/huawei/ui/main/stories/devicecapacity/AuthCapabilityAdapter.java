package com.huawei.ui.main.stories.devicecapacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.HiAppInfo;
import defpackage.njy;
import defpackage.tro;
import defpackage.trp;
import defpackage.trv;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class AuthCapabilityAdapter extends RecyclerView.Adapter<AuthCapabilityViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiAppInfo f26408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<trp> f26410c;
    private tro d;
    private AuthAdapter.OnClickCallback e;
    private String f;
    private boolean i;

    public static class AuthCapabilityViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f26413a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthCheckBox f26414c;
        HealthTextView d;

        public AuthCapabilityViewHolder(View view) {
            super(view);
            this.d = (HealthTextView) view.findViewById(R.id.wear_engine_capability_name_id);
            this.f26413a = (HealthTextView) view.findViewById(R.id.wear_engine_capability_describe_id);
            this.f26414c = (HealthCheckBox) view.findViewById(R.id.wear_engine_capability_status_id);
        }
    }

    public AuthCapabilityAdapter(Context context, HiAppInfo hiAppInfo, List<trp> list, AuthAdapter.OnClickCallback onClickCallback, tro troVar) {
        this.f26409b = context;
        this.f26408a = hiAppInfo;
        this.f26410c = list;
        this.e = onClickCallback;
        this.d = troVar;
        d();
    }

    private void d() {
        for (trp trpVar : this.f26410c) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(trv.d(this.f26408a.getAppUid(), this.f26408a.getUserId(), this.f26408a.getAppId()));
            stringBuffer.append("_");
            stringBuffer.append(trpVar.b());
            AuthInfo authInfo = new AuthInfo();
            authInfo.setKey(stringBuffer.toString());
            if (trpVar.d()) {
                authInfo.setOpenStatus(1);
            } else {
                authInfo.setOpenStatus(0);
            }
            authInfo.setPermission(trpVar.b());
            authInfo.setAppUid(this.f26408a.getAppUid());
            authInfo.setAppId(this.f26408a.getAppId());
            authInfo.setUserId(this.f26408a.getUserId());
            LogUtil.d("AuthCapabilityAdapter", "storeAuthInfoToMap putAuthInfoToMap key:" + stringBuffer.toString());
            LogUtil.d("AuthCapabilityAdapter", "storeAuthInfoToMap putAuthInfoToMap authInfo:" + authInfo.toString());
            this.d.a(stringBuffer.toString(), authInfo);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AuthCapabilityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.d("AuthCapabilityAdapter", "onCreateViewHolder");
        if (viewGroup == null) {
            LogUtil.e("AuthCapabilityAdapter", "onCreateViewHolder parent is null");
            return null;
        }
        if (this.f26409b == null) {
            this.f26409b = viewGroup.getContext();
        }
        return new AuthCapabilityViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wear_engine_third_part_auth_capability_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AuthCapabilityViewHolder authCapabilityViewHolder, int i) {
        if (njy.e(this.f26410c, i)) {
            LogUtil.e("AuthCapabilityAdapter", "onBindViewHolder isOutOfBounds");
            return;
        }
        final trp trpVar = this.f26410c.get(i);
        authCapabilityViewHolder.d.setText(trpVar.d(this.i));
        authCapabilityViewHolder.f26413a.setText(trpVar.e(this.f, this.i));
        authCapabilityViewHolder.f26414c.setChecked(trpVar.d());
        authCapabilityViewHolder.f26414c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthCapabilityAdapter.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(trv.d(AuthCapabilityAdapter.this.f26408a.getAppUid(), AuthCapabilityAdapter.this.f26408a.getUserId(), AuthCapabilityAdapter.this.f26408a.getAppId()));
                stringBuffer.append("_");
                stringBuffer.append(trpVar.b());
                AuthInfo authInfoE = AuthCapabilityAdapter.this.d.e(stringBuffer.toString());
                if (authInfoE == null) {
                    return;
                }
                if (z) {
                    authInfoE.setOpenStatus(1);
                    AuthCapabilityAdapter.this.e.onClickCallback(trpVar.b(), true);
                } else {
                    authInfoE.setOpenStatus(0);
                    AuthCapabilityAdapter.this.e.onClickCallback(trpVar.b(), false);
                }
                LogUtil.d("AuthCapabilityAdapter", "OnCheckedChangeListener putAuthInfoToMap key:" + stringBuffer.toString());
                LogUtil.d("AuthCapabilityAdapter", "OnCheckedChangeListener putAuthInfoToMap authInfo:" + authInfoE.toString());
                AuthCapabilityAdapter.this.d.a(stringBuffer.toString(), authInfoE);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<trp> list = this.f26410c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void a(String str) {
        this.f = str;
    }

    public void b(boolean z) {
        this.i = z;
    }
}
