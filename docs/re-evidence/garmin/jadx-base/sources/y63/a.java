package y63;

import org.apache.commons.io.function.IOFunction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements IOFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOFunction f194620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IOFunction f194621c;

    public /* synthetic */ a(IOFunction iOFunction, IOFunction iOFunction2, int i14) {
        this.f194619a = i14;
        this.f194620b = iOFunction;
        this.f194621c = iOFunction2;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        switch (this.f194619a) {
            case 0:
                return this.f194620b.lambda$andThen$4(this.f194621c, obj);
            default:
                return this.f194620b.lambda$compose$0(this.f194621c, obj);
        }
    }
}
