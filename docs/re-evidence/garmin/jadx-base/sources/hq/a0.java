package hq;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhq/a0;", "Landroidx/appcompat/widget/SearchView$m;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements SearchView.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.a f84950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f84951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f84952c;

    public a0(com.garmin.android.apps.connectmobile.activities.stats.exercises.a aVar, SearchView searchView, ImageView imageView) {
        this.f84950a = aVar;
        this.f84951b = searchView;
        this.f84952c = imageView;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean E0(String str) {
        str.getClass();
        if (!this.f84950a.isAdded()) {
            return true;
        }
        this.f84951b.clearFocus();
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.m
    public final boolean l5(String str) {
        str.getClass();
        com.garmin.android.apps.connectmobile.activities.stats.exercises.a aVar = this.f84950a;
        if (!aVar.isAdded() || p005kotlin.jvm.internal.s.g(aVar.u6().f29886c, str)) {
            return false;
        }
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVarU6 = aVar.u6();
        Context contextRequireContext = aVar.requireContext();
        contextRequireContext.getClass();
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c.C4(cVarU6, contextRequireContext, str, null, null, 12);
        v22.e.q(this.f84952c);
        return false;
    }
}
