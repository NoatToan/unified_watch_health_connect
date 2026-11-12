package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rv5 extends sv5 implements s4p {
    public s4p minus(long j, c5p c5pVar) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, c5pVar).plus(1L, c5pVar) : plus(-j, c5pVar);
    }

    public s4p plus(y4p y4pVar) {
        return y4pVar.addTo(this);
    }

    public s4p with(w4p w4pVar) {
        return w4pVar.adjustInto(this);
    }

    public s4p minus(y4p y4pVar) {
        return y4pVar.subtractFrom(this);
    }
}
