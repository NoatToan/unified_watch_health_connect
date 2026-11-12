package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.amap.api.services.district.DistrictSearchQuery;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictAdapter;
import com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictData;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.z07;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB\u0098\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010\u0012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00192\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\bH\u0007J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000eH\u0016J\b\u00101\u001a\u00020\u000eH\u0016J\u0018\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u000eH\u0016J\u0006\u00105\u001a\u00020\u0019J\u001c\u00106\u001a\u00020\u00192\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u00108\u001a\u00020\u0013J\u0018\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020&H\u0002J\u0018\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u000eH\u0002J\u001e\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u000eJ\u0010\u0010B\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/NormalHolder;", "baseActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "adCode2FileListMap", "", "", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/ADCodeItem;", "fileNameToAdCodeMap", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "iconType", "", "downloadDistrictLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "deleteCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "adCode", "", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Ljava/util/Map;Ljava/util/Map;Landroidx/lifecycle/LifecycleCoroutineScope;ILandroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;)V", "getBaseActivity", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getAdCode2FileListMap", "()Ljava/util/Map;", "setAdCode2FileListMap", "(Ljava/util/Map;)V", "mDataList", "", "subAdapters", "acceptMobileNet", "", "getAcceptMobileNet", "()Z", "setAcceptMobileNet", "(Z)V", "refreshData", "data", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "resetDistrictsStatus", "notifyItemStatus", Constants.KEY_RECHARGE_VALUES, DistrictSearchQuery.KEYWORDS_DISTRICT, "updateSectionIndicator", "view", "Landroid/widget/TextView;", "subRecyclerViewVisible", "deleteFile", "item", "cancelTask", "Landroid/view/View$OnClickListener;", "id", "getItemViewType", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDistrictAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistrictAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n54#2,3:372\n24#2:375\n57#2,6:376\n63#2,2:383\n57#3:382\n1872#4,3:385\n*S KotlinDebug\n*F\n+ 1 DistrictAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter\n*L\n190#1:372,3\n190#1:375\n190#1:376,6\n190#1:383,2\n190#1:382\n252#1:385,3\n*E\n"})
public final class DistrictAdapter extends RecyclerView.Adapter<NormalHolder> {
    public static final int ICON_DELETE = 2;
    public static final int ICON_DOWNLOAD = 0;
    public static final int ICON_INSTALLED = 1;

    @NotNull
    public static final String TAG = "DistrictAdapter";
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_SECTION = 0;
    private boolean acceptMobileNet;

    @Nullable
    private Map<String, List<ADCodeItem>> adCode2FileListMap;

    @NotNull
    private final BaseActivity baseActivity;

    @NotNull
    private final Function1<String, Unit> deleteCallback;

    @NotNull
    private final MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData;

    @Nullable
    private Map<String, String> fileNameToAdCodeMap;
    private final int iconType;

    @NotNull
    private final LifecycleCoroutineScope lifecycleScope;

    @NotNull
    private final List<DistrictData> mDataList;

