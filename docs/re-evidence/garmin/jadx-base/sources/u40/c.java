package u40;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu40/c;", "", "Landroid/view/View;", "view", "", "isEditable", "Lkotlin/Function0;", "", "onEditCoursePoint", "onClose", "<init>", "(Landroid/view/View;ZLe23/a;Le23/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f168546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f168547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f168548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f168549d;

    public c(View view2, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        view2.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f168546a = view2;
        this.f168547b = (TextView) view2.findViewById(R.id.bottom_sheet_header_tv);
        this.f168548c = (ImageView) view2.findViewById(R.id.course_point_icon);
        this.f168549d = (TextView) view2.findViewById(R.id.course_point_name_tv);
        View viewFindViewById = view2.findViewById(R.id.edit_course_point_tv);
        if (z14) {
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(0);
            viewFindViewById.setOnClickListener(new q1(aVar, 19));
        } else {
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(8);
        }
        view2.findViewById(R.id.bottom_sheet_close_iv).setOnClickListener(new q1(aVar2, 20));
    }
}
