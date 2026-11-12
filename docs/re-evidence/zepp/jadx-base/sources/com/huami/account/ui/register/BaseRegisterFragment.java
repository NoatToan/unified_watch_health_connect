package com.huami.account.ui.register;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/account/ui/register/BaseRegisterFragment;", "Landroidx/fragment/app/Fragment;", "", "updateBtnState", "", "isFormEmpty", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseRegisterFragment extends Fragment {
    public abstract boolean isFormEmpty();

    public abstract void updateBtnState();
}
