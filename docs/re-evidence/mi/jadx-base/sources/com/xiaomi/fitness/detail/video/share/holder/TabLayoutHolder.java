package com.xiaomi.fitness.detail.video.share.holder;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.detail.video.share.holder.TabLayoutHolder;
import com.xiaomi.fitness.detail.video.share.util.KeyboardUtil;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.amap.SharePathVideoViewModel;
import com.xiaomi.fitness.share.view.SportTraceDataView;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import defpackage.bsi;
import defpackage.dki;
import defpackage.hoi;
import defpackage.hqp;
import defpackage.j1j;
import defpackage.nde;
import defpackage.pqp;
import defpackage.rqp;
import defpackage.tqp;
import defpackage.zqp;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u0001:\u0001BB'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder;", "", "", "position", "", "switchTab", "(I)V", "switchPanel", "Lcom/google/android/material/tabs/TabLayout$g;", FaceSchema.FACE_PAGE_TAB, "", "isSelected", "onTabSelectedStatusChange", "(Lcom/google/android/material/tabs/TabLayout$g;Z)V", "Lkotlin/Function0;", "function", "setOnEditDetailSaveBtnCallback", "(Lkotlin/jvm/functions/Function0;)V", "setOnCancelBtnClickCallback", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "holder", "initHolder", "(Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;)V", "closeEditSection", "()V", "Landroid/app/Activity;", "context", "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", "Lhqp;", "mBinding", "Lhqp;", "getMBinding", "()Lhqp;", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "mViewModel", "Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;", "Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;", "editDetailPanelHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;", "onSaveBtnClickCallback", "Lkotlin/jvm/functions/Function0;", "onCancelBtnClickCallback", "Lzqp;", "tabLayoutBinding", "Lzqp;", "Lpqp;", "editDetailPanelBinding", "Lpqp;", "Lrqp;", "switchStylePanelBinding", "Lrqp;", "Ltqp;", "switchMusicPanelBinding", "Ltqp;", "Landroid/widget/ImageView;", "saveBtn", "Landroid/widget/ImageView;", "cancelBtn", "switchMusicPanelHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMusicPanelHolder;", "<init>", "(Landroid/app/Activity;Lhqp;Lcom/xiaomi/fitness/share/amap/SharePathVideoViewModel;Lcom/xiaomi/fitness/detail/video/share/holder/EditDetailPanelHolder;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTabLayoutHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabLayoutHolder.kt\ncom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n1872#2,3:155\n*S KotlinDebug\n*F\n+ 1 TabLayoutHolder.kt\ncom/xiaomi/fitness/detail/video/share/holder/TabLayoutHolder\n*L\n61#1:155,3\n*E\n"})
public final class TabLayoutHolder {

    @NotNull
    public static final String TAG = "TabLayoutHolder";

    @NotNull
    private final ImageView cancelBtn;

    @NotNull
    private final Activity context;

    @NotNull
    private final pqp editDetailPanelBinding;

    @NotNull
    private final EditDetailPanelHolder editDetailPanelHolder;

    @NotNull
    private final hqp mBinding;

    @NotNull
    private final SharePathVideoViewModel mViewModel;

    @Nullable
    private Function0<Unit> onCancelBtnClickCallback;

    @Nullable
    private Function0<Unit> onSaveBtnClickCallback;

    @NotNull
    private final ImageView saveBtn;

    @NotNull
    private final tqp switchMusicPanelBinding;

    @Nullable
    private SwitchMusicPanelHolder switchMusicPanelHolder;

    @NotNull
    private final rqp switchStylePanelBinding;

    @NotNull
    private final zqp tabLayoutBinding;

