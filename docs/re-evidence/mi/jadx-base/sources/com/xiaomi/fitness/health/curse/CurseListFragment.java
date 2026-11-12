package com.xiaomi.fitness.health.curse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableAdapterHelper;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableItem;
import com.xiaomi.fitness.common.recycer.expandable.HeaderItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseListFragment;
import com.xiaomi.fitness.health.curse.adapter.CurseExpandableAdapter;
import com.xiaomi.fitness.health.curse.adapter.WrapperCurseRecord;
import com.xiaomi.fitness.health.curse.vm.CurseListVM;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.pni;
import defpackage.ysb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0015\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0007J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0007R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u001a\u00107\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/curse/vm/CurseListVM;", "Lysb;", "Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "", "initMoreRecyclerView", "()V", "notifyAdapter", "checkFullBottom", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", PluginDeviceInfo.FICONOFF, "onDataOk", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;", "Lcom/xiaomi/fitness/health/curse/adapter/WrapperCurseRecord;", "last", "wrapperCurseRecord", "", "convertList", "dealCurrentWithLastItem", "(Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableItem;Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;Ljava/util/List;)V", "curseRecord", "", "expandStatus", "appendNewHeader", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;Ljava/util/List;Z)V", "record", "appendNormalItem", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;Ljava/util/List;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "onDataChange", "Lcom/xiaomi/fitness/health/curse/adapter/CurseExpandableAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/health/curse/adapter/CurseExpandableAdapter;", "adapter", "Landroid/widget/TextView;", "emptyView", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "moreRecyclerView", "Lcom/xiaomi/fitness/baseui/recyclerview/MoreRecyclerView;", "originCurseRecordList", "Ljava/util/List;", "dataAdapterList", "", "layoutId", "I", "getLayoutId", "()I", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseListFragment.kt\ncom/xiaomi/fitness/health/curse/CurseListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1863#2,2:260\n1872#2,3:262\n*S KotlinDebug\n*F\n+ 1 CurseListFragment.kt\ncom/xiaomi/fitness/health/curse/CurseListFragment\n*L\n146#1:260,2\n170#1:262,3\n*E\n"})
public final class CurseListFragment extends Hilt_CurseListFragment<CurseListVM, ysb> implements CurseManager.OnConfigChange {
    private TextView emptyView;
    private MoreRecyclerView moreRecyclerView;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: j75
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseListFragment.adapter_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<Record> originCurseRecordList = new ArrayList();

    @NotNull
    private final List<ExpandableItem<WrapperCurseRecord>> dataAdapterList = new ArrayList();
    private final int layoutId = jui.c3;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseListFragment$initMoreRecyclerView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/health/curse/CurseListFragment$initMoreRecyclerView$1", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$OnItemClickListener;", "onClickHeader", "", "position", "", "headerItem", "Lcom/xiaomi/fitness/common/recycer/expandable/HeaderItem;", "onClickData", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCurseListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseListFragment.kt\ncom/xiaomi/fitness/health/curse/CurseListFragment$initMoreRecyclerView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n774#2:260\n865#2,2:261\n1557#2:263\n1628#2,3:264\n*S KotlinDebug\n*F\n+ 1 CurseListFragment.kt\ncom/xiaomi/fitness/health/curse/CurseListFragment$initMoreRecyclerView$1\n*L\n87#1:260\n87#1:261,2\n92#1:263\n92#1:264,3\n*E\n"})
    public static final class AnonymousClass1 implements BaseExpandableAdapter.OnItemClickListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onClickHeader$lambda$0(HeaderItem headerItem, ExpandableItem it) {
            Intrinsics.checkNotNullParameter(headerItem, "$headerItem");
            Intrinsics.checkNotNullParameter(it, "it");
            WrapperCurseRecord wrapperCurseRecord = (WrapperCurseRecord) it.getItemDetail();
            Long lValueOf = wrapperCurseRecord != null ? Long.valueOf(wrapperCurseRecord.getCoreTimeMillis()) : null;
            if (lValueOf == null) {
                return false;
            }
            return TimeDateUtil.isSameYear(lValueOf.longValue(), headerItem.getHeaderTimeMillis());
        }

        @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter.OnItemClickListener
        public void onClickData(ExpandableBaseDataItem data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (data instanceof WrapperCurseRecord) {
                CurseListFragment curseListFragment = CurseListFragment.this;
                Intent intent = new Intent(CurseListFragment.this.getContext(), (Class<?>) CurseInfoActivity.class);
                WrapperCurseRecord wrapperCurseRecord = (WrapperCurseRecord) data;
                intent.putExtra("info", new Record(wrapperCurseRecord.getStartMills(), wrapperCurseRecord.getEndMills(), wrapperCurseRecord.getUpdateTime(), wrapperCurseRecord.getInterval(), wrapperCurseRecord.getId()));
                curseListFragment.startActivity(intent);
            }
        }

