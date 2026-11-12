package com.xiaomi.hm.health.device.settings.sport;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.devicex.R;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.loc.z;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "sportTypeConfig", "", "l", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/recyclerview/widget/ItemTouchHelper;", "x", "Landroidx/recyclerview/widget/ItemTouchHelper;", "touchHelper", "Lcom/xiaomi/hm/health/device/settings/sport/SportTypeViewModel;", "y", "Lcom/xiaomi/hm/health/device/settings/sport/SportTypeViewModel;", "sportTypeViewModel", "", "z", "[I", "sportTypeFilter", "<init>", "()V", "Companion", "SportTypeDisplayItemAdapter", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MiliSportSettingActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "MiliSportSettingActivity";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ItemTouchHelper touchHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private SportTypeViewModel sportTypeViewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private int[] sportTypeFilter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity$Companion;", "", "Landroid/content/Context;", "ctx", "", WebConstant.QueryParam.LAUNCH, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context ctx) {
            ctx.startActivity(new Intent(ctx, (Class<?>) MiliSportSettingActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<SportTypeConfig>, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0874a extends Lambda implements Function1<Loading<? extends SportTypeConfig>, Unit> {
            public static final C0874a a = new C0874a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0875a extends Lambda implements Function0<String> {
                public static final C0875a a = new C0875a();

                public C0875a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "loading";
                }
            }

            public C0874a() {
                super(1);
            }

            public final void a(@NotNull Loading<SportTypeConfig> loading) {
                HMLog.info(MiliSportSettingActivity.TAG, C0875a.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends SportTypeConfig> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends SportTypeConfig>, Unit> {
            public final /* synthetic */ MiliSportSettingActivity a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0876a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<SportTypeConfig> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0876a(Success<SportTypeConfig> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return String.valueOf(this.a.getValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MiliSportSettingActivity miliSportSettingActivity) {
                super(1);
                this.a = miliSportSettingActivity;
            }

            public final void a(@NotNull Success<SportTypeConfig> success) {
                HMLog.info(MiliSportSettingActivity.TAG, new C0876a(success));
                this.a.l(success.getValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends SportTypeConfig> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeConfig;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends SportTypeConfig>, Unit> {
            public static final c a = new c();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.settings.sport.MiliSportSettingActivity$a$c$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0877a extends Lambda implements Function0<String> {
                public final /* synthetic */ Fail<SportTypeConfig> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0877a(Fail<SportTypeConfig> fail) {
                    super(0);
                    this.a = fail;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a.getError().getMessage();
                }
            }

            public c() {
                super(1);
            }

            public final void a(@NotNull Fail<SportTypeConfig> fail) {
                HMLog.info(MiliSportSettingActivity.TAG, new C0877a(fail));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends SportTypeConfig> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<SportTypeConfig> stateBuilder) {
            stateBuilder.onLoading(C0874a.a);
            stateBuilder.onSuccess(new b(MiliSportSettingActivity.this));
            stateBuilder.onFail(c.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<SportTypeConfig> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(SportTypeConfig sportTypeConfig) {
        RecyclerView.Adapter adapter = ((RecyclerView) findViewById(R.id.sportTypeListView)).getAdapter();
        if (adapter instanceof SportTypeDisplayItemAdapter) {
            List<SportTypeItem> list = sportTypeConfig.getList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((SportTypeItem) it2.next()).getType()));
            }
            int[] iArr = this.sportTypeFilter;
            if (iArr != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i : iArr) {
                    if (arrayList.contains(Integer.valueOf(i))) {
                        arrayList2.add(Integer.valueOf(i));
                    }
                }
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                arrayList3.add(new SportTypeDisplayItem(iIntValue, SportConfigUtils.INSTANCE.getNameByType(iIntValue, this)));
            }
            ((SportTypeDisplayItemAdapter) adapter).c(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3), sportTypeConfig.getSupportSort(), sportTypeConfig.getSupportItemDataSetting());
        }
    }

    private final void m() {
        SportTypeDisplayItemAdapter sportTypeDisplayItemAdapter = new SportTypeDisplayItemAdapter(this, new ArrayList(), false, false, 12, null);
        int i = R.id.sportTypeListView;
        ((RecyclerView) findViewById(i)).setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ((RecyclerView) findViewById(i)).setAdapter(sportTypeDisplayItemAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new MiliSportSettingActivity$initSportList$1(sportTypeDisplayItemAdapter, this));
        this.touchHelper = itemTouchHelper;
        Objects.requireNonNull(itemTouchHelper);
        itemTouchHelper.attachToRecyclerView((RecyclerView) findViewById(i));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mili_sport_setting);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, getString(R.string.widget_sport_order));
        m();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("SportCategoryName")) != null) {
            setTitleText(stringExtra);
        }
        Intent intent2 = getIntent();
        this.sportTypeFilter = intent2 == null ? null : intent2.getIntArrayExtra("SportTypeFilter");
        SportTypeViewModel sportTypeViewModel = (SportTypeViewModel) new ViewModelProvider(this).get(SportTypeViewModel.class);
        this.sportTypeViewModel = sportTypeViewModel;
        Objects.requireNonNull(sportTypeViewModel);
        LiveDataExtensionKt.observeState$default(sportTypeViewModel.getSportTypeLiveData(), this, null, new a(), 2, null);
        SportTypeViewModel sportTypeViewModel2 = this.sportTypeViewModel;
        Objects.requireNonNull(sportTypeViewModel2);
        sportTypeViewModel2.loadSportType();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B1\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010)\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J$\u0010\u0017\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity$SportTypeDisplayItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "", "onBindViewHolder", "getItemCount", "getItemViewType", "from", "to", hl.k, "", "Lcom/xiaomi/hm/health/device/settings/sport/SportTypeDisplayItem;", "list", "", "supportSort", "supportSportItemDataSetting", "c", "", GoogleApiAvailabilityLight.a, "l", "Landroid/content/Context;", "a", "Landroid/content/Context;", "ctx", "b", "Ljava/util/List;", "data", "Z", "f", "()Z", z.j, "(Z)V", "e", "i", "supportItemDataSetting", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity;Landroid/content/Context;Ljava/util/List;ZZ)V", "SportTypeViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class SportTypeDisplayItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context ctx;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<SportTypeDisplayItem> data;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean supportSort;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean supportItemDataSetting;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0090\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity$SportTypeDisplayItemAdapter$SportTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "getSortImg", "()Landroid/widget/ImageView;", "sortImg", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "nameText", "Landroid/view/View;", "c", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "rootView", "itemView", "<init>", "(Lcom/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity$SportTypeDisplayItemAdapter;Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public class SportTypeViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final ImageView sortImg;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final TextView nameText;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private final View rootView;

            public SportTypeViewHolder(View view) {
                super(view);
                this.sortImg = (ImageView) view.findViewById(R.id.mili_setting_sport_img);
                this.nameText = (TextView) view.findViewById(R.id.mili_sport_type_name);
                this.rootView = view.findViewById(R.id.mili_setting_sport_item);
            }

            @NotNull
            public final TextView getNameText() {
                return this.nameText;
            }

            @NotNull
            public final View getRootView() {
                return this.rootView;
            }

            @NotNull
            public final ImageView getSortImg() {
                return this.sortImg;
            }
        }

        public SportTypeDisplayItemAdapter(@NotNull Context context, List<SportTypeDisplayItem> list, boolean z, boolean z2) {
            this.ctx = context;
            this.data = list;
            this.supportSort = z;
            this.supportItemDataSetting = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(SportTypeDisplayItemAdapter sportTypeDisplayItemAdapter, MiliSportSettingActivity miliSportSettingActivity, RecyclerView.ViewHolder viewHolder, View view) {
            if (!sportTypeDisplayItemAdapter.getSupportSort()) {
                return true;
            }
            ItemTouchHelper itemTouchHelper = miliSportSettingActivity.touchHelper;
            Objects.requireNonNull(itemTouchHelper);
            itemTouchHelper.startDrag(viewHolder);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(SportTypeDisplayItemAdapter sportTypeDisplayItemAdapter, int i, View view) {
            sportTypeDisplayItemAdapter.l(i);
        }

        public final void c(@NotNull List<SportTypeDisplayItem> list, boolean supportSort, boolean supportSportItemDataSetting) {
            this.data = list;
            this.supportSort = supportSort;
            this.supportItemDataSetting = supportSportItemDataSetting;
            notifyDataSetChanged();
        }

        @NotNull
        public final List<SportTypeDisplayItem> d() {
            return this.data;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getSupportItemDataSetting() {
            return this.supportItemDataSetting;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getSupportSort() {
            return this.supportSort;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getPagerCount() {
            return this.data.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return 0;
        }

        public final void i(boolean z) {
            this.supportItemDataSetting = z;
        }

        public final void j(boolean z) {
            this.supportSort = z;
        }

        public final void k(int from, int to) {
            SportTypeDisplayItem sportTypeDisplayItem = this.data.get(to);
            List<SportTypeDisplayItem> list = this.data;
            list.set(to, list.get(from));
            this.data.set(from, sportTypeDisplayItem);
        }

        public final void l(int position) {
            if (this.supportItemDataSetting) {
                MiliSportDataSettingActivity.INSTANCE.launch(MiliSportSettingActivity.this, this.data.get(position).getType(), this.data.get(position).getSportName());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder viewHolder, final int position) {
            SportTypeViewHolder sportTypeViewHolder = (SportTypeViewHolder) viewHolder;
            sportTypeViewHolder.getNameText().setText(this.data.get(position).getSportName());
            if (this.supportSort) {
                sportTypeViewHolder.getSortImg().setVisibility(0);
            } else {
                sportTypeViewHolder.getSortImg().setVisibility(8);
            }
            View rootView = sportTypeViewHolder.getRootView();
            final MiliSportSettingActivity miliSportSettingActivity = MiliSportSettingActivity.this;
            rootView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xiaomi.hm.health.device.settings.sport.g
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return MiliSportSettingActivity.SportTypeDisplayItemAdapter.g(this.a, miliSportSettingActivity, viewHolder, view);
                }
            });
            sportTypeViewHolder.getRootView().setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.settings.sport.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiliSportSettingActivity.SportTypeDisplayItemAdapter.h(this.a, position, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
            return new SportTypeViewHolder(LayoutInflater.from(this.ctx).inflate(R.layout.mili_list_item_sport_setting, viewGroup, false));
        }

        public /* synthetic */ SportTypeDisplayItemAdapter(Context context, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }
    }
}
