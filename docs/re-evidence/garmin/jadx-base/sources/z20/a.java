package z20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.ConvertToGCJ02UseCase", f = "ConvertToGCJ02UseCase.kt", l = {53}, m = "convertToGCJ02", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f201869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f201871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f201872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, t13.d<? super a> dVar2) {
        super(dVar2);
        this.f201871c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201870b = obj;
        this.f201872d |= Integer.MIN_VALUE;
        return d.a(this.f201871c, null, this);
    }
}
