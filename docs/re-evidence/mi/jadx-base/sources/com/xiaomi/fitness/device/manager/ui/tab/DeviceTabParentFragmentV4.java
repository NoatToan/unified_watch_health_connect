package com.xiaomi.fitness.device.manager.ui.tab;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import defpackage.bji;
import defpackage.dui;
import defpackage.eih;
import defpackage.j56;
import defpackage.zv1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001>\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BB\t\b\u0007¢\u0006\u0004\bA\u0010\u000fJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010\u000fJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u000fR\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R3\u0010-\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b,0+8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010\u000f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R5\u0010;\u001a#\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u000107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R5\u0010=\u001a#\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u000107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentFragmentV4;", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentViewModel;", "Lj56;", "", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "tabs", "", "initTitleView", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "showPopupMenu", "(Landroid/view/View;)V", "initView", "()V", "", "fromEco", "fromRN", "refreshTabs", "(ZZ)V", "", "index", "setSelect", "(I)V", "getContentView", "()Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "selectOtherDeviceTab", LifecycleConstantKt.ON_DESTROY, "needSelectOtherDeviceTab", "Z", "", "currentTabs", "Ljava/util/List;", "showTabs", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabPagerAdapter;", "pageAdapter", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabPagerAdapter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "mTabs", "Ljava/util/Set;", "getMTabs", "()Ljava/util/Set;", "setMTabs", "(Ljava/util/Set;)V", "getMTabs$annotations", "mDefaultIndex", "I", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lkotlin/ParameterName;", "name", "deviceModel", "deviceChangeListener", "Lkotlin/jvm/functions/Function1;", "rnDeviceChangeListener", "com/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentFragmentV4$onEcoDeviceStatusListener$1", "onEcoDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentFragmentV4$onEcoDeviceStatusListener$1;", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceTabParentFragmentV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceTabParentFragmentV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentFragmentV4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1#2:267\n1053#3:268\n1557#3:269\n1628#3,3:270\n774#3:273\n865#3,2:274\n1053#3:276\n1863#3,2:277\n774#3:279\n865#3,2:280\n1755#3,3:282\n360#3,7:285\n774#3:292\n865#3,2:293\n*S KotlinDebug\n*F\n+ 1 DeviceTabParentFragmentV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabParentFragmentV4\n*L\n91#1:268\n91#1:269\n91#1:270,3\n129#1:273\n129#1:274,2\n135#1:276\n137#1:277,2\n158#1:279\n158#1:280,2\n194#1:282,3\n203#1:285,7\n96#1:292\n96#1:293,2\n*E\n"})
public final class DeviceTabParentFragmentV4 extends Hilt_DeviceTabParentFragmentV4<DeviceTabParentViewModel, j56> {

    @NotNull
    private static final String TAG = "DeviceTabParentFragmentV4";

    @NotNull
    private final List<DeviceTabInfoProvider> currentTabs;

    @NotNull
    private final Function1<DeviceModel<?>, Unit> deviceChangeListener;
    private int mDefaultIndex;
    public Set<DeviceTabInfoProvider> mTabs;
    private boolean needSelectOtherDeviceTab;

    @NotNull
    private final DeviceTabParentFragmentV4$onEcoDeviceStatusListener$1 onEcoDeviceStatusListener;

    @Nullable
    private DeviceTabPagerAdapter pageAdapter;

    @NotNull
    private final Function1<DeviceModel<?>, Unit> rnDeviceChangeListener;

