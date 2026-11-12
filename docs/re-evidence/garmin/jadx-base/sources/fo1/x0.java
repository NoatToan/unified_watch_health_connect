package fo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel", f = "ConversationViewModel.kt", l = {977, 990, 1004, 1036, 1041}, m = "convertActivitySummaryToActivityFeed", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f72851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public am.c2 f72852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityListItemDTO f72854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f72855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f72856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f72857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0 f72858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f72859i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(o0 o0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f72858h = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72857g = obj;
        this.f72859i |= Integer.MIN_VALUE;
        int i14 = o0.H0;
        return this.f72858h.B4(null, null, null, null, this);
    }
}
