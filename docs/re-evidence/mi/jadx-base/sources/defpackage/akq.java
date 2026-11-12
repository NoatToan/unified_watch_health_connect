package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.userinfo.medicalid.baseui.AvatarNameView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.BloodTypeView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.EmergencyContactView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.GenderView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.OrganDonorView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.TextFieldView;
import com.xiaomi.fitness.userinfo.medicalid.baseui.UserInfoRightArrowSingleLineTextView;
import com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class akq extends ViewDataBinding {
    public final TextFieldView A;
    public final AvatarNameView B;
    public final UserInfoRightArrowSingleLineTextView C;
    public final BloodTypeView D;
    public final TextFieldView E;
    public final OrganDonorView F;
    public final EmergencyContactView G;
    public final UserInfoRightArrowSingleLineTextView H;
    public final GenderView I;
    public final TextFieldView J;
    public final View K;
    public final View L;
    public final SwitchButtonTwoLineTextView M;
    public final NestedScrollView N;
    public MedicalIdViewModel O;

    public akq(Object obj, View view, int i, TextFieldView textFieldView, AvatarNameView avatarNameView, UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView, BloodTypeView bloodTypeView, TextFieldView textFieldView2, OrganDonorView organDonorView, EmergencyContactView emergencyContactView, UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView2, GenderView genderView, TextFieldView textFieldView3, View view2, View view3, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = textFieldView;
        this.B = avatarNameView;
        this.C = userInfoRightArrowSingleLineTextView;
        this.D = bloodTypeView;
        this.E = textFieldView2;
        this.F = organDonorView;
        this.G = emergencyContactView;
        this.H = userInfoRightArrowSingleLineTextView2;
        this.I = genderView;
        this.J = textFieldView3;
        this.K = view2;
        this.L = view3;
        this.M = switchButtonTwoLineTextView;
        this.N = nestedScrollView;
    }
}
