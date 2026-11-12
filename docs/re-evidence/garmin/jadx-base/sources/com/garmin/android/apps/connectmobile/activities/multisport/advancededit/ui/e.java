package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/e;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroidx/fragment/app/v;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<d1> f29336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar) {
        super(vVar);
        vVar.getClass();
        this.f29336h = j0.f134944a;
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44052d() {
        return this.f29336h.size();
    }

    @Override // androidx.fragment.app.e0
    public final Fragment getItem(int i14) {
        j.f29365e.getClass();
        Bundle bundle = new Bundle(1);
        bundle.putInt("legIndex", i14);
        j jVar = new j();
        jVar.setArguments(bundle);
        return jVar;
    }
}
