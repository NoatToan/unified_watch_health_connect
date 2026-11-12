package com.xiaomi.fitness.nfc.bean.result;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes9.dex */
public class ShiftInFailResultState implements ResultState {
    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void onBackPressed(Fragment fragment) {
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opBtnFroward(Fragment fragment) {
        fragment.getActivity().setResult(-1);
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opTextForward(Fragment fragment) {
    }
}
