package b50;

import c22.g2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import i3.fe;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity$setupComposeContent$1$1$3$1", f = "CourseDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f15999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<e50.d> f16000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CourseDetailsActivity courseDetailsActivity, fe feVar, x3<e50.d> x3Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f15998a = courseDetailsActivity;
        this.f15999b = feVar;
        this.f16000c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f15998a, this.f15999b, this.f16000c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
        x3<e50.d> x3Var = this.f16000c;
        w20.a aVar3 = x3Var.getF182175a().f62992d;
        List<fn0.a> list = aVar3 != null ? aVar3.f181478c : null;
        boolean z14 = x3Var.getF182175a().f62999k.f109902j;
        CourseDetailsActivity courseDetailsActivity = this.f15998a;
        courseDetailsActivity.getClass();
        if (!z14 && list != null && !list.isEmpty()) {
            boolean z15 = false;
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((fn0.a) it.next()).h() == fn0.c.ROAD_CLOSURE) {
                        z15 = true;
                        break;
                    }
                }
            }
            boolean zIsEmpty = list.isEmpty();
            fe feVar = this.f15999b;
            if (!zIsEmpty) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (((fn0.a) it3.next()).h() != fn0.c.ROAD_CLOSURE) {
                        if (!z15) {
                            String string = courseDetailsActivity.getString(R.string.hazards_message);
                            string.getClass();
                            courseDetailsActivity.qa(feVar, string, courseDetailsActivity.getString(R.string.lbl_close));
                        } else if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                            c22.x0.f23314a.getClass();
                            String str = c22.x0.Zb;
                            str.getClass();
                            courseDetailsActivity.qa(feVar, g2.f(str), courseDetailsActivity.getString(R.string.lbl_close));
                        }
                    }
                }
                if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                    c22.x0.f23314a.getClass();
                    String str2 = c22.x0.f23363cd;
                    str2.getClass();
                    courseDetailsActivity.qa(feVar, g2.f(str2), courseDetailsActivity.getString(R.string.lbl_close));
                }
            } else if (((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).c()) {
                c22.x0.f23314a.getClass();
                String str3 = c22.x0.f23363cd;
                str3.getClass();
                courseDetailsActivity.qa(feVar, g2.f(str3), courseDetailsActivity.getString(R.string.lbl_close));
            }
        }
        return Unit.INSTANCE;
    }
}
