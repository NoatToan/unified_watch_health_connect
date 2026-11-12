package com.dianping.logan;

/* JADX INFO: loaded from: classes2.dex */
class b {
    public a a;
    public f b;
    public e c;

    public enum a {
        WRITE,
        SEND,
        FLUSH
    }

    public boolean a() {
        f fVar;
        e eVar;
        a aVar = this.a;
        if (aVar != null) {
            if (aVar == a.SEND && (eVar = this.c) != null && eVar.a()) {
                return true;
            }
            if ((this.a == a.WRITE && (fVar = this.b) != null && fVar.a()) || this.a == a.FLUSH) {
                return true;
            }
        }
        return false;
    }
}
