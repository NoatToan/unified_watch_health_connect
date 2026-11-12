package com.huami.account.userinfo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p008lifecycle.Lifecycle;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.ui.PersonInfoSettingHeightFragment;
import com.huami.account.userinfo.usecase.DetectDefaultFieldUseCase;
import com.huami.account.userinfo.utils.Utils;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.OnWheelChangedListener;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0014R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0018\u00010\u001fR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010$¨\u0006*"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingHeightFragment;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "", "heightValue", "", "w", "l", hl.k, "Lcom/huami/widget/wheelview/WheelView;", "personHeight", GoogleApiAvailabilityLight.b, "personHeightFoot", "m", b.r, "unit", "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "initView", "", "hasPadding", "isWidePadding", "hasBackground", "i", LogUtil.I, "mHeight", z.j, "Z", "isMiDong", "Lcom/huami/account/userinfo/ui/PersonInfoSettingHeightFragment$a;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingHeightFragment$a;", "mHeightWrapper", "Lcom/huami/widget/wheelview/WheelView;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "titleText", "<init>", "()V", "Companion", "a", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingHeightFragment extends PersonInfoSettingBaseFragment {

    @NotNull
    private static final String o = "PersonInfoSettingHeightFragment";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isMiDong = GlobalConfig.get().isBuildMidong();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private a mHeightWrapper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private WheelView personHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private WheelView personHeightFoot;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private TextView titleText;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\rR$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0011\u0010\u0014R\u0013\u0010\u0016\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014R\u0013\u0010\u0017\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0014¨\u0006\u001a"}, d2 = {"com/huami/account/userinfo/ui/PersonInfoSettingHeightFragment$a", "", "Lcom/huami/widget/wheelview/WheelView;", "wheelView", "", "min", "", "e", GoogleApiAvailabilityLight.a, "personHeight", "personHeightFoot", "f", "a", LogUtil.I, "mLastMax", "b", "mLastMin", "c", "mInchMax", "<set-?>", "()I", "inchMin", "currentItem", "currentFeetItem", "<init>", "(Lcom/huami/account/userinfo/ui/PersonInfoSettingHeightFragment;)V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int mLastMax;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int mLastMin;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int mInchMax;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int inchMin;

        public a() {
        }

        public final int a() {
            if (PersonInfoSettingHeightFragment.this.mHeight > 0) {
                return (Utils.INSTANCE.cm2inch(PersonInfoSettingHeightFragment.this.mHeight) / 12) - 1;
            }
            return 4;
        }

        public final int b() {
            if (PersonInfoSettingHeightFragment.this.k() == 0) {
                return PersonInfoSettingHeightFragment.this.mHeight - 30;
            }
            Utils utils = Utils.INSTANCE;
            int iCm2inch = utils.cm2inch(PersonInfoSettingHeightFragment.this.mHeight) % 12;
            if (utils.cm2inch(PersonInfoSettingHeightFragment.this.mHeight) / 12 <= 1) {
                this.inchMin = 0;
            } else {
                this.inchMin = 0;
            }
            HMLog.d(PersonInfoSettingHeightFragment.o, "inches = " + iCm2inch + ", min = " + this.inchMin, new Object[0]);
            return iCm2inch - this.inchMin;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getInchMin() {
            return this.inchMin;
        }

        public final void d(@NotNull WheelView wheelView, int min) {
            if (PersonInfoSettingHeightFragment.this.isAdded()) {
                wheelView.setCenterUnitStr(PersonInfoSettingHeightFragment.this.getResources().getQuantityString(R.plurals.user_info_numberFoot, wheelView.getCurrentItem() + min, ""));
                wheelView.invalidateWheel(false);
            }
        }

        public final void e(@NotNull WheelView wheelView, int min) {
            if (PersonInfoSettingHeightFragment.this.isAdded()) {
                wheelView.setCenterUnitStr(PersonInfoSettingHeightFragment.this.getResources().getQuantityString(R.plurals.user_info_numberInch, wheelView.getCurrentItem() + min, ""));
                wheelView.invalidateWheel(false);
            }
        }

        public final void f(@NotNull WheelView personHeight, @NotNull WheelView personHeightFoot) {
            int currentItem = personHeight.getCurrentItem() + this.inchMin;
            if (personHeightFoot.getCurrentItem() + 1 != 7 && personHeightFoot.getCurrentItem() + 1 == 1) {
                this.inchMin = 0;
                this.mInchMax = 11;
            } else {
                this.inchMin = 0;
                this.mInchMax = 11;
            }
            if (this.mInchMax != this.mLastMax || this.inchMin != this.mLastMin) {
                WheelViewAdapter viewAdapter = personHeight.getViewAdapter();
                Objects.requireNonNull(viewAdapter, "null cannot be cast to non-null type com.huami.widget.wheelview.adapters.PickAdapter");
                ((PickAdapter) viewAdapter).setStartValue(this.inchMin);
                WheelViewAdapter viewAdapter2 = personHeight.getViewAdapter();
                Objects.requireNonNull(viewAdapter2, "null cannot be cast to non-null type com.huami.widget.wheelview.adapters.PickAdapter");
                ((PickAdapter) viewAdapter2).setEndValue(this.mInchMax);
                int i = this.mInchMax;
                if (currentItem > i || currentItem < (i = this.inchMin)) {
                    currentItem = i;
                }
                personHeight.setCurrentItem(currentItem - this.inchMin, true);
                personHeight.invalidateWheel(true);
            }
            this.mLastMax = this.mInchMax;
            this.mLastMin = this.inchMin;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k() {
        return HMPersonInfo.getInstance().getMiliConfig().getUnit();
    }

    private final int l() {
        if (k() != 1) {
            WheelView wheelView = this.personHeight;
            Objects.requireNonNull(wheelView);
            return wheelView.getCurrentItem() + 30;
        }
        WheelView wheelView2 = this.personHeightFoot;
        Objects.requireNonNull(wheelView2);
        int currentItem = wheelView2.getCurrentItem() + 1;
        WheelView wheelView3 = this.personHeight;
        Objects.requireNonNull(wheelView3);
        return c.roundToInt(((double) ((currentItem * 12) + wheelView3.getCurrentItem() + this.mHeightWrapper.getInchMin())) * 2.54d);
    }

    private final void m(final WheelView personHeight, final WheelView personHeightFoot) {
        o(personHeight, 1);
        p(personHeightFoot);
        this.mHeightWrapper.f(personHeight, personHeightFoot);
        this.mHeightWrapper.d(personHeightFoot, 1);
        this.mHeightWrapper.e(personHeight, this.mHeightWrapper.getInchMin());
        personHeight.addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingHeightFragment$initBritishWheel$1
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                this.a.mHeightWrapper.e(personHeight, this.a.mHeightWrapper.getInchMin());
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
        personHeightFoot.addScrollingListener(new OnWheelScrollListener() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingHeightFragment$initBritishWheel$2
            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingFinished(@NotNull WheelView wheel) {
                this.a.mHeightWrapper.f(personHeight, personHeightFoot);
                this.a.mHeightWrapper.d(personHeightFoot, 1);
            }

            @Override // com.huami.widget.wheelview.OnWheelScrollListener
            public void onScrollingStarted(@NotNull WheelView wheel) {
            }
        });
    }

    private final void n(WheelView personHeight) {
        o(personHeight, 0);
    }

    private final void o(WheelView personHeight, int unit) {
        PickAdapter pickAdapter = new PickAdapter(getActivity(), unit == 0 ? 30 : 0, unit == 0 ? 242 : 11, personHeight, getResources().getColor(this.isMiDong ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, this.isMiDong ? 46 : 60, 20, 20, 15, 1, 0);
        String string = getString(unit == 0 ? R.string.user_info_cm : R.string.user_info_unit_inch);
        boolean z = this.isMiDong;
        personHeight.setCenterStyle(string, z ? R.color.p4 : R.color.s15, z ? 13.7f : 20.0f).setViewAdapter(pickAdapter).setCurrentItem(this.mHeightWrapper.b());
        if (this.isMiDong) {
            personHeight.setStyle(WheelView.Style.NORMAL);
        }
        if (unit == 1) {
            personHeight.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        } else {
            personHeight.setCenterDrawable(R.drawable.wheel_view_select_bg);
        }
    }

    private final void p(WheelView personHeightFoot) {
        WheelView wheelView;
        PickAdapter pickAdapter = new PickAdapter(getActivity(), 1, 7, personHeightFoot, getResources().getColor(this.isMiDong ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, 0);
        if (this.isMiDong) {
            wheelView = personHeightFoot;
            wheelView.setStyle(WheelView.Style.NORMAL);
        } else {
            wheelView = personHeightFoot;
        }
        wheelView.setCenterStyle(getString(R.string.user_info_unit_foot), this.isMiDong ? R.color.p4 : R.color.s15, 20.0f).setViewAdapter(pickAdapter).setCurrentItem(this.mHeightWrapper.a());
        wheelView.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, WheelView wheelView, int i, int i2) {
        x(personInfoSettingHeightFragment, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, WheelView wheelView, int i, int i2) {
        x(personInfoSettingHeightFragment, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, WheelView wheelView, int i, int i2) {
        x(personInfoSettingHeightFragment, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, View view) {
        int height = personInfoSettingHeightFragment.getMUserInfo().getHeight();
        personInfoSettingHeightFragment.getMUserInfo().setHeight(personInfoSettingHeightFragment.l());
        boolean zExecute = DetectDefaultFieldUseCase.execute("height");
        if (height != personInfoSettingHeightFragment.getMUserInfo().getHeight() || zExecute) {
            personInfoSettingHeightFragment.updatePersonInfoParam(q.mapOf(TuplesKt.to("height", String.valueOf(personInfoSettingHeightFragment.getMUserInfo().getHeight()))));
        }
        personInfoSettingHeightFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, View view) {
        personInfoSettingHeightFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, View view) {
        personInfoSettingHeightFragment.dismiss();
    }

    private final void w(int heightValue) {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            String strLengthToString = Utils.INSTANCE.lengthToString(requireContext(), k(), heightValue);
            TextView textView = this.titleText;
            Objects.requireNonNull(textView);
            textView.setText(strLengthToString);
        }
    }

    public static /* synthetic */ void x(PersonInfoSettingHeightFragment personInfoSettingHeightFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = personInfoSettingHeightFragment.l();
        }
        personInfoSettingHeightFragment.w(i);
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.user_info_fragment_person_info_setting_height, (ViewGroup) null);
        this.personHeight = (WheelView) viewInflate.findViewById(R.id.info_height_wheel);
        this.personHeightFoot = (WheelView) viewInflate.findViewById(R.id.info_height_foot_wheel);
        this.titleText = (TextView) viewInflate.findViewById(R.id.dialog_title);
        if (k() == 0) {
            WheelView wheelView = this.personHeightFoot;
            Objects.requireNonNull(wheelView);
            wheelView.setVisibility(8);
            WheelView wheelView2 = this.personHeight;
            Objects.requireNonNull(wheelView2);
            n(wheelView2);
            WheelView wheelView3 = this.personHeight;
            Objects.requireNonNull(wheelView3);
            wheelView3.addChangingListener(new OnWheelChangedListener() { // from class: pu5
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView4, int i, int i2) {
                    PersonInfoSettingHeightFragment.q(this.a, wheelView4, i, i2);
                }
            });
        } else {
            WheelView wheelView4 = this.personHeightFoot;
            Objects.requireNonNull(wheelView4);
            wheelView4.setVisibility(0);
            WheelView wheelView5 = this.personHeight;
            Objects.requireNonNull(wheelView5);
            WheelView wheelView6 = this.personHeightFoot;
            Objects.requireNonNull(wheelView6);
            m(wheelView5, wheelView6);
            WheelView wheelView7 = this.personHeight;
            Objects.requireNonNull(wheelView7);
            wheelView7.addChangingListener(new OnWheelChangedListener() { // from class: nu5
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView8, int i, int i2) {
                    PersonInfoSettingHeightFragment.r(this.a, wheelView8, i, i2);
                }
            });
            WheelView wheelView8 = this.personHeightFoot;
            Objects.requireNonNull(wheelView8);
            wheelView8.addChangingListener(new OnWheelChangedListener() { // from class: ou5
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView9, int i, int i2) {
                    PersonInfoSettingHeightFragment.s(this.a, wheelView9, i, i2);
                }
            });
        }
        viewInflate.findViewById(R.id.height_btn_save).setOnClickListener(new View.OnClickListener() { // from class: lu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingHeightFragment.t(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.height_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: ju5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingHeightFragment.u(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: mu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingHeightFragment.v(this.a, view);
            }
        });
        w(l());
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: isWidePadding, reason: from getter */
    public boolean getIsMiDong() {
        return this.isMiDong;
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int height = getMUserInfo().getHeight();
        this.mHeight = height;
        if (height < 0) {
            this.mHeight = 170;
        }
        this.mHeightWrapper = new a();
    }
}
