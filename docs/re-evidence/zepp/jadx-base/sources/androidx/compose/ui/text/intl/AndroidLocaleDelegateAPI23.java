package androidx.compose.ui.text.intl;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI23;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "", "languageTag", "Landroidx/compose/ui/text/intl/PlatformLocale;", "parseLanguageTag", "", "getCurrent", "()Ljava/util/List;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public List<PlatformLocale> getCurrent() {
        return e.listOf(new AndroidLocale(java.util.Locale.getDefault()));
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public PlatformLocale parseLanguageTag(@NotNull String languageTag) {
        return new AndroidLocale(java.util.Locale.forLanguageTag(languageTag));
    }
}
