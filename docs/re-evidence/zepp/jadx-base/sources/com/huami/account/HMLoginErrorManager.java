package com.huami.account;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.multidex.MultiDexExtractor;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.ui.login.LoginErrorFragment;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class HMLoginErrorManager {
    private File a = new File(AccountExternalsKt.getAppContext().getFilesDir().getAbsolutePath() + File.separator + "login_fail_log_" + System.currentTimeMillis() + MultiDexExtractor.EXTRACTED_SUFFIX);

    public interface Callback {
        void onFail();

        void onStart();

        void onSuccess();
    }

    public static class a extends AsyncTask<Void, Void, Boolean> {
        private Callback a;
        private File b;
        private String c;

        public a(Callback callback, File file, String str) {
            this.a = callback;
            this.b = file;
            this.c = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            if (!AccountExternalsKt.getCommonDelegate().archiveDir(AccountExternalsKt.getAppContext(), this.b)) {
                return Boolean.FALSE;
            }
            String loginErrorLogFile = HMAccountWebAPI.getLoginErrorLogFile(this.b);
            if (TextUtils.isEmpty(loginErrorLogFile)) {
                return Boolean.FALSE;
            }
            try {
                JSONObject jSONObject = new JSONObject(loginErrorLogFile);
                String string = jSONObject.getString("putURI");
                String string2 = jSONObject.getString("objectName");
                return Boolean.valueOf(HMAccountWebAPI.uploadLoginErrorLogFile(string, this.b) && HMAccountWebAPI.updateLoginErrorLogFileInfo(string2.substring(string2.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1), this.c));
            } catch (JSONException unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (this.a == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.a.onSuccess();
            } else {
                this.a.onFail();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            Callback callback = this.a;
            if (callback != null) {
                callback.onStart();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Callback callback, String str) {
        deleteZipFile();
        new a(callback, this.a, str).execute(new Void[0]);
    }

    public boolean deleteZipFile() {
        File file = this.a;
        return file == null || !file.exists() || this.a.delete();
    }

    public void showLoginErrorFragment(FragmentActivity fragmentActivity, final Callback callback) {
        LoginErrorFragment loginErrorFragment = new LoginErrorFragment();
        loginErrorFragment.setListener(new LoginErrorFragment.OnListener() { // from class: i03
            @Override // com.huami.account.ui.login.LoginErrorFragment.OnListener
            public final void onFeedback(String str) {
                this.a.b(callback, str);
            }
        });
        loginErrorFragment.show(fragmentActivity.getSupportFragmentManager(), (String) null);
    }
}
