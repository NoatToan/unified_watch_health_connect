package androidx.compose.ui.text.intl;

import com.huami.account.UserLegalInfoManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "", "toLanguageTag", "Ljava/util/Locale;", "javaLocale", "Ljava/util/Locale;", "getJavaLocale", "()Ljava/util/Locale;", "getLanguage", "()Ljava/lang/String;", UserLegalInfoManager.KEY_LANGUAGE, "getScript", "script", "getRegion", "region", "<init>", "(Ljava/util/Locale;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidLocale implements PlatformLocale {

    @NotNull
    private final java.util.Locale javaLocale;

    public AndroidLocale(@NotNull java.util.Locale locale) {
        this.javaLocale = locale;
    }

    @NotNull
    public final java.util.Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getLanguage() {
        return this.javaLocale.getLanguage();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getRegion() {
        return this.javaLocale.getCountry();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getScript() {
        return this.javaLocale.getScript();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String toLanguageTag() {
        return this.javaLocale.toLanguageTag();
    }
}
