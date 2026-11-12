package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
class d {
    public static final String g = "cached_content_index.exi";
    private static final int h = 10485760;
    private final HashMap<String, com.google.android.exoplayer2.upstream.cache.c> a;
    private final SparseArray<String> b;
    private final SparseBooleanArray c;
    private final SparseBooleanArray d;
    private c e;

    @Nullable
    private c f;

    public static final class a implements c {
        private static final String e = "ExoPlayerCacheIndex";
        private static final int f = 1;
        private static final String g = "id";
        private static final String h = "key";
        private static final String i = "metadata";
        private static final int j = 0;
        private static final int k = 1;
        private static final int l = 2;
        private static final String m = "id = ?";
        private static final String[] n = {"id", "key", "metadata"};
        private static final String o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private final DatabaseProvider a;
        private final SparseArray<com.google.android.exoplayer2.upstream.cache.c> b = new SparseArray<>();
        private String c;
        private String d;

        public a(DatabaseProvider databaseProvider) {
            this.a = databaseProvider;
        }

        private void h(SQLiteDatabase writableDatabase, com.google.android.exoplayer2.upstream.cache.c cachedContent) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            d.v(cachedContent.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cachedContent.a));
            contentValues.put("key", cachedContent.b);
            contentValues.put("metadata", byteArray);
            writableDatabase.replaceOrThrow((String) Assertions.checkNotNull(this.d), null, contentValues);
        }

        public static void i(DatabaseProvider databaseProvider, long uid) throws DatabaseIOException {
            j(databaseProvider, Long.toHexString(uid));
        }

        private static void j(DatabaseProvider databaseProvider, String hexUid) throws DatabaseIOException {
            try {
                String strN = n(hexUid);
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.removeVersion(writableDatabase, 1, hexUid);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        private void k(SQLiteDatabase writableDatabase, int key) {
            writableDatabase.delete((String) Assertions.checkNotNull(this.d), m, new String[]{Integer.toString(key)});
        }

        private static void l(SQLiteDatabase writableDatabase, String tableName) {
            String strValueOf = String.valueOf(tableName);
            writableDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
        }

        private Cursor m() {
            return this.a.getReadableDatabase().query((String) Assertions.checkNotNull(this.d), n, null, null, null, null, null);
        }

        private static String n(String hexUid) {
            String strValueOf = String.valueOf(hexUid);
            return strValueOf.length() != 0 ? e.concat(strValueOf) : new String(e);
        }

        private void o(SQLiteDatabase writableDatabase) throws DatabaseIOException {
            VersionTable.setVersion(writableDatabase, 1, (String) Assertions.checkNotNull(this.c), 1);
            l(writableDatabase, (String) Assertions.checkNotNull(this.d));
            String str = this.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("CREATE TABLE ");
            sb.append(str);
            sb.append(" ");
            sb.append(o);
            writableDatabase.execSQL(sb.toString());
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void a(long uid) {
            String hexString = Long.toHexString(uid);
            this.c = hexString;
            this.d = n(hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void b(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator<com.google.android.exoplayer2.upstream.cache.c> it2 = content.values().iterator();
                    while (it2.hasNext()) {
                        h(writableDatabase, it2.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void c(com.google.android.exoplayer2.upstream.cache.c cachedContent, boolean neverStored) {
            if (neverStored) {
                this.b.delete(cachedContent.a);
            } else {
                this.b.put(cachedContent.a, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public boolean d() throws DatabaseIOException {
            return VersionTable.getVersion(this.a.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.c)) != -1;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void delete() throws DatabaseIOException {
            j(this.a, (String) Assertions.checkNotNull(this.c));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void e(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws IOException {
            if (this.b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < this.b.size(); i2++) {
                    try {
                        com.google.android.exoplayer2.upstream.cache.c cVarValueAt = this.b.valueAt(i2);
                        if (cVarValueAt == null) {
                            k(writableDatabase, this.b.keyAt(i2));
                        } else {
                            h(writableDatabase, cVarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void f(com.google.android.exoplayer2.upstream.cache.c cachedContent) {
            this.b.put(cachedContent.a, cachedContent);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void g(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content, SparseArray<String> idToKey) throws IOException {
            Assertions.checkState(this.b.size() == 0);
            try {
                if (VersionTable.getVersion(this.a.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.c)) != 1) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorM = m();
                while (cursorM.moveToNext()) {
                    try {
                        com.google.android.exoplayer2.upstream.cache.c cVar = new com.google.android.exoplayer2.upstream.cache.c(cursorM.getInt(0), (String) Assertions.checkNotNull(cursorM.getString(1)), d.s(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        content.put(cVar.b, cVar);
                        idToKey.put(cVar.a, cVar.b);
                    } catch (Throwable th2) {
                        if (cursorM != null) {
                            try {
                                cursorM.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                cursorM.close();
            } catch (SQLiteException e2) {
                content.clear();
                idToKey.clear();
                throw new DatabaseIOException(e2);
            }
        }
    }

    public static class b implements c {
        private static final int h = 2;
        private static final int i = 2;
        private static final int j = 1;
        private final boolean a;

        @Nullable
        private final Cipher b;

        @Nullable
        private final SecretKeySpec c;

        @Nullable
        private final SecureRandom d;
        private final AtomicFile e;
        private boolean f;

        @Nullable
        private ReusableBufferedOutputStream g;

        public b(File file, @Nullable byte[] secretKey, boolean encrypt) {
            Cipher cipherJ;
            SecretKeySpec secretKeySpec;
            Assertions.checkState((secretKey == null && encrypt) ? false : true);
            if (secretKey != null) {
                Assertions.checkArgument(secretKey.length == 16);
                try {
                    cipherJ = d.j();
                    secretKeySpec = new SecretKeySpec(secretKey, com.huami.network.hmnetwork.utils.a.a);
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                Assertions.checkArgument(!encrypt);
                cipherJ = null;
                secretKeySpec = null;
            }
            this.a = encrypt;
            this.b = cipherJ;
            this.c = secretKeySpec;
            this.d = encrypt ? new SecureRandom() : null;
            this.e = new AtomicFile(file);
        }

        private int h(com.google.android.exoplayer2.upstream.cache.c cachedContent, int version) {
            int iHashCode = (cachedContent.a * 31) + cachedContent.b.hashCode();
            if (version >= 2) {
                return (iHashCode * 31) + cachedContent.d().hashCode();
            }
            long jA = e.a(cachedContent.d());
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }

        private com.google.android.exoplayer2.upstream.cache.c i(int version, DataInputStream input) throws IOException {
            DefaultContentMetadata defaultContentMetadataS;
            int i2 = input.readInt();
            String utf = input.readUTF();
            if (version < 2) {
                long j2 = input.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                ContentMetadataMutations.setContentLength(contentMetadataMutations, j2);
                defaultContentMetadataS = DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            } else {
                defaultContentMetadataS = d.s(input);
            }
            return new com.google.android.exoplayer2.upstream.cache.c(i2, utf, defaultContentMetadataS);
        }

        private boolean j(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content, SparseArray<String> idToKey) throws Throwable {
            if (!this.e.exists()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.e.openRead());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i2 = dataInputStream2.readInt();
                    if (i2 >= 0 && i2 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.b == null) {
                                Util.closeQuietly(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.b.init(2, (Key) Util.castNonNull(this.c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.a) {
                            this.f = true;
                        }
                        int i3 = dataInputStream2.readInt();
                        int iH = 0;
                        for (int i4 = 0; i4 < i3; i4++) {
                            com.google.android.exoplayer2.upstream.cache.c cVarI = i(i2, dataInputStream2);
                            content.put(cVarI.b, cVarI);
                            idToKey.put(cVarI.a, cVarI.b);
                            iH += h(cVarI, i2);
                        }
                        int i5 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i5 == iH && z) {
                            Util.closeQuietly(dataInputStream2);
                            return true;
                        }
                        Util.closeQuietly(dataInputStream2);
                        return false;
                    }
                    Util.closeQuietly(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        Util.closeQuietly(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        Util.closeQuietly(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private void k(com.google.android.exoplayer2.upstream.cache.c cachedContent, DataOutputStream output) throws IOException {
            output.writeInt(cachedContent.a);
            output.writeUTF(cachedContent.b);
            d.v(cachedContent.d(), output);
        }

        private void l(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamStartWrite = this.e.startWrite();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.g;
                if (reusableBufferedOutputStream == null) {
                    this.g = new ReusableBufferedOutputStream(outputStreamStartWrite);
                } else {
                    reusableBufferedOutputStream.reset(outputStreamStartWrite);
                }
                ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(reusableBufferedOutputStream2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iH = 0;
                    dataOutputStream2.writeInt(this.a ? 1 : 0);
                    if (this.a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) Util.castNonNull(this.d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) Util.castNonNull(this.b)).init(1, (Key) Util.castNonNull(this.c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(reusableBufferedOutputStream2, this.b));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(content.size());
                    for (com.google.android.exoplayer2.upstream.cache.c cVar : content.values()) {
                        k(cVar, dataOutputStream2);
                        iH += h(cVar, 2);
                    }
                    dataOutputStream2.writeInt(iH);
                    this.e.endWrite(dataOutputStream2);
                    Util.closeQuietly((Closeable) null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    Util.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void a(long uid) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void b(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws Throwable {
            l(content);
            this.f = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void c(com.google.android.exoplayer2.upstream.cache.c cachedContent, boolean neverStored) {
            this.f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public boolean d() {
            return this.e.exists();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void delete() {
            this.e.delete();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void e(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws Throwable {
            if (this.f) {
                b(content);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void f(com.google.android.exoplayer2.upstream.cache.c cachedContent) {
            this.f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.d.c
        public void g(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content, SparseArray<String> idToKey) {
            Assertions.checkState(!this.f);
            if (j(content, idToKey)) {
                return;
            }
            content.clear();
            idToKey.clear();
            this.e.delete();
        }
    }

    public interface c {
        void a(long uid);

        void b(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws IOException;

        void c(com.google.android.exoplayer2.upstream.cache.c cachedContent, boolean neverStored);

        boolean d() throws IOException;

        void delete() throws IOException;

        void e(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content) throws IOException;

        void f(com.google.android.exoplayer2.upstream.cache.c cachedContent);

        void g(HashMap<String, com.google.android.exoplayer2.upstream.cache.c> content, SparseArray<String> idToKey) throws IOException;
    }

    public d(DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }

    private com.google.android.exoplayer2.upstream.cache.c d(String key) {
        int iN = n(this.b);
        com.google.android.exoplayer2.upstream.cache.c cVar = new com.google.android.exoplayer2.upstream.cache.c(iN, key);
        this.a.put(key, cVar);
        this.b.put(iN, key);
        this.d.put(iN, true);
        this.e.f(cVar);
        return cVar;
    }

    @WorkerThread
    public static void g(DatabaseProvider databaseProvider, long uid) throws DatabaseIOException {
        a.i(databaseProvider, uid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"GetInstance"})
    public static Cipher j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (Util.SDK_INT == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    @VisibleForTesting
    public static int n(SparseArray<String> idToKey) {
        int size = idToKey.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : idToKey.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == idToKey.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static boolean q(String fileName) {
        return fileName.startsWith(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DefaultContentMetadata s(DataInputStream input) throws IOException {
        int i = input.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = input.readUTF();
            int i3 = input.readInt();
            if (i3 < 0) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid value size: ");
                sb.append(i3);
                throw new IOException(sb.toString());
            }
            int iMin = Math.min(i3, h);
            byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                input.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, h);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new DefaultContentMetadata(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(DefaultContentMetadata metadata, DataOutputStream output) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = metadata.entrySet();
        output.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            output.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            output.writeInt(value.length);
            output.write(value);
        }
    }

    public void e(String key, ContentMetadataMutations mutations) {
        com.google.android.exoplayer2.upstream.cache.c cVarO = o(key);
        if (cVarO.b(mutations)) {
            this.e.f(cVarO);
        }
    }

    public int f(String key) {
        return o(key).a;
    }

    @Nullable
    public com.google.android.exoplayer2.upstream.cache.c h(String key) {
        return this.a.get(key);
    }

    public Collection<com.google.android.exoplayer2.upstream.cache.c> i() {
        return Collections.unmodifiableCollection(this.a.values());
    }

    public ContentMetadata k(String key) {
        com.google.android.exoplayer2.upstream.cache.c cVarH = h(key);
        return cVarH != null ? cVarH.d() : DefaultContentMetadata.EMPTY;
    }

    @Nullable
    public String l(int id) {
        return this.b.get(id);
    }

    public Set<String> m() {
        return this.a.keySet();
    }

    public com.google.android.exoplayer2.upstream.cache.c o(String key) {
        com.google.android.exoplayer2.upstream.cache.c cVar = this.a.get(key);
        return cVar == null ? d(key) : cVar;
    }

    @WorkerThread
    public void p(long uid) throws IOException {
        c cVar;
        this.e.a(uid);
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.a(uid);
        }
        if (this.e.d() || (cVar = this.f) == null || !cVar.d()) {
            this.e.g(this.a, this.b);
        } else {
            this.f.g(this.a, this.b);
            this.e.b(this.a);
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.delete();
            this.f = null;
        }
    }

    public void r(String key) {
        com.google.android.exoplayer2.upstream.cache.c cVar = this.a.get(key);
        if (cVar != null && cVar.g() && cVar.i()) {
            this.a.remove(key);
            int i = cVar.a;
            boolean z = this.d.get(i);
            this.e.c(cVar, z);
            if (z) {
                this.b.remove(i);
                this.d.delete(i);
            } else {
                this.b.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        UnmodifiableIterator it2 = ImmutableSet.copyOf((Collection) this.a.keySet()).iterator();
        while (it2.hasNext()) {
            r((String) it2.next());
        }
    }

    @WorkerThread
    public void u() throws IOException {
        this.e.e(this.a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }

    public d(@Nullable DatabaseProvider databaseProvider, @Nullable File legacyStorageDir, @Nullable byte[] legacyStorageSecretKey, boolean legacyStorageEncrypt, boolean preferLegacyStorage) {
        Assertions.checkState((databaseProvider == null && legacyStorageDir == null) ? false : true);
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        a aVar = databaseProvider != null ? new a(databaseProvider) : null;
        b bVar = legacyStorageDir != null ? new b(new File(legacyStorageDir, g), legacyStorageSecretKey, legacyStorageEncrypt) : null;
        if (aVar == null || (bVar != null && preferLegacyStorage)) {
            this.e = (c) Util.castNonNull(bVar);
            this.f = aVar;
        } else {
            this.e = aVar;
            this.f = bVar;
        }
    }
}