    @NotNull
    private final List<DeviceTabInfoProvider> showTabs;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4$onEcoDeviceStatusListener$1] */
    public DeviceTabParentFragmentV4() {
        super(dui.p, zv1.f41707k);
        this.currentTabs = new ArrayList();
        this.showTabs = new ArrayList();
        this.deviceChangeListener = new Function1() { // from class: gs6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabParentFragmentV4.deviceChangeListener$lambda$24(this.f19292a, (DeviceModel) obj);
            }
        };
        this.rnDeviceChangeListener = new Function1() { // from class: hs6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabParentFragmentV4.rnDeviceChangeListener$lambda$25(this.f20399a, (DeviceModel) obj);
            }
        };
        this.onEcoDeviceStatusListener = new OnEcoDeviceFullStatusListener() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4$onEcoDeviceStatusListener$1
            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener
            public void onBind(String did, boolean isRebind) {
                super.onBind(did, isRebind);
                Logger.i("DeviceTabParentFragmentV4", "onBind: " + did + " isRebind: " + isRebind);
                try {
                    DeviceTabParentFragmentV4.refreshTabs$default(this.this$0, true, false, 2, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                Logger.i("DeviceTabParentFragmentV4", "onDestroy: " + did + " isRemoved: " + isRemoved);
                try {
                    DeviceTabParentFragmentV4.refreshTabs$default(this.this$0, true, false, 2, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangeListener$lambda$24(DeviceTabParentFragmentV4 this$0, DeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onDeviceChange " + deviceModel);
        AnyExtKt.main$default(null, new DeviceTabParentFragmentV4$deviceChangeListener$1$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getMTabs$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitleView(List<? extends DeviceTabInfoProvider> tabs) {
        int i;
        Object next;
        Object next2;
        setTitle((String) null);
        List<? extends DeviceTabInfoProvider> list = tabs;
        Iterator<T> it = list.iterator();
        do {
            i = 3;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DeviceTabInfoProvider) next).index() != 3);
        DeviceTabInfoProvider deviceTabInfoProvider = (DeviceTabInfoProvider) next;
        int iDeviceCount = deviceTabInfoProvider != null ? deviceTabInfoProvider.deviceCount() : 0;
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((DeviceTabInfoProvider) next2).index() != 4);
        DeviceTabInfoProvider deviceTabInfoProvider2 = (DeviceTabInfoProvider) next2;
        int iDeviceCount2 = deviceTabInfoProvider2 != null ? deviceTabInfoProvider2.deviceCount() : 0;
        if (iDeviceCount == 0 && iDeviceCount2 == 0) {
            i = 1;
        } else if (iDeviceCount2 != 0) {
            i = iDeviceCount == 0 ? 2 : 4;
        }
        HomeHeaderTabTitleView homeHeaderTabTitleView = ((j56) getMBinding()).A;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4$initTitleView$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((DeviceTabInfoProvider) t).index()), Integer.valueOf(((DeviceTabInfoProvider) t2).index()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it3 = listSortedWith.iterator();
        while (it3.hasNext()) {
            arrayList.add(((DeviceTabInfoProvider) it3.next()).tabName(i));
        }
        HomeHeaderTabTitleView.setTitle$default(homeHeaderTabTitleView, arrayList, 0, 2, (Object) null);
        ((j56) getMBinding()).A.setTitleSelectListener(new Function1() { // from class: is6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabParentFragmentV4.initTitleView$lambda$5(this.f22040a, ((Integer) obj).intValue());
            }
        });
        ((j56) getMBinding()).A.setMenuClickListener(new View.OnClickListener() { // from class: js6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceTabParentFragmentV4.initTitleView$lambda$6(this.f23085a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initTitleView$lambda$5(DeviceTabParentFragmentV4 this$0, int i) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "select tab: " + i);
        ((j56) this$0.getMBinding()).B.setCurrentItem(i);
        Set<DeviceTabInfoProvider> mTabs = this$0.getMTabs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : mTabs) {
            DeviceTabInfoProvider deviceTabInfoProvider = (DeviceTabInfoProvider) obj;
            if (deviceTabInfoProvider.index() > 2 && deviceTabInfoProvider.deviceCount() > 0) {
                arrayList.add(obj);
            }
        }
        DeviceTabInfoProvider deviceTabInfoProvider2 = (DeviceTabInfoProvider) CollectionsKt___CollectionsKt.getOrNull(arrayList, i);
        if (deviceTabInfoProvider2 == null) {
            return Unit.INSTANCE;
        }
        if (deviceTabInfoProvider2.index() == 3) {
            str = "Device_page_Weardevicetab";
            str2 = "56.51.0.1.36382";
        } else {
            str = "Device_page_Otherdevicetab";
            str2 = "56.51.0.1.36383";
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", str2), "name", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleView$lambda$6(DeviceTabParentFragmentV4 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupMenu(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        Object obj;
        Object next;
        this.currentTabs.clear();
        this.showTabs.clear();
        Set<DeviceTabInfoProvider> mTabs = getMTabs();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mTabs) {
            DeviceTabInfoProvider deviceTabInfoProvider = (DeviceTabInfoProvider) obj2;
            if (deviceTabInfoProvider.index() > 2 && deviceTabInfoProvider.deviceCount() > 0) {
                arrayList.add(obj2);
            }
        }
        this.currentTabs.addAll(arrayList);
        Iterator<T> it = getMTabs().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DeviceTabInfoProvider) next).index() != 3);
        DeviceTabInfoProvider deviceTabInfoProvider2 = (DeviceTabInfoProvider) next;
        if (arrayList.isEmpty() && deviceTabInfoProvider2 != null) {
            ListExtKt.add(arrayList, deviceTabInfoProvider2);
        }
        Iterator it2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4$initView$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((DeviceTabInfoProvider) t).index()), Integer.valueOf(((DeviceTabInfoProvider) t2).index()));
            }
        }).iterator();
        while (it2.hasNext()) {
            this.showTabs.add((DeviceTabInfoProvider) it2.next());
        }
        initTitleView(this.showTabs);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.pageAdapter = new DeviceTabPagerAdapter(childFragmentManager, this.showTabs);
        ((j56) getMBinding()).B.setAdapter(this.pageAdapter);
        ((j56) getMBinding()).B.addOnPageChangeListener(new ViewPager.k() { // from class: com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4.initView.3
            @Override // androidx.viewpager.widget.ViewPager.k, androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                DeviceTabInfoProvider deviceTabInfoProvider3 = (DeviceTabInfoProvider) CollectionsKt___CollectionsKt.getOrNull(DeviceTabParentFragmentV4.this.showTabs, position);
                int iIndex = deviceTabInfoProvider3 != null ? deviceTabInfoProvider3.index() : 3;
                DeviceTabParentFragmentV4.this.mDefaultIndex = iIndex;
                DeviceTabParentFragmentV4.this.setSelect(iIndex);
            }
        });
        for (Object obj3 : this.showTabs) {
            if (((DeviceTabInfoProvider) obj3).deviceCount() > 0) {
                obj = obj3;
                break;
            }
        }
        DeviceTabInfoProvider deviceTabInfoProvider3 = (DeviceTabInfoProvider) obj;
        int iIndex = deviceTabInfoProvider3 != null ? deviceTabInfoProvider3.index() : 3;
        this.mDefaultIndex = iIndex;
        setSelect(iIndex);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[LOOP:6: B:80:0x0157->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshTabs(boolean fromEco, boolean fromRN) {
        int iIndex;
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        List<DeviceTabInfoProvider> list;
        Iterator<T> it;
        int iIndex2;
        int i;
        DeviceTabInfoProvider deviceTabInfoProvider;
        Set<DeviceTabInfoProvider> mTabs = getMTabs();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : mTabs) {
            DeviceTabInfoProvider deviceTabInfoProvider2 = (DeviceTabInfoProvider) obj2;
            if (deviceTabInfoProvider2.index() > 2 && deviceTabInfoProvider2.deviceCount() > 0) {
                arrayList.add(obj2);
            }
        }
        Iterator<T> it2 = this.currentTabs.iterator();
        do {
            iIndex = 3;
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((DeviceTabInfoProvider) next).index() != 3);
        DeviceTabInfoProvider deviceTabInfoProvider3 = (DeviceTabInfoProvider) next;
        Iterator<T> it3 = this.currentTabs.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((DeviceTabInfoProvider) next2).index() != 4);
        DeviceTabInfoProvider deviceTabInfoProvider4 = (DeviceTabInfoProvider) next2;
        this.currentTabs.clear();
        this.currentTabs.addAll(arrayList);
        Iterator it4 = arrayList.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (((DeviceTabInfoProvider) next3).index() != 3);
        DeviceTabInfoProvider deviceTabInfoProvider5 = (DeviceTabInfoProvider) next3;
        Iterator it5 = arrayList.iterator();
        do {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
        } while (((DeviceTabInfoProvider) next4).index() != 4);
        DeviceTabInfoProvider deviceTabInfoProvider6 = (DeviceTabInfoProvider) next4;
        if (deviceTabInfoProvider6 != null && deviceTabInfoProvider4 == null) {
            this.showTabs.add(deviceTabInfoProvider6);
        }
        boolean z = false;
        if (deviceTabInfoProvider3 == null && deviceTabInfoProvider4 != null && ((deviceTabInfoProvider5 == null && deviceTabInfoProvider6 == null) || (deviceTabInfoProvider5 != null && deviceTabInfoProvider6 != null))) {
            if (deviceTabInfoProvider5 == null) {
                for (Object obj3 : getMTabs()) {
                    if (((DeviceTabInfoProvider) obj3).index() == 3) {
                        obj = obj3;
                        break;
                    }
                }
                ListExtKt.add(this.showTabs, 0, (DeviceTabInfoProvider) obj);
            } else {
                this.showTabs.add(0, deviceTabInfoProvider5);
            }
            z = true;
        }
        if (deviceTabInfoProvider4 != null && deviceTabInfoProvider6 == null) {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.showTabs, new Function1() { // from class: ls6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj4) {
                    return Boolean.valueOf(DeviceTabParentFragmentV4.refreshTabs$lambda$20((DeviceTabInfoProvider) obj4));
                }
            });
        }
        if (deviceTabInfoProvider5 != null || deviceTabInfoProvider6 == null || (!(deviceTabInfoProvider3 == null && deviceTabInfoProvider4 == null) && (deviceTabInfoProvider3 == null || deviceTabInfoProvider4 == null))) {
            if (!z) {
                DeviceTabPagerAdapter deviceTabPagerAdapter = this.pageAdapter;
                if (deviceTabPagerAdapter != null) {
                    deviceTabPagerAdapter.notifyDataSetChanged();
                }
            }
            initTitleView(this.showTabs);
            list = this.showTabs;
            if ((list instanceof Collection) || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    iIndex2 = ((DeviceTabInfoProvider) it.next()).index();
                    i = this.mDefaultIndex;
                    if (iIndex2 == i) {
                        iIndex = i;
                    }
                }
                deviceTabInfoProvider = (DeviceTabInfoProvider) CollectionsKt___CollectionsKt.firstOrNull((List) this.showTabs);
                if (deviceTabInfoProvider != null) {
                    iIndex = deviceTabInfoProvider.index();
                }
            } else {
                deviceTabInfoProvider = (DeviceTabInfoProvider) CollectionsKt___CollectionsKt.firstOrNull((List) this.showTabs);
                if (deviceTabInfoProvider != null) {
                    iIndex = deviceTabInfoProvider.index();
                }
            }
            this.mDefaultIndex = iIndex;
            setSelect(iIndex);
        }
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.showTabs, new Function1() { // from class: ms6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj4) {
                return Boolean.valueOf(DeviceTabParentFragmentV4.refreshTabs$lambda$21((DeviceTabInfoProvider) obj4));
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.pageAdapter = new DeviceTabPagerAdapter(childFragmentManager, this.showTabs);
        ((j56) getMBinding()).B.setAdapter(this.pageAdapter);
        initTitleView(this.showTabs);
        list = this.showTabs;
        if (list instanceof Collection) {
            it = list.iterator();
            while (it.hasNext()) {
                iIndex2 = ((DeviceTabInfoProvider) it.next()).index();
                i = this.mDefaultIndex;
                if (iIndex2 == i) {
                    iIndex = i;
                }
            }
            deviceTabInfoProvider = (DeviceTabInfoProvider) CollectionsKt___CollectionsKt.firstOrNull((List) this.showTabs);
            if (deviceTabInfoProvider != null) {
                iIndex = deviceTabInfoProvider.index();
            }
        } else {
            it = list.iterator();
            while (it.hasNext()) {
                iIndex2 = ((DeviceTabInfoProvider) it.next()).index();
                i = this.mDefaultIndex;
                if (iIndex2 == i) {
                    iIndex = i;
                }
            }
            deviceTabInfoProvider = (DeviceTabInfoProvider) CollectionsKt___CollectionsKt.firstOrNull((List) this.showTabs);
            if (deviceTabInfoProvider != null) {
                iIndex = deviceTabInfoProvider.index();
            }
        }
        this.mDefaultIndex = iIndex;
        setSelect(iIndex);
    }

    public static /* synthetic */ void refreshTabs$default(DeviceTabParentFragmentV4 deviceTabParentFragmentV4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        deviceTabParentFragmentV4.refreshTabs(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshTabs$lambda$20(DeviceTabInfoProvider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.index() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshTabs$lambda$21(DeviceTabInfoProvider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.index() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rnDeviceChangeListener$lambda$25(DeviceTabParentFragmentV4 this$0, DeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onRNDeviceChange " + deviceModel);
        AnyExtKt.main$default(null, new DeviceTabParentFragmentV4$rnDeviceChangeListener$1$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelect(int index) {
        Iterator<DeviceTabInfoProvider> it = this.showTabs.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().index() == index) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            eih adapter = ((j56) getMBinding()).B.getAdapter();
            Intrinsics.checkNotNull(adapter);
            if (i < adapter.getCount()) {
                ((j56) getMBinding()).B.setCurrentItem(i);
                ((j56) getMBinding()).A.updateSelect(i);
            }
        }
    }

    private final void showPopupMenu(View view) {
        showPopupMenu(view, new Function1() { // from class: ks6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceTabParentFragmentV4.showPopupMenu$lambda$8(this.f24253a, (MenuItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPopupMenu$lambda$8(DeviceTabParentFragmentV4 this$0, MenuItem it) {
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Iterator<T> it2 = this$0.getMTabs().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((DeviceTabInfoProvider) next).index() != 3);
        DeviceTabFragmentV4 deviceTabFragmentV4 = next instanceof DeviceTabFragmentV4 ? (DeviceTabFragmentV4) next : null;
        if (deviceTabFragmentV4 != null) {
            deviceTabFragmentV4.checkChosenAppIfNeed();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment
    @Nullable
    public View getContentView() {
        return ((j56) getMBinding()).B;
    }

    @NotNull
    public final Set<DeviceTabInfoProvider> getMTabs() {
        Set<DeviceTabInfoProvider> set = this.mTabs;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mTabs");
        return null;
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChangeListener);
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).removeDeviceChangeListener(this.rnDeviceChangeListener);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this.onEcoDeviceStatusListener);
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initView();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChangeListener);
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).addDeviceChangeListener(this.rnDeviceChangeListener);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this.onEcoDeviceStatusListener);
        BaseFragmentExtKt.setStatusBarColor(this, bji.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        if (this.needSelectOtherDeviceTab) {
            eih adapter = ((j56) getMBinding()).B.getAdapter();
            if (adapter != null && adapter.getCount() > 1) {
                ((j56) getMBinding()).B.setCurrentItem(1);
            }
            this.needSelectOtherDeviceTab = false;
        }
        ((DeviceTabParentViewModel) getMViewModel()).updateDevices();
    }

    public final void selectOtherDeviceTab() {
        this.needSelectOtherDeviceTab = true;
    }

    public final void setMTabs(@NotNull Set<DeviceTabInfoProvider> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.mTabs = set;
    }
}
