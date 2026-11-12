package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.skinner.attrentry.SkinAttr;
import com.huawei.skinner.facade.template.ILogger;
import com.huawei.skinner.internal.IInterceptorGroup;
import com.huawei.skinner.internal.ISkinAttrGroup;
import com.huawei.skinner.internal.ISkinAttrRoot;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class pyi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final pza f45958a = new pza();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45959b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45960c = "SkinAttrFactory";
    private static final Map<b, Class<? extends SkinAttr>> d;
    private static boolean e;
    private static boolean j;

    static {
        pzj pzjVar = new pzj();
        d = pzjVar;
        f45959b = false;
        j = false;
        e = false;
        pzjVar.put(new b("textAppearance", TextView.class), pyg.class);
        pzjVar.put(new b(TtmlNode.TAG_STYLE, View.class), pyh.class);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[Catch: all -> 0x0177, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x002c, B:8:0x0033, B:10:0x0037, B:11:0x003e, B:13:0x0048, B:42:0x00ed, B:44:0x0117, B:45:0x011e, B:47:0x0124, B:59:0x016c, B:61:0x0170, B:50:0x0155, B:14:0x0054, B:16:0x005a, B:19:0x0061, B:21:0x006e, B:25:0x0089, B:27:0x0098, B:29:0x00a2, B:31:0x00bd, B:32:0x00c1, B:34:0x00c7, B:36:0x00d5, B:38:0x00dd, B:40:0x00e3, B:23:0x007c), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd A[Catch: all -> 0x0177, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x002c, B:8:0x0033, B:10:0x0037, B:11:0x003e, B:13:0x0048, B:42:0x00ed, B:44:0x0117, B:45:0x011e, B:47:0x0124, B:59:0x016c, B:61:0x0170, B:50:0x0155, B:14:0x0054, B:16:0x005a, B:19:0x0061, B:21:0x006e, B:25:0x0089, B:27:0x0098, B:29:0x00a2, B:31:0x00bd, B:32:0x00c1, B:34:0x00c7, B:36:0x00d5, B:38:0x00dd, B:40:0x00e3, B:23:0x007c), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7 A[Catch: all -> 0x0177, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x002c, B:8:0x0033, B:10:0x0037, B:11:0x003e, B:13:0x0048, B:42:0x00ed, B:44:0x0117, B:45:0x011e, B:47:0x0124, B:59:0x016c, B:61:0x0170, B:50:0x0155, B:14:0x0054, B:16:0x005a, B:19:0x0061, B:21:0x006e, B:25:0x0089, B:27:0x0098, B:29:0x00a2, B:31:0x00bd, B:32:0x00c1, B:34:0x00c7, B:36:0x00d5, B:38:0x00dd, B:40:0x00e3, B:23:0x007c), top: B:67:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3 A[Catch: all -> 0x0177, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x002c, B:8:0x0033, B:10:0x0037, B:11:0x003e, B:13:0x0048, B:42:0x00ed, B:44:0x0117, B:45:0x011e, B:47:0x0124, B:59:0x016c, B:61:0x0170, B:50:0x0155, B:14:0x0054, B:16:0x005a, B:19:0x0061, B:21:0x006e, B:25:0x0089, B:27:0x0098, B:29:0x00a2, B:31:0x00bd, B:32:0x00c1, B:34:0x00c7, B:36:0x00d5, B:38:0x00dd, B:40:0x00e3, B:23:0x007c), top: B:67:0x0003 }] */
    public static void a(Context context) {
        Set<String> setD;
        boolean z;
        Set<String> setE;
        Integer numValueOf;
        boolean z2;
        boolean z3;
        int i;
        synchronized (pyi.class) {
            ILogger iLogger = pyt.f45989b;
            String str = f45960c;
            iLogger.info(str, "init() initialize:" + f45959b + ";loadedByPlugin:" + j);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!f45959b) {
                f45959b = true;
                if (!e && pyt.d != null) {
                    pyt.d.onStart(30000);
                }
                e = false;
                d();
                if (j) {
                    pyt.f45989b.info(str, "init() Loaded roots graph by skinner gradle plugin!");
                    z3 = true;
                    z = false;
                    z2 = false;
                } else {
                    if (pyl.b() || pyz.e(context)) {
                        pyt.f45989b.info(str, "init() Run with debug mode or new install, rebuild SKIN_ATTR_GROUPS.");
                        setD = d(context);
                    } else {
                        pyt.f45989b.info(str, "init() Init moduleRoots from cache.");
                        setE = e(context);
                        if (setE == null) {
                            pyt.f45989b.info(str, "getCachedModuleRoots() failed!");
                            setD = d(context);
                        } else {
                            z = false;
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        ILogger iLogger2 = pyt.f45989b;
                        StringBuilder sb = new StringBuilder("init() Find module roots finished, roots size = ");
                        if (setE != null) {
                            numValueOf = Integer.valueOf(setE.size());
                        } else {
                            numValueOf = null;
                        }
                        sb.append(numValueOf);
                        sb.append(", cost ");
                        sb.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                        sb.append(" ms.");
                        iLogger2.info(str, sb.toString());
                        if (setE != null) {
                            for (String str2 : setE) {
                                if (!str2.startsWith("com.huawei.skinner.peanut.SkinAttrRoot$$") || str2.startsWith("com.huawei.skinner.peanut.InterceptorGroup$$")) {
                                    e(str2);
                                }
                            }
                            z2 = false;
                        } else {
                            pyt.f45989b.warn(str, "Init moduleRoots failed!");
                            z2 = true;
                        }
                        z3 = false;
                        jCurrentTimeMillis = jCurrentTimeMillis2;
                    }
                    setE = setD;
                    z = true;
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    ILogger iLogger3 = pyt.f45989b;
                    StringBuilder sb2 = new StringBuilder("init() Find module roots finished, roots size = ");
                    if (setE != null) {
                        numValueOf = Integer.valueOf(setE.size());
                    } else {
                        numValueOf = null;
                    }
                    sb2.append(numValueOf);
                    sb2.append(", cost ");
                    sb2.append(jCurrentTimeMillis3 - jCurrentTimeMillis);
                    sb2.append(" ms.");
                    iLogger3.info(str, sb2.toString());
                    if (setE != null) {
                        while (r2.hasNext()) {
                            if (!str2.startsWith("com.huawei.skinner.peanut.SkinAttrRoot$$")) {
                            }
                            e(str2);
                        }
                        z2 = false;
                    } else {
                        pyt.f45989b.warn(str, "Init moduleRoots failed!");
                        z2 = true;
                    }
                    z3 = false;
                    jCurrentTimeMillis = jCurrentTimeMillis3;
                }
                ILogger iLogger4 = pyt.f45989b;
                String str3 = f45960c;
                iLogger4.info(str3, "init() Load root element finished, cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                pza pzaVar = f45958a;
                if (pzaVar.size() == 0) {
                    pyt.f45989b.warn(str3, "init() No ISkinAttrRoot impl files were found, check your configuration please!");
                }
                if (pyl.b()) {
                    pyt.f45989b.info(str3, "init() " + String.format(Locale.getDefault(), "SKIN_ATTR_GROUP has already been loaded, SKIN_ATTR_GROUP[%d]", Integer.valueOf(pzaVar.size())));
                }
                if (z2) {
                    i = 30006;
                } else {
                    i = pzaVar.size() == 0 ? 30007 : 30005;
                }
                int i2 = z3 ? 30002 : z ? OnRegisterSkinAttrsListener.REGISTER_BY_SCAN : 30004;
                if (pyt.d != null) {
                    pyt.d.onCompleted(i2, i);
                }
            }
        }
    }

    private static Set<String> e(Context context) {
        try {
            return new HashSet(context.getSharedPreferences("hw_skinner", 0).getStringSet("SKINNER_ROOT_MAP", new HashSet()));
        } catch (Exception e2) {
            pyt.f45989b.error(f45960c, "getCachedModuleRoots()", e2);
            return null;
        }
    }

    private static Set<String> d(Context context) {
        Set<String> setA = null;
        try {
            setA = pyv.a(context, "com.huawei.skinner.peanut");
            if (!setA.isEmpty()) {
                context.getSharedPreferences("hw_skinner", 0).edit().putStringSet("SKINNER_ROOT_MAP", setA).apply();
            } else {
                setA = new HashSet();
            }
            pyz.a(context);
            return setA;
        } catch (Exception e2) {
            pyt.f45989b.error(f45960c, "getModuleRootsAndSave()", e2);
            return setA;
        }
    }

    public static SkinAttr d(String str, int i, String str2, String str3, Class cls) {
        Class<? extends SkinAttr> cls2 = d.get(new b(str, cls));
        SkinAttr skinAttr = null;
        if (cls2 != null) {
            try {
                SkinAttr skinAttrNewInstance = cls2.newInstance();
                try {
                    skinAttrNewInstance.attrName = str;
                    skinAttrNewInstance.attrValueRefId = i;
                    skinAttrNewInstance.attrValueRefName = str2;
                    skinAttrNewInstance.attrValueTypeName = str3;
                    return skinAttrNewInstance;
                } catch (IllegalAccessException | InstantiationException e2) {
                    e = e2;
                    skinAttr = skinAttrNewInstance;
                    pyt.f45989b.error(f45960c, "get() Error", e);
                    return skinAttr;
                }
            } catch (IllegalAccessException e3) {
                e = e3;
            } catch (InstantiationException e4) {
                e = e4;
            }
        }
        return skinAttr;
    }

    public static boolean e(String str, Class<? extends View> cls) {
        if (d.get(new b(str, cls)) != null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        d(cls, arrayList);
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f45958a.remove((String) it.next());
            }
        }
        if (d.get(new b(str, cls)) != null) {
            return true;
        }
        pyt.f45989b.info(f45960c, "isSupportedAttr(): Not support , attrname：" + str + "; View: " + cls.getName());
        return false;
    }

    public static void d(ISkinAttrRoot iSkinAttrRoot) {
        if (iSkinAttrRoot != null) {
            j = true;
            iSkinAttrRoot.loadGroup(f45958a);
        }
    }

    private static void d(Class<? extends View> cls, List<String> list) {
        String canonicalName = cls.getCanonicalName();
        String[] strArrE = f45958a.e(canonicalName);
        if (strArrE != null && strArrE.length > 0) {
            for (String str : strArrE) {
                try {
                    Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (objNewInstance instanceof ISkinAttrGroup) {
                        ((ISkinAttrGroup) objNewInstance).loadSkinAttr(d);
                    }
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                    pyt.f45989b.error(f45960c, "registerSkinAttrGroup() Error", e2);
                }
            }
            list.add(canonicalName);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass.equals(Object.class)) {
            return;
        }
        d(superclass, list);
    }

    private static void d() {
        j = false;
    }

    private static void e(String str) {
        ILogger iLogger = pyt.f45989b;
        String str2 = f45960c;
        iLogger.info(str2, "register(className) register class start, classname:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof ISkinAttrRoot) {
                d((ISkinAttrRoot) objNewInstance);
                return;
            }
            if (objNewInstance instanceof IInterceptorGroup) {
                ((IInterceptorGroup) objNewInstance).loadInterceptor();
                return;
            }
            pyt.f45989b.info(str2, "register(className) register failed, class name: " + str + " should implements ISkinAttrRoot");
        } catch (Exception e2) {
            pyt.f45989b.error(f45960c, "register(className) Error", e2);
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45961a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f45962c;

        public b(String str, Class<? extends View> cls) {
            this.f45961a = str;
            this.f45962c = cls;
        }

        public int hashCode() {
            return this.f45961a.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f45962c.isAssignableFrom(this.f45962c) || this.f45962c.isAssignableFrom(bVar.f45962c);
        }

        public String toString() {
            return "AFAK( attrName: " + this.f45961a + " viewWidget: " + this.f45962c;
        }
    }
}
