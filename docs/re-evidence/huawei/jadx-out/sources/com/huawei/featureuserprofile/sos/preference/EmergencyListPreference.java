package com.huawei.featureuserprofile.sos.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.preference.ListPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.adapter.EmergencyListAdapter;
import com.huawei.featureuserprofile.sos.interf.OnPreferenceChangedListener;
import com.huawei.featureuserprofile.sos.interf.ReloadablePreferenceInterface;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cxz;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class EmergencyListPreference extends ListPreference implements ReloadablePreferenceInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence[] f5707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence[] f5708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5709c;
    private WeakReference<Context> d;
    private int e;
    private String f;
    private String i;
    private OnPreferenceChangedListener j;

    public EmergencyListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EmergencyListPreference);
        this.f5708b = typedArrayObtainStyledAttributes.getTextArray(R.styleable.EmergencyListPreference_entries);
        this.f5707a = typedArrayObtainStyledAttributes.getTextArray(R.styleable.EmergencyListPreference_entryValues);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f5708b == null) {
            this.f5708b = getEntries();
        }
        if (this.f5707a == null) {
            this.f5707a = getEntryValues();
        }
        setLayoutResource(R.layout.preference_item_double);
        this.i = getKey();
        this.d = new WeakReference<>(context);
    }

    @Override // com.huawei.featureuserprofile.sos.interf.ReloadablePreferenceInterface
    public void reloadFromPreference() {
        setValue(getValue());
    }

    @Override // android.preference.ListPreference, android.preference.Preference
    public CharSequence getSummary() {
        if (findIndexOfValue(getValue()) < 0) {
            return super.getSummary();
        }
        return getEntry();
    }

    @Override // android.preference.ListPreference
    public String getValue() {
        return EmergencyInfoManager.a().getSharedPreference(cxz.a() + this.i);
    }

    @Override // android.preference.ListPreference
    public void setValue(String str) {
        boolean zEquals = TextUtils.equals(this.f, str);
        if (zEquals && this.f5709c) {
            return;
        }
        this.f = str;
        this.f5709c = true;
        EmergencyInfoManager.a().setSharedPreference(cxz.a() + this.i, str, new StorageParams(1));
        if (zEquals) {
            return;
        }
        notifyChanged();
        OnPreferenceChangedListener onPreferenceChangedListener = this.j;
        if (onPreferenceChangedListener != null) {
            onPreferenceChangedListener.onPreferenceChanged(this.i, this.f);
        }
    }

    @Override // android.preference.ListPreference, android.preference.Preference
    protected void onSetInitialValue(boolean z, Object obj) {
        setValue(!TextUtils.isEmpty(getValue()) ? getValue() : (String) obj);
    }

    @Override // android.preference.Preference
    protected void onBindView(View view) {
        if (view == null) {
            LogUtil.j("EmergencyListPreference", "onBindView view is null");
            return;
        }
        super.onBindView(view);
        BaseActivity.setViewSafeRegion(true, (LinearLayout) view.findViewById(R.id.ll_edit_preference));
        ImageView imageView = (ImageView) view.findViewById(R.id.preference_image);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.double_title);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.double_summary);
        String key = getKey();
        key.hashCode();
        if (key.equals("blood_type")) {
            setDialogTitle(R.string.IDS_blood_type);
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_blood));
            healthTextView2.setText(getContext().getString(R.string.IDS_blood_type));
            if ("".equals(getValue())) {
                healthTextView.setText(getContext().getString(R.string.IDS_unknown_blood_type));
                return;
            } else {
                healthTextView.setText(getValue());
                return;
            }
        }
        if (!key.equals("organ_donor")) {
            LogUtil.a("EmergencyListPreference", "onBindView default");
            return;
        }
        setDialogTitle(R.string.IDS_organ_donor);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_organ));
        healthTextView2.setText(getContext().getString(R.string.IDS_organ_donor));
        if ("".equals(getValue())) {
            healthTextView.setText(getContext().getString(R.string.IDS_unknown_organ_donor));
        } else {
            healthTextView.setText(getValue());
        }
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        if (this.f5708b == null || this.f5707a == null) {
            LogUtil.j("EmergencyListPreference", "mEntries or mEntryValues is null");
            return;
        }
        int iA = a();
        this.e = iA;
        builder.setSingleChoiceItems(this.f5708b, iA, new DialogInterface.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.preference.EmergencyListPreference.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                EmergencyListPreference.this.e = i;
                LogUtil.a("EmergencyListPreference", "mClickedDialogEntryIndex:", Integer.valueOf(EmergencyListPreference.this.e));
                EmergencyListPreference.this.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    private int a() {
        return findIndexOfValue(this.f);
    }

    public void e(OnPreferenceChangedListener onPreferenceChangedListener) {
        this.j = onPreferenceChangedListener;
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected void onDialogClosed(boolean z) {
        int i;
        CharSequence[] charSequenceArr;
        if (!z || (i = this.e) < 0 || (charSequenceArr = this.f5707a) == null) {
            return;
        }
        String string = charSequenceArr[i].toString();
        if (callChangeListener(string)) {
            setValue(string);
        }
    }

    @Override // android.preference.DialogPreference
    protected void showDialog(Bundle bundle) {
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null) {
            LogUtil.a("EmergencyListPreference", "showDialog mContextReference is null");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            LogUtil.a("EmergencyListPreference", "showDialog context is null");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.layout_list_preference, null);
        ListView listView = (ListView) viewInflate.findViewById(R.id.lv_list_preference);
        final EmergencyListAdapter emergencyListAdapter = new EmergencyListAdapter(context, this.f5707a, a());
        listView.setAdapter((ListAdapter) emergencyListAdapter);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
        builder.a(getTitle() != null ? getTitle().toString() : null).d(viewInflate).c(R.string.IDS_emergency_cancel, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.preference.EmergencyListPreference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        final CustomViewDialog customViewDialogD = builder.d();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.featureuserprofile.sos.preference.EmergencyListPreference.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                emergencyListAdapter.d(i);
                EmergencyListPreference emergencyListPreference = EmergencyListPreference.this;
                emergencyListPreference.setValue(emergencyListPreference.f5707a[i].toString());
                customViewDialogD.dismiss();
            }
        });
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
        customViewDialogD.getWindow().setSoftInputMode(32);
    }
}
