package com.xiaomi.smarthome.miio;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/smarthome/miio/LanguageModel;", "", "locale", "Ljava/util/Locale;", "languageSettingId", "", "languageNameId", "assetPath", "", "(Ljava/util/Locale;IILjava/lang/String;)V", "getAssetPath", "()Ljava/lang/String;", "setAssetPath", "(Ljava/lang/String;)V", "getLanguageNameId", "()I", "setLanguageNameId", "(I)V", "getLanguageSettingId", "setLanguageSettingId", "getLocale", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "base-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LanguageModel {

    @NotNull
    private String assetPath;
    private int languageNameId;
    private int languageSettingId;

    @Nullable
    private Locale locale;

    public LanguageModel(@Nullable Locale locale, int i, int i2, @NotNull String assetPath) {
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        this.locale = locale;
        this.languageSettingId = i;
        this.languageNameId = i2;
        this.assetPath = assetPath;
    }

    @NotNull
    public final String getAssetPath() {
        return this.assetPath;
    }

    public final int getLanguageNameId() {
        return this.languageNameId;
    }

    public final int getLanguageSettingId() {
        return this.languageSettingId;
    }

    @Nullable
    public final Locale getLocale() {
        return this.locale;
    }

    public final void setAssetPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.assetPath = str;
    }

    public final void setLanguageNameId(int i) {
        this.languageNameId = i;
    }

    public final void setLanguageSettingId(int i) {
        this.languageSettingId = i;
    }

    public final void setLocale(@Nullable Locale locale) {
        this.locale = locale;
    }
}
