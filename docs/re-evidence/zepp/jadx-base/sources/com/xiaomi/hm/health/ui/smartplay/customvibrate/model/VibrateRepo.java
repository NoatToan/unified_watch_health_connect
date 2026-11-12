package com.xiaomi.hm.health.ui.smartplay.customvibrate.model;

import android.content.Context;
import android.text.TextUtils;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateHelperKt;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateEntity;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class VibrateRepo {
    public static final int DEFAULT_VIBRATE_ID_1 = -1;
    public static final int DEFAULT_VIBRATE_ID_2 = -2;
    public static final int MAX_VIBRATE_COUNT = 50;
    private static final String c = "VibrateRepo";
    private static volatile VibrateRepo d;
    private volatile List<VibrateEntity> a;
    private HashMap<VibrateType, Integer> b;

    private VibrateRepo() {
        String property = HMPropertyUtil.getProperty(Property.PROPERTY_CUSTOM_VIBRATE, "");
        HMLog.i(c, "config: " + property, new Object[0]);
        Object[] objArrB = VibrateTransformer.b(property);
        this.b = (HashMap) objArrB[0];
        this.a = (List) objArrB[1];
    }

    private boolean c(String name) {
        Iterator<VibrateEntity> it2 = this.a.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().name, name)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(VibrateEntity vibrateEntity, VibrateEntity vibrateEntity2) {
        return vibrateEntity.id - vibrateEntity2.id;
    }

    public static VibrateRepo getInstance() {
        if (d == null) {
            synchronized (VibrateRepo.class) {
                if (d == null) {
                    d = new VibrateRepo();
                }
            }
        }
        return d;
    }

    public void addVibrateEntity(VibrateEntity entity) {
        this.a.add(entity);
    }

    public int b() {
        ArrayList arrayList = new ArrayList(this.a);
        Collections.sort(arrayList, new Comparator() { // from class: r98
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return VibrateRepo.d((VibrateEntity) obj, (VibrateEntity) obj2);
            }
        });
        for (int i = 1; i < arrayList.size(); i++) {
            short s = ((VibrateEntity) arrayList.get(i - 1)).id;
            if (((VibrateEntity) arrayList.get(i)).id - s > 1) {
                return s + 1;
            }
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        return ((VibrateEntity) arrayList.get(arrayList.size() - 1)).id + 1;
    }

    public void clear() {
        d = null;
    }

    public void deleteEntity(VibrateEntity entity) {
        for (Map.Entry<VibrateType, Integer> entry : this.b.entrySet()) {
            if (entry.getValue().intValue() == entity.id) {
                entry.setValue(-1);
            }
        }
        this.a.remove(entity);
        save();
    }

    public List<HMVibrateInfo> getDeviceVibrateEntity() {
        int selectedId;
        ArrayList arrayList = new ArrayList();
        for (VibrateType vibrateType : VibrateType.values()) {
            if ((vibrateType != VibrateType.FIND_BAND || ConfigHelperKt.hasFeature(Feature.SUPPORT_FIND_BAND_VIBRATE_TYPE)) && ((vibrateType != VibrateType.SCHEDULE || ConfigHelperKt.hasFeature(Feature.SUPPORT_SCHEDULE_VIBRATE_MODE)) && ((vibrateType != VibrateType.TODO || HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(30)) && -1 != (selectedId = getSelectedId(vibrateType))))) {
                HMVibrateInfo hMVibrateInfo = new HMVibrateInfo();
                hMVibrateInfo.id = (short) selectedId;
                hMVibrateInfo.type = (short) vibrateType.ordinal();
                hMVibrateInfo.useCustomVibrate = true;
                hMVibrateInfo.test = false;
                if (-2 != selectedId) {
                    for (VibrateEntity vibrateEntity : this.a) {
                        if (vibrateEntity.id == selectedId) {
                            hMVibrateInfo.times = vibrateEntity.times;
                            arrayList.add(hMVibrateInfo);
                            break;
                        }
                    }
                } else {
                    hMVibrateInfo.times = HMVibrateInfo.FADE_IN_TIMES;
                    arrayList.add(hMVibrateInfo);
                }
            }
        }
        return arrayList;
    }

    public int getSelectedId(VibrateType vibrateType) {
        Integer num = this.b.get(vibrateType);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public String getValidName(String name) {
        int i = 2;
        String str = name;
        while (!c(str)) {
            str = name + i;
            i++;
        }
        return str;
    }

    public List<VibrateEntity> getVibrateEntities() {
        return this.a;
    }

    public String getVibrateEntityName(Context context, VibrateType vibrateType) {
        int selectedId = getSelectedId(vibrateType);
        if (-1 == selectedId) {
            return VibrateHelperKt.getDefaultVibrateDescription(context, vibrateType);
        }
        if (-2 == selectedId) {
            return context.getString(R.string.custom_vibrate_mode_fade_in);
        }
        for (VibrateEntity vibrateEntity : this.a) {
            if (vibrateEntity.id == selectedId) {
                return vibrateEntity.name;
            }
        }
        return context.getString(R.string.custom_vibrate_mode_default);
    }

    public boolean isVibrateReferred(int id) {
        Iterator<Map.Entry<VibrateType, Integer>> it2 = this.b.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().intValue() == id) {
                return true;
            }
        }
        return false;
    }

    public void save() {
        HMPropertyUtil.setProperty(Property.PROPERTY_CUSTOM_VIBRATE, VibrateTransformer.d(this.b, this.a));
        HMPropertyUtil.postPropertisToServer(true);
    }

    public void setSelectedId(VibrateType vibrateType, int id) {
        this.b.put(vibrateType, Integer.valueOf(id));
    }
}
