package com.huawei.health.device.ui.measure.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.eaj;
import defpackage.ecj;
import defpackage.qlo;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WifiDeviceShareAdapter extends BaseAdapter {
    private Context d;
    private List<eaj> e;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WifiDeviceShareAdapter(Context context, List<eaj> list) {
        new ArrayList(16);
        this.d = context;
        this.e = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        a aVar;
        if (i < 0 || i > this.e.size()) {
            return view;
        }
        if (view == null) {
            aVar = new a();
            viewInflate = LayoutInflater.from(this.d).inflate(R.layout.item_wifi_device_share_layout, (ViewGroup) null);
            aVar.f6402b = (ImageView) viewInflate.findViewById(R.id.share_member_header_img);
            aVar.d = (HealthTextView) viewInflate.findViewById(R.id.share_member_header_title_tv);
            aVar.f6403c = (HealthTextView) viewInflate.findViewById(R.id.share_member_sub_title_tv);
            aVar.f6401a = (ImageView) viewInflate.findViewById(R.id.arrow_img);
            viewInflate.setTag(aVar);
        } else if (view.getTag() instanceof a) {
            aVar = (a) view.getTag();
            viewInflate = view;
        } else {
            viewInflate = view;
            aVar = null;
        }
        if (aVar == null) {
            LogUtil.j("WifiDeviceShareAdapter", "viewHolder is null");
            return view;
        }
        eaj eajVar = this.e.get(i);
        ecj.e(eajVar.b(), aVar.f6402b, qlo.b(this.d.getResources(), new qlo.e(null, eajVar.a(), true)));
        if (!TextUtils.isEmpty(eajVar.c())) {
            aVar.d.setText(eajVar.c());
        } else {
            aVar.d.setText(eajVar.e());
        }
        if (LanguageUtil.ba(this.d)) {
            aVar.f6401a.setBackground(this.d.getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            aVar.f6401a.setBackground(this.d.getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        aVar.f6403c.setText(eajVar.e());
        aVar.f6401a.setVisibility(0);
        return viewInflate;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f6401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f6402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f6403c;
        private HealthTextView d;

        a() {
        }
    }
}
