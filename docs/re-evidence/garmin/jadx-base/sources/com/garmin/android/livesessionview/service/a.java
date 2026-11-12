package com.garmin.android.livesessionview.service;

import a7.b;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import gg2.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zg2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/livesessionview/service/a;", "Lgg2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50582a;

    static {
        new C1014a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f50582a = context;
    }

    @Override // gg2.e
    public final void a() {
        Context context = this.f50582a;
        c.f204692a.getClass();
        c.a("LiveActivitySessionServiceManagerImpl", "Starting LiveActivityService");
        try {
            LiveActivitySessionService.f50577e.getClass();
            b.startForegroundService(context, new Intent(context, (Class<?>) LiveActivitySessionService.class));
        } catch (Exception e4) {
            c cVar = c.f204692a;
            String str = "Failed to start LiveActivityService: " + e4.getMessage();
            cVar.getClass();
            c.b("LiveActivitySessionServiceManagerImpl", str);
        }
    }

    @Override // gg2.e
    public final void b() {
        Context context = this.f50582a;
        c.f204692a.getClass();
        c.a("LiveActivitySessionServiceManagerImpl", "Stopping LiveActivityService");
        try {
            LiveActivitySessionService.f50577e.getClass();
            context.stopService(new Intent(context, (Class<?>) LiveActivitySessionService.class));
        } catch (Exception e4) {
            c cVar = c.f204692a;
            String str = "Failed to stop LiveActivityService: " + e4.getMessage();
            cVar.getClass();
            c.b("LiveActivitySessionServiceManagerImpl", str);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.livesessionview.service.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/livesessionview/service/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1014a {
        public /* synthetic */ C1014a(j jVar) {
            this();
        }

        private C1014a() {
        }
    }
}
