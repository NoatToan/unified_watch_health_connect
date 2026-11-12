package zw;

import d53.w;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzw/c;", "Lzw/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements zw.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f207199b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f207200a;

    static {
        new a(null);
    }

    public c(l lVar) {
        lVar.getClass();
        this.f207200a = lVar;
    }

    @Override // zw.a
    public final ArrayList a() {
        Object next;
        String strK0 = h0.k0(h0.b1(jx.c.f101391g), ",", null, null, new b(0), 30);
        String strA4 = this.f207200a.A4("key_body_battery_selected_overlays", strK0);
        if (strA4 != null) {
            strK0 = strA4;
        }
        List<String> listW = w.W(strK0, new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (String str : listW) {
            w13.c cVar = jx.c.f101391g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((jx.c) next).f101392a, str));
            jx.c cVar2 = (jx.c) next;
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
        }
        return arrayList;
    }

    @Override // zw.a
    public final void b(ArrayList arrayList) {
        this.f207200a.S("key_body_battery_selected_overlays", h0.k0(arrayList, ",", null, null, new z81.b(29), 30));
    }

    @Override // zw.a
    public final void c() {
        this.f207200a.O2("key_body_battery_landscape_chart_hint", false);
    }

    @Override // zw.a
    public final boolean d() {
        return this.f207200a.W2("key_body_battery_landscape_chart_hint", true);
    }

    @Override // zw.a
    public final boolean e() {
        return this.f207200a.W2("key_body_battery_portrait_chart_hint", true);
    }

    @Override // zw.a
    public final void f() {
        this.f207200a.O2("key_body_battery_portrait_chart_hint", false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lzw/c$a;", "", "<init>", "()V", "", "USER_BODY_BATTERY_PORTRAIT_CHART_HINT", "Ljava/lang/String;", "USER_BODY_BATTERY_LANDSCAPE_CHART_HINT", "USER_BODY_BATTERY_SELECTED_OVERLAYS", "SEPARATOR", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
