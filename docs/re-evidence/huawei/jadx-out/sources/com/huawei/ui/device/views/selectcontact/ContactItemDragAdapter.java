package com.huawei.ui.device.views.selectcontact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.datatype.Contact;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ContactItemDragAdapter extends RecyclerView.Adapter<SlideViewHolder> implements ContactItemDragListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f25073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Contact> f25074c;
    private Context e;

    public ContactItemDragAdapter(Context context, List<Contact> list) {
        this.e = context;
        this.f25074c = list;
        this.f25073b = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SlideViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SlideViewHolder(this.f25073b.inflate(R.layout.activity_device_settings_contact_orderby_item_layout_black, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SlideViewHolder slideViewHolder, int i) {
        Contact contact = this.f25074c.get(i);
        slideViewHolder.f25075a.setText(contact.getName());
        slideViewHolder.f25076b.setText(contact.getPhoneNumbers().get(0).getPhoneNumber());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25074c.size();
    }

    @Override // com.huawei.ui.device.views.selectcontact.ContactItemDragListener
    public void onItemDrag(int i, int i2) {
        List<Contact> list = this.f25074c;
        if (list == null) {
            LogUtil.j("ContactItemDragAdapter", "onItemDrag mContactList is null");
            return;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("ContactItemDragAdapter", "onItemDrag fromPosition IndexOutOfBoundsException");
        } else if (i2 < 0 || i2 >= this.f25074c.size()) {
            LogUtil.j("ContactItemDragAdapter", "onItemDrag toPosition IndexOutOfBoundsException");
        } else {
            Collections.swap(this.f25074c, i, i2);
            notifyItemMoved(i, i2);
        }
    }

    public static class SlideViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f25075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f25076b;

        public SlideViewHolder(View view) {
            super(view);
            this.f25075a = (HealthTextView) view.findViewById(R.id.contact_name_tv);
            this.f25076b = (HealthTextView) view.findViewById(R.id.contact_phone_number_tv);
        }
    }
}
