package defpackage;

import org.ahocorasick.interval.Intervalable;

/* JADX INFO: loaded from: classes20.dex */
public class zuj implements Intervalable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54576c;
    private int e;

    public zuj(int i, int i2) {
        this.f54576c = i;
        this.e = i2;
    }

    @Override // org.ahocorasick.interval.Intervalable
    public int getStart() {
        return this.f54576c;
    }

    @Override // org.ahocorasick.interval.Intervalable
    public int getEnd() {
        return this.e;
    }

    @Override // org.ahocorasick.interval.Intervalable
    public int size() {
        return (this.e - this.f54576c) + 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Intervalable)) {
            return false;
        }
        Intervalable intervalable = (Intervalable) obj;
        return this.f54576c == intervalable.getStart() && this.e == intervalable.getEnd();
    }

    public int hashCode() {
        return (this.f54576c % 100) + (this.e % 100);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof Intervalable)) {
            return -1;
        }
        Intervalable intervalable = (Intervalable) obj;
        int start = this.f54576c - intervalable.getStart();
        return start != 0 ? start : this.e - intervalable.getEnd();
    }

    public String toString() {
        return this.f54576c + ":" + this.e;
    }
}
