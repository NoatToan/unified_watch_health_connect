package com.huami.wallet.ui.utils;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.dialog.NoticeDialogFragment;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007Js\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102+\u0010\u0019\u001a'\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0007J*\u0010\u001b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¨\u0006\u001e"}, d2 = {"Lcom/huami/wallet/ui/utils/NoticeViewUtils;", "", "Lcom/huami/wallet/lib/entity/Notice;", "notice", "", "isInTimeRange", "isNoticeBar", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "msg", "", "showDialog", "", "notices", "appCode", "Lcom/huami/wallet/ui/utils/NoticeActionType;", "type", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "pass", "onCheck", "checkNeedShowDialog", "c", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class NoticeViewUtils {

    @NotNull
    public static final NoticeViewUtils INSTANCE = new NoticeViewUtils();

    private NoticeViewUtils() {
    }

    @JvmStatic
    private static final boolean b(Notice notice) {
        return notice.getNoticeType().contains("POP_UP");
    }

    @JvmStatic
    private static final boolean c(String appCode, List<? extends NoticeActionType> type, Notice notice) {
        if (!CollectionsKt___CollectionsKt.contains(notice.getAppCode(), appCode) || !isInTimeRange(notice) || !b(notice)) {
            return false;
        }
        if (KtUtilsKt.isNullOrEmpty(type) || KtUtilsKt.isNullOrEmpty(notice.getActionType())) {
            return true;
        }
        if (type != null) {
            for (NoticeActionType noticeActionType : type) {
                List<String> actionType = notice.getActionType();
                if (actionType != null && actionType.contains(noticeActionType.getType())) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final void checkNeedShowDialog(@NotNull Context context, @Nullable List<Notice> notices, @Nullable FragmentManager fragmentManager, @Nullable String appCode, @Nullable List<? extends NoticeActionType> type, @NotNull Function2<? super Boolean, ? super Notice, ? extends Object> onCheck) {
        if (appCode == null || KtUtilsKt.isNullOrEmpty(notices) || fragmentManager == null) {
            onCheck.invoke(Boolean.TRUE, null);
            return;
        }
        if (notices != null) {
            for (Notice notice : notices) {
                if (c(appCode, type, notice)) {
                    onCheck.invoke(Boolean.FALSE, notice);
                    showDialog(context, fragmentManager, notice.getContext());
                    return;
                }
            }
        }
        onCheck.invoke(Boolean.TRUE, null);
    }

    public static /* synthetic */ void checkNeedShowDialog$default(Context context, List list, FragmentManager fragmentManager, String str, List list2, Function2 function2, int i, Object obj) {
        if ((i & 16) != 0) {
            list2 = null;
        }
        checkNeedShowDialog(context, list, fragmentManager, str, list2, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d() {
    }

    @JvmStatic
    public static final boolean isInTimeRange(@NotNull Notice notice) {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        return jCurrentTimeMillis >= notice.getStartTime() && jCurrentTimeMillis <= notice.getEndTime();
    }

    @JvmStatic
    public static final boolean isNoticeBar(@NotNull Notice notice) {
        return notice.getNoticeType().contains("CROSS_BAR");
    }

    @JvmStatic
    public static final void showDialog(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull String msg) {
        new NoticeDialogFragment.Builder().setTitle(context.getString(R.string.wl_serve_maintains)).setNoticeMsg(Intrinsics.stringPlus("", msg)).setImageResId(R.drawable.wl_img_notice).setOnKnownButtonClickListener(new NoticeDialogFragment.OnKnownButtonClickListener() { // from class: wf5
            @Override // com.huami.wallet.ui.dialog.NoticeDialogFragment.OnKnownButtonClickListener
            public final void onKnown() {
                NoticeViewUtils.d();
            }
        }).create().show(fragmentManager, "NoticeDialogFragment");
    }
}
