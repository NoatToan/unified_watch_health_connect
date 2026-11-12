package com.xiaomi.hm.health.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Lifecycle;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.wheelview.OnWheelChangedListener;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.model.BFUserInfo;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.privacy.usecase.DetectDefaultFieldUseCase;
import com.xiaomi.hm.health.utils.Utils;

/* JADX INFO: loaded from: classes21.dex */
public class PersonInfoSettingHeightFragment extends PersonInfoSettingBaseFragment {
    private static final String l = "PersonInfoSettingHeightFragment";
    private int e;
    private int f;
    private boolean g = GlobalConfig.get().isBuildMidong();
    private d h;
    private WheelView i;
    private WheelView j;
    private TextView k;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener onAddNewUserDataChangeListener;
            int height = PersonInfoSettingHeightFragment.this.mUserInfo.getHeight();
            PersonInfoSettingHeightFragment personInfoSettingHeightFragment = PersonInfoSettingHeightFragment.this;
            personInfoSettingHeightFragment.mUserInfo.setHeight(personInfoSettingHeightFragment.m());
            boolean zExecute = DetectDefaultFieldUseCase.execute("height");
            if (height != PersonInfoSettingHeightFragment.this.mUserInfo.getHeight() || zExecute) {
                PersonInfoSettingHeightFragment personInfoSettingHeightFragment2 = PersonInfoSettingHeightFragment.this;
                if (personInfoSettingHeightFragment2.mIsAddNew && (onAddNewUserDataChangeListener = personInfoSettingHeightFragment2.mAddNewListener) != null) {
                    onAddNewUserDataChangeListener.onChange(personInfoSettingHeightFragment2.mUserInfo);
                } else if (!personInfoSettingHeightFragment2.mIsAddGuest || personInfoSettingHeightFragment2.mAddGuestListener == null) {
                    personInfoSettingHeightFragment2.save(2);
                    PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener = PersonInfoSettingHeightFragment.this.mListener;
                    if (onDataChangeListener != null) {
                        onDataChangeListener.onChange();
                    }
                } else {
                    BFUserInfo bFUserInfo = new BFUserInfo();
                    bFUserInfo.setHeight(PersonInfoSettingHeightFragment.this.mUserInfo.getHeight());
                    PersonInfoSettingHeightFragment.this.mAddGuestListener.onChange(bFUserInfo);
                }
            }
            PersonInfoSettingHeightFragment.this.dismiss();
        }
    }

    public class b implements OnWheelScrollListener {
        public final /* synthetic */ WheelView a;

        public b(final WheelView val$personHeight) {
            this.a = val$personHeight;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            PersonInfoSettingHeightFragment.this.h.e(this.a, PersonInfoSettingHeightFragment.this.h.c());
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    public class c implements OnWheelScrollListener {
        public final /* synthetic */ WheelView a;
        public final /* synthetic */ WheelView b;

        public c(final WheelView val$personHeight, final WheelView val$personHeightFoot) {
            this.a = val$personHeight;
            this.b = val$personHeightFoot;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            PersonInfoSettingHeightFragment.this.h.f(this.a, this.b);
            PersonInfoSettingHeightFragment.this.h.d(this.b, 1);
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    public class d {
        private int a;
        private int b;
        private int c = 0;
        private int d = 0;

        public d() {
        }

        public int a() {
            if (PersonInfoSettingHeightFragment.this.f > 0) {
                return (Utils.cm2inch(PersonInfoSettingHeightFragment.this.f) / 12) - 1;
            }
            return 4;
        }

        public int b() {
            if (PersonInfoSettingHeightFragment.this.e == 0) {
                return PersonInfoSettingHeightFragment.this.f - 30;
            }
            int iCm2inch = Utils.cm2inch(PersonInfoSettingHeightFragment.this.f) % 12;
            if (Utils.cm2inch(PersonInfoSettingHeightFragment.this.f) / 12 <= 1) {
                this.d = 0;
            } else {
                this.d = 0;
            }
            HMLog.d(PersonInfoSettingHeightFragment.l, "inches = " + iCm2inch + ", min = " + this.d, new Object[0]);
            return iCm2inch - this.d;
        }

        public int c() {
            return this.d;
        }

        public void d(WheelView wheelView, int min) {
            if (PersonInfoSettingHeightFragment.this.isAdded()) {
                wheelView.setCenterUnitStr(PersonInfoSettingHeightFragment.this.getResources().getQuantityString(R.plurals.numberFoot, wheelView.getCurrentItem() + min, ""));
                wheelView.invalidateWheel(false);
            }
        }

        public void e(WheelView wheelView, int min) {
            if (PersonInfoSettingHeightFragment.this.isAdded()) {
                wheelView.setCenterUnitStr(PersonInfoSettingHeightFragment.this.getResources().getQuantityString(R.plurals.numberInch, wheelView.getCurrentItem() + min, ""));
                wheelView.invalidateWheel(false);
            }
        }

        public void f(WheelView personHeight, WheelView personHeightFoot) {
            int currentItem = personHeight.getCurrentItem() + this.d;
            if (personHeightFoot.getCurrentItem() + 1 != 7 && personHeightFoot.getCurrentItem() + 1 == 1) {
                this.d = 0;
                this.c = 11;
            } else {
                this.d = 0;
                this.c = 11;
            }
            if (this.c != this.a || this.d != this.b) {
                ((PickAdapter) personHeight.getViewAdapter()).setStartValue(this.d);
                ((PickAdapter) personHeight.getViewAdapter()).setEndValue(this.c);
                int i = this.c;
                if (currentItem > i || currentItem < (i = this.d)) {
                    currentItem = i;
                }
                personHeight.setCurrentItem(currentItem - this.d, true);
                personHeight.invalidateWheel(true);
            }
            this.a = this.c;
            this.b = this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m() {
        if (this.e != 1) {
            return this.i.getCurrentItem() + 30;
        }
        return (int) Math.round(((double) (((this.j.getCurrentItem() + 1) * 12) + this.i.getCurrentItem() + this.h.c())) * 2.54d);
    }

    private void n(final WheelView personHeight, final WheelView personHeightFoot) {
        p(personHeight, 1);
        q(personHeightFoot);
        this.h.f(personHeight, personHeightFoot);
        this.h.d(personHeightFoot, 1);
        d dVar = this.h;
        dVar.e(personHeight, dVar.c());
        personHeight.addScrollingListener(new b(personHeight));
        personHeightFoot.addScrollingListener(new c(personHeight, personHeightFoot));
    }

    private void o(WheelView personHeight) {
        p(personHeight, 0);
    }

    private void p(WheelView personHeight, int unit) {
        PickAdapter pickAdapter = new PickAdapter(getActivity(), unit == 0 ? 30 : 0, unit == 0 ? 242 : 11, personHeight, getResources().getColor(this.g ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, this.g ? 46 : 60, 20, 20, 15, 1, 0);
        String string = getString(unit == 0 ? R.string.cm : R.string.unit_inch);
        boolean z = this.g;
        personHeight.setCenterStyle(string, z ? R.color.p4 : R.color.s15, z ? 13.7f : 20.0f).setViewAdapter(pickAdapter).setCurrentItem(this.h.b());
        if (this.g) {
            personHeight.setStyle(WheelView.Style.NORMAL);
        }
        if (unit == 1) {
            personHeight.setCenterDrawable(R.drawable.wheel_view_select_bg_end);
        } else {
            personHeight.setCenterDrawable(R.drawable.wheel_view_select_bg);
        }
    }

    private void q(WheelView personHeightFoot) {
        WheelView wheelView;
        PickAdapter pickAdapter = new PickAdapter(getActivity(), 1, 7, personHeightFoot, getResources().getColor(this.g ? R.color.p4 : R.color.s15), getResources().getColor(R.color.s2), getResources().getColor(R.color.s3), false, 46, 20, 20, 15, 1, 0);
        if (this.g) {
            wheelView = personHeightFoot;
            wheelView.setStyle(WheelView.Style.NORMAL);
        } else {
            wheelView = personHeightFoot;
        }
        wheelView.setCenterStyle(getString(R.string.unit_foot), this.g ? R.color.p4 : R.color.s15, 20.0f).setViewAdapter(pickAdapter).setCurrentItem(this.h.a());
        wheelView.setCenterDrawable(R.drawable.wheel_view_select_bg_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(WheelView wheelView, int i, int i2) {
        w(m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(WheelView wheelView, int i, int i2) {
        w(m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(WheelView wheelView, int i, int i2) {
        w(m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        dismiss();
    }

    private void w(int heightValue) {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            this.k.setText(com.huami.account.userinfo.utils.Utils.INSTANCE.lengthToString(requireContext(), this.e, heightValue));
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_person_info_setting_height, (ViewGroup) null);
        this.i = (WheelView) viewInflate.findViewById(R.id.info_height_wheel);
        this.j = (WheelView) viewInflate.findViewById(R.id.info_height_foot_wheel);
        this.k = (TextView) viewInflate.findViewById(R.id.dialog_title);
        if (this.e == 0) {
            this.j.setVisibility(8);
            o(this.i);
            this.i.addChangingListener(new OnWheelChangedListener() { // from class: tu5
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView, int i, int i2) {
                    this.a.r(wheelView, i, i2);
                }
            });
        } else {
            this.j.setVisibility(0);
            n(this.i, this.j);
            this.i.addChangingListener(new OnWheelChangedListener() { // from class: su5
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView, int i, int i2) {
                    this.a.s(wheelView, i, i2);
                }
            });
            this.j.addChangingListener(new OnWheelChangedListener() { // from class: ku5
                @Override // com.huami.widget.wheelview.OnWheelChangedListener
                public final void onChanged(WheelView wheelView, int i, int i2) {
                    this.a.t(wheelView, i, i2);
                }
            });
        }
        viewInflate.findViewById(R.id.height_btn_save).setOnClickListener(new a());
        viewInflate.findViewById(R.id.height_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: ru5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: qu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.v(view);
            }
        });
        w(m());
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: isWidePadding */
    public boolean getIsMiDong() {
        return this.g;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.e = HMPersonInfo.getInstance().getMiliConfig().getUnit();
        this.f = this.mUserInfo.getHeight();
        int i = this.e;
        if (i != 0 && i != 1) {
            this.e = Language.isUSA() ? 1 : 0;
            HMPersonInfo.getInstance().getMiliConfig().setUnit(this.e);
        }
        if (this.f < 0) {
            this.f = this.mIsAddBaby ? 60 : 170;
        }
        this.h = new d();
    }
}
