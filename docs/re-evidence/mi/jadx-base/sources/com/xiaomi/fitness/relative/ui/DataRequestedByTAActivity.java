package com.xiaomi.fitness.relative.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import defpackage.dgk;
import defpackage.t0j;
import defpackage.vji;
import defpackage.xui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/DataRequestedByTAActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Ldgk;", "", "initAdapter", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "shareDataListAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "relativeUid", "Ljava/lang/Long;", "", "accountName", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "Lkotlin/collections/ArrayList;", "authDataArrayList", "Ljava/util/ArrayList;", "messageId", PkConstants.PARAM_INVITE_ID, "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DataRequestedByTAActivity extends Hilt_DataRequestedByTAActivity<RelativeCareViewModel, dgk> {

    @NotNull
    public static final String TAG = "DataRequestedByTAActivity";

    @Nullable
    private String accountName;

    @Nullable
    private ArrayList<HomeDataType> authDataArrayList;

    @Nullable
    private Long inviteId;
    private final int layoutId = xui.o;

    @Nullable
    private Long messageId;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private Long relativeUid;

    @Nullable
    private ShareDataListAdapter shareDataListAdapter;
    private final int viewModelId;

    private final void initAdapter() {
        ArrayList<HomeDataType> arrayList = this.authDataArrayList;
        Intrinsics.checkNotNull(arrayList);
        ShareDataListAdapter shareDataListAdapter = new ShareDataListAdapter(CollectionsKt___CollectionsKt.toList(arrayList));
        this.shareDataListAdapter = shareDataListAdapter;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(shareDataListAdapter);
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        }
        ShareDataListAdapter shareDataListAdapter2 = this.shareDataListAdapter;
        if (shareDataListAdapter2 != null) {
            ArrayList<HomeDataType> arrayList2 = this.authDataArrayList;
            Intrinsics.checkNotNull(arrayList2);
            shareDataListAdapter2.updateSelectedItemList((222 & 1) != 0 ? shareDataListAdapter2.allDisplayItems : CollectionsKt___CollectionsKt.toList(arrayList2), (222 & 2) != 0 ? null : null, (222 & 4) != 0 ? null : null, (222 & 8) == 0 ? null : null, (222 & 16) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: INVOKE 
                  (r2v0 'shareDataListAdapter2' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter)
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x0002: ARITH (222 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0007: IGET (r2v0 'shareDataListAdapter2' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter) A[WRAPPED] com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.allDisplayItems java.util.List) : (wrap java.util.List:0x002c: INVOKE (r0v2 'arrayList2' java.util.ArrayList<com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>) STATIC call: kotlin.collections.CollectionsKt___CollectionsKt.toList(java.lang.Iterable):java.util.List A[MD:<T>:(java.lang.Iterable<? extends T>):java.util.List<T> (m), WRAPPED]))
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x000c: ARITH (222 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (null java.util.List))
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x0014: ARITH (222 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (null java.util.List))
                  (wrap java.util.List:?: TERNARY null = ((wrap int:0x001b: ARITH (222 int) & (8 int) A[WRAPPED]) == (0 int)) ? (null java.util.List) : (null java.util.List))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0021: ARITH (222 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0027: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: c5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x002d: ARITH (222 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: e5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0039: ARITH (222 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: f5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0032: CONSTRUCTOR (r15v0 'this' com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) A[MD:(com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity):void (m), WRAPPED] call: un5.<init>(com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity):void type: CONSTRUCTOR))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0045: ARITH (222 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x004b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: g5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0037: CONSTRUCTOR (r15v0 'this' com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity A[DONT_INLINE, IMMUTABLE_TYPE, THIS]) A[MD:(com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity):void (m), WRAPPED] call: vn5.<init>(com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity):void type: CONSTRUCTOR))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0051: ARITH (222 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0057: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: h5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                  (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x005d: ARITH (222 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: i5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                 VIRTUAL call: com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList(java.util.List, java.util.List, java.util.List, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void A[MD:(java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] in method: com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity.initAdapter():void, file: classes9.dex
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
                com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter r0 = new com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter
                java.util.ArrayList<com.xiaomi.fit.fitness.export.data.annotation.HomeDataType> r1 = r15.authDataArrayList
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
                r0.<init>(r1)
                r15.shareDataListAdapter = r0
                androidx.recyclerview.widget.RecyclerView r1 = r15.recyclerView
                if (r1 == 0) goto L17
                r1.setAdapter(r0)
            L17:
                androidx.recyclerview.widget.RecyclerView r0 = r15.recyclerView
                if (r0 == 0) goto L23
                androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
                r1.<init>(r15)
                r0.setLayoutManager(r1)
            L23:
                com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter r2 = r15.shareDataListAdapter
                if (r2 == 0) goto L47
                java.util.ArrayList<com.xiaomi.fit.fitness.export.data.annotation.HomeDataType> r0 = r15.authDataArrayList
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.util.List r3 = kotlin.collections.CollectionsKt.toList(r0)
                un5 r9 = new un5
                r9.<init>()
                vn5 r10 = new vn5
                r10.<init>()
                r13 = 830(0x33e, float:1.163E-42)
                r14 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r11 = 0
                r12 = 0
                com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            L47:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity.initAdapter():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit initAdapter$lambda$2(DataRequestedByTAActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ((dgk) this$0.getMBinding()).A.setEnabled(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit initAdapter$lambda$3(DataRequestedByTAActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ((dgk) this$0.getMBinding()).A.setEnabled(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onCreate$lambda$1(final DataRequestedByTAActivity this$0, TextView it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
            Intrinsics.checkNotNull(shareDataListAdapter);
            List<HomeDataType> allSelectedHomeDataTypeList = shareDataListAdapter.getAllSelectedHomeDataTypeList();
            Logger.d(TAG, "confirmedList=" + allSelectedHomeDataTypeList);
            if (!NetworkUtils.isNetworkConnected(this$0)) {
                ToastExtKt.toastShort(this$0, t0j.d0);
                return Unit.INSTANCE;
            }
            RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) this$0.getMViewModel();
            Long l = this$0.relativeUid;
            Intrinsics.checkNotNull(l);
            long jLongValue = l.longValue();
            Long l2 = this$0.messageId;
            Intrinsics.checkNotNull(l2);
            long jLongValue2 = l2.longValue();
            Long l3 = this$0.inviteId;
            Intrinsics.checkNotNull(l3);
            long jLongValue3 = l3.longValue();
            ArrayList<HomeDataType> arrayList = this$0.authDataArrayList;
            Intrinsics.checkNotNull(arrayList);
            relativeCareViewModel.acceptAppliedSharedDataTypes(jLongValue, jLongValue2, jLongValue3, CollectionsKt___CollectionsKt.toList(arrayList), allSelectedHomeDataTypeList).observe(this$0, new DataRequestedByTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wn5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataRequestedByTAActivity.onCreate$lambda$1$lambda$0(this.f38157a, (RelativeResult) obj);
                }
            }));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCreate$lambda$1$lambda$0(DataRequestedByTAActivity this$0, RelativeResult relativeResult) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (relativeResult.isSuccess() && Intrinsics.areEqual(relativeResult.getData(), Boolean.TRUE)) {
                Logger.i(TAG, "acceptAppliedSharedDataTypes=true");
                this$0.startActivity(new Intent(this$0, (Class<?>) DataSharedSuccessfullyActivity.class));
                this$0.finish();
            } else {
                ToastExtKt.toastShort(this$0, t0j.e0);
                Logger.i(TAG, "acceptAppliedSharedDataTypes error. ErrorCode=" + relativeResult.getErrorCode() + " ErrorMsg=" + relativeResult.getErrorMsg());
            }
            return Unit.INSTANCE;
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
        @Override // com.xiaomi.fitness.relative.ui.Hilt_DataRequestedByTAActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
        public void onCreate(@Nullable Bundle savedInstanceState) {
            Long l;
            super.onCreate(savedInstanceState);
            this.accountName = getIntent().getStringExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME);
            this.relativeUid = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
            this.authDataArrayList = getIntent().getParcelableArrayListExtra(RelativeCareConstants.KEY_AUTH_DATA_LIST);
            this.messageId = Long.valueOf(getIntent().getLongExtra(RelativeCareConstants.KEY_MSG_ID, 0L));
            this.inviteId = Long.valueOf(getIntent().getLongExtra(RelativeCareConstants.KEY_INVITE_ID, 0L));
            Long l2 = this.relativeUid;
            if ((l2 == null || l2.longValue() != 0) && (((l = this.inviteId) == null || l.longValue() != 0) && this.authDataArrayList != null)) {
                this.recyclerView = ((dgk) getMBinding()).D;
                setTitle(t0j.z);
                setTitleBackground(vji.f36950b);
                UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
                initAdapter();
                ((dgk) getMBinding()).H.setText(getString(t0j.A, this.accountName));
                LinearLayout selectAll = ((dgk) getMBinding()).E;
                Intrinsics.checkNotNullExpressionValue(selectAll, "selectAll");
                ViewExtKt.invisible(selectAll);
                ((dgk) getMBinding()).A.setText(t0j.c);
                ViewExtKt.clickWithTrigger$default(((dgk) getMBinding()).A, 0L, new Function1() { // from class: xn5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DataRequestedByTAActivity.onCreate$lambda$1(this.f39275a, (TextView) obj);
                    }
                }, 1, null);
                return;
            }
            ToastExtKt.toastShort(this, t0j.common_load_fail);
            Long l3 = this.relativeUid;
            Long l4 = this.inviteId;
            Object obj = this.authDataArrayList;
            if (obj == null) {
                obj = AbstractJsonLexerKt.NULL;
            }
            Logger.i(TAG, "relativeUid=" + l3 + ", inviteId=" + l4 + " authDataArrayList=" + obj);
        }
    }
