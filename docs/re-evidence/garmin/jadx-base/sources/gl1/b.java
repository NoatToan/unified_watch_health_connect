package gl1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.livesessionview.LiveActivityActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f77827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.q f77828c;

    public /* synthetic */ b(Context context, c.q qVar, int i14) {
        this.f77826a = i14;
        this.f77827b = context;
        this.f77828c = qVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f77826a) {
            case 0:
                ((Long) obj).getClass();
                Context context = this.f77827b;
                context.getClass();
                LiveActivityActivity.f50544d.getClass();
                this.f77828c.a(LiveActivityActivity.a.a(context), null);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                MultiDayActivitiesDetailActivity.f39233a.getClass();
                MultiDayActivitiesDetailActivity.a.a(this.f77827b, this.f77828c, str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                MultiDayActivitiesDetailActivity.f39233a.getClass();
                MultiDayActivitiesDetailActivity.a.a(this.f77827b, this.f77828c, str2);
                break;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                MultiDayActivitiesDetailActivity.f39233a.getClass();
                MultiDayActivitiesDetailActivity.a.a(this.f77827b, this.f77828c, str3);
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                Context context2 = this.f77827b;
                context2.getClass();
                this.f77828c.a(((u32.a) KoinJavaComponent.get$default(u32.a.class, null, null, 6, null)).a(context2, jLongValue), null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(c.q qVar, Context context, int i14) {
        this.f77826a = i14;
        this.f77828c = qVar;
        this.f77827b = context;
    }
}
