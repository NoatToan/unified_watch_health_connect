package defpackage;

import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class mz0 {
    public static Consumer a(final com.thanosfisherman.elvis.interfaces.Consumer _this, final Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new Consumer() { // from class: lz0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                mz0.b(_this, consumer, obj);
            }
        };
    }

    public static /* synthetic */ void b(com.thanosfisherman.elvis.interfaces.Consumer _this, Consumer consumer, Object obj) {
        _this.accept(obj);
        consumer.accept(obj);
    }
}
