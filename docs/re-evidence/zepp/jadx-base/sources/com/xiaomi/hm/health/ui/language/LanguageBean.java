package com.xiaomi.hm.health.ui.language;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/LanguageBean;", "", "", "component1", "", "component2", "", "component3", "Ljava/util/Locale;", "component4", "isChecked", "langCode", "languageName", "locale", "copy", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "setChecked", "(Z)V", "b", LogUtil.I, "getLangCode", "()I", "setLangCode", "(I)V", "c", "Ljava/lang/String;", "getLanguageName", "()Ljava/lang/String;", "setLanguageName", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "<init>", "(ZILjava/lang/String;Ljava/util/Locale;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LanguageBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean isChecked;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int langCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String languageName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private Locale locale;

    public LanguageBean() {
        this(false, 0, null, null, 15, null);
    }

    public LanguageBean(boolean z, int i, @NotNull String str, @Nullable Locale locale) {
        this.isChecked = z;
        this.langCode = i;
        this.languageName = str;
        this.locale = locale;
    }

    public static /* synthetic */ LanguageBean copy$default(LanguageBean languageBean, boolean z, int i, String str, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = languageBean.isChecked;
        }
        if ((i2 & 2) != 0) {
            i = languageBean.langCode;
        }
        if ((i2 & 4) != 0) {
            str = languageBean.languageName;
        }
        if ((i2 & 8) != 0) {
            locale = languageBean.locale;
        }
        return languageBean.copy(z, i, str, locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLangCode() {
        return this.langCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguageName() {
        return this.languageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final LanguageBean copy(boolean isChecked, int langCode, @NotNull String languageName, @Nullable Locale locale) {
        return new LanguageBean(isChecked, langCode, languageName, locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageBean)) {
            return false;
        }
        LanguageBean languageBean = (LanguageBean) other;
        return this.isChecked == languageBean.isChecked && this.langCode == languageBean.langCode && Intrinsics.areEqual(this.languageName, languageBean.languageName) && Intrinsics.areEqual(this.locale, languageBean.locale);
    }

    public final int getLangCode() {
        return this.langCode;
    }

    @NotNull
    public final String getLanguageName() {
        return this.languageName;
    }

    @Nullable
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isChecked;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.langCode) * 31) + this.languageName.hashCode()) * 31;
        Locale locale = this.locale;
        return iHashCode + (locale == null ? 0 : locale.hashCode());
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setLangCode(int i) {
        this.langCode = i;
    }

    public final void setLanguageName(@NotNull String str) {
        this.languageName = str;
    }

    public final void setLocale(@Nullable Locale locale) {
        this.locale = locale;
    }

    @NotNull
    public String toString() {
        return "LanguageBean(isChecked=" + this.isChecked + ", langCode=" + this.langCode + ", languageName=" + this.languageName + ", locale=" + this.locale + ")";
    }

    public /* synthetic */ LanguageBean(boolean z, int i, String str, Locale locale, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : locale);
    }
}
