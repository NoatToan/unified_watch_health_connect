package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportTypeEntity;
import defpackage.cji;
import defpackage.eui;
import defpackage.p8h;
import defpackage.rxo;
import defpackage.uj6;
import defpackage.vjr;
import defpackage.wjr;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001JB\u0007¢\u0006\u0004\bI\u0010\u0019J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0019J#\u0010&\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportListFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/BaseWidgetBindingFragment;", "Luj6;", "Lp8h;", "Landroid/view/View;", "view", "", "initContentView", "(Landroid/view/View;)V", "", "isShow", "showEmptyInfo", "(Z)V", "", "Lrxo;", "srcList", "onSupportedSportListAvailable", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeEntity;", "entity", "", "position", "changeType", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeEntity;I)V", "initTypeList", "()V", "type", "getOptionType", "(I)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "obj", "onItemClick", "(Landroid/view/View;Ljava/lang/Object;)V", "Lvjr;", "mAdapter", "Lvjr;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeAdapter;", "mTypeAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportTypeAdapter;", "", "Lwjr;", "mSportList", "Ljava/util/List;", "mShowList", "mTypeList", "mWidgetItemStyle", "I", "mWidgetItemIndex", "listPosition", "mWidgetSubtype", "mWidgetSportType", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mTvEmpty", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mTypeRecyclerView", "mIsSelected", "Z", "", "mShowTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetSportListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetSportListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1010#2,2:238\n*S KotlinDebug\n*F\n+ 1 WidgetSportListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSportListFragment\n*L\n202#1:238,2\n*E\n"})
public final class WidgetSportListFragment extends Hilt_WidgetSportListFragment<uj6> implements p8h {

    @NotNull
    public static final String KEY_WIDGET_ITEM_INDEX = "widget_item_index";

    @NotNull
    public static final String KEY_WIDGET_ITEM_STYLE = "widget_item_style";

    @NotNull
    public static final String KEY_WIDGET_ITEM_SUBTYPE = "widget_item_subtype";

    @NotNull
    public static final String KEY_WIDGET_SPORT_NAME = "key_widget_sport_name";

    @NotNull
    public static final String KEY_WIDGET_SPORT_TYPE = "widget_sport_type";

    @NotNull
    private static final String TAG = "WidgetSportListFragment";

    @NotNull
    public static final String sKeyListPosition = "key_list_position";
    private int listPosition;
    private vjr mAdapter;
    private boolean mIsSelected;
    private RecyclerView mRecyclerView;
    private long mShowTime;

    @Nullable
    private ConstraintLayout mTvEmpty;
    private WidgetSportTypeAdapter mTypeAdapter;
    private RecyclerView mTypeRecyclerView;
    private int mWidgetItemIndex;
    private int mWidgetItemStyle;
    private int mWidgetSportType;
    private int mWidgetSubtype;

    @NotNull
    private final List<wjr> mSportList = new LinkedList();

    @NotNull
    private final List<wjr> mShowList = new ArrayList();

    @NotNull
    private final List<WidgetSportTypeEntity> mTypeList = new ArrayList();

    private final void changeType(WidgetSportTypeEntity entity, int position) {
        this.mShowList.clear();
        for (wjr wjrVar : this.mSportList) {
            if (getOptionType(wjrVar.f38041a) == entity.getType()) {
                this.mShowList.add(wjrVar);
            }
        }
        vjr vjrVar = this.mAdapter;
        WidgetSportTypeAdapter widgetSportTypeAdapter = null;
        if (vjrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            vjrVar = null;
        }
        vjrVar.notifyDataSetChanged();
        int size = this.mTypeList.size();
        int i = 0;
        while (i < size) {
            this.mTypeList.get(i).setSelect(i == position);
            i++;
        }
        WidgetSportTypeAdapter widgetSportTypeAdapter2 = this.mTypeAdapter;
        if (widgetSportTypeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeAdapter");
        } else {
            widgetSportTypeAdapter = widgetSportTypeAdapter2;
        }
        widgetSportTypeAdapter.notifyDataSetChanged();
    }

    private final int getOptionType(int type) {
        return type / 100;
    }

