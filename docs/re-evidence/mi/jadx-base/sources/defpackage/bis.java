package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes11.dex */
public class bis implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ths.a f4273b;

    public bis(ths.a aVar, Context context) {
        this.f4273b = aVar;
        this.f4272a = context;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f A[Catch: Exception -> 0x0027, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {Exception -> 0x0027, blocks: (B:14:0x0023, B:17:0x0029, B:19:0x002f), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[Catch: Exception -> 0x0047, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {Exception -> 0x0047, blocks: (B:25:0x0043, B:28:0x0049, B:30:0x004f), top: B:48:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[Catch: Exception -> 0x005a, FINALLY_INSNS, TRY_LEAVE, TryCatch #1 {Exception -> 0x005a, blocks: (B:34:0x0056, B:37:0x005c, B:39:0x0062), top: B:46:0x0056 }] */
    @Override // java.lang.Runnable
    public void run() {
        jhs jhsVar;
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = this.f4273b.a();
            if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                sQLiteDatabaseA.beginTransaction();
                this.f4273b.e(this.f4272a, sQLiteDatabaseA);
                sQLiteDatabaseA.setTransactionSuccessful();
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                    if (this.f4273b.f34719b != null) {
                    }
                } catch (Exception e) {
                    e = e;
                    x9s.s(e);
                }
            } else if (this.f4273b.f34719b != null) {
            }
        } catch (Exception e2) {
            x9s.s(e2);
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                    if (this.f4273b.f34719b != null) {
                    }
                } catch (Exception e3) {
                    e = e3;
                    x9s.s(e);
                }
            } else if (this.f4273b.f34719b != null) {
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                    jhsVar = this.f4273b.f34719b;
                    if (jhsVar != null) {
                        jhsVar.close();
                    }
                } catch (Exception e4) {
                    x9s.s(e4);
                    this.f4273b.d(this.f4272a);
                }
            } else {
                jhsVar = this.f4273b.f34719b;
                if (jhsVar != null) {
                    jhsVar.close();
                }
            }
            this.f4273b.d(this.f4272a);
        }
    }
}
