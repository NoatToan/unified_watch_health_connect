package com.huami.utils.easypermission;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes15.dex */
class e {
    private static final String i = "positiveButton";
    private static final String j = "negativeButton";
    private static final String k = "rationaleMsg";
    private static final String l = "theme";
    private static final String m = "requestkey";
    private static final String n = "requestCode";
    private static final String o = "onceADay";
    private static final String p = "permissions";
    public String a;
    public String b;
    public int c;
    public String d;
    public int e;
    public boolean f;
    public String g;
    public String[] h;

    public e(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, String str4, int i3, boolean z, @NonNull String[] strArr) {
        this.a = str;
        this.b = str2;
        this.g = str3;
        this.c = i2;
        this.d = str4;
        this.e = i3;
        this.f = z;
        this.h = strArr;
    }

    public AlertDialog a(Context context, DialogInterface.OnClickListener onClickListener) {
        return (this.c > 0 ? new AlertDialog.Builder(context, this.c) : new AlertDialog.Builder(context)).setCancelable(false).setPositiveButton(this.a, onClickListener).setNegativeButton(this.b, onClickListener).setMessage(this.g).create();
    }

    public androidx.appcompat.app.AlertDialog b(Context context, DialogInterface.OnClickListener onClickListener) {
        int i2 = this.c;
        return (i2 > 0 ? new androidx.appcompat.app.AlertDialog.Builder(context, i2) : new androidx.appcompat.app.AlertDialog.Builder(context)).setCancelable(false).setPositiveButton(this.a, onClickListener).setNegativeButton(this.b, onClickListener).setMessage(this.g).create();
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString(i, this.a);
        bundle.putString(j, this.b);
        bundle.putString(k, this.g);
        bundle.putInt(l, this.c);
        bundle.putString(m, this.d);
        bundle.putInt(n, this.e);
        bundle.putBoolean(o, this.f);
        bundle.putStringArray("permissions", this.h);
        return bundle;
    }

    public e(Bundle bundle) {
        this.a = bundle.getString(i);
        this.b = bundle.getString(j);
        this.g = bundle.getString(k);
        this.c = bundle.getInt(l);
        this.d = bundle.getString(m);
        this.e = bundle.getInt(n);
        this.f = bundle.getBoolean(o);
        this.h = bundle.getStringArray("permissions");
    }
}
