package com.huami.watch.companion.wifi;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.watch.companion.R;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class EncodeTypeSettingFragment extends Fragment {
    private static final String a = "EncodeTypeSettingFragment";

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.d(EncodeTypeSettingFragment.a, "none clicked", new Object[0]);
            EncodeTypeSettingFragment.this.b(0);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.d(EncodeTypeSettingFragment.a, "wep clicked", new Object[0]);
            EncodeTypeSettingFragment.this.b(1);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.d(EncodeTypeSettingFragment.a, "wpa clicked", new Object[0]);
            EncodeTypeSettingFragment.this.b(2);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.d(EncodeTypeSettingFragment.a, "eap clicked", new Object[0]);
            EncodeTypeSettingFragment.this.b(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Activity activity = getActivity();
        if (activity instanceof AddWifiActivity) {
            ((AddWifiActivity) activity).setEncodeType(i);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_encode_type_setting, viewGroup, false);
        viewInflate.findViewById(R.id.type_none).setOnClickListener(new a());
        viewInflate.findViewById(R.id.type_wep).setOnClickListener(new b());
        viewInflate.findViewById(R.id.type_wpa).setOnClickListener(new c());
        viewInflate.findViewById(R.id.type_eap).setOnClickListener(new d());
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        Analytics.endPage(a);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Analytics.startPage(a);
    }
}
