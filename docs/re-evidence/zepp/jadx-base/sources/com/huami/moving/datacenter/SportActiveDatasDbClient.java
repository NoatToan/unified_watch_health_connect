package com.huami.moving.datacenter;

import android.util.Pair;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.core.model.GPSActiveBar;
import com.huami.mifit.sportlib.core.model.GPSActiveDistance;
import com.huami.mifit.sportlib.core.model.GPSActiveHr;
import com.huami.mifit.sportlib.core.model.GPSActiveMiPlusStep;
import com.huami.mifit.sportlib.core.model.GPSActiveStep;
import com.huami.mifit.sportlib.core.model.GPSActiveTrack;
import com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.ActiveMiPlusShoes;
import com.xiaomi.hm.health.databases.model.ActiveMiPlusShoesDao;
import com.xiaomi.hm.health.databases.model.Activetrack;
import com.xiaomi.hm.health.databases.model.ActivetrackBar;
import com.xiaomi.hm.health.databases.model.ActivetrackBarDao;
import com.xiaomi.hm.health.databases.model.ActivetrackDao;
import com.xiaomi.hm.health.databases.model.ActivetrackDistance;
import com.xiaomi.hm.health.databases.model.ActivetrackDistanceDao;
import com.xiaomi.hm.health.databases.model.ActivetrackStep;
import com.xiaomi.hm.health.databases.model.ActivetrackStepDao;
import com.xiaomi.hm.health.databases.model.Activetrackhr;
import com.xiaomi.hm.health.databases.model.ActivetrackhrDao;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes11.dex */
public class SportActiveDatasDbClient implements ISportActiveDatasDbCallback {
    private static final int a = -2000000;
    private static final String b = "Time";
    private static final String c = "Steps";
    private static final String d = "Id";
    private static volatile SportActiveDatasDbClient e;

    private SportActiveDatasDbClient() {
    }

