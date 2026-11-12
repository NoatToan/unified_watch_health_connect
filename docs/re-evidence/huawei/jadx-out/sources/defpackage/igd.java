package defpackage;

import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class igd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<byte[]> f37583a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        this.f37583a.add(bArr);
    }

    public byte[] b() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(d());
        Iterator<byte[]> it = this.f37583a.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }

    public int d() {
        Iterator<byte[]> it = this.f37583a.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        return length;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37584a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37586c;
        private byte[] d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private dey.c f37585b = new dey.c().d(SportHiWearBusinessType.FITNESS_RUN_PLAN_INFO_FILE.getTypeValue()).b(1);
        private igh.d g = new igh.d();
        private List<byte[]> e = new ArrayList();

        public a e(int i) {
            this.f37585b.e(i);
            return this;
        }

        public a d(int i) {
            this.f37585b.d(i);
            return this;
        }

        public a a(byte[] bArr) {
            if (bArr != null) {
                this.d = (byte[]) bArr.clone();
                int length = bArr.length;
                this.f37586c = length;
                this.g.a(length);
            }
            return this;
        }

        public a a(byte[] bArr, int i) {
            if (bArr != null) {
                this.e.add(bArr);
                this.f37584a += bArr.length;
                this.g.e(new igh.b(bArr.length, i));
            }
            return this;
        }

        public igd e() {
            igd igdVar = new igd();
            igh ighVarE = this.g.e();
            this.f37585b.c(this.f37584a + this.f37586c).a(ighVarE.b());
            igdVar.a(this.f37585b.a().b());
            igdVar.a(ighVarE.d());
            byte[] bArr = this.d;
            if (bArr != null) {
                igdVar.a(bArr);
            }
            Iterator<byte[]> it = this.e.iterator();
            while (it.hasNext()) {
                igdVar.a(it.next());
            }
            return igdVar;
        }
    }
}
