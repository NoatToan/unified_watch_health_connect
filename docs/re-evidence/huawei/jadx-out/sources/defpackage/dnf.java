package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.device.open.MeasureKit;
import com.huawei.hwlogsmodel.LogUtil;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dnf {
    private static dnf e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, MeasureKit> f32049b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<com.huawei.health.device.open.MeasureKit> f32050c;
    private HashMap<String, String> d;

    private dnf() {
        ArrayList<com.huawei.health.device.open.MeasureKit> arrayList = new ArrayList<>();
        this.f32050c = arrayList;
        arrayList.add(new dri());
        this.f32050c.add(new eiz());
        this.f32050c.add(new eio());
        this.f32050c.add(new eit());
        this.f32050c.add(new ejc());
        this.f32050c.add(new ejk());
        this.f32050c.add(new eim());
        this.f32050c.add(new eiq());
        this.f32050c.add(new drm());
        this.f32050c.add(new doe());
        this.f32050c.add(new dox());
        this.f32050c.add(new doo());
        this.f32050c.add(new ejd());
        this.f32050c.add(new dnm());
        this.f32050c.add(new ejy());
        this.f32050c.add(new ejs());
        this.f32050c.add(new ejv());
        this.f32050c.add(new ejw());
        this.f32050c.add(new ejz());
    }

    public static dnf e() {
        if (e == null) {
            e = new dnf();
        }
        return e;
    }

    public void b(String str, String str2) {
        LogUtil.a("MeasureKitManager", "Enter registerExternalKit:", str);
        if (str == null || str2 == null) {
            return;
        }
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        this.d.put(str, str2);
    }

    private String c(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(":")) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(":");
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    private MeasureKit h(String str) {
        if (str == null) {
            return null;
        }
        HashMap<String, String> map = this.d;
        String str2 = map != null ? map.get(str) : null;
        LogUtil.a("MeasureKitManager", "loadExternalKit kitUuid:", str, ",externalKits:", this.d, ",measureEntry:", str2);
        if (str2 == null) {
            return null;
        }
        if (!this.f32049b.containsKey(str)) {
            Context contextD = dxw.d();
            try {
                String strC = c(str2);
                LogUtil.a("MeasureKitManager", "kit uuid is:", str);
                if (str.equals("54C9739F-CA5C-4347-9F00-75B9DDF2C649") && !TextUtils.isEmpty(strC)) {
                    LogUtil.a("MeasureKitManager", "kit am16 is sunset");
                    return null;
                }
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("MeasureKitManager", "loadExternalKit externalKitPath is empty");
                    return null;
                }
                this.f32049b.put(str, (MeasureKit) new DexClassLoader(new File(strC).getCanonicalPath(), contextD.getDir("runtime", 0).getCanonicalPath(), contextD.getApplicationInfo().nativeLibraryDir, contextD.getClassLoader()).loadClass(d(str2)).getConstructor(Context.class).newInstance(contextD));
                LogUtil.a("MeasureKitManager", "loadExternalKit kit:", this.f32049b.get(str));
                return this.f32049b.get(str);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
                LogUtil.e("MeasureKitManager", "loadExternalKit exception");
                return null;
            }
        }
        return this.f32049b.get(str);
    }

    private MeasureKit j(String str) {
        this.f32049b.remove(str);
        return h(str);
    }

    public MeasureKit b(String str) {
        return h(str);
    }

    public MeasureKit e(String str) {
        return j(str);
    }

    public com.huawei.health.device.open.MeasureKit a(String str) {
        if (str == null) {
            return null;
        }
        for (com.huawei.health.device.open.MeasureKit measureKit : this.f32050c) {
            if (str.equals(measureKit.getUuid())) {
                return measureKit;
            }
        }
        return null;
    }
}
