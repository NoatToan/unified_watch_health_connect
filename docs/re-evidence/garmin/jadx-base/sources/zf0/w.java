package zf0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lfg0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$getUserEventsByDateRangeAndEventType$2", f = "EventRepo.kt", l = {159}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends fg0.k>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f204522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f204523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f204524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f204525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d dVar, String str, String str2, String str3, String str4, t13.d<? super w> dVar2) {
        super(1, dVar2);
        this.f204521b = dVar;
        this.f204522c = str;
        this.f204523d = str2;
        this.f204524e = str3;
        this.f204525f = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f204521b, this.f204522c, this.f204523d, this.f204524e, this.f204525f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends fg0.k>>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204520a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0 i0VarB = b.B(this.f204521b.f204344a, this.f204522c, this.f204523d, this.f204524e, this.f204525f, null, 16);
        this.f204520a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
