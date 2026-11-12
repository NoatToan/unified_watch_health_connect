package kv0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f106611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f106612c;

    public /* synthetic */ e(int i14, Context context, e23.l lVar) {
        this.f106610a = i14;
        this.f106611b = lVar;
        this.f106612c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f106610a) {
            case 0:
                this.f106611b.invoke(new ho0.a(this.f106612c, 24));
                break;
            case 1:
                this.f106611b.invoke(this.f106612c);
                break;
            case 2:
                this.f106611b.invoke(this.f106612c);
                break;
            case 3:
                this.f106611b.invoke(this.f106612c);
                break;
            case 4:
                this.f106611b.invoke(this.f106612c);
                break;
            default:
                e23.l lVar = this.f106611b;
                if (lVar != null) {
                    lVar.invoke(this.f106612c);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
