package id1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import go1.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lid1/b;", "Lid1/c$a;", "Lid1/b$b;", "<init>", "()V", "a", "b", "c", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements id1.c.a<C1774b> {

    public interface a {
    }

    /* JADX INFO: renamed from: id1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid1/b$b;", "Lid1/c$e;", "", "text", "Lid1/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lid1/b$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1774b implements id1.c.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f93016b;

        public C1774b(String str, a aVar) {
            str.getClass();
            aVar.getClass();
            this.f93015a = str;
            this.f93016b = aVar;
        }

        @Override // id1.c.e
        public final boolean a(id1.c.e eVar) {
            eVar.getClass();
            return eVar instanceof C1774b;
        }

        @Override // id1.c.e
        public final boolean c(id1.c.e eVar) {
            eVar.getClass();
            if (eVar instanceof C1774b) {
                return this.f93015a.equals(((C1774b) eVar).f93015a);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1774b)) {
                return false;
            }
            C1774b c1774b = (C1774b) obj;
            return this.f93015a.equals(c1774b.f93015a) && this.f93016b.equals(c1774b.f93016b);
        }

        public final int hashCode() {
            return this.f93016b.hashCode() + (this.f93015a.hashCode() * 31);
        }

        public final String toString() {
            return "AddItemModel(text=" + this.f93015a + ", listener=" + this.f93016b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid1/b$c;", "Lid1/c$c;", "Lid1/b$b;", "Landroid/view/View;", "itemView", "Lid1/c$d;", "delegate", "<init>", "(Lid1/b;Landroid/view/View;Lid1/c$d;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends id1.c.AbstractC1775c<C1774b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f93017d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f93018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, View view2, id1.c.d dVar) {
            super(view2, dVar);
            view2.getClass();
            dVar.getClass();
            this.f93018c = (TextView) view2.findViewById(R.id.text1);
            ((TextView) view2.findViewById(R.id.text2)).setVisibility(8);
        }

        @Override // id1.c.AbstractC1775c
        public final void e(id1.c.e eVar) {
            C1774b c1774b = (C1774b) eVar;
            this.f93018c.setText(c1774b.f93015a);
            this.itemView.setOnClickListener(new g0(c1774b, 19));
        }
    }

    @Override // id1.c.a
    public final Class<C1774b> a() {
        return C1774b.class;
    }

    @Override // id1.c.a
    public final id1.c.AbstractC1775c<C1774b> b(LayoutInflater layoutInflater, ViewGroup viewGroup, id1.c.d dVar) {
        layoutInflater.getClass();
        dVar.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm_row_item, viewGroup, false);
        viewInflate.getClass();
        return new c(this, viewInflate, dVar);
    }
}
