package y10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppDetailsViewModel", f = "ConnectIQAppDetailsViewModel.kt", l = {129}, m = "installApp", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f193805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f193806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f193806b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193805a = obj;
        this.f193807c |= Integer.MIN_VALUE;
        return b.x4(this.f193806b, null, this);
    }
}
