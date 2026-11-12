package u40;

import android.view.View;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c0;
import p005kotlin.Metadata;
import ty1.f1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu40/a;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c60.d f168541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c60.d f168542i;

    static {
        new C3161a(null);
    }

    public a() {
        super(R.layout.close_action_bottom_sheet_header, null, R.layout.choose_course_point_bottom_sheet_content, false, 10, null);
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
        view2.findViewById(R.id.place_point_btn).setOnClickListener(new t61.m(this, 17));
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        k32.f fVar = new k32.f(view2);
        String string = getString(R.string.lbl_choose_point);
        string.getClass();
        fVar.a(string, getString(R.string.msg_place_course_point), new f1(this, 4), false);
    }

    public final void z6() {
        v parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.k(this);
        aVar.s(true, true);
        c60.d dVar = this.f168541h;
        if (dVar != null) {
            dVar.invoke();
        }
    }

    /* JADX INFO: renamed from: u40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu40/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3161a {
        public /* synthetic */ C3161a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3161a() {
        }
    }
}
