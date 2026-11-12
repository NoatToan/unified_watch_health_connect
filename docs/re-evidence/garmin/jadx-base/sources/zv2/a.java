package zv2;

import androidx.fragment.app.Fragment;
import cx2.h;
import gw2.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzv2/a;", "Lew2/d;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends ew2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f207178c;

    static {
        new C3864a(null);
        f207178c = new h("SingleLabelClickHelper", null, 2, null);
    }

    public final void c(Fragment fragment, c cVar, dx2.c cVar2, Map map) {
        Map map2;
        cVar2.getClass();
        Object obj = map.get(i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        if (!String.valueOf(map2 != null ? map2.get(i.LINK_TYPE.f79975a) : null).equals("SELECTION")) {
            b(fragment, cVar, cVar2, map);
            return;
        }
        lv2.a.f115048a.getClass();
        lv2.a.f115049b.getClass();
        cVar.setOnClickListener(new kv2.a((com.garmin.realtimesettings.app.presentationlayer.c) fragment, cVar2, map, 1));
    }

    /* JADX INFO: renamed from: zv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzv2/a$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3864a {
        public /* synthetic */ C3864a(j jVar) {
            this();
        }

        private C3864a() {
        }
    }
}
