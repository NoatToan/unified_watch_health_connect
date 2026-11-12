package jd1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import g62.d0;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Ljd1/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "layoutResource", "Ljd1/b$b;", "reminderRemovalListener", "<init>", "(ILjd1/b$b;)V", "b", "c", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1886b f98400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f98401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f98402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f98403e;

    /* JADX INFO: renamed from: jd1.b$b, reason: collision with other inner class name */
    public interface InterfaceC1886b {
        void a();

        void b(pd1.b bVar, int i14);

        void c(pd1.b bVar);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd1/b$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "Ljd1/b$b;", "reminderRemovalListener", "<init>", "(Ljd1/b;Landroid/view/View;Ljd1/b$b;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f98404h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1886b f98405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinearLayout f98406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f98407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f98408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SwitchCompat f98409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f98410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f98411g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, View view2, InterfaceC1886b interfaceC1886b) {
            super(view2);
            view2.getClass();
            interfaceC1886b.getClass();
            this.f98411g = bVar;
            this.f98405a = interfaceC1886b;
            this.f98406b = (LinearLayout) view2.findViewById(R.id.reminder_ll);
            this.f98407c = (TextView) view2.findViewById(R.id.reminder_title);
            this.f98408d = (TextView) view2.findViewById(R.id.reminder_sub_title);
            this.f98409e = (SwitchCompat) view2.findViewById(R.id.reminder_switch);
            this.f98410f = (ImageView) view2.findViewById(R.id.remove_time_image_view);
        }
    }

    static {
        new a(null);
    }

    public b(int i14, InterfaceC1886b interfaceC1886b) {
        interfaceC1886b.getClass();
        this.f98399a = i14;
        this.f98400b = interfaceC1886b;
        int i15 = gt2.c.f79010a;
        this.f98401c = gt2.b.f79005a.h("RemindersAdapter");
        this.f98402d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f98402d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof c)) {
            c cVar = (c) f0Var;
            pd1.b bVar = (pd1.b) this.f98402d.get(i14);
            boolean z14 = this.f98403e;
            SwitchCompat switchCompat = cVar.f98409e;
            ImageView imageView = cVar.f98410f;
            bVar.getClass();
            b bVar2 = cVar.f98411g;
            com.airbnb.lottie.animation.keyframe.a.u("bind: item text=[", bVar.getReminderText(), "]", bVar2.f98401c);
            TextView textView = cVar.f98407c;
            textView.setText(bVar.getReminderText());
            TextView textView2 = cVar.f98408d;
            wd1.c.a aVar = wd1.c.f184378a;
            List<Integer> listH = bVar.h();
            aVar.getClass();
            textView2.setText(wd1.c.a.a(listH));
            cVar.f98406b.setOnClickListener(new jd1.c(bVar2, bVar, cVar));
            if (z14) {
                textView.setLabelFor(imageView.getId());
            } else {
                textView.setLabelFor(switchCompat.getId());
            }
            switchCompat.setVisibility(z14 ? 8 : 0);
            Boolean enabled = bVar.getEnabled();
            switchCompat.setChecked(enabled != null ? enabled.booleanValue() : false);
            switchCompat.setOnClickListener(new jd1.c(bVar, bVar2, cVar));
            imageView.setVisibility(z14 ? 0 : 8);
            imageView.setOnClickListener(new d0(cVar, bVar, i14, 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f98399a, viewGroup, false);
        viewInflate.getClass();
        return new c(this, viewInflate, this.f98400b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljd1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
