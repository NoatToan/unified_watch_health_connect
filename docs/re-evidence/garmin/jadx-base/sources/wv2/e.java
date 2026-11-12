package wv2;

import a42.q;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwv2/e;", "Lwv2/g;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f187477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f187478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dx2.c f187479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f187480d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187481a;

        static {
            int[] iArr = new int[gw2.h.values().length];
            try {
                iArr[gw2.h.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gw2.h.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f187481a = iArr;
        }
    }

    public e(Fragment fragment, k kVar, dx2.c cVar, Map<String, ? extends Object> map) {
        this.f187477a = fragment;
        this.f187478b = kVar;
        this.f187479c = cVar;
        this.f187480d = map;
    }

    @Override // wv2.g
    public final void f(int i14, int i15) {
        f.f187483b.getClass();
        cx2.i.f56681a.getClass();
        if (cx2.i.a.a(this.f187477a)) {
            this.f187478b.h(this.f187479c, this.f187480d, new xv2.c(i14, Integer.valueOf(i15), null));
        }
    }

    @Override // wv2.g
    public final void h(int i14, gw2.h hVar, boolean z14) {
        hVar.getClass();
        f.f187483b.getClass();
        cx2.i.f56681a.getClass();
        Fragment fragment = this.f187477a;
        if (cx2.i.a.a(fragment)) {
            k kVar = this.f187478b;
            Fragment fragment2 = this.f187477a;
            dx2.c cVar = this.f187479c;
            Map<String, ? extends Object> map = this.f187480d;
            q qVar = new q(kVar, fragment2, cVar, map, i14, hVar);
            xv2.f fVarO4 = cVar.O4(map);
            xv2.a aVar = fVarO4 != null ? fVarO4.f192289c : null;
            if (hVar != gw2.h.DELETE || aVar == null || !z14) {
                qVar.invoke();
                return;
            }
            k kVar2 = this.f187478b;
            Context context = kVar2.f207282a;
            String strB = kVar2.b(aVar.f192270a);
            String strB2 = kVar2.b(aVar.f192271b);
            String strB3 = kVar2.b(aVar.f192272c);
            if (strB3.length() <= 0) {
                strB3 = null;
            }
            if (strB3 == null) {
                strB3 = context.getString(R.string.lbl_ok);
                strB3.getClass();
            }
            String strB4 = kVar2.b(aVar.f192273d);
            String string = strB4.length() > 0 ? strB4 : null;
            if (string == null) {
                string = context.getString(R.string.lbl_cancel);
                string.getClass();
            }
            xv2.b bVar = new xv2.b(strB, strB2, strB3, string);
            ew2.e.a aVar2 = ew2.e.f66901a;
            Context contextRequireContext = fragment.requireContext();
            contextRequireContext.getClass();
            ew2.e.a.a(aVar2, contextRequireContext, bVar.f192274a, bVar.f192275b, new p(bVar.f192276c, new vy0.e(qVar, 13)), new p(bVar.f192277d, new wt0.i((byte) 0, 9)), 992).show();
        }
    }
}
