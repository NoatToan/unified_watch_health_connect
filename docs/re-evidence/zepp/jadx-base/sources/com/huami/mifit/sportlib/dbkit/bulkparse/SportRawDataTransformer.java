package com.huami.mifit.sportlib.dbkit.bulkparse;

import android.util.Log;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.google.gson.GsonBuilder;
import com.huami.mifit.sportlib.GPSSportApplication;
import com.huami.mifit.sportlib.dbkit.SportDetailDbKit;
import com.huami.mifit.sportlib.dbkit.SportRecordDbKit;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.SportDetailData;
import com.huami.mifit.sportlib.model.SportRecord;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u001e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J \u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportRawDataTransformer;", "", "", "trackId", "", "sportSource", "sportType", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "b", "parsed", "", "c", "deviceSource", GoogleApiAvailabilityLight.a, "fileName", "a", "parseDetailBulkData", "parseDetailBulkDataUseCache", "", "tryDeleteParsedDetailDataFile", "", "clearParsedData", "J", "currentTrackId", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "parsedSportDetailData", "<init>", "()V", "Companion", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final class SportRawDataTransformer {

    @NotNull
    public static final String HEADER = "parsedDetail_";

    @NotNull
    public static final String TAG = "SportRawDataTransformer";

    @NotNull
    public static final String TAIL = "_data.json";

    @NotNull
    public static final String UNDERLINE = "_";
    public static final boolean USE_FILE = false;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long currentTrackId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ParsedSportDetailData parsedSportDetailData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SportRawDataTransformer> c = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportRawDataTransformer$Companion;", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportRawDataTransformer;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportRawDataTransformer;", DefaultSettingsSpiCall.n, "", "HEADER", "Ljava/lang/String;", "TAG", "TAIL", "UNDERLINE", "", "USE_FILE", "Z", "<init>", "()V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportRawDataTransformer;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportRawDataTransformer getInstance() {
            return (SportRawDataTransformer) SportRawDataTransformer.c.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportRawDataTransformer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SportRawDataTransformer> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportRawDataTransformer invoke() {
            return new SportRawDataTransformer(null);
        }
    }

    private SportRawDataTransformer() {
    }

    public /* synthetic */ SportRawDataTransformer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String a(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File(GPSSportApplication.getDataStoreDir(), fileName);
            if (file.exists()) {
                sb.append(c.readText$default(file, null, 1, null));
            } else {
                Log.i(TAG, "loadFileAsString file not exists!!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LogKit.w2f(TAG, e.getMessage());
        } catch (IOException e2) {
            e2.printStackTrace();
            LogKit.w2f(TAG, e2.getMessage());
        }
        return sb.toString();
    }

    private final ParsedSportDetailData b(long trackId, int sportSource, int sportType) {
        String string;
        SportRecord sportRecord;
        this.currentTrackId = trackId;
        DataCondition dataCondition = new DataCondition(trackId, sportSource, -1);
        SportDetailData sportDetailData = SportDetailDbKit.getInstance().getSportDetailData(dataCondition);
        String str = "#trackId:" + trackId + ",source:" + sportSource + ",type:" + sportType;
        if (sportDetailData == null) {
            LogKit.w2f(TAG, "parseDetailBulkData detailData is null," + str);
            throw new IllegalStateException("parseDetailBulkData detailData is null " + str);
        }
        List<SportRecord> sportRecords = SportRecordDbKit.getInstance().getSportRecords(dataCondition);
        boolean z = true;
        if (sportRecords == null || sportRecords.isEmpty() || sportRecords.size() > 1) {
            if (sportRecords == null || sportRecords.isEmpty()) {
                string = ": empty data| ";
            } else {
                StringBuilder sb = new StringBuilder(":record->");
                for (SportRecord sportRecord2 : sportRecords) {
                    sb.append("trackId:");
                    sb.append(sportRecord2.getTrackid().longValue());
                    sb.append(",source:");
                    sb.append(sportRecord2.getSource().intValue());
                    sb.append(",type:");
                    sb.append(sportRecord2.getType().intValue());
                    sb.append(AESEncryptionHelper.SEPARATOR);
                }
                string = sb.toString();
            }
            LogKit.w2f(TAG, ("parseDetailBulkData records size not correct" + string) + str);
        }
        if (!(sportRecords == null || sportRecords.isEmpty())) {
            sportRecord = sportRecords.get(0);
        } else {
            if (trackId <= 0) {
                throw new IllegalArgumentException("param invalid no sport record: " + trackId + ", " + sportSource);
            }
            List<SportRecord> sportRecords2 = SportRecordDbKit.getInstance().getSportRecords(new DataCondition(trackId));
            if (sportRecords2 != null && !sportRecords2.isEmpty()) {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("has trackId: " + trackId + ", but no SportRecord");
            }
            sportRecord = sportRecords2.get(0);
        }
        ParsedSportDetailData parsedSportDetailData = new ParsedSportDetailData(sportRecord, sportDetailData);
        parsedSportDetailData.processAllRawDatas();
        return parsedSportDetailData;
    }

    private final String c(ParsedSportDetailData parsed) {
        String dataStoreDir = GPSSportApplication.getDataStoreDir();
        if (dataStoreDir == null || dataStoreDir.length() == 0) {
            return null;
        }
        String str = HEADER + parsed.getCurrentTrackId() + "_" + parsed.getSource() + "_" + parsed.getSportType() + TAIL;
        try {
            File file = new File(GPSSportApplication.getDataStoreDir(), str);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                LogKit.w2f(TAG, "file name should not duplicate!!! " + str);
            } else {
                file.createNewFile();
            }
            c.writeText$default(file, new GsonBuilder().create().toJson(parsed), null, 2, null);
        } catch (Exception e) {
            LogKit.w2f(TAG, e.getMessage());
            e.printStackTrace();
        }
        return str;
    }

    private final ParsedSportDetailData d(long trackId, int deviceSource, int sportType) {
        String dataStoreDir = GPSSportApplication.getDataStoreDir();
        if (dataStoreDir == null || dataStoreDir.length() == 0) {
            return null;
        }
        String strA = a(HEADER + trackId + "_" + deviceSource + "_" + sportType + TAIL);
        if (strA.length() > 0) {
            return (ParsedSportDetailData) new GsonBuilder().create().fromJson(strA, ParsedSportDetailData.class);
        }
        return null;
    }

    public final void clearParsedData() {
        this.parsedSportDetailData = null;
    }

    @NotNull
    public final ParsedSportDetailData parseDetailBulkData(long trackId, int sportSource, int sportType) {
        return b(trackId, sportSource, sportType);
    }

    @Nullable
    public final ParsedSportDetailData parseDetailBulkDataUseCache(long trackId, int sportSource, int sportType) {
        LogKit.w2f(TAG, "start find from , trackID = " + trackId + ", source=" + sportSource + ", currTId:" + this.currentTrackId + " ");
        ParsedSportDetailData parsedSportDetailData = this.parsedSportDetailData;
        if (parsedSportDetailData != null) {
            if (parsedSportDetailData != null && parsedSportDetailData.getCurrentTrackId() == trackId) {
                ParsedSportDetailData parsedSportDetailData2 = this.parsedSportDetailData;
                if (parsedSportDetailData2 != null && parsedSportDetailData2.getSource() == sportSource) {
                    return this.parsedSportDetailData;
                }
            }
        }
        this.parsedSportDetailData = null;
        this.parsedSportDetailData = b(trackId, sportSource, sportType);
        LogKit.w2f(TAG, "after find from at " + System.currentTimeMillis());
        return this.parsedSportDetailData;
    }

    public final boolean tryDeleteParsedDetailDataFile(long trackId, int sportSource, int sportType) {
        String dataStoreDir = GPSSportApplication.getDataStoreDir();
        if (dataStoreDir == null || dataStoreDir.length() == 0) {
            return false;
        }
        String str = HEADER + trackId + "_" + sportSource + "_" + sportType + TAIL;
        try {
            File file = new File(GPSSportApplication.getDataStoreDir(), str);
            if (file.exists()) {
                return file.delete();
            }
            LogKit.w2f(TAG, "file not existed: " + str);
            return false;
        } catch (Exception e) {
            LogKit.w2f(TAG, e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
