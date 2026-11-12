package k91;

import a91.m;
import a91.t;
import c22.o;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import d91.u;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionViewModel$updateLanguage$1", f = "LanguageSelectionViewModel.kt", l = {59, 69}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f103641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f103642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f103643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, c cVar, String str2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f103641b = str;
        this.f103642c = cVar;
        this.f103643d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f103641b, this.f103642c, this.f103643d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r13 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r13 == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103640a;
        String str = this.f103641b;
        c cVar = this.f103642c;
        if (i14 == 0) {
            r.b(obj);
            o oVar = cVar.f103631c;
            m mVar = cVar.f103630b;
            if (s.g(str, oVar.b())) {
                this.f103640a = 1;
                mVar.getClass();
                obj = f0.J(mVar, new t(mVar, "system", null), this);
            } else if (!s.g(str, this.f103643d)) {
                this.f103640a = 2;
                mVar.getClass();
                obj = f0.J(mVar, new t(mVar, str != null ? str : "system", null), this);
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            if (((v2) obj) instanceof v2.b) {
                p2 p2Var = cVar.f103634f;
                g3.a aVar2 = g3.f35298f;
                String strB = cVar.f103631c.b();
                aVar2.getClass();
                p2Var.k(null, g3.a.d(strB));
                cVar.f103629a.a(u.OTHER_LOCALE_CHANGE);
            } else {
                cVar.f103634f.k(null, g3.a.a(g3.f35298f, null, null, this.f103643d, null, 11));
            }
        } else {
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            if (((v2) obj) instanceof v2.b) {
                p2 p2Var2 = cVar.f103634f;
                g3.f35298f.getClass();
                p2Var2.k(null, g3.a.d(str));
                cVar.f103629a.a(u.OTHER_LOCALE_CHANGE);
            } else {
                cVar.f103634f.k(null, g3.a.a(g3.f35298f, null, null, this.f103643d, null, 11));
            }
        }
        return Unit.INSTANCE;
    }
}
