package gp;

import android.content.Context;
import o72.r1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f78359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f78360c;

    public /* synthetic */ h(e23.a aVar, Context context) {
        this.f78358a = 1;
        this.f78359b = context;
        this.f78360c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f78358a) {
            case 0:
                this.f78360c.invoke();
                ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).b(this.f78359b);
                break;
            case 1:
                Context context = this.f78359b;
                context.getClass();
                context.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context, c80.q.LIVE_ACTIVITY, false));
                this.f78360c.invoke();
                break;
            case 2:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 3:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 4:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 5:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 6:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 7:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 8:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 9:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 10:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            case 11:
                this.f78360c.invoke();
                r1.c(this.f78359b, "Item deleted successfully!");
                break;
            default:
                this.f78360c.invoke();
                ((n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null)).b(this.f78359b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(e23.a aVar, Context context, int i14) {
        this.f78358a = i14;
        this.f78360c = aVar;
        this.f78359b = context;
    }
}
