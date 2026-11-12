package defpackage;

import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class tur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1d f35066a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final tur f35067a = new tur();
    }

    public static tur a() {
        return b.f35067a;
    }

    public HashMap<String, YRNBundleInfo> b(String str) {
        l1d l1dVar = this.f35066a;
        if (l1dVar != null) {
            return l1dVar.getLoadedBundleInfoMap(str);
        }
        return null;
    }

    public void c(l1d l1dVar) {
        this.f35066a = l1dVar;
    }

    public tur() {
    }
}
