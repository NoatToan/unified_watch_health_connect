package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;

/* JADX INFO: loaded from: classes18.dex */
abstract class q extends com.squareup.picasso.a<c> {
    public final RemoteViews m;
    public final int n;
    private c o;

    public static class a extends q {
        private final int[] p;

        public a(Picasso picasso, Request request, RemoteViews remoteViews, int i, int[] iArr, int i2, int i3, String str, Object obj, int i4) {
            super(picasso, request, remoteViews, i, i4, i2, i3, obj, str);
            this.p = iArr;
        }

        @Override // com.squareup.picasso.q, com.squareup.picasso.a
        public /* bridge */ /* synthetic */ c k() {
            return super.k();
        }

        @Override // com.squareup.picasso.q
        public void p() {
            AppWidgetManager.getInstance(this.a.e).updateAppWidget(this.p, this.m);
        }
    }

    public static class b extends q {
        private final int p;
        private final Notification q;

        public b(Picasso picasso, Request request, RemoteViews remoteViews, int i, int i2, Notification notification, int i3, int i4, String str, Object obj, int i5) {
            super(picasso, request, remoteViews, i, i5, i3, i4, obj, str);
            this.p = i2;
            this.q = notification;
        }

        @Override // com.squareup.picasso.q, com.squareup.picasso.a
        public /* bridge */ /* synthetic */ c k() {
            return super.k();
        }

        @Override // com.squareup.picasso.q
        public void p() {
            ((NotificationManager) u.q(this.a.e, SleepHomeActivity.FROM_NOTIFICATION)).notify(this.p, this.q);
        }
    }

    public static class c {
        public final RemoteViews a;
        public final int b;

        public c(RemoteViews remoteViews, int i) {
            this.a = remoteViews;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.a.equals(cVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }
    }

    public q(Picasso picasso, Request request, RemoteViews remoteViews, int i, int i2, int i3, int i4, Object obj, String str) {
        super(picasso, null, request, i3, i4, i2, null, str, obj, false);
        this.m = remoteViews;
        this.n = i;
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.m.setImageViewBitmap(this.n, bitmap);
        p();
    }

    @Override // com.squareup.picasso.a
    public void c() {
        int i = this.g;
        if (i != 0) {
            o(i);
        }
    }

    @Override // com.squareup.picasso.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c k() {
        if (this.o == null) {
            this.o = new c(this.m, this.n);
        }
        return this.o;
    }

    public void o(int i) {
        this.m.setImageViewResource(this.n, i);
        p();
    }

    public abstract void p();
}
