package com.garmin.android.apps.connectmobile.onboarding.inappupdate;

import android.content.Context;
import com.garmin.android.apps.connectmobile.startup.init.DependencyInjectionInitializer;
import java.util.List;
import o31.a;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import zd.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/inappupdate/InAppUpdateInitializer;", "Lzd/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InAppUpdateInitializer implements b<Unit> {
    @Override // zd.b
    public final Unit create(Context context) {
        context.getClass();
        ((a) KoinJavaComponent.get$default(a.class, null, null, 6, null)).z1(context);
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return x.m(DependencyInjectionInitializer.class);
    }
}
