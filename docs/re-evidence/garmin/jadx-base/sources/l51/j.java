package l51;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p51.c f110197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f110198c;

    public /* synthetic */ j(p51.c cVar, Context context, int i14) {
        this.f110196a = i14;
        this.f110197b = cVar;
        this.f110198c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f110196a) {
            case 0:
                this.f110197b.x4(this.f110198c, true);
                break;
            default:
                this.f110197b.x4(this.f110198c, true);
                break;
        }
        return Unit.INSTANCE;
    }
}
