package qt1;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {1451}, m = "getTrailReviewStateResult", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f147524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qs1.h f147525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f147526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f147527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f147528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f147529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f147530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k kVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f147529f = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147528e = obj;
        this.f147530g |= Integer.MIN_VALUE;
        return this.f147529f.N4(null, 0L, false, null, null, this);
    }
}
