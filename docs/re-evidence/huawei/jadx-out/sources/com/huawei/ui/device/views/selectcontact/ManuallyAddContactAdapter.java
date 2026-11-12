package com.huawei.ui.device.views.selectcontact;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.datatype.Contact;
import com.huawei.datatype.PhoneNumber;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.selectcontact.IUpdateListItemListener;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ManuallyAddContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Contact> f25082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IUpdateListItemListener f25084c;
    private Context d;
    private FootViewHolder e;

    public interface EditTextChangeListener {
        void afterTextChanged(Editable editable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public ManuallyAddContactAdapter(Context context, List<Contact> list, IUpdateListItemListener iUpdateListItemListener, int i) {
        this.f25082a = list;
        this.d = context;
        this.f25084c = iUpdateListItemListener;
        this.f25083b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25082a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f25082a.size() == i ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new b(LayoutInflater.from(this.d).inflate(R.layout.manually_add_contact_list_item, viewGroup, false));
        }
        return new FootViewHolder(LayoutInflater.from(this.d).inflate(R.layout.manually_add_foot_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            if (this.f25082a.size() > 1) {
                bVar.e.setVisibility(0);
            } else {
                bVar.e.setVisibility(8);
            }
            Drawable drawable = this.d.getResources().getDrawable(R.drawable.ic_phone_number);
            drawable.setAutoMirrored(true);
            bVar.f25091c.setImageDrawable(drawable);
            Contact contact = this.f25082a.get(i);
            d(bVar, contact);
            b(bVar, contact);
            e(bVar, contact);
            return;
        }
        if (viewHolder instanceof FootViewHolder) {
            this.e = (FootViewHolder) viewHolder;
            d();
            this.e.f25089b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.selectcontact.ManuallyAddContactAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Contact contact2 = new Contact();
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(new PhoneNumber());
                    contact2.setPhoneNumbers(arrayList);
                    ManuallyAddContactAdapter.this.f25082a.add(contact2);
                    ManuallyAddContactAdapter.this.notifyDataSetChanged();
                    ManuallyAddContactAdapter.this.f25084c.updateSaveButtonState(true);
                }
            });
            return;
        }
        LogUtil.a("ManuallyAddContactAdapter", "onBindViewHolder other");
    }

    private void d(b bVar, final Contact contact) {
        d(bVar.d, contact, new EditTextChangeListener() { // from class: rgf
            @Override // com.huawei.ui.device.views.selectcontact.ManuallyAddContactAdapter.EditTextChangeListener
            public final void afterTextChanged(Editable editable) {
                this.f47293a.c(contact, editable);
            }
        });
    }

    public /* synthetic */ void c(Contact contact, Editable editable) {
        if (TextUtils.isEmpty(editable.toString())) {
            contact.setName(null);
        } else {
            contact.setName(editable.toString());
        }
        d();
        b();
    }

    private void d(HealthEditText healthEditText, Contact contact, final EditTextChangeListener editTextChangeListener) {
        if (healthEditText.getTag() instanceof TextWatcher) {
            healthEditText.removeTextChangedListener((TextWatcher) healthEditText.getTag());
            healthEditText.clearFocus();
        }
        if (healthEditText.getId() == R.id.manually_add_name) {
            healthEditText.setText(contact.getName());
        } else {
            healthEditText.setText(a(contact));
        }
        TextWatcher textWatcher = new TextWatcher() { // from class: com.huawei.ui.device.views.selectcontact.ManuallyAddContactAdapter.3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                LogUtil.d("ManuallyAddContactAdapter", "beforeTextChanged");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                LogUtil.d("ManuallyAddContactAdapter", "onTextChanged");
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                editTextChangeListener.afterTextChanged(editable);
            }
        };
        healthEditText.addTextChangedListener(textWatcher);
        healthEditText.setTag(textWatcher);
    }

    public static String a(Contact contact) {
        List<PhoneNumber> phoneNumbers = contact.getPhoneNumbers();
        if (CollectionUtils.a(phoneNumbers)) {
            return null;
        }
        return phoneNumbers.get(0).getPhoneNumber();
    }

    private void b(b bVar, final Contact contact) {
        d(bVar.f25090b, contact, new EditTextChangeListener() { // from class: rge
            @Override // com.huawei.ui.device.views.selectcontact.ManuallyAddContactAdapter.EditTextChangeListener
            public final void afterTextChanged(Editable editable) {
                this.e.b(contact, editable);
            }
        });
    }

    public /* synthetic */ void b(Contact contact, Editable editable) {
        if (TextUtils.isEmpty(editable.toString())) {
            a(contact, null);
        } else {
            a(contact, editable.toString());
        }
        d();
        b();
    }

    private void a(Contact contact, String str) {
        List<PhoneNumber> phoneNumbers = contact.getPhoneNumbers();
        if (CollectionUtils.a(phoneNumbers)) {
            return;
        }
        phoneNumbers.get(0).setPhoneNumber(str);
    }

    private void e(b bVar, final Contact contact) {
        bVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.views.selectcontact.ManuallyAddContactAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ManuallyAddContactAdapter.this.f25082a.remove(contact);
                ManuallyAddContactAdapter.this.notifyDataSetChanged();
                ManuallyAddContactAdapter.this.b();
            }
        });
    }

    private void d() {
        for (Contact contact : this.f25082a) {
            if (TextUtils.isEmpty(contact.getName()) || TextUtils.isEmpty(a(contact))) {
                e(false);
                return;
            }
        }
        e(true);
    }

    private void e(boolean z) {
        if (!z || this.f25082a.size() >= this.f25083b) {
            this.e.f25089b.setEnabled(false);
        } else {
            this.e.f25089b.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        for (Contact contact : this.f25082a) {
            if (!TextUtils.isEmpty(contact.getName()) && !TextUtils.isEmpty(a(contact))) {
                this.f25084c.updateSaveButtonState(true);
                return;
            }
        }
        this.f25084c.updateSaveButtonState(false);
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthEditText f25090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f25091c;
        private HealthEditText d;
        private ImageView e;

        public b(View view) {
            super(view);
            this.d = (HealthEditText) qsp.a(view, R.id.manually_add_name);
            this.f25090b = (HealthEditText) qsp.a(view, R.id.manually_add_number);
            this.f25091c = (ImageView) qsp.a(view, R.id.img_contact_phone_number);
            this.e = (ImageView) qsp.a(view, R.id.delete_add_item);
        }
    }

    public static class FootViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthButton f25089b;

        public FootViewHolder(View view) {
            super(view);
            HealthButton healthButton = (HealthButton) qsp.a(view, R.id.manual_add_contact_button);
            this.f25089b = healthButton;
            healthButton.setEnabled(false);
        }
    }
}
