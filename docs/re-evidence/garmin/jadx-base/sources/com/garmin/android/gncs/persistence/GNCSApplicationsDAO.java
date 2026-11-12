package com.garmin.android.gncs.persistence;

import com.garmin.android.gncs.GNCSApplicationInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface GNCSApplicationsDAO {
    List<String> disabledPackages();

    List<GNCSApplicationInfo> getAllApplications();

    int getApplicationCount();

    GNCSApplicationInfo getApplicationInfo(String str);

    void removeApplication(String str);

    void saveApplication(GNCSApplicationInfo gNCSApplicationInfo);

    void saveApplications(List<GNCSApplicationInfo> list);
}
