package com.xiaomi.fitness.relative.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.ui.DataSharedByTAActivity;
import com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.dgk;
import defpackage.t0j;
import defpackage.vji;
import defpackage.xui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0006*\u0001.\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b1\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J7\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/DataSharedByTAActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Ldgk;", "", "initAdapter", "()V", Constants.KEY_REQUEST_DATA, "doRequestData", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "sharedItems", "otherItems", "getListUnion", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "oldList", "newList", "getAddedDataItemType", "listenToConnectionStatus", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "", "layoutId", "I", "getLayoutId", "()I", "viewModelId", "getViewModelId", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "shareDataListAdapter", "Lcom/xiaomi/fitness/relative/ui/recycler/ShareDataListAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "relativeUid", "Ljava/lang/Long;", "initedAuthDataList", "Ljava/util/List;", "", "origin", "Ljava/lang/String;", "com/xiaomi/fitness/relative/ui/DataSharedByTAActivity$serviceConnectionListener$1", "serviceConnectionListener", "Lcom/xiaomi/fitness/relative/ui/DataSharedByTAActivity$serviceConnectionListener$1;", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDataSharedByTAActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSharedByTAActivity.kt\ncom/xiaomi/fitness/relative/ui/DataSharedByTAActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n1863#2,2:243\n*S KotlinDebug\n*F\n+ 1 DataSharedByTAActivity.kt\ncom/xiaomi/fitness/relative/ui/DataSharedByTAActivity\n*L\n214#1:243,2\n*E\n"})
public final class DataSharedByTAActivity extends Hilt_DataSharedByTAActivity<RelativeCareViewModel, dgk> {

    @NotNull
    public static final String TAG = "DataSharedToRelativeActivity";

    @Nullable
    private List<? extends HomeDataType> initedAuthDataList;

    @Nullable
    private String origin;

    @Nullable
    private RecyclerView recyclerView;

    @Nullable
    private Long relativeUid;

    @Nullable
    private ShareDataListAdapter shareDataListAdapter;
    private final int viewModelId;
    private final int layoutId = xui.o;

