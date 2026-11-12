package com.garmin.android.apps.connectmobile.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import c22.o1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.y;
import f20.o;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.p0;
import r22.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/contacts/h$a;", "itemClickListener", "", "isSwipeEnabled", "showContactDetails", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/contacts/h$a;ZZ)V", "a", "b", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f32725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f32728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.browser.trusted.c f32729f;

    public interface a {
        void B(o oVar, CheckBox checkBox);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/h$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/h;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f32730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f32731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32731b = hVar;
            this.f32730a = (TextView) view2;
        }
    }

    public h(Context context, a aVar, boolean z14, boolean z15) {
        context.getClass();
        this.f32724a = context;
        this.f32725b = aVar;
        this.f32726c = z14;
        this.f32727d = z15;
        this.f32728e = new ArrayList();
        this.f32729f = new androidx.browser.trusted.c(9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f32728e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return ((o) this.f32728e.get(i14)).f68412h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        o oVar = (o) this.f32728e.get(i14);
        if (f0Var instanceof b) {
            b bVar = (b) f0Var;
            bVar.f32730a.setText(((o) bVar.f32731b.f32728e.get(i14)).f68408d);
            return;
        }
        if (f0Var instanceof z) {
            z zVar = (z) f0Var;
            String str = oVar.f68408d;
            boolean z14 = oVar.f68419o;
            String string = z14 ? f0Var.itemView.getContext().getString(R.string.assistance_contact_declined) : oVar.f68409e;
            string.getClass();
            String str2 = oVar.f68407c;
            boolean z15 = oVar.f68417m;
            boolean z16 = oVar.f68415k;
            boolean z17 = oVar.f68416l;
            boolean z18 = oVar.f68413i;
            ImageView imageView = zVar.f149938g;
            TextView textView = zVar.f149934c;
            ImageView imageView2 = zVar.f149937f;
            str.getClass();
            zVar.f149932a.setProfileImageData(new b12.b(str2, null, null, y.q0(str), null, 22, null));
            zVar.f149935d.setClickable(false);
            zVar.f149933b.setText(str);
            if (this.f32727d) {
                textView.setText(string);
                textView.setVisibility(string.length() == 0 ? 8 : 0);
            }
            zVar.f149936e.setVisibility(z15 ? 8 : 0);
            imageView.setVisibility(z18 ? 0 : 8);
            Context context = zVar.itemView.getContext();
            int i15 = R.string.default_image_view_content_description;
            imageView.setContentDescription(context.getString(z18 ? R.string.lbl_livetrack_recipient : R.string.default_image_view_content_description));
            if (!z14) {
                imageView2.setVisibility(z16 ? 0 : 8);
                imageView2.setImageResource(z17 ? 2131231821 : 2131231822);
                Context context2 = zVar.itemView.getContext();
                if (z17) {
                    i15 = R.string.assistance_contact;
                }
                imageView2.setContentDescription(context2.getString(i15) + (z17 ? "" : u62.z.b(R.string.request_pending, zVar.itemView)));
            }
            f0Var.itemView.setOnClickListener(new b0(this, i14, 3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != 0 && i14 == 1) {
            View viewInflate = LayoutInflater.from(this.f32724a).inflate(R.layout.gcm_contact_list_item, viewGroup, false);
            viewInflate.getClass();
            return new z(viewInflate);
        }
        return new b(this, j.b(viewGroup, R.layout.gcm4_contact_list_header, viewGroup, false));
    }

    public final o r(String str) {
        o1.a aVar = o1.f23177a;
        Character chQ0 = y.q0(str);
        aVar.getClass();
        return new o(0L, null, null, o1.a.a(this.f32724a, chQ0), null, false, false, 0, false, false, false, false, false, null, false, 32631, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void t(List<o> list) {
        list.getClass();
        ArrayList arrayList = this.f32728e;
        arrayList.clear();
        if (!list.isEmpty()) {
            List listN0 = h0.N0(list, this.f32729f);
            arrayList.addAll(listN0);
            Iterator<Integer> it = t.l(listN0.size() - 1, 1).iterator();
            while (it.hasNext()) {
                int iNextInt = ((p0) it).nextInt();
                Character chQ0 = y.q0(((o) listN0.get(iNextInt)).f68408d);
                Character chQ1 = y.q0(((o) listN0.get(iNextInt - 1)).f68408d);
                if (!s.g(chQ0 != null ? Character.valueOf(Character.toUpperCase(chQ0.charValue())) : null, chQ1 != null ? Character.valueOf(Character.toUpperCase(chQ1.charValue())) : null) && (chQ0 == null || Character.isLetter(chQ0.charValue()) || chQ1 == null || Character.isLetter(chQ1.charValue()))) {
                    arrayList.add(iNextInt, r(((o) listN0.get(iNextInt)).f68408d));
                }
            }
            arrayList.add(0, r(((o) listN0.get(0)).f68408d));
        }
        notifyDataSetChanged();
    }

    public /* synthetic */ h(Context context, a aVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? true : z15);
    }
}
