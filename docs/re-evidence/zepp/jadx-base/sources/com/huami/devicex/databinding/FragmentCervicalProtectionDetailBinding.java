package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.xiaomi.hm.health.device.headset.ui.CervicalRulerView;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentCervicalProtectionDetailBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final TextView cervicalProtectionAngle;

    @NonNull
    public final TextView cervicalProtectionAngleDes;

    @NonNull
    public final ConstraintLayout cervicalProtectionAngleGroup;

    @NonNull
    public final TextView cervicalProtectionAngleSymbol;

    @NonNull
    public final TextView cervicalProtectionAngleValue;

    @NonNull
    public final TextView cervicalProtectionPressDes;

    @NonNull
    public final TextView cervicalProtectionPressDetailDes;

    @NonNull
    public final ListTile cervicalProtectionRelaxSwitch;

    @NonNull
    public final CervicalRulerView cervicalProtectionRulerView;

    @NonNull
    public final ImageView cervicalProtectionSchematicDiagram;

    @NonNull
    public final ListTile cervicalProtectionSeatedCalibration;

    @NonNull
    public final ListTile cervicalProtectionSwitch;

    private FragmentCervicalProtectionDetailBinding(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ListTile listTile, @NonNull CervicalRulerView cervicalRulerView, @NonNull ImageView imageView, @NonNull ListTile listTile2, @NonNull ListTile listTile3) {
        this.a = scrollView;
        this.cervicalProtectionAngle = textView;
        this.cervicalProtectionAngleDes = textView2;
        this.cervicalProtectionAngleGroup = constraintLayout;
        this.cervicalProtectionAngleSymbol = textView3;
        this.cervicalProtectionAngleValue = textView4;
        this.cervicalProtectionPressDes = textView5;
        this.cervicalProtectionPressDetailDes = textView6;
        this.cervicalProtectionRelaxSwitch = listTile;
        this.cervicalProtectionRulerView = cervicalRulerView;
        this.cervicalProtectionSchematicDiagram = imageView;
        this.cervicalProtectionSeatedCalibration = listTile2;
        this.cervicalProtectionSwitch = listTile3;
    }

    @NonNull
    public static FragmentCervicalProtectionDetailBinding bind(@NonNull View view) {
        int i = R.id.cervical_protection_angle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.cervical_protection_angle_des;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.cervical_protection_angle_group;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.cervical_protection_angle_symbol;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.cervical_protection_angle_value;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.cervical_protection_press_des;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.cervical_protection_press_detail_des;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = R.id.cervical_protection_relax_switch;
                                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile != null) {
                                        i = R.id.cervical_protection_ruler_view;
                                        CervicalRulerView cervicalRulerView = (CervicalRulerView) ViewBindings.findChildViewById(view, i);
                                        if (cervicalRulerView != null) {
                                            i = R.id.cervical_protection_schematic_diagram;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.cervical_protection_seated_calibration;
                                                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                if (listTile2 != null) {
                                                    i = R.id.cervical_protection_switch;
                                                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                                                    if (listTile3 != null) {
                                                        return new FragmentCervicalProtectionDetailBinding((ScrollView) view, textView, textView2, constraintLayout, textView3, textView4, textView5, textView6, listTile, cervicalRulerView, imageView, listTile2, listTile3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCervicalProtectionDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCervicalProtectionDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_cervical_protection_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
