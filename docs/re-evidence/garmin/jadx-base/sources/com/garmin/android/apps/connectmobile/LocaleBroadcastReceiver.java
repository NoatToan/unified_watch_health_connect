package com.garmin.android.apps.connectmobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import c22.l3;
import com.garmin.android.apps.connectmobile.settings.locale.LocaleUpdateWorker;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/LocaleBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocaleBroadcastReceiver extends BroadcastReceiver {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.LocaleBroadcastReceiver$onReceive$1", f = "LocaleBroadcastReceiver.kt", l = {29, 32, 40}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28703a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (c22.f2.a("LocaleBroadcastReceiver", r7) == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f28703a;
            if (i14 == 0) {
                o13.r.b(obj);
                oj0.w wVar = (oj0.w) KoinJavaComponent.get$default(oj0.w.class, null, null, 6, null);
                this.f28703a = 1;
                if (wVar.a(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                ((a91.x) KoinJavaComponent.get$default(a91.x.class, null, null, 6, null)).a(d91.u.OTHER_LOCALE_CHANGE);
                this.f28703a = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            zd0.q0 q0Var = (zd0.q0) KoinJavaComponent.get$default(zd0.q0.class, null, null, 6, null);
            this.f28703a = 2;
            if (q0Var.k(this) != aVar) {
                ((a91.x) KoinJavaComponent.get$default(a91.x.class, null, null, 6, null)).a(d91.u.OTHER_LOCALE_CHANGE);
                this.f28703a = 3;
            }
            return aVar;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws RemoteException {
        context.getClass();
        intent.getClass();
        if (p005kotlin.jvm.internal.s.g(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            LocaleUpdateWorker.f43431l.getClass();
            LocaleUpdateWorker.a.a(context);
            l3.f23124b.getClass();
            l3.f23127e = new DecimalFormat("#,###,##0.000");
            l3.f23129g = new DecimalFormat("#,###,##0.00");
            l3.f23130h = new DecimalFormat("#,###,##0.0");
            l3.f23131i = new DecimalFormat("#,###,###");
            l3.f23125c = new DecimalFormat("#,###,##0.##");
            l3.f23126d = new DecimalFormat("#,###,##0.#");
            v1.f47374a.getClass();
            v1.j(context, false, null);
            ge1.b.T(o53.c0.a(o53.s0.f129406a), null, null, new a(null), 3);
        }
    }
}
