package com.huami.wallet.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.repository.NoticeRepo;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.utils.NoticeActionType;
import com.huami.wallet.ui.utils.NoticeViewUtils;
import com.huami.wallet.ui.utils.RxNext;
import com.huami.wallet.ui.utils.RxTimer;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101B\u001b\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b0\u00104J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J&\u0010\u0010\u001a\u00020\u00002\u001e\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rJ\u0012\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0005R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00065"}, d2 = {"Lcom/huami/wallet/ui/view/NoticeBarView;", "Landroid/widget/LinearLayout;", "", "content", "b", "", "c", GoogleApiAvailabilityLight.a, "appCode", "Lcom/huami/wallet/lib/entity/Notice;", "notice", "", "a", "Lkotlin/Function2;", "", "onReadMore", "setOnReadMore", "setAppCode", "canShow", "setCanShow", "Lcom/huami/wallet/ui/repository/NoticeRepo;", "vm", "setNoticeRepo", "", "Lcom/huami/wallet/ui/utils/NoticeActionType;", "dataList", "setTypeList", "gone", "checkNeedShowBar", "destroy", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "mNoticeRepoWR", "Lcom/huami/wallet/ui/utils/RxTimer;", "Lcom/huami/wallet/ui/utils/RxTimer;", "mRxTimer", "Ljava/lang/String;", "mAppCode", "Lcom/huami/wallet/lib/entity/Notice;", "mNoticeForBar", "e", "Z", "mCanShow", "f", "Ljava/util/List;", "typeList", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class NoticeBarView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private WeakReference<NoticeRepo> mNoticeRepoWR;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private RxTimer mRxTimer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String mAppCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Notice mNoticeForBar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mCanShow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private List<? extends NoticeActionType> typeList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ Function2<String, String, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super String, ? super String, ? extends Object> function2) {
            super(1);
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            if (NoticeBarView.this.mNoticeForBar != null) {
                Function2<String, String, Object> function2 = this.b;
                Notice notice = NoticeBarView.this.mNoticeForBar;
                String crossBarJumpUrl = notice == null ? null : notice.getCrossBarJumpUrl();
                Notice notice2 = NoticeBarView.this.mNoticeForBar;
                function2.invoke(crossBarJumpUrl, Intrinsics.stringPlus("", notice2 != null ? notice2.getContext() : null));
            }
        }
    }

    public NoticeBarView(@NotNull Context context) {
        super(context);
        this.mCanShow = true;
    }

    private final boolean a(String appCode, Notice notice) {
        if (!CollectionsKt___CollectionsKt.contains(notice.getAppCode(), appCode) || !NoticeViewUtils.isInTimeRange(notice) || !NoticeViewUtils.isNoticeBar(notice)) {
            return false;
        }
        List<? extends NoticeActionType> list = this.typeList;
        if (!(list == null || list.isEmpty())) {
            List<String> actionType = notice.getActionType();
            if (!(actionType == null || actionType.isEmpty())) {
                List<? extends NoticeActionType> list2 = this.typeList;
                if (list2 != null) {
                    for (NoticeActionType noticeActionType : list2) {
                        List<String> actionType2 = notice.getActionType();
                        if (actionType2 != null && actionType2.contains(noticeActionType.getType())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final NoticeBarView b(String content) {
        ((TextView) findViewById(R.id.wl_content)).setText(content);
        return this;
    }

    private final void c() {
        if (this.mCanShow) {
            Notice notice = this.mNoticeForBar;
            b(Intrinsics.stringPlus("", notice == null ? null : notice.getContext()));
            setVisibility(0);
        }
    }

    private final void d() {
        if (this.mRxTimer != null) {
            return;
        }
        this.mRxTimer = new RxTimer().interval(1000L, new RxNext() { // from class: com.huami.wallet.ui.view.NoticeBarView$startCheckTimer$1
            @Override // com.huami.wallet.ui.utils.RxNext
            public void onNext() {
                this.a.checkNeedShowBar();
            }
        });
    }

    public static /* synthetic */ NoticeBarView setAppCode$default(NoticeBarView noticeBarView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return noticeBarView.setAppCode(str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void checkNeedShowBar() {
        NoticeRepo noticeRepo;
        NoticeRepo noticeRepo2;
        List<Notice> notices;
        NoticeRepo noticeRepo3;
        List<Notice> notices2;
        if (this.mAppCode != null) {
            WeakReference<NoticeRepo> weakReference = this.mNoticeRepoWR;
            Boolean boolValueOf = null;
            if (((weakReference == null || (noticeRepo = weakReference.get()) == null) ? null : noticeRepo.getNotices()) != null) {
                WeakReference<NoticeRepo> weakReference2 = this.mNoticeRepoWR;
                if (weakReference2 != null && (noticeRepo3 = weakReference2.get()) != null && (notices2 = noticeRepo3.getNotices()) != null) {
                    boolValueOf = Boolean.valueOf(notices2.isEmpty());
                }
                if (!boolValueOf.booleanValue()) {
                    WeakReference<NoticeRepo> weakReference3 = this.mNoticeRepoWR;
                    if (weakReference3 == null || (noticeRepo2 = weakReference3.get()) == null || (notices = noticeRepo2.getNotices()) == null) {
                        return;
                    }
                    for (Notice notice : notices) {
                        if (a(this.mAppCode, notice)) {
                            this.mNoticeForBar = notice;
                            c();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        gone();
    }

    public final void destroy() {
        if (getVisibility() == 0) {
            gone();
        }
        RxTimer rxTimer = this.mRxTimer;
        if (rxTimer == null) {
            return;
        }
        rxTimer.cancel();
    }

    public final void gone() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    @NotNull
    public final NoticeBarView setAppCode(@Nullable String appCode) {
        this.mAppCode = appCode;
        return this;
    }

    public final void setCanShow(boolean canShow) {
        this.mCanShow = canShow;
        if (canShow) {
            gone();
        }
    }

    @NotNull
    public final NoticeBarView setNoticeRepo(@NotNull NoticeRepo vm) {
        WeakReference<NoticeRepo> weakReference = new WeakReference<>(vm);
        this.mNoticeRepoWR = weakReference;
        NoticeRepo noticeRepo = weakReference.get();
        if (noticeRepo != null) {
            noticeRepo.preLoad();
        }
        d();
        return this;
    }

    @NotNull
    public final NoticeBarView setOnReadMore(@NotNull Function2<? super String, ? super String, ? extends Object> onReadMore) {
        KTViewExtensionKt.singleClick((TextView) findViewById(R.id.wl_notice_more), new a(onReadMore));
        return this;
    }

    @NotNull
    public final NoticeBarView setTypeList(@NotNull List<? extends NoticeActionType> dataList) {
        this.typeList = dataList;
        return this;
    }

    public NoticeBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanShow = true;
        LayoutInflater.from(context).inflate(R.layout.wl_view_notice, this);
        gone();
    }
}
