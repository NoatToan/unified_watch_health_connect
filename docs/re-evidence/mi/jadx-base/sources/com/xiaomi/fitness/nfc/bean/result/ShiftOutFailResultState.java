package com.xiaomi.fitness.nfc.bean.result;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.nfc.ui.TransferOutIntroFragment;

/* JADX INFO: loaded from: classes9.dex */
public class ShiftOutFailResultState implements ResultState {
    private void setResult(Fragment fragment, boolean z) {
        Intent intent = new Intent();
        intent.putExtra(TransferOutIntroFragment.KEY_AUTO_RETRY, z);
        fragment.getActivity().setResult(1, intent);
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void onBackPressed(Fragment fragment) {
        setResult(fragment, false);
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opBtnFroward(Fragment fragment) {
        setResult(fragment, true);
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opTextForward(Fragment fragment) {
    }
}
