package com.huami.watch.companion.wifi;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class TTLSStep2VerifyTypeChoosingFragment extends Fragment {

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TTLSStep2VerifyTypeChoosingFragment.this.b(0);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TTLSStep2VerifyTypeChoosingFragment.this.b(1);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TTLSStep2VerifyTypeChoosingFragment.this.b(2);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TTLSStep2VerifyTypeChoosingFragment.this.b(3);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TTLSStep2VerifyTypeChoosingFragment.this.b(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Activity activity = getActivity();
        if (activity instanceof AddWifiActivity) {
            ((AddWifiActivity) activity).setVerifyType(i);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_ttls_step2_verify, viewGroup, false);
        viewInflate.findViewById(R.id.type_none).setOnClickListener(new a());
        viewInflate.findViewById(R.id.type_pap).setOnClickListener(new b());
        viewInflate.findViewById(R.id.type_mschap).setOnClickListener(new c());
        viewInflate.findViewById(R.id.type_mschapv2).setOnClickListener(new d());
        viewInflate.findViewById(R.id.type_gtc).setOnClickListener(new e());
        return viewInflate;
    }
}
