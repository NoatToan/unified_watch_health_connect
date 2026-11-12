package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.x;
import qb1.a0;
import qb1.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/c;", "Landroidx/fragment/app/Fragment;", "Lqb1/b0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40965f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f40966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40967b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f40968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f40969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qb1.f f40970e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40971a;

        static {
            int[] iArr = new int[y.c.values().length];
            try {
                iArr[y.c.BMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.c.BODY_FAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.c.MUSCLE_MASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.c.BONE_MASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y.c.BODY_WATER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f40971a = iArr;
        }
    }

    @Override // qb1.b0
    public final void i0() {
        DeviceSettingsDTO deviceSettingsDTO;
        z zVarH;
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f40968c;
        if (gCMComplexOneLineButton != null && gCMComplexOneLineButton.f47771k.isChecked()) {
            HashMap map = new HashMap();
            for (GCMComplexOneLineButton gCMComplexOneLineButton2 : this.f40967b) {
                Object tag = gCMComplexOneLineButton2.getTag();
                if (tag instanceof String) {
                    map.put(tag, Boolean.valueOf(gCMComplexOneLineButton2.f47771k.isChecked()));
                }
            }
            qb1.f fVar = this.f40970e;
            if (fVar != null) {
                DeviceSettingsDTO deviceSettingsDTO2 = fVar.f144066j;
                List<y> list = null;
                if (deviceSettingsDTO2 != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.getClass();
                    deviceSettingsDTO2.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    DeviceSettingsDTO deviceSettingsDTOCreateFromParcel = DeviceSettingsDTO.CREATOR.createFromParcel(parcelObtain);
                    deviceSettingsDTOCreateFromParcel.getClass();
                    deviceSettingsDTO = deviceSettingsDTOCreateFromParcel;
                } else {
                    deviceSettingsDTO = null;
                }
                fVar.f144073q = deviceSettingsDTO;
                if (deviceSettingsDTO != null && (zVarH = deviceSettingsDTO.H()) != null) {
                    list = zVarH.f34343c;
                }
                if (list != null && !list.isEmpty()) {
                    for (y yVar : list) {
                        String str = yVar.f34328a;
                        Boolean bool = (Boolean) map.get(str);
                        if (str != null && bool != null) {
                            yVar.f34330c = bool.booleanValue();
                        }
                    }
                }
            }
        }
        a0 a0Var = this.f40969d;
        if (a0Var != null) {
            a0Var.E8();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (getActivity() instanceof a0) {
            a7.e activity = getActivity();
            activity.getClass();
            this.f40969d = (a0) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_index_scale_set_up, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Integer num;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.setup_index_scale_container);
        viewFindViewById.getClass();
        this.f40966a = (LinearLayout) viewFindViewById;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("DEVICE_SETTING_KEY", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("DEVICE_SETTING_KEY");
                if (!(parcelable2 instanceof DeviceSettingsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (DeviceSettingsDTO) parcelable2;
            }
        }
        m activity = getActivity();
        if (activity != null) {
            this.f40970e = (qb1.f) new x1(activity).b(s0.f105811a.b(qb1.f.class));
        }
        Context context = getContext();
        GCMComplexOneLineButton gCMComplexOneLineButton = context != null ? new GCMComplexOneLineButton(context, null, 0, 6, null) : null;
        this.f40968c = gCMComplexOneLineButton;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setRightElement(GCMComplexOneLineButton.a.SWITCH);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f40968c;
        if (gCMComplexOneLineButton2 != null) {
            gCMComplexOneLineButton2.setButtonLeftLabel(getString(R.string.lbl_advanced_body_metrics));
        }
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f40968c;
        if (gCMComplexOneLineButton3 != null) {
            gCMComplexOneLineButton3.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 11));
        }
        GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f40968c;
        if (gCMComplexOneLineButton4 != null) {
            gCMComplexOneLineButton4.setVisibility(8);
        }
        LinearLayout linearLayout = this.f40966a;
        if (linearLayout == null) {
            s.m("mLinearLayoutContainer");
            throw null;
        }
        linearLayout.addView(this.f40968c);
        for (y.c cVar : x.m(y.c.BMI, y.c.BODY_FAT, y.c.MUSCLE_MASS, y.c.BONE_MASS, y.c.BODY_WATER)) {
            Context context2 = getContext();
            GCMComplexOneLineButton gCMComplexOneLineButton5 = context2 != null ? new GCMComplexOneLineButton(context2, null, 0, 6, null) : null;
            if (gCMComplexOneLineButton5 != null) {
                gCMComplexOneLineButton5.setTag(cVar.f34339a);
                int i14 = b.f40971a[cVar.ordinal()];
                if (i14 == 1) {
                    num = 2131232686;
                } else if (i14 == 2) {
                    num = 2131232687;
                } else if (i14 == 3) {
                    num = 2131232690;
                } else if (i14 != 4) {
                    num = i14 != 5 ? null : 2131232688;
                } else {
                    num = 2131232689;
                }
                if (num != null) {
                    gCMComplexOneLineButton5.setLeftIcon(num.intValue());
                } else {
                    gCMComplexOneLineButton5.setLeftIcon(R.drawable.calendar_next_arrow);
                }
                gCMComplexOneLineButton5.setRightElement(GCMComplexOneLineButton.a.SWITCH);
                if (cVar == y.c.MUSCLE_MASS) {
                    gCMComplexOneLineButton5.setButtonLeftLabel(getString(R.string.lbl_skeletal_muscle_mass));
                } else {
                    gCMComplexOneLineButton5.setButtonLeftLabel(getString(cVar.f34340b));
                }
                gCMComplexOneLineButton5.i(true);
                gCMComplexOneLineButton5.setEnabled(true);
                gCMComplexOneLineButton5.setVisibility(8);
                this.f40967b.add(gCMComplexOneLineButton5);
                LinearLayout linearLayout2 = this.f40966a;
                if (linearLayout2 == null) {
                    s.m("mLinearLayoutContainer");
                    throw null;
                }
                linearLayout2.addView(gCMComplexOneLineButton5);
            }
        }
    }

    @Override // qb1.b0
    public final void r0() {
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f40968c;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setVisibility(0);
        }
        for (GCMComplexOneLineButton gCMComplexOneLineButton2 : this.f40967b) {
            GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f40968c;
            gCMComplexOneLineButton2.setVisibility((gCMComplexOneLineButton3 == null || !gCMComplexOneLineButton3.f47771k.isChecked()) ? 8 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/c$a;", "", "<init>", "()V", "", "DEVICE_SETTING_KEY", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
