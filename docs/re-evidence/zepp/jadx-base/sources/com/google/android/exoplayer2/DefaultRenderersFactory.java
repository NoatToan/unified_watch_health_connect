package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String l = "DefaultRenderersFactory";
    private final Context a;
    private int b;
    private long c;
    private boolean d;
    private MediaCodecSelector e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.a = context;
        this.b = 0;
        this.c = 5000L;
        this.e = MediaCodecSelector.DEFAULT;
    }

    public void buildAudioRenderers(Context context, int extensionRendererMode, MediaCodecSelector mediaCodecSelector, boolean enableDecoderFallback, AudioSink audioSink, Handler eventHandler, AudioRendererEventListener eventListener, ArrayList<Renderer> out) {
        int i;
        int i2;
        MediaCodecAudioRenderer mediaCodecAudioRenderer = new MediaCodecAudioRenderer(context, mediaCodecSelector, enableDecoderFallback, eventHandler, eventListener, audioSink);
        mediaCodecAudioRenderer.experimentalSetAsynchronousBufferQueueingEnabled(this.f);
        mediaCodecAudioRenderer.experimentalSetForceAsyncQueueingSynchronizationWorkaround(this.g);
        mediaCodecAudioRenderer.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(this.h);
        out.add(mediaCodecAudioRenderer);
        if (extensionRendererMode == 0) {
            return;
        }
        int size = out.size();
        if (extensionRendererMode == 2) {
            size--;
        }
        try {
            try {
                i = size + 1;
                try {
                    out.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(eventHandler, eventListener, audioSink));
                    Log.i(l, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i;
                    i = size;
                }
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating Opus extension", e);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i2 = i + 1;
                try {
                    out.add(i, (Renderer) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(eventHandler, eventListener, audioSink));
                    Log.i(l, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i = i2;
                    i2 = i;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                out.add(i2, (Renderer) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(eventHandler, eventListener, audioSink));
                Log.i(l, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating FLAC extension", e3);
        }
    }

    @Nullable
    public AudioSink buildAudioSink(Context context, boolean z, boolean z2, boolean z3) {
        return new DefaultAudioSink(AudioCapabilities.getCapabilities(context), new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]), z, z2, z3 ? 1 : 0);
    }

    public void buildCameraMotionRenderers(Context context, int extensionRendererMode, ArrayList<Renderer> out) {
        out.add(new CameraMotionRenderer());
    }

    public void buildMetadataRenderers(Context context, MetadataOutput output, Looper outputLooper, int extensionRendererMode, ArrayList<Renderer> out) {
        out.add(new MetadataRenderer(output, outputLooper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler eventHandler, int extensionRendererMode, ArrayList<Renderer> out) {
    }

    public void buildTextRenderers(Context context, TextOutput output, Looper outputLooper, int extensionRendererMode, ArrayList<Renderer> out) {
        out.add(new TextRenderer(output, outputLooper));
    }

    public void buildVideoRenderers(Context context, int extensionRendererMode, MediaCodecSelector mediaCodecSelector, boolean enableDecoderFallback, Handler eventHandler, VideoRendererEventListener eventListener, long allowedVideoJoiningTimeMs, ArrayList<Renderer> out) {
        int i;
        MediaCodecVideoRenderer mediaCodecVideoRenderer = new MediaCodecVideoRenderer(context, mediaCodecSelector, allowedVideoJoiningTimeMs, enableDecoderFallback, eventHandler, eventListener, 50);
        mediaCodecVideoRenderer.experimentalSetAsynchronousBufferQueueingEnabled(this.f);
        mediaCodecVideoRenderer.experimentalSetForceAsyncQueueingSynchronizationWorkaround(this.g);
        mediaCodecVideoRenderer.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(this.h);
        out.add(mediaCodecVideoRenderer);
        if (extensionRendererMode == 0) {
            return;
        }
        int size = out.size();
        if (extensionRendererMode == 2) {
            size--;
        }
        try {
            try {
                i = size + 1;
                try {
                    out.add(size, (Renderer) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(allowedVideoJoiningTimeMs), eventHandler, eventListener, 50));
                    Log.i(l, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i;
                    i = size;
                }
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            out.add(i, (Renderer) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE).newInstance(Long.valueOf(allowedVideoJoiningTimeMs), eventHandler, eventListener, 50));
            Log.i(l, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating AV1 extension", e2);
        }
    }

    @Override // com.google.android.exoplayer2.RenderersFactory
    public Renderer[] createRenderers(Handler eventHandler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textRendererOutput, MetadataOutput metadataRendererOutput) {
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.a, this.b, this.e, this.d, eventHandler, videoRendererEventListener, this.c, arrayList);
        AudioSink audioSinkBuildAudioSink = buildAudioSink(this.a, this.i, this.j, this.k);
        if (audioSinkBuildAudioSink != null) {
            buildAudioRenderers(this.a, this.b, this.e, this.d, audioSinkBuildAudioSink, eventHandler, audioRendererEventListener, arrayList);
        }
        buildTextRenderers(this.a, textRendererOutput, eventHandler.getLooper(), this.b, arrayList);
        buildMetadataRenderers(this.a, metadataRendererOutput, eventHandler.getLooper(), this.b, arrayList);
        buildCameraMotionRenderers(this.a, this.b, arrayList);
        buildMiscellaneousRenderers(this.a, eventHandler, this.b, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    public DefaultRenderersFactory experimentalSetAsynchronousBufferQueueingEnabled(boolean enabled) {
        this.f = enabled;
        return this;
    }

    public DefaultRenderersFactory experimentalSetForceAsyncQueueingSynchronizationWorkaround(boolean enabled) {
        this.g = enabled;
        return this;
    }

    public DefaultRenderersFactory experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean enabled) {
        this.h = enabled;
        return this;
    }

    public DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long allowedVideoJoiningTimeMs) {
        this.c = allowedVideoJoiningTimeMs;
        return this;
    }

    public DefaultRenderersFactory setEnableAudioFloatOutput(boolean enableFloatOutput) {
        this.i = enableFloatOutput;
        return this;
    }

    public DefaultRenderersFactory setEnableAudioOffload(boolean enableOffload) {
        this.k = enableOffload;
        return this;
    }

    public DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean enableAudioTrackPlaybackParams) {
        this.j = enableAudioTrackPlaybackParams;
        return this;
    }

    public DefaultRenderersFactory setEnableDecoderFallback(boolean enableDecoderFallback) {
        this.d = enableDecoderFallback;
        return this;
    }

    public DefaultRenderersFactory setExtensionRendererMode(int extensionRendererMode) {
        this.b = extensionRendererMode;
        return this;
    }

    public DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.e = mediaCodecSelector;
        return this;
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, int extensionRendererMode) {
        this(context, extensionRendererMode, 5000L);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, int extensionRendererMode, long allowedVideoJoiningTimeMs) {
        this.a = context;
        this.b = extensionRendererMode;
        this.c = allowedVideoJoiningTimeMs;
        this.e = MediaCodecSelector.DEFAULT;
    }
}
