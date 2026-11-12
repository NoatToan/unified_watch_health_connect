package com.garmin.android.apps.connectmobile.social.service;

import am.c2;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import fo1.f;
import fo1.v;
import fo1.w;
import o13.r;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/service/LikeOnConversationService;", "Landroid/app/IntentService;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LikeOnConversationService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f44595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f44596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f44597c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.social.service.LikeOnConversationService$onHandleIntent$2$1", f = "LikeOnConversationService.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44598a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f44600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<c2> f44601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f44602e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, r0<c2> r0Var, String str2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f44600c = str;
            this.f44601d = r0Var;
            this.f44602e = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LikeOnConversationService.this.new b(this.f44600c, this.f44601d, this.f44602e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44598a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = LikeOnConversationService.this.f44597c;
                c2 c2Var = this.f44601d.f105810a;
                c2Var.getClass();
                this.f44598a = 1;
                fVar.getClass();
                if (f0.J(fVar, new w(fVar, this.f44600c, c2Var, this.f44602e, null), this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.social.service.LikeOnConversationService$onHandleIntent$3$1", f = "LikeOnConversationService.kt", l = {40}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44603a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0<c2> f44605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f44606d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0<c2> r0Var, String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f44605c = r0Var;
            this.f44606d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LikeOnConversationService.this.new c(this.f44605c, this.f44606d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f44603a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = LikeOnConversationService.this.f44597c;
                c2 c2Var = this.f44605c.f105810a;
                c2Var.getClass();
                this.f44603a = 1;
                fVar.getClass();
                if (f0.J(fVar, new v(fVar, c2Var, this.f44606d, null), this) == aVar) {
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

    public LikeOnConversationService() {
        super("LikeOnConversationService");
        e2 e2VarH = ge1.b.h();
        this.f44595a = e2VarH;
        x53.c cVar = s0.f129406a;
        this.f44596b = c0.a(x53.b.f189152a.plus(e2VarH));
        f.f72522b.getClass();
        this.f44597c = f.a.a();
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f44595a.c(null);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, am.c2] */
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i14 = extras.getInt("extra.notification.id");
            String string = extras.getString("GCM_conversation_resource_type");
            r0 r0Var = new r0();
            if (string != null) {
                r0Var.f105810a = c2.valueOf(string);
            }
            String string2 = extras.getString("GCM_conversation_resource_id");
            String string3 = extras.getString("GCM_extra_connection_group_id");
            sz0.f.f161394a.getClass();
            sz0.f.a.a(i14, this);
            String str = "handleLikeOnConversationIntent resourceType = " + r0Var.f105810a + ", resourceId = " + string2;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LikeOnConversationService", str);
            if (r0Var.f105810a != 0 && string2 != null) {
                d dVar = this.f44596b;
                if (string3 != null) {
                    ge1.b.T(dVar, null, null, new b(string3, r0Var, string2, null), 3);
                } else {
                    ge1.b.T(dVar, null, null, new c(r0Var, string2, null), 3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/service/LikeOnConversationService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
