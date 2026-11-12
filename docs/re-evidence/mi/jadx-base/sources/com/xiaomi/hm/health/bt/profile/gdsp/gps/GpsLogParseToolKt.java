package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import android.location.Location;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013\u001a\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016\u001a\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0018\u001a\u00020\u0001\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0014\u0010\f\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003¨\u0006\u001e"}, d2 = {"DETAIL_C", "", "getDETAIL_C", "()Ljava/lang/String;", "DETAIL_END", "getDETAIL_END", "DETAIL_END_ALT", "getDETAIL_END_ALT", "SUMMARY_CHARACTERISTIC", "getSUMMARY_CHARACTERISTIC", "SUMMARY_END", "getSUMMARY_END", "SUMMARY_END_ALT", "getSUMMARY_END_ALT", "SUMMARY_END_C", "getSUMMARY_END_C", "distance", "", "startLoc", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "endLoc", "extractSportRawData", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRawData;", "path", "printGpsDistance", "", "list", "readSportRecordsFromLogFile", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "bluetooth_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GpsLogParseToolKt {

    @NotNull
    private static final String DETAIL_C = "detail data";

    @NotNull
    private static final String DETAIL_END = "detail control";

    @NotNull
    private static final String DETAIL_END_ALT = "fetchData control point";

    @NotNull
    private static final String SUMMARY_CHARACTERISTIC = "summary data";

    @NotNull
    private static final String SUMMARY_END = "summary control";

    @NotNull
    private static final String SUMMARY_END_ALT = "fetchData control point";

    @NotNull
    private static final String SUMMARY_END_C = "type:6";

    public static final float distance(@NotNull GpsPoint startLoc, @NotNull GpsPoint endLoc) {
        Intrinsics.checkNotNullParameter(startLoc, "startLoc");
        Intrinsics.checkNotNullParameter(endLoc, "endLoc");
        float[] fArr = new float[1];
        Location.distanceBetween(startLoc.getLatitude(), startLoc.getLongitude(), endLoc.getLatitude(), endLoc.getLongitude(), fArr);
        return fArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRawData] */
    @NotNull
    public static final List<SportRawData> extractSportRawData(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        final ArrayList arrayList = new ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SportRawData();
        FilesKt__FileReadWriteKt.forEachLine$default(file, null, new Function1<String, Unit>() { // from class: com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsLogParseToolKt.extractSportRawData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRawData] */
            /* JADX WARN: Type inference failed for: r4v18, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRawData] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) it, GpsLogParseToolKt.getSUMMARY_CHARACTERISTIC(), 0, false, 6, (Object) null);
                if (iIndexOf$default > 0) {
                    System.out.println((Object) (objectRef.element.getSummarySealed() + " : " + objectRef.element.getSummaryData().size()));
                    if (objectRef.element.getSummarySealed()) {
                        arrayList.add(objectRef.element);
                        objectRef.element = new SportRawData();
                    }
                    SportRawData sportRawData = objectRef.element;
                    String strSubstring = it.substring(iIndexOf$default + GpsLogParseToolKt.getSUMMARY_CHARACTERISTIC().length() + 1, it.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sportRawData.appendSummary(strSubstring);
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) GpsLogParseToolKt.getSUMMARY_END(), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) GpsLogParseToolKt.getSUMMARY_END_ALT(), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) GpsLogParseToolKt.getSUMMARY_END_C(), false, 2, (Object) null)) {
                    objectRef.element.setSummarySealed(true);
                }
                if (objectRef.element.getSummarySealed()) {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) it, GpsLogParseToolKt.getDETAIL_C(), 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        SportRawData sportRawData2 = objectRef.element;
                        String strSubstring2 = it.substring(iIndexOf$default2 + GpsLogParseToolKt.getDETAIL_C().length() + 1, it.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sportRawData2.appendDetailData(strSubstring2);
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) GpsLogParseToolKt.getDETAIL_END(), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) it, (CharSequence) GpsLogParseToolKt.getDETAIL_END_ALT(), false, 2, (Object) null)) {
                        objectRef.element.setDetailSealed(true);
                    }
                }
                if (objectRef.element.getDetailSealed()) {
                    arrayList.add(objectRef.element);
                    objectRef.element = new SportRawData();
                }
            }
        }, 1, null);
        if (((SportRawData) objectRef.element).getSummarySealed() && (!((SportRawData) objectRef.element).getSummaryData().isEmpty())) {
            arrayList.add(objectRef.element);
        }
        return arrayList;
    }

    @NotNull
    public static final String getDETAIL_C() {
        return DETAIL_C;
    }

    @NotNull
    public static final String getDETAIL_END() {
        return DETAIL_END;
    }

    @NotNull
    public static final String getDETAIL_END_ALT() {
        return DETAIL_END_ALT;
    }

    @NotNull
    public static final String getSUMMARY_CHARACTERISTIC() {
        return SUMMARY_CHARACTERISTIC;
    }

    @NotNull
    public static final String getSUMMARY_END() {
        return SUMMARY_END;
    }

    @NotNull
    public static final String getSUMMARY_END_ALT() {
        return SUMMARY_END_ALT;
    }

    @NotNull
    public static final String getSUMMARY_END_C() {
        return SUMMARY_END_C;
    }

    public static final void printGpsDistance(@NotNull List<? extends GpsPoint> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            return;
        }
        Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
        for (GpsPoint gpsPoint : list) {
            System.out.println(distance((GpsPoint) objFirst, gpsPoint));
            objFirst = gpsPoint;
        }
    }

    @NotNull
    public static final List<GpsRecord> readSportRecordsFromLogFile(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List<SportRawData> listExtractSportRawData = extractSportRawData(path);
        ArrayList arrayList = new ArrayList();
        for (SportRawData sportRawData : listExtractSportRawData) {
            GpsRecord gpsRecord = new GpsRecord();
            byte[] summaryRawData = sportRawData.getSummaryRawData();
            if (summaryRawData.length != 0) {
                int i = (summaryRawData[0] & 255) | ((summaryRawData[1] & 255) << 8);
                byte[] bArr = new byte[summaryRawData.length - 2];
                System.arraycopy(summaryRawData, 2, bArr, 0, summaryRawData.length - 2);
                SportSummary sportSummary = SportSummaryParserFactory.INSTANCE.createSummaryParser(false, i).parser(bArr);
                SportDetailParserFactory.Companion companion = SportDetailParserFactory.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(sportSummary, "sportSummary");
                ISportDetailDataParser iSportDetailDataParserCreate = companion.create(sportSummary, false);
                SportDetail sportDetail = new SportDetail();
                Iterator<T> it = sportRawData.getDetailData().iterator();
                while (it.hasNext()) {
                    iSportDetailDataParserCreate.parser(sportDetail, (byte[]) it.next(), sportSummary.startTime);
                }
                gpsRecord.setSummary(sportSummary);
                gpsRecord.setDetail(sportDetail);
                arrayList.add(gpsRecord);
                System.out.println(sportSummary.riddingInfo);
            }
        }
        return arrayList;
    }
}
