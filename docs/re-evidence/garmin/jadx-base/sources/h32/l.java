package h32;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh32/l;", "Landroid/text/TextWatcher;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostCommentView f81395a;

    public l(PostCommentView postCommentView) {
        this.f81395a = postCommentView;
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
        TextView textView = this.f81395a.f47849d;
        if (textView != null) {
            textView.setEnabled(charSequence.length() > 0);
        }
    }
}
