package defpackage;

import com.facebook.react.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class cxr implements c1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gur f14848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dwr f14849b;
    public final hur c;
    public final lxr d;

    public cxr(gur gurVar) {
        sk1.d(gurVar, "config can not be null!");
        this.f14848a = gurVar;
        this.f14849b = new dwr(gurVar, new lyr(this));
        this.c = new hur(gurVar, this);
        this.d = new lxr();
    }

    @Override // defpackage.c1d
    public gur e() {
        return this.f14848a;
    }

    @Override // defpackage.c1d
    public void f(jxr jxrVar) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            dwrVar.H(jxrVar);
        }
    }

    @Override // defpackage.c1d
    public void g(String str) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            dwrVar.U(str);
        }
    }

    @Override // defpackage.c1d
    public boolean h(String str, WritableMap writableMap) {
        dwr dwrVar = this.f14849b;
        if (dwrVar == null) {
            return false;
        }
        return this.d.d(str, writableMap, dwrVar.E(jzr.e().c()));
    }

    @Override // defpackage.c1d
    public void i(fwr fwrVar, our ourVar) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            dwrVar.x(fwrVar, ourVar);
        }
    }

    @Override // defpackage.c1d
    public void initReactNative(t1d t1dVar) {
        hur hurVar = this.c;
        if (hurVar != null) {
            hurVar.initReactNative(t1dVar);
        }
    }

    @Override // defpackage.c1d
    public a j(String str) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            return dwrVar.G(str);
        }
        return null;
    }

    @Override // defpackage.c1d
    public void k(String str, m1d m1dVar) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            dwrVar.k(str, m1dVar);
        }
    }

    @Override // defpackage.c1d
    public void l(String str, m1d m1dVar) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            dwrVar.L(str, m1dVar);
        }
    }

    @Override // defpackage.c1d
    public HashMap<String, YRNBundleInfo> m() {
        dwr dwrVar = this.f14849b;
        return dwrVar != null ? dwrVar.D() : new HashMap<>();
    }

    @Override // defpackage.c1d
    public boolean n(String str, Map<String, Object> map) {
        return h(str, Arguments.makeNativeMap(map));
    }

    @Override // defpackage.c1d
    public fwr o(String str) {
        dwr dwrVar = this.f14849b;
        if (dwrVar != null) {
            return dwrVar.B(str);
        }
        return null;
    }
}
