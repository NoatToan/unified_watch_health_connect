package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.account.HrZoneRange;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.sport.view.launch.gym.setting.MaxHertRateFragment;
import com.xiaomi.fitness.sport.view.widget.CustomPickerDialog;
import com.xiaomi.fitness.sport.view.widget.SportRadioView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.a6l;
import defpackage.av6;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.qmn;
import defpackage.sk5;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b3\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J-\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u00101\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/MaxHertRateFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "initData", "()V", "Lqmn;", "openRadioSwitch", "(Lqmn;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport/view/widget/SportRadioView;", "Lkotlin/jvm/internal/EnhancedNullability;", "getRadioView", "()Ljava/util/ArrayList;", "setResult", "", "title", "Lkotlin/Function1;", "confirm", "showDialog", "(ILkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "args", "setArguments", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "binding", "Lqmn;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mlAlertDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "isRemindHr", "Z", "heartRate", "I", "", "heartRateRange", "Ljava/lang/String;", "heartRateRangeType", "heartRateSwitch", "userMaxHertRate", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMaxHertRateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxHertRateFragment.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/MaxHertRateFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1863#2,2:342\n1863#2,2:344\n1863#2,2:346\n*S KotlinDebug\n*F\n+ 1 MaxHertRateFragment.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/MaxHertRateFragment\n*L\n130#1:342,2\n115#1:344,2\n132#1:346,2\n*E\n"})
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
    private qmn binding;
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/MaxHertRateFragment$Companion;", "", "<init>", "()V", "REQUEST_CODE_HERT_RATE", "", "PARAMS_REMIND_HR", "", "PARAMS_REMIND_RATE", "PARAMS_REMIND_RATE_SWITCH", "PARAMS_REMIND_RATE_RANGE", "REQUEST_PARAMS_REMIND_HR", "REQUEST_PARAMS_HERT_RATE", "REQUEST_PARAMS_HERT_RATE_RANGE", "REQUEST_PARAMS_HERT_RATE_RANGE_SWITCH", "maxHRRemindStart", "HERT_RATE_TYPE_WARM_UP", "HERT_RATE_TYPE_WARM_UP_TYPE", "HERT_RATE_TYPE_FAT_BUTNING", "HERT_RATE_TYPE_FAT_BUTNING_TYPE", "HERT_RATE_TYPE_AEROBIC", "HERT_RATE_TYPE_AEROBIC_TYPE", "HERT_RATE_TYPE_ANAEROBIC", "HERT_RATE_TYPE_ANAEROBIC_TYPE", "HERT_RATE_TYPE_LIMIT", "HERT_RATE_TYPE_LIMIT_TYPE", "globalHeartRate", "calculateHertRateRange", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void calculateHertRateRange() {
            HrZone hrZone = new HrZone();
            HrZoneRange hrZoneRange = hrZone.getHrZoneRange(HrZoneLevel.Extreme);
            MaxHertRateFragment.HERT_RATE_TYPE_LIMIT = hrZoneRange.getMinHr() + "," + hrZoneRange.getMaxHr() + ",5";
            HrZoneRange hrZoneRange2 = hrZone.getHrZoneRange(HrZoneLevel.Anaerobic);
            MaxHertRateFragment.HERT_RATE_TYPE_ANAEROBIC = hrZoneRange2.getMinHr() + "," + hrZoneRange2.getMaxHr() + ",4";
            HrZoneRange hrZoneRange3 = hrZone.getHrZoneRange(HrZoneLevel.Aerobic);
            MaxHertRateFragment.HERT_RATE_TYPE_AEROBIC = hrZoneRange3.getMinHr() + "," + hrZoneRange3.getMaxHr() + ",3";
            HrZoneRange hrZoneRange4 = hrZone.getHrZoneRange(HrZoneLevel.FatBurning);
            MaxHertRateFragment.HERT_RATE_TYPE_FAT_BUTNING = hrZoneRange4.getMinHr() + "," + hrZoneRange4.getMaxHr() + ",2";
            HrZoneRange hrZoneRange5 = hrZone.getHrZoneRange(HrZoneLevel.WarmUp);
            MaxHertRateFragment.HERT_RATE_TYPE_WARM_UP = hrZoneRange5.getMinHr() + "," + hrZoneRange5.getMaxHr() + ",1";
        }
    }

    public MaxHertRateFragment() {
        super(dvi.m0);
        this.heartRateRange = HERT_RATE_TYPE_AEROBIC;
        this.heartRateRangeType = 3;
    }

    private final ArrayList<SportRadioView> getRadioView() {
        qmn qmnVar = this.binding;
        if (qmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qmnVar = null;
        }
        return CollectionsKt__CollectionsKt.arrayListOf(qmnVar.H, qmnVar.F, qmnVar.C, qmnVar.D, qmnVar.G);
    }

    private final void initData() {
        setTitle(c1j.F4);
        INSTANCE.calculateHertRateRange();
        if (this.heartRateRange.length() == 0) {
            this.heartRateRange = HERT_RATE_TYPE_AEROBIC;
        }
        this.heartRateRangeType = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) this.heartRateRange, new String[]{","}, false, 0, 6, (Object) null).get(2));
        qmn qmnVar = this.binding;
        if (qmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qmnVar = null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_WARM_UP, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView = qmnVar.H;
        String string = getString(c1j.M1, Integer.valueOf(Integer.parseInt((String) listSplit$default.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default.get(1))));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        sportRadioView.setDetail(string);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_FAT_BUTNING, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView2 = qmnVar.F;
        String string2 = getString(c1j.M1, Integer.valueOf(Integer.parseInt((String) listSplit$default2.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default2.get(1))));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        sportRadioView2.setDetail(string2);
        List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_AEROBIC, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView3 = qmnVar.C;
        String string3 = getString(c1j.M1, Integer.valueOf(Integer.parseInt((String) listSplit$default3.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default3.get(1))));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        sportRadioView3.setDetail(string3);
        List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_ANAEROBIC, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView4 = qmnVar.D;
        String string4 = getString(c1j.M1, Integer.valueOf(Integer.parseInt((String) listSplit$default4.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default4.get(1))));
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        sportRadioView4.setDetail(string4);
        List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) HERT_RATE_TYPE_LIMIT, new String[]{","}, false, 0, 6, (Object) null);
        SportRadioView sportRadioView5 = qmnVar.G;
        String string5 = getString(c1j.M1, Integer.valueOf(Integer.parseInt((String) listSplit$default5.get(0))), Integer.valueOf(Integer.parseInt((String) listSplit$default5.get(1))));
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        sportRadioView5.setDetail(string5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$1(final MaxHertRateFragment this$0, final qmn this_with, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        this$0.showDialog(c1j.P1, new Function1() { // from class: h9f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return MaxHertRateFragment.onViewCreated$lambda$7$lambda$1$lambda$0(this_with, this$0, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$1$lambda$0(qmn this_with, MaxHertRateFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 99) {
            this_with.B.setRemindText(this$0.getResources().getString(c1j.x0));
            this$0.isRemindHr = false;
        } else {
            this_with.B.setRemindText(i + this$0.getResources().getQuantityString(zxi.common_unit_heart_rate, i));
            this$0.isRemindHr = true;
            this$0.heartRate = i;
        }
        this$0.setResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$3(MaxHertRateFragment this$0, qmn this_with, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        qmn qmnVar = null;
        if (z) {
            Iterator<T> it = this$0.getRadioView().iterator();
            while (it.hasNext()) {
                ((SportRadioView) it.next()).getRadioView().setChecked(false);
            }
            qmn qmnVar2 = this$0.binding;
            if (qmnVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qmnVar = qmnVar2;
            }
            qmnVar.A.setVisibility(0);
            if (this$0.heartRateRange.length() > 0) {
                this$0.heartRateRangeType = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) this$0.heartRateRange, new String[]{","}, false, 0, 6, (Object) null).get(2));
            }
            this$0.openRadioSwitch(this_with);
        } else {
            qmn qmnVar3 = this$0.binding;
            if (qmnVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qmnVar = qmnVar3;
            }
            qmnVar.A.setVisibility(8);
        }
        this$0.heartRateSwitch = z;
        this$0.setResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$6$lambda$5(MaxHertRateFragment this$0, SportRadioView radioView, qmn this_with, View view) {
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

    private final void openRadioSwitch(qmn qmnVar) {
        int i = this.heartRateRangeType;
        if (i == 1) {
            qmnVar.H.getRadioView().setChecked(true);
            return;
        }
        if (i == 2) {
            qmnVar.F.getRadioView().setChecked(true);
            return;
        }
        if (i == 3) {
            qmnVar.C.getRadioView().setChecked(true);
        } else if (i == 4) {
            qmnVar.D.getRadioView().setChecked(true);
        } else {
            if (i != 5) {
                return;
            }
            qmnVar.G.getRadioView().setChecked(true);
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
        final CustomPickerDialog customPickerDialogCreate = new CustomPickerDialog.Builder("").setDialogTitle(title).setCanceledOnTouchOutside(true).setPositiveText(c1j.h).setNegativeText(c1j.f).create();
        if (this.isRemindHr) {
            customPickerDialogCreate.setValue(this.heartRate);
        }
        customPickerDialogCreate.setCustomAdapter(new CustomPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.MaxHertRateFragment.showDialog.1
            @Override // com.xiaomi.fitness.sport.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return 122;
            }

            @Override // com.xiaomi.fitness.sport.view.widget.CustomPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                int value = getValue(index);
                if (value != 99) {
                    return String.valueOf(value);
                }
                String string = MaxHertRateFragment.this.getString(c1j.k1);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }

            @Override // com.xiaomi.fitness.sport.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return index + 99;
            }
        });
        customPickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.MaxHertRateFragment.showDialog.2
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
        qmn qmnVar = (qmn) sk5.j(inflater, getLayoutId(), container, false);
        this.binding = qmnVar;
        if (qmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qmnVar = null;
        }
        setRootView(qmnVar.getRoot());
        return getRootView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initData();
        final qmn qmnVar = this.binding;
        qmn qmnVar2 = null;
        if (qmnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qmnVar = null;
        }
        if (this.isRemindHr) {
            qmnVar.B.setRemindText(this.heartRate + getResources().getQuantityString(zxi.common_unit_heart_rate, this.heartRate));
        } else {
            qmnVar.B.setRemindText(getResources().getString(c1j.x0));
        }
        qmnVar.E.setSwitch(this.heartRateSwitch);
        if (this.heartRateSwitch) {
            qmn qmnVar3 = this.binding;
            if (qmnVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qmnVar2 = qmnVar3;
            }
            qmnVar2.A.setVisibility(0);
            openRadioSwitch(qmnVar);
        } else {
            qmn qmnVar4 = this.binding;
            if (qmnVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qmnVar2 = qmnVar4;
            }
            qmnVar2.A.setVisibility(8);
        }
        a6l.a(qmnVar.B, new bg4() { // from class: b9f
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MaxHertRateFragment.onViewCreated$lambda$7$lambda$1(this.f3951a, qmnVar, obj);
            }
        });
        qmnVar.E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: d9f
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                MaxHertRateFragment.onViewCreated$lambda$7$lambda$3(this.f15262a, qmnVar, z, iSwitchButton);
            }
        });
        for (final SportRadioView sportRadioView : getRadioView()) {
            sportRadioView.setOnClickListener(new View.OnClickListener() { // from class: f9f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MaxHertRateFragment.onViewCreated$lambda$7$lambda$6$lambda$5(this.f17555a, sportRadioView, qmnVar, view2);
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
