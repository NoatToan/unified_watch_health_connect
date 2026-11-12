package nu0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;
import wd2.h2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetracking.LivetrackLiveEventHandler$respondToLiveEventSharing$1", f = "LivetrackLiveEventHandler.kt", l = {81, 83}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f127904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lu0.a f127905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f127906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lu0.a f127907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f127908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f127909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f127910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h2 f127911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f127912i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h2 h2Var, e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f127911h = h2Var;
        this.f127912i = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f127911h, this.f127912i, dVar);
        fVar.f127910g = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        lu0.a aVar;
        String str;
        int i14;
        lu0.a aVar2;
        String str2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f127909f;
        if (i15 != 0) {
            if (i15 == 1) {
                int i16 = this.f127908e;
                str = this.f127906c;
                lu0.a aVar4 = this.f127905b;
                eVar = this.f127904a;
                r.b(obj);
                i14 = i16;
                aVar = aVar4;
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f127907d;
                str2 = this.f127906c;
                r.b(obj);
            }
            aVar2.a(str2, (List) obj);
            return Unit.INSTANCE;
        }
        r.b(obj);
        a2 a2Var = a2.LIVE_EVENT_SHARING;
        h2 h2Var = this.f127911h;
        String strN = fb1.c.n("Live event session short url ", h2Var.f184493c);
        i2.f36769a.getClass();
        i2.a.k(a2Var, "LT#LiveEventHandler", strN);
        String str3 = h2Var.f184493c;
        if (str3 != null) {
            eVar = this.f127912i;
            String string = eVar.f127900a.getString(R.string.live_event_sharing_text_start_livetrack, str3);
            string.getClass();
            aVar = new lu0.a(eVar.f127900a);
            ju0.e eVar2 = (ju0.e) eVar.f127902c.getValue();
            long j8 = eVar.f127901b;
            this.f127910g = null;
            this.f127904a = eVar;
            this.f127905b = aVar;
            this.f127906c = string;
            this.f127908e = 0;
            this.f127909f = 1;
            Object objA = eVar2.a(j8, this, true);
            if (objA != aVar3) {
                str = string;
                obj = objA;
                i14 = 0;
            }
            return aVar3;
        }
        return Unit.INSTANCE;
        gu0.b bVar = (gu0.b) obj;
        if ((bVar != null ? s.g(bVar.f79037b, Boolean.TRUE) : false) && s.g(bVar.f79039d, Boolean.TRUE)) {
            ju0.e eVar3 = (ju0.e) eVar.f127902c.getValue();
            this.f127910g = null;
            this.f127904a = null;
            this.f127905b = null;
            this.f127906c = str;
            this.f127907d = aVar;
            this.f127908e = i14;
            this.f127909f = 2;
            ju0.e.a aVar5 = ju0.e.f100881g;
            obj = eVar3.b(false, this);
            if (obj != aVar3) {
                aVar2 = aVar;
                str2 = str;
                aVar2.a(str2, (List) obj);
            }
            return aVar3;
        }
        return Unit.INSTANCE;
    }
}
