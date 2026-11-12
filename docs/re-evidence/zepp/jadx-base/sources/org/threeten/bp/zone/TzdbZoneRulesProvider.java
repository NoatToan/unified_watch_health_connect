package org.threeten.bp.zone;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public final class TzdbZoneRulesProvider extends ZoneRulesProvider {
    private List<String> c;
    private final ConcurrentNavigableMap<String, a> d = new ConcurrentSkipListMap();
    private Set<String> e = new CopyOnWriteArraySet();

    public static class a {
        private final String a;
        private final String[] b;
        private final short[] c;
        private final AtomicReferenceArray<Object> d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.c = sArr;
        }

        public ZoneRules b(short s) throws Exception {
            Object objA = this.d.get(s);
            if (objA instanceof byte[]) {
                objA = org.threeten.bp.zone.a.a(new DataInputStream(new ByteArrayInputStream((byte[]) objA)));
                this.d.set(s, objA);
            }
            return (ZoneRules) objA;
        }

        public ZoneRules c(String str) {
            int iBinarySearch = Arrays.binarySearch(this.b, str);
            if (iBinarySearch < 0) {
                return null;
            }
            try {
                return b(this.c[iBinarySearch]);
            } catch (Exception e) {
                throw new ZoneRulesException("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.a, e);
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public TzdbZoneRulesProvider() {
        if (!d(ZoneRulesProvider.class.getClassLoader())) {
            throw new ZoneRulesException("No time-zone rules found for 'TZDB'");
        }
    }

    private boolean c(InputStream inputStream) throws IOException {
        boolean z = false;
        for (a aVar : f(inputStream)) {
            a aVarPutIfAbsent = this.d.putIfAbsent(aVar.a, aVar);
            if (aVarPutIfAbsent != null && !aVarPutIfAbsent.a.equals(aVar.a)) {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + aVar.a);
            }
            z = true;
        }
        return z;
    }

    private boolean d(ClassLoader classLoader) {
        URL url = null;
        try {
            Enumeration<URL> resources = classLoader.getResources("org/threeten/bp/TZDB.dat");
            boolean zE = false;
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    zE |= e(urlNextElement);
                    url = urlNextElement;
                } catch (Exception e) {
                    e = e;
                    url = urlNextElement;
                    throw new ZoneRulesException("Unable to load TZDB time-zone rules: " + url, e);
                }
            }
            return zE;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean e(URL url) throws ZoneRulesException, IOException, ClassNotFoundException {
        boolean zC = false;
        if (this.e.add(url.toExternalForm())) {
            InputStream inputStreamOpenStream = null;
            try {
                inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
                zC = false | c(inputStreamOpenStream);
            } finally {
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            }
        }
        return zC;
    }

    private Iterable<a> f(InputStream inputStream) throws IOException {
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

    @Override // org.threeten.bp.zone.ZoneRulesProvider
    public ZoneRules provideRules(String str, boolean z) {
        Jdk8Methods.requireNonNull(str, "zoneId");
        ZoneRules zoneRulesC = this.d.lastEntry().getValue().c(str);
        if (zoneRulesC != null) {
            return zoneRulesC;
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    @Override // org.threeten.bp.zone.ZoneRulesProvider
    public NavigableMap<String, ZoneRules> provideVersions(String str) {
        TreeMap treeMap = new TreeMap();
        for (a aVar : this.d.values()) {
            ZoneRules zoneRulesC = aVar.c(str);
            if (zoneRulesC != null) {
                treeMap.put(aVar.a, zoneRulesC);
            }
        }
        return treeMap;
    }

    @Override // org.threeten.bp.zone.ZoneRulesProvider
    public Set<String> provideZoneIds() {
        return new HashSet(this.c);
    }

    public String toString() {
        return "TZDB";
    }

    public TzdbZoneRulesProvider(URL url) {
        try {
            if (e(url)) {
                return;
            }
            throw new ZoneRulesException("No time-zone rules found: " + url);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules: " + url, e);
        }
    }

    public TzdbZoneRulesProvider(InputStream inputStream) {
        try {
            c(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }
}
