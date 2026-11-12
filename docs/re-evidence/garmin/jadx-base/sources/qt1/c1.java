package qt1;

import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {843, 862, 885, 890}, m = "updateTrailReviewPhotos", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f147575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f147576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f147577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f147578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f147579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f147580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f147581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f147582h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(k kVar, t13.d<? super c1> dVar) {
        super(dVar);
        this.f147581g = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147580f = obj;
        this.f147582h |= Integer.MIN_VALUE;
        return this.f147581g.V4(null, 0L, null, null, this);
    }
}
