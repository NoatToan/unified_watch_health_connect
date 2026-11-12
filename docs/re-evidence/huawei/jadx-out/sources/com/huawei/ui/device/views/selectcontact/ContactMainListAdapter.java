package com.huawei.ui.device.views.selectcontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.huawei.datatype.Contact;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ContactMainListAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Contact> f25078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f25079c;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public ContactMainListAdapter(Context context, List<Contact> list) {
        this.f25078a = list;
        this.f25079c = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f25078a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f25078a.size() > i) {
            return this.f25078a.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.f25079c.inflate(R.layout.activity_device_settings_contact_main_item_layout_black, (ViewGroup) null);
            bVar = new b();
            bVar.f25081c = (HealthTextView) view.findViewById(R.id.content);
            bVar.f25080a = (HealthTextView) view.findViewById(R.id.summary);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        try {
            Contact contact = this.f25078a.get(i);
            bVar.f25081c.setText(contact.getName());
            if (contact.getPhoneNumbers() == null || contact.getPhoneNumbers().get(0) == null) {
                LogUtil.j("ContactMainListAdapter", "if (item.getPhoneNumbers() != null && item.getPhoneNumbers().get(0) != null) ELSE");
                return view;
            }
            bVar.f25080a.setText(contact.getPhoneNumbers().get(0).getPhoneNumber());
            return view;
        } catch (IndexOutOfBoundsException e) {
            LogUtil.e("ContactMainListAdapter", e.getMessage());
            return null;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f25080a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f25081c;

        private b() {
        }
    }
}
