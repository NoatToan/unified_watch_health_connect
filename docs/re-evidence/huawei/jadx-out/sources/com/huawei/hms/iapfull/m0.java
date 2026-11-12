package com.huawei.hms.iapfull;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.huawei.hms.iapfull.network.model.MyPayType;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class m0 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<MyPayType> f13697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13698c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        TextView textView;
        int i2;
        if (view == null) {
            view = LayoutInflater.from(this.f13696a).inflate(R.layout.pay_type_channel_full_item, viewGroup, false);
            aVar = new a();
            aVar.f13699a = (ImageView) view.findViewById(R.id.cardButton);
            aVar.f13700b = (TextView) view.findViewById(R.id.paytype_title);
            aVar.f13701c = (RadioButton) view.findViewById(R.id.radiobutton);
            aVar.d = (TextView) view.findViewById(R.id.paytype_descr);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f13701c.setChecked(false);
        int mode = this.f13697b.get(i).getMode();
        int payType = this.f13697b.get(i).getPayType();
        aVar.d.setVisibility(8);
        if (5 == payType) {
            aVar.f13699a.setBackgroundResource(R.drawable.iap_huaweipay_selectpage_alipay);
            textView = aVar.f13700b;
            i2 = R.string.hwpay_alipay;
        } else {
            aVar.f13699a.setBackgroundResource(R.drawable.iap_huaweipay_selectpage_wechat_pay);
            textView = aVar.f13700b;
            i2 = R.string.hwpay_wechat_pay;
        }
        textView.setText(i2);
        int i3 = this.f13698c;
        if (i3 == i) {
            if (1 == mode) {
                aVar.f13701c.setChecked(true);
            } else {
                this.f13698c = i3 + 1;
            }
        }
        if (1 != mode) {
            aVar.f13701c.setEnabled(false);
            aVar.f13700b.setAlpha(0.38f);
            aVar.f13699a.setAlpha(0.38f);
            aVar.d.setAlpha(0.38f);
            aVar.d.setVisibility(0);
            aVar.d.setTextColor(this.f13696a.getResources().getColor(R.color.emui_color_text_primary));
            aVar.d.setText(R.string.hwpay_out_of_service);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<MyPayType> list = this.f13697b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f13697b.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<MyPayType> list = this.f13697b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void a(List<MyPayType> list) {
        this.f13697b = list;
        notifyDataSetChanged();
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f13699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        TextView f13700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RadioButton f13701c;
        TextView d;

        a() {
        }
    }

    public void a(int i) {
        List<MyPayType> list = this.f13697b;
        if (list == null || list.isEmpty() || i >= this.f13697b.size()) {
            return;
        }
        this.f13698c = i;
    }

    public m0(Context context, List<MyPayType> list, int i) {
        this.f13696a = context;
        this.f13697b = list;
        this.f13698c = i;
    }
}
