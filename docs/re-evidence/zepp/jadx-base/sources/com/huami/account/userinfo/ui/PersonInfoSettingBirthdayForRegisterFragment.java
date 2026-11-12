package com.huami.account.userinfo.ui;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.userinfo.DateUnselectedHelper;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.bean.Birthday;
import com.huami.account.userinfo.ui.PersonInfoSettingBirthdayForRegisterFragment;
import com.huami.account.userinfo.usecase.DetectDefaultFieldUseCase;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u001c\u0010#\u001a\u00020\u00188B@\u0002X\u0082D¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingBirthdayForRegisterFragment;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", "", "unitStr", "", GoogleApiAvailabilityLight.b, "Landroid/widget/TextView;", "saveButton", "wheelYear", "wheelMonth", "l", "Landroid/widget/LinearLayout;", "parent", "year", "month", "Landroid/view/View;", "separation", "m", "initView", "", "hasPadding", "hasBackground", "", "i", LogUtil.I, "mCurYear", z.j, "mMaxMonth", hl.k, "mYearStart", "mYearEnd", "h", "()I", "typeFace", "<init>", "()V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingBirthdayForRegisterFragment extends PersonInfoSettingBaseFragment {

    @NotNull
    private static final String n = "PersonInfoSettingBirthdayForRegisterFragment";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mCurYear = Calendar.getInstance().get(1);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mMaxMonth = Calendar.getInstance().get(2);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int mYearStart;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int mYearEnd;

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
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DateUnselectedHelper.updateSaveButtonStateBySelected(this.a, this.b, this.c);
        }
    }

    public PersonInfoSettingBirthdayForRegisterFragment() {
        int i = this.mCurYear;
        this.mYearStart = i - 100;
        this.mYearEnd = i + 0;
    }

    private final int h() {
        if (GlobalConfig.get().isBuildMidong()) {
            return 0;
        }
        return this.typeFace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PersonInfoSettingBirthdayForRegisterFragment personInfoSettingBirthdayForRegisterFragment, WheelView wheelView, WheelView wheelView2, View view) {
        String birthday = personInfoSettingBirthdayForRegisterFragment.getMUserInfo().getBirthday();
        Birthday birthday2 = new Birthday();
        birthday2.setYear(wheelView.getCurrentItem() + personInfoSettingBirthdayForRegisterFragment.mYearStart);
        birthday2.setMonth(wheelView2.getCurrentItem() + 1);
        boolean zExecute = DetectDefaultFieldUseCase.execute("birthday");
        if (!birthday2.toStringData().equals(birthday) || zExecute) {
            personInfoSettingBirthdayForRegisterFragment.getMUserInfo().setBirthday(birthday2.toStringData());
            personInfoSettingBirthdayForRegisterFragment.updatePersonInfoParam(q.mapOf(TuplesKt.to("birthday", personInfoSettingBirthdayForRegisterFragment.getMUserInfo().getBirthday())));
        }
        personInfoSettingBirthdayForRegisterFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PersonInfoSettingBirthdayForRegisterFragment personInfoSettingBirthdayForRegisterFragment, View view) {
        personInfoSettingBirthdayForRegisterFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PersonInfoSettingBirthdayForRegisterFragment personInfoSettingBirthdayForRegisterFragment, View view) {
        personInfoSettingBirthdayForRegisterFragment.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01ab  */
    private final void l(final TextView saveButton, final WheelView wheelYear, final WheelView wheelMonth) {
        PickAdapter pickAdapter;
        Birthday birthdayFromStr = Birthday.fromStr(getMUserInfo().getBirthday());
        this.mCurYear = Calendar.getInstance().get(1);
        this.mMaxMonth = Calendar.getInstance().get(2);
        int i = this.mCurYear;
        this.mYearStart = i - 100;
        this.mYearEnd = i - 0;
        FragmentActivity activity = getActivity();
        int i2 = this.mYearStart;
        int i3 = this.mYearEnd;
        Context contextRequireContext = requireContext();
        int i4 = R.color.p4;
        int color = ContextCompat.getColor(contextRequireContext, i4);
        Context contextRequireContext2 = requireContext();
        int i5 = R.color.s2;
        int color2 = ContextCompat.getColor(contextRequireContext2, i5);
        Context contextRequireContext3 = requireContext();
        int i6 = R.color.s3;
        PickAdapter pickAdapter2 = new PickAdapter(activity, i2, i3, wheelYear, color, color2, ContextCompat.getColor(contextRequireContext3, i6), false, 46, 20, 20, 15, 1, h());
        if (!birthdayFromStr.isValid()) {
            pickAdapter2.setContainUnselectedValue(true);
        }
        wheelYear.setVisibleItems(5).setViewAdapter(pickAdapter2);
        n(wheelYear, getString(R.string.user_info_year));
        wheelYear.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
        final PickAdapter pickAdapter3 = new PickAdapter(getActivity(), 1, 12, wheelMonth, ContextCompat.getColor(requireContext(), i4), ContextCompat.getColor(requireContext(), i5), ContextCompat.getColor(requireContext(), i6), true, 46, 20, 20, 15, 1, h());
        PickAdapter pickAdapter4 = new PickAdapter(getActivity(), 1, this.mMaxMonth + 1, wheelMonth, ContextCompat.getColor(requireContext(), i4), ContextCompat.getColor(requireContext(), i5), ContextCompat.getColor(requireContext(), i6), false, 46, 20, 20, 15, 1, h());
        if (birthdayFromStr.isValid()) {
            pickAdapter = pickAdapter4;
        } else {
            pickAdapter3.setContainUnselectedValue(true);
            pickAdapter = pickAdapter4;
            pickAdapter.setContainUnselectedValue(true);
        }
        n(wheelMonth, getString(R.string.user_info_month));
        if (HMLoginManager.isInNonContinental()) {
            if (birthdayFromStr.isValid()) {
                if (this.mCurYear - birthdayFromStr.getYear() == (HMLoginManager.isInUSA() ? 13 : 16)) {
                    wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter);
                    wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
                } else {
                    wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
                    wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
                }
            } else {
                wheelMonth.setVisibleItems(5).setViewAdapter(pickAdapter3);
                wheelMonth.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
            }
        } else if (!birthdayFromStr.isValid() || birthdayFromStr.getYear() - this.mYearStart < 100) {
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
        final PickAdapter pickAdapter5 = pickAdapter;
        wheelYear.addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingBirthdayForRegisterFragment$initWheel$2

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
                public final String invoke() {
                    return Intrinsics.stringPlus("getCurrentItem = ", Integer.valueOf(this.a.getCurrentItem()));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ WheelView a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WheelView wheelView) {
                    super(0);
                    this.a = wheelView;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("onScrollingStarted ", Integer.valueOf(this.a.getCurrentItem()));
                }
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                HMLog.debug("PersonInfoSettingBirthdayForRegisterFragment", new a(wheel));
                if (100 != wheel.getCurrentItem()) {
                    wheelMonth.setViewAdapter(pickAdapter3);
                } else {
                    if (!this.a.isAdded()) {
                        return;
                    }
                    wheelMonth.setCurrentItem(6 > this.a.mMaxMonth ? this.a.mMaxMonth : 6);
                    wheelMonth.setViewAdapter(pickAdapter5);
                }
                DateUnselectedHelper.updateSaveButtonStateBySelected(wheelYear, wheelMonth, saveButton);
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
                HMLog.debug("PersonInfoSettingBirthdayForRegisterFragment", new b(wheel));
            }
        });
    }

    private final void m(LinearLayout parent, WheelView year, WheelView month, View separation) {
        parent.removeAllViews();
        String lowerCase = DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMM").toLowerCase(Locale.ROOT);
        WheelView wheelView = m.startsWith$default(lowerCase, "y", false, 2, null) || m.endsWith$default(lowerCase, "m", false, 2, null) ? year : month;
        parent.addView(wheelView);
        if (Intrinsics.areEqual(wheelView, year)) {
            year = month;
        }
        parent.addView(year);
    }

    private final void n(WheelView wheelView, String unitStr) {
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
        TextView textView = (TextView) viewInflate.findViewById(R.id.birthday_btn_save);
        l(textView, wheelView, wheelView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: pt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingBirthdayForRegisterFragment.i(this.a, wheelView, wheelView2, view);
            }
        });
        viewInflate.findViewById(R.id.birthday_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: ot5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingBirthdayForRegisterFragment.j(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: nt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingBirthdayForRegisterFragment.k(this.a, view);
            }
        });
        m(linearLayout, wheelView, wheelView2, viewFindViewById);
        return viewInflate;
    }
}
