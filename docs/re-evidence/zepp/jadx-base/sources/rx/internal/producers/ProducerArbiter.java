package rx.internal.producers;

import rx.Producer;

/* JADX INFO: loaded from: classes23.dex */
public final class ProducerArbiter implements Producer {
    public static final Producer g = new a();
    public long a;
    public Producer b;
    public boolean c;
    public long d;
    public long e;
    public Producer f;

    public static class a implements Producer {
        @Override // rx.Producer
        public void request(long j) {
        }
    }

    public void emitLoop() {
        while (true) {
            synchronized (this) {
                long j = this.d;
                long j2 = this.e;
                Producer producer = this.f;
                if (j == 0 && j2 == 0 && producer == null) {
                    this.c = false;
                    return;
                }
                this.d = 0L;
                this.e = 0L;
                this.f = null;
                long j3 = this.a;
                if (j3 != Long.MAX_VALUE) {
                    long j4 = j3 + j;
                    if (j4 < 0 || j4 == Long.MAX_VALUE) {
                        this.a = Long.MAX_VALUE;
                        j3 = Long.MAX_VALUE;
                    } else {
                        j3 = j4 - j2;
                        if (j3 < 0) {
                            throw new IllegalStateException("more produced than requested");
                        }
                        this.a = j3;
                    }
                }
                if (producer == null) {
                    Producer producer2 = this.b;
                    if (producer2 != null && j != 0) {
                        producer2.request(j);
                    }
                } else if (producer == g) {
                    this.b = null;
                } else {
                    this.b = producer;
                    producer.request(j3);
                }
            }
        }
    }

    public void produced(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            if (this.c) {
                this.e += j;
                return;
            }
            this.c = true;
            try {
                long j2 = this.a;
                if (j2 != Long.MAX_VALUE) {
                    long j3 = j2 - j;
                    if (j3 < 0) {
                        throw new IllegalStateException("more items arrived than were requested");
                    }
                    this.a = j3;
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                this.d += j;
                return;
            }
            this.c = true;
            try {
                long j2 = this.a + j;
                if (j2 < 0) {
                    j2 = Long.MAX_VALUE;
                }
                this.a = j2;
                Producer producer = this.b;
                if (producer != null) {
                    producer.request(j);
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }

    public void setProducer(Producer producer) {
        synchronized (this) {
            if (this.c) {
                if (producer == null) {
                    producer = g;
                }
                this.f = producer;
                return;
            }
            this.c = true;
            try {
                this.b = producer;
                if (producer != null) {
                    producer.request(this.a);
                }
                emitLoop();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }
}
