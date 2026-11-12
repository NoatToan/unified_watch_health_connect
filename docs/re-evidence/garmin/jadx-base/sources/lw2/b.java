package lw2;

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
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llw2/b;", "Lkw2/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "Ldt2/g;", "messenger", "<init>", "(Landroid/content/Context;JLdt2/g;)V", "Llw2/a;", "changeResponseEvent", "", "onChangeResponseReceived", "(Llw2/a;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f115126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f115127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f115128g;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.changeresponse.ChangeResponseServiceCalls", f = "ChangeResponseServiceCalls.kt", l = {40, 47}, m = "getSettingsChangeResponseService", v = 1)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f115129a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115131c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f115129a = obj;
            this.f115131c |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, long j8, g gVar) {
        super(gVar);
        context.getClass();
        gVar.getClass();
        this.f115126e = context;
        this.f115127f = j8;
        this.f115128g = new h("ChangeResponseServiceCalls", null, 2, null);
    }

    @Override // kw2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getF115128g() {
        return this.f115128g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r12 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, t13.d<? super String> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f115131c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f115131c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f115129a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f115131c;
        Context context = this.f115126e;
        h hVar = this.f115128g;
        if (i15 == 0) {
            r.b(objB);
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            String strB = com.garmin.realtimesettings.app.initialization.b.b(context, this.f115127f);
            hVar.getClass();
            if (strB.equals("REQUEST_RESPONSE")) {
                aVar.f115131c = 1;
                objB = c(builder, aVar);
            } else if (strB.equals("NOTIFICATION")) {
                aVar.f115131c = 2;
                objB = b(builder, aVar);
            }
            return obj;
        }
        if (i15 == 1) {
            r.b(objB);
            GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
            if (realtimeSettingsService != null) {
                hVar.getClass();
                iw2.a.f95338a.getClass();
                return iw2.a.C1825a.f(context, realtimeSettingsService);
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
            GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService2 = (GDIRealtimeSettingsProto.RealtimeSettingsService) objB;
            if (realtimeSettingsService2 != null) {
                iw2.a.f95338a.getClass();
                return iw2.a.C1825a.f(context, realtimeSettingsService2);
            }
        }
        Logger logger = h.f56678c;
        hVar.getClass();
        return null;
    }

    @Override // kw2.d
    @k(threadMode = ThreadMode.POSTING)
    public void onChangeResponseReceived(lw2.a changeResponseEvent) {
        changeResponseEvent.getClass();
        this.f115128g.getClass();
        this.f106998d = changeResponseEvent.f106999a;
        c2 c2Var = this.f106997c;
        if (c2Var != null) {
            c2Var.c(null);
        }
    }
}
