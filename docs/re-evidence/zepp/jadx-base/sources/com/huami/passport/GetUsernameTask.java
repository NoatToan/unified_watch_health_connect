package com.huami.passport;

import android.app.Activity;
import android.os.AsyncTask;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class GetUsernameTask extends AsyncTask<Void, Void, Void> {
    public Activity mActivity;
    public IAccount.Callback<String, String> mCallback;
    public String mName;
    public String mScope;

    public GetUsernameTask(Activity activity, String str, String str2, IAccount.Callback<String, String> callback) {
        this.mActivity = activity;
        this.mScope = str2;
        this.mName = str;
        this.mCallback = callback;
    }

    public String fetchToken() throws IOException {
        try {
            return GoogleAuthUtil.getToken(this.mActivity, this.mName, this.mScope);
        } catch (UserRecoverableAuthException | GoogleAuthException unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) {
        try {
            fetchToken();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
