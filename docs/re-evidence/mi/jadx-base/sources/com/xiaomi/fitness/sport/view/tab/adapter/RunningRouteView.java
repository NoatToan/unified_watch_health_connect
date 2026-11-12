package com.xiaomi.fitness.sport.view.tab.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.sport.view.BaseSportItemView;
import com.xiaomi.fitness.sport.view.ISportTabItemData;
import com.xiaomi.fitness.sport.view.adapter.RunningRouteAdapter;
import com.xiaomi.fitness.sport.view.route.RunningRouteListActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import defpackage.dvi;
import defpackage.gak;
import defpackage.vwq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport/view/tab/adapter/RunningRouteView;", "Lcom/xiaomi/fitness/sport/view/BaseSportItemView;", "Lvwq;", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "Lcom/xiaomi/fitness/sport/view/ISportTabItemData;", "", "setLayoutManager", "()V", "Landroid/content/Context;", "context", "initView", "(Landroid/content/Context;)V", "", "getLayoutId", "()I", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "data", "setDataToView", "(Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;)V", "Lcom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter;", "runningRouteAdapter$delegate", "Lkotlin/Lazy;", "getRunningRouteAdapter", "()Lcom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter;", "runningRouteAdapter", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningRouteView extends BaseSportItemView<vwq, RunningRouteListBean> implements ISportTabItemData<RunningRouteListBean> {

    /* JADX INFO: renamed from: runningRouteAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy runningRouteAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public RunningRouteView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RunningRouteAdapter getRunningRouteAdapter() {
        return (RunningRouteAdapter) this.runningRouteAdapter.getValue();
    }

    private final void initView(final Context context) {
        TextView textView;
        RecyclerView recyclerView;
        vwq binding = getBinding();
        if (binding != null && (recyclerView = binding.B) != null) {
            recyclerView.addItemDecoration(new gak(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(13)));
            recyclerView.setAdapter(getRunningRouteAdapter());
        }
        setLayoutManager();
        vwq binding2 = getBinding();
        if (binding2 == null || (textView = binding2.A) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: a5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RunningRouteView.initView$lambda$3(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "$context");
        context.startActivity(new Intent(context, (Class<?>) RunningRouteListActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RunningRouteAdapter runningRouteAdapter_delegate$lambda$0() {
        return new RunningRouteAdapter();
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
        RecyclerView.o linearLayoutManager;
        RecyclerView recyclerView;
        if (UIUtils.INSTANCE.isTablet()) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView$setLayoutManager$layoutManager$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return 1;
                }
            });
            linearLayoutManager = gridLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        }
        vwq binding = getBinding();
        if (binding == null || (recyclerView = binding.B) == null) {
            return;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public int getLayoutId() {
        return dvi.O1;
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView, android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    public /* synthetic */ RunningRouteView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.xiaomi.fitness.sport.view.BaseSportItemView
    public void setDataToView(@NotNull RunningRouteListBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getRoute_Info_list() != null) {
            RunningRouteAdapter runningRouteAdapter = getRunningRouteAdapter();
            List<RouteInfo> route_Info_list = data.getRoute_Info_list();
            Intrinsics.checkNotNull(route_Info_list, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.sport_export.data.RouteInfo>");
            runningRouteAdapter.setData((ArrayList) route_Info_list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RunningRouteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.runningRouteAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RunningRouteView.runningRouteAdapter_delegate$lambda$0();
            }
        });
        initView(context);
    }
}
