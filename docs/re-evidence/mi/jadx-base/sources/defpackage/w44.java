package defpackage;

import android.graphics.Color;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes4.dex */
public class w44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f37599a = {Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, SportReportBaseParser.ReportType.avgAscentRate), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f37600b = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, SportReportBaseParser.ReportType.divingCNS, 209)};
    public static final int[] c = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, SportReportBaseParser.ReportType.exitTime, 162), Color.rgb(SportReportBaseParser.ReportType.minWaterTemperature, 134, 134), Color.rgb(179, 48, 80)};
    public static final int[] d = {Color.rgb(SportReportBaseParser.ReportType.divingOTU, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
    public static final int[] e = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};
    public static final int[] f = {b("#2ecc71"), b("#f1c40f"), b("#e74c3c"), b("#3498db")};

    public static int a(int i, int i2) {
        return (i & 16777215) | ((i2 & 255) << 24);
    }

    public static int b(String str) {
        int i = (int) Long.parseLong(str.replace(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, ""), 16);
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, i & 255);
    }
}
