package uy1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import n23.j;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\f\r\u000eB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Luy1/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Luy1/g$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lfg0/i;", "mDevices", "", "needGcj02Capability", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "c", "b", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<fg0.i> f173417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f173419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jy1.b f173420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f173421f;

    public interface a {
        void q1(fg0.i iVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1/g$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f173422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f173423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f173424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f173425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ConstraintLayout f173426e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.image_view_device);
            viewFindViewById.getClass();
            this.f173422a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.device_name);
            viewFindViewById2.getClass();
            this.f173423b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.status_text);
            viewFindViewById3.getClass();
            this.f173424c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.text_view_header);
            viewFindViewById4.getClass();
            this.f173425d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.item);
            viewFindViewById5.getClass();
            this.f173426e = (ConstraintLayout) viewFindViewById5;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luy1/g$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        NONE,
        COMPATIBLE,
        NOT_COMPATIBLE
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173431a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.NOT_COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173431a = iArr;
        }
    }

    public g(Context context, List<fg0.i> list, boolean z14) {
        c cVar;
        context.getClass();
        list.getClass();
        this.f173416a = context;
        this.f173417b = list;
        this.f173418c = z14;
        this.f173420e = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        boolean z15 = false;
        boolean z16 = false;
        for (fg0.i iVar : list) {
            boolean z17 = true;
            if (!z15 && r(iVar)) {
                cVar = c.COMPATIBLE;
            } else if (z16 || r(iVar)) {
                z17 = z15;
                cVar = c.NONE;
            } else {
                z17 = z15;
                cVar = c.NOT_COMPATIBLE;
                z16 = true;
            }
            arrayList.add(cVar);
            z15 = z17;
        }
        this.f173421f = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f173417b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        TextView textView = bVar.f173425d;
        fg0.i iVar = this.f173417b.get(i14);
        int i15 = d.f173431a[((c) this.f173421f.get(i14)).ordinal()];
        Context context = this.f173416a;
        if (i15 == 1) {
            v22.e.q(textView);
            textView.setText(context.getString(R.string.startup_compatible_devices));
        } else if (i15 == 2) {
            v22.e.q(textView);
            textView.setText(context.getString(R.string.txt_not_compatible));
        } else {
            if (i15 != 3) {
                u0.r();
                return;
            }
            v22.e.j(textView);
        }
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = iVar.getImageUrl();
        cVar.h(bVar.f173422a);
        bVar.f173423b.setText(iVar.getDisplayName());
        TextView textView2 = bVar.f173424c;
        Long unitId = iVar.getUnitId();
        textView2.setText(context.getString(this.f173420e.b(unitId != null ? unitId.longValue() : 0L) ? R.string.devices_connected : R.string.devices_not_connected));
        bVar.f173426e.setOnClickListener(new ty0.a(this, 7, iVar, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(j.b(viewGroup, R.layout.item_send_to_device, viewGroup, false));
    }

    public final boolean r(fg0.i iVar) {
        if (iVar.getSportingEventCapable()) {
            return !this.f173418c || s.g(iVar.getGcj02CourseCapable(), Boolean.TRUE);
        }
        return false;
    }
}
