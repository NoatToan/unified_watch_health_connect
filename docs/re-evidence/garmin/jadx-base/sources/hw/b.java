package hw;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.strava.StravaSegmentStatusDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhw/b;", "Lew/a;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f85924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f85925k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.operations.strava.GetStravaConnectionStatusTask$getCompatibleDevices$compatibleDevices$1", f = "GetStravaConnectionStatusTask.kt", l = {51, 53}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f85926a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f85928c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f85926a = obj;
            this.f85928c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, boolean z14) {
        super(cVar);
        this.f85924j = cVar;
        this.f85925k = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        v2 v2Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f85928c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f85928c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f85926a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f85928c;
        if (i15 == 0) {
            r.b(objJ);
            if (this.f85925k) {
                gr1.b.f78550d.getClass();
                gr1.b bVarA = gr1.b.a.a();
                aVar.f85928c = 1;
                objJ = f0.J(bVarA, new gr1.e(bVarA, null), aVar);
            } else {
                gr1.b.f78550d.getClass();
                gr1.b bVarA2 = gr1.b.a.a();
                aVar.f85928c = 2;
                objJ = f0.J(bVarA2, new gr1.d(bVarA2, null), aVar);
            }
            return aVar2;
        }
        if (i15 == 1) {
            r.b(objJ);
            v2Var = (v2) objJ;
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
            v2Var = (v2) objJ;
        }
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        c cVar = this.f85924j;
        fr1.h hVar = cVar.f85930m;
        hVar.f73306a = (StravaSegmentStatusDTO) ((v2.b) v2Var).f47386a;
        cVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, hVar);
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }
}
