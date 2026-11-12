package qt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {1398, 1402, 1405}, m = "showTrailReviewPromptIfNeeded", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f147776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f147777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f147778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f147780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f147781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f147782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k kVar, t13.d<? super s0> dVar) {
        super(dVar);
        this.f147781f = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147780e = obj;
        this.f147782g |= Integer.MIN_VALUE;
        return k.C4(this.f147781f, 0L, this);
    }
}
