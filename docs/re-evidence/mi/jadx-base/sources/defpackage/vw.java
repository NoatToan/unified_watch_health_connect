package defpackage;

import com.huami.bluetooth.profile.channel.module.voice.content.c;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.WearableController;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "Lcom/xiaomi/hm/health/bt/sdk/HuamiDevice;", "device", "Lpw;", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/ai/api/WearableController$Switch;", "switchPayload", "Lcom/xiaomi/ai/api/WearableController$Mode;", "mode", "", DailyRecordKey.sportType, "Lom;", "Lcom/xiaomi/ai/api/WearableController$SetProperty;", "setPropertyPayload", "", "Lcom/xiaomi/ai/api/WearableController$PropertyName;", "names", "", PluginDeviceInfo.FDESC, "Lcom/xiaomi/ai/api/WearableController$Execute;", "executePayload", "Lcom/xiaomi/ai/api/WearableController$DirectiveType;", "directive", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class vw {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37282b;

        static {
            int[] iArr = new int[WearableController.Mode.values().length];
            try {
                iArr[WearableController.Mode.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WearableController.Mode.JUMPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WearableController.Mode.RUNNING_INDOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WearableController.Mode.RUNNING_OUTDOOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WearableController.Mode.WAKING_OUTDOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WearableController.Mode.SWIMMING_INDOOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WearableController.Mode.BIKING_INDOOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WearableController.Mode.BIKING_OUTDOOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WearableController.Mode.ELLIPTICAL_TRAINER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WearableController.Mode.ZUMBA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WearableController.Mode.FREE_SPARRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WearableController.Mode.BADMINTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WearableController.Mode.YOGA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[WearableController.Mode.DANCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[WearableController.Mode.GYMNASTICS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[WearableController.Mode.STEPPER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[WearableController.Mode.INDOOR_FITNESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[WearableController.Mode.INDOOR_SKATING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[WearableController.Mode.BOXING.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[WearableController.Mode.PILATES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[WearableController.Mode.TABLE_TENNIS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[WearableController.Mode.TREADMILL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[WearableController.Mode.VOLLEYBAL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[WearableController.Mode.BASKETBALL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[WearableController.Mode.STRETCHING.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[WearableController.Mode.HIPHOP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[WearableController.Mode.ROWING_MACHINE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[WearableController.Mode.CORE_TRAINING.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[WearableController.Mode.HIIT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[WearableController.Mode.BOWLING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[WearableController.Mode.CRICKET.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[WearableController.Mode.FOOTBALL.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[WearableController.Mode.TENNIS.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[WearableController.Mode.BICYCLE_MOTOCROSS.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[WearableController.Mode.KONGFU.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[WearableController.Mode.THAI_BOXING.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[WearableController.Mode.TAI_CHI.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[WearableController.Mode.TEAKWONDO.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[WearableController.Mode.STEP_TRAINING.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[WearableController.Mode.WRESTLING.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[WearableController.Mode.HANDBALL.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[WearableController.Mode.ARCHERY.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[WearableController.Mode.SOFT_TRAINING.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[WearableController.Mode.JUDO.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[WearableController.Mode.ROCK_CLIMBING.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[WearableController.Mode.CLIMBE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[WearableController.Mode.GATEBALL.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[WearableController.Mode.HORSEMANSHIP.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[WearableController.Mode.ROLLER_SKATING.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[WearableController.Mode.WEIGHT_TRAINING.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[WearableController.Mode.SOFTBALL.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[WearableController.Mode.KARATE.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[WearableController.Mode.SOCIAL_DANCING.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[WearableController.Mode.FENCING.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[WearableController.Mode.MIXED_AEROBIC.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[WearableController.Mode.OUTDOOR_SKATING.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[WearableController.Mode.SQUARE_DANCING.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[WearableController.Mode.YACHTING.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[WearableController.Mode.BELLY_DANCE.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[WearableController.Mode.FISHING.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[WearableController.Mode.HUNT.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[WearableController.Mode.CURLING.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[WearableController.Mode.SQUASH_RACKETS.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[WearableController.Mode.BASEBALL.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[WearableController.Mode.BALLET.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            f37281a = iArr;
            int[] iArr2 = new int[WearableController.DirectiveType.values().length];
            try {
                iArr2[WearableController.DirectiveType.OPEN_WOMEN_HEALTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused66) {
            }
            f37282b = iArr2;
        }
    }

    @Nullable
    public static final pw a(@NotNull Instruction<?> instruction, @NotNull HuamiDevice device) {
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(device, "device");
        String fullName = instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != 1002051676) {
                if (iHashCode != 1125080429) {
                    if (iHashCode == 2095632830 && fullName.equals(AIApiConstants.WearableController.SetProperty)) {
                        Object payload = instruction.getPayload();
                        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.SetProperty");
                        return a((WearableController.SetProperty) payload, device);
                    }
                } else if (fullName.equals(AIApiConstants.WearableController.Switch)) {
                    Object payload2 = instruction.getPayload();
                    Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.Switch");
                    return a((WearableController.Switch) payload2, device);
                }
            } else if (fullName.equals(AIApiConstants.WearableController.Execute)) {
                Object payload3 = instruction.getPayload();
                Intrinsics.checkNotNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.Execute");
                return a((WearableController.Execute) payload3, device);
            }
        }
        return null;
    }

    public static final boolean b(List<? extends WearableController.PropertyName> list) {
        return list.contains(WearableController.PropertyName.SLEEP_TIME) || list.contains(WearableController.PropertyName.SLEEP_SCORE) || list.contains(WearableController.PropertyName.DEEP_SLEEP_TIME) || list.contains(WearableController.PropertyName.SHALLOW_SLEEP_TIME) || list.contains(WearableController.PropertyName.WAKE_TIME) || list.contains(WearableController.PropertyName.FALL_SLEEP_TIME) || list.contains(WearableController.PropertyName.RAPID_EYE_MOVE_TIME);
    }

    public static final pw a(WearableController.Switch r3, HuamiDevice huamiDevice) {
        if (r3.getOperation() != WearableController.OperationType.START) {
            return null;
        }
        WearableController.Mode mode = r3.getMode();
        Intrinsics.checkNotNullExpressionValue(mode, "switchPayload.mode");
        pw pwVarA = a(mode);
        if (pwVarA != null) {
            return pwVarA;
        }
        WearableController.Mode mode2 = r3.getMode();
        String str = "sport_running_indoor";
        switch (mode2 == null ? -1 : a.f37281a[mode2.ordinal()]) {
            case 1:
                str = "sport_free_training";
                break;
            case 2:
                str = "sport_rope_skipping";
                break;
            case 3:
            case 22:
                break;
            case 4:
                str = "sport_running_outdoor";
                break;
            case 5:
                str = "sport_walking";
                break;
            case 6:
                str = "sport_swimming";
                break;
            case 7:
                str = "sport_indoor_cycling";
                break;
            case 8:
                str = "sport_cycling";
                break;
            case 9:
                str = "sport_elliptical_machine";
                break;
            case 10:
                str = "sport_Zumba";
                break;
            case 11:
                str = "sport_Free_Fighting";
                break;
            case 12:
                str = "sport_badminton";
                break;
            case 13:
                str = "sport_yoga";
                break;
            case 14:
                str = "sport_dance";
                break;
            case 15:
                str = "sport_gymnastics";
                break;
            case 16:
                str = "sport_treadmill";
                break;
            case 17:
                str = "sport_indoor_fitness";
                break;
            case 18:
                str = "sport_Indoor_skating";
                break;
            case 19:
                str = "sport_Boxing";
                break;
            case 20:
                str = "sport_pilates";
                break;
            case 21:
                str = "sport_table_tennis";
                break;
            case 23:
                str = "sport_volleyball";
                break;
            case 24:
                str = "sport_basketball";
                break;
            case 25:
                str = "sport_stretching";
                break;
            case 26:
                str = "sport_street_dance";
                break;
            case 27:
                str = "sport_rowing_machine";
                break;
            case 28:
                str = "sport_core_training";
                break;
            case 29:
                str = "sport_HIIT";
                break;
            case 30:
                str = "sport_Bowling";
                break;
            case 31:
                str = "sport_cricket";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return null;
        }
        return kdt.e(str, huamiDevice);
    }

    public static final boolean b(WearableController.DirectiveType directiveType) {
        return ArraysKt___ArraysKt.contains(new WearableController.DirectiveType[]{WearableController.DirectiveType.OPEN_EXERCISE_RECORD, WearableController.DirectiveType.OPEN_SPORT_MODE}, directiveType);
    }

    public static final pw a(WearableController.Mode mode) {
        Integer numValueOf;
        switch (a.f37281a[mode.ordinal()]) {
            case 32:
                numValueOf = Integer.valueOf(SportReportBaseParser.ReportType.minWaterTemperature);
                break;
            case 33:
                numValueOf = 17;
                break;
            case 34:
                numValueOf = 48;
                break;
            case 35:
                numValueOf = 103;
                break;
            case 36:
                numValueOf = 101;
                break;
            case 37:
                numValueOf = 100;
                break;
            case 38:
                numValueOf = 102;
                break;
            case 39:
                numValueOf = 57;
                break;
            case 40:
                numValueOf = 99;
                break;
            case 41:
                numValueOf = 91;
                break;
            case 42:
                numValueOf = 93;
                break;
            case 43:
                numValueOf = 55;
                break;
            case 44:
                numValueOf = 98;
                break;
            case 45:
                numValueOf = 70;
                break;
            case 46:
                numValueOf = 54;
                break;
            case 47:
                numValueOf = 87;
                break;
            case 48:
                numValueOf = 94;
                break;
            case 49:
                numValueOf = 69;
                break;
            case 50:
                numValueOf = 52;
                break;
            case 51:
                numValueOf = 86;
                break;
            case 52:
                numValueOf = 96;
                break;
            case 53:
                numValueOf = 75;
                break;
            case 54:
                numValueOf = 95;
                break;
            case 55:
                numValueOf = 51;
                break;
            case 56:
                numValueOf = 44;
                break;
            case 57:
                numValueOf = 73;
                break;
            case 58:
                numValueOf = 65;
                break;
            case 59:
                numValueOf = 72;
                break;
            case 60:
                numValueOf = 64;
                break;
            case 61:
                numValueOf = 63;
                break;
            case 62:
                numValueOf = 41;
                break;
            case 63:
                numValueOf = 81;
                break;
            case 64:
                numValueOf = 79;
                break;
            case 65:
                numValueOf = 71;
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf != null) {
            return a(numValueOf.intValue());
        }
        return null;
    }

    public static final om a(int i) {
        return new om(new c(4, new c.h(i)));
    }

    public static final pw a(WearableController.SetProperty setProperty, HuamiDevice huamiDevice) {
        String str;
        pw pwVarA = a(setProperty);
        if (pwVarA != null) {
            return pwVarA;
        }
        List<WearableController.PropertyEntity> properties = setProperty.getProperties();
        Intrinsics.checkNotNullExpressionValue(properties, "setPropertyPayload.properties");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(properties, 10));
        Iterator<T> it = properties.iterator();
        while (it.hasNext()) {
            arrayList.add(((WearableController.PropertyEntity) it.next()).getName());
        }
        if (a(arrayList)) {
            str = "base_device_activity_status";
        } else if (arrayList.contains(WearableController.PropertyName.HEART_RATE)) {
            str = "base_device_heart_rate";
        } else if (arrayList.contains(WearableController.PropertyName.BLOOD_OXYGEN_SATURATION)) {
            str = "base_device_spo2";
        } else if (b(arrayList)) {
            str = "base_device_sleep";
        } else if (arrayList.contains(WearableController.PropertyName.PRESSURE)) {
            str = "base_device_pressure";
        } else if (arrayList.contains(WearableController.PropertyName.EXERCISE_RECORD)) {
            str = "base_device_activities";
        } else if (arrayList.contains(WearableController.PropertyName.TRAINING_EXERCISE)) {
            str = "base_device_breathing";
        } else {
            str = arrayList.contains(WearableController.PropertyName.SPORT_MODE) ? "base_device_sport" : null;
        }
        if (str == null) {
            return null;
        }
        return kdt.e(str, huamiDevice);
    }

    public static final pw a(WearableController.SetProperty setProperty) {
        List<WearableController.PropertyEntity> properties = setProperty.getProperties();
        Intrinsics.checkNotNullExpressionValue(properties, "setPropertyPayload.properties");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(properties, 10));
        Iterator<T> it = properties.iterator();
        while (it.hasNext()) {
            arrayList.add(((WearableController.PropertyEntity) it.next()).getName());
        }
        Integer num = arrayList.contains(WearableController.PropertyName.WOMEN_HEALTH) ? 42 : null;
        if (num != null) {
            return new om(new c(num.intValue(), null, 2, null));
        }
        return null;
    }

    public static final boolean a(List<? extends WearableController.PropertyName> list) {
        return list.contains(WearableController.PropertyName.STEPS) || list.contains(WearableController.PropertyName.CALORIES_BURNED) || list.contains(WearableController.PropertyName.STANDING_FREQUENCY) || list.contains(WearableController.PropertyName.ENERGY) || list.contains(WearableController.PropertyName.JUMPING_FREQUENCY) || list.contains(WearableController.PropertyName.ACTIVITY_GOAL) || list.contains(WearableController.PropertyName.ACTIVITY_RECORD);
    }

    public static final pw a(WearableController.Execute execute, HuamiDevice huamiDevice) {
        String str;
        pw pwVarA = a(execute);
        if (pwVarA != null) {
            return pwVarA;
        }
        WearableController.DirectiveType directive = execute.getDirective();
        if (directive == WearableController.DirectiveType.MEASURE_HEART_RATE) {
            str = "base_device_heart_rate";
        } else if (directive == WearableController.DirectiveType.OPEN_PRESSURE) {
            str = "base_device_pressure";
        } else {
            Intrinsics.checkNotNullExpressionValue(directive, "directive");
            if (a(directive)) {
                str = "base_device_activity_status";
            } else if (directive == WearableController.DirectiveType.OPEN_SLEEP) {
                str = "base_device_sleep";
            } else if (directive == WearableController.DirectiveType.OPEN_BLOOD_OXYGEN_SATURATION) {
                str = "base_device_spo2";
            } else if (directive == WearableController.DirectiveType.OPEN_TRAINING_EXERCISE) {
                str = "base_device_breathing";
            } else if (b(directive)) {
                str = "base_device_activities";
            } else {
                str = directive == WearableController.DirectiveType.OPEN_MAXIMAL_OXYGEN_UPTAKE ? "base_movement_status" : null;
            }
        }
        if (str == null) {
            return null;
        }
        return kdt.e(str, huamiDevice);
    }

    public static final pw a(WearableController.Execute execute) {
        WearableController.DirectiveType directive = execute.getDirective();
        Integer num = (directive != null && a.f37282b[directive.ordinal()] == 1) ? 42 : null;
        if (num != null) {
            return new om(new c(num.intValue(), null, 2, null));
        }
        return null;
    }

    public static final boolean a(WearableController.DirectiveType directiveType) {
        return ArraysKt___ArraysKt.contains(new WearableController.DirectiveType[]{WearableController.DirectiveType.OPEN_ENERGY, WearableController.DirectiveType.OPEN_STAND_FREQUENCY, WearableController.DirectiveType.OPEN_STEP, WearableController.DirectiveType.OPEN_CALORIES, WearableController.DirectiveType.OPEN_ACTIVITY_GOAL, WearableController.DirectiveType.OPEN_ACTIVITY_RECORD}, directiveType);
    }
}
