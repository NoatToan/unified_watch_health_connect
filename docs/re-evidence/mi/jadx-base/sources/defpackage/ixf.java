package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.NameBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ixf extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f22196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<NameBean> f22197b = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f22198a;
    }

    public ixf(Context context) {
        this.f22196a = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NameBean getItem(int i) {
        return this.f22197b.get(i);
    }

    public void b(int i) {
        Iterator<NameBean> it = this.f22197b.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
        this.f22197b.get(i).setSelected(true);
        notifyDataSetChanged();
    }

    public void c(List<NameBean> list) {
        this.f22197b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22197b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.f22196a.inflate(sui.D0, viewGroup, false);
            aVar = new a();
            view.setTag(aVar);
            aVar.f22198a = (TextView) view.findViewById(mri.T2);
        } else {
            aVar = (a) view.getTag();
        }
        NameBean nameBean = this.f22197b.get(i);
        aVar.f22198a.setText(nameBean.getName());
        if (nameBean.getIsSelected()) {
            aVar.f22198a.setTextColor(AppUtil.getApp().getColor(rji.f32616r));
            aVar.f22198a.setBackgroundResource(wni.i);
        } else {
            aVar.f22198a.setBackgroundResource(wni.h);
            aVar.f22198a.setTextColor(AppUtil.getApp().getColor(rji.o));
        }
        return view;
    }
}
