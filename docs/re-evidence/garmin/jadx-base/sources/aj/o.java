package aj;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface o<Model, Data> {
    a<Data> a(Model model, int i14, int i15, ui.h hVar);

    boolean b(Model model);

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ui.e f3370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ui.e> f3371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f3372c;

        public a(ui.e eVar, List<ui.e> list, com.bumptech.glide.load.data.d<Data> dVar) {
            qj.l.c(eVar, "Argument must not be null");
            this.f3370a = eVar;
            qj.l.c(list, "Argument must not be null");
            this.f3371b = list;
            qj.l.c(dVar, "Argument must not be null");
            this.f3372c = dVar;
        }

        public a(ui.e eVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(eVar, Collections.EMPTY_LIST, dVar);
        }
    }
}
