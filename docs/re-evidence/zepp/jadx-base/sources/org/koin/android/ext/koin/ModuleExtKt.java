package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\"\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/scope/Scope;", "Landroid/content/Context;", "androidContext", "Landroid/app/Application;", "androidApplication", "", "ERROR_MSG", "Ljava/lang/String;", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ModuleExtKt {

    @NotNull
    public static final String ERROR_MSG = "Please use androidContext() function in your KoinApplication configuration.";

    @NotNull
    public static final Application androidApplication(@NotNull Scope scope) throws MissingAndroidContextException {
        try {
            return (Application) scope.get(Reflection.getOrCreateKotlinClass(Application.class), null, null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    @NotNull
    public static final Context androidContext(@NotNull Scope scope) {
        try {
            return (Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