    private void a(Activetrack activetrack, GPSActiveTrack gPSActiveTrack, boolean z) {
        if (z) {
            activetrack.setTrackid(Long.valueOf(gPSActiveTrack.getTrackid()));
            activetrack.setTime(Long.valueOf(gPSActiveTrack.getTimestamp()));
            activetrack.setSynced(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue()));
        }
        activetrack.setAccuracy(Integer.valueOf(gPSActiveTrack.getAccuracy()));
        activetrack.setAltitude(Float.valueOf(gPSActiveTrack.getAltitude()));
        activetrack.setLatitude(Float.valueOf(gPSActiveTrack.getLatitude()));
        activetrack.setLongitude(Float.valueOf(gPSActiveTrack.getLongitude()));
        activetrack.setSteps(Integer.valueOf(gPSActiveTrack.getSteps()));
        activetrack.setStepl(Float.valueOf(gPSActiveTrack.getStepl()));
        activetrack.setPace(Float.valueOf(gPSActiveTrack.getPace()));
        activetrack.setDistance(Float.valueOf(gPSActiveTrack.getDistance()));
        activetrack.setState(Integer.valueOf(gPSActiveTrack.getState()));
        activetrack.setExtra(gPSActiveTrack.getExtra());
        activetrack.setHr(Integer.valueOf(gPSActiveTrack.getHr()));
        activetrack.setBarometerAltitude(Float.valueOf(gPSActiveTrack.getBarometerAltitude()));
        activetrack.setSpeed(Float.valueOf(gPSActiveTrack.getSpeed()));
    }

    public static SportActiveDatasDbClient getInstance() {
        if (e == null) {
            synchronized (SportActiveDatasDbClient.class) {
                if (e == null) {
                    e = new SportActiveDatasDbClient();
                }
            }
        }
        return e;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveBaros(DataCondition dataCondition) {
        if (dataCondition.getTrackId() > -1) {
            HMDaoManager.getInstance().getActivetrackBarDao().queryBuilder().where(ActivetrackBarDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        } else {
            HMDaoManager.getInstance().getActivetrackBarDao().deleteAll();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveDistances(DataCondition dataCondition) {
        if (dataCondition.getTrackId() > -1) {
            HMDaoManager.getInstance().getActivetrackDistanceDao().queryBuilder().where(ActivetrackDistanceDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        } else {
            HMDaoManager.getInstance().getActivetrackDistanceDao().deleteAll();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveHrs(DataCondition dataCondition) {
        if (dataCondition.getTrackId() > -1) {
            HMDaoManager.getInstance().getActivetrackhrDao().queryBuilder().where(ActivetrackhrDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        } else {
            HMDaoManager.getInstance().getActivetrackhrDao().deleteAll();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveMiPlusShoeSteps(DataCondition dataCondition) {
        if (dataCondition.getTrackId() > -1) {
            HMDaoManager.getInstance().getActiveMiPlusShoesDao().queryBuilder().where(ActiveMiPlusShoesDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        } else {
            HMDaoManager.getInstance().getActiveMiPlusShoesDao().deleteAll();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveSteps(DataCondition dataCondition) {
        if (dataCondition.getTrackId() > -1) {
            HMDaoManager.getInstance().getActivetrackStepDao().deleteAll();
        } else {
            HMDaoManager.getInstance().getActivetrackStepDao().queryBuilder().where(ActivetrackStepDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void deleteActiveTracks(DataCondition dataCondition) {
        if (dataCondition.getTrackId() > -1) {
            HMDaoManager.getInstance().getActivetrackDao().queryBuilder().where(ActivetrackDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        } else {
            HMDaoManager.getInstance().getActivetrackDao().deleteAll();
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveBar> getActiveBaros(DataCondition dataCondition) {
        QueryBuilder<ActivetrackBar> queryBuilder = HMDaoManager.getInstance().getActivetrackBarDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(ActivetrackBarDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderAsc(ActivetrackBarDao.Properties.Time);
        } else if ("Time".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActivetrackBarDao.Properties.Time);
            } else {
                queryBuilder.orderDesc(ActivetrackBarDao.Properties.Time);
            }
        }
        List<ActivetrackBar> list = queryBuilder.list();
        ArrayList arrayList = new ArrayList();
        for (ActivetrackBar activetrackBar : list) {
            arrayList.add(new GPSActiveBar(activetrackBar.getTrackid().longValue(), activetrackBar.getTime().longValue(), activetrackBar.getBarometerAltitude().floatValue()));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveDistance> getActiveDistances(DataCondition dataCondition) {
        QueryBuilder<ActivetrackDistance> queryBuilder = HMDaoManager.getInstance().getActivetrackDistanceDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(ActivetrackDistanceDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderAsc(ActivetrackDistanceDao.Properties.Time);
        } else if ("Time".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActivetrackDistanceDao.Properties.Time);
            } else {
                queryBuilder.orderDesc(ActivetrackDistanceDao.Properties.Time);
            }
        }
        List<ActivetrackDistance> list = queryBuilder.list();
        ArrayList arrayList = new ArrayList();
        for (ActivetrackDistance activetrackDistance : list) {
            arrayList.add(new GPSActiveDistance(activetrackDistance.getTrackid().longValue(), activetrackDistance.getTime().longValue(), activetrackDistance.getDistance().floatValue()));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveHr> getActiveHrs(DataCondition dataCondition) {
        QueryBuilder<Activetrackhr> queryBuilder = HMDaoManager.getInstance().getActivetrackhrDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(ActivetrackhrDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderAsc(ActivetrackhrDao.Properties.Time);
        } else if ("Time".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActivetrackhrDao.Properties.Time);
            } else {
                queryBuilder.orderDesc(ActivetrackhrDao.Properties.Time);
            }
        }
        List<Activetrackhr> list = queryBuilder.list();
        ArrayList arrayList = new ArrayList();
        for (Activetrackhr activetrackhr : list) {
            GPSActiveHr gPSActiveHr = new GPSActiveHr(activetrackhr.getTrackid().longValue());
            gPSActiveHr.setHr(activetrackhr.getHr().intValue());
            gPSActiveHr.setTimestamp(activetrackhr.getTime().longValue());
            arrayList.add(gPSActiveHr);
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveMiPlusStep> getActiveMiPlusShoeSteps(DataCondition dataCondition) {
        QueryBuilder<ActiveMiPlusShoes> queryBuilder = HMDaoManager.getInstance().getActiveMiPlusShoesDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(ActiveMiPlusShoesDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderAsc(ActiveMiPlusShoesDao.Properties.Id);
        } else if ("Id".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActiveMiPlusShoesDao.Properties.Id);
            } else {
                queryBuilder.orderDesc(ActiveMiPlusShoesDao.Properties.Id);
            }
        }
        try {
            List<ActiveMiPlusShoes> list = queryBuilder.list();
            ArrayList arrayList = new ArrayList();
            for (ActiveMiPlusShoes activeMiPlusShoes : list) {
                arrayList.add(new GPSActiveMiPlusStep(activeMiPlusShoes.getTrackid().longValue(), activeMiPlusShoes.getRealSteps().intValue(), activeMiPlusShoes.getLandingTime().intValue(), activeMiPlusShoes.getFlightTime().intValue(), activeMiPlusShoes.getLeftRight().intValue()));
            }
            return arrayList;
        } catch (Exception e2) {
            HMLog.i("ActiveMiPlusShoeSteps", e2.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveStep> getActiveSteps(DataCondition dataCondition) {
        QueryBuilder<ActivetrackStep> queryBuilder = HMDaoManager.getInstance().getActivetrackStepDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(ActivetrackStepDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderAsc(ActivetrackStepDao.Properties.Time);
        } else if ("Time".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActivetrackStepDao.Properties.Time);
            } else {
                queryBuilder.orderDesc(ActivetrackStepDao.Properties.Time);
            }
        } else if ("Steps".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActivetrackStepDao.Properties.Steps);
            } else {
                queryBuilder.orderDesc(ActivetrackStepDao.Properties.Steps);
            }
        }
        List<ActivetrackStep> list = queryBuilder.list();
        ArrayList arrayList = new ArrayList();
        for (ActivetrackStep activetrackStep : list) {
            arrayList.add(new GPSActiveStep(activetrackStep.getTrackid().longValue(), activetrackStep.getTime().longValue(), activetrackStep.getSteps().intValue(), activetrackStep.getStepl() == null ? 0.0f : activetrackStep.getStepl().floatValue(), activetrackStep.getStepFreq() == null ? 0.0f : activetrackStep.getStepFreq().floatValue()));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public List<GPSActiveTrack> getActiveTracks(DataCondition dataCondition) {
        QueryBuilder<Activetrack> queryBuilder = HMDaoManager.getInstance().getActivetrackDao().queryBuilder();
        if (dataCondition.getTrackId() > -1) {
            queryBuilder.where(ActivetrackDao.Properties.Trackid.eq(Long.valueOf(dataCondition.getTrackId())), new WhereCondition[0]);
        }
        if (dataCondition.getBetween() != null && "Time".equalsIgnoreCase((String) dataCondition.getOrder().first) && dataCondition.getBetween().second != null) {
            queryBuilder.where(ActivetrackDao.Properties.Time.between((Long) ((Pair) dataCondition.getBetween().second).first, (Long) ((Pair) dataCondition.getBetween().second).second), new WhereCondition[0]);
        }
        if (dataCondition.getOrder() == null) {
            queryBuilder.orderAsc(ActivetrackDao.Properties.Time);
        } else if ("Time".equalsIgnoreCase((String) dataCondition.getOrder().first)) {
            if (((Boolean) dataCondition.getOrder().second).booleanValue()) {
                queryBuilder.orderAsc(ActivetrackDao.Properties.Time);
            } else {
                queryBuilder.orderDesc(ActivetrackDao.Properties.Time);
            }
        }
        if (dataCondition.getLimit() > 0) {
            queryBuilder.limit(dataCondition.getLimit());
        }
        List<Activetrack> list = queryBuilder.list();
        ArrayList arrayList = new ArrayList();
        for (Activetrack activetrack : list) {
            GPSActiveTrack gPSActiveTrack = new GPSActiveTrack(activetrack.getTrackid().longValue());
            gPSActiveTrack.setAccuracy(activetrack.getAccuracy().intValue());
            gPSActiveTrack.setAltitude(activetrack.getAltitude().floatValue());
            Float barometerAltitude = activetrack.getBarometerAltitude();
            gPSActiveTrack.setBarometerAltitude(barometerAltitude == null ? -2000000.0f : barometerAltitude.floatValue());
            float fFloatValue = 0.0f;
            gPSActiveTrack.setDistance(activetrack.getDistance() == null ? 0.0f : activetrack.getDistance().floatValue());
            gPSActiveTrack.setExtra(activetrack.getExtra());
            gPSActiveTrack.setHr(activetrack.getHr() == null ? 0 : activetrack.getHr().intValue());
            gPSActiveTrack.setLatitude(activetrack.getLatitude() == null ? 0.0f : activetrack.getLatitude().floatValue());
            gPSActiveTrack.setLongitude(activetrack.getLongitude() == null ? 0.0f : activetrack.getLongitude().floatValue());
            gPSActiveTrack.setPace(activetrack.getPace() == null ? 0.0f : activetrack.getPace().floatValue());
            gPSActiveTrack.setState(activetrack.getState() == null ? 0 : activetrack.getState().intValue());
            gPSActiveTrack.setStepl(activetrack.getStepl() == null ? 0.0f : activetrack.getStepl().floatValue());
            gPSActiveTrack.setSteps(activetrack.getSteps() == null ? 0 : activetrack.getSteps().intValue());
            gPSActiveTrack.setTimestamp(activetrack.getTime() == null ? 0L : activetrack.getTime().longValue());
            if (activetrack.getSpeed() != null) {
                fFloatValue = activetrack.getSpeed().floatValue();
            }
            gPSActiveTrack.setSpeed(fFloatValue);
            arrayList.add(gPSActiveTrack);
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveBaro(GPSActiveBar gPSActiveBar) {
        ActivetrackBar activetrackBar = new ActivetrackBar();
        activetrackBar.setTrackid(Long.valueOf(gPSActiveBar.getTrackId()));
        activetrackBar.setTime(Long.valueOf(gPSActiveBar.getTimestamp()));
        activetrackBar.setBarometerAltitude(Float.valueOf(gPSActiveBar.getBar()));
        HMDaoManager.getInstance().getActivetrackBarDao().insert(activetrackBar);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveDistance(GPSActiveDistance gPSActiveDistance) {
        ActivetrackDistance activetrackDistance = new ActivetrackDistance();
        activetrackDistance.setTrackid(Long.valueOf(gPSActiveDistance.getTrackId()));
        activetrackDistance.setTime(Long.valueOf(gPSActiveDistance.getTimestamp()));
        activetrackDistance.setDistance(Float.valueOf(gPSActiveDistance.getDistance()));
        HMDaoManager.getInstance().getActivetrackDistanceDao().insert(activetrackDistance);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveHr(GPSActiveHr gPSActiveHr) {
        Activetrackhr activetrackhr = new Activetrackhr();
        activetrackhr.setTrackid(Long.valueOf(gPSActiveHr.getTrackId()));
        activetrackhr.setTime(Long.valueOf(gPSActiveHr.getTimestamp()));
        activetrackhr.setHr(Integer.valueOf(gPSActiveHr.getHr()));
        HMDaoManager.getInstance().getActivetrackhrDao().insert(activetrackhr);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveMiPlusShoeStep(GPSActiveMiPlusStep gPSActiveMiPlusStep) {
        ActiveMiPlusShoes activeMiPlusShoes = new ActiveMiPlusShoes();
        activeMiPlusShoes.setTrackid(Long.valueOf(gPSActiveMiPlusStep.getTrackId()));
        activeMiPlusShoes.setRealSteps(Integer.valueOf(gPSActiveMiPlusStep.getStep()));
        activeMiPlusShoes.setFlightTime(Integer.valueOf(gPSActiveMiPlusStep.getFlyTime()));
        activeMiPlusShoes.setLandingTime(Integer.valueOf(gPSActiveMiPlusStep.getTouchTime()));
        activeMiPlusShoes.setLeftRight(Integer.valueOf(gPSActiveMiPlusStep.getLeftRight()));
        HMDaoManager.getInstance().getActiveMiPlusShoesDao().insert(activeMiPlusShoes);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveStep(GPSActiveStep gPSActiveStep) {
        ActivetrackStep activetrackStep = new ActivetrackStep();
        activetrackStep.setTrackid(Long.valueOf(gPSActiveStep.getTrackId()));
        activetrackStep.setTime(Long.valueOf(gPSActiveStep.getTimestamp()));
        activetrackStep.setSteps(Integer.valueOf(gPSActiveStep.getStep()));
        activetrackStep.setStepl(Float.valueOf(gPSActiveStep.getStepLength()));
        activetrackStep.setStepFreq(Float.valueOf(gPSActiveStep.getStepFreq()));
        HMDaoManager.getInstance().getActivetrackStepDao().insert(activetrackStep);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveTrack(GPSActiveTrack gPSActiveTrack) {
        Activetrack activetrack = new Activetrack();
        a(activetrack, gPSActiveTrack, true);
        HMDaoManager.getInstance().getActivetrackDao().insert(activetrack);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertActiveTrackList(List<GPSActiveTrack> list) {
        ArrayList arrayList = new ArrayList();
        for (GPSActiveTrack gPSActiveTrack : list) {
            Activetrack activetrack = new Activetrack();
            a(activetrack, gPSActiveTrack, true);
            arrayList.add(activetrack);
        }
        HMDaoManager.getInstance().getActivetrackDao().insertInTx(arrayList);
        HMLog.i("ActiveDataDbClient", "insertActiveTrackList insert data size=" + arrayList.size(), new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void insertOrReplaceActiveTrack(GPSActiveTrack gPSActiveTrack) {
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback
    public void updateActiveTrack(GPSActiveTrack gPSActiveTrack) {
        QueryBuilder<Activetrack> queryBuilder = HMDaoManager.getInstance().getActivetrackDao().queryBuilder();
        if (gPSActiveTrack.getTrackid() <= 0 || gPSActiveTrack.getTimestamp() <= 0) {
            throw new IllegalArgumentException("updateActiveTrack trackId or Time invalid!!");
        }
        queryBuilder.where(ActivetrackDao.Properties.Trackid.eq(Long.valueOf(gPSActiveTrack.getTrackid())), new WhereCondition[0]).where(ActivetrackDao.Properties.Time.eq(Long.valueOf(gPSActiveTrack.getTimestamp())), new WhereCondition[0]);
        Activetrack activetrackUniqueOrThrow = queryBuilder.uniqueOrThrow();
        a(activetrackUniqueOrThrow, gPSActiveTrack, false);
        HMDaoManager.getInstance().getActivetrackDao().update(activetrackUniqueOrThrow);
    }
}
