package sy2;

import sy2.c;
import sy2.e;

/* JADX INFO: loaded from: classes13.dex */
public interface d<ModelType extends c<?>, ViewType extends e<?>> {
    void M(ViewType viewtype);

    default void a0() {
    }

    void e(ModelType modeltype);

    ViewType getView();
}
