package qt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {697, 715}, m = "postEditOperations", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a f147639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f147640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f147641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k kVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f147641c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147640b = obj;
        this.f147642d |= Integer.MIN_VALUE;
        return k.z4(this.f147641c, null, null, null, null, this);
    }
}
