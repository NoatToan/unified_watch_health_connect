package qm0;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class i extends p005kotlin.jvm.internal.q implements e23.l<c0, Unit> {
    public i(Object obj) {
        super(1, obj, d.class, "updatePostFeedImage", "updatePostFeedImage(Lcom/garmin/android/apps/connectmobile/group/details/feed/PostImageChangedEvent;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(c0 c0Var) {
        c0 c0Var2 = c0Var;
        c0Var2.getClass();
        d dVar = (d) this.receiver;
        d.a aVar = d.E;
        dVar.getClass();
        String str = c0Var2.f145487a;
        List<? extends Parcelable> list = c0Var2.f145488b;
        if (str == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var, "BaseGroupPostFragment", "NewsPostUuid should not be null in updatePostFeedImage()");
        } else {
            p pVarD7 = dVar.d7();
            if (list == null) {
                list = j0.f134944a;
            }
            pVarD7.I4(str, list, x.b.POST_FEED);
        }
        return Unit.INSTANCE;
    }
}
