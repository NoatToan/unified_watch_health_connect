package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class bl9 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<jaq> f4334b = new ArrayList();

    public void a(jaq jaqVar) {
        this.f4334b.add(jaqVar);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bl9 clone() {
        bl9 bl9Var = new bl9();
        try {
            List<jaq> list = this.f4334b;
            if (list == null) {
                bl9Var.f4334b = null;
            } else {
                bl9Var.f4334b.addAll(list);
            }
            Object obj = this.f4333a;
            if (obj != null) {
                if (obj instanceof dsf) {
                    bl9Var.f4333a = ((dsf) obj).clone();
                } else if (obj instanceof byte[]) {
                    bl9Var.f4333a = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        bl9Var.f4333a = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        bl9Var.f4333a = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        bl9Var.f4333a = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        bl9Var.f4333a = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        bl9Var.f4333a = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        bl9Var.f4333a = ((double[]) obj).clone();
                    } else if (obj instanceof dsf[]) {
                        dsf[] dsfVarArr = (dsf[]) obj;
                        dsf[] dsfVarArr2 = new dsf[dsfVarArr.length];
                        bl9Var.f4333a = dsfVarArr2;
                        while (i < dsfVarArr.length) {
                            dsfVarArr2[i] = dsfVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return bl9Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public int c() {
        if (this.f4333a != null) {
            throw null;
        }
        Iterator<jaq> it = this.f4334b.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public final byte[] d() throws IOException {
        byte[] bArr = new byte[c()];
        e(CodedOutputByteBufferNano.J(bArr));
        return bArr;
    }

    public void e(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (this.f4333a != null) {
            throw null;
        }
        Iterator<jaq> it = this.f4334b.iterator();
        while (it.hasNext()) {
            it.next().b(codedOutputByteBufferNano);
        }
    }

    public boolean equals(Object obj) {
        List<jaq> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bl9)) {
            return false;
        }
        bl9 bl9Var = (bl9) obj;
        if (this.f4333a != null && bl9Var.f4333a != null) {
            throw null;
        }
        List<jaq> list2 = this.f4334b;
        if (list2 != null && (list = bl9Var.f4334b) != null) {
            return list2.equals(list);
        }
        try {
            return Arrays.equals(d(), bl9Var.d());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public int hashCode() {
        try {
            return 527 + Arrays.hashCode(d());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
