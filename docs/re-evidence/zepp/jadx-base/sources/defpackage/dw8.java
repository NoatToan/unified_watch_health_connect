package defpackage;

import com.google.accompanist.insets.ImmutableWindowInsets;
import com.google.accompanist.insets.WindowInsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw8 {
    static {
        WindowInsets.Companion companion = WindowInsets.INSTANCE;
    }

    @NotNull
    public static WindowInsets a(@NotNull WindowInsets _this, @NotNull WindowInsets.Type type, @NotNull WindowInsets.Type type2, @NotNull WindowInsets.Type type3, @NotNull WindowInsets.Type type4, WindowInsets.Type type5) {
        return new ImmutableWindowInsets(type3, type, type2, type4, type5);
    }

    public static /* synthetic */ WindowInsets b(WindowInsets windowInsets, WindowInsets.Type type, WindowInsets.Type type2, WindowInsets.Type type3, WindowInsets.Type type4, WindowInsets.Type type5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            type = windowInsets.getNavigationBars();
        }
        if ((i & 2) != 0) {
            type2 = windowInsets.getStatusBars();
        }
        WindowInsets.Type type6 = type2;
        if ((i & 4) != 0) {
            type3 = windowInsets.getSystemGestures();
        }
        WindowInsets.Type type7 = type3;
        if ((i & 8) != 0) {
            type4 = windowInsets.getIme();
        }
        WindowInsets.Type type8 = type4;
        if ((i & 16) != 0) {
            type5 = windowInsets.getDisplayCutout();
        }
        return windowInsets.copy(type, type6, type7, type8, type5);
    }
}
