package do1;

import android.text.Editable;
import android.text.TextWatcher;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldo1/m;", "Landroid/text/TextWatcher;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.b f60605a;

    public m(com.garmin.android.apps.connectmobile.social.b bVar) {
        this.f60605a = bVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        charSequence.getClass();
        int length = charSequence.length();
        com.garmin.android.apps.connectmobile.social.b bVar = this.f60605a;
        if (length == 0) {
            PostCommentView postCommentView = bVar.D;
            if (postCommentView != null) {
                postCommentView.setCommentContentDescription(bVar.getString(R.string.comment_placeholder));
                return;
            }
            return;
        }
        PostCommentView postCommentView2 = bVar.D;
        if (postCommentView2 != null) {
            postCommentView2.setCommentContentDescription(charSequence.toString());
        }
    }
}
