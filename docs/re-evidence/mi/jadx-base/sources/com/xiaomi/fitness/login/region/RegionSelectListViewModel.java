package com.xiaomi.fitness.login.region;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.f;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.provider.MergeObservableList;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.login.SplashActivity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.preference.RegionSelectPreference;
import com.xiaomi.fitness.login.region.RegionSelectListViewModel;
import com.xiaomi.fitness.login.request.RegionRequest;
import com.xiaomi.fitness.login.util.LoginUtil;
import com.xiaomi.fitness.login.utils.RegionUtil;
import defpackage.dv1;
import defpackage.g0j;
import defpackage.mui;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00052\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010!\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.RB\u00101\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u00010/j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0018\u0001`08\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\t078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010<\u001a\b\u0012\u0004\u0012\u00020\t078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00109\u001a\u0004\b=\u0010;\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MRY\u0010V\u001aD\u0012\u0015\u0012\u0013\u0018\u00010O¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(R\u0012\u0013\u0012\u00110\u0014¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(S\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0T0Nj\b\u0012\u0004\u0012\u00020\t`U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y¨\u0006\\"}, d2 = {"Lcom/xiaomi/fitness/login/region/RegionSelectListViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/login/region/RegionSelectModel;", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "", "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "countryDataList", "setFilter", "(Landroidx/databinding/f;)V", "originDataList", "closeFilter", "getCurrentList", "()Landroidx/databinding/f;", "getAllList", "", "letter", "", "getLetterPosition", "(Ljava/lang/String;)I", "", "list", "initLetterInDexs", "(Ljava/util/List;)V", "item", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "reference", "switchRegion", "(Lcom/xiaomi/fitness/account/api/bean/CountryInfo;Ljava/lang/ref/WeakReference;)V", "currentCountryItem", "setCurrentCountryItem", "(Lcom/xiaomi/fitness/account/api/bean/CountryInfo;)V", "Lcom/xiaomi/fitness/login/region/RegionSelectListAdapter;", "adapter", "Lcom/xiaomi/fitness/login/region/RegionSelectListAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/login/region/RegionSelectListAdapter;", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "regionItemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getRegionItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "letterIndexes", "Ljava/util/HashMap;", "getLetterIndexes", "()Ljava/util/HashMap;", "setLetterIndexes", "(Ljava/util/HashMap;)V", "Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "regionItems", "Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "getRegionItems", "()Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "mRegionList", "getMRegionList", "setMRegionList", "(Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;)V", "Lcom/xiaomi/fitness/login/request/RegionRequest;", "mRegionRequest", "Lcom/xiaomi/fitness/login/request/RegionRequest;", "getMRegionRequest", "()Lcom/xiaomi/fitness/login/request/RegionRequest;", "setMRegionRequest", "(Lcom/xiaomi/fitness/login/request/RegionRequest;)V", "Lcom/xiaomi/fitness/login/export/RegionManager;", "mRegionManager", "Lcom/xiaomi/fitness/login/export/RegionManager;", "getMRegionManager", "()Lcom/xiaomi/fitness/login/export/RegionManager;", "setMRegionManager", "(Lcom/xiaomi/fitness/login/export/RegionManager;)V", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "viewHolderFactory", "Lkotlin/jvm/functions/Function2;", "getViewHolderFactory", "()Lkotlin/jvm/functions/Function2;", "<init>", "()V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRegionSelectListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionSelectListViewModel.kt\ncom/xiaomi/fitness/login/region/RegionSelectListViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n27#2,5:175\n1#3:180\n*S KotlinDebug\n*F\n+ 1 RegionSelectListViewModel.kt\ncom/xiaomi/fitness/login/region/RegionSelectListViewModel\n*L\n41#1:175,5\n*E\n"})
public final class RegionSelectListViewModel extends BaseViewModel<RegionSelectModel> {

    @NotNull
    private final RegionSelectListAdapter adapter = new RegionSelectListAdapter();

    @Nullable
    private CountryInfo currentCountryItem;

    @Nullable
    private HashMap<String, Integer> letterIndexes;

    @NotNull
    private MergeObservableList<CountryInfo> mRegionList;
    public RegionManager mRegionManager;
    public RegionRequest mRegionRequest;

    @NotNull
    private final ItemBinding<CountryInfo> regionItemBinding;

    @NotNull
    private final MergeObservableList<CountryInfo> regionItems;

    @NotNull
    private final Function2<View, Integer, BaseViewHolder<CountryInfo>> viewHolderFactory;

