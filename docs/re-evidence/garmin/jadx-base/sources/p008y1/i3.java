package p008y1;

import a5.b;
import e23.p;
import g6.s;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg6/s;", "velocity", "<anonymous>", "(Lg6/s;)Lg6/s;"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {833, 836, 839}, m = "invokeSuspend", v = 1)
public final class i3 extends i implements p<s, d<? super s>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f193307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f193309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3 f193310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(h3 h3Var, d<? super i3> dVar) {
        super(2, dVar);
        this.f193310d = h3Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        i3 i3Var = new i3(this.f193310d, dVar);
        i3Var.f193309c = ((s) obj).f76027a;
        return i3Var;
    }

    @Override // e23.p
    public final Object invoke(s sVar, d<? super s> dVar) {
        return ((i3) create(s.a(sVar.f76027a), dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long j8;
        long j14;
        long j15;
        long j16;
        long j17;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.f193308b;
        h3 h3Var = this.f193310d;
        if (i14 == 0) {
            r.b(obj);
            j8 = this.f193309c;
            b bVar = h3Var.f193259f;
            this.f193309c = j8;
            this.f193308b = 1;
            obj = bVar.c(j8, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j8 = this.f193309c;
            r.b(obj);
        } else {
            if (i14 == 2) {
                j14 = this.f193307a;
                j8 = this.f193309c;
                r.b(obj);
                j15 = ((s) obj).f76027a;
                b bVar2 = h3Var.f193259f;
                long jE = s.e(j14, j15);
                this.f193309c = j8;
                this.f193307a = j15;
                this.f193308b = 3;
                obj = bVar2.a(jE, j15, this);
                if (obj != aVar) {
                    j16 = j8;
                    j17 = j15;
                }
                return aVar;
            }
            if (i14 != 3) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j17 = this.f193307a;
            j16 = this.f193309c;
            r.b(obj);
        }
        return s.a(s.e(j16, s.e(j17, ((s) obj).f76027a)));
        long jE2 = s.e(j8, ((s) obj).f76027a);
        this.f193309c = j8;
        this.f193307a = jE2;
        this.f193308b = 2;
        obj = h3Var.a(jE2, this);
        if (obj != aVar) {
            j14 = jE2;
            j15 = ((s) obj).f76027a;
            b bVar3 = h3Var.f193259f;
            long jE3 = s.e(j14, j15);
            this.f193309c = j8;
            this.f193307a = j15;
            this.f193308b = 3;
            obj = bVar3.a(jE3, j15, this);
            if (obj != aVar) {
                j16 = j8;
                j17 = j15;
                return s.a(s.e(j16, s.e(j17, ((s) obj).f76027a)));
            }
        }
        return aVar;
    }
}
