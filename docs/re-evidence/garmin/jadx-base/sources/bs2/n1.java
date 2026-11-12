package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class n1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20322e;

    static {
        bk bkVar = new bk("audio_prompt_settings_event", 266);
        f20322e = bkVar;
        bkVar.e(new rc("timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("lap_alert", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("speed_pace_alert", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("heart_rate_alert", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("speed_pace_type", 4, 0, 1.0d, 0.0d, "", false, zn.FITNESS_AUDIO_PROMPT_TYPE_PACE_SPEED));
        zn znVar2 = zn.FITNESS_AUDIO_PROMPT_FREQUENCY;
        bkVar.e(new rc("speed_pace_freq", 5, 0, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("speed_pace_duration", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("heart_rate_type", 7, 0, 1.0d, 0.0d, "", false, zn.FITNESS_AUDIO_PROMPT_TYPE_HEART_RATE));
        bkVar.e(new rc("heart_rate_freq", 8, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("heart_rate_duration", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("audio_dialect", 10, 0, 1.0d, 0.0d, "", false, zn.LANGUAGE_DIALECT));
        bkVar.e(new rc("timer_events", 11, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("activity_alerts", 12, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("power_alert", 13, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("power_type", 14, 0, 1.0d, 0.0d, "", false, zn.FITNESS_AUDIO_PROMPT_TYPE_POWER));
        bkVar.e(new rc("power_freq", 15, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("power_duration", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("audio_tones_over_bt", 17, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("workout_alerts", 18, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("speech_alert", 19, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("audio_voice", 20, 0, 1.0d, 0.0d, "", false, zn.AUDIO_PROMPT_VOICE));
        bkVar.e(new rc("audio_output_device", 21, 0, 1.0d, 0.0d, "", false, zn.AUDIO_PROMPT_AUDIO_OUTPUT_DEVICE));
        bkVar.e(new rc("pacepro_alert", 22, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("navigation_alerts", 23, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public n1() {
        super(wb.b(266));
    }

    public n1(bk bkVar) {
        super(bkVar);
    }
}
