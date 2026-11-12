package com.huami.ai.speech.alexa.capability.audioplayer;

import com.huami.ai.entity.audioplay.AudioData;
import com.huami.ai.entity.audioplay.AudioItem;
import com.huami.ai.entity.audioplay.PlayBehavior;
import com.huami.ai.skill.AudioPlaySkill;
import com.huami.ai.speech.alexa.entity.AudioContent;
import com.huami.ai.speech.alexa.entity.payload.PlayPayload;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/audioplayer/AudioPlayerDirectiveImpl;", "Lcom/huami/ai/speech/alexa/capability/audioplayer/AudioPlayerDirective;", "", "behavior", "Lcom/huami/ai/entity/audioplay/PlayBehavior;", "a", "Lcom/huami/ai/speech/alexa/entity/payload/PlayPayload;", "payload", "", "doPlay", "(Lcom/huami/ai/speech/alexa/entity/payload/PlayPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/skill/AudioPlaySkill;", "Lcom/huami/ai/skill/AudioPlaySkill;", "audioPlaySkill", "<init>", "(Lcom/huami/ai/skill/AudioPlaySkill;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AudioPlayerDirectiveImpl implements AudioPlayerDirective {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final AudioPlaySkill audioPlaySkill;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    public AudioPlayerDirectiveImpl(@Nullable AudioPlaySkill audioPlaySkill) {
        this.audioPlaySkill = audioPlaySkill;
    }

    private final PlayBehavior a(String behavior) {
        int iHashCode = behavior.hashCode();
        if (iHashCode != -1710554794) {
            if (iHashCode != -876275224) {
                if (iHashCode == 1393966247 && behavior.equals("REPLACE_ENQUEUED")) {
                    return PlayBehavior.REPLACE_APPENDING;
                }
            } else if (behavior.equals("ENQUEUE")) {
                return PlayBehavior.APPEND;
            }
        } else if (behavior.equals("REPLACE_ALL")) {
            return PlayBehavior.REPLACE_ALL;
        }
        throw new IllegalArgumentException("unexpected play behavior");
    }

    @Override // com.huami.ai.speech.alexa.capability.audioplayer.AudioPlayerDirective
    @Nullable
    public Object doPlay(@NotNull PlayPayload playPayload, @NotNull Continuation<? super Unit> continuation) {
        PlayBehavior playBehaviorA;
        AudioPlaySkill audioPlaySkill = this.audioPlaySkill;
        Unit unit = null;
        if (audioPlaySkill != null) {
            try {
                playBehaviorA = a(playPayload.getPlayBehavior());
            } catch (Exception e) {
                HMLog.error$default("speech", null, null, new a(e), 6, null);
                playBehaviorA = PlayBehavior.REPLACE_ALL;
            }
            String audioItemId = playPayload.getAudioItem().getAudioItemId();
            String url = playPayload.getAudioItem().getStream().getUrl();
            AudioContent audio = playPayload.getAudio();
            audioPlaySkill.playAudio(new AudioData(playBehaviorA, e.listOf(new AudioItem(audioItemId, url, audio != null ? audio.getCom.xiaomi.ai.core.AivsConfig.Tts.AUDIO_TYPE_STREAM java.lang.String() : null))));
            unit = Unit.INSTANCE;
        }
        return unit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
    }
}
