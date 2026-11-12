package go1;

import android.text.Editable;
import android.text.TextWatcher;
import com.daasuu.bl.BubbleLayout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgo1/m;", "Landroid/text/TextWatcher;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f78290a;

    public m(k kVar) {
        this.f78290a = kVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        k kVar = this.f78290a;
        kVar.f78254d.b();
        BubbleLayout bubbleLayout = kVar.f78260j;
        if (bubbleLayout == null) {
            p005kotlin.jvm.internal.s.m("tooltip");
            throw null;
        }
        bubbleLayout.setVisibility(8);
        kVar.f78265o = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }
}
