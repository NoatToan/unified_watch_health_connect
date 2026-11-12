package com.huami.account.userinfo.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.userinfo.DateUnselectedHelper;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.account.userinfo.bean.Birthday;
import com.huami.account.userinfo.ui.PersonInfoSettingBirthdayFragment;
import com.huami.account.userinfo.usecase.DetectDefaultFieldUseCase;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0014J\b\u0010\u001b\u001a\u00020\u0004H\u0014J\b\u0010\u001c\u001a\u00020\u0004H\u0014J\b\u0010\u001d\u001a\u00020\u0004H\u0014R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u001c\u0010+\u001a\u00020!8B@\u0002X\u0082D¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020!8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010*¨\u00060"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingBirthdayFragment;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "", z.j, "", "o", "Landroid/widget/LinearLayout;", "parent", "Lcom/huami/widget/wheelview/WheelView;", "year", "month", "Landroid/view/View;", "separation", b.r, "wheelView", "", "unitStr", DTransferConstants.SEARCH_KEY, "Landroid/widget/TextView;", "saveButton", "wheelYear", "wheelMonth", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initView", "hasPadding", "isWidePadding", "hasBackground", "i", "Z", "isRegister", "", LogUtil.I, "mCurYear", hl.k, "mCurMonth", "l", "mYearStart", "m", "h", "()I", "typeFace", "yearEnd", "<init>", "()V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingBirthdayFragment extends PersonInfoSettingBaseFragment {

    @NotNull
    private static final String n = "PersonInfoSettingBirthdayFragment";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isRegister;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mCurYear;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mCurMonth;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mYearStart;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int typeFace;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ WheelView a;
        public final /* synthetic */ WheelView b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WheelView wheelView, WheelView wheelView2, TextView textView) {
            super(0);
            this.a = wheelView;
            this.b = wheelView2;
            this.c = textView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DateUnselectedHelper.updateSaveButtonStateBySelected(this.a, this.b, this.c);
        }
    }

    private final int h() {
        if (GlobalConfig.get().isBuildMidong()) {
            return 0;
        }
        return this.typeFace;
    }

    private final int i() {
        if (HMLoginManager.isInUSA()) {
            return this.mCurMonth == 1 ? (this.mCurYear - 13) - 1 : this.mCurYear - 13;
        }
        if (HMLoginManager.isInNonContinental()) {
            return this.mCurMonth == 1 ? (this.mCurYear - 16) - 1 : this.mCurYear - 16;
        }
        if (HMLoginManager.isInMainland() && UserinfoExternalsKt.getUserinfoDelegate().hasBoundDisney()) {
            return this.mCurMonth == 1 ? (this.mCurYear - 14) - 1 : this.mCurYear - 14;
        }
        if (o()) {
            return this.mCurYear;
        }
        if (HMLoginManager.isInMainland()) {
            return this.mCurMonth == 1 ? (this.mCurYear - 14) - 1 : this.mCurYear - 14;
        }
        if (!UserinfoExternalsKt.getUserinfoDelegate().hasBoundFalconDisney() || this.isRegister) {
            return this.mCurYear + 0;
        }
        return this.mCurMonth == 1 ? (this.mCurYear - 14) - 1 : this.mCurYear - 14;
    }

    private final void j() {
        Calendar currentTime = HMPersonInfo.getCurrentTime();
        this.mCurYear = currentTime.get(1);
        this.mCurMonth = currentTime.get(2) + 1;
        this.mYearStart = o() ? this.mCurYear - HMLoginManager.getAdultAge() : this.mCurYear - 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PersonInfoSettingBirthdayFragment personInfoSettingBirthdayFragment, WheelView wheelView, WheelView wheelView2, View view) {
        String birthday = personInfoSettingBirthdayFragment.getMUserInfo().getBirthday();
        Birthday birthday2 = new Birthday();
        birthday2.setYear(wheelView.getCurrentItem() + personInfoSettingBirthdayFragment.mYearStart);
        if (personInfoSettingBirthdayFragment.o() && wheelView.getCurrentItem() == 0) {
            birthday2.setMonth(wheelView2.getCurrentItem() + personInfoSettingBirthdayFragment.mCurMonth);
        } else {
            birthday2.setMonth(wheelView2.getCurrentItem() + 1);
        }
        boolean zExecute = DetectDefaultFieldUseCase.execute("birthday");
        if (!birthday2.toStringData().equals(birthday) || zExecute) {
            personInfoSettingBirthdayFragment.getMUserInfo().setBirthday(birthday2.toStringData());
            personInfoSettingBirthdayFragment.updatePersonInfoParam(q.mapOf(TuplesKt.to("birthday", personInfoSettingBirthdayFragment.getMUserInfo().getBirthday())));
        }
        personInfoSettingBirthdayFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PersonInfoSettingBirthdayFragment personInfoSettingBirthdayFragment, View view) {
        personInfoSettingBirthdayFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(PersonInfoSettingBirthdayFragment personInfoSettingBirthdayFragment, View view) {
        personInfoSettingBirthdayFragment.dismiss();
    }

    private final void n(final TextView saveButton, final WheelView wheelYear, final WheelView wheelMonth) {
        final PickAdapter pickAdapter;
        Birthday birthdayFromStr = Birthday.fromStr(getMUserInfo().getBirthday());
        int i = i();
        int i2 = this.mCurMonth;
        final int i3 = i2 == 1 ? 12 : i2 - 1;
        FragmentActivity activity = getActivity();
        int i4 = this.mYearStart;
        Context contextRequireContext = requireContext();
        int i5 = R.color.p4;
        int color = ContextCompat.getColor(contextRequireContext, i5);
        Context contextRequireContext2 = requireContext();
        int i6 = R.color.s2;
        int color2 = ContextCompat.getColor(contextRequireContext2, i6);
        Context contextRequireContext3 = requireContext();
        int i7 = R.color.s3;
        PickAdapter pickAdapter2 = new PickAdapter(activity, i4, i, wheelYear, color, color2, ContextCompat.getColor(contextRequireContext3, i7), false, 46, 20, 20, 15, 1, h());
        if (!birthdayFromStr.isValid()) {
            pickAdapter2.setContainUnselectedValue(true);
        }
        wheelYear.setVisibleItems(5).setViewAdapter(pickAdapter2);
        q(wheelYear, getString(R.string.user_info_year));
        wheelYear.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        final PickAdapter pickAdapter3 = new PickAdapter(getActivity(), 1, 12, wheelMonth, ContextCompat.getColor(requireContext(), i5), ContextCompat.getColor(requireContext(), i6), ContextCompat.getColor(requireContext(), i7), true, 46, 20, 20, 15, 1, h());
        PickAdapter pickAdapter4 = new PickAdapter(getActivity(), 1, i3, wheelMonth, ContextCompat.getColor(requireContext(), i5), ContextCompat.getColor(requireContext(), i6), ContextCompat.getColor(requireContext(), i7), false, 46, 20, 20, 15, 1, h());
        final PickAdapter pickAdapter5 = new PickAdapter(getActivity(), this.mCurMonth, 12, wheelMonth, ContextCompat.getColor(requireContext(), i5), ContextCompat.getColor(requireContext(), i6), ContextCompat.getColor(requireContext(), i7), false, 46, 20, 20, 15, 1, h());
        if (birthdayFromStr.isValid()) {
            pickAdapter = pickAdapter4;
        } else {
            pickAdapter3.setContainUnselectedValue(true);
            pickAdapter = pickAdapter4;
            pickAdapter.setContainUnselectedValue(true);
        }
        int adultAge = HMLoginManager.getAdultAge();
        q(wheelMonth, getString(R.string.user_info_month));
        if (!birthdayFromStr.isValid() || birthdayFromStr.getYear() - this.mYearStart < 100 - adultAge) {
            wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
            wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        } else {
            wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter);
            wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        }
        if (birthdayFromStr.isValid()) {
            wheelYear.setCurrentItem(birthdayFromStr.getYear() - this.mYearStart);
            wheelMonth.setCurrentItemLooped(birthdayFromStr.getMonth() - 1);
        } else {
            wheelYear.setCurrentItem(wheelYear.getViewAdapter().getMBaseBundle() - 1);
            wheelMonth.setCurrentItemLooped(wheelMonth.getViewAdapter().getMBaseBundle() - 1);
            DateUnselectedHelper.updateSaveButtonState(saveButton, false);
            DateUnselectedHelper.observeMonthPicker(wheelMonth, new a(wheelYear, wheelMonth, saveButton));
        }
        wheelYear.addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingBirthdayFragment$initWheel$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ WheelView a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WheelView wheelView) {
                    super(0);
                    this.a = wheelView;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("onScrollingStarted ", Integer.valueOf(this.a.getCurrentItem()));
                }
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                if (wheelYear.getViewAdapter().getItemsCount() - 1 == wheel.getCurrentItem()) {
                    if (!this.isAdded()) {
                        return;
                    }
                    WheelView wheelView = wheelMonth;
                    int i8 = i3;
                    wheelView.setCurrentItem(7 > i8 ? i8 - 1 : 6);
                    wheelMonth.setViewAdapter(pickAdapter);
                } else if (wheel.getCurrentItem() == 0 && this.o()) {
                    wheelMonth.setCurrentItem(0);
                    wheelMonth.setViewAdapter(pickAdapter5);
                } else {
                    wheelMonth.setViewAdapter(pickAdapter3);
                }
                DateUnselectedHelper.updateSaveButtonStateBySelected(wheelYear, wheelMonth, saveButton);
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
                HMLog.debug("PersonInfoSettingBirthdayFragment", new a(wheel));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return !HMLoginManager.isAdultGlobal() && HMPersonInfo.getInstance().getUserInfo().getDefaultFields().contains("birthday");
    }

    private final void p(LinearLayout parent, WheelView year, WheelView month, View separation) {
        parent.removeAllViews();
        String lowerCase = DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMM").toLowerCase(Locale.getDefault());
        WheelView wheelView = m.startsWith$default(lowerCase, "y", false, 2, null) || m.endsWith$default(lowerCase, "m", false, 2, null) ? year : month;
        parent.addView(wheelView);
        parent.addView(separation);
        if (wheelView == year) {
            year = month;
        }
        parent.addView(year);
    }

    private final void q(WheelView wheelView, String unitStr) {
        if (!GlobalConfig.get().isBuildMidong()) {
            wheelView.setCenterStyle(unitStr, R.color.p4, 25.0f);
        } else {
            wheelView.setCenterStyle(unitStr, R.color.s1, 15, 46.0f, -5.0f).setTextBold(true);
            wheelView.setStyle(WheelView.Style.NORMAL);
        }
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.user_info_fragment_person_info_setting_birthday, null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.wheels);
        final WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.setting_birth_wheel_year);
        final WheelView wheelView2 = (WheelView) viewInflate.findViewById(R.id.setting_birth_wheel_month);
        View viewFindViewById = viewInflate.findViewById(R.id.separation);
        int i = R.id.birthday_btn_save;
        n((TextView) viewInflate.findViewById(i), wheelView, wheelView2);
        viewInflate.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: wt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingBirthdayFragment.k(this.a, wheelView, wheelView2, view);
            }
        });
        viewInflate.findViewById(R.id.birthday_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: ut5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingBirthdayFragment.l(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: vt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingBirthdayFragment.m(this.a, view);
            }
        });
        p(linearLayout, wheelView, wheelView2, viewFindViewById);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: isWidePadding */
    public boolean getIsMiDong() {
        return true;
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j();
    }
}
