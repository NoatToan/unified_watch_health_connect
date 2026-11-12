package com.mibi.sdk.component;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.account.loader.AccountLoader;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.session.SessionManager;
import com.mibi.sdk.common.utils.MibiLog;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseEntryActivity extends Activity implements EntryResultCallback {
    private final String TAG = getClass().getSimpleName();
    private BaseEntryHandler mEntryHandler;
    protected Session mSession;

    private void startEntryProcess(Bundle bundle, boolean z) {
        this.mEntryHandler.startEntryProcess(bundle, z);
    }

    public Session buildSession(AccountLoader accountLoader) {
        return SessionManager.newSession(this, accountLoader);
    }

    public void doActivityResult(int i, int i2, Intent intent) {
        this.mEntryHandler.handleActivityResult(i, i2, intent);
    }

    public void doCreate(Bundle bundle) {
        if (bundle == null) {
            startEntryProcess(bundle, isNoAccount());
        }
    }

    public abstract void doEntryFailed(int i, String str);

    public abstract void doEntrySuccess();

    public void doPreCreate(Bundle bundle) {
        if (this.mEntryHandler == null) {
            this.mEntryHandler = new BaseEntryHandler(this, this);
        }
        if (bundle != null) {
            this.mSession = SessionManager.restoreOrUpdateSession(this, (Session.SessionSaveData) bundle.getParcelable(CommonConstants.KEY_SESSION), null);
        }
    }

    public void doSaveInstanceState(Bundle bundle) {
        Session session = this.mSession;
        if (session != null) {
            bundle.putParcelable(CommonConstants.KEY_SESSION, SessionManager.saveSession(session));
        }
    }

    public Session getSession() {
        return this.mSession;
    }

    public boolean isNoAccount() {
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        MibiLog.d(this.TAG, "onActivityResult");
        super.onActivityResult(i, i2, intent);
        doActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        MibiLog.d(this.TAG, "onCreate");
        doPreCreate(bundle);
        super.onCreate(bundle);
        doCreate(bundle);
    }

    @Override // com.mibi.sdk.component.EntryResultCallback
    public final void onEntryFailed(int i, String str) {
        doEntryFailed(i, str);
    }

    @Override // com.mibi.sdk.component.EntryResultCallback
    public final void onEntrySuccess(AccountLoader accountLoader) {
        this.mSession = buildSession(accountLoader);
        MibiLog.d(this.TAG, "versionName : " + MibiSdkConstants.SDK_VERSION_NAME + " ; versionCode : 78");
        doEntrySuccess();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.mEntryHandler.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        MibiLog.d(this.TAG, "onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        doSaveInstanceState(bundle);
    }

    public void returnError(int i, String str) {
        returnError(i, str, null);
    }

    public void returnResult(int i, Intent intent) {
        if (i == -1) {
            returnSuccess(intent);
        } else if (intent != null) {
            returnError(i, intent.getStringExtra("message"), intent.getBundleExtra("result"));
        } else {
            returnError(i, "data is null", null);
        }
    }

    public void returnSuccess(Intent intent) {
        setResult(-1, intent);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Session session;
        if (Utils.isInnerIntent(this, intent) && (session = this.mSession) != null) {
            intent.putExtra(CommonConstants.KEY_SESSION, SessionManager.saveSession(session));
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        Session session;
        if (Utils.isInnerIntent(this, intent) && (session = this.mSession) != null) {
            intent.putExtra(CommonConstants.KEY_SESSION, SessionManager.saveSession(session));
        }
        super.startActivityFromFragment(fragment, intent, i, bundle);
    }

    public void returnError(int i, String str, Bundle bundle) {
        setResult(i, EntryResultUtils.makeResult(i, str, bundle));
    }
}
