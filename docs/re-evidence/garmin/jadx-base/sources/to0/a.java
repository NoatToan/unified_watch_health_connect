package to0;

import am.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pm0.h;
import vo0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\t\n\u000b\fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lto0/a;", "Lid1/a;", "Lto0/a$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lto0/a$c;", "delegate", "<init>", "(Landroid/content/Context;Lto0/a$c;)V", "a", "c", "d", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends id1.a<AbstractC3116a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f165831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f165832f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lto0/a$b;", "Landroidx/recyclerview/widget/o$f;", "Lto0/a$a;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o.f<AbstractC3116a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(AbstractC3116a abstractC3116a, AbstractC3116a abstractC3116a2) {
            AbstractC3116a abstractC3116a3 = abstractC3116a;
            AbstractC3116a abstractC3116a4 = abstractC3116a2;
            abstractC3116a3.getClass();
            abstractC3116a4.getClass();
            return abstractC3116a3.equals(abstractC3116a4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(AbstractC3116a abstractC3116a, AbstractC3116a abstractC3116a2) {
            AbstractC3116a abstractC3116a3 = abstractC3116a;
            AbstractC3116a abstractC3116a4 = abstractC3116a2;
            abstractC3116a3.getClass();
            abstractC3116a4.getClass();
            return ((abstractC3116a3 instanceof AbstractC3116a.C3117a) && (abstractC3116a4 instanceof AbstractC3116a.C3117a)) ? s.g(((AbstractC3116a.C3117a) abstractC3116a3).f165833a.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), ((AbstractC3116a.C3117a) abstractC3116a4).f165833a.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : abstractC3116a3.equals(abstractC3116a4);
        }
    }

    public interface c {
        void z3(e eVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lto0/a$d;", "Lid1/a$a;", "Landroid/view/View;", "containerView", "<init>", "(Lto0/a;Landroid/view/View;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends id1.a.AbstractC1773a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f165835d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinearLayout f165836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f165837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f165838c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f165838c = aVar;
            View viewFindViewById = view2.findViewById(R.id.search_item_layout);
            viewFindViewById.getClass();
            this.f165836a = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.search_content);
            viewFindViewById2.getClass();
            this.f165837b = (TextView) viewFindViewById2;
        }

        @Override // id1.a.AbstractC1773a
        public final void d(int i14) {
            String str;
            a aVar = this.f165838c;
            AbstractC3116a abstractC3116aR = aVar.r(i14);
            boolean z14 = abstractC3116aR instanceof AbstractC3116a.C3117a;
            TextView textView = this.f165837b;
            LinearLayout linearLayout = this.f165836a;
            if (!z14) {
                if (!(abstractC3116aR instanceof AbstractC3116a.b)) {
                    u0.r();
                    return;
                } else {
                    textView.setText(((AbstractC3116a.b) abstractC3116aR).f165834a);
                    linearLayout.setClickable(false);
                    return;
                }
            }
            AbstractC3116a.C3117a c3117a = (AbstractC3116a.C3117a) abstractC3116aR;
            vo0.a address = c3117a.f165833a.getAddress();
            if (address == null || (str = address.getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String()) == null) {
                str = "";
            }
            textView.setText(str);
            linearLayout.setClickable(true);
            linearLayout.setOnClickListener(new h(22, aVar, c3117a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, c cVar) {
        super(context, new b());
        context.getClass();
        cVar.getClass();
        this.f165831e = cVar;
        int i14 = this.f93014d;
        this.f93014d = i14 + 1;
        this.f165832f = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (r(i14) != null) {
            return this.f165832f;
        }
        vb.h.z("Invalid item type");
        return 0;
    }

    @Override // id1.a
    public final id1.a.AbstractC1773a u(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        if (i14 != this.f165832f) {
            vb.h.z("Invalid view type");
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.location_search_list_item, viewGroup, false);
        viewInflate.getClass();
        return new d(this, viewInflate);
    }

    /* JADX INFO: renamed from: to0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lto0/a$a;", "", "<init>", "()V", "a", "b", "Lto0/a$a$a;", "Lto0/a$a$b;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC3116a {

        /* JADX INFO: renamed from: to0.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lto0/a$a$a;", "Lto0/a$a;", "Lvo0/e;", "searchItem", "<init>", "(Lvo0/e;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C3117a extends AbstractC3116a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f165833a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3117a(e eVar) {
                super(null);
                eVar.getClass();
                this.f165833a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3117a) && s.g(this.f165833a, ((C3117a) obj).f165833a);
            }

            public final int hashCode() {
                return this.f165833a.hashCode();
            }

            public final String toString() {
                return "AutosuggestionsItem(searchItem=" + this.f165833a + ")";
            }
        }

        /* JADX INFO: renamed from: to0.a$a$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lto0/a$a$b;", "Lto0/a$a;", "", "addressLabel", "<init>", "(Ljava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC3116a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f165834a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(null);
                str.getClass();
                this.f165834a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.g(this.f165834a, ((b) obj).f165834a);
            }

            public final int hashCode() {
                return this.f165834a.hashCode();
            }

            public final String toString() {
                return j.m("NoSuggestionsItem(addressLabel=", this.f165834a, ")");
            }
        }

        public /* synthetic */ AbstractC3116a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private AbstractC3116a() {
        }
    }
}
