package com.garmin.android.apps.connectmobile.view.audiorecording;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.android.apps.connectmobile.view.audiorecording.e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import i3.e5;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import ka.i;
import linc.com.amplituda.Amplituda;
import linc.com.amplituda.Compress;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r0.h;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0007/012345B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010$R*\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00066"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView;", "Landroid/widget/FrameLayout;", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/e$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setRequestPermissionListener", "(Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$f;)V", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$e;", "setRemoveRecordingClickListener", "(Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$e;)V", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$d;", "setFinishedRecordingListener", "(Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$d;)V", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$c;", "setDownloadFileListener", "(Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$c;)V", "Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$g;", "setStopRecordingAudioListener", "(Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$g;)V", "maxRecordTimeInSeconds", "setMaxRecordTime", "(I)V", "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "", "getStoragePath", "()Ljava/lang/String;", "getFileExtension", "", "value", "B", "Z", "getShowDeleteAudioButton", "()Z", "setShowDeleteAudioButton", "(Z)V", "showDeleteAudioButton", "a", "f", JWKParameterNames.RSA_EXPONENT, "d", "c", "g", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class AudioRecordingView extends FrameLayout implements com.garmin.android.apps.connectmobile.view.audiorecording.e.a {
    public static final /* synthetic */ int C = 0;
    public boolean A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean showDeleteAudioButton;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.view.audiorecording.b f47562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.view.audiorecording.a f47563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.view.audiorecording.e f47564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f47565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f47566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f47567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f47568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f47569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f47570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f47571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f47572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f47573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WaveformView f47574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f47575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImageView f47576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProgressBar f47577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f47578r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f47579t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f47580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f47581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a f47582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f47583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f47584z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        RECORD,
        PLAYING,
        PAUSED,
        /* JADX INFO: Fake field, exist only in values array */
        RESUMED,
        STOPPED
    }

    public interface c {
        void h(String str, String str2, s22.d dVar);
    }

    public interface d {
        void f(String str);
    }

    public interface e {
        void d(e23.a<Unit> aVar);
    }

    public interface f {
        void a();
    }

    public interface g {
    }

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47590a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47590a = iArr;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordingView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47561a = 15;
        this.f47582x = a.RECORD;
        this.showDeleteAudioButton = true;
        this.f47565e = kg.f.c();
        this.f47566f = e5.g(getStoragePath(), this.f47565e, getFileExtension());
        if (!new File(this.f47566f).mkdirs()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioRecordingView", "Error! No directory created for audio note files!");
        }
        com.garmin.android.apps.connectmobile.view.audiorecording.b.a aVar2 = com.garmin.android.apps.connectmobile.view.audiorecording.b.f47609e;
        String str = this.f47566f;
        aVar2.getClass();
        str.getClass();
        com.garmin.android.apps.connectmobile.view.audiorecording.b bVar = new com.garmin.android.apps.connectmobile.view.audiorecording.b(str);
        this.f47562b = bVar;
        com.garmin.android.apps.connectmobile.view.audiorecording.a.C0928a c0928a = com.garmin.android.apps.connectmobile.view.audiorecording.a.f47606c;
        String str2 = this.f47566f;
        c0928a.getClass();
        str2.getClass();
        com.garmin.android.apps.connectmobile.view.audiorecording.a aVar3 = new com.garmin.android.apps.connectmobile.view.audiorecording.a(str2);
        this.f47563c = aVar3;
        this.f47564d = new com.garmin.android.apps.connectmobile.view.audiorecording.e(this);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.audio_recording_view, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.layout_icon);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewInflate.findViewById(R.id.audio_record_icon);
        viewFindViewById2.getClass();
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f47568h = imageView;
        View viewFindViewById3 = viewInflate.findViewById(R.id.record_audio_view);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f47569i = textView;
        textView.setText(context.getResources().getString(R.string.audio_note_press_to_record));
        View viewFindViewById4 = viewInflate.findViewById(R.id.play_audio_view);
        viewFindViewById4.getClass();
        this.f47570j = viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.audio_play_icon);
        viewFindViewById5.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f47571k = imageView2;
        View viewFindViewById6 = viewInflate.findViewById(R.id.audio_record_timer);
        viewFindViewById6.getClass();
        this.f47572l = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.waveform_image);
        viewFindViewById7.getClass();
        this.f47573m = (ImageView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.waveform_custom_view);
        viewFindViewById8.getClass();
        WaveformView waveformView = (WaveformView) viewFindViewById8;
        this.f47574n = waveformView;
        View viewFindViewById9 = viewInflate.findViewById(R.id.audio_download_icon);
        viewFindViewById9.getClass();
        this.f47577q = (ProgressBar) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.icon_error);
        viewFindViewById10.getClass();
        ImageView imageView3 = (ImageView) viewFindViewById10;
        this.f47575o = imageView3;
        View viewFindViewById11 = viewInflate.findViewById(R.id.delete_audio_recording_button);
        viewFindViewById11.getClass();
        ImageView imageView4 = (ImageView) viewFindViewById11;
        this.f47576p = imageView4;
        if (c22.b.e(context)) {
            imageView.getLayoutParams().width = (int) c22.b.c(context, getResources().getDimensionPixelSize(R.dimen.icon_medium), 1.5f);
            imageView2.getLayoutParams().width = (int) c22.b.c(context, getResources().getDimensionPixelSize(R.dimen.icon_medium), 1.5f);
            imageView3.getLayoutParams().width = (int) c22.b.c(context, getResources().getDimensionPixelSize(R.dimen.icon_xsmall), 1.5f);
            imageView4.getLayoutParams().width = (int) c22.b.c(context, getResources().getDimensionPixelSize(R.dimen.icon_default), 1.5f);
            waveformView.getLayoutParams().height = (int) c22.b.c(context, 100.0f, 2.0f);
        }
        h(false);
        setMaxRecordTime(this.f47561a);
        imageView.setOnLongClickListener(new gc0.a(this, 3));
        imageView.setOnTouchListener(new b00.g(this, 7));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: s22.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudioRecordingView f156227b;

            {
                this.f156227b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AudioRecordingView.c cVar;
                int i16 = i15;
                AudioRecordingView audioRecordingView = this.f156227b;
                switch (i16) {
                    case 0:
                        int i17 = AudioRecordingView.C;
                        if (audioRecordingView.f47562b.f47613d) {
                            audioRecordingView.f();
                            return;
                        } else {
                            audioRecordingView.e();
                            return;
                        }
                    case 1:
                        AudioRecordingView.e eVar = audioRecordingView.f47579t;
                        if (eVar != null) {
                            eVar.d(new c(audioRecordingView));
                            return;
                        }
                        return;
                    default:
                        AudioRecordingView.a aVar4 = audioRecordingView.f47582x;
                        com.garmin.android.apps.connectmobile.view.audiorecording.a aVar5 = audioRecordingView.f47563c;
                        int i18 = AudioRecordingView.h.f47590a[aVar4.ordinal()];
                        if (i18 == 1) {
                            MediaPlayer mediaPlayer = aVar5.f47607a;
                            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                                return;
                            }
                            MediaPlayer mediaPlayer2 = aVar5.f47607a;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.pause();
                            }
                            com.garmin.android.apps.connectmobile.view.audiorecording.d dVar = aVar5.f47608b;
                            if (dVar != null) {
                                AudioRecordingView audioRecordingView2 = dVar.f47615a;
                                audioRecordingView2.f47582x = AudioRecordingView.a.PAUSED;
                                ImageView imageView5 = audioRecordingView2.f47571k;
                                e eVar2 = audioRecordingView2.f47564d;
                                Handler handler = eVar2.f47616a;
                                h hVar = eVar2.f47617b;
                                if (hVar == null) {
                                    s.m("runnable");
                                    throw null;
                                }
                                handler.removeCallbacks(hVar);
                                imageView5.setImageResource(2131233731);
                                imageView5.setContentDescription(audioRecordingView2.getContext().getString(R.string.audio_note_play));
                                return;
                            }
                            return;
                        }
                        if (i18 == 2) {
                            MediaPlayer mediaPlayer3 = aVar5.f47607a;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.start();
                                com.garmin.android.apps.connectmobile.view.audiorecording.d dVar2 = aVar5.f47608b;
                                if (dVar2 != null) {
                                    dVar2.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (new File(audioRecordingView.f47566f).exists()) {
                            if (!audioRecordingView.A) {
                                audioRecordingView.d();
                            }
                            audioRecordingView.f47574n.c();
                            aVar5.a(audioRecordingView.f47562b.f47610a);
                            return;
                        }
                        v22.e.q(audioRecordingView.f47577q);
                        v22.e.j(audioRecordingView.f47571k);
                        String str3 = audioRecordingView.f47567g;
                        if (str3 == null || (cVar = audioRecordingView.f47581w) == null) {
                            return;
                        }
                        cVar.h(str3, audioRecordingView.f47565e, new d(audioRecordingView));
                        return;
                }
            }
        });
        final int i16 = 1;
        imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: s22.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudioRecordingView f156227b;

            {
                this.f156227b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AudioRecordingView.c cVar;
                int i17 = i16;
                AudioRecordingView audioRecordingView = this.f156227b;
                switch (i17) {
                    case 0:
                        int i18 = AudioRecordingView.C;
                        if (audioRecordingView.f47562b.f47613d) {
                            audioRecordingView.f();
                            return;
                        } else {
                            audioRecordingView.e();
                            return;
                        }
                    case 1:
                        AudioRecordingView.e eVar = audioRecordingView.f47579t;
                        if (eVar != null) {
                            eVar.d(new c(audioRecordingView));
                            return;
                        }
                        return;
                    default:
                        AudioRecordingView.a aVar4 = audioRecordingView.f47582x;
                        com.garmin.android.apps.connectmobile.view.audiorecording.a aVar5 = audioRecordingView.f47563c;
                        int i19 = AudioRecordingView.h.f47590a[aVar4.ordinal()];
                        if (i19 == 1) {
                            MediaPlayer mediaPlayer = aVar5.f47607a;
                            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                                return;
                            }
                            MediaPlayer mediaPlayer2 = aVar5.f47607a;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.pause();
                            }
                            com.garmin.android.apps.connectmobile.view.audiorecording.d dVar = aVar5.f47608b;
                            if (dVar != null) {
                                AudioRecordingView audioRecordingView2 = dVar.f47615a;
                                audioRecordingView2.f47582x = AudioRecordingView.a.PAUSED;
                                ImageView imageView5 = audioRecordingView2.f47571k;
                                e eVar2 = audioRecordingView2.f47564d;
                                Handler handler = eVar2.f47616a;
                                h hVar = eVar2.f47617b;
                                if (hVar == null) {
                                    s.m("runnable");
                                    throw null;
                                }
                                handler.removeCallbacks(hVar);
                                imageView5.setImageResource(2131233731);
                                imageView5.setContentDescription(audioRecordingView2.getContext().getString(R.string.audio_note_play));
                                return;
                            }
                            return;
                        }
                        if (i19 == 2) {
                            MediaPlayer mediaPlayer3 = aVar5.f47607a;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.start();
                                com.garmin.android.apps.connectmobile.view.audiorecording.d dVar2 = aVar5.f47608b;
                                if (dVar2 != null) {
                                    dVar2.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (new File(audioRecordingView.f47566f).exists()) {
                            if (!audioRecordingView.A) {
                                audioRecordingView.d();
                            }
                            audioRecordingView.f47574n.c();
                            aVar5.a(audioRecordingView.f47562b.f47610a);
                            return;
                        }
                        v22.e.q(audioRecordingView.f47577q);
                        v22.e.j(audioRecordingView.f47571k);
                        String str3 = audioRecordingView.f47567g;
                        if (str3 == null || (cVar = audioRecordingView.f47581w) == null) {
                            return;
                        }
                        cVar.h(str3, audioRecordingView.f47565e, new d(audioRecordingView));
                        return;
                }
            }
        });
        final int i17 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: s22.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudioRecordingView f156227b;

            {
                this.f156227b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AudioRecordingView.c cVar;
                int i18 = i17;
                AudioRecordingView audioRecordingView = this.f156227b;
                switch (i18) {
                    case 0:
                        int i19 = AudioRecordingView.C;
                        if (audioRecordingView.f47562b.f47613d) {
                            audioRecordingView.f();
                            return;
                        } else {
                            audioRecordingView.e();
                            return;
                        }
                    case 1:
                        AudioRecordingView.e eVar = audioRecordingView.f47579t;
                        if (eVar != null) {
                            eVar.d(new c(audioRecordingView));
                            return;
                        }
                        return;
                    default:
                        AudioRecordingView.a aVar4 = audioRecordingView.f47582x;
                        com.garmin.android.apps.connectmobile.view.audiorecording.a aVar5 = audioRecordingView.f47563c;
                        int i110 = AudioRecordingView.h.f47590a[aVar4.ordinal()];
                        if (i110 == 1) {
                            MediaPlayer mediaPlayer = aVar5.f47607a;
                            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                                return;
                            }
                            MediaPlayer mediaPlayer2 = aVar5.f47607a;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.pause();
                            }
                            com.garmin.android.apps.connectmobile.view.audiorecording.d dVar = aVar5.f47608b;
                            if (dVar != null) {
                                AudioRecordingView audioRecordingView2 = dVar.f47615a;
                                audioRecordingView2.f47582x = AudioRecordingView.a.PAUSED;
                                ImageView imageView5 = audioRecordingView2.f47571k;
                                e eVar2 = audioRecordingView2.f47564d;
                                Handler handler = eVar2.f47616a;
                                h hVar = eVar2.f47617b;
                                if (hVar == null) {
                                    s.m("runnable");
                                    throw null;
                                }
                                handler.removeCallbacks(hVar);
                                imageView5.setImageResource(2131233731);
                                imageView5.setContentDescription(audioRecordingView2.getContext().getString(R.string.audio_note_play));
                                return;
                            }
                            return;
                        }
                        if (i110 == 2) {
                            MediaPlayer mediaPlayer3 = aVar5.f47607a;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.start();
                                com.garmin.android.apps.connectmobile.view.audiorecording.d dVar2 = aVar5.f47608b;
                                if (dVar2 != null) {
                                    dVar2.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (new File(audioRecordingView.f47566f).exists()) {
                            if (!audioRecordingView.A) {
                                audioRecordingView.d();
                            }
                            audioRecordingView.f47574n.c();
                            aVar5.a(audioRecordingView.f47562b.f47610a);
                            return;
                        }
                        v22.e.q(audioRecordingView.f47577q);
                        v22.e.j(audioRecordingView.f47571k);
                        String str3 = audioRecordingView.f47567g;
                        if (str3 == null || (cVar = audioRecordingView.f47581w) == null) {
                            return;
                        }
                        cVar.h(str3, audioRecordingView.f47565e, new d(audioRecordingView));
                        return;
                }
            }
        });
        bVar.f47612c = new com.garmin.android.apps.connectmobile.view.audiorecording.c(this);
        aVar3.f47608b = new com.garmin.android.apps.connectmobile.view.audiorecording.d(this);
    }

    public static void b(AudioRecordingView audioRecordingView) {
        if (audioRecordingView.e()) {
            audioRecordingView.f47584z = true;
            audioRecordingView.getVibrator().vibrate(VibrationEffect.createOneShot(50L, -1));
        }
    }

    private final String getFileExtension() {
        return ".mp3";
    }

    private final String getStoragePath() {
        return k.g(getContext().getCacheDir().getAbsolutePath(), "/audioNotes/");
    }

    @SuppressLint({"WrongConstant"})
    private final Vibrator getVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = getContext().getSystemService("vibrator");
            systemService.getClass();
            return (Vibrator) systemService;
        }
        Object systemService2 = getContext().getSystemService("vibrator_manager");
        systemService2.getClass();
        Vibrator defaultVibrator = i.i(systemService2).getDefaultVibrator();
        defaultVibrator.getClass();
        return defaultVibrator;
    }

    @Override // com.garmin.android.apps.connectmobile.view.audiorecording.e.a
    public final void a(String str, int i14, long j8, boolean z14) {
        this.f47572l.setText(str);
        MediaRecorder mediaRecorder = this.f47562b.f47611b;
        float maxAmplitude = mediaRecorder != null ? mediaRecorder.getMaxAmplitude() : 0.0f;
        boolean z15 = this.A;
        WaveformView waveformView = this.f47574n;
        ArrayList arrayList = waveformView.f47599i;
        ArrayList<Float> arrayList2 = waveformView.f47597g;
        ArrayList<Float> arrayList3 = waveformView.f47598h;
        HashMap map = waveformView.f47595e;
        if (z14) {
            map.put(Long.valueOf(j8), Float.valueOf(maxAmplitude));
            waveformView.b(waveformView.f47592b, maxAmplitude, waveformView.f47593c, waveformView.f47594d);
        } else if (z15) {
            Float f14 = (Float) map.get(Long.valueOf(j8));
            if (f14 != null) {
                waveformView.b(arrayList3, f14.floatValue(), arrayList2, arrayList);
            }
        } else {
            Float f15 = (Float) map.get(Long.valueOf(j8));
            if (f15 != null) {
                waveformView.a(arrayList3, f15.floatValue(), arrayList2, arrayList);
            }
        }
        if (i14 >= this.f47561a) {
            this.f47583y = true;
            if (z14) {
                f();
            } else {
                this.f47563c.b();
            }
        }
    }

    public final void c() {
        com.garmin.android.apps.connectmobile.view.audiorecording.b bVar = this.f47562b;
        bVar.f47613d = false;
        File file = new File(bVar.f47610a);
        if (file.exists()) {
            file.delete();
        }
        ImageView imageView = this.f47568h;
        imageView.setImageResource(2131233729);
        imageView.setContentDescription(getContext().getString(R.string.audio_note_record_audio));
        this.f47574n.d();
        com.garmin.android.apps.connectmobile.view.audiorecording.a aVar = this.f47563c;
        MediaPlayer mediaPlayer = aVar.f47607a;
        if (mediaPlayer != null ? mediaPlayer.isPlaying() : false) {
            aVar.b();
        }
        this.f47564d.a();
        this.f47582x = a.RECORD;
        this.A = false;
        h(false);
    }

    public final void d() {
        ImageView imageView = this.f47571k;
        imageView.setImageResource(2131233731);
        imageView.setContentDescription(getContext().getString(R.string.audio_note_play));
        imageView.setVisibility(0);
        v22.e.j(this.f47573m);
        v22.e.q(this.f47574n);
        v22.e.q(this.f47572l);
        new Amplituda(getContext()).processAudio(this.f47562b.f47610a, Compress.withParams(4, 8)).get(new r22.a(this, 13), null);
    }

    public final boolean e() {
        Context context = getContext();
        context.getClass();
        com.garmin.android.apps.connectmobile.view.audiorecording.b bVar = this.f47562b;
        bVar.getClass();
        if (a7.b.checkSelfPermission(context, "android.permission.RECORD_AUDIO") != 0) {
            f fVar = this.f47578r;
            if (fVar != null) {
                fVar.a();
            }
            return false;
        }
        bVar.f47613d = false;
        File file = new File(bVar.f47610a);
        if (file.exists()) {
            file.delete();
        }
        this.f47565e = kg.f.c();
        String strG = e5.g(getStoragePath(), this.f47565e, getFileExtension());
        this.f47566f = strG;
        bVar.f47610a = strG;
        WaveformView waveformView = this.f47574n;
        v22.e.q(waveformView);
        waveformView.d();
        waveformView.setWaveformColor(Color.rgb(166, 166, 166));
        v22.e.j(this.f47573m);
        this.A = true;
        bVar.f47613d = true;
        MediaRecorder mediaRecorder = new MediaRecorder();
        bVar.f47611b = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        MediaRecorder mediaRecorder2 = bVar.f47611b;
        if (mediaRecorder2 != null) {
            mediaRecorder2.setOutputFormat(2);
        }
        MediaRecorder mediaRecorder3 = bVar.f47611b;
        if (mediaRecorder3 != null) {
            mediaRecorder3.setOutputFile(bVar.f47610a);
        }
        MediaRecorder mediaRecorder4 = bVar.f47611b;
        if (mediaRecorder4 != null) {
            mediaRecorder4.setAudioEncoder(3);
        }
        try {
            MediaRecorder mediaRecorder5 = bVar.f47611b;
            if (mediaRecorder5 != null) {
                mediaRecorder5.prepare();
            }
            MediaRecorder mediaRecorder6 = bVar.f47611b;
            if (mediaRecorder6 != null) {
                mediaRecorder6.start();
            }
            com.garmin.android.apps.connectmobile.view.audiorecording.c cVar = bVar.f47612c;
            if (cVar != null) {
                cVar.a();
            }
            return true;
        } catch (IOException unused) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioRecorderEngine", "startRecording Failed!");
            return true;
        }
    }

    public final void f() {
        com.garmin.android.apps.connectmobile.view.audiorecording.b bVar = this.f47562b;
        bVar.f47613d = false;
        MediaRecorder mediaRecorder = bVar.f47611b;
        if (mediaRecorder != null) {
            mediaRecorder.release();
            com.garmin.android.apps.connectmobile.view.audiorecording.c cVar = bVar.f47612c;
            if (cVar != null) {
                AudioRecordingView audioRecordingView = cVar.f47614a;
                audioRecordingView.f47564d.a();
                d dVar = audioRecordingView.f47580v;
                if (dVar != null) {
                    dVar.f(audioRecordingView.f47566f);
                }
                audioRecordingView.h(true);
            }
            bVar.f47611b = null;
        }
    }

    public final void g(String str, String str2) {
        str.getClass();
        String strG = k.g(str2, u.p(str2, getFileExtension(), false) ? "" : getFileExtension());
        this.f47566f = str.concat(strG);
        this.f47565e = strG;
        if (!new File(str).mkdirs()) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioRecordingView", "Error! No directory created for audio note files in updateAudioFile()!");
        }
        String str3 = this.f47566f;
        com.garmin.android.apps.connectmobile.view.audiorecording.b bVar = this.f47562b;
        bVar.getClass();
        str3.getClass();
        bVar.f47610a = str3;
        String str4 = this.f47566f;
        this.f47563c.getClass();
        str4.getClass();
    }

    public final boolean getShowDeleteAudioButton() {
        return this.showDeleteAudioButton;
    }

    public final void h(boolean z14) {
        TextView textView = this.f47569i;
        ImageView imageView = this.f47568h;
        View view2 = this.f47570j;
        ImageView imageView2 = this.f47576p;
        ImageView imageView3 = this.f47571k;
        if (z14) {
            v22.e.q(imageView3);
            v22.e.v(imageView2, this.showDeleteAudioButton);
            v22.e.q(view2);
            v22.e.l(imageView);
            v22.e.j(textView);
            return;
        }
        v22.e.q(textView);
        v22.e.q(imageView);
        v22.e.l(imageView3);
        v22.e.j(imageView2);
        v22.e.j(view2);
    }

    public final void setDownloadFileListener(c listener) {
        this.f47581w = listener;
    }

    public final void setFinishedRecordingListener(d listener) {
        listener.getClass();
        this.f47580v = listener;
    }

    public final void setMaxRecordTime(int maxRecordTimeInSeconds) {
        int i14;
        this.f47561a = maxRecordTimeInSeconds;
        int width = getWidth();
        int height = getHeight();
        com.garmin.android.apps.connectmobile.view.audiorecording.e eVar = this.f47564d;
        if (width <= 0 || height <= 0) {
            eVar.f47619d = 150L;
            return;
        }
        WaveformView waveformView = this.f47574n;
        waveformView.getClass();
        if (width == 0 || height == 0) {
            i14 = waveformView.f47605o;
        } else {
            waveformView.f47603m = height;
            i14 = (int) (((width / 2) + 100.0f) / (waveformView.f47601k + waveformView.f47602l));
            waveformView.f47605o = i14;
        }
        eVar.f47619d = ((long) (this.f47561a * 1000)) / ((long) i14);
    }

    public final void setRemoveRecordingClickListener(e listener) {
        listener.getClass();
        this.f47579t = listener;
    }

    public final void setRequestPermissionListener(f listener) {
        listener.getClass();
        this.f47578r = listener;
    }

    public final void setShowDeleteAudioButton(boolean z14) {
        this.showDeleteAudioButton = z14;
        v22.e.v(this.f47576p, z14);
    }

    public final void setStopRecordingAudioListener(g listener) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/AudioRecordingView$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioRecordingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioRecordingView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ AudioRecordingView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
