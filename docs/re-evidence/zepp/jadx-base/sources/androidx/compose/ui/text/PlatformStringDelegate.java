package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.PlatformLocale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "", "", "string", "Landroidx/compose/ui/text/intl/PlatformLocale;", "locale", "toUpperCase", "toLowerCase", "capitalize", "decapitalize", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public interface PlatformStringDelegate {
    @NotNull
    String capitalize(@NotNull String string, @NotNull PlatformLocale locale);

    @NotNull
    String decapitalize(@NotNull String string, @NotNull PlatformLocale locale);

    @NotNull
    String toLowerCase(@NotNull String string, @NotNull PlatformLocale locale);

    @NotNull
    String toUpperCase(@NotNull String string, @NotNull PlatformLocale locale);
}
