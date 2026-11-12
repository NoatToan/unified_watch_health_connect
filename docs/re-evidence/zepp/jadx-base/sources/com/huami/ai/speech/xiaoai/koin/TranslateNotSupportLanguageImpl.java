package com.huami.ai.speech.xiaoai.koin;

import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.unsupport.check.LanguageCheckFuncKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/xiaoai/koin/TranslateNotSupportLanguageImpl;", "Lcom/huami/ai/speech/xiaoai/koin/TranslateNotSupportLanguage;", "", "Lkotlin/Function1;", "", "", "unSupportCheck", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "a", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class TranslateNotSupportLanguageImpl implements TranslateNotSupportLanguage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig config;

    public TranslateNotSupportLanguageImpl(@NotNull VoiceConfig voiceConfig) {
        this.config = voiceConfig;
    }

    @Override // com.huami.ai.speech.xiaoai.koin.TranslateNotSupportLanguage
    @NotNull
    public List<Function1<Integer, Boolean>> unSupportCheck() {
        List<String> listUnSupportTranslate = VoiceConfigFuncKt.unSupportTranslate(this.config);
        if (listUnSupportTranslate == null) {
            return CollectionsKt__CollectionsKt.arrayListOf(LanguageCheckFuncKt.getCheckJapanese(), LanguageCheckFuncKt.getCheckKorean());
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listUnSupportTranslate) {
            if (Intrinsics.areEqual(str, "ja")) {
                arrayList.add(LanguageCheckFuncKt.getCheckJapanese());
            } else if (Intrinsics.areEqual(str, "ko")) {
                arrayList.add(LanguageCheckFuncKt.getCheckKorean());
            }
        }
        return arrayList;
    }
}
