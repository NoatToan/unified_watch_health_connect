package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.training_plan_export.widget.TrainingPlanTitleBar;
import com.xiaomi.fitness.userinfo.bean.UserIndicatorsInfo;
import com.xiaomi.fitness.userinfo.information.AddUserIndicatorsViewHolder;
import com.xiaomi.fitness.userinfo.information.UserIndicatorsSelectListAdapter;
import com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel;
import com.xiaomi.fitness.userinfo.medicalid.baseui.MedicalCardEntranceView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import kotlin.jvm.functions.Function2;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public class gkq extends fkq {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(hsi.M0, 4);
        sparseIntArray.put(hsi.V0, 5);
        sparseIntArray.put(hsi.P, 6);
        sparseIntArray.put(hsi.f20409r, 7);
        sparseIntArray.put(hsi.d0, 8);
        sparseIntArray.put(hsi.G1, 9);
        sparseIntArray.put(hsi.F1, 10);
        sparseIntArray.put(hsi.D1, 11);
        sparseIntArray.put(hsi.E1, 12);
        sparseIntArray.put(hsi.U, 13);
        sparseIntArray.put(hsi.N0, 14);
        sparseIntArray.put(hsi.v, 15);
    }

    public gkq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (RelativeLayout) objArr[2], (LinearLayout) objArr[7], (TextView) objArr[15], (LinearLayout) objArr[6], (MedicalCardEntranceView) objArr[13], (ConstraintLayout) objArr[8], (View) objArr[4], (RecyclerView) objArr[3], (TrainingPlanTitleBar) objArr[14], (RecyclerView) objArr[1], (NestedScrollView) objArr[5], (TextView) objArr[11], (SpringBackLayout) objArr[0], (ImageView) objArr[12], (TextView) objArr[10], (RoundImageView) objArr[9]);
        this.R = -1L;
        this.A.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.M.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableArrayList<UserIndicatorsInfo> observableArrayList, int i) {
        if (i != sv1.f34012a) {
            return false;
        }
        synchronized (this) {
            this.R |= 1;
        }
        return true;
    }

    public final boolean B0(ObservableArrayList<UserIndicatorsInfo> observableArrayList, int i) {
        if (i != sv1.f34012a) {
            return false;
        }
        synchronized (this) {
            this.R |= 2;
        }
        return true;
    }

    public void C0(UserinfoSelectViewModel userinfoSelectViewModel) {
        this.Q = userinfoSelectViewModel;
        synchronized (this) {
            this.R |= 4;
        }
        notifyPropertyChanged(sv1.c);
        super.e0();
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
            this.R = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((ObservableArrayList) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((ObservableArrayList) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        ItemBinding<UserIndicatorsInfo> itemBinding;
        ObservableArrayList<UserIndicatorsInfo> observableArrayList;
        UserIndicatorsSelectListAdapter userIndicatorsSelectListAdapter;
        Function2<View, Integer, AddUserIndicatorsViewHolder> viewHolderFactory;
        ItemBinding<UserIndicatorsInfo> itemBinding2;
        ObservableArrayList<UserIndicatorsInfo> observableArrayList2;
        UserIndicatorsSelectListAdapter userIndicatorsSelectListAdapter2;
        Function2<View, Integer, AddUserIndicatorsViewHolder> function2;
        ObservableArrayList<UserIndicatorsInfo> createAbilityPlanItems;
        UserIndicatorsSelectListAdapter createAbilityPlanAdapter;
        Function2<View, Integer, AddUserIndicatorsViewHolder> createAbilityPlanHolderFactory;
        ItemBinding<UserIndicatorsInfo> createAbilityPlanItemBinding;
        UserIndicatorsSelectListAdapter userIndicatorsSelectListAdapter3;
        ItemBinding<UserIndicatorsInfo> userIndicatorsItemBinding;
        synchronized (this) {
            j = this.R;
            this.R = 0L;
        }
        UserinfoSelectViewModel userinfoSelectViewModel = this.Q;
        ObservableArrayList<UserIndicatorsInfo> userIndicatorsItems = null;
        if ((15 & j) != 0) {
            if ((j & 13) != 0) {
                if (userinfoSelectViewModel != null) {
                    createAbilityPlanItems = userinfoSelectViewModel.getCreateAbilityPlanItems();
                    createAbilityPlanAdapter = userinfoSelectViewModel.getCreateAbilityPlanAdapter();
                    createAbilityPlanHolderFactory = userinfoSelectViewModel.getCreateAbilityPlanHolderFactory();
                    createAbilityPlanItemBinding = userinfoSelectViewModel.getCreateAbilityPlanItemBinding();
                } else {
                    createAbilityPlanItems = null;
                    createAbilityPlanAdapter = null;
                    createAbilityPlanHolderFactory = null;
                    createAbilityPlanItemBinding = null;
                }
                y0(0, createAbilityPlanItems);
            } else {
                createAbilityPlanItems = null;
                createAbilityPlanAdapter = null;
                createAbilityPlanHolderFactory = null;
                createAbilityPlanItemBinding = null;
            }
            if ((j & 14) != 0) {
                if (userinfoSelectViewModel != null) {
                    UserIndicatorsSelectListAdapter adapter = userinfoSelectViewModel.getAdapter();
                    viewHolderFactory = userinfoSelectViewModel.getViewHolderFactory();
                    userIndicatorsItemBinding = userinfoSelectViewModel.getUserIndicatorsItemBinding();
                    userIndicatorsItems = userinfoSelectViewModel.getUserIndicatorsItems();
                    userIndicatorsSelectListAdapter3 = adapter;
                } else {
                    userIndicatorsSelectListAdapter3 = null;
                    viewHolderFactory = null;
                    userIndicatorsItemBinding = null;
                }
                y0(1, userIndicatorsItems);
                observableArrayList2 = createAbilityPlanItems;
                userIndicatorsSelectListAdapter2 = createAbilityPlanAdapter;
                function2 = createAbilityPlanHolderFactory;
                itemBinding2 = createAbilityPlanItemBinding;
                itemBinding = userIndicatorsItemBinding;
                userIndicatorsSelectListAdapter = userIndicatorsSelectListAdapter3;
                observableArrayList = userIndicatorsItems;
            } else {
                observableArrayList2 = createAbilityPlanItems;
                viewHolderFactory = null;
                userIndicatorsSelectListAdapter2 = createAbilityPlanAdapter;
                function2 = createAbilityPlanHolderFactory;
                itemBinding2 = createAbilityPlanItemBinding;
                itemBinding = null;
                observableArrayList = null;
                userIndicatorsSelectListAdapter = null;
            }
        } else {
            itemBinding = null;
            observableArrayList = null;
            userIndicatorsSelectListAdapter = null;
            viewHolderFactory = null;
            itemBinding2 = null;
            observableArrayList2 = null;
            userIndicatorsSelectListAdapter2 = null;
            function2 = null;
        }
        if ((j & 13) != 0) {
            BindingAdapters.setAdapter(this.H, itemBinding2, observableArrayList2, userIndicatorsSelectListAdapter2, function2, null);
        }
        if ((j & 14) != 0) {
            BindingAdapters.setAdapter(this.J, itemBinding, observableArrayList, userIndicatorsSelectListAdapter, viewHolderFactory, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (sv1.c != i) {
            return false;
        }
        C0((UserinfoSelectViewModel) obj);
        return true;
    }

    public gkq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, S, T));
    }
}
