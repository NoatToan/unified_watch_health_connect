package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes42.dex */
public class pmr extends ShareDataInfo implements Serializable {
    private static final long serialVersionUID = 2809903449040264040L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45682c;
    private int d;

    public int c() {
        return this.f45682c;
    }

    public void e(int i) {
        this.f45682c = i;
    }

    public int b() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }
}
