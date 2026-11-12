package t92;

import android.content.SharedPreferences;
import androidx.lifecycle.s0;
import e23.l;
import java.util.Iterator;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q92.v;
import q92.x;
import sg0.w0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lt92/a;", "Landroidx/lifecycle/s0;", "Lq92/v;", "Lq92/x;", "consentTypeId", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lkotlin/Function1;", "getConsentStatus", "<init>", "(Lq92/x;Landroid/content/SharedPreferences;Le23/l;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends s0<v> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f163206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SharedPreferences f163207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l<x, v> f163208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f163209o;

    /* JADX WARN: Multi-variable type inference failed */
    public a(x xVar, SharedPreferences sharedPreferences, l<? super x, v> lVar) {
        xVar.getClass();
        sharedPreferences.getClass();
        lVar.getClass();
        this.f163206l = xVar;
        this.f163207m = sharedPreferences;
        this.f163208n = lVar;
        this.f163209o = m.b(new w0(this, 14));
    }

    @Override // androidx.lifecycle.s0
    public final void h() {
        m(this.f163208n.invoke(this.f163206l));
        this.f163207m.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) this.f163209o.getValue());
    }

    @Override // androidx.lifecycle.s0
    public final void i() {
        this.f163207m.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) this.f163209o.getValue());
    }

    public final void n(String str, String str2) {
        Object next;
        x xVar;
        v vVarInvoke;
        x.a aVar = x.f143797c;
        String strSubstring = str.substring(0, str.length() - str2.length());
        aVar.getClass();
        Iterator<T> it = x.C.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((x) next).f143820b, strSubstring));
        x xVar2 = (x) next;
        if (xVar2 == null || (xVar = this.f163206l) != xVar2 || (vVarInvoke = this.f163208n.invoke(xVar)) == null) {
            return;
        }
        m(vVarInvoke);
    }
}
