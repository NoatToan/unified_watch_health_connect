package ig1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class h1 extends f0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f93331v = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ng1.m0 f93334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ng1.p0 f93335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ng1.r0 f93336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f1 f93337r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f1 f93338t;

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DeviceSettingsDTO f93339a;

        public a(DeviceSettingsDTO deviceSettingsDTO) {
            this.f93339a = deviceSettingsDTO;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            DeviceSettingsDTO deviceSettingsDTO = this.f93339a;
            deviceSettingsDTO.T0.f34190a = Boolean.valueOf(z14);
            h1 h1Var = h1.this;
            h1Var.p();
            h1Var.k(deviceSettingsDTO);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DeviceSettingsDTO f93341a;

        public b(DeviceSettingsDTO deviceSettingsDTO) {
            this.f93341a = deviceSettingsDTO;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            DeviceSettingsDTO deviceSettingsDTO = this.f93341a;
            deviceSettingsDTO.T0.f34191b = Boolean.valueOf(z14);
            h1 h1Var = h1.this;
            h1Var.p();
            h1Var.f93334o.b(deviceSettingsDTO.T0);
            h1Var.k(deviceSettingsDTO);
        }
    }

    public h1(Context context, com.garmin.android.apps.connectmobile.devices.model.f fVar, com.garmin.android.apps.connectmobile.devices.model.f fVar2, ng1.m0 m0Var, ng1.p0 p0Var, ng1.r0 r0Var) {
        super(context);
        this.f93332m = fVar;
        this.f93333n = fVar2;
        this.f93334o = m0Var;
        this.f93335p = p0Var;
        this.f93336q = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v33, types: [android.view.View$OnClickListener, ig1.f1] */
    /* JADX WARN: Type inference failed for: r3v34, types: [android.view.View$OnClickListener, ig1.f1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean g(i.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        if (this.f93333n == null || this.f93332m == null) {
            vb.h.s("Model is required");
            return false;
        }
        View viewInflate = ((LayoutInflater) cVar.getSystemService("layout_inflater")).inflate(R.layout.gcm3_vivosmart3_activity_options_expandable_field, (ViewGroup) null);
        this.f93305d = viewInflate;
        this.f93306e = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.expansionBtn);
        this.f93307f = (TextView) this.f93305d.findViewById(R.id.expansionBtnDescr);
        this.f93308g = (GCMComplexOneLineButton) this.f93305d.findViewById(R.id.toggleBtn);
        this.f93309h = (GCMComplexOneLineButton) this.f93305d.findViewById(R.id.firstDetailBtn);
        this.f93310i = (GCMComplexOneLineButton) this.f93305d.findViewById(R.id.secondDetailBtn);
        ((TextView) this.f93305d.findViewById(R.id.toggleBtnDescription)).setText(R.string.auto_activity_detection_subtext);
        this.f93306e.h();
        this.f93306e.e();
        this.f93308g.h();
        this.f93308g.e();
        this.f93309h.h();
        this.f93309h.e();
        this.f93310i.h();
        this.f93310i.e();
        this.f93306e.setOnCheckedChangeListener(new a(deviceSettingsDTO));
        this.f93308g.setOnCheckedChangeListener(new b(deviceSettingsDTO));
        final int i14 = 0;
        ?? r14 = new View.OnClickListener(this) { // from class: ig1.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f93315b;

            {
                this.f93315b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        final h1 h1Var = this.f93315b;
                        int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(h1Var.f93333n.D().intValue()).ordinal();
                        CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(h1Var.f70343a);
                        final int i15 = 0;
                        aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.g1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i16) {
                                int i17 = i15;
                                h1 h1Var2 = h1Var;
                                switch (i17) {
                                    case 0:
                                        int i18 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i16);
                                        h1Var2.f93309h.setButtonRightLabel(gVarB.f34161a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar = h1Var2.f93333n;
                                        fVar.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                        dialogInterface.dismiss();
                                        h1Var2.p();
                                        h1Var2.f93336q.u2(fVar);
                                        break;
                                    default:
                                        int i19 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i16);
                                        h1Var2.f93310i.setButtonRightLabel(eVarB.f34149a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = h1Var2.f93332m;
                                        fVar2.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                        dialogInterface.dismiss();
                                        h1Var2.p();
                                        h1Var2.f93335p.r7(fVar2);
                                        break;
                                }
                            }
                        });
                        aVar.create().show();
                        break;
                    default:
                        final h1 h1Var2 = this.f93315b;
                        int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(h1Var2.f93332m.D().intValue()).ordinal();
                        CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(h1Var2.f70343a);
                        final int i16 = 1;
                        aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.g1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                int i18 = i16;
                                h1 h1Var3 = h1Var2;
                                switch (i18) {
                                    case 0:
                                        int i19 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i17);
                                        h1Var3.f93309h.setButtonRightLabel(gVarB.f34161a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar = h1Var3.f93333n;
                                        fVar.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                        dialogInterface.dismiss();
                                        h1Var3.p();
                                        h1Var3.f93336q.u2(fVar);
                                        break;
                                    default:
                                        int i110 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i17);
                                        h1Var3.f93310i.setButtonRightLabel(eVarB.f34149a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = h1Var3.f93332m;
                                        fVar2.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                        dialogInterface.dismiss();
                                        h1Var3.p();
                                        h1Var3.f93335p.r7(fVar2);
                                        break;
                                }
                            }
                        });
                        aVar2.create().show();
                        break;
                }
            }
        };
        this.f93337r = r14;
        this.f93309h.setOnClickListener(r14);
        final int i15 = 1;
        ?? r15 = new View.OnClickListener(this) { // from class: ig1.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f93315b;

            {
                this.f93315b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        final h1 h1Var = this.f93315b;
                        int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(h1Var.f93333n.D().intValue()).ordinal();
                        CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(h1Var.f70343a);
                        final int i16 = 0;
                        aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.g1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                int i18 = i16;
                                h1 h1Var3 = h1Var;
                                switch (i18) {
                                    case 0:
                                        int i19 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i17);
                                        h1Var3.f93309h.setButtonRightLabel(gVarB.f34161a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar = h1Var3.f93333n;
                                        fVar.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                        dialogInterface.dismiss();
                                        h1Var3.p();
                                        h1Var3.f93336q.u2(fVar);
                                        break;
                                    default:
                                        int i110 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i17);
                                        h1Var3.f93310i.setButtonRightLabel(eVarB.f34149a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = h1Var3.f93332m;
                                        fVar2.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                        dialogInterface.dismiss();
                                        h1Var3.p();
                                        h1Var3.f93335p.r7(fVar2);
                                        break;
                                }
                            }
                        });
                        aVar.create().show();
                        break;
                    default:
                        final h1 h1Var2 = this.f93315b;
                        int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(h1Var2.f93332m.D().intValue()).ordinal();
                        CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(h1Var2.f70343a);
                        final int i17 = 1;
                        aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.g1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i18) {
                                int i19 = i17;
                                h1 h1Var3 = h1Var2;
                                switch (i19) {
                                    case 0:
                                        int i110 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i18);
                                        h1Var3.f93309h.setButtonRightLabel(gVarB.f34161a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar = h1Var3.f93333n;
                                        fVar.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                        dialogInterface.dismiss();
                                        h1Var3.p();
                                        h1Var3.f93336q.u2(fVar);
                                        break;
                                    default:
                                        int i111 = h1.f93331v;
                                        com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i18);
                                        h1Var3.f93310i.setButtonRightLabel(eVarB.f34149a);
                                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = h1Var3.f93332m;
                                        fVar2.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                        dialogInterface.dismiss();
                                        h1Var3.p();
                                        h1Var3.f93335p.r7(fVar2);
                                        break;
                                }
                            }
                        });
                        aVar2.create().show();
                        break;
                }
            }
        };
        this.f93338t = r15;
        this.f93310i.setOnClickListener(r15);
        return k(deviceSettingsDTO);
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO.L0()) {
            return deviceSettingsDTO.P0();
        }
        vb.h.s("Model is required");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean k(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f93333n;
        if (fVar2 == null || (fVar = this.f93332m) == null) {
            vb.h.s("Model is required");
            return false;
        }
        this.f70344b = deviceSettingsDTO;
        if (h(deviceSettingsDTO)) {
            this.f93306e.setButtonLeftLabel(this.f70343a.getString(R.string.moveiq_lbl));
            this.f93307f.setVisibility(0);
            this.f93308g.setButtonLeftLabel(this.f70343a.getString(R.string.auto_activity_start));
            int iIntValue = fVar2.D().intValue();
            int iIntValue2 = fVar.D().intValue();
            this.f93309h.setButtonLeftLabel(this.f70343a.getString(R.string.activity_options_walk_title));
            this.f93309h.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.g.a(iIntValue).f34161a);
            this.f93310i.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_run));
            this.f93310i.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.e.a(iIntValue2).f34149a);
            if (deviceSettingsDTO.L0()) {
                boolean zE1 = deviceSettingsDTO.e1();
                GCMComplexOneLineButton gCMComplexOneLineButton = this.f93306e;
                if (zE1) {
                    gCMComplexOneLineButton.setEnabled(true);
                    boolean zJ1 = deviceSettingsDTO.j1();
                    GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f93306e;
                    if (zJ1) {
                        gCMComplexOneLineButton2.k();
                        this.f93308g.setEnabled(true);
                    } else {
                        gCMComplexOneLineButton2.j();
                        this.f93308g.j();
                        this.f93308g.setEnabled(false);
                    }
                } else {
                    gCMComplexOneLineButton.j();
                    this.f93306e.setEnabled(false);
                    this.f93308g.j();
                    this.f93308g.setEnabled(false);
                }
                if (this.f93308g.isEnabled()) {
                    GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f93308g;
                    Boolean bool = deviceSettingsDTO.T0.f34191b;
                    gCMComplexOneLineButton3.i(bool != null ? bool.booleanValue() : false);
                }
                if (this.f93308g.isEnabled() && this.f93308g.f47771k.isChecked()) {
                    this.f93309h.setEnabled(true);
                    this.f93310i.setEnabled(true);
                    this.f93309h.setOnClickListener(this.f93337r);
                    this.f93310i.setOnClickListener(this.f93338t);
                } else {
                    this.f93309h.setEnabled(false);
                    this.f93310i.setEnabled(false);
                }
            }
        }
        return h(deviceSettingsDTO);
    }
}
