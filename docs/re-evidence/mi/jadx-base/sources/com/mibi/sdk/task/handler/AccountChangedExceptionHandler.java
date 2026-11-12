package com.mibi.sdk.task.handler;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.exception.AccountChangedException;
import com.mibi.sdk.common.exception.AccountException;
import com.mibi.sdk.task.R;

/* JADX INFO: loaded from: classes5.dex */
public class AccountChangedExceptionHandler implements ExceptionDispatcher.ExceptionHandler {
    private Context mContext;

    public AccountChangedExceptionHandler(Context context) {
        this.mContext = context;
    }

    @Override // com.mibi.sdk.task.handler.ExceptionDispatcher.ExceptionHandler
    public boolean handle(Throwable th, Bundle bundle, ExceptionDispatcher exceptionDispatcher) {
        if (!bundle.containsKey(CommonConstants.KEY_ERR_CODE)) {
            bundle.putInt(CommonConstants.KEY_ERR_CODE, th instanceof AccountChangedException ? ((AccountChangedException) th).getErrorCode() : 10);
        }
        if (!bundle.containsKey("errDesc")) {
            String string = this.mContext.getString(R.string.mibi_error_account_changed_summary);
            if (th instanceof AccountChangedException) {
                string = ((AccountChangedException) th).getErrorSummary();
            }
            bundle.putString("errDesc", string);
        }
        return exceptionDispatcher.dispatchAs(th, bundle, AccountException.class);
    }

    @Override // com.mibi.sdk.task.handler.ExceptionDispatcher.ExceptionHandler
    public Class<? extends Throwable> registeredException() {
        return AccountChangedException.class;
    }
}
