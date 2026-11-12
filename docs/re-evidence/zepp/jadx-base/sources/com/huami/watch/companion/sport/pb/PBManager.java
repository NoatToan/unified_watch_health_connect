package com.huami.watch.companion.sport.pb;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.sport.event.PBInfoChangedEvent;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class PBManager {
    public static final String TAG = "PBManager";
    private static PBManager sPBManager;
    private SparseArray<List<String>> mUnconfirmedTypes = new SparseArray<>();
    private HashMap<String, HashMap<PBConfig.Status, PersonalBest>> mAllPBMap = new HashMap<>();
    private boolean mHasNewUnconfirmed = false;

    private PBManager() {
        init();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    private void generateAllPB() {
        PBType pBTypeFind;
        PBConfig.Status status;
        for (PersonalBest personalBest : getPBData()) {
            if (personalBest != null && (pBTypeFind = PBType.find(personalBest.getName())) != null) {
                HashMap<PBConfig.Status, PersonalBest> map = this.mAllPBMap.get(personalBest.getName());
                if (PBConfig.KEY_UNCONFIRMED.equals(personalBest.getStatus())) {
                    status = PBConfig.Status.UNCONFIRMED;
                    List<String> arrayList = this.mUnconfirmedTypes.get(pBTypeFind.getShowType());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(personalBest.getName());
                    this.mUnconfirmedTypes.put(pBTypeFind.getShowType(), arrayList);
                } else if (map != null) {
                    PBConfig.Status status2 = PBConfig.Status.CURRENT;
                    if (map.get(status2) != null) {
                        PersonalBest personalBest2 = map.get(status2);
                        if (personalBest2 == null || personalBest.getTrackId() <= personalBest2.getTrackId()) {
                            status2 = PBConfig.Status.LAST;
                        } else {
                            map.put(PBConfig.Status.LAST, personalBest2);
                        }
                        status = status2;
                    } else {
                        status = PBConfig.Status.CURRENT;
                    }
                } else {
                    status = PBConfig.Status.CURRENT;
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(status, personalBest);
                this.mAllPBMap.put(personalBest.getName(), map);
            }
        }
    }

    public static PBManager get() {
        if (sPBManager == null) {
            sPBManager = new PBManager();
        }
        return sPBManager;
    }

    private List<PersonalBest> getPBData() {
        ArrayList arrayList = new ArrayList();
        String personalBestInfo = Box.getPersonalBestInfo();
        if (TextUtils.isEmpty(personalBestInfo)) {
            return arrayList;
        }
        try {
            return (List) new Gson().fromJson(personalBestInfo, new TypeToken<List<PersonalBest>>() { // from class: com.huami.watch.companion.sport.pb.PBManager.1
            }.getType());
        } catch (Exception e) {
            Log.e(TAG, "Convert pb json error:", e, new Object[0]);
            return arrayList;
        }
    }

    public static String getTAG() {
        return TAG;
    }

    private void removeUnconfirmedTypes(String str) {
        List<String> list;
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null || (list = this.mUnconfirmedTypes.get(pBTypeFind.getShowType())) == null) {
            return;
        }
        list.remove(str);
        if (list.size() == 0) {
            this.mUnconfirmedTypes.remove(pBTypeFind.getShowType());
        }
    }

    private void save() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, HashMap<PBConfig.Status, PersonalBest>>> it2 = this.mAllPBMap.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator<Map.Entry<PBConfig.Status, PersonalBest>> it3 = it2.next().getValue().entrySet().iterator();
            while (it3.hasNext()) {
                PersonalBest value = it3.next().getValue();
                if (value != null) {
                    arrayList.add(value);
                }
            }
        }
        String json = new Gson().toJson(arrayList);
        Box.putPersonalBestInfo(json);
        RxBus.get().postMainThread(new PBInfoChangedEvent());
        Log.d(TAG, "Save pb to local:" + json, new Object[0]);
    }

    public void clear() {
        this.mUnconfirmedTypes.clear();
        this.mAllPBMap.clear();
    }

    public void confirmedPB(String str) {
        Log.d(TAG, "Confirmed pb name:" + str, new Object[0]);
        HashMap<PBConfig.Status, PersonalBest> map = this.mAllPBMap.get(str);
        if (map == null) {
            Log.v(TAG, "Abort,no pb:" + str, new Object[0]);
            return;
        }
        PBConfig.Status status = PBConfig.Status.CURRENT;
        PersonalBest personalBest = map.get(status);
        PBConfig.Status status2 = PBConfig.Status.UNCONFIRMED;
        PersonalBest personalBest2 = map.get(status2);
        if (personalBest2 == null) {
            return;
        }
        personalBest2.setStatus(PBConfig.KEY_CONFIRMED);
        map.put(status, personalBest2);
        map.put(PBConfig.Status.LAST, personalBest);
        map.remove(status2);
        removeUnconfirmedTypes(str);
        save();
    }

    public List<PersonalBest> getAllConfirmedPBToWatch(Context context) {
        HashMap<PBConfig.Status, PersonalBest> map;
        PersonalBest personalBest;
        ArrayList arrayList = new ArrayList();
        PBConfig.Unit unit = getUnit(context);
        for (PBType pBType : PBType.values()) {
            if ((pBType.getUnit() == unit || pBType.getUnit() == PBConfig.Unit.NONE) && (map = this.mAllPBMap.get(pBType.getName())) != null && (personalBest = map.get(PBConfig.Status.CURRENT)) != null && personalBest.getTrackId() != 0) {
                arrayList.add(personalBest);
            }
        }
        return arrayList;
    }

    public HashMap<String, HashMap<PBConfig.Status, PersonalBest>> getAllPBMap() {
        return this.mAllPBMap;
    }

    public List<PersonalBest> getAllPBToWatch(Context context) {
        HashMap<PBConfig.Status, PersonalBest> map;
        ArrayList arrayList = new ArrayList();
        PBConfig.Unit unit = getUnit(context);
        for (PBType pBType : PBType.values()) {
            if ((pBType.getUnit() == unit || pBType.getUnit() == PBConfig.Unit.NONE) && (map = this.mAllPBMap.get(pBType.getName())) != null) {
                PersonalBest personalBest = map.get(PBConfig.Status.UNCONFIRMED);
                if (personalBest != null) {
                    arrayList.add(personalBest);
                } else {
                    PersonalBest personalBest2 = map.get(PBConfig.Status.CURRENT);
                    if (personalBest2 != null && personalBest2.getTrackId() != 0) {
                        arrayList.add(personalBest2);
                    }
                }
            }
        }
        return arrayList;
    }

    public List<PersonalBest> getConfirmedPBToWatch(PersonalBest personalBest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(personalBest);
        return arrayList;
    }

    public List<PersonalBest> getSportPBList(Context context, long j) {
        HashMap<PBConfig.Status, PersonalBest> map;
        ArrayList arrayList = new ArrayList();
        PBConfig.Unit unit = getUnit(context);
        for (PBType pBType : PBType.values()) {
            if ((pBType.getUnit() == unit || pBType.getUnit() == PBConfig.Unit.NONE) && (map = this.mAllPBMap.get(pBType.getName())) != null) {
                PBConfig.Status status = PBConfig.Status.CURRENT;
                if (map.get(status) != null && map.get(status).getTrackId() == j) {
                    arrayList.add(map.get(status));
                }
            }
        }
        return arrayList;
    }

    public PBConfig.Unit getUnit(Context context) {
        return !UnitManager.isDistanceKM(context) ? PBConfig.Unit.IMPERIAL : PBConfig.Unit.METRIC;
    }

    public void giveUpPB(String str) {
        Log.d(TAG, "GiveUp pb name:" + str, new Object[0]);
        HashMap<PBConfig.Status, PersonalBest> map = this.mAllPBMap.get(str);
        if (map != null) {
            map.remove(PBConfig.Status.UNCONFIRMED);
            removeUnconfirmedTypes(str);
            save();
        } else {
            Log.v(TAG, "Abort,no pb:" + str, new Object[0]);
        }
    }

    public boolean hasNewUnconfirmed() {
        return this.mHasNewUnconfirmed;
    }

    public boolean hasUnconfirmed(Context context) {
        PBConfig.Unit unit = getUnit(context);
        boolean z = false;
        for (int i = 0; i < this.mUnconfirmedTypes.size(); i++) {
            Iterator<String> it2 = this.mUnconfirmedTypes.valueAt(i).iterator();
            while (it2.hasNext()) {
                PBType pBTypeFind = PBType.find(it2.next());
                if (pBTypeFind != null && (pBTypeFind.getUnit() == unit || pBTypeFind.getUnit() == PBConfig.Unit.NONE)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void init() {
        generateAllPB();
    }

    public void refresh() {
        clear();
        init();
    }

    public void setHasNewUnconfirmed(boolean z) {
        this.mHasNewUnconfirmed = z;
    }

    public String toWatchData(List<PersonalBest> list) {
        JSONArray jSONArray = new JSONArray();
        for (PersonalBest personalBest : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trackId", personalBest.getTrackId());
                jSONObject.put("value", personalBest.getValue());
                jSONObject.put("type", personalBest.getType());
                jSONObject.put("timestamp", personalBest.getTimestamp());
                jSONObject.put("name", PBUtil.getPBNameIndexToWatch(personalBest.getName()));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "To watch confirmed pb:" + jSONArray.toString(), new Object[0]);
        return jSONArray.toString();
    }

    public boolean hasUnconfirmed(Context context, int i) {
        boolean z;
        PBConfig.Unit unit = getUnit(context);
        List<String> list = this.mUnconfirmedTypes.get(i);
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                PBType pBTypeFind = PBType.find(it2.next());
                if (pBTypeFind != null && (pBTypeFind.getUnit() == unit || pBTypeFind.getUnit() == PBConfig.Unit.NONE)) {
                    z = true;
                }
            }
            z = false;
        }
        Log.d(TAG, "Type:" + i + ",hasUnconfirmed:" + z, new Object[0]);
        return z;
    }
}
