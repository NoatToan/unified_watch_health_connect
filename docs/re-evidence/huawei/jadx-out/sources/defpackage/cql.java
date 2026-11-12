package defpackage;

import android.util.Log;
import com.google.common.base.Ascii;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public class cql {
    public cqk b(byte[] bArr) throws cpy {
        return e(bArr, 0, 0);
    }

    public cqk c(byte[] bArr, int i) throws cpy {
        return e(bArr, i, 0);
    }

    private cqk e(byte[] bArr, int i, int i2) throws cpy {
        cqk cqkVar = new cqk();
        if (bArr == null || bArr.length == 0) {
            Log.w("TlvByteUtils", "hexString is null");
            return cqkVar;
        }
        if (i >= bArr.length) {
            LogUtil.e("TlvByteUtils", "input position or data is wrong, please check input.");
            return cqkVar;
        }
        if (i2 > 50) {
            throw new cpy();
        }
        while (i != bArr.length) {
            try {
                byte b2 = bArr[i];
                if (b2 == 0) {
                    throw new cpy();
                }
                int i3 = i + 1;
                byte[] bArrB = b(bArr, i3);
                int length = i3 + bArrB.length;
                int iC = c(bArrB);
                byte[] bArrArray = ByteBuffer.allocate(iC).put(bArr, length, iC).array();
                i = length + iC;
                if ((b2 & 128) == 128) {
                    cqkVar.c().add(e(bArrArray, 0, i2 + 1));
                } else {
                    cqkVar.d().add(new cqi(b2, iC, bArrArray));
                }
            } catch (IndexOutOfBoundsException e) {
                Log.e("TlvByteUtils", "parseTlv occur exception " + ExceptionUtils.c(e));
                throw new cpy();
            }
        }
        return cqkVar;
    }

    public cqk c(byte[] bArr, TreeSet<Byte> treeSet) throws cpy {
        cqk cqkVar = new cqk();
        if (bArr == null || bArr.length == 0 || treeSet == null || treeSet.size() == 0) {
            Log.w("TlvByteUtils", "hexString is null");
            return cqkVar;
        }
        int size = treeSet.size();
        int i = 0;
        int i2 = 0;
        while (i != bArr.length) {
            try {
                byte b2 = bArr[i];
                boolean zContains = treeSet.contains(Byte.valueOf(b2));
                int i3 = i + 1;
                byte[] bArrB = b(bArr, i3);
                int length = i3 + bArrB.length;
                int iC = c(bArrB);
                if (zContains) {
                    byte[] bArrArray = ByteBuffer.allocate(iC).put(bArr, length, iC).array();
                    i = length + iC;
                    if ((b2 & 128) == 128) {
                        Log.w("TlvByteUtils", "(tag & BIT_HIGHEST) == BIT_HIGHEST");
                    } else {
                        cqkVar.d().add(new cqi(b2, iC, bArrArray));
                        i2++;
                        if (i2 == size) {
                            break;
                        }
                    }
                } else {
                    i = length + iC;
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new cpy();
            }
        }
        return cqkVar;
    }

    public cqk b(byte[] bArr, TreeSet<Byte> treeSet) throws cpy {
        cqk cqkVar = new cqk();
        if (bArr == null || bArr.length == 0 || treeSet == null || treeSet.size() == 0) {
            Log.w("TlvByteUtils", "hexString is null");
            return cqkVar;
        }
        int size = treeSet.size();
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (i != bArr.length) {
                    byte b2 = bArr[i];
                    if (!treeSet.contains(Byte.valueOf(b2))) {
                        throw new cpy();
                    }
                    int i3 = i + 1;
                    byte[] bArrB = b(bArr, i3);
                    int length = i3 + bArrB.length;
                    int iC = c(bArrB);
                    byte[] bArrArray = ByteBuffer.allocate(iC).put(bArr, length, iC).array();
                    i = length + iC;
                    if ((b2 & 128) == 128) {
                        throw new cpy();
                    }
                    cqkVar.d().add(new cqi(b2, iC, bArrArray));
                    i2++;
                }
                return cqkVar;
            } catch (IndexOutOfBoundsException unused) {
                throw new cpy();
            }
        } while (i2 != size);
        if (i >= bArr.length) {
            return cqkVar;
        }
        throw new cpy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i) throws cpy {
        int i2 = 0;
        int i3 = i;
        while ((bArr[i3] & 128) == 128) {
            i3++;
            i2++;
            if (i2 == 3) {
                throw new cpy();
            }
        }
        int i4 = i2 + 1;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4);
        byteBufferAllocate.put(bArr, i, i4);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte[] bArr) throws cpy {
        byte b2;
        int i;
        int length = bArr.length;
        if (length == 1) {
            byte b3 = bArr[0];
            if ((b3 & 128) != 128) {
                return b3;
            }
            throw new cpy();
        }
        if (length == 2) {
            byte b4 = bArr[0];
            if ((b4 & 128) != 128) {
                throw new cpy();
            }
            b2 = bArr[1];
            if ((b2 & 128) == 128) {
                throw new cpy();
            }
            i = (b4 & Ascii.DEL) << 7;
        } else if (length == 3) {
            byte b5 = bArr[0];
            if ((b5 & 128) != 128) {
                throw new cpy();
            }
            byte b6 = bArr[1];
            if ((b6 & 128) != 128) {
                throw new cpy();
            }
            b2 = bArr[2];
            if ((b2 & 128) == 128) {
                throw new cpy();
            }
            i = ((b5 & Ascii.DEL) << 14) | ((b6 & Ascii.DEL) << 7);
        } else {
            throw new cpy();
        }
        return (b2 & Ascii.DEL) | i;
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Byte, byte[]> f31259b = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void b(byte b2, byte[] bArr) {
            this.f31259b.put(Byte.valueOf(b2), bArr);
        }

        public int d(byte b2, int i) {
            return cph.e(this.f31259b.get(Byte.valueOf(b2)), i);
        }

        public long d(byte b2, long j) {
            return cph.a(this.f31259b.get(Byte.valueOf(b2)), j);
        }

        public String e(byte b2, String str) {
            byte[] bArr = this.f31259b.get(Byte.valueOf(b2));
            if (bArr == null || bArr.length == 0) {
                LogUtil.e("TlvByteUtils", "tlv response target type: ", Byte.valueOf(b2), ", but no value");
                return str;
            }
            return new String(bArr, StandardCharsets.UTF_8);
        }

        public byte[] a(byte b2, byte[] bArr) {
            return this.f31259b.containsKey(Byte.valueOf(b2)) ? this.f31259b.get(Byte.valueOf(b2)) : bArr;
        }

        public List<c> b(byte b2) throws cpy {
            if (!this.f31259b.containsKey(Byte.valueOf(b2))) {
                return null;
            }
            byte[] bArr = this.f31259b.get(Byte.valueOf(b2));
            if (bArr == null || bArr.length == 0) {
                LogUtil.e("TlvByteUtils", "tlv response target type: ", Byte.valueOf(b2), ", but no value");
                return null;
            }
            LinkedList linkedList = new LinkedList();
            int i = 0;
            while (i != bArr.length) {
                try {
                    int i2 = i + 1;
                    byte[] bArrB = cql.b(bArr, i2);
                    int length = i2 + bArrB.length;
                    int iC = cql.c(bArrB);
                    byte[] bArrArray = ByteBuffer.allocate(iC).put(bArr, length, iC).array();
                    i = length + iC;
                    linkedList.add(new cql().a(bArrArray, 0));
                } catch (IndexOutOfBoundsException unused) {
                    throw new cpy();
                }
            }
            return linkedList;
        }
    }

    public c a(byte[] bArr, int i) throws cpy {
        c cVar = new c();
        if (bArr == null || bArr.length == 0) {
            Log.w("TlvByteUtils", "hexString is null");
            return cVar;
        }
        if (i >= bArr.length) {
            LogUtil.e("TlvByteUtils", "input position or data is wrong, please check input.");
            return cVar;
        }
        while (i != bArr.length) {
            try {
                byte b2 = bArr[i];
                if (b2 == 0) {
                    throw new cpy();
                }
                int i2 = i + 1;
                byte[] bArrB = b(bArr, i2);
                int length = i2 + bArrB.length;
                int iC = c(bArrB);
                byte[] bArrArray = ByteBuffer.allocate(iC).put(bArr, length, iC).array();
                i = length + iC;
                if ((b2 & 128) == 128) {
                    cVar.b((byte) (b2 & Ascii.DEL), bArrArray);
                } else {
                    cVar.b(b2, bArrArray);
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new cpy();
            }
        }
        return cVar;
    }
}
