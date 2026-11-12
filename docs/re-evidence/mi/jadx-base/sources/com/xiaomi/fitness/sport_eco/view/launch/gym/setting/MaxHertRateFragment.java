package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.MaxHertRateFragment;
import com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog;
import com.xiaomi.fitness.sport_eco.view.widget.SportRadioView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.a6l;
import defpackage.av6;
import defpackage.ayi;
import defpackage.bg4;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.sk5;
import defpackage.zx7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b3\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J-\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u00101\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/MaxHertRateFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "initData", "()V", "Lzx7;", "openRadioSwitch", "(Lzx7;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport_eco/view/widget/SportRadioView;", "Lkotlin/jvm/internal/EnhancedNullability;", "getRadioView", "()Ljava/util/ArrayList;", "setResult", "", "title", "Lkotlin/Function1;", "confirm", "showDialog", "(ILkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "args", "setArguments", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "binding", "Lzx7;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mlAlertDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "isRemindHr", "Z", "heartRate", "I", "", "heartRateRange", "Ljava/lang/String;", "heartRateRangeType", "heartRateSwitch", "userMaxHertRate", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMaxHertRateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxHertRateFragment.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/MaxHertRateFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,369:1\n1863#2,2:370\n1863#2,2:372\n1863#2,2:374\n*S KotlinDebug\n*F\n+ 1 MaxHertRateFragment.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/MaxHertRateFragment\n*L\n130#1:370,2\n115#1:372,2\n132#1:374,2\n*E\n"})
public final class MaxHertRateFragment extends BaseFragment {
    public static final int HERT_RATE_TYPE_AEROBIC_TYPE = 3;
    public static final int HERT_RATE_TYPE_ANAEROBIC_TYPE = 4;
    public static final int HERT_RATE_TYPE_FAT_BUTNING_TYPE = 2;
    public static final int HERT_RATE_TYPE_LIMIT_TYPE = 5;
    public static final int HERT_RATE_TYPE_WARM_UP_TYPE = 1;

    @NotNull
    public static final String PARAMS_REMIND_HR = "remindHr";

    @NotNull
    public static final String PARAMS_REMIND_RATE = "heartRate";

    @NotNull
    public static final String PARAMS_REMIND_RATE_RANGE = "heartRateRange";

    @NotNull
    public static final String PARAMS_REMIND_RATE_SWITCH = "heartRateSwitch";
    public static final int REQUEST_CODE_HERT_RATE = 1;

    @NotNull
    public static final String REQUEST_PARAMS_HERT_RATE = "heartRate";

    @NotNull
    public static final String REQUEST_PARAMS_HERT_RATE_RANGE = "heartRateRange";

    @NotNull
    public static final String REQUEST_PARAMS_HERT_RATE_RANGE_SWITCH = "heartRateRangeSwitch";

    @NotNull
    public static final String REQUEST_PARAMS_REMIND_HR = "isRemindHr";
    private static int globalHeartRate = 0;
    public static final int maxHRRemindStart = 99;
    private zx7 binding;
    private int heartRate;

    @NotNull
    private String heartRateRange;
    private int heartRateRangeType;
    private boolean heartRateSwitch;
    private boolean isRemindHr;

    @Nullable
    private CommonDialog<?> mlAlertDialog;
    private int userMaxHertRate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static String HERT_RATE_TYPE_WARM_UP = "";

    @JvmField
    @NotNull
    public static String HERT_RATE_TYPE_FAT_BUTNING = "";

    @JvmField
    @NotNull
    public static String HERT_RATE_TYPE_AEROBIC = "";

    @JvmField
    @NotNull
    public static String HERT_RATE_TYPE_ANAEROBIC = "";

