package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import c22.y3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import p13.y;
import wn1.m0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/l;", "Landroidx/fragment/app/i;", "Landroid/view/View$OnClickListener;", "Landroid/text/TextWatcher;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends androidx.fragment.app.i implements View.OnClickListener, TextWatcher, AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f43349p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f43350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f43351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spinner f43352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f43353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f43354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.appcompat.app.e f43355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DialogInterface.OnClickListener f43356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f43357h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f43359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f43360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f43361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43362m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WifiSetup.SecurityType f43358i = WifiSetup.SecurityType.OPEN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InputFilter[] f43363n = {new InputFilter.LengthFilter(32)};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InputFilter[] f43364o = {new InputFilter.LengthFilter(64)};

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        v6();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        EditText editText = this.f43353d;
        editText.getClass();
        editText.setInputType((((CheckBox) view2).isChecked() ? 128 : SyslogConstants.LOG_LOCAL2) | 1);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        WifiSetup.SecurityType securityTypeForNumber;
        ArrayList arrayList;
        super.onCreate(bundle);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "WiFiNetworkDialogFragment", ".onCreate()");
        if (getArguments() == null || (arguments = getArguments()) == null) {
            return;
        }
        this.f43357h = arguments.getString("KEY_INITIAL_SSID");
        int i14 = arguments.getInt("KEY_INITIAL_SECURITY_TYPE", -1);
        if (i14 != -1) {
            securityTypeForNumber = WifiSetup.SecurityType.forNumber(i14);
            securityTypeForNumber.getClass();
        } else {
            securityTypeForNumber = WifiSetup.SecurityType.OPEN;
        }
        this.f43358i = securityTypeForNumber;
        this.f43359j = arguments.getString("KEY_INITIAL_EXCEPTION");
        this.f43360k = arguments.getString("GCM_deviceProductNbr");
        int[] intArray = arguments.getIntArray("KEY_ALLOWED_SECURITY_TYPES");
        if (intArray != null) {
            arrayList = new ArrayList(intArray.length);
            for (int i15 : intArray) {
                arrayList.add(WifiSetup.SecurityType.forNumber(i15));
            }
        } else {
            arrayList = null;
        }
        this.f43361l = arrayList;
        this.f43362m = arguments.getBoolean("KEY_NEW_NETWORK");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        String string;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "WiFiNetworkDialogFragment", ".onCreateDialog()");
        boolean z14 = this.f43362m;
        InputFilter[] inputFilterArr = this.f43364o;
        if (z14) {
            View viewInflate = requireActivity().getLayoutInflater().inflate(R.layout.gcm3_wifi_enter_network_info_dialog, (ViewGroup) null);
            this.f43350a = viewInflate;
            if (viewInflate != null && (viewFindViewById6 = viewInflate.findViewById(R.id.intro_message)) != null) {
                viewFindViewById6.setVisibility(8);
            }
            View view2 = this.f43350a;
            this.f43351b = (EditText) (view2 != null ? view2.findViewById(R.id.ssid) : null);
            if (!TextUtils.isEmpty(this.f43357h)) {
                EditText editText = this.f43351b;
                editText.getClass();
                editText.setText(this.f43357h);
            }
            EditText editText2 = this.f43351b;
            editText2.getClass();
            editText2.setInputType(524432);
            EditText editText3 = this.f43351b;
            editText3.getClass();
            editText3.addTextChangedListener(this);
            EditText editText4 = this.f43351b;
            editText4.getClass();
            editText4.setFilters(this.f43363n);
            View view3 = this.f43350a;
            if (view3 != null && (viewFindViewById5 = view3.findViewById(R.id.ssid_fields)) != null) {
                viewFindViewById5.setVisibility(0);
            }
            View view4 = this.f43350a;
            view4.getClass();
            View viewFindViewById7 = view4.findViewById(R.id.security_type);
            viewFindViewById7.getClass();
            Spinner spinner = (Spinner) viewFindViewById7;
            this.f43352c = spinner;
            spinner.setOnItemSelectedListener(this);
            View view5 = this.f43350a;
            view5.getClass();
            view5.findViewById(R.id.security_type_fields).setVisibility(0);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, q.a(contextRequireContext, this.f43361l, this.f43360k));
            Spinner spinner2 = this.f43352c;
            spinner2.getClass();
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
            View view6 = this.f43350a;
            EditText editText5 = (EditText) (view6 != null ? view6.findViewById(R.id.password) : null);
            this.f43353d = editText5;
            editText5.getClass();
            editText5.addTextChangedListener(this);
            View view7 = this.f43350a;
            CheckBox checkBox = (CheckBox) (view7 != null ? view7.findViewById(R.id.hide_password) : null);
            if (checkBox != null) {
                checkBox.setOnClickListener(this);
            }
            EditText editText6 = this.f43353d;
            editText6.getClass();
            editText6.setFilters(inputFilterArr);
            View view8 = this.f43350a;
            if (view8 != null && (viewFindViewById4 = view8.findViewById(R.id.security_fields)) != null) {
                viewFindViewById4.setVisibility(0);
            }
            View view9 = this.f43350a;
            this.f43354e = (TextView) (view9 != null ? view9.findViewById(R.id.exception) : null);
            boolean zIsEmpty = TextUtils.isEmpty(this.f43359j);
            TextView textView = this.f43354e;
            if (zIsEmpty) {
                textView.getClass();
                textView.setVisibility(4);
            } else {
                textView.getClass();
                textView.setText(this.f43359j);
                TextView textView2 = this.f43354e;
                textView2.getClass();
                textView2.setVisibility(0);
            }
            string = requireContext().getString(R.string.wifi_enter_network_title);
            string.getClass();
        } else {
            View viewInflate2 = requireActivity().getLayoutInflater().inflate(R.layout.gcm3_wifi_enter_network_info_dialog, (ViewGroup) null);
            this.f43350a = viewInflate2;
            TextView textView3 = (TextView) (viewInflate2 != null ? viewInflate2.findViewById(R.id.intro_message) : null);
            String string2 = getString(R.string.wifi_enter_network_password, this.f43358i.name(), this.f43357h);
            string2.getClass();
            if (textView3 != null) {
                textView3.setText(string2);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            View view10 = this.f43350a;
            if (view10 != null && (viewFindViewById3 = view10.findViewById(R.id.ssid_fields)) != null) {
                viewFindViewById3.setVisibility(8);
            }
            View view11 = this.f43350a;
            if (view11 != null && (viewFindViewById2 = view11.findViewById(R.id.security_type_fields)) != null) {
                viewFindViewById2.setVisibility(8);
            }
            View view12 = this.f43350a;
            EditText editText7 = (EditText) (view12 != null ? view12.findViewById(R.id.password) : null);
            this.f43353d = editText7;
            editText7.getClass();
            editText7.addTextChangedListener(this);
            EditText editText8 = this.f43353d;
            editText8.getClass();
            editText8.setFilters(inputFilterArr);
            View view13 = this.f43350a;
            CheckBox checkBox2 = (CheckBox) (view13 != null ? view13.findViewById(R.id.hide_password) : null);
            if (checkBox2 != null) {
                checkBox2.setOnClickListener(this);
            }
            View view14 = this.f43350a;
            if (view14 != null && (viewFindViewById = view14.findViewById(R.id.security_fields)) != null) {
                viewFindViewById.setVisibility(0);
            }
            View view15 = this.f43350a;
            this.f43354e = (TextView) (view15 != null ? view15.findViewById(R.id.exception) : null);
            boolean zIsEmpty2 = TextUtils.isEmpty(this.f43359j);
            TextView textView4 = this.f43354e;
            if (zIsEmpty2) {
                textView4.getClass();
                textView4.setVisibility(4);
            } else {
                textView4.getClass();
                textView4.setText(this.f43359j);
                TextView textView5 = this.f43354e;
                textView5.getClass();
                textView5.setVisibility(0);
            }
            string = "";
        }
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(requireContext());
        aVar2.setView(this.f43350a).setTitle(string).setPositiveButton(requireContext().getString(R.string.lbl_done), this.f43356g).setNegativeButton(requireContext().getString(R.string.lbl_cancel), this.f43356g);
        androidx.appcompat.app.e eVarCreate = aVar2.create();
        this.f43355f = eVarCreate;
        eVarCreate.getClass();
        return eVarCreate;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
        WifiSetup.SecurityType securityTypeB;
        adapterView.getClass();
        view2.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "WiFiNetworkDialogFragment", ".onItemSelected()");
        Object itemAtPosition = adapterView.getItemAtPosition(i14);
        if (itemAtPosition != null) {
            k.b bVar = k.f43319i;
            k.c cVar = ((p) itemAtPosition).f43399b;
            bVar.getClass();
            securityTypeB = k.b.b(cVar);
        } else {
            securityTypeB = WifiSetup.SecurityType.OPEN;
        }
        this.f43358i = securityTypeB;
        u6();
        v6();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "WiFiNetworkDialogFragment", ".onStart()");
        u6();
        v6();
        if (!this.f43362m) {
            EditText editText = this.f43353d;
            editText.getClass();
            editText.requestFocus();
            EditText editText2 = this.f43353d;
            editText2.getClass();
            final int i14 = 1;
            editText2.postDelayed(new Runnable(this) { // from class: di1.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.l f59772b;

                {
                    this.f59772b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            y3.b(this.f59772b.f43351b);
                            break;
                        default:
                            y3.b(this.f59772b.f43353d);
                            break;
                    }
                }
            }, 100L);
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String str = this.f43360k;
        k.b bVar = k.f43319i;
        WifiSetup.SecurityType securityType = this.f43358i;
        bVar.getClass();
        k.c cVarA = k.b.a(securityType);
        ArrayList arrayList = this.f43361l;
        q qVar = q.f43400a;
        cVarA.getClass();
        final int i15 = 0;
        int i16 = 0;
        for (Object obj : q.a(contextRequireContext, arrayList, str)) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            if (((p) obj).f43399b == cVarA) {
                Spinner spinner = this.f43352c;
                spinner.getClass();
                spinner.setSelection(i16);
                EditText editText3 = this.f43351b;
                editText3.getClass();
                editText3.requestFocus();
                EditText editText4 = this.f43351b;
                editText4.getClass();
                editText4.postDelayed(new Runnable(this) { // from class: di1.q

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.l f59772b;

                    {
                        this.f59772b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                y3.b(this.f59772b.f43351b);
                                break;
                            default:
                                y3.b(this.f59772b.f43353d);
                                break;
                        }
                    }
                }, 100L);
            }
            i16 = i17;
        }
        i16 = 0;
        Spinner spinner2 = this.f43352c;
        spinner2.getClass();
        spinner2.setSelection(i16);
        EditText editText5 = this.f43351b;
        editText5.getClass();
        editText5.requestFocus();
        EditText editText6 = this.f43351b;
        editText6.getClass();
        editText6.postDelayed(new Runnable(this) { // from class: di1.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.l f59772b;

            {
                this.f59772b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        y3.b(this.f59772b.f43351b);
                        break;
                    default:
                        y3.b(this.f59772b.f43353d);
                        break;
                }
            }
        }, 100L);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "WiFiNetworkDialogFragment", ".onStop()");
        if (this.f43362m) {
            y3.b(this.f43351b);
        } else {
            y3.b(this.f43353d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        EditText editText;
        charSequence.getClass();
        TextView textView = this.f43354e;
        textView.getClass();
        if (textView.getVisibility() == 0) {
            EditText editText2 = this.f43351b;
            if (editText2 != null) {
                editText2.getClass();
                if (editText2.length() <= 0) {
                    editText = this.f43353d;
                    editText.getClass();
                    if (editText.length() <= 0) {
                        return;
                    }
                }
            } else {
                editText = this.f43353d;
                editText.getClass();
                if (editText.length() <= 0) {
                    return;
                }
            }
            TextView textView2 = this.f43354e;
            textView2.getClass();
            textView2.setVisibility(4);
        }
    }

    public final void u6() {
        WifiSetup.SecurityType securityType = this.f43358i;
        WifiSetup.SecurityType securityType2 = WifiSetup.SecurityType.OPEN;
        View view2 = this.f43350a;
        if (securityType == securityType2) {
            view2.getClass();
            view2.findViewById(R.id.security_fields).setVisibility(8);
        } else {
            view2.getClass();
            view2.findViewById(R.id.security_fields).setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    public final void v6() {
        char c14;
        EditText editText = this.f43351b;
        if (editText != null) {
            editText.getClass();
            String string = editText.getText().toString();
            int i14 = m0.f186262a;
            c14 = 1;
            if (!TextUtils.isEmpty(string)) {
                string.getClass();
                int length = string.length();
                if (length < 1) {
                    c14 = '\n';
                } else if (length > 32) {
                    c14 = 11;
                } else {
                    c14 = 0;
                }
            }
        } else {
            c14 = 0;
        }
        EditText editText2 = this.f43353d;
        editText2.getClass();
        int iC = hd0.a.c(editText2.getText().toString(), this.f43358i);
        if (c14 == 0 && iC == 0) {
            androidx.appcompat.app.e eVar = this.f43355f;
            eVar.getClass();
            eVar.e(-1).setVisibility(0);
        } else {
            androidx.appcompat.app.e eVar2 = this.f43355f;
            eVar2.getClass();
            eVar2.e(-1).setVisibility(8);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_INITIAL_SSID", "KEY_INITIAL_SECURITY_TYPE", "KEY_INITIAL_EXCEPTION", "KEY_NEW_NETWORK", "KEY_ALLOWED_SECURITY_TYPES", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(String str, WifiSetup.SecurityType securityType, String str2, String str3, boolean z14, List list, DialogInterface.OnClickListener onClickListener) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("KEY_INITIAL_SSID", str);
            }
            if (securityType != null) {
                bundle.putInt("KEY_INITIAL_SECURITY_TYPE", securityType.getNumber());
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("KEY_INITIAL_EXCEPTION", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("GCM_deviceProductNbr", str3);
            }
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((WifiSetup.SecurityType) it.next()).getNumber()));
                }
                bundle.putIntArray("KEY_ALLOWED_SECURITY_TYPES", h0.a1(arrayList));
            }
            bundle.putBoolean("KEY_NEW_NETWORK", z14);
            l lVar = new l();
            lVar.setArguments(bundle);
            lVar.f43356g = onClickListener;
            return lVar;
        }

        private a() {
        }
    }
}
