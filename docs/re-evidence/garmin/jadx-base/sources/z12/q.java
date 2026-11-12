package z12;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz12/q;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f201461b;

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new r(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        if (!(cVar instanceof com.garmin.android.apps.connectmobile.userprofile.c)) {
            return null;
        }
        this.f201461b = new p((com.garmin.android.apps.connectmobile.userprofile.c) cVar);
        return this;
    }

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
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        j12.k kVar;
        y12.a aVar;
        f0Var.getClass();
        p pVar = this.f201461b;
        if (pVar == null || (kVar = pVar.f201458a.f46549b) == null) {
            return;
        }
        r rVar = f0Var instanceof r ? (r) f0Var : null;
        if (rVar != null) {
            Context context = rVar.itemView.getContext();
            List<String> listD = kVar.d();
            if (listD != null) {
                GridLayout gridLayout = rVar.f201480h;
                if (gridLayout == null) {
                    p005kotlin.jvm.internal.s.m("activitiesGrid");
                    throw null;
                }
                gridLayout.removeAllViews();
                int size = listD.size() % 3;
                int size2 = (listD.size() / 3) + (size != 0 ? 1 : 0);
                GridLayout gridLayout2 = rVar.f201480h;
                if (size2 == 0) {
                    if (gridLayout2 == null) {
                        p005kotlin.jvm.internal.s.m("activitiesGrid");
                        throw null;
                    }
                    gridLayout2.setRowCount(1);
                    GridLayout gridLayout3 = rVar.f201480h;
                    if (gridLayout3 == null) {
                        p005kotlin.jvm.internal.s.m("activitiesGrid");
                        throw null;
                    }
                    gridLayout3.setColumnCount(size);
                } else {
                    if (gridLayout2 == null) {
                        p005kotlin.jvm.internal.s.m("activitiesGrid");
                        throw null;
                    }
                    gridLayout2.setRowCount(size2);
                    GridLayout gridLayout4 = rVar.f201480h;
                    if (gridLayout4 == null) {
                        p005kotlin.jvm.internal.s.m("activitiesGrid");
                        throw null;
                    }
                    gridLayout4.setColumnCount(3);
                }
                for (String str : listD) {
                    y12.a.f194022d.getClass();
                    str.getClass();
                    y12.a[] aVarArrValues = y12.a.values();
                    int length = aVarArrValues.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            aVar = null;
                            break;
                        }
                        aVar = aVarArrValues[i15];
                        if (p005kotlin.jvm.internal.s.g(aVar.f194025a, str)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (aVar != null) {
                        context.getClass();
                        ImageView imageView = new ImageView(context);
                        GridLayout.n nVar = new GridLayout.n();
                        int dimension = (int) context.getResources().getDimension(R.dimen.icon_medium);
                        ((ViewGroup.MarginLayoutParams) nVar).width = dimension;
                        ((ViewGroup.MarginLayoutParams) nVar).height = dimension;
                        nVar.f7511b = GridLayout.l(Integer.MIN_VALUE, 1, GridLayout.f7446q, 1.0f);
                        nVar.f7510a = nVar.f7510a.a(GridLayout.d(17, false));
                        nVar.f7511b = nVar.f7511b.a(GridLayout.d(17, true));
                        int dimension2 = (int) context.getResources().getDimension(R.dimen.spacing_normal);
                        ((ViewGroup.MarginLayoutParams) nVar).topMargin = dimension2;
                        ((ViewGroup.MarginLayoutParams) nVar).bottomMargin = dimension2;
                        imageView.setLayoutParams(nVar);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        Drawable drawable = a7.b.getDrawable(context, aVar.f194026b);
                        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                        int color = a7.b.getColor(context, R.color.gcm_icon_secondary);
                        if (drawableMutate != null) {
                            drawableMutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                        }
                        imageView.setImageDrawable(drawableMutate);
                        imageView.setContentDescription(context.getString(aVar.f194027c));
                        imageView.setImportantForAccessibility(1);
                        if (c22.b.e(context)) {
                            Resources resources = context.getResources();
                            resources.getClass();
                            int iC = (int) c22.b.c(context, xy2.b.n(resources, 40.0f), 1.5f);
                            imageView.getLayoutParams().width = iC;
                            imageView.getLayoutParams().height = iC;
                        }
                        GridLayout gridLayout5 = rVar.f201480h;
                        if (gridLayout5 == null) {
                            p005kotlin.jvm.internal.s.m("activitiesGrid");
                            throw null;
                        }
                        gridLayout5.addView(imageView);
                    }
                }
            }
        }
    }

    @Override // b32.a, b32.d
    public final void e(b32.c cVar) {
        cVar.getClass();
    }

    @Override // b32.d
    public final int getItemCount() {
        return 1;
    }

    @Override // b32.d
    public final int getItemViewType(int i14) {
        return 0;
    }

    @Override // b32.a, b32.d
    /* JADX INFO: renamed from: isVisible */
    public final boolean getF120672c() {
        p pVar = this.f201461b;
        if (pVar != null) {
            j12.k kVar = pVar.f201458a.f46549b;
            List<String> listD = kVar != null ? kVar.d() : null;
            if (listD != null && listD.size() > 0) {
                return true;
            }
        }
        return false;
    }
}
