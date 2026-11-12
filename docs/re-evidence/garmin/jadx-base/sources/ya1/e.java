package ya1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lya1/e;", "", "Landroid/view/View;", "rootView", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetailDTO", "Lkotlin/Function0;", "", "onClickListener", "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/courses/model/e;Le23/a;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f195549a;

    public e(View view2, com.garmin.android.apps.connectmobile.courses.model.e eVar, e23.a<Unit> aVar) {
        view2.getClass();
        eVar.getClass();
        aVar.getClass();
        this.f195549a = view2;
        Context context = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        TextView textView2 = (TextView) view2.findViewById(R.id.label_bottom);
        textView.setText(R.string.title_course);
        textView2.setText(context.getString(R.string.string_space_bullet_string_pattern, s20.d.a(context, eVar.courseName), s20.d.c(eVar.q(), context, am.j.z(f12.l.f68084a))));
        view2.setOnClickListener(new q1(aVar, 26));
    }
}
