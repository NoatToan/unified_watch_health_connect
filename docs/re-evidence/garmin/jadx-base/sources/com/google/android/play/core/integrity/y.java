package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes14.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53398c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53400e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f53396a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f53399d = new Object();

    public y(String str, long j8) {
        this.f53397b = str;
        this.f53398c = j8;
    }

    public final Task a(Activity activity, int i14) {
        synchronized (this.f53399d) {
            try {
                if (this.f53400e) {
                    return Tasks.forResult(0);
                }
                this.f53400e = true;
                this.f53396a.a("checkAndShowDialog(%s)", Integer.valueOf(i14));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i14);
                bundle.putString("package.name", this.f53397b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 4);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f53398c);
                return b(activity, bundle);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
