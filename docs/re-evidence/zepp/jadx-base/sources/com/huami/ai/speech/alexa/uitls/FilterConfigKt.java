package com.huami.ai.speech.alexa.uitls;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.speech.alexa.filter.DirectiveCheckKt;
import com.huami.ai.speech.alexa.filter.ExpectSpeechFilter;
import com.huami.ai.speech.alexa.filter.TTSTextFilter;
import com.huami.ai.speech.alexa.filter.UnSupportDirectFilter;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000e"}, d2 = {"", BehaviorTaggingWebApi.g.g, "Lcom/huami/ai/speech/alexa/filter/ExpectSpeechFilter;", "expectSpeechFilter", "", "supportDeleteAlarm", "Lcom/huami/ai/speech/alexa/filter/TTSTextFilter;", "ttsTextFilter", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "Lcom/huami/ai/speech/alexa/filter/UnSupportDirectFilter;", "unSupportFilter", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class FilterConfigKt {
    @NotNull
    public static final ExpectSpeechFilter expectSpeechFilter(int i) {
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(DirectiveCheckKt.getCheckSetAlarm(), DirectiveCheckKt.getCheckListTemplate(), DirectiveCheckKt.getCheckReminder(), DirectiveCheckKt.getCheckWeather());
        if (i < 3) {
            arrayListArrayListOf.add(DirectiveCheckKt.getCheckWikipediaBodyTemplate());
        }
        return new ExpectSpeechFilter(arrayListArrayListOf);
    }

    @NotNull
    public static final TTSTextFilter ttsTextFilter(boolean z, int i) {
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(DirectiveCheckKt.getCheckListTemplate(), DirectiveCheckKt.getCheckWeather());
        if (i < 3) {
            arrayListArrayListOf.add(DirectiveCheckKt.getCheckWikipediaBodyTemplate());
            arrayListArrayListOf.add(DirectiveCheckKt.getCheckReminder());
            if (z) {
                arrayListArrayListOf.add(DirectiveCheckKt.getCheckAlertsAndNotSetTimerNotDeleteAlarm());
            } else {
                arrayListArrayListOf.add(DirectiveCheckKt.getCheckAlertsAndNotSetTimer());
            }
        } else {
            arrayListArrayListOf.add(DirectiveCheckKt.getCheckBodyTemplate());
        }
        return new TTSTextFilter(arrayListArrayListOf);
    }

    @Nullable
    public static final UnSupportDirectFilter unSupportFilter(@NotNull SpeechDevice speechDevice, @NotNull VoiceConfig voiceConfig) {
        ArrayList arrayList = new ArrayList();
        if (!VoiceConfigFuncKt.needNews(voiceConfig)) {
            arrayList.add(DirectiveCheckKt.getCheckAudioPlay());
        }
        if (!arrayList.isEmpty()) {
            return new UnSupportDirectFilter(speechDevice, CollectionsKt__CollectionsKt.arrayListOf(DirectiveCheckKt.getCheckAudioPlay()));
        }
        return null;
    }
}
