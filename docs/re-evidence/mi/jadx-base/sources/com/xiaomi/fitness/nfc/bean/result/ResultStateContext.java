package com.xiaomi.fitness.nfc.bean.result;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes9.dex */
public class ResultStateContext {
    static ResultStateContext sResultStateContext = new ResultStateContext();
    private ResultState mResultState;

    private ResultStateContext() {
    }

    public static ResultStateContext getInstance() {
        return sResultStateContext;
    }

    public void onBackPressed(Fragment fragment) {
        ResultState resultState = this.mResultState;
        if (resultState == null) {
            return;
        }
        resultState.onBackPressed(fragment);
    }

    public void opBtnFroward(Fragment fragment) {
        ResultState resultState = this.mResultState;
        if (resultState == null) {
            return;
        }
        resultState.opBtnFroward(fragment);
    }

    public void opTextForward(Fragment fragment) {
        ResultState resultState = this.mResultState;
        if (resultState == null) {
            return;
        }
        resultState.opTextForward(fragment);
    }

    public void setResultState(ResultState resultState) {
        this.mResultState = resultState;
    }
}
