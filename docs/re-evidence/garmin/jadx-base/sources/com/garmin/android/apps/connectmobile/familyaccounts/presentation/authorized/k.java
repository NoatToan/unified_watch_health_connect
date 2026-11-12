package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel$onInviteIssued$1", f = "AuthorizedViewersViewModel.kt", l = {441, 452, 271}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f35134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f35135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ue0.j f35136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z53.a f35137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h.c f35138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f35143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ue0.j f35144k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, ue0.j jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f35143j = hVar;
        this.f35144k = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f35143j, this.f35144k, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e2 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:40:0x00da, B:42:0x00e2, B:47:0x00f3, B:49:0x00f9), top: B:67:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:40:0x00da, B:42:0x00e2, B:47:0x00f3, B:49:0x00f9), top: B:67:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        z53.a aVar;
        h hVar;
        ue0.j jVar;
        int i14;
        ue0.j jVar2;
        h.c cVar;
        h hVar2;
        int i15;
        int i16;
        z53.a aVar2;
        int i17;
        LinkedHashMap linkedHashMap;
        Long inviteeUserId;
        Integer num;
        z53.a aVar3;
        Object objA;
        h.c cVar2;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i18 = this.f35142i;
        try {
            try {
                if (i18 == 0) {
                    r.b(obj);
                    hVar = this.f35143j;
                    z53.b bVar = hVar.f35095k;
                    this.f35134a = bVar;
                    this.f35135b = hVar;
                    jVar = this.f35144k;
                    this.f35136c = jVar;
                    this.f35139f = 0;
                    this.f35142i = 1;
                    if (bVar.c(this) != aVar4) {
                        aVar = bVar;
                        i14 = 0;
                    }
                    return aVar4;
                }
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cVar2 = this.f35138e;
                        aVar2 = this.f35137d;
                        ue0.j jVar3 = this.f35136c;
                        hVar2 = this.f35135b;
                        aVar3 = this.f35134a;
                        try {
                            r.b(obj);
                            jVar2 = jVar3;
                            objA = obj;
                            hVar2.f35091g.putAll((Map) objA);
                            cVar = cVar2;
                            Unit unit = Unit.INSTANCE;
                            aVar2.e(null);
                            ArrayList arrayList = new ArrayList(cVar.f35106a);
                            arrayList.add(jVar2);
                            h.c cVarA = h.c.a(cVar, arrayList, null, null, 30);
                            int i19 = h.f35084w;
                            hVar2.H4(cVarA);
                            hVar2.f35104v.set(true);
                            aVar = aVar3;
                            Unit unit2 = Unit.INSTANCE;
                            aVar.e(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2.e(null);
                            throw th;
                        }
                    }
                    int i24 = this.f35141h;
                    int i25 = this.f35140g;
                    int i26 = this.f35139f;
                    cVar = this.f35138e;
                    z53.a aVar5 = this.f35137d;
                    jVar2 = this.f35136c;
                    h hVar3 = this.f35135b;
                    aVar = this.f35134a;
                    r.b(obj);
                    i15 = i25;
                    aVar2 = aVar5;
                    i16 = i26;
                    hVar2 = hVar3;
                    i17 = i24;
                    try {
                        linkedHashMap = hVar2.f35091g;
                        inviteeUserId = jVar2.getInviteeUserId();
                        if (inviteeUserId != null) {
                            num = new Integer((int) inviteeUserId.longValue());
                        } else {
                            num = null;
                        }
                        if (linkedHashMap.get(num) == null) {
                            a22.i iVar = hVar2.f35087c;
                            List<String> listC = w.c(String.valueOf(jVar2.getInviteeUserId()));
                            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                            this.f35134a = aVar;
                            this.f35135b = hVar2;
                            this.f35136c = jVar2;
                            this.f35137d = aVar2;
                            this.f35138e = cVar;
                            this.f35139f = i16;
                            this.f35140g = i15;
                            this.f35141h = i17;
                            this.f35142i = 3;
                            objA = iVar.a(listC, listK, this);
                            if (objA != aVar4) {
                                cVar2 = cVar;
                                aVar3 = aVar;
                                hVar2.f35091g.putAll((Map) objA);
                                cVar = cVar2;
                            }
                            return aVar4;
                        }
                        aVar3 = aVar;
                        Unit unit3 = Unit.INSTANCE;
                        aVar2.e(null);
                        ArrayList arrayList2 = new ArrayList(cVar.f35106a);
                        arrayList2.add(jVar2);
                        h.c cVarA2 = h.c.a(cVar, arrayList2, null, null, 30);
                        int i110 = h.f35084w;
                        hVar2.H4(cVarA2);
                        hVar2.f35104v.set(true);
                        aVar = aVar3;
                        Unit unit4 = Unit.INSTANCE;
                        aVar.e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2.e(null);
                        throw th;
                    }
                }
                i14 = this.f35139f;
                jVar = this.f35136c;
                hVar = this.f35135b;
                z53.a aVar6 = this.f35134a;
                r.b(obj);
                aVar = aVar6;
                h.c cVar3 = hVar.f35096l;
                if (cVar3 == null) {
                    j0 j0Var = j0.f134944a;
                    cVar3 = new h.c(j0Var, j0Var, j0Var, j0Var, j0Var);
                }
                List<ue0.j> list = cVar3.f35106a;
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (s.g(((ue0.j) it.next()).getInviteeUserId(), jVar.getInviteeUserId())) {
                            }
                        }
                        Unit unit5 = Unit.INSTANCE;
                        aVar.e(null);
                        return Unit.INSTANCE;
                    }
                }
                z53.b bVar2 = hVar.f35092h;
                this.f35134a = aVar;
                this.f35135b = hVar;
                this.f35136c = jVar;
                this.f35137d = bVar2;
                this.f35138e = cVar3;
                this.f35139f = i14;
                this.f35140g = 0;
                this.f35141h = 0;
                this.f35142i = 2;
                if (bVar2.c(this) != aVar4) {
                    h.c cVar4 = cVar3;
                    jVar2 = jVar;
                    cVar = cVar4;
                    hVar2 = hVar;
                    i15 = 0;
                    i16 = i14;
                    aVar2 = bVar2;
                    i17 = 0;
                    linkedHashMap = hVar2.f35091g;
                    inviteeUserId = jVar2.getInviteeUserId();
                    if (inviteeUserId != null) {
                        num = new Integer((int) inviteeUserId.longValue());
                    } else {
                        num = null;
                    }
                    if (linkedHashMap.get(num) == null) {
                        a22.i iVar2 = hVar2.f35087c;
                        List<String> listC2 = w.c(String.valueOf(jVar2.getInviteeUserId()));
                        List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK2 = x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_PROFILE, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                        this.f35134a = aVar;
                        this.f35135b = hVar2;
                        this.f35136c = jVar2;
                        this.f35137d = aVar2;
                        this.f35138e = cVar;
                        this.f35139f = i16;
                        this.f35140g = i15;
                        this.f35141h = i17;
                        this.f35142i = 3;
                        objA = iVar2.a(listC2, listK2, this);
                        if (objA != aVar4) {
                            cVar2 = cVar;
                            aVar3 = aVar;
                            hVar2.f35091g.putAll((Map) objA);
                            cVar = cVar2;
                        }
                    } else {
                        aVar3 = aVar;
                    }
                    Unit unit6 = Unit.INSTANCE;
                    aVar2.e(null);
                    ArrayList arrayList3 = new ArrayList(cVar.f35106a);
                    arrayList3.add(jVar2);
                    h.c cVarA3 = h.c.a(cVar, arrayList3, null, null, 30);
                    int i111 = h.f35084w;
                    hVar2.H4(cVarA3);
                    hVar2.f35104v.set(true);
                    aVar = aVar3;
                    Unit unit7 = Unit.INSTANCE;
                    aVar.e(null);
                    return Unit.INSTANCE;
                }
                return aVar4;
            } catch (Throwable th5) {
                th = th5;
                aVar = null;
                aVar.e(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            aVar.e(null);
            throw th;
        }
    }
}
