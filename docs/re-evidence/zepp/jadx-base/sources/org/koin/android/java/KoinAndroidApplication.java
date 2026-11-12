package org.koin.android.java;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lorg/koin/android/java/KoinAndroidApplication;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lorg/koin/core/logger/Level;", "androidLoggerLevel", "Lorg/koin/core/KoinApplication;", "create", "<init>", "()V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class KoinAndroidApplication {

    @NotNull
    public static final KoinAndroidApplication INSTANCE = new KoinAndroidApplication();

    private KoinAndroidApplication() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final KoinApplication create(@NotNull Context context) {
        return create$default(context, null, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final KoinApplication create(@NotNull Context context, @NotNull Level androidLoggerLevel) {
        return KoinExtKt.androidLogger(KoinExtKt.androidContext(KoinApplication.INSTANCE.init(), context), androidLoggerLevel);
    }

    public static /* synthetic */ KoinApplication create$default(Context context, Level level, int i, Object obj) {
        if ((i & 2) != 0) {
            level = Level.INFO;
        }
        return create(context, level);
    }
}
