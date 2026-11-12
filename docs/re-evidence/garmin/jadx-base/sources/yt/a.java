package yt;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.y0;
import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.util.MimeTypes;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f199267b;

    public /* synthetic */ a(h hVar, int i14) {
        this.f199266a = i14;
        this.f199267b = hVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f199266a;
        final h hVar = this.f199267b;
        switch (i14) {
            case 0:
                int i15 = h.f199301x;
                View view2 = hVar.getView();
                int width = view2 != null ? view2.getWidth() : hVar.getResources().getDisplayMetrics().widthPixels;
                View view3 = hVar.getView();
                int height = view3 != null ? view3.getHeight() : hVar.getResources().getDisplayMetrics().heightPixels;
                o13.p pVar = new o13.p(Integer.valueOf(width), Integer.valueOf(height));
                int iC = hVar.f199317p + MathKt.c(hVar.requireContext().getResources().getDimension(R.dimen.player_control_panel_height));
                o13.p pVar2 = new o13.p(Integer.valueOf(width), Integer.valueOf((height - iC) - hVar.f199318q));
                ut.a aVar = hVar.f199303b;
                if (aVar == null) {
                    p005kotlin.jvm.internal.s.m("binding");
                    throw null;
                }
                ImageView imageView = aVar.f172548h;
                imageView.getClass();
                ot.x xVar = new ot.x(pVar, pVar2, iC, imageView);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "AnnualReportPlayerFragment", "responsiveScreenInfo = " + xVar);
                return xVar;
            case 1:
                int i16 = h.f199301x;
                ot.p pVarX4 = hVar.w6().x4();
                r rVarY4 = hVar.w6().y4();
                if (pVarX4 != null && rVarY4 == r.CHAPTER) {
                    String strConcat = "screenshot on ".concat(pVarX4.getClass().getSimpleName());
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "AnnualReportPlayerFragment", strConcat);
                    nt.a aVar4 = nt.a.f127827a;
                    String f133671n = pVarX4.getF133666o();
                    aVar4.getClass();
                    f133671n.getClass();
                    ht.s sVar = ht.s.f85508a;
                    lt.a.f fVar = new lt.a.f(f133671n, lt.a.c.ACTION_CHAPTER_SCREENSHOT);
                    sVar.getClass();
                    ht.s.a(fVar);
                }
                return Unit.INSTANCE;
            case 2:
                int i17 = h.f199301x;
                hVar.requireActivity().finish();
                return Unit.INSTANCE;
            case 3:
                int i18 = h.f199301x;
                Context context = hVar.getContext();
                Object systemService = context != null ? context.getSystemService(MimeTypes.BASE_TYPE_AUDIO) : null;
                if (systemService instanceof AudioManager) {
                    return (AudioManager) systemService;
                }
                return null;
            case 4:
                LottieDrawable lottieDrawable = hVar.f199306e;
                y0<Boolean> y0Var = hVar.f199305d;
                if (lottieDrawable == null || !lottieDrawable.isAnimating()) {
                    LottieDrawable lottieDrawable2 = hVar.f199306e;
                    if (lottieDrawable2 != null) {
                        lottieDrawable2.resumeAnimation();
                    }
                    y0Var.j(Boolean.TRUE);
                } else {
                    LottieDrawable lottieDrawable3 = hVar.f199306e;
                    if (lottieDrawable3 != null) {
                        lottieDrawable3.pauseAnimation();
                    }
                    y0Var.j(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            default:
                int i19 = h.f199301x;
                final AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                builder2.setUsage(1);
                builder2.setContentType(2);
                builder.setAudioAttributes(builder2.build());
                builder.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener(builder) { // from class: yt.g
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i24) {
                        int i25 = h.f199301x;
                        Boolean boolValueOf = Boolean.valueOf(i24 == 1);
                        h hVar2 = this.f199300a;
                        hVar2.f199320t = boolValueOf;
                        MediaPlayer mediaPlayer = hVar2.f199315n;
                        boolean zIsPlaying = mediaPlayer != null ? mediaPlayer.isPlaying() : false;
                        if (p005kotlin.jvm.internal.s.g(hVar2.f199320t, Boolean.TRUE) && !zIsPlaying) {
                            MediaPlayer mediaPlayer2 = hVar2.f199315n;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.seekTo(hVar2.f199316o);
                            }
                            MediaPlayer mediaPlayer3 = hVar2.f199315n;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.start();
                            }
                        } else if (p005kotlin.jvm.internal.s.g(hVar2.f199320t, Boolean.FALSE) && zIsPlaying) {
                            MediaPlayer mediaPlayer4 = hVar2.f199315n;
                            if (mediaPlayer4 != null) {
                                mediaPlayer4.pause();
                            }
                            MediaPlayer mediaPlayer5 = hVar2.f199315n;
                            hVar2.f199316o = mediaPlayer5 != null ? mediaPlayer5.getCurrentPosition() : 0;
                        }
                        d53.a.a(16);
                        String string = Integer.toString(i24, 16);
                        string.getClass();
                        String strConcat2 = "[AudioFocus] Audio focus changed when annual report is playing: new focus = ".concat(string);
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.b(a2Var3, "AnnualReportPlayerFragment", strConcat2);
                    }
                });
                return builder.build();
        }
    }
}
