package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qsp;
import defpackage.wig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SourceSpinnerAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Map<String, String>> f28710c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SourceSpinnerAdapter(List<Map<String, String>> list) {
        this.f28710c = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<Map<String, String>> list = this.f28710c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<Map<String, String>> list = this.f28710c;
        if (list == null || njy.e(list, i)) {
            return new HashMap(16);
        }
        return this.f28710c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar = null;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_spinner_item_with_icon, (ViewGroup) null);
            view.setBackground(null);
            aVar = new a(view);
            view.setTag(aVar);
        } else if (view.getTag() instanceof a) {
            aVar = (a) view.getTag();
        }
        if (aVar != null && njy.c(this.f28710c, i)) {
            aVar.c(BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_20sp), 0);
            aVar.e(this.f28710c.get(i), false);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        a aVar = null;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_spinner_item_with_icon, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else if (view.getTag() instanceof a) {
            aVar = (a) view.getTag();
        }
        if (aVar != null && njy.c(this.f28710c, i)) {
            aVar.e(this.f28710c.get(i), true);
        }
        return view;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextView f28711a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RelativeLayout f28712c;
        private ImageView d;

        a(View view) {
            this.f28712c = (RelativeLayout) view.findViewById(R.id.spinner_item);
            this.d = (ImageView) view.findViewById(R.id.spinner_icon);
            this.f28711a = (TextView) view.findViewById(R.id.spinner_text);
        }

        void c(float f, int i) {
            qsp.c(this.f28711a, f, i);
        }

        void e(Map<String, String> map, boolean z) {
            String str = map.get("SpinnerItemIcon");
            String str2 = map.get("SpinnerItemText");
            if (!z) {
                this.f28712c.setPadding(0, 0, 0, 0);
                this.d.setVisibility(8);
                this.f28711a.setText(str2);
                return;
            }
            Context context = this.f28712c.getContext();
            this.f28712c.setPadding(context.getResources().getDimensionPixelSize(R.dimen.common_list_content_layout_margin_left_right), 0, context.getResources().getDimensionPixelSize(R.dimen.common_list_content_layout_margin_left_right), 0);
            if (TextUtils.isEmpty(str)) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
                try {
                    this.d.setBackground(wig.e(Integer.parseInt(str)));
                } catch (NumberFormatException e) {
                    LogUtil.e("SourceSpinnerAdapter", e.getMessage());
                }
            }
            this.f28711a.setText(str2);
        }
    }
}
