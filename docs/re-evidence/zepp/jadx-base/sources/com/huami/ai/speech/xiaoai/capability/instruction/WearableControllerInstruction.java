package com.huami.ai.speech.xiaoai.capability.instruction;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.CustomSkill;
import com.huami.ai.skill.UnSupportOperation;
import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomSkillIntentKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.WearableController;
import com.xiaomi.ai.api.common.Instruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B\u001f\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0016\u0010\u0015\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0016\u0010#\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010!H\u0016R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+¨\u00060"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/WearableControllerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/WearableController$Switch;", "switchPayload", "", "c", "Lcom/xiaomi/ai/api/WearableController$Mode;", "mode", "f", "", "sportType", "Lcom/huami/bluetooth/profile/channel/module/voice/command/NLPCommand;", "e", "Lcom/xiaomi/ai/api/WearableController$SetProperty;", "setPropertyPayload", "b", "l", "", "Lcom/xiaomi/ai/api/WearableController$PropertyName;", "names", "i", z.j, "Lcom/xiaomi/ai/api/WearableController$Execute;", "executePayload", "a", GoogleApiAvailabilityLight.a, "appType", "", hl.k, "Lcom/xiaomi/ai/api/WearableController$DirectiveType;", "directive", "g", "h", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/skill/CustomSkill;", "Lcom/huami/ai/skill/CustomSkill;", "customSkill", "Lcom/huami/ai/skill/UnSupportOperation;", "Lcom/huami/ai/skill/UnSupportOperation;", "unSupportOperation", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/skill/CustomSkill;Lcom/huami/ai/skill/UnSupportOperation;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class WearableControllerInstruction extends InstructionCapability {
    private static final int A = 51;
    private static final int B = 44;
    private static final int C = 73;
    private static final int D = 65;
    private static final int E = 72;
    private static final int F = 64;
    private static final int G = 63;
    private static final int H = 41;
    private static final int I = 81;
    private static final int J = 79;
    private static final int K = 71;
    private static final int L = 42;
    private static final int d = 191;
    private static final int e = 17;
    private static final int f = 48;
    private static final int g = 103;
    private static final int h = 101;
    private static final int i = 100;
    private static final int j = 102;
    private static final int k = 57;
    private static final int l = 99;
    private static final int m = 91;
    private static final int n = 93;
    private static final int o = 55;
    private static final int p = 98;
    private static final int q = 70;
    private static final int r = 54;
    private static final int s = 87;
    private static final int t = 94;
    private static final int u = 69;
    private static final int v = 52;
    private static final int w = 86;
    private static final int x = 96;
    private static final int y = 75;
    private static final int z = 95;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CustomSkill customSkill;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final UnSupportOperation unSupportOperation;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WearableController.Mode.values().length];
            iArr[WearableController.Mode.ACTIVITY.ordinal()] = 1;
            iArr[WearableController.Mode.JUMPING.ordinal()] = 2;
            iArr[WearableController.Mode.RUNNING_INDOOR.ordinal()] = 3;
            iArr[WearableController.Mode.RUNNING_OUTDOOR.ordinal()] = 4;
            iArr[WearableController.Mode.WAKING_OUTDOOR.ordinal()] = 5;
            iArr[WearableController.Mode.SWIMMING_INDOOR.ordinal()] = 6;
            iArr[WearableController.Mode.BIKING_INDOOR.ordinal()] = 7;
            iArr[WearableController.Mode.BIKING_OUTDOOR.ordinal()] = 8;
            iArr[WearableController.Mode.ELLIPTICAL_TRAINER.ordinal()] = 9;
            iArr[WearableController.Mode.ZUMBA.ordinal()] = 10;
            iArr[WearableController.Mode.FREE_SPARRING.ordinal()] = 11;
            iArr[WearableController.Mode.BADMINTON.ordinal()] = 12;
            iArr[WearableController.Mode.YOGA.ordinal()] = 13;
            iArr[WearableController.Mode.DANCE.ordinal()] = 14;
            iArr[WearableController.Mode.GYMNASTICS.ordinal()] = 15;
            iArr[WearableController.Mode.STEPPER.ordinal()] = 16;
            iArr[WearableController.Mode.INDOOR_FITNESS.ordinal()] = 17;
            iArr[WearableController.Mode.INDOOR_SKATING.ordinal()] = 18;
            iArr[WearableController.Mode.BOXING.ordinal()] = 19;
            iArr[WearableController.Mode.PILATES.ordinal()] = 20;
            iArr[WearableController.Mode.TABLE_TENNIS.ordinal()] = 21;
            iArr[WearableController.Mode.TREADMILL.ordinal()] = 22;
            iArr[WearableController.Mode.VOLLEYBAL.ordinal()] = 23;
            iArr[WearableController.Mode.BASKETBALL.ordinal()] = 24;
            iArr[WearableController.Mode.STRETCHING.ordinal()] = 25;
            iArr[WearableController.Mode.HIPHOP.ordinal()] = 26;
            iArr[WearableController.Mode.ROWING_MACHINE.ordinal()] = 27;
            iArr[WearableController.Mode.CORE_TRAINING.ordinal()] = 28;
            iArr[WearableController.Mode.HIIT.ordinal()] = 29;
            iArr[WearableController.Mode.BOWLING.ordinal()] = 30;
            iArr[WearableController.Mode.CRICKET.ordinal()] = 31;
            iArr[WearableController.Mode.FOOTBALL.ordinal()] = 32;
            iArr[WearableController.Mode.TENNIS.ordinal()] = 33;
            iArr[WearableController.Mode.BICYCLE_MOTOCROSS.ordinal()] = 34;
            iArr[WearableController.Mode.KONGFU.ordinal()] = 35;
            iArr[WearableController.Mode.THAI_BOXING.ordinal()] = 36;
            iArr[WearableController.Mode.TAI_CHI.ordinal()] = 37;
            iArr[WearableController.Mode.TEAKWONDO.ordinal()] = 38;
            iArr[WearableController.Mode.STEP_TRAINING.ordinal()] = 39;
            iArr[WearableController.Mode.WRESTLING.ordinal()] = 40;
            iArr[WearableController.Mode.HANDBALL.ordinal()] = 41;
            iArr[WearableController.Mode.ARCHERY.ordinal()] = 42;
            iArr[WearableController.Mode.SOFT_TRAINING.ordinal()] = 43;
            iArr[WearableController.Mode.JUDO.ordinal()] = 44;
            iArr[WearableController.Mode.ROCK_CLIMBING.ordinal()] = 45;
            iArr[WearableController.Mode.CLIMBE.ordinal()] = 46;
            iArr[WearableController.Mode.GATEBALL.ordinal()] = 47;
            iArr[WearableController.Mode.HORSEMANSHIP.ordinal()] = 48;
            iArr[WearableController.Mode.ROLLER_SKATING.ordinal()] = 49;
            iArr[WearableController.Mode.WEIGHT_TRAINING.ordinal()] = 50;
            iArr[WearableController.Mode.SOFTBALL.ordinal()] = 51;
            iArr[WearableController.Mode.KARATE.ordinal()] = 52;
            iArr[WearableController.Mode.SOCIAL_DANCING.ordinal()] = 53;
            iArr[WearableController.Mode.FENCING.ordinal()] = 54;
            iArr[WearableController.Mode.MIXED_AEROBIC.ordinal()] = 55;
            iArr[WearableController.Mode.OUTDOOR_SKATING.ordinal()] = 56;
            iArr[WearableController.Mode.SQUARE_DANCING.ordinal()] = 57;
            iArr[WearableController.Mode.YACHTING.ordinal()] = 58;
            iArr[WearableController.Mode.BELLY_DANCE.ordinal()] = 59;
            iArr[WearableController.Mode.FISHING.ordinal()] = 60;
            iArr[WearableController.Mode.HUNT.ordinal()] = 61;
            iArr[WearableController.Mode.CURLING.ordinal()] = 62;
            iArr[WearableController.Mode.SQUASH_RACKETS.ordinal()] = 63;
            iArr[WearableController.Mode.BASEBALL.ordinal()] = 64;
            iArr[WearableController.Mode.BALLET.ordinal()] = 65;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WearableController.DirectiveType.values().length];
            iArr2[WearableController.DirectiveType.OPEN_WOMEN_HEALTH.ordinal()] = 1;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WearableController.Execute a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WearableController.Execute execute) {
            super(0);
            this.a = execute;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送健康Domain技能（", this.a.getDirective().name());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WearableController.Mode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WearableController.Mode mode) {
            super(0);
            this.a = mode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送运动Domain技能（", this.a.name());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送健康Domain技能：", this.a.element);
        }
    }

    public WearableControllerInstruction(@NotNull SpeechDevice speechDevice, @NotNull CustomSkill customSkill, @NotNull UnSupportOperation unSupportOperation) {
        this.baseDevice = speechDevice;
        this.customSkill = customSkill;
        this.unSupportOperation = unSupportOperation;
    }

    private final boolean a(WearableController.Execute executePayload) {
        String str;
        if (d(executePayload)) {
            return true;
        }
        WearableController.DirectiveType directive = executePayload.getDirective();
        if (directive == WearableController.DirectiveType.MEASURE_HEART_RATE) {
            str = CustomSkillIntentKt.INTENT_HEART_RATE;
        } else if (directive == WearableController.DirectiveType.OPEN_PRESSURE) {
            str = CustomSkillIntentKt.INTENT_OPEN_PRESSURE;
        } else if (g(directive)) {
            str = CustomSkillIntentKt.INTENT_ACTIVITY_STATUS;
        } else if (directive == WearableController.DirectiveType.OPEN_SLEEP) {
            str = CustomSkillIntentKt.INTENT_OPEN__SLEEP;
        } else if (directive == WearableController.DirectiveType.OPEN_BLOOD_OXYGEN_SATURATION) {
            str = CustomSkillIntentKt.INTENT_OPEN_SPO2;
        } else if (directive == WearableController.DirectiveType.OPEN_TRAINING_EXERCISE) {
            str = CustomSkillIntentKt.INTENT_OPEN_BREATHING;
        } else if (h(directive)) {
            str = CustomSkillIntentKt.INTENT_DEVICE_SPORT_RECORD;
        } else {
            str = directive == WearableController.DirectiveType.OPEN_MAXIMAL_OXYGEN_UPTAKE ? CustomSkillIntentKt.INTENT_OPEN_BASE_MOVEMENT_STATUS : null;
        }
        if (str == null || str.length() == 0) {
            this.unSupportOperation.doUnSupport();
            return true;
        }
        this.customSkill.exeCustomSkill(str, executePayload);
        return true;
    }

    private final boolean b(WearableController.SetProperty setPropertyPayload) {
        String str;
        if (l(setPropertyPayload)) {
            return true;
        }
        List<WearableController.PropertyEntity> properties = setPropertyPayload.getProperties();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(properties, 10));
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            arrayList.add(((WearableController.PropertyEntity) it2.next()).getName());
        }
        if (i(arrayList)) {
            str = CustomSkillIntentKt.INTENT_ACTIVITY_STATUS;
        } else if (arrayList.contains(WearableController.PropertyName.HEART_RATE)) {
            str = CustomSkillIntentKt.INTENT_HEART_RATE;
        } else if (arrayList.contains(WearableController.PropertyName.BLOOD_OXYGEN_SATURATION)) {
            str = CustomSkillIntentKt.INTENT_OPEN_SPO2;
        } else if (j(arrayList)) {
            str = CustomSkillIntentKt.INTENT_OPEN__SLEEP;
        } else if (arrayList.contains(WearableController.PropertyName.PRESSURE)) {
            str = CustomSkillIntentKt.INTENT_OPEN_PRESSURE;
        } else if (arrayList.contains(WearableController.PropertyName.EXERCISE_RECORD)) {
            str = CustomSkillIntentKt.INTENT_DEVICE_SPORT_RECORD;
        } else if (arrayList.contains(WearableController.PropertyName.TRAINING_EXERCISE)) {
            str = CustomSkillIntentKt.INTENT_OPEN_BREATHING;
        } else {
            str = arrayList.contains(WearableController.PropertyName.SPORT_MODE) ? CustomSkillIntentKt.INTENT_DEVICE_SPORT : null;
        }
        if (str == null || str.length() == 0) {
            this.unSupportOperation.doUnSupport();
            return true;
        }
        this.customSkill.exeCustomSkill(str, setPropertyPayload);
        return true;
    }

    private final boolean c(WearableController.Switch switchPayload) {
        if (switchPayload.getOperation() != WearableController.OperationType.START) {
            this.unSupportOperation.doUnSupport();
            return true;
        }
        if (f(switchPayload.getMode())) {
            return true;
        }
        WearableController.Mode mode = switchPayload.getMode();
        int i2 = mode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        String str = CustomSkillIntentKt.INTENT_RUN_IN_DOOR;
        switch (i2) {
            case 1:
                str = CustomSkillIntentKt.INTENT_FREE_TRAINING;
                break;
            case 2:
                str = CustomSkillIntentKt.INTENT_OPEN_ROPE_SKIP;
                break;
            case 3:
            case 22:
                break;
            case 4:
                str = CustomSkillIntentKt.INTENT_RUN_OUT_DOOR;
                break;
            case 5:
                str = CustomSkillIntentKt.INTENT_WALKING;
                break;
            case 6:
                str = CustomSkillIntentKt.INTENT_POLL_SWIM;
                break;
            case 7:
                str = CustomSkillIntentKt.INTENT_INDOOR_CYCLING;
                break;
            case 8:
                str = CustomSkillIntentKt.INTENT_CYCLING;
                break;
            case 9:
                str = CustomSkillIntentKt.INTENT_OPEN_ELLIPTICAL;
                break;
            case 10:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_ZUMBA;
                break;
            case 11:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_FREE_FIGHTING;
                break;
            case 12:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_BADMINTON;
                break;
            case 13:
                str = CustomSkillIntentKt.INTENT_OPEN_YOGA;
                break;
            case 14:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_DANCE;
                break;
            case 15:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_GYMNASTICS;
                break;
            case 16:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_TREADMILL;
                break;
            case 17:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_INDOOR_FITNESS;
                break;
            case 18:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_INDOOR_SKATING;
                break;
            case 19:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_BOXING;
                break;
            case 20:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_PILATES;
                break;
            case 21:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_TABLE_TENNIS;
                break;
            case 23:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_VOLLEYBALL;
                break;
            case 24:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_BASKETBALL;
                break;
            case 25:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_STRETCHING;
                break;
            case 26:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_STREET_DANCE;
                break;
            case 27:
                str = CustomSkillIntentKt.INTENT_OPEN_ROWING;
                break;
            case 28:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_CORE_TRAINING;
                break;
            case 29:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_HIIT;
                break;
            case 30:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_BOWLING;
                break;
            case 31:
                str = CustomSkillIntentKt.INTENT_OPEN_SPORT_CRICKET;
                break;
            default:
                str = null;
                break;
        }
        if (str == null || str.length() == 0) {
            this.unSupportOperation.doUnSupport();
            return true;
        }
        this.customSkill.exeCustomSkill(str, switchPayload);
        return true;
    }

    private final boolean d(WearableController.Execute executePayload) {
        WearableController.DirectiveType directive = executePayload.getDirective();
        Integer num = (directive == null ? -1 : WhenMappings.$EnumSwitchMapping$1[directive.ordinal()]) == 1 ? 42 : null;
        if (num == null) {
            return false;
        }
        k(num.intValue());
        Unit unit = Unit.INSTANCE;
        HMLog.info("speech", new a(executePayload));
        return true;
    }

    private final NLPCommand e(int sportType) {
        return new NLPCommand(new OpenAppContent(4, new OpenAppContent.SportParameter(sportType)));
    }

    private final boolean f(WearableController.Mode mode) {
        Integer num;
        switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case 32:
                num = 191;
                break;
            case 33:
                num = 17;
                break;
            case 34:
                num = 48;
                break;
            case 35:
                num = 103;
                break;
            case 36:
                num = 101;
                break;
            case 37:
                num = 100;
                break;
            case 38:
                num = 102;
                break;
            case 39:
                num = 57;
                break;
            case 40:
                num = 99;
                break;
            case 41:
                num = 91;
                break;
            case 42:
                num = 93;
                break;
            case 43:
                num = 55;
                break;
            case 44:
                num = 98;
                break;
            case 45:
                num = 70;
                break;
            case 46:
                num = 54;
                break;
            case 47:
                num = 87;
                break;
            case 48:
                num = 94;
                break;
            case 49:
                num = 69;
                break;
            case 50:
                num = 52;
                break;
            case 51:
                num = 86;
                break;
            case 52:
                num = 96;
                break;
            case 53:
                num = 75;
                break;
            case 54:
                num = 95;
                break;
            case 55:
                num = 51;
                break;
            case 56:
                num = 44;
                break;
            case 57:
                num = 73;
                break;
            case 58:
                num = 65;
                break;
            case 59:
                num = 72;
                break;
            case 60:
                num = 64;
                break;
            case 61:
                num = 63;
                break;
            case 62:
                num = 41;
                break;
            case 63:
                num = 81;
                break;
            case 64:
                num = 79;
                break;
            case 65:
                num = 71;
                break;
            default:
                num = null;
                break;
        }
        if (num == null) {
            return false;
        }
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, e(num.intValue()), null, 2, null);
        HMLog.info("speech", new b(mode));
        return true;
    }

    private final boolean g(WearableController.DirectiveType directive) {
        return ArraysKt___ArraysKt.contains(new WearableController.DirectiveType[]{WearableController.DirectiveType.OPEN_ENERGY, WearableController.DirectiveType.OPEN_STAND_FREQUENCY, WearableController.DirectiveType.OPEN_STEP, WearableController.DirectiveType.OPEN_CALORIES, WearableController.DirectiveType.OPEN_ACTIVITY_GOAL, WearableController.DirectiveType.OPEN_ACTIVITY_RECORD}, directive);
    }

    private final boolean h(WearableController.DirectiveType directive) {
        return ArraysKt___ArraysKt.contains(new WearableController.DirectiveType[]{WearableController.DirectiveType.OPEN_EXERCISE_RECORD, WearableController.DirectiveType.OPEN_SPORT_MODE}, directive);
    }

    private final boolean i(List<? extends WearableController.PropertyName> names) {
        return names.contains(WearableController.PropertyName.STEPS) || names.contains(WearableController.PropertyName.CALORIES_BURNED) || names.contains(WearableController.PropertyName.STANDING_FREQUENCY) || names.contains(WearableController.PropertyName.ENERGY) || names.contains(WearableController.PropertyName.JUMPING_FREQUENCY) || names.contains(WearableController.PropertyName.ACTIVITY_GOAL) || names.contains(WearableController.PropertyName.ACTIVITY_RECORD);
    }

    private final boolean j(List<? extends WearableController.PropertyName> names) {
        return names.contains(WearableController.PropertyName.SLEEP_TIME) || names.contains(WearableController.PropertyName.SLEEP_SCORE) || names.contains(WearableController.PropertyName.DEEP_SLEEP_TIME) || names.contains(WearableController.PropertyName.SHALLOW_SLEEP_TIME) || names.contains(WearableController.PropertyName.WAKE_TIME) || names.contains(WearableController.PropertyName.FALL_SLEEP_TIME) || names.contains(WearableController.PropertyName.RAPID_EYE_MOVE_TIME);
    }

    private final void k(int appType) {
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(appType, null, 2, null)), null, 2, null);
    }

    private final boolean l(WearableController.SetProperty setPropertyPayload) {
        Integer num;
        List<WearableController.PropertyEntity> properties = setPropertyPayload.getProperties();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(properties, 10));
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            arrayList.add(((WearableController.PropertyEntity) it2.next()).getName());
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (arrayList.contains(WearableController.PropertyName.WOMEN_HEALTH)) {
            objectRef.element = "WOMEN_HEALTH";
            num = 42;
        } else {
            num = null;
        }
        if (num == null) {
            return false;
        }
        k(num.intValue());
        Unit unit = Unit.INSTANCE;
        HMLog.info("speech", new c(objectRef));
        return true;
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@Nullable Instruction<?> instruction) {
        String fullName = instruction == null ? null : instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != 1002051676) {
                if (iHashCode != 1125080429) {
                    if (iHashCode == 2095632830 && fullName.equals(AIApiConstants.WearableController.SetProperty)) {
                        Object payload = instruction.getPayload();
                        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.SetProperty");
                        return b((WearableController.SetProperty) payload);
                    }
                } else if (fullName.equals(AIApiConstants.WearableController.Switch)) {
                    Object payload2 = instruction.getPayload();
                    Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.Switch");
                    return c((WearableController.Switch) payload2);
                }
            } else if (fullName.equals(AIApiConstants.WearableController.Execute)) {
                Object payload3 = instruction.getPayload();
                Objects.requireNonNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.Execute");
                return a((WearableController.Execute) payload3);
            }
        }
        this.unSupportOperation.doUnSupport();
        return true;
    }
}
