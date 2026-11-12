package com.huami.bloodoxygen.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.activity.ClickSpo2HistoryActivity;
import com.huami.bloodoxygen.ui.business.viewmodel.ClickSpo2HistoryViewModel;
import com.huami.bloodoxygen.ui.business.viewmodel.HistoryListValueData;
import com.huami.bloodoxygen.ui.business.viewmodel.HistoryViewTypeData;
import com.huami.bloodoxygen.ui.business.viewmodel.ListData;
import com.huami.bloodoxygen.ui.business.viewmodel.TitleData;
import com.huami.bloodoxygen.ui.business.viewmodel.ViewType;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.bloodoxygen.ui.utils.TimeUtils;
import com.huami.bloodoxygen.ui.view.BloodOxygenTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u0007\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/bloodoxygen/ui/business/viewmodel/ClickSpo2HistoryViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/bloodoxygen/ui/business/viewmodel/ClickSpo2HistoryViewModel;", "viewModel", "<init>", "()V", "Companion", "b", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class ClickSpo2HistoryActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "ClickSpo2HistoryActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) ClickSpo2HistoryActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001d"}, d2 = {"com/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$a$a;", "Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", GoogleApiAvailabilityLight.a, "getItemCount", "holder", "position", "", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/bloodoxygen/ui/business/viewmodel/HistoryListValueData;", "b", "Ljava/util/List;", "valueDataList", "Landroid/view/LayoutInflater;", "Lkotlin/Lazy;", "()Landroid/view/LayoutInflater;", "layoutInflater", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends RecyclerView.Adapter<C0297a> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<HistoryListValueData> valueDataList;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy layoutInflater = LazyKt__LazyJVMKt.lazy(new b());

        /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.activity.ClickSpo2HistoryActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000e"}, d2 = {"com/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$a$a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getValue", "()Landroid/widget/TextView;", "value", "b", "time", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$a;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
        public final class C0297a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final TextView value;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final TextView time;

            public C0297a(View view) {
                super(view);
                this.value = (TextView) view.findViewById(R.id.value);
                this.time = (TextView) view.findViewById(R.id.time);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final TextView getTime() {
                return this.time;
            }

            @NotNull
            public final TextView getValue() {
                return this.value;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<LayoutInflater> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LayoutInflater getA() {
                return LayoutInflater.from(a.this.context);
            }
        }

        public a(@NotNull Context context, @NotNull List<HistoryListValueData> list) {
            this.context = context;
            this.valueDataList = list;
        }

        private final LayoutInflater b() {
            return (LayoutInflater) this.layoutInflater.getValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C0297a holder, int position) {
            HistoryListValueData historyListValueData = this.valueDataList.get(position);
            holder.getValue().setText(historyListValueData.getValue());
            holder.getTime().setText(historyListValueData.getTime());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0297a onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new C0297a(b().inflate(R.layout.bo_ui_history_item_list_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.valueDataList.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0014B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"com/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$b", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "getItemViewType", "holder", "", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/bloodoxygen/ui/business/viewmodel/HistoryViewTypeData;", "b", "Ljava/util/List;", "historyTypeDataList", "Landroid/view/LayoutInflater;", "c", "Lkotlin/Lazy;", "()Landroid/view/LayoutInflater;", "layoutInflater", "", GoogleApiAvailabilityLight.a, "()Ljava/lang/String;", "thisYear", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<HistoryViewTypeData> historyTypeDataList;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy layoutInflater = LazyKt__LazyJVMKt.lazy(new c());

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy thisYear = LazyKt__LazyJVMKt.lazy(new d());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"com/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$b$a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "list", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$b;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final RecyclerView list;

            public a(View view) {
                super(view);
                this.list = (RecyclerView) view.findViewById(R.id.recycler_view);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final RecyclerView getList() {
                return this.list;
            }
        }

        /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.activity.ClickSpo2HistoryActivity$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0019\u0010\r\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0011"}, d2 = {"com/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$b$b", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "year", "b", "date", "Landroid/view/View;", "Landroid/view/View;", "()Landroid/view/View;", "line", "itemView", "<init>", "(Lcom/huami/bloodoxygen/ui/activity/ClickSpo2HistoryActivity$b;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
        public final class C0298b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final TextView year;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final TextView date;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private final View line;

            public C0298b(View view) {
                super(view);
                this.year = (TextView) view.findViewById(R.id.year);
                this.date = (TextView) view.findViewById(R.id.date);
                this.line = view.findViewById(R.id.line_top);
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final TextView getDate() {
                return this.date;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final View getLine() {
                return this.line;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final TextView getYear() {
                return this.year;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<LayoutInflater> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LayoutInflater getA() {
                return LayoutInflater.from(b.this.context);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return TimeUtils.INSTANCE.formatYear(b.this.context, new Date());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Context context, @NotNull List<? extends HistoryViewTypeData> list) {
            this.context = context;
            this.historyTypeDataList = list;
        }

        private final LayoutInflater b() {
            return (LayoutInflater) this.layoutInflater.getValue();
        }

        private final String c() {
            return (String) this.thisYear.getValue();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.historyTypeDataList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return this.historyTypeDataList.get(position).getViewType().ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
            HistoryViewTypeData historyViewTypeData = this.historyTypeDataList.get(position);
            if (!(holder instanceof C0298b)) {
                if (holder instanceof a) {
                    RecyclerView list = ((a) holder).getList();
                    list.setLayoutManager(new LinearLayoutManager(list.getContext()));
                    list.setAdapter(new a(list.getContext(), ((ListData) historyViewTypeData).getList()));
                    return;
                }
                return;
            }
            C0298b c0298b = (C0298b) holder;
            TitleData titleData = (TitleData) historyViewTypeData;
            c0298b.getYear().setText(titleData.getYear());
            c0298b.getDate().setText(titleData.getDate());
            ExtensionsKt.setVisible(c0298b.getYear(), !Intrinsics.areEqual(titleData.getYear(), c()) && titleData.getShowYear());
            ExtensionsKt.setVisible(c0298b.getLine(), position != 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return viewType == ViewType.TITLE.ordinal() ? new C0298b(b().inflate(R.layout.bo_ui_history_item_title, parent, false)) : new a(b().inflate(R.layout.bo_ui_history_item_list, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/viewmodel/ClickSpo2HistoryViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ClickSpo2HistoryViewModel> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ViewModelOwner> {
            public final /* synthetic */ ClickSpo2HistoryActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ClickSpo2HistoryActivity clickSpo2HistoryActivity) {
                super(0);
                this.a = clickSpo2HistoryActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ClickSpo2HistoryActivity clickSpo2HistoryActivity = this.a;
                return companion.from(clickSpo2HistoryActivity, clickSpo2HistoryActivity);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClickSpo2HistoryViewModel getA() {
            return (ClickSpo2HistoryViewModel) ScopeExtKt.getViewModel$default(BloodOxygenKoinScopeKt.getBloodOxygenKoinScope(), null, new a(ClickSpo2HistoryActivity.this), Reflection.getOrCreateKotlinClass(ClickSpo2HistoryViewModel.class), null, null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClickSpo2HistoryViewModel e() {
        return (ClickSpo2HistoryViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ClickSpo2HistoryActivity clickSpo2HistoryActivity, View view) {
        clickSpo2HistoryActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(TextView textView, ClickSpo2HistoryActivity clickSpo2HistoryActivity, SmartRefreshLayout smartRefreshLayout, b bVar, Boolean bool) {
        if (ExtensionsKt.isVisible(textView) && (!clickSpo2HistoryActivity.e().getList().isEmpty())) {
            ExtensionsKt.setVisible(textView, false);
        }
        smartRefreshLayout.finishLoadmore();
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            smartRefreshLayout.setEnableLoadmore(false);
        }
        bVar.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"NotifyDataSetChanged"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bo_ui_activity_click_spo2_history);
        ((BloodOxygenTitleBar) findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: hp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClickSpo2HistoryActivity.f(this.a, view);
            }
        });
        final b bVar = new b(this, e().getList());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(bVar);
        final SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) findViewById(R.id.smart_refresh_layout);
        smartRefreshLayout.setEnableRefresh(false);
        smartRefreshLayout.setEnableLoadmore(true);
        smartRefreshLayout.setEnableAutoLoadmore(true);
        smartRefreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() { // from class: com.huami.bloodoxygen.ui.activity.ClickSpo2HistoryActivity$onCreate$3$1
            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public void onLoadmore(@Nullable RefreshLayout refreshlayout) {
                this.a.e().loadMore();
            }

            @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
            public void onRefresh(@Nullable RefreshLayout refreshlayout) {
            }
        });
        final TextView textView = (TextView) findViewById(R.id.no_data);
        e().getLiveData().observe(this, new Observer() { // from class: com.huami.bloodoxygen.ui.activity.b
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ClickSpo2HistoryActivity.g(textView, this, smartRefreshLayout, bVar, (Boolean) obj);
            }
        });
        e().loadMore();
    }
}
