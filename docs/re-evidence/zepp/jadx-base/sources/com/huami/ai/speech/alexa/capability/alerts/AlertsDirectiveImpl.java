package com.huami.ai.speech.alexa.capability.alerts;

import com.huami.ai.entity.alert.AlertStatus;
import com.huami.ai.entity.alert.Reminder;
import com.huami.ai.entity.alert.Timer;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.speech.alexa.alarm.AlarmRestApi;
import com.huami.ai.speech.alexa.entity.Alarm;
import com.huami.ai.speech.alexa.entity.payload.SetAlertPayload;
import com.huami.ai.speech.alexa.entity.payload.TokenPayload;
import com.huami.ai.speech.alexa.entity.payload.TokensPayload;
import com.huami.ai.speech.alexa.entity.payload.VolumePayload;
import com.huami.ai.speech.alexa.uitls.AlertUtilKt;
import com.huami.ai.uitls.ISO8601DateFormatterKt;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/alerts/AlertsDirectiveImpl;", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertsDirective;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;", "payload", "", "a", "(Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "c", "setAlert", "Lcom/huami/ai/speech/alexa/entity/payload/TokenPayload;", "deleteAlert", "(Lcom/huami/ai/speech/alexa/entity/payload/TokenPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;", "deleteAlerts", "(Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;", "", "setVolume", "(Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adjustVolume", "Lcom/huami/ai/skill/AlertSkill;", "Lcom/huami/ai/skill/AlertSkill;", "alertSkill", "Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;", "alarmRestApi", "<init>", "(Lcom/huami/ai/skill/AlertSkill;Lcom/huami/ai/speech/alexa/alarm/AlarmRestApi;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlertsDirectiveImpl implements AlertsDirective, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlertSkill alertSkill;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AlarmRestApi alarmRestApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertType.values().length];
            iArr[AlertType.ALARM.ordinal()] = 1;
            iArr[AlertType.REMINDER.ordinal()] = 2;
            iArr[AlertType.TIMER.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未实现 AdjustVolume 指令";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "UNKnown Alert type to delete";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "UNKnown Alert type to delete";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "UNKnown Alert type to set";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未实现 SetVolume 指令";
        }
    }

    public AlertsDirectiveImpl(@NotNull AlertSkill alertSkill, @NotNull AlarmRestApi alarmRestApi) {
        this.alertSkill = alertSkill;
        this.alarmRestApi = alarmRestApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(SetAlertPayload setAlertPayload, Continuation<? super Boolean> continuation) {
        Alarm alarmAlarmDetail = this.alarmRestApi.alarmDetail(AlertUtilKt.shortAlexaAlertToken(setAlertPayload.getToken()));
        return this.alertSkill.setAlarm(new com.huami.ai.entity.alert.Alarm(setAlertPayload.getToken(), setAlertPayload.getScheduledTime(), (alarmAlarmDetail == null || alarmAlarmDetail.getTrigger().getRecurrence() == null) ? 0 : AlertUtilKt.parseAlexaAlarmRepeat(alarmAlarmDetail.getTrigger().getRecurrence().getFreq(), alarmAlarmDetail.getTrigger().getRecurrence().getByDay()), null, 8, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(SetAlertPayload setAlertPayload, Continuation<? super Boolean> continuation) {
        return this.alertSkill.setReminder(new Reminder(setAlertPayload.getToken(), setAlertPayload.getLabel(), setAlertPayload.getScheduledTime(), (short) 0, "", AlertStatus.ON), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(SetAlertPayload setAlertPayload, Continuation<? super Boolean> continuation) {
        Long lBoxLong;
        String token = setAlertPayload.getToken();
        Date dateIso0860ToDate = ISO8601DateFormatterKt.iso0860ToDate(setAlertPayload.getScheduledTime());
        long jLongValue = 0;
        if (dateIso0860ToDate != null && (lBoxLong = Boxing.boxLong(dateIso0860ToDate.getTime())) != null) {
            jLongValue = lBoxLong.longValue();
        }
        return this.alertSkill.setTimer(new Timer(token, jLongValue, null, 4, null), continuation);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsDirective
    @Nullable
    public Object adjustVolume(@NotNull VolumePayload volumePayload, @NotNull Continuation<? super Unit> continuation) {
        HMLog.warn$default("speech", null, a.a, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsDirective
    @Nullable
    public Object deleteAlert(@NotNull TokenPayload tokenPayload, @NotNull Continuation<? super Boolean> continuation) {
        AlertType typeByAlertToken = AlertUtilKt.getTypeByAlertToken(tokenPayload.getToken());
        int i = typeByAlertToken == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeByAlertToken.ordinal()];
        if (i == 1) {
            return this.alertSkill.deleteAlarm(CollectionsKt__CollectionsKt.arrayListOf(tokenPayload.getToken()), continuation);
        }
        if (i == 2) {
            return this.alertSkill.deleteReminder(CollectionsKt__CollectionsKt.arrayListOf(tokenPayload.getToken()), continuation);
        }
        if (i == 3) {
            return this.alertSkill.deleteTimer(CollectionsKt__CollectionsKt.arrayListOf(tokenPayload.getToken()), continuation);
        }
        HMLog.warn$default("speech", null, b.a, 2, null);
        return Boxing.boxBoolean(false);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsDirective
    @Nullable
    public Object deleteAlerts(@NotNull TokensPayload tokensPayload, @NotNull Continuation<? super Boolean> continuation) {
        AlertType typeByAlertToken = AlertUtilKt.getTypeByAlertToken((String) CollectionsKt.first((List) tokensPayload.getToken()));
        int i = typeByAlertToken == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeByAlertToken.ordinal()];
        if (i == 1) {
            return this.alertSkill.deleteAlarm(tokensPayload.getToken(), continuation);
        }
        if (i == 2) {
            return this.alertSkill.deleteReminder(tokensPayload.getToken(), continuation);
        }
        if (i == 3) {
            return this.alertSkill.deleteTimer(tokensPayload.getToken(), continuation);
        }
        HMLog.warn$default("speech", null, c.a, 2, null);
        return Boxing.boxBoolean(false);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsDirective
    @Nullable
    public Object setAlert(@NotNull SetAlertPayload setAlertPayload, @NotNull Continuation<? super Boolean> continuation) {
        String type = setAlertPayload.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != 62358065) {
            if (iHashCode != 79826725) {
                if (iHashCode == 264024178 && type.equals("REMINDER")) {
                    return b(setAlertPayload, continuation);
                }
            } else if (type.equals("TIMER")) {
                return c(setAlertPayload, continuation);
            }
        } else if (type.equals("ALARM")) {
            return a(setAlertPayload, continuation);
        }
        HMLog.warn$default("speech", null, d.a, 2, null);
        return Boxing.boxBoolean(false);
    }

    @Override // com.huami.ai.speech.alexa.capability.alerts.AlertsDirective
    @Nullable
    public Object setVolume(@NotNull VolumePayload volumePayload, @NotNull Continuation<? super Unit> continuation) {
        HMLog.warn$default("speech", null, e.a, 2, null);
        return Unit.INSTANCE;
    }
}
