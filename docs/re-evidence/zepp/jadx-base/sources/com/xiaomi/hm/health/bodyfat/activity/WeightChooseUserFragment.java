package com.xiaomi.hm.health.bodyfat.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import com.huami.lib.view.ViewUtils;
import com.huami.nfc.base.PayResponse;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.event.EventCancelChooseUser;
import com.xiaomi.hm.health.bodyfat.event.EventOneFootChanged;
import com.xiaomi.hm.health.bodyfat.event.EventSelectedUser;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.WeightConstant;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes19.dex */
public class WeightChooseUserFragment extends DialogFragment {
    private static final String m = "WeightChooseUserFragment";

    @Dimension(unit = 0)
    private static final float n = 55.0f;
    private static final int o = 250;
    private WeightAdvData a;
    private Context c;
    private LinearLayout d;
    private LinearLayout e;
    private RelativeLayout f;
    private float i;
    private Animator j;
    private Animator k;
    private OnDialogDismissListener l;
    private List<UserInfos> b = new ArrayList();
    private boolean g = false;
    private boolean h = false;

    public interface OnDialogDismissListener {
        void onDismiss();
    }

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HMLog.i(WeightChooseUserFragment.m, "anim end and dismiss", new Object[0]);
            if (WeightChooseUserFragment.this.l != null) {
                WeightChooseUserFragment.this.l.onDismiss();
            }
            WeightChooseUserFragment.this.dismissAllowingStateLoss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class b implements Comparator {
        public float a;

        public b(float f) {
            this.a = f;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return Float.compare(Math.abs(((UserInfos) obj).getWeight().floatValue() - this.a), Math.abs(((UserInfos) obj2).getWeight().floatValue() - this.a));
        }
    }

    public class c extends BaseAdapter {
        private List<Integer> a;

        public class a {
            public TextView a;
            public ImageView b;

            public a() {
            }
        }