    public TabLayoutHolder(@NotNull Activity context, @NotNull hqp mBinding, @NotNull SharePathVideoViewModel mViewModel, @NotNull EditDetailPanelHolder editDetailPanelHolder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(editDetailPanelHolder, "editDetailPanelHolder");
        this.context = context;
        this.mBinding = mBinding;
        this.mViewModel = mViewModel;
        this.editDetailPanelHolder = editDetailPanelHolder;
        zqp tabLayout = mBinding.O;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        this.tabLayoutBinding = tabLayout;
        pqp editDetailView = mBinding.A;
        Intrinsics.checkNotNullExpressionValue(editDetailView, "editDetailView");
        this.editDetailPanelBinding = editDetailView;
        rqp switchMapView = mBinding.M;
        Intrinsics.checkNotNullExpressionValue(switchMapView, "switchMapView");
        this.switchStylePanelBinding = switchMapView;
        tqp switchMusicView = mBinding.N;
        Intrinsics.checkNotNullExpressionValue(switchMusicView, "switchMusicView");
        this.switchMusicPanelBinding = switchMusicView;
        ImageView done = editDetailView.D;
        Intrinsics.checkNotNullExpressionValue(done, "done");
        this.saveBtn = done;
        ImageView cancel = editDetailView.C;
        Intrinsics.checkNotNullExpressionValue(cancel, "cancel");
        this.cancelBtn = cancel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$1(TabLayoutHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = this$0.onSaveBtnClickCallback;
        if (function0 != null) {
            function0.invoke();
        }
        this$0.switchTab(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$2(TabLayoutHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = this$0.onCancelBtnClickCallback;
        if (function0 != null) {
            function0.invoke();
        }
        SwitchMusicPanelHolder switchMusicPanelHolder = this$0.switchMusicPanelHolder;
        if (switchMusicPanelHolder != null) {
            switchMusicPanelHolder.stopMusic();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabSelectedStatusChange(TabLayout.g tab, boolean isSelected) {
        TextPaint paint;
        View viewE;
        TextView textView = (tab == null || (viewE = tab.e()) == null) ? null : (TextView) viewE.findViewById(bsi.p7);
        if (textView != null && (paint = textView.getPaint()) != null) {
            paint.setFakeBoldText(isSelected);
        }
        int i = isSelected ? dki.m2 : dki.g2;
        if (textView != null) {
            textView.setTextColor(ResourceExtKt.getResourceColor(this.context, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchPanel(int position) {
        if (position == 0) {
            View root = this.editDetailPanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.setVisible(root, position == 0);
            View root2 = this.editDetailPanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            View root3 = this.switchStylePanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            View root4 = this.switchMusicPanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
            SportTraceVideoShareUtilKt.fadeInFadeOut(root2, root3, root4);
            return;
        }
        if (position == 1) {
            View root5 = this.switchStylePanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root5, "getRoot(...)");
            ViewExtKt.setVisible(root5, position == 1);
            View root6 = this.switchStylePanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root6, "getRoot(...)");
            View root7 = this.editDetailPanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root7, "getRoot(...)");
            View root8 = this.switchMusicPanelBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root8, "getRoot(...)");
            SportTraceVideoShareUtilKt.fadeInFadeOut(root6, root7, root8);
            return;
        }
        if (position != 2) {
            return;
        }
        View root9 = this.switchMusicPanelBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root9, "getRoot(...)");
        ViewExtKt.setVisible(root9, position == 2);
        SwitchMusicPanelHolder switchMusicPanelHolder = this.switchMusicPanelHolder;
        if (switchMusicPanelHolder != null) {
            switchMusicPanelHolder.refreshMusicList();
        }
        View root10 = this.switchMusicPanelBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root10, "getRoot(...)");
        View root11 = this.switchStylePanelBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root11, "getRoot(...)");
        View root12 = this.editDetailPanelBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root12, "getRoot(...)");
        SportTraceVideoShareUtilKt.fadeInFadeOut(root10, root11, root12);
    }

    private final void switchTab(int position) {
        TabLayout.g gVarX = this.tabLayoutBinding.A.x(position);
        if (gVarX != null) {
            gVarX.m();
        }
        switchPanel(position);
        SwitchMusicPanelHolder switchMusicPanelHolder = this.switchMusicPanelHolder;
        if (switchMusicPanelHolder != null) {
            switchMusicPanelHolder.stopMusic();
        }
    }

    public final void closeEditSection() {
        ConstraintLayout editPanel = this.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
        ViewExtKt.gone(editPanel);
        SportTraceDataView sportTrackDataView = this.mBinding.L;
        Intrinsics.checkNotNullExpressionValue(sportTrackDataView, "sportTrackDataView");
        ViewExtKt.visible(sportTrackDataView);
        this.mBinding.G.setVisibility(0);
        KeyboardUtil.INSTANCE.showSoftInputMethod(this.context, this.mBinding.B, false);
    }

    @NotNull
    public final Activity getContext() {
        return this.context;
    }

    @NotNull
    public final hqp getMBinding() {
        return this.mBinding;
    }

    @NotNull
    public final SharePathVideoViewModel getMViewModel() {
        return this.mViewModel;
    }

    public final void initHolder(@NotNull SwitchMusicPanelHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.switchMusicPanelHolder = holder;
        int i = 0;
        for (Object obj : CollectionsKt__CollectionsKt.mutableListOf(new Pair(Integer.valueOf(j1j.f5), Integer.valueOf(hoi.e2)), new Pair(Integer.valueOf(j1j.m5), Integer.valueOf(hoi.f2)), new Pair(Integer.valueOf(j1j.I5), Integer.valueOf(hoi.g2)))) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            TabLayout.g gVarA = this.tabLayoutBinding.A.A();
            Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
            nde ndeVarA0 = nde.A0(this.context.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(ndeVarA0, "inflate(...)");
            ndeVarA0.A.setText(((Number) pair.getFirst()).intValue());
            ndeVarA0.A.setContentDescription(ResourceExtKt.getString(((Number) pair.getFirst()).intValue()));
            ndeVarA0.A.setCompoundDrawablesWithIntrinsicBounds(ResourceExtKt.getResourceDrawable(this.context, ((Number) pair.getSecond()).intValue()), (Drawable) null, (Drawable) null, (Drawable) null);
            gVarA.p(ndeVarA0.getRoot());
            if (i == 0) {
                gVarA.m();
            }
            onTabSelectedStatusChange(gVarA, gVarA.k());
            this.tabLayoutBinding.A.c(gVarA);
            i = i2;
        }
        this.tabLayoutBinding.A.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.detail.video.share.holder.TabLayoutHolder.initHolder.2
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                TabLayoutHolder.this.tabLayoutBinding.A.F(tab);
                TabLayoutHolder.this.onTabSelectedStatusChange(tab, true);
                TabLayoutHolder.this.switchPanel(tab != null ? tab.g() : 0);
                SwitchMusicPanelHolder switchMusicPanelHolder = TabLayoutHolder.this.switchMusicPanelHolder;
                if (switchMusicPanelHolder != null) {
                    switchMusicPanelHolder.stopMusic();
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
                TabLayoutHolder.this.onTabSelectedStatusChange(tab, false);
            }
        });
        ViewExtKt.clickWithTrigger$default(this.saveBtn, 0L, new Function1() { // from class: bzo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return TabLayoutHolder.initHolder$lambda$1(this.f4756a, (ImageView) obj2);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(this.cancelBtn, 0L, new Function1() { // from class: czo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return TabLayoutHolder.initHolder$lambda$2(this.f14894a, (ImageView) obj2);
            }
        }, 1, null);
    }

    public final void setOnCancelBtnClickCallback(@Nullable Function0<Unit> function) {
        this.onCancelBtnClickCallback = function;
    }

    public final void setOnEditDetailSaveBtnCallback(@Nullable Function0<Unit> function) {
        this.onSaveBtnClickCallback = function;
    }
}
