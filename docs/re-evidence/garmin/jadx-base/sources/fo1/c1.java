package fo1;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel", f = "ConversationViewModel.kt", l = {903}, m = "fetchAndReplaceProfileUrl", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f72488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f72489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f72490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f72491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(o0 o0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f72491d = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72490c = obj;
        this.f72492e |= Integer.MIN_VALUE;
        return o0.x4(this.f72491d, null, this);
    }
}
