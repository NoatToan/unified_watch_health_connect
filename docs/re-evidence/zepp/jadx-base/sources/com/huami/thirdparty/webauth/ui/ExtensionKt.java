package com.huami.thirdparty.webauth.ui;

import androidx.fragment.app.FragmentActivity;
import com.huami.account.AccountStatEvent;
import com.huami.thirdparty.webauth.ThirdBind;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aH\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003\u001aQ\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032*\u0010\u000e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r0\f\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "authType", "", "uid", "clientId", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "countryCode", "region", "name", "", "webAuth", "", "Lkotlin/Pair;", "pairs", "refreshEachToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V", "webauth-ui_release"}, k = 2, mv = {1, 4, 1})
public final class ExtensionKt {
    public static final void refreshEachToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Pair<String, String>... pairArr) {
        ThirdBind.INSTANCE.refreshEachToken(str, str2, str3, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final void webAuth(@NotNull FragmentActivity fragmentActivity, @NotNull AuthType authType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        fragmentActivity.startActivity(ThirdBindActivity.INSTANCE.getIntent(fragmentActivity, authType, str, str2, str3, str4, str5, str6));
    }
}
