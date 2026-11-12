package qt1;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {1357, 1362, 1366}, m = "shouldShowTrailReviewSuggestion", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f147755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qs1.w f147756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f147757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f147758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f147759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k kVar, t13.d<? super o0> dVar) {
        super(dVar);
        this.f147758d = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147757c = obj;
        this.f147759e |= Integer.MIN_VALUE;
        return k.A4(this.f147758d, null, this);
    }
}
