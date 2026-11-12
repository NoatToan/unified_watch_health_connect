package com.xiaomi.fitness.mine.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.medal.export.data.Medal;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.l3g;
import defpackage.m0j;
import defpackage.nuf;
import defpackage.vni;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineUserInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fitness/medal/export/data/Medal;", "medal", "", "updateUserMedal", "(Lcom/xiaomi/fitness/medal/export/data/Medal;)V", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", Scopes.PROFILE, "", "getUserAge", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)I", "Landroid/view/View$OnClickListener;", "onClickListener", "setUserInfoOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setMedalOnClickListener", "userInfo", "updateUserMoreInfo", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "updateUserName", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "updateUserPhoto", "", "it", "updateUserWearMedal", "(Ljava/lang/String;)V", "Ll3g;", "mRootView", "Ll3g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineUserInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineUserInfoView.kt\ncom/xiaomi/fitness/mine/widget/MineUserInfoView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,217:1\n54#2,3:218\n24#2:221\n59#2,6:222\n54#2,3:228\n24#2:231\n57#2,6:232\n63#2,2:239\n57#3:238\n*S KotlinDebug\n*F\n+ 1 MineUserInfoView.kt\ncom/xiaomi/fitness/mine/widget/MineUserInfoView\n*L\n204#1:218,3\n204#1:221\n204#1:222,6\n214#1:228,3\n214#1:231\n214#1:232,6\n214#1:239,2\n214#1:238\n*E\n"})
public final class MineUserInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final l3g mRootView;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineUserInfoView$Companion;", "", "<init>", "()V", "updateUserMoreInfo", "", "view", "Lcom/xiaomi/fitness/mine/widget/MineUserInfoView;", "userMoreInfo", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "updateUserMedal", "medal", "Lcom/xiaomi/fitness/medal/export/data/Medal;", "updateUserName", "userInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "updateUserPhoto", "setUserInfoOnClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setUserInfoOnClickListener(@NotNull MineUserInfoView view, @NotNull View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            view.setUserInfoOnClickListener(onClickListener);
        }

        @JvmStatic
        public final void updateUserMedal(@NotNull MineUserInfoView view, @Nullable Medal medal) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.updateUserMedal(medal);
        }

        @JvmStatic
        public final void updateUserMoreInfo(@NotNull MineUserInfoView view, @Nullable UserProfile userMoreInfo) throws ParseException {
            Intrinsics.checkNotNullParameter(view, "view");
            view.updateUserMoreInfo(userMoreInfo);
        }

        @JvmStatic
        public final void updateUserName(@NotNull MineUserInfoView view, @NotNull AccountCoreInfo userInfo) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            view.updateUserName(userInfo);
        }

        @JvmStatic
        public final void updateUserPhoto(@NotNull MineUserInfoView view, @NotNull AccountCoreInfo userInfo) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            view.updateUserPhoto(userInfo);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineUserInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getUserAge(UserProfile profile) throws ParseException {
        String birth = profile.getBirth();
        if (birth == null || birth.length() == 0) {
            return 25;
        }
        Calendar calendar = Calendar.getInstance();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
        if (calendar.before(Long.valueOf(date.getTime()))) {
            return 0;
        }
        calendar.setTime(new Date());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTime(new Date(date.getTime()));
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = i - i4;
        return (i2 >= i5 && (i2 != i5 || i3 >= calendar.get(5))) ? i6 : i6 - 1;
    }

    @JvmStatic
    public static final void setUserInfoOnClickListener(@NotNull MineUserInfoView mineUserInfoView, @NotNull View.OnClickListener onClickListener) {
        INSTANCE.setUserInfoOnClickListener(mineUserInfoView, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUserMedal(Medal medal) {
    }

    @JvmStatic
    public static final void updateUserMoreInfo(@NotNull MineUserInfoView mineUserInfoView, @Nullable UserProfile userProfile) throws ParseException {
        INSTANCE.updateUserMoreInfo(mineUserInfoView, userProfile);
    }

    @JvmStatic
    public static final void updateUserName(@NotNull MineUserInfoView mineUserInfoView, @NotNull AccountCoreInfo accountCoreInfo) {
        INSTANCE.updateUserName(mineUserInfoView, accountCoreInfo);
    }

    @JvmStatic
    public static final void updateUserPhoto(@NotNull MineUserInfoView mineUserInfoView, @NotNull AccountCoreInfo accountCoreInfo) {
        INSTANCE.updateUserPhoto(mineUserInfoView, accountCoreInfo);
    }

    public final void setMedalOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.mRootView.G.setOnClickListener(onClickListener);
    }

    public final void updateUserWearMedal(@Nullable String it) {
        if (it == null || it.length() == 0) {
            ImageView userMedal = this.mRootView.G;
            Intrinsics.checkNotNullExpressionValue(userMedal, "userMedal");
            ViewExtKt.gone(userMedal);
        } else {
            ImageView userMedal2 = this.mRootView.G;
            Intrinsics.checkNotNullExpressionValue(userMedal2, "userMedal");
            ViewExtKt.visible(userMedal2);
            ImageView userMedal3 = this.mRootView.G;
            Intrinsics.checkNotNullExpressionValue(userMedal3, "userMedal");
            Coil.imageLoader(userMedal3.getContext()).enqueue(new ImageRequest.Builder(userMedal3.getContext()).data(it).target(userMedal3).build());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineUserInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void updateUserMedal(@NotNull MineUserInfoView mineUserInfoView, @Nullable Medal medal) {
        INSTANCE.updateUserMedal(mineUserInfoView, medal);
    }

    public final void setUserInfoOnClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.mRootView.A.setOnClickListener(onClickListener);
    }

    public final void updateUserMoreInfo(@Nullable UserProfile userInfo) throws ParseException {
        String string;
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            TextView userInfoSexLine = this.mRootView.F;
            Intrinsics.checkNotNullExpressionValue(userInfoSexLine, "userInfoSexLine");
            ViewExtKt.gone(userInfoSexLine);
            TextView userInfoHeightLine = this.mRootView.D;
            Intrinsics.checkNotNullExpressionValue(userInfoHeightLine, "userInfoHeightLine");
            ViewExtKt.gone(userInfoHeightLine);
            TextView userInfoSexLine2 = this.mRootView.F;
            Intrinsics.checkNotNullExpressionValue(userInfoSexLine2, "userInfoSexLine");
            ViewExtKt.gone(userInfoSexLine2);
            this.mRootView.H.setText(ResourceExtKt.getString(m0j.t0));
            this.mRootView.E.setText(ResourceExtKt.getString(m0j.s0));
            return;
        }
        TextView userInfoSexLine3 = this.mRootView.F;
        Intrinsics.checkNotNullExpressionValue(userInfoSexLine3, "userInfoSexLine");
        ViewExtKt.visible(userInfoSexLine3);
        TextView userInfoHeightLine2 = this.mRootView.D;
        Intrinsics.checkNotNullExpressionValue(userInfoHeightLine2, "userInfoHeightLine");
        ViewExtKt.visible(userInfoHeightLine2);
        TextView userInfoSexLine4 = this.mRootView.F;
        Intrinsics.checkNotNullExpressionValue(userInfoSexLine4, "userInfoSexLine");
        ViewExtKt.visible(userInfoSexLine4);
        if (userInfo == null) {
            this.mRootView.E.setText(ResourceExtKt.getString(m0j.u0));
            this.mRootView.C.setText(ResourceExtKt.getString(m0j.r0));
            this.mRootView.B.setText(ResourceExtKt.getString(m0j.q0));
            return;
        }
        String sex = userInfo.getSex();
        if (Intrinsics.areEqual(sex, "female")) {
            string = ResourceExtKt.getString(m0j.o0);
        } else {
            string = Intrinsics.areEqual(sex, "male") ? ResourceExtKt.getString(m0j.v0) : ResourceExtKt.getString(m0j.u0);
        }
        this.mRootView.E.setText(string);
        String strValueOf = ((int) userInfo.getHeight()) != 0 ? String.valueOf((int) userInfo.getHeight()) : ResourceExtKt.getString(m0j.r0);
        String string2 = "";
        String string3 = ((int) userInfo.getHeight()) != 0 ? ResourceExtKt.getString(m0j.k0) : "";
        this.mRootView.C.setText(strValueOf + string3);
        String birth = userInfo.getBirth();
        if (birth == null || birth.length() == 0) {
            string2 = ResourceExtKt.getString(m0j.q0);
        } else {
            int userAge = getUserAge(userInfo);
            if (userAge > 0) {
                string2 = ResourceExtKt.getString(m0j.j0, Integer.valueOf(userAge));
            }
        }
        this.mRootView.B.setText(string2);
    }

    public final void updateUserName(@Nullable AccountCoreInfo userInfo) {
        String userId;
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            this.mRootView.H.setText(ResourceExtKt.getString(m0j.t0));
            return;
        }
        TextView textView = this.mRootView.H;
        if (userInfo == null || (userId = userInfo.getUserName()) == null) {
            userId = userInfo != null ? userInfo.getUserId() : null;
            if (userId == null) {
                userId = ResourceExtKt.getString(m0j.w0);
            }
        }
        textView.setText(userId);
    }

    public final void updateUserPhoto(@Nullable AccountCoreInfo userInfo) {
        String avatarAddress;
        if (userInfo == null || (avatarAddress = userInfo.getAvatarAddress()) == null || avatarAddress.length() == 0) {
            return;
        }
        RoundImageView userPhoto = this.mRootView.I;
        Intrinsics.checkNotNullExpressionValue(userPhoto, "userPhoto");
        String avatarAddress2 = userInfo.getAvatarAddress();
        ImageLoader imageLoader = Coil.imageLoader(userPhoto.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(userPhoto.getContext()).data(avatarAddress2).target(userPhoto);
        builderTarget.error(vni.n);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        imageLoader.enqueue(builderTarget.build());
    }

    public /* synthetic */ MineUserInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineUserInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        l3g l3gVarA0 = l3g.A0(LayoutInflater.from(context), this, true);
        this.mRootView = l3gVarA0;
        nuf.f(l3gVarA0.getRoot());
    }
}
