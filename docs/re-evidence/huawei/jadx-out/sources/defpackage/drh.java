package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class drh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f32243a;
    private UUID d;
    private UUID e;

    private drh(a aVar) {
        this.e = aVar.f32244b;
        this.d = aVar.d;
        this.f32243a = aVar.f32245c;
    }

    public UUID b() {
        return this.e;
    }

    public UUID a() {
        return this.d;
    }

    public byte[] c() {
        byte[] bArr = this.f32243a;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return new byte[0];
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f32244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f32245c;
        private UUID d;

        public a c(String str) {
            UUID uuidFromString = UUID.fromString(str);
            this.f32244b = uuidFromString;
            UUID uuidD = dpg.d(uuidFromString);
            if (uuidD == null) {
                uuidD = null;
            }
            this.d = uuidD;
            return this;
        }

        public a c(UUID uuid) {
            this.f32244b = uuid;
            UUID uuidD = dpg.d(uuid);
            if (uuidD == null) {
                uuidD = null;
            }
            this.d = uuidD;
            return this;
        }

        public a e(byte[] bArr) {
            if (bArr != null) {
                this.f32245c = (byte[]) bArr.clone();
            }
            return this;
        }

        public drh e() {
            return new drh(this);
        }
    }
}
