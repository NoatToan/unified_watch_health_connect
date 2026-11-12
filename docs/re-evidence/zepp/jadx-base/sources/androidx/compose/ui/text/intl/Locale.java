package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import com.huami.account.UserLegalInfoManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001c\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0013\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0015\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "", "toLanguageTag", "other", "", "equals", "", "hashCode", "toString", "Landroidx/compose/ui/text/intl/PlatformLocale;", "platformLocale", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getPlatformLocale$ui_text_release", "()Landroidx/compose/ui/text/intl/PlatformLocale;", "getLanguage", "()Ljava/lang/String;", UserLegalInfoManager.KEY_LANGUAGE, "getScript", "script", "getRegion", "region", "<init>", "(Landroidx/compose/ui/text/intl/PlatformLocale;)V", "languageTag", "(Ljava/lang/String;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class Locale {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final PlatformLocale platformLocale;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Locale getCurrent() {
            return new Locale(PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0));
        }
    }

    public Locale(@NotNull PlatformLocale platformLocale) {
        this.platformLocale = platformLocale;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof Locale)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(toLanguageTag(), ((Locale) other).toLanguageTag());
    }

    @NotNull
    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    @NotNull
    /* JADX INFO: renamed from: getPlatformLocale$ui_text_release, reason: from getter */
    public final PlatformLocale getPlatformLocale() {
        return this.platformLocale;
    }

    @NotNull
    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    @NotNull
    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    @NotNull
    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    @NotNull
    public String toString() {
        return toLanguageTag();
    }

    public Locale(@NotNull String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }
}
