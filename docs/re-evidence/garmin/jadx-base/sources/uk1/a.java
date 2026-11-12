package uk1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luk1/a;", "Lew/a;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f171874j;

    /* JADX INFO: renamed from: uk1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.biz.GetAllPowerZonesOperation$getPowerZonesList$1", f = "GetAllPowerZonesOperation.kt", l = {20}, m = "executeBackgroundWork", v = 2)
    public static final class C3196a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f171875a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f171877c;

        public C3196a(t13.d<? super C3196a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f171875a = obj;
            this.f171877c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        this.f171874j = bVar;
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        C3196a c3196a;
        if (dVar instanceof C3196a) {
            c3196a = (C3196a) dVar;
            int i14 = c3196a.f171877c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c3196a.f171877c = i14 - Integer.MIN_VALUE;
            } else {
                c3196a = new C3196a(dVar);
            }
        } else {
            c3196a = new C3196a(dVar);
        }
        Object objJ = c3196a.f171875a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c3196a.f171877c;
        if (i15 == 0) {
            r.b(objJ);
            wk1.a aVarA = wk1.a.C3455a.a(wk1.a.f185807b);
            c3196a.f171877c = 1;
            objJ = f0.J(aVarA, new wk1.d(aVarA, null), c3196a);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            this.f171874j.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, ((v2.b) v2Var).f47386a);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }
}
