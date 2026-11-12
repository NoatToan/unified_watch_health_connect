package com.huawei.hwcloudmodel.model.unite;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.servicesapi.R;
import com.huawei.operation.ble.BleConstants;
import com.huawei.route.Point;
import com.huawei.route.RouteType;
import com.huawei.route.SceneType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RouteData implements Cloneable {
    public static final String SCENE_TYPE = "SCENE_TYPE";

    @SerializedName("extendData")
    private String extendData;
    private transient int mRouteType;

    @SerializedName("routeDistance")
    private double routeDistance;

    @SerializedName("routeName")
    private String routeName;

    @SerializedName("routePoints")
    private List<Point> routePoints;

    @SerializedName("routeTime")
    private double routeTime;

    @SerializedName(BleConstants.SPORT_TYPE)
    private String sportType;

    @SerializedName("type")
    private int type;

    @SerializedName("routeVersion")
    private long routeVersion = 0;

    @SerializedName("sceneType")
    private int mSceneType = SceneType.OTHER.sceneType();

    public String getRouteName() {
        return this.routeName;
    }

    public void setRouteName(String str) {
        this.routeName = str;
    }

    public String getSportType() {
        return this.sportType;
    }

    public void setSportType(String str) {
        this.sportType = str;
    }

    public double getRouteTime() {
        return this.routeTime;
    }

    public void setRouteTime(double d) {
        this.routeTime = d;
    }

    public double getRouteDistance() {
        return this.routeDistance;
    }

    public void setRouteDistance(double d) {
        this.routeDistance = d;
    }

    public long getRouteVersion() {
        return this.routeVersion;
    }

    public void setRouteVersion(long j) {
        this.routeVersion = j;
    }

    public List<Point> getRoutePoints() {
        if (CollectionUtils.a(this.routePoints)) {
            return new ArrayList();
        }
        return this.routePoints;
    }

    public void setRoutePoints(List<Point> list) {
        this.routePoints = list;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getExtendData() {
        return this.extendData;
    }

    public void setExtendData(String str) {
        this.extendData = str;
    }

    public int getSceneType() {
        return this.mSceneType;
    }

    public void setSceneType(int i) {
        this.mSceneType = i;
    }

    public void convertSceneType() {
        if (this.mRouteType == RouteType.EXP.routeType()) {
            this.mSceneType = SceneType.EXP.sceneType();
        } else if (BaseApplication.b().getString(R.string.IDS_start_track_sport_type_bike).equals(this.sportType)) {
            this.mSceneType = SceneType.BIKE.sceneType();
        } else {
            this.mSceneType = SceneType.WR.sceneType();
        }
    }

    public void setRouteType(int i) {
        this.mRouteType = i;
    }

    public String getRouteId() {
        try {
            RouteExtendData routeExtendData = (RouteExtendData) new Gson().fromJson(this.extendData, RouteExtendData.class);
            if (routeExtendData == null) {
                return "";
            }
            return routeExtendData.getRouteId();
        } catch (JsonSyntaxException unused) {
            return "";
        }
    }

    public int getRouteType() {
        try {
            RouteExtendData routeExtendData = (RouteExtendData) new Gson().fromJson(this.extendData, RouteExtendData.class);
            if (routeExtendData == null) {
                return this.mRouteType;
            }
            return routeExtendData.getRouteType();
        } catch (JsonSyntaxException unused) {
            return this.mRouteType;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteData) && this.routeVersion == ((RouteData) obj).routeVersion;
    }

    public int hashCode() {
        long j = this.routeVersion;
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RouteData m1409clone() {
        try {
            return (RouteData) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
