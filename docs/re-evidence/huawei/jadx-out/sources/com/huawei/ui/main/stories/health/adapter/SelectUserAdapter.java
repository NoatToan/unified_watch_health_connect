package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.main.R;
import defpackage.dnj;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import health.compact.a.utils.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SelectUserAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<dnj> f27735b;
    private Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27734a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27736c = -1;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public SelectUserAdapter(Context context, List<dnj> list) {
        this.f27735b = list;
        this.d = context;
    }

    public void e(int i) {
        this.f27734a = i;
        this.f27736c = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<dnj> list = this.f27735b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (njy.e(this.f27735b, i)) {
            return null;
        }
        return this.f27735b.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.item_single_select, (ViewGroup) null);
            aVar2.d = (HealthTextView) viewInflate.findViewById(R.id.tv_claim_weight_data_select_user);
            aVar2.f27738c = (HealthTextView) viewInflate.findViewById(R.id.tv_select_current);
            aVar2.f27737a = (HealthRadioButton) viewInflate.findViewById(R.id.rb_claim_weight_data_select_user);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else {
            aVar = (a) view.getTag();
        }
        if (njy.c(this.f27735b, i)) {
            String strH = this.f27735b.get(i).h();
            if (LanguageUtil.ba(BaseApplication.getContext()) && !TextUtils.isEmpty(strH) && (StringUtils.b(strH) || StringUtils.d(strH))) {
                aVar.d.setTextDirection(3);
            }
            if (this.f27734a == i) {
                aVar.f27738c.setVisibility(0);
                aVar.d.setText(strH + " ");
            } else {
                aVar.f27738c.setVisibility(8);
                aVar.d.setText(strH);
            }
        }
        aVar.f27737a.setOnClickListener(new View.OnClickListener() { // from class: usl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50512b.c(i, view2);
            }
        });
        aVar.f27737a.setChecked(i == this.f27736c);
        return view;
    }

    public /* synthetic */ void c(int i, View view) {
        if (this.f27736c == i) {
            i = this.f27734a;
        }
        this.f27736c = i;
        notifyDataSetChanged();
    }

    public int d() {
        return this.f27736c;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthRadioButton f27737a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27738c;
        private HealthTextView d;

        private a() {
        }
    }
}
