package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public final class d6q extends k1s {
    public List<String> c;
    public final ConcurrentNavigableMap<String, a> d = new ConcurrentSkipListMap();
    public Set<String> e = new CopyOnWriteArraySet();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f15153b;
        public final short[] c;
        public final AtomicReferenceArray<Object> d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.d = atomicReferenceArray;
            this.f15152a = str;
            this.f15153b = strArr;
            this.c = sArr;
        }

        public i1s b(short s) throws Exception {
            Object objA = this.d.get(s);
            if (objA instanceof byte[]) {
                objA = hwl.a(new DataInputStream(new ByteArrayInputStream((byte[]) objA)));
                this.d.set(s, objA);
            }
            return (i1s) objA;
        }

        public i1s c(String str) {
            int iBinarySearch = Arrays.binarySearch(this.f15153b, str);
            if (iBinarySearch < 0) {
                return null;
            }
            try {
                return b(this.c[iBinarySearch]);
            } catch (Exception e) {
                throw new ZoneRulesException("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.f15152a, e);
            }
        }

        public String toString() {
            return this.f15152a;
        }
    }

    public d6q(InputStream inputStream) {
        try {
            h(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    @Override // defpackage.k1s
    public i1s d(String str, boolean z) {
        crd.i(str, "zoneId");
        i1s i1sVarC = this.d.lastEntry().getValue().c(str);
        if (i1sVarC != null) {
            return i1sVarC;
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    @Override // defpackage.k1s
    public Set<String> e() {
        return new HashSet(this.c);
    }

    public final boolean h(InputStream inputStream) throws IOException {
        boolean z = false;
        for (a aVar : i(inputStream)) {
            a aVarPutIfAbsent = this.d.putIfAbsent(aVar.f15152a, aVar);
            if (aVarPutIfAbsent != null && !aVarPutIfAbsent.f15152a.equals(aVar.f15152a)) {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + aVar.f15152a);
            }
            z = true;
        }
        return z;
    }

    public final Iterable<a> i(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i = dataInputStream.readShort();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = dataInputStream.readUTF();
        }
        int i3 = dataInputStream.readShort();
        String[] strArr2 = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr2[i4] = dataInputStream.readUTF();
        }
        this.c = Arrays.asList(strArr2);
        int i5 = dataInputStream.readShort();
        Object[] objArr = new Object[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i6] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(i);
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = dataInputStream.readShort();
            String[] strArr3 = new String[i8];
            short[] sArr = new short[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                strArr3[i9] = strArr2[dataInputStream.readShort()];
                sArr[i9] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i7], strArr3, sArr, atomicReferenceArray));
        }
        return hashSet;
    }

    public String toString() {
        return "TZDB";
    }
}
