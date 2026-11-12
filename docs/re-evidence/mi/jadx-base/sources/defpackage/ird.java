package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ird {
    public static int a(int i) {
        return eep.a(i);
    }

    public static int b(InputStream inputStream) {
        try {
            int iD = d(inputStream);
            if (iD == 0) {
                return 0;
            }
            return eep.d(inputStream, iD);
        } catch (IOException unused) {
            return 0;
        }
    }

    public static boolean c(int i) {
        switch (i) {
            case 192:
            case SportReportBaseParser.ReportType.divingOTU /* 193 */:
            case SportReportBaseParser.ReportType.divingCNS /* 194 */:
            case SportReportBaseParser.ReportType.oxygenPartialPressureThreshold /* 195 */:
            case SportReportBaseParser.ReportType.noFlyDuration /* 197 */:
            case SportReportBaseParser.ReportType.algorithmDataSource /* 198 */:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case SportReportBaseParser.ReportType.oxygenConcentration /* 196 */:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    public static int d(InputStream inputStream) throws IOException {
        if (e(inputStream, SportReportBaseParser.ReportType.maxFreq)) {
            int iA = vio.a(inputStream, 2, false);
            if (iA - 2 > 6) {
                int iA2 = vio.a(inputStream, 4, false);
                int iA3 = vio.a(inputStream, 2, false);
                int i = iA - 8;
                if (iA2 == 1165519206 && iA3 == 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static boolean e(InputStream inputStream, int i) throws IOException {
        b6i.g(inputStream);
        while (vio.a(inputStream, 1, false) == 255) {
            int iA = 255;
            while (iA == 255) {
                iA = vio.a(inputStream, 1, false);
            }
            if ((i == 192 && c(iA)) || iA == i) {
                return true;
            }
            if (iA != 216 && iA != 1) {
                if (iA == 217 || iA == 218) {
                    break;
                }
                inputStream.skip(vio.a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }
}
