package com.xiaomi.hm.health.fragment;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bodyfat.activity.AddGuestActivity;
import com.xiaomi.hm.health.bodyfat.event.EventUserInfoUpdate;
import com.xiaomi.hm.health.bodyfat.fragment.IAddMember;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.OnAddGuestChangeListener;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import de.greenrobot.event.EventBus;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PersonInfoSettingBaseFragment extends BaseDialogFragment {
    public static final int CODE_ADD_GEUST = -300;
    public static final int CODE_NEW_ADD = -100;
    public static final int CODE_NEW_ADD_BABY = -200;
    public static final String UID = "uid";
    public OnAddGuestChangeListener mAddGuestListener;
    public OnAddNewUserDataChangeListener mAddNewListener;
    public boolean mIsAddBaby;
    public boolean mIsAddGuest;
    public boolean mIsAddNew;
    public OnDataChangeListener mListener;
    public boolean mSelf;
    public HMUserInfo mUserInfo;

    public interface OnAddNewUserDataChangeListener {
        void onChange(HMUserInfo user);
    }

    public interface OnDataChangeListener {
        void onChange();
    }

    private void c() {
        if (getArguments() == null || !getArguments().containsKey("uid")) {
            this.mSelf = true;
            this.mUserInfo = HMPersonInfo.getInstance().getUserInfo();
            return;
        }
        long j = getArguments().getLong("uid");
        this.mSelf = false;
        if (j == -100 || j == -200) {
            this.mIsAddNew = true;
            if (getActivity() instanceof IAddMember) {
                this.mUserInfo = HMUserInfo.getHMUserInfo(((IAddMember) getActivity()).getAddMemberInfo());
            }
            this.mIsAddBaby = j == -200;
            return;
        }
        if (j != -300) {
            this.mUserInfo = HMUserInfo.getHMUserInfo(UserInfoManager.getManager().getInfo(j));
        } else {
            this.mIsAddGuest = true;
            this.mUserInfo = HMUserInfo.getHMUserInfo(((AddGuestActivity) getActivity()).getNewAddGuestInfo());
        }
    }

    public static void showAddGuest(FragmentActivity activity, Fragment fragment, OnAddGuestChangeListener listener, int codeAddGeust) {
        PersonInfoSettingBaseFragment personInfoSettingBaseFragment = (PersonInfoSettingBaseFragment) fragment;
        Bundle bundle = new Bundle();
        bundle.putLong("uid", codeAddGeust);
        personInfoSettingBaseFragment.setArguments(bundle);
        personInfoSettingBaseFragment.setAddGuestListener(listener);
        personInfoSettingBaseFragment.show(activity.getSupportFragmentManager(), (String) null);
    }

    public static void showAddNewMember(FragmentActivity activity, PersonInfoSettingBaseFragment fragment, final BFCallback.OnNewUserDataChangeListener listener, long uid) {
        Bundle bundle = new Bundle();
        bundle.putLong("uid", uid);
        fragment.setArguments(bundle);
        Objects.requireNonNull(listener);
        fragment.setAddNewListener(new OnAddNewUserDataChangeListener() { // from class: lt5
            @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener
            public final void onChange(HMUserInfo hMUserInfo) {
                listener.onChange(hMUserInfo);
            }
        });
        fragment.show(activity.getSupportFragmentManager(), (String) null);
    }

    public static void showMember(FragmentActivity activity, PersonInfoSettingBaseFragment fragment, final BFCallback.OnPersonInfoDataChangeListener listener, long uid) {
        Bundle bundle = new Bundle();
        bundle.putLong("uid", uid);
        fragment.setArguments(bundle);
        Objects.requireNonNull(listener);
        fragment.setListener(new OnDataChangeListener() { // from class: mt5
            @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment.OnDataChangeListener
            public final void onChange() {
                listener.onChange();
            }
        });
        fragment.show(activity.getSupportFragmentManager(), (String) null);
    }

    public static void showSelf(FragmentActivity activity, PersonInfoSettingBaseFragment fragment, OnDataChangeListener listener) {
        fragment.setListener(listener);
        fragment.show(activity.getSupportFragmentManager(), (String) null);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTint : R.style.DimPanel);
        c();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    public void save(int synced) {
        if (this.mSelf) {
            HMPersonInfo.getInstance().saveInfo(synced);
            return;
        }
        UserInfos userInfos = new UserInfos();
        this.mUserInfo.getUserInfos(userInfos);
        EventBus.getDefault().post(new EventUserInfoUpdate(userInfos));
    }

    public void setAddGuestListener(OnAddGuestChangeListener listener) {
        this.mAddGuestListener = listener;
    }

    public void setAddNewListener(OnAddNewUserDataChangeListener listener) {
        this.mAddNewListener = listener;
    }

    public void setListener(OnDataChangeListener listener) {
        this.mListener = listener;
    }
}
