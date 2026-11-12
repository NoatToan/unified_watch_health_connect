package vc0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvc0/q;", "Lei2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends ei2.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f177002e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f177003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public di2.a f177004d;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f177002e = gt2.b.f79005a.h("DSL-PreferredActivityTrackerTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f177003c = fVar;
    }

    @Override // ei2.j
    public final mh2.j r(di2.a aVar) {
        f12.l.f68084a.getClass();
        long jS4 = f12.l.a.a().s4();
        long unitID = this.f177003c.getUnitID();
        Context context = this.f64388a;
        if (jS4 == unitID) {
            String string = context.getString(R.string.device_settings_preferred_activity_tracker);
            string.getClass();
            aVar.d(string);
            return mh2.j.PREFERRED_ACTIVITY_DEVICE_SELECTED;
        }
        String string2 = context.getString(R.string.device_settings_set_as_preferred_activity_tracker_title);
        string2.getClass();
        aVar.d(string2);
        return mh2.j.DEFAULT;
    }

    @Override // ei2.j
    public final void s(Fragment fragment, di2.a aVar) {
        Logger logger = f177002e;
        logger.debug("Preferred activity tracker view clicked.");
        if (r(aVar) == mh2.j.DEFAULT) {
            this.f177004d = aVar;
            aVar.e(mh2.j.IN_PROGRESS);
            sd2.f fVar = this.f177003c;
            String displayName = fVar.getDisplayName();
            if (displayName == null) {
                displayName = fVar.getProductDisplayName();
                displayName.getClass();
            }
            Object[] objArr = {displayName};
            Context context = this.f64388a;
            String string = context.getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, objArr);
            String strD = p6.b.d(context, R.string.lbl_yes, string);
            String string2 = context.getString(R.string.lbl_no);
            string2.getClass();
            androidx.fragment.app.m activity = fragment.getActivity();
            if (activity == null || !hi2.c.a(activity)) {
                return;
            }
            logger.debug("viewClicked: Showing set tracker dialog");
            kh2.g.a aVar2 = kh2.g.f104792a;
            Context contextRequireContext = fragment.requireContext();
            contextRequireContext.getClass();
            kh2.g.a.a(aVar2, contextRequireContext, null, string, new o13.p(strD, new u91.i(17, activity, this)), new o13.p(string2, new tr2.o(aVar, 18)), 482).show();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvc0/q$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
