package defpackage;

import android.content.Context;
import android.net.Uri;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.enums.TypeKind;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class nre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f28287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f28288b;
    public static boolean c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28289a;

        static {
            int[] iArr = new int[RouteType.values().length];
            f28289a = iArr;
            try {
                iArr[RouteType.PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28289a[RouteType.FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Postcard a(String str) {
        RouteMeta routeMeta = x3r.d.get(str);
        if (routeMeta == null) {
            return null;
        }
        return new Postcard(routeMeta.getPath(), routeMeta.getGroup());
    }

    public static synchronized void b(Postcard postcard) {
        try {
            if (postcard == null) {
                throw new NoRouteFoundException("ARouter::No postcard!");
            }
            RouteMeta routeMeta = x3r.f38658b.get(postcard.getPath());
            if (routeMeta == null) {
                Class<? extends IRouteGroup> cls = x3r.f38657a.get(postcard.getGroup());
                if (cls == null) {
                    throw new NoRouteFoundException("ARouter::There is no route match the path [" + postcard.getPath() + "], in group [" + postcard.getGroup() + "]");
                }
                try {
                    if (kb.b()) {
                        kb.c.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "The group [%s] starts loading, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    cls.getConstructor(new Class[0]).newInstance(new Object[0]).loadInto(x3r.f38658b);
                    x3r.f38657a.remove(postcard.getGroup());
                    if (kb.b()) {
                        kb.c.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "The group [%s] has already been loaded, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    b(postcard);
                } catch (Exception e) {
                    throw new HandlerException("ARouter::Fatal exception when loading group meta. [" + e.getMessage() + "]");
                }
            } else {
                postcard.setDestination(routeMeta.getDestination());
                postcard.setType(routeMeta.getType());
                postcard.setPriority(routeMeta.getPriority());
                postcard.setExtra(routeMeta.getExtra());
                Uri uri = postcard.getUri();
                if (uri != null) {
                    Map<String, String> mapC = p8p.c(uri);
                    Map<String, Integer> paramsType = routeMeta.getParamsType();
                    if (z4f.b(paramsType)) {
                        for (Map.Entry<String, Integer> entry : paramsType.entrySet()) {
                            e(postcard, entry.getValue(), entry.getKey(), mapC.get(entry.getKey()));
                        }
                        postcard.getExtras().putStringArray("wmHzgD4lOj5o4241", (String[]) paramsType.keySet().toArray(new String[0]));
                    }
                    postcard.withString("NTeRQWvye18AkPd6G", uri.toString());
                }
                int i = a.f28289a[routeMeta.getType().ordinal()];
                if (i == 1) {
                    Class<?> destination = routeMeta.getDestination();
                    IProvider iProvider = x3r.c.get(destination);
                    if (iProvider == null) {
                        try {
                            iProvider = (IProvider) destination.getConstructor(new Class[0]).newInstance(new Object[0]);
                            iProvider.init(f28287a);
                            x3r.c.put(destination, iProvider);
                        } catch (Exception e2) {
                            throw new HandlerException("Init provider failed! " + e2.getMessage());
                        }
                    }
                    postcard.setProvider(iProvider);
                    postcard.greenChannel();
                } else if (i == 2) {
                    postcard.greenChannel();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void c(Context context, ThreadPoolExecutor threadPoolExecutor) throws HandlerException {
        Set<String> setA;
        try {
            f28287a = context;
            f28288b = threadPoolExecutor;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                d();
                if (c) {
                    kb.c.info(ILogger.defaultTag, "Load router map by arouter-auto-register plugin.");
                } else {
                    if (kb.b() || hhh.b(context)) {
                        kb.c.info(ILogger.defaultTag, "Run with debug mode or new install, rebuild router map.");
                        setA = j04.a(f28287a, "com.alibaba.android.arouter.routes");
                        if (!setA.isEmpty()) {
                            context.getSharedPreferences("SP_AROUTER_CACHE", 0).edit().putStringSet("ROUTER_MAP", setA).apply();
                        }
                        hhh.c(context);
                    } else {
                        kb.c.info(ILogger.defaultTag, "Load router map from cache.");
                        setA = new HashSet<>(context.getSharedPreferences("SP_AROUTER_CACHE", 0).getStringSet("ROUTER_MAP", new HashSet()));
                    }
                    kb.c.info(ILogger.defaultTag, "Find router map finished, map size = " + setA.size() + ", cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                    jCurrentTimeMillis = System.currentTimeMillis();
                    for (String str : setA) {
                        if (str.startsWith("com.alibaba.android.arouter.routes.ARouter$$Root")) {
                            ((IRouteRoot) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).loadInto(x3r.f38657a);
                        } else if (str.startsWith("com.alibaba.android.arouter.routes.ARouter$$Interceptors")) {
                            ((IInterceptorGroup) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).loadInto(x3r.e);
                        } else if (str.startsWith("com.alibaba.android.arouter.routes.ARouter$$Providers")) {
                            ((IProviderGroup) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).loadInto(x3r.d);
                        }
                    }
                }
                kb.c.info(ILogger.defaultTag, "Load root element finished, cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                if (x3r.f38657a.size() == 0) {
                    kb.c.error(ILogger.defaultTag, "No mapping files were found, check your configuration please!");
                }
                if (kb.b()) {
                    kb.c.debug(ILogger.defaultTag, String.format(Locale.getDefault(), "LogisticsCenter has already been loaded, GroupIndex[%d], InterceptorIndex[%d], ProviderIndex[%d]", Integer.valueOf(x3r.f38657a.size()), Integer.valueOf(x3r.e.size()), Integer.valueOf(x3r.d.size())));
                }
            } catch (Exception e) {
                throw new HandlerException("ARouter::ARouter init logistics center exception! [" + e.getMessage() + "]");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void d() {
        c = false;
    }

    public static void e(Postcard postcard, Integer num, String str, String str2) {
        if (p8p.b(str) || p8p.b(str2)) {
            return;
        }
        try {
            if (num == null) {
                postcard.withString(str, str2);
            } else if (num.intValue() == TypeKind.BOOLEAN.ordinal()) {
                postcard.withBoolean(str, Boolean.parseBoolean(str2));
            } else if (num.intValue() == TypeKind.BYTE.ordinal()) {
                postcard.withByte(str, Byte.parseByte(str2));
            } else if (num.intValue() == TypeKind.SHORT.ordinal()) {
                postcard.withShort(str, Short.parseShort(str2));
            } else if (num.intValue() == TypeKind.INT.ordinal()) {
                postcard.withInt(str, Integer.parseInt(str2));
            } else if (num.intValue() == TypeKind.LONG.ordinal()) {
                postcard.withLong(str, Long.parseLong(str2));
            } else if (num.intValue() == TypeKind.FLOAT.ordinal()) {
                postcard.withFloat(str, Float.parseFloat(str2));
            } else if (num.intValue() == TypeKind.DOUBLE.ordinal()) {
                postcard.withDouble(str, Double.parseDouble(str2));
            } else if (num.intValue() == TypeKind.STRING.ordinal()) {
                postcard.withString(str, str2);
            } else if (num.intValue() != TypeKind.PARCELABLE.ordinal()) {
                if (num.intValue() == TypeKind.OBJECT.ordinal()) {
                    postcard.withString(str, str2);
                } else {
                    postcard.withString(str, str2);
                }
            }
        } catch (Throwable th) {
            kb.c.warning(ILogger.defaultTag, "LogisticsCenter setValue failed! " + th.getMessage());
        }
    }
}
