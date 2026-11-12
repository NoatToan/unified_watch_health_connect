package com.garmin.android.apps.connectmobile.domain.watchers;

import android.content.SharedPreferences;
import androidx.annotation.Keep;
import c22.y2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import f12.l;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;
import x53.c;
import z70.w;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/domain/watchers/UserFocusPromoWatcher;", "Lz70/w;", "<init>", "()V", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Companion", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserFocusPromoWatcher implements w {
    private static final String TAG = "UserFocusPromoWatcher";
    private final SharedPreferences.OnSharedPreferenceChangeListener listener;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.UserFocusPromoWatcher$listener$1$1", f = "UserFocusPromoWatcher.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34727a;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.f34727a;
            if (i14 == 0) {
                r.b(obj);
                g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
                this.f34727a = 1;
                if (g1Var.w(this) == aVar) {
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

    public UserFocusPromoWatcher() {
        y2 y2Var = new y2(this, 3);
        this.listener = y2Var;
        l.f68084a.getClass();
        l.a.a().u3(y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listener$lambda$0(UserFocusPromoWatcher userFocusPromoWatcher, SharedPreferences sharedPreferences, String str) {
        l.f68084a.getClass();
        if (s.g(str, "userFocus")) {
            a2 a2Var = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, TAG, "User focus changed. Remap promotions.");
            c cVar = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(null), 3);
        }
    }
}
