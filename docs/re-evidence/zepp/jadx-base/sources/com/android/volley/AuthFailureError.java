package com.android.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class AuthFailureError extends VolleyError {
    private Intent a;

    public AuthFailureError() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public Intent getResolutionIntent() {
        return this.a;
    }

    public AuthFailureError(Intent intent) {
        this.a = intent;
    }

    public AuthFailureError(NetworkResponse networkResponse) {
        super(networkResponse);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }
}
