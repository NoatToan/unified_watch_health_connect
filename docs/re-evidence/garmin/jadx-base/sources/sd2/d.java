package sd2;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class d {
    private d() {
    }

    public static ArrayList a(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            long j8 = jVar.f158686c;
            List arrayList2 = map.containsKey(Long.valueOf(j8)) ? (List) map.get(Long.valueOf(j8)) : new ArrayList();
            arrayList2.add(jVar);
            map.put(Long.valueOf(j8), arrayList2);
        }
        if (map.size() <= 0) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (List list : map.values()) {
            if (list.size() == 1) {
                arrayList3.add((f) list.get(0));
            } else {
                arrayList3.add(new a((List<j>) list));
            }
        }
        return arrayList3;
    }

    public static j b(Cursor cursor) {
        ArrayList arrayList;
        int columnIndex = cursor.getColumnIndex("categories");
        int columnIndex2 = cursor.getColumnIndex("connection_type");
        int columnIndex3 = cursor.getColumnIndex("last_connected_timestamp");
        int columnIndex4 = cursor.getColumnIndex("bt_friendly_name");
        int columnIndex5 = cursor.getColumnIndex("image_url");
        int columnIndex6 = cursor.getColumnIndex("unit_id");
        int columnIndex7 = cursor.getColumnIndex("application_key");
        int columnIndex8 = cursor.getColumnIndex("mac_address");
        int columnIndex9 = cursor.getColumnIndex("product_display_name");
        int columnIndex10 = cursor.getColumnIndex("product_nbr");
        int columnIndex11 = cursor.getColumnIndex("software_version");
        int columnIndex12 = cursor.getColumnIndex("video_url");
        int columnIndex13 = cursor.getColumnIndex("training_video_url");
        int columnIndex14 = cursor.getColumnIndex("is_software_update_available");
        int columnIndex15 = cursor.getColumnIndex("min_app_version_code_supported");
        int columnIndex16 = cursor.getColumnIndex("is_segment_capable");
        int columnIndex17 = cursor.getColumnIndex("garmin_device_xml");
        int columnIndex18 = cursor.getColumnIndex("garmin_device_xml_id");
        int columnIndex19 = cursor.getColumnIndex("is_connected");
        int columnIndex20 = cursor.getColumnIndex("sku");
        int columnIndex21 = cursor.getColumnIndex("gcmSettingsFileName");
        int columnIndex22 = cursor.getColumnIndex("gble_ediv");
        int columnIndex23 = cursor.getColumnIndex("gble_rand");
        int columnIndex24 = cursor.getColumnIndex("gble_ltk");
        int columnIndex25 = cursor.getColumnIndex("is_vivohub_configurable");
        int columnIndex26 = cursor.getColumnIndex("is_primary_user");
        int columnIndex27 = cursor.getColumnIndex("display_name");
        int columnIndex28 = cursor.getColumnIndex("active_ind");
        int columnIndex29 = cursor.getColumnIndex("part_nbr");
        int columnIndex30 = cursor.getColumnIndex("fitpay_user_id");
        int columnIndex31 = cursor.getColumnIndex("nfc_se_id");
        int columnIndex32 = cursor.getColumnIndex("multi_link_support");
        int columnIndex33 = cursor.getColumnIndex("gcj02_course_capable");
        int columnIndex34 = cursor.getColumnIndex("activity_course_capable");
        int columnIndex35 = cursor.getColumnIndex("nfc_capable");
        int columnIndex36 = cursor.getColumnIndex("solarPanelUtilizationCapable");
        int columnIndex37 = cursor.getColumnIndex("lowHrAlertCapable");
        int columnIndex38 = cursor.getColumnIndex("abnormalHeartRateAlertCapable");
        int columnIndex39 = cursor.getColumnIndex("sku_image_url");
        int columnIndex40 = cursor.getColumnIndex("sku_image_defaultWatchFace_url");
        int columnIndex41 = cursor.getColumnIndex("sku_image_defaultWatchFaceBlank_url");
        int columnIndex42 = cursor.getColumnIndex("sku_image_sideProfile_url");
        int columnIndex43 = cursor.getColumnIndex("sku_image_tutorial_url");
        int columnIndex44 = cursor.getColumnIndex("sku_image_option1_url");
        int columnIndex45 = cursor.getColumnIndex("sku_image_option2_url");
        int columnIndex46 = cursor.getColumnIndex("sku_image_option3_url");
        int columnIndex47 = cursor.getColumnIndex("spectatorMessagingCapable");
        int columnIndex48 = cursor.getColumnIndex("trainingStatusPauseCapable");
        int columnIndex49 = cursor.getColumnIndex("trainingStatusCapable");
        int columnIndex50 = cursor.getColumnIndex("measurementUnitSettingCapable");
        int columnIndex51 = cursor.getColumnIndex("powerCurveCapable");
        int columnIndex52 = cursor.getColumnIndex("secondaryWorkoutStepTargetCapable");
        int columnIndex53 = cursor.getColumnIndex("assistancePlusCapable");
        int columnIndex54 = cursor.getColumnIndex("emergencyCallingCapable");
        int columnIndex55 = cursor.getColumnIndex("solarChargeCapable");
        int columnIndex56 = cursor.getColumnIndex("diveAppSyncCapable");
        int columnIndex57 = cursor.getColumnIndex("dayOfWeekSleepWindowCapable");
        int columnIndex58 = cursor.getColumnIndex("primaryApp");
        int columnIndex59 = cursor.getColumnIndex("incompatibleApps");
        int columnIndex60 = cursor.getColumnIndex("applyBackupCapable");
        int columnIndex61 = cursor.getColumnIndex("hillScoreAndEnduranceScoreCapable");
        int columnIndex62 = cursor.getColumnIndex("bodyBatteryTrueUpCapable");
        int columnIndex63 = cursor.getColumnIndex("rechargeableSensorCapable");
        int columnIndex64 = cursor.getColumnIndex("startActivityCapable");
        int columnIndex65 = cursor.getColumnIndex("pendingActivityCapable");
        int columnIndex66 = cursor.getColumnIndex("fixedLocationCapable");
        int columnIndex67 = cursor.getColumnIndex("screenlessDeviceCapable");
        int columnIndex68 = cursor.getColumnIndex("startStopWorkoutCapable");
        int columnIndex69 = cursor.getColumnIndex("fallDetectionCapable");
        int columnIndex70 = cursor.getColumnIndex("directActivationCapable");
        int columnIndex71 = cursor.getColumnIndex("lastUploadToServerTimestamp");
        j jVar = new j();
        if (cursor.isNull(columnIndex)) {
            jVar.W0 = null;
        } else {
            String string = cursor.getString(columnIndex);
            if (!TextUtils.isEmpty(string)) {
                jVar.W0 = string.split(",");
            }
        }
        if (cursor.isNull(columnIndex2)) {
            jVar.X0 = 0;
        } else {
            String string2 = cursor.getString(columnIndex2);
            jVar.X0 = "ble".equalsIgnoreCase(string2) ? 1 : "btc".equalsIgnoreCase(string2) ? 2 : 0;
        }
        jVar.f158688d = cursor.isNull(columnIndex3) ? -1L : cursor.getLong(columnIndex3);
        jVar.O0 = cursor.isNull(columnIndex4) ? null : cursor.getString(columnIndex4);
        jVar.L0 = cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5);
        jVar.f158686c = cursor.isNull(columnIndex6) ? -1L : cursor.getLong(columnIndex6);
        jVar.I0 = cursor.isNull(columnIndex7) ? null : cursor.getString(columnIndex7);
        jVar.J0 = cursor.isNull(columnIndex8) ? null : cursor.getString(columnIndex8);
        jVar.f158683a1 = cursor.isNull(columnIndex9) ? null : cursor.getString(columnIndex9);
        jVar.Z0 = cursor.isNull(columnIndex10) ? null : cursor.getString(columnIndex10);
        jVar.K0 = cursor.isNull(columnIndex11) ? null : cursor.getString(columnIndex11);
        jVar.M0 = cursor.isNull(columnIndex12) ? null : cursor.getString(columnIndex12);
        jVar.N0 = cursor.isNull(columnIndex13) ? null : cursor.getString(columnIndex13);
        jVar.f158690e = !cursor.isNull(columnIndex14) && cursor.getInt(columnIndex14) == 1;
        jVar.f158682a = cursor.isNull(columnIndex15) ? DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE : cursor.getInt(columnIndex15);
        jVar.f158692f = !cursor.isNull(columnIndex16) && cursor.getInt(columnIndex16) == 1;
        jVar.S0 = cursor.isNull(columnIndex17) ? null : cursor.getBlob(columnIndex17);
        if (!cursor.isNull(columnIndex18)) {
            cursor.getString(columnIndex18);
        }
        jVar.f158694g = !cursor.isNull(columnIndex19) && cursor.getInt(columnIndex19) == 1;
        jVar.P0 = cursor.isNull(columnIndex20) ? null : cursor.getString(columnIndex20);
        jVar.T0 = cursor.isNull(columnIndex22) ? null : cursor.getBlob(columnIndex22);
        jVar.U0 = cursor.isNull(columnIndex23) ? null : cursor.getBlob(columnIndex23);
        jVar.V0 = cursor.isNull(columnIndex24) ? null : cursor.getBlob(columnIndex24);
        jVar.f158696h = !cursor.isNull(columnIndex25) && cursor.getInt(columnIndex25) == 1;
        jVar.f158705l = cursor.isNull(columnIndex26) || cursor.getInt(columnIndex26) == 1;
        jVar.f158685b1 = cursor.isNull(columnIndex27) ? null : cursor.getString(columnIndex27);
        jVar.f158684b = cursor.isNull(columnIndex28) ? -1 : cursor.getInt(columnIndex28);
        jVar.Y0 = cursor.isNull(columnIndex29) ? null : cursor.getString(columnIndex29);
        jVar.Q0 = cursor.isNull(columnIndex30) ? null : cursor.getString(columnIndex30);
        jVar.R0 = cursor.isNull(columnIndex31) ? null : cursor.getString(columnIndex31);
        jVar.f158698i = !cursor.isNull(columnIndex32) && cursor.getInt(columnIndex32) == 1;
        jVar.f158700j = !cursor.isNull(columnIndex33) && cursor.getInt(columnIndex33) == 1;
        jVar.f158702k = !cursor.isNull(columnIndex34) && cursor.getInt(columnIndex34) == 1;
        jVar.f158709n = !cursor.isNull(columnIndex35) && cursor.getInt(columnIndex35) == 1;
        jVar.f158711o = !cursor.isNull(columnIndex36) && cursor.getInt(columnIndex36) == 1;
        jVar.f158713p = !cursor.isNull(columnIndex37) && cursor.getInt(columnIndex37) == 1;
        jVar.f158715q = !cursor.isNull(columnIndex38) && cursor.getInt(columnIndex38) == 1;
        jVar.f158689d1 = cursor.isNull(columnIndex21) ? null : cursor.getString(columnIndex21);
        jVar.f158691e1 = cursor.isNull(columnIndex39) ? null : cursor.getString(columnIndex39);
        jVar.f158693f1 = cursor.isNull(columnIndex40) ? null : cursor.getString(columnIndex40);
        jVar.f158695g1 = cursor.isNull(columnIndex41) ? null : cursor.getString(columnIndex41);
        jVar.f158697h1 = cursor.isNull(columnIndex42) ? null : cursor.getString(columnIndex42);
        jVar.f158699i1 = cursor.isNull(columnIndex43) ? null : cursor.getString(columnIndex43);
        jVar.f158701j1 = cursor.isNull(columnIndex44) ? null : cursor.getString(columnIndex44);
        jVar.f158704k1 = cursor.isNull(columnIndex45) ? null : cursor.getString(columnIndex45);
        jVar.f158706l1 = cursor.isNull(columnIndex46) ? null : cursor.getString(columnIndex46);
        jVar.f158716r = !cursor.isNull(columnIndex47) && cursor.getInt(columnIndex47) == 1;
        jVar.f158717t = !cursor.isNull(columnIndex49) && cursor.getInt(columnIndex49) == 1;
        jVar.f158718v = !cursor.isNull(columnIndex48) && cursor.getInt(columnIndex48) == 1;
        jVar.f158708m1 = !cursor.isNull(columnIndex50) && cursor.getInt(columnIndex50) == 1;
        jVar.f158719w = !cursor.isNull(columnIndex51) && cursor.getInt(columnIndex51) == 1;
        jVar.f158720x = !cursor.isNull(columnIndex52) && cursor.getInt(columnIndex52) == 1;
        jVar.f158721y = !cursor.isNull(columnIndex53) && cursor.getInt(columnIndex53) == 1;
        jVar.f158722z = !cursor.isNull(columnIndex54) && cursor.getInt(columnIndex54) == 1;
        jVar.A = !cursor.isNull(columnIndex55) && cursor.getInt(columnIndex55) == 1;
        jVar.B = !cursor.isNull(columnIndex56) && cursor.getInt(columnIndex56) == 1;
        jVar.C = !cursor.isNull(columnIndex57) && cursor.getInt(columnIndex57) == 1;
        jVar.f158712o1 = cursor.isNull(columnIndex58) ? 0 : cursor.getInt(columnIndex58);
        if (cursor.isNull(columnIndex59)) {
            arrayList = new ArrayList();
        } else {
            String[] strArrSplit = cursor.getString(columnIndex59).trim().split(StringUtils.SPACE);
            ArrayList arrayList2 = new ArrayList();
            for (String str : strArrSplit) {
                arrayList2.add(Integer.valueOf(Integer.parseInt(str)));
            }
            arrayList = arrayList2;
        }
        jVar.f158714p1 = arrayList;
        jVar.D = !cursor.isNull(columnIndex60) && cursor.getInt(columnIndex60) == 1;
        jVar.E = !cursor.isNull(columnIndex61) && cursor.getInt(columnIndex61) == 1;
        jVar.F = !cursor.isNull(columnIndex62) && cursor.getInt(columnIndex62) == 1;
        jVar.I = !cursor.isNull(columnIndex63) && cursor.getInt(columnIndex63) == 1;
        jVar.P = !cursor.isNull(columnIndex64) && cursor.getInt(columnIndex64) == 1;
        jVar.T = !cursor.isNull(columnIndex65) && cursor.getInt(columnIndex65) == 1;
        jVar.X = !cursor.isNull(columnIndex66) && cursor.getInt(columnIndex66) == 1;
        jVar.Y = !cursor.isNull(columnIndex67) && cursor.getInt(columnIndex67) == 1;
        jVar.Z = !cursor.isNull(columnIndex68) && cursor.getInt(columnIndex68) == 1;
        jVar.f158703k0 = !cursor.isNull(columnIndex69) && cursor.getInt(columnIndex69) == 1;
        jVar.H0 = !cursor.isNull(columnIndex70) && cursor.getInt(columnIndex70) == 1;
        jVar.f158710n1 = cursor.isNull(columnIndex71) ? 0L : cursor.getLong(columnIndex71);
        return jVar;
    }
}
