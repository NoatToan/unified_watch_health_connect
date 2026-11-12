package ho;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f84643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f84644c;

    public /* synthetic */ l(Context context, double d14, int i14) {
        this.f84642a = i14;
        this.f84643b = context;
        this.f84644c = d14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        eo.e eVar = (eo.e) obj;
        String str = (String) obj2;
        switch (this.f84642a) {
            case 0:
                eVar.getClass();
                str.getClass();
                break;
            default:
                eVar.getClass();
                str.getClass();
                break;
        }
        return io.b.a(this.f84643b, str, this.f84644c, eVar);
    }
}
