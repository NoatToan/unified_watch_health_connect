package com.xiaomi.fitness.nfc.bean.result;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.nfc.ui.CardManagerActivity;

/* JADX INFO: loaded from: classes9.dex */
public class IssueCarSuccessResultState implements ResultState {
    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void onBackPressed(Fragment fragment) {
        fragment.getActivity().finish();
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opBtnFroward(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.startActivity(new Intent(activity, (Class<?>) CardManagerActivity.class));
            activity.setResult(-1);
            activity.finish();
        }
    }

    @Override // com.xiaomi.fitness.nfc.bean.result.ResultState
    public void opTextForward(Fragment fragment) {
    }
}
