package a61;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"La61/f0;", "Landroidx/recyclerview/widget/x;", "Lo71/b;", "Lk32/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends androidx.recyclerview.widget.x<o71.b, k32.s> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.garmin.android.apps.connectmobile.performance.b bVar, androidx.recyclerview.widget.o.f<o71.b> fVar) {
        super(fVar);
        this.f1593b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String strG;
        String strG2;
        k32.s sVar = (k32.s) f0Var;
        sVar.getClass();
        FrameLayout frameLayout = sVar.f102733e;
        TextView textView = sVar.f102732d;
        o71.b bVarR = r(i14);
        bVarR.getClass();
        o71.b bVar = bVarR;
        com.garmin.android.apps.connectmobile.performance.b bVar2 = this.f1593b;
        o71.h hVar = bVar2.f39856c;
        int i15 = hVar.f130229c;
        if (!(bVar instanceof o71.b.a)) {
            if (!(bVar instanceof o71.b.C2480b)) {
                u0.r();
                return;
            }
            o71.b.C2480b c2480b = (o71.b.C2480b) bVar;
            int i16 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39873b[hVar.ordinal()];
            if (i16 == 1) {
                strG = e5.g(ss.f.e(bVar2.g(), Double.valueOf(c2480b.f130158d), false, false), StringUtils.SPACE, bVar2.g().getString(com.garmin.android.apps.connectmobile.performance.b.i()));
            } else if (i16 == 2) {
                strG = bVar2.c(Double.valueOf(c2480b.f130159e));
            } else {
                if (i16 != 3) {
                    u0.r();
                    return;
                }
                strG = bVar2.d(Double.valueOf(c2480b.f130160f));
            }
            com.garmin.android.apps.connectmobile.performance.b.f39852t.getClass();
            sVar.d(((DateTimeFormatter) com.garmin.android.apps.connectmobile.performance.b.f39853v.getValue()).print(c2480b.f130170g), null, strG);
            String string = bVar2.g().getString(i15);
            textView.setText(string);
            v22.e.r(textView, string != null);
            v22.e.j(frameLayout);
            sVar.itemView.setOnClickListener(new d0(1, bVar2, c2480b));
            return;
        }
        o71.b.a aVar = (o71.b.a) bVar;
        String strA = new mn.a(new l22.a(bVar2.g())).a(aVar.f130162h);
        String strA2 = ((sr.m) bVar2.f39870q.getValue()).a(aVar.f130163i);
        int i17 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39873b[hVar.ordinal()];
        if (i17 == 1) {
            String strE = ss.f.e(bVar2.g(), Double.valueOf(aVar.f130158d), false, false);
            String string2 = bVar2.g().getString(com.garmin.android.apps.connectmobile.performance.b.i());
            string2.getClass();
            strG2 = e5.g(strE, StringUtils.SPACE, string2);
        } else if (i17 == 2) {
            strG2 = bVar2.c(Double.valueOf(aVar.f130159e));
        } else {
            if (i17 != 3) {
                u0.r();
                return;
            }
            strG2 = bVar2.d(Double.valueOf(aVar.f130160f));
        }
        sVar.d(strA, strA2, strG2);
        String string3 = bVar2.g().getString(i15);
        textView.setText(string3);
        v22.e.r(textView, string3 != null);
        sVar.itemView.setOnClickListener(new d0(0, bVar2, aVar));
        v22.e.j(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
        View viewInflate = LayoutInflater.from(this.f1593b.g()).inflate(R.layout.gcm3_summary_list_item, viewGroup, false);
        viewInflate.getClass();
        return new k32.s(viewInflate);
    }
}
