package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
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
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ckq extends akq {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final SpringBackLayout P;
    public final LinearLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(hsi.l0, 2);
        sparseIntArray.put(hsi.T0, 3);
        sparseIntArray.put(hsi.R, 4);
        sparseIntArray.put(hsi.Z, 5);
        sparseIntArray.put(hsi.S, 6);
        sparseIntArray.put(hsi.T, 7);
        sparseIntArray.put(hsi.W, 8);
        sparseIntArray.put(hsi.X, 9);
        sparseIntArray.put(hsi.Y, 10);
        sparseIntArray.put(hsi.e0, 11);
        sparseIntArray.put(hsi.Q, 12);
        sparseIntArray.put(hsi.V, 13);
        sparseIntArray.put(hsi.c0, 14);
        sparseIntArray.put(hsi.m0, 15);
    }

    public ckq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextFieldView) objArr[12], (AvatarNameView) objArr[4], (UserInfoRightArrowSingleLineTextView) objArr[6], (BloodTypeView) objArr[7], (TextFieldView) objArr[13], (OrganDonorView) objArr[8], (EmergencyContactView) objArr[9], (UserInfoRightArrowSingleLineTextView) objArr[10], (GenderView) objArr[5], (TextFieldView) objArr[14], (View) objArr[11], (View) objArr[2], (SwitchButtonTwoLineTextView) objArr[15], (NestedScrollView) objArr[3]);
        this.R = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.P = springBackLayout;
        springBackLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.Q = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MedicalIdViewModel medicalIdViewModel) {
        this.O = medicalIdViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (sv1.c != i) {
            return false;
        }
        A0((MedicalIdViewModel) obj);
        return true;
    }

    public ckq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, S, T));
    }
}
