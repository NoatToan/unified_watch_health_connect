package com.huami.femalehealth.uilib.ui.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.femalehealth.logiclib.manager.FHUploadPermissionManager;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.FHSettingUtils;
import com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt;
import com.huami.femalehealth.uilib.ui.activity.FHSettingActivity;
import com.huami.femalehealth.uilib.viewmodel.SettingViewModel;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.dialog.SingleWheelDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J!\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0002H\u0014R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u00100R\u0016\u00106\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010)¨\u0006:"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FHSettingActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", "initData", "Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "settingVo", "", "tag", ExifInterface.LATITUDE_SOUTH, "y", "Lcom/huami/lib/rainbow/ListTile;", "item", "", "value", "x", "(Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;)V", "w", "day", SOAP.XMLNS, "initView", "", "enable", "v", "t", "u", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "a", "Lkotlin/Lazy;", "B", "()Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "viewModel", "b", LogUtil.I, "periodLen", "c", "cycleLen", GoogleApiAvailabilityLight.a, "Z", "waitRequestAppNoticePermission", "e", "waitRequestExactAlarmPermission", "Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "f", "z", "()Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "appNoticeHelper", "g", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "noticeHelper", "h", "enablePredict", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FHSettingActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FHSettingActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int periodLen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int cycleLen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean waitRequestAppNoticePermission;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean waitRequestExactAlarmPermission;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy appNoticeHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy noticeHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean enablePredict;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FHSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) FHSettingActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SettingRepo.SettingResult.values().length];
            iArr2[SettingRepo.SettingResult.SUCCESS.ordinal()] = 1;
            iArr2[SettingRepo.SettingResult.NET_ERROR.ordinal()] = 2;
            iArr2[SettingRepo.SettingResult.DEV_ERROR.ordinal()] = 3;
            iArr2[SettingRepo.SettingResult.DEV_NOt_SUPPORT.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "init load setting";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "init load setting fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "load settings";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "load settings fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingRepo.SettingResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SettingRepo.SettingResult settingResult) {
            super(0);
            this.a = settingResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("input status: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "input success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "input fail, refresh";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function3<Boolean, Boolean, Boolean, Unit> {
        public final /* synthetic */ SingleWheelDialog<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SingleWheelDialog<Object> singleWheelDialog) {
            super(3);
            this.a = singleWheelDialog;
        }

        public final void a(boolean z, boolean z2, boolean z3) {
            SingleWheelDialog<Object> singleWheelDialog = this.a;
            singleWheelDialog.showEndName(singleWheelDialog.getYearPos() != 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ FHSettingActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ListTile listTile, FHSettingActivity fHSettingActivity) {
            super(3);
            this.a = listTile;
            this.b = fHSettingActivity;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            if (i == 0) {
                this.a.setTips(this.b.getString(R.string.fh_no_remind));
            } else {
                this.a.setTips(this.b.s(i));
            }
            SettingVo keepSetting = this.b.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            this.b.B().setSettingRequireDevConnect(keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : i, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ListTile listTile) {
            super(3);
            this.b = listTile;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            if (FHSettingActivity.this.cycleLen < i + 3) {
                Toast.makeText(this.b.getContext(), R.string.fh_cycleLen_invalid_data, 0).show();
                return;
            }
            int i2 = i + 1;
            this.b.setTips(FHSettingActivity.this.s(i2));
            SettingVo keepSetting = FHSettingActivity.this.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            FHSettingActivity fHSettingActivity = FHSettingActivity.this;
            fHSettingActivity.periodLen = i2;
            fHSettingActivity.B().setSettingRequireNet(keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : i2, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ FHSettingActivity b;
        public final /* synthetic */ ListTile c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Ref.IntRef intRef, FHSettingActivity fHSettingActivity, ListTile listTile) {
            super(3);
            this.a = intRef;
            this.b = fHSettingActivity;
            this.c = listTile;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            if (i + this.a.element < this.b.periodLen + 2) {
                Toast.makeText(this.c.getContext(), R.string.fh_cycleLen_invalid_data, 0).show();
                return;
            }
            int i2 = i + this.a.element;
            this.c.setTips(this.b.s(i2));
            SettingVo keepSetting = this.b.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            this.b.B().setSettingRequireNet(keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : i2));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(SettingVo settingVo) {
            super(0);
            this.a = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("switch app push, setSettingRequireNet, changed=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("isChecked:", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function3<Boolean, Boolean, Boolean, Unit> {
        public final /* synthetic */ SingleWheelDialog<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(SingleWheelDialog<Object> singleWheelDialog) {
            super(3);
            this.a = singleWheelDialog;
        }

        public final void a(boolean z, boolean z2, boolean z3) {
            SingleWheelDialog<Object> singleWheelDialog = this.a;
            singleWheelDialog.showEndName(singleWheelDialog.getYearPos() != 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ FHSettingActivity b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("day:", Integer.valueOf(this.a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ListTile listTile, FHSettingActivity fHSettingActivity) {
            super(3);
            this.a = listTile;
            this.b = fHSettingActivity;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            HMLog.error$default("xys_FHSettingActivity", null, null, new a(i), 6, null);
            if (i == 0) {
                this.a.setTips(this.b.getString(R.string.fh_no_remind));
                this.b.A().cancelCurrentUserMenstruationNotifyTask(this.b);
            } else {
                this.a.setTips(this.b.s(i));
                this.b.A().changeNotice(this.b);
            }
            SettingVo keepSetting = this.b.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            this.b.B().setSettingRequireNet(keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : i, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function3<Boolean, Boolean, Boolean, Unit> {
        public final /* synthetic */ SingleWheelDialog<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(SingleWheelDialog<Object> singleWheelDialog) {
            super(3);
            this.a = singleWheelDialog;
        }

        public final void a(boolean z, boolean z2, boolean z3) {
            SingleWheelDialog<Object> singleWheelDialog = this.a;
            singleWheelDialog.showEndName(singleWheelDialog.getYearPos() != 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ FHSettingActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ListTile listTile, FHSettingActivity fHSettingActivity) {
            super(3);
            this.a = listTile;
            this.b = fHSettingActivity;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            if (i == 0) {
                this.a.setTips(this.b.getString(R.string.fh_no_remind));
                this.b.A().cancelCurrentUserOvulationNotifyTask(this.b);
            } else {
                this.a.setTips(this.b.s(i));
                this.b.A().changeNotice(this.b);
            }
            SettingVo keepSetting = this.b.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            this.b.B().setSettingRequireNet(keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : i, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SettingVo b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(SettingVo settingVo, boolean z) {
            super(0);
            this.b = settingVo;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FHSettingActivity.this.S(this.b, "hwPush");
            FHSettingActivity.this.u(this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/SettingRepo$SettingResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<SettingRepo.SettingResult, Unit> {
        public static final s a = new s();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SettingRepo.SettingResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingRepo.SettingResult settingResult) {
                super(0);
                this.a = settingResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("set hwPush notice failed :", this.a);
            }
        }

        public s() {
            super(1);
        }

        public final void a(@NotNull SettingRepo.SettingResult settingResult) {
            HMLog.warn$default(FHSettingActivity.TAG, null, new a(settingResult), 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SettingRepo.SettingResult settingResult) {
            a(settingResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function3<Boolean, Boolean, Boolean, Unit> {
        public final /* synthetic */ SingleWheelDialog<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(SingleWheelDialog<Object> singleWheelDialog) {
            super(3);
            this.a = singleWheelDialog;
        }

        public final void a(boolean z, boolean z2, boolean z3) {
            SingleWheelDialog<Object> singleWheelDialog = this.a;
            singleWheelDialog.showEndName(singleWheelDialog.getYearPos() != 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ FHSettingActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ListTile listTile, FHSettingActivity fHSettingActivity) {
            super(3);
            this.a = listTile;
            this.b = fHSettingActivity;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            if (i == 0) {
                this.a.setTips(this.b.getString(R.string.fh_no_remind));
            } else {
                this.a.setTips(this.b.s(i));
            }
            SettingVo keepSetting = this.b.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            this.b.B().setSettingRequireDevConnect(keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : i, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ SettingVo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, SettingVo settingVo) {
            super(0);
            this.a = str;
            this.b = settingVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "keepSetting, tag=" + ((Object) this.a) + ", settingVo=" + this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FHSettingActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SettingViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.FHSettingActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.SettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SettingViewModel getA() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SettingViewModel.class), c15291, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.appNoticeHelper = LazyKt__LazyJVMKt.lazy(new Function0<FemaleAppNoticeHelper>() { // from class: com.huami.femalehealth.uilib.ui.activity.FHSettingActivity$special$$inlined$injectInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FemaleAppNoticeHelper getA() {
                return ScopesAndQualifersKt.femaleHealthScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(FemaleAppNoticeHelper.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.noticeHelper = LazyKt__LazyJVMKt.lazy(new Function0<FemaleAppNoticeHelper>() { // from class: com.huami.femalehealth.uilib.ui.activity.FHSettingActivity$special$$inlined$injectInFH$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FemaleAppNoticeHelper getA() {
                return ScopesAndQualifersKt.femaleHealthScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(FemaleAppNoticeHelper.class), objArr4, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FemaleAppNoticeHelper A() {
        return (FemaleAppNoticeHelper) this.noticeHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingViewModel B() {
        return (SettingViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(FHSettingActivity fHSettingActivity, Resource resource) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            HMLog.warn$default(TAG, null, b.a, 2, null);
            return;
        }
        SettingVo settingVo = (SettingVo) resource.getData();
        if (settingVo != null) {
            if (fHSettingActivity.B().isCurrentDeviceNotSupport() && settingVo.getHardwarePush()) {
                settingVo.setHardwarePush(false);
            }
            T(fHSettingActivity, settingVo, null, 2, null);
            fHSettingActivity.y();
        }
        HMLog.info(TAG, a.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(FHSettingActivity fHSettingActivity, Resource resource) {
        Status status = resource == null ? null : resource.getStatus();
        int i2 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            HMLog.warn$default(TAG, null, d.a, 2, null);
        } else {
            SettingVo settingVo = (SettingVo) resource.getData();
            if (settingVo != null) {
                T(fHSettingActivity, settingVo, null, 2, null);
            }
            HMLog.info(TAG, c.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(FHSettingActivity fHSettingActivity, SettingRepo.SettingResult settingResult) {
        if (settingResult == null) {
            return;
        }
        HMLog.debug(TAG, new e(settingResult));
        int i2 = WhenMappings.$EnumSwitchMapping$1[settingResult.ordinal()];
        if (i2 == 1) {
            HMLog.debug(TAG, f.a);
            return;
        }
        if (i2 == 2 || i2 == 3) {
            Toast.makeText(fHSettingActivity.getApplicationContext(), R.string.fh_set_setting_error, 0).show();
            fHSettingActivity.B().refreshSetting();
        } else if (i2 != 4) {
            fHSettingActivity.B().refreshSetting();
            HMLog.info(TAG, g.a);
        } else {
            Toast.makeText(fHSettingActivity.getApplicationContext(), R.string.fh_device_feature_require, 0).show();
            fHSettingActivity.B().refreshSetting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(FHSettingActivity fHSettingActivity, Boolean bool) {
        fHSettingActivity.v(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(FHSettingActivity fHSettingActivity, ListTile listTile, View view) {
        if (!fHSettingActivity.enablePredict) {
            Toast.makeText(fHSettingActivity.getApplicationContext(), R.string.fh_device_connect_require, 0).show();
            return;
        }
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
            return;
        }
        SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
        int menstrualCycle = keepSetting == null ? 27 : keepSetting.getMenstrualCycle();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 11;
        int i2 = fHSettingActivity.periodLen;
        if (i2 != 0) {
            intRef.element = i2 + 2;
        }
        int i3 = menstrualCycle + 1;
        int i4 = intRef.element;
        if (i3 < i4) {
            menstrualCycle = i4 - 1;
        }
        new SingleWheelDialog(listTile.getContext().getString(R.string.fh_item_physiological_long), "", listTile.getContext().getString(R.string.fh_time_day_text), FHSettingUtils.INSTANCE.createPhysiologicalLongDialogData(intRef.element), menstrualCycle - intRef.element, null, new k(intRef, fHSettingActivity, listTile), 32, null).show(fHSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(FHSettingActivity fHSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
            if (!fHUploadPermissionManager.getHasPermission()) {
                FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
                return;
            }
            SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            if (z) {
                fHSettingActivity.A().changeNotice(fHSettingActivity);
            } else {
                fHSettingActivity.A().cancelCurrentUserAppNotifyTask(fHSettingActivity);
            }
            SettingVo settingVoCopy = keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : z, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0);
            fHSettingActivity.B().setSettingRequireNet(settingVoCopy);
            Unit unit = Unit.INSTANCE;
            fHSettingActivity.S(settingVoCopy, "predict");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(FHSettingActivity fHSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
            if (!fHUploadPermissionManager.getHasPermission()) {
                FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
                return;
            }
            if (z) {
                if (!fHSettingActivity.z().hasNotifyPermission(fHSettingActivity)) {
                    if (fHSettingActivity.z().jumpToNotifySettingActivity(fHSettingActivity)) {
                        fHSettingActivity.waitRequestAppNoticePermission = true;
                        return;
                    }
                    ((ListTile) fHSettingActivity.findViewById(R.id.item_message)).setChecked(false);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(fHSettingActivity, R.style.FHAlertDialog).setMessage(R.string.fh_notice_permission_err).setPositiveButton(R.string.fh_know, new DialogInterface.OnClickListener() { // from class: xy1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            FHSettingActivity.J(dialogInterface, i2);
                        }
                    }).create();
                    alertDialogCreate.show();
                    alertDialogCreate.getButton(-1).setTextColor(ExtKt.getResColor(fHSettingActivity, R.color.fh_dialog_positive_button_color));
                    return;
                }
                if (!fHSettingActivity.z().hasExactAlarmPermission(fHSettingActivity)) {
                    fHSettingActivity.waitRequestExactAlarmPermission = fHSettingActivity.z().requireAlarmPermission(fHSettingActivity);
                    return;
                }
            }
            SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
            if (keepSetting != null) {
                SettingVo settingVoCopy = keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : z, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : false, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0);
                HMLog.info(TAG, new l(settingVoCopy));
                fHSettingActivity.B().setSettingRequireNet(settingVoCopy);
                Unit unit = Unit.INSTANCE;
                fHSettingActivity.S(settingVoCopy, "appPush");
            }
            fHSettingActivity.A().changeNotice(fHSettingActivity);
            HMLog.error$default("xys_FHSettingActivity", null, null, new m(z), 6, null);
            fHSettingActivity.t(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(FHSettingActivity fHSettingActivity, ListTile listTile, View view) {
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
            return;
        }
        SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
        Integer numValueOf = keepSetting != null ? Integer.valueOf(keepSetting.getAppBeforeMenstruationPush()) : null;
        int iIntValue = numValueOf == null ? 1 : numValueOf.intValue();
        SingleWheelDialog singleWheelDialog = new SingleWheelDialog(listTile.getContext().getString(R.string.fh_item_message_title), "", listTile.getContext().getString(R.string.fh_time_day_text), FHSettingUtils.INSTANCE.createRemindLongDialogDataWithNot(fHSettingActivity.getString(R.string.fh_no_remind)), iIntValue, null, new o(listTile, fHSettingActivity), 32, null);
        singleWheelDialog.setOnScrollListener(new n(singleWheelDialog));
        singleWheelDialog.setInitShowEndName(iIntValue != 0);
        singleWheelDialog.show(fHSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(FHSettingActivity fHSettingActivity, ListTile listTile, View view) {
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
            return;
        }
        SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
        Integer numValueOf = keepSetting != null ? Integer.valueOf(keepSetting.getAppBeforeOvulationPush()) : null;
        int iIntValue = numValueOf == null ? 0 : numValueOf.intValue();
        SingleWheelDialog singleWheelDialog = new SingleWheelDialog(listTile.getContext().getString(R.string.fh_item_message_title), "", listTile.getContext().getString(R.string.fh_time_day_text), FHSettingUtils.INSTANCE.createRemindLongDialogDataWithNot(fHSettingActivity.getString(R.string.fh_no_remind)), iIntValue, null, new q(listTile, fHSettingActivity), 32, null);
        singleWheelDialog.setOnScrollListener(new p(singleWheelDialog));
        singleWheelDialog.setInitShowEndName(iIntValue != 0);
        singleWheelDialog.show(fHSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(FHSettingActivity fHSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
            if (!fHUploadPermissionManager.getHasPermission()) {
                FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
                return;
            }
            SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
            if (keepSetting == null) {
                return;
            }
            SettingVo settingVoCopy = keepSetting.copy((1983 & 1) != 0 ? keepSetting.appBeforeMenstruationPush : 0, (1983 & 2) != 0 ? keepSetting.appBeforeOvulationPush : 0, (1983 & 4) != 0 ? keepSetting.appPush : false, (1983 & 8) != 0 ? keepSetting.estimatedMenstrualDays : 0, (1983 & 16) != 0 ? keepSetting.firstTime : false, (1983 & 32) != 0 ? keepSetting.hardwareBeforeMenstruationPush : 0, (1983 & 64) != 0 ? keepSetting.hardwareBeforeOvulationPush : 0, (1983 & 128) != 0 ? keepSetting.hardwarePush : z, (1983 & 256) != 0 ? keepSetting.intelligentPrediction : false, (1983 & 512) != 0 ? keepSetting.lastMenstrualTime : 0L, (1983 & 1024) != 0 ? keepSetting.menstrualCycle : 0);
            fHSettingActivity.B().setSettingRequireDevSupport(settingVoCopy, fHSettingActivity.new r(settingVoCopy, z), s.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(FHSettingActivity fHSettingActivity, ListTile listTile, View view) {
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
            return;
        }
        SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
        Integer numValueOf = keepSetting != null ? Integer.valueOf(keepSetting.getHardwareBeforeMenstruationPush()) : null;
        int iIntValue = numValueOf == null ? 1 : numValueOf.intValue();
        SingleWheelDialog singleWheelDialog = new SingleWheelDialog(listTile.getContext().getString(R.string.fh_item_device_message_title), "", listTile.getContext().getString(R.string.fh_time_day_text), FHSettingUtils.INSTANCE.createRemindLongDialogDataWithNot(fHSettingActivity.getString(R.string.fh_no_remind)), iIntValue, null, new u(listTile, fHSettingActivity), 32, null);
        singleWheelDialog.setOnScrollListener(new t(singleWheelDialog));
        singleWheelDialog.setInitShowEndName(iIntValue != 0);
        singleWheelDialog.show(fHSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(FHSettingActivity fHSettingActivity, ListTile listTile, View view) {
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
            return;
        }
        SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
        Integer numValueOf = keepSetting != null ? Integer.valueOf(keepSetting.getHardwareBeforeOvulationPush()) : null;
        int iIntValue = numValueOf == null ? 0 : numValueOf.intValue();
        SingleWheelDialog singleWheelDialog = new SingleWheelDialog(listTile.getContext().getString(R.string.fh_item_device_message_title), "", listTile.getContext().getString(R.string.fh_time_day_text), FHSettingUtils.INSTANCE.createRemindLongDialogDataWithNot(fHSettingActivity.getString(R.string.fh_no_remind)), iIntValue, null, new i(listTile, fHSettingActivity), 32, null);
        singleWheelDialog.setOnScrollListener(new h(singleWheelDialog));
        singleWheelDialog.setInitShowEndName(iIntValue != 0);
        singleWheelDialog.show(fHSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(View view) {
        InstructionsActivity.INSTANCE.start(view.getContext(), view.getContext().getString(R.string.fh_instructions_activity_title), view.getContext().getString(R.string.fh_instructions_title), view.getContext().getString(R.string.fh_instructions_content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(FHSettingActivity fHSettingActivity, View view) {
        fHSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(FHSettingActivity fHSettingActivity, ListTile listTile, View view) {
        if (!fHSettingActivity.enablePredict) {
            Toast.makeText(fHSettingActivity.getApplicationContext(), R.string.fh_device_connect_require, 0).show();
            return;
        }
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHSettingActivity, null, 2, null);
        } else {
            SettingVo keepSetting = fHSettingActivity.B().getKeepSetting();
            new SingleWheelDialog(listTile.getContext().getString(R.string.fh_item_fh_period_long), "", listTile.getContext().getString(R.string.fh_time_day_text), FHSettingUtils.INSTANCE.createPeriodLongDialogData(), (keepSetting == null ? 5 : keepSetting.getEstimatedMenstrualDays()) - 1, null, fHSettingActivity.new j(listTile), 32, null).show(fHSettingActivity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(SettingVo settingVo, String tag) {
        HMLog.info(TAG, new v(tag, settingVo));
        B().keepSetting(settingVo);
        SettingVo keepSetting = B().getKeepSetting();
        this.periodLen = keepSetting == null ? 0 : keepSetting.getEstimatedMenstrualDays();
        SettingVo keepSetting2 = B().getKeepSetting();
        this.cycleLen = keepSetting2 != null ? keepSetting2.getMenstrualCycle() : 0;
        B().refreshPeriodSettings();
    }

    public static /* synthetic */ void T(FHSettingActivity fHSettingActivity, SettingVo settingVo, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        fHSettingActivity.S(settingVo, str);
    }

    private final void initData() {
        B().getSetting().observe(this, new Observer() { // from class: az1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FHSettingActivity.C(this.a, (Resource) obj);
            }
        });
        B().refreshSetting();
        B().getSettings().observe(this, new Observer() { // from class: bz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FHSettingActivity.D(this.a, (Resource) obj);
            }
        });
        B().getInputStatus().observe(this, new Observer() { // from class: cz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FHSettingActivity.E(this.a, (SettingRepo.SettingResult) obj);
            }
        });
        B().getEnablePeriodSettings().observe(this, new Observer() { // from class: dz1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FHSettingActivity.F(this.a, (Boolean) obj);
            }
        });
    }

    private final void initView() {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: ez1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.Q(this.a, view);
            }
        });
        ((TypefaceTextView) findViewById(R.id.tv_card_forecast)).setMaxWidth((ResourceHelper.INSTANCE.findScreenWH().x * 3) / 5);
        final ListTile listTile = (ListTile) findViewById(R.id.item_fh_period_long);
        listTile.setOnClickListener(new View.OnClickListener() { // from class: hz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.R(this.a, listTile, view);
            }
        });
        Context context = listTile.getContext();
        int i2 = R.string.fh_please_choose;
        listTile.setTips(context.getString(i2));
        final ListTile listTile2 = (ListTile) findViewById(R.id.item_physiological_long);
        listTile2.setOnClickListener(new View.OnClickListener() { // from class: jz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.G(this.a, listTile2, view);
            }
        });
        listTile2.setTips(listTile2.getContext().getString(i2));
        ((ListTile) findViewById(R.id.item_forecast)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yy1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FHSettingActivity.H(this.a, compoundButton, z);
            }
        });
        ((ListTile) findViewById(R.id.item_message)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mz1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FHSettingActivity.I(this.a, compoundButton, z);
            }
        });
        final ListTile listTile3 = (ListTile) findViewById(R.id.item_start);
        listTile3.setOnClickListener(new View.OnClickListener() { // from class: gz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.K(this.a, listTile3, view);
            }
        });
        listTile3.setTips(listTile3.getContext().getString(i2));
        final ListTile listTile4 = (ListTile) findViewById(R.id.item_advance);
        listTile4.setOnClickListener(new View.OnClickListener() { // from class: iz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.L(this.a, listTile4, view);
            }
        });
        listTile4.setTips(listTile4.getContext().getString(i2));
        ((ListTile) findViewById(R.id.item_device_message)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zy1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FHSettingActivity.M(this.a, compoundButton, z);
            }
        });
        final ListTile listTile5 = (ListTile) findViewById(R.id.item_device_start);
        listTile5.setOnClickListener(new View.OnClickListener() { // from class: fz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.N(this.a, listTile5, view);
            }
        });
        listTile5.setTips(listTile5.getContext().getString(i2));
        final ListTile listTile6 = (ListTile) findViewById(R.id.item_device_advance);
        listTile6.setOnClickListener(new View.OnClickListener() { // from class: kz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.O(this.a, listTile6, view);
            }
        });
        listTile6.setTips(listTile6.getContext().getString(i2));
        ((ImageView) findViewById(R.id.iv_forecast_icon)).setOnClickListener(new View.OnClickListener() { // from class: lz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHSettingActivity.P(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s(int day) {
        String quantityString;
        Resources resources = ResourceHelper.INSTANCE.getResources();
        return (resources == null || (quantityString = resources.getQuantityString(R.plurals.fh_time_day_var, day, Integer.valueOf(day))) == null) ? "" : quantityString;
    }

    private final void t(boolean enable) {
        ((ListTile) findViewById(R.id.item_start)).setEnabled(enable);
        ((ListTile) findViewById(R.id.item_advance)).setEnabled(enable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(boolean enable) {
        ((ListTile) findViewById(R.id.item_device_start)).setEnabled(enable);
        ((ListTile) findViewById(R.id.item_device_advance)).setEnabled(enable);
    }

    private final void v(boolean enable) {
        this.enablePredict = enable;
        ((ListTile) findViewById(R.id.item_fh_period_long)).setGrayEnable(!enable);
        ((ListTile) findViewById(R.id.item_physiological_long)).setGrayEnable(!enable);
    }

    private final void w(ListTile item, Integer value) {
        if (value != null && value.intValue() > 0) {
            item.setTips(s(value.intValue()));
        } else if (value != null && value.intValue() == 0) {
            item.setTips(getString(R.string.fh_no_remind));
        } else {
            item.setTips(getString(R.string.fh_please_choose));
        }
    }

    private final void x(ListTile item, Integer value) {
        if (value == null || value.intValue() <= 0) {
            item.setTips(getString(R.string.fh_please_choose));
        } else {
            item.setTips(s(value.intValue()));
        }
    }

    private final void y() {
        ListTile listTile = (ListTile) findViewById(R.id.item_fh_period_long);
        SettingVo keepSetting = B().getKeepSetting();
        x(listTile, keepSetting == null ? null : Integer.valueOf(keepSetting.getEstimatedMenstrualDays()));
        ListTile listTile2 = (ListTile) findViewById(R.id.item_physiological_long);
        SettingVo keepSetting2 = B().getKeepSetting();
        x(listTile2, keepSetting2 == null ? null : Integer.valueOf(keepSetting2.getMenstrualCycle()));
        ListTile listTile3 = (ListTile) findViewById(R.id.item_start);
        SettingVo keepSetting3 = B().getKeepSetting();
        w(listTile3, keepSetting3 == null ? null : Integer.valueOf(keepSetting3.getAppBeforeMenstruationPush()));
        ListTile listTile4 = (ListTile) findViewById(R.id.item_advance);
        SettingVo keepSetting4 = B().getKeepSetting();
        w(listTile4, keepSetting4 == null ? null : Integer.valueOf(keepSetting4.getAppBeforeOvulationPush()));
        ListTile listTile5 = (ListTile) findViewById(R.id.item_device_start);
        SettingVo keepSetting5 = B().getKeepSetting();
        w(listTile5, keepSetting5 == null ? null : Integer.valueOf(keepSetting5.getHardwareBeforeMenstruationPush()));
        ListTile listTile6 = (ListTile) findViewById(R.id.item_device_advance);
        SettingVo keepSetting6 = B().getKeepSetting();
        w(listTile6, keepSetting6 != null ? Integer.valueOf(keepSetting6.getHardwareBeforeOvulationPush()) : null);
        SettingVo keepSetting7 = B().getKeepSetting();
        boolean intelligentPrediction = keepSetting7 == null ? false : keepSetting7.getIntelligentPrediction();
        int i2 = R.id.item_forecast;
        if (((ListTile) findViewById(i2)).isChecked() != intelligentPrediction) {
            ((ListTile) findViewById(i2)).setChecked(intelligentPrediction);
        }
        SettingVo keepSetting8 = B().getKeepSetting();
        boolean appPush = keepSetting8 == null ? false : keepSetting8.getAppPush();
        int i3 = R.id.item_message;
        if (((ListTile) findViewById(i3)).isChecked() != appPush) {
            ((ListTile) findViewById(i3)).setChecked(appPush && z().hasNotifyPermission(this) && z().hasExactAlarmPermission(this));
        }
        t(appPush);
        SettingVo keepSetting9 = B().getKeepSetting();
        boolean hardwarePush = keepSetting9 != null ? keepSetting9.getHardwarePush() : false;
        int i4 = R.id.item_device_message;
        if (((ListTile) findViewById(i4)).isChecked() != hardwarePush) {
            ((ListTile) findViewById(i4)).setChecked(hardwarePush);
        }
        u(hardwarePush);
    }

    private final FemaleAppNoticeHelper z() {
        return (FemaleAppNoticeHelper) this.appNoticeHelper.getValue();
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_setting);
        observerLifeCycle(B());
        initView();
        initData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int i2 = R.id.item_message;
        boolean z = false;
        if ((((ListTile) findViewById(i2)).isChecked() && !z().hasNotifyPermission(this)) || !z().hasExactAlarmPermission(this)) {
            ((ListTile) findViewById(i2)).setChecked(false);
        }
        if (this.waitRequestAppNoticePermission) {
            this.waitRequestAppNoticePermission = false;
            if (this.waitRequestExactAlarmPermission) {
                this.waitRequestExactAlarmPermission = false;
                ListTile listTile = (ListTile) findViewById(i2);
                if (z().hasNotifyPermission(this) && z().hasExactAlarmPermission(this)) {
                    z = true;
                }
                listTile.setChecked(z);
            } else {
                ((ListTile) findViewById(i2)).setChecked(z().hasNotifyPermission(this));
            }
        }
        t(((ListTile) findViewById(i2)).isChecked());
    }
}