        public c(List<Integer> list) {
            this.a = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return WeightChooseUserFragment.this.b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return WeightChooseUserFragment.this.b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = View.inflate(WeightChooseUserFragment.this.c, R.layout.userlist_item, null);
                aVar = new a();
                aVar.a = (TextView) view.findViewById(R.id.user_list_item_name);
                aVar.b = (ImageView) view.findViewById(R.id.user_icon);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            UserInfos userInfos = (UserInfos) WeightChooseUserFragment.this.b.get(i);
            if (i < WeightChooseUserFragment.this.b.size() - 1) {
                String name = userInfos.getName();
                aVar.a.setText(TextUtils.ellipsize(name, aVar.a.getPaint(), WeightChooseUserFragment.this.i, TextUtils.TruncateAt.END));
                aVar.b.setTag(userInfos.getUserId());
                BFCallback.getInstance().updateAvatarUI(aVar.b, userInfos.getAvatarPath(), userInfos.getAvatarUrl(), name, this.a.get(i));
            } else {
                aVar.a.setText(userInfos.getName());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (ViewUtils.getDensityValue(WeightChooseUserFragment.this.c) * WeightChooseUserFragment.n), (int) (ViewUtils.getDensityValue(WeightChooseUserFragment.this.c) * WeightChooseUserFragment.n));
                layoutParams.addRule(1);
                layoutParams.topMargin = (int) (ViewUtils.getDensityValue(WeightChooseUserFragment.this.c) * 42.0f);
                aVar.b.setLayoutParams(layoutParams);
                aVar.b.setImageResource(R.drawable.btn_add_new_user);
            }
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(int i, ValueAnimator valueAnimator) {
        this.e.setY(i - ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(int i, ValueAnimator valueAnimator) {
        this.e.setY(i - ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        HMLog.d(m, "onEmptyClick", new Object[0]);
        clickGiveUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        clickGiveUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(boolean z) {
        if (z) {
            getActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(UserInfos userInfos, long j, boolean z) {
        if (z) {
            w(userInfos, j);
        } else {
            BFCallback.getAppUtils().showDeleteAllMemberDataRequestDialog((AppCompatActivity) getActivity(), new WeightGrantRequestDialogLis() { // from class: lr8
                @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                public final void requestResult(boolean z2) {
                    this.a.t(z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(AdapterView adapterView, View view, int i, long j) {
        HMLog.i(m, "onItemClick " + i + " count " + adapterView.getAdapter().getCount(), new Object[0]);
        if (i >= adapterView.getAdapter().getCount() - 1) {
            if (!NetUtil.isNetworkConnected(this.c)) {
                CustomToast.makeText(this.c, getString(R.string.please_connect_internet), 0).show();
            } else if (BFCallback.getInstance().enableMiDongFlavor() && UserInfoManager.getManager().getAllInfosCount() >= 12) {
                CustomToast.makeText(this.c, getString(R.string.over_the_max_famliy_count), 0).show();
                EventBus.getDefault().post(new EventCancelChooseUser());
            } else if (BFCallback.getInstance().enableMiDongFlavor() || UserInfoManager.getManager().getAllInfosCount() < 17) {
                animMenuOut();
                Intent intent = new Intent(requireActivity(), (Class<?>) WeightMemberDetailActivity.class);
                intent.putExtra(BFConstant.KET_ADD_NEW, true);
                intent.putExtra(BFConstant.KET_ADD_NEW_WEIGHT_HAVED, !this.h);
                intent.putExtra(WeightAdvData.WEIGHTADVDATA_KEY, this.a.toJsonString());
                intent.putExtra(BFConstant.KET_ADD_NEW_BABY, this.g);
                intent.putExtra(BFConstant.KET_ADD_NEW_FROM_ONE_FOOT, this.h);
                startActivity(intent);
            } else {
                CustomToast.makeText(this.c, getString(R.string.over_the_max_user_count), 0).show();
                EventBus.getDefault().post(new EventCancelChooseUser());
            }
            animMenuOut();
            return;
        }
        final long j2 = Long.parseLong(((UserInfos) adapterView.getAdapter().getItem(i)).getUserId());
        HMLog.d(m, "choose uid = " + j2, new Object[0]);
        final UserInfos info = UserInfoManager.getManager().getInfo(j2);
        HMLog.d(m, "choose userInfo = " + info, new Object[0]);
        if (!BFCallback.getHMLoginManager().isAdult(BodyParamsUtils.getWeightAge(this.a.getTimestamp(), info.getBirthday())) && (BFCallback.getHMLoginManager().isInEU() || BFCallback.getHMLoginManager().isInUSA())) {
            if (!info.getUserId().equals(BFCallback.getHMLoginManager().getValidUid() + "")) {
                if (BFCallback.getHMLoginManager().isAdult()) {
                    BFCallback.getAppUtils().showGrantWeightDataRequestDialog((AppCompatActivity) getActivity(), info.getUserId(), new WeightGrantRequestDialogLis() { // from class: mr8
                        @Override // com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis
                        public final void requestResult(boolean z) {
                            this.a.u(info, j2, z);
                        }
                    });
                    return;
                } else {
                    w(info, j2);
                    return;
                }
            }
        }
        w(info, j2);
    }

    private void w(UserInfos userInfos, long j) {
        HMLog.i(m, "handle user picked ", new Object[0]);
        WeightInfoManager manager = WeightInfoManager.getManager();
        if (this.h) {
            WeightInfos weightInfos = new WeightInfos();
            weightInfos.setDevice_id(BFCallback.getHMDeviceManager().getBoundDeviceId(HMDeviceType.WEIGHT));
            weightInfos.setSync(0);
            weightInfos.setTimestamp(Long.valueOf(this.a.getTimestamp()));
            weightInfos.setWeight(Float.valueOf(this.a.getValueKg()));
            weightInfos.setType(3);
            weightInfos.setUserId(Long.valueOf(userInfos.getUserId()));
            weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
            weightInfos.setHeight(userInfos.getHeight());
            weightInfos.setOfmt(Float.valueOf(this.a.getValue()));
            manager.addInfo(weightInfos);
            animMenuOut();
            EventBus.getDefault().post(new EventOneFootChanged());
            OneFootDetailActivity.startMe(getActivity(), userInfos.getUserId());
            return;
        }
        WeightInfos fromWeightData = HMWeightUtils.parseFromWeightData(this.a, Long.parseLong(userInfos.getUserId()), this.g ? 2 : 0);
        HMLog.d(m, "before weightinfo = " + HMWeightUtils.toString(fromWeightData), new Object[0]);
        if (!this.g && BFCallback.getHMDeviceManager().hasBoundBfs() && this.a.isImpedanceStable()) {
            fromWeightData = BodyParamsUtils.addBodyParams(fromWeightData, this.a, j);
        } else {
            int iIntValue = userInfos.getHeight().intValue();
            fromWeightData.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(iIntValue, fromWeightData.getWeight().floatValue())));
            fromWeightData.setHeight(Integer.valueOf(iIntValue));
        }
        boolean zIsWeightMergeResult = BFCallback.getHMPersonInfo().isWeightMergeResult();
        WeightInfos latestInfo = manager.getLatestInfo(Long.parseLong(userInfos.getUserId()));
        if (fromWeightData.getUserId().longValue() != 0 && zIsWeightMergeResult && latestInfo != null && latestInfo.getSource() != null && fromWeightData.getTimestamp().longValue() - latestInfo.getTimestamp().longValue() <= 30000 && latestInfo.getSource().equals(fromWeightData.getSource())) {
            HMLog.d(m, "<<merge>> realtime weighting:<" + latestInfo + "><" + fromWeightData + SearchCriteria.GT, new Object[0]);
            manager.deleteInfo(latestInfo);
        }
        if ("alpha".equals(BFCallback.getInstance().getChannel()) || BFCallback.getInstance().isInner()) {
            HMLog.i(m, "add weight :" + HMWeightUtils.toString(fromWeightData), new Object[0]);
        }
        manager.addInfo(fromWeightData);
        if (userInfos.getUserId().equals(BFCallback.getHMPersonInfo().getUserid()) && BFCallback.getInstance().isLoginValid(getActivity())) {
            fromWeightData.setSync_qqhealth(0);
        }
        EventBus.getDefault().post(new EventWeightChanged(j, 4));
        Intent intent = new Intent();
        HMLog.d(m, "uid = " + userInfos.getUserId(), new Object[0]);
        intent.putExtra("UID", userInfos.getUserId());
        if (this.g) {
            intent.setClass(getActivity(), WeightDetailActivity.class);
            intent.putExtra(BFConstant.KEY_UID, userInfos.getUserId());
            startActivity(intent);
        } else {
            EventBus.getDefault().post(new EventSelectedUser(j, this.a.getTimestamp()));
        }
        animMenuOut();
    }

    public void animMenuIn() {
        animMenuIn(250L);
    }

    public void animMenuOut(long j, Animator.AnimatorListener animatorListener) {
        Animator animator = this.k;
        if ((animator == null || !animator.isRunning()) && isVisible()) {
            int height = this.e.getHeight();
            final int height2 = this.f.getHeight();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gr8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.p(height2, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fr8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.q(valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfFloat);
            animatorSet.setInterpolator(new AccelerateInterpolator());
            animatorSet.setDuration(j);
            animatorSet.addListener(animatorListener);
            animatorSet.start();
            this.k = animatorSet;
        }
    }

    public void clickGiveUp() {
        HMLog.i(m, "click give up", new Object[0]);
        BFKeeper.setChooseUserShowing(false);
        EventBus.getDefault().post(new EventCancelChooseUser());
        animMenuOut();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        HMLog.i(m, "", new Object[0]);
        if (getActivity() == null) {
            return;
        }
        super.dismissAllowingStateLoss();
        animMenuOut();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e.post(new Runnable() { // from class: nr8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.animMenuIn();
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        HMLog.i(m, "onCancel", new Object[0]);
        clickGiveUp();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = getActivity().getApplicationContext();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_userslist, viewGroup, false);
        HMLog.i(m, "onCreateView", new Object[0]);
        GridView gridView = (GridView) viewInflate.findViewById(R.id.users_list);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.dlg_empty_area_btn);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.content);
        this.f = (RelativeLayout) viewInflate.findViewById(R.id.main_content);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: ir8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        ((ImageView) viewInflate.findViewById(R.id.giveup_iv)).setOnClickListener(new View.OnClickListener() { // from class: jr8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
        this.b.clear();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(WeightAdvData.WEIGHTADVDATA_KEY);
            if (string != null) {
                this.a = WeightAdvData.fromJsonString(string);
                HMLog.d(m, "receive weightadvdata " + this.a.toString(), new Object[0]);
            }
            this.g = arguments.getBoolean(BFConstant.FROM_BABY_WEIGHT);
            this.h = arguments.getBoolean(WeightConstant.KEY_DATA_ONE_FEET_TEST);
        }
        this.b = UserInfoManager.getManager().getAllInfos();
        HMLog.d(m, "isFromBabyWeight = " + this.g, new Object[0]);
        if (this.g) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.b.size(); i++) {
                UserInfos userInfos = this.b.get(i);
                if (Birthday.fromStr(userInfos.getBirthday()).getAge() > 7) {
                    arrayList.add(userInfos);
                }
            }
            if (arrayList.size() > 0) {
                this.b.removeAll(arrayList);
            }
        }
        WeightAdvData weightAdvData = this.a;
        if (weightAdvData != null) {
            Collections.sort(this.b, new b(HMWeightUtils.convertToKg(weightAdvData.getValue(), this.a.getType())));
        }
        List<Integer> familyBgColor = HMWeightUtils.getFamilyBgColor(this.b);
        UserInfos userInfos2 = new UserInfos();
        userInfos2.setName(getString(R.string.new_user));
        userInfos2.setUserId(PayResponse.CODE_SE_RESPONSE_ERROR);
        List<UserInfos> list = this.b;
        list.add(list.size(), userInfos2);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        float f2 = n * f;
        this.i = f2;
        int i2 = (int) f2;
        int i3 = (int) (((double) f) * 26.7d);
        gridView.setLayoutParams(new LinearLayout.LayoutParams(((i2 + i3) * this.b.size()) + i3, -1));
        gridView.setColumnWidth(i2);
        gridView.setStretchMode(0);
        gridView.setNumColumns(this.b.size());
        gridView.setAdapter((ListAdapter) new c(familyBgColor));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: kr8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
                this.a.v(adapterView, view, i4, j);
            }
        });
        return viewInflate;
    }

    public void setOnDismissListener(OnDialogDismissListener onDialogDismissListener) {
        this.l = onDialogDismissListener;
    }

    public void animMenuIn(long j) {
        Animator animator = this.j;
        if (animator == null || !animator.isRunning()) {
            int height = this.e.getHeight();
            final int height2 = this.f.getHeight();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hr8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.n(height2, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: er8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.o(valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfFloat);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(j);
            animatorSet.start();
            this.j = animatorSet;
        }
    }

    public void animMenuOut() {
        animMenuOut(250L, new a());
    }
}
