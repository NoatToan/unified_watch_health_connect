package nw2;

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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnw2/c;", "Lkw2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "Ldt2/g;", "messenger", "<init>", "(Landroid/content/Context;JLdt2/g;)V", "Lnw2/a;", "dataResponseEvent", "", "onDataResponseReceived", "(Lnw2/a;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f128182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f128183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f128184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f128185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, long j8, g gVar) {
        super(gVar);
        context.getClass();
        gVar.getClass();
        this.f128182e = context;
        this.f128183f = j8;
        this.f128184g = new h("DataResponseServiceCalls", null, 2, null);
    }

    @Override // kw2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getF128184g() {
        return this.f128184g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r12 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i14, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i15 = bVar.f128181c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f128181c = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objB = bVar.f128179a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = bVar.f128181c;
        h hVar = this.f128184g;
        if (i16 == 0) {
            r.b(objB);
            this.f128185h = new Integer(i14);
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            String strB = com.garmin.realtimesettings.app.initialization.b.b(this.f128182e, this.f128183f);
            hVar.getClass();
            if (strB.equals("REQUEST_RESPONSE")) {
                bVar.f128181c = 1;
                objB = c(builder, bVar);
            } else if (strB.equals("NOTIFICATION")) {
                bVar.f128181c = 2;
                objB = b(builder, bVar);
            }
            return obj;
        }
        if (i16 == 1) {
            r.b(objB);
            GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
            if (realtimeSettingsService != null) {
                hVar.getClass();
                iw2.a.f95338a.getClass();
                return iw2.a.C1825a.g(realtimeSettingsService);
            }
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
            GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService2 = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
            if (realtimeSettingsService2 != null) {
                hVar.getClass();
                iw2.a.f95338a.getClass();
                return iw2.a.C1825a.g(realtimeSettingsService2);
            }
        }
        Logger logger = h.f56678c;
        hVar.getClass();
        return null;
    }

    @Override // kw2.d
    @k(threadMode = ThreadMode.POSTING)
    public void onDataResponseReceived(a dataResponseEvent) {
        dataResponseEvent.getClass();
        this.f128184g.getClass();
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService = dataResponseEvent.f106999a;
        int compositionId = realtimeSettingsService.getSettingsResponse().getSettings().getCompositionId();
        Integer num = this.f128185h;
        if (num == null || compositionId != num.intValue()) {
            Logger logger = h.f56678c;
            return;
        }
        this.f106998d = realtimeSettingsService;
        c2 c2Var = this.f106997c;
        if (c2Var != null) {
            c2Var.c(null);
        }
    }
}
