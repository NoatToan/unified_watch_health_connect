package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.LongCoachView;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.view.BrightnessOrVolumeProgressPlus;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.EnvironmentInfo;

/* JADX INFO: loaded from: classes9.dex */
public class hkb {
    private static int d;

    public static boolean b(boolean z, int i, boolean z2) {
        return z && !z2 && (i != -100 && i != 192);
    }

    public static void d(LongCoachView longCoachView, Motion motion) {
        if (longCoachView == null || motion == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "changeProgress coachView == null || currMotion == null");
            return;
        }
        if (njy.e(motion.getVideoSegments(), 0)) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "getVideoSegments is empty");
        } else if (motion.getVideoSegments().get(0) == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "getVideoSegments(0) is null");
        } else {
            if (motion.getVideoSegments().get(0).getDuration() < longCoachView.e() / 1000) {
                return;
            }
            e(longCoachView, motion);
        }
    }

    private static void e(LongCoachView longCoachView, Motion motion) {
        if ("timer".equals(motion.acquireMotionType())) {
            longCoachView.setTimeView((int) (longCoachView.e() / 1000), -1, true);
        } else if (longCoachView.b()) {
            longCoachView.setTimeView((int) ((longCoachView.e() / 1000) - 1), -1, false);
        } else {
            longCoachView.setTimeView((int) (longCoachView.e() / 1000), -1, false);
        }
    }

    public static void b(LongCoachView longCoachView, float f) {
        if (longCoachView == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "rateEffective coachView == null");
            return;
        }
        if (f <= 0.6d || !(longCoachView.n().getTag() instanceof Boolean)) {
            return;
        }
        if (((Boolean) longCoachView.n().getTag()).booleanValue()) {
            longCoachView.c(true);
        } else {
            longCoachView.n().setTag(true);
        }
    }

    public static boolean b(LongCoachView longCoachView, int i) {
        if (longCoachView != null) {
            return longCoachView.h() != null && i == R.id.sug_coach_set_iv_stop;
        }
        LogUtil.j("Suggestion_LongCoachViewUIHelper", "isFinish coachView == null");
        return false;
    }

    public static boolean e(int i) {
        return i == R.id.sug_coach_set_iv_continue || i == R.id.sug_coach_set_voice_ok;
    }

    public static void d(LongCoachView longCoachView, int i) {
        if (longCoachView == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "preNextChange coachView == null");
            return;
        }
        if (longCoachView.a().c() == 0) {
            hjg.b(longCoachView.j(), 0.4f, 2);
            return;
        }
        if (longCoachView.a().c() == 1) {
            hjg.b(longCoachView.j(), 1.0f, 0);
            return;
        }
        if (longCoachView.a().c() == i - 1) {
            hjg.b(longCoachView.i(), 0.4f, 2);
        } else if (longCoachView.a().c() != i - 2) {
            LogUtil.d("Suggestion_LongCoachViewUIHelper", "CurrMotion unexpected");
        } else {
            longCoachView.i().setAlpha(1.0f);
            hjg.b(longCoachView.i(), 1.0f, 0);
        }
    }

    public static void c(LongCoachView longCoachView, float f, Context context) {
        if (longCoachView == null || context == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "coachView or context is null");
            return;
        }
        if (!(context instanceof Activity)) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "setBrightness getContext() not instanceof Activity");
            return;
        }
        Activity activity = (Activity) context;
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (attributes.screenBrightness == -1.0f) {
            attributes.screenBrightness = hkc.c(context) / 255.0f;
        }
        attributes.screenBrightness += f;
        if (attributes.screenBrightness > 1.0d) {
            attributes.screenBrightness = 1.0f;
        } else if (attributes.screenBrightness >= 0.01d) {
            LogUtil.d("Suggestion_LongCoachViewUIHelper", "screenBrightness is normal value");
        } else {
            attributes.screenBrightness = 0.01f;
        }
        BrightnessOrVolumeProgressPlus brightOrVolumeProgressPlus = longCoachView.getBrightOrVolumeProgressPlus();
        if (brightOrVolumeProgressPlus == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "setBrightness brightnessOrVolume is null");
            return;
        }
        brightOrVolumeProgressPlus.setProgressMax(1.0f);
        brightOrVolumeProgressPlus.setProgress(attributes.screenBrightness);
        brightOrVolumeProgressPlus.c(R.drawable.ic_video_light);
        brightOrVolumeProgressPlus.a(context.getResources().getString(R.string.IDS_FitnessAdvice_brightness));
        activity.getWindow().setAttributes(attributes);
    }

    public static void b(Context context, ImageView imageView) {
        if (context == null || imageView == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "context or voiceImageView is null");
            return;
        }
        if (!(context.getSystemService("audio") instanceof AudioManager)) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "toMuteOrOpenSound getContext().getSystemService(AUDIO_SERVICE) not instanceof AudioManager");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "muteOrOpenSound audioManager is null");
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= 0) {
            audioManager.setStreamVolume(3, d, 0);
            imageView.setImageResource(R.drawable.sug_fitness_volume_selector);
            lrd.b(imageView, qre.i(R.string.accessibility_off_sound));
        } else {
            audioManager.setStreamVolume(3, 0, 0);
            imageView.setImageResource(R.drawable.sug_fitness_volume_off);
            d = streamVolume;
            lrd.b(imageView, qre.i(R.string.accessibility_on_sound));
        }
    }

    public static void e(Context context, ImageView imageView) {
        if (context == null || imageView == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "setDefaultVolume context or voiceImageView is null");
            return;
        }
        if (EnvironmentInfo.m()) {
            imageView.setVisibility(8);
            return;
        }
        if (!(context.getSystemService("audio") instanceof AudioManager)) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "setDefaultVolume getContext().getSystemService(AUDIO_SERVICE) not instanceof AudioManager");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "setDefaultVolume audioManager is null");
        } else if (audioManager.getStreamVolume(3) <= 0) {
            imageView.setImageResource(R.drawable.sug_fitness_volume_off);
            lrd.b(imageView, qre.i(R.string.accessibility_on_sound));
        } else {
            imageView.setImageResource(R.drawable.sug_fitness_volume_selector);
            lrd.b(imageView, qre.i(R.string.accessibility_off_sound));
        }
    }

    public static void c(LongCoachView longCoachView, Handler handler) {
        if (longCoachView == null || handler == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "doContinue coachView == null || handler == null");
            return;
        }
        longCoachView.f().videoContinue();
        if (longCoachView.a().a() != 251) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "Unexpected train station");
            return;
        }
        if (longCoachView.b() && !longCoachView.g()) {
            longCoachView.ab();
            d(longCoachView, handler, true);
        } else if (longCoachView.b()) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "Unexpected continue situation");
        } else {
            d(longCoachView, handler, false);
        }
    }

    public static void c(LongCoachView longCoachView, Motion motion) {
        if (longCoachView == null || motion == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "onChangeListener coachView == null || finishMotion == null");
        } else if (longCoachView.h() != null) {
            longCoachView.h().onMotionChanged(motion, longCoachView.a().c());
        }
    }

    private static void d(LongCoachView longCoachView, Handler handler, boolean z) {
        if (longCoachView == null || handler == null) {
            LogUtil.j("Suggestion_LongCoachViewUIHelper", "doContinue coachView == null || handler == null");
            return;
        }
        if (z) {
            handler.sendEmptyMessageDelayed(259, 4000L);
        } else {
            handler.sendEmptyMessage(259);
        }
        if (longCoachView.af()) {
            if (z) {
                handler.sendEmptyMessageDelayed(251, 4000L);
            } else {
                handler.sendEmptyMessage(251);
            }
        }
    }
}
