package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class pmu extends ShareDataInfo implements Serializable {
    private static final long serialVersionUID = 2809903449040264040L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45687c;

    public void a(int i) {
        this.f45687c = i;
    }

    public int e() {
        return this.f45687c;
    }
}
