package defpackage;

import com.huawei.hwcloudmodel.model.unite.RunLevelDetail;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gzp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UserRunLevelData f36294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36295c;
    private Map<Integer, RunLevelDetail> e;

    public int c() {
        return this.f36295c;
    }

    public void b(int i) {
        this.f36295c = i;
    }

    public UserRunLevelData e() {
        return this.f36294b;
    }

    public void e(UserRunLevelData userRunLevelData) {
        this.f36294b = userRunLevelData;
    }

    public Map<Integer, RunLevelDetail> a() {
        return this.e;
    }

    public void e(Map<Integer, RunLevelDetail> map) {
        this.e = map;
    }
}
