package com.huami.watch.companion.wifi;

import android.app.Fragment;
import android.view.inputmethod.InputMethodManager;
import com.huami.watch.wifi.WifiTypeInfo;

/* JADX INFO: loaded from: classes16.dex */
public class EAPBaseFragment extends Fragment {
    public WifiTypeInfo getWifiInputInfo() {
        return null;
    }

    public void hideKeyBoard() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        if (inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 2);
        }
    }

    public void setVerifyResult(int i) {
    }

    public void showStep2VerifyDialog() {
    }
}
