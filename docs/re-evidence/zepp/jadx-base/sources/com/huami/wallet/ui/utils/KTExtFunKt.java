package com.huami.wallet.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.ui.activity.BaseWalletActivity;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.huami.wallet.ui.view.MyTextView;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u001a3\u0010\u000f\u001a\u00020\u0007*\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\r\u001a:\u0010\u000f\u001a\u00020\u0007*\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/huami/wallet/ui/view/MyTextView;", "", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "xiaomiNotices", "", "xiaomiCardName", "type", "", "shouldShowXiaomiNoticeCrossBar", "Lcom/huami/wallet/ui/activity/BaseWalletActivity;", "titleString", "Lkotlin/Function1;", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "Lkotlin/ExtensionFunctionType;", NotificationCompat.CATEGORY_CALL, "showTitleAndNav", "", "title", "(Lcom/huami/wallet/ui/activity/BaseWalletActivity;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class KTExtFunKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(RainbowTitleBar rainbowTitleBar, View view) {
        Context context = rainbowTitleBar.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(RainbowTitleBar rainbowTitleBar, View view) {
        Context context = rainbowTitleBar.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).finish();
    }

    public static final void shouldShowXiaomiNoticeCrossBar(@NotNull MyTextView myTextView, @Nullable List<XiaomiNotice> list, @Nullable String str, @NotNull String str2) {
        if (!KtUtilsKt.isNullOrEmpty(list)) {
            if (!(str == null || str.length() == 0)) {
                for (XiaomiNotice xiaomiNotice : list) {
                    String cardName = xiaomiNotice.getCardName();
                    int status = xiaomiNotice.getStatus();
                    String type = xiaomiNotice.getType();
                    String description = xiaomiNotice.getDescription();
                    if (Intrinsics.areEqual(cardName, str) && status == 0 && !KtUtils.isNullOrEmpty(description) && Intrinsics.areEqual(type, str2)) {
                        myTextView.setText(description);
                        myTextView.setVisibility(0);
                        return;
                    }
                }
                myTextView.setText("");
                myTextView.setVisibility(8);
                return;
            }
        }
        myTextView.setText("");
        myTextView.setVisibility(8);
    }

    public static final void showTitleAndNav(@NotNull BaseWalletActivity baseWalletActivity, @Nullable String str, @Nullable Function1<? super RainbowTitleBar, Unit> function1) {
        final RainbowTitleBar rainbowTitleBar = baseWalletActivity.mTitleBar;
        if (str != null) {
            rainbowTitleBar.setTitle(str);
        }
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: mk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KTExtFunKt.c(rainbowTitleBar, view);
            }
        });
        if (function1 == null) {
            return;
        }
        function1.invoke(rainbowTitleBar);
    }

    public static /* synthetic */ void showTitleAndNav$default(BaseWalletActivity baseWalletActivity, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        showTitleAndNav(baseWalletActivity, str, (Function1<? super RainbowTitleBar, Unit>) function1);
    }

    public static /* synthetic */ void showTitleAndNav$default(BaseWalletActivity baseWalletActivity, Integer num, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        showTitleAndNav(baseWalletActivity, num, (Function1<? super RainbowTitleBar, Unit>) function1);
    }

    public static final void showTitleAndNav(@NotNull BaseWalletActivity baseWalletActivity, @Nullable Integer num, @Nullable Function1<? super RainbowTitleBar, Unit> function1) {
        final RainbowTitleBar rainbowTitleBar = baseWalletActivity.mTitleBar;
        baseWalletActivity.setVisible(true);
        if (num != null) {
            num.intValue();
            rainbowTitleBar.setTitle(num.intValue());
        }
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KTExtFunKt.d(rainbowTitleBar, view);
            }
        });
        if (function1 == null) {
            return;
        }
        function1.invoke(rainbowTitleBar);
    }
}
