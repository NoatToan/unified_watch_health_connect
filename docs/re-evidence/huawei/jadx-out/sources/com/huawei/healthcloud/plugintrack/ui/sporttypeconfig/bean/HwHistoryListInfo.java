package com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import defpackage.jby;
import defpackage.jxj;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HwHistoryListInfo {
    private String mDrawableType;

    @SerializedName("itemBgColor")
    private int mItemBgColor;
    private Drawable mItemDrawable;

    @SerializedName("itemImg")
    private String mItemImg;

    @SerializedName("itemImgDefault")
    private String mItemImgDefault;

    @SerializedName("monthlyStatisticsData")
    private ArrayList<MonthlyStatisticsData> mMonthlyStatisticsData;

    @SerializedName("multiItemImg")
    private HashMap<String, String> mMultiItemImg;

    public String getItemImg() {
        return this.mItemImg;
    }

    public int getItemBgColor() {
        return this.mItemBgColor;
    }

    public void setItemImg(String str) {
        this.mItemImg = str;
    }

    public ArrayList<MonthlyStatisticsData> getMonthlyStatisticsData() {
        ArrayList<MonthlyStatisticsData> arrayList = this.mMonthlyStatisticsData;
        if (arrayList == null) {
            return null;
        }
        return (ArrayList) arrayList.clone();
    }

    public ArrayList<String> getTrackRequestDataBase(int i) {
        return getAllRequestString(i);
    }

    public List<Integer> getAllRequestId() {
        if (njy.e(this.mMonthlyStatisticsData)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MonthlyStatisticsData monthlyStatisticsData : this.mMonthlyStatisticsData) {
            if (monthlyStatisticsData != null) {
                arrayList.add(Integer.valueOf(monthlyStatisticsData.getRequestId()));
            }
        }
        return arrayList;
    }

    public ArrayList<String> getAllRequestString(int i) {
        if (njy.e(this.mMonthlyStatisticsData)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (MonthlyStatisticsData monthlyStatisticsData : this.mMonthlyStatisticsData) {
            if (monthlyStatisticsData != null) {
                arrayList.add("Track_" + i + monthlyStatisticsData.getRequestId());
            }
        }
        return arrayList;
    }

    public void getMainAndBackupMonthlyType(HwSportTypeInfo hwSportTypeInfo, Map<String, HwSportTypeInfo> map) {
        if (njy.e(this.mMonthlyStatisticsData)) {
            return;
        }
        int sportTypeId = hwSportTypeInfo.getSportTypeId();
        for (MonthlyStatisticsData monthlyStatisticsData : this.mMonthlyStatisticsData) {
            if (monthlyStatisticsData != null && (MonthlyStatisticsData.MAIN.equals(monthlyStatisticsData.getPosition()) || MonthlyStatisticsData.BACKUP.equals(monthlyStatisticsData.getPosition()))) {
                map.put("Track_" + sportTypeId + monthlyStatisticsData.getRequestId(), hwSportTypeInfo);
            }
        }
    }

    public ArrayList<String> getAllMonthlyType() {
        if (njy.e(this.mMonthlyStatisticsData)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (MonthlyStatisticsData monthlyStatisticsData : this.mMonthlyStatisticsData) {
            if (monthlyStatisticsData != null) {
                arrayList.add(monthlyStatisticsData.getType());
            }
        }
        return arrayList;
    }

    public String mainPositionData(boolean z) {
        if (njy.e(this.mMonthlyStatisticsData)) {
            return null;
        }
        for (MonthlyStatisticsData monthlyStatisticsData : this.mMonthlyStatisticsData) {
            if (monthlyStatisticsData != null && MonthlyStatisticsData.MAIN.equals(monthlyStatisticsData.getPosition())) {
                if (z) {
                    return String.valueOf(monthlyStatisticsData.getRequestId());
                }
                return monthlyStatisticsData.getType();
            }
        }
        return null;
    }

    private String getItemImg(String str) {
        HashMap<String, String> map = this.mMultiItemImg;
        if (map != null && !TextUtils.isEmpty(map.get(str))) {
            return this.mMultiItemImg.get(str);
        }
        return this.mItemImg;
    }

    private int getItemDefaultId() {
        int iA = jby.a(this.mItemImgDefault, BaseApplication.b());
        return iA == 0 ? R.drawable.ic_health_list_outdoor_running : iA;
    }

    public Drawable getItemDrawable(String str) {
        if (this.mItemDrawable != null && TextUtils.equals(str, this.mDrawableType)) {
            return this.mItemDrawable;
        }
        this.mDrawableType = str;
        Drawable drawableD = jxj.d(getItemImg(str), getItemDefaultId());
        this.mItemDrawable = drawableD;
        return drawableD;
    }

    public Drawable getItemDrawable() {
        return jxj.d(this.mItemImg, getItemDefaultId());
    }
}
