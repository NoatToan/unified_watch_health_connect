package com.huami.moving.ui.export;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.gpx.data.GPXDocument;
import com.huami.mifit.sportlib.gpx.data.GPXSegment;
import com.huami.mifit.sportlib.gpx.data.GPXTrack;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.mifit.sportlib.gpx.print.GPXFilePrinter;
import com.huami.mifit.sportlib.model.CommonTimeValuePoint;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.PointTrackLocation;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.ui.export.ExportGPXActivity;
import com.huami.moving.utils.Utils;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.wififtp.FileManagerFragment;
import com.huami.widget.toast.CustomToast;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006#"}, d2 = {"Lcom/huami/moving/ui/export/ExportGPXActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", b.r, "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "trackData", "", "filePath", "m", "o", GoogleApiAvailabilityLight.b, "", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "x", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "y", "Ljava/lang/String;", "firstFolder", "z", "secondFolder", "Ljava/io/File;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/io/File;", "finalPath", "B", "firstPath", "C", "secondPath", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class ExportGPXActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String D = "TRACK_ID";

    @NotNull
    private static final String E = "DEVICE_SOURCE";

    @NotNull
    private static final String F = "SPORT_TYPE";

    @NotNull
    public static final String TAG = "ExportGPXActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private File finalPath;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private ParsedSportDetailData trackData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private String firstFolder = "Zepp";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private String secondFolder = GPXDocument.XML.TAG_GPX;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private String firstPath = "Zepp";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private String secondPath = "Zepp" + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + GPXDocument.XML.TAG_GPX;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/moving/ui/export/ExportGPXActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "", "deviceSource", "sportType", "", "start", "", ExportGPXActivity.E, "Ljava/lang/String;", ExportGPXActivity.F, "TAG", ExportGPXActivity.D, "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, long trackId, int deviceSource, int sportType) {
            context.startActivity(new Intent(context, (Class<?>) ExportGPXActivity.class).putExtra(ExportGPXActivity.D, trackId).putExtra(ExportGPXActivity.E, deviceSource).putExtra(ExportGPXActivity.F, sportType));
        }
    }

    private final void initView() {
        o();
        ((TextView) findViewById(R.id.tv_gpx_path)).setText(getString(R.string.run_share_export_file_path, new Object[]{this.secondPath}));
        ((TextView) findViewById(R.id.tv_gpx_format)).setOnClickListener(new View.OnClickListener() { // from class: jx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExportGPXActivity.r(this.a, view);
            }
        });
    }

    private final void m(ParsedSportDetailData trackData, final String filePath) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        Float fValueOf;
        if (trackData == null) {
            return;
        }
        if (filePath == null) {
            CustomToast.showShort(this, getString(R.string.run_share_export_failed));
            return;
        }
        List<CommonTimeValuePoint> paceList = trackData.getPaceList();
        List<PointTrackLocation> pointLocationList = trackData.getPointLocationList();
        List<CommonTimeValuePoint> altiList = trackData.getAltiList();
        trackData.getTimeList();
        trackData.getSpeedList();
        List<CommonTimeValuePoint> alignedStepFreqList = trackData.getAlignedStepFreqList();
        List<CommonTimeValuePoint> paceAlignPointList = trackData.getPaceAlignPointList();
        try {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            GPXSegment gPXSegment = new GPXSegment();
            GPXTrack gPXTrack = new GPXTrack();
            gPXTrack.addSegment(gPXSegment);
            arrayList4.add(gPXTrack);
            int iIntValue = (pointLocationList == null ? null : Integer.valueOf(pointLocationList.size())).intValue();
            if (iIntValue > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    try {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        GPXTrackPoint gPXTrackPoint = new GPXTrackPoint((float) pointLocationList.get(i).getPointLatitude(), (float) pointLocationList.get(i).getPointLongitude());
                        if ((paceAlignPointList == null || paceAlignPointList.isEmpty()) || paceAlignPointList.size() != pointLocationList.size()) {
                            z = true;
                        } else {
                            gPXTrackPoint.setTimeStamp(new Date(paceAlignPointList.get(i).getAbsoluteTime() * ((long) 1000)));
                            float value = paceAlignPointList.get(i).getValue();
                            if (value == 0.0f) {
                                fValueOf = Float.valueOf(0.0f);
                                z = true;
                            } else {
                                z = true;
                                fValueOf = Float.valueOf(1 / value);
                            }
                            gPXTrackPoint.setSpeed(fValueOf);
                        }
                        if (!(altiList == null || altiList.isEmpty()) && altiList.size() == pointLocationList.size()) {
                            gPXTrackPoint.setElevation(altiList.get(i).getValue() / 100.0f);
                        }
                        if (!(paceList == null || paceList.isEmpty()) && paceList.size() == pointLocationList.size()) {
                            gPXTrackPoint.setDescription(paceList.get(i).toString());
                        }
                        if (alignedStepFreqList != null && !alignedStepFreqList.isEmpty()) {
                            z = false;
                        }
                        if (!z && alignedStepFreqList.size() == pointLocationList.size()) {
                            gPXTrackPoint.setCadence(Float.valueOf(alignedStepFreqList.get(i).getValue()));
                        }
                        GPXSegment gPXSegment2 = gPXSegment;
                        gPXSegment2.addPoint(gPXTrackPoint);
                        if (i2 >= iIntValue) {
                            break;
                        }
                        gPXSegment = gPXSegment2;
                        i = i2;
                        arrayList4 = arrayList;
                        arrayList5 = arrayList2;
                        arrayList3 = arrayList3;
                    } catch (Exception e) {
                        e = e;
                        HMLog.i(TAG, "createGPX exception:" + e.getMessage(), new Object[0]);
                        return;
                    }
                }
            } else {
                arrayList3 = arrayList3;
                arrayList = arrayList4;
                arrayList2 = arrayList5;
            }
            GPXDocument gPXDocument = new GPXDocument(arrayList3, arrayList, arrayList2, this.firstFolder + " App", HMAppConfig.getVersionName());
            HMLog.i(TAG, "createGPX file path:" + filePath, new Object[0]);
            new GPXFilePrinter(gPXDocument, filePath, new GPXFilePrinter.GPXFilePrinterListener() { // from class: com.huami.moving.ui.export.ExportGPXActivity$createGPXFile$printer$1
                @Override // com.huami.mifit.sportlib.gpx.print.GPXFilePrinter.GPXFilePrinterListener
                public void onGPXPrintCompleted() {
                    HMLog.i(ExportGPXActivity.TAG, "onGPXPrintCompleted", new Object[0]);
                    ExportSuccessActivity.Companion companion = ExportSuccessActivity.INSTANCE;
                    ExportGPXActivity exportGPXActivity = this.a;
                    companion.start(exportGPXActivity, filePath, exportGPXActivity.secondPath);
                }

                @Override // com.huami.mifit.sportlib.gpx.print.GPXFilePrinter.GPXFilePrinterListener
                public void onGPXPrintError(@NotNull String message) {
                    HMLog.i(ExportGPXActivity.TAG, "onGPXPrintError:" + message, new Object[0]);
                    ExportGPXActivity exportGPXActivity = this.a;
                    CustomToast.showShort(exportGPXActivity, exportGPXActivity.getString(R.string.run_share_export_failed));
                }

                @Override // com.huami.mifit.sportlib.gpx.print.GPXFilePrinter.GPXFilePrinterListener
                public void onGPXPrintStarted() {
                    HMLog.i(ExportGPXActivity.TAG, "onGPXPrintStarted", new Object[0]);
                }
            }).print();
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final String n() {
        if (Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            File file = new File(this.firstPath);
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(this.secondPath);
            if (!file2.exists()) {
                file2.mkdir();
            }
            this.finalPath = file2;
        }
        File file3 = this.finalPath;
        Objects.requireNonNull(file3);
        String str = file3.getPath() + File.separator + this.firstFolder + new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()) + FileManagerFragment.FILE_TYPE_GPX;
        if (new File(str).exists()) {
            return null;
        }
        return str;
    }

    private final void o() {
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            str = getExternalFilesDir(this.firstFolder) + File.separator;
        } else {
            String path = Environment.getExternalStorageDirectory().getPath();
            String str2 = File.separator;
            str = path + str2 + this.firstFolder + str2;
        }
        this.firstPath = str;
        this.secondPath = str + this.secondFolder + File.separator;
    }

    private final void p() {
        Intent intent = getIntent();
        Long lValueOf = intent == null ? null : Long.valueOf(intent.getLongExtra(D, -1L));
        Intent intent2 = getIntent();
        Integer numValueOf = intent2 == null ? null : Integer.valueOf(intent2.getIntExtra(E, -1));
        Intent intent3 = getIntent();
        Integer numValueOf2 = intent3 != null ? Integer.valueOf(intent3.getIntExtra(F, -1)) : null;
        HMLog.i(TAG, "trackId:" + lValueOf + "     source:" + numValueOf + "     type:" + numValueOf2, new Object[0]);
        this.trackData = TrackDataManager.getInstance().getTrackData(lValueOf.longValue(), numValueOf.intValue(), numValueOf2.intValue());
    }

    private final boolean q() {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        if (Build.VERSION.SDK_INT >= 23) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (checkSelfPermission(strArr[i]) != 0) {
                    return false;
                }
                if (i2 <= 1) {
                    i = i2;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ExportGPXActivity exportGPXActivity, View view) {
        HMLog.i(TAG, "setOnClickListener", new Object[0]);
        if (!exportGPXActivity.q()) {
            HMLog.i(TAG, "CustomToast    ", new Object[0]);
            CustomToast.showShort(exportGPXActivity, exportGPXActivity.getString(R.string.run_share_export_failed_storage));
            return;
        }
        String strN = exportGPXActivity.n();
        ParsedSportDetailData parsedSportDetailData = exportGPXActivity.trackData;
        HMLog.i(TAG, "setOnClickListener getGPXFilePath:" + strN + "     trackData:" + (parsedSportDetailData == null ? null : Integer.valueOf(parsedSportDetailData.getSize())), new Object[0]);
        exportGPXActivity.m(exportGPXActivity.trackData, exportGPXActivity.n());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export_gpx);
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), getString(R.string.run_share_export_file), true);
        int i2 = R.color.s1;
        setBaseTitleColor(ContextCompat.getColor(this, i2));
        setLeftImageRes(R.drawable.ic_arrow_back_20_2x, i2);
        setTitleBarBackgroundColor(ContextCompat.getColor(this, i));
        this.firstFolder = Utils.isMidong() ? "Zepp" : "ZeppLife";
        initView();
        p();
    }
}
