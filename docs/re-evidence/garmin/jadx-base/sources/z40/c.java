package z40;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import b00.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v22.f;
import wv2.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\f\rB%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lz40/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lz40/c$b;", "", "", "waypointNames", "Lz40/a;", "actionListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/util/List;Lz40/a;Landroid/content/Context;)V", "a", "b", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class c extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f202326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z40.a f202327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f202328c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz40/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lsq0/c;", "Landroid/view/View;", "itemView", "<init>", "(Lz40/c;Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 implements sq0.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f202329c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f202330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f202331b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, View view2) {
            super(view2);
            view2.getClass();
            this.f202331b = cVar;
            ImageView imageView = (ImageView) view2.findViewById(R.id.drag_action_imageview);
            ImageView imageView2 = (ImageView) view2.findViewById(R.id.main_action_imageview);
            View viewFindViewById = view2.findViewById(R.id.textview);
            viewFindViewById.getClass();
            this.f202330a = (TextView) viewFindViewById;
            imageView.getClass();
            s0.r(imageView, new f());
            imageView.setOnTouchListener(new d(3, cVar, this));
            imageView2.setOnClickListener(new h(19, this, cVar));
        }

        @Override // sq0.c
        public final void a() {
            this.itemView.setAlpha(0.4f);
        }

        @Override // sq0.c
        public final void c() {
            this.f202331b.f202327b.S();
            this.itemView.setAlpha(1.0f);
        }
    }

    static {
        new a(null);
    }

    public c(List<String> list, z40.a aVar, Context context) {
        list.getClass();
        aVar.getClass();
        context.getClass();
        this.f202326a = list;
        this.f202327b = aVar;
        this.f202328c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f202326a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b bVar = (b) f0Var;
        bVar.getClass();
        if (i14 == -1) {
            return;
        }
        String str = this.f202326a.get(i14);
        str.getClass();
        bVar.f202330a.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(this.f202328c).inflate(R.layout.edit_waypoint_draggable_list_item, viewGroup, false);
        viewInflate.getClass();
        return new b(this, viewInflate);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz40/c$a;", "", "<init>", "()V", "", "DRAG_STATE_ALPHA", "F", "IDLE_STATE_ALPHA", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
