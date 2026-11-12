package qt1;

import android.content.Context;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {803, 827}, m = "submitTrailReviewPhotos", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f147795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i53.c f147796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f147797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f147798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f147799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f147800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f147801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k kVar, t13.d<? super u0> dVar) {
        super(dVar);
        this.f147800f = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147799e = obj;
        this.f147801g |= Integer.MIN_VALUE;
        return k.D4(this.f147800f, null, 0L, null, this);
    }
}
