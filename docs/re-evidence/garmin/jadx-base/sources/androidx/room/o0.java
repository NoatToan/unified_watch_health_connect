package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", l = {82}, m = "refresh")
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0<Object> f10913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(n0<Object> n0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f10913c = n0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10912b = obj;
        this.f10914d |= Integer.MIN_VALUE;
        return n0.n(this.f10913c, this);
    }
}
