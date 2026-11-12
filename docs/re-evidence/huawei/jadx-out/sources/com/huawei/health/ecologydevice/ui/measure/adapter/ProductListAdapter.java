package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dru;
import defpackage.dxw;
import defpackage.ekd;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ProductListAdapter extends ListAdapter {
    ArrayList<dru> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f6625b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Bitmap> f6626c = new HashMap();
    private Map<String, String> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f6624a = new HashMap();

    public ProductListAdapter(ArrayList<elh> arrayList) {
        this.e = null;
        ArrayList<dru> arrayListD = ekd.d(arrayList);
        this.e = arrayListD;
        super.setProductList(arrayListD);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ListAdapter, android.widget.Adapter
    public int getCount() {
        ArrayList<dru> arrayList = this.e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void a(elh elhVar) {
        if (!d(elhVar)) {
            this.e.add(ekd.b(elhVar));
            setProductList(this.e);
        } else {
            b(elhVar);
        }
    }

    private void b(elh elhVar) {
        int iE = e(elhVar);
        if (iE != -1) {
            this.e.set(iE, ekd.b(elhVar));
            setProductList(this.e);
        }
    }

    private int e(elh elhVar) {
        for (int i = 0; i < this.e.size(); i++) {
            dru druVar = this.e.get(i);
            if (druVar.e() == 0) {
                elh elhVar2 = druVar.i() instanceof elh ? (elh) druVar.i() : null;
                if (elhVar2 != null && elhVar2.t().equals(elhVar.t())) {
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean d(elh elhVar) {
        for (dru druVar : this.e) {
            if (druVar.e() == 0 && ((elh) druVar.i()).t().equals(elhVar.t())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ListAdapter
    public void setProductList(ArrayList<dru> arrayList) {
        super.setProductList(arrayList);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
        b bVar;
        if (view == null) {
            b bVar2 = new b();
            View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.my_device_bind_list_item, viewGroup, false);
            bVar2.f6628b = (HealthTextView) viewInflate.findViewById(R.id.tv_device_content);
            bVar2.e = (ImageView) viewInflate.findViewById(R.id.arrow_right_icon);
            bVar2.f6627a = (ImageView) viewInflate.findViewById(R.id.iv_device_icon);
            bVar2.d = (HealthTextView) viewInflate.findViewById(R.id.tv_device_summary);
            bVar2.f6629c = (HealthDivider) viewInflate.findViewById(R.id.hw_show_main_layout_sport_bottom_image_interval);
            viewInflate.setTag(bVar2);
            bVar = bVar2;
            view = viewInflate;
        } else {
            bVar = view.getTag() instanceof b ? (b) view.getTag() : null;
        }
        d(view.getContext(), i, bVar);
        return view;
    }

    protected void d(Context context, int i, b bVar) throws Throwable {
        String asString;
        String strA;
        if (bVar == null) {
            LogUtil.j("DeviceCoursesHelper", "setItemContent viewHolder is null");
            return;
        }
        if (LanguageUtil.ba(dxw.d())) {
            bVar.e.setImageDrawable(context.getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            bVar.e.setImageDrawable(context.getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        dru druVar = this.e.get(i);
        if (druVar.i() instanceof elh) {
            elh elhVar = (elh) druVar.i();
            ContentValues contentValuesD = druVar.d();
            if (contentValuesD == null) {
                asString = "";
            } else if (TextUtils.isEmpty(contentValuesD.getAsString("sn"))) {
                asString = contentValuesD.getAsString("sn");
            } else {
                asString = contentValuesD.getAsString("uniqueId");
            }
            a(bVar.f6628b, elhVar, asString);
            c(bVar.f6627a, elhVar);
            bVar.d.setVisibility(0);
            if (this.f6624a.containsKey(elhVar.t() + elhVar.l().e())) {
                strA = this.f6624a.get(elhVar.t() + elhVar.l().e());
            } else {
                strA = elo.a(elhVar.t(), elhVar.l().e());
                this.f6624a.put(elhVar.t() + elhVar.l().e(), strA);
            }
            bVar.d.setText(strA);
        }
        if (i == this.e.size() - 1) {
            bVar.f6629c.setVisibility(8);
        } else {
            bVar.f6629c.setVisibility(0);
        }
    }

    private void c(ImageView imageView, elh elhVar) throws Throwable {
        String str;
        Bitmap bitmap;
        if (this.f6625b.containsKey(elhVar.t() + elhVar.l().b())) {
            str = this.f6625b.get(elhVar.t() + elhVar.l().b());
        } else {
            String strD = elg.e().d(elhVar.t(), elhVar.l().b());
            this.f6625b.put(elhVar.t() + elhVar.l().b(), strD);
            str = strD;
        }
        if (this.f6626c.containsKey(str)) {
            bitmap = this.f6626c.get(str);
        } else {
            Bitmap bitmapC = elo.c(str);
            this.f6626c.put(str, bitmapC);
            bitmap = bitmapC;
        }
        imageView.setImageBitmap(bitmap);
    }

    protected void a(HealthTextView healthTextView, elh elhVar, String str) {
        String str2;
        if (this.d.containsKey(elhVar.t() + elhVar.l().d())) {
            str2 = this.d.get(elhVar.t() + elhVar.l().d());
        } else {
            String strA = elo.a(elhVar.t(), elhVar.l().d());
            this.d.put(elhVar.t() + elhVar.l().d(), strA);
            str2 = strA;
        }
        if (!TextUtils.isEmpty(str) && str.length() >= 3) {
            healthTextView.setText(str2 + Constants.LINK + str.replace(":", "").substring(str.replace(":", "").length() - 3));
            return;
        }
        healthTextView.setText(str2);
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f6627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f6628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthDivider f6629c;
        HealthTextView d;
        ImageView e;

        protected b() {
        }
    }
}
