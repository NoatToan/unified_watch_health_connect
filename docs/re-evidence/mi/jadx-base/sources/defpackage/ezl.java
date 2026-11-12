package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ezl extends fhj {
    public List<a> g;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17228b;
        public int c;

        public a(int i, int i2, int i3) {
            this.f17227a = i;
            this.f17228b = i2;
            this.c = i3;
        }

        public String toString() {
            return String.format("resp property: siid=%d,piid=%d,status=%d", Integer.valueOf(this.f17227a), Integer.valueOf(this.f17228b), Integer.valueOf(this.c));
        }
    }

    public ezl(String str, int i, int i2, int i3, ByteBuffer byteBuffer) {
        super(str, i, i2, i3, byteBuffer);
        this.g = new ArrayList();
    }

    @Override // defpackage.fhj
    public void h(ByteBuffer byteBuffer) {
        int iD = v73.d(byteBuffer.get());
        for (int i = 0; i < iD; i++) {
            this.g.add(new a(v73.d(byteBuffer.get()), this.d == 1 ? v73.d(byteBuffer.get()) : v73.g(byteBuffer.getShort()), v73.g(byteBuffer.getShort())));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("SetPropertyRespPacket={");
        sb.append("frameLength=");
        sb.append(this.e);
        sb.append(",tid=");
        sb.append(this.f);
        sb.append(",opcode=");
        sb.append(this.f29177b);
        List<a> list = this.g;
        if (list == null || list.isEmpty()) {
            sb.append(",resp property size=0");
        } else {
            for (a aVar : this.g) {
                sb.append(",");
                sb.append(aVar.toString());
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
