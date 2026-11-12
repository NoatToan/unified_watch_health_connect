package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class TokenContents {

    @NonNull
    private final byte[] mContents;

    @Nullable
    private List<byte[]> mFingerprints;

    @Nullable
    private String mPackageName;

    private TokenContents(@NonNull byte[] contents) {
        this.mContents = contents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static int compareByteArrays(byte[] r4, byte[] r5) {
        /*
            r0 = 0
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r4 != 0) goto L8
            r4 = -1
            return r4
        L8:
            if (r5 != 0) goto Lc
            r4 = 1
            return r4
        Lc:
            r1 = 0
        Ld:
            int r2 = r4.length
            int r3 = r5.length
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 >= r2) goto L24
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L21
            r4 = r4[r1]
            r5 = r5[r1]
        L1f:
            int r4 = r4 - r5
            return r4
        L21:
            int r1 = r1 + 1
            goto Ld
        L24:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L2b
            int r4 = r4.length
            int r5 = r5.length
            goto L1f
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.browser.trusted.TokenContents.compareByteArrays(byte[], byte[]):int");
    }

    @NonNull
    public static TokenContents create(String packageName, List<byte[]> fingerprints) throws IOException {
        return new TokenContents(createToken(packageName, fingerprints), packageName, fingerprints);
    }

    @NonNull
    private static byte[] createToken(@NonNull String packageName, @NonNull List<byte[]> fingerprints) throws IOException {
        Collections.sort(fingerprints, new Comparator() { // from class: androidx.browser.trusted.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(packageName);
        dataOutputStream.writeInt(fingerprints.size());
        for (byte[] bArr : fingerprints) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    public static TokenContents deserialize(@NonNull byte[] serialized) {
        return new TokenContents(serialized);
    }

    private void parseIfNeeded() throws IOException {
        if (this.mPackageName != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.mContents));
        this.mPackageName = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        this.mFingerprints = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInputStream.readInt();
            byte[] bArr = new byte[i3];
            if (dataInputStream.read(bArr) != i3) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.mFingerprints.add(bArr);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || TokenContents.class != o.getClass()) {
            return false;
        }
        return Arrays.equals(this.mContents, ((TokenContents) o).mContents);
    }

    @NonNull
    public byte[] getFingerprint(int i) throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list != null) {
            return Arrays.copyOf(list.get(i), this.mFingerprints.get(i).length);
        }
        throw new IllegalStateException();
    }

    public int getFingerprintCount() throws IOException {
        parseIfNeeded();
        List<byte[]> list = this.mFingerprints;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @NonNull
    public String getPackageName() throws IOException {
        parseIfNeeded();
        String str = this.mPackageName;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.mContents);
    }

    @NonNull
    public byte[] serialize() {
        byte[] bArr = this.mContents;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private TokenContents(@NonNull byte[] contents, @NonNull String packageName, @NonNull List<byte[]> fingerprints) {
        this.mContents = contents;
        this.mPackageName = packageName;
        this.mFingerprints = new ArrayList(fingerprints.size());
        for (byte[] bArr : fingerprints) {
            this.mFingerprints.add(Arrays.copyOf(bArr, bArr.length));
        }
    }
}
