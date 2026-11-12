package com.xiaomi.fitness.relative.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import defpackage.av6;
import defpackage.dgk;
import defpackage.t0j;
import defpackage.vji;
import defpackage.xui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/DataAccessibleToTAActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Ldgk;", "", "confirm", "()V", "jumpToEditIdentityLabelDirectly", "showAuthDataNotSelectedConfirmationDialog", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "homeDataTypeList", "goToDataShareScopePage", "(Ljava/util/List;)V", "refreshAdapter", "initAdapter", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", LifecycleConstantKt.ON_RESUME, "", "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "shareDataListAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "confirmationDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "isAcceptanceProcess", "Z", "Ljava/util/List;", "", "origin", "Ljava/lang/String;", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DataAccessibleToTAActivity extends Hilt_DataAccessibleToTAActivity<RelativeCareViewModel, dgk> {

    @NotNull
    public static final String TAG = "DataAccessibleToTAActivity";

    @Nullable
    private CommonDialog<?> confirmationDialog;
    private boolean isAcceptanceProcess;

    @Nullable
    private String origin;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private ShareDataListAdapter shareDataListAdapter;
    private final int viewModelId;
    private final int layoutId = xui.o;

    @NotNull
    private List<? extends HomeDataType> homeDataTypeList = RelativeCareUtil.INSTANCE.constructRelativeCareShareableDataTypeList();

    private final void confirm() {
        ShareDataListAdapter shareDataListAdapter = this.shareDataListAdapter;
        Intrinsics.checkNotNull(shareDataListAdapter);
        List<HomeDataType> allSelectedHomeDataTypeList = shareDataListAdapter.getAllSelectedHomeDataTypeList();
        this.homeDataTypeList = allSelectedHomeDataTypeList;
        if (this.isAcceptanceProcess) {
            if (allSelectedHomeDataTypeList.isEmpty()) {
                ToastExtKt.toastShort(this, t0j.t0);
                return;
            } else {
                goToDataShareScopePage(this.homeDataTypeList);
                return;
            }
        }
        if (allSelectedHomeDataTypeList.isEmpty()) {
            showAuthDataNotSelectedConfirmationDialog();
        } else {
            goToDataShareScopePage(this.homeDataTypeList);
        }
    }

    private final void goToDataShareScopePage(List<? extends HomeDataType> homeDataTypeList) {
        Logger.i(TAG, "updateSharedDataTypes list=" + homeDataTypeList);
        Intent intent = new Intent(this, (Class<?>) TimeScopeAccessibleToTAActivity.class);
        intent.putExtras(getIntent());
        intent.putParcelableArrayListExtra(RelativeCareConstants.KEY_AUTH_DATA_LIST, new ArrayList<>(homeDataTypeList));
        intent.putExtra(RelativeCareConstants.KEY_IS_ACCEPTANCE_PROCESS, this.isAcceptanceProcess);
        intent.putExtra("origin", this.origin);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAdapter() {
        ShareDataListAdapter shareDataListAdapter = new ShareDataListAdapter(null, 1, 0 == true ? 1 : 0);
        this.shareDataListAdapter = shareDataListAdapter;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(shareDataListAdapter);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToEditIdentityLabelDirectly() {
        Intent intent = new Intent(this, (Class<?>) EditIdentityLabelActivity.class);
        intent.putExtras(getIntent());
        intent.putParcelableArrayListExtra(RelativeCareConstants.KEY_AUTH_DATA_LIST, new ArrayList<>(CollectionsKt__CollectionsKt.emptyList()));
        intent.putExtra(RelativeCareConstants.KEY_IS_ACCEPTANCE_PROCESS, this.isAcceptanceProcess);
        intent.putExtra("origin", this.origin);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(DataAccessibleToTAActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
        if (shareDataListAdapter == null || !shareDataListAdapter.getSelectAllBtnControlledByDirectClick()) {
            return;
        }
        if (z) {
            ShareDataListAdapter shareDataListAdapter2 = this$0.shareDataListAdapter;
            if (shareDataListAdapter2 != null) {
                shareDataListAdapter2.selectAll();
                return;
            }
            return;
        }
        ShareDataListAdapter shareDataListAdapter3 = this$0.shareDataListAdapter;
        if (shareDataListAdapter3 != null) {
            shareDataListAdapter3.unselectAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DataAccessibleToTAActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.confirm();
        return Unit.INSTANCE;
    }

    private final void refreshAdapter() {
        ShareDataListAdapter shareDataListAdapter = this.shareDataListAdapter;
        if (shareDataListAdapter != null) {
            shareDataListAdapter.updateSelectedItemList((222 & 1) != 0 ? shareDataListAdapter.allDisplayItems : this.homeDataTypeList, (222 & 2) != 0 ? null : null, (222 & 4) != 0 ? null : null, (222 & 8) == 0 ? null : null, (222 & 16) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE 
                  (r0v0 'shareDataListAdapter' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter)
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x0002: ARITH (222 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0007: IGET (r0v0 'shareDataListAdapter' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter) A[WRAPPED] com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.allDisplayItems java.util.List) : (wrap java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>:0x0004: IGET (r13v0 'this' com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity.homeDataTypeList java.util.List))
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x000c: ARITH (222 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (null java.util.List))
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x0014: ARITH (222 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (null java.util.List))
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x001b: ARITH (222 int) & (8 int) A[WRAPPED]) == (0 int)) ? (null java.util.List) : (null java.util.List))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0021: ARITH (222 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0027: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: c5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x002d: ARITH (222 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: e5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0008: CONSTRUCTOR (r13v0 'this' com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) A[MD:(com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity):void (m), WRAPPED] call: jk5.<init>(com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity):void type: CONSTRUCTOR))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0039: ARITH (222 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: f5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0045: ARITH (222 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x004b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: g5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0051: ARITH (222 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0057: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: h5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x000d: CONSTRUCTOR (r13v0 'this' com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) A[MD:(com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity):void (m), WRAPPED] call: kk5.<init>(com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity):void type: CONSTRUCTOR))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x005d: ARITH (222 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: i5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0012: CONSTRUCTOR (r13v0 'this' com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) A[MD:(com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity):void (m), WRAPPED] call: lk5.<init>(com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity):void type: CONSTRUCTOR))
                 VIRTUAL call: com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList(java.util.List, java.util.List, java.util.List, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void A[MD:(java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] in method: com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity.refreshAdapter():void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: c5m, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter r0 = r13.shareDataListAdapter
                if (r0 == 0) goto L21
                java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType> r1 = r13.homeDataTypeList
                jk5 r6 = new jk5
                r6.<init>()
                kk5 r9 = new kk5
                r9.<init>()
                lk5 r10 = new lk5
                r10.<init>()
                r11 = 222(0xde, float:3.11E-43)
                r12 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L21:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity.refreshAdapter():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit refreshAdapter$lambda$4(DataAccessibleToTAActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ((dgk) this$0.getMBinding()).F.setChecked(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit refreshAdapter$lambda$5(DataAccessibleToTAActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ((dgk) this$0.getMBinding()).F.setChecked(true);
            ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
            if (shareDataListAdapter != null) {
                shareDataListAdapter.setSelectAllBtnControlledByDirectClick(true);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit refreshAdapter$lambda$6(DataAccessibleToTAActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ((dgk) this$0.getMBinding()).F.setChecked(false);
            ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
            if (shareDataListAdapter != null) {
                shareDataListAdapter.setSelectAllBtnControlledByDirectClick(true);
            }
            return Unit.INSTANCE;
        }

        private final void showAuthDataNotSelectedConfirmationDialog() {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("auth_data_not_selected_confirm").setDialogDescription(t0j.o).setPositiveText(t0j.c).setNegativeText(t0j.f34174b).setCancelable(true).create();
            this.confirmationDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate != null ? commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity.showAuthDataNotSelectedConfirmationDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        DataAccessibleToTAActivity.this.jumpToEditIdentityLabelDirectly();
                    }
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            CommonDialog<?> commonDialog = this.confirmationDialog;
            if (commonDialog != null) {
                commonDialog.showIfNeed(getSupportFragmentManager());
            }
        }

        @Override // com.xiaomi.fitness.baseui.ViewCreator
        public int getLayoutId() {
            return this.layoutId;
        }

        @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
        public int getViewModelId() {
            return this.viewModelId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.fitness.relative.ui.Hilt_DataAccessibleToTAActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
        public void onCreate(@Nullable Bundle savedInstanceState) {
            List<HomeDataType> listConstructRelativeCareShareableDataTypeList;
            super.onCreate(savedInstanceState);
            this.isAcceptanceProcess = getIntent().getLongExtra(RelativeCareConstants.KEY_INVITE_ID, 0L) != 0;
            this.recyclerView = ((dgk) getMBinding()).D;
            setTitle(t0j.t);
            setTitleBackground(vji.f36950b);
            UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
            this.origin = getIntent().getStringExtra("origin");
            if (savedInstanceState != null) {
                ArrayList parcelableArrayList = savedInstanceState.getParcelableArrayList(RelativeCareConstants.KEY_AUTH_DATA_LIST);
                Logger.d(TAG, "savedInstanceState arrayList=" + parcelableArrayList);
                if (parcelableArrayList == null || (listConstructRelativeCareShareableDataTypeList = CollectionsKt___CollectionsKt.toList(parcelableArrayList)) == null) {
                    listConstructRelativeCareShareableDataTypeList = RelativeCareUtil.INSTANCE.constructRelativeCareShareableDataTypeList();
                }
                this.homeDataTypeList = listConstructRelativeCareShareableDataTypeList;
                Logger.d(TAG, "savedInstanceState homeDataTypeList=" + listConstructRelativeCareShareableDataTypeList);
            }
            initAdapter();
            if (this.isAcceptanceProcess) {
                ((dgk) getMBinding()).H.setText(t0j.B);
            } else {
                ((dgk) getMBinding()).H.setText(t0j.C);
            }
            ((dgk) getMBinding()).F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mk5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DataAccessibleToTAActivity.onCreate$lambda$0(this.f26947a, compoundButton, z);
                }
            });
            ((dgk) getMBinding()).A.setText(t0j.c);
            ViewExtKt.clickWithTrigger$default(((dgk) getMBinding()).A, 0L, new Function1() { // from class: nk5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataAccessibleToTAActivity.onCreate$lambda$1(this.f28003a, (TextView) obj);
                }
            }, 1, null);
        }

        @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
        public void onResume() {
            super.onResume();
            refreshAdapter();
        }

        @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
        public void onSaveInstanceState(@NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
            super.onSaveInstanceState(outState);
            outState.putParcelableArrayList(RelativeCareConstants.KEY_AUTH_DATA_LIST, new ArrayList<>(this.homeDataTypeList));
            Logger.d(TAG, "onSaveInstanceState homeDataTypeList=" + this.homeDataTypeList);
        }
    }
