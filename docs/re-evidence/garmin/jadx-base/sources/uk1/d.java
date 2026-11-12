package uk1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.usersummary.UserDailySummaryDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luk1/d;", "Lew/a;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f171882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f171883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f171884l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.biz.GetHRZonesConfigOperation$getAverageRestingHR$1", f = "GetHRZonesConfigOperation.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f171885a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f171887c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f171885a = obj;
            this.f171887c |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, String str2) {
        super(cVar);
        this.f171882j = cVar;
        this.f171883k = str;
        this.f171884l = str2;
        cVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f171887c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f171887c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f171885a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f171887c;
        if (i15 == 0) {
            r.b(objJ);
            b22.i.a aVar3 = b22.i.f15480b;
            b22.h hVar = (b22.h) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b22.h.class, new c83.h.a[0], null, null, null, 120);
            aVar3.getClass();
            hVar.getClass();
            b22.i iVar = new b22.i(hVar);
            String str = this.f171884l;
            str.getClass();
            aVar.f171887c = 1;
            objJ = f0.J(iVar, new b22.j(iVar, this.f171883k, str, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        int i16 = ((UserDailySummaryDTO) ((v2.b) v2Var).f47386a).E;
        vk1.b bVar = this.f171882j.f171880n;
        vk1.f fVar = bVar.f178585e;
        if (fVar != null) {
            fVar.f178630v = i16;
        }
        vk1.f fVar2 = bVar.f178586f;
        if (fVar2 != null) {
            fVar2.f178630v = i16;
        }
        vk1.f fVar3 = bVar.f178587g;
        if (fVar3 != null) {
            fVar3.f178630v = i16;
        }
        vk1.f fVar4 = bVar.f178588h;
        if (fVar4 != null) {
            fVar4.f178630v = i16;
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
