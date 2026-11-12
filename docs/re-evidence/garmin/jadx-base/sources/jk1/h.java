package jk1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import e23.p;
import hk1.w;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p92.o;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.connect.ThirdPartyConnectViewModel$connectThirdPartyApp$1", f = "ThirdPartyConnectViewModel.kt", l = {133, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f99412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f99413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f99414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f99415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f99416f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<hk1.q, String> {
        public a(Object obj) {
            super(1, obj, f.class, "buildThirdPartyUri", "buildThirdPartyUri(Lcom/garmin/android/apps/connectmobile/settings/thirdparty/model/ThirdPartyAuthorizationResult;)Ljava/lang/String;", 0);
        }

        @Override // e23.l
        public final String invoke(hk1.q qVar) {
            hk1.q qVar2 = qVar;
            qVar2.getClass();
            f fVar = (f) this.receiver;
            int i14 = f.f99396l;
            return fVar.x4(qVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, String str, String str2, String str3, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f99413c = fVar;
        this.f99414d = str;
        this.f99415e = str2;
        this.f99416f = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f99413c, this.f99414d, this.f99415e, this.f99416f, dVar);
        hVar.f99412b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r0.b(r1, r8.f99414d, r8.f99415e, r4, r2, r6, r7, r8) == r9) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objR;
        p2 p2Var;
        Object value;
        h hVar = this;
        b0 b0Var = (b0) hVar.f99412b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = hVar.f99411a;
        f fVar = hVar.f99413c;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                objR = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        p2 p2Var2 = fVar.f99406j;
        while (true) {
            Object value2 = p2Var2.getValue();
            if (p2Var2.b(value2, e.a((e) value2, true, null, null, null, 510))) {
                break;
            }
            hVar = this;
        }
        s92.g gVar = fVar.f99405i;
        if (gVar != null) {
            o oVar = fVar.f99399c;
            hVar.f99412b = b0Var;
            hVar.f99411a = 1;
            objR = oVar.r(hVar.f99416f, gVar, hVar);
            if (objR != aVar) {
            }
            return aVar;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "ThirdPartyConnectViewModel", "connectThirdPartyApp -> grantThirdPartyConsent FAILED");
        p2Var = fVar.f99406j;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, e.a((e) value, false, null, null, null, 508)));
        return Unit.INSTANCE;
        if (((Boolean) objR).booleanValue()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "ThirdPartyConnectViewModel", "connectThirdPartyApp -> grantThirdPartyConsent SUCCESS");
            ek1.d dVar = fVar.f99402f;
            w wVar = fVar.f99397a;
            List<String> list = fVar.f99404h;
            a aVar4 = new a(fVar);
            g gVar2 = new g(fVar, 0);
            g gVar3 = new g(fVar, 1);
            hVar.f99412b = null;
            hVar.f99411a = 2;
        } else {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var3, "ThirdPartyConnectViewModel", "connectThirdPartyApp -> grantThirdPartyConsent FAILED");
            p2Var = fVar.f99406j;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, e.a((e) value, false, null, null, null, 508)));
        }
        return Unit.INSTANCE;
    }
}
