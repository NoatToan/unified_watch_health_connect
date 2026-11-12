package com.huami.bloodoxygen.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.usecase.clickspo2.SaveManualClickSpo2UseCase;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.activity.AddClickSpo2ManuallyActivity;
import com.huami.bodymeasurements.common.business.add.AddDataBaseActivity;
import com.huami.bodymeasurements.common.business.add.view.EditItemView;
import com.huami.bodymeasurements.common.business.add.view.ItemView;
import com.huami.bodymeasurements.common.business.add.view.NormalItemView;
import com.huami.bodymeasurements.common.utils.GlobalTitleStyleKt;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.bodymeasurements.common.view.DatePickerDialog;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.widget.share.ShareAnalytics;
import com.huami.widget.toast.CustomToast;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R&\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00030$j\b\u0012\u0004\u0012\u00020\u0003`%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00103\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u00102R\u001d\u00105\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b\u0017\u00102R\u001d\u00109\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/huami/bloodoxygen/ui/activity/AddClickSpo2ManuallyActivity;", "Lcom/huami/bodymeasurements/common/business/add/AddDataBaseActivity;", "", "Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", SOAP.XMLNS, "Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;", "mode", "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", DTransferConstants.SEARCH_KEY, "Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", "r", "", "z", "", "timeStamp", "", "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "getItemViews", ShareAnalytics.ParamValue.SAVE, "Lcom/huami/bloodoxygen/core/usecase/clickspo2/SaveManualClickSpo2UseCase;", "y", "Lkotlin/Lazy;", "w", "()Lcom/huami/bloodoxygen/core/usecase/clickspo2/SaveManualClickSpo2UseCase;", "saveManualClickSpo2UseCase", "Lcom/huami/bloodoxygen/core/koin/BloodOxygenConfig;", "Lcom/huami/bloodoxygen/core/koin/BloodOxygenConfig;", "config", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "v", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "saveLoadingDialog", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "B", "Ljava/util/ArrayList;", "itemViews", "C", "J", "postTime", "", LogUtil.D, "Ljava/lang/Integer;", "spo2Value", "E", "t", "()Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "dateItemView", "F", "timeItemView", "G", "u", "()Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", "editItemView", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class AddClickSpo2ManuallyActivity extends AddDataBaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String H = "TemperatureAddDataActivity";
    public static final int REQUEST_CODE = 100;

    @NotNull
    public static final String REQUEST_RESULT = "request_result";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private Integer spo2Value;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveManualClickSpo2UseCase = LazyKt__LazyJVMKt.lazy(k.a);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenConfig config = (BloodOxygenConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveLoadingDialog = LazyKt__LazyJVMKt.lazy(new j());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ItemView> itemViews = new ArrayList<>();

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long postTime = System.currentTimeMillis();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateItemView = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeItemView = LazyKt__LazyJVMKt.lazy(new m());

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy editItemView = LazyKt__LazyJVMKt.lazy(new f());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/ui/activity/AddClickSpo2ManuallyActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", WebConstant.QueryParam.LAUNCH, "", "REQUEST_CODE", LogUtil.I, "", "REQUEST_RESULT", "Ljava/lang/String;", "TAG", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Activity activity) {
            activity.startActivityForResult(new Intent(activity, (Class<?>) AddClickSpo2ManuallyActivity.class), 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ DatePickerDialog.Mode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DatePickerDialog.Mode mode) {
            super(0);
            this.b = mode;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AddClickSpo2ManuallyActivity.this.z(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "content", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<String, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final boolean a(@NotNull String str) {
            Float floatOrNull = kotlin.text.k.toFloatOrNull(str);
            if (floatOrNull == null) {
                return false;
            }
            float fFloatValue = floatOrNull.floatValue();
            return fFloatValue <= 100.0f && 80.0f <= fFloatValue;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(a(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<String, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
            AddClickSpo2ManuallyActivity.this.spo2Value = kotlin.text.l.toIntOrNull(str);
            AddClickSpo2ManuallyActivity.this.requestSave();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<NormalItemView> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NormalItemView getA() {
            return AddClickSpo2ManuallyActivity.this.q(DatePickerDialog.Mode.DATE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<EditItemView> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditItemView getA() {
            return AddClickSpo2ManuallyActivity.this.r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "save " + AddClickSpo2ManuallyActivity.this.postTime + " " + AddClickSpo2ManuallyActivity.this.spo2Value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.ui.activity.AddClickSpo2ManuallyActivity$save$2", f = "AddClickSpo2ManuallyActivity.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(boolean z, AddClickSpo2ManuallyActivity addClickSpo2ManuallyActivity) {
            if (!z) {
                addClickSpo2ManuallyActivity.v().setFailed(addClickSpo2ManuallyActivity.getString(R.string.bo_ui_save_failed));
                return;
            }
            CustomToast.makeText(addClickSpo2ManuallyActivity.getApplicationContext(), addClickSpo2ManuallyActivity.getString(R.string.bo_ui_save_success), 0).show();
            addClickSpo2ManuallyActivity.v().hide();
            Intent intent = new Intent();
            intent.putExtra(AddClickSpo2ManuallyActivity.REQUEST_RESULT, addClickSpo2ManuallyActivity.postTime);
            Unit unit = Unit.INSTANCE;
            addClickSpo2ManuallyActivity.setResult(100, intent);
            addClickSpo2ManuallyActivity.finish();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AddClickSpo2ManuallyActivity.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SaveManualClickSpo2UseCase saveManualClickSpo2UseCaseW = AddClickSpo2ManuallyActivity.this.w();
                int iIntValue = AddClickSpo2ManuallyActivity.this.spo2Value.intValue();
                long j = AddClickSpo2ManuallyActivity.this.postTime;
                this.a = 1;
                obj = saveManualClickSpo2UseCaseW.execute(iIntValue, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            final AddClickSpo2ManuallyActivity addClickSpo2ManuallyActivity = AddClickSpo2ManuallyActivity.this;
            addClickSpo2ManuallyActivity.runOnUiThread(new Runnable() { // from class: com.huami.bloodoxygen.ui.activity.a
                @Override // java.lang.Runnable
                public final void run() {
                    AddClickSpo2ManuallyActivity.h.b(zBooleanValue, addClickSpo2ManuallyActivity);
                }
            });
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "save BloodOxygenCoroutineScope is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<LoadingDialog> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialog = new LoadingDialog(AddClickSpo2ManuallyActivity.this);
            loadingDialog.setMessage(AddClickSpo2ManuallyActivity.this.getString(R.string.bo_ui_saving));
            loadingDialog.setCancelable(false);
            return loadingDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/clickspo2/SaveManualClickSpo2UseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<SaveManualClickSpo2UseCase> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SaveManualClickSpo2UseCase getA() {
            return (SaveManualClickSpo2UseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(SaveManualClickSpo2UseCase.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "selected time:" + TimeFormatUtils.INSTANCE.formatTimeYMDHHmm(AddClickSpo2ManuallyActivity.this, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<NormalItemView> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NormalItemView getA() {
            return AddClickSpo2ManuallyActivity.this.q(DatePickerDialog.Mode.TIME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AddClickSpo2ManuallyActivity addClickSpo2ManuallyActivity, DatePickerDialog.Mode mode, long j2) {
        addClickSpo2ManuallyActivity.postTime = j2;
        (mode == DatePickerDialog.Mode.DATE ? addClickSpo2ManuallyActivity.t() : addClickSpo2ManuallyActivity.y()).setItemValue(addClickSpo2ManuallyActivity.x(mode, addClickSpo2ManuallyActivity.postTime));
        HMLog.info(H, addClickSpo2ManuallyActivity.new l(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NormalItemView q(DatePickerDialog.Mode mode) {
        return new NormalItemView.Builder(this).setItemName(getString(mode == DatePickerDialog.Mode.DATE ? R.string.bm_common_date : R.string.bm_common_time)).setItemValue(x(mode, System.currentTimeMillis())).setValueClick(new a(mode)).setSaveEnable(b.a).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditItemView r() {
        return new EditItemView.Builder(this).setItemName(getString(R.string.bo_ui_spo2_name)).setItemUnit(getString(R.string.bo_ui_unit_percent)).setDigits(0).setCheckContentValid(c.a).setInputFinished(new d()).create();
    }

    private final List<ItemView> s() {
        ArrayList<ItemView> arrayList = this.itemViews;
        arrayList.add(t());
        arrayList.add(y());
        arrayList.add(u());
        return this.itemViews;
    }

    private final NormalItemView t() {
        return (NormalItemView) this.dateItemView.getValue();
    }

    private final EditItemView u() {
        return (EditItemView) this.editItemView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog v() {
        return (LoadingDialog) this.saveLoadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveManualClickSpo2UseCase w() {
        return (SaveManualClickSpo2UseCase) this.saveManualClickSpo2UseCase.getValue();
    }

    private final String x(DatePickerDialog.Mode mode, long timeStamp) {
        return mode == DatePickerDialog.Mode.TIME ? TimeFormatUtils.INSTANCE.formatTimeHHmm(this, timeStamp) : TimeFormatUtils.INSTANCE.formatTimeYMD(this, timeStamp);
    }

    private final NormalItemView y() {
        return (NormalItemView) this.timeItemView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(final DatePickerDialog.Mode mode) {
        DatePickerDialog datePickerDialog = new DatePickerDialog();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        long j2 = this.postTime;
        Date registerDate = this.config.getRegisterDate();
        datePickerDialog.showDialog(supportFragmentManager, j2, registerDate == null ? 0L : registerDate.getTime(), mode, getString(mode == DatePickerDialog.Mode.DATE ? R.string.bm_common_date_picker_title : R.string.bm_common_time_picker_title), new DatePickerDialog.DateSelectListener() { // from class: l7
            @Override // com.huami.bodymeasurements.common.view.DatePickerDialog.DateSelectListener
            public final void onDateSelect(long j3) {
                AddClickSpo2ManuallyActivity.A(this.a, mode, j3);
            }
        });
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity
    @NotNull
    public List<ItemView> getItemViews() {
        return s();
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.bo_ui_add_data), null, 2, null);
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity
    public void save() {
        super.save();
        HMLog.info(H, new g());
        Integer num = this.spo2Value;
        if (num == null) {
            return;
        }
        num.intValue();
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            CustomToast.showShort(getApplicationContext(), R.string.bo_ui_no_network_connection);
            return;
        }
        v().show();
        BloodOxygenCoroutineScope bloodOxygenCoroutineScope = (BloodOxygenCoroutineScope) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(BloodOxygenCoroutineScope.class), null, null);
        if (bloodOxygenCoroutineScope != null) {
            kotlinx.coroutines.e.f(bloodOxygenCoroutineScope, null, null, new h(null), 3, null);
        } else {
            HMLog.info(H, i.a);
            v().hide();
        }
    }
}
