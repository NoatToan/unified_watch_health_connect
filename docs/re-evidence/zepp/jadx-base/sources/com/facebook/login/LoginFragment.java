package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes2.dex */
public class LoginFragment extends Fragment {
    public static final String d = "com.facebook.LoginFragment:Result";
    public static final String e = "com.facebook.LoginFragment:Request";
    public static final String f = "request";
    private static final String g = "LoginFragment";
    private static final String h = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    private static final String i = "loginClient";
    private String a;
    private LoginClient b;
    private LoginClient.Request c;

    public class a implements LoginClient.OnCompletedListener {
        public a() {
        }

        @Override // com.facebook.login.LoginClient.OnCompletedListener
        public void onCompleted(LoginClient.Result result) {
            LoginFragment.this.d(result);
        }
    }

    public class b implements LoginClient.b {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // com.facebook.login.LoginClient.b
        public void a() {
            this.a.setVisibility(0);
        }

        @Override // com.facebook.login.LoginClient.b
        public void b() {
            this.a.setVisibility(8);
        }
    }

    private void c(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.a = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(LoginClient.Result result) {
        this.c = null;
        int i2 = result.a == LoginClient.Result.b.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(d, result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i2, intent);
            getActivity().finish();
        }
    }

    public LoginClient b() {
        return this.b;
    }

    public LoginClient createLoginClient() {
        return new LoginClient(this);
    }

    @LayoutRes
    public int getLayoutResId() {
        return com.facebook.common.R.layout.com_facebook_login_fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.b.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable(i);
            this.b = loginClient;
            loginClient.w(this);
        } else {
            this.b = createLoginClient();
        }
        this.b.x(new a());
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        c(activity);
        Intent intent = activity.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra(e)) == null) {
            return;
        }
        this.c = (LoginClient.Request) bundleExtra.getParcelable("request");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(getLayoutResId(), viewGroup, false);
        this.b.v(new b(viewInflate.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar)));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.b.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View viewFindViewById = getView() == null ? null : getView().findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.a != null) {
            this.b.y(this.c);
        } else {
            Log.e(g, h);
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(i, this.b);
    }
}
