package org.apache.commons.compress.archivers.zip;

import defpackage.a1s;
import defpackage.cbq;
import defpackage.d1s;
import defpackage.ebq;
import defpackage.gk1;
import defpackage.hpr;
import defpackage.ipr;
import defpackage.j9q;
import defpackage.jpr;
import defpackage.k9q;
import defpackage.nqk;
import defpackage.rqd;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<ZipShort, Class<?>> f29429a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.a$a, reason: collision with other inner class name */
    public static final class C1063a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1063a f29430b = new C1063a(0);
        public static final C1063a c = new C1063a(1);
        public static final C1063a d = new C1063a(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29431a;

        public C1063a(int i) {
            this.f29431a = i;
        }

        public d1s a(byte[] bArr, int i, int i2, boolean z, int i3) throws ZipException {
            int i4 = this.f29431a;
            if (i4 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad extra field starting at ");
                sb.append(i);
                sb.append(".  Block length of ");
                sb.append(i3);
                sb.append(" bytes exceeds remaining data of ");
                sb.append(i2 - 4);
                sb.append(" bytes.");
                throw new ZipException(sb.toString());
            }
            if (i4 == 1) {
                return null;
            }
            if (i4 != 2) {
                throw new ZipException("Unknown UnparseableExtraField key: " + this.f29431a);
            }
            cbq cbqVar = new cbq();
            if (z) {
                cbqVar.parseFromLocalFileData(bArr, i, i2);
            } else {
                cbqVar.parseFromCentralDirectoryData(bArr, i, i2);
            }
            return cbqVar;
        }
    }

    static {
        d(gk1.class);
        d(X5455_ExtendedTimestamp.class);
        d(X7875_NewUnix.class);
        d(rqd.class);
        d(k9q.class);
        d(j9q.class);
        d(a1s.class);
        d(hpr.class);
        d(ipr.class);
        d(b.class);
        d(c.class);
        d(d.class);
        d(jpr.class);
        d(nqk.class);
    }

    public static d1s a(ZipShort zipShort) throws IllegalAccessException, InstantiationException {
        d1s d1sVarB = b(zipShort);
        if (d1sVarB != null) {
            return d1sVarB;
        }
        ebq ebqVar = new ebq();
        ebqVar.b(zipShort);
        return ebqVar;
    }

    public static d1s b(ZipShort zipShort) throws IllegalAccessException, InstantiationException {
        Class<?> cls = f29429a.get(zipShort);
        if (cls != null) {
            return (d1s) cls.newInstance();
        }
        return null;
    }

    public static d1s c(d1s d1sVar, byte[] bArr, int i, int i2, boolean z) throws ZipException {
        try {
            if (z) {
                d1sVar.parseFromLocalFileData(bArr, i, i2);
            } else {
                d1sVar.parseFromCentralDirectoryData(bArr, i, i2);
            }
            return d1sVar;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ((ZipException) new ZipException("Failed to parse corrupt ZIP extra field of type " + Integer.toHexString(d1sVar.getHeaderId().getValue())).initCause(e));
        }
    }

    public static void d(Class<?> cls) {
        try {
            f29429a.put(((d1s) cls.newInstance()).getHeaderId(), cls);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls + " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(cls + "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            throw new RuntimeException(cls + " is not a concrete class");
        }
    }
}