        @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter.OnItemClickListener
        public void onClickHeader(int position, final HeaderItem headerItem) {
            Intrinsics.checkNotNullParameter(headerItem, "headerItem");
            if (headerItem.getExpandStatus()) {
                CollectionsKt__MutableCollectionsKt.removeAll(CurseListFragment.this.dataAdapterList, new Function1() { // from class: l75
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(CurseListFragment.AnonymousClass1.onClickHeader$lambda$0(headerItem, (ExpandableItem) obj));
                    }
                });
                headerItem.setExpandStatus(false);
                CurseListFragment.this.notifyAdapter();
                return;
            }
            List list = CurseListFragment.this.originCurseRecordList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (TimeDateUtil.isSameYear(((Record) obj).getStartMills(), headerItem.getHeaderTimeMillis())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                Record curseRecord = (Record) it.next();
                arrayList2.add(new ExpandableItem().setItemData(new WrapperCurseRecord(curseRecord.getStartMills(), curseRecord.getEndMills(), curseRecord.getUpdateTime(), curseRecord.getInterval(), CurseRecordKt.getInDays(curseRecord), curseRecord.getId())));
            }
            int i = position + 1;
            if (i <= CurseListFragment.this.dataAdapterList.size()) {
                CurseListFragment.this.dataAdapterList.addAll(i, arrayList2);
            }
            headerItem.setExpandStatus(true);
            CurseListFragment.this.notifyAdapter();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CurseListVM access$getMViewModel(CurseListFragment curseListFragment) {
        return (CurseListVM) curseListFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseExpandableAdapter adapter_delegate$lambda$0() {
        return new CurseExpandableAdapter();
    }

    private final void appendNewHeader(Record curseRecord, List<ExpandableItem<WrapperCurseRecord>> convertList, boolean expandStatus) {
        ExpandableItem<WrapperCurseRecord> expandableItem = new ExpandableItem<>();
        long startMills = curseRecord.getStartMills();
        String string = getString(c0j.j);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        expandableItem.setHeadItem(new HeaderItem(expandStatus, startMills, string, true));
        convertList.add(expandableItem);
        if (expandStatus) {
            appendNormalItem(curseRecord, convertList);
        }
    }

    private final void appendNormalItem(Record record, List<ExpandableItem<WrapperCurseRecord>> convertList) {
        convertList.add(new ExpandableItem().setItemData(new WrapperCurseRecord(record.getStartMills(), record.getEndMills(), record.getUpdateTime(), record.getInterval(), CurseRecordKt.getInDays(record), record.getId())));
    }

    private final void checkFullBottom() {
        MoreRecyclerView moreRecyclerView = this.moreRecyclerView;
        if (moreRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView = null;
        }
        moreRecyclerView.post(new Runnable() { // from class: k75
            @Override // java.lang.Runnable
            public final void run() {
                CurseListFragment.checkFullBottom$lambda$3(this.f23543a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void checkFullBottom$lambda$3(CurseListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ExpandableAdapterHelper expandableAdapterHelper = ExpandableAdapterHelper.INSTANCE;
        MoreRecyclerView moreRecyclerView = this$0.moreRecyclerView;
        if (moreRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView = null;
        }
        if (expandableAdapterHelper.isAttachBottom(moreRecyclerView)) {
            Logger.i("CurseListLog", "slideToBottom,continue request data");
            ((CurseListVM) this$0.getMViewModel()).getData(false, 50);
        }
    }

    private final void dealCurrentWithLastItem(ExpandableItem<WrapperCurseRecord> last, Record wrapperCurseRecord, List<ExpandableItem<WrapperCurseRecord>> convertList) {
        if (last.getHeadItem() == null) {
            ExpandableBaseDataItem itemDetail = last.getItemDetail();
            Intrinsics.checkNotNull(itemDetail);
            if (TimeDateUtil.isSameYear(((WrapperCurseRecord) itemDetail).getStartMills(), wrapperCurseRecord.getStartMills())) {
                appendNormalItem(wrapperCurseRecord, convertList);
                return;
            } else {
                appendNewHeader(wrapperCurseRecord, convertList, true);
                return;
            }
        }
        HeaderItem headItem = last.getHeadItem();
        Intrinsics.checkNotNull(headItem);
        if (!TimeDateUtil.isSameYear(headItem.getHeaderTimeMillis(), wrapperCurseRecord.getStartMills())) {
            appendNewHeader(wrapperCurseRecord, convertList, true);
            return;
        }
        HeaderItem headItem2 = last.getHeadItem();
        Intrinsics.checkNotNull(headItem2);
        if (headItem2.getExpandStatus()) {
            appendNormalItem(wrapperCurseRecord, convertList);
        }
    }

    private final CurseExpandableAdapter getAdapter() {
        return (CurseExpandableAdapter) this.adapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initMoreRecyclerView() {
        MoreRecyclerView moreRecyclerView = ((ysb) getMBinding()).C;
        this.moreRecyclerView = moreRecyclerView;
        MoreRecyclerView moreRecyclerView2 = null;
        if (moreRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView = null;
        }
        moreRecyclerView.setEnableMore(false);
        getAdapter().setData(this.dataAdapterList, false);
        getAdapter().setListener(new AnonymousClass1());
        MoreRecyclerView moreRecyclerView3 = this.moreRecyclerView;
        if (moreRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
            moreRecyclerView3 = null;
        }
        moreRecyclerView3.setAdapter(getAdapter());
        MoreRecyclerView moreRecyclerView4 = this.moreRecyclerView;
        if (moreRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreRecyclerView");
        } else {
            moreRecyclerView2 = moreRecyclerView4;
        }
        moreRecyclerView2.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.health.curse.CurseListFragment.initMoreRecyclerView.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                CurseListFragment.access$getMViewModel(CurseListFragment.this).getData(false, 50);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAdapter() {
        getAdapter().notifyDataSetChanged();
        checkFullBottom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOk(List<Record> d) {
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            Logger.i("CurseListLog", "onDataOk curseRecord=" + ((Record) it.next()));
        }
        Logger.i("CurseListLog", "onDataOk isFirstPage=" + ((CurseListVM) getMViewModel()).getFirstPage() + ";size=" + d.size());
        TextView textView = null;
        if (d.isEmpty() && ((CurseListVM) getMViewModel()).getFirstPage()) {
            TextView textView2 = this.emptyView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptyView");
            } else {
                textView = textView2;
            }
            ExtUtilKt.visible(textView);
            MoreRecyclerView recyclerView = ((ysb) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ExtUtilKt.gone(recyclerView);
            return;
        }
        TextView textView3 = this.emptyView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyView");
        } else {
            textView = textView3;
        }
        ExtUtilKt.gone(textView);
        MoreRecyclerView recyclerView2 = ((ysb) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        ExtUtilKt.visible(recyclerView2);
        int i = 0;
        ((ysb) getMBinding()).C.setStatus(!((CurseListVM) getMViewModel()).getHasNext() ? Status.DONE : Status.MORE, false);
        if (((CurseListVM) getMViewModel()).getFirstPage()) {
            this.originCurseRecordList.clear();
            this.dataAdapterList.clear();
            ((CurseListVM) getMViewModel()).setFirstPage(false);
        }
        if (d.isEmpty()) {
            return;
        }
        this.originCurseRecordList.addAll(d);
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Record curseRecord = (Record) obj;
            if (i != 0) {
                ExpandableItem<WrapperCurseRecord> expandableItem = (ExpandableItem) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
                if (expandableItem != null) {
                    dealCurrentWithLastItem(expandableItem, curseRecord, arrayList);
                }
            } else if (this.dataAdapterList.isEmpty()) {
                appendNewHeader(curseRecord, arrayList, true);
            } else {
                dealCurrentWithLastItem((ExpandableItem) CollectionsKt___CollectionsKt.last((List) this.dataAdapterList), curseRecord, arrayList);
            }
            i = i2;
        }
        this.dataAdapterList.addAll(arrayList);
        notifyAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(CurseListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.requireContext(), (Class<?>) CurseEditActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CurseListFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.onDataOk(list);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.CurseManager.OnConfigChange
    public void onDataChange() {
        ((CurseListVM) getMViewModel()).getData(true, 50);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CurseManager.INSTANCE.getInstance().removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        setTitleBackground(iji.E0);
        TextView textView = (TextView) ((ysb) getMBinding()).B.findViewById(eri.C4);
        this.emptyView = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyView");
            textView = null;
        }
        textView.setText(getString(c0j.common_data_empty));
        TextView textView3 = this.emptyView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyView");
        } else {
            textView2 = textView3;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, pni.y2, 0, 0);
        ((ysb) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: h75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CurseListFragment.onViewCreated$lambda$1(this.f19770a, view2);
            }
        });
        initMoreRecyclerView();
        ((CurseListVM) getMViewModel()).getEmitter().observe(getViewLifecycleOwner(), new CurseListFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i75
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseListFragment.onViewCreated$lambda$2(this.f20854a, (List) obj);
            }
        }));
        ((CurseListVM) getMViewModel()).getData(true, 50);
        CurseManager.INSTANCE.getInstance().addDataObserver(this);
    }
}
