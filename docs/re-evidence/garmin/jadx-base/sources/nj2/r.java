package nj2;

import b21.a5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel", f = "CustomerManagementViewModel.kt", l = {612}, m = "startValidations", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a5 f126354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f126357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a aVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f126356c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f126355b = obj;
        this.f126357d |= Integer.MIN_VALUE;
        return this.f126356c.R4(null, null, this);
    }
}
