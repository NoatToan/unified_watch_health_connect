package com.huami.ai.speech.simplify.opus;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.ConstantKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.xiaomiai.alexa.resample.ReSample;
import com.huami.watch.opus.OpusCodecEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'J\u001c\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0005R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR&\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000ej\b\u0012\u0004\u0012\u00020\n`\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$¨\u0006)"}, d2 = {"Lcom/huami/ai/speech/simplify/opus/PcmEncodeToOpus;", "", "", ConstantKt.SAMPLE_WEBVIEW_NAME, "channel", "", "c", "b", "Lcom/huami/watch/opus/OpusCodecEncoder;", "encoder", "", "", "over", "f", "Ljava/util/ArrayList;", "resut", "a", "buffer", "Lcom/huami/ai/speech/simplify/opus/AudioBufferManager;", "mAudioManger", "e", "Ljava/io/InputStream;", "inputStream", "encode", "cancelEncode", "Lcom/huami/ai/speech/simplify/opus/OpusDataCallback;", "Lcom/huami/ai/speech/simplify/opus/OpusDataCallback;", "opusCallback", "Lcom/huami/watch/opus/OpusCodecEncoder;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "pcmList", GoogleApiAvailabilityLight.a, "Z", "isCancel", "Lcom/huami/ai/speech/simplify/opus/PcmDecoder$DecodeCallback;", "Lcom/huami/ai/speech/simplify/opus/PcmDecoder$DecodeCallback;", "callback", "<init>", "(Lcom/huami/ai/speech/simplify/opus/OpusDataCallback;)V", "Companion", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class PcmEncodeToOpus {
    private static final int f = 16000;
    private static final int g = 10;
    private static final int h = 1500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final OpusDataCallback opusCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private OpusCodecEncoder encoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isCancel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<byte[]> pcmList = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final PcmDecoder.DecodeCallback callback = new PcmDecoder.DecodeCallback() { // from class: com.huami.ai.speech.simplify.opus.PcmEncodeToOpus$callback$1

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int sampling;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String mContentId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private ReSample reSample;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int channel;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private int birate;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "取消音频编码OPUS";
            }
        }

        @Override // com.huami.ai.speech.simplify.opus.PcmDecoder.DecodeCallback
        public void onDecodeEnd() {
            PcmEncodeToOpus pcmEncodeToOpus = this.f;
            OpusCodecEncoder opusCodecEncoder = pcmEncodeToOpus.encoder;
            Objects.requireNonNull(opusCodecEncoder);
            pcmEncodeToOpus.f(opusCodecEncoder, new byte[0], true);
            this.mContentId = null;
            this.f.b();
            this.reSample = null;
        }

        @Override // com.huami.ai.speech.simplify.opus.PcmDecoder.DecodeCallback
        public void onDecodeFailed() {
            this.f.b();
        }

        @Override // com.huami.ai.speech.simplify.opus.PcmDecoder.DecodeCallback
        public void onDecodeStart(int channel, int sampleRate, int bitrate) {
            this.sampling = sampleRate;
            this.channel = channel;
            this.reSample = new ReSample();
            this.birate = bitrate;
            PcmEncodeToOpus.d(this.f, 0, 0, 3, null);
        }

        @Override // com.huami.ai.speech.simplify.opus.PcmDecoder.DecodeCallback
        public boolean onDecoderFrame(@NotNull short[] pcmData) {
            if (this.f.isCancel) {
                HMLog.info("speech", a.a);
                return false;
            }
            if (pcmData.length == 0) {
                return true;
            }
            byte[] byteArray = MemoryUtils.toByteArray(pcmData, pcmData.length);
            if (this.sampling != 16000 && byteArray != null) {
                byte[] bArrReSample = this.reSample.reSample(byteArray, byteArray.length, this.channel, this.sampling);
                if (bArrReSample != null) {
                    if (!(bArrReSample.length == 0)) {
                        PcmEncodeToOpus pcmEncodeToOpus = this.f;
                        OpusCodecEncoder opusCodecEncoder = pcmEncodeToOpus.encoder;
                        Objects.requireNonNull(opusCodecEncoder);
                        pcmEncodeToOpus.f(opusCodecEncoder, bArrReSample, false);
                    }
                }
            } else if (byteArray != null) {
                if (!(byteArray.length == 0)) {
                    PcmEncodeToOpus pcmEncodeToOpus2 = this.f;
                    OpusCodecEncoder opusCodecEncoder2 = pcmEncodeToOpus2.encoder;
                    Objects.requireNonNull(opusCodecEncoder2);
                    pcmEncodeToOpus2.f(opusCodecEncoder2, byteArray, false);
                }
            }
            return true;
        }
    };

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
            return Intrinsics.stringPlus("pcm encode error:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("opus encoder create success:", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("opusCode error:", this.a);
        }
    }

    public PcmEncodeToOpus(@NotNull OpusDataCallback opusDataCallback) {
        this.opusCallback = opusDataCallback;
    }

    private final byte[] a(ArrayList<byte[]> resut) {
        int length;
        int size = resut.size() - 1;
        if (size >= 0) {
            int i = 0;
            length = 0;
            while (true) {
                int i2 = i + 1;
                length += resut.get(i).length;
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        } else {
            length = 0;
        }
        byte[] bArr = new byte[length];
        int size2 = resut.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            int length2 = 0;
            while (true) {
                int i4 = i3 + 1;
                byte[] bArr2 = resut.get(i3);
                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
                if (i4 > size2) {
                    break;
                }
                i3 = i4;
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        OpusCodecEncoder opusCodecEncoder = this.encoder;
        if (opusCodecEncoder != null) {
            Objects.requireNonNull(opusCodecEncoder);
            opusCodecEncoder.destroyOpusEncoder();
        }
    }

    private final void c(int sample, int channel) {
        OpusCodecEncoder opusCodecEncoder = new OpusCodecEncoder();
        HMLog.debug$default(null, new b(opusCodecEncoder.createOpusEncoder(sample, channel, OpusCodecEncoder.OPUS_APPLICATION.OPUS_APPLICATION_AUDIO)), 1, null);
        Unit unit = Unit.INSTANCE;
        this.encoder = opusCodecEncoder;
    }

    public static /* synthetic */ void d(PcmEncodeToOpus pcmEncodeToOpus, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 16000;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        pcmEncodeToOpus.c(i, i2);
    }

    private final void e(OpusCodecEncoder encoder, byte[] buffer, AudioBufferManager mAudioManger) {
        int inputByteBufferSize = encoder.getInputByteBufferSize(encoder.getSampling(), OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, encoder.getChannelCount());
        int i = 0;
        while (true) {
            int i2 = i + inputByteBufferSize;
            try {
                if (i2 > buffer.length) {
                    return;
                }
                byte[] bArr = new byte[inputByteBufferSize];
                System.arraycopy(buffer, i, bArr, 0, inputByteBufferSize);
                byte[] bArrOpusEncode = encoder.opusEncode(bArr, OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, 1500);
                if (bArrOpusEncode != null) {
                    mAudioManger.addBuffer(bArrOpusEncode, bArrOpusEncode.length);
                }
                i = i2;
            } catch (Exception e) {
                HMLog.info("speech", new c(e));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(OpusCodecEncoder encoder, byte[] b2, boolean over) {
        if (this.isCancel) {
            this.pcmList.clear();
            return;
        }
        if (over) {
            byte[] bArrA = a(this.pcmList);
            AudioBufferManager audioBufferManager = new AudioBufferManager();
            e(encoder, bArrA, audioBufferManager);
            this.opusCallback.onAudioData(audioBufferManager.getAudioBuffer(), true);
            this.pcmList.clear();
            return;
        }
        this.pcmList.add(b2);
        if (this.pcmList.size() == 10) {
            byte[] bArrA2 = a(this.pcmList);
            AudioBufferManager audioBufferManager2 = new AudioBufferManager();
            e(encoder, bArrA2, audioBufferManager2);
            this.opusCallback.onAudioData(audioBufferManager2.getAudioBuffer(), false);
            this.pcmList.clear();
        }
    }

    public final void cancelEncode() {
        this.isCancel = true;
    }

    public final void encode(@NotNull InputStream inputStream) {
        try {
            this.isCancel = false;
            new PcmDecoder(inputStream).decode(this.callback);
        } catch (Exception e) {
            HMLog.error$default(null, null, null, new a(e), 7, null);
        }
        try {
            inputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
