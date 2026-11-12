package com.huami.ai.speech.simplify.alexa.language;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/speech/simplify/alexa/language/SavedAlexaDeviceLanguage;", "", "", "component1", "component2", "deviceSource", "alexaLanguageIndex", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getDeviceSource", "()I", "b", "getAlexaLanguageIndex", "<init>", "(II)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SavedAlexaDeviceLanguage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int alexaLanguageIndex;

    public SavedAlexaDeviceLanguage(int i, int i2) {
        this.deviceSource = i;
        this.alexaLanguageIndex = i2;
    }

    public static /* synthetic */ SavedAlexaDeviceLanguage copy$default(SavedAlexaDeviceLanguage savedAlexaDeviceLanguage, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = savedAlexaDeviceLanguage.deviceSource;
        }
        if ((i3 & 2) != 0) {
            i2 = savedAlexaDeviceLanguage.alexaLanguageIndex;
        }
        return savedAlexaDeviceLanguage.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAlexaLanguageIndex() {
        return this.alexaLanguageIndex;
    }

    @NotNull
    public final SavedAlexaDeviceLanguage copy(int deviceSource, int alexaLanguageIndex) {
        return new SavedAlexaDeviceLanguage(deviceSource, alexaLanguageIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedAlexaDeviceLanguage)) {
            return false;
        }
        SavedAlexaDeviceLanguage savedAlexaDeviceLanguage = (SavedAlexaDeviceLanguage) other;
        return this.deviceSource == savedAlexaDeviceLanguage.deviceSource && this.alexaLanguageIndex == savedAlexaDeviceLanguage.alexaLanguageIndex;
    }

    public final int getAlexaLanguageIndex() {
        return this.alexaLanguageIndex;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public int hashCode() {
        return (this.deviceSource * 31) + this.alexaLanguageIndex;
    }

    @NotNull
    public String toString() {
        return "SavedAlexaDeviceLanguage(deviceSource=" + this.deviceSource + ", alexaLanguageIndex=" + this.alexaLanguageIndex + ')';
    }
}
