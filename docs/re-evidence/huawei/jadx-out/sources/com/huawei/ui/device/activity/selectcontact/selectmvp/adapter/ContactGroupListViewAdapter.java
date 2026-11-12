package com.huawei.ui.device.activity.selectcontact.selectmvp.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SectionIndexer;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.qlo;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qzr;
import health.compact.a.util.LogUtil;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class ContactGroupListViewAdapter extends BaseAdapter implements SectionIndexer {
    private List<qzr> d;
    private Context e;

    public ContactGroupListViewAdapter(List<qzr> list, Context context) {
        this.d = list;
        this.e = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i >= this.d.size()) {
            LogUtil.d("ContactGroupListViewAdapter", "getItem position out of list size");
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (i < this.d.size()) {
            return i;
        }
        LogUtil.d("ContactGroupListViewAdapter", "getItemId position out of list size");
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar = null;
        Object[] objArr = 0;
        if (view == null) {
            d dVar2 = new d();
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.item_contact_select, (ViewGroup) null);
            dVar2.f24707a = (LinearLayout) viewInflate.findViewById(R.id.group_layout);
            dVar2.j = (HealthTextView) viewInflate.findViewById(R.id.text_grout_name);
            dVar2.f24709c = (ImageView) viewInflate.findViewById(R.id.image_contact_photo);
            dVar2.d = (HealthTextView) viewInflate.findViewById(R.id.text_contact_name);
            dVar2.e = (ImageView) viewInflate.findViewById(R.id.check_image_view);
            dVar2.f = (HealthTextView) viewInflate.findViewById(R.id.text_contact_phone_number);
            dVar2.f24708b = (RelativeLayout) viewInflate.findViewById(R.id.relative_contact_data);
            viewInflate.setTag(dVar2);
            dVar = dVar2;
            view = viewInflate;
        } else if (view.getTag() instanceof d) {
            dVar = (d) view.getTag();
        }
        if (i >= this.d.size()) {
            LogUtil.d("ContactGroupListViewAdapter", "getView position out of list size");
            return view;
        }
        e(i, dVar);
        return view;
    }

    private void e(int i, d dVar) {
        int dimensionPixelSize;
        if (dVar != null) {
            a(i, dVar);
            b(i, dVar);
            c(i, dVar);
            if (a(i)) {
                dVar.f24709c.setVisibility(0);
                dVar.d.setVisibility(0);
                dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.hw_show_public_size_72);
            } else {
                dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.hw_show_public_size_48);
                dVar.f24709c.setVisibility(4);
                dVar.d.setVisibility(8);
            }
            if (qrs.v()) {
                dimensionPixelSize = -2;
            }
            dVar.f24708b.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelSize));
            dVar.d.setText(this.d.get(i).b());
            StringBuilder sb = new StringBuilder(16);
            sb.append(this.d.get(i).c());
            sb.append(" ");
            sb.append(this.d.get(i).d());
            dVar.f.setText(sb.toString());
        }
    }

    private void a(int i, d dVar) {
        if (i >= this.d.size()) {
            LogUtil.d("ContactGroupListViewAdapter", "initItemGroup position out of list size");
            return;
        }
        if (i == getPositionForSection(getSectionForPosition(i))) {
            LogUtil.a("ContactGroupListViewAdapter", "item show title");
            dVar.f24707a.setVisibility(0);
            dVar.j.setText(this.d.get(i).f());
        } else {
            LogUtil.a("ContactGroupListViewAdapter", "item not show title");
            dVar.f24707a.setVisibility(8);
        }
    }

    private boolean a(int i) {
        if (i >= 1 && i < this.d.size()) {
            int i2 = i - 1;
            String strE = this.d.get(i2).e();
            String strE2 = this.d.get(i).e();
            if (this.d.get(i2).b().equals(this.d.get(i).b()) && strE.equals(strE2)) {
                return false;
            }
        }
        return true;
    }

    private void b(int i, d dVar) {
        if (i >= this.d.size()) {
            LogUtil.d("ContactGroupListViewAdapter", "initItemCheck position out of list size");
        } else if (this.d.get(i).j()) {
            dVar.e.setBackground(this.e.getResources().getDrawable(R.drawable.ic_checklist));
        } else {
            dVar.e.setBackground(this.e.getResources().getDrawable(R.drawable.ic_frame));
        }
    }

    private void c(int i, d dVar) {
        if (i >= this.d.size()) {
            LogUtil.d("ContactGroupListViewAdapter", "initItemImage position out of list size");
            return;
        }
        Bitmap bitmapD = qlo.d(qqf.e(this.d.get(i).a()), true);
        if (bitmapD != null) {
            dVar.f24709c.setImageBitmap(bitmapD);
        } else {
            dVar.f24709c.setImageDrawable(qlo.b(BaseApplication.getContext().getResources(), new qlo.e(b(this.d.get(i).b()), this.d.get(i).e(), true)));
        }
    }

    private String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(str.length() - 1, str.length());
        }
        return "";
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        return new Object[0];
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (this.d.get(i2).f().toUpperCase(Locale.ENGLISH).charAt(0) == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        if (i >= this.d.size()) {
            return -1;
        }
        return this.d.get(i).f().charAt(0);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LinearLayout f24707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RelativeLayout f24708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f24709c;
        HealthTextView d;
        ImageView e;
        HealthTextView f;
        HealthTextView j;

        private d() {
        }
    }
}
