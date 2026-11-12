package cc0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import org.json.JSONArray;
import org.json.JSONException;
import p005kotlin.Metadata;
import pc0.j;
import pc0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcc0/c;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "connectUserDisplayName", "Lcc0/c$a;", "mCallback", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljava/lang/String;Lcc0/c$a;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f26688k;

    public interface a {
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.biz.FetchUserActiveDevicesFromGCTask", f = "FetchUserActiveDevicesFromGCTask.kt", l = {29}, m = "executeBackgroundWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f26689a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26691c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f26689a = obj;
            this.f26691c |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, String str, a aVar) {
        super(bVar);
        bVar.getClass();
        str.getClass();
        aVar.getClass();
        this.f26687j = str;
        this.f26688k = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f26691c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f26691c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objJ = bVar.f26689a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f26691c;
        if (i15 == 0) {
            r.b(objJ);
            j jVarA = j.a.a(j.f137223i);
            bVar.f26691c = 1;
            objJ = f0.J(jVarA, new k(jVarA, this.f26687j, null), bVar);
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
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        try {
            a aVar2 = this.f26688k;
            JSONArray jSONArray = new JSONArray((String) ((v2.b) v2Var).f47386a);
            e eVar = e.this;
            d dVar2 = new d(eVar, jSONArray, eVar.f26699q);
            eVar.f26698p = dVar2;
            eVar.b(dVar2);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        } catch (JSONException e4) {
            a2 a2Var = a2.DEVICES;
            String strN = fb1.c.n("Error creating JSONArray from string provided by FetchUserActiveDevicesFromGCTask: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FetchUserActiveDevices", strN);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
    }
}
