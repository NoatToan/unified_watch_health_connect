package androidx.media3.exoplayer;

import com.google.common.base.Supplier;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9203b;

    public /* synthetic */ m(Object obj, int i14) {
        this.f9202a = i14;
        this.f9203b = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i14 = this.f9202a;
        Object obj = this.f9203b;
        switch (i14) {
            case 0:
                return (w0) obj;
            case 1:
                return (c0) obj;
            case 2:
                return (xa.c) obj;
            case 3:
                return (androidx.media3.exoplayer.source.j.a) obj;
            case 4:
                return (wa.l) obj;
            case 5:
                return (androidx.media3.exoplayer.source.e) obj;
            case 6:
                return Boolean.valueOf(((z) obj).I);
            default:
                Class cls = (Class) obj;
                int i15 = androidx.media3.exoplayer.source.e.f9476k;
                try {
                    return (androidx.media3.exoplayer.source.j.a) cls.getConstructor(null).newInstance(null);
                } catch (Exception e4) {
                    l2.p(e4);
                    return null;
                }
        }
    }
}
