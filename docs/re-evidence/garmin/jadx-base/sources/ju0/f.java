package ju0;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo$consentLiveEventSharing$2", f = "LiveEventSharingRepo.kt", l = {182}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f100890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f100891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f100892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, boolean z14, String str, String str2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f100889b = eVar;
        this.f100890c = z14;
        this.f100891d = str;
        this.f100892e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f100889b, this.f100890c, this.f100891d, this.f100892e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100888a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<String>> i0VarB = this.f100889b.f100882a.b(this.f100890c, this.f100891d, this.f100892e);
        this.f100888a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
