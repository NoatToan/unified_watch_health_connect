package com.xiaomi.fit.fitness.parser.sport.track.parser;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.r72;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0011\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0013\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00120\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0005J0\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u0005J\u0018\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0014\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050,2\u0006\u0010-\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0005J\u001b\u00104\u001a\u0004\u0018\u0001022\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u00106J\u000e\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u000202J\u001e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0002J\u000e\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020\u000bJ\u000e\u0010@\u001a\u00020:2\u0006\u0010*\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/ParserHelper;", "", "<init>", "()V", "TAG", "", ParserHelper.GPX, ParserHelper.TCX, ParserHelper.KML, ParserHelper.FIT, "NOT_VALID_ALTITUDE_VALUE", "", "DATA_FORMAT", "DATA_FORMAT2", "DATA_FORMAT3", "DATA_FORMAT4", "DATA_FORMAT5", "readTrackFile", "Lkotlin/Triple;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "path", "byteArray", "", "fileExtension", "convertTrackToFile", "trackName", "tracks", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "normalizeString", "input", "getTrackName", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "contentResolver", "Landroid/content/ContentResolver;", "getFileCreationTime", "filePath", "getFileNameFromUri", "cutFileName", "fileName", "separateFileNameAndExtension", "Lkotlin/Pair;", "fileNameWithExtension", "isSupportedParserFile", "", "fileNameAndExtension", "parseTimeString", "", "timeString", "calculateTimeDifference", "trackDataList", "(Ljava/util/List;)Ljava/lang/Long;", "formatMillisToHMS", "totalSeconds", "writeByteArrayToDownload", "Ljava/io/File;", "context", "Landroid/content/Context;", "sanitizeFileName", "isValidAltitude", "altitude", "createSaveTrackFile", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParserHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserHelper.kt\ncom/xiaomi/fit/fitness/parser/sport/track/parser/ParserHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n1755#2,3:360\n*S KotlinDebug\n*F\n+ 1 ParserHelper.kt\ncom/xiaomi/fit/fitness/parser/sport/track/parser/ParserHelper\n*L\n229#1:360,3\n*E\n"})
public final class ParserHelper {

    @NotNull
    public static final String DATA_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @NotNull
    public static final String DATA_FORMAT2 = "yyyy-MM-dd'T'HH:mm:ss.SS'Z'";

    @NotNull
    public static final String DATA_FORMAT3 = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    @NotNull
    public static final String DATA_FORMAT4 = "yyyy-MM-dd'T'HH:mm:ss";

    @NotNull
    public static final String DATA_FORMAT5 = "yyyy-MM-dd HH:mm:ss";

    @NotNull
    public static final String FIT = "FIT";

    @NotNull
    public static final String GPX = "GPX";

    @NotNull
    public static final ParserHelper INSTANCE = new ParserHelper();

    @NotNull
    public static final String KML = "KML";
    public static final double NOT_VALID_ALTITUDE_VALUE = -100000.0d;

    @NotNull
    public static final String TAG = "ParserHelper";

    @NotNull
    public static final String TCX = "TCX";

    private ParserHelper() {
    }

    public static /* synthetic */ String convertTrackToFile$default(ParserHelper parserHelper, String str, String str2, List list, SportBasicReport sportBasicReport, int i, Object obj) {
        if ((i & 8) != 0) {
            sportBasicReport = null;
        }
        return parserHelper.convertTrackToFile(str, str2, list, sportBasicReport);
    }

    private final String cutFileName(String fileName) {
        List listSplit$default;
        if (fileName == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) fileName, new String[]{"/"}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        return (String) CollectionsKt___CollectionsKt.last(listSplit$default);
    }

