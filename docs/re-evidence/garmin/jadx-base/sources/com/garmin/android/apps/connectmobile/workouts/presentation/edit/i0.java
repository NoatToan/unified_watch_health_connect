package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesViewModel$downloadAudioNote$1", f = "WorkoutEditNotesViewModel.kt", l = {64, 65, 68, 71}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f49011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w52.e f49012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f49013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f49014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f49015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, w52.e eVar, String str, String str2, e23.a<Unit> aVar, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f49011b = h0Var;
        this.f49012c = eVar;
        this.f49013d = str;
        this.f49014e = str2;
        this.f49015f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f49011b, this.f49012c, this.f49013d, this.f49014e, this.f49015f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49010a;
        e23.a<Unit> aVar2 = this.f49015f;
        String str = this.f49014e;
        String str2 = this.f49013d;
        h0 h0Var = this.f49011b;
        if (i14 == 0) {
            o13.r.b(obj);
            e2 e2Var = h0Var.f49003e;
            h0.a.c cVar = h0.a.c.f49009a;
            this.f49010a = 1;
            if (e2Var.emit(cVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    e2 e2Var2 = h0Var.f49003e;
                    h0.a.b bVar = h0.a.b.f49008a;
                    this.f49010a = 3;
                } else {
                    e2 e2Var3 = h0Var.f49003e;
                    h0.a.C0958a c0958a = new h0.a.C0958a(str2, str, aVar2);
                    this.f49010a = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                aVar2.invoke();
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        this.f49010a = 2;
        obj = this.f49012c.x4(str2, str, this);
        if (obj != aVar) {
            if (((Boolean) obj).booleanValue()) {
                e2 e2Var4 = h0Var.f49003e;
                h0.a.b bVar2 = h0.a.b.f49008a;
                this.f49010a = 3;
            } else {
                e2 e2Var5 = h0Var.f49003e;
                h0.a.C0958a c0958a2 = new h0.a.C0958a(str2, str, aVar2);
                this.f49010a = 4;
            }
        }
        return aVar;
    }
}
