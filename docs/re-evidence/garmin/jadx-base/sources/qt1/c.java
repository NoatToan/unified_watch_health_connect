package qt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel", f = "GarminTrailsViewModel.kt", l = {780}, m = "fetchElevationDataForSelectedTrail", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f147545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f147546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f147547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f147547c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147546b = obj;
        this.f147548d |= Integer.MIN_VALUE;
        int i14 = a.I;
        return this.f147547c.z4(0L, this);
    }
}
