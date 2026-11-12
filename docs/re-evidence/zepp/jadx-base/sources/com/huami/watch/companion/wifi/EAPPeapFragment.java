package com.huami.watch.companion.wifi;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.wifi.WifiTypeInfo;

/* JADX INFO: loaded from: classes16.dex */
public class EAPPeapFragment extends EAPBaseFragment {
    private AlertDialogFragment a;
    private TextView b;
    private EditText c;
    private EditText d;
    private EditText e;
    private WifiTypeInfo f = new WifiTypeInfo();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPPeapFragment.this.hideKeyBoard();
            EAPPeapFragment.this.showStep2VerifyDialog();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPPeapFragment.this.a.dismissAllowingStateLoss();
        }
    }

    @Override // com.huami.watch.companion.wifi.EAPBaseFragment
    public WifiTypeInfo getWifiInputInfo() {
        this.f.id = this.c.getText().toString();
        this.f.anonymousId = this.d.getText().toString();
        this.f.password = this.e.getText().toString();
        return this.f;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_eap_peap_ttls, viewGroup, false);
        viewInflate.findViewById(R.id.step_two_verify).setOnClickListener(new a());
        this.b = (TextView) viewInflate.findViewById(R.id.step2_verify_result);
        this.c = (EditText) viewInflate.findViewById(R.id.id_edit_box);
        this.d = (EditText) viewInflate.findViewById(R.id.anonymous_id_edit_box);
        this.e = (EditText) viewInflate.findViewById(R.id.pwd_edit_box);
        return viewInflate;
    }

    @Override // com.huami.watch.companion.wifi.EAPBaseFragment
    public void setVerifyResult(int i) {
        AlertDialogFragment alertDialogFragment = this.a;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismissAllowingStateLoss();
        }
        if (i == 0) {
            this.f.phase2Type = 0;
            this.b.setText(getString(R.string.none));
        } else if (i == 3) {
            this.f.phase2Type = 3;
            this.b.setText(getString(R.string.MSCHAPII));
        } else {
            if (i != 4) {
                return;
            }
            this.f.phase2Type = 4;
            this.b.setText(getString(R.string.GTC));
        }
    }

    @Override // com.huami.watch.companion.wifi.EAPBaseFragment
    public void showStep2VerifyDialog() {
        this.a = AlertDialogFragment.newInstance(6);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        this.a.setContent(new PEAPStep2VerifyTypeChoosingFragment());
        this.a.setNeutral(getString(R.string.btn_cancel), new b());
        this.a.show(fragmentTransactionBeginTransaction, "PEAP step 2 verify type setting");
    }
}
