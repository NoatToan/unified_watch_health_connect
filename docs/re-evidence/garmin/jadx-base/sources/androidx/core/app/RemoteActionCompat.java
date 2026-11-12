package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import de.c;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconCompat f6376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f6377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f6378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PendingIntent f6379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6381f;

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        iconCompat.getClass();
        this.f6376a = iconCompat;
        charSequence.getClass();
        this.f6377b = charSequence;
        charSequence2.getClass();
        this.f6378c = charSequence2;
        pendingIntent.getClass();
        this.f6379d = pendingIntent;
        this.f6380e = true;
        this.f6381f = true;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.f6376a = remoteActionCompat.f6376a;
        this.f6377b = remoteActionCompat.f6377b;
        this.f6378c = remoteActionCompat.f6378c;
        this.f6379d = remoteActionCompat.f6379d;
        this.f6380e = remoteActionCompat.f6380e;
        this.f6381f = remoteActionCompat.f6381f;
    }
}
