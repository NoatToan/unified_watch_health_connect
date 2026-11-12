package qt1;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f147539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f147540d;

    public /* synthetic */ b0(k kVar, Context context, long j8, int i14) {
        this.f147537a = i14;
        this.f147538b = kVar;
        this.f147539c = context;
        this.f147540d = j8;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f147537a) {
            case 0:
                k kVar = this.f147538b;
                return new rs1.b(kVar.f147666a, new pi0.e(this.f147539c), this.f147540d, 0, 0, new ot1.j(kVar, 18), 24, null);
            default:
                k kVar2 = this.f147538b;
                return new rs1.b(kVar2.f147666a, new pi0.e(this.f147539c), this.f147540d, 0, 0, new ot1.j(kVar2, 19), 24, null);
        }
    }
}
