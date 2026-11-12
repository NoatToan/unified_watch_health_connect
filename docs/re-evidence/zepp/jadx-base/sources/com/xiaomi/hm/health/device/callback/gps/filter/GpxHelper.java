package com.xiaomi.hm.health.device.callback.gps.filter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.mifit.sportlib.gpx.data.GPXDocument;
import com.huami.mifit.sportlib.gpx.data.GPXSegment;
import com.huami.mifit.sportlib.gpx.data.GPXTrack;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.mifit.sportlib.gpx.print.GPXFilePrinter;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.FileManagerFragment;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007R\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001e\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/gps/filter/GpxHelper;", "", "", "b", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "pointArrayList", "", "filePath", "", "createGPXFile", "endFix", "getGPXFilePath", "Ljava/text/SimpleDateFormat;", "a", "Lkotlin/Lazy;", "()Ljava/text/SimpleDateFormat;", "simpleDateFormat", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "", "c", LogUtil.I, "MAX_GPX_FILE_SIZE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpxHelper {

    @NotNull
    public static final GpxHelper INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy simpleDateFormat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int MAX_GPX_FILE_SIZE = 10;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createGPX file path:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createGPX exception:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr) {
            super(0);
            this.a = strArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "files:" + Arrays.toString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SimpleDateFormat> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyyMMddHHmmss", Locale.CHINESE);
        }
    }

    static {
        GpxHelper gpxHelper = new GpxHelper();
        INSTANCE = gpxHelper;
        simpleDateFormat = LazyKt__LazyJVMKt.lazy(d.a);
        tag = gpxHelper.getClass().getSimpleName();
    }

    private GpxHelper() {
    }

    private final SimpleDateFormat a() {
        return (SimpleDateFormat) simpleDateFormat.getValue();
    }

    private final boolean b() {
        return GlobalConfig.get().isBuildInner() | DeviceXFunctionsKt.getBuildConfigApi().isDebug();
    }

    public final void createGPXFile(@NotNull ArrayList<GpsPoint> pointArrayList, @NotNull String filePath) {
        if (b()) {
            HMLog.d(tag, "gpx created ----> " + filePath, new Object[0]);
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                GPXSegment gPXSegment = new GPXSegment();
                GPXTrack gPXTrack = new GPXTrack();
                gPXTrack.addSegment(gPXSegment);
                arrayList2.add(gPXTrack);
                for (GpsPoint gpsPoint : pointArrayList) {
                    GPXTrackPoint gPXTrackPoint = new GPXTrackPoint((float) gpsPoint.getLatitude(), (float) gpsPoint.getLongitude());
                    gPXTrackPoint.setTimeStamp(new Date(gpsPoint.getTime()));
                    gPXTrackPoint.setElevation((float) gpsPoint.getAltitude());
                    gPXTrackPoint.setDescription(String.valueOf(gpsPoint.getPace()));
                    gPXSegment.addPoint(gPXTrackPoint);
                }
                GPXDocument gPXDocument = new GPXDocument(arrayList, arrayList2, arrayList3);
                HMLog.debug(tag, new a(filePath));
                new GPXFilePrinter(gPXDocument, filePath, new GPXFilePrinter.GPXFilePrinterListener() { // from class: com.xiaomi.hm.health.device.callback.gps.filter.GpxHelper$createGPXFile$printer$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "onGPXPrintCompleted";
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<String> {
                        public final /* synthetic */ String a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(String str) {
                            super(0);
                            this.a = str;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "onGPXPrintError:" + this.a;
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class c extends Lambda implements Function0<String> {
                        public static final c a = new c();

                        public c() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "onGPXPrintStarted";
                        }
                    }

                    @Override // com.huami.mifit.sportlib.gpx.print.GPXFilePrinter.GPXFilePrinterListener
                    public void onGPXPrintCompleted() {
                        HMLog.debug(GpxHelper.tag, a.a);
                    }

                    @Override // com.huami.mifit.sportlib.gpx.print.GPXFilePrinter.GPXFilePrinterListener
                    public void onGPXPrintError(@NotNull String message) {
                        HMLog.debug(GpxHelper.tag, new b(message));
                    }

                    @Override // com.huami.mifit.sportlib.gpx.print.GPXFilePrinter.GPXFilePrinterListener
                    public void onGPXPrintStarted() {
                        HMLog.debug(GpxHelper.tag, c.a);
                    }
                }).print();
            } catch (Exception e) {
                HMLog.debug(tag, new b(e));
            }
        }
    }

    @Nullable
    public final String getGPXFilePath(@NotNull String endFix) {
        String gpxLogDir = FileUtils.getGpxLogDir();
        String[] list = new File(gpxLogDir).list();
        if (list != null && list.length > 9) {
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
            HMLog.debug(tag, new c(list));
            int i = 0;
            int length = (list.length - 10) + 1;
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    File file = new File(list[i]);
                    if (file.exists()) {
                        file.delete();
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return gpxLogDir + File.separator + a().format(new Date()) + "_" + endFix + FileManagerFragment.FILE_TYPE_GPX;
    }
}
