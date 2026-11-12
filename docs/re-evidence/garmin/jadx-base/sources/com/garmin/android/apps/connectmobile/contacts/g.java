package com.garmin.android.apps.connectmobile.contacts;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import c22.o1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import d53.y;
import f20.o;
import java.util.ArrayList;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000b\f\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/contacts/g$b;", "itemClickListener", "", "multipleSelectionEnabled", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/contacts/g$b;Z)V", "b", "c", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f32712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f32714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.browser.trusted.c f32715e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/g$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/g;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserLevelImageView f32716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f32718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CheckBox f32719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f32720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g f32721f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32721f = gVar;
            UserLevelImageView userLevelImageView = (UserLevelImageView) view2.findViewById(R.id.contact_img);
            this.f32716a = userLevelImageView;
            this.f32717b = (TextView) view2.findViewById(R.id.contact_name);
            this.f32718c = (TextView) view2.findViewById(R.id.contact_profile_details);
            CheckBox checkBox = (CheckBox) view2.findViewById(R.id.contact_checkbox);
            this.f32719d = checkBox;
            View viewFindViewById = view2.findViewById(R.id.contact_info_warning);
            this.f32720e = viewFindViewById;
            if (c22.b.e(gVar.f32711a)) {
                Context context = view2.getContext();
                context.getClass();
                Resources resources = view2.getContext().getResources();
                resources.getClass();
                int iC = (int) c22.b.c(context, xy2.b.n(resources, 40.0f), 1.5f);
                userLevelImageView.getLayoutParams().height = iC;
                userLevelImageView.getLayoutParams().width = iC;
                Context context2 = view2.getContext();
                context2.getClass();
                Resources resources2 = view2.getContext().getResources();
                resources2.getClass();
                int iC2 = (int) c22.b.c(context2, xy2.b.n(resources2, 24.0f), 1.8f);
                viewFindViewById.getLayoutParams().height = iC2;
                viewFindViewById.getLayoutParams().width = iC2;
            }
            checkBox.setClickable(false);
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            g gVar = this.f32721f;
            b bVar = gVar.f32712b;
            if (bVar != null) {
                o oVar = (o) gVar.f32714d.get(getBindingAdapterPosition());
                CheckBox checkBox = this.f32719d;
                checkBox.getClass();
                bVar.B(oVar, checkBox);
            }
        }
    }

    public interface b {
        void B(o oVar, CheckBox checkBox);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/g$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/g;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f32722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f32723b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32723b = gVar;
            this.f32722a = (TextView) view2;
        }
    }

    public g(Context context, b bVar, boolean z14) {
        context.getClass();
        this.f32711a = context;
        this.f32712b = bVar;
        this.f32713c = z14;
        this.f32714d = new ArrayList();
        this.f32715e = new androidx.browser.trusted.c(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f32714d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return ((o) this.f32714d.get(i14)).f68412h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        if (f0Var instanceof c) {
            c cVar = (c) f0Var;
            cVar.f32722a.setText(((o) cVar.f32723b.f32714d.get(i14)).f68408d);
            return;
        }
        if (f0Var instanceof a) {
            a aVar = (a) f0Var;
            TextView textView = aVar.f32718c;
            View view2 = aVar.f32720e;
            g gVar = aVar.f32721f;
            CheckBox checkBox = aVar.f32719d;
            checkBox.getClass();
            Context context = checkBox.getContext();
            context.getClass();
            if (c22.b.e(context)) {
                Context context2 = checkBox.getContext();
                context2.getClass();
                float fA = c22.b.a(context2);
                if (fA > 1.8f) {
                    fA = 1.8f;
                }
                checkBox.setScaleX(fA);
                checkBox.setScaleY(fA);
            }
            Context context3 = gVar.f32711a;
            if (c22.b.e(context3)) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Resources resources = context3.getResources();
                resources.getClass();
                layoutParams.width = (int) c22.b.c(context3, xy2.b.n(resources, 16.0f), 1.5f);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                Resources resources2 = context3.getResources();
                resources2.getClass();
                layoutParams2.height = (int) c22.b.c(context3, xy2.b.n(resources2, 16.0f), 1.5f);
            }
            o oVar = (o) gVar.f32714d.get(i14);
            String str = oVar.f68408d;
            boolean z14 = oVar.f68410f;
            aVar.f32716a.setProfileImageData(new b12.b(oVar.f68407c, null, null, y.q0(str), null, 22, null));
            aVar.f32717b.setText(oVar.f68408d);
            textView.setText(oVar.f68409e);
            textView.setVisibility(oVar.f68409e.length() == 0 ? 8 : 0);
            view2.setVisibility(oVar.f68417m ? 8 : 0);
            if (gVar.f32713c) {
                aVar.itemView.setClickable(z14);
                checkBox.setVisibility(z14 ? 0 : 8);
                checkBox.setChecked(oVar.f68411g);
                s0.r(aVar.itemView, new f(oVar, aVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != 0 && i14 == 1) {
            View viewInflate = LayoutInflater.from(this.f32711a).inflate(R.layout.gcm4_contact_list_item, viewGroup, false);
            viewInflate.getClass();
            return new a(this, viewInflate);
        }
        return new c(this, j.b(viewGroup, R.layout.gcm4_contact_list_header, viewGroup, false));
    }

    public final o r(String str) {
        o1.a aVar = o1.f23177a;
        Character chQ0 = y.q0(str);
        aVar.getClass();
        return new o(0L, null, null, o1.a.a(this.f32711a, chQ0), null, false, false, 0, false, false, false, false, false, null, false, 32631, null);
    }

    public /* synthetic */ g(Context context, b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? false : z14);
    }
}
