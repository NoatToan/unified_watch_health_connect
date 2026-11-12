package com.xiaomi.fitness.nfc.bean.result;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes9.dex */
public class IssueCarFailRetryResultState implements ResultState {
    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void onBackPressed(Fragment fragment) {
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opBtnFroward(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opTextForward(Fragment fragment) {
    }
}
