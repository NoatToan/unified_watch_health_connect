package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xno<T> implements a6h<T>, koo {
    private static final long NOT_SET = Long.MIN_VALUE;
    private cbi producer;
    private long requested;
    private final xno<?> subscriber;
    private final moo subscriptions;

    public xno() {
        this(null, false);
    }

    private void addToRequested(long j) {
        long j2 = this.requested;
        if (j2 == Long.MIN_VALUE) {
            this.requested = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j3;
        }
    }

    public final void add(koo kooVar) {
        this.subscriptions.a(kooVar);
    }

    @Override // defpackage.koo
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    public final void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
        synchronized (this) {
            cbi cbiVar = this.producer;
            if (cbiVar != null) {
                cbiVar.request(j);
            } else {
                addToRequested(j);
            }
        }
    }

    public void setProducer(cbi cbiVar) {
        long j;
        xno<?> xnoVar;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = cbiVar;
            xnoVar = this.subscriber;
            z = xnoVar != null && j == Long.MIN_VALUE;
        }
        if (z) {
            xnoVar.setProducer(cbiVar);
        } else if (j == Long.MIN_VALUE) {
            cbiVar.request(Long.MAX_VALUE);
        } else {
            cbiVar.request(j);
        }
    }

    @Override // defpackage.koo
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public xno(xno<?> xnoVar) {
        this(xnoVar, true);
    }

    public xno(xno<?> xnoVar, boolean z) {
        this.requested = Long.MIN_VALUE;
        this.subscriber = xnoVar;
        this.subscriptions = (!z || xnoVar == null) ? new moo() : xnoVar.subscriptions;
    }
}
