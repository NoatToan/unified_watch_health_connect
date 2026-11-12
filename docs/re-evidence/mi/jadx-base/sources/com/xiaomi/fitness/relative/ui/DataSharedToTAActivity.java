package com.xiaomi.fitness.relative.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.ui.DataSharedToTAActivity;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import defpackage.av6;
import defpackage.dgk;
import defpackage.t0j;
import defpackage.vji;
import defpackage.xui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/DataSharedToTAActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Ldgk;", "", "showConfirmationDialogIfNeedAndSendRequest", "()V", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "selectedList", "sendUpdateSharedDataTypesRequest", "(Ljava/util/List;)V", "newList", "showAuthDataRevisedConfirmationDialog", "homeDataTypeList", "showAllAuthDataDeletedConfirmationDialog", "initAdapter", Constants.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "", "relativeUid", "Ljava/lang/Long;", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "shareDataListAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "deleteAllConfirmationDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "revisedConfirmationDialog", "oldList", "Ljava/util/List;", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DataSharedToTAActivity extends Hilt_DataSharedToTAActivity<RelativeCareViewModel, dgk> {

    @NotNull
    public static final String TAG = "ShareDataToRelativeActivity";

    @Nullable
    private CommonDialog<?> deleteAllConfirmationDialog;
    private final int layoutId = xui.o;

    @Nullable
    private List<? extends HomeDataType> oldList;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private Long relativeUid;

    @Nullable
    private CommonDialog<?> revisedConfirmationDialog;

    @Nullable
    private ShareDataListAdapter shareDataListAdapter;
    private final int viewModelId;

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
    public static final void onCreate$lambda$0(DataSharedToTAActivity this$0, CompoundButton compoundButton, boolean z) {
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
    public static final Unit onCreate$lambda$2(final DataSharedToTAActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RelativeCareUtil.INSTANCE.checkHealthCloudSynchronizationAndProceedIfNeed(this$0, new Function0() { // from class: wo5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DataSharedToTAActivity.onCreate$lambda$2$lambda$1(this.f38190a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2$lambda$1(DataSharedToTAActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showConfirmationDialogIfNeedAndSendRequest();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(DataSharedToTAActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestData();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.getSharedDataTypesToRelativeLiveData(l.longValue()).observe(this, new DataSharedToTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: so5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DataSharedToTAActivity.requestData$lambda$7(this.f33832a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestData$lambda$7(final DataSharedToTAActivity this$0, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            this$0.oldList = (List) relativeResult.getData();
            Object obj = (List) relativeResult.getData();
            if (obj == null) {
                obj = AbstractJsonLexerKt.NULL;
            }
            Logger.i(TAG, "getSharedDataTypesToRelativeLiveData itemList=" + obj);
            ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
            if (shareDataListAdapter != null) {
                shareDataListAdapter.updateSelectedItemList((222 & 1) != 0 ? shareDataListAdapter.allDisplayItems : (List) relativeResult.getData(), (222 & 2) != 0 ? null : null, (222 & 4) != 0 ? null : null, (222 & 8) == 0 ? null : null, (222 & 16) != 0 ? 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: INVOKE 
                      (r3v2 'shareDataListAdapter' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter)
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0002: ARITH (222 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0007: IGET (r3v2 'shareDataListAdapter' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter) A[WRAPPED] com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.allDisplayItems java.util.List) : (wrap java.util.List:0x003e: CHECK_CAST (java.util.List) (wrap java.lang.Object:0x0039: INVOKE (r17v0 'relativeResult' com.xiaomi.fitness.relative.export.RelativeResult) VIRTUAL call: com.xiaomi.fitness.relative.export.RelativeResult.getData():java.lang.Object A[MD:():T (m), WRAPPED])))
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x000c: ARITH (222 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (null java.util.List))
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0014: ARITH (222 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (null java.util.List))
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x001b: ARITH (222 int) & (8 int) A[WRAPPED]) == (0 int)) ? (null java.util.List) : (null java.util.List))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0021: ARITH (222 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0027: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: c5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x002d: ARITH (222 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: e5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0039: ARITH (222 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: f5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0045: ARITH (222 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x004b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: g5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0051: ARITH (222 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0057: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: h5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0042: CONSTRUCTOR (r16v0 'this$0' com.xiaomi.fitness.relative.ui.DataSharedToTAActivity A[DONT_INLINE]) A[MD:(com.xiaomi.fitness.relative.ui.DataSharedToTAActivity):void (m), WRAPPED] call: uo5.<init>(com.xiaomi.fitness.relative.ui.DataSharedToTAActivity):void type: CONSTRUCTOR))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x005d: ARITH (222 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: i5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0047: CONSTRUCTOR (r16v0 'this$0' com.xiaomi.fitness.relative.ui.DataSharedToTAActivity A[DONT_INLINE]) A[MD:(com.xiaomi.fitness.relative.ui.DataSharedToTAActivity):void (m), WRAPPED] call: vo5.<init>(com.xiaomi.fitness.relative.ui.DataSharedToTAActivity):void type: CONSTRUCTOR))
                     VIRTUAL call: com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList(java.util.List, java.util.List, java.util.List, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void A[MD:(java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] in method: com.xiaomi.fitness.relative.ui.DataSharedToTAActivity.requestData$lambda$7(com.xiaomi.fitness.relative.ui.DataSharedToTAActivity, com.xiaomi.fitness.relative.export.RelativeResult):kotlin.Unit, file: classes9.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    	... 27 more
                    */
                /*
                    r0 = r16
                    java.lang.String r1 = "this$0"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    boolean r1 = r17.isSuccess()
                    java.lang.String r2 = "ShareDataToRelativeActivity"
                    if (r1 == 0) goto L73
                    java.lang.Object r1 = r17.getData()
                    java.util.List r1 = (java.util.List) r1
                    r0.oldList = r1
                    java.lang.Object r1 = r17.getData()
                    java.util.List r1 = (java.util.List) r1
                    if (r1 != 0) goto L21
                    java.lang.String r1 = "null"
                L21:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "getSharedDataTypesToRelativeLiveData itemList="
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    com.xiaomi.fitness.common.log.Logger.i(r2, r1)
                    com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter r3 = r0.shareDataListAdapter
                    if (r3 == 0) goto L57
                    java.lang.Object r1 = r17.getData()
                    r4 = r1
                    java.util.List r4 = (java.util.List) r4
                    uo5 r12 = new uo5
                    r12.<init>()
                    vo5 r13 = new vo5
                    r13.<init>()
                    r14 = 254(0xfe, float:3.56E-43)
                    r15 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                L57:
                    androidx.databinding.ViewDataBinding r0 = r16.getMBinding()
                    dgk r0 = (defpackage.dgk) r0
                    android.widget.CheckBox r0 = r0.F
                    com.xiaomi.fitness.relative.ui.util.RelativeCareUtil r1 = com.xiaomi.fitness.relative.ui.util.RelativeCareUtil.INSTANCE
                    java.lang.Object r2 = r17.getData()
                    java.util.List r2 = (java.util.List) r2
                    java.util.List r3 = r1.constructRelativeCareShareableDataTypeList()
                    boolean r1 = r1.hasSameAuthData(r2, r3)
                    r0.setChecked(r1)
                    goto L90
                L73:
                    int r1 = defpackage.t0j.e0
                    com.xiaomi.fitness.common.extensions.ToastExtKt.toastShort(r0, r1)
                    int r0 = r17.getErrorCode()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "getSharedDataTypesToRelativeLiveData failed errorCode="
                    r1.append(r3)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.xiaomi.fitness.common.log.Logger.i(r2, r0)
                L90:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.relative.ui.DataSharedToTAActivity.requestData$lambda$7(com.xiaomi.fitness.relative.ui.DataSharedToTAActivity, com.xiaomi.fitness.relative.export.RelativeResult):kotlin.Unit");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit requestData$lambda$7$lambda$5(DataSharedToTAActivity this$0) {
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
            public static final Unit requestData$lambda$7$lambda$6(DataSharedToTAActivity this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((dgk) this$0.getMBinding()).F.setChecked(false);
                ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
                if (shareDataListAdapter != null) {
                    shareDataListAdapter.setSelectAllBtnControlledByDirectClick(true);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public final void sendUpdateSharedDataTypesRequest(List<? extends HomeDataType> selectedList) {
                RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
                Long l = this.relativeUid;
                Intrinsics.checkNotNull(l);
                relativeCareViewModel.updateSharedDataTypes(l.longValue(), selectedList).observe(this, new DataSharedToTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xo5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DataSharedToTAActivity.sendUpdateSharedDataTypesRequest$lambda$3(this.f39305a, (RelativeResult) obj);
                    }
                }));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit sendUpdateSharedDataTypesRequest$lambda$3(DataSharedToTAActivity this$0, RelativeResult relativeResult) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (relativeResult.isSuccess()) {
                    this$0.finish();
                } else {
                    ToastExtKt.toastShort(this$0, t0j.e0);
                    Logger.i(TAG, "updateSharedDataTypes failed. ErrorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
                }
                return Unit.INSTANCE;
            }

            private final void showAllAuthDataDeletedConfirmationDialog(final List<? extends HomeDataType> homeDataTypeList) {
                CommonDialog<?> commonDialog = this.deleteAllConfirmationDialog;
                if (commonDialog == null || !commonDialog.isShowing()) {
                    if (this.deleteAllConfirmationDialog == null) {
                        this.deleteAllConfirmationDialog = new CommonDialog.c("auth_data_all_deleted_confirm").setDialogDescription(t0j.v).setPositiveText(t0j.c).setNegativeText(t0j.f34174b).setCancelable(true).create();
                    }
                    CommonDialog<?> commonDialog2 = this.deleteAllConfirmationDialog;
                    Intrinsics.checkNotNull(commonDialog2 != null ? commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.relative.ui.DataSharedToTAActivity.showAllAuthDataDeletedConfirmationDialog.1
                        @Override // defpackage.av6
                        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                            Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                            Intrinsics.checkNotNullParameter(dialog, "dialog");
                            super.onDialogClick(dialogName, dialog, which);
                            if (which == -1) {
                                DataSharedToTAActivity.this.sendUpdateSharedDataTypesRequest(homeDataTypeList);
                            }
                        }
                    }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
                    CommonDialog<?> commonDialog3 = this.deleteAllConfirmationDialog;
                    if (commonDialog3 != null) {
                        commonDialog3.showIfNeed(getSupportFragmentManager());
                    }
                }
            }

            private final void showAuthDataRevisedConfirmationDialog(final List<? extends HomeDataType> newList) {
                CommonDialog<?> commonDialog = this.revisedConfirmationDialog;
                if (commonDialog == null || !commonDialog.isShowing()) {
                    if (this.revisedConfirmationDialog == null) {
                        this.revisedConfirmationDialog = new CommonDialog.c("auth_data_revision_confirm").setDialogDescription(t0j.p).setPositiveText(t0j.c).setNegativeText(t0j.f34174b).setCancelable(true).create();
                    }
                    CommonDialog<?> commonDialog2 = this.revisedConfirmationDialog;
                    Intrinsics.checkNotNull(commonDialog2 != null ? commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.relative.ui.DataSharedToTAActivity.showAuthDataRevisedConfirmationDialog.1
                        @Override // defpackage.av6
                        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                            super.onDialogClick(dialogName, dialog, which);
                            if (which == -1) {
                                DataSharedToTAActivity.this.sendUpdateSharedDataTypesRequest(newList);
                            }
                        }
                    }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
                    CommonDialog<?> commonDialog3 = this.revisedConfirmationDialog;
                    if (commonDialog3 != null) {
                        commonDialog3.showIfNeed(getSupportFragmentManager());
                    }
                }
            }

            private final void showConfirmationDialogIfNeedAndSendRequest() {
                ShareDataListAdapter shareDataListAdapter = this.shareDataListAdapter;
                Intrinsics.checkNotNull(shareDataListAdapter);
                List<HomeDataType> allSelectedHomeDataTypeList = shareDataListAdapter.getAllSelectedHomeDataTypeList();
                Logger.d(TAG, "homeDataTypeList=" + allSelectedHomeDataTypeList);
                boolean zHasSameAuthData = RelativeCareUtil.INSTANCE.hasSameAuthData(this.oldList, allSelectedHomeDataTypeList) ^ true;
                Logger.d(TAG, "authDataContentRevised=" + zHasSameAuthData);
                if (zHasSameAuthData && allSelectedHomeDataTypeList.isEmpty()) {
                    showAllAuthDataDeletedConfirmationDialog(allSelectedHomeDataTypeList);
                } else if (zHasSameAuthData && (!allSelectedHomeDataTypeList.isEmpty())) {
                    showAuthDataRevisedConfirmationDialog(allSelectedHomeDataTypeList);
                } else {
                    ToastExtKt.toastShort(this, t0j.n);
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
            @Override // com.xiaomi.fitness.relative.ui.Hilt_DataSharedToTAActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
            public void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                this.recyclerView = ((dgk) getMBinding()).D;
                Long lValueOf = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
                this.relativeUid = lValueOf;
                Logger.i(TAG, "relativeUid=" + lValueOf);
                Long l = this.relativeUid;
                if (l != null && l.longValue() == 0) {
                    ToastExtKt.toastShort(this, "relativeUid==0L");
                    return;
                }
                setTitle(t0j.F);
                setTitleBackground(vji.f36950b);
                UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
                initAdapter();
                ((dgk) getMBinding()).H.setText(t0j.D);
                ((dgk) getMBinding()).F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qo5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        DataSharedToTAActivity.onCreate$lambda$0(this.f31691a, compoundButton, z);
                    }
                });
                ViewExtKt.clickWithTrigger$default(((dgk) getMBinding()).A, 0L, new Function1() { // from class: ro5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DataSharedToTAActivity.onCreate$lambda$2(this.f32741a, (TextView) obj);
                    }
                }, 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
            public void onResume() {
                super.onResume();
                RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
                TextView noNetwork = ((dgk) getMBinding()).C;
                Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
                ConstraintLayout content = ((dgk) getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(content, "content");
                relativeCareUtil.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, content, new Function0() { // from class: to5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DataSharedToTAActivity.onResume$lambda$4(this.f34889a);
                    }
                });
            }
        }
