package org.apache.commons.lang;

import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
class c {
    private transient a[] a;
    private transient int b;
    private int c;
    private final float d;

    public static class a {
        public final int a;
        public final int b;
        public Object c;
        public a d;

        public a(int i, int i2, Object obj, a aVar) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            this.d = aVar;
        }
    }

    public c() {
        this(20, 0.75f);
    }

    public synchronized void a() {
        a[] aVarArr = this.a;
        int length = aVarArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                aVarArr[length] = null;
            } else {
                this.b = 0;
            }
        }
    }

    public boolean b(Object obj) {
        Objects.requireNonNull(obj);
        a[] aVarArr = this.a;
        int length = aVarArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return false;
            }
            for (a aVar = aVarArr[i]; aVar != null; aVar = aVar.d) {
                if (aVar.c.equals(obj)) {
                    return true;
                }
            }
            length = i;
        }
    }

    public boolean c(int i) {
        a[] aVarArr = this.a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i) {
                return true;
            }
        }
        return false;
    }

    public boolean d(Object obj) {
        return b(obj);
    }

    public Object e(int i) {
        a[] aVarArr = this.a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i) {
                return aVar.c;
            }
        }
        return null;
    }

    public boolean f() {
        return this.b == 0;
    }

    public Object g(int i, Object obj) {
        a[] aVarArr = this.a;
        int i2 = Integer.MAX_VALUE & i;
        int length = i2 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i) {
                Object obj2 = aVar.c;
                aVar.c = obj;
                return obj2;
            }
        }
        if (this.b >= this.c) {
            h();
            aVarArr = this.a;
            length = i2 % aVarArr.length;
        }
        aVarArr[length] = new a(i, i, obj, aVarArr[length]);
        this.b++;
        return null;
    }

    public void h() {
        a[] aVarArr = this.a;
        int length = aVarArr.length;
        int i = (length * 2) + 1;
        a[] aVarArr2 = new a[i];
        this.c = (int) (i * this.d);
        this.a = aVarArr2;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            a aVar = aVarArr[i2];
            while (aVar != null) {
                a aVar2 = aVar.d;
                int i3 = (aVar.a & Integer.MAX_VALUE) % i;
                aVar.d = aVarArr2[i3];
                aVarArr2[i3] = aVar;
                aVar = aVar2;
            }
            length = i2;
        }
    }

    public Object i(int i) {
        a[] aVarArr = this.a;
        int length = (Integer.MAX_VALUE & i) % aVarArr.length;
        a aVar = null;
        for (a aVar2 = aVarArr[length]; aVar2 != null; aVar2 = aVar2.d) {
            if (aVar2.a == i) {
                if (aVar != null) {
                    aVar.d = aVar2.d;
                } else {
                    aVarArr[length] = aVar2.d;
                }
                this.b--;
                Object obj = aVar2.c;
                aVar2.c = null;
                return obj;
            }
            aVar = aVar2;
        }
        return null;
    }

    public int j() {
        return this.b;
    }

    public c(int i) {
        this(i, 0.75f);
    }

    public c(int i, float f) {
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Illegal Capacity: ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        if (f > 0.0f) {
            i = i == 0 ? 1 : i;
            this.d = f;
            this.a = new a[i];
            this.c = (int) (i * f);
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Illegal Load: ");
        stringBuffer2.append(f);
        throw new IllegalArgumentException(stringBuffer2.toString());
    }
}
