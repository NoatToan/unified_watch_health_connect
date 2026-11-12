package com.huami.moving.datacenter;

import android.text.TextUtils;
import com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.model.SportingConfig;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.databases.model.Runconfig;
import com.xiaomi.hm.health.databases.model.RunconfigDao;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes11.dex */
public class SportConfigDbClient implements ISportConfigDbCallback {
    private static volatile SportConfigDbClient a = null;
    private static final int b = 2;

    private SportConfigDbClient() {
    }

    private Runconfig a(SportingConfig sportingConfig) {
        Runconfig runconfig = new Runconfig();
        runconfig.setId(Long.valueOf(sportingConfig.getConfigId().longValue()));
        runconfig.setAutoPauseEnable(sportingConfig.getAutoPauseEnable());
        runconfig.setIndoorModelArray(sportingConfig.getIndoorModelArray());
        runconfig.setKeepScreenOn(sportingConfig.getKeepScreenOn());
        runconfig.setLockScreenDisplay(sportingConfig.getLockScreenDisplay());
        runconfig.setMeasureHREnable(sportingConfig.getMeasureHREnable());
        runconfig.setRemindHeartRate(sportingConfig.getRemindHeartRate());
        runconfig.setRemindHREnable(sportingConfig.getRemindHREnable());
        runconfig.setRemindPace(sportingConfig.getRemindPace());
        runconfig.setRemindPaceEnable(sportingConfig.getRemindPaceEnable());
        runconfig.setSynced(sportingConfig.getSynced());
        runconfig.setStepLengthArray(sportingConfig.getStepLengthArray());
        runconfig.setType(sportingConfig.getType());
        runconfig.setVoicePlayEnable(sportingConfig.getVoicePlayEnable());
        runconfig.setDevicesCount(sportingConfig.getDevicesCount());
        runconfig.setDataItems(sportingConfig.getDataItems());
        runconfig.setChooseDevices(sportingConfig.getChooseDevices());
        runconfig.setBeatValue(sportingConfig.getBeatValue());
        runconfig.setAutoPausePace(sportingConfig.getAutoPausePace());
        runconfig.setBeatEnable(sportingConfig.getBeatEnable());
        return runconfig;
    }

    private static Runconfig b(Runconfig runconfig, int i) {
        Runconfig runconfig2 = new Runconfig();
        runconfig2.setType(Integer.valueOf(i));
        runconfig2.setAutoPauseEnable(runconfig.getAutoPauseEnable());
        runconfig2.setVoicePlayEnable(runconfig.getVoicePlayEnable());
        runconfig2.setKeepScreenOn(runconfig.getKeepScreenOn());
        runconfig2.setMeasureHREnable(Boolean.TRUE);
        runconfig2.setRemindHREnable(runconfig.getRemindHREnable());
        runconfig2.setRemindPaceEnable(runconfig.getRemindPaceEnable());
        runconfig2.setRemindPace(Integer.valueOf(i == 9 ? 144 : runconfig.getRemindPace().intValue()));
        runconfig2.setBeatEnable(runconfig.getBeatEnable());
        runconfig2.setBeatValue(runconfig.getBeatValue());
        if (i == 9) {
            runconfig2.setAutoPausePace(360);
        } else if (i == 6) {
            runconfig2.setAutoPausePace(720);
        } else {
            runconfig2.setAutoPausePace(600);
        }
        f(runconfig2);
        d(runconfig2);
        return runconfig2;
    }

    private static Runconfig c(int i) {
        Runconfig runconfig = new Runconfig();
        runconfig.setType(Integer.valueOf(i));
        Boolean bool = Boolean.FALSE;
        runconfig.setAutoPauseEnable(bool);
        Boolean bool2 = Boolean.TRUE;
        runconfig.setVoicePlayEnable(bool2);
        runconfig.setKeepScreenOn(bool);
        runconfig.setMeasureHREnable(bool2);
        runconfig.setRemindHREnable(bool);
        runconfig.setRemindPaceEnable(bool);
        runconfig.setBeatEnable(bool);
        runconfig.setBeatValue(180);
        if (i == 9) {
            runconfig.setRemindPace(144);
            runconfig.setAutoPausePace(360);
        } else if (i == 6) {
            runconfig.setRemindPace(360);
            runconfig.setAutoPausePace(720);
        } else if (i == 25) {
            runconfig.setRemindPace(360);
            runconfig.setAutoPausePace(600);
            runconfig.setKeepScreenOn(bool2);
        } else {
            runconfig.setRemindPace(360);
            runconfig.setAutoPausePace(600);
        }
        f(runconfig);
        return runconfig;
    }

