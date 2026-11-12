package qt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel", f = "GarminTrailsViewModel.kt", l = {575}, m = "fetchTrailsInBoundingBox", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a f147583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f147584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f147585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f147585c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147584b = obj;
        this.f147586d |= Integer.MIN_VALUE;
        return a.x4(this.f147585c, null, null, false, null, this);
    }
}
