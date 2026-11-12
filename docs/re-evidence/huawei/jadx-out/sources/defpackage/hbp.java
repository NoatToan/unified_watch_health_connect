package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class hbp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hbr f36368b = new hbr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hbt f36369c;

    public hbp(int i, int i2) {
        this.f36369c = b(i, i2);
    }

    private hbq a() {
        try {
            hbq hbqVar = (hbq) lls.a(BaseApplication.b().getAssets().open("SportServiceTemplate.json"), hbq.class);
            ReleaseLogUtil.d("SportService_SportServiceTemplateManager", "mDefaultConfig : ", hbqVar == null ? 0 : hbqVar.b());
            return hbqVar;
        } catch (IOException e) {
            ReleaseLogUtil.a("SportService_SportServiceTemplateManager", "loadDefaultCardSetConfig failed, ", LogAnonymous.b(e));
            return null;
        }
    }

    private hbt b(int i, int i2) {
        hbq hbqVarA = a();
        if (hbqVarA == null) {
            return null;
        }
        hbt hbtVarD = hbqVarA.d();
        if (njy.e(hbqVarA.c())) {
            return null;
        }
        for (hbt hbtVar : hbqVarA.c()) {
            if (hbtVar != null && hbtVar.b(i, i2)) {
                hbtVar.b(hbtVarD);
                return hbtVar;
            }
        }
        return null;
    }

    public List<String> d() {
        hbt hbtVar = this.f36369c;
        if (hbtVar == null || this.f36368b == null) {
            return Collections.EMPTY_LIST;
        }
        if (njy.b(hbtVar.e())) {
            ArrayList arrayList = new ArrayList(this.f36369c.e().size());
            for (hbs hbsVar : this.f36369c.e()) {
                if (hbsVar != null) {
                    arrayList.add(this.f36368b.a(hbsVar.e()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public List<String> e() {
        hbt hbtVar = this.f36369c;
        if (hbtVar == null || this.f36368b == null) {
            return Collections.EMPTY_LIST;
        }
        if (njy.b(hbtVar.a())) {
            ArrayList arrayList = new ArrayList(this.f36369c.a().size());
            for (hbs hbsVar : this.f36369c.a()) {
                if (hbsVar != null) {
                    arrayList.add(this.f36368b.c(hbsVar.e()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public List<String> c() {
        hbt hbtVar = this.f36369c;
        if (hbtVar == null || this.f36368b == null) {
            return Collections.EMPTY_LIST;
        }
        if (njy.b(hbtVar.b())) {
            ArrayList arrayList = new ArrayList(this.f36369c.b().size());
            for (hbs hbsVar : this.f36369c.b()) {
                if (hbsVar != null) {
                    arrayList.add(this.f36368b.d(hbsVar.e()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public Map<SportComponentType, Class<?>> d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            arrayList.addAll(d());
        } else if (i == 2) {
            arrayList.addAll(e());
        } else {
            arrayList.addAll(c());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Class<?> cls = Class.forName((String) it.next());
                linkedHashMap.put((SportComponentType) cls.getAnnotation(SportComponentType.class), cls);
            }
        } catch (ClassNotFoundException e) {
            ReleaseLogUtil.a("SportService_SportServiceTemplateManager", "getConstructor failed", LogAnonymous.b(e));
        }
        LogUtil.j("SportService_SportServiceTemplateManager", "classify:", Integer.valueOf(i), " data: ", linkedHashMap.toString());
        return linkedHashMap;
    }

    public <T> T d(Class<?> cls, Class<T> cls2) {
        if (cls == null || cls2 == null) {
            return null;
        }
        try {
            return cls2.cast(cls.newInstance());
        } catch (ClassCastException | IllegalAccessException | InstantiationException e) {
            ReleaseLogUtil.a("SportService_SportServiceTemplateManager", "getConstructor failed, clsName", LogAnonymous.b(e));
            return null;
        }
    }
}
