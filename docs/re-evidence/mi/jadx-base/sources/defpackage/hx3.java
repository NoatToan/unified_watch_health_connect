package defpackage;

import android.util.ArrayMap;
import com.miui.circulate.api.exception.CirculateException;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public class hx3 extends gx3 {
    public static final Map<String, Object> g = new ArrayMap();
    public final n3f e;
    public ServiceLoader<had> f;

    public hx3(gx3.a aVar) throws CirculateException {
        super(aVar);
        n3f n3fVar = new n3f();
        this.e = n3fVar;
        n3fVar.a(this, new Object[0]);
        ServiceLoader<had> serviceLoaderLoad = ServiceLoader.load(had.class);
        this.f = serviceLoaderLoad;
        Iterator<had> it = serviceLoaderLoad.iterator();
        while (it.hasNext()) {
            it.next().a(this, new Object[0]);
        }
    }

    @Override // defpackage.gx3
    public <T> T a(String str) {
        return (T) g.get(str);
    }

    @Override // defpackage.gx3
    public void j(String str, Object obj) throws CirculateException {
        Map<String, Object> map = g;
        if (!map.containsKey(str)) {
            map.put(str, obj);
            return;
        }
        throw new CirculateException("Repeat registerManager:" + str);
    }
}
