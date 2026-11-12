package rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m<E> extends a<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f154923f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    public m(int i14) {
        super(i14);
        Math.min(i14 / 4, f154923f.intValue());
    }
}
