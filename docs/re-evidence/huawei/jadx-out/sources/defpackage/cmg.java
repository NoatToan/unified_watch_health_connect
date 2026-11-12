package defpackage;

import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.entity.SimpleDataHead;

/* JADX INFO: loaded from: classes4.dex */
public class cmg {
    private SendMode f;
    private String n;
    private String e = "";
    private CharacterOperationType i = CharacterOperationType.WRITE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1766a = new byte[0];
    private int g = 0;
    private int h = 1;
    private boolean d = true;
    private boolean j = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f1768c = SimpleDataHead.INVALID.getDataHead();
    private int k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1767b = 0;

    public SendMode f() {
        return this.f;
    }

    public void d(SendMode sendMode) {
        this.f = sendMode;
    }

    public String i() {
        return this.n;
    }

    public void b(String str) {
        this.n = str;
    }

    public String c() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public byte[] b() {
        return this.f1766a;
    }

    public void a(byte[] bArr) {
        this.f1766a = bArr;
    }

    public CharacterOperationType e() {
        return this.i;
    }

    public int h() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public void b(int i) {
        this.h = i;
    }

    public boolean k() {
        return this.d;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public byte d() {
        return this.f1768c;
    }

    public void d(int i) {
        this.k = i;
    }

    public int g() {
        return this.k;
    }

    public void c(int i) {
        this.f1767b = i;
    }

    public int a() {
        return this.f1767b;
    }

    public boolean o() {
        return this.j;
    }

    public void d(boolean z) {
        this.j = z;
    }

    public static final class b {
        private CharacterOperationType e = CharacterOperationType.WRITE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1771c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1770b = 1;
        private boolean d = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte f1769a = SimpleDataHead.INVALID.getDataHead();

        public b a(CharacterOperationType characterOperationType) {
            this.e = characterOperationType;
            return this;
        }

        public b b(boolean z) {
            this.d = z;
            return this;
        }

        public b d(int i) {
            this.f1771c = i;
            return this;
        }

        public b a(int i) {
            this.f1770b = i;
            return this;
        }

        public b a(byte b2) {
            this.f1769a = b2;
            return this;
        }

        public cmg a(cmg cmgVar) {
            if (cmgVar == null) {
                return cmgVar;
            }
            cmgVar.h = this.f1770b;
            cmgVar.g = this.f1771c;
            cmgVar.i = this.e;
            cmgVar.d = this.d;
            cmgVar.f1768c = this.f1769a;
            return cmgVar;
        }
    }
}
