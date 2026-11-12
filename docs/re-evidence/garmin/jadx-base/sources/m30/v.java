package m30;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import l30.w0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lm30/v;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f116406k = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w0 f116407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n30.e f116408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n30.e f116409j;

    public v() {
        super(R.layout.compose_bottom_sheet_content, true, false, false, 12, null);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return !p005kotlin.jvm.internal.s.g(this.f116408i, this.f116409j);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        w0 w0Var;
        n30.e eVar = this.f116409j;
        if (eVar != null && (w0Var = this.f116407h) != null) {
            MultipleCoursesActivity multipleCoursesActivity = w0Var.f109638a;
            MultipleCoursesActivity.a aVar = MultipleCoursesActivity.f33000c;
            multipleCoursesActivity.ea(new n30.i.m(eVar));
        }
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        Parcelable parcelable;
        com.garmin.android.apps.connectmobile.courses.model.i iVar;
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("courseParameters", n30.e.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("courseParameters");
                if (!(parcelable2 instanceof n30.e)) {
                    parcelable2 = null;
                }
                parcelable = (n30.e) parcelable2;
            }
            n30.e eVar = (n30.e) parcelable;
            if (eVar == null) {
                return;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
            } else {
                if (i14 >= 33) {
                    serializable = arguments2.getSerializable("courseType", com.garmin.android.apps.connectmobile.courses.model.i.class);
                } else {
                    Object serializable2 = arguments2.getSerializable("courseType");
                    serializable = (com.garmin.android.apps.connectmobile.courses.model.i) (serializable2 instanceof com.garmin.android.apps.connectmobile.courses.model.i ? serializable2 : null);
                }
                iVar = (com.garmin.android.apps.connectmobile.courses.model.i) serializable;
                if (iVar == null) {
                    iVar = com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
                }
            }
            this.f116409j = eVar;
            this.f116408i = eVar;
            ComposeView composeView = (ComposeView) view2.findViewById(R.id.compose_content_view);
            if (composeView != null) {
                composeView.setContent(new z3.e(950876023, true, new u(eVar, iVar, this, 0)));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_done);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_course_options);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lm30/v$a;", "", "<init>", "()V", "", "EXTRA_COURSE_PARAMETERS", "Ljava/lang/String;", "EXTRA_COURSE_TYPE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
