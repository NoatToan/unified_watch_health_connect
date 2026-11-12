package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.flexbox.FlexItem;
import com.google.mlkit.common.MlKitException;
import i3.e5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ColorTemplate {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {Color.rgb(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 248, 246), Color.rgb(148, 212, 212), Color.rgb(SyslogConstants.LOG_LOCAL1, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {Color.rgb(217, 80, TsExtractor.TS_STREAM_TYPE_DTS), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO), Color.rgb(53, 194, 209)};
    public static final int[] PASTEL_COLORS = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, SyslogConstants.LOG_LOCAL7, 162), Color.rgb(191, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO), Color.rgb(179, 48, 80)};
    public static final int[] COLORFUL_COLORS = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int i14, int i15) {
        return (i14 & FlexItem.MAX_SIZE) | ((i15 & 255) << 24);
    }

    public static List<Integer> createColors(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i14 : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i14)));
        }
        return arrayList;
    }

    public static int getHoloBlue() {
        return Color.rgb(51, 181, 229);
    }

    public static int rgb(String str) {
        int i14 = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((i14 >> 16) & 255, (i14 >> 8) & 255, i14 & 255);
    }

    public static List<Integer> createColors(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int iD = 0;
        while (iD < length) {
            iD = e5.d(iArr[iD], iD, arrayList, 1);
        }
        return arrayList;
    }
}
