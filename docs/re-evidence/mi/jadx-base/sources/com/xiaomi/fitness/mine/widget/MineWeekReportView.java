package com.xiaomi.fitness.mine.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.about.utils.MineHtmlUrlsKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference;
import com.xiaomi.fitness.mine.weeklyreport.WeeklyReportAuthActivity;
import com.xiaomi.fitness.mine.widget.MineWeekReportView;
import com.xiaomi.fitness.util.MineOneTrack;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import defpackage.m0j;
import defpackage.m1g;
import defpackage.nuf;
import defpackage.vni;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineWeekReportView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lorg/joda/time/LocalDate;", "today", "findLastMonday", "(Lorg/joda/time/LocalDate;)Lorg/joda/time/LocalDate;", "", "updateWeekReportInfo", "()V", "", "show", "", "time", "needShowWeekReport", "(ZLjava/lang/Long;)V", "Lm1g;", "mRootView", "Lm1g;", "showTime", "Ljava/lang/Long;", "Landroidx/fragment/app/FragmentActivity;", "getMActivity", "()Landroidx/fragment/app/FragmentActivity;", "mActivity", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineWeekReportView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineWeekReportView.kt\ncom/xiaomi/fitness/mine/widget/MineWeekReportView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n54#2,3:121\n24#2:124\n57#2,6:125\n63#2,2:132\n57#3:131\n1#4:134\n*S KotlinDebug\n*F\n+ 1 MineWeekReportView.kt\ncom/xiaomi/fitness/mine/widget/MineWeekReportView\n*L\n51#1:121,3\n51#1:124\n51#1:125,6\n51#1:132,2\n51#1:131\n*E\n"})
public final class MineWeekReportView extends ConstraintLayout {

    @NotNull
    private final m1g mRootView;

    @Nullable
    private Long showTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineWeekReportView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MineWeekReportView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSportsWeekly();
        Long l = this$0.showTime;
        if (l != null) {
            WeeklyReportSharePreference weeklyReportSharePreference = WeeklyReportSharePreference.INSTANCE;
            Intrinsics.checkNotNull(l);
            weeklyReportSharePreference.setKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP(l.longValue());
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
                return;
            }
            if (WeeklyReportSharePreference.INSTANCE.getKEY_WEEKLY_REPORT_AUTH() != 1) {
                Intent intent = new Intent();
                intent.setClass(mActivity, WeeklyReportAuthActivity.class);
                mActivity.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent();
            String weeklyReportHtmlUrl = MineHtmlUrlsKt.getWeeklyReportHtmlUrl();
            Logger.d("MineFragment", "pushUrl is " + weeklyReportHtmlUrl);
            intent2.setClass(mActivity, HealthWebViewActivity.class);
            intent2.putExtra("data4", ResourceExtKt.getString(m0j.A0));
            intent2.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
            intent2.putExtra("URL", weeklyReportHtmlUrl);
            mActivity.startActivity(intent2);
        }
    }

    private final LocalDate findLastMonday(LocalDate today) {
        while (today.getDayOfWeek() != 1) {
            today = today.minusDays(1);
        }
        LocalDate localDateMinusWeeks = today.minusWeeks(1);
        Intrinsics.checkNotNullExpressionValue(localDateMinusWeeks, "minusWeeks(...)");
        return localDateMinusWeeks;
    }

    private final FragmentActivity getMActivity() {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity instanceof FragmentActivity) {
            return (FragmentActivity) currentActivity;
        }
        return null;
    }

    public final void needShowWeekReport(boolean show, @Nullable Long time) {
        if (time != null) {
            this.showTime = time;
        }
        ImageView functionRemindView = this.mRootView.D;
        Intrinsics.checkNotNullExpressionValue(functionRemindView, "functionRemindView");
        ViewExtKt.setVisible(functionRemindView, show);
    }

    public final void updateWeekReportInfo() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNull(localDateNow);
        LocalDate localDateFindLastMonday = findLastMonday(localDateNow);
        this.mRootView.A.setText(new SimpleDateFormat("MM.dd", Locale.getDefault()).format(localDateFindLastMonday.toDate()) + "～" + new SimpleDateFormat("MM.dd", Locale.getDefault()).format(localDateFindLastMonday.plusDays(6).toDate()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineWeekReportView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MineWeekReportView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineWeekReportView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m1g m1gVarA0 = m1g.A0(LayoutInflater.from(context), this, true);
        this.mRootView = m1gVarA0;
        m1gVarA0.C.setText(ResourceExtKt.getString(m0j.B));
        ImageView functionIcon = m1gVarA0.B;
        Intrinsics.checkNotNullExpressionValue(functionIcon, "functionIcon");
        Coil.imageLoader(functionIcon.getContext()).enqueue(new ImageRequest.Builder(functionIcon.getContext()).data(Integer.valueOf(vni.J)).target(functionIcon).build());
        nuf.e(this);
        setOnClickListener(new View.OnClickListener() { // from class: y4g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineWeekReportView._init_$lambda$1(this.f39778a, view);
            }
        });
        ImageView functionRemindView = m1gVarA0.D;
        Intrinsics.checkNotNullExpressionValue(functionRemindView, "functionRemindView");
        ViewExtKt.gone(functionRemindView);
    }
}
