package rd2;

import android.database.Cursor;
import androidx.room.b0;
import androidx.room.q0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements rd2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f152036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f152037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f152038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2861c f152039d;

    public class a extends androidx.room.h<sd2.c> {
        public a(c cVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.h
        public final void bind(vd.g gVar, sd2.c cVar) {
            sd2.c cVar2 = cVar;
            gVar.h(1, cVar2.f158641a);
            String str = cVar2.f158642b;
            if (str == null) {
                gVar.u(2);
            } else {
                gVar.r(2, str);
            }
            gVar.h(3, cVar2.f158643c);
            gVar.h(4, cVar2.f158644d ? 1L : 0L);
            gVar.h(5, cVar2.f158645e);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `canned_text_reply`(`deviceUnitId`,`replyText`,`replyType`,`isOnDevice`,`replySortOrder`) VALUES (?,?,?,?,?)";
        }
    }

    public class b extends q0 {
        public b(c cVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "DELETE FROM canned_text_reply WHERE deviceUnitId = ?";
        }
    }

    /* JADX INFO: renamed from: rd2.c$c, reason: collision with other inner class name */
    public class C2861c extends q0 {
        public C2861c(c cVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "DELETE FROM canned_text_reply WHERE deviceUnitId = ? AND replyType = ?";
        }
    }

    public class d extends q0 {
        public d(c cVar, b0 b0Var) {
            super(b0Var);
        }

        @Override // androidx.room.q0
        public final String createQuery() {
            return "DELETE FROM canned_text_reply";
        }
    }

    public c(b0 b0Var) {
        this.f152036a = b0Var;
        this.f152037b = new a(this, b0Var);
        this.f152038c = new b(this, b0Var);
        this.f152039d = new C2861c(this, b0Var);
        new d(this, b0Var);
    }

    public static sd2.c a(Cursor cursor) {
        boolean z14;
        int columnIndex = cursor.getColumnIndex("deviceUnitId");
        int columnIndex2 = cursor.getColumnIndex("replyText");
        int columnIndex3 = cursor.getColumnIndex("replyType");
        int columnIndex4 = cursor.getColumnIndex("isOnDevice");
        int columnIndex5 = cursor.getColumnIndex("replySortOrder");
        long j8 = columnIndex == -1 ? 0L : cursor.getLong(columnIndex);
        String string = columnIndex2 == -1 ? null : cursor.getString(columnIndex2);
        int i14 = columnIndex3 == -1 ? 0 : cursor.getInt(columnIndex3);
        if (columnIndex4 == -1) {
            z14 = false;
        } else {
            z14 = cursor.getInt(columnIndex4) != 0;
        }
        return new sd2.c(j8, string, i14, z14, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 0);
    }

    public final void b(int i14, long j8) {
        b0 b0Var = this.f152036a;
        b0Var.assertNotSuspendingTransaction();
        C2861c c2861c = this.f152039d;
        vd.g gVarAcquire = c2861c.acquire();
        gVarAcquire.h(1, j8);
        gVarAcquire.h(2, i14);
        b0Var.beginTransaction();
        try {
            gVarAcquire.b2();
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
            c2861c.release(gVarAcquire);
        }
    }

    public final void c(ArrayList arrayList) {
        b0 b0Var = this.f152036a;
        b0Var.assertNotSuspendingTransaction();
        b0Var.beginTransaction();
        try {
            this.f152037b.insert((Iterable) arrayList);
            b0Var.setTransactionSuccessful();
        } finally {
            b0Var.endTransaction();
        }
    }
}
