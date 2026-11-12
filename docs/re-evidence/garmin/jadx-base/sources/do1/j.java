package do1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.b f60601b;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.social.b bVar, int i14) {
        this.f60600a = i14;
        this.f60601b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        TaggableEditText taggableEditText;
        int i14 = this.f60600a;
        com.garmin.android.apps.connectmobile.social.b bVar = this.f60601b;
        switch (i14) {
            case 0:
                ds1.a aVar = (ds1.a) obj;
                com.garmin.android.apps.connectmobile.social.b.a aVar2 = com.garmin.android.apps.connectmobile.social.b.T0;
                aVar.getClass();
                PostCommentView postCommentView = bVar.D;
                if (postCommentView != null && (taggableEditText = postCommentView.f47848c) != null) {
                    taggableEditText.a(aVar);
                }
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundle = new Bundle();
                aVar3.getClass();
                ht.a.a(bundle, "TagSuggestionClickedInLegacyComment");
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.social.b.a aVar4 = com.garmin.android.apps.connectmobile.social.b.T0;
                g3Var.getClass();
                int i15 = com.garmin.android.apps.connectmobile.social.b.c.f44519a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    bVar.g7((List) g3Var.f35301b);
                } else if (i15 == 2) {
                    bVar.J6(false);
                    lj0.b bVar2 = lj0.b.f112956j;
                    bVar2.getClass();
                    g22.e.b(bVar, bVar2);
                    bVar.f44517y = false;
                } else if (i15 != 3) {
                    u0.r();
                    return null;
                }
                return Unit.INSTANCE;
        }
    }
}
