package az0;

import android.content.Context;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vc2.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvc2/l;", "<anonymous>", "(Lo53/b0;)Lvc2/l;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.network.connectivity.ConnectivityMonitor$fetchServerMaintenanceTranslations$2", f = "ConnectivityMonitor.kt", l = {170, 179}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f13668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f13669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, Context context, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f13668c = lVar;
        this.f13669d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f13668c, this.f13669d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super l> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r8 == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        h hVar;
        String message;
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13667b;
        Context context = this.f13669d;
        l lVar = this.f13668c;
        String message2 = null;
        if (i14 == 0) {
            r.b(obj);
            str = lVar != null ? lVar.f177124a : null;
            f fVar = b.f13672c;
            this.f13666a = str;
            this.f13667b = 1;
            obj = fVar.c(context, str, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            str = this.f13666a;
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        h hVar2 = (h) obj;
        b bVar = b.f13670a;
        if (hVar2 != null) {
            message2 = hVar2.getMessage();
        }
        hVar = b.f13676g;
        if (hVar != null || (message = hVar.getMessage()) == null) {
            message = "";
        }
        if (message2 == null) {
            message2 = "";
        }
        if (lVar != null) {
            z14 = lVar.f177126c;
        } else {
            z14 = false;
        }
        return new l(message, message2, z14, lVar != null ? lVar.f177127d : true);
        b.f13676g = (h) obj;
        String str2 = lVar != null ? lVar.f177125b : null;
        if (s.g(str2, str)) {
            b bVar2 = b.f13670a;
            h hVar3 = b.f13676g;
            if (hVar3 != null) {
                message2 = hVar3.getMessage();
            }
        } else {
            f fVar2 = b.f13672c;
            this.f13666a = null;
            this.f13667b = 2;
            obj = fVar2.c(context, str2, this);
        }
        hVar = b.f13676g;
        if (hVar != null) {
            message = "";
        } else {
            message = "";
        }
        if (message2 == null) {
            message2 = "";
        }
        if (lVar != null) {
            z14 = lVar.f177126c;
        } else {
            z14 = false;
        }
        return new l(message, message2, z14, lVar != null ? lVar.f177127d : true);
    }
}
