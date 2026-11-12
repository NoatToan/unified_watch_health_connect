package com.xiaomi.hm.health.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.model.BFUserInfo;
import com.xiaomi.hm.health.eventbus.EventUserGenderChanged;
import com.xiaomi.hm.health.privacy.usecase.DetectDefaultFieldUseCase;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes21.dex */
public class PersonInfoSettingGenderFragment extends PersonInfoSettingBaseFragment {
    private static final String f = "PersonInfoSettingGenderFragment";
    private boolean e = GlobalConfig.get().isBuildMidong();

    private void h(View view) {
        int gender = this.mUserInfo.getGender();
        View viewFindViewById = view.findViewById(R.id.info_gender_male);
        View viewFindViewById2 = view.findViewById(R.id.info_gender_female);
        TextView textView = (TextView) view.findViewById(R.id.info_gender_female_txt);
        TextView textView2 = (TextView) view.findViewById(R.id.info_gender_male_txt);
        int i = R.color.s1;
        if (gender == 1) {
            viewFindViewById.setVisibility(0);
            viewFindViewById2.setVisibility(4);
            Resources resources = getResources();
            if (!this.e) {
                i = R.color.s15;
            }
            textView2.setTextColor(resources.getColor(i));
            return;
        }
        if (gender != 0) {
            viewFindViewById.setVisibility(4);
            viewFindViewById2.setVisibility(4);
            return;
        }
        viewFindViewById.setVisibility(4);
        viewFindViewById2.setVisibility(0);
        Resources resources2 = getResources();
        if (!this.e) {
            i = R.color.s15;
        }
        textView.setTextColor(resources2.getColor(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        m(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        m(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        dismiss();
    }

    private void m(int select) {
        PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener onAddNewUserDataChangeListener;
        boolean zExecute = DetectDefaultFieldUseCase.execute("gender");
        if (this.mUserInfo.getGender() != select || zExecute) {
            this.mUserInfo.setGender(select);
            if (this.mIsAddNew && (onAddNewUserDataChangeListener = this.mAddNewListener) != null) {
                onAddNewUserDataChangeListener.onChange(this.mUserInfo);
                dismiss();
                return;
            }
            if (this.mIsAddGuest && this.mAddGuestListener != null) {
                BFUserInfo bFUserInfo = new BFUserInfo();
                bFUserInfo.setGender(select);
                this.mAddGuestListener.onChange(bFUserInfo);
                dismiss();
                return;
            }
            save(2);
            PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener = this.mListener;
            if (onDataChangeListener != null) {
                onDataChangeListener.onChange();
            }
            EventBus.getDefault().post(new EventUserGenderChanged(select));
        }
        dismiss();
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_person_info_setting_gender, (ViewGroup) null);
        h(viewInflate);
        viewInflate.findViewById(R.id.person_info_female_area).setOnClickListener(new View.OnClickListener() { // from class: iu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        viewInflate.findViewById(R.id.person_info_male_area).setOnClickListener(new View.OnClickListener() { // from class: hu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: fu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        viewInflate.findViewById(R.id.setting_gender_cancel).setOnClickListener(new View.OnClickListener() { // from class: gu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean isWidePadding() {
        return this.e;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
