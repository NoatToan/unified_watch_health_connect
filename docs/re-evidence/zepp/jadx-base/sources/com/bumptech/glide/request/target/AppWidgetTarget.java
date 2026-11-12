package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public class AppWidgetTarget extends SimpleTarget<Bitmap> {
    private final int[] d;
    private final ComponentName e;
    private final RemoteViews f;
    private final Context g;
    private final int h;

    public AppWidgetTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.g = (Context) Preconditions.checkNotNull(context, "Context can not be null!");
        this.f = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.d = (int[]) Preconditions.checkNotNull(iArr, "WidgetIds can not be null!");
        this.h = i3;
        this.e = null;
    }

    private void a() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.g);
        ComponentName componentName = this.e;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f);
        } else {
            appWidgetManager.updateAppWidget(this.d, this.f);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        this.f.setImageViewBitmap(this.h, bitmap);
        a();
    }

    public AppWidgetTarget(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public AppWidgetTarget(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.g = (Context) Preconditions.checkNotNull(context, "Context can not be null!");
        this.f = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.e = (ComponentName) Preconditions.checkNotNull(componentName, "ComponentName can not be null!");
        this.h = i3;
        this.d = null;
    }

    public AppWidgetTarget(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
