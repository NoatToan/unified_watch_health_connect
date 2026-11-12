package com.huami.ai.speech.xiaoai.capability.instruction;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.datepicker.UtcDates;
import com.huami.ai.entity.alert.Alarm;
import com.huami.ai.entity.alert.Reminder;
import com.huami.ai.entity.alert.Timer;
import com.huami.ai.skill.AlertSkill;
import com.huami.ai.skill.UnSupportOperation;
import com.huami.ai.speech.api.CronExpressionParse;
import com.huami.ai.uitls.AlertUtilKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Alerts;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020)¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001b\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\b\u0010\"\u001a\u00020\u0004H\u0002J\u0014\u0010%\u001a\u00020\u00042\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#H\u0016R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/AlertsInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/Alerts$SetAlert;", "setAlertPayload", "", "f", "m", "(Lcom/xiaomi/ai/api/Alerts$SetAlert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/ai/api/Alerts$AlertType;", "type", "", "", "ids", "a", "", z.j, "offset", "", "l", "cron", "i", "Lcom/xiaomi/ai/api/Alerts$AlertCircleType;", "", hl.k, "h", "Lcom/xiaomi/ai/api/Alerts$DeliverAlertIntention;", "payload", "c", "b", "(Lcom/xiaomi/ai/api/Alerts$DeliverAlertIntention;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "e", "g", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/AlertSkill;", "Lcom/huami/ai/skill/AlertSkill;", "alertSkill", "Lcom/huami/ai/skill/UnSupportOperation;", "Lcom/huami/ai/skill/UnSupportOperation;", "unSupportOperation", "<init>", "(Lcom/huami/ai/skill/AlertSkill;Lcom/huami/ai/skill/UnSupportOperation;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class AlertsInstruction extends InstructionCapability {
    private static final int c = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlertSkill alertSkill;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final UnSupportOperation unSupportOperation;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Alerts.AlertCircleType.values().length];
            iArr[Alerts.AlertCircleType.UNKNOWN.ordinal()] = 1;
            iArr[Alerts.AlertCircleType.ONCE.ordinal()] = 2;
            iArr[Alerts.AlertCircleType.EVERYDAY.ordinal()] = 3;
            iArr[Alerts.AlertCircleType.WORKDAY.ordinal()] = 4;
            iArr[Alerts.AlertCircleType.MONDAY_TO_FRIDAY.ordinal()] = 5;
            iArr[Alerts.AlertCircleType.WEEKEND.ordinal()] = 6;
            iArr[Alerts.AlertCircleType.WEEKLY.ordinal()] = 7;
            iArr[Alerts.AlertCircleType.MONTHLY.ordinal()] = 8;
            iArr[Alerts.AlertCircleType.YEARLY.ordinal()] = 9;
            iArr[Alerts.AlertCircleType.HOLIDAY.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Alerts.AlertOperation.values().length];
            iArr2[Alerts.AlertOperation.CLOSE.ordinal()] = 1;
            iArr2[Alerts.AlertOperation.QUERY.ordinal()] = 2;
            iArr2[Alerts.AlertOperation.OPEN.ordinal()] = 3;
            iArr2[Alerts.AlertOperation.DELETE.ordinal()] = 4;
            iArr2[Alerts.AlertOperation.PROCEED.ordinal()] = 5;
            iArr2[Alerts.AlertOperation.PAUSE.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<?> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Instruction<?> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toJsonString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<?> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Instruction<?> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("未实现 ", this.a.getFullName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.xiaoai.capability.instruction.AlertsInstruction", f = "AlertsInstruction.kt", i = {}, l = {126}, m = "setTimer", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AlertsInstruction.this.o(null, this);
        }
    }

    public AlertsInstruction(@NotNull AlertSkill alertSkill, @NotNull UnSupportOperation unSupportOperation) {
        this.alertSkill = alertSkill;
        this.unSupportOperation = unSupportOperation;
    }

    private final boolean a(Alerts.AlertType type, List<String> ids) {
        return ((Boolean) d.b(null, new AlertsInstruction$doDeleteAlert$1(type, this, ids, null), 1, null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Alerts.DeliverAlertIntention deliverAlertIntention, Continuation<? super Boolean> continuation) {
        Alerts.AlertOperation operation = deliverAlertIntention.getOperation();
        int i = operation == null ? -1 : WhenMappings.$EnumSwitchMapping$1[operation.ordinal()];
        if (i == 1) {
            return this.alertSkill.closeAlarm(null, continuation);
        }
        if (i == 2) {
            return this.alertSkill.queryAlarm(continuation);
        }
        if (i != 3) {
            return i != 4 ? Boxing.boxBoolean(g()) : this.alertSkill.deleteAlarm(null, continuation);
        }
        return this.alertSkill.openAlarm(continuation);
    }

    private final boolean c(Alerts.DeliverAlertIntention payload) {
        return ((Boolean) d.b(null, new AlertsInstruction$doDeliverOperation$1(payload, this, null), 1, null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Alerts.DeliverAlertIntention deliverAlertIntention, Continuation<? super Boolean> continuation) {
        Alerts.AlertOperation operation = deliverAlertIntention.getOperation();
        int i = operation == null ? -1 : WhenMappings.$EnumSwitchMapping$1[operation.ordinal()];
        if (i == 1) {
            return this.alertSkill.closeReminder(null, continuation);
        }
        if (i == 2) {
            return this.alertSkill.queryReminder(continuation);
        }
        if (i != 3) {
            return i != 4 ? Boxing.boxBoolean(g()) : this.alertSkill.deleteReminder(null, continuation);
        }
        return this.alertSkill.openReminder(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(Alerts.DeliverAlertIntention deliverAlertIntention, Continuation<? super Boolean> continuation) {
        Alerts.AlertOperation operation = deliverAlertIntention.getOperation();
        switch (operation == null ? -1 : WhenMappings.$EnumSwitchMapping$1[operation.ordinal()]) {
            case 1:
                return this.alertSkill.closeTimer(continuation);
            case 2:
                return this.alertSkill.queryTimer(continuation);
            case 3:
            case 5:
            case 6:
                return this.alertSkill.openTimer(continuation);
            case 4:
                return this.alertSkill.deleteTimer(null, continuation);
            default:
                return Boxing.boxBoolean(g());
        }
    }

    private final boolean f(Alerts.SetAlert setAlertPayload) {
        return ((Boolean) d.b(null, new AlertsInstruction$doSetAlert$1(setAlertPayload, this, null), 1, null)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        this.unSupportOperation.doUnSupport();
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final short h(String cron) {
        List<String> listSplit$default;
        int i;
        String dayOfWeek = new CronExpressionParse(cron).getDayOfWeek();
        short s = 0;
        if (dayOfWeek != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) dayOfWeek, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            for (String str : listSplit$default) {
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            i = s | 32;
                            break;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            i = s | 64;
                            break;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            i = s | 128;
                            break;
                        }
                        break;
                    case 52:
                        if (str.equals("4")) {
                            i = s | 256;
                            break;
                        }
                        break;
                    case 53:
                        if (str.equals("5")) {
                            i = s | 512;
                            break;
                        }
                        break;
                    case 54:
                        if (str.equals("6")) {
                            i = s | 1024;
                            break;
                        }
                        break;
                    case 55:
                        if (str.equals("7")) {
                            i = s | 2048;
                            break;
                        }
                        break;
                    default:
                        continue;
                }
                s = (short) i;
            }
        }
        return s;
    }

    private final int i(String cron) {
        List<String> listSplit$default;
        String dayOfWeek = new CronExpressionParse(cron).getDayOfWeek();
        float fPow = 0.0f;
        if (dayOfWeek != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) dayOfWeek, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            for (String str : listSplit$default) {
                fPow += (float) Math.pow(2.0f, (Intrinsics.areEqual(str, "0") ? 7 : Integer.parseInt(str)) - 1);
            }
        }
        return (int) fPow;
    }

    private final int j(Alerts.SetAlert setAlertPayload) {
        Alerts.AlertCircleType alertCircleType = setAlertPayload.getCircle().get();
        switch (alertCircleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alertCircleType.ordinal()]) {
            case 1:
            case 2:
                return 0;
            case 3:
                return 127;
            case 4:
            case 5:
                return 31;
            case 6:
                return 96;
            case 7:
                if (setAlertPayload.getCircleExtra().isPresent()) {
                    return i(setAlertPayload.getCircleExtra().get());
                }
                return -1;
            default:
                return -1;
        }
    }

    private final short k(Alerts.AlertCircleType type, String cron) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
                return (short) 0;
            case 3:
                return HMReminderInfo.FLAG_DAY;
            case 4:
            case 5:
                return AlertUtilKt.getWorkingDay_HMReminderInfo();
            case 6:
                return AlertUtilKt.getWeekend_HMReminderInfo();
            case 7:
                return h(cron);
            case 8:
                return (short) 4096;
            case 9:
                return HMReminderInfo.FLAG_YEAR;
            case 10:
                throw new UnsupportedOperationException(Intrinsics.stringPlus("小爱 reminder circle:HOLIDY,cron:", cron));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final long l(String offset) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("+HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        Date date = simpleDateFormat.parse(offset);
        Long lValueOf = date == null ? null : Long.valueOf(date.getTime());
        if (lValueOf != null) {
            return System.currentTimeMillis() + lValueOf.longValue();
        }
        throw new IllegalArgumentException("Timer offset parse error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Alerts.SetAlert setAlert, Continuation<? super Boolean> continuation) {
        int iJ = j(setAlert);
        if (iJ <= -1) {
            return Boxing.boxBoolean(g());
        }
        return this.alertSkill.setAlarm(new Alarm(setAlert.getId(), setAlert.getDatetime(), iJ, null, 8, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(Alerts.SetAlert setAlert, Continuation<? super Boolean> continuation) {
        String str = setAlert.getEvent().isPresent() ? setAlert.getEvent().get() : "";
        String str2 = setAlert.getCircleExtra().isPresent() ? setAlert.getCircleExtra().get() : "";
        return this.alertSkill.setReminder(new Reminder(setAlert.getId(), str, setAlert.getDatetime(), k(setAlert.getCircle().get(), str2), str2, null, 32, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(Alerts.SetAlert setAlert, Continuation<? super Boolean> continuation) {
        c cVar;
        Object objM3845constructorimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object timer = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(timer);
                Result.Companion companion = Result.Companion;
                Timer timer2 = new Timer(setAlert.getId(), l(setAlert.getOffset().get()), null, 4, null);
                AlertSkill alertSkill = this.alertSkill;
                cVar.c = 1;
                timer = alertSkill.setTimer(timer2, cVar);
                if (timer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(timer);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) timer).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return Boxing.boxBoolean(Result.m3851isSuccessimpl(objM3845constructorimpl));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        HMLog.debug$default(null, new a(instruction), 1, null);
        String fullName = instruction.getFullName();
        if (fullName != null) {
            switch (fullName.hashCode()) {
                case -2108961186:
                    if (fullName.equals(AIApiConstants.Alerts.DeliverAlertIntention)) {
                        Object payload = instruction.getPayload();
                        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.DeliverAlertIntention");
                        c((Alerts.DeliverAlertIntention) payload);
                        return true;
                    }
                    break;
                case -795955311:
                    if (fullName.equals(AIApiConstants.Alerts.SetAlert)) {
                        Object payload2 = instruction.getPayload();
                        Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.SetAlert");
                        f((Alerts.SetAlert) payload2);
                        return true;
                    }
                    break;
                case -249661030:
                    if (fullName.equals(AIApiConstants.Alerts.DeleteAlert)) {
                        Object payload3 = instruction.getPayload();
                        Objects.requireNonNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.DeleteAlert");
                        Alerts.DeleteAlert deleteAlert = (Alerts.DeleteAlert) payload3;
                        a(deleteAlert.getType(), CollectionsKt__CollectionsKt.arrayListOf(deleteAlert.getId()));
                        return true;
                    }
                    break;
                case 850442777:
                    if (fullName.equals(AIApiConstants.Alerts.DeleteAlerts)) {
                        Object payload4 = instruction.getPayload();
                        Objects.requireNonNull(payload4, "null cannot be cast to non-null type com.xiaomi.ai.api.Alerts.DeleteAlerts");
                        List<Alerts.AlertOpItem> alerts = ((Alerts.DeleteAlerts) payload4).getAlerts();
                        Alerts.AlertType type = ((Alerts.AlertOpItem) CollectionsKt.first((List) alerts)).getType();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(alerts, 10));
                        Iterator<T> it2 = alerts.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Alerts.AlertOpItem) it2.next()).getId());
                        }
                        a(type, arrayList);
                        return true;
                    }
                    break;
            }
        }
        HMLog.warn$default("speech", null, new b(instruction), 2, null);
        return false;
    }
}
