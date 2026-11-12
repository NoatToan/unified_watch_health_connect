package x72;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lx72/o;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f189485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f189486b;

    static {
        new a(null);
    }

    public o(Context context) {
        context.getClass();
        this.f189485a = context;
        this.f189486b = o13.m.b(new m72.l(this, 2));
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.f189486b.getValue();
    }

    public final e b() {
        return new e((f) f.f189458e.get(a().getInt("themeMode", f.System.ordinal())), (b) b.f189437e.get(a().getInt("colorMode", b.Baseline.ordinal())), a().getFloat("fontScale", 1.0f), (c) c.f189442e.get(a().getInt("fontScaleMode", c.System.ordinal())), (d) d.f189448e.get(a().getInt("textDirection", d.System.ordinal())));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx72/o$a;", "", "<init>", "()V", "", "PREF_FILE_KEY", "Ljava/lang/String;", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
