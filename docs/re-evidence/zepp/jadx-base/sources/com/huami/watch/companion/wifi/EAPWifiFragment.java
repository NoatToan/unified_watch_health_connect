package com.huami.watch.companion.wifi;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.Log;
import com.huami.watch.wifi.WifiTypeInfo;

/* JADX INFO: loaded from: classes16.dex */
public class EAPWifiFragment extends Fragment {
    private static final String g = "EAPWifiFragment";
    private AlertDialogFragment b;
    private EAPBaseFragment c;
    private View d;
    private TextView e;
    private int a = 0;
    private WifiTypeInfo f = new WifiTypeInfo();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPWifiFragment.this.d();
            EAPWifiFragment.this.e();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPWifiFragment.this.b.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        boolean zIsActive = inputMethodManager.isActive();
        View view = getView();
        if (!zIsActive || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.b = AlertDialogFragment.newInstance(6);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        this.b.setContent(new EAPTypeChoosingFragment());
        this.b.setNeutral(getString(R.string.btn_cancel), new b());
        this.b.show(fragmentTransactionBeginTransaction, "EAP type setting");
    }

    public WifiTypeInfo collectUserInputInfo() {
        int i = this.a;
        if (i == 0) {
            EAPBaseFragment eAPBaseFragment = this.c;
            if (eAPBaseFragment == null) {
                return null;
            }
            WifiTypeInfo wifiInputInfo = eAPBaseFragment.getWifiInputInfo();
            WifiTypeInfo wifiTypeInfo = this.f;
            wifiTypeInfo.phase2Type = wifiInputInfo.phase2Type;
            wifiTypeInfo.id = wifiInputInfo.id;
            wifiTypeInfo.anonymousId = wifiInputInfo.anonymousId;
            wifiTypeInfo.password = wifiInputInfo.password;
            return wifiTypeInfo;
        }
        if (i == 1) {
            EAPBaseFragment eAPBaseFragment2 = this.c;
            if (eAPBaseFragment2 == null) {
                return null;
            }
            WifiTypeInfo wifiInputInfo2 = eAPBaseFragment2.getWifiInputInfo();
            WifiTypeInfo wifiTypeInfo2 = this.f;
            wifiTypeInfo2.id = wifiInputInfo2.id;
            return wifiTypeInfo2;
        }
        if (i == 2) {
            EAPBaseFragment eAPBaseFragment3 = this.c;
            if (eAPBaseFragment3 != null) {
                WifiTypeInfo wifiInputInfo3 = eAPBaseFragment3.getWifiInputInfo();
                WifiTypeInfo wifiTypeInfo3 = this.f;
                wifiTypeInfo3.id = wifiInputInfo3.id;
                wifiTypeInfo3.anonymousId = wifiInputInfo3.anonymousId;
                wifiTypeInfo3.password = wifiInputInfo3.password;
                return wifiTypeInfo3;
            }
        } else if (i != 3) {
            if (i == 4 || i == 5) {
                return this.f;
            }
            return null;
        }
        EAPBaseFragment eAPBaseFragment4 = this.c;
        if (eAPBaseFragment4 == null) {
            return null;
        }
        WifiTypeInfo wifiInputInfo4 = eAPBaseFragment4.getWifiInputInfo();
        WifiTypeInfo wifiTypeInfo4 = this.f;
        wifiTypeInfo4.id = wifiInputInfo4.id;
        wifiTypeInfo4.password = wifiInputInfo4.password;
        return wifiTypeInfo4;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_eap_items, viewGroup, false);
        this.d = viewInflate;
        viewInflate.findViewById(R.id.eap_type).setOnClickListener(new a());
        TextView textView = (TextView) this.d.findViewById(R.id.eap_type_result);
        this.e = textView;
        textView.setText(getString(R.string.peap));
        EAPPeapFragment eAPPeapFragment = new EAPPeapFragment();
        getFragmentManager().beginTransaction().replace(R.id.eap_container, eAPPeapFragment).commit();
        this.c = eAPPeapFragment;
        WifiTypeInfo wifiTypeInfo = this.f;
        wifiTypeInfo.eapType = 0;
        wifiTypeInfo.phase2Type = 0;
        return this.d;
    }

    public void onTypeSelected(int i) {
        AlertDialogFragment alertDialogFragment = this.b;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismissAllowingStateLoss();
        }
        if (i == this.a) {
        }
        if (i >= 4) {
            this.d.findViewById(R.id.eap_container).setVisibility(8);
        } else {
            this.d.findViewById(R.id.eap_container).setVisibility(0);
        }
        switch (i) {
            case -1:
                this.a = -1;
                break;
            case 0:
                this.f.eapType = 0;
                this.a = 0;
                this.e.setText(getString(R.string.peap));
                EAPPeapFragment eAPPeapFragment = new EAPPeapFragment();
                getFragmentManager().beginTransaction().replace(R.id.eap_container, eAPPeapFragment).commit();
                this.c = eAPPeapFragment;
                break;
            case 1:
                this.f.eapType = 1;
                this.a = 1;
                this.e.setText(getString(R.string.tls));
                EAPTlsFragment eAPTlsFragment = new EAPTlsFragment();
                getFragmentManager().beginTransaction().replace(R.id.eap_container, eAPTlsFragment).commit();
                this.c = eAPTlsFragment;
                break;
            case 2:
                this.f.eapType = 2;
                this.a = 2;
                this.e.setText(getString(R.string.ttls));
                EAPTtlsFragment eAPTtlsFragment = new EAPTtlsFragment();
                getFragmentManager().beginTransaction().replace(R.id.eap_container, eAPTtlsFragment).commit();
                this.c = eAPTtlsFragment;
                break;
            case 3:
                this.f.eapType = 3;
                this.a = 3;
                this.e.setText(getString(R.string.pwd));
                EAPPwdFragment eAPPwdFragment = new EAPPwdFragment();
                getFragmentManager().beginTransaction().replace(R.id.eap_container, eAPPwdFragment).commit();
                this.c = eAPPwdFragment;
                break;
            case 4:
                this.f.eapType = 4;
                this.a = 4;
                this.e.setText(getString(R.string.sim));
                this.c = null;
                break;
            case 5:
                this.f.eapType = 5;
                this.a = 5;
                this.e.setText(getString(R.string.aka));
                this.c = null;
                break;
        }
    }

    public void onVerifyTypeSelected(int i) {
        EAPBaseFragment eAPBaseFragment = this.c;
        if (eAPBaseFragment != null) {
            eAPBaseFragment.setVerifyResult(i);
        } else {
            Log.e(g, "Set step 2 verify type error!", new Object[0]);
        }
    }
}
