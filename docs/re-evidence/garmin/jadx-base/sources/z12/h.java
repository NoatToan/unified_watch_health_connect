package z12;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lz12/h;", "Lb32/a;", "Lb32/e;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends b32.a implements b32.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f201405b;

    static {
        new a(null);
    }

    @Override // b32.d
    public final RecyclerView.f0 a(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new j(viewGroup);
    }

    @Override // b32.d
    public final int b() {
        return 1;
    }

    @Override // b32.d
    public final b32.e c(b32.c cVar, int i14) {
        cVar.getClass();
        this.f201405b = new g((com.garmin.android.apps.connectmobile.userprofile.e) cVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b32.e
    public final void d(RecyclerView.f0 f0Var, int i14) {
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar;
        com.garmin.android.apps.connectmobile.userprofile.model.n nVarB;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar2;
        String displayName;
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList2;
        f0Var.getClass();
        final j jVar = (j) f0Var;
        final g gVar = this.f201405b;
        if (gVar == null) {
            p005kotlin.jvm.internal.s.m("dataProvider");
            throw null;
        }
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar = gVar.f201402a;
        FrameLayout frameLayout = jVar.f201418d;
        f fVar = jVar.f201420f;
        LinearLayout linearLayout = jVar.f201417c;
        TextView textView = jVar.f201419e;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar3 = aVar != null ? aVar.f46570a : null;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo = qVar3 != null ? qVar3.getUserInfo() : null;
        if ((aVar == null || !aVar.c()) && userInfo != null) {
            com.garmin.android.apps.connectmobile.userprofile.model.j jVarG = userInfo.getProfileImageUrls();
            if (jVarG == null) {
                p13.k0 k0Var = p13.k0.f134949a;
                k0Var.getClass();
                jVarG = new com.garmin.android.apps.connectmobile.userprofile.model.j(k0Var);
            }
            arrayList = null;
            fVar.f201394b = new com.garmin.android.apps.connectmobile.badges.service.model.p(0L, userInfo.b(), userInfo.getDisplayName(), jVarG.f46879h, jVarG.f46880i, Long.valueOf(userInfo.getUserLevel()), null, null, 192, null);
        } else {
            arrayList = null;
        }
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList3 = aVar != null ? aVar.f46571b : arrayList;
        if (fVar.f201393a != arrayList3) {
            fVar.f201393a = arrayList3;
            fVar.notifyDataSetChanged();
        }
        boolean z14 = false;
        int size = (aVar == null || (arrayList2 = aVar.f46571b) == null) ? 0 : arrayList2.size();
        v22.e.r(jVar.f201415a, size <= 0);
        v22.e.r(linearLayout, size > 0);
        if (aVar == null || !aVar.a()) {
            if (aVar != null) {
                qVar2 = aVar.f46570a;
            } else {
                qVar = arrayList;
            }
            if (qVar != 0 && (nVarB = qVar.b()) != null && nVarB.equals(com.garmin.android.apps.connectmobile.userprofile.model.n.PRIVATE)) {
                qVar = qVar2;
                z14 = true;
            }
        }
        qVar = qVar2;
        qVar = qVar2;
        qVar = qVar2;
        v22.e.r(frameLayout, z14);
        if (frameLayout.getVisibility() != 0 && linearLayout.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = jVar.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_normal);
        }
        if (aVar != null && aVar.c()) {
            textView.setText(R.string.lbl_all_badges);
            final int i15 = 0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: z12.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i16 = i15;
                    g gVar2 = gVar;
                    j jVar2 = jVar;
                    switch (i16) {
                        case 0:
                            j.a aVar2 = j.f201414h;
                            Context context = jVar2.itemView.getContext();
                            m12.r rVar = jVar2.f201421g;
                            Context context2 = jVar2.itemView.getContext();
                            context2.getClass();
                            com.garmin.android.apps.connectmobile.userprofile.e.a aVar3 = gVar2.f201402a;
                            context.startActivity(rVar.s(context2, aVar3 != null ? aVar3.f46570a : null, false));
                            break;
                        default:
                            j.a aVar4 = j.f201414h;
                            Context context3 = jVar2.itemView.getContext();
                            m12.r rVar2 = jVar2.f201421g;
                            Context context4 = jVar2.itemView.getContext();
                            context4.getClass();
                            com.garmin.android.apps.connectmobile.userprofile.e.a aVar5 = gVar2.f201402a;
                            context3.startActivity(rVar2.s(context4, aVar5 != null ? aVar5.f46570a : null, true));
                            break;
                    }
                }
            });
        } else if (userInfo == 0 || (displayName = userInfo.getDisplayName()) == null) {
            textView.setText("");
        } else {
            textView.setText(R.string.social_compare_badges);
            textView.setOnClickListener(new wv2.h(17, jVar, displayName));
        }
        final int i16 = 1;
        jVar.f201416b.setOnClickListener(new View.OnClickListener() { // from class: z12.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                g gVar2 = gVar;
                j jVar2 = jVar;
                switch (i17) {
                    case 0:
                        j.a aVar2 = j.f201414h;
                        Context context = jVar2.itemView.getContext();
                        m12.r rVar = jVar2.f201421g;
                        Context context2 = jVar2.itemView.getContext();
                        context2.getClass();
                        com.garmin.android.apps.connectmobile.userprofile.e.a aVar3 = gVar2.f201402a;
                        context.startActivity(rVar.s(context2, aVar3 != null ? aVar3.f46570a : null, false));
                        break;
                    default:
                        j.a aVar4 = j.f201414h;
                        Context context3 = jVar2.itemView.getContext();
                        m12.r rVar2 = jVar2.f201421g;
                        Context context4 = jVar2.itemView.getContext();
                        context4.getClass();
                        com.garmin.android.apps.connectmobile.userprofile.e.a aVar5 = gVar2.f201402a;
                        context3.startActivity(rVar2.s(context4, aVar5 != null ? aVar5.f46570a : null, true));
                        break;
                }
            }
        });
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
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.m> arrayList;
        com.garmin.android.apps.connectmobile.userprofile.model.n nVarB;
        g gVar = this.f201405b;
        if (gVar == null) {
            p005kotlin.jvm.internal.s.m("dataProvider");
            throw null;
        }
        com.garmin.android.apps.connectmobile.userprofile.e.a aVar = gVar.f201402a;
        if (aVar != null && aVar.f46572c) {
            if (aVar == null || !aVar.c()) {
                com.garmin.android.apps.connectmobile.userprofile.model.q qVar = aVar != null ? aVar.f46570a : null;
                if (qVar == null || (nVarB = qVar.b()) == null || !nVarB.equals(com.garmin.android.apps.connectmobile.userprofile.model.n.PRIVATE)) {
                    if (((aVar == null || (arrayList = aVar.f46571b) == null) ? 0 : arrayList.size()) > 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz12/h$a;", "", "<init>", "()V", "", "TYPE_ITEM", "I", "TYPE_COUNT", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
