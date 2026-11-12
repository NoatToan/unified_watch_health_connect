package androidx.compose.ui.text.intl;

import com.huami.account.UserLegalInfoManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\u0006\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocale;", "", "", "toLanguageTag", "getLanguage", "()Ljava/lang/String;", UserLegalInfoManager.KEY_LANGUAGE, "getScript", "script", "getRegion", "region", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public interface PlatformLocale {
    @NotNull
    String getLanguage();

    @NotNull
    String getRegion();

    @NotNull
    String getScript();

    @NotNull
    String toLanguageTag();
}
