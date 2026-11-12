package sk;

import android.content.Context;
import android.os.RemoteException;
import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f159507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f159508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sk.a.C3022a f159509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f159510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f159512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f159513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f159514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f159515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f159516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f159517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f159518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f159519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<byte[]> f159520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f159521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<Byte> f159522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<Byte> f159523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f159524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f159525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tk.c.e f159526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicReference<l> f159527u;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159528a;

        static {
            int[] iArr = new int[c.values().length];
            f159528a = iArr;
            try {
                iArr[c.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159528a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f159529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f159530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f159531c;

        public b(d dVar, byte[] bArr) {
            this.f159529a = bArr[0] & UnsignedBytes.MAX_VALUE;
            this.f159530b = bArr[1] & UnsignedBytes.MAX_VALUE;
            byte[] bArr2 = new byte[bArr.length - 2];
            this.f159531c = bArr2;
            System.arraycopy(bArr, 2, bArr2, 0, bArr2.length);
        }
    }

    public enum c {
        IDLE,
        ACTIVE
    }

    public d(pj2.k kVar, Context context) {
        c cVar = c.IDLE;
        this.f159510d = cVar;
        this.f159511e = 0;
        this.f159512f = 0;
        this.f159513g = (byte) 0;
        this.f159514h = false;
        this.f159515i = cVar;
        this.f159516j = 0;
        this.f159517k = 0;
        this.f159519m = false;
        this.f159520n = new ArrayList<>();
        this.f159521o = false;
        ArrayList<Byte> arrayList = new ArrayList<>();
        this.f159522p = arrayList;
        ArrayList<Byte> arrayList2 = new ArrayList<>();
        this.f159523q = arrayList2;
        this.f159527u = new AtomicReference<>();
        this.f159508b = context;
        this.f159524r = kVar.getMacAddress();
        this.f159525s = kVar.getName();
        this.f159507a = new h(this, kVar);
        this.f159526t = new tk.c.e();
        e();
        this.f159510d = cVar;
        this.f159513g = (byte) 0;
        this.f159514h = false;
        this.f159512f = 0;
        this.f159511e = 0;
        arrayList.clear();
        arrayList2.clear();
    }

    public static String c(byte[] bArr) {
        try {
            String str = new String(bArr, "UTF-8");
            int length = str.length();
            while (length > 0 && str.charAt(length - 1) == 0) {
                length--;
            }
            return str.substring(0, length);
        } catch (UnsupportedEncodingException e4) {
            o2.c.p(e4);
            return null;
        }
    }

    public final void a(ArrayList<Byte> arrayList) {
        if (arrayList.size() > 8) {
            byte[] bArr = new byte[8];
            byte b14 = (byte) ((this.f159513g & 224) | 8);
            for (int i14 = 0; i14 < 8; i14++) {
                bArr[i14] = arrayList.get(i14).byteValue();
            }
            arrayList.subList(0, 8).clear();
            sk.a.C3022a c3022a = this.f159509c;
            if (c3022a != null) {
                bk.l lVar = bk.l.BURST_TRANSFER_DATA;
                c3022a.a(lVar, e.b(lVar, b14, bArr));
            }
            byte b15 = this.f159513g;
            if (b15 == 96) {
                this.f159513g = (byte) 32;
            } else {
                this.f159513g = (byte) (b15 + 32);
            }
            a(arrayList);
            return;
        }
        if (this.f159514h) {
            byte b16 = (byte) (this.f159513g | UnsignedBytes.MAX_POWER_OF_TWO);
            this.f159513g = b16;
            byte[] bArr2 = new byte[8];
            byte b17 = (byte) ((b16 & 224) | 8);
            for (int i15 = 0; i15 < 8; i15++) {
                bArr2[i15] = arrayList.get(i15).byteValue();
            }
            arrayList.clear();
            this.f159510d = c.IDLE;
            this.f159513g = (byte) 0;
            this.f159514h = false;
            this.f159512f = 0;
            this.f159511e = 0;
            this.f159522p.clear();
            this.f159523q.clear();
            sk.a.C3022a c3022a2 = this.f159509c;
            if (c3022a2 != null) {
                bk.l lVar2 = bk.l.BURST_TRANSFER_DATA;
                c3022a2.a(lVar2, e.b(lVar2, b17, bArr2));
            }
        }
    }

    public final void b(UUID uuid, byte[] bArr) {
        tk.k lVar;
        int i14;
        int length = bArr.length;
        Objects.toString(uuid);
        int i15 = 0;
        if (uuid.equals(sk.b.f159490b)) {
            sk.a.C3022a c3022a = this.f159509c;
            if (c3022a != null) {
                bk.l lVar2 = bk.l.CHANNEL_ID;
                byte[] bArr2 = new byte[5];
                bArr2[0] = (byte) 8;
                System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
                c3022a.a(lVar2, new dk.a(81, bArr2));
                return;
            }
            return;
        }
        boolean zEquals = uuid.equals(sk.b.f159491c);
        h hVar = this.f159507a;
        if (zEquals) {
            this.f159517k = (int) ak.k.e(2, 2, bArr);
            hVar.a(sk.b.f159500l, sk.b.f159501m);
            return;
        }
        if (uuid.equals(sk.b.f159494f)) {
            sk.a.C3022a c3022a2 = this.f159509c;
            if (c3022a2 != null) {
                bk.l lVar3 = bk.l.ACKNOWLEDGED_DATA;
                c3022a2.a(lVar3, e.b(lVar3, 8, bArr));
                return;
            }
            return;
        }
        if (uuid.equals(sk.b.f159492d)) {
            sk.a.C3022a c3022a3 = this.f159509c;
            if (c3022a3 != null) {
                bk.l lVar4 = bk.l.BROADCAST_DATA;
                c3022a3.a(lVar4, e.b(lVar4, 8, bArr));
                return;
            }
            return;
        }
        if (uuid.equals(sk.b.f159496h)) {
            b bVar = new b(this, bArr);
            int i16 = a.f159528a[this.f159510d.ordinal()];
            int i17 = bVar.f159529a;
            if (i16 != 1) {
                if (i16 != 2) {
                    return;
                }
            } else if (!ak.k.d(64, i17) || this.f159515i != c.IDLE) {
                return;
            } else {
                this.f159510d = c.ACTIVE;
            }
            int i18 = this.f159512f;
            ArrayList<Byte> arrayList = this.f159522p;
            int i19 = bVar.f159530b;
            if (i19 == i18) {
                int i24 = 0;
                while (true) {
                    byte[] bArr3 = bVar.f159531c;
                    if (i24 >= bArr3.length) {
                        break;
                    }
                    arrayList.add(Byte.valueOf(bArr3[i24]));
                    i24++;
                }
                int i25 = this.f159512f + 1;
                this.f159512f = i25;
                if (i25 == 255) {
                    this.f159512f = 0;
                }
                i14 = 0;
            } else {
                i14 = 1;
            }
            if (ak.k.d(32, i17)) {
                ArrayList<Byte> arrayList2 = this.f159523q;
                if (i14 == 0) {
                    this.f159511e = this.f159512f;
                    arrayList2.addAll(arrayList);
                    if (ak.k.d(-128, i17)) {
                        this.f159512f = 0;
                        this.f159514h = true;
                    }
                } else {
                    this.f159512f = this.f159511e;
                }
                arrayList.clear();
                byte[] bArr4 = new byte[6];
                bArr4[0] = 0;
                byte b14 = (byte) (i17 & (-64));
                bArr4[0] = b14;
                byte b15 = (byte) (32 | b14);
                bArr4[0] = b15;
                bArr4[0] = (byte) (b15 | 4);
                bArr4[1] = -1;
                bArr4[2] = UnsignedBytes.MAX_POWER_OF_TWO;
                bArr4[3] = (byte) i19;
                bArr4[4] = (byte) i14;
                bArr4[5] = (byte) this.f159512f;
                hVar.c(sk.b.f159489a, sk.b.f159497i, bArr4);
                if (i14 == 0) {
                    a(arrayList2);
                    return;
                }
                return;
            }
            return;
        }
        if (uuid.equals(sk.b.f159499k)) {
            if (bArr[4] != 0) {
                while (i15 < this.f159516j - 1) {
                    int i26 = this.f159518l;
                    if (i26 == 0) {
                        this.f159518l = 254;
                    } else {
                        this.f159518l = i26 - 1;
                    }
                    i15++;
                }
                d();
                return;
            }
            this.f159520n.subList(0, this.f159516j - 1).clear();
            if (!this.f159519m) {
                d();
                return;
            }
            e();
            sk.a.C3022a c3022a4 = this.f159509c;
            if (c3022a4 != null) {
                c3022a4.a(bk.l.CHANNEL_EVENT, e.a(ak.e.TRANSFER_TX_COMPLETED));
                return;
            }
            return;
        }
        boolean zEquals2 = uuid.equals(sk.b.f159501m);
        tk.c.e eVar = this.f159526t;
        if (zEquals2) {
            eVar.f165215a = c(bArr);
            hVar.a(sk.b.f159500l, sk.b.f159502n);
            return;
        }
        if (uuid.equals(sk.b.f159502n)) {
            eVar.f165216b = c(bArr);
            hVar.a(sk.b.f159500l, sk.b.f159503o);
            return;
        }
        if (uuid.equals(sk.b.f159503o)) {
            eVar.f165217c = c(bArr);
            hVar.a(sk.b.f159500l, sk.b.f159504p);
            return;
        }
        if (uuid.equals(sk.b.f159504p)) {
            c(bArr);
            eVar.getClass();
            hVar.a(sk.b.f159500l, sk.b.f159505q);
            return;
        }
        if (uuid.equals(sk.b.f159505q)) {
            eVar.f165218d = c(bArr);
            try {
                if ("Garmin".equals(eVar.f165215a) && "1885".equals(eVar.f165216b)) {
                    Matcher matcher = tk.k.f165241i.matcher(eVar.f165218d);
                    if (matcher.matches()) {
                        i15 = Integer.parseInt(matcher.group(1).replace(".", ""));
                    }
                    String str = this.f159524r;
                    lVar = i15 >= 170 ? new tk.l(new sk.a(this, str), this.f159524r, this.f159525s, this.f159526t, this.f159508b) : new tk.k(new sk.a(this, str), this.f159524r, this.f159525s, this.f159526t, this.f159508b);
                } else {
                    lVar = null;
                }
            } catch (RemoteException unused) {
            }
            l andSet = this.f159527u.getAndSet(null);
            if (lVar != null) {
                lVar.g(andSet);
            } else {
                andSet.b("Remote device is an unrecognized ant-over-ble device");
            }
        }
    }

    public final void d() {
        this.f159515i = c.ACTIVE;
        this.f159516j = 0;
        this.f159519m = false;
        while (true) {
            int i14 = this.f159516j;
            int i15 = i14 + 1;
            this.f159516j = i15;
            if (i15 > this.f159517k || this.f159519m) {
                break;
            }
            ArrayList<byte[]> arrayList = this.f159520n;
            byte[] bArr = arrayList.get(i14);
            int i16 = this.f159518l == 0 ? 64 : 0;
            int size = arrayList.size();
            int i17 = this.f159516j;
            if (size == i17) {
                i16 |= -128;
                this.f159519m = true;
            }
            if (i17 == this.f159517k || this.f159519m) {
                i16 |= 32;
            }
            int length = (bArr.length & 31) | i16;
            int i18 = this.f159518l;
            int i19 = i18 + 1;
            this.f159518l = i19;
            if (i19 == 255) {
                this.f159518l = 0;
            }
            byte[] bArr2 = new byte[bArr.length + 2];
            bArr2[0] = (byte) length;
            bArr2[1] = (byte) i18;
            System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
            this.f159507a.c(sk.b.f159489a, sk.b.f159498j, bArr2);
        }
        this.f159515i = c.IDLE;
    }

    public final void e() {
        this.f159515i = c.IDLE;
        this.f159519m = false;
        this.f159518l = 0;
        this.f159516j = 0;
        this.f159520n.clear();
    }
}
