package zo0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzo0/d0;", "Lzo0/p;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f206127b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.y f206128a = (f12.y) KoinJavaComponent.get$default(f12.y.class, null, null, 6, null);

    static {
        new a(null);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.q)) {
            return null;
        }
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
        String string = contextC.getString(R.string.lbl_voice_assistant_on_watch);
        String strD = p6.b.d(contextC, R.string.msg_voice_assistant_settings_updates, string);
        long jK = this.f206128a.k();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(jK, null);
        String str = "https://support.garmin.com/en-US/?faq=B0n9YwrwMg4j7yEgevIWgA";
        if (fVarI != null) {
            boolean zN = u0.n(fVarI.getProductDisplayName(), u0.f203832w2);
            if (u0.n(fVarI.getProductDisplayName(), u0.f203826v2)) {
                str = "https://support.garmin.com/sas/grmn/?productId=730659&contentId=B0n9YwrwMg4j7yEgevIWgA";
            } else if (zN) {
                str = "https://support.garmin.com/sas/grmn/?productId=869433&contentId=B0n9YwrwMg4j7yEgevIWgA";
            }
        }
        return m0.a.d(m0.f149759e, 2131232837, string, strD, R.string.lbl_set_up_voice_assistant, new ty0.a(str, contextC, this), R.string.common_button_got_it, new wv2.h(25, this, contextC), null, 1920);
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        f12.y yVar = this.f206128a;
        if (yVar.d() && yVar.k() > 0) {
            return n.q.f206194a;
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzo0/d0$a;", "", "<init>", "()V", "", "VENU_2_PLUS_LEARN_MORE_URL", "Ljava/lang/String;", "D2_AIR_LEARN_MORE_URL", "DEFAULT_LEARN_MORE_URL", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
