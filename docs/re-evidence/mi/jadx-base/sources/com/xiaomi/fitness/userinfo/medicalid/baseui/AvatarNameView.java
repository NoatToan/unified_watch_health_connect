package com.xiaomi.fitness.userinfo.medicalid.baseui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.hsi;
import defpackage.nvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0017\u001a\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/baseui/AvatarNameView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getAvatarView", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setAvatarView", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "username", "Landroid/widget/EditText;", "getUsername", "()Landroid/widget/EditText;", "setUsername", "(Landroid/widget/EditText;)V", "initView", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvatarNameView extends LinearLayout {
    public RoundImageView avatarView;
    public EditText username;

    public AvatarNameView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(nvi.y, this);
        initView(context, attributeSet);
    }

    private final void initView(Context context, AttributeSet attrs) {
        setAvatarView((RoundImageView) findViewById(hsi.N));
        setUsername((EditText) findViewById(hsi.E));
    }

    @NotNull
    public final RoundImageView getAvatarView() {
        RoundImageView roundImageView = this.avatarView;
        if (roundImageView != null) {
            return roundImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatarView");
        return null;
    }

    @NotNull
    public final EditText getUsername() {
        EditText editText = this.username;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("username");
        return null;
    }

    public final void setAvatarView(@NotNull RoundImageView roundImageView) {
        Intrinsics.checkNotNullParameter(roundImageView, "<set-?>");
        this.avatarView = roundImageView;
    }

    public final void setUsername(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.username = editText;
    }

    public AvatarNameView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(nvi.y, this);
        initView(context, attributeSet);
    }
}
