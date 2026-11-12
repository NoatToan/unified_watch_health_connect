package com.huami.account.ui.login;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.account.ui.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/account/ui/login/LoginTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getLoginTypeLogo", "()Landroid/widget/ImageView;", "loginTypeLogo", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LoginTypeViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ImageView loginTypeLogo;

    public LoginTypeViewHolder(@NotNull View view) {
        super(view);
        this.loginTypeLogo = (ImageView) view.findViewById(R.id.iv_login_type_logo);
    }

    @NotNull
    public final ImageView getLoginTypeLogo() {
        return this.loginTypeLogo;
    }
}
