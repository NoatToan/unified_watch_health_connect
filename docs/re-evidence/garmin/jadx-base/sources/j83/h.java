package j83;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h {

    public static abstract class a implements o {
        public abstract o a(n83.a aVar);
    }

    public abstract a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends h & o> S when(n83.d<e<e<b>>, b> dVar) {
        return new q83.m(dVar, this);
    }
}
