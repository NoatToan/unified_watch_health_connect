package com.huami.watch.companion.wifi;

import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class WifiPasswordInputFragment extends Fragment {
    private static final String b = "WifiPasswordInputFragment";
    private EditText a;

    public String getPassword() {
        return !TextUtils.isEmpty(this.a.getText()) ? this.a.getText().toString() : "";
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi_password_item, viewGroup, false);
        this.a = (EditText) viewInflate.findViewById(R.id.wifi_pwd_edit_box);
        return viewInflate;
    }
}
