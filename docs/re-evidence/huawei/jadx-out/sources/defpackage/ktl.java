package defpackage;

import com.huawei.hihealthservice.HiDataOperation;

/* JADX INFO: loaded from: classes10.dex */
public final class ktl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ktj f39427a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ktj f39428c;

    private ktl() {
        this.f39427a = new ktj(null);
        this.f39428c = new ktj("hihealth_sensitive.db");
    }

    public static ktl d() {
        return e.f39429a;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ktl f39429a = new ktl();
    }

    public void d(HiDataOperation hiDataOperation) {
        int dataType = hiDataOperation.getDataType();
        if (dataType == 0) {
            hiDataOperation.execute(null);
        } else if (dataType == 2) {
            hiDataOperation.execute(this.f39428c);
        } else {
            hiDataOperation.execute(this.f39427a);
        }
    }
}
