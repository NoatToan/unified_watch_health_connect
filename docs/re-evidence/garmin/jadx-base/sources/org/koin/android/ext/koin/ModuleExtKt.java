package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import e23.a;
import k23.d;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"ERROR_MSG", "", "androidContext", "Landroid/content/Context;", "Lorg/koin/core/scope/Scope;", "androidApplication", "Landroid/app/Application;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModuleExtKt {
    public static final String ERROR_MSG = "Please use androidContext() function in your KoinApplication configuration.";

    public static final Application androidApplication(Scope scope) throws MissingAndroidContextException {
        scope.getClass();
        try {
            return (Application) scope.get((d<?>) s0.f105811a.b(Application.class), (Qualifier) null, (a<? extends ParametersHolder>) null);
        } catch (NoDefinitionFoundException unused) {
            throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    public static final Context androidContext(Scope scope) {
        scope.getClass();
        try {
            return (Context) scope.get((d<?>) s0.f105811a.b(Context.class), (Qualifier) null, (a<? extends ParametersHolder>) null);
        } catch (NoDefinitionFoundException unused) {
            throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
