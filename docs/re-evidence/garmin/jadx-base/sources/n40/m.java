package n40;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import j10.q;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln40/m;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f123595m = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hc0.c f123596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f123597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f123598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f123599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f123600l;

    public m() {
        super(R.layout.compose_bottom_sheet_content, true, false, false, 12, null);
        j0 j0Var = j0.f134944a;
        this.f123598j = j0Var;
        this.f123600l = j0Var;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return (this.f123597i == this.f123599k && s.g(this.f123598j, this.f123600l)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        qe2.h hVar;
        com.garmin.android.library.mapsdkadapter.e z14;
        u20.g gVar;
        hc0.c cVar = this.f123596h;
        if (cVar != null) {
            boolean z15 = this.f123599k;
            ?? r14 = this.f123600l;
            q qVar = (q) cVar.f83232b;
            m40.g gVar2 = (m40.g) cVar.f83233c;
            m40.g.a aVar = m40.g.f116591h;
            r14.getClass();
            qVar.invoke(Boolean.valueOf(z15), r14);
            j40.c.C1850c c1850c = gVar2.f116592g;
            if (c1850c != null) {
                j40.c cVar2 = j40.c.this;
                cVar2.Y6().F3(new l40.a.j(z15));
                cVar2.Y6().F3(new l40.a.i(r14));
                cVar2.B7();
                qe2.h hVar2 = cVar2.f148294e;
                if (hVar2 != null) {
                    hVar2.y(!z15);
                }
                if (z15) {
                    qe2.h hVar3 = cVar2.f148294e;
                    float y14 = hVar3 != null ? hVar3.f144584a.getY() : 0.0f;
                    if (y14 >= 15.0f && (hVar = cVar2.f148294e) != null && (z14 = hVar.f144584a.getZ()) != null && (gVar = cVar2.f97020y) != 0) {
                        gVar.H1(z14, (int) y14, r14);
                    }
                }
            }
        }
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Bundle arguments = getArguments();
        boolean z14 = arguments != null ? arguments.getBoolean("isPointsOfInterestChecked") : false;
        Bundle arguments2 = getArguments();
        Iterable<String> stringArrayList = arguments2 != null ? arguments2.getStringArrayList("selectedPointsOfInterestTypes") : null;
        if (stringArrayList == null) {
            stringArrayList = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringArrayList) {
            com.garmin.android.apps.connectmobile.courses.model.h.a aVar = com.garmin.android.apps.connectmobile.courses.model.h.f32946d;
            str.getClass();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.courses.model.h hVarA = com.garmin.android.apps.connectmobile.courses.model.h.a.a(str);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        i53.c cVarE = i53.a.e(arrayList);
        this.f123597i = z14;
        this.f123598j = cVarE;
        this.f123599k = z14;
        this.f123600l = cVarE;
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_content_view);
        if (composeView != null) {
            composeView.setContent(new z3.e(-359102299, true, new l(z14, cVarE, this, 0)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_save);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        x0.f23314a.getClass();
        String str = x0.Hc;
        str.getClass();
        return g2.f(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ln40/m$a;", "", "<init>", "()V", "", "EXTRA_IS_CHECKED", "Ljava/lang/String;", "EXTRA_SELECTED_TYPES", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
