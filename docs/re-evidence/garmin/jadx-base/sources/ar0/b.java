package ar0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltq0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.repo.InsightsRepo$getCompareHistogram$2", f = "InsightsRepo.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<tq0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f12532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f12533k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, String str2, String str3, String str4, int i14, int i15, boolean z14, String str5, String str6, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f12524b = aVar;
        this.f12525c = str;
        this.f12526d = str2;
        this.f12527e = str3;
        this.f12528f = str4;
        this.f12529g = i14;
        this.f12530h = i15;
        this.f12531i = z14;
        this.f12532j = str5;
        this.f12533k = str6;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f12524b, this.f12525c, this.f12526d, this.f12527e, this.f12528f, this.f12529g, this.f12530h, this.f12531i, this.f12532j, this.f12533k, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<tq0.c>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12523a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<tq0.c>> i0VarA = this.f12524b.f12522a.a(this.f12525c, this.f12526d, this.f12527e, this.f12528f, this.f12529g, this.f12530h, this.f12531i, this.f12532j, this.f12533k);
        this.f12523a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