    @NotNull
    private final DataSharedByTAActivity$serviceConnectionListener$1 serviceConnectionListener = new ServiceConnection() { // from class: com.xiaomi.fitness.relative.ui.DataSharedByTAActivity$serviceConnectionListener$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Logger.i(DataSharedByTAActivity.TAG, "onServiceConnected() called with: name = " + name + ", service = " + service);
            DataSharedByTAActivity.access$getMViewModel(this.this$0).getConnectionStatusLiveData().postValue(Boolean.TRUE);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            this.this$0.hideLoading();
            ToastExtKt.toastShort(this.this$0, t0j.g);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RelativeCareViewModel access$getMViewModel(DataSharedByTAActivity dataSharedByTAActivity) {
        return (RelativeCareViewModel) dataSharedByTAActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void doRequestData() {
        RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) getMViewModel();
        Long l = this.relativeUid;
        Intrinsics.checkNotNull(l);
        relativeCareViewModel.getSharedDataTypesToMeLiveData(l.longValue()).observe(this, new DataSharedByTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jo5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DataSharedByTAActivity.doRequestData$lambda$11(this.f22967a, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit doRequestData$lambda$11(final DataSharedByTAActivity this$0, final RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult.isSuccess()) {
            RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) this$0.getMViewModel();
            Long l = this$0.relativeUid;
            Intrinsics.checkNotNull(l);
            relativeCareViewModel.getAppliedSharedDataTypes(l.longValue()).observe(this$0, new DataSharedByTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fo5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataSharedByTAActivity.doRequestData$lambda$11$lambda$10(this.f17992a, relativeResult, (RelativeResult) obj);
                }
            }));
        } else {
            Logger.i(TAG, "getSharedDataTypesToMeLiveData failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doRequestData$lambda$11$lambda$10(final DataSharedByTAActivity this$0, RelativeResult relativeResult, RelativeResult relativeResult2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (relativeResult2.isSuccess()) {
            List<HomeDataType> listUnion = this$0.getListUnion((List) relativeResult.getData(), (List) relativeResult2.getData());
            ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
            if (shareDataListAdapter != null) {
                shareDataListAdapter.updateSelectedItemList((222 & 1) != 0 ? shareDataListAdapter.allDisplayItems : listUnion, (222 & 2) != 0 ? null : listUnion, (222 & 4) != 0 ? null : (List) relativeResult.getData(), (222 & 8) == 0 ? (List) relativeResult2.getData() : null, (222 & 16) != 0 ? 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: INVOKE 
                      (r4v1 'shareDataListAdapter' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter)
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0002: ARITH (222 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0007: IGET (r4v1 'shareDataListAdapter' com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter) A[WRAPPED] com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.allDisplayItems java.util.List) : (r6v0 'listUnion' java.util.List<com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>))
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x000c: ARITH (222 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 'listUnion' java.util.List<com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>))
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0014: ARITH (222 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (wrap java.util.List:0x0028: CHECK_CAST (java.util.List) (wrap java.lang.Object:0x0023: INVOKE (r18v0 'relativeResult' com.xiaomi.fitness.relative.export.RelativeResult) VIRTUAL call: com.xiaomi.fitness.relative.export.RelativeResult.getData():java.lang.Object A[MD:():T (m), WRAPPED])))
                      (wrap java.util.List:?: TERNARY null = ((wrap int:0x001b: ARITH (222 int) & (8 int) A[WRAPPED]) == (0 int)) ? (wrap java.util.List:0x002f: CHECK_CAST (java.util.List) (wrap java.lang.Object:0x002a: INVOKE (r19v0 'relativeResult2' com.xiaomi.fitness.relative.export.RelativeResult) VIRTUAL call: com.xiaomi.fitness.relative.export.RelativeResult.getData():java.lang.Object A[MD:():T (m), WRAPPED])) : (null java.util.List))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0021: ARITH (222 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0027: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: c5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0033: CONSTRUCTOR (r17v0 'this$0' com.xiaomi.fitness.relative.ui.DataSharedByTAActivity A[DONT_INLINE]) A[MD:(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity):void (m), WRAPPED] call: go5.<init>(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity):void type: CONSTRUCTOR))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x002d: ARITH (222 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: e5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0039: ARITH (222 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: f5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0045: ARITH (222 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x004b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: g5m.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0051: ARITH (222 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0057: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: h5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x0038: CONSTRUCTOR (r17v0 'this$0' com.xiaomi.fitness.relative.ui.DataSharedByTAActivity A[DONT_INLINE]) A[MD:(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity):void (m), WRAPPED] call: ho5.<init>(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity):void type: CONSTRUCTOR))
                      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x005d: ARITH (222 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap ??:0x0063: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: i5m.<init>():void type: CONSTRUCTOR) : (wrap kotlin.jvm.functions.Function0:0x003d: CONSTRUCTOR (r17v0 'this$0' com.xiaomi.fitness.relative.ui.DataSharedByTAActivity A[DONT_INLINE]) A[MD:(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity):void (m), WRAPPED] call: io5.<init>(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity):void type: CONSTRUCTOR))
                     VIRTUAL call: com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList(java.util.List, java.util.List, java.util.List, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void A[MD:(java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, java.util.List<? extends com.xiaomi.fit.fitness.export.data.annotation.HomeDataType>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] in method: com.xiaomi.fitness.relative.ui.DataSharedByTAActivity.doRequestData$lambda$11$lambda$10(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity, com.xiaomi.fitness.relative.export.RelativeResult, com.xiaomi.fitness.relative.export.RelativeResult):kotlin.Unit, file: classes9.dex
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
                    r0 = r17
                    java.lang.String r1 = "this$0"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                    boolean r1 = r19.isSuccess()
                    java.lang.String r2 = "DataSharedToRelativeActivity"
                    if (r1 == 0) goto L6c
                    java.lang.Object r1 = r18.getData()
                    java.util.List r1 = (java.util.List) r1
                    java.lang.Object r3 = r19.getData()
                    java.util.List r3 = (java.util.List) r3
                    java.util.List r6 = r0.getListUnion(r1, r3)
                    com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter r4 = r0.shareDataListAdapter
                    if (r4 == 0) goto L4b
                    java.lang.Object r1 = r18.getData()
                    r7 = r1
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Object r1 = r19.getData()
                    r8 = r1
                    java.util.List r8 = (java.util.List) r8
                    go5 r9 = new go5
                    r9.<init>()
                    ho5 r13 = new ho5
                    r13.<init>()
                    io5 r14 = new io5
                    r14.<init>()
                    r15 = 224(0xe0, float:3.14E-43)
                    r16 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r5 = r6
                    com.xiaomi.fitness.relative.ui.recycler.ShareDataListAdapter.updateSelectedItemList$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                L4b:
                    java.lang.Object r1 = r18.getData()
                    java.util.List r1 = (java.util.List) r1
                    r0.initedAuthDataList = r1
                    java.lang.Object r0 = r18.getData()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "requestData homeDataList="
                    r1.append(r3)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.xiaomi.fitness.common.log.Logger.i(r2, r0)
                    goto L90
                L6c:
                    int r0 = r19.getErrorCode()
                    java.lang.String r1 = r19.getErrorMsg()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "getAppliedSharedDataTypes failed. ErrorCode="
                    r3.append(r4)
                    r3.append(r0)
                    java.lang.String r0 = " ErrorMsg="
                    r3.append(r0)
                    r3.append(r1)
                    java.lang.String r0 = r3.toString()
                    com.xiaomi.fitness.common.log.Logger.i(r2, r0)
                L90:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.relative.ui.DataSharedByTAActivity.doRequestData$lambda$11$lambda$10(com.xiaomi.fitness.relative.ui.DataSharedByTAActivity, com.xiaomi.fitness.relative.export.RelativeResult, com.xiaomi.fitness.relative.export.RelativeResult):kotlin.Unit");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit doRequestData$lambda$11$lambda$10$lambda$7(final DataSharedByTAActivity this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((dgk) this$0.getMBinding()).F.setEnabled(false);
                ((dgk) this$0.getMBinding()).A.setEnabled(false);
                ViewExtKt.clickWithTrigger$default(((dgk) this$0.getMBinding()).A, 0L, new Function1() { // from class: co5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DataSharedByTAActivity.doRequestData$lambda$11$lambda$10$lambda$7$lambda$6(this.f5593a, (TextView) obj);
                    }
                }, 1, null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit doRequestData$lambda$11$lambda$10$lambda$7$lambda$6(DataSharedByTAActivity this$0, TextView it) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ToastExtKt.toastShort(this$0, t0j.l);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit doRequestData$lambda$11$lambda$10$lambda$8(DataSharedByTAActivity this$0) {
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
            public static final Unit doRequestData$lambda$11$lambda$10$lambda$9(DataSharedByTAActivity this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((dgk) this$0.getMBinding()).F.setChecked(false);
                ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
                if (shareDataListAdapter != null) {
                    shareDataListAdapter.setSelectAllBtnControlledByDirectClick(true);
                }
                return Unit.INSTANCE;
            }

            private final List<HomeDataType> getAddedDataItemType(List<? extends HomeDataType> oldList, List<? extends HomeDataType> newList) {
                ArrayList arrayList = new ArrayList();
                for (HomeDataType homeDataType : newList) {
                    if (!oldList.contains(homeDataType)) {
                        arrayList.add(homeDataType);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final List<HomeDataType> getListUnion(List<? extends HomeDataType> sharedItems, List<? extends HomeDataType> otherItems) {
                if (sharedItems == 0) {
                    return otherItems;
                }
                if (otherItems == 0) {
                    return sharedItems;
                }
                ListExtKt.addAll(sharedItems, otherItems);
                return sharedItems;
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

            private final void listenToConnectionStatus() {
                ServiceConnector.addServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void onCreate$lambda$0(DataSharedByTAActivity this$0, CompoundButton compoundButton, boolean z) {
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
            public static final Unit onCreate$lambda$3(final DataSharedByTAActivity this$0, TextView it) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                RelativeCareUtil.INSTANCE.checkHealthCloudSynchronizationAndProceedIfNeed(this$0, new Function0() { // from class: ko5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DataSharedByTAActivity.onCreate$lambda$3$lambda$2(this.f24036a);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit onCreate$lambda$3$lambda$2(final DataSharedByTAActivity this$0) {
                List<HomeDataType> listEmptyList;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.initedAuthDataList != null) {
                    ShareDataListAdapter shareDataListAdapter = this$0.shareDataListAdapter;
                    Intrinsics.checkNotNull(shareDataListAdapter);
                    List<HomeDataType> allSelectedHomeDataTypeList = shareDataListAdapter.getAllSelectedHomeDataTypeList();
                    List<? extends HomeDataType> list = this$0.initedAuthDataList;
                    Intrinsics.checkNotNull(list);
                    listEmptyList = this$0.getAddedDataItemType(list, allSelectedHomeDataTypeList);
                    RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
                    List<? extends HomeDataType> list2 = this$0.initedAuthDataList;
                    Intrinsics.checkNotNull(list2);
                    if (relativeCareUtil.hasSameAuthData(list2, allSelectedHomeDataTypeList)) {
                        return Unit.INSTANCE;
                    }
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                if (listEmptyList.isEmpty()) {
                    ToastExtKt.toastShort(this$0, t0j.o0);
                    return Unit.INSTANCE;
                }
                RelativeCareViewModel relativeCareViewModel = (RelativeCareViewModel) this$0.getMViewModel();
                Long l = this$0.relativeUid;
                Intrinsics.checkNotNull(l);
                relativeCareViewModel.applySharedDataTypes(l.longValue(), listEmptyList).observe(this$0, new DataSharedByTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mo5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DataSharedByTAActivity.onCreate$lambda$3$lambda$2$lambda$1(this.f27041a, (RelativeResult) obj);
                    }
                }));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onCreate$lambda$3$lambda$2$lambda$1(DataSharedByTAActivity this$0, RelativeResult relativeResult) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!relativeResult.isSuccess()) {
                    Logger.i(TAG, "applySharedDataTypes failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
                } else if (relativeResult.getData() != null) {
                    this$0.startActivity(new Intent(this$0, (Class<?>) InvitationSentSuccessfullyActivity.class));
                    this$0.finish();
                } else {
                    Logger.i(TAG, "applySharedDataTypes isSuccess but result is false.");
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onResume$lambda$4(DataSharedByTAActivity this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.requestData();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final void requestData() {
                if (Intrinsics.areEqual(this.origin, "account")) {
                    ((RelativeCareViewModel) getMViewModel()).getConnectionStatusLiveData().observe(this, new DataSharedByTAActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: no5
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return DataSharedByTAActivity.requestData$lambda$5(this.f28193a, (Boolean) obj);
                        }
                    }));
                } else {
                    doRequestData();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit requestData$lambda$5(DataSharedByTAActivity this$0, Boolean bool) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (bool.booleanValue()) {
                    this$0.doRequestData();
                    this$0.hideLoading();
                } else {
                    this$0.showLoading(t0j.d, false);
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
            @Override // com.xiaomi.fitness.relative.ui.Hilt_DataSharedByTAActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
            public void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                Long lValueOf = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
                this.relativeUid = lValueOf;
                if (lValueOf.longValue() == 0) {
                    return;
                }
                this.recyclerView = ((dgk) getMBinding()).D;
                setTitle(t0j.E);
                setTitleBackground(vji.f36950b);
                UIUtils.INSTANCE.setNavigationBarColor(this, vji.f36950b);
                String stringExtra = getIntent().getStringExtra("origin");
                this.origin = stringExtra;
                if (Intrinsics.areEqual(stringExtra, "account")) {
                    listenToConnectionStatus();
                }
                initAdapter();
                ((dgk) getMBinding()).H.setText(t0j.u);
                ((dgk) getMBinding()).F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: do5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        DataSharedByTAActivity.onCreate$lambda$0(this.f15737a, compoundButton, z);
                    }
                });
                ((dgk) getMBinding()).A.setText(t0j.p0);
                ViewExtKt.clickWithTrigger$default(((dgk) getMBinding()).A, 0L, new Function1() { // from class: eo5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DataSharedByTAActivity.onCreate$lambda$3(this.f16869a, (TextView) obj);
                    }
                }, 1, null);
            }

            @Override // com.xiaomi.fitness.relative.ui.Hilt_DataSharedByTAActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
            public void onDestroy() {
                super.onDestroy();
                if (Intrinsics.areEqual(this.origin, "account")) {
                    ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
                }
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
                relativeCareUtil.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, content, new Function0() { // from class: lo5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DataSharedByTAActivity.onResume$lambda$4(this.f25258a);
                    }
                });
            }
        }
