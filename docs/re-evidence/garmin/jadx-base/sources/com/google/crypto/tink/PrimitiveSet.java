package com.google.crypto.tink;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveSet<P> {
    private Entry<P> primary;
    private final Class<P> primitiveClass;
    private final ConcurrentMap<Prefix, List<Entry<P>>> primitives = new ConcurrentHashMap();

    public static final class Entry<P> {
        private final byte[] identifier;
        private final int keyId;
        private final OutputPrefixType outputPrefixType;
        private final P primitive;
        private final KeyStatusType status;

        public Entry(P p14, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i14) {
            this.primitive = p14;
            this.identifier = Arrays.copyOf(bArr, bArr.length);
            this.status = keyStatusType;
            this.outputPrefixType = outputPrefixType;
            this.keyId = i14;
        }

        public final byte[] getIdentifier() {
            byte[] bArr = this.identifier;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public int getKeyId() {
            return this.keyId;
        }

        public OutputPrefixType getOutputPrefixType() {
            return this.outputPrefixType;
        }

        public P getPrimitive() {
            return this.primitive;
        }

        public KeyStatusType getStatus() {
            return this.status;
        }
    }

    public static class Prefix implements Comparable<Prefix> {
        private final byte[] prefix;

        private Prefix(byte[] bArr) {
            this.prefix = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public int compareTo(Prefix prefix) {
            byte[] bArr = this.prefix;
            int length = bArr.length;
            byte[] bArr2 = prefix.prefix;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i14 = 0;
            while (true) {
                byte[] bArr3 = this.prefix;
                if (i14 >= bArr3.length) {
                    return 0;
                }
                byte b14 = bArr3[i14];
                byte b15 = prefix.prefix[i14];
                if (b14 != b15) {
                    return b14 - b15;
                }
                i14++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Prefix) {
                return Arrays.equals(this.prefix, ((Prefix) obj).prefix);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.prefix);
        }

        public String toString() {
            return Hex.encode(this.prefix);
        }
    }

    private PrimitiveSet(Class<P> cls) {
        this.primitiveClass = cls;
    }

    public static <P> PrimitiveSet<P> newPrimitiveSet(Class<P> cls) {
        return new PrimitiveSet<>(cls);
    }

    public Entry<P> addPrimitive(P p14, Keyset.Key key) throws GeneralSecurityException {
        if (key.getStatus() != KeyStatusType.ENABLED) {
            a.t("only ENABLED key is allowed");
            return null;
        }
        Entry<P> entry = new Entry<>(p14, CryptoFormat.getOutputPrefix(key), key.getStatus(), key.getOutputPrefixType(), key.getKeyId());
        ArrayList arrayList = new ArrayList();
        arrayList.add(entry);
        Prefix prefix = new Prefix(entry.getIdentifier());
        List<Entry<P>> listPut = this.primitives.put(prefix, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(entry);
            this.primitives.put(prefix, Collections.unmodifiableList(arrayList2));
        }
        return entry;
    }

    public Collection<List<Entry<P>>> getAll() {
        return this.primitives.values();
    }

    public Entry<P> getPrimary() {
        return this.primary;
    }

    public List<Entry<P>> getPrimitive(byte[] bArr) {
        List<Entry<P>> list = this.primitives.get(new Prefix(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class<P> getPrimitiveClass() {
        return this.primitiveClass;
    }

    public List<Entry<P>> getRawPrimitives() {
        return getPrimitive(CryptoFormat.RAW_PREFIX);
    }

    public void setPrimary(Entry<P> entry) {
        if (entry == null) {
            h.s("the primary entry must be non-null");
            return;
        }
        if (entry.getStatus() != KeyStatusType.ENABLED) {
            h.s("the primary entry has to be ENABLED");
        } else if (getPrimitive(entry.getIdentifier()).isEmpty()) {
            h.s("the primary entry cannot be set to an entry which is not held by this primitive set");
        } else {
            this.primary = entry;
        }
    }

    public List<Entry<P>> getPrimitive(Keyset.Key key) {
        return getPrimitive(CryptoFormat.getOutputPrefix(key));
    }
}
