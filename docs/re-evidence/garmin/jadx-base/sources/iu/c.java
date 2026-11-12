package iu;

import am.j;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import j23.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liu/c;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f95001a = new c();

    private c() {
    }

    public static b a(GDIAudioPromptsProto.AudioPromptsService audioPromptsService) {
        if (audioPromptsService.hasSpeechNotification() && audioPromptsService.getSpeechNotification().hasSpeechType() && audioPromptsService.getSpeechNotification().getSpeechType() == GDIAudioPromptsProto.SpeechType.NAVIGATION) {
            return new b(audioPromptsService, 0, null, true, null, 0L, 0L, 116, null);
        }
        if (audioPromptsService.hasSpeechNotification()) {
            return new b(audioPromptsService, 10, null, false, null, 0L, 0L, 124, null);
        }
        if (audioPromptsService.hasLapNotification()) {
            return new b(audioPromptsService, 20, "LAP", false, null, 0L, 0L, 120, null);
        }
        if (audioPromptsService.hasHeartRateNotification()) {
            return new b(audioPromptsService, 30, "HR", false, null, 0L, 0L, 120, null);
        }
        if (audioPromptsService.hasPaceNotification()) {
            return new b(audioPromptsService, 40, "PACE", false, null, 0L, 0L, 120, null);
        }
        if (audioPromptsService.hasSpeedNotification()) {
            return new b(audioPromptsService, 45, "SPEED", false, null, 0L, 0L, 120, null);
        }
        if (audioPromptsService.hasPowerNotification()) {
            return new b(audioPromptsService, 50, "POWER", false, null, 0L, 0L, 120, null);
        }
        return audioPromptsService.hasPhraseNotification() ? new b(audioPromptsService, t.e(audioPromptsService.getPhraseNotification().getPriority(), 0, 9) + 60, j.h(audioPromptsService.getPhraseNotification().getPhrasesList().hashCode(), "PHRASE:"), false, null, 0L, 0L, 120, null) : new b(audioPromptsService, 99, null, false, null, 0L, 0L, 124, null);
    }
}
