package tm0;

import b.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm0/d;", "Lb/s;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f165364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(true);
        this.f165364d = cVar;
    }

    @Override // b.s
    public final void b() {
        c cVar = this.f165364d;
        if (c.u6(cVar)) {
            new androidx.appcompat.app.e.a(cVar.requireContext()).setTitle(R.string.social_group_discard_post_question).setMessage(R.string.social_group_discard_post_message).setPositiveButton(R.string.lbl_yes, new b(cVar, 1)).setNegativeButton(R.string.lbl_cancel, new qh1.j(18)).setOnDismissListener(new d32.a(1)).show();
            return;
        }
        androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
        CreatePostActivity createPostActivity = mVarRequireActivity instanceof CreatePostActivity ? (CreatePostActivity) mVarRequireActivity : null;
        if (createPostActivity != null) {
            createPostActivity.setResult(0);
            createPostActivity.finish();
            createPostActivity.overridePendingTransition(0, R.anim.exit_out_down);
        }
    }
}
