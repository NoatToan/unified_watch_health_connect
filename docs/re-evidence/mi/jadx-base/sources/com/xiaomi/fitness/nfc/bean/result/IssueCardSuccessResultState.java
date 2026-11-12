package com.xiaomi.fitness.nfc.bean.result;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.o0j;

/* JADX INFO: loaded from: classes9.dex */
public class IssueCardSuccessResultState implements ResultState {
    private static final String BUSCARD_GUIDE_URL = "https://sf.pay.xiaomi.com/views/busCard-guide/";

    private void gotoManagerPage(Fragment fragment) {
        new Bundle();
        fragment.getActivity().finish();
    }

    private void startIssuedListActivity(Fragment fragment) {
        gotoManagerPage(fragment);
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void onBackPressed(Fragment fragment) {
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opBtnFroward(Fragment fragment) {
        startIssuedListActivity(fragment);
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opTextForward(Fragment fragment) {
        WebViewUtilKt.startWebView(BUSCARD_GUIDE_URL, fragment.getString(o0j.U6), true);
    }
}
