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
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class o extends f0 {
    public static final /* synthetic */ int C = 0;
    public final ArrayList<String> A;
    public l B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f93371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.f f93376r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ng1.m0 f93377t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ng1.p0 f93378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ng1.r0 f93379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ng1.n0 f93380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ng1.q0 f93381y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ng1.o0 f93382z;

    public o(Context context, com.garmin.android.apps.connectmobile.devices.model.f fVar, com.garmin.android.apps.connectmobile.devices.model.f fVar2, com.garmin.android.apps.connectmobile.devices.model.f fVar3, com.garmin.android.apps.connectmobile.devices.model.f fVar4, com.garmin.android.apps.connectmobile.devices.model.f fVar5, ng1.m0 m0Var, ng1.p0 p0Var, ng1.r0 r0Var, ng1.n0 n0Var, ng1.q0 q0Var, ng1.o0 o0Var, ArrayList<String> arrayList) {
        super(context);
        this.f93371m = context;
        this.f93372n = fVar;
        this.f93373o = fVar2;
        this.f93374p = fVar3;
        this.f93375q = fVar4;
        this.f93376r = fVar5;
        this.f93377t = m0Var;
        this.f93378v = p0Var;
        this.f93379w = r0Var;
        this.f93380x = n0Var;
        this.f93381y = q0Var;
        this.f93382z = o0Var;
        this.A = arrayList;
    }

    @Override // fb2.e
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.P0();
        }
        vb.h.s("Model is required");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v51, types: [android.widget.CompoundButton$OnCheckedChangeListener, ig1.l] */
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
    public final boolean g(i.c cVar, final DeviceSettingsDTO deviceSettingsDTO) {
        if (r()) {
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
        this.f93311j = (GCMComplexOneLineButton) this.f93305d.findViewById(R.id.thirdDetailBtn);
        this.f93312k = (GCMComplexOneLineButton) this.f93305d.findViewById(R.id.fourthDetailBtn);
        this.f93313l = (GCMComplexOneLineButton) this.f93305d.findViewById(R.id.fifthDetailBtn);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f93309h;
        ArrayList<String> arrayList = this.A;
        gCMComplexOneLineButton.setVisibility(arrayList.contains("WALK") ? 0 : 8);
        this.f93310i.setVisibility(arrayList.contains("RUN") ? 0 : 8);
        this.f93311j.setVisibility(arrayList.contains("BIKE") ? 0 : 8);
        this.f93312k.setVisibility(arrayList.contains("SWIM") ? 0 : 8);
        this.f93313l.setVisibility(arrayList.contains("ELLIPTICAL") ? 0 : 8);
        this.f93306e.h();
        this.f93306e.e();
        this.f93308g.h();
        this.f93308g.e();
        this.f93309h.h();
        this.f93309h.e();
        this.f93310i.h();
        this.f93310i.e();
        this.f93311j.h();
        this.f93311j.e();
        this.f93312k.h();
        this.f93312k.e();
        this.f93313l.h();
        this.f93313l.e();
        ((TextView) this.f93305d.findViewById(R.id.toggleBtnDescription)).setText(R.string.auto_activity_detection_subtext);
        final int i14 = 0;
        ?? r14 = new CompoundButton.OnCheckedChangeListener(this) { // from class: ig1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93355b;

            {
                this.f93355b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i15 = i14;
                DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
                o oVar = this.f93355b;
                switch (i15) {
                    case 0:
                        int i16 = o.C;
                        deviceSettingsDTO2.T0.f34190a = Boolean.valueOf(z14);
                        oVar.p();
                        oVar.k(deviceSettingsDTO2);
                        break;
                    default:
                        int i17 = o.C;
                        deviceSettingsDTO2.T0.f34191b = Boolean.valueOf(z14);
                        oVar.p();
                        oVar.f93377t.b(deviceSettingsDTO2.T0);
                        oVar.k(deviceSettingsDTO2);
                        break;
                }
            }
        };
        this.B = r14;
        this.f93306e.setOnCheckedChangeListener(r14);
        final int i15 = 1;
        this.f93308g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: ig1.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93355b;

            {
                this.f93355b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i16 = i15;
                DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
                o oVar = this.f93355b;
                switch (i16) {
                    case 0:
                        int i17 = o.C;
                        deviceSettingsDTO2.T0.f34190a = Boolean.valueOf(z14);
                        oVar.p();
                        oVar.k(deviceSettingsDTO2);
                        break;
                    default:
                        int i18 = o.C;
                        deviceSettingsDTO2.T0.f34191b = Boolean.valueOf(z14);
                        oVar.p();
                        oVar.f93377t.b(deviceSettingsDTO2.T0);
                        oVar.k(deviceSettingsDTO2);
                        break;
                }
            }
        });
        final int i16 = 0;
        this.f93309h.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93367b;

            {
                this.f93367b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        final o oVar = this.f93367b;
                        Context context = oVar.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar = oVar.f93373o;
                        if (fVar != null) {
                            int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(fVar.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
                            final int i17 = 0;
                            aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar2;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i19 = i17;
                                    o oVar2 = oVar;
                                    switch (i19) {
                                        case 0:
                                            int i24 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i18);
                                            oVar2.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar2 = oVar2.f93373o;
                                            fVar2.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar2.p();
                                            oVar2.f93379w.u2(fVar2);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar2.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i18 != -1) {
                                                w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                                                while (bVarN.hasNext()) {
                                                    cVar2 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar2.ordinal() == i18) {
                                                    }
                                                }
                                                cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar2.f93311j.setButtonRightLabel(cVar2.f34137a);
                                            fVar3.y1("autoActivityStartThreshold", Integer.valueOf(cVar2.f34138b));
                                            dialogInterface.dismiss();
                                            oVar2.p();
                                            oVar2.f93380x.c8(fVar3);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar2.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i18 != -1) {
                                                w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i18) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar2.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar4.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar2.p();
                                            oVar2.f93381y.R8(fVar4);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar2.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i18 != -1) {
                                                w13.c cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i18) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar2.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar5.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar2.p();
                                            oVar2.f93382z.k9(fVar5);
                                            break;
                                        default:
                                            int i25 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i18);
                                            oVar2.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar2.f93372n;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar2.p();
                                            oVar2.f93378v.r7(fVar6);
                                            break;
                                    }
                                }
                            });
                            aVar.create().show();
                        }
                        break;
                    case 1:
                        final o oVar2 = this.f93367b;
                        Context context2 = oVar2.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = oVar2.f93372n;
                        if (fVar2 != null) {
                            int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(fVar2.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(context2);
                            final int i18 = 4;
                            aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar2;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i110 = i18;
                                    o oVar3 = oVar2;
                                    switch (i110) {
                                        case 0:
                                            int i24 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i19);
                                            oVar3.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar3.f93373o;
                                            fVar3.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar3.p();
                                            oVar3.f93379w.u2(fVar3);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar3.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i19 != -1) {
                                                w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                                                while (bVarN.hasNext()) {
                                                    cVar2 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar2.ordinal() == i19) {
                                                    }
                                                }
                                                cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar3.f93311j.setButtonRightLabel(cVar2.f34137a);
                                            fVar4.y1("autoActivityStartThreshold", Integer.valueOf(cVar2.f34138b));
                                            dialogInterface.dismiss();
                                            oVar3.p();
                                            oVar3.f93380x.c8(fVar4);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar3.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i19 != -1) {
                                                w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i19) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar3.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar5.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar3.p();
                                            oVar3.f93381y.R8(fVar5);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar3.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i19 != -1) {
                                                w13.c cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i19) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar3.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar3.p();
                                            oVar3.f93382z.k9(fVar6);
                                            break;
                                        default:
                                            int i25 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i19);
                                            oVar3.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar3.f93372n;
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar3.p();
                                            oVar3.f93378v.r7(fVar7);
                                            break;
                                    }
                                }
                            });
                            aVar2.create().show();
                        }
                        break;
                    case 2:
                        final o oVar3 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar3.f93374p;
                        if (fVar3 != null) {
                            int iOrdinal3 = com.garmin.android.apps.connectmobile.devices.model.f.c.a(fVar3.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                            w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                            CharSequence[] charSequenceArr = new CharSequence[cVar2.getF134973e()];
                            int length = cVar2.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.c[0]).length;
                            for (int i19 = 0; i19 < length; i19++) {
                                charSequenceArr[i19] = ((com.garmin.android.apps.connectmobile.devices.model.f.c) cVar2.get(i19)).f34137a;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(oVar3.f93371m);
                            final int i24 = 1;
                            aVar3.setTitle(R.string.lbl_bike).setSingleChoiceItems(charSequenceArr, iOrdinal3, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar3;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i111 = i24;
                                    o oVar4 = oVar3;
                                    switch (i111) {
                                        case 0:
                                            int i25 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i110);
                                            oVar4.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar4.f93373o;
                                            fVar4.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar4.p();
                                            oVar4.f93379w.u2(fVar4);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar4.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                                                while (bVarN.hasNext()) {
                                                    cVar3 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar3.ordinal() == i110) {
                                                    }
                                                }
                                                cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar4.f93311j.setButtonRightLabel(cVar3.f34137a);
                                            fVar5.y1("autoActivityStartThreshold", Integer.valueOf(cVar3.f34138b));
                                            dialogInterface.dismiss();
                                            oVar4.p();
                                            oVar4.f93380x.c8(fVar5);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar4.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i110) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar4.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar4.p();
                                            oVar4.f93381y.R8(fVar6);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar4.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i110) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar4.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar4.p();
                                            oVar4.f93382z.k9(fVar7);
                                            break;
                                        default:
                                            int i26 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i110);
                                            oVar4.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar4.f93372n;
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar4.p();
                                            oVar4.f93378v.r7(fVar8);
                                            break;
                                    }
                                }
                            });
                            aVar3.create().show();
                        }
                        break;
                    case 3:
                        final o oVar4 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar4.f93375q;
                        if (fVar4 != null) {
                            int iOrdinal4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.a(fVar4.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                            w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                            CharSequence[] charSequenceArr2 = new CharSequence[cVar3.getF134973e()];
                            int length2 = cVar3.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f[0]).length;
                            for (int i25 = 0; i25 < length2; i25++) {
                                charSequenceArr2[i25] = ((com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) cVar3.get(i25)).f34155a;
                            }
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(oVar4.f93371m);
                            final int i26 = 2;
                            aVar4.setTitle(R.string.lbl_swim).setSingleChoiceItems(charSequenceArr2, iOrdinal4, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar4;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i111 = i26;
                                    o oVar5 = oVar4;
                                    switch (i111) {
                                        case 0:
                                            int i27 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i110);
                                            oVar5.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar5.f93373o;
                                            fVar5.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar5.p();
                                            oVar5.f93379w.u2(fVar5);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar5.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                                                while (bVarN.hasNext()) {
                                                    cVar4 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar4.ordinal() == i110) {
                                                    }
                                                }
                                                cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar5.f93311j.setButtonRightLabel(cVar4.f34137a);
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(cVar4.f34138b));
                                            dialogInterface.dismiss();
                                            oVar5.p();
                                            oVar5.f93380x.c8(fVar6);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar5.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i110) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar5.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar5.p();
                                            oVar5.f93381y.R8(fVar7);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar5.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i110) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar5.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar5.p();
                                            oVar5.f93382z.k9(fVar8);
                                            break;
                                        default:
                                            int i28 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i110);
                                            oVar5.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar5.f93372n;
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar5.p();
                                            oVar5.f93378v.r7(fVar9);
                                            break;
                                    }
                                }
                            });
                            aVar4.create().show();
                        }
                        break;
                    default:
                        final o oVar5 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar5.f93376r;
                        if (fVar5 != null) {
                            int iOrdinal5 = com.garmin.android.apps.connectmobile.devices.model.f.d.a(fVar5.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                            w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                            CharSequence[] charSequenceArr3 = new CharSequence[cVar4.getF134973e()];
                            int length3 = cVar4.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.d[0]).length;
                            for (int i27 = 0; i27 < length3; i27++) {
                                charSequenceArr3[i27] = ((com.garmin.android.apps.connectmobile.devices.model.f.d) cVar4.get(i27)).f34143a;
                            }
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(oVar5.f93371m);
                            final int i28 = 3;
                            aVar5.setTitle(R.string.lbl_elliptical).setSingleChoiceItems(charSequenceArr3, iOrdinal5, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i111 = i28;
                                    o oVar6 = oVar5;
                                    switch (i111) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i110);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i110) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i110) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i110) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i110);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar5.create().show();
                        }
                        break;
                }
            }
        });
        final int i17 = 1;
        this.f93310i.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93367b;

            {
                this.f93367b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        final o oVar = this.f93367b;
                        Context context = oVar.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar = oVar.f93373o;
                        if (fVar != null) {
                            int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(fVar.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
                            final int i18 = 0;
                            aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i111 = i18;
                                    o oVar6 = oVar;
                                    switch (i111) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i110);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i110) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i110) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i110) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i110);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar.create().show();
                        }
                        break;
                    case 1:
                        final o oVar2 = this.f93367b;
                        Context context2 = oVar2.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = oVar2.f93372n;
                        if (fVar2 != null) {
                            int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(fVar2.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(context2);
                            final int i19 = 4;
                            aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i110) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i111 = i19;
                                    o oVar6 = oVar2;
                                    switch (i111) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i110);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i110) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i110) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i110 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i110) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i110);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar2.create().show();
                        }
                        break;
                    case 2:
                        final o oVar3 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar3.f93374p;
                        if (fVar3 != null) {
                            int iOrdinal3 = com.garmin.android.apps.connectmobile.devices.model.f.c.a(fVar3.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                            w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                            CharSequence[] charSequenceArr = new CharSequence[cVar2.getF134973e()];
                            int length = cVar2.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.c[0]).length;
                            for (int i110 = 0; i110 < length; i110++) {
                                charSequenceArr[i110] = ((com.garmin.android.apps.connectmobile.devices.model.f.c) cVar2.get(i110)).f34137a;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(oVar3.f93371m);
                            final int i24 = 1;
                            aVar3.setTitle(R.string.lbl_bike).setSingleChoiceItems(charSequenceArr, iOrdinal3, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i112 = i24;
                                    o oVar6 = oVar3;
                                    switch (i112) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i111);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i111) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i111) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i111) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i111);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar3.create().show();
                        }
                        break;
                    case 3:
                        final o oVar4 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar4.f93375q;
                        if (fVar4 != null) {
                            int iOrdinal4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.a(fVar4.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                            w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                            CharSequence[] charSequenceArr2 = new CharSequence[cVar3.getF134973e()];
                            int length2 = cVar3.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f[0]).length;
                            for (int i25 = 0; i25 < length2; i25++) {
                                charSequenceArr2[i25] = ((com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) cVar3.get(i25)).f34155a;
                            }
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(oVar4.f93371m);
                            final int i26 = 2;
                            aVar4.setTitle(R.string.lbl_swim).setSingleChoiceItems(charSequenceArr2, iOrdinal4, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i112 = i26;
                                    o oVar6 = oVar4;
                                    switch (i112) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i111);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i111) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i111) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i111) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i111);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar4.create().show();
                        }
                        break;
                    default:
                        final o oVar5 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar5.f93376r;
                        if (fVar5 != null) {
                            int iOrdinal5 = com.garmin.android.apps.connectmobile.devices.model.f.d.a(fVar5.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                            w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                            CharSequence[] charSequenceArr3 = new CharSequence[cVar4.getF134973e()];
                            int length3 = cVar4.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.d[0]).length;
                            for (int i27 = 0; i27 < length3; i27++) {
                                charSequenceArr3[i27] = ((com.garmin.android.apps.connectmobile.devices.model.f.d) cVar4.get(i27)).f34143a;
                            }
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(oVar5.f93371m);
                            final int i28 = 3;
                            aVar5.setTitle(R.string.lbl_elliptical).setSingleChoiceItems(charSequenceArr3, iOrdinal5, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i112 = i28;
                                    o oVar6 = oVar5;
                                    switch (i112) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i111);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i111) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i111) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i111) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i111);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar5.create().show();
                        }
                        break;
                }
            }
        });
        final int i18 = 2;
        this.f93311j.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93367b;

            {
                this.f93367b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        final o oVar = this.f93367b;
                        Context context = oVar.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar = oVar.f93373o;
                        if (fVar != null) {
                            int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(fVar.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
                            final int i19 = 0;
                            aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i112 = i19;
                                    o oVar6 = oVar;
                                    switch (i112) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i111);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i111) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i111) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i111) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i111);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar.create().show();
                        }
                        break;
                    case 1:
                        final o oVar2 = this.f93367b;
                        Context context2 = oVar2.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = oVar2.f93372n;
                        if (fVar2 != null) {
                            int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(fVar2.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(context2);
                            final int i110 = 4;
                            aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i111) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i112 = i110;
                                    o oVar6 = oVar2;
                                    switch (i112) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i111);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i111) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i111) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i111 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i111) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i111);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar2.create().show();
                        }
                        break;
                    case 2:
                        final o oVar3 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar3.f93374p;
                        if (fVar3 != null) {
                            int iOrdinal3 = com.garmin.android.apps.connectmobile.devices.model.f.c.a(fVar3.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                            w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                            CharSequence[] charSequenceArr = new CharSequence[cVar2.getF134973e()];
                            int length = cVar2.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.c[0]).length;
                            for (int i111 = 0; i111 < length; i111++) {
                                charSequenceArr[i111] = ((com.garmin.android.apps.connectmobile.devices.model.f.c) cVar2.get(i111)).f34137a;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(oVar3.f93371m);
                            final int i24 = 1;
                            aVar3.setTitle(R.string.lbl_bike).setSingleChoiceItems(charSequenceArr, iOrdinal3, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i112) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i113 = i24;
                                    o oVar6 = oVar3;
                                    switch (i113) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i112);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i112) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i112) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i112) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i112);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar3.create().show();
                        }
                        break;
                    case 3:
                        final o oVar4 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar4.f93375q;
                        if (fVar4 != null) {
                            int iOrdinal4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.a(fVar4.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                            w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                            CharSequence[] charSequenceArr2 = new CharSequence[cVar3.getF134973e()];
                            int length2 = cVar3.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f[0]).length;
                            for (int i25 = 0; i25 < length2; i25++) {
                                charSequenceArr2[i25] = ((com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) cVar3.get(i25)).f34155a;
                            }
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(oVar4.f93371m);
                            final int i26 = 2;
                            aVar4.setTitle(R.string.lbl_swim).setSingleChoiceItems(charSequenceArr2, iOrdinal4, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i112) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i113 = i26;
                                    o oVar6 = oVar4;
                                    switch (i113) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i112);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i112) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i112) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i112) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i112);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar4.create().show();
                        }
                        break;
                    default:
                        final o oVar5 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar5.f93376r;
                        if (fVar5 != null) {
                            int iOrdinal5 = com.garmin.android.apps.connectmobile.devices.model.f.d.a(fVar5.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                            w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                            CharSequence[] charSequenceArr3 = new CharSequence[cVar4.getF134973e()];
                            int length3 = cVar4.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.d[0]).length;
                            for (int i27 = 0; i27 < length3; i27++) {
                                charSequenceArr3[i27] = ((com.garmin.android.apps.connectmobile.devices.model.f.d) cVar4.get(i27)).f34143a;
                            }
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(oVar5.f93371m);
                            final int i28 = 3;
                            aVar5.setTitle(R.string.lbl_elliptical).setSingleChoiceItems(charSequenceArr3, iOrdinal5, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i112) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i113 = i28;
                                    o oVar6 = oVar5;
                                    switch (i113) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i112);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i112) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i112) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i112) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i112);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar5.create().show();
                        }
                        break;
                }
            }
        });
        final int i19 = 3;
        this.f93312k.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93367b;

            {
                this.f93367b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        final o oVar = this.f93367b;
                        Context context = oVar.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar = oVar.f93373o;
                        if (fVar != null) {
                            int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(fVar.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
                            final int i110 = 0;
                            aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i112) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i113 = i110;
                                    o oVar6 = oVar;
                                    switch (i113) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i112);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i112) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i112) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i112) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i112);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar.create().show();
                        }
                        break;
                    case 1:
                        final o oVar2 = this.f93367b;
                        Context context2 = oVar2.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = oVar2.f93372n;
                        if (fVar2 != null) {
                            int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(fVar2.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(context2);
                            final int i111 = 4;
                            aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i112) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i113 = i111;
                                    o oVar6 = oVar2;
                                    switch (i113) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i112);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i112) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i112) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i112 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i112) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i112);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar2.create().show();
                        }
                        break;
                    case 2:
                        final o oVar3 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar3.f93374p;
                        if (fVar3 != null) {
                            int iOrdinal3 = com.garmin.android.apps.connectmobile.devices.model.f.c.a(fVar3.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                            w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                            CharSequence[] charSequenceArr = new CharSequence[cVar2.getF134973e()];
                            int length = cVar2.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.c[0]).length;
                            for (int i112 = 0; i112 < length; i112++) {
                                charSequenceArr[i112] = ((com.garmin.android.apps.connectmobile.devices.model.f.c) cVar2.get(i112)).f34137a;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(oVar3.f93371m);
                            final int i24 = 1;
                            aVar3.setTitle(R.string.lbl_bike).setSingleChoiceItems(charSequenceArr, iOrdinal3, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i24;
                                    o oVar6 = oVar3;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar3.create().show();
                        }
                        break;
                    case 3:
                        final o oVar4 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar4.f93375q;
                        if (fVar4 != null) {
                            int iOrdinal4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.a(fVar4.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                            w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                            CharSequence[] charSequenceArr2 = new CharSequence[cVar3.getF134973e()];
                            int length2 = cVar3.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f[0]).length;
                            for (int i25 = 0; i25 < length2; i25++) {
                                charSequenceArr2[i25] = ((com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) cVar3.get(i25)).f34155a;
                            }
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(oVar4.f93371m);
                            final int i26 = 2;
                            aVar4.setTitle(R.string.lbl_swim).setSingleChoiceItems(charSequenceArr2, iOrdinal4, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i26;
                                    o oVar6 = oVar4;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar4.create().show();
                        }
                        break;
                    default:
                        final o oVar5 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar5.f93376r;
                        if (fVar5 != null) {
                            int iOrdinal5 = com.garmin.android.apps.connectmobile.devices.model.f.d.a(fVar5.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                            w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                            CharSequence[] charSequenceArr3 = new CharSequence[cVar4.getF134973e()];
                            int length3 = cVar4.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.d[0]).length;
                            for (int i27 = 0; i27 < length3; i27++) {
                                charSequenceArr3[i27] = ((com.garmin.android.apps.connectmobile.devices.model.f.d) cVar4.get(i27)).f34143a;
                            }
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(oVar5.f93371m);
                            final int i28 = 3;
                            aVar5.setTitle(R.string.lbl_elliptical).setSingleChoiceItems(charSequenceArr3, iOrdinal5, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i28;
                                    o oVar6 = oVar5;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar5.create().show();
                        }
                        break;
                }
            }
        });
        final int i24 = 4;
        this.f93313l.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f93367b;

            {
                this.f93367b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i24) {
                    case 0:
                        final o oVar = this.f93367b;
                        Context context = oVar.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar = oVar.f93373o;
                        if (fVar != null) {
                            int iOrdinal = com.garmin.android.apps.connectmobile.devices.model.f.g.a(fVar.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC = com.garmin.android.apps.connectmobile.devices.model.f.g.c();
                            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
                            final int i110 = 0;
                            aVar.setTitle(R.string.activity_options_walk_title).setSingleChoiceItems(charSequenceArrC, iOrdinal, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i110;
                                    o oVar6 = oVar;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar.create().show();
                        }
                        break;
                    case 1:
                        final o oVar2 = this.f93367b;
                        Context context2 = oVar2.f93371m;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = oVar2.f93372n;
                        if (fVar2 != null) {
                            int iOrdinal2 = com.garmin.android.apps.connectmobile.devices.model.f.e.a(fVar2.D().intValue()).ordinal();
                            CharSequence[] charSequenceArrC2 = com.garmin.android.apps.connectmobile.devices.model.f.e.c();
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(context2);
                            final int i111 = 4;
                            aVar2.setTitle(R.string.lbl_run).setSingleChoiceItems(charSequenceArrC2, iOrdinal2, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i111;
                                    o oVar6 = oVar2;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar2.create().show();
                        }
                        break;
                    case 2:
                        final o oVar3 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar3 = oVar3.f93374p;
                        if (fVar3 != null) {
                            int iOrdinal3 = com.garmin.android.apps.connectmobile.devices.model.f.c.a(fVar3.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                            w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                            CharSequence[] charSequenceArr = new CharSequence[cVar2.getF134973e()];
                            int length = cVar2.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.c[0]).length;
                            for (int i112 = 0; i112 < length; i112++) {
                                charSequenceArr[i112] = ((com.garmin.android.apps.connectmobile.devices.model.f.c) cVar2.get(i112)).f34137a;
                            }
                            androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(oVar3.f93371m);
                            final int i25 = 1;
                            aVar3.setTitle(R.string.lbl_bike).setSingleChoiceItems(charSequenceArr, iOrdinal3, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i25;
                                    o oVar6 = oVar3;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar3.create().show();
                        }
                        break;
                    case 3:
                        final o oVar4 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar4 = oVar4.f93375q;
                        if (fVar4 != null) {
                            int iOrdinal4 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.a(fVar4.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                            w13.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                            CharSequence[] charSequenceArr2 = new CharSequence[cVar3.getF134973e()];
                            int length2 = cVar3.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f[0]).length;
                            for (int i26 = 0; i26 < length2; i26++) {
                                charSequenceArr2[i26] = ((com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) cVar3.get(i26)).f34155a;
                            }
                            androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(oVar4.f93371m);
                            final int i27 = 2;
                            aVar4.setTitle(R.string.lbl_swim).setSingleChoiceItems(charSequenceArr2, iOrdinal4, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i27;
                                    o oVar6 = oVar4;
                                    switch (i114) {
                                        case 0:
                                            int i29 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar4.create().show();
                        }
                        break;
                    default:
                        final o oVar5 = this.f93367b;
                        com.garmin.android.apps.connectmobile.devices.model.f fVar5 = oVar5.f93376r;
                        if (fVar5 != null) {
                            int iOrdinal5 = com.garmin.android.apps.connectmobile.devices.model.f.d.a(fVar5.D().intValue()).ordinal();
                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                            w13.c cVar4 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                            CharSequence[] charSequenceArr3 = new CharSequence[cVar4.getF134973e()];
                            int length3 = cVar4.toArray(new com.garmin.android.apps.connectmobile.devices.model.f.d[0]).length;
                            for (int i28 = 0; i28 < length3; i28++) {
                                charSequenceArr3[i28] = ((com.garmin.android.apps.connectmobile.devices.model.f.d) cVar4.get(i28)).f34143a;
                            }
                            androidx.appcompat.app.e.a aVar5 = new androidx.appcompat.app.e.a(oVar5.f93371m);
                            final int i29 = 3;
                            aVar5.setTitle(R.string.lbl_elliptical).setSingleChoiceItems(charSequenceArr3, iOrdinal5, new DialogInterface.OnClickListener() { // from class: ig1.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i113) {
                                    com.garmin.android.apps.connectmobile.devices.model.f.c cVar5;
                                    com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f enumC0577f;
                                    com.garmin.android.apps.connectmobile.devices.model.f.d dVar;
                                    int i114 = i29;
                                    o oVar6 = oVar5;
                                    switch (i114) {
                                        case 0:
                                            int i210 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.g gVarB = com.garmin.android.apps.connectmobile.devices.model.f.g.b(i113);
                                            oVar6.f93309h.setButtonRightLabel(gVarB.f34161a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar6 = oVar6.f93373o;
                                            fVar6.y1("autoActivityStartThreshold", Integer.valueOf(gVarB.f34162b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93379w.u2(fVar6);
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar7 = oVar6.f93374p;
                                            com.garmin.android.apps.connectmobile.devices.model.f.c.f34133c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar6 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34136f;
                                                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar6, cVar6);
                                                while (bVarN.hasNext()) {
                                                    cVar5 = (com.garmin.android.apps.connectmobile.devices.model.f.c) bVarN.next();
                                                    if (cVar5.ordinal() == i113) {
                                                    }
                                                }
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            } else {
                                                cVar5 = com.garmin.android.apps.connectmobile.devices.model.f.c.f34134d;
                                            }
                                            oVar6.f93311j.setButtonRightLabel(cVar5.f34137a);
                                            fVar7.y1("autoActivityStartThreshold", Integer.valueOf(cVar5.f34138b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93380x.c8(fVar7);
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar8 = oVar6.f93375q;
                                            com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34151c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar7 = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34154f;
                                                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar7, cVar7);
                                                while (bVarN2.hasNext()) {
                                                    enumC0577f = (com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f) bVarN2.next();
                                                    if (enumC0577f.ordinal() == i113) {
                                                    }
                                                }
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            } else {
                                                enumC0577f = com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.f34152d;
                                            }
                                            oVar6.f93312k.setButtonRightLabel(enumC0577f.f34155a);
                                            fVar8.y1("autoActivityStartThreshold", Integer.valueOf(enumC0577f.f34156b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93381y.R8(fVar8);
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar9 = oVar6.f93376r;
                                            com.garmin.android.apps.connectmobile.devices.model.f.d.f34139c.getClass();
                                            if (i113 != -1) {
                                                w13.c cVar8 = com.garmin.android.apps.connectmobile.devices.model.f.d.f34142f;
                                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar8, cVar8);
                                                while (bVarN3.hasNext()) {
                                                    dVar = (com.garmin.android.apps.connectmobile.devices.model.f.d) bVarN3.next();
                                                    if (dVar.ordinal() == i113) {
                                                    }
                                                }
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            } else {
                                                dVar = com.garmin.android.apps.connectmobile.devices.model.f.d.f34140d;
                                            }
                                            oVar6.f93313l.setButtonRightLabel(dVar.f34143a);
                                            fVar9.y1("autoActivityStartThreshold", Integer.valueOf(dVar.f34144b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93382z.k9(fVar9);
                                            break;
                                        default:
                                            int i211 = o.C;
                                            com.garmin.android.apps.connectmobile.devices.model.f.e eVarB = com.garmin.android.apps.connectmobile.devices.model.f.e.b(i113);
                                            oVar6.f93310i.setButtonRightLabel(eVarB.f34149a);
                                            com.garmin.android.apps.connectmobile.devices.model.f fVar10 = oVar6.f93372n;
                                            fVar10.y1("autoActivityStartThreshold", Integer.valueOf(eVarB.f34150b));
                                            dialogInterface.dismiss();
                                            oVar6.p();
                                            oVar6.f93378v.r7(fVar10);
                                            break;
                                    }
                                }
                            });
                            aVar5.create().show();
                        }
                        break;
                }
            }
        });
        return k(deviceSettingsDTO);
    }

    public final boolean r() {
        ArrayList<String> arrayList = this.A;
        if (arrayList.contains("WALK") && this.f93373o == null) {
            return true;
        }
        if (arrayList.contains("RUN") && this.f93372n == null) {
            return true;
        }
        if (arrayList.contains("BIKE") && this.f93374p == null) {
            return true;
        }
        if (arrayList.contains("SWIM") && this.f93375q == null) {
            return true;
        }
        return arrayList.contains("ELLIPTICAL") && this.f93376r == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean k(DeviceSettingsDTO deviceSettingsDTO) {
        if (r()) {
            vb.h.s("Model is required");
            return false;
        }
        this.f70344b = deviceSettingsDTO;
        if (deviceSettingsDTO == 0) {
            vb.h.s("Model is required");
            return false;
        }
        if (deviceSettingsDTO.P0()) {
            this.f93306e.setButtonLeftLabel(this.f70343a.getString(R.string.moveiq_lbl));
            boolean z14 = false;
            this.f93307f.setVisibility(0);
            this.f93308g.setButtonLeftLabel(this.f70343a.getString(R.string.auto_activity_start));
            com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f93373o;
            if (fVar != null) {
                this.f93309h.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.g.a(fVar.D().intValue()).f34161a);
            }
            com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f93372n;
            if (fVar2 != null) {
                this.f93310i.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.e.a(fVar2.D().intValue()).f34149a);
            }
            com.garmin.android.apps.connectmobile.devices.model.f fVar3 = this.f93374p;
            if (fVar3 != null) {
                this.f93311j.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.c.a(fVar3.D().intValue()).f34137a);
            }
            com.garmin.android.apps.connectmobile.devices.model.f fVar4 = this.f93375q;
            if (fVar4 != null) {
                this.f93312k.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.EnumC0577f.a(fVar4.D().intValue()).f34155a);
            }
            com.garmin.android.apps.connectmobile.devices.model.f fVar5 = this.f93376r;
            if (fVar5 != null) {
                this.f93313l.setButtonRightLabel(com.garmin.android.apps.connectmobile.devices.model.f.d.a(fVar5.D().intValue()).f34143a);
            }
            this.f93309h.setButtonLeftLabel(this.f70343a.getString(R.string.activity_options_walk_title));
            this.f93310i.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_run));
            this.f93311j.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_bike));
            this.f93312k.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_swim));
            this.f93313l.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_elliptical));
            this.f93306e.setOnCheckedChangeListener(null);
            if (!deviceSettingsDTO.L0() || deviceSettingsDTO.e1()) {
                this.f93306e.setEnabled(true);
                boolean zJ1 = deviceSettingsDTO.j1();
                GCMComplexOneLineButton gCMComplexOneLineButton = this.f93306e;
                if (zJ1) {
                    gCMComplexOneLineButton.k();
                    this.f93308g.setEnabled(true);
                    GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f93308g;
                    Boolean bool = deviceSettingsDTO.T0.f34191b;
                    gCMComplexOneLineButton2.i(bool != null ? bool.booleanValue() : false);
                } else {
                    gCMComplexOneLineButton.j();
                    this.f93308g.j();
                    this.f93308g.setEnabled(false);
                }
            } else {
                this.f93306e.j();
                this.f93306e.setEnabled(false);
                this.f93308g.j();
                this.f93308g.setEnabled(false);
            }
            this.f93306e.setOnCheckedChangeListener(this.B);
            if (this.f93308g.isEnabled() && this.f93308g.f47771k.isChecked()) {
                z14 = true;
            }
            this.f93309h.setEnabled(z14);
            this.f93310i.setEnabled(z14);
            this.f93311j.setEnabled(z14);
            this.f93312k.setEnabled(z14);
            this.f93313l.setEnabled(z14);
        }
        return deviceSettingsDTO.P0();
    }
}
