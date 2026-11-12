package com.mapbox.maps.plugin.scalebar;

import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.GmsVersion;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"6\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"6\u0010\u0010\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"FEET_PER_METER", "", "FEET_PER_MILE", "", "FEET_UNIT", "", "KILOMETER", "KILOMETER_UNIT", "METER_UNIT", "MILE_UNIT", "imperialTable", "", "Landroid/util/Pair;", "kotlin.jvm.PlatformType", "getImperialTable", "()Ljava/util/List;", "metricTable", "getMetricTable", "plugin-scalebar_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ScaleBarConstantKt {
    public static final float FEET_PER_METER = 3.2808f;
    public static final String FEET_UNIT = " ft";
    public static final int KILOMETER = 1000;
    public static final String KILOMETER_UNIT = " km";
    public static final String METER_UNIT = " m";
    public static final String MILE_UNIT = " mi";
    private static final List<Pair<Integer, Integer>> metricTable = x.k(new Pair(1, 2), new Pair(2, 2), new Pair(4, 2), new Pair(10, 2), new Pair(20, 2), new Pair(50, 2), new Pair(75, 3), new Pair(100, 2), new Pair(150, 2), new Pair(200, 2), new Pair(300, 3), new Pair(500, 2), new Pair(1000, 2), new Pair(Integer.valueOf(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), 2), new Pair(Integer.valueOf(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS), 3), new Pair(5000, 2), new Pair(10000, 2), new Pair(20000, 2), new Pair(30000, 3), new Pair(50000, 2), new Pair(100000, 2), new Pair(200000, 2), new Pair(300000, 3), new Pair(400000, 2), new Pair(500000, 2), new Pair(600000, 3), new Pair(800000, 2), new Pair(1000000, 2), new Pair(2000000, 2), new Pair(3000000, 3), new Pair(4000000, 2), new Pair(Integer.valueOf(GmsVersion.VERSION_LONGHORN), 2), new Pair(Integer.valueOf(GmsVersion.VERSION_MANCHEGO), 3), new Pair(Integer.valueOf(GmsVersion.VERSION_SAGA), 2), new Pair(10000000, 2), new Pair(12000000, 2), new Pair(15000000, 2));
    public static final int FEET_PER_MILE = 5280;
    private static final List<Pair<Integer, Integer>> imperialTable = x.k(new Pair(1, 1), new Pair(4, 2), new Pair(6, 2), new Pair(10, 2), new Pair(20, 2), new Pair(30, 2), new Pair(50, 2), new Pair(75, 3), new Pair(100, 2), new Pair(200, 2), new Pair(300, 3), new Pair(400, 2), new Pair(600, 3), new Pair(800, 2), new Pair(1000, 2), new Pair(1320, 2), new Pair(2640, 2), new Pair(Integer.valueOf(FEET_PER_MILE), 2), new Pair(10560, 2), new Pair(15840, 3), new Pair(21120, 2), new Pair(42240, 2), new Pair(63360, 2), new Pair(79200, 3), new Pair(105600, 2), new Pair(158400, 3), new Pair(211200, 2), new Pair(422400, 2), new Pair(633600, 2), new Pair(1056000, 2), new Pair(1584000, 3), new Pair(2112000, 2), new Pair(3168000, 3), new Pair(5280000, 2), new Pair(7920000, 3), new Pair(10560000, 2), new Pair(15840000, 2), new Pair(21120000, 2), new Pair(26400000, 2), new Pair(31680000, 3), new Pair(42240000, 2), new Pair(52800000, 2));

    public static final List<Pair<Integer, Integer>> getImperialTable() {
        return imperialTable;
    }

    public static final List<Pair<Integer, Integer>> getMetricTable() {
        return metricTable;
    }
}
