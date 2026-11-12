package com.garmin.android.apps.connectmobile.contacts;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import d53.y;
import f20.p;
import java.util.ArrayList;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\t\nB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/contacts/c$c;", "itemSelectedListener", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/c$c;)V", "c", "a", "b", "d", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0526c f32378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<p> f32379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32380c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/c;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view2) {
            super(view2);
            view2.getClass();
            ((TextView) view2.findViewById(R.id.instruction)).setText(view2.getContext().getText(R.string.contact_management_message_choose_profile));
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.c$c, reason: collision with other inner class name */
    public interface InterfaceC0526c {
        void g3(p pVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/c$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/contacts/c;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserLevelImageView f32381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f32383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CheckBox f32384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f32385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar, View view2) {
            super(view2);
            view2.getClass();
            this.f32385e = cVar;
            this.f32381a = (UserLevelImageView) view2.findViewById(R.id.contact_img);
            this.f32382b = (TextView) view2.findViewById(R.id.contact_name);
            this.f32383c = (TextView) view2.findViewById(R.id.contact_profile_details);
            CheckBox checkBox = (CheckBox) view2.findViewById(R.id.contact_checkbox);
            this.f32384d = checkBox;
            view2.setOnClickListener(this);
            checkBox.setVisibility(0);
            checkBox.setButtonDrawable(R.drawable.selector_blue_check);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            c cVar = this.f32385e;
            int i14 = cVar.f32380c;
            if (bindingAdapterPosition != i14) {
                cVar.r(i14);
                cVar.r(bindingAdapterPosition);
                cVar.f32380c = bindingAdapterPosition;
                InterfaceC0526c interfaceC0526c = cVar.f32378a;
                if (interfaceC0526c != null) {
                    p pVar = cVar.f32379b.get(bindingAdapterPosition - 1);
                    pVar.getClass();
                    interfaceC0526c.g3(pVar);
                }
            }
        }
    }

    static {
        new a(null);
    }

    public c(InterfaceC0526c interfaceC0526c) {
        this.f32378a = interfaceC0526c;
        this.f32379b = new ArrayList<>();
        this.f32380c = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f32379b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return i14 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof d)) {
            d dVar = (d) f0Var;
            p pVar = this.f32379b.get(i14 - 1);
            pVar.getClass();
            p pVar2 = pVar;
            TextView textView = dVar.f32383c;
            String str = pVar2.f68423d;
            String str2 = pVar2.f68421b;
            if (str2.length() == 0) {
                str2 = pVar2.f68420a;
            }
            dVar.f32381a.setProfileImageData(new b12.b(pVar2.f68422c, null, null, y.q0(str2), null, 22, null));
            dVar.f32382b.setText(str2);
            textView.setText(str);
            textView.setVisibility(str.length() == 0 ? 8 : 0);
            dVar.f32384d.setChecked(pVar2.f68424e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 != 0 && i14 == 1) {
            return new d(this, j.b(viewGroup, R.layout.gcm4_contact_list_item, viewGroup, false));
        }
        return new b(this, j.b(viewGroup, R.layout.gcm4_instruction_view, viewGroup, false));
    }

    public final void r(int i14) {
        if (i14 == -1 || i14 == 0) {
            return;
        }
        p pVar = this.f32379b.get(i14 - 1);
        pVar.getClass();
        p pVar2 = pVar;
        pVar2.f68424e = !pVar2.f68424e;
        notifyItemChanged(i14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/c$a;", "", "<init>", "()V", "", "ITEM_TYPE_HEADER", "I", "ITEM_TYPE_PROFILE", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ c(InterfaceC0526c interfaceC0526c, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : interfaceC0526c);
    }
}
