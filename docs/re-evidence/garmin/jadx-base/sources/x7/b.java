package x7;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import e23.l;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import u7.k;
import u7.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lx7/b;", "Lg23/d;", "Landroid/content/Context;", "Lu7/k;", "Ly7/g;", "", "name", "Lv7/b;", "corruptionHandler", "Lkotlin/Function1;", "", "Lu7/f;", "produceMigrations", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "<init>", "(Ljava/lang/String;Lv7/b;Le23/l;Lo53/b0;)V", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements g23.d<Context, k<y7.g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.b<y7.g> f189355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Context, List<u7.f<y7.g>>> f189356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f189357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f189358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile y7.d f189359f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, v7.b<y7.g> bVar, l<? super Context, ? extends List<? extends u7.f<y7.g>>> lVar, b0 b0Var) {
        str.getClass();
        lVar.getClass();
        b0Var.getClass();
        this.f189354a = str;
        this.f189355b = bVar;
        this.f189356c = lVar;
        this.f189357d = b0Var;
        this.f189358e = new Object();
    }

    @Override // g23.d
    public final k<y7.g> getValue(Context context, k23.l lVar) {
        y7.d dVar;
        Context context2 = context;
        context2.getClass();
        lVar.getClass();
        y7.d dVar2 = this.f189359f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f189358e) {
            try {
                if (this.f189359f == null) {
                    Context applicationContext = context2.getApplicationContext();
                    y7.f fVar = y7.f.f194634a;
                    v7.b<y7.g> bVar = this.f189355b;
                    l<Context, List<u7.f<y7.g>>> lVar2 = this.f189356c;
                    applicationContext.getClass();
                    List<u7.f<y7.g>> listInvoke = lVar2.invoke(applicationContext);
                    b0 b0Var = this.f189357d;
                    a aVar = new a(applicationContext, this);
                    fVar.getClass();
                    listInvoke.getClass();
                    k0 k0Var = new k0(y7.h.f194638a, null, new y7.e(aVar), 2, null);
                    u7.l.f169182a.getClass();
                    this.f189359f = new y7.d(new y7.d(u7.l.a(k0Var, bVar, listInvoke, b0Var)));
                }
                dVar = this.f189359f;
                dVar.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }
}
