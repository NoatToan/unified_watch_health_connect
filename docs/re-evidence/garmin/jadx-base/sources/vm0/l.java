package vm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.connections.model.ConnectionDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.InvalidGroupIdException;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteViewModel$acceptGroupMemberRequest$1", f = "GroupInviteViewModel.kt", l = {158, 166, 170, 174}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<t0<g3<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.b>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.connections.groups.services.model.b f178783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f178784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f178785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f178786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConnectionDTO f178787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wm0.c f178788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ConnectionDTO connectionDTO, wm0.c cVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f178786d = kVar;
        this.f178787e = connectionDTO;
        this.f178788f = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f178786d, this.f178787e, this.f178788f, dVar);
        lVar.f178785c = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends com.garmin.android.apps.connectmobile.connections.groups.services.model.b>> t0Var, t13.d<? super Unit> dVar) {
        return ((l) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x015a A[PHI: r3 r5
      0x015a: PHI (r3v23 com.garmin.android.apps.connectmobile.connections.groups.services.model.b) = 
      (r3v22 com.garmin.android.apps.connectmobile.connections.groups.services.model.b)
      (r3v28 com.garmin.android.apps.connectmobile.connections.groups.services.model.b)
     binds: [B:36:0x0157, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v5 java.lang.Object) binds: [B:36:0x0157, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0160  */
    /* JADX WARN: Code duplicated, block: B:42:0x0164  */
    /* JADX WARN: Code duplicated, block: B:45:0x0177  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r1.emit(r3, r34) == r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0193, code lost:
    
        if (r1.emit(r3, r34) == r2) goto L48;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar;
        Object objJ;
        v2 v2Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        t0 t0Var = (t0) this.f178785c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178784b;
        wm0.c cVar = this.f178788f;
        k kVar = this.f178786d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                bVar = this.f178783a;
                o13.r.b(obj);
                wm0.c cVar2 = new wm0.c(cVar.getGroupMemberRequestId(), null, null, null, null, 30, null);
                ym0.a aVar2 = kVar.f178775b;
                long j8 = kVar.f178777d;
                this.f178785c = t0Var;
                this.f178783a = bVar;
                this.f178784b = 3;
                aVar2.getClass();
                objJ = f0.J(aVar2, new ym0.c(aVar2, j8, cVar2, null), this);
                if (objJ != aVar) {
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.a) {
                        arrayList = kVar.f178778e;
                        if (arrayList != null) {
                            arrayList.removeIf(new s52.e(new uo1.a(bVar, 18), 18));
                        }
                        arrayList2 = kVar.f178780g;
                        if (arrayList2 != null) {
                            arrayList2.add(cVar);
                        }
                        g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 9);
                        this.f178785c = null;
                        this.f178783a = null;
                        this.f178784b = 4;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                bVar = this.f178783a;
                o13.r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.a) {
                    arrayList = kVar.f178778e;
                    if (arrayList != null) {
                        arrayList.removeIf(new s52.e(new uo1.a(bVar, 18), 18));
                    }
                    arrayList2 = kVar.f178780g;
                    if (arrayList2 != null) {
                        arrayList2.add(cVar);
                    }
                    g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 9);
                    this.f178785c = null;
                    this.f178783a = null;
                    this.f178784b = 4;
                }
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        long j14 = kVar.f178777d;
        if (j14 == -1) {
            g3 g3VarA3 = g3.a.a(g3.f35298f, null, new InvalidGroupIdException(), null, null, 13);
            this.f178785c = null;
            this.f178784b = 1;
        } else {
            Long l14 = new Long(j14);
            ConnectionDTO connectionDTO = this.f178787e;
            connectionDTO.getClass();
            String str = connectionDTO.f31654a;
            String str2 = connectionDTO.f31661h;
            Long l15 = connectionDTO.f31662i;
            com.garmin.android.apps.connectmobile.connections.groups.services.model.c cVar3 = new com.garmin.android.apps.connectmobile.connections.groups.services.model.c(str, str2, l15 != null ? String.valueOf(l15.longValue()) : null, connectionDTO.f31664k);
            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2 = new com.garmin.android.apps.connectmobile.connections.groups.services.model.b(null, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, 32767, null);
            bVar2.e0(String.valueOf(l14));
            bVar2.o0(connectionDTO.f31654a);
            bVar2.a0(connectionDTO.f31655b);
            bVar2.h0(connectionDTO.f31657d);
            bVar2.g0(String.valueOf(DateTime.now().getMillis()));
            bVar2.f0(GroupDTO.c.MEMBER);
            bVar2.c0(connectionDTO.f31656c);
            bVar2.i0(connectionDTO.f31658e);
            bVar2.j0(connectionDTO.f31659f);
            bVar2.k0(connectionDTO.f31660g);
            bVar2.f31625m = cVar3;
            bVar2.n0(connectionDTO.f31667n);
            ArrayList arrayList3 = kVar.f178778e;
            if (arrayList3 != null) {
                arrayList3.add(bVar2);
            }
            ArrayList arrayList4 = kVar.f178780g;
            if (arrayList4 != null) {
                arrayList4.removeIf(new s52.e(new uo1.a(cVar, 17), 17));
            }
            g3.f35298f.getClass();
            g3 g3VarD = g3.a.d(bVar2);
            this.f178785c = t0Var;
            this.f178783a = bVar2;
            this.f178784b = 2;
            if (t0Var.emit(g3VarD, this) != aVar) {
                bVar = bVar2;
                wm0.c cVar4 = new wm0.c(cVar.getGroupMemberRequestId(), null, null, null, null, 30, null);
                ym0.a aVar3 = kVar.f178775b;
                long j15 = kVar.f178777d;
                this.f178785c = t0Var;
                this.f178783a = bVar;
                this.f178784b = 3;
                aVar3.getClass();
                objJ = f0.J(aVar3, new ym0.c(aVar3, j15, cVar4, null), this);
                if (objJ != aVar) {
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.a) {
                        arrayList = kVar.f178778e;
                        if (arrayList != null) {
                            arrayList.removeIf(new s52.e(new uo1.a(bVar, 18), 18));
                        }
                        arrayList2 = kVar.f178780g;
                        if (arrayList2 != null) {
                            arrayList2.add(cVar);
                        }
                        g3 g3VarA4 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 9);
                        this.f178785c = null;
                        this.f178783a = null;
                        this.f178784b = 4;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return aVar;
    }
}
