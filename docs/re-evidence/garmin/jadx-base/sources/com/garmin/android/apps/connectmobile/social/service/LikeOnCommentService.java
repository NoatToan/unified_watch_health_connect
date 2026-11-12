package com.garmin.android.apps.connectmobile.social.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import fo1.f;
import fo1.u;
import o13.r;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import u53.d;
import v13.e;
import v13.i;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/service/LikeOnCommentService;", "Landroid/app/IntentService;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LikeOnCommentService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f44589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f44590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f44591c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.social.service.LikeOnCommentService$onHandleIntent$1$1", f = "LikeOnCommentService.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44592a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f44594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f44594c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LikeOnCommentService.this.new b(this.f44594c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44592a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = LikeOnCommentService.this.f44589a;
                this.f44592a = 1;
                fVar.getClass();
                if (f0.J(fVar, new u(fVar, this.f44594c, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public LikeOnCommentService() {
        super("LikeOnCommentService");
        f.f72522b.getClass();
        this.f44589a = f.a.a();
        e2 e2VarH = ge1.b.h();
        this.f44590b = e2VarH;
        c cVar = s0.f129406a;
        this.f44591c = c0.a(x53.b.f189152a.plus(e2VarH));
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f44590b.c(null);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Bundle extras;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LikeOnCommentService", "onHandleIntent: intent=[" + intent + "]");
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        int i14 = extras.getInt("extra.notification.id");
        String string = extras.getString("GCM_conversation_comment_id");
        i2.a.b(a2Var, "LikeOnCommentService", o2.c.e(i14, "handleLikeOnCommentIntent: cancelling notificationId=[", "], commentUuid=[", string, "]"));
        sz0.f.f161394a.getClass();
        sz0.f.a.a(i14, this);
        if (string != null) {
            ge1.b.T(this.f44591c, null, null, new b(string, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/service/LikeOnCommentService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
