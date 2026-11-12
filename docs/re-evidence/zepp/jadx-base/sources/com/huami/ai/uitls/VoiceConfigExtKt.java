package com.huami.ai.uitls;

import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "", "printString", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class VoiceConfigExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VoiceConfig voiceConfig) {
            super(0);
            this.a = voiceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("VoiceConfig option:", Byte.valueOf(this.a.getOptions()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VoiceConfig voiceConfig) {
            super(0);
            this.a = voiceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("VoiceConfig recordCodec:", Byte.valueOf(this.a.getRecordCodec()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(VoiceConfig voiceConfig) {
            super(0);
            this.a = voiceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("VoiceConfig ttsCodec:", this.a.getTtsCodec());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VoiceConfig voiceConfig) {
            super(0);
            this.a = voiceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("VoiceConfig ttsCodec:", this.a.getTtsCodec());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(VoiceConfig voiceConfig) {
            super(0);
            this.a = voiceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("VoiceConfig version:", Integer.valueOf(this.a.getVersion()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ VoiceConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(VoiceConfig voiceConfig) {
            super(0);
            this.a = voiceConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("VoiceConfig configuration:", this.a.getConfiguration());
        }
    }

    public static final void printString(@NotNull VoiceConfig voiceConfig) {
        HMLog.info("speech", new a(voiceConfig));
        HMLog.info("speech", new b(voiceConfig));
        HMLog.info("speech", new c(voiceConfig));
        HMLog.info("speech", new d(voiceConfig));
        HMLog.info("speech", new e(voiceConfig));
        HMLog.info("speech", new f(voiceConfig));
    }
}
