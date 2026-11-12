package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$clearUnusedAudioNotes$1", f = "WorkoutEditCreateViewModel.kt", l = {220, 221, 224, 229}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f49381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f49382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f49382c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f49382c, dVar);
        sVar.f49381b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (v52.d.d(r9, r0, r8) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (v52.d.d(r9, r0, r8) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        o53.b0 b0Var = (o53.b0) this.f49381b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49380a;
        r rVar = this.f49382c;
        if (i14 == 0) {
            o13.r.b(obj);
            q53.w<v52.c<? extends o>> wVar = rVar.f49287n;
            v52.c.b bVar = v52.c.b.f175759a;
            this.f49381b = b0Var;
            this.f49380a = 1;
            if (wVar.h(bVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                a2 a2Var = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "WorkoutEditCreateViewModel", "clearUnusedAudioNotes: Audio Note delete succeeded");
                q53.w<v52.c<? extends o>> wVar2 = rVar.f49287n;
                o.p pVar = o.p.f49240a;
                this.f49381b = null;
                this.f49380a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                a2 a2Var2 = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.k(a2Var2, "WorkoutEditCreateViewModel", "clearUnusedAudioNotes: Audio Note delete failed");
                q53.w<v52.c<? extends o>> wVar3 = rVar.f49287n;
                o.p pVar2 = o.p.f49240a;
                this.f49381b = null;
                this.f49380a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        l52.y yVar = rVar.f49274a;
        ArrayList arrayList = rVar.f49281h;
        this.f49381b = b0Var;
        this.f49380a = 2;
        obj = yVar.r(arrayList, this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                a2 a2Var3 = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "WorkoutEditCreateViewModel", "clearUnusedAudioNotes: Audio Note delete succeeded");
                q53.w<v52.c<? extends o>> wVar4 = rVar.f49287n;
                o.p pVar3 = o.p.f49240a;
                this.f49381b = null;
                this.f49380a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                a2 a2Var4 = a2.WORKOUTS;
                i2.f36769a.getClass();
                i2.a.k(a2Var4, "WorkoutEditCreateViewModel", "clearUnusedAudioNotes: Audio Note delete failed");
                q53.w<v52.c<? extends o>> wVar5 = rVar.f49287n;
                o.p pVar4 = o.p.f49240a;
                this.f49381b = null;
                this.f49380a = 4;
            }
        }
        return aVar;
    }
}