    @NotNull
    private final Map<Integer, DistrictAdapter> subAdapters;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] MUNICIPALITIES = {"110000", "120000", "310000", "500000"};

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter$Companion;", "", "<init>", "()V", "TAG", "", "TYPE_SECTION", "", "TYPE_NORMAL", "MUNICIPALITIES", "", "getMUNICIPALITIES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ICON_DOWNLOAD", "ICON_INSTALLED", "ICON_DELETE", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getMUNICIPALITIES() {
            return DistrictAdapter.MUNICIPALITIES;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictAdapter$deleteFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictAdapter$deleteFile$1", f = "DistrictAdapter.kt", i = {0}, l = {324}, m = "invokeSuspend", n = {"deleteResult"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nDistrictAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistrictAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter$deleteFile$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,371:1\n1557#2:372\n1628#2,3:373\n774#2:376\n865#2,2:377\n1863#2,2:379\n216#3,2:381\n*S KotlinDebug\n*F\n+ 1 DistrictAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter$deleteFile$1\n*L\n292#1:372\n292#1:373,3\n292#1:376\n292#1:377,2\n294#1:379,2\n308#1:381,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DistrictData $item;
        final /* synthetic */ int $position;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictAdapter$deleteFile$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictAdapter$deleteFile$1$3", f = "DistrictAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $position;
            int label;
            final /* synthetic */ DistrictAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(DistrictAdapter districtAdapter, int i, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = districtAdapter;
                this.$position = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$position, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.notifyItemRemoved(this.$position);
                if (this.$position != this.this$0.mDataList.size()) {
                    DistrictAdapter districtAdapter = this.this$0;
                    districtAdapter.notifyItemRangeChanged(this.$position, districtAdapter.mDataList.size() - this.$position);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DistrictData districtData, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$item = districtData;
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DistrictAdapter.this.new AnonymousClass1(this.$item, this.$position, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0177  */
        /* JADX WARN: Code duplicated, block: B:44:0x018a  */
        /* JADX WARN: Code duplicated, block: B:46:0x018e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            Ref.BooleanRef booleanRef2;
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PageState.DefaultImpls.showLoading$default(DistrictAdapter.this.getBaseActivity(), wzi.rf, false, 2, null);
                Logger.i(DistrictAdapter.TAG, "deleteFile item=" + this.$item);
                Map<Integer, Set<String>> hierarchicalFileNameSetMapFromAdCode = OfflineMapExKt.getHierarchicalFileNameSetMapFromAdCode(DistrictAdapter.this.getAdCode2FileListMap(), this.$item.getAdcode());
                List list = DistrictAdapter.this.mDataList;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DistrictData) it.next()).getAdcode());
                }
                DistrictData districtData = this.$item;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!Intrinsics.areEqual((String) obj2, districtData.getAdcode())) {
                        arrayList2.add(obj2);
                    }
                }
                Set set = CollectionsKt___CollectionsKt.toSet(arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                DistrictAdapter districtAdapter = DistrictAdapter.this;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.putAll(OfflineMapExKt.getHierarchicalFileNameSetMapFromAdCode(districtAdapter.getAdCode2FileListMap(), (String) it2.next()));
                }
                Map<Integer, Set<String>> subtractMap = OfflineMapExKt.getSubtractMap(hierarchicalFileNameSetMapFromAdCode, linkedHashMap);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                z07 mapDocumentFile = OfflineMapExKt.getMapDocumentFile();
                if (mapDocumentFile == null) {
                    ToastExtKt.toast$default(ApplicationExtKt.getApplication(), wzi.common_hint_unkonwn_error, 0, 0, 0L, 14, null);
                    return Unit.INSTANCE;
                }
                DistrictAdapter districtAdapter2 = DistrictAdapter.this;
                for (Map.Entry<Integer, Set<String>> entry : subtractMap.entrySet()) {
                    if (!OfflineMapExKt.deleteFilesInAZoomLevel(mapDocumentFile, entry.getKey().intValue(), entry.getValue())) {
                        booleanRef.element = false;
                        districtAdapter2.getBaseActivity().hideLoading();
                    }
                }
                Logger.i(DistrictAdapter.TAG, "deleteFile deleteResult=" + booleanRef.element);
                if (booleanRef.element) {
                    ListExtKt.remove(DistrictAdapter.this.mDataList, this.$position);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(DistrictAdapter.this, this.$position, null);
                    this.L$0 = booleanRef;
                    this.label = 1;
                    if (BuildersKt.withContext(main, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef2 = booleanRef;
                }
                DistrictAdapter.this.getBaseActivity().hideLoading();
                if (booleanRef.element) {
                    DistrictAdapter.this.deleteCallback.invoke2(this.$item.getAdcode());
                }
                if (booleanRef.element) {
                    i = wzi.common_delete_success;
                } else {
                    i = wzi.common_delete_failure;
                }
                ToastExtKt.toast$default(ApplicationExtKt.getApplication(), i, 0, 0, 0L, 14, null);
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef2 = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            booleanRef = booleanRef2;
            DistrictAdapter.this.getBaseActivity().hideLoading();
            if (booleanRef.element) {
                DistrictAdapter.this.deleteCallback.invoke2(this.$item.getAdcode());
            }
            if (booleanRef.element) {
                i = wzi.common_delete_success;
            } else {
                i = wzi.common_delete_failure;
            }
            ToastExtKt.toast$default(ApplicationExtKt.getApplication(), i, 0, 0, 0L, 14, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ DistrictAdapter(BaseActivity baseActivity, Map map, Map map2, LifecycleCoroutineScope lifecycleCoroutineScope, int i, MutableLiveData mutableLiveData, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, (i2 & 2) != 0 ? null : map, (i2 & 4) != 0 ? null : map2, lifecycleCoroutineScope, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new MutableLiveData() : mutableLiveData, (i2 & 64) != 0 ? new Function1() { // from class: zz6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DistrictAdapter._init_$lambda$0((String) obj);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelTask$lambda$10(final long j, DistrictData item, DistrictAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (j == -1) {
            return;
        }
        OfflineMapExKt.showCancelDownloadDialog(item.getName(), this$0.baseActivity, new Function0() { // from class: e07
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistrictAdapter.cancelTask$lambda$10$lambda$9(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTask$lambda$10$lambda$9(long j) {
        OfflineMapDownloadManager.INSTANCE.cancelDownloading(j);
        return Unit.INSTANCE;
    }

    private final void deleteFile(DistrictData item, int position) {
        BuildersKt__Builders_commonKt.launch$default(this.lifecycleScope, Dispatchers.getIO(), null, new AnonymousClass1(item, position, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(DistrictAdapter this$0, TextView sectionDistrictNameTv, RecyclerView subRecyclerView, DistrictData item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sectionDistrictNameTv, "$sectionDistrictNameTv");
        Intrinsics.checkNotNullParameter(subRecyclerView, "$subRecyclerView");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.updateSectionIndicator(sectionDistrictNameTv, ExtUtilsKt.isVisible(subRecyclerView));
        ViewExtKt.setVisible(subRecyclerView, !ExtUtilsKt.isVisible(subRecyclerView));
        item.setExpandable(ExtUtilsKt.isVisible(subRecyclerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(DistrictAdapter this$0, DistrictData item, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.cancelTask(OfflineMapDownloadManager.INSTANCE.findDownloadingId(item.getAdcode()), item, i).onClick(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(final DistrictAdapter this$0, final DistrictData item, final int i, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = this$0.iconType;
        if (i2 == 0) {
            String size = item.getSize();
            FragmentManager supportFragmentManager = this$0.baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (OfflineMapExKt.checkDownload(size, supportFragmentManager) && OfflineMapDownloadManager.INSTANCE.isDownloading(item.getAdcode())) {
                return Unit.INSTANCE;
            }
            NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: b07
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistrictAdapter.onBindViewHolder$lambda$6$lambda$4(this.f3640a, item);
                }
            });
        } else if (i2 != 1) {
            if (i2 != 2) {
                ToastExtKt.toast$default(ApplicationExtKt.getApplication(), wzi.common_not_support, 0, 0, 0L, 14, null);
            } else {
                ConcurrentHashMap<Long, DistrictData> value = this$0.downloadDistrictLiveData.getValue();
                if (!(value == null || value.isEmpty())) {
                    ToastExtKt.toast$default(ApplicationExtKt.getApplication(), wzi.nf, 0, 0, 0L, 14, null);
                } else {
                    String name = item.getName();
                    FragmentManager supportFragmentManager2 = this$0.baseActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    OfflineMapExKt.showDeleteMapConfirmationDialogIfNeed(name, supportFragmentManager2, new Function0() { // from class: c07
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DistrictAdapter.onBindViewHolder$lambda$6$lambda$5(this.f4777a, item, i);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6$lambda$4(final DistrictAdapter this$0, final DistrictData item) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        if (NetUtil.INSTANCE.getNetWorkState(AppUtil.getApp()) == 1 || this$0.acceptMobileNet) {
            OfflineMapExKt.downloadDistrict(item.getAdcode(), item, this$0.lifecycleScope);
        } else {
            FragmentManager supportFragmentManager = this$0.baseActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            OfflineMapExKt.showMobileNetDialog(supportFragmentManager, new Function0() { // from class: d07
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DistrictAdapter.onBindViewHolder$lambda$6$lambda$4$lambda$3(item, this$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6$lambda$4$lambda$3(DistrictData item, DistrictAdapter this$0) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OfflineMapExKt.downloadDistrict(item.getAdcode(), item, this$0.lifecycleScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6$lambda$5(DistrictAdapter this$0, DistrictData item, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.deleteFile(item, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetDistrictsStatus$lambda$7(DistrictData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDownloadStatus(DownloadStatus.STATUS_IDEL);
        it.setDownloadProgress(0);
        return Unit.INSTANCE;
    }

    private final void updateSectionIndicator(TextView view, boolean subRecyclerViewVisible) {
        int i = subRecyclerViewVisible ? jni.Y : jni.Z;
        Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), i);
        if (resourceDrawable != null) {
            resourceDrawable.setBounds(0, 0, ExtUtilsKt.getDp(20), ExtUtilsKt.getDp(20));
        }
        Logger.i(TAG, "subRecyclerView.isVisible=" + subRecyclerViewVisible + " iconRes=" + i);
        if (UIUtils.INSTANCE.isRtl()) {
            view.setCompoundDrawables(resourceDrawable, null, null, null);
        } else {
            view.setCompoundDrawables(null, null, resourceDrawable, null);
        }
    }

    @NotNull
    public final View.OnClickListener cancelTask(final long id, @NotNull final DistrictData item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new View.OnClickListener() { // from class: yz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DistrictAdapter.cancelTask$lambda$10(id, item, this, view);
            }
        };
    }

    public final boolean getAcceptMobileNet() {
        return this.acceptMobileNet;
    }

    @Nullable
    public final Map<String, List<ADCodeItem>> getAdCode2FileListMap() {
        return this.adCode2FileListMap;
    }

    @NotNull
    public final BaseActivity getBaseActivity() {
        return this.baseActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        List<DistrictData> districts = this.mDataList.get(position).getDistricts();
        return (districts == null || districts.isEmpty()) ? 1 : 0;
    }

    public final void notifyItemStatus(@NotNull List<Integer> values, @NotNull DistrictData district) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(district, "district");
        List<DistrictData> districts = this.mDataList;
        int i = 0;
        DistrictAdapter districtAdapter = this;
        for (Object obj : values) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == CollectionsKt__CollectionsKt.getLastIndex(values)) {
                districts.get(iIntValue).setDownloadStatus(district.getDownloadStatus());
                districts.get(iIntValue).setDownloadProgress(district.getDownloadProgress());
                districtAdapter.notifyItemChanged(iIntValue);
            } else {
                districts = districts.get(iIntValue).getDistricts();
                Intrinsics.checkNotNull(districts);
                try {
                    DistrictAdapter districtAdapter2 = districtAdapter.subAdapters.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(districtAdapter2);
                    districtAdapter = districtAdapter2;
                } catch (Exception e) {
                    e.printStackTrace();
                    FitnessLogUtils.i(TAG, "subAdapter null e:" + Unit.INSTANCE);
                }
            }
            i = i2;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void refreshData(@Nullable List<DistrictData> data) {
        Logger.d(TAG, "refreshData currentData:" + this.mDataList.size() + ",refreshData:" + (data != null ? Integer.valueOf(data.size()) : null));
        this.mDataList.clear();
        List<DistrictData> list = data;
        if (list != null && !list.isEmpty()) {
            this.mDataList.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final void resetDistrictsStatus() {
        OfflineMapExKt.foreachDistricts(this.mDataList, new Function1() { // from class: a07
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DistrictAdapter.resetDistrictsStatus$lambda$7((DistrictData) obj);
            }
        });
    }

    public final void setAcceptMobileNet(boolean z) {
        this.acceptMobileNet = z;
    }

    public final void setAdCode2FileListMap(@Nullable Map<String, List<ADCodeItem>> map) {
        this.adCode2FileListMap = map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull NormalHolder holder, final int position) {
        int i;
        DistrictAdapter districtAdapter;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final DistrictData districtData = this.mDataList.get(position);
        holder.getDistrictName().setText(districtData.getName());
        String size = districtData.getSize();
        boolean z = !(size == null || StringsKt__StringsKt.isBlank(size));
        ViewExtKt.setVisible(holder.getDistrictSize(), z);
        if (z) {
            TextView districtSize = holder.getDistrictSize();
            String size2 = districtData.getSize();
            if (size2 == null) {
                size2 = "";
            }
            districtSize.setText(size2);
        }
        if (getItemViewType(position) == 0) {
            if (!(!this.subAdapters.isEmpty()) || this.subAdapters.get(Integer.valueOf(position)) == null) {
                districtAdapter = new DistrictAdapter(this.baseActivity, this.adCode2FileListMap, this.fileNameToAdCodeMap, this.lifecycleScope, this.iconType, null, null, 96, null);
            } else {
                districtAdapter = this.subAdapters.get(Integer.valueOf(position));
            }
            Integer numValueOf = Integer.valueOf(position);
            Map<Integer, DistrictAdapter> map = this.subAdapters;
            Intrinsics.checkNotNull(districtAdapter);
            map.put(numValueOf, districtAdapter);
            SectionHolder sectionHolder = (SectionHolder) holder;
            final TextView districtNameTv = sectionHolder.getDistrictNameTv();
            final RecyclerView subDistricts = sectionHolder.getSubDistricts();
            ViewExtKt.setVisible(subDistricts, districtData.getExpandable());
            updateSectionIndicator(districtNameTv, !districtData.getExpandable());
            subDistricts.setAdapter(districtAdapter);
            Logger.d(TAG, "onBindViewHolder,item name:" + districtData.getName() + ",subRecyclerView visiable:" + districtData.getExpandable());
            List<DistrictData> districts = districtData.getDistricts();
            if (districts == null) {
                districts = CollectionsKt__CollectionsKt.emptyList();
            }
            districtAdapter.refreshData(districts);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: vz6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DistrictAdapter.onBindViewHolder$lambda$1(this.f37384a, districtNameTv, subDistricts, districtData, view);
                }
            });
        }
        int i2 = this.iconType;
        if (i2 == 0) {
            i = jni.j1;
        } else if (i2 != 1) {
            i = i2 != 2 ? jni.Y0 : jni.h0;
        } else {
            i = cji.G;
        }
        boolean zIsHKOrMCOrTW = OfflineMapExKt.isHKOrMCOrTW(districtData.getAdcode());
        if (this.iconType == 0 && TextUtils.equals("province", districtData.getLevel()) && !ArraysKt___ArraysKt.contains(MUNICIPALITIES, districtData.getAdcode())) {
            ViewExtKt.setVisible(holder.getIconIv(), false);
            ViewExtKt.setVisible(holder.getDistInstalled(), false);
            View downloadProgressLayout = holder.getDownloadProgressLayout();
            Intrinsics.checkNotNullExpressionValue(downloadProgressLayout, "<get-downloadProgressLayout>(...)");
            ViewExtKt.setVisible(downloadProgressLayout, false);
        } else {
            int i3 = this.iconType;
            if (i3 == 0 && zIsHKOrMCOrTW) {
                ViewExtKt.setVisible(holder.getIconIv(), false);
                ViewExtKt.setVisible(holder.getDistInstalled(), true);
                View downloadProgressLayout2 = holder.getDownloadProgressLayout();
                Intrinsics.checkNotNullExpressionValue(downloadProgressLayout2, "<get-downloadProgressLayout>(...)");
                ViewExtKt.setVisible(downloadProgressLayout2, false);
                holder.getDistInstalled().setText(wzi.common_not_support);
            } else if (i3 == 0 && districtData.getDownloadStatus() == DownloadStatus.STATUS_INSTALLED) {
                ViewExtKt.setVisible(holder.getIconIv(), false);
                ViewExtKt.setVisible(holder.getDistInstalled(), true);
                View downloadProgressLayout3 = holder.getDownloadProgressLayout();
                Intrinsics.checkNotNullExpressionValue(downloadProgressLayout3, "<get-downloadProgressLayout>(...)");
                ViewExtKt.setVisible(downloadProgressLayout3, false);
                holder.getDistInstalled().setText(wzi.common_installed);
            } else if (this.iconType == 0 && districtData.getDownloadStatus() == DownloadStatus.STATUS_INSTALLING) {
                ViewExtKt.setVisible(holder.getIconIv(), false);
                ViewExtKt.setVisible(holder.getDistInstalled(), true);
                View downloadProgressLayout4 = holder.getDownloadProgressLayout();
                Intrinsics.checkNotNullExpressionValue(downloadProgressLayout4, "<get-downloadProgressLayout>(...)");
                ViewExtKt.setVisible(downloadProgressLayout4, false);
                holder.getDistInstalled().setText(wzi.k5);
            } else if (this.iconType == 0 && (districtData.getDownloadStatus() == DownloadStatus.STATUS_DOWNLOADING || districtData.getDownloadStatus() == DownloadStatus.STATUS_PENDING)) {
                ViewExtKt.setVisible(holder.getIconIv(), false);
                ViewExtKt.setVisible(holder.getDistInstalled(), false);
                View downloadProgressLayout5 = holder.getDownloadProgressLayout();
                Intrinsics.checkNotNullExpressionValue(downloadProgressLayout5, "<get-downloadProgressLayout>(...)");
                ViewExtKt.setVisible(downloadProgressLayout5, true);
                holder.getDownloadProgress().setProgress(districtData.getDownloadProgress());
            } else {
                ViewExtKt.setVisible(holder.getIconIv(), true);
                ViewExtKt.setVisible(holder.getDistInstalled(), false);
                View downloadProgressLayout6 = holder.getDownloadProgressLayout();
                Intrinsics.checkNotNullExpressionValue(downloadProgressLayout6, "<get-downloadProgressLayout>(...)");
                ViewExtKt.setVisible(downloadProgressLayout6, false);
            }
        }
        if (this.iconType == 0 && getItemViewType(position) == 0) {
            holder.itemView.setBackgroundResource(jni.q1);
        } else {
            holder.itemView.setBackground(null);
        }
        ImageView iconIv = holder.getIconIv();
        Coil.imageLoader(iconIv.getContext()).enqueue(new ImageRequest.Builder(iconIv.getContext()).data(Integer.valueOf(i)).target(iconIv).build());
        ViewExtKt.clickWithTrigger$default(holder.getDownloadProgressLayout(), 0L, new Function1() { // from class: wz6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DistrictAdapter.onBindViewHolder$lambda$2(this.f38497a, districtData, position, (View) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(holder.getIconIv(), 0L, new Function1() { // from class: xz6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DistrictAdapter.onBindViewHolder$lambda$6(this.f39608a, districtData, position, (ImageView) obj);
            }
        }, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public NormalHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.X2, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SectionHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(eui.W2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new NormalHolder(viewInflate2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistrictAdapter(@NotNull BaseActivity baseActivity, @Nullable Map<String, List<ADCodeItem>> map, @Nullable Map<String, String> map2, @NotNull LifecycleCoroutineScope lifecycleScope, int i, @NotNull MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData, @NotNull Function1<? super String, Unit> deleteCallback) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(downloadDistrictLiveData, "downloadDistrictLiveData");
        Intrinsics.checkNotNullParameter(deleteCallback, "deleteCallback");
        this.baseActivity = baseActivity;
        this.adCode2FileListMap = map;
        this.fileNameToAdCodeMap = map2;
        this.lifecycleScope = lifecycleScope;
        this.iconType = i;
        this.downloadDistrictLiveData = downloadDistrictLiveData;
        this.deleteCallback = deleteCallback;
        this.mDataList = new ArrayList();
        this.subAdapters = new LinkedHashMap();
    }
}
