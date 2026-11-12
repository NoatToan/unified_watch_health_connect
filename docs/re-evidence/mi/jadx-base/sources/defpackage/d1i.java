package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d1i implements mzc {
    @Override // defpackage.mzc
    public View a(ViewGroup viewGroup) {
        return View.inflate(viewGroup.getContext(), c(), viewGroup);
    }

    @Override // defpackage.mzc
    public void b(Bundle bundle) {
    }

    public abstract int c();
}
