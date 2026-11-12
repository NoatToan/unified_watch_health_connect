package com.huami.account.userinfo.manager;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.userinfo.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import io.netty.util.internal.StringUtil;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J6\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¨\u0006\""}, d2 = {"Lcom/huami/account/userinfo/manager/AuditUserInfoManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "Landroid/view/View;", "auditStatusView", "Landroid/widget/ImageView;", "avatarView", "", "displayAvatar", "Landroid/widget/TextView;", "nickName", "nicknameAuditStatus", "displayNickname", "Lcom/huami/lib/rainbow/ListTile;", "item", "", "localUrl", "remoteUrl", "nickname", "originLabel", "Landroid/text/Spannable;", "a", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/account/userinfo/manager/AuditUserInfoManager$InfoCheckType;", "type", "", "interceptShowAuditTip", "<init>", "()V", "InfoCheckType", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class AuditUserInfoManager {

    @NotNull
    public static final AuditUserInfoManager INSTANCE = new AuditUserInfoManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/account/userinfo/manager/AuditUserInfoManager$InfoCheckType;", "", "<init>", "(Ljava/lang/String;I)V", "Nickname", "Avatar", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public enum InfoCheckType {
        Nickname,
        Avatar
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoCheckType.values().length];
            iArr[InfoCheckType.Nickname.ordinal()] = 1;
            iArr[InfoCheckType.Avatar.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    private AuditUserInfoManager() {
    }

    private final Spannable a(Context context, String originLabel) {
        String str = '(' + context.getString(R.string.account_ui_in_audit) + ')';
        String str2 = originLabel + StringUtil.SPACE + str;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null);
        int length = str.length() + iIndexOf$default;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.s3)), iIndexOf$default, length, 33);
        return spannableStringBuilder;
    }

    @JvmStatic
    public static final void displayAvatar(@NotNull Context context, @NotNull HMPersonInfo personInfo, @NotNull View auditStatusView, @NotNull ImageView avatarView) {
        String avatarPath = personInfo.getUserInfo().getAvatarPath();
        String avatar = personInfo.getUserInfo().getAvatar();
        String nickname = personInfo.getUserInfo().getNickname();
        String manualAuditAvatar = HMAccountKeeper.INSTANCE.getManualAuditAvatar();
        if (manualAuditAvatar != null) {
            avatarPath = null;
            avatar = manualAuditAvatar;
        }
        auditStatusView.setVisibility(manualAuditAvatar != null ? 0 : 8);
        AvatarManager.updateAvatarUI(context, avatarView, avatarPath, avatar, nickname);
    }

    @JvmStatic
    public static final void displayNickname(@NotNull TextView nickName, @NotNull TextView nicknameAuditStatus) {
        String manualAuditNickName = HMAccountKeeper.INSTANCE.getManualAuditNickName();
        if (manualAuditNickName != null) {
            nickName.setText(manualAuditNickName);
        } else {
            nickName.setText(HMPersonInfo.getInstance().getUserInfo().getNickname());
        }
        nicknameAuditStatus.setVisibility(manualAuditNickName != null ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    @JvmStatic
    public static final boolean interceptShowAuditTip(@NotNull FragmentActivity activity, @NotNull InfoCheckType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (HMAccountKeeper.INSTANCE.getManualAuditAvatar() != null) {
                z = true;
            }
        } else if (HMAccountKeeper.INSTANCE.getManualAuditNickName() != null) {
            z = true;
        }
        if (z) {
            UserInfoLegalCheckManager.showInAuditTip(activity, a.a);
        }
        return z;
    }

    @JvmStatic
    public static final void displayNickname(@NotNull Context context, @NotNull ListTile item) {
        String manualAuditNickName = HMAccountKeeper.INSTANCE.getManualAuditNickName();
        String string = context.getString(R.string.user_info_name);
        if (manualAuditNickName != null) {
            item.setTitle(INSTANCE.a(context, string));
            item.setTips(manualAuditNickName);
        } else {
            item.setTitle(string);
        }
    }

    @JvmStatic
    public static final void displayAvatar(@NotNull Context context, @NotNull ListTile item, @Nullable String localUrl, @Nullable String remoteUrl, @Nullable String nickname) {
        String str;
        String str2;
        String manualAuditAvatar = HMAccountKeeper.INSTANCE.getManualAuditAvatar();
        boolean z = manualAuditAvatar != null;
        String string = context.getString(R.string.user_info_ft_profile_edit_avatar);
        if (z) {
            item.setTitle(INSTANCE.a(context, string));
            str = null;
            str2 = manualAuditAvatar;
        } else {
            item.setTitle(string);
            str = localUrl;
            str2 = remoteUrl;
        }
        AvatarManager.updateAvatarUI(context, item, str, str2, false, nickname);
    }
}
