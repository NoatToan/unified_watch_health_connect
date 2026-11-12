package com.xiaomi.fitness.share.report.holder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.share.report.EditSportReportCustomShareActivity;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.holder.ShareMethodTabHolder$onTabSelectedListener$1;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.bsi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.s4m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"com/xiaomi/fitness/share/report/holder/ShareMethodTabHolder$onTabSelectedListener$1", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$g;", FaceSchema.FACE_PAGE_TAB, "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$g;)V", "onTabUnselected", "onTabReselected", "Landroidx/appcompat/widget/AppCompatTextView;", "downloadBtn", "Landroidx/appcompat/widget/AppCompatTextView;", "getDownloadBtn", "()Landroidx/appcompat/widget/AppCompatTextView;", "wechatBtn", "getWechatBtn", "momentsBtn", "getMomentsBtn", "moreBtn", "getMoreBtn", "", "showWechatShare", "Z", "getShowWechatShare", "()Z", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareMethodTabHolder$onTabSelectedListener$1 implements TabLayout.d {
    private final AppCompatTextView downloadBtn;
    private final AppCompatTextView momentsBtn;
    private final AppCompatTextView moreBtn;
    private final boolean showWechatShare;
    final /* synthetic */ ShareMethodTabHolder this$0;
    private final AppCompatTextView wechatBtn;

    public ShareMethodTabHolder$onTabSelectedListener$1(ShareMethodTabHolder shareMethodTabHolder) {
        this.this$0 = shareMethodTabHolder;
        View viewFindViewById = shareMethodTabHolder.shareBtnGroup.findViewById(bsi.M5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.downloadBtn = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = shareMethodTabHolder.shareBtnGroup.findViewById(bsi.S5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.wechatBtn = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = shareMethodTabHolder.shareBtnGroup.findViewById(bsi.R5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.momentsBtn = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = shareMethodTabHolder.shareBtnGroup.findViewById(bsi.O5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.moreBtn = (AppCompatTextView) viewFindViewById4;
        this.showWechatShare = !AppUtil.INSTANCE.isPlayChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$0(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapDownload(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$1(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapShareToWechat(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$10(ShareMethodTabHolder this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportBasicReport unused = this$0.sportReport;
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", this$0.sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", this$0.sportReport);
        bundle.putInt("sport_type", i);
        Intent intent = new Intent(this$0.activity, (Class<?>) SharePathVideoAmapActivity.class);
        intent.putExtras(bundle);
        this$0.activity.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$12(final ShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.generateShareBitmapFromShareViewPager(this$0.shareViewPager, new Function1() { // from class: h6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$12$lambda$11(this$0, (Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$12$lambda$11(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onBitmapDownload(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$14(final ShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.generateShareBitmapFromShareViewPager(this$0.shareViewPager, new Function1() { // from class: g6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$14$lambda$13(this$0, (Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$14$lambda$13(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onBitmapShareToWechat(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$16(final ShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.generateShareBitmapFromShareViewPager(this$0.shareViewPager, new Function1() { // from class: f6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$16$lambda$15(this$0, (Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$16$lambda$15(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onBitmapShareToMoments(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$18(final ShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.generateShareBitmapFromShareViewPager(this$0.shareViewPager, new Function1() { // from class: e6m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$18$lambda$17(this$0, (Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$18$lambda$17(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onBitmapShareViaMore(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$2(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapShareToMoments(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$3(ShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapShareViaMore(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$4(ShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.activity, (Class<?>) EditSportReportCustomShareActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", this$0.sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", this$0.sportReport);
        ViewPager2 viewPager2 = (ViewPager2) this$0.shareViewPager.findViewWithTag("customize_share_view_pager");
        if (viewPager2 != null) {
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAM_REPORT_SHARE_CUSTOMIZED_BG_INDEX, viewPager2.getCurrentItem());
        }
        bundle.putInt("sport_type", lp5.a(this$0.sportReport));
        intent.putExtras(bundle);
        this$0.activity.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$5(ShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(str);
        SportReportShareExtKt.onViewDownload(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$6(ShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(str);
        SportReportShareExtKt.onViewShareToWechat(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$7(ShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(str);
        SportReportShareExtKt.onViewShareToMoments(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$8(ShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareViaMore(this$0.activity, cardViewFindCurtCardViewInShareViewViewPager);
        return Unit.INSTANCE;
    }

    public final AppCompatTextView getDownloadBtn() {
        return this.downloadBtn;
    }

    public final AppCompatTextView getMomentsBtn() {
        return this.momentsBtn;
    }

    public final AppCompatTextView getMoreBtn() {
        return this.moreBtn;
    }

    public final boolean getShowWechatShare() {
        return this.showWechatShare;
    }

    public final AppCompatTextView getWechatBtn() {
        return this.wechatBtn;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabReselected(TabLayout.g tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabSelected(TabLayout.g tab) {
        final Bitmap bitmapByUriStr;
        Logger.i("ShareMethodHolder", "addOnTabSelectedListener position=" + (tab != null ? Integer.valueOf(tab.g()) : null));
        this.this$0.mViewModel.setCurtTabPosition(tab != null ? tab.g() : 0);
        Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ViewExtKt.gone(this.this$0.editBtn);
            if (this.this$0.longPicBitmapUriStr == null || (bitmapByUriStr = SportReportShareExtKt.getBitmapByUriStr(this.this$0.longPicBitmapUriStr)) == null) {
                return;
            }
            AppCompatTextView appCompatTextView = this.downloadBtn;
            final ShareMethodTabHolder shareMethodTabHolder = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView, false, new Function0() { // from class: z5m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$0(shareMethodTabHolder, bitmapByUriStr);
                }
            }, 1, null);
            AppCompatTextView appCompatTextView2 = this.wechatBtn;
            boolean z = this.showWechatShare;
            final ShareMethodTabHolder shareMethodTabHolder2 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect(appCompatTextView2, z, new Function0() { // from class: m6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$1(shareMethodTabHolder2, bitmapByUriStr);
                }
            });
            AppCompatTextView appCompatTextView3 = this.momentsBtn;
            boolean z2 = this.showWechatShare;
            final ShareMethodTabHolder shareMethodTabHolder3 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect(appCompatTextView3, z2, new Function0() { // from class: n6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$2(shareMethodTabHolder3, bitmapByUriStr);
                }
            });
            AppCompatTextView appCompatTextView4 = this.moreBtn;
            final ShareMethodTabHolder shareMethodTabHolder4 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView4, false, new Function0() { // from class: o6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$3(shareMethodTabHolder4, bitmapByUriStr);
                }
            }, 1, null);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 1) {
            if (AppUtil.INSTANCE.isPlayChannel()) {
                ViewExtKt.gone(this.this$0.editBtn);
            } else {
                ViewExtKt.visible(this.this$0.editBtn);
                this.this$0.editBtn.setText(j1j.P6);
                final int iA = lp5.a(this.this$0.sportReport);
                TextView textView = this.this$0.editBtn;
                final ShareMethodTabHolder shareMethodTabHolder5 = this.this$0;
                SportReportShareExtKt.listenOnClickWithPressEffect$default(textView, false, new Function0() { // from class: d6m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$10(shareMethodTabHolder5, iA);
                    }
                }, 1, null);
            }
            AppCompatTextView appCompatTextView5 = this.downloadBtn;
            final ShareMethodTabHolder shareMethodTabHolder6 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView5, false, new Function0() { // from class: i6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$12(shareMethodTabHolder6);
                }
            }, 1, null);
            AppCompatTextView appCompatTextView6 = this.wechatBtn;
            boolean z3 = this.showWechatShare;
            final ShareMethodTabHolder shareMethodTabHolder7 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect(appCompatTextView6, z3, new Function0() { // from class: j6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$14(shareMethodTabHolder7);
                }
            });
            AppCompatTextView appCompatTextView7 = this.momentsBtn;
            boolean z4 = this.showWechatShare;
            final ShareMethodTabHolder shareMethodTabHolder8 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect(appCompatTextView7, z4, new Function0() { // from class: k6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$16(shareMethodTabHolder8);
                }
            });
            AppCompatTextView appCompatTextView8 = this.moreBtn;
            final ShareMethodTabHolder shareMethodTabHolder9 = this.this$0;
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView8, false, new Function0() { // from class: l6m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$18(shareMethodTabHolder9);
                }
            }, 1, null);
            return;
        }
        ViewExtKt.visible(this.this$0.editBtn);
        this.this$0.editBtn.setText(j1j.q4);
        TextView textView2 = this.this$0.editBtn;
        final ShareMethodTabHolder shareMethodTabHolder10 = this.this$0;
        SportReportShareExtKt.listenOnClickWithPressEffect$default(textView2, false, new Function0() { // from class: p6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$4(shareMethodTabHolder10);
            }
        }, 1, null);
        final s4m s4mVar = new s4m(this.this$0.activity);
        final String strC = lp5.c(this.this$0.sportReport.getSportType());
        final String string = ResourceExtKt.getString(j1j.k2);
        AppCompatTextView appCompatTextView9 = this.downloadBtn;
        final ShareMethodTabHolder shareMethodTabHolder11 = this.this$0;
        SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView9, false, new Function0() { // from class: q6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$5(shareMethodTabHolder11, s4mVar, string, strC);
            }
        }, 1, null);
        AppCompatTextView appCompatTextView10 = this.wechatBtn;
        boolean z5 = this.showWechatShare;
        final ShareMethodTabHolder shareMethodTabHolder12 = this.this$0;
        SportReportShareExtKt.listenOnClickWithPressEffect(appCompatTextView10, z5, new Function0() { // from class: a6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$6(shareMethodTabHolder12, s4mVar, string, strC);
            }
        });
        AppCompatTextView appCompatTextView11 = this.momentsBtn;
        boolean z6 = this.showWechatShare;
        final ShareMethodTabHolder shareMethodTabHolder13 = this.this$0;
        SportReportShareExtKt.listenOnClickWithPressEffect(appCompatTextView11, z6, new Function0() { // from class: b6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$7(shareMethodTabHolder13, s4mVar, string, strC);
            }
        });
        AppCompatTextView appCompatTextView12 = this.moreBtn;
        final ShareMethodTabHolder shareMethodTabHolder14 = this.this$0;
        SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView12, false, new Function0() { // from class: c6m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareMethodTabHolder$onTabSelectedListener$1.onTabSelected$lambda$8(shareMethodTabHolder14);
            }
        }, 1, null);
        Logger.i("ShareMethodHolder", "tab switch category=自定义分享");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void onTabUnselected(TabLayout.g tab) {
    }
}
