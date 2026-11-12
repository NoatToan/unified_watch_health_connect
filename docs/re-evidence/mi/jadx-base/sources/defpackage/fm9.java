package defpackage;

import android.net.Uri;
import coil.util.Utils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.wearable.sport.SportRemindConst;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class fm9 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        byte b2;
        if (str == null) {
            return -1;
        }
        String strT = ayf.t(str);
        strT.hashCode();
        switch (strT.hashCode()) {
            case -2123537834:
                b2 = !strT.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b2 = !strT.equals("video/mp2p") ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b2 = !strT.equals("video/mp2t") ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b2 = !strT.equals("video/webm") ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b2 = !strT.equals("audio/amr-wb") ? (byte) -1 : (byte) 4;
                break;
            case -1487394660:
                b2 = !strT.equals(Utils.MIME_TYPE_JPEG) ? (byte) -1 : (byte) 5;
                break;
            case -1248337486:
                b2 = !strT.equals("application/mp4") ? (byte) -1 : (byte) 6;
                break;
            case -1004728940:
                b2 = !strT.equals("text/vtt") ? (byte) -1 : (byte) 7;
                break;
            case -387023398:
                b2 = !strT.equals("audio/x-matroska") ? (byte) -1 : (byte) 8;
                break;
            case -43467528:
                b2 = !strT.equals("application/webm") ? (byte) -1 : (byte) 9;
                break;
            case 13915911:
                b2 = !strT.equals("video/x-flv") ? (byte) -1 : (byte) 10;
                break;
            case 187078296:
                b2 = !strT.equals("audio/ac3") ? (byte) -1 : (byte) 11;
                break;
            case 187078297:
                b2 = !strT.equals("audio/ac4") ? (byte) -1 : (byte) 12;
                break;
            case 187078669:
                b2 = !strT.equals("audio/amr") ? (byte) -1 : (byte) 13;
                break;
            case 187090232:
                b2 = !strT.equals("audio/mp4") ? (byte) -1 : (byte) 14;
                break;
            case 187091926:
                b2 = !strT.equals("audio/ogg") ? (byte) -1 : (byte) 15;
                break;
            case 187099443:
                b2 = !strT.equals("audio/wav") ? (byte) -1 : (byte) 16;
                break;
            case 1331848029:
                b2 = !strT.equals("video/mp4") ? (byte) -1 : (byte) 17;
                break;
            case 1503095341:
                b2 = !strT.equals("audio/3gpp") ? (byte) -1 : HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE;
                break;
            case 1504578661:
                b2 = !strT.equals("audio/eac3") ? (byte) -1 : HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
                break;
            case 1504619009:
                b2 = !strT.equals("audio/flac") ? (byte) -1 : (byte) 20;
                break;
            case 1504831518:
                b2 = !strT.equals("audio/mpeg") ? (byte) -1 : (byte) 21;
                break;
            case 1505118770:
                b2 = !strT.equals("audio/webm") ? (byte) -1 : (byte) 22;
                break;
            case 2039520277:
                b2 = !strT.equals("video/x-matroska") ? (byte) -1 : (byte) 23;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 11:
            case 19:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 8:
            case 9:
            case 22:
            case 23:
                return 6;
            case 4:
            case 13:
            case 18:
                return 3;
            case 5:
                return 14;
            case 6:
            case 14:
            case 17:
                return 8;
            case 7:
                return 13;
            case 10:
                return 5;
            case 12:
                return 1;
            case 15:
                return 9;
            case 16:
                return 12;
            case 20:
                return 4;
            case 21:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(SportRemindConst.URL_TYPE_SUFFIX)) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }
}