    public RegionSelectListViewModel() {
        final Function3 function3 = new Function3() { // from class: nck
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RegionSelectListViewModel.regionItemBinding$lambda$0((ItemBinding) obj, ((Integer) obj2).intValue(), (CountryInfo) obj3);
            }
        };
        this.regionItemBinding = ItemBinding.INSTANCE.of(new OnItemBind<CountryInfo>() { // from class: com.xiaomi.fitness.login.region.RegionSelectListViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<CountryInfo> itemBinding, int position, CountryInfo item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        }).bindExtra(dv1.d, this);
        this.regionItems = new MergeObservableList<>();
        this.mRegionList = new MergeObservableList<>();
        this.viewHolderFactory = new Function2() { // from class: ock
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RegionSelectListViewModel.viewHolderFactory$lambda$1((View) obj, ((Integer) obj2).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit regionItemBinding$lambda$0(ItemBinding itemBinding, int i, CountryInfo item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(dv1.f15952b, mui.j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean switchRegion$lambda$6$lambda$4(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        RegionSelectPreference regionSelectPreference = RegionSelectPreference.INSTANCE;
        if (!Intrinsics.areEqual(name, regionSelectPreference.getSpName())) {
            if (!Intrinsics.areEqual(it.getName(), regionSelectPreference.getSpName() + ".crc")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchRegion$lambda$6$lambda$5(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intent intent = new Intent();
        intent.setFlags(268468224);
        intent.setClass(activity, SplashActivity.class);
        activity.startActivity(intent);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).clear();
        AppManager.INSTANCE.getInstance().appExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseViewHolder viewHolderFactory$lambda$1(View view, int i) {
        if (i == mui.j) {
            Intrinsics.checkNotNull(view);
            return new AddRegionViewHolder(view);
        }
        Intrinsics.checkNotNull(view);
        return new AddRegionViewHolder(view);
    }

    public final void closeFilter(@NotNull f<CountryInfo> originDataList) {
        Intrinsics.checkNotNullParameter(originDataList, "originDataList");
        this.regionItems.removeAll();
        this.regionItems.insertList(originDataList);
    }

    @NotNull
    public final RegionSelectListAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final f<CountryInfo> getAllList() {
        return this.mRegionList;
    }

    @NotNull
    public final f<CountryInfo> getCurrentList() {
        return this.regionItems;
    }

    @Nullable
    public final HashMap<String, Integer> getLetterIndexes() {
        return this.letterIndexes;
    }

    public final int getLetterPosition(@NotNull String letter) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        HashMap<String, Integer> map = this.letterIndexes;
        Intrinsics.checkNotNull(map);
        Integer num = map.get(letter);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @NotNull
    public final MergeObservableList<CountryInfo> getMRegionList() {
        return this.mRegionList;
    }

    @NotNull
    public final RegionManager getMRegionManager() {
        RegionManager regionManager = this.mRegionManager;
        if (regionManager != null) {
            return regionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegionManager");
        return null;
    }

    @NotNull
    public final RegionRequest getMRegionRequest() {
        RegionRequest regionRequest = this.mRegionRequest;
        if (regionRequest != null) {
            return regionRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRegionRequest");
        return null;
    }

    @NotNull
    public final ItemBinding<CountryInfo> getRegionItemBinding() {
        return this.regionItemBinding;
    }

    @NotNull
    public final MergeObservableList<CountryInfo> getRegionItems() {
        return this.regionItems;
    }

    @NotNull
    public final Function2<View, Integer, BaseViewHolder<CountryInfo>> getViewHolderFactory() {
        return this.viewHolderFactory;
    }

    public void initLetterInDexs(@Nullable List<CountryInfo> list) {
        String strSubstring;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String pinyin = list.get(i).getPinyin();
            Intrinsics.checkNotNull(pinyin);
            String strSubstring2 = pinyin.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            if (i >= 1) {
                String pinyin2 = list.get(i - 1).getPinyin();
                Intrinsics.checkNotNull(pinyin2);
                strSubstring = pinyin2.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            if (!TextUtils.equals(strSubstring2, strSubstring)) {
                if (this.letterIndexes == null) {
                    this.letterIndexes = new HashMap<>();
                }
                Integer numValueOf = Integer.valueOf(i);
                HashMap<String, Integer> map = this.letterIndexes;
                Intrinsics.checkNotNull(map);
                map.put(strSubstring2, numValueOf);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.regionItems.removeAll();
        this.mRegionList.removeAll();
        f<CountryInfo> regionList = getMModel().getRegionList(this.currentCountryItem);
        this.regionItems.insertList(regionList);
        this.mRegionList.insertList(regionList);
        initLetterInDexs(regionList);
    }

    public final void setCurrentCountryItem(@Nullable CountryInfo currentCountryItem) {
        if (currentCountryItem != null) {
            this.currentCountryItem = currentCountryItem;
        }
    }

    public final void setFilter(@NotNull f<CountryInfo> countryDataList) {
        Intrinsics.checkNotNullParameter(countryDataList, "countryDataList");
        this.regionItems.removeAll();
        this.regionItems.insertList(countryDataList);
    }

    public final void setLetterIndexes(@Nullable HashMap<String, Integer> map) {
        this.letterIndexes = map;
    }

    public final void setMRegionList(@NotNull MergeObservableList<CountryInfo> mergeObservableList) {
        Intrinsics.checkNotNullParameter(mergeObservableList, "<set-?>");
        this.mRegionList = mergeObservableList;
    }

    public final void setMRegionManager(@NotNull RegionManager regionManager) {
        Intrinsics.checkNotNullParameter(regionManager, "<set-?>");
        this.mRegionManager = regionManager;
    }

    public final void setMRegionRequest(@NotNull RegionRequest regionRequest) {
        Intrinsics.checkNotNullParameter(regionRequest, "<set-?>");
        this.mRegionRequest = regionRequest;
    }

    public final void switchRegion(@NotNull CountryInfo item, @NotNull WeakReference<Activity> reference) {
        String strFindRegionByCountry;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(reference, "reference");
        final Activity activity = reference.get();
        if (activity == null) {
            return;
        }
        String name = item.getName();
        RegionBean.CountryInfo countryInfo = name != null ? new RegionBean.CountryInfo(name) : null;
        if (countryInfo != null) {
            String name2 = item.getName();
            if (name2 != null) {
                RegionUtil regionUtil = RegionUtil.INSTANCE;
                Context baseContext = ApplicationExtKt.getApplication().getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
                strFindRegionByCountry = regionUtil.findRegionByCountry(baseContext, name2);
            } else {
                strFindRegionByCountry = null;
            }
            if (strFindRegionByCountry == null || strFindRegionByCountry.length() == 0) {
                ToastUtil.showShortToast(g0j.common_set_error);
            }
            if (strFindRegionByCountry != null) {
                RegionManager.Companion companion = RegionManager.INSTANCE;
                if (strFindRegionByCountry.equals(RegionExtKt.getInstance(companion).getCurrentRegion())) {
                    LoginUtil.INSTANCE.saveCurrentRegion(strFindRegionByCountry, countryInfo.getCountry());
                    RegionExtKt.getInstance(companion).setCurrentCountry(item.getCountry());
                    activity.onBackPressed();
                    RegionManager regionExtKt = RegionExtKt.getInstance(companion);
                    Intrinsics.checkNotNull(regionExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.login.region.RegionManagerImpl");
                    ((RegionManagerImpl) regionExtKt).notifyCountryChangeListener();
                    return;
                }
                getMRegionManager().switchRegion(strFindRegionByCountry);
                FileUtils.INSTANCE.clearSpFile(ApplicationExtKt.getApplication(), new Function1() { // from class: lck
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(RegionSelectListViewModel.switchRegion$lambda$6$lambda$4((File) obj));
                    }
                }, new String[0]);
                Logger.i("region is " + strFindRegionByCountry + ";localCountry " + countryInfo.getCountry() + ";country " + item.getCountry(), new Object[0]);
                RegionExtKt.getInstance(companion).setCurrentRegion(strFindRegionByCountry);
                RegionExtKt.getInstance(companion).setLocaleCountry(countryInfo.getCountry());
                RegionExtKt.getInstance(companion).setCurrentCountry(item.getCountry());
                RegionManager regionExtKt2 = RegionExtKt.getInstance(companion);
                Intrinsics.checkNotNull(regionExtKt2, "null cannot be cast to non-null type com.xiaomi.fitness.login.region.RegionManagerImpl");
                ((RegionManagerImpl) regionExtKt2).notifyCountryChangeListener();
                new Handler().postDelayed(new Runnable() { // from class: mck
                    @Override // java.lang.Runnable
                    public final void run() {
                        RegionSelectListViewModel.switchRegion$lambda$6$lambda$5(activity);
                    }
                }, 500L);
            }
        } else {
            ToastUtil.showShortToast(g0j.common_set_error);
        }
        Logger.i("regiononChangeOkClick:" + countryInfo + " " + (countryInfo != null ? countryInfo.getCountry() : null), new Object[0]);
    }
}
