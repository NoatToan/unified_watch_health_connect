package ym0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupListDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lym0/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lko1/a;", "conversationApi", "Lzm0/a;", "groupApi", "Lpz0/d;", "userSearchApi", "Lzm0/b;", "groupChallengeApi", "Lmj1/a;", "privacyAPI", "<init>", "(Lko1/a;Lzm0/a;Lpz0/d;Lzm0/b;Lmj1/a;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3709a f197886f = new C3709a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko1.a f197887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm0.a f197888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pz0.d f197889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zm0.b f197890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj1.a f197891e;

    public a(ko1.a aVar, zm0.a aVar2, pz0.d dVar, zm0.b bVar, mj1.a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        dVar.getClass();
        bVar.getClass();
        aVar3.getClass();
        this.f197887a = aVar;
        this.f197888b = aVar2;
        this.f197889c = dVar;
        this.f197890d = bVar;
        this.f197891e = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, kb0.d dVar, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f198013d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f198013d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objJ = oVar.f198011b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f198013d;
        if (i15 == 0) {
            o13.r.b(objJ);
            p pVar = new p(this, str, null);
            oVar.f198010a = dVar;
            oVar.f198013d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, pVar, oVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = oVar.f198010a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            dVar.invoke(((GroupListDTO) ((v2.b) v2Var).f47386a).h());
        }
        return v2Var;
    }

    /* JADX INFO: renamed from: ym0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lym0/a$a;", "", "<init>", "()V", "", "PLAYER_LIMIT", "I", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3709a {
        public /* synthetic */ C3709a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a() {
            ez0.b bVar = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            return new a((ko1.a) ez0.b.a(bVar, cVar, ko1.a.class, new c83.h.a[0], null, null, null, 120), (zm0.a) ez0.b.a(bVar, cVar, zm0.a.class, new c83.h.a[0], null, null, null, 120), (pz0.d) ez0.b.a(bVar, cVar, pz0.d.class, new c83.h.a[0], null, null, null, 120), (zm0.b) ez0.b.a(bVar, cVar, zm0.b.class, new c83.h.a[0], null, null, null, 120), (mj1.a) ez0.b.a(bVar, cVar, mj1.a.class, new c83.h.a[0], null, null, null, 120));
        }

        private C3709a() {
        }
    }
}
