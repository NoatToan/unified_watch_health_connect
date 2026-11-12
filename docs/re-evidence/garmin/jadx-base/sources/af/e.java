package af;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laf/e;", "T", "Laf/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lef/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lef/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e<T> extends g<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f3015f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"af/e$a", "Landroid/content/BroadcastReceiver;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<T> f3016a;

        public a(e<T> eVar) {
            this.f3016a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            this.f3016a.f(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, ef.b bVar) {
        super(context, bVar);
        context.getClass();
        bVar.getClass();
        this.f3015f = new a(this);
    }

    @Override // af.g
    public final void c() {
        u uVarA = u.a();
        int i14 = f.f3017a;
        getClass().getSimpleName().concat(": registering receiver");
        uVarA.getClass();
        this.f3019b.registerReceiver(this.f3015f, e());
    }

    @Override // af.g
    public final void d() {
        u uVarA = u.a();
        int i14 = f.f3017a;
        getClass().getSimpleName().concat(": unregistering receiver");
        uVarA.getClass();
        this.f3019b.unregisterReceiver(this.f3015f);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}
