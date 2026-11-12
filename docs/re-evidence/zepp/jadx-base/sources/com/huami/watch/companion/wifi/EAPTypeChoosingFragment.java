package com.huami.watch.companion.wifi;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class EAPTypeChoosingFragment extends Fragment {

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPTypeChoosingFragment.this.b(0);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPTypeChoosingFragment.this.b(1);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPTypeChoosingFragment.this.b(2);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPTypeChoosingFragment.this.b(3);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPTypeChoosingFragment.this.b(4);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EAPTypeChoosingFragment.this.b(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Activity activity = getActivity();
        if (activity instanceof AddWifiActivity) {
            ((AddWifiActivity) activity).setEAPType(i);
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_eap_types, viewGroup, false);
        viewInflate.findViewById(R.id.type_peap).setOnClickListener(new a());
        viewInflate.findViewById(R.id.type_tls).setOnClickListener(new b());
        viewInflate.findViewById(R.id.type_ttls).setOnClickListener(new c());
        viewInflate.findViewById(R.id.type_pwd).setOnClickListener(new d());
        viewInflate.findViewById(R.id.type_sim).setOnClickListener(new e());
        viewInflate.findViewById(R.id.type_aka).setOnClickListener(new f());
        return viewInflate;
    }
}
