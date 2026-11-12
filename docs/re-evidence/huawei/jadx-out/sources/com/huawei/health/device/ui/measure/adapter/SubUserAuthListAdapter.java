package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubUserAuthMsg;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qlo;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SubUserAuthListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<WifiDeviceSubUserAuthMsg> f6382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f6383b;
    private AuthButtonClickCallback d;

    public interface AuthButtonClickCallback {
        void onAuthButtonClick(WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, boolean z);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SubUserAuthListAdapter(Context context, List<WifiDeviceSubUserAuthMsg> list, AuthButtonClickCallback authButtonClickCallback) {
        this.f6383b = context;
        this.f6382a = list;
        this.d = authButtonClickCallback;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<WifiDeviceSubUserAuthMsg> list = this.f6382a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.c(this.f6382a, i)) {
            return this.f6382a.get(i);
        }
        LogUtil.j("SubUserAuthListAdapter", "item is null ", Integer.valueOf(i));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar = null;
        Object[] objArr = 0;
        if (view == null) {
            c cVar2 = new c();
            View viewInflate = LayoutInflater.from(this.f6383b).inflate(R.layout.sub_user_auth_list_item, (ViewGroup) null);
            cVar2.e = (ImageView) viewInflate.findViewById(R.id.image_head);
            cVar2.d = (HealthTextView) viewInflate.findViewById(R.id.text_message);
            cVar2.f6387b = (HealthButton) viewInflate.findViewById(R.id.btn_agree);
            cVar2.f6388c = (HealthButton) viewInflate.findViewById(R.id.btn_reject);
            cVar2.f6386a = (HealthTextView) viewInflate.findViewById(R.id.text_status);
            viewInflate.setTag(cVar2);
            cVar = cVar2;
            view = viewInflate;
        } else if (view.getTag() instanceof c) {
            cVar = (c) view.getTag();
        }
        if (cVar != null) {
            if (njy.c(this.f6382a, i)) {
                b(cVar, this.f6382a.get(i));
                return view;
            }
            LogUtil.j("SubUserAuthListAdapter", "getView item is null ", Integer.valueOf(i));
        }
        return view;
    }

    private void b(c cVar, WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg) {
        cVar.e.setImageDrawable(qlo.b(this.f6383b.getResources(), new qlo.e(null, wifiDeviceSubUserAuthMsg.getSubHuid(), true)));
        cVar.d.setText(wifiDeviceSubUserAuthMsg.getSubUserNickName());
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            cVar.d.setTextDirection(4);
        }
        if (wifiDeviceSubUserAuthMsg.getStatus() == 1) {
            cVar.f6387b.setVisibility(0);
            cVar.f6388c.setVisibility(0);
            cVar.f6386a.setVisibility(8);
        } else {
            cVar.f6387b.setVisibility(8);
            cVar.f6388c.setVisibility(8);
            cVar.f6386a.setVisibility(0);
        }
        int status = wifiDeviceSubUserAuthMsg.getStatus();
        if (status == 1) {
            cVar.f6387b.setOnClickListener(new a(wifiDeviceSubUserAuthMsg, true));
            cVar.f6388c.setOnClickListener(new a(wifiDeviceSubUserAuthMsg, false));
        } else {
            if (status == 2) {
                cVar.f6386a.setText(R.string.IDS_hw_device_wifi_authorized_status_authorized);
                return;
            }
            if (status == 3) {
                cVar.f6386a.setText(R.string.IDS_hw_device_wifi_authorized_status_rejected);
            } else if (status == 4) {
                cVar.f6386a.setText(R.string.IDS_hw_device_wifi_authorized_status_expired);
            } else {
                LogUtil.j("SubUserAuthListAdapter", "status error: ", Integer.valueOf(wifiDeviceSubUserAuthMsg.getStatus()));
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f6386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthButton f6387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthButton f6388c;
        HealthTextView d;
        ImageView e;

        private c() {
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WifiDeviceSubUserAuthMsg f6384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6385b;

        public a(WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, boolean z) {
            this.f6384a = wifiDeviceSubUserAuthMsg;
            this.f6385b = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SubUserAuthListAdapter.this.d.onAuthButtonClick(this.f6384a, this.f6385b);
        }
    }
}
