package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f53252b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i14) {
        this.f53251a = i14;
        this.f53252b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f53251a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f53252b).lambda$new$0(view2);
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f53252b).lambda$new$0(view2);
                break;
            default:
                ((PasswordToggleEndIconDelegate) this.f53252b).lambda$new$0(view2);
                break;
        }
    }
}
