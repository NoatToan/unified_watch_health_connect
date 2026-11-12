package vd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public interface d extends Closeable {

    public interface c {
        d b(b bVar);
    }

    String getDatabaseName();

    vd.c getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z14);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvd/d$a;", "", "", "version", "<init>", "(I)V", "a", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f177134a;

        static {
            new C3314a(null);
        }

        public a(int i14) {
            this.f177134a = i14;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i14 = 0;
            boolean z14 = false;
            while (i14 <= length) {
                boolean z15 = s.h(str.charAt(!z14 ? i14 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z15) {
                    i14++;
                } else {
                    z14 = true;
                }
            }
            if (str.subSequence(i14, length + 1).toString().length() == 0) {
                return;
            }
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }

        public void b(wd.b bVar) {
        }

        public abstract void c(wd.b bVar);

        public void d(wd.b bVar, int i14, int i15) {
            throw new SQLiteException(k.e(i14, i15, "Can't downgrade database from version ", " to "));
        }

        public void e(wd.b bVar) {
        }

        public abstract void f(wd.b bVar, int i14, int i15);

        /* JADX INFO: renamed from: vd.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvd/d$a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3314a {
            public /* synthetic */ C3314a(j jVar) {
                this();
            }

            private C3314a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lvd/d$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lvd/d$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lvd/d$a;ZZ)V", "a", "b", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C3315b f177135f = new C3315b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f177136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f177137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f177138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f177139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f177140e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvd/d$b$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f177141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f177142b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f177143c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f177144d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f177145e;

            public a(Context context) {
                context.getClass();
                this.f177141a = context;
            }

            public final b a() {
                String str;
                a aVar = this.f177143c;
                if (aVar == null) {
                    h.s("Must set a callback to create the configuration.");
                    return null;
                }
                if (!this.f177144d || ((str = this.f177142b) != null && str.length() != 0)) {
                    return new b(this.f177141a, this.f177142b, aVar, this.f177144d, this.f177145e);
                }
                h.s("Must set a non-null database name to a configuration that uses the no backup directory.");
                return null;
            }
        }

        public /* synthetic */ b(Context context, String str, a aVar, boolean z14, boolean z15, int i14, j jVar) {
            this(context, str, aVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15);
        }

        /* JADX INFO: renamed from: vd.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvd/d$b$b;", "", "<init>", "()V", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3315b {
            public /* synthetic */ C3315b(j jVar) {
                this();
            }

            public static a a(Context context) {
                context.getClass();
                return new a(context);
            }

            private C3315b() {
            }
        }

        public b(Context context, String str, a aVar, boolean z14, boolean z15) {
            context.getClass();
            aVar.getClass();
            this.f177136a = context;
            this.f177137b = str;
            this.f177138c = aVar;
            this.f177139d = z14;
            this.f177140e = z15;
        }
    }
}
