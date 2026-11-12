package defpackage;

import android.media.MediaPlayer;
import android.net.Uri;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jeo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile jeo f38497c;

    private jeo() {
    }

    public static jeo d() {
        LogUtil.d("Track_SmartCoachVoicePlayHandle", "SmartCoachVoicePlayHandler getInstance()");
        if (f38497c == null) {
            synchronized (jeo.class) {
                if (f38497c == null) {
                    f38497c = new jeo();
                }
            }
        }
        return f38497c;
    }

    public String d(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return a() + str + AudioConstant.AUDIO;
    }

    public String a() {
        return jdv.f38440a + "1.1.1" + File.separator + "mp3" + File.separator + "zh-CN" + File.separator + "female" + File.separator + "mandarin" + File.separator;
    }

    public long a(String str) {
        long duration = 0;
        if (str != null && !str.isEmpty()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            try {
                mediaPlayer.setDataSource(str);
                mediaPlayer.prepare();
                duration = mediaPlayer.getDuration();
            } catch (IOException e) {
                LogUtil.a("Track_SmartCoachVoicePlayHandle", LogAnonymous.b(e));
            }
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        return duration;
    }

    public long b(int i) {
        long duration;
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(BaseApplication.getContext(), Uri.parse("android.resource://com.huawei.health/" + i));
            mediaPlayer.setAudioStreamType(3);
            mediaPlayer.prepare();
            duration = mediaPlayer.getDuration();
        } catch (Exception e) {
            LogUtil.a("Track_SmartCoachVoicePlayHandle", LogAnonymous.b(e));
            duration = 0;
        }
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return duration;
    }

    public long b(List<Object> list, Map<Integer, Integer> map) {
        long jB = 0;
        if (njy.e(list)) {
            LogUtil.j("Track_SmartCoachVoicePlayHandle", "getTotalAudioFileVoiceTime objectList is empty.");
            return 0L;
        }
        for (Object obj : list) {
            if (obj instanceof String) {
                jB += a((String) obj);
            }
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                num.intValue();
                jB += b(map.get(num).intValue());
            }
        }
        LogUtil.d("Track_SmartCoachVoicePlayHandle", "getTotalAudioFileVoiceTime totalDuration = ", Long.valueOf(jB));
        return jB;
    }
}
