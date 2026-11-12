package com.xiaomi.fitness.mine.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.Medal;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.export.data.MineMedalItem;
import com.xiaomi.fitness.mine.MedalEntranceAdapter;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.export.MineSettingManagerExtKt;
import com.xiaomi.fitness.mine.widget.MedalEntranceView;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.util.MedalEntranceLoadUtil;
import com.xiaomi.fitness.util.MineOneTrack;
import defpackage.b2g;
import defpackage.m0j;
import defpackage.vni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001,\u0018\u0000 92\u00020\u0001:\u00019B\u0019\u0012\u0006\u00104\u001a\u000203\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\t*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MedalEntranceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "setLayoutManager", "()V", "refreshColCount", "addAnimator", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "newData", "", "hasDataChanged", "(Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;)Z", "", "Lcom/xiaomi/fitness/medal/export/data/Medal;", "other", "isContentEqual", "(Ljava/util/List;Ljava/util/List;)Z", "jumpToMedalList", "showDefaultMedalList", "showSyncWebDialogIfNeed", "onFinishInflate", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "bindData", "lastMedalEntrance", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "Lb2g;", "mRootView", "Lb2g;", "Landroid/animation/ObjectAnimator;", "showLoadingAnimator", "Landroid/animation/ObjectAnimator;", "Lcom/xiaomi/fitness/mine/MedalEntranceAdapter;", "medalEntranceAdapter$delegate", "Lkotlin/Lazy;", "getMedalEntranceAdapter", "()Lcom/xiaomi/fitness/mine/MedalEntranceAdapter;", "medalEntranceAdapter", "", "colCountPerRow", "I", "lastRowCount", "com/xiaomi/fitness/mine/widget/MedalEntranceView$pageCallback$1", "pageCallback", "Lcom/xiaomi/fitness/mine/widget/MedalEntranceView$pageCallback$1;", "Landroidx/fragment/app/FragmentActivity;", "getCurActivity", "()Landroidx/fragment/app/FragmentActivity;", "curActivity", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalEntranceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalEntranceView.kt\ncom/xiaomi/fitness/mine/widget/MedalEntranceView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,435:1\n1557#2:436\n1628#2,3:437\n*S KotlinDebug\n*F\n+ 1 MedalEntranceView.kt\ncom/xiaomi/fitness/mine/widget/MedalEntranceView\n*L\n168#1:436\n168#1:437,3\n*E\n"})
public final class MedalEntranceView extends ConstraintLayout {

    @NotNull
    public static final String KEY_FROM_MEDAL_HOME = "key_from_medal_home";

    @NotNull
    public static final String TAG = "MedalEntranceView";
    private int colCountPerRow;

    @Nullable
    private MedalEntrance lastMedalEntrance;
    private int lastRowCount;

    @NotNull
    private final b2g mRootView;

