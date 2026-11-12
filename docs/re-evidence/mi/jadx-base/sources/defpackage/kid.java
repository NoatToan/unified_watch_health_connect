package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xiaomi.fitness.nfc.bean.FeeBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class kid extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f23877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<FeeBean> f23878b = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f23879a;
    }

    public kid(Context context) {
        this.f23877a = context;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FeeBean getItem(int i) {
        return this.f23878b.get(i);
    }

    public void b(int i) {
        Iterator<FeeBean> it = this.f23878b.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
        this.f23878b.get(i).setSelected(true);
        notifyDataSetChanged();
    }

    public void c(List<FeeBean> list) {
        this.f23878b.clear();
        this.f23878b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f23878b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f23877a).inflate(sui.q0, (ViewGroup) null);
            aVar = new a();
            view.setTag(aVar);
            aVar.f23879a = (TextView) view.findViewById(mri.E1);
        } else {
            aVar = (a) view.getTag();
        }
        FeeBean feeBean = this.f23878b.get(i);
        aVar.f23879a.setText(this.f23877a.getResources().getString(o0j.P4, Float.valueOf(feeBean.getFee().getRechargeFee() / 100.0f)));
        if (feeBean.getIsSelected()) {
            view.setBackgroundResource(wni.i);
            aVar.f23879a.setTextColor(this.f23877a.getResources().getColor(rji.f32616r));
        } else {
            aVar.f23879a.setTextColor(this.f23877a.getResources().getColor(rji.o));
            view.setBackgroundResource(wni.h);
        }
        return view;
    }
}
