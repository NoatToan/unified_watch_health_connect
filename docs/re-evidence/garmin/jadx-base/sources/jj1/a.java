package jj1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import hx0.k;
import j02.r;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v22.e;
import zp0.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0010\u0011B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Ljj1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ljj1/a$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "primaryTrackerID", "", "Lgj1/b;", "mDevices", "Lej1/b;", "deviceType", "", "areAllPartiallyCompatible", "<init>", "(Landroid/content/Context;Ljava/lang/Long;Ljava/util/List;Lej1/b;Z)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f98951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<gj1.b> f98952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ej1.b f98953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f98954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1904a f98955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f98956g;

    /* JADX INFO: renamed from: jj1.a$a, reason: collision with other inner class name */
    public interface InterfaceC1904a {
        void S1(gj1.b bVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljj1/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Ljj1/a;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f98957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f98958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f98959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f98960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ConstraintLayout f98961e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.image_view_device);
            viewFindViewById.getClass();
            this.f98957a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.device_name);
            viewFindViewById2.getClass();
            this.f98958b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.partially_compatible_text);
            viewFindViewById3.getClass();
            this.f98959c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.image_view_selected);
            viewFindViewById4.getClass();
            this.f98960d = (ImageView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.item);
            viewFindViewById5.getClass();
            this.f98961e = (ConstraintLayout) viewFindViewById5;
        }
    }

    public a(Context context, Long l14, List<gj1.b> list, ej1.b bVar, boolean z14) {
        context.getClass();
        list.getClass();
        bVar.getClass();
        this.f98950a = context;
        this.f98951b = l14;
        this.f98952c = list;
        this.f98953d = bVar;
        this.f98954e = z14;
        this.f98956g = -1;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f98952c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i14) {
        return this.f98952c.get(i14).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        ConstraintLayout constraintLayout = bVar.f98961e;
        TextView textView = bVar.f98959c;
        ImageView imageView = bVar.f98960d;
        gj1.b bVar2 = this.f98952c.get(i14);
        Context context = this.f98950a;
        c cVar = new c(context);
        cVar.f206565e = bVar2.getImageUrl();
        cVar.h(bVar.f98957a);
        TextView textView2 = bVar.f98958b;
        textView2.setText(bVar2.getDisplayName());
        textView2.setContentDescription(oi0.c.A(context, new r(25), bVar2.getDisplayName()));
        if (this.f98953d == ej1.b.WEARABLE_DEVICE) {
            if (s.g(bVar2.getPrimaryWearableDevice(), Boolean.TRUE)) {
                this.f98956g = bVar.getAbsoluteAdapterPosition();
                e.q(imageView);
            } else {
                e.j(imageView);
            }
            if (this.f98954e || !s.g(bVar2.getLhaBackupCapable(), Boolean.FALSE)) {
                e.j(textView);
            } else {
                e.q(textView);
            }
        } else {
            if (s.g(bVar2.getDeviceId(), this.f98951b)) {
                this.f98956g = bVar.getAbsoluteAdapterPosition();
                e.q(imageView);
            } else {
                e.j(imageView);
            }
            if (s.g(bVar2.getLhaBackupCapable(), Boolean.FALSE)) {
                e.q(textView);
            } else {
                e.j(textView);
            }
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Resources resources = context.getResources();
        resources.getClass();
        layoutParams.width = (int) c22.b.c(context, xy2.b.n(resources, 24.0f), 1.5f);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources resources2 = context.getResources();
        resources2.getClass();
        layoutParams2.height = (int) c22.b.c(context, xy2.b.n(resources2, 24.0f), 1.5f);
        s0.r(constraintLayout, new jj1.b(bVar));
        constraintLayout.setOnClickListener(new k(22, bVar, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, j.b(viewGroup, R.layout.item_device, viewGroup, false));
    }

    public /* synthetic */ a(Context context, Long l14, List list, ej1.b bVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : l14, list, bVar, z14);
    }
}
