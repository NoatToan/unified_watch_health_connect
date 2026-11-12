package com.huami.watch.companion.wifi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.wifi.WifiTypeInfo;

/* JADX INFO: loaded from: classes16.dex */
public class EAPTlsFragment extends EAPBaseFragment {
    private EditText a;
    private WifiTypeInfo b = new WifiTypeInfo();

    @Override // com.huami.watch.companion.wifi.EAPBaseFragment
    public WifiTypeInfo getWifiInputInfo() {
        this.b.id = this.a.getText().toString();
        return this.b;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_eap_tls, viewGroup, false);
        this.a = (EditText) viewInflate.findViewById(R.id.id_edit_box);
        return viewInflate;
    }
}
