package com.garmin.android.apps.connectmobile.audioprompts;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.room.a0;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.library.audioprompts.GravelEngine;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import gu.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import lc.u0;
import lu.c;
import lu.d;
import lu.e;
import nu.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.k;
import p13.y;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/a;", "Landroid/os/Handler;", "Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsService$f;", "Landroid/os/Looper;", "looper", "Lcom/garmin/android/library/audioprompts/GravelEngine;", "gravel", "Lnu/h;", "tts", "<init>", "(Landroid/os/Looper;Lcom/garmin/android/library/audioprompts/GravelEngine;Lnu/h;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Handler implements AudioPromptsService.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GravelEngine f30216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f30217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<f> f30218c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30220b;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.AVERAGE_PACE_SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.CURRENT_PACE_SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.LAP_PACE_SPEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30219a = iArr;
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.AVERAGE_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[e.NORMALIZED_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[e.LAP_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f30220b = iArr2;
        }
    }

    static {
        new C0471a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Looper looper, GravelEngine gravelEngine, h hVar) {
        super(looper);
        looper.getClass();
        gravelEngine.getClass();
        hVar.getClass();
        this.f30216a = gravelEngine;
        this.f30217b = hVar;
        this.f30218c = new k<>();
    }

    public static String d(String str) {
        if (str == null) {
            str = "";
        }
        return str + "ap-" + UUID.randomUUID();
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService.f
    public final boolean a() {
        return !this.f30218c.isEmpty();
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService.f
    public final f b() {
        k<f> kVar = this.f30218c;
        return kVar.isEmpty() ? null : kVar.removeFirst();
    }

    @Override // com.garmin.android.apps.connectmobile.audioprompts.AudioPromptsService.f
    public final void c(f fVar) {
        h hVar = this.f30217b;
        if (fVar != null) {
            String str = fVar.f79031b;
            if (str.length() != 0) {
                String strConcat = "Playing audio prompt: ".concat(str);
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "AudioPromptRequestHandler", strConcat);
                hVar.i(fVar.f79030a, str);
                return;
            }
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.p(a2Var2, "AudioPromptRequestHandler", "No audio prompt to play; skipping.");
        hVar.j();
    }

    /* JADX WARN: Code duplicated, block: B:174:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fd  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int lapPower;
        int i14;
        int i15;
        double dI;
        long j8;
        long lapPace;
        d dVar;
        int i16;
        int percentageHrr;
        message.getClass();
        super.handleMessage(message);
        Object obj = message.obj;
        obj.getClass();
        AudioPromptsService.a aVar = (AudioPromptsService.a) obj;
        long j14 = aVar.f30213c;
        String str = aVar.f30211a;
        k<f> kVar = this.f30218c;
        kVar.clear();
        GDIAudioPromptsProto.AudioPromptsService audioPromptsService = aVar.f30212b;
        boolean zHasLapNotification = audioPromptsService.hasLapNotification();
        GravelEngine gravelEngine = this.f30216a;
        if (zHasLapNotification) {
            String strD = d(str);
            GDIAudioPromptsProto.LapNotification lapNotification = audioPromptsService.getLapNotification();
            lapNotification.getClass();
            int lapNumber = lapNotification.getLapNumber();
            long lapTime = lapNotification.getLapTime();
            if (lapNumber <= 0 || lapTime <= 0) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "AudioPromptRequestHandler", "Lap invalid; nothing spoken.");
            } else {
                kVar.addLast(new f(strD, gravelEngine.render(od2.a.FITNESS_LAP_TIME.f131196a, lapNumber, (int) lapTime)));
            }
        } else {
            float lapSpeed = 0.0f;
            if (audioPromptsService.hasHeartRateNotification()) {
                String strD2 = d(str);
                GDIAudioPromptsProto.HeartRateNotification heartRateNotification = audioPromptsService.getHeartRateNotification();
                heartRateNotification.getClass();
                hu.a.f85684b.a().getClass();
                c cVarR = hu.a.R(j14);
                boolean zI = km2.a.i(j14, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
                if (heartRateNotification.hasBpm() && (zI || c.HEART_RATE == cVarR)) {
                    int bpm = heartRateNotification.getBpm();
                    if (30 > bpm || bpm >= 251) {
                        String strF = e0.f(bpm, "HR BPM [", "] out of range.");
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.p(a2Var2, "AudioPromptRequestHandler", strF);
                    } else {
                        kVar.addLast(new f(strD2, gravelEngine.render(od2.a.FITNESS_HEART_RATE_BPM.f131196a, bpm)));
                    }
                } else if (heartRateNotification.hasZone() && (zI || c.HEART_RATE_ZONE == cVarR)) {
                    float zone = heartRateNotification.getZone();
                    if (zone > 0.0f) {
                        kVar.addLast(new f(strD2, gravelEngine.render(od2.a.FITNESS_HEART_RATE_ZONE.f131196a, MathKt.c(zone * 10))));
                    }
                } else if (heartRateNotification.hasPercentageMax() && (zI || c.PERCENTAGE_MAX_HEART_RATE == cVarR)) {
                    int percentageMax = heartRateNotification.getPercentageMax();
                    if (percentageMax > 0) {
                        kVar.addLast(new f(strD2, gravelEngine.render(od2.a.FITNESS_HEART_RATE_PERCENT.f131196a, percentageMax)));
                    }
                } else if (heartRateNotification.hasPercentageHrr() && ((zI || c.PERCENTAGE_HEART_RATE_RESERVE == cVarR) && (percentageHrr = heartRateNotification.getPercentageHrr()) > 0)) {
                    kVar.addLast(new f(strD2, gravelEngine.render(od2.a.FITNESS_HEART_RATE_PERCENT.f131196a, percentageHrr)));
                }
            } else if (audioPromptsService.hasPaceNotification()) {
                String strD3 = d(str);
                GDIAudioPromptsProto.PaceNotification paceNotification = audioPromptsService.getPaceNotification();
                paceNotification.getClass();
                boolean zI2 = km2.a.i(j14, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
                hu.a.f85684b.a().getClass();
                d dVarT = hu.a.T(j14);
                if (paceNotification.hasAveragePace() && (zI2 || dVarT == d.AVERAGE_PACE_SPEED)) {
                    lapPace = paceNotification.getAveragePace();
                    dVar = d.AVERAGE_PACE_SPEED;
                } else if (paceNotification.hasCurrentPace() && (zI2 || dVarT == d.CURRENT_PACE_SPEED)) {
                    lapPace = paceNotification.getCurrentPace();
                    dVar = d.CURRENT_PACE_SPEED;
                } else {
                    if (paceNotification.hasLapPace() && (zI2 || dVarT == d.LAP_PACE_SPEED)) {
                        lapPace = paceNotification.getLapPace();
                        dVar = d.LAP_PACE_SPEED;
                    } else {
                        j8 = 0;
                    }
                    if (j8 >= 120 || j8 > 1800) {
                        String strF2 = a0.f(j8, "Pace [", "] not in 2–30 min; skip.");
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.p(a2Var3, "AudioPromptRequestHandler", strF2);
                    } else {
                        int i17 = b.f30219a[dVarT.ordinal()];
                        if (i17 == 1) {
                            i16 = od2.a.FITNESS_AVG_PACE.f131196a;
                        } else if (i17 == 2) {
                            i16 = od2.a.FITNESS_CUR_PACE.f131196a;
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return;
                            }
                            i16 = od2.a.FITNESS_LAP_PACE.f131196a;
                        }
                        kVar.addLast(new f(strD3, gravelEngine.render(i16, (int) j8)));
                    }
                }
                j8 = lapPace;
                dVarT = dVar;
                if (j8 >= 120) {
                    String strF3 = a0.f(j8, "Pace [", "] not in 2–30 min; skip.");
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.p(a2Var4, "AudioPromptRequestHandler", strF3);
                } else {
                    String strF4 = a0.f(j8, "Pace [", "] not in 2–30 min; skip.");
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.p(a2Var5, "AudioPromptRequestHandler", strF4);
                }
            } else if (audioPromptsService.hasSpeedNotification()) {
                String strD4 = d(str);
                GDIAudioPromptsProto.SpeedNotification speedNotification = audioPromptsService.getSpeedNotification();
                speedNotification.getClass();
                boolean zI3 = km2.a.i(j14, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
                hu.a.f85684b.a().getClass();
                d dVarT2 = hu.a.T(j14);
                if (speedNotification.hasAverageSpeed() && (zI3 || dVarT2 == d.AVERAGE_PACE_SPEED)) {
                    lapSpeed = speedNotification.getAverageSpeed();
                    dVarT2 = d.AVERAGE_PACE_SPEED;
                } else if (speedNotification.hasCurrentSpeed() && (zI3 || dVarT2 == d.CURRENT_PACE_SPEED)) {
                    lapSpeed = speedNotification.getCurrentSpeed();
                    dVarT2 = d.CURRENT_PACE_SPEED;
                } else if (speedNotification.hasLapSpeed() && (zI3 || dVarT2 == d.LAP_PACE_SPEED)) {
                    lapSpeed = speedNotification.getLapSpeed();
                    dVarT2 = d.LAP_PACE_SPEED;
                }
                if (lapSpeed < 0.89408f || lapSpeed > 44.257f) {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.p(a2Var6, "AudioPromptRequestHandler", "Speed [" + lapSpeed + "] out of 2–99 mph; skip.");
                } else {
                    int i18 = b.f30219a[dVarT2.ordinal()];
                    if (i18 == 1) {
                        i15 = od2.a.FITNESS_AVG_SPEED.f131196a;
                    } else if (i18 == 2) {
                        i15 = od2.a.FITNESS_CUR_SPEED.f131196a;
                    } else {
                        if (i18 != 3) {
                            u0.r();
                            return;
                        }
                        i15 = od2.a.FITNESS_LAP_SPEED.f131196a;
                    }
                    if (speedNotification.hasDeviceIsDisplayingMetricUnits() && speedNotification.getDeviceIsDisplayingMetricUnits()) {
                        l3.f23124b.getClass();
                        dI = l3.a.i(lapSpeed, q3.KILOMETER_PER_HOUR);
                    } else {
                        l3.f23124b.getClass();
                        dI = l3.a.i(lapSpeed, q3.MILE_PER_HOUR);
                    }
                    kVar.addLast(new f(strD4, gravelEngine.render(i15, MathKt.b(dI * ((double) 10)))));
                }
            } else if (audioPromptsService.hasPowerNotification()) {
                String strD5 = d(str);
                GDIAudioPromptsProto.PowerNotification powerNotification = audioPromptsService.getPowerNotification();
                powerNotification.getClass();
                boolean zI4 = km2.a.i(j14, null, SupportedCapability.REALTIME_SETTINGS.ordinal());
                hu.a.f85684b.a().getClass();
                e eVarU = hu.a.U(j14);
                if (powerNotification.hasAveragePower() && (zI4 || eVarU == e.AVERAGE_POWER)) {
                    lapPower = powerNotification.getAveragePower();
                    eVarU = e.AVERAGE_POWER;
                } else if (powerNotification.hasNormalizedPower() && (zI4 || eVarU == e.NORMALIZED_POWER)) {
                    lapPower = powerNotification.getNormalizedPower();
                    eVarU = e.NORMALIZED_POWER;
                } else if (powerNotification.hasLapPower() && (zI4 || eVarU == e.LAP_POWER)) {
                    lapPower = powerNotification.getLapPower();
                    eVarU = e.LAP_POWER;
                } else {
                    lapPower = 0;
                }
                if (lapPower < 1 || lapPower > 2000) {
                    String strF5 = e0.f(lapPower, "Power [", "] not in 1–2000 W; skip.");
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var7 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.p(a2Var7, "AudioPromptRequestHandler", strF5);
                } else {
                    int i19 = b.f30220b[eVarU.ordinal()];
                    if (i19 == 1) {
                        i14 = od2.a.FITNESS_AVG_POWER.f131196a;
                    } else if (i19 == 2) {
                        i14 = od2.a.FITNESS_NORM_POWER.f131196a;
                    } else {
                        if (i19 != 3) {
                            u0.r();
                            return;
                        }
                        i14 = od2.a.FITNESS_LAP_POWER.f131196a;
                    }
                    kVar.addLast(new f(strD5, gravelEngine.render(i14, lapPower)));
                }
            } else if (audioPromptsService.hasSpeechNotification()) {
                String strD6 = d(str);
                GDIAudioPromptsProto.SpeechNotification speechNotification = audioPromptsService.getSpeechNotification();
                speechNotification.getClass();
                if (speechNotification.hasSpeechType() && speechNotification.hasTextToSpeak()) {
                    String textToSpeak = speechNotification.getTextToSpeak();
                    textToSpeak.getClass();
                    if (textToSpeak.length() == 0) {
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var8 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.f(a2Var8, "AudioPromptRequestHandler", "Speech missing/empty; nothing spoken.");
                    } else {
                        String textToSpeak2 = speechNotification.getTextToSpeak();
                        textToSpeak2.getClass();
                        kVar.addLast(new f(strD6, textToSpeak2));
                    }
                } else {
                    i2.a aVar10 = i2.f36769a;
                    a2 a2Var9 = a2.GENERAL;
                    aVar10.getClass();
                    i2.a.f(a2Var9, "AudioPromptRequestHandler", "Speech missing/empty; nothing spoken.");
                }
            } else if (audioPromptsService.hasPhraseNotification()) {
                String strD7 = d(str);
                GDIAudioPromptsProto.PhraseNotification phraseNotification = audioPromptsService.getPhraseNotification();
                phraseNotification.getClass();
                if (phraseNotification.getGravelPhrasesCount() > 0) {
                    List<GDIAudioPromptsProto.GravelPhrase> gravelPhrasesList = phraseNotification.getGravelPhrasesList();
                    gravelPhrasesList.getClass();
                    for (GDIAudioPromptsProto.GravelPhrase gravelPhrase : gravelPhrasesList) {
                        String phraseTemplate = gravelPhrase.getPhraseTemplate();
                        phraseTemplate.getClass();
                        String contextJson = gravelPhrase.getContextJson();
                        contextJson.getClass();
                        kVar.addLast(new f(strD7, gravelEngine.render(phraseTemplate, contextJson)));
                    }
                } else {
                    List<GDIAudioPromptsProto.Phrase> phrasesList = phraseNotification.getPhrasesList();
                    phrasesList.getClass();
                    for (GDIAudioPromptsProto.Phrase phrase : phrasesList) {
                        List<GDIAudioPromptsProto.SlotValue> slotValuesList = phrase.getSlotValuesList();
                        slotValuesList.getClass();
                        ArrayList arrayList = new ArrayList(y.r(slotValuesList, 10));
                        Iterator<T> it = slotValuesList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((GDIAudioPromptsProto.SlotValue) it.next()).getIntValue()));
                        }
                        int[] iArrA1 = h0.a1(arrayList);
                        kVar.addLast(new f(strD7, gravelEngine.render(phrase.getPhraseId(), Arrays.copyOf(iArrA1, iArrA1.length))));
                    }
                }
            }
        }
        c(b());
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.audioprompts.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0471a {
        public /* synthetic */ C0471a(j jVar) {
            this();
        }

        private C0471a() {
        }
    }
}
