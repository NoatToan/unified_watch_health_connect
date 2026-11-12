package defpackage;

/* JADX INFO: loaded from: classes46.dex */
public class ytd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f53840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f53841c;

    public ytd(double d, double d2) {
        this.f53841c = d;
        this.f53840b = d2;
    }

    public double e() {
        return this.f53841c;
    }

    public ytd b(ytd ytdVar) {
        return new ytd(this.f53841c + ytdVar.f53841c, this.f53840b + ytdVar.f53840b);
    }

    public ytd a(ytd ytdVar) {
        return new ytd(this.f53841c - ytdVar.f53841c, this.f53840b - ytdVar.f53840b);
    }

    public ytd d(ytd ytdVar) {
        double d = this.f53841c;
        double d2 = ytdVar.f53841c;
        double d3 = this.f53840b;
        double d4 = ytdVar.f53840b;
        return new ytd((d * d2) - (d3 * d4), (d * d4) + (d3 * d2));
    }

    public double c(ytd ytdVar) {
        return Math.sqrt((this.f53841c * ytdVar.f53841c) + (this.f53840b * ytdVar.f53840b));
    }

    public ytd a(double d) {
        return new ytd(this.f53841c * d, d * this.f53840b);
    }

    public ytd d() {
        return new ytd(this.f53841c, -this.f53840b);
    }

    public ytd d(double d) {
        return new ytd(this.f53841c / d, this.f53840b / d);
    }
}
