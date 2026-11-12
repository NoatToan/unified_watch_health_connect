package com.garmin.android.apps.connectmobile.training.atp.create.video;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wt1.r;
import xw1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/video/a;", "", "", "name", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0871a f45334d = new C0871a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45337c;

    public a(String str, String str2) {
        this.f45335a = str;
        this.f45336b = str2;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.create.video.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/video/a$a;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0871a {
        public /* synthetic */ C0871a(j jVar) {
            this();
        }

        public static Intent a(Context context, o oVar) {
            if (context == null || oVar == null || oVar.getVideoUrl() == null) {
                return null;
            }
            a aVar = new a(oVar.getVideoTitle(), oVar.getVideoUrl());
            String subtitleUrl = oVar.getSubtitleUrl();
            if (subtitleUrl != null) {
                aVar.f45337c = r.a().concat(subtitleUrl);
            }
            Intent intent = new Intent(context, (Class<?>) PlayerActivity.class);
            intent.setData(Uri.parse(aVar.f45336b)).setAction("com.google.android.exoplayer.demo.action.VIEW").putExtra("name", aVar.f45335a).putExtra("caption_uri", aVar.f45337c);
            return intent;
        }

        private C0871a() {
        }
    }
}
