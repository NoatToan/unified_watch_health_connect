package oh2;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Loh2/d;", "", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Landroid/content/Context;", "Lqh2/a;", "createView", "<init>", "(Ljava/lang/String;ILjava/lang/String;Le23/l;)V", "c", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum d {
    Round("round", a.f132184a),
    Square("square", b.f132185a);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f132178c = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Context, qh2.a> f132183b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends q implements l<Context, qh2.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f132184a = new a();

        public a() {
            super(1, qh2.b.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
        }

        @Override // e23.l
        public final qh2.b invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            return new qh2.b(context2);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b extends q implements l<Context, qh2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f132185a = new b();

        public b() {
            super(1, qh2.c.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
        }

        @Override // e23.l
        public final qh2.c invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            return new qh2.c(context2);
        }
    }

    d(String str, l lVar) {
        this.f132182a = str;
        this.f132183b = lVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loh2/d$c;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }
}
