package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.ui.smartplay.appnotify.AppsSupportReplyActivity;
import com.xiaomi.hm.health.ui.smartplay.appnotify.data.AppSupportReplyInfo;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000f\u0010\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyViewModel;", "supportViewModel", "<init>", "()V", "Companion", "AppsSupportAdapter", "AppsSupportViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppsSupportReplyActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportViewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R)\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyActivity$AppsSupportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyActivity$AppsSupportViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/data/AppSupportReplyInfo;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "getData", "()Ljava/util/ArrayList;", "data", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AppsSupportAdapter extends RecyclerView.Adapter<AppsSupportViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ArrayList<AppSupportReplyInfo> data;

        public AppsSupportAdapter(@NotNull Context context, @NotNull ArrayList<AppSupportReplyInfo> arrayList) {
            this.context = context;
            this.data = arrayList;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final ArrayList<AppSupportReplyInfo> getData() {
            return this.data;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.data.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull AppsSupportViewHolder holder, int position) {
            AppSupportReplyInfo appSupportReplyInfo = this.data.get(position);
            holder.getIvLogo().setImageResource(appSupportReplyInfo.getIcon());
            holder.getTvAppName().setText(getContext().getString(appSupportReplyInfo.getAppName()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public AppsSupportViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new AppsSupportViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_app_support_reply, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyActivity$AppsSupportViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getIvLogo$devicex_zeppRelease", "()Landroid/widget/ImageView;", "setIvLogo$devicex_zeppRelease", "(Landroid/widget/ImageView;)V", "ivLogo", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTvAppName$devicex_zeppRelease", "()Landroid/widget/TextView;", "setTvAppName$devicex_zeppRelease", "(Landroid/widget/TextView;)V", "tvAppName", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class AppsSupportViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private ImageView ivLogo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private TextView tvAppName;

        public AppsSupportViewHolder(@NotNull View view) {
            super(view);
            this.ivLogo = (ImageView) view.findViewById(R.id.iv_logo);
            this.tvAppName = (TextView) view.findViewById(R.id.tv_app_name);
        }

        @NotNull
        /* JADX INFO: renamed from: getIvLogo$devicex_zeppRelease, reason: from getter */
        public final ImageView getIvLogo() {
            return this.ivLogo;
        }

        @NotNull
        /* JADX INFO: renamed from: getTvAppName$devicex_zeppRelease, reason: from getter */
        public final TextView getTvAppName() {
            return this.tvAppName;
        }

        public final void setIvLogo$devicex_zeppRelease(@NotNull ImageView imageView) {
            this.ivLogo = imageView;
        }

        public final void setTvAppName$devicex_zeppRelease(@NotNull TextView textView) {
            this.tvAppName = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) AppsSupportReplyActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/AppsSupportReplyViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AppsSupportReplyViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppsSupportReplyViewModel invoke() {
            return (AppsSupportReplyViewModel) AppsSupportReplyActivity.this.getDefaultViewModelProviderFactory().create(AppsSupportReplyViewModel.class);
        }
    }

    private final AppsSupportReplyViewModel d() {
        return (AppsSupportReplyViewModel) this.supportViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AppsSupportReplyActivity appsSupportReplyActivity, View view) {
        appsSupportReplyActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_support_reply);
        int i = R.id.rv_apps_support;
        ((RecyclerView) findViewById(i)).setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((RecyclerView) findViewById(i)).setAdapter(new AppsSupportAdapter(this, d().getAppsSupportReply()));
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: si
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppsSupportReplyActivity.e(this.a, view);
            }
        });
    }
}
