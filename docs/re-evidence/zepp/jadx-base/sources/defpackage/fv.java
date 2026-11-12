package defpackage;

import com.thanosfisherman.elvis.interfaces.BiConsumer;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class fv {
    public static BiConsumer a(final BiConsumer _this, final BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        return new BiConsumer() { // from class: ev
            @Override // com.thanosfisherman.elvis.interfaces.BiConsumer
            public final void accept(Object obj, Object obj2) {
                fv.b(_this, biConsumer, obj, obj2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return fv.a(this, biConsumer2);
            }
        };
    }

    public static /* synthetic */ void b(BiConsumer _this, BiConsumer biConsumer, Object obj, Object obj2) {
        _this.accept(obj, obj2);
        biConsumer.accept(obj, obj2);
    }
}
