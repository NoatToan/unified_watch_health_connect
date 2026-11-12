package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import android.location.Location;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u001a\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u001c\u0010\u0013\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0016\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u001c\u0010\u0019\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u001c\u0010\u001c\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u001c\u0010\u001f\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u001c\u0010\"\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012\"\u001c\u0010%\u001a\u00020\u00008\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012¨\u0006&"}, d2 = {"", "path", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "readSportRecordsFromLogFile", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "startLoc", "endLoc", "", "distance", "list", "", "printGpsDistance", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportRawData;", "extractSportRawData", "a", "Ljava/lang/String;", "getSUMMARY_CHARACTERISTIC", "()Ljava/lang/String;", "SUMMARY_CHARACTERISTIC", "b", "getSUMMARY_END", "SUMMARY_END", "c", "getSUMMARY_END_C", "SUMMARY_END_C", GoogleApiAvailabilityLight.a, "getSUMMARY_END_ALT", "SUMMARY_END_ALT", "e", "getDETAIL_C", "DETAIL_C", "f", "getDETAIL_END", "DETAIL_END", "g", "getDETAIL_END_ALT", "DETAIL_END_ALT", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class GpsLogParseToolKt {

    @NotNull
    private static final String a = "summary data";

    @NotNull
    private static final String b = "summary control";

    @NotNull
    private static final String c = "type:6";

    @NotNull
    private static final String d = "fetchData control point";

    @NotNull
    private static final String e = "detail data";

    @NotNull
    private static final String f = "detail control";

    @NotNull
    private static final String g = "fetchData control point";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Ref.ObjectRef<SportRawData> a;
        public final /* synthetic */ List<SportRawData> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<SportRawData> objectRef, List<SportRawData> list) {
            super(1);
            this.a = objectRef;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRawData] */
        /* JADX WARN: Type inference failed for: r3v18, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRawData] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, GpsLogParseToolKt.getSUMMARY_CHARACTERISTIC(), 0, false, 6, (Object) null);
            if (iIndexOf$default > 0) {
                System.out.println((Object) (this.a.element.getSummarySealed() + " : " + this.a.element.getSummaryData().size()));
                if (this.a.element.getSummarySealed()) {
                    this.b.add(this.a.element);
                    this.a.element = new SportRawData();
                }
                this.a.element.appendSummary(str.substring(iIndexOf$default + GpsLogParseToolKt.getSUMMARY_CHARACTERISTIC().length() + 1, str.length()));
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) GpsLogParseToolKt.getSUMMARY_END(), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) GpsLogParseToolKt.getSUMMARY_END_ALT(), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) GpsLogParseToolKt.getSUMMARY_END_C(), false, 2, (Object) null)) {
                this.a.element.setSummarySealed(true);
            }
            if (this.a.element.getSummarySealed()) {
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, GpsLogParseToolKt.getDETAIL_C(), 0, false, 6, (Object) null);
                if (iIndexOf$default2 > 0) {
                    this.a.element.appendDetailData(str.substring(iIndexOf$default2 + GpsLogParseToolKt.getDETAIL_C().length() + 1, str.length()));
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) GpsLogParseToolKt.getDETAIL_END(), false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) GpsLogParseToolKt.getDETAIL_END_ALT(), false, 2, (Object) null)) {
                    this.a.element.setDetailSealed(true);
                }
            }
            if (this.a.element.getDetailSealed()) {
                this.b.add(this.a.element);
                this.a.element = new SportRawData();
            }
        }
    }

    public static final float distance(@NotNull GpsPoint gpsPoint, @NotNull GpsPoint gpsPoint2) {
        float[] fArr = new float[1];
        Location.distanceBetween(gpsPoint.getLatitude(), gpsPoint.getLongitude(), gpsPoint2.getLatitude(), gpsPoint2.getLongitude(), fArr);
        return fArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.xiaomi.hm.health.bt.profile.gdsp.gps.SportRawData] */
    @NotNull
    public static final List<SportRawData> extractSportRawData(@NotNull String str) {
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new SportRawData();
        kotlin.io.c.forEachLine$default(file, null, new a(objectRef, arrayList), 1, null);
        if (((SportRawData) objectRef.element).getSummarySealed() && (!((SportRawData) objectRef.element).getSummaryData().isEmpty())) {
            arrayList.add(objectRef.element);
        }
        return arrayList;
    }

    @NotNull
    public static final String getDETAIL_C() {
        return e;
    }

    @NotNull
    public static final String getDETAIL_END() {
        return f;
    }

    @NotNull
    public static final String getDETAIL_END_ALT() {
        return g;
    }

    @NotNull
    public static final String getSUMMARY_CHARACTERISTIC() {
        return a;
    }

    @NotNull
    public static final String getSUMMARY_END() {
        return b;
    }

    @NotNull
    public static final String getSUMMARY_END_ALT() {
        return d;
    }

    @NotNull
    public static final String getSUMMARY_END_C() {
        return c;
    }

    public static final void printGpsDistance(@NotNull List<? extends GpsPoint> list) {
        if (list.isEmpty()) {
            return;
        }
        Object objFirst = CollectionsKt.first((List<? extends Object>) list);
        for (GpsPoint gpsPoint : list) {
            System.out.println(distance((GpsPoint) objFirst, gpsPoint));
            objFirst = gpsPoint;
        }
    }

    @NotNull
    public static final List<GpsRecord> readSportRecordsFromLogFile(@NotNull String str) {
        List<SportRawData> listExtractSportRawData = extractSportRawData(str);
        ArrayList arrayList = new ArrayList();
        for (SportRawData sportRawData : listExtractSportRawData) {
            GpsRecord gpsRecord = new GpsRecord();
            byte[] summaryRawData = sportRawData.getSummaryRawData();
            if (!(summaryRawData.length == 0)) {
                int i = (summaryRawData[0] & 255) | ((summaryRawData[1] & 255) << 8);
                byte[] bArr = new byte[summaryRawData.length - 2];
                System.arraycopy(summaryRawData, 2, bArr, 0, summaryRawData.length - 2);
                SportSummary rVar = SportSummaryParserFactory.INSTANCE.createSummaryParser(false, i).parser(bArr);
                ISportDetailDataParser iSportDetailDataParserCreate = SportDetailParserFactory.INSTANCE.create(rVar, false);
                SportDetail sportDetail = new SportDetail();
                Iterator<T> it2 = sportRawData.getDetailData().iterator();
                while (it2.hasNext()) {
                    iSportDetailDataParserCreate.parser(sportDetail, (byte[]) it2.next(), rVar.o);
                }
                gpsRecord.setSummary(rVar);
                gpsRecord.setDetail(sportDetail);
                arrayList.add(gpsRecord);
                System.out.println(rVar.V);
            }
        }
        return arrayList;
    }
}
