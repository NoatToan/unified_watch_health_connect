package com.xiaomi.fitness.sport.view.tab.adapter;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.sport.bean.LocalSportBean;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.HorizontalCardListItemDecoration;
import com.xiaomi.fitness.sport.view.BaseSportItemView;
import com.xiaomi.fitness.sport.view.adapter.LocalSportAdapter;
import defpackage.dvi;
import defpackage.xuq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0016j\b\u0012\u0004\u0012\u00020\u0003`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/LocalSportEcoView;", "Lcom/xiaomi/fitness/sport/view/BaseSportItemView;", "Lxuq;", "Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "", "setLayoutManager", "()V", "", "getLayoutId", "()I", "data", "setDataToView", "(Lcom/xiaomi/fitness/sport/bean/LocalSportBean;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "itemData", "Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "Lcom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter;", "adapter", "Lcom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "buildEcoLocalSportList", "Ljava/util/ArrayList;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "SportDataUtil", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalSportEcoView extends BaseSportItemView<xuq, LocalSportBean> {

    @NotNull
    private final LocalSportAdapter adapter;

    @NotNull
    private final ArrayList<LocalSportBean> buildEcoLocalSportList;

    @Nullable
    private LocalSportBean itemData;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/LocalSportEcoView$SportDataUtil;", "", "<init>", "()V", "cardZoom", "", "context", "Landroid/content/Context;", "itemData", "Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "view", "Landroid/view/View;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SportDataUtil {

        @NotNull
        public static final SportDataUtil INSTANCE = new SportDataUtil();

        private SportDataUtil() {
        }

        public final void cardZoom(@NotNull Context context, @Nullable LocalSportBean itemData, @Nullable View view) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNull(view);
            new LocalSportEcoView$SportDataUtil$cardZoom$1(context, itemData, view).setRadius((int) ExtensionsKt.getPx(15));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSportEcoView(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.adapter = new LocalSportAdapter(context);
        this.buildEcoLocalSportList = Test.INSTANCE.buildEcoLocalSportList();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void setLayoutManager() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        LinearLayoutManager linearLayoutManager;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.sport.view.tab.adapter.LocalSportEcoView$setLayoutManager$gridLayoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        xuq binding = getBinding();
        if (binding != null && (recyclerView4 = binding.B) != null) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!uIUtils.isTabletAndLandscape(context)) {
                linearLayoutManager = gridLayoutManager;
                linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            }
            linearLayoutManager = gridLayoutManager;
            recyclerView4.setLayoutManager(linearLayoutManager);
        }
        xuq binding2 = getBinding();
        if (binding2 != null && (recyclerView3 = binding2.B) != null) {
            recyclerView3.setAdapter(this.adapter);
        }
        xuq binding3 = getBinding();
        if (binding3 != null && (recyclerView2 = binding3.B) != null) {
            ItemDecorationExtKt.clearAllItemDecorations(recyclerView2);
        }
        HorizontalCardListItemDecoration horizontalCardListItemDecoration = new HorizontalCardListItemDecoration(this.buildEcoLocalSportList.size(), ExtUtilsKt.getDp(0), ExtUtilsKt.getDp(12));
        xuq binding4 = getBinding();
        if (binding4 != null && (recyclerView = binding4.B) != null) {
            recyclerView.addItemDecoration(horizontalCardListItemDecoration);
        }
        this.adapter.setData(this.buildEcoLocalSportList);
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public int getLayoutId() {
        return dvi.E1;
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView, android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public void setDataToView(@NotNull LocalSportBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.itemData = data;
        xuq binding = getBinding();
        if (binding != null) {
            binding.A0(data);
        }
        setLayoutManager();
    }
}
