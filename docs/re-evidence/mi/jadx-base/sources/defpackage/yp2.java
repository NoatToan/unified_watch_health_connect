package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class yp2 extends tag<Pair<c93, ImageRequest.RequestLevel>, w14<u14>> {
    public final f93 c;

    public yp2(f93 f93Var, dbi dbiVar) {
        super(dbiVar);
        this.c = f93Var;
    }

    @Override // defpackage.tag
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public w14<u14> f(w14<u14> w14Var) {
        return w14.d(w14Var);
    }

    @Override // defpackage.tag
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Pair<c93, ImageRequest.RequestLevel> i(ebi ebiVar) {
        return Pair.create(this.c.c(ebiVar.b(), ebiVar.a()), ebiVar.g());
    }
}
