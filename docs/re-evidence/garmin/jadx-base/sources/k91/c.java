package k91;

import a91.m;
import a91.x;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.o;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import d91.w;
import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk91/c;", "Landroidx/lifecycle/u1;", "La91/x;", "provider", "La91/m;", "languageSelectionRepository", "Lc22/o;", "appUtilDelegate", "<init>", "(La91/x;La91/m;Lc22/o;)V", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f103629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f103630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f103631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f103632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f103633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f103634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f103635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f103636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f103637i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.language.LanguageSelectionViewModel$1", f = "LanguageSelectionViewModel.kt", l = {34, 41}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103638a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            if (r13 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f103638a;
            c cVar = c.this;
            if (i14 == 0) {
                r.b(obj);
                m mVar = cVar.f103630b;
                this.f103638a = 1;
                obj = mVar.c(true, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                p2 p2Var = cVar.f103634f;
                g3.a aVar2 = g3.f35298f;
                String preferredAiLanguage = ((w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                if (preferredAiLanguage == null || d53.w.J(preferredAiLanguage)) {
                    preferredAiLanguage = null;
                }
                aVar2.getClass();
                p2Var.k(null, g3.a.d(preferredAiLanguage));
            } else {
                cVar.f103634f.k(null, g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
            Set set = (Set) obj;
            if (set != null) {
                p2 p2Var2 = cVar.f103632d;
                g3.a aVar3 = g3.f35298f;
                i53.c cVarE = i53.a.e(set);
                aVar3.getClass();
                p2Var2.k(null, g3.a.d(cVarE));
            } else {
                cVar.f103632d.k(null, g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            m mVar2 = cVar.f103630b;
            this.f103638a = 2;
            obj = mVar2.a(this);
        }
    }

    public c(x xVar, m mVar, o oVar) {
        xVar.getClass();
        mVar.getClass();
        oVar.getClass();
        this.f103629a = xVar;
        this.f103630b = mVar;
        this.f103631c = oVar;
        p2 p2VarA = q2.a(g3.a.c(g3.f35298f));
        this.f103632d = p2VarA;
        this.f103633e = s.d(p2VarA);
        p2 p2VarA2 = q2.a(g3.a.b(null));
        this.f103634f = p2VarA2;
        this.f103635g = s.d(p2VarA2);
        p2 p2VarA3 = q2.a(oVar.b());
        this.f103636h = p2VarA3;
        this.f103637i = s.d(p2VarA3);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }
}
