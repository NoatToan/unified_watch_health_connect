package com.mibi.sdk.component;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.session.SessionManager;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.mvp.MvpActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseMvpActivity extends MvpActivity {
    private static final String KEY_SAVE_SESSION = "SAVE_SESSION";
    protected Session mSession;
    private String mTag;

    private void dealWithStartIntent(Intent intent) {
        Session session;
        if (!Utils.isInnerIntent(this, intent) || (session = this.mSession) == null) {
            return;
        }
        intent.putExtra(CommonConstants.KEY_SESSION, SessionManager.saveSession(session));
    }

    public boolean handleBackPressed() {
        return false;
    }

    @Override // com.mibi.sdk.mvp.MvpActivity
    public void handleCreate(Bundle bundle) {
        String simpleName = getClass().getSimpleName();
        this.mTag = simpleName;
        MibiLog.d(simpleName, "handleCreate");
        Client.init(this);
        Session.SessionSaveData sessionSaveData = (Session.SessionSaveData) getIntent().getParcelableExtra(CommonConstants.KEY_SESSION);
        if (sessionSaveData == null) {
            MibiLog.d(this.mTag, "session in intent is null");
        }
        this.mSession = SessionManager.restoreOrUpdateSession(this, bundle != null ? (Session.SessionSaveData) bundle.getParcelable(KEY_SAVE_SESSION) : null, sessionSaveData);
        BaseMvpPresenter baseMvpPresenter = (BaseMvpPresenter) getPresenter();
        if (baseMvpPresenter != null) {
            baseMvpPresenter.updateSession(this.mSession);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!handleBackPressed()) {
            setResult(ErrorCodes.BACK_PRESSED, EntryResultUtils.makeResult(ErrorCodes.BACK_PRESSED, "user canceled"));
        }
        super.onBackPressed();
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onResume() {
        MibiLog.d(this.mTag, LifecycleConstantKt.ON_RESUME);
        super.onResume();
        Session session = this.mSession;
        if (session != null) {
            if (session.isSessionClosed()) {
                MibiLog.d(this.mTag, "session is closed");
                setResult(ErrorCodes.SESSION_CLOSED, EntryResultUtils.makeResult(ErrorCodes.SESSION_CLOSED, "session closed, maybe account changed"));
                finish();
            } else if (this.mSession.isAccountChanged()) {
                new AlertDialog.Builder(this).setTitle(R.string.mibi_error_account_changed_title).setMessage(R.string.mibi_error_account_changed_summary).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.mibi.sdk.component.BaseMvpActivity.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BaseMvpActivity baseMvpActivity = BaseMvpActivity.this;
                        baseMvpActivity.mSession.closeSession(10, baseMvpActivity.getString(R.string.mibi_error_account_changed_summary));
                        BaseMvpActivity.this.setResult(ErrorCodes.ACCOUNT_CHANGED, EntryResultUtils.makeResult(ErrorCodes.ACCOUNT_CHANGED, "account changed"));
                        BaseMvpActivity.this.finish();
                    }
                }).show().setCancelable(false);
            }
        }
    }

    @Override // com.mibi.sdk.mvp.MvpActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        MibiLog.d(this.mTag, "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        Session session = this.mSession;
        if (session != null) {
            bundle.putParcelable(KEY_SAVE_SESSION, SessionManager.saveSession(session));
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        dealWithStartIntent(intent);
        super.startActivityForResult(intent, i, bundle);
    }
}
