package defpackage;

import com.xiaomi.mi_connect.nfc.exception.NfcParseActionRecordException;
import com.xiaomi.mi_connect.nfc.exception.NfcParseDeviceRecordException;
import com.xiaomi.mi_connect.nfc.exception.NfcTagDataCorruptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ptg {
    public static final List<Byte> g = Arrays.asList((byte) 1, (byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f30751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f30752b;
    public int c;
    public byte d;
    public byte e;
    public Map<Byte, List<uuc>> f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f30753a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f30754b = 0;
        public int c = 0;
        public byte d = 0;
        public Map<Byte, List<uuc>> e = new HashMap();

        public a a(byte b2) {
            this.d = (byte) (b2 | this.d);
            return this;
        }

        public a b(byte b2, uuc uucVar) {
            List<uuc> arrayList = this.e.get(Byte.valueOf(b2));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.e.put(Byte.valueOf(b2), arrayList);
            }
            arrayList.add(uucVar);
            return this;
        }

        public ptg c() throws NfcTagDataCorruptException {
            Iterator<List<uuc>> it = this.e.values().iterator();
            int size = 0;
            while (it.hasNext()) {
                size += it.next().size();
            }
            if (size > 127) {
                throw new NfcTagDataCorruptException("too much records");
            }
            if (this.c <= 0) {
                this.c = (int) (System.currentTimeMillis() / 1000);
            }
            return new ptg(this.f30753a, this.f30754b, this.c, this.d, (byte) size, this.e);
        }

        public a d(byte b2) {
            this.f30753a = b2;
            return this;
        }

        public a e(byte b2) {
            this.f30754b = b2;
            return this;
        }

        public a f(int i) {
            this.c = i;
            return this;
        }
    }

    public ptg(byte b2, byte b3, int i, byte b4, byte b5, Map<Byte, List<uuc>> map) {
        this.f30751a = b2;
        this.f30752b = b3;
        this.c = i;
        this.d = b4;
        this.e = b5;
        this.f = map;
    }

    public static ptg a(byte[] bArr) throws NfcTagDataCorruptException {
        try {
            a aVar = new a();
            aVar.d(bArr[0]);
            aVar.e(bArr[1]);
            aVar.f(tcd.a(bArr, 2));
            aVar.a(bArr[6]);
            int i = 8;
            for (int i2 = bArr[7]; i2 > 0; i2--) {
                char c = bArr[i];
                short sB = fbm.b(bArr, i + 1);
                if (sB < 3) {
                    throw new NfcTagDataCorruptException("invalid data offset");
                }
                int i3 = sB - 3;
                if (i3 > 0) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i + 3, bArr2, 0, i3);
                    if (c == 1) {
                        aVar.b((byte) 1, qtg.b(bArr2));
                    } else {
                        if (c != 2) {
                            throw new NfcTagDataCorruptException("unsupported record type");
                        }
                        aVar.b((byte) 2, ntg.b(bArr2));
                    }
                }
                i += sB;
            }
            return aVar.c();
        } catch (NfcParseActionRecordException e) {
            throw new NfcTagDataCorruptException("invalidate action data:" + e.getMessage());
        } catch (NfcParseDeviceRecordException e2) {
            throw new NfcTagDataCorruptException("invalidate device data:" + e2.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw new NfcTagDataCorruptException("invalidate data");
        }
    }

    public List<uuc> b(byte b2) {
        Map<Byte, List<uuc>> map = this.f;
        if (map == null) {
            return null;
        }
        return map.get(Byte.valueOf(b2));
    }
}
