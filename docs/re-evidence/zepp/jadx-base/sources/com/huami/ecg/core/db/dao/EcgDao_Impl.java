package com.huami.ecg.core.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.ecg.core.db.convert.Converters;
import com.huami.ecg.core.db.entity.EcgData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class EcgDao_Impl implements EcgDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<EcgData> b;
    private final Converters c = new Converters();
    private final EntityInsertionAdapter<EcgData> d;
    private final EntityDeletionOrUpdateAdapter<EcgData> e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;

    public class a implements Callable<EcgData> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public a(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcgData call() throws Exception {
            EcgData ecgData;
            Cursor cursorQuery = DBUtil.query(EcgDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    ecgData = new EcgData();
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(EcgDao_Impl.this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(EcgDao_Impl.this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(EcgDao_Impl.this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData.setEcgResultData(EcgDao_Impl.this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData.setExtraStatus(EcgDao_Impl.this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                } else {
                    ecgData = null;
                }
                return ecgData;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class b implements Callable<List<EcgData>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EcgData> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(EcgDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                int i = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    EcgData ecgData = new EcgData();
                    int i2 = columnIndexOrThrow11;
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(EcgDao_Impl.this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(EcgDao_Impl.this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(EcgDao_Impl.this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    columnIndexOrThrow11 = i2;
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    int i3 = columnIndexOrThrow;
                    columnIndexOrThrow12 = columnIndexOrThrow12;
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    int i4 = i;
                    int i5 = columnIndexOrThrow2;
                    ecgData.setMeasurePosture(cursorQuery.getString(i4));
                    int i6 = columnIndexOrThrow14;
                    ecgData.setWearPosition(cursorQuery.getString(i6));
                    int i7 = columnIndexOrThrow15;
                    ecgData.setSampleRate(cursorQuery.getInt(i7));
                    int i8 = columnIndexOrThrow4;
                    int i9 = columnIndexOrThrow16;
                    int i10 = columnIndexOrThrow3;
                    ecgData.setMeasureSecond(cursorQuery.getLong(i9));
                    int i11 = columnIndexOrThrow17;
                    ecgData.setEcgResultData(EcgDao_Impl.this.c.stringToEcgResult(cursorQuery.getString(i11)));
                    int i12 = columnIndexOrThrow18;
                    ecgData.setServerRawUri(cursorQuery.getString(i12));
                    int i13 = columnIndexOrThrow19;
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(i13));
                    int i14 = columnIndexOrThrow20;
                    ecgData.setMErrorCode(cursorQuery.getInt(i14));
                    int i15 = columnIndexOrThrow21;
                    ecgData.setDiseaseType(cursorQuery.getString(i15));
                    int i16 = columnIndexOrThrow22;
                    ecgData.setMSourceAppName(cursorQuery.getString(i16));
                    columnIndexOrThrow22 = i16;
                    int i17 = columnIndexOrThrow23;
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(i17));
                    columnIndexOrThrow23 = i17;
                    int i18 = columnIndexOrThrow24;
                    ecgData.setMExtFatigue(cursorQuery.getInt(i18));
                    columnIndexOrThrow24 = i18;
                    int i19 = columnIndexOrThrow25;
                    ecgData.setMExtBPsys(cursorQuery.getInt(i19));
                    columnIndexOrThrow25 = i19;
                    int i20 = columnIndexOrThrow26;
                    ecgData.setMExtBPDias(cursorQuery.getInt(i20));
                    columnIndexOrThrow26 = i20;
                    int i21 = columnIndexOrThrow27;
                    ecgData.setThumbnailPath(cursorQuery.getString(i21));
                    columnIndexOrThrow27 = i21;
                    int i22 = columnIndexOrThrow28;
                    ecgData.setMLocalFilter(cursorQuery.getInt(i22));
                    int i23 = columnIndexOrThrow29;
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(i23));
                    int i24 = columnIndexOrThrow30;
                    ecgData.setLocalECGRawUri(cursorQuery.getString(i24));
                    int i25 = columnIndexOrThrow31;
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(i25));
                    int i26 = columnIndexOrThrow32;
                    ecgData.setUserId(cursorQuery.getString(i26));
                    columnIndexOrThrow32 = i26;
                    int i27 = columnIndexOrThrow33;
                    ecgData.setDeviceId(cursorQuery.getString(i27));
                    columnIndexOrThrow33 = i27;
                    int i28 = columnIndexOrThrow34;
                    ecgData.setDeviceSn(cursorQuery.getString(i28));
                    columnIndexOrThrow34 = i28;
                    int i29 = columnIndexOrThrow35;
                    columnIndexOrThrow35 = i29;
                    ecgData.setExtraStatus(EcgDao_Impl.this.c.stringToEcgExData(cursorQuery.getString(i29)));
                    arrayList.add(ecgData);
                    columnIndexOrThrow2 = i5;
                    columnIndexOrThrow = i3;
                    i = i4;
                    columnIndexOrThrow14 = i6;
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow17 = i11;
                    columnIndexOrThrow19 = i13;
                    columnIndexOrThrow28 = i22;
                    columnIndexOrThrow30 = i24;
                    columnIndexOrThrow3 = i10;
                    columnIndexOrThrow16 = i9;
                    columnIndexOrThrow18 = i12;
                    columnIndexOrThrow20 = i14;
                    columnIndexOrThrow21 = i15;
                    columnIndexOrThrow29 = i23;
                    columnIndexOrThrow31 = i25;
                    columnIndexOrThrow4 = i8;
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class c implements Callable<List<EcgData>> {
        public final /* synthetic */ SupportSQLiteQuery a;

        public c(SupportSQLiteQuery supportSQLiteQuery) {
            this.a = supportSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EcgData> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(EcgDao_Impl.this.a, this.a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(EcgDao_Impl.this.a(cursorQuery));
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public class d extends EntityInsertionAdapter<EcgData> {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgData ecgData) {
            supportSQLiteStatement.bindLong(1, ecgData.getTimestamp());
            if (ecgData.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, ecgData.getTimeZone());
            }
            supportSQLiteStatement.bindLong(3, ecgData.getDeviceSource());
            if (ecgData.getMeasureContentType() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, ecgData.getMeasureContentType());
            }
            supportSQLiteStatement.bindLong(5, ecgData.getCom.huami.ecg.core.db.entity.EcgData.GROUP_ID java.lang.String());
            if (ecgData.getBioIdMatchedType() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, ecgData.getBioIdMatchedType());
            }
            String strBioIdToString = EcgDao_Impl.this.c.bioIdToString(ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String());
            if (strBioIdToString == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, strBioIdToString);
            }
            String strDiagnosisToString = EcgDao_Impl.this.c.diagnosisToString(ecgData.getCom.huami.ecg.core.db.entity.EcgData.DIAGNOSIS java.lang.String());
            if (strDiagnosisToString == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, strDiagnosisToString);
            }
            String strMeasureStateToString = EcgDao_Impl.this.c.measureStateToString(ecgData.getCom.huami.ecg.core.db.entity.EcgData.MEASURE_STATE java.lang.String());
            if (strMeasureStateToString == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, strMeasureStateToString);
            }
            supportSQLiteStatement.bindLong(10, ecgData.getMeasureMethodType());
            supportSQLiteStatement.bindLong(11, ecgData.getUserAttention());
            supportSQLiteStatement.bindLong(12, ecgData.getMIsContainPPG());
            if (ecgData.getMeasurePosture() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, ecgData.getMeasurePosture());
            }
            if (ecgData.getWearPosition() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, ecgData.getWearPosition());
            }
            supportSQLiteStatement.bindLong(15, ecgData.getSampleRate());
            supportSQLiteStatement.bindLong(16, ecgData.getMeasureSecond());
            String strEcgResultToString = EcgDao_Impl.this.c.ecgResultToString(ecgData.getEcgResultData());
            if (strEcgResultToString == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, strEcgResultToString);
            }
            if (ecgData.getServerRawUri() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, ecgData.getServerRawUri());
            }
            supportSQLiteStatement.bindLong(19, ecgData.getServerUpdatedTime());
            supportSQLiteStatement.bindLong(20, ecgData.getMErrorCode());
            if (ecgData.getCom.huami.ecg.core.db.entity.EcgData.DISEASE_TYPE java.lang.String() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, ecgData.getCom.huami.ecg.core.db.entity.EcgData.DISEASE_TYPE java.lang.String());
            }
            if (ecgData.getMSourceAppName() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, ecgData.getMSourceAppName());
            }
            supportSQLiteStatement.bindLong(23, ecgData.getMNoneBioIdSelf());
            supportSQLiteStatement.bindLong(24, ecgData.getMExtFatigue());
            supportSQLiteStatement.bindLong(25, ecgData.getMExtBPsys());
            supportSQLiteStatement.bindLong(26, ecgData.getMExtBPDias());
            if (ecgData.getThumbnailPath() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, ecgData.getThumbnailPath());
            }
            supportSQLiteStatement.bindLong(28, ecgData.getMLocalFilter());
            supportSQLiteStatement.bindLong(29, ecgData.getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_LOCAL_UPDATED java.lang.String());
            if (ecgData.getLocalECGRawUri() == null) {
                supportSQLiteStatement.bindNull(30);
            } else {
                supportSQLiteStatement.bindString(30, ecgData.getLocalECGRawUri());
            }
            if (ecgData.getLocalPPGRawUri() == null) {
                supportSQLiteStatement.bindNull(31);
            } else {
                supportSQLiteStatement.bindString(31, ecgData.getLocalPPGRawUri());
            }
            if (ecgData.getUserId() == null) {
                supportSQLiteStatement.bindNull(32);
            } else {
                supportSQLiteStatement.bindString(32, ecgData.getUserId());
            }
            if (ecgData.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(33);
            } else {
                supportSQLiteStatement.bindString(33, ecgData.getDeviceId());
            }
            if (ecgData.getCom.xiaomi.hm.health.bodyfat.utils.ParamKey.deviceSn java.lang.String() == null) {
                supportSQLiteStatement.bindNull(34);
            } else {
                supportSQLiteStatement.bindString(34, ecgData.getCom.xiaomi.hm.health.bodyfat.utils.ParamKey.deviceSn java.lang.String());
            }
            String strEcgExDataToString = EcgDao_Impl.this.c.ecgExDataToString(ecgData.getExtraStatus());
            if (strEcgExDataToString == null) {
                supportSQLiteStatement.bindNull(35);
            } else {
                supportSQLiteStatement.bindString(35, strEcgExDataToString);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ecg_data` (`generatedTime`,`timeZone`,`deviceSource`,`type`,`groupId`,`bioIdMatchType`,`bioIdFeedback`,`diagnosis`,`measureState`,`online`,`isAttention`,`isContainPPG`,`posture`,`wearPosition`,`ecgSamplingRate`,`measureSeconds`,`resultData`,`rawDataURI`,`updateTime`,`errorCause`,`diseaseType`,`generateAppName`,`ext_none_bioid_self`,`ext_fatigue`,`ext_bpsys`,`ext_bpdias`,`thumbnailPath`,`filter`,`localUpdatedTime`,`rawLocalPath`,`rawLocalPathPPG`,`userId`,`deviceId`,`sn`,`extraStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class e extends EntityInsertionAdapter<EcgData> {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgData ecgData) {
            supportSQLiteStatement.bindLong(1, ecgData.getTimestamp());
            if (ecgData.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, ecgData.getTimeZone());
            }
            supportSQLiteStatement.bindLong(3, ecgData.getDeviceSource());
            if (ecgData.getMeasureContentType() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, ecgData.getMeasureContentType());
            }
            supportSQLiteStatement.bindLong(5, ecgData.getCom.huami.ecg.core.db.entity.EcgData.GROUP_ID java.lang.String());
            if (ecgData.getBioIdMatchedType() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, ecgData.getBioIdMatchedType());
            }
            String strBioIdToString = EcgDao_Impl.this.c.bioIdToString(ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String());
            if (strBioIdToString == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, strBioIdToString);
            }
            String strDiagnosisToString = EcgDao_Impl.this.c.diagnosisToString(ecgData.getCom.huami.ecg.core.db.entity.EcgData.DIAGNOSIS java.lang.String());
            if (strDiagnosisToString == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, strDiagnosisToString);
            }
            String strMeasureStateToString = EcgDao_Impl.this.c.measureStateToString(ecgData.getCom.huami.ecg.core.db.entity.EcgData.MEASURE_STATE java.lang.String());
            if (strMeasureStateToString == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, strMeasureStateToString);
            }
            supportSQLiteStatement.bindLong(10, ecgData.getMeasureMethodType());
            supportSQLiteStatement.bindLong(11, ecgData.getUserAttention());
            supportSQLiteStatement.bindLong(12, ecgData.getMIsContainPPG());
            if (ecgData.getMeasurePosture() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, ecgData.getMeasurePosture());
            }
            if (ecgData.getWearPosition() == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, ecgData.getWearPosition());
            }
            supportSQLiteStatement.bindLong(15, ecgData.getSampleRate());
            supportSQLiteStatement.bindLong(16, ecgData.getMeasureSecond());
            String strEcgResultToString = EcgDao_Impl.this.c.ecgResultToString(ecgData.getEcgResultData());
            if (strEcgResultToString == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, strEcgResultToString);
            }
            if (ecgData.getServerRawUri() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, ecgData.getServerRawUri());
            }
            supportSQLiteStatement.bindLong(19, ecgData.getServerUpdatedTime());
            supportSQLiteStatement.bindLong(20, ecgData.getMErrorCode());
            if (ecgData.getCom.huami.ecg.core.db.entity.EcgData.DISEASE_TYPE java.lang.String() == null) {
                supportSQLiteStatement.bindNull(21);
            } else {
                supportSQLiteStatement.bindString(21, ecgData.getCom.huami.ecg.core.db.entity.EcgData.DISEASE_TYPE java.lang.String());
            }
            if (ecgData.getMSourceAppName() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, ecgData.getMSourceAppName());
            }
            supportSQLiteStatement.bindLong(23, ecgData.getMNoneBioIdSelf());
            supportSQLiteStatement.bindLong(24, ecgData.getMExtFatigue());
            supportSQLiteStatement.bindLong(25, ecgData.getMExtBPsys());
            supportSQLiteStatement.bindLong(26, ecgData.getMExtBPDias());
            if (ecgData.getThumbnailPath() == null) {
                supportSQLiteStatement.bindNull(27);
            } else {
                supportSQLiteStatement.bindString(27, ecgData.getThumbnailPath());
            }
            supportSQLiteStatement.bindLong(28, ecgData.getMLocalFilter());
            supportSQLiteStatement.bindLong(29, ecgData.getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_LOCAL_UPDATED java.lang.String());
            if (ecgData.getLocalECGRawUri() == null) {
                supportSQLiteStatement.bindNull(30);
            } else {
                supportSQLiteStatement.bindString(30, ecgData.getLocalECGRawUri());
            }
            if (ecgData.getLocalPPGRawUri() == null) {
                supportSQLiteStatement.bindNull(31);
            } else {
                supportSQLiteStatement.bindString(31, ecgData.getLocalPPGRawUri());
            }
            if (ecgData.getUserId() == null) {
                supportSQLiteStatement.bindNull(32);
            } else {
                supportSQLiteStatement.bindString(32, ecgData.getUserId());
            }
            if (ecgData.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(33);
            } else {
                supportSQLiteStatement.bindString(33, ecgData.getDeviceId());
            }
            if (ecgData.getCom.xiaomi.hm.health.bodyfat.utils.ParamKey.deviceSn java.lang.String() == null) {
                supportSQLiteStatement.bindNull(34);
            } else {
                supportSQLiteStatement.bindString(34, ecgData.getCom.xiaomi.hm.health.bodyfat.utils.ParamKey.deviceSn java.lang.String());
            }
            String strEcgExDataToString = EcgDao_Impl.this.c.ecgExDataToString(ecgData.getExtraStatus());
            if (strEcgExDataToString == null) {
                supportSQLiteStatement.bindNull(35);
            } else {
                supportSQLiteStatement.bindString(35, strEcgExDataToString);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `ecg_data` (`generatedTime`,`timeZone`,`deviceSource`,`type`,`groupId`,`bioIdMatchType`,`bioIdFeedback`,`diagnosis`,`measureState`,`online`,`isAttention`,`isContainPPG`,`posture`,`wearPosition`,`ecgSamplingRate`,`measureSeconds`,`resultData`,`rawDataURI`,`updateTime`,`errorCause`,`diseaseType`,`generateAppName`,`ext_none_bioid_self`,`ext_fatigue`,`ext_bpsys`,`ext_bpdias`,`thumbnailPath`,`filter`,`localUpdatedTime`,`rawLocalPath`,`rawLocalPathPPG`,`userId`,`deviceId`,`sn`,`extraStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class f extends EntityDeletionOrUpdateAdapter<EcgData> {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgData ecgData) {
            supportSQLiteStatement.bindLong(1, ecgData.getTimestamp());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `ecg_data` WHERE `generatedTime` = ?";
        }
    }

    public class g extends SharedSQLiteStatement {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_data where generatedTime = ?";
        }
    }

    public class h extends SharedSQLiteStatement {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_data";
        }
    }

    public class i extends SharedSQLiteStatement {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_data where userId != ?";
        }
    }

    public class j implements Callable<EcgData> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public j(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcgData call() throws Exception {
            EcgData ecgData;
            Cursor cursorQuery = DBUtil.query(EcgDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    ecgData = new EcgData();
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(EcgDao_Impl.this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(EcgDao_Impl.this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(EcgDao_Impl.this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData.setEcgResultData(EcgDao_Impl.this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData.setExtraStatus(EcgDao_Impl.this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                } else {
                    ecgData = null;
                }
                return ecgData;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class k implements Callable<EcgData> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public k(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcgData call() throws Exception {
            EcgData ecgData;
            Cursor cursorQuery = DBUtil.query(EcgDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    ecgData = new EcgData();
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(EcgDao_Impl.this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(EcgDao_Impl.this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(EcgDao_Impl.this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData.setEcgResultData(EcgDao_Impl.this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData.setExtraStatus(EcgDao_Impl.this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                } else {
                    ecgData = null;
                }
                return ecgData;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class l implements Callable<EcgData> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public l(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcgData call() throws Exception {
            EcgData ecgData;
            Cursor cursorQuery = DBUtil.query(EcgDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    ecgData = new EcgData();
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(EcgDao_Impl.this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(EcgDao_Impl.this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(EcgDao_Impl.this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData.setEcgResultData(EcgDao_Impl.this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData.setExtraStatus(EcgDao_Impl.this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                } else {
                    ecgData = null;
                }
                return ecgData;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public EcgDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new d(roomDatabase);
        this.d = new e(roomDatabase);
        this.e = new f(roomDatabase);
        this.f = new g(roomDatabase);
        this.g = new h(roomDatabase);
        this.h = new i(roomDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EcgData a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("generatedTime");
        int columnIndex2 = cursor.getColumnIndex("timeZone");
        int columnIndex3 = cursor.getColumnIndex("deviceSource");
        int columnIndex4 = cursor.getColumnIndex("type");
        int columnIndex5 = cursor.getColumnIndex(EcgData.GROUP_ID);
        int columnIndex6 = cursor.getColumnIndex(EcgData.BIOID_MATCHED_TYPE);
        int columnIndex7 = cursor.getColumnIndex(EcgData.BIOID_FEEDBACK);
        int columnIndex8 = cursor.getColumnIndex(EcgData.DIAGNOSIS);
        int columnIndex9 = cursor.getColumnIndex(EcgData.MEASURE_STATE);
        int columnIndex10 = cursor.getColumnIndex("online");
        int columnIndex11 = cursor.getColumnIndex(EcgData.USER_ATTENTION);
        int columnIndex12 = cursor.getColumnIndex(EcgData.IS_CONTAIN_PPG);
        int columnIndex13 = cursor.getColumnIndex(EcgData.MEASURE_POSTURE);
        int columnIndex14 = cursor.getColumnIndex(EcgData.WEAR_POSITION);
        int columnIndex15 = cursor.getColumnIndex(EcgData.SAMPLE_RATE);
        int columnIndex16 = cursor.getColumnIndex(EcgData.MEASURE_SECOND);
        int columnIndex17 = cursor.getColumnIndex(EcgData.RESULT_DATA);
        int columnIndex18 = cursor.getColumnIndex(EcgData.SERVER_RAW_FILE_PATH);
        int columnIndex19 = cursor.getColumnIndex(EcgData.TIMESTAMP_SERVER_UPDATED);
        int columnIndex20 = cursor.getColumnIndex(EcgData.ERROR_CODE);
        int columnIndex21 = cursor.getColumnIndex(EcgData.DISEASE_TYPE);
        int columnIndex22 = cursor.getColumnIndex(EcgData.APP_NAME);
        int columnIndex23 = cursor.getColumnIndex(EcgData.LOCAL_NONE_BIOID_SELF);
        int columnIndex24 = cursor.getColumnIndex(EcgData.LOCAL_EXT_FATIGUE);
        int columnIndex25 = cursor.getColumnIndex(EcgData.LOCAL_EXT_BPSYS);
        int columnIndex26 = cursor.getColumnIndex(EcgData.LOCAL_EXT_BPDIAS);
        int columnIndex27 = cursor.getColumnIndex(EcgData.THUMBNAIL_PATH);
        int columnIndex28 = cursor.getColumnIndex("filter");
        int columnIndex29 = cursor.getColumnIndex(EcgData.TIMESTAMP_LOCAL_UPDATED);
        int columnIndex30 = cursor.getColumnIndex(EcgData.LOCAL_ECG_RAW_FILE_PATH);
        int columnIndex31 = cursor.getColumnIndex(EcgData.LOCAL_PPG_RAW_FILE_PATH);
        int columnIndex32 = cursor.getColumnIndex("userId");
        int columnIndex33 = cursor.getColumnIndex("deviceId");
        int columnIndex34 = cursor.getColumnIndex("sn");
        int columnIndex35 = cursor.getColumnIndex(EcgData.EXTRA_STATUS);
        EcgData ecgData = new EcgData();
        if (columnIndex != -1) {
            ecgData.setTimestamp(cursor.getLong(columnIndex));
        }
        if (columnIndex2 != -1) {
            ecgData.setTimeZone(cursor.getString(columnIndex2));
        }
        if (columnIndex3 != -1) {
            ecgData.setDeviceSource(cursor.getInt(columnIndex3));
        }
        if (columnIndex4 != -1) {
            ecgData.setMeasureContentType(cursor.getString(columnIndex4));
        }
        if (columnIndex5 != -1) {
            ecgData.setGroupId(cursor.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            ecgData.setBioIdMatchedType(cursor.getString(columnIndex6));
        }
        if (columnIndex7 != -1) {
            ecgData.setBioIdFeedback(this.c.stringToBioId(cursor.getString(columnIndex7)));
        }
        if (columnIndex8 != -1) {
            ecgData.setDiagnosis(this.c.stringToDiagnosis(cursor.getString(columnIndex8)));
        }
        if (columnIndex9 != -1) {
            ecgData.setMeasureState(this.c.stringToMeasureState(cursor.getString(columnIndex9)));
        }
        if (columnIndex10 != -1) {
            ecgData.setMeasureMethodType(cursor.getInt(columnIndex10));
        }
        if (columnIndex11 != -1) {
            ecgData.setUserAttention(cursor.getInt(columnIndex11));
        }
        if (columnIndex12 != -1) {
            ecgData.setMIsContainPPG(cursor.getInt(columnIndex12));
        }
        if (columnIndex13 != -1) {
            ecgData.setMeasurePosture(cursor.getString(columnIndex13));
        }
        if (columnIndex14 != -1) {
            ecgData.setWearPosition(cursor.getString(columnIndex14));
        }
        if (columnIndex15 != -1) {
            ecgData.setSampleRate(cursor.getInt(columnIndex15));
        }
        if (columnIndex16 != -1) {
            ecgData.setMeasureSecond(cursor.getLong(columnIndex16));
        }
        if (columnIndex17 != -1) {
            ecgData.setEcgResultData(this.c.stringToEcgResult(cursor.getString(columnIndex17)));
        }
        if (columnIndex18 != -1) {
            ecgData.setServerRawUri(cursor.getString(columnIndex18));
        }
        if (columnIndex19 != -1) {
            ecgData.setServerUpdatedTime(cursor.getLong(columnIndex19));
        }
        if (columnIndex20 != -1) {
            ecgData.setMErrorCode(cursor.getInt(columnIndex20));
        }
        if (columnIndex21 != -1) {
            ecgData.setDiseaseType(cursor.getString(columnIndex21));
        }
        if (columnIndex22 != -1) {
            ecgData.setMSourceAppName(cursor.getString(columnIndex22));
        }
        if (columnIndex23 != -1) {
            ecgData.setMNoneBioIdSelf(cursor.getInt(columnIndex23));
        }
        if (columnIndex24 != -1) {
            ecgData.setMExtFatigue(cursor.getInt(columnIndex24));
        }
        if (columnIndex25 != -1) {
            ecgData.setMExtBPsys(cursor.getInt(columnIndex25));
        }
        if (columnIndex26 != -1) {
            ecgData.setMExtBPDias(cursor.getInt(columnIndex26));
        }
        if (columnIndex27 != -1) {
            ecgData.setThumbnailPath(cursor.getString(columnIndex27));
        }
        if (columnIndex28 != -1) {
            ecgData.setMLocalFilter(cursor.getInt(columnIndex28));
        }
        if (columnIndex29 != -1) {
            ecgData.setLocalUpdatedTime(cursor.getLong(columnIndex29));
        }
        if (columnIndex30 != -1) {
            ecgData.setLocalECGRawUri(cursor.getString(columnIndex30));
        }
        if (columnIndex31 != -1) {
            ecgData.setLocalPPGRawUri(cursor.getString(columnIndex31));
        }
        if (columnIndex32 != -1) {
            ecgData.setUserId(cursor.getString(columnIndex32));
        }
        if (columnIndex33 != -1) {
            ecgData.setDeviceId(cursor.getString(columnIndex33));
        }
        if (columnIndex34 != -1) {
            ecgData.setDeviceSn(cursor.getString(columnIndex34));
        }
        if (columnIndex35 != -1) {
            ecgData.setExtraStatus(this.c.stringToEcgExData(cursor.getString(columnIndex35)));
        }
        return ecgData;
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void clear() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void clearFriendData(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.h.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.h.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void delete(EcgData ecgData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.handle(ecgData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public EcgData get(long j2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        EcgData ecgData;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where generatedTime = ? limit 1", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    EcgData ecgData2 = new EcgData();
                    ecgData2.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData2.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData2.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData2.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData2.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData2.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData2.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData2.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData2.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData2.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData2.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData2.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData2.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData2.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData2.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData2.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData2.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData2.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData2.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData2.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData2.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData2.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData2.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData2.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData2.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData2.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData2.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData2.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData2.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData2.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData2.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData2.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData2.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData2.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData2.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                    ecgData = ecgData2;
                } else {
                    ecgData = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return ecgData;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public List<EcgData> getAll() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data order by generatedTime asc", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                int i2 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    EcgData ecgData = new EcgData();
                    int i3 = columnIndexOrThrow11;
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    columnIndexOrThrow11 = i3;
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    columnIndexOrThrow12 = columnIndexOrThrow12;
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    int i5 = i2;
                    int i6 = columnIndexOrThrow2;
                    ecgData.setMeasurePosture(cursorQuery.getString(i5));
                    int i7 = columnIndexOrThrow14;
                    ecgData.setWearPosition(cursorQuery.getString(i7));
                    int i8 = columnIndexOrThrow15;
                    ecgData.setSampleRate(cursorQuery.getInt(i8));
                    int i9 = columnIndexOrThrow4;
                    int i10 = columnIndexOrThrow16;
                    int i11 = columnIndexOrThrow3;
                    ecgData.setMeasureSecond(cursorQuery.getLong(i10));
                    int i12 = columnIndexOrThrow17;
                    ecgData.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(i12)));
                    int i13 = columnIndexOrThrow18;
                    ecgData.setServerRawUri(cursorQuery.getString(i13));
                    int i14 = columnIndexOrThrow19;
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(i14));
                    int i15 = columnIndexOrThrow20;
                    ecgData.setMErrorCode(cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow21;
                    ecgData.setDiseaseType(cursorQuery.getString(i16));
                    int i17 = columnIndexOrThrow22;
                    ecgData.setMSourceAppName(cursorQuery.getString(i17));
                    columnIndexOrThrow22 = i17;
                    int i18 = columnIndexOrThrow23;
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(i18));
                    columnIndexOrThrow23 = i18;
                    int i19 = columnIndexOrThrow24;
                    ecgData.setMExtFatigue(cursorQuery.getInt(i19));
                    columnIndexOrThrow24 = i19;
                    int i20 = columnIndexOrThrow25;
                    ecgData.setMExtBPsys(cursorQuery.getInt(i20));
                    columnIndexOrThrow25 = i20;
                    int i21 = columnIndexOrThrow26;
                    ecgData.setMExtBPDias(cursorQuery.getInt(i21));
                    columnIndexOrThrow26 = i21;
                    int i22 = columnIndexOrThrow27;
                    ecgData.setThumbnailPath(cursorQuery.getString(i22));
                    columnIndexOrThrow27 = i22;
                    int i23 = columnIndexOrThrow28;
                    ecgData.setMLocalFilter(cursorQuery.getInt(i23));
                    int i24 = columnIndexOrThrow29;
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(i24));
                    int i25 = columnIndexOrThrow30;
                    ecgData.setLocalECGRawUri(cursorQuery.getString(i25));
                    int i26 = columnIndexOrThrow31;
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(i26));
                    int i27 = columnIndexOrThrow32;
                    ecgData.setUserId(cursorQuery.getString(i27));
                    columnIndexOrThrow32 = i27;
                    int i28 = columnIndexOrThrow33;
                    ecgData.setDeviceId(cursorQuery.getString(i28));
                    columnIndexOrThrow33 = i28;
                    int i29 = columnIndexOrThrow34;
                    ecgData.setDeviceSn(cursorQuery.getString(i29));
                    columnIndexOrThrow34 = i29;
                    int i30 = columnIndexOrThrow35;
                    columnIndexOrThrow35 = i30;
                    ecgData.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(i30)));
                    arrayList.add(ecgData);
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i4;
                    i2 = i5;
                    columnIndexOrThrow14 = i7;
                    columnIndexOrThrow15 = i8;
                    columnIndexOrThrow17 = i12;
                    columnIndexOrThrow19 = i14;
                    columnIndexOrThrow28 = i23;
                    columnIndexOrThrow30 = i25;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow16 = i10;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow20 = i15;
                    columnIndexOrThrow21 = i16;
                    columnIndexOrThrow29 = i24;
                    columnIndexOrThrow31 = i26;
                    columnIndexOrThrow4 = i9;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<List<EcgData>> getAllData() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_data"}, false, new b(RoomSQLiteQuery.acquire("select * from ecg_data order by generatedTime asc", 0)));
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<EcgData> getData(long j2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where generatedTime = ? limit 1", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_data"}, false, new j(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public EcgData getLatest(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        EcgData ecgData;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? order by generatedTime desc limit 1", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    EcgData ecgData2 = new EcgData();
                    ecgData2.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData2.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData2.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData2.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData2.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData2.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData2.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData2.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData2.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData2.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData2.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData2.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData2.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData2.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData2.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData2.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData2.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData2.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData2.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData2.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData2.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData2.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData2.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData2.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData2.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData2.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData2.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData2.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData2.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData2.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData2.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData2.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData2.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData2.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData2.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                    ecgData = ecgData2;
                } else {
                    ecgData = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return ecgData;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<EcgData> getLatestData(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? and userId = ? order by generatedTime desc limit 1", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_data"}, false, new k(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public EcgData getNext(long j2, String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        EcgData ecgData;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? and userId = ? and generatedTime > ? order by generatedTime asc limit 1", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        roomSQLiteQueryAcquire.bindLong(3, j2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    EcgData ecgData2 = new EcgData();
                    ecgData2.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData2.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData2.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData2.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData2.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData2.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData2.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData2.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData2.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData2.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData2.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData2.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData2.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData2.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData2.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData2.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData2.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData2.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData2.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData2.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData2.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData2.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData2.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData2.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData2.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData2.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData2.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData2.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData2.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData2.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData2.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData2.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData2.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData2.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData2.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                    ecgData = ecgData2;
                } else {
                    ecgData = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return ecgData;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<EcgData> getNextData(long j2, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? and generatedTime > ? order by generatedTime asc limit 1", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_data"}, false, new a(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public EcgData getPre(long j2, String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        EcgData ecgData;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? and generatedTime < ? order by generatedTime desc limit 1", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    EcgData ecgData2 = new EcgData();
                    ecgData2.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData2.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData2.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData2.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData2.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData2.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData2.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData2.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData2.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData2.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData2.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData2.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData2.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData2.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData2.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData2.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData2.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData2.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData2.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData2.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData2.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData2.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData2.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData2.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData2.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData2.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData2.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData2.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData2.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData2.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData2.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData2.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData2.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData2.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData2.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                    ecgData = ecgData2;
                } else {
                    ecgData = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return ecgData;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<EcgData> getPreData(long j2, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? and generatedTime < ? order by generatedTime desc limit 1", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_data"}, false, new l(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public List<EcgData> getUnSyncData(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where userId = ? and localUpdatedTime > updateTime or updateTime < 0", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                int i2 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    EcgData ecgData = new EcgData();
                    int i3 = columnIndexOrThrow11;
                    ecgData.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    columnIndexOrThrow11 = i3;
                    ecgData.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    columnIndexOrThrow12 = columnIndexOrThrow12;
                    ecgData.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    int i5 = i2;
                    int i6 = columnIndexOrThrow2;
                    ecgData.setMeasurePosture(cursorQuery.getString(i5));
                    int i7 = columnIndexOrThrow14;
                    ecgData.setWearPosition(cursorQuery.getString(i7));
                    columnIndexOrThrow14 = i7;
                    int i8 = columnIndexOrThrow15;
                    ecgData.setSampleRate(cursorQuery.getInt(i8));
                    int i9 = columnIndexOrThrow3;
                    int i10 = columnIndexOrThrow16;
                    int i11 = columnIndexOrThrow4;
                    ecgData.setMeasureSecond(cursorQuery.getLong(i10));
                    int i12 = columnIndexOrThrow17;
                    ecgData.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(i12)));
                    int i13 = columnIndexOrThrow18;
                    ecgData.setServerRawUri(cursorQuery.getString(i13));
                    int i14 = columnIndexOrThrow19;
                    ecgData.setServerUpdatedTime(cursorQuery.getLong(i14));
                    int i15 = columnIndexOrThrow20;
                    ecgData.setMErrorCode(cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow21;
                    ecgData.setDiseaseType(cursorQuery.getString(i16));
                    int i17 = columnIndexOrThrow22;
                    ecgData.setMSourceAppName(cursorQuery.getString(i17));
                    columnIndexOrThrow22 = i17;
                    int i18 = columnIndexOrThrow23;
                    ecgData.setMNoneBioIdSelf(cursorQuery.getInt(i18));
                    columnIndexOrThrow23 = i18;
                    int i19 = columnIndexOrThrow24;
                    ecgData.setMExtFatigue(cursorQuery.getInt(i19));
                    columnIndexOrThrow24 = i19;
                    int i20 = columnIndexOrThrow25;
                    ecgData.setMExtBPsys(cursorQuery.getInt(i20));
                    columnIndexOrThrow25 = i20;
                    int i21 = columnIndexOrThrow26;
                    ecgData.setMExtBPDias(cursorQuery.getInt(i21));
                    columnIndexOrThrow26 = i21;
                    int i22 = columnIndexOrThrow27;
                    ecgData.setThumbnailPath(cursorQuery.getString(i22));
                    columnIndexOrThrow27 = i22;
                    int i23 = columnIndexOrThrow28;
                    ecgData.setMLocalFilter(cursorQuery.getInt(i23));
                    int i24 = columnIndexOrThrow29;
                    ecgData.setLocalUpdatedTime(cursorQuery.getLong(i24));
                    int i25 = columnIndexOrThrow30;
                    ecgData.setLocalECGRawUri(cursorQuery.getString(i25));
                    int i26 = columnIndexOrThrow31;
                    ecgData.setLocalPPGRawUri(cursorQuery.getString(i26));
                    int i27 = columnIndexOrThrow32;
                    ecgData.setUserId(cursorQuery.getString(i27));
                    columnIndexOrThrow32 = i27;
                    int i28 = columnIndexOrThrow33;
                    ecgData.setDeviceId(cursorQuery.getString(i28));
                    columnIndexOrThrow33 = i28;
                    int i29 = columnIndexOrThrow34;
                    ecgData.setDeviceSn(cursorQuery.getString(i29));
                    columnIndexOrThrow34 = i29;
                    int i30 = columnIndexOrThrow35;
                    columnIndexOrThrow35 = i30;
                    ecgData.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(i30)));
                    arrayList.add(ecgData);
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i4;
                    i2 = i5;
                    columnIndexOrThrow30 = i25;
                    columnIndexOrThrow3 = i9;
                    columnIndexOrThrow15 = i8;
                    columnIndexOrThrow17 = i12;
                    columnIndexOrThrow19 = i14;
                    columnIndexOrThrow28 = i23;
                    columnIndexOrThrow31 = i26;
                    columnIndexOrThrow4 = i11;
                    columnIndexOrThrow16 = i10;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow20 = i15;
                    columnIndexOrThrow21 = i16;
                    columnIndexOrThrow29 = i24;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void insertIgnore(EcgData ecgData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(ecgData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void insertOrReplace(EcgData ecgData) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ecgData);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public Integer loadCount() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select count(generatedTime) from ecg_data", 0);
        this.a.assertNotSuspendingTransaction();
        Integer numValueOf = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                numValueOf = Integer.valueOf(cursorQuery.getInt(0));
            }
            return numValueOf;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public List<EcgData> rawQuery(SimpleSQLiteQuery simpleSQLiteQuery) {
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, simpleSQLiteQuery, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(a(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<List<EcgData>> rawQueryData(SimpleSQLiteQuery simpleSQLiteQuery) {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"ecg_data"}, false, new c(simpleSQLiteQuery));
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<List<EcgData>> getAllData(long j2, long j3, int i2, List<String> list) {
        return EcgDao.DefaultImpls.getAllData(this, j2, j3, i2, list);
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public LiveData<List<EcgData>> getAllData(String str, long j2, long j3, List<Long> list, int i2, int i3, boolean z, Map<String, String> map, List<String> list2) {
        return EcgDao.DefaultImpls.getAllData(this, str, j2, j3, list, i2, i3, z, map, list2);
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void delete(long j2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j2);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void insertIgnore(List<EcgData> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void insertOrReplace(List<EcgData> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void insertIgnore(EcgData[] ecgDataArr) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(ecgDataArr);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public void insertOrReplace(EcgData[] ecgDataArr) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ecgDataArr);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public EcgData get(long j2, String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        EcgData ecgData;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_data where generatedTime = ? AND userId = ? limit 1", 2);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generatedTime");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.GROUP_ID);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_MATCHED_TYPE);
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.BIOID_FEEDBACK);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DIAGNOSIS);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_STATE);
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "online");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.USER_ATTENTION);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.IS_CONTAIN_PPG);
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_POSTURE);
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.WEAR_POSITION);
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SAMPLE_RATE);
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.MEASURE_SECOND);
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.RESULT_DATA);
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.SERVER_RAW_FILE_PATH);
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.ERROR_CODE);
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.DISEASE_TYPE);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.APP_NAME);
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_NONE_BIOID_SELF);
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_FATIGUE);
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPSYS);
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_EXT_BPDIAS);
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.THUMBNAIL_PATH);
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filter");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_LOCAL_UPDATED);
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_ECG_RAW_FILE_PATH);
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.LOCAL_PPG_RAW_FILE_PATH);
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sn");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.EXTRA_STATUS);
                if (cursorQuery.moveToFirst()) {
                    EcgData ecgData2 = new EcgData();
                    ecgData2.setTimestamp(cursorQuery.getLong(columnIndexOrThrow));
                    ecgData2.setTimeZone(cursorQuery.getString(columnIndexOrThrow2));
                    ecgData2.setDeviceSource(cursorQuery.getInt(columnIndexOrThrow3));
                    ecgData2.setMeasureContentType(cursorQuery.getString(columnIndexOrThrow4));
                    ecgData2.setGroupId(cursorQuery.getLong(columnIndexOrThrow5));
                    ecgData2.setBioIdMatchedType(cursorQuery.getString(columnIndexOrThrow6));
                    ecgData2.setBioIdFeedback(this.c.stringToBioId(cursorQuery.getString(columnIndexOrThrow7)));
                    ecgData2.setDiagnosis(this.c.stringToDiagnosis(cursorQuery.getString(columnIndexOrThrow8)));
                    ecgData2.setMeasureState(this.c.stringToMeasureState(cursorQuery.getString(columnIndexOrThrow9)));
                    ecgData2.setMeasureMethodType(cursorQuery.getInt(columnIndexOrThrow10));
                    ecgData2.setUserAttention(cursorQuery.getInt(columnIndexOrThrow11));
                    ecgData2.setMIsContainPPG(cursorQuery.getInt(columnIndexOrThrow12));
                    ecgData2.setMeasurePosture(cursorQuery.getString(columnIndexOrThrow13));
                    ecgData2.setWearPosition(cursorQuery.getString(columnIndexOrThrow14));
                    ecgData2.setSampleRate(cursorQuery.getInt(columnIndexOrThrow15));
                    ecgData2.setMeasureSecond(cursorQuery.getLong(columnIndexOrThrow16));
                    ecgData2.setEcgResultData(this.c.stringToEcgResult(cursorQuery.getString(columnIndexOrThrow17)));
                    ecgData2.setServerRawUri(cursorQuery.getString(columnIndexOrThrow18));
                    ecgData2.setServerUpdatedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    ecgData2.setMErrorCode(cursorQuery.getInt(columnIndexOrThrow20));
                    ecgData2.setDiseaseType(cursorQuery.getString(columnIndexOrThrow21));
                    ecgData2.setMSourceAppName(cursorQuery.getString(columnIndexOrThrow22));
                    ecgData2.setMNoneBioIdSelf(cursorQuery.getInt(columnIndexOrThrow23));
                    ecgData2.setMExtFatigue(cursorQuery.getInt(columnIndexOrThrow24));
                    ecgData2.setMExtBPsys(cursorQuery.getInt(columnIndexOrThrow25));
                    ecgData2.setMExtBPDias(cursorQuery.getInt(columnIndexOrThrow26));
                    ecgData2.setThumbnailPath(cursorQuery.getString(columnIndexOrThrow27));
                    ecgData2.setMLocalFilter(cursorQuery.getInt(columnIndexOrThrow28));
                    ecgData2.setLocalUpdatedTime(cursorQuery.getLong(columnIndexOrThrow29));
                    ecgData2.setLocalECGRawUri(cursorQuery.getString(columnIndexOrThrow30));
                    ecgData2.setLocalPPGRawUri(cursorQuery.getString(columnIndexOrThrow31));
                    ecgData2.setUserId(cursorQuery.getString(columnIndexOrThrow32));
                    ecgData2.setDeviceId(cursorQuery.getString(columnIndexOrThrow33));
                    ecgData2.setDeviceSn(cursorQuery.getString(columnIndexOrThrow34));
                    ecgData2.setExtraStatus(this.c.stringToEcgExData(cursorQuery.getString(columnIndexOrThrow35)));
                    ecgData = ecgData2;
                } else {
                    ecgData = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return ecgData;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public List<EcgData> getAll(long j2, long j3, int i2, List<String> list) {
        return EcgDao.DefaultImpls.getAll(this, j2, j3, i2, list);
    }

    @Override // com.huami.ecg.core.db.dao.EcgDao
    public List<EcgData> getAll(String str, long j2, long j3, List<Long> list, int i2, int i3, boolean z, Map<String, String> map, List<String> list2) {
        return EcgDao.DefaultImpls.getAll(this, str, j2, j3, list, i2, i3, z, map, list2);
    }
}
