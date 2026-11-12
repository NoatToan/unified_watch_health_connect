package com.huawei.ui.device.views.selectcontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.huawei.datatype.Contact;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ContactDeleteListAdapter extends BaseAdapter {
    private static HashMap<Integer, Boolean> e = new HashMap<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f25068a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Contact> f25069c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f25070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f25071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f25072c;
        public HealthCheckBox e;
    }

    public ContactDeleteListAdapter(Context context, List<Contact> list) {
        this.f25069c = list;
        a();
        this.f25068a = LayoutInflater.from(context);
    }

    private void a() {
        for (int i = 0; i < this.f25069c.size(); i++) {
            e.put(Integer.valueOf(i), false);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f25069c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f25069c.size() > i) {
            return this.f25069c.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        c cVar;
        try {
            Contact contact = this.f25069c.get(i);
            LogUtil.a("ContactDeleteListAdapter", "ContactDeleteListAdapter getView() vie=", view, ", item=", contact);
            if (view == null) {
                cVar = new c();
                viewInflate = this.f25068a.inflate(R.layout.activity_device_settings_contact_delete_item_layout_black, (ViewGroup) null);
                cVar.f25072c = (HealthTextView) qsp.a(viewInflate, R.id.content);
                cVar.f25071b = (HealthTextView) qsp.a(viewInflate, R.id.summary);
                cVar.e = (HealthCheckBox) qsp.a(viewInflate, R.id.isCheckBox);
                cVar.f25070a = (ImageView) qsp.a(viewInflate, R.id.item_layout_line);
                viewInflate.setTag(cVar);
            } else {
                Object tag = view.getTag();
                if (!(tag instanceof c)) {
                    return view;
                }
                c cVar2 = (c) tag;
                viewInflate = view;
                cVar = cVar2;
            }
            if (i == this.f25069c.size() - 1) {
                cVar.f25070a.setVisibility(8);
            } else {
                cVar.f25070a.setVisibility(0);
            }
            cVar.f25072c.setText(contact.getName());
            cVar.f25071b.setText(contact.getPhoneNumbers().get(0).getPhoneNumber());
            cVar.e.setChecked(e.get(Integer.valueOf(i)).booleanValue());
            return viewInflate;
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.e("ContactDeleteListAdapter", e2.getMessage());
            return null;
        }
    }

    public static HashMap<Integer, Boolean> d() {
        return e;
    }
}
