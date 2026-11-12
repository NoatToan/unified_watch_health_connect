package defpackage;

import android.text.TextUtils;
import com.facebook.react.a;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, fwr> f36236a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gur f36237b;
    public final ixr c;

    public uwr(gur gurVar, ixr ixrVar) {
        this.f36237b = gurVar;
        this.c = ixrVar;
    }

    public void b() {
        this.f36236a.clear();
    }

    public final void c(final YRNDevModeInfo yRNDevModeInfo, final u1d<fwr> u1dVar) {
        ixr ixrVar = this.c;
        if (ixrVar != null) {
            ixrVar.e(yRNDevModeInfo, new u1d() { // from class: twr
                @Override // defpackage.u1d
                public final void onResult(Object obj) {
                    this.f35146a.g(yRNDevModeInfo, u1dVar, (fwr) obj);
                }
            });
        }
    }

    public fwr d(String str) {
        return this.f36236a.get(str);
    }

    public a e(String str) {
        fwr fwrVar = this.f36236a.get(str);
        if (fwrVar != null) {
            return fwrVar.o();
        }
        return null;
    }

    public boolean f(String str, u1d<fwr> u1dVar) {
        YRNDevModeInfo yRNDevModeInfoA = swr.e().a(this.f36237b.j(), str);
        if (!vwr.g().k() || yRNDevModeInfoA == null || TextUtils.isEmpty(yRNDevModeInfoA.d())) {
            return false;
        }
        fwr fwrVar = this.f36236a.get(str);
        if (fwrVar == null || fwrVar.o() == null) {
            c(yRNDevModeInfoA, u1dVar);
            return true;
        }
        if (u1dVar == null) {
            return true;
        }
        u1dVar.onResult(fwrVar);
        return true;
    }

    public final /* synthetic */ void g(YRNDevModeInfo yRNDevModeInfo, u1d u1dVar, fwr fwrVar) {
        if (yRNDevModeInfo != null) {
            this.f36236a.put(yRNDevModeInfo.e(), fwrVar);
        }
        if (u1dVar != null) {
            u1dVar.onResult(fwrVar);
        }
    }

    public void h(String str) {
        this.f36236a.remove(str);
    }
}
