package com.xiaomi.fitness.health.threetarget.adpter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.health.threetarget.adpter.MedalListAdapter;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import defpackage.c0j;
import defpackage.ecf;
import defpackage.eri;
import defpackage.jui;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002('B-\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&J#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter$MedalListHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter$MedalListHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter$MedalListHolder;I)V", "getItemCount", "()I", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "Lecf$a$a;", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;)V", "Companion", "MedalListHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MedalListAdapter extends RecyclerView.Adapter<MedalListHolder> {

    @NotNull
    public static final String KEY_PARAMS_MEDAL_CLASS = "key_params_medal_class";

    @NotNull
    public static final String KEY_PARAMS_MEDAL_ID = "key_params_medal_id";

    @NotNull
    public static final String KEY_PARAMS_MEDAL_TYPE = "key_params_medal_type";

    @NotNull
    public static final String TAG = "MineFragment";

    @NotNull
    private final Activity activity;

    @NotNull
    private final Context context;

    @NotNull
    private final List<ecf.a.C0923a> dataList;

    @NotNull
    private final RecyclerView mRecyclerView;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\n \u000f*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter$MedalListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lecf$a$a;", "medal", "", "bind", "(Lecf$a$a;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "medalIconTxt", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "medalNameTxt", "Landroid/widget/TextView;", "medalDescTxt", "<init>", "(Lcom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMedalListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalListAdapter.kt\ncom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter$MedalListHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,97:1\n54#2,3:98\n24#2:101\n57#2,6:102\n63#2,2:109\n57#3:108\n*S KotlinDebug\n*F\n+ 1 MedalListAdapter.kt\ncom/xiaomi/fitness/health/threetarget/adpter/MedalListAdapter$MedalListHolder\n*L\n57#1:98,3\n57#1:101\n57#1:102,6\n57#1:109,2\n57#1:108\n*E\n"})
    public final class MedalListHolder extends RecyclerView.d0 {
        private final TextView medalDescTxt;
        private final ImageView medalIconTxt;
        private final TextView medalNameTxt;
        final /* synthetic */ MedalListAdapter this$0;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedalListHolder(@NotNull MedalListAdapter medalListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = medalListAdapter;
            this.view = view;
            this.medalIconTxt = (ImageView) view.findViewById(eri.nb);
            this.medalNameTxt = (TextView) this.view.findViewById(eri.ob);
            this.medalDescTxt = (TextView) this.view.findViewById(eri.mb);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1(ecf.a.C0923a medal, MedalListAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(medal, "$medal");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Bundle bundle = new Bundle();
            Long id = medal.o;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            bundle.putLong("key_params_medal_id", id.longValue());
            bundle.putString("key_params_medal_type", medal.m);
            bundle.putInt("key_params_medal_class", medal.f16490b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("tip", "56.48.1.1.31239");
            linkedHashMap.put("name", "activity_page_achievement");
            linkedHashMap.put("btn_id", String.valueOf(medal.o));
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.toMap(linkedHashMap));
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).goToMedalDetailActivity(this$0.getActivity(), bundle);
        }

        public final void bind(@NotNull final ecf.a.C0923a medal) {
            Intrinsics.checkNotNullParameter(medal, "medal");
            View view = this.itemView;
            final MedalListAdapter medalListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: hff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MedalListAdapter.MedalListHolder.bind$lambda$1(medal, medalListAdapter, view2);
                }
            });
            String icon = medal.c;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            if (icon.length() != 0) {
                ImageView medalIconTxt = this.medalIconTxt;
                Intrinsics.checkNotNullExpressionValue(medalIconTxt, "medalIconTxt");
                Coil.imageLoader(medalIconTxt.getContext()).enqueue(new ImageRequest.Builder(medalIconTxt.getContext()).data(medal.c).target(medalIconTxt).build());
            }
            this.medalNameTxt.setText(medal.l);
            this.medalDescTxt.setText(this.this$0.getContext().getString(c0j.qm, Integer.valueOf(medal.t), Integer.valueOf(medal.u)));
            String string = AppUtil.getApp().getString(c0j.Mq, medal.l, String.valueOf(medal.t), String.valueOf(medal.u));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.itemView.setContentDescription(string);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public MedalListAdapter(@NotNull Activity activity, @NotNull Context context, @NotNull List<ecf.a.C0923a> dataList, @NotNull RecyclerView mRecyclerView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(mRecyclerView, "mRecyclerView");
        this.activity = activity;
        this.context = context;
        this.dataList = dataList;
        this.mRecyclerView = mRecyclerView;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<ecf.a.C0923a> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        return this.mRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MedalListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MedalListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(jui.N8, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MedalListHolder(this, viewInflate);
    }
}
