package defpackage;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class m98 extends tag<Pair<c93, ImageRequest.RequestLevel>, o98> {
    public final f93 c;

    public m98(f93 f93Var, dbi dbiVar) {
        super(dbiVar);
        this.c = f93Var;
    }

    @Override // defpackage.tag
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o98 f(o98 o98Var) {
        return o98.b(o98Var);
    }

    @Override // defpackage.tag
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Pair<c93, ImageRequest.RequestLevel> i(ebi ebiVar) {
        return Pair.create(this.c.b(ebiVar.b(), ebiVar.a()), ebiVar.g());
    }
}
