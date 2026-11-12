package jy0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationViewModel", f = "MultiDayActivitiesCreationViewModel.kt", l = {320}, m = "getInitialActivityListForEditing", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f101786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f101787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f101788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f101789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f101788c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101787b = obj;
        this.f101789d |= Integer.MIN_VALUE;
        return this.f101788c.x4(null, this);
    }
}
