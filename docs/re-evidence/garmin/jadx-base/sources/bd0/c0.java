package bd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbd0/c0;", "Llm2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements lm2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f17548b;

    public c0(Context context) {
        context.getClass();
        this.f17547a = context;
        this.f17548b = o13.m.b(new b4.b(12));
    }

    public final String a(String str) {
        str.getClass();
        yl2.b bVar = (yl2.b) yl2.b.B6.get(str);
        if (bVar != null) {
            return bVar.f197834c;
        }
        return null;
    }

    public final qm2.l b(String str) {
        str.getClass();
        yl2.b bVar = (yl2.b) yl2.b.B6.get(str);
        if (bVar == null) {
            bVar = yl2.b.f197686f;
        }
        if (bVar != yl2.b.f197686f) {
            qm2.l lVar = bVar.f197833b;
            if (lVar == null) {
                lVar = qm2.l.f145754v;
            }
            lVar.getClass();
            return lVar;
        }
        if (((ic0.b) this.f17548b.getValue()).a(str)) {
            qm2.l lVar2 = qm2.l.F;
            lVar2.getClass();
            return lVar2;
        }
        qm2.l lVar3 = qm2.l.f145754v;
        lVar3.getClass();
        return lVar3;
    }
}
