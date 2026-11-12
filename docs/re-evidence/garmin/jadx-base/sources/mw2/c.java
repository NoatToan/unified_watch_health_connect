package mw2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import cx2.h;
import dt2.g;
import kw2.d;
import l73.k;
import o13.r;
import o53.c2;
import org.greenrobot.eventbus.ThreadMode;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmw2/c;", "Lkw2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "Ldt2/g;", "messenger", "<init>", "(Landroid/content/Context;JLdt2/g;)V", "Lmw2/a;", "compositionEvent", "", "onCompositionsReceived", "(Lmw2/a;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f121305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f121306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f121307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, long j8, g gVar) {
        super(gVar);
        context.getClass();
        gVar.getClass();
        this.f121305e = context;
        this.f121306f = j8;
        this.f121307g = new h("CompositionServiceCalls", null, 2, null);
    }

    @Override // kw2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getF121307g() {
        return this.f121307g;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(int i14, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, v13.c cVar) {
        b bVar;
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService;
        Object objA;
        int i15;
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService2;
        Object objA2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i16 = bVar.f121304d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                bVar.f121304d = i16 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object objB = bVar2.f121302b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = bVar2.f121304d;
        h hVar = this.f121307g;
        if (i17 == 0) {
            r.b(objB);
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            String strB = com.garmin.realtimesettings.app.initialization.b.b(this.f121305e, this.f121306f);
            hVar.getClass();
            if (!strB.equals("REQUEST_RESPONSE")) {
                if (strB.equals("NOTIFICATION")) {
                    bVar2.f121301a = i14;
                    bVar2.f121304d = 3;
                    objB = b(builder, bVar2);
                    if (objB != obj) {
                        i15 = i14;
                        realtimeSettingsService2 = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
                        if (realtimeSettingsService2 != null) {
                            hVar.getClass();
                            iw2.a.C1825a c1825a = iw2.a.f95338a;
                            bVar2.f121301a = i15;
                            bVar2.f121304d = 4;
                            objA2 = c1825a.a(this.f121305e, this.f121306f, i15, realtimeSettingsService2, bVar2);
                            if (objA2 != obj) {
                                return objA2;
                            }
                        }
                    }
                }
                Logger logger = h.f56678c;
                hVar.getClass();
                return Boolean.FALSE;
            }
            bVar2.f121301a = i14;
            bVar2.f121304d = 1;
            objB = c(builder, bVar2);
            if (objB != obj) {
                realtimeSettingsService = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
                if (realtimeSettingsService != null) {
                    hVar.getClass();
                    iw2.a.C1825a c1825a2 = iw2.a.f95338a;
                    bVar2.f121301a = i14;
                    bVar2.f121304d = 2;
                    objA = c1825a2.a(this.f121305e, this.f121306f, i14, realtimeSettingsService, bVar2);
                    if (objA != obj) {
                        return objA;
                    }
                }
                Logger logger2 = h.f56678c;
                hVar.getClass();
                return Boolean.FALSE;
            }
            return obj;
        }
        if (i17 == 1) {
            i14 = bVar2.f121301a;
            r.b(objB);
            realtimeSettingsService = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
            if (realtimeSettingsService != null) {
                hVar.getClass();
                iw2.a.C1825a c1825a3 = iw2.a.f95338a;
                bVar2.f121301a = i14;
                bVar2.f121304d = 2;
                objA = c1825a3.a(this.f121305e, this.f121306f, i14, realtimeSettingsService, bVar2);
                if (objA != obj) {
                    return obj;
                }
                return objA;
            }
            Logger logger3 = h.f56678c;
            hVar.getClass();
            return Boolean.FALSE;
        }
        if (i17 == 2) {
            r.b(objB);
            return objB;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                r.b(objB);
                return objB;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = bVar2.f121301a;
        r.b(objB);
        i15 = i14;
        realtimeSettingsService2 = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
        if (realtimeSettingsService2 != null) {
            hVar.getClass();
            iw2.a.C1825a c1825a4 = iw2.a.f95338a;
            bVar2.f121301a = i15;
            bVar2.f121304d = 4;
            objA2 = c1825a4.a(this.f121305e, this.f121306f, i15, realtimeSettingsService2, bVar2);
            if (objA2 != obj) {
                return obj;
            }
            return objA2;
        }
        Logger logger4 = h.f56678c;
        hVar.getClass();
        return Boolean.FALSE;
    }

    @Override // kw2.d
    @k(threadMode = ThreadMode.POSTING)
    public void onCompositionsReceived(a compositionEvent) {
        compositionEvent.getClass();
        this.f121307g.getClass();
        this.f106998d = compositionEvent.f106999a;
        c2 c2Var = this.f106997c;
        if (c2Var != null) {
            c2Var.c(null);
        }
    }
}
