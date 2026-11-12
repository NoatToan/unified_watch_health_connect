package com.huami.ai.speech.alexa.uitls;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/alexa/uitls/AlexaLanguage;", "", "", "component1", "", "component2", "component3", "index", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "languageName", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Ljava/lang/String;", "getLanguageCode", "()Ljava/lang/String;", "c", "getLanguageName", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlexaLanguage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String languageCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String languageName;

    public AlexaLanguage(int i, @NotNull String str, @NotNull String str2) {
        this.index = i;
        this.languageCode = str;
        this.languageName = str2;
    }

    public static /* synthetic */ AlexaLanguage copy$default(AlexaLanguage alexaLanguage, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = alexaLanguage.index;
        }
        if ((i2 & 2) != 0) {
            str = alexaLanguage.languageCode;
        }
        if ((i2 & 4) != 0) {
            str2 = alexaLanguage.languageName;
        }
        return alexaLanguage.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguageName() {
        return this.languageName;
    }

    @NotNull
    public final AlexaLanguage copy(int index, @NotNull String languageCode, @NotNull String languageName) {
        return new AlexaLanguage(index, languageCode, languageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaLanguage)) {
            return false;
        }
        AlexaLanguage alexaLanguage = (AlexaLanguage) other;
        return this.index == alexaLanguage.index && Intrinsics.areEqual(this.languageCode, alexaLanguage.languageCode) && Intrinsics.areEqual(this.languageName, alexaLanguage.languageName);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    public final String getLanguageName() {
        return this.languageName;
    }

    public int hashCode() {
        return (((this.index * 31) + this.languageCode.hashCode()) * 31) + this.languageName.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlexaLanguage(index=" + this.index + ", languageCode=" + this.languageCode + ", languageName=" + this.languageName + ')';
    }
}
