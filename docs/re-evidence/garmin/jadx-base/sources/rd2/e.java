package rd2;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.b0;
import androidx.room.l0;
import androidx.room.q0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f152040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f152041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f152042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f152043d;

    public class a extends androidx.room.h<sd2.e> {
        public a(e eVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.h
        public final void bind(vd.g gVar, sd2.e eVar) {
            sd2.e eVar2 = eVar;
            gVar.h(1, eVar2.f158646a);
            String str = eVar2.f158647b;
            if (str == null) {
                gVar.u(2);
            } else {
                gVar.r(2, str);
            }
            byte[] bArr = eVar2.f158648c;
            if (bArr == null) {
                gVar.u(3);
            } else {
                gVar.t(3, bArr);
            }
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `device_capabilities`(`unit_id`,`mac_address`,`capabilities`) VALUES (?,?,?)";
        }
    }

    public class b extends q0 {
        public b(e eVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "delete from device_capabilities";
        }
    }

    public class c extends q0 {
        public c(e eVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "delete from device_capabilities where unit_id = ?";
        }
    }

    public e(b0 b0Var) {
        this.f152040a = b0Var;
        this.f152041b = new a(this, b0Var);
        this.f152042c = new b(this, b0Var);
        this.f152043d = new c(this, b0Var);
    }

    public static sd2.e e(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("unit_id");
        int columnIndex2 = cursor.getColumnIndex("mac_address");
        int columnIndex3 = cursor.getColumnIndex("capabilities");
        sd2.e eVar = new sd2.e();
        if (columnIndex != -1) {
            eVar.f158646a = cursor.getLong(columnIndex);
        }
        if (columnIndex2 != -1) {
            eVar.f158647b = cursor.getString(columnIndex2);
        }
        if (columnIndex3 != -1) {
            eVar.f158648c = cursor.getBlob(columnIndex3);
        }
        return eVar;
    }

    @Override // rd2.d
    public final ArrayList a(long j8) {
        l0 l0VarE = l0.e(1, "select * from device_capabilities where unit_id = ?");
        l0VarE.h(1, j8);
        b0 b0Var = this.f152040a;
        b0Var.assertNotSuspendingTransaction();
        Cursor cursorQuery = b0Var.query(l0VarE, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(e(cursorQuery));
            }
            cursorQuery.close();
            l0VarE.release();
            return arrayList;
        } catch (Throwable th3) {
            cursorQuery.close();
            l0VarE.release();
            throw th3;
        }
    }

    @Override // rd2.d
    public final void b(long j8) {
        b0 b0Var = this.f152040a;
        b0Var.assertNotSuspendingTransaction();
        c cVar = this.f152043d;
        vd.g gVarAcquire = cVar.acquire();
        gVarAcquire.h(1, j8);
        b0Var.beginTransaction();
        try {
            gVarAcquire.b2();
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
            cVar.release(gVarAcquire);
        }
    }

    @Override // rd2.d
    public final long c(sd2.e eVar) {
        b0 b0Var = this.f152040a;
        b0Var.assertNotSuspendingTransaction();
        b0Var.beginTransaction();
        try {
            long jInsertAndReturnId = this.f152041b.insertAndReturnId(eVar);
            b0Var.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            b0Var.endTransaction();
        }
    }

    @Override // rd2.d
    public final ArrayList d() {
        l0 l0VarE = l0.e(0, "select * from device_capabilities");
        b0 b0Var = this.f152040a;
        b0Var.assertNotSuspendingTransaction();
        Cursor cursorQuery = b0Var.query(l0VarE, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(e(cursorQuery));
            }
            cursorQuery.close();
            l0VarE.release();
            return arrayList;
        } catch (Throwable th3) {
            cursorQuery.close();
            l0VarE.release();
            throw th3;
        }
    }

    @Override // rd2.d
    public final void deleteAll() {
        b0 b0Var = this.f152040a;
        b0Var.assertNotSuspendingTransaction();
        b bVar = this.f152042c;
        vd.g gVarAcquire = bVar.acquire();
        b0Var.beginTransaction();
        try {
            gVarAcquire.b2();
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
            bVar.release(gVarAcquire);
        }
    }
}
