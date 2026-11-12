package com.huawei.ui.commonui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qrs;

/* JADX INFO: loaded from: classes16.dex */
public class CheckAdapter extends BaseAdapter {
    private static boolean[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f23267a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23268c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f23269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthCheckBox f23270c;
        private ImageView d;

        private a() {
        }
    }

    public CheckAdapter(Context context, String[] strArr, boolean[] zArr) {
        if (strArr != null) {
            this.f23267a = (String[]) strArr.clone();
        }
        c(zArr);
        if (context != null) {
            this.f23268c = context;
        } else {
            this.f23268c = BaseApplication.getContext();
        }
    }

    private static void c(boolean[] zArr) {
        if (zArr != null) {
            e = (boolean[]) zArr.clone();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return qrs.b(this.f23267a);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return qrs.d(i, this.f23267a);
    }

    public boolean[] b() {
        if (e == null) {
            LogUtil.a("CheckAdapter", "getCheckedItem return null");
            return null;
        }
        for (int i = 0; i < getCount(); i++) {
            e[i] = ((HealthCheckBox) getView(i, null, null).findViewById(R.id.chk_selectone)).isChecked();
        }
        return (boolean[]) e.clone();
    }

    public static class OnMultiItemClick implements AdapterView.OnItemClickListener {
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (CheckAdapter.e[i]) {
                CheckAdapter.e[i] = false;
            } else {
                CheckAdapter.e[i] = true;
            }
            if (adapterView.getAdapter() instanceof CheckAdapter) {
                ((CheckAdapter) adapterView.getAdapter()).notifyDataSetChanged();
                LogUtil.a("CheckAdapter", "Entering notifyDataSetChanged()");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        LogUtil.a("CheckAdapter", "Entering getView");
        a aVar = null;
        Object[] objArr = 0;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = LayoutInflater.from(this.f23268c).inflate(R.layout.commonui_dialog_multi_choice_item, (ViewGroup) null);
            aVar2.f23269b = (HealthTextView) viewInflate.findViewById(R.id.contact_name);
            aVar2.d = (ImageView) viewInflate.findViewById(R.id.clock_line);
            aVar2.f23270c = (HealthCheckBox) viewInflate.findViewById(R.id.chk_selectone);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else if (view.getTag() instanceof a) {
            aVar = (a) view.getTag();
        }
        if (getItem(i) instanceof String) {
            aVar.f23269b.setText((String) getItem(i));
            LogUtil.a("CheckAdapter", "Entering setText(name)");
            boolean[] zArr = e;
            if (zArr == null || zArr.length <= i) {
                aVar.f23270c.setChecked(false);
            } else {
                aVar.f23270c.setChecked(e[i]);
            }
            if (i == getCount() - 1) {
                aVar.d.setVisibility(8);
                return view;
            }
            aVar.d.setVisibility(0);
        }
        return view;
    }
}
