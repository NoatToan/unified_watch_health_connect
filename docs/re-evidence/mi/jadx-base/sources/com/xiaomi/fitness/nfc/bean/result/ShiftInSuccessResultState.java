package com.xiaomi.fitness.nfc.bean.result;

import androidx.fragment.app.Fragment;
import defpackage.vqg;

/* JADX INFO: loaded from: classes9.dex */
public class ShiftInSuccessResultState implements ResultState {
    private void gotoManagerPage(Fragment fragment) {
        vqg.d("ShiftInSuccessResultState  gotoManagerPage");
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void onBackPressed(Fragment fragment) {
        gotoManagerPage(fragment);
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opBtnFroward(Fragment fragment) {
        vqg.d("ShiftInSuccessResultState  opBtnFroward");
        gotoManagerPage(fragment);
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opTextForward(Fragment fragment) {
    }
}
