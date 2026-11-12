package com.huami.account.userinfo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.event.EventUserGenderChanged;
import com.huami.account.userinfo.ui.PersonInfoSettingGenderFragment;
import com.huami.account.userinfo.usecase.DetectDefaultFieldUseCase;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014R\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingGenderFragment;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "i", "", "select", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initView", "", "hasPadding", "isWidePadding", "hasBackground", "Z", "isMiDong", "<init>", "()V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingGenderFragment extends PersonInfoSettingBaseFragment {

    @NotNull
    private static final String j = "PersonInfoSettingGenderFragment";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isMiDong = GlobalConfig.get().isBuildMidong();

    private final void i(View view) {
        int gender = getMUserInfo().getGender();
        View viewFindViewById = view.findViewById(R.id.info_gender_male);
        View viewFindViewById2 = view.findViewById(R.id.info_gender_female);
        TextView textView = (TextView) view.findViewById(R.id.info_gender_female_txt);
        TextView textView2 = (TextView) view.findViewById(R.id.info_gender_male_txt);
        if (gender == 0) {
            viewFindViewById.setVisibility(4);
            viewFindViewById2.setVisibility(0);
            textView.setTextColor(getResources().getColor(this.isMiDong ? R.color.s1 : R.color.s15));
        } else if (gender != 1) {
            viewFindViewById.setVisibility(4);
            viewFindViewById2.setVisibility(4);
        } else {
            viewFindViewById.setVisibility(0);
            viewFindViewById2.setVisibility(4);
            textView2.setTextColor(getResources().getColor(this.isMiDong ? R.color.s1 : R.color.s15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PersonInfoSettingGenderFragment personInfoSettingGenderFragment, View view) {
        personInfoSettingGenderFragment.n(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PersonInfoSettingGenderFragment personInfoSettingGenderFragment, View view) {
        personInfoSettingGenderFragment.n(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PersonInfoSettingGenderFragment personInfoSettingGenderFragment, View view) {
        personInfoSettingGenderFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(PersonInfoSettingGenderFragment personInfoSettingGenderFragment, View view) {
        personInfoSettingGenderFragment.dismiss();
    }

    private final void n(int select) {
        boolean zExecute = DetectDefaultFieldUseCase.execute("gender");
        if (getMUserInfo().getGender() != select || zExecute) {
            getMUserInfo().setGender(select);
            EventBus.getDefault().post(new EventUserGenderChanged(select));
            updatePersonInfoParam(q.mapOf(TuplesKt.to("gender", String.valueOf(select))));
        }
        dismiss();
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.user_info_fragment_person_info_setting_gender, (ViewGroup) null);
        i(viewInflate);
        viewInflate.findViewById(R.id.person_info_female_area).setOnClickListener(new View.OnClickListener() { // from class: eu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingGenderFragment.j(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.person_info_male_area).setOnClickListener(new View.OnClickListener() { // from class: du5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingGenderFragment.k(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: bu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingGenderFragment.l(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.setting_gender_cancel).setOnClickListener(new View.OnClickListener() { // from class: cu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingGenderFragment.m(this.a, view);
            }
        });
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
    }
}
