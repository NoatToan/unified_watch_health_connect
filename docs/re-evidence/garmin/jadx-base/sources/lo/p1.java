package lo;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.manual.CourseChooserActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class p1 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(f0 f0Var) {
        super(f0Var, 0);
        this.f113935b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        com.garmin.android.apps.connectmobile.courses.model.d dVar2 = this.f113935b.f113806m2;
        t tVar = (t) dVar;
        ArrayList arrayList = tVar.f113953e;
        int i14 = CourseChooserActivity.f29147f;
        Intent intent = new Intent(tVar.getActivity(), (Class<?>) CourseChooserActivity.class);
        Bundle bundle = new Bundle();
        am.a2.a("extra_course_list", bundle, arrayList);
        am.a2.b(bundle, "extra_selected_course", dVar2);
        intent.putExtras(bundle);
        tVar.startActivityForResult(intent, 13);
    }
}
