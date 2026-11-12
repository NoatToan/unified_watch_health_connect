package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationTarget extends SimpleTarget<Bitmap> {
    private final RemoteViews d;
    private final Context e;
    private final int f;
    private final String g;
    private final Notification h;
    private final int i;

    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    private void a() {
        ((NotificationManager) Preconditions.checkNotNull((NotificationManager) this.e.getSystemService(SleepHomeActivity.FROM_NOTIFICATION))).notify(this.g, this.f, this.h);
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    public NotificationTarget(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        this.d.setImageViewBitmap(this.i, bitmap);
        a();
    }

    public NotificationTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.e = (Context) Preconditions.checkNotNull(context, "Context must not be null!");
        this.h = (Notification) Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.d = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.i = i3;
        this.f = i4;
        this.g = str;
    }
}
