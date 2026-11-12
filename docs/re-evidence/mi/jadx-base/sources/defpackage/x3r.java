package defpackage;

import com.alibaba.android.arouter.base.UniqueKeyTreeMap;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class x3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, Class<? extends IRouteGroup>> f38657a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, RouteMeta> f38658b = new HashMap();
    public static Map<Class, IProvider> c = new HashMap();
    public static Map<String, RouteMeta> d = new HashMap();
    public static Map<Integer, Class<? extends IInterceptor>> e = new UniqueKeyTreeMap("More than one interceptors use same priority [%s]");
    public static List<IInterceptor> f = new ArrayList();
}
