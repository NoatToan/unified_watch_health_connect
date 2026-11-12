package v10;

import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.browser.ExternalBrowserAuthResponseActivity;
import java.util.List;
import kh2.j;
import n72.i;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.p0;
import t20.h;
import u10.l;
import v92.c0;
import v92.d;
import v92.i0;
import v92.k0;
import v92.o;
import vc0.u;
import vd0.o0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174665a;

    public /* synthetic */ a(int i14) {
        this.f174665a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        List<i> listA;
        m72.i iVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f174665a) {
            case 0:
                int i14 = ExternalBrowserAuthResponseActivity.f31992c;
                return new l(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                h.f161777b.getClass();
                return h.a.a();
            case 4:
                try {
                    iVar = (m72.i) KoinJavaComponent.get$default(m72.i.class, null, null, 6, null);
                } catch (NoDefinitionFoundException | Exception unused) {
                }
                return (iVar == null || (listA = iVar.a()) == null) ? j0.f134944a : listA;
            case 5:
                v9.a aVar = v9.a.f176280a;
                return null;
            case 6:
                d.a aVar2 = d.f176318n;
                return new c0(null, null, null, 7, null);
            case 7:
                v92.h.a aVar3 = v92.h.f176379f;
                return new c0(null, null, null, 7, null);
            case 8:
                o.a aVar4 = o.f176444m;
                return new c0(null, null, null, 7, null);
            case 9:
                i0.a aVar5 = i0.f176404b;
                return new c0(null, null, null, 7, null);
            case 10:
                k0.a aVar6 = k0.f176419c;
                return new c0(null, null, null, 7, null);
            case 11:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay.");
            case 12:
                j jVar = u.f177014m;
                if (jVar != null) {
                    jVar.b();
                    return Unit.INSTANCE;
                }
                s.m("deviceRemovalOperationDelegate");
                throw null;
            case 13:
                return p0.n(Boolean.FALSE);
            case 14:
                return p0.n("");
            case 15:
                return p0.n(Boolean.FALSE);
            case 16:
                return p0.n(Boolean.FALSE);
            case 17:
                return p0.n(Boolean.FALSE);
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return p0.n(Boolean.FALSE);
            case 21:
                return Unit.INSTANCE;
            case 22:
                o0 o0Var = o0.f177343a;
                return Unit.INSTANCE;
            case 23:
                o0 o0Var2 = o0.f177343a;
                return Unit.INSTANCE;
            case 24:
                return p0.n(null);
            case 25:
                return p0.n(Boolean.FALSE);
            case 26:
                return p0.n(Boolean.FALSE);
            case 27:
                return p0.n(Boolean.FALSE);
            case 28:
                return p0.n("");
            default:
                return p0.n("");
        }
    }
}