    public static /* synthetic */ Triple readTrackFile$default(ParserHelper parserHelper, String str, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            bArr = null;
        }
        return parserHelper.readTrackFile(str, bArr, str2);
    }

    private final String sanitizeFileName(String fileName) {
        return new Regex("[/\\\\:*?\"<>|]").replace(fileName, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Nullable
    public final Long calculateTimeDifference(@NotNull List<CommonTrackData> trackDataList) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(trackDataList, "trackDataList");
        long jLongValue2 = 0;
        if (trackDataList.isEmpty()) {
            return 0L;
        }
        CommonTrackData commonTrackData = (CommonTrackData) CollectionsKt___CollectionsKt.firstOrNull((List) trackDataList);
        if ((commonTrackData != null ? commonTrackData.getTime() : null) != null) {
            Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) trackDataList);
            Intrinsics.checkNotNull(objFirstOrNull);
            Long time = ((CommonTrackData) objFirstOrNull).getTime();
            if (time != null) {
                jLongValue = time.longValue();
            } else {
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        CommonTrackData commonTrackData2 = (CommonTrackData) CollectionsKt___CollectionsKt.lastOrNull((List) trackDataList);
        if ((commonTrackData2 != null ? commonTrackData2.getTime() : null) != null) {
            Object objLastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) trackDataList);
            Intrinsics.checkNotNull(objLastOrNull);
            Long time2 = ((CommonTrackData) objLastOrNull).getTime();
            if (time2 != null) {
                jLongValue2 = time2.longValue();
            }
        }
        return Long.valueOf(Math.abs(jLongValue2 - jLongValue) / ((long) 1000));
    }

    @NotNull
    public final String convertTrackToFile(@NotNull String fileExtension, @NotNull String trackName, @NotNull List<CommonTrackData> tracks, @Nullable SportBasicReport basicReport) {
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        try {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = fileExtension.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Logger.i(TAG, "fileExtension: " + upperCase + " ");
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase2 = fileExtension.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            int iHashCode = upperCase2.hashCode();
            if (iHashCode == 70799) {
                return upperCase2.equals(GPX) ? GpxHelper.INSTANCE.convertToGPX(trackName, tracks, basicReport) : "";
            }
            if (iHashCode == 74538) {
                return !upperCase2.equals(KML) ? "" : KmlHelper.INSTANCE.convertToKML(trackName, tracks, basicReport);
            }
            if (iHashCode == 82889 && upperCase2.equals(TCX)) {
                return TcxHelper.INSTANCE.convertToTCX(trackName, tracks, basicReport);
            }
            return "";
        } catch (Exception e) {
            Logger.i(TAG, "convertTrackToFile: " + e.getMessage() + "，type is " + fileExtension + " ");
            return "";
        }
    }

    @NotNull
    public final File createSaveTrackFile(@NotNull String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        String strO = r72.o();
        Pair<String, String> pairSeparateFileNameAndExtension = separateFileNameAndExtension(fileName);
        String strComponent1 = pairSeparateFileNameAndExtension.component1();
        String strComponent2 = pairSeparateFileNameAndExtension.component2();
        File file = new File(strO, fileName);
        int i = 0;
        while (file.exists()) {
            i++;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            file = new File(strO, strComponent1 + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str + "." + strComponent2);
        }
        file.createNewFile();
        return file;
    }

    @NotNull
    public final String formatMillisToHMS(long totalSeconds) {
        if (totalSeconds < 1) {
            return "--";
        }
        long j = 3600;
        long j2 = totalSeconds / j;
        long j3 = 60;
        long j4 = (totalSeconds % j) / j3;
        long j5 = totalSeconds % j3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Nullable
    public final String getFileCreationTime(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (!file.isFile()) {
            Logger.i(TAG, "getFileCreationTime: 文件不存在 ");
            return null;
        }
        try {
            long jLastModified = file.lastModified();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            Logger.i(TAG, "getFileCreationTime file lastModified : " + jLastModified + " ");
            return simpleDateFormat.format(new Date(jLastModified));
        } catch (Exception e) {
            Logger.i(TAG, "getFileCreationTime exception msg is : " + e.getMessage() + " ");
            return null;
        }
    }

    @Nullable
    public final String getFileNameFromUri(@NotNull Uri uri, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        String str = null;
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                cursor2.moveToFirst();
                int columnIndex = cursor2.getColumnIndex("_display_name");
                String string = columnIndex != -1 ? cursor2.getString(columnIndex) : null;
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
                str = string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        }
        return cutFileName(str);
    }

    @NotNull
    public final String getTrackName(@NotNull Uri uri, @NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        String fileNameFromUri = getFileNameFromUri(uri, contentResolver);
        if (fileNameFromUri == null) {
            fileNameFromUri = "";
        }
        String first = separateFileNameAndExtension(fileNameFromUri).getFirst();
        if (first.length() > 0) {
            return first;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String fileCreationTime = getFileCreationTime(path);
        return fileCreationTime == null ? "" : fileCreationTime;
    }

    public final boolean isSupportedParserFile(@NotNull String fileNameAndExtension) {
        Intrinsics.checkNotNullParameter(fileNameAndExtension, "fileNameAndExtension");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"gpx", "kml", "tcx"});
        try {
            String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(fileNameAndExtension, ".", "");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strSubstringAfterLast.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!listListOf.contains(lowerCase)) {
                List list = listListOf;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt__StringsJVMKt.endsWith(fileNameAndExtension, (String) it.next(), true)) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            Logger.i(TAG, "isSupportedParserFile Exception: " + e.getMessage() + " ");
            return false;
        }
    }

    public final boolean isValidAltitude(double altitude) {
        return RangesKt__RangesKt.rangeTo(-500.0d, 10000.0d).contains(Double.valueOf(altitude));
    }

    @NotNull
    public final String normalizeString(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return StringsKt__StringsJVMKt.replace$default(input, ".", "", false, 4, (Object) null);
    }

    public final long parseTimeString(@NotNull String timeString) {
        Intrinsics.checkNotNullParameter(timeString, "timeString");
        long time = 0;
        if (timeString.length() == 0) {
            return 0L;
        }
        String[] strArr = {DATA_FORMAT, DATA_FORMAT2, DATA_FORMAT3, DATA_FORMAT4, "yyyy-MM-dd HH:mm:ss"};
        for (int i = 0; i < 5; i++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[i], Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                Date date = simpleDateFormat.parse(timeString);
                if (date != null) {
                    time = date.getTime();
                }
                return time;
            } catch (Exception unused) {
            }
        }
        return time;
    }

    @NotNull
    public final Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> readTrackFile(@NotNull String path, @Nullable byte[] byteArray, @NotNull String fileExtension) {
        Boolean boolValueOf;
        InputStream fileInputStream;
        Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> gpx;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Logger.i(TAG, "readTrackFile() path：" + path);
        if (byteArray != null) {
            boolValueOf = Boolean.valueOf(byteArray.length == 0);
        } else {
            boolValueOf = null;
        }
        Logger.i(TAG, "readTrackFile() byteArray is empty：" + boolValueOf);
        String strNormalizeString = normalizeString(fileExtension);
        if (path.length() > 0) {
            File file = new File(path);
            if (!isSupportedParserFile(strNormalizeString) || !file.isFile()) {
                Logger.i(TAG, "readTrackFile：不支持");
                return new Triple<>(arrayList, arrayList2, null);
            }
        }
        try {
            fileInputStream = byteArray == null ? new FileInputStream(new File(path)) : new ByteArrayInputStream(byteArray);
        } catch (Exception e) {
            Logger.i(TAG, "inputStream exception：" + e.getMessage());
            fileInputStream = null;
        }
        if (fileInputStream == null || fileInputStream.available() == 0) {
            Logger.i(GpxHelper.TAG, "readTrackFile start,but inputStream is empty");
            return new Triple<>(arrayList, arrayList2, null);
        }
        try {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = strNormalizeString.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Logger.i(TAG, "finalFileExtension: " + upperCase + " ");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 70799) {
                if (iHashCode != 74538) {
                    gpx = (iHashCode == 82889 && upperCase.equals(TCX)) ? TcxHelper.INSTANCE.readTCX(fileInputStream) : new Triple<>(arrayList, arrayList2, null);
                } else if (upperCase.equals(KML)) {
                    gpx = KmlHelper.INSTANCE.readKML(fileInputStream);
                }
            } else if (upperCase.equals(GPX)) {
                gpx = GpxHelper.INSTANCE.readGPX(fileInputStream);
            }
            return gpx;
        } catch (Exception e2) {
            Logger.i(TAG, "readTrackFile: " + e2.getMessage() + " ");
            return new Triple<>(arrayList, arrayList2, null);
        }
    }

    @NotNull
    public final Pair<String, String> separateFileNameAndExtension(@NotNull String fileNameWithExtension) {
        Intrinsics.checkNotNullParameter(fileNameWithExtension, "fileNameWithExtension");
        if (fileNameWithExtension.length() == 0) {
            return new Pair<>("", "");
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) fileNameWithExtension, '.', false, 2, (Object) null)) {
            return new Pair<>(fileNameWithExtension, "");
        }
        try {
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) fileNameWithExtension, '.', 0, false, 6, (Object) null);
            String strSubstring = fileNameWithExtension.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = fileNameWithExtension.substring(iLastIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return new Pair<>(strSubstring, strSubstring2);
        } catch (Exception e) {
            Logger.i(TAG, "separateFileNameAndExtension: " + e.getMessage() + " ");
            return new Pair<>(fileNameWithExtension, "");
        }
    }

    @NotNull
    public final File writeByteArrayToDownload(@NotNull Context context, @NotNull byte[] byteArray, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(r72.p(), sanitizeFileName(fileName));
        if (file.exists()) {
            file.delete();
        }
        try {
            FilesKt__FileReadWriteKt.writeBytes(file, byteArray);
            return file;
        } catch (Exception e) {
            Logger.i(TAG, "writeByteArrayToDownload: " + e.getMessage() + " ");
            return new File("");
        }
    }
}
