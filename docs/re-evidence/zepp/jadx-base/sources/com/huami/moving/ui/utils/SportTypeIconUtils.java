package com.huami.moving.ui.utils;

import com.huami.moving.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/moving/ui/utils/SportTypeIconUtils;", "", "", "sportType", "getImageByType", "Ljava/util/HashMap;", "a", "Ljava/util/HashMap;", "getSportNameMap", "()Ljava/util/HashMap;", "sportNameMap", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportTypeIconUtils {

    @NotNull
    public static final SportTypeIconUtils INSTANCE = new SportTypeIconUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<Integer, Integer> sportNameMap = r.hashMapOf(TuplesKt.to(1, Integer.valueOf(R.string.running_sports_type_running)), TuplesKt.to(9, Integer.valueOf(R.string.sports_type_bike_ride)), TuplesKt.to(6, Integer.valueOf(R.string.running_sports_type_walking)), TuplesKt.to(15, Integer.valueOf(R.string.sports_type_swim_outdoor)), TuplesKt.to(7, Integer.valueOf(R.string.running_sports_type_crosscountry)), TuplesKt.to(13, Integer.valueOf(R.string.sports_type_mountain_climb)), TuplesKt.to(2001, Integer.valueOf(R.string.sport_mix_type_triathlon)), TuplesKt.to(2002, Integer.valueOf(R.string.sport_type_multi)), TuplesKt.to(22, Integer.valueOf(R.string.sports_type_hiking)), TuplesKt.to(47, Integer.valueOf(R.string.sport_type_mountain_riding)), TuplesKt.to(48, Integer.valueOf(R.string.sport_type_bmx)), TuplesKt.to(63, Integer.valueOf(R.string.sport_type_hunting)), TuplesKt.to(65, Integer.valueOf(R.string.sport_type_sailing)), TuplesKt.to(44, Integer.valueOf(R.string.sport_type_outdoor_skating)), TuplesKt.to(67, Integer.valueOf(R.string.sport_type_skateboarding)), TuplesKt.to(68, Integer.valueOf(R.string.sport_type_paddle_surfing)), TuplesKt.to(62, Integer.valueOf(R.string.sport_type_surfing)), TuplesKt.to(69, Integer.valueOf(R.string.sport_type_roller_skating)), TuplesKt.to(94, Integer.valueOf(R.string.sport_type_equestian)), TuplesKt.to(66, Integer.valueOf(R.string.sport_type_outdoor_boating)), TuplesKt.to(106, Integer.valueOf(R.string.sport_type_kite_surfing)), TuplesKt.to(110, Integer.valueOf(R.string.sport_type_orienteering)), TuplesKt.to(123, Integer.valueOf(R.string.sport_type_drifting)), TuplesKt.to(124, Integer.valueOf(R.string.sport_type_motorboat)), TuplesKt.to(125, Integer.valueOf(R.string.sport_type_snowmobile)), TuplesKt.to(126, Integer.valueOf(R.string.sport_type_sled)), TuplesKt.to(127, Integer.valueOf(R.string.sport_type_orienteering_skiing)), TuplesKt.to(128, Integer.valueOf(R.string.sport_type_biathlon)), TuplesKt.to(132, Integer.valueOf(R.string.sport_type_drive)), TuplesKt.to(1001, Integer.valueOf(R.string.sport_index_run)), TuplesKt.to(1009, Integer.valueOf(R.string.sport_index_cycle)), TuplesKt.to(1015, Integer.valueOf(R.string.sport_index_swim)), TuplesKt.to(131, Integer.valueOf(R.string.sport_type_race_walking)), TuplesKt.to(192, Integer.valueOf(R.string.sports_type_run_in_playground)));

    private SportTypeIconUtils() {
    }

    public final int getImageByType(int sportType) {
        if (sportType == 6) {
            return R.drawable.track_ic_walk;
        }
        if (sportType == 7) {
            return R.drawable.track_ic_trail_running;
        }
        if (sportType == 9) {
            return R.drawable.image_cycling;
        }
        if (sportType == 11) {
            return R.drawable.track_ic_ski;
        }
        if (sportType == 13) {
            return R.drawable.track_ic_mountaineering;
        }
        if (sportType == 15) {
            return R.drawable.track_ic_swim;
        }
        if (sportType == 22) {
            return R.drawable.track_ic_on_foot;
        }
        if (sportType == 44) {
            return R.drawable.track_ic_outdoor_skating;
        }
        if (sportType == 65) {
            return R.drawable.track_ic_windsurfing;
        }
        if (sportType == 94) {
            return R.drawable.track_ic_equestrian;
        }
        if (sportType == 110) {
            return R.drawable.track_ic_orienteering;
        }
        if (sportType == 47) {
            return R.drawable.track_ic_sdqx;
        }
        if (sportType == 48) {
            return R.drawable.track_ic_swb;
        }
        if (sportType == 62) {
            return R.drawable.track_ic_surf;
        }
        if (sportType == 63) {
            return R.drawable.track_ic_hunt;
        }
        if (sportType == 106) {
            return R.drawable.track_ic_kite_surfing;
        }
        if (sportType == 107) {
            return R.drawable.track_ic_outdoor_rowing;
        }
        if (sportType == 131) {
            return R.drawable.track_ic_rw;
        }
        if (sportType == 132) {
            return R.drawable.track_ic_drive;
        }
        if (sportType == 2001) {
            return R.drawable.track_ic_triathlon;
        }
        if (sportType == 2002) {
            return R.drawable.track_ic_complex;
        }
        switch (sportType) {
            case 67:
                return R.drawable.track_ic_skateboard;
            case 68:
                return R.drawable.track_ic_pbs;
            case 69:
                return R.drawable.track_ic_roller_skating;
            default:
                switch (sportType) {
                    case 123:
                        return R.drawable.track_ic_drifting;
                    case 124:
                        return R.drawable.track_ic_motorboat;
                    case 125:
                        return R.drawable.track_ic_skibob;
                    case 126:
                        return R.drawable.track_ic_sled;
                    case 127:
                        return R.drawable.track_ic_so;
                    case 128:
                        return R.drawable.track_ic_biathlon;
                    default:
                        return R.drawable.track_ic_run;
                }
        }
    }

    @NotNull
    public final HashMap<Integer, Integer> getSportNameMap() {
        return sportNameMap;
    }
}
