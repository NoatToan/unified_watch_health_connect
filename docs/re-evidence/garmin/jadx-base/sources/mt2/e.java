package mt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.data.model.enums.CommonHeartRateZone", f = "CommonHeartRateZone.kt", l = {28, 32, 33, 34, 35, 36}, m = "getDescription$workoutcommon_release")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f121019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f121020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f121021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f121022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f121023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f121022d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121021c = obj;
        this.f121023e |= Integer.MIN_VALUE;
        return this.f121022d.a(false, this);
    }
}
