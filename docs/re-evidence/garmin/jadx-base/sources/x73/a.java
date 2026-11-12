package x73;

import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f189489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qualifier f189490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f189491d;

    public /* synthetic */ a(Class cls, Qualifier qualifier, e23.a aVar, int i14) {
        this.f189488a = i14;
        this.f189489b = cls;
        this.f189490c = qualifier;
        this.f189491d = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f189488a) {
            case 0:
                return KoinJavaComponent.getOrNull(this.f189489b, this.f189490c, this.f189491d);
            default:
                return KoinJavaComponent.get(this.f189489b, this.f189490c, this.f189491d);
        }
    }
}