    private static void d(Runconfig runconfig) {
        if (HeartRateConstant.isHRValueValid(runconfig.getRemindHeartRate() == null ? 39 : runconfig.getRemindHeartRate().intValue())) {
            return;
        }
        int age = RunnerData.getRunner().getAge();
        if (age > 0) {
            runconfig.setRemindHeartRate(Integer.valueOf((int) (((double) (220 - age)) * 0.8d)));
        } else {
            runconfig.setRemindHeartRate(150);
        }
    }

    private static Runconfig e(int i) {
        List<Runconfig> list = HMDaoManager.getInstance().getDaoSession().getRunconfigDao().queryBuilder().where(RunconfigDao.Properties.Type.eq(Integer.valueOf(i)), new WhereCondition[0]).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    private static void f(Runconfig runconfig) {
        runconfig.setLockScreenDisplay(Boolean.TRUE);
        runconfig.setChooseMap(0);
        runconfig.setSynced(1);
        runconfig.setDevicesCount(0);
        runconfig.setDataItems("");
        runconfig.setIndoorModelArray("");
        runconfig.setStepLengthArray("");
        runconfig.setChooseDevices("");
    }

    public static void generateConfigs() {
        QueryBuilder<Runconfig> queryBuilder = HMDaoManager.getInstance().getDaoSession().getRunconfigDao().queryBuilder();
        Property property = RunconfigDao.Properties.Type;
        List<Runconfig> list = queryBuilder.whereOr(property.isNull(), property.eq(0), new WhereCondition[0]).list();
        if (list.isEmpty() || list.size() != 1) {
            return;
        }
        Runconfig runconfig = list.get(0);
        runconfig.setType(1);
        f(runconfig);
        saveConfig(runconfig, 1);
        saveConfig(b(runconfig, 8), 1);
        saveConfig(b(runconfig, 6), 1);
        saveConfig(b(runconfig, 9), 1);
    }

    public static Runconfig getConfig(int i) {
        Runconfig runconfigE = e(i);
        Runconfig runconfigC = c(i);
        if (runconfigE == null) {
            runconfigE = runconfigC;
        } else {
            try {
                for (Field field : runconfigE.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    if (field.get(runconfigE) == null) {
                        Field declaredField = runconfigC.getClass().getDeclaredField(field.getName());
                        declaredField.setAccessible(true);
                        field.set(runconfigE, declaredField.get(runconfigC));
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
        }
        if (runconfigE.getRemindPace().intValue() == 0) {
            if (runconfigE.getType().intValue() == 9) {
                runconfigE.setRemindPace(144);
            } else {
                runconfigE.setRemindPace(360);
            }
        }
        d(runconfigE);
        return runconfigE;
    }

    public static int[] getConfigChooseDevices(int i) {
        if (TextUtils.isEmpty(getConfig(i).getChooseDevices())) {
            return new int[]{-1, -1};
        }
        String[] strArrSplit = getConfig(i).getChooseDevices().split(";");
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(",");
            iArr[Integer.parseInt(strArrSplit2[0]) - 1] = Integer.parseInt(strArrSplit2[1]);
        }
        if (length >= 2) {
            return iArr;
        }
        int[] iArr2 = {-1, -1};
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public static List<String> getConfigDataItems(int i) {
        if (TextUtils.isEmpty(getConfig(i).getDataItems())) {
            return null;
        }
        String[] strArrSplit = getConfig(i).getDataItems().split(";");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(",");
            arrayList.add(Integer.parseInt(strArrSplit2[0]) - 1, strArrSplit2[1]);
        }
        return arrayList;
    }

    public static SportConfigDbClient getInstance() {
        if (a == null) {
            synchronized (SportConfigDbClient.class) {
                if (a == null) {
                    a = new SportConfigDbClient();
                }
            }
        }
        return a;
    }

    public static void saveConfig(Runconfig runconfig, int i) {
        runconfig.setSynced(Integer.valueOf(i));
        HMDaoManager.getInstance().getRunconfigDao().insertOrReplace(runconfig);
    }

    public static void setConfigChooseDevices(int[] iArr, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(',');
            sb.append(iArr[i2]);
            sb.append(';');
            i2 = i3;
        }
        Runconfig config = getConfig(i);
        config.setChooseDevices(sb.toString());
        saveConfig(config, 1);
    }

    public static void setConfigChooseDevicesCount(int i, int i2) {
        Runconfig config = getConfig(i2);
        config.setDevicesCount(Integer.valueOf(i));
        saveConfig(config, 1);
    }

    public static void setConfigDataItems(List<String> list, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(',');
            sb.append(list.get(i2));
            sb.append(';');
            i2 = i3;
        }
        Runconfig config = getConfig(i);
        config.setDataItems(sb.toString());
        saveConfig(config, 1);
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback
    public void deleteSportConfigInDb(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            HMDaoManager.getInstance().getDaoSession().getRunconfigDao().deleteAll();
            return;
        }
        DaoSession daoSession = HMDaoManager.getInstance().getDaoSession();
        String tablename = daoSession.getRunconfigDao().getTablename();
        String str = RunconfigDao.Properties.Id.columnName;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            sb.append(iArr[i]);
            if (i != iArr.length - 1) {
                sb.append(',');
            }
        }
        daoSession.getDatabase().execSQL("DELETE FROM " + tablename + " WHERE " + str + " IN (" + sb.toString() + ")");
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback
    public void insertOrReplaceConfigInDb(SportingConfig sportingConfig) {
        HMDaoManager.getInstance().getDaoSession().getRunconfigDao().insertOrReplace(a(sportingConfig));
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback
    public SportingConfig querySportConfigByType(int i) {
        Runconfig runconfigE = e(i);
        if (runconfigE == null) {
            return null;
        }
        SportingConfig sportingConfig = new SportingConfig();
        sportingConfig.setConfigId(Integer.valueOf(runconfigE.getId().intValue()));
        sportingConfig.setAutoPauseEnable(runconfigE.getAutoPauseEnable());
        sportingConfig.setIndoorModelArray(runconfigE.getIndoorModelArray());
        sportingConfig.setKeepScreenOn(runconfigE.getKeepScreenOn());
        sportingConfig.setLockScreenDisplay(runconfigE.getLockScreenDisplay());
        sportingConfig.setMeasureHREnable(runconfigE.getMeasureHREnable());
        sportingConfig.setRemindHeartRate(runconfigE.getRemindHeartRate());
        sportingConfig.setRemindHREnable(runconfigE.getRemindHREnable());
        sportingConfig.setRemindPace(runconfigE.getRemindPace());
        sportingConfig.setRemindPaceEnable(runconfigE.getRemindPaceEnable());
        sportingConfig.setSynced(runconfigE.getSynced());
        sportingConfig.setStepLengthArray(runconfigE.getStepLengthArray());
        sportingConfig.setType(runconfigE.getType());
        sportingConfig.setVoicePlayEnable(runconfigE.getVoicePlayEnable());
        sportingConfig.setDevicesCount(runconfigE.getDevicesCount());
        sportingConfig.setDataItems(runconfigE.getDataItems());
        sportingConfig.setChooseDevices(runconfigE.getChooseDevices());
        sportingConfig.setBeatValue(runconfigE.getBeatValue());
        sportingConfig.setAutoPausePace(runconfigE.getAutoPausePace());
        sportingConfig.setBeatEnable(runconfigE.getBeatEnable());
        return sportingConfig;
    }
}
