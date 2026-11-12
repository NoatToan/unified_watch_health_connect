package com.huami.bodymeasurements.temperature.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.bodymeasurements.common.business.add.AddDataBaseActivity;
import com.huami.bodymeasurements.common.business.add.view.EditItemView;
import com.huami.bodymeasurements.common.business.add.view.ItemView;
import com.huami.bodymeasurements.common.business.add.view.NormalItemView;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.bodymeasurements.common.view.DatePickerDialog;
import com.huami.bodymeasurements.detailframe.event.EventTargetPage;
import com.huami.bodymeasurements.detailframe.event.EventTargetType;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.converter.TempUnitConverter;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.koin.data.TempUserInfo;
import com.huami.bodymeasurements.temperature.view.TemperatureAddDataActivity;
import com.huami.bodymeasurements.temperature.viewmodel.TempAddDataViewModel;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.share.ShareAnalytics;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Route({"temperature/TemperatureAddDataActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0016R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00030\u001cj\b\u0012\u0004\u0012\u00020\u0003`\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001f\u0010&\u001a\u0004\u0018\u00010\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b$\u0010%R\u001f\u0010*\u001a\u0004\u0018\u00010'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b!\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001d\u00101\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b4\u00105R\u001d\u0010:\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b8\u00109R\u001d\u0010<\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b\u001e\u00109R\u001d\u0010@\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0018\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureAddDataActivity;", "Lcom/huami/bodymeasurements/common/business/add/AddDataBaseActivity;", "", "Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", "t", "Lcom/huami/bodymeasurements/common/view/DatePickerDialog$Mode;", "mode", "Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "r", "Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", SOAP.XMLNS, "", "observeData", LogUtil.D, "", "timeStamp", "", "y", "getItemViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", ShareAnalytics.ParamValue.SAVE, "Lcom/huami/bodymeasurements/temperature/viewmodel/TempAddDataViewModel;", "Lkotlin/Lazy;", "B", "()Lcom/huami/bodymeasurements/temperature/viewmodel/TempAddDataViewModel;", "viewModel", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "z", "Ljava/util/ArrayList;", "itemViews", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "J", "postTime", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "C", "()Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "userInfo", "Ljava/util/Date;", "Ljava/util/Date;", "todayDate", "E", "w", "()Ljava/util/Date;", "registerDate", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "F", "x", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "saveLoadingDialog", "G", "u", "()Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "dateItemView", "H", "timeItemView", LogUtil.I, "v", "()Lcom/huami/bodymeasurements/common/business/add/view/EditItemView;", "editItemView", "<init>", "()V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureAddDataActivity extends AddDataBaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String J = "TemperatureAddDataActivity";

    @NotNull
    private static final String K = "user_id";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long postTime;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfo;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Date todayDate;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveLoadingDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateItemView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeItemView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy editItemView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ItemView> itemViews;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureAddDataActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "", WebConstant.QueryParam.LAUNCH, "EXTRA_USER_ID", "Ljava/lang/String;", "TAG", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull String userId) {
            Intent intent = new Intent(context, (Class<?>) TemperatureAddDataActivity.class);
            intent.putExtra("user_id", userId);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
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
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TemperatureAddDataActivity.this.D(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "check postTime";
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            TemperatureAddDataActivity.this.B().checkPostTime();
            HMLog.info(TemperatureAddDataActivity.J, a.a);
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
            float tempInUnitC = TempUnitConverter.INSTANCE.getTempInUnitC(floatOrNull.floatValue());
            return 35.0f <= tempInUnitC && tempInUnitC <= 42.0f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(a(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<String, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("setTemp:", this.a);
            }
        }

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
            TemperatureAddDataActivity.this.requestSave();
            TemperatureAddDataActivity.this.B().setTemp(str);
            HMLog.info(TemperatureAddDataActivity.J, new a(str));
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
        public final NormalItemView invoke() {
            return TemperatureAddDataActivity.this.r(DatePickerDialog.Mode.DATE);
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
        public final EditItemView invoke() {
            return TemperatureAddDataActivity.this.s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Date;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Date> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Date invoke() {
            TempUserInfo tempUserInfoA = TemperatureAddDataActivity.this.A();
            Date registerDate = tempUserInfoA == null ? null : tempUserInfoA.getRegisterDate();
            return registerDate == null ? TemperatureAddDataActivity.this.todayDate : registerDate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return ShareAnalytics.ParamValue.SAVE;
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
        public final String invoke() {
            return "userId is null";
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
        public final LoadingDialog invoke() {
            LoadingDialog loadingDialog = new LoadingDialog(TemperatureAddDataActivity.this);
            loadingDialog.setMessage(TemperatureAddDataActivity.this.getString(R.string.bm_common_saving));
            return loadingDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("selected time:", TimeFormatUtils.INSTANCE.formatTimeYMDHHmm(TemperatureAddDataActivity.this, this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/NormalItemView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<NormalItemView> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NormalItemView invoke() {
            return TemperatureAddDataActivity.this.r(DatePickerDialog.Mode.TIME);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return TemperatureAddDataActivity.this.getIntent().getStringExtra("user_id");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<TempUserInfo> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ TempUserInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TempUserInfo tempUserInfo) {
                super(0);
                this.a = tempUserInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("userInfo:", this.a);
            }
        }

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TempUserInfo invoke() {
            TempExternalApi tempExternalApi;
            TempUserInfo userInfo = (TemperatureAddDataActivity.this.getUserId() == null || (tempExternalApi = ScopesKt.tempExternalApi(ComponentCallbackExtKt.getKoin(TemperatureAddDataActivity.this))) == null) ? null : tempExternalApi.getUserInfo(TemperatureAddDataActivity.this.getUserId());
            if (userInfo == null) {
                return null;
            }
            HMLog.info(TemperatureAddDataActivity.J, new a(userInfo));
            return userInfo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureAddDataActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bodymeasurements.temperature.view.TemperatureAddDataActivity$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempAddDataViewModel>() { // from class: com.huami.bodymeasurements.temperature.view.TemperatureAddDataActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bodymeasurements.temperature.viewmodel.TempAddDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempAddDataViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempAddDataViewModel.class), function0, objArr);
            }
        });
        this.itemViews = new ArrayList<>();
        this.postTime = System.currentTimeMillis();
        this.userId = LazyKt__LazyJVMKt.lazy(new m());
        this.userInfo = LazyKt__LazyJVMKt.lazy(new n());
        this.todayDate = new Date(System.currentTimeMillis());
        this.registerDate = LazyKt__LazyJVMKt.lazy(new g());
        this.saveLoadingDialog = LazyKt__LazyJVMKt.lazy(new j());
        this.dateItemView = LazyKt__LazyJVMKt.lazy(new e());
        this.timeItemView = LazyKt__LazyJVMKt.lazy(new l());
        this.editItemView = LazyKt__LazyJVMKt.lazy(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempUserInfo A() {
        return (TempUserInfo) this.userInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempAddDataViewModel B() {
        return (TempAddDataViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(TemperatureAddDataActivity temperatureAddDataActivity, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i2 == 1) {
            temperatureAddDataActivity.x().show();
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            temperatureAddDataActivity.x().setFailed(temperatureAddDataActivity.getString(R.string.bm_common_save_failed));
        } else {
            temperatureAddDataActivity.x().hide();
            EventBus.getDefault().post(new EventTargetPage(temperatureAddDataActivity.B().getPostTime(), EventTargetType.ADD));
            temperatureAddDataActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(final DatePickerDialog.Mode mode) {
        new DatePickerDialog().showDialog(getSupportFragmentManager(), B().getPostTime(), w().getTime(), mode, getString(mode == DatePickerDialog.Mode.DATE ? R.string.bm_common_date_picker_title : R.string.bm_common_time_picker_title), new DatePickerDialog.DateSelectListener() { // from class: nm7
            @Override // com.huami.bodymeasurements.common.view.DatePickerDialog.DateSelectListener
            public final void onDateSelect(long j2) {
                TemperatureAddDataActivity.E(this.a, mode, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TemperatureAddDataActivity temperatureAddDataActivity, DatePickerDialog.Mode mode, long j2) {
        temperatureAddDataActivity.B().setPostTime(j2);
        temperatureAddDataActivity.postTime = j2;
        (mode == DatePickerDialog.Mode.DATE ? temperatureAddDataActivity.u() : temperatureAddDataActivity.z()).setItemValue(temperatureAddDataActivity.y(mode, temperatureAddDataActivity.postTime));
        HMLog.info(J, temperatureAddDataActivity.new k(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    private final void observeData() {
        B().getPostResultLiveData().observe(this, new Observer() { // from class: mm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureAddDataActivity.C(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NormalItemView r(DatePickerDialog.Mode mode) {
        return new NormalItemView.Builder(this).setItemName(getString(mode == DatePickerDialog.Mode.DATE ? R.string.bm_common_date : R.string.bm_common_time)).setItemValue(y(mode, System.currentTimeMillis())).setValueClick(new a(mode)).setSaveEnable(new b()).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditItemView s() {
        return new EditItemView.Builder(this).setItemName(getString(R.string.bm_temperature_name)).setItemUnit(TempUnitConverter.INSTANCE.getTempUnitString()).setDigits(1).setCheckContentValid(c.a).setInputFinished(new d()).create();
    }

    private final List<ItemView> t() {
        ArrayList<ItemView> arrayList = this.itemViews;
        arrayList.add(u());
        arrayList.add(z());
        arrayList.add(v());
        return this.itemViews;
    }

    private final NormalItemView u() {
        return (NormalItemView) this.dateItemView.getValue();
    }

    private final EditItemView v() {
        return (EditItemView) this.editItemView.getValue();
    }

    private final Date w() {
        return (Date) this.registerDate.getValue();
    }

    private final LoadingDialog x() {
        return (LoadingDialog) this.saveLoadingDialog.getValue();
    }

    private final String y(DatePickerDialog.Mode mode, long timeStamp) {
        return mode == DatePickerDialog.Mode.TIME ? TimeFormatUtils.INSTANCE.formatTimeHHmm(this, timeStamp) : TimeFormatUtils.INSTANCE.formatTimeYMD(this, timeStamp);
    }

    private final NormalItemView z() {
        return (NormalItemView) this.timeItemView.getValue();
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity
    @NotNull
    public List<ItemView> getItemViews() {
        return t();
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        observeData();
    }

    @Override // com.huami.bodymeasurements.common.business.add.AddDataBaseActivity
    public void save() {
        super.save();
        HMLog.info(J, h.a);
        if (getUserId() == null) {
            HMLog.info(J, i.a);
        } else {
            B().post(getUserId());
        }
    }
}
