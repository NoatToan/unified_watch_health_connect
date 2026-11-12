package com.garmin.android.apps.connectmobile.startup.init;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.garmin.android.apps.connectmobile.c1;
import com.garmin.android.apps.connectmobile.d1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vb.h;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/ForegroundBackgroundInitializer;", "Lzd/b;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ForegroundBackgroundInitializer implements b<Unit> {
    static {
        new a(null);
    }

    @Override // zd.b
    public final Unit create(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (d1.f33126h == null) {
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (!(applicationContext2 instanceof Application)) {
                h.z("Foreground is not initialised and cannot obtain the Application object");
                return null;
            }
            Application application = (Application) applicationContext2;
            if (d1.f33126h == null) {
                d1 d1Var = new d1();
                d1.f33126h = d1Var;
                application.registerActivityLifecycleCallbacks(d1Var);
                d1.f33126h.f33134f = new c1();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                application.registerReceiver(d1.f33126h.f33134f, intentFilter);
            }
        }
        d1 d1Var2 = d1.f33126h;
        d1Var2.f33132d.add(new eq1.a());
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/ForegroundBackgroundInitializer$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
