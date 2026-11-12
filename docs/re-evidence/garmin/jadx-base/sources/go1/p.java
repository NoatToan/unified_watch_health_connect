package go1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.comments.BaseCommentListFragment$snapAndSetTaggingSuggestionRecyclerViewHeight$1", f = "BaseCommentListFragment.kt", l = {815}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f78293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, int i14, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f78293b = kVar;
        this.f78294c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f78293b, this.f78294c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        View viewFindViewByPosition;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78292a;
        int i15 = this.f78294c;
        k kVar = this.f78293b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i16 = k.C;
            kVar.A6().postDelayed(new androidx.media3.exoplayer.d(kVar, i15, 6), 100L);
            this.f78292a = 1;
            if (m0.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        RecyclerView.p layoutManager = kVar.A6().getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(i15)) == null) {
            return Unit.INSTANCE;
        }
        int y14 = (int) viewFindViewByPosition.getY();
        FrameLayout frameLayout = kVar.f78257g;
        if (frameLayout == null) {
            p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = y14;
        FrameLayout frameLayout2 = kVar.f78257g;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.s.m("taggingSuggestionContainer");
        throw null;
    }
}
