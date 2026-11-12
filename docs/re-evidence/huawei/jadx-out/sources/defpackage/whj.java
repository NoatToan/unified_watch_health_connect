package defpackage;

import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class whj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile whj f52043a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<PrivacyDataModel>> f52044c = new LinkedHashMap(10);

    public static whj a() {
        if (f52043a == null) {
            synchronized (d) {
                if (f52043a == null) {
                    f52043a = new whj();
                }
            }
        }
        return f52043a;
    }

    public List<PrivacyDataModel> d(String str) {
        return this.f52044c.get(str);
    }

    public Map<String, List<PrivacyDataModel>> e() {
        return this.f52044c;
    }

    public void b(String str, PrivacyDataModel privacyDataModel) {
        if (this.f52044c.containsKey(str)) {
            this.f52044c.get(str).add(privacyDataModel);
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(privacyDataModel);
        this.f52044c.put(str, arrayList);
    }

    public void c() {
        this.f52044c.clear();
    }
}
