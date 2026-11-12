package b50;

import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends p005kotlin.jvm.internal.q implements e23.l<e50.a, Unit> {
    public j(Object obj) {
        super(1, obj, CourseDetailsActivity.class, "onAction", "onAction(Lcom/garmin/android/apps/connectmobile/courses/presentation/details/model/CourseDetailsAction;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(e50.a aVar) {
        e50.a aVar2 = aVar;
        aVar2.getClass();
        CourseDetailsActivity courseDetailsActivity = (CourseDetailsActivity) this.receiver;
        CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
        courseDetailsActivity.ma(aVar2);
        return Unit.INSTANCE;
    }
}
