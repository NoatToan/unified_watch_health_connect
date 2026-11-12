package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bv2.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\tB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/contacts/emergency/b$c;", "onItemClickListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/emergency/b$c;)V", "c", "b", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f32620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f32621b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.emergency.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/b$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/emergency/b;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0535b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f32622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f32624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f32625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Context f32626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f32627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0535b(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32627f = bVar;
            this.f32622a = (TextView) view2.findViewById(R.id.contact_info_label);
            this.f32623b = (TextView) view2.findViewById(R.id.contact_info_value);
            this.f32624c = (ImageView) view2.findViewById(R.id.contact_info_checkbox);
            this.f32625d = (TextView) view2.findViewById(R.id.contact_warning_label);
            this.f32626e = view2.getContext();
        }

        public final void d(com.garmin.android.apps.connectmobile.contacts.a aVar, String str, int i14, boolean z14, boolean z15, Integer num) {
            this.itemView.setOnClickListener(new j(this, 14, this.f32627f, aVar));
            if (!z14) {
                ImageView imageView = this.f32624c;
                imageView.getClass();
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_error_circle_small);
            }
            TextView textView = this.f32623b;
            textView.setText(str);
            Context context = this.f32626e;
            CharSequence string = num != null ? context.getString(num.intValue(), context.getString(i14)) : context.getText(i14);
            TextView textView2 = this.f32622a;
            textView2.setText(string);
            View view2 = this.itemView;
            view2.getClass();
            v22.e.i(view2, z15);
            if (z15) {
                return;
            }
            textView.setTextColor(context.getColor(R.color.gcm_text_primary_disabled));
            textView2.setTextColor(context.getColor(R.color.gcm_text_primary_disabled));
        }
    }

    public interface c {
        void q5(com.garmin.android.apps.connectmobile.contacts.a aVar);
    }

    static {
        new a(null);
    }

    public b(c cVar) {
        this.f32620a = cVar;
        this.f32621b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f32621b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        if (!(f0Var instanceof C0535b)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "EmergencyContactPickerAdapter", "No view holder associated!");
            return;
        }
        ArrayList arrayList = this.f32621b;
        if (arrayList.get(i14) instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
            C0535b c0535b = (C0535b) f0Var;
            Object obj = arrayList.get(i14);
            obj.getClass();
            com.garmin.android.apps.connectmobile.contacts.a.f fVar = (com.garmin.android.apps.connectmobile.contacts.a.f) obj;
            String str = fVar.f32357b;
            Context context = c0535b.itemView.getContext();
            context.getClass();
            c0535b.d(fVar, jg.b.v(context, str), fVar.f32358c.f109041b, fVar.f32364i, fVar.f32362g, fVar.f32370o);
            return;
        }
        if (!(arrayList.get(i14) instanceof com.garmin.android.apps.connectmobile.contacts.a.c)) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "EmergencyContactPickerAdapter", "Contact is not correct ContactDetailsListItem Type!");
            return;
        }
        C0535b c0535b2 = (C0535b) f0Var;
        Object obj2 = arrayList.get(i14);
        obj2.getClass();
        com.garmin.android.apps.connectmobile.contacts.a.c cVar = (com.garmin.android.apps.connectmobile.contacts.a.c) obj2;
        c0535b2.d(cVar, cVar.f32335b, cVar.f32336c.f109013b, cVar.f32337d, cVar.f32341h, cVar.f32345l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C0535b(this, n23.j.b(viewGroup, R.layout.gcm4_contact_picker_list_item, viewGroup, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ b(c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar);
    }
}
