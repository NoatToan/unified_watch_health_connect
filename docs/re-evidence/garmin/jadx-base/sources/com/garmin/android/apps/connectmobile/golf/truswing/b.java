package com.garmin.android.apps.connectmobile.golf.truswing;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.model.a f35812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ClubSelectionDrawerFragment f35813c;

    public b(ClubSelectionDrawerFragment clubSelectionDrawerFragment, int i14, com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar) {
        this.f35813c = clubSelectionDrawerFragment;
        this.f35811a = i14;
        this.f35812b = aVar;
    }

    public final void a(d.a aVar) {
        i2.f(a2.GOLF, "ClubSelectionDrawerFragment", "Error setting active club: " + aVar.name());
    }
}
