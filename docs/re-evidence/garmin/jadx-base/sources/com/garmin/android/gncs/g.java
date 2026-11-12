package com.garmin.android.gncs;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49896a;

    public /* synthetic */ g(int i14) {
        this.f49896a = i14;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f49896a) {
            case 0:
                return SmartNotificationsUtil.lambda$filterGNCSPackagesFromList$2((String) obj);
            default:
                return SmartNotificationsUtil.lambda$getAllApplications$1((GNCSApplicationInfo) obj);
        }
    }
}
