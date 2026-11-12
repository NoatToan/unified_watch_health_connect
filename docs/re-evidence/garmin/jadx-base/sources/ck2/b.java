package ck2;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.b0;
import androidx.room.h;
import androidx.room.l0;
import androidx.room.q0;
import java.util.ArrayList;
import vd.g;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ck2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f27909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f27910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0425b f27911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f27912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f27913e;

    public class a extends h<ck2.c> {
        public a(b bVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.h
        public final void bind(g gVar, ck2.c cVar) {
            ck2.c cVar2 = cVar;
            gVar.h(1, cVar2.f27914a);
            gVar.h(2, cVar2.f27915b);
            gVar.h(3, cVar2.f27916c);
            gVar.r(4, cVar2.f27917d);
            gVar.r(5, cVar2.f27918e);
            gVar.r(6, cVar2.f27919f);
            gVar.h(7, cVar2.f27920g);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `device_messages` (`device_id`,`posted`,`expiration`,`event_id`,`app_id`,`payload`,`delivery_attempts`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: ck2.b$b, reason: collision with other inner class name */
    public class C0425b extends androidx.room.f<ck2.c> {
        public C0425b(b bVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.f
        public final void bind(g gVar, ck2.c cVar) {
            ck2.c cVar2 = cVar;
            gVar.h(1, cVar2.f27914a);
            gVar.h(2, cVar2.f27915b);
            gVar.h(3, cVar2.f27916c);
            String str = cVar2.f27917d;
            gVar.r(4, str);
            gVar.r(5, cVar2.f27918e);
            gVar.r(6, cVar2.f27919f);
            gVar.h(7, cVar2.f27920g);
            gVar.h(8, cVar2.f27914a);
            gVar.r(9, str);
        }

        @Override // androidx.room.f, androidx.room.q0
        public final String createQuery() {
            return "UPDATE OR ABORT `device_messages` SET `device_id` = ?,`posted` = ?,`expiration` = ?,`event_id` = ?,`app_id` = ?,`payload` = ?,`delivery_attempts` = ? WHERE `device_id` = ? AND `event_id` = ?";
        }
    }

    public class c extends q0 {
        public c(b bVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "delete from device_messages where device_Id = ? and event_id = ?";
        }
    }

    public class d extends q0 {
        public d(b bVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "delete from device_messages where device_id = ? and (expiration < ? or posted <= ? or delivery_attempts >= 3)";
        }
    }

    public class e extends q0 {
        public e(b bVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "delete from device_messages where device_id = ? and expiration < ?";
        }
    }

    public class f extends q0 {
        public f(b bVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "delete from device_messages where device_id = ? and posted <= ?";
        }
    }

    public b(b0 b0Var) {
        this.f27909a = b0Var;
        this.f27910b = new a(this, b0Var);
        this.f27911c = new C0425b(this, b0Var);
        this.f27912d = new c(this, b0Var);
        this.f27913e = new d(this, b0Var);
        new e(this, b0Var);
        new f(this, b0Var);
    }

    @Override // ck2.a
    public final void a(ck2.c cVar) {
        b0 b0Var = this.f27909a;
        b0Var.assertNotSuspendingTransaction();
        b0Var.beginTransaction();
        try {
            this.f27911c.handle(cVar);
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
        }
    }

    @Override // ck2.a
    public final ArrayList b(long j8) {
        l0 l0VarE = l0.e(1, "select * from device_messages where device_id = ? order by posted, event_id");
        l0VarE.h(1, j8);
        b0 b0Var = this.f27909a;
        b0Var.assertNotSuspendingTransaction();
        Cursor cursorQuery = b0Var.query(l0VarE, (CancellationSignal) null);
        try {
            int iA = md.a.a(cursorQuery, "device_id");
            int iA2 = md.a.a(cursorQuery, "posted");
            int iA3 = md.a.a(cursorQuery, "expiration");
            int iA4 = md.a.a(cursorQuery, "event_id");
            int iA5 = md.a.a(cursorQuery, "app_id");
            int iA6 = md.a.a(cursorQuery, "payload");
            int iA7 = md.a.a(cursorQuery, "delivery_attempts");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                ck2.c cVar = new ck2.c(cursorQuery.getLong(iA), cursorQuery.getLong(iA2), cursorQuery.getLong(iA3), cursorQuery.isNull(iA4) ? null : cursorQuery.getString(iA4), cursorQuery.isNull(iA5) ? null : cursorQuery.getString(iA5), cursorQuery.isNull(iA6) ? null : cursorQuery.getString(iA6));
                cVar.f27920g = cursorQuery.getInt(iA7);
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            l0VarE.release();
        }
    }

    @Override // ck2.a
    public final void c(long j8, String str) {
        b0 b0Var = this.f27909a;
        b0Var.assertNotSuspendingTransaction();
        c cVar = this.f27912d;
        g gVarAcquire = cVar.acquire();
        gVarAcquire.h(1, j8);
        if (str == null) {
            gVarAcquire.u(2);
        } else {
            gVarAcquire.r(2, str);
        }
        b0Var.beginTransaction();
        try {
            gVarAcquire.b2();
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
            cVar.release(gVarAcquire);
        }
    }

    @Override // ck2.a
    public final void d(ck2.c cVar) {
        b0 b0Var = this.f27909a;
        b0Var.assertNotSuspendingTransaction();
        b0Var.beginTransaction();
        try {
            this.f27910b.insert(cVar);
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
        }
    }

    @Override // ck2.a
    public final void e(long j8, long j14, long j15) {
        b0 b0Var = this.f27909a;
        b0Var.assertNotSuspendingTransaction();
        d dVar = this.f27913e;
        g gVarAcquire = dVar.acquire();
        gVarAcquire.h(1, j8);
        gVarAcquire.h(2, j14);
        gVarAcquire.h(3, j15);
        b0Var.beginTransaction();
        try {
            gVarAcquire.b2();
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
            dVar.release(gVarAcquire);
        }
    }
}
