package defpackage;

import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotBlank;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotNull;

/* JADX INFO: loaded from: classes20.dex */
public class ynn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @KfsNotNull
    private KfsKeyPurpose f53669c;

    @KfsNotNull
    @KfsNotBlank
    private String d;

    public ynn(String str, int i, KfsKeyPurpose kfsKeyPurpose) {
        this(str, i, kfsKeyPurpose, true);
    }

    public ynn(String str, int i, KfsKeyPurpose kfsKeyPurpose, boolean z) {
        this.d = str;
        this.f53667a = i;
        this.f53669c = kfsKeyPurpose;
        this.f53668b = z;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.f53667a;
    }

    public KfsKeyPurpose b() {
        return this.f53669c;
    }

    public boolean e() {
        return this.f53668b;
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f53670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53671c;
        private boolean d = true;
        private KfsKeyPurpose e;

        public e d(String str) {
            this.f53670b = str;
            return this;
        }

        public e b(int i) {
            this.f53671c = i;
            return this;
        }

        public e b(KfsKeyPurpose kfsKeyPurpose) {
            this.e = kfsKeyPurpose;
            return this;
        }

        public ynn c() {
            return new ynn(this.f53670b, this.f53671c, this.e, this.d);
        }
    }
}
