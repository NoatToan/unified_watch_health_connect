package com.google.android.exoplayer2.util;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FileTypes {
    private static final String A = ".vtt";
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    private static final String B = ".webvtt";
    private static final String C = ".jpg";
    private static final String D = ".jpeg";
    public static final int FLAC = 4;
    public static final int FLV = 5;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PS = 10;
    public static final int TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBVTT = 13;

    @VisibleForTesting
    public static final String a = "Content-Type";
    private static final String b = ".ac3";
    private static final String c = ".ec3";
    private static final String d = ".ac4";
    private static final String e = ".adts";
    private static final String f = ".aac";
    private static final String g = ".amr";
    private static final String h = ".flac";
    private static final String i = ".flv";
    private static final String j = ".mk";
    private static final String k = ".webm";
    private static final String l = ".og";
    private static final String m = ".opus";
    private static final String n = ".mp3";
    private static final String o = ".mp4";
    private static final String p = ".m4";
    private static final String q = ".mp4";
    private static final String r = ".cmf";
    private static final String s = ".ps";
    private static final String t = ".mpeg";
    private static final String u = ".mpg";
    private static final String v = ".m2p";
    private static final String w = ".ts";
    private static final String x = ".ts";
    private static final String y = ".wav";
    private static final String z = ".wave";

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static int inferFileTypeFromMimeType(@Nullable String mimeType) {
        if (mimeType == null) {
            return -1;
        }
        String strNormalizeMimeType = MimeTypes.normalizeMimeType(mimeType);
        strNormalizeMimeType.hashCode();
        switch (strNormalizeMimeType) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/jpeg":
                return 14;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "text/vtt":
                return 13;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> responseHeaders) {
        List<String> list = responseHeaders.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(b) || lastPathSegment.endsWith(c)) {
            return 0;
        }
        if (lastPathSegment.endsWith(d)) {
            return 1;
        }
        if (lastPathSegment.endsWith(e) || lastPathSegment.endsWith(f)) {
            return 2;
        }
        if (lastPathSegment.endsWith(g)) {
            return 3;
        }
        if (lastPathSegment.endsWith(h)) {
            return 4;
        }
        if (lastPathSegment.endsWith(i)) {
            return 5;
        }
        if (lastPathSegment.startsWith(j, lastPathSegment.length() - 4) || lastPathSegment.endsWith(k)) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(p, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(r, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(l, lastPathSegment.length() - 4) || lastPathSegment.endsWith(m)) {
            return 9;
        }
        if (lastPathSegment.endsWith(s) || lastPathSegment.endsWith(t) || lastPathSegment.endsWith(u) || lastPathSegment.endsWith(v)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(y) || lastPathSegment.endsWith(z)) {
            return 12;
        }
        if (lastPathSegment.endsWith(A) || lastPathSegment.endsWith(B)) {
            return 13;
        }
        return (lastPathSegment.endsWith(C) || lastPathSegment.endsWith(D)) ? 14 : -1;
    }
}
