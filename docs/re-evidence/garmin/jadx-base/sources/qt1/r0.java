package qt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel", f = "TrailDetailsViewModel.kt", l = {1471}, m = "showPlusIcon", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f147770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f147772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(k kVar, t13.d<? super r0> dVar) {
        super(dVar);
        this.f147771b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f147770a = obj;
        this.f147772c |= Integer.MIN_VALUE;
        return k.B4(this.f147771b, this);
    }
}
