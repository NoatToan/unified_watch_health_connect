package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.hc8;
import defpackage.zi4;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EntryPointAccessors {

    @NotNull
    public static final EntryPointAccessors INSTANCE = new EntryPointAccessors();

    private EntryPointAccessors() {
    }

    @JvmStatic
    public static final <T> T fromActivity(@NotNull Activity activity, @NotNull Class<T> entryPoint) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return (T) hc8.a(activity, entryPoint);
    }

    @JvmStatic
    public static final <T> T fromApplication(@NotNull Context context, @NotNull Class<T> entryPoint) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return (T) hc8.a(zi4.a(context.getApplicationContext()), entryPoint);
    }

    @JvmStatic
    public static final <T> T fromFragment(@NotNull Fragment fragment, @NotNull Class<T> entryPoint) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return (T) hc8.a(fragment, entryPoint);
    }

    @JvmStatic
    public static final <T> T fromView(@NotNull View view, @NotNull Class<T> entryPoint) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return (T) hc8.a(view, entryPoint);
    }

    public final /* synthetic */ <T> T fromActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromActivity(activity, Object.class);
    }

    public final /* synthetic */ <T> T fromApplication(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromApplication(context, Object.class);
    }

    public final /* synthetic */ <T> T fromFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromFragment(fragment, Object.class);
    }

    public final /* synthetic */ <T> T fromView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) fromView(view, Object.class);
    }
}
