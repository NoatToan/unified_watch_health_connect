package com.huami.ai.speech.xiaoai.capability.skill;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.BatterySkill;
import com.huami.ai.skill.CustomSkill;
import com.huami.ai.skill.SetBrightnessSkill;
import com.huami.ai.speech.xiaoai.capability.instruction.custom.CustomSkillIntentKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.command.TTSTextCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.tools.log.HMLog;
import com.xiaomi.ai.api.CustomDirective;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/NewCustomSkillImpl;", "Lcom/huami/ai/skill/CustomSkill;", "", "intent", "", "h", "Lcom/huami/bluetooth/profile/channel/module/voice/command/NLPCommand;", "f", "e", "g", "Lcom/xiaomi/ai/api/common/InstructionPayload;", "payload", "c", "", "sportType", "b", "a", GoogleApiAvailabilityLight.a, "exeCustomSkill", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/skill/SetBrightnessSkill;", "Lcom/huami/ai/skill/SetBrightnessSkill;", "setBrightnessSkill", "Lcom/huami/ai/skill/BatterySkill;", "Lcom/huami/ai/skill/BatterySkill;", "batterySkill", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/skill/SetBrightnessSkill;Lcom/huami/ai/skill/BatterySkill;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NewCustomSkillImpl implements CustomSkill {
    private static final int A = 45;
    private static final int A0 = 171;
    private static final int B = 40;
    private static final int B0 = 172;
    private static final int C = 66;
    private static final int C0 = 173;
    private static final int D = 67;
    private static final int D0 = 174;
    private static final int E = 109;
    private static final int E0 = 175;
    private static final int F = 111;
    private static final int F0 = 176;
    private static final int G = 112;
    private static final int G0 = 177;
    private static final int H = 113;
    private static final int I = 114;
    private static final int J = 115;
    private static final int K = 116;
    private static final int L = 117;
    private static final int M = 118;
    private static final int N = 119;
    private static final int O = 120;
    private static final int P = 122;
    private static final int Q = 129;
    private static final int R = 130;
    private static final int S = 131;
    private static final int T = 189;
    private static final int U = 138;
    private static final int V = 139;
    private static final int W = 140;
    private static final int X = 141;
    private static final int Y = 143;
    private static final int Z = 144;
    private static final int a0 = 145;
    private static final int b0 = 146;
    private static final int c0 = 147;
    private static final int d = 38;
    private static final int d0 = 148;
    private static final int e = 39;
    private static final int e0 = 149;
    private static final int f = 40;
    private static final int f0 = 150;
    private static final int g = 41;
    private static final int g0 = 151;
    private static final int h = 43;
    private static final int h0 = 152;
    private static final int i = 24;
    private static final int i0 = 153;
    private static final int j = 85;
    private static final int j0 = 154;
    private static final int k = 88;
    private static final int k0 = 155;
    private static final int l = 89;
    private static final int l0 = 156;
    private static final int m = 76;
    private static final int m0 = 157;
    private static final int n = 74;
    private static final int n0 = 158;
    private static final int o = 92;
    private static final int o0 = 159;
    private static final int p = 59;
    private static final int p0 = 160;
    private static final int q = 49;
    private static final int q0 = 161;
    private static final int r = 50;
    private static final int r0 = 162;
    private static final int s = 53;
    private static final int s0 = 163;
    private static final int t = 58;
    private static final int t0 = 164;
    private static final int u = 61;
    private static final int u0 = 165;
    private static final int v = 78;
    private static final int v0 = 166;
    private static final int w = 80;
    private static final int w0 = 167;
    private static final int x = 97;
    private static final int x0 = 168;
    private static final int y = 104;
    private static final int y0 = 169;
    private static final int z = 77;
    private static final int z0 = 170;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SetBrightnessSkill setBrightnessSkill;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final BatterySkill batterySkill;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("未处理的自定义技能:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送了设备技能：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送了设备技能：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送了设备技能：", this.a);
        }
    }

    public NewCustomSkillImpl(@NotNull SpeechDevice speechDevice, @NotNull SetBrightnessSkill setBrightnessSkill, @NotNull BatterySkill batterySkill) {
        this.baseDevice = speechDevice;
        this.setBrightnessSkill = setBrightnessSkill;
        this.batterySkill = batterySkill;
    }

    private final NLPCommand a() {
        return new NLPCommand(new OpenAppContent(7, new OpenAppContent.DNDParameter(3)));
    }

    private final NLPCommand b(int sportType) {
        return new NLPCommand(new OpenAppContent(4, new OpenAppContent.SportParameter(sportType)));
    }

    private final boolean c(String intent, InstructionPayload payload) {
        int iHashCode = intent.hashCode();
        if (iHashCode != -1501990932) {
            if (iHashCode != -974955688) {
                if (iHashCode == 738429010 && intent.equals(CustomSkillIntentKt.INTENT_BATTERY)) {
                    this.batterySkill.queryBatteryInfo(this.baseDevice.batteryInfo());
                    return true;
                }
            } else if (intent.equals(CustomSkillIntentKt.INTENT_STOP_FIND_DEVICE)) {
                return d(payload);
            }
        } else if (intent.equals(CustomSkillIntentKt.INTENT_OPEN_BRIGHTNESS)) {
            this.setBrightnessSkill.openBrightnessPage();
            return true;
        }
        return false;
    }

    private final boolean d(InstructionPayload payload) {
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new TTSTextCommand(((CustomDirective.ExecuteDeviceSkill) payload).getDirective().get("reply").get("text").asText()), null, 2, null);
        return true;
    }

    private final boolean e(String intent) {
        NLPCommand nLPCommand;
        switch (intent) {
            case "base_movement_status":
                nLPCommand = new NLPCommand(new OpenAppContent(43, null, 2, null));
                break;
            case "base_device_ecg":
                nLPCommand = new NLPCommand(new OpenAppContent(22, null, 2, null));
                break;
            case "base_device_pai":
                nLPCommand = new NLPCommand(new OpenAppContent(33, null, 2, null));
                break;
            case "base_device_breathing":
                nLPCommand = new NLPCommand(new OpenAppContent(41, null, 2, null));
                break;
            case "base_device_heart_rate":
                nLPCommand = new NLPCommand(new OpenAppContent(3, null, 2, null));
                break;
            case "base_device_sleep":
                nLPCommand = new NLPCommand(new OpenAppContent(19, null, 2, null));
                break;
            case "base_device_pressure":
                nLPCommand = new NLPCommand(new OpenAppContent(21, null, 2, null));
                break;
            case "base_device_spo2":
                nLPCommand = new NLPCommand(new OpenAppContent(20, null, 2, null));
                break;
            case "base_device_compass":
                nLPCommand = new NLPCommand(new OpenAppContent(24, null, 2, null));
                break;
            default:
                nLPCommand = null;
                break;
        }
        if (nLPCommand == null) {
            return false;
        }
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, nLPCommand, null, 2, null);
        HMLog.info("speech", new b(intent));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final NLPCommand f(String intent) {
        switch (intent.hashCode()) {
            case -2133941542:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_JAILI_BALL)) {
                    return b(171);
                }
                return null;
            case -2045094967:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_CHECKERS)) {
                    return b(174);
                }
                return null;
            case -1958247611:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SANDBAG_BALL)) {
                    return b(169);
                }
                return null;
            case -1839850057:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_BILLIARDS)) {
                    return b(151);
                }
                return null;
            case -1839094524:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_E_SPORTS)) {
                    return b(189);
                }
                return null;
            case -1832409709:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_GO)) {
                    return b(175);
                }
                return null;
            case -1812145628:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_CROSS_TRAINING)) {
                    return b(130);
                }
                return null;
            case -1767293770:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_WALKING_MACHINE)) {
                    return b(144);
                }
                return null;
            case -1705934610:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_INDOOR_FOOTBALL)) {
                    return b(164);
                }
                return null;
            case -1576275692:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_POLE_DANCING)) {
                    return b(166);
                }
                return null;
            case -1518361345:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SPINNING_BIKE)) {
                    return b(143);
                }
                return null;
            case -1305827917:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_BEACH_VOLLEYBALL)) {
                    return b(122);
                }
                return null;
            case -1238402839:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_TABLE_FOOTBALL)) {
                    return b(161);
                }
                return null;
            case -1118177689:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FOLK_DANCE)) {
                    return b(146);
                }
                return null;
            case -1082238555:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_HIPHOP)) {
                    return b(165);
                }
                return null;
            case -870604014:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_DODGE_BALL)) {
                    return b(153);
                }
                return null;
            case -709928737:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_KICKING_SHUTTLECOCK)) {
                    return b(120);
                }
                return null;
            case -480881418:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_RACE_WALKING)) {
                    return b(131);
                }
                return null;
            case -329781580:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_BRIDGE)) {
                    return b(176);
                }
                return null;
            case -287110539:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_CHESS)) {
                    return b(173);
                }
                return null;
            case -286383031:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_DARTS)) {
                    return b(117);
                }
                return null;
            case -279912254:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_KAYAK)) {
                    return b(140);
                }
                return null;
            case -271883661:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SWING)) {
                    return b(159);
                }
                return null;
            case -222840211:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_LATIN_DANCE)) {
                    return b(112);
                }
                return null;
            case -212459689:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FUJIKI)) {
                    return b(152);
                }
                return null;
            case -62070891:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_WATER_POLO)) {
                    return b(154);
                }
                return null;
            case -9116782:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FLYING_A_KITE)) {
                    return b(118);
                }
                return null;
            case 30736289:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_DRAGON_BOAT)) {
                    return b(138);
                }
                return null;
            case 125936371:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_ROWING)) {
                    return b(141);
                }
                return null;
            case 247099165:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SYNCHRONIZED_SWIMMING)) {
                    return b(156);
                }
                return null;
            case 294615490:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SHUTTLECOCK)) {
                    return b(162);
                }
                return null;
            case 315570141:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_BOARD_GAMES)) {
                    return b(177);
                }
                return null;
            case 561517636:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_WATER_SKIING)) {
                    return b(139);
                }
                return null;
            case 741411460:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_TUG_OF_WAR)) {
                    return b(119);
                }
                return null;
            case 779704387:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_AEROBICS)) {
                    return b(109);
                }
                return null;
            case 806121400:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_INDOOR_WALKING)) {
                    return b(40);
                }
                return null;
            case 909060552:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SOMATOSENSORY_GAME)) {
                    return b(163);
                }
                return null;
            case 916493718:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_OUTDOOR_ROWING)) {
                    return b(66);
                }
                return null;
            case 950506446:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_BATTLE_ROPE)) {
                    return b(167);
                }
                return null;
            case 982488534:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_JAZZ_DANCE)) {
                    return b(113);
                }
                return null;
            case 1021401829:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_BREAK_DANCING)) {
                    return b(168);
                }
                return null;
            case 1133851543:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SKATEBOARD)) {
                    return b(67);
                }
                return null;
            case 1258740737:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_JUJITSU)) {
                    return b(147);
                }
                return null;
            case 1274657749:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_GROUP_GYMNASTICS)) {
                    return b(111);
                }
                return null;
            case 1319230682:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_HULA_HOOP)) {
                    return b(115);
                }
                return null;
            case 1330419961:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SNORKELING)) {
                    return b(157);
                }
                return null;
            case 1337811225:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_GROUND_THROW)) {
                    return b(170);
                }
                return null;
            case 1447238264:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_SHUFFLEBOARD)) {
                    return b(160);
                }
                return null;
            case 1549131491:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FENCING)) {
                    return b(148);
                }
                return null;
            case 1594012540:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FIN_SWIMMING)) {
                    return b(155);
                }
                return null;
            case 1692431779:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_HORIZONTAL_BAR)) {
                    return b(149);
                }
                return null;
            case 1694864002:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_ICE_HOCKEY)) {
                    return b(158);
                }
                return null;
            case 1723655511:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_PARKOUR)) {
                    return b(129);
                }
                return null;
            case 1917162497:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FRISBEE)) {
                    return b(116);
                }
                return null;
            case 1986534509:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_PARALLEL_BARS)) {
                    return b(150);
                }
                return null;
            case 2086476873:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_WALL_BALL)) {
                    return b(145);
                }
                return null;
            case 2129049163:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_INDOOR_SURFING)) {
                    return b(172);
                }
                return null;
            case 2137785754:
                if (intent.equals(CustomSkillIntentKt.INTENT_SPORT_FIGHTING_EXERCISE)) {
                    return b(114);
                }
                return null;
            default:
                return null;
        }
    }

    private final boolean g(String intent) {
        NLPCommand nLPCommand;
        switch (intent) {
            case "base_device_temperature":
                nLPCommand = new NLPCommand(new OpenAppContent(32, null, 2, null));
                break;
            case "base_device_schedule":
                nLPCommand = new NLPCommand(new OpenAppContent(23, null, 2, null));
                break;
            case "base_device_sms":
                nLPCommand = new NLPCommand(new OpenAppContent(34, null, 2, null));
                break;
            case "base_open_alipay":
                nLPCommand = new NLPCommand(new OpenAppContent(0, null, 2, null));
                break;
            case "base_device_takephoto":
                nLPCommand = new NLPCommand(new OpenAppContent(8, null, 2, null));
                break;
            case "base_device_setting":
                nLPCommand = new NLPCommand(new OpenAppContent(28, null, 2, null));
                break;
            case "base_device_netease_music":
                nLPCommand = new NLPCommand(new OpenAppContent(29, null, 2, null));
                break;
            case "base_device_stopwatch":
                nLPCommand = new NLPCommand(new OpenAppContent(10, null, 2, null));
                break;
            case "base_device_world_clock":
                nLPCommand = new NLPCommand(new OpenAppContent(26, null, 2, null));
                break;
            case "base_device_exercise_target":
                nLPCommand = new NLPCommand(new OpenAppContent(30, null, 2, null));
                break;
            case "base_open_wechatpay":
                nLPCommand = new NLPCommand(new OpenAppContent(39, null, 2, null));
                break;
            case "base_device_previous_workout":
                nLPCommand = new NLPCommand(new OpenAppContent(18, null, 2, null));
                break;
            case "base_find_device":
                nLPCommand = new NLPCommand(new OpenAppContent(12, null, 2, null));
                break;
            case "base_device_smart_assistant":
                nLPCommand = new NLPCommand(new OpenAppContent(27, null, 2, null));
                break;
            case "base_device_activities":
                nLPCommand = new NLPCommand(new OpenAppContent(17, null, 2, null));
                break;
            case "base_open_tomato_clock":
                nLPCommand = new NLPCommand(new OpenAppContent(38, null, 2, null));
                break;
            case "base_device_tiger_trade":
                nLPCommand = new NLPCommand(new OpenAppContent(36, null, 2, null));
                break;
            case "base_device_intelligentDND":
                nLPCommand = a();
                break;
            case "base_device_watch_face_setting":
                nLPCommand = new NLPCommand(new OpenAppContent(14, null, 2, null));
                break;
            case "base_device_notification":
                nLPCommand = new NLPCommand(new OpenAppContent(6, null, 2, null));
                break;
            case "base_device_barometric_altimeter":
                nLPCommand = new NLPCommand(new OpenAppContent(25, null, 2, null));
                break;
            case "base_wrist_lift":
                nLPCommand = new NLPCommand(new OpenAppContent(44, null, 2, null));
                break;
            case "base_device_alarm":
                nLPCommand = new NLPCommand(new OpenAppContent(16, null, 2, null));
                break;
            case "base_device_phone":
                nLPCommand = new NLPCommand(new OpenAppContent(35, null, 2, null));
                break;
            case "base_device_sport":
                nLPCommand = new NLPCommand(new OpenAppContent(31, null, 2, null));
                break;
            case "base_device_flashlight":
                nLPCommand = new NLPCommand(new OpenAppContent(40, null, 2, null));
                break;
            case "base_device_card_pack":
                nLPCommand = new NLPCommand(new OpenAppContent(1, null, 2, null));
                break;
            case "base_device_flight_manager":
                nLPCommand = new NLPCommand(new OpenAppContent(37, null, 2, null));
                break;
            case "base_device_activity_status":
                nLPCommand = new NLPCommand(new OpenAppContent(2, null, 2, null));
                break;
            default:
                nLPCommand = null;
                break;
        }
        if (nLPCommand == null) {
            return false;
        }
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, nLPCommand, null, 2, null);
        HMLog.info("speech", new c(intent));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    private final boolean h(String intent) {
        NLPCommand nLPCommandB;
        switch (intent) {
            case "sport_gymnastics":
                nLPCommandB = b(59);
                break;
            case "sport_table_tennis":
                nLPCommandB = b(89);
                break;
            case "sport_running_indoor":
                nLPCommandB = b(SportType.SPORT_TYPE_IDRUN.getValue());
                break;
            case "sport_badminton":
                nLPCommandB = b(92);
                break;
            case "sport_basketball":
                nLPCommandB = b(85);
                break;
            case "sport_Boxing":
                nLPCommandB = b(97);
                break;
            case "sport_indoor_fitness":
                nLPCommandB = b(24);
                break;
            case "sport_rowing_machine":
                nLPCommandB = b(SportType.SPORT_TYPE_ROWING.getValue());
                break;
            case "sport_cricket":
                nLPCommandB = b(78);
                break;
            case "sport_walking":
                nLPCommandB = b(SportType.SPORT_TYPE_WALKING.getValue());
                break;
            case "sport_cycling":
                nLPCommandB = b(SportType.SPORT_TYPE_RIDING.getValue());
                break;
            case "sport_core_training":
                nLPCommandB = b(50);
                break;
            case "sport_trail_running":
                nLPCommandB = b(SportType.SPORT_TYPE_CROSS_COUNTRY_RUN.getValue());
                break;
            case "sport_Zumba":
                nLPCommandB = b(77);
                break;
            case "sport_dance":
                nLPCommandB = b(76);
                break;
            case "sport_rope_skipping":
                nLPCommandB = b(SportType.SPORT_TYPE_JUMP_ROPE.getValue());
                break;
            case "sport_Free_Fighting":
                nLPCommandB = b(104);
                break;
            case "sport_elliptical_machine":
                nLPCommandB = b(SportType.SPORT_TYPE_ELLIPTICAL.getValue());
                break;
            case "sport_running_outdoor":
                nLPCommandB = b(SportType.SPORT_TYPE_ODRUN.getValue());
                break;
            case "sport_Bowling":
                nLPCommandB = b(80);
                break;
            case "sport_HIIT":
                nLPCommandB = b(49);
                break;
            case "sport_yoga":
                nLPCommandB = b(SportType.SPORT_TYPE_YOGA.getValue());
                break;
            case "sport_open_water_swimming":
                nLPCommandB = b(SportType.SPORT_TYPE_OPEN_WATER_SWIM.getValue());
                break;
            case "sport_skiing":
                nLPCommandB = b(SportType.SPORT_TYPE_SKIING.getValue());
                break;
            case "sport_street_dance":
                nLPCommandB = b(74);
                break;
            case "sport_treadmill":
                nLPCommandB = b(58);
                break;
            case "sport_swimming":
                nLPCommandB = b(SportType.SPORT_TYPE_POOL_SWIM.getValue());
                break;
            case "sport_Indoor_skating":
                nLPCommandB = b(45);
                break;
            case "sport_indoor_cycling":
                nLPCommandB = b(SportType.SPORT_TYPE_IDRIDING.getValue());
                break;
            case "sport_free_training":
                nLPCommandB = b(SportType.SPORT_TYPE_EXERCISE.getValue());
                break;
            case "sport_volleyball":
                nLPCommandB = b(88);
                break;
            case "training":
                nLPCommandB = b(SportType.SPORT_TYPE_EXERCISE.getValue());
                break;
            case "sport_stretching":
                nLPCommandB = b(53);
                break;
            case "sport_climbing":
                nLPCommandB = b(SportType.SPORT_TYPE_CLIMB.getValue());
                break;
            case "sport_pilates":
                nLPCommandB = b(61);
                break;
            default:
                nLPCommandB = null;
                break;
        }
        if (nLPCommandB == null && (nLPCommandB = f(intent)) == null) {
            return false;
        }
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, nLPCommandB, null, 2, null);
        HMLog.info("speech", new d(intent));
        return true;
    }

    @Override // com.huami.ai.skill.CustomSkill
    public boolean exeCustomSkill(@NotNull String intent, @NotNull InstructionPayload payload) {
        if (h(intent) || e(intent) || g(intent) || c(intent, payload)) {
            return true;
        }
        HMLog.warn$default("speech", null, new a(intent), 2, null);
        return false;
    }
}
