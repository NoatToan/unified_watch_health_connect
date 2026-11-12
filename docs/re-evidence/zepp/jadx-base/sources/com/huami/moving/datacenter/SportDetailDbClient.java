package com.huami.moving.datacenter;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import com.google.gson.JsonSyntaxException;
import com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportDetailData;
import com.huami.moving.datacenter.filter.GpsFilterHandler;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportFunctionUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.TrackdataDao;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailDbClient implements ISportDetailDbCallback {
    private static final String a = "SportDetailDbClient";
    private static final String b = "TrackId";
    private static volatile SportDetailDbClient c;

    private SportDetailDbClient() {
    }

    private Trackdata b(DataCondition dataCondition) {
        QueryBuilder<Trackdata> queryBuilder = HMDaoManager.getInstance().getTrackdataDao().queryBuilder();
        StringBuilder sb = new StringBuilder();
        if (dataCondition.getTrackId() > -1) {
            sb.append("TRACKID=");
            sb.append(dataCondition.getTrackId());
            queryBuilder.where(TrackdataDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getSource() > -1) {
            if (sb.length() > 0) {
                sb.append(" AND SOURCE=");
                sb.append(dataCondition.getSource());
            } else {
                sb.append(" SOURCE=");
                sb.append(dataCondition.getSource());
            }
            queryBuilder.where(TrackdataDao.Properties.Source.eq(Integer.valueOf(dataCondition.getSource())), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderDesc(TrackdataDao.Properties.Trackid);
            sb.append(" ORDER BY TRACKID DESC");
        } else if (b.equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                sb.append(" ORDER BY TRACKID ASC");
                queryBuilder.orderAsc(TrackdataDao.Properties.Trackid);
            } else {
                queryBuilder.orderDesc(TrackdataDao.Properties.Trackid);
                sb.append(" ORDER BY TRACKID DESC");
            }
        }
        try {
            return queryBuilder.uniqueOrThrow();
        } catch (Exception e) {
            if ((e instanceof SQLiteBlobTooBigException) || (e instanceof IllegalStateException)) {
                return d(queryBuilder, sb, e);
            }
            if (queryBuilder.list().size() > 1) {
                e(queryBuilder, e);
            }
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    private ArrayList<Trackdata> c(StringBuilder sb) throws Throwable {
        Cursor cursor;
        Cursor cursor2;
        ArrayList<Trackdata> arrayList = new ArrayList<>();
        Cursor cursorRawQuery = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKLL FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery2 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKAL FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery3 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKGAIT FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery4 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKSPEED FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery5 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  CORRECT_ALTITUDE FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery6 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKDISTANCE FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery7 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  _id,TRACKID,SOURCE,TYPE,SEGMENT,KILOMARKED,MILEMARKED,SIZE,V,COMPRESSED,SYNCED,STROKE_SPEED,CADENCE,LAP,COACH_SEGMENT,WEATHER_INFO,DAILY_PERFORMANCE,PROVIDER FROM TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery8 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKACC FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery9 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKTIME FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery10 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKFLAG FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery11 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKPACE FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery12 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKPAUSE FROM  TRACKDATA WHERE " + sb.toString(), null);
        Cursor cursorRawQuery13 = HMDaoManager.getInstance().getTrackdataDao().getDatabase().rawQuery("SELECT  BULKBAROMETER_ALTITUDE FROM  TRACKDATA WHERE " + sb.toString(), null);
        Database database = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb2 = new StringBuilder();
        ArrayList<Trackdata> arrayList2 = arrayList;
        sb2.append("SELECT  BULKHR FROM  TRACKDATA WHERE ");
        sb2.append(sb.toString());
        Cursor cursorRawQuery14 = database.rawQuery(sb2.toString(), null);
        Database database2 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb3 = new StringBuilder();
        Cursor cursor3 = cursorRawQuery14;
        sb3.append("SELECT  BULK_ROPE_SKIPPING_FREQ FROM  TRACKDATA WHERE ");
        sb3.append(sb.toString());
        Cursor cursorRawQuery15 = database2.rawQuery(sb3.toString(), null);
        Database database3 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb4 = new StringBuilder();
        Cursor cursor4 = cursorRawQuery15;
        sb4.append("SELECT  BULKSPO2 FROM  TRACKDATA WHERE ");
        sb4.append(sb.toString());
        Cursor cursorRawQuery16 = database3.rawQuery(sb4.toString(), null);
        Database database4 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb5 = new StringBuilder();
        Cursor cursor5 = cursorRawQuery16;
        sb5.append("SELECT  BULKPRESSURE FROM  TRACKDATA WHERE ");
        sb5.append(sb.toString());
        Cursor cursorRawQuery17 = database4.rawQuery(sb5.toString(), null);
        Database database5 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb6 = new StringBuilder();
        Cursor cursor6 = cursorRawQuery17;
        sb6.append("SELECT  BULKTEMPERATURE FROM  TRACKDATA WHERE ");
        sb6.append(sb.toString());
        Cursor cursorRawQuery18 = database5.rawQuery(sb6.toString(), null);
        Database database6 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb7 = new StringBuilder();
        Cursor cursor7 = cursorRawQuery18;
        sb7.append("SELECT  TIME_DELTA_ALTITUDE FROM  TRACKDATA WHERE ");
        sb7.append(sb.toString());
        Cursor cursorRawQuery19 = database6.rawQuery(sb7.toString(), null);
        Database database7 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb8 = new StringBuilder();
        Cursor cursor8 = cursorRawQuery19;
        sb8.append("SELECT  GOLF_BEAT FROM  TRACKDATA WHERE ");
        sb8.append(sb.toString());
        Cursor cursorRawQuery20 = database7.rawQuery(sb8.toString(), null);
        Database database8 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb9 = new StringBuilder();
        Cursor cursor9 = cursorRawQuery20;
        sb9.append("SELECT  GOLF_ANGLE FROM  TRACKDATA WHERE ");
        sb9.append(sb.toString());
        Cursor cursorRawQuery21 = database8.rawQuery(sb9.toString(), null);
        Database database9 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb10 = new StringBuilder();
        Cursor cursor10 = cursorRawQuery21;
        sb10.append("SELECT  GOLF_UP_TIME FROM  TRACKDATA WHERE ");
        sb10.append(sb.toString());
        Cursor cursorRawQuery22 = database9.rawQuery(sb10.toString(), null);
        Database database10 = HMDaoManager.getInstance().getTrackdataDao().getDatabase();
        StringBuilder sb11 = new StringBuilder();
        Cursor cursor11 = cursorRawQuery22;
        sb11.append("SELECT  GOLF_DOWN_TIME FROM  TRACKDATA WHERE ");
        sb11.append(sb.toString());
        Cursor cursorRawQuery23 = database10.rawQuery(sb11.toString(), null);
        while (cursorRawQuery.moveToNext()) {
            try {
                int position = cursorRawQuery.getPosition();
                cursorRawQuery2.moveToPosition(position);
                cursorRawQuery3.moveToPosition(position);
                cursorRawQuery4.moveToPosition(position);
                cursorRawQuery5.moveToPosition(position);
                cursorRawQuery6.moveToPosition(position);
                cursorRawQuery7.moveToPosition(position);
                cursorRawQuery8.moveToPosition(position);
                cursorRawQuery9.moveToPosition(position);
                cursorRawQuery10.moveToPosition(position);
                cursorRawQuery11.moveToPosition(position);
                cursorRawQuery12.moveToPosition(position);
                cursorRawQuery13.moveToPosition(position);
                Cursor cursor12 = cursor3;
                try {
                    cursor12.moveToPosition(position);
                    cursor3 = cursor12;
                    Cursor cursor13 = cursor4;
                    try {
                        cursor13.moveToPosition(position);
                        cursor4 = cursor13;
                        Cursor cursor14 = cursor5;
                        try {
                            cursor14.moveToPosition(position);
                            cursor5 = cursor14;
                            Cursor cursor15 = cursor6;
                            try {
                                cursor15.moveToPosition(position);
                                cursor6 = cursor15;
                                Cursor cursor16 = cursor7;
                                try {
                                    cursor16.moveToPosition(position);
                                    cursor7 = cursor16;
                                    Cursor cursor17 = cursor8;
                                    try {
                                        cursor17.moveToPosition(position);
                                        cursor8 = cursor17;
                                        Cursor cursor18 = cursor9;
                                        try {
                                            cursor18.moveToPosition(position);
                                            cursor9 = cursor18;
                                            Cursor cursor19 = cursor10;
                                            try {
                                                cursor19.moveToPosition(position);
                                                cursor2 = cursor11;
                                                try {
                                                    cursor2.moveToPosition(position);
                                                    cursorRawQuery23.moveToPosition(position);
                                                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(TrackdataDao.Properties.Bulkll.columnName));
                                                    String string2 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(TrackdataDao.Properties.Bulkal.columnName));
                                                    String string3 = cursorRawQuery3.getString(cursorRawQuery3.getColumnIndex(TrackdataDao.Properties.Bulkgait.columnName));
                                                    String string4 = cursorRawQuery4.getString(cursorRawQuery4.getColumnIndex(TrackdataDao.Properties.Bulkspeed.columnName));
                                                    String string5 = cursorRawQuery5.getString(cursorRawQuery5.getColumnIndex(TrackdataDao.Properties.CorrectAltitude.columnName));
                                                    String string6 = cursorRawQuery6.getString(cursorRawQuery6.getColumnIndex(TrackdataDao.Properties.Bulkdistance.columnName));
                                                    long j = cursorRawQuery7.getLong(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Id.columnName));
                                                    int i = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Source.columnName));
                                                    cursorRawQuery6 = cursorRawQuery6;
                                                    try {
                                                        int i2 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Type.columnName));
                                                        cursorRawQuery5 = cursorRawQuery5;
                                                        try {
                                                            long j2 = cursorRawQuery7.getLong(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Trackid.columnName));
                                                            int i3 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Segment.columnName));
                                                            cursorRawQuery4 = cursorRawQuery4;
                                                            try {
                                                                String string7 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Kilomarked.columnName));
                                                                String string8 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Milemarked.columnName));
                                                                int i4 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Size.columnName));
                                                                cursorRawQuery3 = cursorRawQuery3;
                                                                try {
                                                                    int i5 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.V.columnName));
                                                                    cursorRawQuery2 = cursorRawQuery2;
                                                                    try {
                                                                        int i6 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Compressed.columnName));
                                                                        cursorRawQuery = cursorRawQuery;
                                                                        try {
                                                                            int i7 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Provider.columnName));
                                                                            int i8 = cursorRawQuery7.getInt(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Synced.columnName));
                                                                            String string9 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.StrokeSpeed.columnName));
                                                                            String string10 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Cadence.columnName));
                                                                            String string11 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.DailyPerformance.columnName));
                                                                            String string12 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.Lap.columnName));
                                                                            String string13 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.CoachSegment.columnName));
                                                                            String string14 = cursorRawQuery7.getString(cursorRawQuery7.getColumnIndex(TrackdataDao.Properties.WeatherInfo.columnName));
                                                                            String string15 = cursorRawQuery8.getString(cursorRawQuery8.getColumnIndex(TrackdataDao.Properties.Bulkacc.columnName));
                                                                            String string16 = cursorRawQuery9.getString(cursorRawQuery9.getColumnIndex(TrackdataDao.Properties.Bulktime.columnName));
                                                                            String string17 = cursorRawQuery10.getString(cursorRawQuery10.getColumnIndex(TrackdataDao.Properties.Bulkflag.columnName));
                                                                            String string18 = cursorRawQuery11.getString(cursorRawQuery11.getColumnIndex(TrackdataDao.Properties.Bulkpace.columnName));
                                                                            String string19 = cursorRawQuery12.getString(cursorRawQuery12.getColumnIndex(TrackdataDao.Properties.Bulkpause.columnName));
                                                                            String string20 = cursorRawQuery13.getString(cursorRawQuery13.getColumnIndex(TrackdataDao.Properties.BulkbarometerAltitude.columnName));
                                                                            cursorRawQuery13 = cursorRawQuery13;
                                                                            try {
                                                                                String string21 = cursor3.getString(cursor3.getColumnIndex(TrackdataDao.Properties.Bulkhr.columnName));
                                                                                cursor3 = cursor3;
                                                                                try {
                                                                                    String string22 = cursor4.getString(cursor4.getColumnIndex(TrackdataDao.Properties.BulkRopeSkippingFreq.columnName));
                                                                                    cursor4 = cursor4;
                                                                                    try {
                                                                                        String string23 = cursor5.getString(cursor5.getColumnIndex(TrackdataDao.Properties.Bulkspo2.columnName));
                                                                                        cursor5 = cursor5;
                                                                                        try {
                                                                                            String string24 = cursor6.getString(cursor6.getColumnIndex(TrackdataDao.Properties.BulkPressure.columnName));
                                                                                            cursor6 = cursor6;
                                                                                            try {
                                                                                                String string25 = cursor7.getString(cursor7.getColumnIndex(TrackdataDao.Properties.BulkTemperature.columnName));
                                                                                                cursor7 = cursor7;
                                                                                                try {
                                                                                                    String string26 = cursor8.getString(cursor8.getColumnIndex(TrackdataDao.Properties.TimeDeltaAltitude.columnName));
                                                                                                    cursor8 = cursor8;
                                                                                                    try {
                                                                                                        String string27 = cursor9.getString(cursor9.getColumnIndex(TrackdataDao.Properties.GolfBeat.columnName));
                                                                                                        cursor9 = cursor9;
                                                                                                        cursor = cursor19;
                                                                                                        try {
                                                                                                            Trackdata trackdata = new Trackdata(Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), string, string3, string2, string15, string16, string17, string18, string19, string7, string6, string20, string21, string8, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), string5, string9, string10, string11, string12, string4, string13, string14, string22, string23, string24, string25, string26, string27, cursor.getString(cursor.getColumnIndex(TrackdataDao.Properties.GolfAngle.columnName)), cursor2.getString(cursor2.getColumnIndex(TrackdataDao.Properties.GolfUpTime.columnName)), cursorRawQuery23.getString(cursorRawQuery23.getColumnIndex(TrackdataDao.Properties.GolfDownTime.columnName)));
                                                                                                            ArrayList<Trackdata> arrayList3 = arrayList2;
                                                                                                            arrayList3.add(trackdata);
                                                                                                            arrayList2 = arrayList3;
                                                                                                            cursor10 = cursor;
                                                                                                            cursor11 = cursor2;
                                                                                                            cursorRawQuery6 = cursorRawQuery6;
                                                                                                            cursorRawQuery5 = cursorRawQuery5;
                                                                                                            cursorRawQuery4 = cursorRawQuery4;
                                                                                                            cursorRawQuery3 = cursorRawQuery3;
                                                                                                            cursorRawQuery2 = cursorRawQuery2;
                                                                                                            cursorRawQuery = cursorRawQuery;
                                                                                                            cursorRawQuery13 = cursorRawQuery13;
                                                                                                        } catch (Throwable th) {
                                                                                                            th = th;
                                                                                                            cursorRawQuery.close();
                                                                                                            cursorRawQuery2.close();
                                                                                                            cursorRawQuery3.close();
                                                                                                            cursorRawQuery4.close();
                                                                                                            cursorRawQuery5.close();
                                                                                                            cursorRawQuery6.close();
                                                                                                            cursorRawQuery7.close();
                                                                                                            cursorRawQuery8.close();
                                                                                                            cursorRawQuery9.close();
                                                                                                            cursorRawQuery10.close();
                                                                                                            cursorRawQuery11.close();
                                                                                                            cursorRawQuery12.close();
                                                                                                            cursorRawQuery13.close();
                                                                                                            cursor3.close();
                                                                                                            cursor4.close();
                                                                                                            cursor5.close();
                                                                                                            cursor6.close();
                                                                                                            cursor7.close();
                                                                                                            cursor8.close();
                                                                                                            cursor9.close();
                                                                                                            cursor.close();
                                                                                                            cursor2.close();
                                                                                                            cursorRawQuery23.close();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th2) {
                                                                                                        th = th2;
                                                                                                        cursor9 = cursor9;
                                                                                                        cursor = cursor19;
                                                                                                        cursorRawQuery.close();
                                                                                                        cursorRawQuery2.close();
                                                                                                        cursorRawQuery3.close();
                                                                                                        cursorRawQuery4.close();
                                                                                                        cursorRawQuery5.close();
                                                                                                        cursorRawQuery6.close();
                                                                                                        cursorRawQuery7.close();
                                                                                                        cursorRawQuery8.close();
                                                                                                        cursorRawQuery9.close();
                                                                                                        cursorRawQuery10.close();
                                                                                                        cursorRawQuery11.close();
                                                                                                        cursorRawQuery12.close();
                                                                                                        cursorRawQuery13.close();
                                                                                                        cursor3.close();
                                                                                                        cursor4.close();
                                                                                                        cursor5.close();
                                                                                                        cursor6.close();
                                                                                                        cursor7.close();
                                                                                                        cursor8.close();
                                                                                                        cursor9.close();
                                                                                                        cursor.close();
                                                                                                        cursor2.close();
                                                                                                        cursorRawQuery23.close();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Throwable th3) {
                                                                                                    th = th3;
                                                                                                    cursor8 = cursor8;
                                                                                                }
                                                                                            } catch (Throwable th4) {
                                                                                                th = th4;
                                                                                                cursor7 = cursor7;
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            cursor6 = cursor6;
                                                                                        }
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        cursor5 = cursor5;
                                                                                    }
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    cursor4 = cursor4;
                                                                                }
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                cursor3 = cursor3;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            cursorRawQuery13 = cursorRawQuery13;
                                                                            cursor = cursor19;
                                                                            cursorRawQuery.close();
                                                                            cursorRawQuery2.close();
                                                                            cursorRawQuery3.close();
                                                                            cursorRawQuery4.close();
                                                                            cursorRawQuery5.close();
                                                                            cursorRawQuery6.close();
                                                                            cursorRawQuery7.close();
                                                                            cursorRawQuery8.close();
                                                                            cursorRawQuery9.close();
                                                                            cursorRawQuery10.close();
                                                                            cursorRawQuery11.close();
                                                                            cursorRawQuery12.close();
                                                                            cursorRawQuery13.close();
                                                                            cursor3.close();
                                                                            cursor4.close();
                                                                            cursor5.close();
                                                                            cursor6.close();
                                                                            cursor7.close();
                                                                            cursor8.close();
                                                                            cursor9.close();
                                                                            cursor.close();
                                                                            cursor2.close();
                                                                            cursorRawQuery23.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        cursorRawQuery = cursorRawQuery;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursorRawQuery = cursorRawQuery;
                                                                    cursorRawQuery2 = cursorRawQuery2;
                                                                }
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                                cursorRawQuery = cursorRawQuery;
                                                                cursorRawQuery2 = cursorRawQuery2;
                                                                cursorRawQuery13 = cursorRawQuery13;
                                                                cursorRawQuery3 = cursorRawQuery3;
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            cursorRawQuery = cursorRawQuery;
                                                            cursorRawQuery2 = cursorRawQuery2;
                                                            cursorRawQuery13 = cursorRawQuery13;
                                                            cursorRawQuery3 = cursorRawQuery3;
                                                            cursorRawQuery4 = cursorRawQuery4;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        cursorRawQuery = cursorRawQuery;
                                                        cursorRawQuery2 = cursorRawQuery2;
                                                        cursorRawQuery13 = cursorRawQuery13;
                                                        cursorRawQuery3 = cursorRawQuery3;
                                                        cursorRawQuery4 = cursorRawQuery4;
                                                        cursorRawQuery5 = cursorRawQuery5;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    cursorRawQuery = cursorRawQuery;
                                                    cursorRawQuery2 = cursorRawQuery2;
                                                    cursorRawQuery13 = cursorRawQuery13;
                                                    cursorRawQuery3 = cursorRawQuery3;
                                                    cursorRawQuery4 = cursorRawQuery4;
                                                    cursorRawQuery5 = cursorRawQuery5;
                                                    cursorRawQuery6 = cursorRawQuery6;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                cursorRawQuery = cursorRawQuery;
                                                cursorRawQuery2 = cursorRawQuery2;
                                                cursorRawQuery13 = cursorRawQuery13;
                                                cursorRawQuery3 = cursorRawQuery3;
                                                cursorRawQuery4 = cursorRawQuery4;
                                                cursorRawQuery5 = cursorRawQuery5;
                                                cursorRawQuery6 = cursorRawQuery6;
                                                cursor = cursor19;
                                                cursor2 = cursor11;
                                                cursorRawQuery.close();
                                                cursorRawQuery2.close();
                                                cursorRawQuery3.close();
                                                cursorRawQuery4.close();
                                                cursorRawQuery5.close();
                                                cursorRawQuery6.close();
                                                cursorRawQuery7.close();
                                                cursorRawQuery8.close();
                                                cursorRawQuery9.close();
                                                cursorRawQuery10.close();
                                                cursorRawQuery11.close();
                                                cursorRawQuery12.close();
                                                cursorRawQuery13.close();
                                                cursor3.close();
                                                cursor4.close();
                                                cursor5.close();
                                                cursor6.close();
                                                cursor7.close();
                                                cursor8.close();
                                                cursor9.close();
                                                cursor.close();
                                                cursor2.close();
                                                cursorRawQuery23.close();
                                                throw th;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            cursor9 = cursor18;
                                            cursor = cursor10;
                                            cursor2 = cursor11;
                                            cursorRawQuery.close();
                                            cursorRawQuery2.close();
                                            cursorRawQuery3.close();
                                            cursorRawQuery4.close();
                                            cursorRawQuery5.close();
                                            cursorRawQuery6.close();
                                            cursorRawQuery7.close();
                                            cursorRawQuery8.close();
                                            cursorRawQuery9.close();
                                            cursorRawQuery10.close();
                                            cursorRawQuery11.close();
                                            cursorRawQuery12.close();
                                            cursorRawQuery13.close();
                                            cursor3.close();
                                            cursor4.close();
                                            cursor5.close();
                                            cursor6.close();
                                            cursor7.close();
                                            cursor8.close();
                                            cursor9.close();
                                            cursor.close();
                                            cursor2.close();
                                            cursorRawQuery23.close();
                                            throw th;
                                        }
                                    } catch (Throwable th18) {
                                        th = th18;
                                        cursor8 = cursor17;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    cursor7 = cursor16;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                cursor6 = cursor15;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            cursor5 = cursor14;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        cursor4 = cursor13;
                    }
                } catch (Throwable th23) {
                    th = th23;
                    cursor3 = cursor12;
                }
            } catch (Throwable th24) {
                th = th24;
            }
        }
        ArrayList<Trackdata> arrayList4 = arrayList2;
        cursorRawQuery.close();
        cursorRawQuery2.close();
        cursorRawQuery3.close();
        cursorRawQuery4.close();
        cursorRawQuery5.close();
        cursorRawQuery6.close();
        cursorRawQuery7.close();
        cursorRawQuery8.close();
        cursorRawQuery9.close();
        cursorRawQuery10.close();
        cursorRawQuery11.close();
        cursorRawQuery12.close();
        cursorRawQuery13.close();
        cursor3.close();
        cursor4.close();
        cursor5.close();
        cursor6.close();
        cursor7.close();
        cursor8.close();
        cursor9.close();
        cursor10.close();
        cursor11.close();
        cursorRawQuery23.close();
        return arrayList4;
    }

    private Trackdata d(QueryBuilder<Trackdata> queryBuilder, StringBuilder sb, Exception exc) throws Throwable {
        ArrayList<Trackdata> arrayListC = c(sb);
        if (arrayListC.size() > 1) {
            e(queryBuilder, exc);
        }
        if (arrayListC.size() == 1) {
            return arrayListC.get(0);
        }
        HMLog.i(a, "not find any TrackData", new Object[0]);
        return null;
    }

    private void e(QueryBuilder<Trackdata> queryBuilder, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("getSportDetailData->");
        for (Trackdata trackdata : queryBuilder.list()) {
            sb.append("id:");
            sb.append(trackdata.getId());
            sb.append(",trackId:");
            sb.append(trackdata.getTrackid());
            sb.append(",source:");
            sb.append(trackdata.getSource());
            sb.append(",type:");
            sb.append(trackdata.getType());
            sb.append(",segment:");
            sb.append(trackdata.getSegment());
            sb.append('/');
        }
        exc.printStackTrace();
        HMLog.i(a, sb.toString(), new Object[0]);
    }

    private boolean f(DataCondition dataCondition) {
        return TrackRecordManager.getInstance().getTrackDataCountFromDb(dataCondition.getTrackId(), dataCondition.getSource()) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Trackdata g(DataCondition dataCondition) throws Exception {
        return !f(dataCondition) ? TrackRecordManager.getInstance().getTrackData(dataCondition.getTrackId(), dataCondition.getSource()) : b(dataCondition);
    }

    public static SportDetailDbClient getInstance() {
        if (c == null) {
            synchronized (SportDetailDbClient.class) {
                if (c == null) {
                    c = new SportDetailDbClient();
                }
            }
        }
        return c;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public void deleteSportDetailDatas(DataCondition dataCondition) {
        if (dataCondition.getTrackId() <= -1) {
            if (SportFunctionUtil.isKoreaNoGps) {
                return;
            }
            HMDaoManager.getInstance().getTrackdataDao().deleteAll();
        } else {
            QueryBuilder<Trackdata> queryBuilder = HMDaoManager.getInstance().getTrackdataDao().queryBuilder();
            if (dataCondition.getTrackId() > -1) {
                queryBuilder.where(TrackdataDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
            }
            if (dataCondition.getSource() > -1) {
                queryBuilder.where(TrackdataDao.Properties.Source.eq(Integer.valueOf(dataCondition.getSource())), new WhereCondition[0]);
            }
            queryBuilder.buildDelete().executeDeleteWithoutDetachingEntities();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public SportDetailData getSportDetailData(DataCondition dataCondition) {
        Trackdata trackData = !f(dataCondition) ? TrackRecordManager.getInstance().getTrackData(dataCondition.getTrackId(), dataCondition.getSource()) : b(dataCondition);
        if (trackData == null) {
            return null;
        }
        try {
            return (SportDetailData) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(trackData), SportDetailData.class);
        } catch (JsonSyntaxException e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
            return null;
        }
    }

    public Observable<Trackdata> getTrackDataInRx(final DataCondition dataCondition) {
        return Observable.fromCallable(new Callable() { // from class: h87
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.g(dataCondition);
            }
        });
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public void insertOrReplaceSportDetailData(SportDetailData sportDetailData) {
        try {
            Trackdata trackdata = (Trackdata) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(sportDetailData), Trackdata.class);
            if (trackdata.getSource().intValue() == 0) {
                HMDaoManager.getInstance().getTrackdataDao().insertOrReplace(new GpsFilterHandler(trackdata).filter());
            } else {
                HMDaoManager.getInstance().getTrackdataDao().insertOrReplace(trackdata);
            }
        } catch (JsonSyntaxException e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public void updateSportDetailData(SportDetailData sportDetailData) {
        try {
            Trackdata trackdata = (Trackdata) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(sportDetailData), Trackdata.class);
            if (trackdata == null || trackdata.getId().longValue() <= 0) {
                HMLog.i(a, "updateSportDetailData no primary ID!!", new Object[0]);
            } else {
                HMDaoManager.getInstance().getTrackdataDao().update(trackdata);
            }
        } catch (JsonSyntaxException e) {
            HMLog.i(a, e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
    }
}
