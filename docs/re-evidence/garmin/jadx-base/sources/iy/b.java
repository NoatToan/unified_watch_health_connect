package iy;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import e32.l;
import e32.p;
import hy.g;
import hy.i;
import hy.r;
import hy.s;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Liy/b;", "Le32/p;", "Lxx/b;", "Landroid/view/View;", "view", "Lorg/joda/time/DateTime;", "date", "Le32/l;", "Lhy/g;", "navigator", "<init>", "(Landroid/view/View;Lorg/joda/time/DateTime;Le32/l;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements p<xx.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f95771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f95772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f95773c;

    public b(View view2, DateTime dateTime, l<g> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f95771a = view2;
        this.f95772b = new i(view2, dateTime, lVar);
        this.f95773c = (TextView) view2.findViewById(R.id.daily_list_view_empty_text);
    }

    @Override // e32.p
    public final void a() {
        TextView textView = this.f95773c;
        textView.getClass();
        textView.setVisibility(8);
        this.f95772b.a();
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(xx.b bVar) {
        return false;
    }

    @Override // e32.p
    public final void c(xx.b bVar) {
        List listI;
        xx.b bVar2 = bVar;
        if (bVar2 == null || (listI = bVar2.f192470e.I(bVar2.f192469d, bVar2.f192466a.toDate())) == null) {
            listI = j0.f134944a;
        }
        boolean zIsEmpty = listI.isEmpty();
        TextView textView = this.f95773c;
        textView.getClass();
        if (zIsEmpty) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        s sVar = this.f95772b.f86338c;
        sVar.getClass();
        r rVar = sVar.f86360a;
        ArrayList arrayList = rVar.f86359f;
        arrayList.clear();
        if (!listI.isEmpty()) {
            arrayList.addAll(listI);
        }
        rVar.notifyDataSetChanged();
    }
}
