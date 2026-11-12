package androidx.media3.common;

import android.net.Uri;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    private n() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        byte b14;
        if (str == null) {
            return -1;
        }
        String strN = x.n(str);
        strN.getClass();
        switch (strN.hashCode()) {
            case -2123537834:
                b14 = !strN.equals(MimeTypes.AUDIO_E_AC3_JOC) ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b14 = !strN.equals(MimeTypes.VIDEO_PS) ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b14 = !strN.equals(MimeTypes.VIDEO_MP2T) ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b14 = !strN.equals(MimeTypes.VIDEO_WEBM) ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b14 = !strN.equals(MimeTypes.AUDIO_AMR_WB) ? (byte) -1 : (byte) 4;
                break;
            case -1487656890:
                b14 = !strN.equals("image/avif") ? (byte) -1 : (byte) 5;
                break;
            case -1487464693:
                b14 = !strN.equals("image/heic") ? (byte) -1 : (byte) 6;
                break;
            case -1487464690:
                b14 = !strN.equals("image/heif") ? (byte) -1 : (byte) 7;
                break;
            case -1487394660:
                b14 = !strN.equals(MimeTypes.IMAGE_JPEG) ? (byte) -1 : (byte) 8;
                break;
            case -1487018032:
                b14 = !strN.equals("image/webp") ? (byte) -1 : (byte) 9;
                break;
            case -1248337486:
                b14 = !strN.equals(MimeTypes.APPLICATION_MP4) ? (byte) -1 : (byte) 10;
                break;
            case -1079884372:
                b14 = !strN.equals("video/x-msvideo") ? (byte) -1 : (byte) 11;
                break;
            case -1004728940:
                b14 = !strN.equals(MimeTypes.TEXT_VTT) ? (byte) -1 : (byte) 12;
                break;
            case -879272239:
                b14 = !strN.equals("image/bmp") ? (byte) -1 : (byte) 13;
                break;
            case -879258763:
                b14 = !strN.equals("image/png") ? (byte) -1 : (byte) 14;
                break;
            case -387023398:
                b14 = !strN.equals(MimeTypes.AUDIO_MATROSKA) ? (byte) -1 : (byte) 15;
                break;
            case -43467528:
                b14 = !strN.equals(MimeTypes.APPLICATION_WEBM) ? (byte) -1 : (byte) 16;
                break;
            case 13915911:
                b14 = !strN.equals(MimeTypes.VIDEO_FLV) ? (byte) -1 : (byte) 17;
                break;
            case 187078296:
                b14 = !strN.equals(MimeTypes.AUDIO_AC3) ? (byte) -1 : (byte) 18;
                break;
            case 187078297:
                b14 = !strN.equals(MimeTypes.AUDIO_AC4) ? (byte) -1 : (byte) 19;
                break;
            case 187078669:
                b14 = !strN.equals(MimeTypes.AUDIO_AMR) ? (byte) -1 : (byte) 20;
                break;
            case 187090232:
                b14 = !strN.equals(MimeTypes.AUDIO_MP4) ? (byte) -1 : (byte) 21;
                break;
            case 187091926:
                b14 = !strN.equals(MimeTypes.AUDIO_OGG) ? (byte) -1 : Ascii.SYN;
                break;
            case 187099443:
                b14 = !strN.equals(MimeTypes.AUDIO_WAV) ? (byte) -1 : Ascii.ETB;
                break;
            case 1331848029:
                b14 = !strN.equals(MimeTypes.VIDEO_MP4) ? (byte) -1 : Ascii.CAN;
                break;
            case 1503095341:
                b14 = !strN.equals(MimeTypes.AUDIO_AMR_NB) ? (byte) -1 : Ascii.EM;
                break;
            case 1504578661:
                b14 = !strN.equals(MimeTypes.AUDIO_E_AC3) ? (byte) -1 : Ascii.SUB;
                break;
            case 1504619009:
                b14 = !strN.equals(MimeTypes.AUDIO_FLAC) ? (byte) -1 : Ascii.ESC;
                break;
            case 1504824762:
                b14 = !strN.equals("audio/midi") ? (byte) -1 : Ascii.FS;
                break;
            case 1504831518:
                b14 = !strN.equals(MimeTypes.AUDIO_MPEG) ? (byte) -1 : Ascii.GS;
                break;
            case 1505118770:
                b14 = !strN.equals(MimeTypes.AUDIO_WEBM) ? (byte) -1 : Ascii.RS;
                break;
            case 2039520277:
                b14 = !strN.equals(MimeTypes.VIDEO_MATROSKA) ? (byte) -1 : Ascii.US;
                break;
            default:
                b14 = -1;
                break;
        }
        switch (b14) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Uri uri) {
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
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
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
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