    private final void initContentView(View view) {
        setTitle(wzi.ca);
        setTitleBackground(cji.x);
        this.mTvEmpty = (ConstraintLayout) view.findViewById(zqi.Q0);
        this.mRecyclerView = (RecyclerView) view.findViewById(zqi.G7);
        this.mTypeRecyclerView = (RecyclerView) view.findViewById(zqi.I7);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getMActivity());
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        flexboxLayoutManager.R(4);
        RecyclerView recyclerView = this.mTypeRecyclerView;
        vjr vjrVar = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(flexboxLayoutManager);
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getMActivity()));
        this.mAdapter = new vjr();
        this.mTypeAdapter = new WidgetSportTypeAdapter();
        RecyclerView recyclerView3 = this.mTypeRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeRecyclerView");
            recyclerView3 = null;
        }
        WidgetSportTypeAdapter widgetSportTypeAdapter = this.mTypeAdapter;
        if (widgetSportTypeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeAdapter");
            widgetSportTypeAdapter = null;
        }
        recyclerView3.setAdapter(widgetSportTypeAdapter);
        vjr vjrVar2 = this.mAdapter;
        if (vjrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            vjrVar2 = null;
        }
        vjrVar2.l(this);
        WidgetSportTypeAdapter widgetSportTypeAdapter2 = this.mTypeAdapter;
        if (widgetSportTypeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeAdapter");
            widgetSportTypeAdapter2 = null;
        }
        widgetSportTypeAdapter2.setTypeChooseListener(new Function2() { // from class: xjr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WidgetSportListFragment.initContentView$lambda$2(this.f39198a, (WidgetSportTypeEntity) obj, ((Integer) obj2).intValue());
            }
        });
        RecyclerView recyclerView4 = this.mRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView4 = null;
        }
        vjr vjrVar3 = this.mAdapter;
        if (vjrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            vjrVar3 = null;
        }
        recyclerView4.setAdapter(vjrVar3);
        vjr vjrVar4 = this.mAdapter;
        if (vjrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            vjrVar = vjrVar4;
        }
        vjrVar.setList(this.mShowList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initContentView$lambda$2(WidgetSportListFragment this$0, WidgetSportTypeEntity entity, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(entity, "entity");
        this$0.changeType(entity, i);
        return Unit.INSTANCE;
    }

    private final void initTypeList() {
        ArrayList arrayList = new ArrayList();
        Iterator<wjr> it = this.mSportList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            wjr next = it.next();
            int optionType = getOptionType(next.f38041a);
            if (!arrayList.contains(Integer.valueOf(optionType))) {
                this.mTypeList.add(new WidgetSportTypeEntity(getOptionType(next.f38041a), optionType == 0));
                arrayList.add(Integer.valueOf(getOptionType(next.f38041a)));
            }
        }
        List<WidgetSportTypeEntity> list = this.mTypeList;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportListFragment$initTypeList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WidgetSportTypeEntity) t).getType()), Integer.valueOf(((WidgetSportTypeEntity) t2).getType()));
                }
            });
        }
        WidgetSportTypeAdapter widgetSportTypeAdapter = this.mTypeAdapter;
        WidgetSportTypeAdapter widgetSportTypeAdapter2 = null;
        if (widgetSportTypeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeAdapter");
            widgetSportTypeAdapter = null;
        }
        widgetSportTypeAdapter.setList(this.mTypeList);
        WidgetSportTypeAdapter widgetSportTypeAdapter3 = this.mTypeAdapter;
        if (widgetSportTypeAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeAdapter");
        } else {
            widgetSportTypeAdapter2 = widgetSportTypeAdapter3;
        }
        widgetSportTypeAdapter2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSupportedSportListAvailable(List<rxo> srcList) {
        dismissDialogForce();
        this.mSportList.clear();
        this.mShowList.clear();
        if (srcList == null || srcList.isEmpty()) {
            ToastUtil.showShortToast(wzi.h2);
            showEmptyInfo(true);
            return;
        }
        Iterator<rxo> it = srcList.iterator();
        while (it.hasNext()) {
            wjr wjrVar = new wjr(this.mWidgetSubtype, it.next().c);
            int i = wjrVar.f38041a;
            if (i == this.mWidgetSportType) {
                wjrVar.c = true;
            }
            if (getOptionType(i) == 0) {
                this.mShowList.add(wjrVar);
            }
            this.mSportList.add(wjrVar);
        }
        initTypeList();
        vjr vjrVar = this.mAdapter;
        if (vjrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            vjrVar = null;
        }
        vjrVar.notifyDataSetChanged();
        showEmptyInfo(this.mShowList.isEmpty());
        wjr selectSportEntity = ((WidgetMangerViewModel) getMViewModel()).getSelectSportEntity(this.mWidgetItemIndex);
        if (selectSportEntity != null) {
            selectSportEntity.e = -1;
        }
        if (selectSportEntity != null) {
            selectSportEntity.d = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(WidgetSportListFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((WidgetMangerViewModel) this$0.getMViewModel()).setSupportedSportList(list);
        this$0.onSupportedSportListAvailable(list);
        return Unit.INSTANCE;
    }

    private final void showEmptyInfo(boolean isShow) {
        RecyclerView recyclerView = null;
        if (isShow) {
            ConstraintLayout constraintLayout = this.mTvEmpty;
            Intrinsics.checkNotNull(constraintLayout);
            constraintLayout.setVisibility(0);
            RecyclerView recyclerView2 = this.mRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(8);
            RecyclerView recyclerView3 = this.mTypeRecyclerView;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTypeRecyclerView");
            } else {
                recyclerView = recyclerView3;
            }
            recyclerView.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = this.mTvEmpty;
        Intrinsics.checkNotNull(constraintLayout2);
        constraintLayout2.setVisibility(8);
        RecyclerView recyclerView4 = this.mRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setVisibility(0);
        RecyclerView recyclerView5 = this.mTypeRecyclerView;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeRecyclerView");
        } else {
            recyclerView = recyclerView5;
        }
        recyclerView.setVisibility(0);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.Q0;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("need style, index,subtype args");
        }
        if (!arguments.containsKey(KEY_WIDGET_ITEM_INDEX) || !arguments.containsKey(sKeyListPosition) || !arguments.containsKey(KEY_WIDGET_ITEM_STYLE) || !arguments.containsKey(KEY_WIDGET_ITEM_SUBTYPE) || !arguments.containsKey(KEY_WIDGET_SPORT_TYPE)) {
            throw new IllegalStateException("need style、index、subtype、sportType of widget".toString());
        }
        this.mWidgetItemIndex = arguments.getInt(KEY_WIDGET_ITEM_INDEX);
        this.listPosition = arguments.getInt(sKeyListPosition);
        this.mWidgetItemStyle = arguments.getInt(KEY_WIDGET_ITEM_STYLE);
        this.mWidgetSubtype = arguments.getInt(KEY_WIDGET_ITEM_SUBTYPE);
        this.mWidgetSportType = arguments.getInt(KEY_WIDGET_SPORT_TYPE);
    }

    @Override // defpackage.p8h
    public void onItemClick(@Nullable View view, @Nullable Object obj) {
        FragmentActivity mActivity;
        if (this.mIsSelected || System.currentTimeMillis() - this.mShowTime < 500 || !isResumed()) {
            return;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportListEntity");
        wjr wjrVar = (wjr) obj;
        this.mIsSelected = true;
        Iterator<wjr> it = this.mSportList.iterator();
        while (it.hasNext()) {
            it.next().c = false;
        }
        vjr vjrVar = this.mAdapter;
        if (vjrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            vjrVar = null;
        }
        vjrVar.notifyDataSetChanged();
        if (wjrVar.f38041a != this.mWidgetSportType && (mActivity = getMActivity()) != null) {
            Intent intent = new Intent();
            intent.putExtra(KEY_WIDGET_ITEM_STYLE, this.mWidgetItemStyle);
            intent.putExtra(KEY_WIDGET_ITEM_INDEX, this.mWidgetItemIndex);
            intent.putExtra(KEY_WIDGET_SPORT_TYPE, wjrVar.f38041a);
            intent.putExtra(KEY_WIDGET_ITEM_SUBTYPE, wjrVar.f);
            intent.putExtra(KEY_WIDGET_SPORT_NAME, wjrVar.f38042b);
            intent.putExtra(sKeyListPosition, this.listPosition);
            Unit unit = Unit.INSTANCE;
            mActivity.setResult(-1, intent);
        }
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mShowTime = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initContentView(view);
        showLoading();
        LiveData<List<rxo>> liveDataLoadSportListFromDevice = ((WidgetMangerViewModel) getMViewModel()).loadSportListFromDevice();
        if (liveDataLoadSportListFromDevice != null) {
            liveDataLoadSportListFromDevice.observe(getViewLifecycleOwner(), new WidgetSportListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yjr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WidgetSportListFragment.onViewCreated$lambda$3(this.f40255a, (List) obj);
                }
            }));
        }
    }
}
