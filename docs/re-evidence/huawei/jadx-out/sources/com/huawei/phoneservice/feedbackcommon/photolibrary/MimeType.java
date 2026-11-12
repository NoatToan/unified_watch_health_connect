package com.huawei.phoneservice.feedbackcommon.photolibrary;

import android.content.ContentResolver;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.collection.ArraySet;
import androidx.media3.common.MimeTypes;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.k;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public enum MimeType {
    JPEG("image/jpeg", a("jpg", "jpeg")),
    PNG("image/png", a("png")),
    GIF(com.huawei.openalliance.ad.constant.MimeType.GIF, a(MetaCreativeType.GIF)),
    BMP("image/x-ms-bmp", a("bmp")),
    WEBP(MimeTypes.IMAGE_WEBP, a("webp")),
    MNG("image/x-jng", a("mng")),
    MPEG(MimeTypes.VIDEO_MPEG, a("mpeg", "mpg", "mpe")),
    MP4("video/mp4", a("mp4", "m4v")),
    QUICKTIME("video/quicktime", a("mov")),
    THREEGPP(MimeTypes.VIDEO_H263, a("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", a("3g2", "3gpp2")),
    MKV(MimeTypes.VIDEO_MATROSKA, a("mkv")),
    WEBM(MimeTypes.VIDEO_WEBM, a("webm")),
    TS("video/mp2ts", a("ts")),
    AVI("video/avi", a("avi")),
    ASF("video/x-ms-asf", a("asf")),
    WMV("video/x-ms-wmv", a("wmv", "wmx", "wvx")),
    MOVIE("video/x-sgi-movie", a("movie")),
    RV("video/vnd.rn-realvideo", a("rv"));

    private static final List<String> v = Arrays.asList("bmp", "jpg", "jpeg", "png", "webp", "mng", MetaCreativeType.GIF, "mp4", "3gp", "avi", "3g2", "mpg", "mpe", "mov", "asf", "wmv", "wmx", "wvx", "movie", "ts", "rmvb", "rv", "flv", "mkv");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<String> f21889b;

    @Override // java.lang.Enum
    public String toString() {
        return this.f21888a;
    }

    public boolean checkType(ContentResolver contentResolver, Uri uri) throws Throwable {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String strA = null;
        boolean z = false;
        for (String str : this.f21889b) {
            if (str.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                strA = a(contentResolver, uri);
                if (!TextUtils.isEmpty(strA)) {
                    strA = strA.toLowerCase(Locale.US);
                }
                z = true;
            }
            if (strA != null && strA.endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static Set<MimeType> ofVideo() {
        return EnumSet.of(MPEG, MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI, ASF, WMV, MOVIE, RV);
    }

    public static Set<MimeType> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP, MNG);
    }

    public static Set<MimeType> ofAll() {
        return EnumSet.allOf(MimeType.class);
    }

    public static boolean isVideoFromUrl(String str) {
        if (k.b(str)) {
            return false;
        }
        return isVideo(getSuffixFromUrl(str));
    }

    public static boolean isVideo(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video");
    }

    public static boolean isImageFromUrl(String str) {
        if (k.b(str)) {
            return false;
        }
        return c(getSuffixFromUrl(str));
    }

    public static String getSuffixFromUrl(String str) {
        if (k.b(str)) {
            return null;
        }
        return URLConnection.guessContentTypeFromName(str);
    }

    public static String getMimeType(String str) {
        String message;
        if (!TextUtils.isEmpty(a(str))) {
            String strA = a(str);
            return (TextUtils.isEmpty(strA) || !b(strA)) ? "image/jpeg" : strA;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (str == null) {
            return "image/jpeg";
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(12);
            return (TextUtils.isEmpty(strExtractMetadata) || !b(strExtractMetadata)) ? "image/jpeg" : strExtractMetadata;
        } catch (IllegalArgumentException e) {
            message = e.getMessage();
            g.c("MimeType", message);
            return "image/jpeg";
        } catch (IllegalStateException e2) {
            message = e2.getMessage();
            g.c("MimeType", message);
            return "image/jpeg";
        } catch (Exception e3) {
            message = e3.getMessage();
            g.c("MimeType", message);
            return "image/jpeg";
        }
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("image");
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] strArrSplit = str.split("/");
            return v.contains(strArrSplit[strArrSplit.length - 1]);
        } catch (Exception unused) {
            return false;
        }
    }

    private static Set<String> a(String... strArr) {
        return new ArraySet(Arrays.asList(strArr));
    }

    public static String a(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
    }

    public static String a(ContentResolver contentResolver, Uri uri) throws Throwable {
        Throwable th;
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        if ("content".equals(uri.getScheme())) {
            try {
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            if (cursorQuery.getColumnIndex("_data") > -1) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                                cursorQuery.close();
                                return string;
                            }
                            cursorQuery.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return uri.getPath();
    }

    MimeType(String str, Set set) {
        this.f21888a = str;
        this.f21889b = set;
    }
}
