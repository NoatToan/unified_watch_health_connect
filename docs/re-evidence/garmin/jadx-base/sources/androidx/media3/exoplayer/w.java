package androidx.media3.exoplayer;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f9872b;

    public /* synthetic */ w(ja.b.a aVar, List list) {
        this.f9871a = 2;
        this.f9872b = list;
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        switch (this.f9871a) {
            case 0:
                ((androidx.media3.common.z.d) obj).onCues(this.f9872b);
                break;
            default:
                ((ja.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ w(List list, int i14) {
        this.f9871a = i14;
        this.f9872b = list;
    }
}
