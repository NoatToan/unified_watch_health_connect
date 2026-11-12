package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import am.x0;
import am.z0;
import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public enum e {
    ACT_OTHER(0, R.string.lbl_other, "OTHER"),
    ACT_RUNNING(1, R.string.lbl_running, "RUNNING"),
    ACT_ROAD_CYCLING(2, R.string.lbl_road_biking, "ROAD_CYCLING"),
    ACT_MOUNTAIN_BIKING(3, R.string.lbl_mountain_biking, "MOUNTAIN_BIKING"),
    ACT_SWIMMING(4, R.string.lbl_swimming, "SWIMMING"),
    ACT_TRIATHLON(5, R.string.lbl_triathlon, "TRIATHLON"),
    ACT_STEP_TRACKING_AND_WALKING(6, R.string.device_cat_wellness, "STEP_TRACKING_AND_WALKING"),
    ACT_GOLF(7, R.string.lbl_golf, "GOLF"),
    ACT_PARASPORTS(8, R.string.activity_type_parasports, "PARA_SPORTS"),
    ACT_NOT_DEFINED(-1, R.string.lbl_other, "");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap<String, e> f31643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SparseArray<e> f31644o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31648c;

    static {
        f31643n = null;
        f31644o = null;
        int length = values().length;
        f31643n = new HashMap<>(length);
        f31644o = new SparseArray<>(length);
        for (e eVar : values()) {
            f31643n.put(eVar.f31648c, eVar);
            f31644o.put(eVar.f31646a, eVar);
        }
    }

    e(int i14, int i15, String str) {
        this.f31646a = i14;
        this.f31647b = i15;
        this.f31648c = str;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        switch (this) {
            case ACT_OTHER:
                x0 x0Var = x0.f4346x;
                arrayList.add(a.C(x0Var));
                arrayList.addAll(a.D(z0.i(x0Var)));
                break;
            case ACT_RUNNING:
                x0 x0Var2 = x0.f4308n;
                arrayList.add(a.C(x0Var2));
                arrayList.addAll(a.D(z0.i(x0Var2)));
                break;
            case ACT_ROAD_CYCLING:
            case ACT_MOUNTAIN_BIKING:
                x0 x0Var3 = x0.f4312o;
                arrayList.add(a.C(x0Var3));
                arrayList.addAll(a.D(z0.i(x0Var3)));
                break;
            case ACT_SWIMMING:
                x0 x0Var4 = x0.f4324r;
                arrayList.add(a.C(x0Var4));
                arrayList.addAll(a.D(z0.i(x0Var4)));
                break;
            case ACT_TRIATHLON:
                x0 x0Var5 = x0.f4308n;
                arrayList.add(a.C(x0Var5));
                arrayList.addAll(a.D(z0.i(x0Var5)));
                x0 x0Var6 = x0.f4312o;
                arrayList.add(a.C(x0Var6));
                arrayList.addAll(a.D(z0.i(x0Var6)));
                x0 x0Var7 = x0.f4324r;
                arrayList.add(a.C(x0Var7));
                arrayList.addAll(a.D(z0.i(x0Var7)));
                break;
            case ACT_STEP_TRACKING_AND_WALKING:
                x0 x0Var8 = x0.f4331t;
                arrayList.add(a.C(x0Var8));
                arrayList.addAll(a.D(z0.i(x0Var8)));
                break;
            case ACT_PARASPORTS:
                x0 x0Var9 = x0.f4268a3;
                arrayList.add(a.C(x0Var9));
                arrayList.addAll(a.D(z0.i(x0Var9)));
                break;
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        switch (this) {
            case ACT_OTHER:
                arrayList.add(j10.d.TOTAL_DISTANCE);
                break;
            case ACT_RUNNING:
                arrayList.add(j10.d.RUNNING_DISTANCE);
                break;
            case ACT_ROAD_CYCLING:
            case ACT_MOUNTAIN_BIKING:
                arrayList.add(j10.d.CYCLING_DISTANCE);
                break;
            case ACT_SWIMMING:
                arrayList.add(j10.d.SWIMMING_DISTANCE);
                break;
            case ACT_TRIATHLON:
                arrayList.add(j10.d.RUNNING_DISTANCE);
                arrayList.add(j10.d.CYCLING_DISTANCE);
                arrayList.add(j10.d.SWIMMING_DISTANCE);
                arrayList.add(j10.d.TOTAL_DISTANCE);
                break;
            case ACT_STEP_TRACKING_AND_WALKING:
                arrayList.add(j10.d.TOTAL_STEPS);
                arrayList.add(j10.d.WALKING_DISTANCE);
                arrayList.add(j10.d.TOTAL_DISTANCE);
                arrayList.add(j10.d.ACTIVE_CALORIES_BURNED);
                break;
            case ACT_PARASPORTS:
                arrayList.add(j10.d.TOTAL_PUSHES);
                arrayList.add(j10.d.PUSHING_DISTANCE);
                arrayList.add(j10.d.ACTIVE_CALORIES_BURNED);
                break;
        }
        return arrayList;
    }
}