    /* JADX INFO: renamed from: medalEntranceAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy medalEntranceAdapter;

    @NotNull
    private final MedalEntranceView$pageCallback$1 pageCallback;
    private ObjectAnimator showLoadingAnimator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MedalEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medalEntranceAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cdf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MedalEntranceView.medalEntranceAdapter_delegate$lambda$0();
            }
        });
        this.colCountPerRow = 4;
        this.lastRowCount = 4;
        b2g b2gVarA0 = b2g.A0(LayoutInflater.from(context), this, true);
        this.mRootView = b2gVarA0;
        refreshColCount();
        setLayoutManager();
        this.lastRowCount = this.colCountPerRow;
        getMedalEntranceAdapter().setOnItemClickListener(new MedalEntranceAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$onItemClickListener$1
            @Override // com.xiaomi.fitness.mine.MedalEntranceAdapter.OnItemClickListener
            public void onClick(Medal medal) {
                Intrinsics.checkNotNullParameter(medal, "medal");
                Logger.d(MedalEntranceView.TAG, "onClick medal=" + medal);
                if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), ResourceExtKt.getString(m0j.common_hint_network_unavailable));
                    return;
                }
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    FragmentActivity curActivity = this.this$0.getCurActivity();
                    if (curActivity != null) {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(curActivity);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("key_params_medal_id", medal.getId());
                bundle.putString("key_params_medal_type", medal.getMedalType());
                bundle.putInt("key_params_medal_class", medal.getMedalClass());
                FragmentActivity curActivity2 = this.this$0.getCurActivity();
                if (curActivity2 != null) {
                    MedalManagerExtKt.getInstance(MedalManager.INSTANCE).goToMedalDetailActivity(curActivity2, bundle);
                }
            }
        });
        b2gVarA0.F.setAdapter(getMedalEntranceAdapter());
        this.pageCallback = new MedalEntranceView$pageCallback$1(this);
    }

    private final void addAnimator() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mRootView.E, EditCustomTabLayoutHolder.PROPERTY_NAME_TRANSLATION_X, UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()));
        this.showLoadingAnimator = objectAnimatorOfFloat;
        ObjectAnimator objectAnimator = null;
        if (objectAnimatorOfFloat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showLoadingAnimator");
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimator2 = this.showLoadingAnimator;
        if (objectAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showLoadingAnimator");
            objectAnimator2 = null;
        }
        objectAnimator2.setRepeatMode(1);
        ObjectAnimator objectAnimator3 = this.showLoadingAnimator;
        if (objectAnimator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showLoadingAnimator");
        } else {
            objectAnimator = objectAnimator3;
        }
        objectAnimator.setDuration(500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentActivity getCurActivity() {
        return (FragmentActivity) AppManager.INSTANCE.getInstance().getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MedalEntranceAdapter getMedalEntranceAdapter() {
        return (MedalEntranceAdapter) this.medalEntranceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasDataChanged(MedalEntrance newData) {
        List<Medal> medals;
        List<Medal> medals2;
        MedalEntrance medalEntrance = this.lastMedalEntrance;
        if (medalEntrance == null && newData != null) {
            Logger.d(TAG, "首次加载数据");
            return true;
        }
        if (medalEntrance != null && newData == null) {
            Logger.d(TAG, "数据从有到无");
            return true;
        }
        if (!Intrinsics.areEqual(medalEntrance, newData)) {
            return true;
        }
        MedalEntrance medalEntrance2 = this.lastMedalEntrance;
        if (!Intrinsics.areEqual((medalEntrance2 == null || (medals2 = medalEntrance2.getMedals()) == null) ? null : Integer.valueOf(medals2.size()), (newData == null || (medals = newData.getMedals()) == null) ? null : Integer.valueOf(medals.size()))) {
            return true;
        }
        MedalEntrance medalEntrance3 = this.lastMedalEntrance;
        return !isContentEqual(medalEntrance3 != null ? medalEntrance3.getMedals() : null, newData != null ? newData.getMedals() : null);
    }

    private final boolean isContentEqual(List<Medal> list, List<Medal> list2) {
        ArrayList arrayList;
        if (list == null && list2 == null) {
            return true;
        }
        ArrayList arrayList2 = null;
        if (!Intrinsics.areEqual(list != null ? Integer.valueOf(list.size()) : null, list2 != null ? Integer.valueOf(list2.size()) : null)) {
            return false;
        }
        if (list != null) {
            List<Medal> list3 = list;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Medal) it.next()).getId()));
            }
        } else {
            arrayList = null;
        }
        if (list2 != null) {
            List<Medal> list4 = list2;
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((Medal) it2.next()).getId()));
            }
        }
        return Intrinsics.areEqual(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToMedalList() {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), ResourceExtKt.getString(m0j.common_hint_network_unavailable));
            return;
        }
        MineOneTrack.INSTANCE.trackMedal();
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "medal_into_banner"), TuplesKt.to("source", "profile_tab_page"), TuplesKt.to("tip", "56.16.1.1.22913"));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMapOf);
        Logger.d(TAG, "medal entrance oneTrack map=" + mapMapOf);
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_from_medal_home", true);
        FragmentActivity curActivity = getCurActivity();
        if (curActivity != null) {
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).goToMedalListActivity(curActivity, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MedalEntranceAdapter medalEntranceAdapter_delegate$lambda$0() {
        return new MedalEntranceAdapter();
    }

    private final void refreshColCount() {
        int i = 6;
        if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded() && !UIUtils.INSTANCE.isTablet()) {
            i = 4;
        }
        this.colCountPerRow = i;
    }

    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(ApplicationExtKt.getApplication(), this.colCountPerRow);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        this.mRootView.F.setLayoutManager(gridLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDefaultMedalList() {
        ConstraintLayout mineMainMedalErrorView = this.mRootView.I;
        Intrinsics.checkNotNullExpressionValue(mineMainMedalErrorView, "mineMainMedalErrorView");
        ViewExtKt.gone(mineMainMedalErrorView);
        RecyclerView medalEntranceRecyclerView = this.mRootView.F;
        Intrinsics.checkNotNullExpressionValue(medalEntranceRecyclerView, "medalEntranceRecyclerView");
        ViewExtKt.visible(medalEntranceRecyclerView);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MineMedalItem(ResourceExtKt.getString(m0j.M), Integer.valueOf(vni.D), 0, null));
        arrayList.add(new MineMedalItem(ResourceExtKt.getString(m0j.N), Integer.valueOf(vni.E), 0, null));
        arrayList.add(new MineMedalItem(ResourceExtKt.getString(m0j.L), Integer.valueOf(vni.C), 0, null));
        arrayList.add(new MineMedalItem(ResourceExtKt.getString(m0j.O), Integer.valueOf(vni.F), 0, null));
        if (this.colCountPerRow == 6) {
            arrayList.add(new MineMedalItem(null, Integer.valueOf(vni.z), 2, null));
            arrayList.add(new MineMedalItem(null, Integer.valueOf(vni.z), 2, null));
        }
        getMedalEntranceAdapter().submitList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSyncWebDialogIfNeed() {
        FragmentActivity curActivity = getCurActivity();
        if (curActivity != null) {
            MineSettingManagerExtKt.getInstance(MineSettingManager.INSTANCE).showWebSyncDialogIfNeed(curActivity, new IWebSyncImpl() { // from class: com.xiaomi.fitness.mine.widget.MedalEntranceView$showSyncWebDialogIfNeed$1$1
                @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncAccepted() {
                    super.onWebSyncAccepted();
                    this.this$0.bindData();
                }
            });
            Logger.d(TAG, "SYNC WEB showIfNeed");
        }
    }

    public final void bindData() {
        MedalEntrance medalEntrance = this.lastMedalEntrance;
        if (medalEntrance == null || this.lastRowCount != this.colCountPerRow) {
            MedalEntranceLoadUtil.INSTANCE.getMedalEntranceData(this.pageCallback);
        } else {
            this.pageCallback.showSuccess2(medalEntrance);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i = this.colCountPerRow;
        refreshColCount();
        if (i != this.colCountPerRow) {
            setLayoutManager();
            MedalEntrance medalEntrance = this.lastMedalEntrance;
            if (medalEntrance != null) {
                this.pageCallback.showSuccess2(medalEntrance);
            } else {
                bindData();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }
}
