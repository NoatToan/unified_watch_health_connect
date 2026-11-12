package defpackage;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.common.collect.ImmutableSet;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes4.dex */
public class k93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, j93> f23615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f23616b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public c e;
    public c f;

    public static final class a implements c {
        public static final String[] e = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final op5 f23617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<j93> f23618b = new SparseArray<>();
        public String c;
        public String d;

        public a(op5 op5Var) {
            this.f23617a = op5Var;
        }

        public static void j(op5 op5Var, String str) throws DatabaseIOException {
            try {
                String strN = n(str);
                SQLiteDatabase writableDatabase = op5Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    hpq.c(writableDatabase, 1, str);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        public static void l(SQLiteDatabase sQLiteDatabase, String str) {
            String strValueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
        }

        public static String n(String str) {
            String strValueOf = String.valueOf(str);
            return strValueOf.length() != 0 ? "ExoPlayerCacheIndex".concat(strValueOf) : new String("ExoPlayerCacheIndex");
        }

        @Override // k93.c
        public void a(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = n(hexString);
        }

        @Override // k93.c
        public void b(HashMap<String, j93> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f23617a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator<j93> it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f23618b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // k93.c
        public void c(j93 j93Var) {
            this.f23618b.put(j93Var.f22545a, j93Var);
        }

        @Override // k93.c
        public boolean d() throws DatabaseIOException {
            return hpq.b(this.f23617a.getReadableDatabase(), 1, (String) rk1.e(this.c)) != -1;
        }

        @Override // k93.c
        public void e(HashMap<String, j93> map) throws IOException {
            if (this.f23618b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f23617a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f23618b.size(); i++) {
                    try {
                        j93 j93VarValueAt = this.f23618b.valueAt(i);
                        if (j93VarValueAt == null) {
                            k(writableDatabase, this.f23618b.keyAt(i));
                        } else {
                            i(writableDatabase, j93VarValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f23618b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // k93.c
        public void f(j93 j93Var, boolean z) {
            if (z) {
                this.f23618b.delete(j93Var.f22545a);
            } else {
                this.f23618b.put(j93Var.f22545a, null);
            }
        }

        @Override // k93.c
        public void g(HashMap<String, j93> map, SparseArray<String> sparseArray) throws IOException {
            rk1.g(this.f23618b.size() == 0);
            try {
                if (hpq.b(this.f23617a.getReadableDatabase(), 1, (String) rk1.e(this.c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f23617a.getWritableDatabase();
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
                        j93 j93Var = new j93(cursorM.getInt(0), cursorM.getString(1), k93.q(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        map.put(j93Var.f22546b, j93Var);
                        sparseArray.put(j93Var.f22545a, j93Var.f22546b);
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
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e2);
            }
        }

        @Override // k93.c
        public void h() throws DatabaseIOException {
            j(this.f23617a, (String) rk1.e(this.c));
        }

        public final void i(SQLiteDatabase sQLiteDatabase, j93 j93Var) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k93.t(j93Var.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(j93Var.f22545a));
            contentValues.put("key", j93Var.f22546b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) rk1.e(this.d), null, contentValues);
        }

        public final void k(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) rk1.e(this.d), "id = ?", new String[]{Integer.toString(i)});
        }

        public final Cursor m() {
            return this.f23617a.getReadableDatabase().query((String) rk1.e(this.d), e, null, null, null, null, null);
        }

        public final void o(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            hpq.d(sQLiteDatabase, 1, (String) rk1.e(this.c), 1);
            l(sQLiteDatabase, (String) rk1.e(this.d));
            String str = this.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("CREATE TABLE ");
            sb.append(str);
            sb.append(" ");
            sb.append("(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
            sQLiteDatabase.execSQL(sb.toString());
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f23620b;
        public final SecretKeySpec c;
        public final SecureRandom d;
        public final bm1 e;
        public boolean f;
        public utk g;

        public b(File file, byte[] bArr, boolean z) {
            Cipher cipherI;
            SecretKeySpec secretKeySpec;
            rk1.g((bArr == null && z) ? false : true);
            if (bArr != null) {
                rk1.a(bArr.length == 16);
                try {
                    cipherI = k93.i();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                rk1.a(!z);
                cipherI = null;
                secretKeySpec = null;
            }
            this.f23619a = z;
            this.f23620b = cipherI;
            this.c = secretKeySpec;
            this.d = z ? new SecureRandom() : null;
            this.e = new bm1(file);
        }

        @Override // k93.c
        public void a(long j) {
        }

        @Override // k93.c
        public void b(HashMap<String, j93> map) throws Throwable {
            m(map);
            this.f = false;
        }

        @Override // k93.c
        public void c(j93 j93Var) {
            this.f = true;
        }

        @Override // k93.c
        public boolean d() {
            return this.e.c();
        }

        @Override // k93.c
        public void e(HashMap<String, j93> map) throws Throwable {
            if (this.f) {
                b(map);
            }
        }

        @Override // k93.c
        public void f(j93 j93Var, boolean z) {
            this.f = true;
        }

        @Override // k93.c
        public void g(HashMap<String, j93> map, SparseArray<String> sparseArray) {
            rk1.g(!this.f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.e.a();
        }

        @Override // k93.c
        public void h() {
            this.e.a();
        }

        public final int i(j93 j93Var, int i) {
            int i2;
            int iHashCode;
            int iHashCode2 = (j93Var.f22545a * 31) + j93Var.f22546b.hashCode();
            if (i < 2) {
                long jD = di4.d(j93Var.c());
                i2 = iHashCode2 * 31;
                iHashCode = (int) (jD ^ (jD >>> 32));
            } else {
                i2 = iHashCode2 * 31;
                iHashCode = j93Var.c().hashCode();
            }
            return i2 + iHashCode;
        }

        public final j93 j(int i, DataInputStream dataInputStream) throws IOException {
            eu5 eu5VarQ;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                ei4 ei4Var = new ei4();
                ei4.g(ei4Var, j);
                eu5VarQ = eu5.c.g(ei4Var);
            } else {
                eu5VarQ = k93.q(dataInputStream);
            }
            return new j93(i2, utf, eu5VarQ);
        }

        public final boolean k(HashMap<String, j93> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream2.readInt();
                    if (i >= 0 && i <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f23620b == null) {
                                wlq.o(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f23620b.init(2, (Key) wlq.j(this.c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f23620b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f23619a) {
                            this.f = true;
                        }
                        int i2 = dataInputStream2.readInt();
                        int i3 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            j93 j93VarJ = j(i, dataInputStream2);
                            map.put(j93VarJ.f22546b, j93VarJ);
                            sparseArray.put(j93VarJ.f22545a, j93VarJ.f22546b);
                            i3 += i(j93VarJ, i);
                        }
                        int i5 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i5 == i3 && z) {
                            wlq.o(dataInputStream2);
                            return true;
                        }
                        wlq.o(dataInputStream2);
                        return false;
                    }
                    wlq.o(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        wlq.o(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        wlq.o(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void l(j93 j93Var, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(j93Var.f22545a);
            dataOutputStream.writeUTF(j93Var.f22546b);
            k93.t(j93Var.c(), dataOutputStream);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void m(HashMap<String, j93> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamF = this.e.f();
                utk utkVar = this.g;
                if (utkVar == null) {
                    this.g = new utk(outputStreamF);
                } else {
                    utkVar.a(outputStreamF);
                }
                utk utkVar2 = this.g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(utkVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int i = 0;
                    dataOutputStream2.writeInt(this.f23619a ? 1 : 0);
                    if (this.f23619a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) wlq.j(this.d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) wlq.j(this.f23620b)).init(1, (Key) wlq.j(this.c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(utkVar2, this.f23620b));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (j93 j93Var : map.values()) {
                        l(j93Var, dataOutputStream2);
                        i += i(j93Var, 2);
                    }
                    dataOutputStream2.writeInt(i);
                    this.e.b(dataOutputStream2);
                    wlq.o(null);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    wlq.o(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public interface c {
        void a(long j);

        void b(HashMap<String, j93> map) throws IOException;

        void c(j93 j93Var);

        boolean d() throws IOException;

        void e(HashMap<String, j93> map) throws IOException;

        void f(j93 j93Var, boolean z);

        void g(HashMap<String, j93> map, SparseArray<String> sparseArray) throws IOException;

        void h() throws IOException;
    }

    public k93(op5 op5Var, File file, byte[] bArr, boolean z, boolean z2) {
        rk1.g((op5Var == null && file == null) ? false : true);
        this.f23615a = new HashMap<>();
        this.f23616b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        a aVar = op5Var != null ? new a(op5Var) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (aVar == null || (bVar != null && z2)) {
            this.e = (c) wlq.j(bVar);
            this.f = aVar;
        } else {
            this.e = aVar;
            this.f = bVar;
        }
    }

    @SuppressLint({"GetInstance"})
    public static Cipher i() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (wlq.f38110a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", BouncyCastleProvider.PROVIDER_NAME);
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    @VisibleForTesting
    public static int l(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static boolean o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public static eu5 q(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid value size: ");
                sb.append(i3);
                throw new IOException(sb.toString());
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = wlq.f;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new eu5(map);
    }

    public static void t(eu5 eu5Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setH = eu5Var.h();
        dataOutputStream.writeInt(setH.size());
        for (Map.Entry<String, byte[]> entry : setH) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final j93 d(String str) {
        int iL = l(this.f23616b);
        j93 j93Var = new j93(iL, str);
        this.f23615a.put(str, j93Var);
        this.f23616b.put(iL, str);
        this.d.put(iL, true);
        this.e.c(j93Var);
        return j93Var;
    }

    public void e(String str, ei4 ei4Var) {
        j93 j93VarM = m(str);
        if (j93VarM.b(ei4Var)) {
            this.e.c(j93VarM);
        }
    }

    public int f(String str) {
        return m(str).f22545a;
    }

    public j93 g(String str) {
        return this.f23615a.get(str);
    }

    public Collection<j93> h() {
        return Collections.unmodifiableCollection(this.f23615a.values());
    }

    public di4 j(String str) {
        j93 j93VarG = g(str);
        return j93VarG != null ? j93VarG.c() : eu5.c;
    }

    public String k(int i) {
        return this.f23616b.get(i);
    }

    public j93 m(String str) {
        j93 j93Var = this.f23615a.get(str);
        return j93Var == null ? d(str) : j93Var;
    }

    public void n(long j) throws IOException {
        c cVar;
        this.e.a(j);
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.a(j);
        }
        if (this.e.d() || (cVar = this.f) == null || !cVar.d()) {
            this.e.g(this.f23615a, this.f23616b);
        } else {
            this.f.g(this.f23615a, this.f23616b);
            this.e.b(this.f23615a);
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.h();
            this.f = null;
        }
    }

    public void p(String str) {
        j93 j93Var = this.f23615a.get(str);
        if (j93Var != null && j93Var.f() && j93Var.h()) {
            this.f23615a.remove(str);
            int i = j93Var.f22545a;
            boolean z = this.d.get(i);
            this.e.f(j93Var, z);
            if (z) {
                this.f23616b.remove(i);
                this.d.delete(i);
            } else {
                this.f23616b.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r() {
        uaq it = ImmutableSet.copyOf((Collection) this.f23615a.keySet()).iterator();
        while (it.hasNext()) {
            p((String) it.next());
        }
    }

    public void s() throws IOException {
        this.e.e(this.f23615a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.f23616b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }
}
