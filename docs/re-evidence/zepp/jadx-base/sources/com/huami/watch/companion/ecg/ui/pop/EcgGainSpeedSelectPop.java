package com.huami.watch.companion.ecg.ui.pop;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.ui.pop.EcgGainSpeedSelectPop;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\rB\u0011\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J*\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/pop/EcgGainSpeedSelectPop;", "Landroid/widget/PopupWindow;", "", "mode", "Lkotlin/Function1;", "", "", "callback", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "show", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgGainSpeedSelectPop extends PopupWindow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODE_GAIN = 0;
    public static final int MODE_SPEED = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/pop/EcgGainSpeedSelectPop$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watch/companion/ecg/ui/pop/EcgGainSpeedSelectPop;", "newInstance", "", "MODE_GAIN", LogUtil.I, "MODE_SPEED", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EcgGainSpeedSelectPop newInstance(@NotNull Context context) {
            return new EcgGainSpeedSelectPop(context, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"com/huami/watch/companion/ecg/ui/pop/EcgGainSpeedSelectPop$a", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "a", "", LogUtil.I, "b", "()I", "mode", "<init>", "(I)V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends BaseQuickAdapter<Float, BaseViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int mode;

        public a(int i) {
            super(R.layout.item_ecg_gian_speed_select);
            this.mode = i;
        }

        public void a(@NotNull BaseViewHolder helper, float item) {
            int i = R.id.select_item;
            StringBuilder sb = new StringBuilder();
            sb.append(item);
            sb.append(this.mode == 0 ? "mm/mv" : "mm/s");
            helper.setText(i, sb.toString());
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMode() {
            return this.mode;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, Float f) {
            a(baseViewHolder, f.floatValue());
        }
    }

    private EcgGainSpeedSelectPop(Context context) {
        super(context);
        this.context = context;
        setWidth(-2);
        setHeight(-2);
        setContentView(LayoutInflater.from(context).inflate(R.layout.view_ecg_gain_speed_select, (ViewGroup) null));
        setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(context, R.color.s36)));
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
    }

    public /* synthetic */ EcgGainSpeedSelectPop(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void b(int mode, final Function1<? super Float, Unit> callback) {
        RecyclerView recyclerView = (RecyclerView) getContentView().findViewById(R.id.select_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.context));
        recyclerView.getLayoutManager().setAutoMeasureEnabled(true);
        a aVar = new a(mode);
        final List listListOf = mode == 0 ? CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(20.0f)}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(12.5f), Float.valueOf(25.0f), Float.valueOf(50.0f)});
        aVar.setNewData(listListOf);
        aVar.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: ch1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                EcgGainSpeedSelectPop.c(callback, listListOf, this, baseQuickAdapter, view, i);
            }
        });
        recyclerView.setAdapter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, List list, EcgGainSpeedSelectPop ecgGainSpeedSelectPop, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        function1.invoke(list.get(i));
        ecgGainSpeedSelectPop.dismiss();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void show(@NotNull View view, int mode, @NotNull Function1<? super Float, Unit> callback) {
        b(mode, callback);
        getContentView().measure(0, 0);
        showAsDropDown(view, 0, -(view.getHeight() + getContentView().getMeasuredHeight() + 20));
    }
}
