package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ucm implements y5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35625a;

    public ucm(int i) {
        this.f35625a = i;
    }

    @Override // defpackage.y5d
    public x5d createImageTranscoder(l4d l4dVar, boolean z) {
        return new tcm(z, this.f35625a);
    }
}
