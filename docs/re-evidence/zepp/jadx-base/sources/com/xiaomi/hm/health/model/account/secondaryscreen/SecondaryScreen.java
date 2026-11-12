package com.xiaomi.hm.health.model.account.secondaryscreen;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SecondaryScreen {
    public static final int ALIPAY = 1;
    public static final int CARD = 5;
    public static final String KEY_ENABLE = "enable";
    public static final String KEY_INDEX = "index";
    public static final String KEY_PARENT = "parentType";
    public static final String KEY_TYPE = "type";
    public static final String KEY_UPDATED = "updated";
    public static final int MUSIC = 4;
    public static final int OFF = 0;
    private static final String TAG = "SecondaryScreen";
    public static final int VOICE = 3;
    public static final int WEATHER = 2;
    public static List<SecondaryScreen> sInstances = new ArrayList();
    public List<SecondaryModel> mSecondaryModelList = new ArrayList();

    public static SecondaryScreen getInstance() {
        return OtherSecondaryScreen.getInstance();
    }

    public abstract void clear();

    public void clearAll() {
        Iterator<SecondaryScreen> it2 = sInstances.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        sInstances.clear();
    }

    public List<SecondaryModel> getDefaultSecondaryModelList(HMDeviceSource hMDeviceSource) {
        return OtherSecondaryScreen.getInstance().getDefaultConfig(hMDeviceSource);
    }

    public List<SecondaryModel> getSecondaryModelList() {
        return this.mSecondaryModelList;
    }

    public int getType() {
        for (int i = 0; i < this.mSecondaryModelList.size(); i++) {
            SecondaryModel secondaryModel = this.mSecondaryModelList.get(i);
            if (secondaryModel.getType() == 1 && secondaryModel.isEnable()) {
                return 1;
            }
        }
        return 0;
    }

    public abstract void save(boolean z);

    public void setSecondaryModelList(List<SecondaryModel> list) {
        this.mSecondaryModelList = list;
    }

    public SecondaryScreen setType(int i) {
        for (int i2 = 0; i2 < this.mSecondaryModelList.size(); i2++) {
            SecondaryModel secondaryModel = this.mSecondaryModelList.get(i2);
            if (secondaryModel.getType() == 1) {
                secondaryModel.setEnable(i == 1);
                break;
            }
        }
        return this;
    }

    public String toString() {
        if (this.mSecondaryModelList.size() == 1) {
            return this.mSecondaryModelList.get(0).toString();
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.mSecondaryModelList.size(); i++) {
            sb.append(this.mSecondaryModelList.get(i).toString());
            if (i != this.mSecondaryModelList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(JsonLexerKt.END_LIST);
        String string = sb.toString();
        HMLog.d(TAG, "return " + string, new Object[0]);
        return string;
    }
}