    @JvmField
    @NotNull
    public static String HERT_RATE_TYPE_LIMIT = "";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0007H\u0007J\b\u0010\u001e\u001a\u00020\u0005H\u0007J\b\u0010\u001f\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/MaxHertRateFragment$Companion;", "", "<init>", "()V", "REQUEST_CODE_HERT_RATE", "", "PARAMS_REMIND_HR", "", "PARAMS_REMIND_RATE", "PARAMS_REMIND_RATE_SWITCH", "PARAMS_REMIND_RATE_RANGE", "REQUEST_PARAMS_REMIND_HR", "REQUEST_PARAMS_HERT_RATE", "REQUEST_PARAMS_HERT_RATE_RANGE", "REQUEST_PARAMS_HERT_RATE_RANGE_SWITCH", "maxHRRemindStart", "HERT_RATE_TYPE_WARM_UP", "HERT_RATE_TYPE_WARM_UP_TYPE", "HERT_RATE_TYPE_FAT_BUTNING", "HERT_RATE_TYPE_FAT_BUTNING_TYPE", "HERT_RATE_TYPE_AEROBIC", "HERT_RATE_TYPE_AEROBIC_TYPE", "HERT_RATE_TYPE_ANAEROBIC", "HERT_RATE_TYPE_ANAEROBIC_TYPE", "HERT_RATE_TYPE_LIMIT", "HERT_RATE_TYPE_LIMIT_TYPE", "globalHeartRate", "calculateHertRateRange", "", "getDefaultHertRateRange", "calculateMaxHertRate", "getMaxHertRate", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void calculateHertRateRange() {
            int iCalculateMaxHertRate = calculateMaxHertRate();
            double d = iCalculateMaxHertRate;
            int i = (int) (0.9d * d);
            MaxHertRateFragment.HERT_RATE_TYPE_LIMIT = i + "," + iCalculateMaxHertRate + ",5";
            int i2 = (int) (0.8d * d);
            MaxHertRateFragment.HERT_RATE_TYPE_ANAEROBIC = i2 + "," + i + ",4";
            int i3 = (int) (0.7d * d);
            MaxHertRateFragment.HERT_RATE_TYPE_AEROBIC = i3 + "," + i2 + ",3";
            int i4 = (int) (0.6d * d);
            MaxHertRateFragment.HERT_RATE_TYPE_FAT_BUTNING = i4 + "," + i3 + ",2";
            MaxHertRateFragment.HERT_RATE_TYPE_WARM_UP = ((int) (d * 0.5d)) + "," + i4 + ",1";
        }

        @JvmStatic
        public final int calculateMaxHertRate() {
            UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
            if (userProfile$default.getRecordMaxHrm() != null) {
                UserProfile.RecordMaxHrm recordMaxHrm = userProfile$default.getRecordMaxHrm();
                int hrm = recordMaxHrm != null ? recordMaxHrm.getHrm() : 0;
                if (hrm > 0) {
                    return hrm;
                }
            }
            return (int) (210 - (userProfile$default.getAge() * 0.648f));
        }

        @JvmStatic
        @NotNull
        public final String getDefaultHertRateRange() {
            if (MaxHertRateFragment.HERT_RATE_TYPE_AEROBIC.length() == 0) {
                calculateHertRateRange();
            }
            return MaxHertRateFragment.HERT_RATE_TYPE_AEROBIC;
        }

        @JvmStatic
        public final int getMaxHertRate() {
            return MaxHertRateFragment.globalHeartRate > 0 ? MaxHertRateFragment.globalHeartRate : calculateMaxHertRate();
        }
    }

    public MaxHertRateFragment() {
        super(fvi.x);
        this.heartRateRange = HERT_RATE_TYPE_AEROBIC;
        this.heartRateRangeType = 3;
    }

    @JvmStatic
    public static final int calculateMaxHertRate() {
        return INSTANCE.calculateMaxHertRate();
    }

    @JvmStatic
    @NotNull
    public static final String getDefaultHertRateRange() {
        return INSTANCE.getDefaultHertRateRange();
    }

    @JvmStatic
    public static final int getMaxHertRate() {
        return INSTANCE.getMaxHertRate();
    }

    private final ArrayList<SportRadioView> getRadioView() {
        zx7 zx7Var = this.binding;
        if (zx7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zx7Var = null;
        }
        return CollectionsKt__CollectionsKt.arrayListOf(zx7Var.H, zx7Var.F, zx7Var.C, zx7Var.D, zx7Var.G);
    }

    private final void initData() {
        setTitle(e1j.j4);
        INSTANCE.calculateHertRateRange();
        if (this.heartRateRange.length() == 0) {
            this.heartRateRange = HERT_RATE_TYPE_AEROBIC;
        }
        this.heartRateRangeType = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) this.heartRateRange, new String[]{","}, false, 0, 6, (Object) null).get(2));
        zx7 zx7Var = this.binding;
        if (zx7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zx7Var = null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_WARM_UP, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView = zx7Var.H;
        String string = getString(e1j.V1, Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1))));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        sportRadioView.setDetail(string);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_FAT_BUTNING, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView2 = zx7Var.F;
        String string2 = getString(e1j.V1, Integer.valueOf(Integer.parseInt((String) listSplit$default2.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default2.get(1))));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        sportRadioView2.setDetail(string2);
        List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_AEROBIC, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView3 = zx7Var.C;
        String string3 = getString(e1j.V1, Integer.valueOf(Integer.parseInt((String) listSplit$default3.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default3.get(1))));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        sportRadioView3.setDetail(string3);
        List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_ANAEROBIC, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView4 = zx7Var.D;
        String string4 = getString(e1j.V1, Integer.valueOf(Integer.parseInt((String) listSplit$default4.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default4.get(1))));
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        sportRadioView4.setDetail(string4);
        List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_LIMIT, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView5 = zx7Var.G;
        String string5 = getString(e1j.V1, Integer.valueOf(Integer.parseInt((String) listSplit$default5.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default5.get(1))));
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        sportRadioView5.setDetail(string5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$1(final MaxHertRateFragment this$0, final zx7 this_with, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.showDialog(e1j.Y1, new Function1() { // from class: g9f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return MaxHertRateFragment.onViewCreated$lambda$7$lambda$1$lambda$0(this_with, this$0, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$1$lambda$0(zx7 this_with, MaxHertRateFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 99) {
            this_with.B.setRemindText(this$0.getResources().getString(e1j.O));
            this$0.isRemindHr = false;
        } else {
            this_with.B.setRemindText(i + this$0.getResources().getQuantityString(ayi.common_unit_heart_rate, i));
            this$0.isRemindHr = true;
            this$0.heartRate = i;
        }
        this$0.setResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$3(MaxHertRateFragment this$0, zx7 this_with, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        zx7 zx7Var = null;
        if (z) {
            Iterator<T> it = this$0.getRadioView().iterator();
            while (it.hasNext()) {
                ((SportRadioView) it.next()).getRadioView().setChecked(false);
            }
            zx7 zx7Var2 = this$0.binding;
            if (zx7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zx7Var = zx7Var2;
            }
            zx7Var.A.setVisibility(0);
            if (this$0.heartRateRange.length() > 0) {
                this$0.heartRateRangeType = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) this$0.heartRateRange, new String[]{","}, false, 0, 6, (Object) null).get(2));
            }
            this$0.openRadioSwitch(this_with);
        } else {
            zx7 zx7Var3 = this$0.binding;
            if (zx7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zx7Var = zx7Var3;
            }
            zx7Var.A.setVisibility(8);
        }
        this$0.heartRateSwitch = z;
        this$0.setResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$6$lambda$5(MaxHertRateFragment this$0, SportRadioView radioView, zx7 this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(radioView, "$radioView");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Iterator<T> it = this$0.getRadioView().iterator();
        while (it.hasNext()) {
            ((SportRadioView) it.next()).getRadioView().setChecked(false);
        }
        CheckedTextView radioView2 = radioView.getRadioView();
        radioView2.setChecked(!radioView2.isChecked());
        if (Intrinsics.areEqual(radioView, this_with.H)) {
            this$0.heartRateRange = HERT_RATE_TYPE_WARM_UP;
        } else if (Intrinsics.areEqual(radioView, this_with.F)) {
            this$0.heartRateRange = HERT_RATE_TYPE_FAT_BUTNING;
        } else if (Intrinsics.areEqual(radioView, this_with.C)) {
            this$0.heartRateRange = HERT_RATE_TYPE_AEROBIC;
        } else if (Intrinsics.areEqual(radioView, this_with.D)) {
            this$0.heartRateRange = HERT_RATE_TYPE_ANAEROBIC;
        } else if (Intrinsics.areEqual(radioView, this_with.G)) {
            this$0.heartRateRange = HERT_RATE_TYPE_LIMIT;
        }
        this$0.setResult();
    }

    private final void openRadioSwitch(zx7 zx7Var) {
        int i = this.heartRateRangeType;
        if (i == 1) {
            zx7Var.H.getRadioView().setChecked(true);
            return;
        }
        if (i == 2) {
            zx7Var.F.getRadioView().setChecked(true);
            return;
        }
        if (i == 3) {
            zx7Var.C.getRadioView().setChecked(true);
        } else if (i == 4) {
            zx7Var.D.getRadioView().setChecked(true);
        } else {
            if (i != 5) {
                return;
            }
            zx7Var.G.getRadioView().setChecked(true);
        }
    }

    private final void setResult() {
        Intent intent = new Intent();
        intent.putExtra("remindHr", this.isRemindHr);
        intent.putExtra("heartRate", this.heartRate);
        intent.putExtra("heartRateSwitch", this.heartRateSwitch);
        intent.putExtra("heartRateRange", this.heartRateRange);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
    }

    private final void showDialog(int title, final Function1<? super Integer, Unit> confirm) {
        final CustomPickerDialog customPickerDialogCreate = new CustomPickerDialog.Builder("").setDialogTitle(title).setCanceledOnTouchOutside(true).setPositiveText(e1j.d).setNegativeText(e1j.c).create();
        if (this.isRemindHr) {
            customPickerDialogCreate.setValue(this.heartRate);
        }
        customPickerDialogCreate.setCustomAdapter(new CustomPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.MaxHertRateFragment.showDialog.1
            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return 122;
            }

            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                int value = getValue(index);
                if (value != 99) {
                    return String.valueOf(value);
                }
                String string = MaxHertRateFragment.this.getString(e1j.C0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }

            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return index + 99;
            }
        });
        customPickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.MaxHertRateFragment.showDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    confirm.invoke2(Integer.valueOf(customPickerDialogCreate.getValue()));
                }
            }
        });
        customPickerDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (inflater == null) {
            inflater = LayoutInflater.from(requireContext());
        }
        zx7 zx7Var = (zx7) sk5.j(inflater, getLayoutId(), container, false);
        this.binding = zx7Var;
        if (zx7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zx7Var = null;
        }
        setRootView(zx7Var.getRoot());
        return getRootView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initData();
        final zx7 zx7Var = this.binding;
        zx7 zx7Var2 = null;
        if (zx7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zx7Var = null;
        }
        if (this.isRemindHr) {
            zx7Var.B.setRemindText(this.heartRate + getResources().getQuantityString(ayi.common_unit_heart_rate, this.heartRate));
        } else {
            zx7Var.B.setRemindText(getResources().getString(e1j.O));
        }
        zx7Var.E.setSwitch(this.heartRateSwitch);
        if (this.heartRateSwitch) {
            zx7 zx7Var3 = this.binding;
            if (zx7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zx7Var2 = zx7Var3;
            }
            zx7Var2.A.setVisibility(0);
            openRadioSwitch(zx7Var);
        } else {
            zx7 zx7Var4 = this.binding;
            if (zx7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zx7Var2 = zx7Var4;
            }
            zx7Var2.A.setVisibility(8);
        }
        a6l.a(zx7Var.B, new bg4() { // from class: a9f
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MaxHertRateFragment.onViewCreated$lambda$7$lambda$1(this.f800a, zx7Var, obj);
            }
        });
        zx7Var.E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: c9f
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                MaxHertRateFragment.onViewCreated$lambda$7$lambda$3(this.f5081a, zx7Var, z, iSwitchButton);
            }
        });
        for (final SportRadioView sportRadioView : getRadioView()) {
            sportRadioView.setOnClickListener(new View.OnClickListener() { // from class: e9f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MaxHertRateFragment.onViewCreated$lambda$7$lambda$6$lambda$5(this.f16415a, sportRadioView, zx7Var, view2);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        String string;
        super.setArguments(args);
        this.isRemindHr = args != null ? args.getBoolean("isRemindHr") : false;
        int i = args != null ? args.getInt("heartRate") : 0;
        this.heartRate = i;
        globalHeartRate = i;
        this.heartRateSwitch = args != null ? args.getBoolean("heartRateRangeSwitch") : this.heartRateSwitch;
        if (args == null || (string = args.getString("heartRateRange")) == null) {
            string = this.heartRateRange;
        }
        this.heartRateRange = string;
    }
}
