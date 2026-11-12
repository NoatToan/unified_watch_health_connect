package com.huami.third.alexa;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&R\u0016\u0010\u000b\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/huami/third/alexa/AlexaLanguageHelper;", "", "", "currentAlexaLanguage", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "goToSelectAlexaLanguage", "", "getShowSelectLanguage", "()Z", "showSelectLanguage", "alexa-ui_release"}, k = 1, mv = {1, 5, 1})
public interface AlexaLanguageHelper {
    @NotNull
    String currentAlexaLanguage();

    boolean getShowSelectLanguage();

    void goToSelectAlexaLanguage(@NotNull Context context);
}
