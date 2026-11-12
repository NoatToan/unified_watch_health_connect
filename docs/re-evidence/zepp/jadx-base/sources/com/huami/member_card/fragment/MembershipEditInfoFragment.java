package com.huami.member_card.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.lib.qrcode.QRCodeActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.member_card.MembershipCardBgColorAdapter;
import com.huami.member_card.MembershipCardViewModel;
import com.huami.member_card.R;
import com.huami.member_card.bean.CardBgBean;
import com.huami.member_card.bean.MemberCardColorBg;
import com.huami.member_card.databinding.MembershipFragmentEditInfoBinding;
import com.huami.member_card.fragment.MembershipEditInfoFragment;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010.R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00102¨\u00067"}, d2 = {"Lcom/huami/member_card/fragment/MembershipEditInfoFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", z.j, "initLifecycle", "", "msg", GoogleApiAvailabilityLight.b, "e", "", "show", "f", "g", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onPause", "onDestroyView", "number", "number2FourDigitNumber", "Lcom/huami/member_card/databinding/MembershipFragmentEditInfoBinding;", "a", "Lcom/huami/member_card/databinding/MembershipFragmentEditInfoBinding;", "binding", "Lcom/huami/member_card/MembershipCardViewModel;", "b", "Lcom/huami/member_card/MembershipCardViewModel;", "viewModel", "Lcom/huami/member_card/MembershipCardBgColorAdapter;", "c", "Lcom/huami/member_card/MembershipCardBgColorAdapter;", "adapter", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "memberCardShip", "Z", "targetAdd", "scanResultFromCamera", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "Companion", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MembershipEditInfoFragment extends Fragment {

    @NotNull
    private static final String h = "MembershipEditInfoFragment";
    private static final long i = 800;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MembershipFragmentEditInfoBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private MembershipCardViewModel viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private MembershipCardBgColorAdapter adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private MemberCard memberCardShip;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean targetAdd = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean scanResultFromCamera;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    private final void e() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void f(boolean show) {
        if (show) {
            n(getString(R.string.world_clock_saving));
        } else {
            e();
        }
    }

    private final void g() {
        Object systemService = requireContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(requireView().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final MembershipEditInfoFragment membershipEditInfoFragment, Pair pair) {
        Integer num;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        if ((iIntValue == 1 || iIntValue == 5) && (num = (Integer) pair.getSecond()) != null) {
            int iIntValue2 = num.intValue();
            if (iIntValue2 == 10) {
                membershipEditInfoFragment.f(true);
                return;
            }
            boolean z = iIntValue2 == 0;
            int i2 = z ? R.string.world_clock_saving_success : R.string.world_clock_save_failed;
            membershipEditInfoFragment.f(false);
            if (!z) {
                IconToast.showError(membershipEditInfoFragment.requireContext(), i2);
            } else {
                IconToast.showSuccess(membershipEditInfoFragment.requireContext(), i2);
                membershipEditInfoFragment.requireView().postDelayed(new Runnable() { // from class: bz4
                    @Override // java.lang.Runnable
                    public final void run() {
                        MembershipEditInfoFragment.i(this.a);
                    }
                }, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MembershipEditInfoFragment membershipEditInfoFragment) {
        FragmentKt.findNavController(membershipEditInfoFragment).popBackStack();
    }

    private final void initLifecycle() {
        MembershipCardViewModel membershipCardViewModel = (MembershipCardViewModel) new ViewModelProvider(requireActivity()).get(MembershipCardViewModel.class);
        this.viewModel = membershipCardViewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.getResult().observe(getViewLifecycleOwner(), new Observer() { // from class: zy4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MembershipEditInfoFragment.h(this.a, (Pair) obj);
            }
        });
    }

    private final void initView() {
        int i2;
        MemberCard memberCard = this.memberCardShip;
        if (memberCard != null) {
            MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding = this.binding;
            if (membershipFragmentEditInfoBinding == null) {
                membershipFragmentEditInfoBinding = null;
            }
            membershipFragmentEditInfoBinding.editName.setText(memberCard.getNameID());
            MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding2 = this.binding;
            if (membershipFragmentEditInfoBinding2 == null) {
                membershipFragmentEditInfoBinding2 = null;
            }
            membershipFragmentEditInfoBinding2.editNumber.setText(number2FourDigitNumber(memberCard.getNumber()));
        }
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding3 = this.binding;
        if (membershipFragmentEditInfoBinding3 == null) {
            membershipFragmentEditInfoBinding3 = null;
        }
        RecyclerView recyclerView = membershipFragmentEditInfoBinding3.recyclerViewColor;
        MembershipCardBgColorAdapter membershipCardBgColorAdapter = new MembershipCardBgColorAdapter();
        this.adapter = membershipCardBgColorAdapter;
        Unit unit = Unit.INSTANCE;
        recyclerView.setAdapter(membershipCardBgColorAdapter);
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding4 = this.binding;
        if (membershipFragmentEditInfoBinding4 == null) {
            membershipFragmentEditInfoBinding4 = null;
        }
        membershipFragmentEditInfoBinding4.recyclerViewColor.setLayoutManager(new GridLayoutManager(requireContext(), 6));
        MemberCardColorBg[] memberCardColorBgArrValues = MemberCardColorBg.values();
        MemberCard memberCard2 = this.memberCardShip;
        if (memberCard2 != null) {
            int length = memberCardColorBgArrValues.length;
            i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else {
                    if (memberCardColorBgArrValues[i2].getColorValue() == memberCard2.getColor()) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(memberCardColorBgArrValues.length);
        int length2 = memberCardColorBgArrValues.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            int i5 = i4 + 1;
            arrayList.add(new CardBgBean(memberCardColorBgArrValues[i3], i2 == i4));
            i3++;
            i4 = i5;
        }
        MembershipCardBgColorAdapter membershipCardBgColorAdapter2 = this.adapter;
        (membershipCardBgColorAdapter2 != null ? membershipCardBgColorAdapter2 : null).setColors(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
        m();
    }

    private final void j() {
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding = this.binding;
        if (membershipFragmentEditInfoBinding == null) {
            membershipFragmentEditInfoBinding = null;
        }
        membershipFragmentEditInfoBinding.rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: az4
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                MembershipEditInfoFragment.k(this.a, view, i2);
            }
        });
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding2 = this.binding;
        if (membershipFragmentEditInfoBinding2 == null) {
            membershipFragmentEditInfoBinding2 = null;
        }
        membershipFragmentEditInfoBinding2.rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: yy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MembershipEditInfoFragment.l(this.a, view);
            }
        });
        TextWatcher textWatcher = new TextWatcher() { // from class: com.huami.member_card.fragment.MembershipEditInfoFragment$initListener$textWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                String string = s == null ? null : s.toString();
                if (string == null) {
                    return;
                }
                String strNumber2FourDigitNumber = this.a.number2FourDigitNumber(string);
                if (!Intrinsics.areEqual(string, strNumber2FourDigitNumber)) {
                    MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding3 = this.a.binding;
                    if (membershipFragmentEditInfoBinding3 == null) {
                        membershipFragmentEditInfoBinding3 = null;
                    }
                    membershipFragmentEditInfoBinding3.editNumber.removeTextChangedListener(this);
                    MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding4 = this.a.binding;
                    if (membershipFragmentEditInfoBinding4 == null) {
                        membershipFragmentEditInfoBinding4 = null;
                    }
                    membershipFragmentEditInfoBinding4.editNumber.setText(strNumber2FourDigitNumber);
                    MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding5 = this.a.binding;
                    if (membershipFragmentEditInfoBinding5 == null) {
                        membershipFragmentEditInfoBinding5 = null;
                    }
                    membershipFragmentEditInfoBinding5.editNumber.setSelection(strNumber2FourDigitNumber.length());
                    MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding6 = this.a.binding;
                    (membershipFragmentEditInfoBinding6 != null ? membershipFragmentEditInfoBinding6 : null).editNumber.addTextChangedListener(this);
                }
                this.a.m();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
            }
        };
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding3 = this.binding;
        if (membershipFragmentEditInfoBinding3 == null) {
            membershipFragmentEditInfoBinding3 = null;
        }
        membershipFragmentEditInfoBinding3.editNumber.addTextChangedListener(textWatcher);
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding4 = this.binding;
        (membershipFragmentEditInfoBinding4 != null ? membershipFragmentEditInfoBinding4 : null).editName.addTextChangedListener(new TextWatcher() { // from class: com.huami.member_card.fragment.MembershipEditInfoFragment$initListener$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                this.a.m();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MembershipEditInfoFragment membershipEditInfoFragment, View view, int i2) {
        String string;
        if (i2 == 0) {
            MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding = membershipEditInfoFragment.binding;
            if (membershipFragmentEditInfoBinding == null) {
                membershipFragmentEditInfoBinding = null;
            }
            Editable text = membershipFragmentEditInfoBinding.editName.getText();
            String string2 = text == null ? null : text.toString();
            if (string2 == null) {
                return;
            }
            MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding2 = membershipEditInfoFragment.binding;
            if (membershipFragmentEditInfoBinding2 == null) {
                membershipFragmentEditInfoBinding2 = null;
            }
            Editable text2 = membershipFragmentEditInfoBinding2.editNumber.getText();
            String strReplace$default = (text2 == null || (string = text2.toString()) == null) ? null : m.replace$default(string, " ", "", false, 4, (Object) null);
            if (strReplace$default == null) {
                return;
            }
            MembershipCardBgColorAdapter membershipCardBgColorAdapter = membershipEditInfoFragment.adapter;
            if (membershipCardBgColorAdapter == null) {
                membershipCardBgColorAdapter = null;
            }
            byte colorValue = membershipCardBgColorAdapter.getSelectColorBg().getColorValue();
            if (string2.length() > 18) {
                MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding3 = membershipEditInfoFragment.binding;
                if (membershipFragmentEditInfoBinding3 == null) {
                    membershipFragmentEditInfoBinding3 = null;
                }
                membershipFragmentEditInfoBinding3.editName.requestFocus();
                MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding4 = membershipEditInfoFragment.binding;
                (membershipFragmentEditInfoBinding4 != null ? membershipFragmentEditInfoBinding4 : null).editName.setError(membershipEditInfoFragment.getString(R.string.member_name_input_limit, 18));
                return;
            }
            if (strReplace$default.length() > 21) {
                MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding5 = membershipEditInfoFragment.binding;
                if (membershipFragmentEditInfoBinding5 == null) {
                    membershipFragmentEditInfoBinding5 = null;
                }
                membershipFragmentEditInfoBinding5.editNumber.requestFocus();
                MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding6 = membershipEditInfoFragment.binding;
                (membershipFragmentEditInfoBinding6 != null ? membershipFragmentEditInfoBinding6 : null).editNumber.setError(membershipEditInfoFragment.getString(R.string.member_number_input_limit, 21));
                return;
            }
            if (membershipEditInfoFragment.targetAdd) {
                MembershipCardViewModel membershipCardViewModel = membershipEditInfoFragment.viewModel;
                if (membershipCardViewModel == null) {
                    membershipCardViewModel = null;
                }
                if (MembershipCardViewModel.hasRepeatNameID$default(membershipCardViewModel, string2, null, 2, null)) {
                    MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding7 = membershipEditInfoFragment.binding;
                    if (membershipFragmentEditInfoBinding7 == null) {
                        membershipFragmentEditInfoBinding7 = null;
                    }
                    membershipFragmentEditInfoBinding7.editName.requestFocus();
                    MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding8 = membershipEditInfoFragment.binding;
                    (membershipFragmentEditInfoBinding8 != null ? membershipFragmentEditInfoBinding8 : null).editName.setError(membershipEditInfoFragment.getString(R.string.member_name_repeat));
                    return;
                }
            } else {
                MemberCard memberCard = membershipEditInfoFragment.memberCardShip;
                if (!Intrinsics.areEqual(string2, memberCard == null ? null : memberCard.getNameID())) {
                    MembershipCardViewModel membershipCardViewModel2 = membershipEditInfoFragment.viewModel;
                    if (membershipCardViewModel2 == null) {
                        membershipCardViewModel2 = null;
                    }
                    MemberCard memberCard2 = membershipEditInfoFragment.memberCardShip;
                    if (membershipCardViewModel2.hasRepeatNameID(string2, memberCard2 == null ? null : memberCard2.getNameID())) {
                        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding9 = membershipEditInfoFragment.binding;
                        if (membershipFragmentEditInfoBinding9 == null) {
                            membershipFragmentEditInfoBinding9 = null;
                        }
                        membershipFragmentEditInfoBinding9.editName.requestFocus();
                        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding10 = membershipEditInfoFragment.binding;
                        (membershipFragmentEditInfoBinding10 != null ? membershipFragmentEditInfoBinding10 : null).editName.setError(membershipEditInfoFragment.getString(R.string.member_name_repeat));
                        return;
                    }
                }
            }
            MemberCard memberCard3 = new MemberCard(string2, strReplace$default, membershipEditInfoFragment.memberCardShip.getData(), membershipEditInfoFragment.memberCardShip.getCodeType(), colorValue);
            if (view.isPressed()) {
                if (membershipEditInfoFragment.targetAdd) {
                    MembershipCardViewModel membershipCardViewModel3 = membershipEditInfoFragment.viewModel;
                    (membershipCardViewModel3 != null ? membershipCardViewModel3 : null).addMembershipCard(memberCard3, membershipEditInfoFragment.scanResultFromCamera);
                } else {
                    MembershipCardViewModel membershipCardViewModel4 = membershipEditInfoFragment.viewModel;
                    (membershipCardViewModel4 != null ? membershipCardViewModel4 : null).modify(membershipEditInfoFragment.memberCardShip.getNameID(), memberCard3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MembershipEditInfoFragment membershipEditInfoFragment, View view) {
        FragmentKt.findNavController(membershipEditInfoFragment).popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        String string;
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding = this.binding;
        if (membershipFragmentEditInfoBinding == null) {
            membershipFragmentEditInfoBinding = null;
        }
        Editable text = membershipFragmentEditInfoBinding.editName.getText();
        String string2 = text == null ? null : text.toString();
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding2 = this.binding;
        if (membershipFragmentEditInfoBinding2 == null) {
            membershipFragmentEditInfoBinding2 = null;
        }
        Editable text2 = membershipFragmentEditInfoBinding2.editNumber.getText();
        boolean z = (TextUtils.isEmpty(string2) || TextUtils.isEmpty((text2 != null && (string = text2.toString()) != null) ? m.replace$default(string, " ", "", false, 4, (Object) null) : null)) ? false : true;
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding3 = this.binding;
        if (membershipFragmentEditInfoBinding3 == null) {
            membershipFragmentEditInfoBinding3 = null;
        }
        membershipFragmentEditInfoBinding3.rainbowTitleBar.setMenuEnable(0, z);
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBinding4 = this.binding;
        (membershipFragmentEditInfoBinding4 != null ? membershipFragmentEditInfoBinding4 : null).rainbowTitleBar.setMenuTint(z ? R.color.p4 : R.color.p5);
    }

    private final void n(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        boolean z = false;
        if (this.mLoadingDialog == null) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext());
            this.mLoadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog != null) {
                loadingDialogShowDialog.setCancelable(false);
            }
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 != null && !loadingDialog3.isShowing()) {
            z = true;
        }
        if (z && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.show();
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    @NotNull
    public final String number2FourDigitNumber(@NotNull String number) {
        return new Regex("(\\S{4})(?=\\S)").replace(number, "$1 ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.memberCardShip = (MemberCard) (arguments == null ? null : arguments.getSerializable(MembershipHomeFragment.DETAIL_MEMBERCARD));
        Bundle arguments2 = getArguments();
        this.targetAdd = arguments2 == null ? true : arguments2.getBoolean(MembershipHomeFragment.TARGET_ADD, true);
        Bundle arguments3 = getArguments();
        this.scanResultFromCamera = arguments3 == null ? false : arguments3.getBoolean(QRCodeActivity.SCAN_RESULT_SOURCE, true);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MembershipFragmentEditInfoBinding membershipFragmentEditInfoBindingInflate = MembershipFragmentEditInfoBinding.inflate(inflater, container, false);
        this.binding = membershipFragmentEditInfoBindingInflate;
        if (membershipFragmentEditInfoBindingInflate == null) {
            membershipFragmentEditInfoBindingInflate = null;
        }
        return membershipFragmentEditInfoBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MembershipCardViewModel membershipCardViewModel = this.viewModel;
        if (membershipCardViewModel == null) {
            membershipCardViewModel = null;
        }
        membershipCardViewModel.restoreMemberOperationStatus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        j();
        initLifecycle();
    }
}
