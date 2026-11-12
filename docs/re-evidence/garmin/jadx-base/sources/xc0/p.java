package xc0;

import android.content.Context;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxc0/p;", "Lzv2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends zv2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f189952c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189953b;

    static {
        new a(null);
        Parcelable.Creator<xw2.b> creator = xw2.b.CREATOR;
        int i14 = gt2.c.f79010a;
        f189952c = gt2.b.f79005a.h("RTS-RTSSingleLabelTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189953b = bVar;
    }

    @Override // zv2.b, zw2.f
    public final Integer g(Map<String, ? extends Object> map) {
        int i14 = 8;
        map.getClass();
        try {
            Object obj = map.get("linkOptions");
            Map map2 = obj instanceof Map ? (Map) obj : null;
            Object obj2 = map2 != null ? map2.get("destPage") : null;
            if (p005kotlin.jvm.internal.s.g(obj2, "ECG_SETUP")) {
                if (!l()) {
                    return 8;
                }
                if (!k()) {
                    i14 = 0;
                }
                return Integer.valueOf(i14);
            }
            if (p005kotlin.jvm.internal.s.g(obj2, "ECG_FEATURE")) {
                if (l()) {
                    return Integer.valueOf(k() ? 0 : 8);
                }
                return 8;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public final boolean k() {
        d31.a aVar = (d31.a) ge1.b.W(t13.h.f161748a, new q(this, null));
        boolean z14 = (aVar != null ? aVar.f57328h : null) == d31.c.COMPLETED;
        wr.g.y("isEcgEnabled: ", z14, f189952c);
        return z14;
    }

    public final boolean l() {
        boolean z14 = ((d31.a) ge1.b.W(t13.h.f161748a, new q(this, null))) != null;
        f189952c.debug("isEcgAvailableForDevice(" + this.f189953b.f192449a + "): " + z14);
        return z14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxc0/p$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
