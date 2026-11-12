package qv0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f147922b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f147921a = i14;
        this.f147922b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f147921a;
        c cVar = this.f147922b;
        switch (i14) {
            case 0:
                int i15 = c.f147923b;
                return cVar.c();
            default:
                int i16 = c.f147923b;
                return cVar.v();
        }
    }
}
