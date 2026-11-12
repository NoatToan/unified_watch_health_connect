package fo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel", f = "ConversationViewModel.kt", l = {200, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 223, 227}, m = "fetchGroupActivityPostInternal", v = 2)
public final class g1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f72546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public am.c2 f72548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f72549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jm0.b f72550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2.b f72551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f72552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f72553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f72554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72555j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(o0 o0Var, t13.d<? super g1> dVar) {
        super(dVar);
        this.f72554i = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72553h = obj;
        this.f72555j |= Integer.MIN_VALUE;
        int i14 = o0.H0;
        return this.f72554i.F4(null, null, null, this);
    }
}
