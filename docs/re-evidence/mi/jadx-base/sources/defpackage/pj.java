package defpackage;

import com.huami.bluetooth.profile.channel.module.voice.content.c;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\n"}, d2 = {"", "intent", "Lpw;", PluginDeviceInfo.FICONOFF, "Lom;", PluginDeviceInfo.FDESC, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONON, "", DailyRecordKey.sportType, "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class pj {
    @Nullable
    public static final pw a(@NotNull String intent) {
        om omVar;
        Intrinsics.checkNotNullParameter(intent, "intent");
        switch (intent) {
            case "base_movement_status":
                omVar = new om(new c(43, null, 2, null));
                break;
            case "base_device_ecg":
                omVar = new om(new c(22, null, 2, null));
                break;
            case "base_device_pai":
                omVar = new om(new c(33, null, 2, null));
                break;
            case "base_device_breathing":
                omVar = new om(new c(41, null, 2, null));
                break;
            case "base_device_heart_rate":
                omVar = new om(new c(3, null, 2, null));
                break;
            case "base_device_sleep":
                omVar = new om(new c(19, null, 2, null));
                break;
            case "base_device_pressure":
                omVar = new om(new c(21, null, 2, null));
                break;
            case "base_device_spo2":
                omVar = new om(new c(20, null, 2, null));
                break;
            case "base_device_compass":
                omVar = new om(new c(24, null, 2, null));
                break;
            default:
                return null;
        }
        return omVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final om b(String str) {
        switch (str.hashCode()) {
            case -2133941542:
                if (str.equals("sport_jaili_ball")) {
                    return a(171);
                }
                return null;
            case -2045094967:
                if (str.equals("sport_checkers")) {
                    return a(174);
                }
                return null;
            case -1958247611:
                if (str.equals("sport_sandbag_ball")) {
                    return a(169);
                }
                return null;
            case -1839850057:
                if (str.equals("sport_billiards")) {
                    return a(151);
                }
                return null;
            case -1839094524:
                if (str.equals("sport_e_sports")) {
                    return a(SportReportBaseParser.ReportType.descentCount);
                }
                return null;
            case -1832409709:
                if (str.equals("sport_go")) {
                    return a(175);
                }
                return null;
            case -1812145628:
                if (str.equals("sport_cross_training")) {
                    return a(130);
                }
                return null;
            case -1767293770:
                if (str.equals("sport_walking_machine")) {
                    return a(144);
                }
                return null;
            case -1705934610:
                if (str.equals("sport_Indoor_football")) {
                    return a(164);
                }
                return null;
            case -1576275692:
                if (str.equals("sport_pole_dancing")) {
                    return a(166);
                }
                return null;
            case -1518361345:
                if (str.equals("sport_spinning_bike")) {
                    return a(143);
                }
                return null;
            case -1305827917:
                if (str.equals("sport_beach_volleyball")) {
                    return a(122);
                }
                return null;
            case -1238402839:
                if (str.equals("sport_table_football")) {
                    return a(161);
                }
                return null;
            case -1118177689:
                if (str.equals("sport_folk_dance")) {
                    return a(146);
                }
                return null;
            case -1082238555:
                if (str.equals("sport_Hiphop")) {
                    return a(165);
                }
                return null;
            case -870604014:
                if (str.equals("sport_dodge_ball")) {
                    return a(153);
                }
                return null;
            case -709928737:
                if (str.equals("sport_kicking_shuttlecock")) {
                    return a(120);
                }
                return null;
            case -480881418:
                if (str.equals("sport_race_walking")) {
                    return a(131);
                }
                return null;
            case -329781580:
                if (str.equals("sport_bridge")) {
                    return a(176);
                }
                return null;
            case -287110539:
                if (str.equals("sport_chess")) {
                    return a(173);
                }
                return null;
            case -286383031:
                if (str.equals("sport_darts")) {
                    return a(117);
                }
                return null;
            case -279912254:
                if (str.equals("sport_kayak")) {
                    return a(140);
                }
                return null;
            case -271883661:
                if (str.equals("sport_swing")) {
                    return a(159);
                }
                return null;
            case -222840211:
                if (str.equals("sport_latin_dance")) {
                    return a(112);
                }
                return null;
            case -212459689:
                if (str.equals("sport_fujiki")) {
                    return a(152);
                }
                return null;
            case -62070891:
                if (str.equals("sport_water_polo")) {
                    return a(154);
                }
                return null;
            case -9116782:
                if (str.equals("sport_flying_a_kite")) {
                    return a(118);
                }
                return null;
            case 30736289:
                if (str.equals("sport_dragon_boat")) {
                    return a(138);
                }
                return null;
            case 125936371:
                if (str.equals("sport_rowing")) {
                    return a(141);
                }
                return null;
            case 247099165:
                if (str.equals("sport_synchronized_swimming")) {
                    return a(156);
                }
                return null;
            case 294615490:
                if (str.equals("sport_shuttlecock")) {
                    return a(162);
                }
                return null;
            case 315570141:
                if (str.equals("sport_board_games")) {
                    return a(177);
                }
                return null;
            case 561517636:
                if (str.equals("sport_water_skiing")) {
                    return a(139);
                }
                return null;
            case 741411460:
                if (str.equals("sport_tug_of_war")) {
                    return a(119);
                }
                return null;
            case 779704387:
                if (str.equals("sport_aerobics")) {
                    return a(109);
                }
                return null;
            case 806121400:
                if (str.equals("sport_indoor_walking")) {
                    return a(40);
                }
                return null;
            case 909060552:
                if (str.equals("sport_somatosensory_game")) {
                    return a(163);
                }
                return null;
            case 916493718:
                if (str.equals("sport_outdoor_rowing")) {
                    return a(66);
                }
                return null;
            case 950506446:
                if (str.equals("sport_battle_rope")) {
                    return a(167);
                }
                return null;
            case 982488534:
                if (str.equals("sport_jazz_dance")) {
                    return a(113);
                }
                return null;
            case 1021401829:
                if (str.equals("sport_break_dancing")) {
                    return a(168);
                }
                return null;
            case 1133851543:
                if (str.equals("sport_skateboard")) {
                    return a(67);
                }
                return null;
            case 1258740737:
                if (str.equals("sport_jujitsu")) {
                    return a(147);
                }
                return null;
            case 1274657749:
                if (str.equals("sport_group_gymnastics")) {
                    return a(111);
                }
                return null;
            case 1319230682:
                if (str.equals("sport_Hula_hoop")) {
                    return a(115);
                }
                return null;
            case 1330419961:
                if (str.equals("sport_snorkeling")) {
                    return a(157);
                }
                return null;
            case 1337811225:
                if (str.equals("sport_ground_throw")) {
                    return a(170);
                }
                return null;
            case 1447238264:
                if (str.equals("sport_shuffleboard")) {
                    return a(160);
                }
                return null;
            case 1549131491:
                if (str.equals("sport_fencing")) {
                    return a(148);
                }
                return null;
            case 1594012540:
                if (str.equals("sport_fin_swimming")) {
                    return a(155);
                }
                return null;
            case 1692431779:
                if (str.equals("sport_horizontal_bar")) {
                    return a(149);
                }
                return null;
            case 1694864002:
                if (str.equals("sport_ice_hockey")) {
                    return a(158);
                }
                return null;
            case 1723655511:
                if (str.equals("sport_parkour")) {
                    return a(129);
                }
                return null;
            case 1917162497:
                if (str.equals("sport_frisbee")) {
                    return a(116);
                }
                return null;
            case 1986534509:
                if (str.equals("sport_parallel_bars")) {
                    return a(150);
                }
                return null;
            case 2086476873:
                if (str.equals("sport_wall_ball")) {
                    return a(145);
                }
                return null;
            case 2129049163:
                if (str.equals("sport_indoor_surfing")) {
                    return a(172);
                }
                return null;
            case 2137785754:
                if (str.equals("sport_fighting_exercise")) {
                    return a(114);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static final pw c(@NotNull String intent) {
        om omVar;
        Intrinsics.checkNotNullParameter(intent, "intent");
        switch (intent.hashCode()) {
            case -1908542151:
                if (!intent.equals("base_device_temperature")) {
                    return null;
                }
                omVar = new om(new c(32, null, 2, null));
                break;
                break;
            case -1897922318:
                if (!intent.equals("base_device_schedule")) {
                    return null;
                }
                omVar = new om(new c(23, null, 2, null));
                break;
                break;
            case -1737653730:
                if (!intent.equals("base_device_sms")) {
                    return null;
                }
                omVar = new om(new c(34, null, 2, null));
                break;
                break;
            case -1352716943:
                if (!intent.equals("base_open_alipay")) {
                    return null;
                }
                omVar = new om(new c(0, null, 2, null));
                break;
                break;
            case -1325915376:
                if (!intent.equals("base_device_takephoto")) {
                    return null;
                }
                omVar = new om(new c(8, null, 2, null));
                break;
                break;
            case -1239357291:
                if (!intent.equals("base_device_setting")) {
                    return null;
                }
                omVar = new om(new c(28, null, 2, null));
                break;
                break;
            case -1195383178:
                if (!intent.equals("base_device_netease_music")) {
                    return null;
                }
                omVar = new om(new c(29, null, 2, null));
                break;
                break;
            case -1188574446:
                if (!intent.equals("base_device_stopwatch")) {
                    return null;
                }
                omVar = new om(new c(10, null, 2, null));
                break;
                break;
            case -933096218:
                if (!intent.equals("base_device_world_clock")) {
                    return null;
                }
                omVar = new om(new c(26, null, 2, null));
                break;
                break;
            case -803082467:
                if (!intent.equals("base_device_exercise_target")) {
                    return null;
                }
                omVar = new om(new c(30, null, 2, null));
                break;
                break;
            case -795499717:
                if (!intent.equals("base_open_wechatpay")) {
                    return null;
                }
                omVar = new om(new c(39, null, 2, null));
                break;
                break;
            case -357064528:
                if (!intent.equals("base_device_previous_workout")) {
                    return null;
                }
                omVar = new om(new c(18, null, 2, null));
                break;
                break;
            case -240081106:
                if (!intent.equals("base_find_device")) {
                    return null;
                }
                omVar = new om(new c(12, null, 2, null));
                break;
                break;
            case -174726867:
                if (!intent.equals("base_device_smart_assistant")) {
                    return null;
                }
                omVar = new om(new c(27, null, 2, null));
                break;
                break;
            case -101548152:
                if (!intent.equals("base_device_activities")) {
                    return null;
                }
                omVar = new om(new c(17, null, 2, null));
                break;
                break;
            case -56329856:
                if (!intent.equals("base_open_tomato_clock")) {
                    return null;
                }
                omVar = new om(new c(38, null, 2, null));
                break;
                break;
            case -9721431:
                if (!intent.equals("base_device_tiger_trade")) {
                    return null;
                }
                omVar = new om(new c(36, null, 2, null));
                break;
                break;
            case 41488702:
                if (intent.equals("base_device_intelligentDND")) {
                    return a();
                }
                return null;
            case 133268601:
                if (!intent.equals("base_device_watch_face_setting")) {
                    return null;
                }
                omVar = new om(new c(14, null, 2, null));
                break;
                break;
            case 177164742:
                if (!intent.equals("base_device_notification")) {
                    return null;
                }
                omVar = new om(new c(6, null, 2, null));
                break;
                break;
            case 539540593:
                if (!intent.equals("base_device_barometric_altimeter")) {
                    return null;
                }
                omVar = new om(new c(25, null, 2, null));
                break;
                break;
            case 681388969:
                if (!intent.equals("base_wrist_lift")) {
                    return null;
                }
                omVar = new om(new c(44, null, 2, null));
                break;
                break;
            case 840376790:
                if (!intent.equals("base_device_alarm")) {
                    return null;
                }
                omVar = new om(new c(16, null, 2, null));
                break;
                break;
            case 854123763:
                if (!intent.equals("base_device_phone")) {
                    return null;
                }
                omVar = new om(new c(35, null, 2, null));
                break;
                break;
            case 857132793:
                if (!intent.equals("base_device_sport")) {
                    return null;
                }
                omVar = new om(new c(31, null, 2, null));
                break;
                break;
            case 961740481:
                if (!intent.equals("base_device_flashlight")) {
                    return null;
                }
                omVar = new om(new c(40, null, 2, null));
                break;
                break;
            case 1209493229:
                if (!intent.equals("base_device_card_pack")) {
                    return null;
                }
                omVar = new om(new c(1, null, 2, null));
                break;
                break;
            case 1304217849:
                if (!intent.equals("base_device_flight_manager")) {
                    return null;
                }
                omVar = new om(new c(37, null, 2, null));
                break;
                break;
            case 1410719847:
                if (!intent.equals("base_device_activity_status")) {
                    return null;
                }
                omVar = new om(new c(2, null, 2, null));
                break;
                break;
            default:
                return null;
        }
        return omVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    @Nullable
    public static final pw d(@NotNull String intent) {
        om omVarA;
        Intrinsics.checkNotNullParameter(intent, "intent");
        switch (intent) {
            case "sport_gymnastics":
                omVarA = a(59);
                break;
            case "sport_table_tennis":
                omVarA = a(89);
                break;
            case "sport_running_indoor":
                omVarA = a(SportType.SPORT_TYPE_IDRUN.getValue());
                break;
            case "sport_badminton":
                omVarA = a(92);
                break;
            case "sport_basketball":
                omVarA = a(85);
                break;
            case "sport_Boxing":
                omVarA = a(97);
                break;
            case "sport_indoor_fitness":
                omVarA = a(24);
                break;
            case "sport_rowing_machine":
                omVarA = a(SportType.SPORT_TYPE_ROWING.getValue());
                break;
            case "sport_cricket":
                omVarA = a(78);
                break;
            case "sport_walking":
                omVarA = a(SportType.SPORT_TYPE_WALKING.getValue());
                break;
            case "sport_cycling":
                omVarA = a(SportType.SPORT_TYPE_RIDING.getValue());
                break;
            case "sport_core_training":
                omVarA = a(50);
                break;
            case "sport_trail_running":
                omVarA = a(SportType.SPORT_TYPE_CROSS_COUNTRY_RUN.getValue());
                break;
            case "sport_Zumba":
                omVarA = a(77);
                break;
            case "sport_dance":
                omVarA = a(76);
                break;
            case "sport_rope_skipping":
                omVarA = a(SportType.SPORT_TYPE_JUMP_ROPE.getValue());
                break;
            case "sport_Free_Fighting":
                omVarA = a(104);
                break;
            case "sport_elliptical_machine":
                omVarA = a(SportType.SPORT_TYPE_ELLIPTICAL.getValue());
                break;
            case "sport_running_outdoor":
                omVarA = a(SportType.SPORT_TYPE_ODRUN.getValue());
                break;
            case "sport_Bowling":
                omVarA = a(80);
                break;
            case "sport_HIIT":
                omVarA = a(49);
                break;
            case "sport_yoga":
                omVarA = a(SportType.SPORT_TYPE_YOGA.getValue());
                break;
            case "sport_open_water_swimming":
                omVarA = a(SportType.SPORT_TYPE_OPEN_WATER_SWIM.getValue());
                break;
            case "sport_skiing":
                omVarA = a(SportType.SPORT_TYPE_SKIING.getValue());
                break;
            case "sport_street_dance":
                omVarA = a(74);
                break;
            case "sport_treadmill":
                omVarA = a(58);
                break;
            case "sport_swimming":
                omVarA = a(SportType.SPORT_TYPE_POOL_SWIM.getValue());
                break;
            case "sport_Indoor_skating":
                omVarA = a(45);
                break;
            case "sport_indoor_cycling":
                omVarA = a(SportType.SPORT_TYPE_IDRIDING.getValue());
                break;
            case "sport_free_training":
                omVarA = a(SportType.SPORT_TYPE_EXERCISE.getValue());
                break;
            case "sport_volleyball":
                omVarA = a(88);
                break;
            case "training":
                omVarA = a(SportType.SPORT_TYPE_EXERCISE.getValue());
                break;
            case "sport_stretching":
                omVarA = a(53);
                break;
            case "sport_climbing":
                omVarA = a(SportType.SPORT_TYPE_CLIMB.getValue());
                break;
            case "sport_pilates":
                omVarA = a(61);
                break;
            default:
                omVarA = null;
                break;
        }
        return omVarA != null ? omVarA : b(intent);
    }

    public static final om a(int i) {
        return new om(new c(4, new c.h(i)));
    }

    public static final om a() {
        return new om(new c(7, new c.e(3)));
    }
}
