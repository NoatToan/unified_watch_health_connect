package com.huami.bodymeasurements.temperature.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.chenenyu.router.annotation.Route;
import com.huami.bodymeasurements.common.business.history.HistoryDataBaseActivity;
import com.huami.bodymeasurements.common.business.history.HistoryDataItem;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.view.TemperatureHistoryActivity;
import com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Route({"temperature/TemperatureHistoryActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureHistoryActivity;", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataBaseActivity;", "", "v", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;", "item", "deleteItem", "Lcom/huami/bodymeasurements/temperature/viewmodel/TempHistoryDataViewModel;", "y", "Lkotlin/Lazy;", "u", "()Lcom/huami/bodymeasurements/temperature/viewmodel/TempHistoryDataViewModel;", "viewModel", "", "z", "getUserId", "()Ljava/lang/String;", "userId", "<init>", "()V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureHistoryActivity extends HistoryDataBaseActivity {

    @NotNull
    private static final String A = "TemperatureHistoryActivity";

    @NotNull
    private static final String B = "user_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureHistoryActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "", WebConstant.QueryParam.LAUNCH, "EXTRA_USER_ID", "Ljava/lang/String;", "TAG", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull String userId) {
            Intent intent = new Intent(context, (Class<?>) TemperatureHistoryActivity.class);
            intent.putExtra("user_id", userId);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return TemperatureHistoryActivity.this.getIntent().getStringExtra("user_id");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureHistoryActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bodymeasurements.temperature.view.TemperatureHistoryActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempHistoryDataViewModel>() { // from class: com.huami.bodymeasurements.temperature.view.TemperatureHistoryActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempHistoryDataViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempHistoryDataViewModel.class), function0, objArr);
            }
        });
        this.userId = LazyKt__LazyJVMKt.lazy(new c());
    }

    private final String getUserId() {
        return (String) this.userId.getValue();
    }

    private final TempHistoryDataViewModel u() {
        return (TempHistoryDataViewModel) this.viewModel.getValue();
    }

    private final void v() {
        if (getUserId() == null) {
            HMLog.info(A, b.a);
            return;
        }
        TempHistoryDataViewModel tempHistoryDataViewModelU = u();
        u().loadData(getUserId());
        tempHistoryDataViewModelU.getHistoryDataLiveData().observe(this, new Observer() { // from class: zm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureHistoryActivity.w(this.a, (List) obj);
            }
        });
        tempHistoryDataViewModelU.getDeleteResultLiveData().observe(this, new Observer() { // from class: an7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureHistoryActivity.x(this.a, this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(TemperatureHistoryActivity temperatureHistoryActivity, List list) {
        temperatureHistoryActivity.setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(TemperatureHistoryActivity temperatureHistoryActivity, TemperatureHistoryActivity temperatureHistoryActivity2, Boolean bool) {
        CustomToast.showShort(temperatureHistoryActivity2, temperatureHistoryActivity.getString(bool.booleanValue() ? R.string.bm_common_delete_success : R.string.bm_common_delete_failed));
    }

    @Override // com.huami.bodymeasurements.common.business.history.HistoryDataBaseActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.bodymeasurements.common.business.history.HistoryDataBaseActivity
    public void deleteItem(@NotNull HistoryDataItem item) {
        if (getUserId() == null) {
            HMLog.info(A, a.a);
        } else {
            u().deleteItem(item, getUserId());
        }
    }

    @Override // com.huami.bodymeasurements.common.business.history.HistoryDataBaseActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v();
    }
}
