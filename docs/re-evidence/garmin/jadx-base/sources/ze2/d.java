package ze2;

import android.content.Intent;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import d53.w;
import e23.p;
import i3.e5;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$sendResultErrorToCaller$2", f = "AbstractMFAFlowActivity.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.mfa.a f204274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f204275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f204276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f204277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.android.library.mobileauth.ui.mfa.a aVar, l lVar, String str, String str2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f204274b = aVar;
        this.f204275c = lVar;
        this.f204276d = str;
        this.f204277e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f204274b, this.f204275c, this.f204276d, this.f204277e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204273a;
        if (i14 == 0) {
            r.b(obj);
            com.garmin.android.library.mobileauth.ui.mfa.a aVar2 = this.f204274b;
            Logger logger = aVar2.f50497q;
            l lVar = this.f204275c;
            logger.warn("sendResultErrorToCaller: " + lVar.name());
            Intent intent = new Intent();
            String strG = this.f204277e;
            String str = this.f204276d;
            if (str != null && !w.J(str)) {
                strG = e5.g(strG, "\n", str);
            }
            Intent intentPutExtra = intent.putExtra("mfa.error", new k(lVar, strG));
            this.f204273a = 1;
            if (aVar2.ia(1, intentPutExtra, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
