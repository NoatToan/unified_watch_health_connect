package com.miui.tsmclient.entity;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.PrefUtils;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RKEData {

    @SerializedName(FitnessDBConstants.COL_IS_SLEEP_COMPLETE)
    private boolean isComplete;

    @SerializedName("keyID")
    private String mKeyID;

    @SerializedName("proprietaryRKE")
    private List<String> mProprietaryRKEFunctions;

    @SerializedName("standardRKE")
    private List<String> mStandardRKEFunctions;

    @SerializedName("isStandardChanged")
    private boolean isStandardChanged = true;

    @SerializedName("isProprietaryChanged")
    private boolean isProprietaryChanged = true;

    public static RKEData get(Context context, String str) {
        RKEData rKEData;
        try {
            rKEData = (RKEData) new Gson().fromJson(PrefUtils.getString(context, PrefUtils.PREF_KEY_RKE_LIST_FROM_VEHICLE + str, "{}"), RKEData.class);
        } catch (JsonSyntaxException unused) {
            rKEData = new RKEData();
        }
        rKEData.setKeyID(str);
        return rKEData;
    }

    private boolean isNotEquals(List<String> list, List<String> list2) {
        if (list == null || list2 == null || list.size() != list2.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list2.contains(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public List<String> getAllRKEFunctions() {
        ArrayList arrayList = new ArrayList();
        if (this.mStandardRKEFunctions == null) {
            this.mStandardRKEFunctions = new ArrayList();
        }
        if (this.mProprietaryRKEFunctions == null) {
            this.mProprietaryRKEFunctions = new ArrayList();
        }
        arrayList.addAll(this.mStandardRKEFunctions);
        arrayList.addAll(this.mProprietaryRKEFunctions);
        return arrayList;
    }

    public String getKeyID() {
        return this.mKeyID;
    }

    public boolean isComplete() {
        return this.isComplete;
    }

    public boolean isProprietaryChanged() {
        return this.isProprietaryChanged;
    }

    public boolean isStandardChanged() {
        return this.isStandardChanged;
    }

    public void setComplete(boolean z) {
        this.isComplete = z;
    }

    public void setKeyID(String str) {
        this.mKeyID = str;
    }

    public void setProprietaryRKEFunctions(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.mProprietaryRKEFunctions == null) {
            this.mProprietaryRKEFunctions = new ArrayList();
        }
        this.isProprietaryChanged = isNotEquals(this.mProprietaryRKEFunctions, list);
        this.mProprietaryRKEFunctions.clear();
        this.mProprietaryRKEFunctions.addAll(list);
    }

    public void setStandardRKEFunctions(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.mStandardRKEFunctions == null) {
            this.mStandardRKEFunctions = new ArrayList();
        }
        this.isStandardChanged = isNotEquals(this.mStandardRKEFunctions, list);
        this.mStandardRKEFunctions.clear();
        this.mStandardRKEFunctions.addAll(list);
    }
}
